// Generated from BigInt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigIntParser}.
 */
public interface BigIntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigIntParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BigIntParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BigIntParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(BigIntParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(BigIntParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(BigIntParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(BigIntParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BigIntParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BigIntParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(BigIntParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(BigIntParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BigIntParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BigIntParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unario}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnario(BigIntParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnario(BigIntParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(BigIntParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(BigIntParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BigIntParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BigIntParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(BigIntParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(BigIntParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModulo(BigIntParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModulo(BigIntParser.ModuloContext ctx);
}