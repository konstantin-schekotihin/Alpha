package at.ac.tuwien.kr.alpha.solver;

import at.ac.tuwien.kr.alpha.common.AnswerSet;
import at.ac.tuwien.kr.alpha.common.BasicAnswerSet;
import at.ac.tuwien.kr.alpha.common.Predicate;
import at.ac.tuwien.kr.alpha.grounder.ChoiceGrounder;
import at.ac.tuwien.kr.alpha.grounder.DummyGrounder;
import at.ac.tuwien.kr.alpha.grounder.Grounder;
import at.ac.tuwien.kr.alpha.grounder.NaiveGrounder;
import at.ac.tuwien.kr.alpha.grounder.parser.ParsedProgram;
import ch.qos.logback.classic.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static at.ac.tuwien.kr.alpha.Main.parseVisit;
import static at.ac.tuwien.kr.alpha.MainTest.stream;
import static org.junit.Assert.assertEquals;

public abstract class AbstractSolverTest {
	private static BasicAnswerSet.Builder base() {
		return new BasicAnswerSet.Builder()
			.predicate("dom").instance("1").instance("2").instance("3");
	}

	/**
	 * Sets the logging level to TRACE. Useful for debugging; call at beginning of test case.
	 */
	private static void enableTracing() {
		Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(ch.qos.logback.classic.Level.TRACE);
	}

	protected abstract Solver getInstance(Grounder grounder, java.util.function.Predicate<Predicate> filter);

	private Solver getInstance(Grounder grounder) {
		return getInstance(grounder, p -> true);
	}

	@Test
	public void testFactsOnlyProgram() throws IOException {
		String testProgram = "p(a). p(b). foo(13). foo(16). q(a). q(c).";
		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		Grounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);

		List<AnswerSet> answerSets = solver.collectList();

		assertEquals(1, answerSets.size());

		AnswerSet expected = new BasicAnswerSet.Builder()
			.predicate("q").instance("a").instance("c")
			.predicate("p").instance("a").instance("b")
			.predicate("foo").instance("13").instance("16")
			.build();

		assertEquals(expected, answerSets.get(0));
	}

	@Test
	public void testSimpleRule() throws Exception {
		String testProgram = "p(a). p(b). r(X) :- p(X).";
		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		Grounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);

		List<AnswerSet> answerSets = solver.collectList();

		AnswerSet expected = new BasicAnswerSet.Builder()
			.predicate("p").instance("a").instance("b")
			.predicate("r").instance("a").instance("b")
			.build();

		assertEquals(1, answerSets.size());
		assertEquals(expected, answerSets.get(0));
	}

	@Test
	public void testSimpleRuleWithGroundPart() throws Exception {
		String testProgram =
			"p(1)." +
				"p(2)." +
				"q(X) :-  p(X), p(1).";
		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		Grounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);

		List<AnswerSet> answerSets = solver.collectList();

		assertEquals(1, answerSets.size());
		AnswerSet expected = new BasicAnswerSet.Builder()
			.predicate("q").instance("1").instance("2")
			.predicate("p").instance("1").instance("2")
			.build();

		assertEquals(expected, answerSets.get(0));
	}

	@Test
	public void testProgramZeroArityPredicates() throws Exception {
		String testProgram = "a. p(X) :- b, r(X).";
		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		Grounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);

		List<AnswerSet> answerSets = solver.collectList();

		assertEquals(1, answerSets.size());

		AnswerSet expected = new BasicAnswerSet.Builder()
			.predicate("a")
			.build();

		assertEquals(expected, answerSets.get(0));
	}

	@Test
	public void testGuessingGroundProgram() throws Exception {
		Solver solver = getInstance(new NaiveGrounder(parseVisit(stream("a :- not b. b :- not a."))));

		Set<AnswerSet> expected = new HashSet<>(Arrays.asList(
			new BasicAnswerSet.Builder().predicate("a").build(),
			new BasicAnswerSet.Builder().predicate("b").build()
		));

		assertEquals(expected, solver.collectSet());
	}

	@Test
	public void testGuessingProgramNonGround() throws Exception {
		String testProgram = "dom(1). dom(2). dom(3)." +
			"p(X) :- dom(X), not q(X)." +
			"q(X) :- dom(X), not p(X).";
		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		NaiveGrounder grounder = new NaiveGrounder(parsedProgram);
		Solver solver = getInstance(grounder);

		List<AnswerSet> expected = Arrays.asList(
			base()
				.predicate("q").instance("1").instance("2")
				.predicate("p").instance("3")
				.build(),
			base()
				.predicate("q").instance("1")
				.predicate("p").instance("2").instance("3")
				.build(),
			base()
				.predicate("q").instance("2")
				.predicate("p").instance("1").instance("3")
				.build(),
			base()
				.predicate("p").instance("1").instance("2").instance("3")
				.build(),
			base()
				.predicate("q").instance("1").instance("2").instance("3")
				.build(),
			base()
				.predicate("q").instance("1").instance("3")
				.predicate("p").instance("2")
				.build(),
			base()
				.predicate("q").instance("2").instance("3")
				.predicate("p").instance("1")
				.build(),
			base()
				.predicate("q").instance("3")
				.predicate("p").instance("1").instance("2")
				.build()
		);

		assertEquals(expected, solver.collectList());
	}

	@Test
	public void dummyGrounder() {
		assertEquals(DummyGrounder.EXPECTED, getInstance(new DummyGrounder()).collectSet());
	}

	@Test
	public void choiceGrounder() {
		assertEquals(ChoiceGrounder.EXPECTED, getInstance(new ChoiceGrounder()).collectSet());
	}

	@Test
	public void guessingProgram3Way() throws IOException {
		String testProgram = "a :- not b, not c." +
			"b :- not a, not c." +
			"c :- not a, not b.";

		ParsedProgram parsedProgram = parseVisit(stream(testProgram));
		NaiveGrounder grounder = new NaiveGrounder(parsedProgram);

		Solver solver = getInstance(grounder);

		Set<AnswerSet> expected = new HashSet<>(Arrays.asList(
			new BasicAnswerSet.Builder()
				.predicate("a")
				.build(),
			new BasicAnswerSet.Builder()
				.predicate("b")
				.build(),
			new BasicAnswerSet.Builder()
				.predicate("c")
				.build()
		));

		Set<AnswerSet> answerSets = solver.collectSet();
		assertEquals(expected, answerSets);
	}

	@Test
	public void emptyProgramYieldsEmptyAnswerSet() throws IOException {
		ParsedProgram parsedProgram = parseVisit(stream(""));
		NaiveGrounder grounder = new NaiveGrounder(parsedProgram);

		List<AnswerSet> answerSets = getInstance(grounder).collectList();
		assertEquals(1, answerSets.size());
		assertEquals(BasicAnswerSet.EMPTY, answerSets.get(0));
	}
}