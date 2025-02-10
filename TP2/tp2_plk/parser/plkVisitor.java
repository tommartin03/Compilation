package parser;
 // Generated from plk.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link plkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface plkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUn(plkParser.ExpUnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBin(plkParser.ExpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpConst(plkParser.ExpConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInt(plkParser.ExpIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(plkParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(plkParser.ExpIDContext ctx);
}