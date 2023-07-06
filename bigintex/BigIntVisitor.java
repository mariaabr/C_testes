// Generated from BigInt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BigIntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BigIntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BigIntParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BigIntParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(BigIntParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(BigIntParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BigIntParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(BigIntParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BigIntParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnario(BigIntParser.UnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(BigIntParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BigIntParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(BigIntParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(BigIntParser.ModuloContext ctx);
}