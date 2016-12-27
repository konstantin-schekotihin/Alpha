/**
 * Copyright (c) 2016 Siemens AG
 * All rights reserved.
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
package at.ac.tuwien.kr.alpha.solver.heuristics;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import at.ac.tuwien.kr.alpha.common.NoGood;
import at.ac.tuwien.kr.alpha.solver.BasicAssignment;

/**
 * Tests {@link BerkMin}.
 * 
 * Copyright (c) 2016 Siemens AG
 *
 */
public class BerkMinTest {
	
	/**
	 * The tolerable epsilon for double comparisons
	 */
	private static final double EPSILON = 0.000001;
	
	private BerkMin berkmin;
	
	@Before
	public void setUp() {
		this.berkmin = new BerkMin(new BasicAssignment(), a -> true);
	}
	
	@Test
	public void countPositiveLiteralsOnce() {
		NoGood violatedNoGood = new NoGood(1, 2);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1, berkmin.getActivity(1), EPSILON);
		assertEquals(1, berkmin.getActivity(2), EPSILON);
	}
	
	@Test
	public void countNegativeLiteralsOnce() {
		NoGood violatedNoGood = new NoGood(-1, -2);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1, berkmin.getActivity(-1), EPSILON);
		assertEquals(1, berkmin.getActivity(-2), EPSILON);
	}
	
	@Test
	public void countPositiveLiteralsTwice() {
		NoGood violatedNoGood = new NoGood(1, 2);
		berkmin.violatedNoGood(violatedNoGood);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2, berkmin.getActivity(1), EPSILON);
		assertEquals(2, berkmin.getActivity(2), EPSILON);
	}
	
	@Test
	public void countNegativeLiteralsTwice() {
		NoGood violatedNoGood = new NoGood(-1, -2);
		berkmin.violatedNoGood(violatedNoGood);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2, berkmin.getActivity(-1), EPSILON);
		assertEquals(2, berkmin.getActivity(-2), EPSILON);
	}
	
	@Test
	public void countMixedLiteralsTwice() {
		NoGood violatedNoGood = new NoGood(1, -2);
		berkmin.violatedNoGood(violatedNoGood);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2, berkmin.getActivity(1), EPSILON);
		assertEquals(2, berkmin.getActivity(-2), EPSILON);
	}
	
	@Test
	public void countPositiveLiteralsThenNegativeLiterals() {
		berkmin.violatedNoGood(new NoGood(1, 2));
		berkmin.violatedNoGood(new NoGood(-1, -2));
		assertEquals(2, berkmin.getActivity(1), EPSILON);
		assertEquals(2, berkmin.getActivity(2), EPSILON);
	}
	
	@Test
	public void reachDecayAgeOnce() {
		berkmin.setDecayAge(3);
		berkmin.setDecayFactor(1.0 / 3);
		NoGood violatedNoGood = new NoGood(1, 2);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1, berkmin.getActivity(1), EPSILON);
		assertEquals(1, berkmin.getActivity(2), EPSILON);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2, berkmin.getActivity(1), EPSILON);
		assertEquals(2, berkmin.getActivity(2), EPSILON);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1, berkmin.getActivity(1), EPSILON);
		assertEquals(1, berkmin.getActivity(2), EPSILON);
	}
	
	@Test
	public void reachDecayAgeTwice() {
		berkmin.setDecayAge(2);
		berkmin.setDecayFactor(0.75);
		NoGood violatedNoGood = new NoGood(1, 2);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1, berkmin.getActivity(1), EPSILON);
		assertEquals(1, berkmin.getActivity(2), EPSILON);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(1.5, berkmin.getActivity(1), EPSILON);
		assertEquals(1.5, berkmin.getActivity(2), EPSILON);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2.5, berkmin.getActivity(1), EPSILON);
		assertEquals(2.5, berkmin.getActivity(2), EPSILON);
		berkmin.violatedNoGood(violatedNoGood);
		assertEquals(2.625, berkmin.getActivity(1), EPSILON);
		assertEquals(2.625, berkmin.getActivity(2), EPSILON);
	}
	
}