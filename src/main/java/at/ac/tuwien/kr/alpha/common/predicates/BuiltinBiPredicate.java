package at.ac.tuwien.kr.alpha.common.predicates;

import at.ac.tuwien.kr.alpha.common.BinaryOperator;
import at.ac.tuwien.kr.alpha.common.terms.ConstantTerm;
import at.ac.tuwien.kr.alpha.common.terms.Term;

import java.util.List;
import java.util.Set;

public class BuiltinBiPredicate extends FixedInterpretationPredicate {
	private final BinaryOperator operator;

	public BuiltinBiPredicate(BinaryOperator operator) {
		super(operator.toString(), 2);
		this.operator = operator;
	}

	@Override
	public Set<List<ConstantTerm>> evaluate(List<Term> terms) {
		if (terms.size() != getArity()) {
			throw new RuntimeException("Tried to evaluate total order predicate over unexpected arity!");
		}

		final Term x = terms.get(0);
		final Term y = terms.get(1);

		final int comparison = x.compareTo(y);

		boolean result;

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

		return result ? TRUE : FALSE;
	}
}
