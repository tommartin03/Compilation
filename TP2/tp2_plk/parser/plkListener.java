package parser;
 // Generated from plk.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link plkParser}.
 */
public interface plkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link plkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(plkParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link plkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(plkParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link plkParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(plkParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link plkParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(plkParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link plkParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(plkParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link plkParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(plkParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpUn(plkParser.ExpUnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpUn(plkParser.ExpUnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpBin(plkParser.ExpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpBin(plkParser.ExpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpConst(plkParser.ExpConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpConst(plkParser.ExpConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpInt(plkParser.ExpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpInt(plkParser.ExpIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(plkParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(plkParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expID}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpID(plkParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link plkParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpID(plkParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link plkParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(plkParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link plkParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(plkParser.VarDeclContext ctx);
}