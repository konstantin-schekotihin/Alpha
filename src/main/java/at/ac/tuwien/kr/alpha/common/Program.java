/**
 * Copyright (c) 2017, the Alpha Team.
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
package at.ac.tuwien.kr.alpha.common;

import at.ac.tuwien.kr.alpha.common.atoms.Atom;

import java.util.Collections;
import java.util.List;

/**
 * Alpha-internal representation of an ASP program, i.e., a set of ASP rules.
 * Copyright (c) 2017, the Alpha Team.
 */
public class Program {
	public static final Program EMPTY = new Program(Collections.emptyList(), Collections.emptyList());

	private final List<Rule> rules;
	private final List<Atom> facts;

	public Program(List<Rule> rules, List<Atom> facts) {
		this.rules = rules;
		this.facts = facts;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public List<Atom> getFacts() {
		return facts;
	}

	public void accumulate(Program program) {
		rules.addAll(program.rules);
		facts.addAll(program.facts);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Atom fact : facts) {
			sb.append(fact).append(".").append(System.lineSeparator());
		}
		for (Rule rule : rules) {
			sb.append(rule).append(System.lineSeparator());
		}

		return sb.toString();
	}
}
