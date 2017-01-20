/**
 * Copyright (c) 2017 Siemens AG
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
package at.ac.tuwien.kr.alpha.solver;

import at.ac.tuwien.kr.alpha.common.AnswerSet;
import at.ac.tuwien.kr.alpha.grounder.NaiveGrounder;
import at.ac.tuwien.kr.alpha.grounder.parser.ParsedProgram;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

import static at.ac.tuwien.kr.alpha.Main.parseVisit;

/**
 * Tests {@link AbstractSolver} using some hanoi tower test cases (see https://en.wikipedia.org/wiki/Tower_of_Hanoi).
 *
 */
public class HanoiTowerTest extends AbstractSolverTests {
	/**
	 * Sets the logging level to TRACE. Useful for debugging; call at beginning of test case.
	 */
	private static void enableTracing() {
		Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(ch.qos.logback.classic.Level.TRACE);
	}

	private static void enableDebugLog() {
		Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(Level.DEBUG);
	}

	@Test(timeout = 10000)
	public void testInstance1() throws IOException {
		testHanoiTower(1);
	}

	@Test(timeout = 10000)
	public void testInstance2() throws IOException {
		testHanoiTower(2);
	}

	@Test(timeout = 10000)
	public void testInstance3() throws IOException {
		testHanoiTower(3);
	}

	@Test(timeout = 10000)
	public void testInstance4() throws IOException {
		testHanoiTower(4);
	}

	@Test(timeout = 10000)
	public void testSimple() throws IOException {
		testHanoiTower("simple");
	}

	private void testHanoiTower(int instance) throws IOException {
		testHanoiTower(String.valueOf(instance));
	}

	private void testHanoiTower(String instance) throws IOException {
		ANTLRFileStream programInputStream = new ANTLRFileStream(Paths.get("src", "test", "resources", "HanoiTower_Alpha.asp").toString());
		ANTLRFileStream instanceInputStream = new ANTLRFileStream(Paths.get("src", "test", "resources", "HanoiTower_instances", instance + ".asp").toString());
		ParsedProgram parsedProgram = parseVisit(programInputStream);
		parsedProgram.accumulate(parseVisit(instanceInputStream));
		NaiveGrounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);
		Optional<AnswerSet> answerSet = solver.stream().findFirst();
		System.out.println(answerSet);
		// TODO: check correctness of answer set
	}

}
