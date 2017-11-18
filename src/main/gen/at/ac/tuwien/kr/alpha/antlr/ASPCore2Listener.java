// Generated from C:/projects/Alpha/src/main/antlr/at/ac/tuwien/kr/alpha/antlr\ASPCore2.g4 by ANTLR 4.7
package at.ac.tuwien.kr.alpha.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASPCore2Parser}.
 */
public interface ASPCore2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ASPCore2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ASPCore2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ASPCore2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ASPCore2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ASPCore2Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ASPCore2Parser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_fact}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_fact(ASPCore2Parser.Statement_factContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_fact}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_fact(ASPCore2Parser.Statement_factContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_constraint}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_constraint}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_rule}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_rule(ASPCore2Parser.Statement_ruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_rule}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_rule(ASPCore2Parser.Statement_ruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_weightConstraint}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_weightConstraint(ASPCore2Parser.Statement_weightConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_weightConstraint}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_weightConstraint(ASPCore2Parser.Statement_weightConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_gringoSharp}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_gringoSharp(ASPCore2Parser.Statement_gringoSharpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_gringoSharp}
	 * labeled alternative in {@link ASPCore2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_gringoSharp(ASPCore2Parser.Statement_gringoSharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(ASPCore2Parser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(ASPCore2Parser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ASPCore2Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ASPCore2Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ASPCore2Parser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ASPCore2Parser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(ASPCore2Parser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(ASPCore2Parser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void enterChoice_elements(ASPCore2Parser.Choice_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void exitChoice_elements(ASPCore2Parser.Choice_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#choice_element}.
	 * @param ctx the parse tree
	 */
	void enterChoice_element(ASPCore2Parser.Choice_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#choice_element}.
	 * @param ctx the parse tree
	 */
	void exitChoice_element(ASPCore2Parser.Choice_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#heuristic}.
	 * @param ctx the parse tree
	 */
	void enterHeuristic(ASPCore2Parser.HeuristicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#heuristic}.
	 * @param ctx the parse tree
	 */
	void exitHeuristic(ASPCore2Parser.HeuristicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(ASPCore2Parser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(ASPCore2Parser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_elements(ASPCore2Parser.Aggregate_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_elements(ASPCore2Parser.Aggregate_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_element(ASPCore2Parser.Aggregate_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_element(ASPCore2Parser.Aggregate_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(ASPCore2Parser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(ASPCore2Parser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void enterWeight_at_level(ASPCore2Parser.Weight_at_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void exitWeight_at_level(ASPCore2Parser.Weight_at_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literals(ASPCore2Parser.Naf_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literals(ASPCore2Parser.Naf_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literal(ASPCore2Parser.Naf_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literal(ASPCore2Parser.Naf_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void enterClassical_literal(ASPCore2Parser.Classical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void exitClassical_literal(ASPCore2Parser.Classical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_atom(ASPCore2Parser.Builtin_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_atom(ASPCore2Parser.Builtin_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(ASPCore2Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(ASPCore2Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(ASPCore2Parser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(ASPCore2Parser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_number}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_number(ASPCore2Parser.Term_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_number}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_number(ASPCore2Parser.Term_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_anonymousVariable}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_anonymousVariable(ASPCore2Parser.Term_anonymousVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_anonymousVariable}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_anonymousVariable(ASPCore2Parser.Term_anonymousVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_variable}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_variable(ASPCore2Parser.Term_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_variable}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_variable(ASPCore2Parser.Term_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_minusTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_minusTerm(ASPCore2Parser.Term_minusTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_minusTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_minusTerm(ASPCore2Parser.Term_minusTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_binopTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_binopTerm(ASPCore2Parser.Term_binopTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_binopTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_binopTerm(ASPCore2Parser.Term_binopTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_const}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_const(ASPCore2Parser.Term_constContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_const}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_const(ASPCore2Parser.Term_constContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_func}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_func(ASPCore2Parser.Term_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_func}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_func(ASPCore2Parser.Term_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_string}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_string(ASPCore2Parser.Term_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_string}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_string(ASPCore2Parser.Term_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_parenthesisedTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_parenthesisedTerm(ASPCore2Parser.Term_parenthesisedTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_parenthesisedTerm}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_parenthesisedTerm(ASPCore2Parser.Term_parenthesisedTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_interval}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_interval(ASPCore2Parser.Term_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_interval}
	 * labeled alternative in {@link ASPCore2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_interval(ASPCore2Parser.Term_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#arithop}.
	 * @param ctx the parse tree
	 */
	void enterArithop(ASPCore2Parser.ArithopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#arithop}.
	 * @param ctx the parse tree
	 */
	void exitArithop(ASPCore2Parser.ArithopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ASPCore2Parser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ASPCore2Parser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#external_atom}.
	 * @param ctx the parse tree
	 */
	void enterExternal_atom(ASPCore2Parser.External_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#external_atom}.
	 * @param ctx the parse tree
	 */
	void exitExternal_atom(ASPCore2Parser.External_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void enterGringo_sharp(ASPCore2Parser.Gringo_sharpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void exitGringo_sharp(ASPCore2Parser.Gringo_sharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void enterBasic_terms(ASPCore2Parser.Basic_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void exitBasic_terms(ASPCore2Parser.Basic_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#basic_term}.
	 * @param ctx the parse tree
	 */
	void enterBasic_term(ASPCore2Parser.Basic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#basic_term}.
	 * @param ctx the parse tree
	 */
	void exitBasic_term(ASPCore2Parser.Basic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#ground_term}.
	 * @param ctx the parse tree
	 */
	void enterGround_term(ASPCore2Parser.Ground_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#ground_term}.
	 * @param ctx the parse tree
	 */
	void exitGround_term(ASPCore2Parser.Ground_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#variable_term}.
	 * @param ctx the parse tree
	 */
	void enterVariable_term(ASPCore2Parser.Variable_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#variable_term}.
	 * @param ctx the parse tree
	 */
	void exitVariable_term(ASPCore2Parser.Variable_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#answer_set}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_set(ASPCore2Parser.Answer_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#answer_set}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_set(ASPCore2Parser.Answer_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPCore2Parser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_sets(ASPCore2Parser.Answer_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPCore2Parser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_sets(ASPCore2Parser.Answer_setsContext ctx);
}