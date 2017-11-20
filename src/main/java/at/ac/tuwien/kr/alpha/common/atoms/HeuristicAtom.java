package at.ac.tuwien.kr.alpha.common.atoms;

import at.ac.tuwien.kr.alpha.Util;
import at.ac.tuwien.kr.alpha.antlr.ASPCore2Lexer;
import at.ac.tuwien.kr.alpha.antlr.ASPCore2Parser;
import at.ac.tuwien.kr.alpha.common.predicates.Predicate;
import at.ac.tuwien.kr.alpha.common.terms.ConstantTerm;
import at.ac.tuwien.kr.alpha.common.terms.FunctionTerm;
import at.ac.tuwien.kr.alpha.common.terms.Term;
import at.ac.tuwien.kr.alpha.common.terms.VariableTerm;
import at.ac.tuwien.kr.alpha.grounder.Substitution;
import org.antlr.v4.runtime.misc.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HeuristicAtom implements Literal {
	private final List<Term> terms;
	public final String PREDICATE_HEURISTIC = ASPCore2Lexer.VOCABULARY.getLiteralName(ASPCore2Lexer.PREDICATE_HEURISTIC)
		.replace("'","");
	private final Predicate predicate = new Predicate(PREDICATE_HEURISTIC,2, true);
	private final boolean ground;

	private final Integer weight;
	private final Integer level;


	public HeuristicAtom(List<Term> terms, ASPCore2Parser.HeuristicContext ctx) {
		if (terms.size()<1 || terms.size() > 2){
			throw new RuntimeException(getErrorMsg(ctx) +
				PREDICATE_HEURISTIC +"(Weight) or " + PREDICATE_HEURISTIC + "(Weight,Level) was " +
				"expected, but " + terms.size() + " terms found!");
		}

		List<Term> local = new ArrayList<>(2);
		local.addAll(terms);
		if (terms.size() < 2)
			local.add(ConstantTerm.getInstance(1));

		this.terms = Collections.unmodifiableList(local);
		this.weight = getConstant(this.terms.get(0), ctx);
		this.level = getConstant(this.terms.get(1), ctx);

		this.ground = this.weight != null && this.level != null;
	}

	private String getErrorMsg(ASPCore2Parser.HeuristicContext ctx) {
		return "Invalid syntax" +
			((ctx != null) ? " in line " + ctx.getStart().getLine() : "") + "! ";
	}

	public HeuristicAtom(List<Term> terms) {
		this(terms, null);
	}

	private Integer getConstant(Term term, ASPCore2Parser.HeuristicContext ctx) {
		if (term instanceof FunctionTerm)
			throw new RuntimeException(getErrorMsg(ctx) + "Function terms cannot be used in heuristic atoms.");
		if (!term.isGround()) {
			return null;
		}
		if (term instanceof ConstantTerm)
			return (Integer)((ConstantTerm)term).getObject();
		throw new RuntimeException(getErrorMsg(ctx) +
			PREDICATE_HEURISTIC + "(Weight) or "+ PREDICATE_HEURISTIC + "(Weight,Level) was expected.");
	}

	public Integer getWeight() {
		return weight;
	}

	public Integer getLevel() {
		return level;
	}

	@Override
	public Type getType() {
		return Type.HEURISTIC_ATOM;
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
		return this.ground;
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
			Util.appendDelimited(sb, this.terms);
			sb.append(")");
		}
		return sb.toString();
	}
}
