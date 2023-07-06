// Generated from FracLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(FracLangParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(FracLangParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FracLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FracLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(FracLangParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(FracLangParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReduce(FracLangParser.ReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReduce(FracLangParser.ReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRead(FracLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRead(FracLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(FracLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(FracLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(FracLangParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(FracLangParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(FracLangParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(FracLangParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(FracLangParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(FracLangParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(FracLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(FracLangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(FracLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(FracLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFraction(FracLangParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFraction(FracLangParser.FractionContext ctx);
}