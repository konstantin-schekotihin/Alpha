package at.ac.tuwien.kr.alpha.common.predicates;

import at.ac.tuwien.kr.alpha.common.terms.ConstantTerm;
import org.apache.commons.lang3.ClassUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ExternalMethodPredicate extends ExternalNonBindingPredicate {
	private final Method method;

	public ExternalMethodPredicate(Method method) {
		super(method.getName(), method.getParameterCount());

		if (!method.getReturnType().equals(boolean.class)) {
			throw new IllegalArgumentException("method must return boolean");
		}

		this.method = method;
	}

	@Override
	protected boolean test(List<ConstantTerm> terms) {
		final Class<?>[] parameterTypes = method.getParameterTypes();
		final Object[] arguments = new Object[terms.size()];

		for (int i = 0; i < arguments.length; i++) {
			arguments[i] = terms.get(i).getObject();

			final Class<?> expected = parameterTypes[i];
			final Class<?> actual = arguments[i].getClass();

			if (expected.isAssignableFrom(actual)) {
				continue;
			}

			if (expected.isPrimitive() && ClassUtils.primitiveToWrapper(expected).isAssignableFrom(actual)) {
				continue;
			}

			throw new IllegalArgumentException(
				"Parameter type mismatch when calling " + getPredicateName() +
					" at position " + i + ". Expected " + expected + " but got " +
					actual + "."
			);
		}

		try {
			return (boolean) method.invoke(null, arguments);
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}
}
