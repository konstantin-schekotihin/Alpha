/**
 * Copyright (c) 2016, the Alpha Team.
 * All rights reserved.
 *
 * Additional changes made by Siemens.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1) Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2) Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package at.ac.tuwien.kr.alpha.solver;

import at.ac.tuwien.kr.alpha.common.Assignment;
import at.ac.tuwien.kr.alpha.common.NoGood;

import static at.ac.tuwien.kr.alpha.common.Literals.atomOf;
import static at.ac.tuwien.kr.alpha.common.Literals.isPositive;

public interface WritableAssignment extends Assignment {
	/**
	 * Delete all information stored in the assignment.
	 */
	void clear();

	/**
	 * Backtracks to the indicated decision level. Every assignment on a higher decisionLevel is removed.
	 * All assignments below (or equal to) decisionLevel are kept. Note that for atoms being TRUE this may require
	 * setting the assigned value to MBT during backtracking.
	 */
	void backtrack();

	/**
	 * Assigns an atom some value on a lower decision level than the current one.
	 * @param atom
	 * @param value
	 * @param impliedBy
	 * @param decisionLevel
	 * @return
	 */
	ConflictCause assign(int atom, ThriceTruth value, NoGood impliedBy, int decisionLevel);

	default ConflictCause assign(int atom, ThriceTruth value, NoGood impliedBy) {
		return assign(atom, value, impliedBy, getDecisionLevel());
	}

	default ConflictCause assign(int atom, ThriceTruth value) {
		return assign(atom, value, null);
	}

	ConflictCause choose(int atom, ThriceTruth value);

	default ConflictCause choose(int atom, boolean value) {
		return choose(atom, ThriceTruth.valueOf(value));
	}

	default int minimumConflictLevel(NoGood noGood) {
		int minimumConflictLevel = -1;
		for (Integer literal : noGood) {
			Assignment.Entry entry = get(atomOf(literal));
			if (entry == null || isPositive(literal) != entry.getTruth().toBoolean()) {
				return -1;
			}
			int literalDecisionLevel = entry.getPrevious() != null ? entry.getPrevious().getDecisionLevel() : entry.getDecisionLevel();
			if (literalDecisionLevel > minimumConflictLevel) {
				minimumConflictLevel = literalDecisionLevel;
			}
		}
		return minimumConflictLevel;
	}
}
