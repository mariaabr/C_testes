// Generated from ComplexNumber.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComplexNumberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComplexNumberVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComplexNumberParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ComplexNumberParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexNumberParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(ComplexNumberParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexNumberParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(ComplexNumberParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexNumberParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ComplexNumberParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(ComplexNumberParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ComplexNumberParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ComplexNumberParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnario(ComplexNumberParser.UnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complex}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(ComplexNumberParser.ComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(ComplexNumberParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ComplexNumberParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ComplexNumberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(ComplexNumberParser.AddsubContext ctx);
}