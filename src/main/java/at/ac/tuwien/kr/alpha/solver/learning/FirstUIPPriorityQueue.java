package at.ac.tuwien.kr.alpha.solver.learning;

import at.ac.tuwien.kr.alpha.common.ReadableAssignment;
import at.ac.tuwien.kr.alpha.solver.ThriceTruth;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Copyright (c) 2016, the Alpha Team.
 */
public class FirstUIPPriorityQueue {
	private final PriorityQueue<ReadableAssignment.Entry<ThriceTruth>> delegate;
	private final Set<ReadableAssignment.Entry> alreadyAdded;
	private final int decisionLevel;

	private int lastPollPropagationLevel = Integer.MAX_VALUE;

	public FirstUIPPriorityQueue(int decisionLevel) {
		this.decisionLevel = decisionLevel;
		this.delegate = new PriorityQueue<>(Comparator.comparing((ReadableAssignment.Entry<ThriceTruth> e) -> { return e.getPropagationLevel(); }).reversed());
		this.alreadyAdded = new HashSet<>();
	}

	/**
	 * Adds a new entry to the queue. The entry is sorted into the queue according to its propagationLevel (highest
	 * propagationLevel first). If the decisionLevel of the entry does not equal the one of the
	 * FirstUIPPriorityQueue, the entry is ignored. Duplicate entries are ignored.
	 * @param entry the entry to add.
	 */
	public void add(ReadableAssignment.Entry<ThriceTruth> entry) {
		if (entry.getDecisionLevel() != decisionLevel) {
			// Ignore assignments from lower decision levels.
			return;
		}
		if (entry.getPropagationLevel() > lastPollPropagationLevel) {
			throw new RuntimeException("Adding to 1UIP queue an entry with higher propagationLevel than returned by the last poll. Should not happen.");
		}
		if (alreadyAdded.contains(entry)) {
			// Ignore already added assignments.
			return;
		}
		delegate.add(entry);
		alreadyAdded.add(entry);
	}

	/**
	 * Retrieves the first element (i.e., the entry with the highest propagationLevel) from the queue and removes it.
	 * @return null if the queue is empty.
	 */
	public ReadableAssignment.Entry<ThriceTruth> poll() {
		ReadableAssignment.Entry<ThriceTruth> firstEntry = delegate.poll();
		if (firstEntry == null) {
			return null;
		}
		lastPollPropagationLevel = firstEntry.getPropagationLevel();
		return firstEntry;
	}

	/**
	 * Returns the size of the queue.
	 * @return the size of the underlying queue.
	 */
	public int size() {
		return delegate.size();
	}
}