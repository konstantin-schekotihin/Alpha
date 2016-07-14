package at.ac.tuwien.kr.alpha.grounder;

import at.ac.tuwien.kr.alpha.AnswerSet;
import at.ac.tuwien.kr.alpha.NoGood;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static at.ac.tuwien.kr.alpha.Util.entriesToMap;
import static at.ac.tuwien.kr.alpha.Util.entry;

/**
 * Represents a small ASP program {@code { c :- a, b.  a.  b. }}.
 *
 * Copyright (c) 2016, the Alpha Team.
 */
public class DummyGrounder extends AbstractGrounder {
	private static final Log LOG = LogFactory.getLog(AbstractGrounder.class);

	private static Map<Integer, String> atomIdToString = Stream.of(
		entry(1, "a"),
		entry(2, "b"),
		entry(3, "_br1"),
		entry(4, "c")
	).collect(entriesToMap());

	private static final int FACT_A = 11; // { -a }
	private static final int FACT_B = 12; // { -b }
	private static final int RULE_B = 13; // { -_br1, a, b }
	private static final int RULE_H = 14; // { -c, _br1 }

	private static final Map<Integer, NoGood> noGoods = Stream.of(
		entry(FACT_A, new NoGood(new int[]{ 1 })),
		entry(FACT_B, new NoGood(new int[]{ -2 })),
		entry(RULE_B, new NoGood(new int[]{ -4, 1, 2 })),
		entry(RULE_H, new NoGood(new int[]{ 4, -3 }, 1))
	).collect(entriesToMap());

	private byte[] currentTruthValues = new byte[]{-2, -1, -1, -1, -1};
	private Set<Integer> returnedNogoods = new HashSet<>();

	@Override
	public void updateAssignment(int[] atomIds, boolean[] truthValues) {
		for (int i = 0; i < atomIds.length; i++) {
			currentTruthValues[atomIds[i]] = truthValues[i] ? (byte)1 : (byte)0;
		}
	}

	@Override
	public void forgetAssignment(int[] atomIds) {
		for (int atomId : atomIds) {
			currentTruthValues[atomId] = -1;
		}
	}

	@Override
	public AnswerSet assignmentToAnswerSet(Predicate<GrounderPredicate> filter, int[] trueAtoms) {
		// TODO(AntoniusW): We need a representation for AnswerSet.

		LOG.debug(
			// NOTE(flowlo): If this stream would map to GrounderPredicate
			// it could be easily filtered by filter.
			Arrays.stream(trueAtoms)
				.mapToObj(atomIdToString::get)
				.collect(Collectors.joining(", ", "{ ", " }"))
		);
		return null;
	}

	@Override
	public Map<Integer, NoGood> getNoGoods() {
		// Return NoGoods depending on current assignment.
		HashMap<Integer, NoGood> returnNoGoods = new HashMap<>();
		if (currentTruthValues[1] == 1 && currentTruthValues[2] == 1) {
			addNoGoodIfNotAlreadyReturned(returnNoGoods, RULE_B);
			addNoGoodIfNotAlreadyReturned(returnNoGoods, RULE_H);
		} else {
			addNoGoodIfNotAlreadyReturned(returnNoGoods, FACT_A);
			addNoGoodIfNotAlreadyReturned(returnNoGoods, FACT_B);
		}
		return returnNoGoods;
	}

	private void addNoGoodIfNotAlreadyReturned(Map<Integer, NoGood> integerNoGoodMap, Integer idNoGood) {
		if (!returnedNogoods.contains(idNoGood)) {
			integerNoGoodMap.put(idNoGood, noGoods.get(idNoGood));
			returnedNogoods.add(idNoGood);
		}
	}
}
