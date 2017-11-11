package at.ac.tuwien.kr.alpha.grounder;

import at.ac.tuwien.kr.alpha.common.DisjunctiveHead;
import at.ac.tuwien.kr.alpha.common.Rule;
import at.ac.tuwien.kr.alpha.common.atoms.Atom;
import at.ac.tuwien.kr.alpha.common.atoms.ExternalAtom;
import at.ac.tuwien.kr.alpha.common.atoms.Literal;
import at.ac.tuwien.kr.alpha.common.interpretations.BuiltinBiPredicate;
import at.ac.tuwien.kr.alpha.common.symbols.Predicate;
import at.ac.tuwien.kr.alpha.common.terms.Variable;
import at.ac.tuwien.kr.alpha.grounder.atoms.IntervalAtom;
import at.ac.tuwien.kr.alpha.grounder.transformation.IntervalTermToIntervalAtom;

import java.util.*;

import static at.ac.tuwien.kr.alpha.Util.join;

/**
 * Represents a non-ground rule or a constraint for the semi-naive grounder.
 * Copyright (c) 2017, the Alpha Team.
 */
public class NonGroundRule {
	private static final IntIdGenerator ID_GENERATOR = new IntIdGenerator();

	private final int ruleId;

	private final List<Literal> bodyAtomsPositive;
	private final List<Literal> bodyAtomsNegative;
	private final Atom headAtom;

	private final boolean containsIntervals;
	private final boolean containsExternals;
	private final boolean isOriginallyGround;

	public boolean containsIntervals() {
		return containsIntervals;
	}

	public boolean containsExternals() {
		return containsExternals;
	}

	public boolean isOriginallyGround() {
		return isOriginallyGround;
	}

	private NonGroundRule(int ruleId, List<Literal> bodyAtomsPositive, List<Literal> bodyAtomsNegative, Atom headAtom, boolean containsIntervals, boolean containsExternals) {
		this.ruleId = ruleId;

		this.isOriginallyGround = isOriginallyGround(bodyAtomsPositive, bodyAtomsNegative, headAtom);
		this.containsIntervals = containsIntervals;
		this.containsExternals = containsExternals;

		// Sort for better join order.
		this.bodyAtomsPositive = Collections.unmodifiableList(sortAtoms(bodyAtomsPositive));

		// Since rule is safe, all variables in the negative body are already bound,
		// i.e., joining them cannot degenerate into cross-product.
		// Hence, there is no need to sort them.
		this.bodyAtomsNegative = Collections.unmodifiableList(bodyAtomsNegative);

		this.headAtom = headAtom;

		checkSafety();
	}

	// FIXME: NonGroundRule should extend Rule and then its constructor directly be used.
	public static NonGroundRule constructNonGroundRule(Rule rule) {
		List<Literal> body = rule.getBody();
		final List<Literal> pos = new ArrayList<>(body.size() / 2);
		final List<Literal> neg = new ArrayList<>(body.size() / 2);
		boolean containsIntervals = false;
		boolean containsExternals = false;
		for (Literal literal : body) {
			if (literal instanceof IntervalAtom) {
				containsIntervals = true;
			}
			if (literal instanceof ExternalAtom) {
				if (((ExternalAtom) literal).hasOutput()) {
					containsExternals = true;
				}
			}

			(literal.isNegated() ? neg : pos).add(literal);
		}
		Atom headAtom = null;
		if (rule.getHead() != null) {
			if (!rule.getHead().isNormal()) {
				throw new RuntimeException("Trying to construct NonGroundRule from rule that is not normal. Should not happen.");
			}
			headAtom = ((DisjunctiveHead)rule.getHead()).disjunctiveAtoms.get(0);
		}
		return new NonGroundRule(ID_GENERATOR.getNextId(), pos, neg, headAtom, containsIntervals, containsExternals);
	}

	private static boolean isOriginallyGround(List<Literal> bodyAtomsPositive, List<Literal> bodyAtomsNegative, Atom headAtom) {
		List<Variable> occurringVariables = new ArrayList<>();
		if (headAtom != null) {
			occurringVariables.addAll(headAtom.getBindingVariables());
			occurringVariables.addAll(headAtom.getNonBindingVariables());
		}
		for (Atom atom : bodyAtomsPositive) {
			occurringVariables.addAll(atom.getBindingVariables());
			occurringVariables.addAll(atom.getNonBindingVariables());
		}
		for (Atom atom : bodyAtomsNegative) {
			occurringVariables.addAll(atom.getBindingVariables());
			occurringVariables.addAll(atom.getNonBindingVariables());
		}
		for (Variable variable : occurringVariables) {
			// Ignore variables introduced by interval rewriting.
			if (variable.toString().startsWith(IntervalTermToIntervalAtom.INTERVAL_VARIABLE_PREFIX)) {
				continue;
			}
			return false;
		}
		return true;
	}

	public int getRuleId() {
		return ruleId;
	}

	/**
	 *
	 * @return a list of all ordinary predicates occurring in the rule (may contain duplicates, does not contain builtin atoms).
	 */
	public List<Predicate> getOccurringPredicates() {
		ArrayList<Predicate> predicateList = new ArrayList<>(bodyAtomsPositive.size() + bodyAtomsNegative.size() + 1);
		for (Atom posAtom : bodyAtomsPositive) {
			predicateList.add(posAtom.getPredicate());
		}
		for (Atom negAtom : bodyAtomsNegative) {
			predicateList.add(negAtom.getPredicate());
		}
		if (!isConstraint()) {
			predicateList.add(headAtom.getPredicate());
		}
		return predicateList;
	}

	/**
	 * Checks whether a rule is safe. A rule is safe iff all negated variables and all variables occurring in the
	 * head also occur in the positive body).
	 * @return true if this rule is safe.
	 */
	private void checkSafety() {
		Set<Variable> bindingVariables = new HashSet<>();
		Set<Variable> nonbindingVariables = new HashSet<>();

		// Check that all negative variables occur in the positive body.
		for (Atom posAtom : bodyAtomsPositive) {
			bindingVariables.addAll(posAtom.getBindingVariables());
			nonbindingVariables.addAll(posAtom.getNonBindingVariables());
		}

		for (Atom negAtom : bodyAtomsNegative) {
			// No variables in a negated atom are binding.
			nonbindingVariables.addAll(negAtom.getBindingVariables());
			nonbindingVariables.addAll(negAtom.getNonBindingVariables());
		}

		// Rule heads must be safe, i.e., all their variables must be bound by the body.
		if (!isConstraint()) {
			nonbindingVariables.addAll(headAtom.getBindingVariables());
			nonbindingVariables.addAll(headAtom.getNonBindingVariables());
		}

		// Check that all non-binding variables are bound in this rule.
		nonbindingVariables.removeAll(bindingVariables);

		if (nonbindingVariables.isEmpty()) {
			return;
		}

		throw new RuntimeException("Encountered unsafe variable " + nonbindingVariables.iterator().next().toString() + " in rule: " + toString()
			+ "\nNotice: A rule is considered safe if all variables occurring in negative literals, builtin atoms, and the head of the rule also occur in some positive litera.");
	}

	/**
	 * Sorts atoms such that the join-order of the atoms is improved (= cannot degenerate into cross-product).
	 * Note that the below sorting can be improved to yield smaller joins.
	 */
	private List<Literal> sortAtoms(List<Literal> atoms) {
		final Set<SortingBodyComponent> components = new LinkedHashSet<>();
		final Set<ExternalAtom> builtinAtoms = new LinkedHashSet<>();
		final Set<IntervalAtom> intervalAtoms = new LinkedHashSet<>();

		for (Literal atom : atoms) {
			// FIXME: The following case assumes that builtin predicates do not create bindings?!
			if ((atom instanceof ExternalAtom) && (((ExternalAtom)atom).getInterpretation()) instanceof BuiltinBiPredicate) {
				// Sort out builtin atoms (we consider them as not creating new bindings)
				builtinAtoms.add((ExternalAtom) atom);
				continue;
			}
			if (atom instanceof IntervalAtom) {
				intervalAtoms.add((IntervalAtom) atom);
				continue;
			}
			final Set<SortingBodyComponent> hits = new LinkedHashSet<>();

			// For each variable
			for (Variable variableTerm : atom.getBindingVariables()) {
				// Find all components it also occurs and record in hitting components
				for (SortingBodyComponent component : components) {
					if (component.occurringVariables.contains(variableTerm)) {
						hits.add(component);
					}
				}
			}

			// If no components were hit, create new component, else merge components
			if (hits.isEmpty()) {
				components.add(new SortingBodyComponent(atom));
				continue;
			}

			// If only one component hit, add atom to it
			if (hits.size() == 1) {
				hits.iterator().next().add(atom);
				continue;
			}

			// Merge all components that are hit by the current atom
			SortingBodyComponent firstComponent = hits.iterator().next();
			firstComponent.add(atom);
			for (SortingBodyComponent hitComponent : hits) {
				if (hitComponent != firstComponent) {
					firstComponent.merge(hitComponent);
					// Remove merged component from the set of available components
					components.remove(hitComponent);
				}
			}
		}

		// Components now contains all components that are internally connected but not connected to another component
		List<Literal> sortedPositiveBodyAtoms = new ArrayList<>(components.size());
		for (SortingBodyComponent component : components) {
			sortedPositiveBodyAtoms.addAll(component.atomSequence);
		}

		sortedPositiveBodyAtoms.addAll(intervalAtoms); // Put interval atoms after positive literals generating their bindings and before builtin atom.
		sortedPositiveBodyAtoms.addAll(builtinAtoms);	// Put builtin atoms after positive literals and before negative ones.
		return sortedPositiveBodyAtoms;
	}

	/**
	 * Returns the interpretation occurring first in the body of the rule.
	 * @return the first interpretation of the body or null if the first interpretation is a builtin interpretation.
	 */
	public Predicate usedFirstBodyPredicate() {
		if (!bodyAtomsPositive.isEmpty()) {
			return (bodyAtomsPositive.get(0)).getPredicate();
		} else if (!bodyAtomsNegative.isEmpty()) {
			return (bodyAtomsNegative.get(0)).getPredicate();
		}
		throw new RuntimeException("Encountered NonGroundRule with empty body, which should have been treated as a fact.");
	}

	public boolean isFirstBodyPredicatePositive() {
		return bodyAtomsPositive.size() > 0;
	}

	/**
	 * Returns the n-th atom in the body of this non-ground rule.
	 * @param atomPosition 0-based position of the body atom.
	 * @return
	 */
	public Literal getBodyAtom(int atomPosition) {
		if (atomPosition < bodyAtomsPositive.size()) {
			return bodyAtomsPositive.get(atomPosition);
		} else {
			return bodyAtomsNegative.get(atomPosition - bodyAtomsPositive.size());
		}
	}

	public int getFirstOccurrenceOfPredicate(Predicate predicate) {
		for (int i = 0; i < getNumBodyAtoms(); i++) {
			if (getBodyAtom(i).getPredicate().equals(predicate)) {
				return i;
			}
		}
		throw new RuntimeException("Predicate " + predicate + " does not occur in rule " + this);
	}

	public boolean isBodyAtomPositive(int atomPosition) {
		return atomPosition < bodyAtomsPositive.size();
	}

	/**
	 * Returns all predicates occurring in the negative body of the rule.
	 * @return
	 */
	public List<Predicate> usedNegativeBodyPredicates() {
		ArrayList<Predicate> usedPredicates = new ArrayList<>(bodyAtomsNegative.size());
		for (Atom basicAtom : bodyAtomsNegative) {
			usedPredicates.add(basicAtom.getPredicate());
		}
		return usedPredicates;
	}

	public int getNumBodyAtoms() {
		return bodyAtomsPositive.size() + bodyAtomsNegative.size();
	}

	public boolean isConstraint() {
		return headAtom == null;
	}

	public boolean hasNegativeBodyAtoms() {
		return !bodyAtomsNegative.isEmpty();
	}

	@Override
	public String toString() {
		return join(
			join(
				isConstraint() ? "" : ":- " + headAtom + " ",
				bodyAtomsPositive,
				bodyAtomsPositive.size() + bodyAtomsNegative.size() > 0 ? ", " : " "
			),
			bodyAtomsNegative,
			"."
		);
	}

	private class SortingBodyComponent {
		private final Set<Variable> occurringVariables;
		private final Set<Literal> atoms;
		private final List<Literal> atomSequence;
		int numAtoms;

		SortingBodyComponent(Literal atom) {
			this.occurringVariables = new LinkedHashSet<>(atom.getBindingVariables());
			this.atoms = new LinkedHashSet<>();
			this.atoms.add(atom);
			this.atomSequence = new ArrayList<>();
			this.atomSequence.add(atom);
			this.numAtoms = 1;
		}

		void add(Literal atom) {
			this.atoms.add(atom);
			this.atomSequence.add(atom);
			this.occurringVariables.addAll(atom.getBindingVariables());
			this.numAtoms++;
		}

		void merge(SortingBodyComponent other) {
			occurringVariables.addAll(other.occurringVariables);
			atoms.addAll(other.atoms);
			numAtoms += other.numAtoms;
			atomSequence.addAll(other.atomSequence);
		}
	}

	public List<Literal> getBodyAtomsPositive() {
		return bodyAtomsPositive;
	}

	public List<Literal> getBodyAtomsNegative() {
		return bodyAtomsNegative;
	}

	public Atom getHeadAtom() {
		return headAtom;
	}
}