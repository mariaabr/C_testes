// Generated from ComplexNumber.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComplexNumberParser}.
 */
public interface ComplexNumberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComplexNumberParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ComplexNumberParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexNumberParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ComplexNumberParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexNumberParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(ComplexNumberParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexNumberParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(ComplexNumberParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexNumberParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(ComplexNumberParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexNumberParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(ComplexNumberParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexNumberParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ComplexNumberParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexNumberParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ComplexNumberParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(ComplexNumberParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(ComplexNumberParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInput(ComplexNumberParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInput(ComplexNumberParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ComplexNumberParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ComplexNumberParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unario}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnario(ComplexNumberParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnario(ComplexNumberParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complex}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComplex(ComplexNumberParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complex}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComplex(ComplexNumberParser.ComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(ComplexNumberParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(ComplexNumberParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ComplexNumberParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ComplexNumberParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(ComplexNumberParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(ComplexNumberParser.AddsubContext ctx);
}