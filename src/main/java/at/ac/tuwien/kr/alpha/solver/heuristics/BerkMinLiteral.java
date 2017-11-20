package at.ac.tuwien.kr.alpha.solver.heuristics;

import at.ac.tuwien.kr.alpha.common.Assignment;
import at.ac.tuwien.kr.alpha.common.NoGood;
import at.ac.tuwien.kr.alpha.grounder.Grounder;
import at.ac.tuwien.kr.alpha.solver.ChoiceManager;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

import static at.ac.tuwien.kr.alpha.common.Literals.atomOf;

/**
 * A BerkMin-like heuristics that uses activity of literals and a fixed-size queue instead of a stack of NoGoods.
 * Copyright (c) 2017, the Alpha Team.
 */
public class BerkMinLiteral extends BerkMin {

	private static final int DEFAULT_QUEUE_SIZE = 32;
	private final int queueSize;
	private Deque<Integer> activeLiterals = new LinkedList<>();

	BerkMinLiteral(Assignment assignment, ChoiceManager choiceManager, int decayAge, double decayFactor, Random random, int queueSize, Grounder grounder) {
		super(assignment, choiceManager, decayAge, decayFactor, random, grounder);
		this.queueSize = queueSize;
	}

	BerkMinLiteral(Assignment assignment, ChoiceManager choiceManager, Random random, Grounder grounder) {
		this(assignment, choiceManager, DEFAULT_DECAY_AGE, DEFAULT_DECAY_FACTOR, random, DEFAULT_QUEUE_SIZE, grounder);
	}

	/**
	 * {@inheritDoc}
	 * In BerkMin, the atom to choose on is the most active atom in the current top clause.
	 * Here, we can only consider atoms which are currently active choice points. If we do
	 * not find such an atom in the current top clause, we consider the next undefined
	 * nogood in the stack, then the one after that and so on.
	 */
	@Override
	public int chooseAtom() {
		return getMostActiveChoosableAtom(activeLiterals.stream());
	}

	private void pushToStack(Integer literal) {
		if (choiceManager.isAtomChoice(atomOf(literal))) {
			activeLiterals.addFirst(literal);
			// Restrict the size of the queue.
			if (activeLiterals.size() > queueSize) {
				activeLiterals.removeLast();
			}
		}
	}

	@Override
	protected void pushToStack(NoGood noGood) {
		if (noGood != null) {
			for (Integer literal : noGood) {
				pushToStack(literal);
			}
		}
	}
}
