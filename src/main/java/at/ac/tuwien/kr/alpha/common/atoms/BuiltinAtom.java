package at.ac.tuwien.kr.alpha.common.atoms;

import at.ac.tuwien.kr.alpha.common.BinaryOperator;
import at.ac.tuwien.kr.alpha.common.predicates.FixedInterpretationPredicate;
import at.ac.tuwien.kr.alpha.common.predicates.Predicate;
import at.ac.tuwien.kr.alpha.common.terms.ArithmeticTerm;
import at.ac.tuwien.kr.alpha.common.terms.ConstantTerm;
import at.ac.tuwien.kr.alpha.common.terms.Term;
import at.ac.tuwien.kr.alpha.common.terms.VariableTerm;
import at.ac.tuwien.kr.alpha.grounder.Substitution;

import java.util.*;

/**
 * Represents a builtin atom according to the standard.
 * Copyright (c) 2017, the Alpha Team.
 */
public class BuiltinAtom extends FixedInterpretationAtom {
	private final FixedInterpretationPredicate predicate;
	private final BinaryOperator operator;
	private final List<Term> terms;
	private final boolean negated;
	private final boolean isNormalizedEquality;

	public BuiltinAtom(Term left, Term right, boolean negated, BinaryOperator operator) {
		this.terms = Arrays.asList(left, right);
		this.negated = negated;
		this.operator = operator;
		this.isNormalizedEquality = (!negated && operator == BinaryOperator.EQ)
			|| (negated && operator == BinaryOperator.NE);
		predicate = new FixedInterpretationPredicate(operator.toString(), 2, false) {
			@Override
			public Set<List<ConstantTerm>> evaluate(List<Term> terms) {
				throw new UnsupportedOperationException();
			}
		};
	}

	public boolean isNormalizedEquality() {
		return isNormalizedEquality;
	}

	private boolean isLeftAssigning() {
		return isNormalizedEquality && terms.get(0) instanceof VariableTerm;
	}

	private boolean isRightAssigning() {
		return isNormalizedEquality && terms.get(1) instanceof VariableTerm;
	}

	@Override
	public boolean isNegated() {
		return negated;
	}

	@Override
	public Predicate getPredicate() {
		return predicate;
	}

	@Override
	public List<Term> getTerms() {
		return terms;
	}

	@Override
	public boolean isGround() {
		return terms.get(0).isGround() && terms.get(1).isGround();
	}

	@Override
	public List<VariableTerm> getBindingVariables() {
		if (isLeftAssigning() && isRightAssigning()) {
			// In case this is "X = Y" or "not X != Y" then both sides are binding given that the other is.
			// In this case non-binding and binding variables cannot be reported accurately, in fact, the double variable could be compiled away.
			throw new RuntimeException("Builtin equality with left and right side being variables encountered. Should not happen.");
		}
		if (isLeftAssigning()) {
			return Collections.singletonList((VariableTerm)terms.get(0));
		}
		if (isRightAssigning()) {
			return Collections.singletonList((VariableTerm)terms.get(1));
		}
		return Collections.emptyList();
	}

	@Override
	public List<VariableTerm> getNonBindingVariables() {
		Term left = terms.get(0);
		Term right = terms.get(1);
		HashSet<VariableTerm> occurringVariables = new HashSet<>();
		List<VariableTerm> leftOccurringVariables = new LinkedList<>(left.getOccurringVariables());
		List<VariableTerm> rightOccurringVariables = new LinkedList<>(right.getOccurringVariables());
		if (isLeftAssigning()) {
			leftOccurringVariables.remove(left);
		}
		if (isRightAssigning()) {
			rightOccurringVariables.remove(right);
		}
		occurringVariables.addAll(leftOccurringVariables);
		occurringVariables.addAll(rightOccurringVariables);
		if (isLeftAssigning() || isRightAssigning()) {
			return new ArrayList<>(occurringVariables);
		}
		// Neither left- nor right-assigning, hence no variable is binding.
		return new ArrayList<>(occurringVariables);
	}

	@Override
	public Atom substitute(Substitution substitution) {
		return new BuiltinAtom(terms.get(0).substitute(substitution),
			terms.get(1).substitute(substitution),
			negated, operator);
	}

	@Override
	public List<Substitution> getSubstitutions(Substitution partialSubstitution) {
		// Treat case that this is X = t or t = X.
		if (isLeftAssigning() || isRightAssigning()) {
			VariableTerm variable = null;
			Term expression = null;
			if (isLeftAssigning()) {
				variable = (VariableTerm) terms.get(0);
				expression = terms.get(1);
			}
			if (isRightAssigning()) {
				variable = (VariableTerm) terms.get(1);
				expression = terms.get(0);
			}
			Term groundTerm = expression.substitute(partialSubstitution);
			Term resultTerm = null;
			// Check if the groundTerm is an arithmetic expression and evaluate it if so.
			if (groundTerm instanceof ArithmeticTerm) {
				Integer result = ArithmeticTerm.evaluateGroundTerm(groundTerm);
				if (result == null) {
					return Collections.emptyList();
				}
				resultTerm = ConstantTerm.getInstance(result);
			} else {
				// Ground term is another term (constant, or function term).
				resultTerm = groundTerm;
			}
			Substitution extendedSubstitution = new Substitution(partialSubstitution);
			extendedSubstitution.put(variable, resultTerm);
			return Collections.singletonList(extendedSubstitution);
		}

		// Treat all other cases, i.e., this is just comparison with all variables bound by partialSubstitution.
		if (compare(terms.get(0).substitute(partialSubstitution), terms.get(1).substitute(partialSubstitution))) {
			return Collections.singletonList(partialSubstitution);
		} else {
			return Collections.emptyList();
		}
	}

	private boolean compare(Term x, Term y) {
		final int comparison = x.compareTo(y);

		boolean result;

		BinaryOperator operator = isNegated() ? this.operator.getNegation() : this.operator;
		switch (operator) {
			case EQ:
				result = comparison ==  0;
				break;
			case LT:
				result = comparison < 0;
				break;
			case GT:
				result = comparison > 0;
				break;
			case LE:
				result = comparison <= 0;
				break;
			case GE:
				result = comparison >= 0;
				break;
			case NE:
				result = comparison != 0;
				break;
			default:
				throw new UnsupportedOperationException("Unknown comparison operator requested!");
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(negated ? "not " : "");
		sb.append(terms.get(0));
		sb.append(" ");
		sb.append(operator);
		sb.append(" ");
		sb.append(terms.get(1));
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		BuiltinAtom that = (BuiltinAtom) o;

		if (negated != that.negated) {
			return false;
		}
		if (operator != that.operator) {
			return false;
		}
		return terms.equals(that.terms);
	}

	@Override
	public int hashCode() {
		return 31 * (31 * operator.hashCode() + terms.hashCode()) + (negated ? 1 : 0);
	}
}
