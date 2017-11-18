package at.ac.tuwien.kr.alpha.common.atoms;

import at.ac.tuwien.kr.alpha.Util;
import at.ac.tuwien.kr.alpha.common.predicates.Predicate;
import at.ac.tuwien.kr.alpha.common.terms.Term;
import at.ac.tuwien.kr.alpha.common.terms.VariableTerm;
import at.ac.tuwien.kr.alpha.grounder.Substitution;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HeuristicAtom implements Literal {
	private final List<Term> terms;
	private final Predicate predicate = new Predicate("_heuristic",1);
	private final boolean ground;


	public HeuristicAtom(List<Term> terms) {
		this.terms = terms;
		boolean ground = true;
		for (Term term : terms) {
			if (!term.isGround()) {
				ground = false;
				break;
			}
		}
		this.ground = ground;
	}


	@Override
	public boolean isNegated() {
		return false;
	}

	@Override
	public Predicate getPredicate() {
		return this.predicate;
	}

	@Override
	public List<Term> getTerms() {
		return this.terms;
	}

	@Override
	public boolean isGround() {
		return false;
	}

	@Override
	public List<VariableTerm> getBindingVariables() {
		LinkedList<VariableTerm> bindingVariables = new LinkedList<>();
		for (Term term : terms) {
			bindingVariables.addAll(term.getOccurringVariables());
		}
		return bindingVariables;
	}

	@Override
	public List<VariableTerm> getNonBindingVariables() {
		LinkedList<VariableTerm> nonbindingVariables = new LinkedList<>();
		for (Term term : terms) {
			nonbindingVariables.addAll(term.getOccurringVariables());
		}
		return nonbindingVariables;
	}

	@Override
	public Atom substitute(Substitution substitution) {
		return new HeuristicAtom(terms.stream()
			.map(t -> t.substitute(substitution))
			.collect(Collectors.toList()));
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(predicate.getPredicateName());
		if (!terms.isEmpty()) {
			sb.append("(");
			Util.appendDelimited(sb, terms);
			sb.append(")");
		}
		return sb.toString();
	}
}
