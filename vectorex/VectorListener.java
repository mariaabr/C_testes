// Generated from Vector.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VectorParser}.
 */
public interface VectorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VectorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VectorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(VectorParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(VectorParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(VectorParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(VectorParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(VectorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(VectorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(VectorParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(VectorParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unario}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnario(VectorParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnario(VectorParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escalar}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEscalar(VectorParser.EscalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escalar}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEscalar(VectorParser.EscalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplic}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplic(VectorParser.MultiplicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplic}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplic(VectorParser.MultiplicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VectorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VectorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(VectorParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(VectorParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vector}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVector(VectorParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vector}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVector(VectorParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prodinterno}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterProdinterno(VectorParser.ProdinternoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prodinterno}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitProdinterno(VectorParser.ProdinternoContext ctx);
}