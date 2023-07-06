// Generated from TextGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TextGrammarParser}.
 */
public interface TextGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TextGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TextGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TextGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextGrammarParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(TextGrammarParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextGrammarParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(TextGrammarParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TextGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TextGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TextGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TextGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(TextGrammarParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(TextGrammarParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(TextGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(TextGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInput(TextGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInput(TextGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(TextGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(TextGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrim(TextGrammarParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrim(TextGrammarParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replace}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReplace(TextGrammarParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replace}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReplace(TextGrammarParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(TextGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(TextGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TextGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link TextGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TextGrammarParser.LiteralContext ctx);
}