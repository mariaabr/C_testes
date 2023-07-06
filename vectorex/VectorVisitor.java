// Generated from Vector.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VectorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VectorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VectorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(VectorParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(VectorParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(VectorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(VectorParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnario(VectorParser.UnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escalar}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscalar(VectorParser.EscalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplic}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplic(VectorParser.MultiplicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(VectorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(VectorParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vector}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(VectorParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prodinterno}
	 * labeled alternative in {@link VectorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdinterno(VectorParser.ProdinternoContext ctx);
}