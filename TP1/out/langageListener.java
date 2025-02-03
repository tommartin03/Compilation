// Generated from langage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langageParser}.
 */
public interface langageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(langageParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(langageParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(langageParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(langageParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(langageParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(langageParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(langageParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(langageParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat(langageParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat(langageParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(langageParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link langageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(langageParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayElement}
	 * labeled alternative in {@link langageParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(langageParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayElement}
	 * labeled alternative in {@link langageParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(langageParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPrint(langageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPrint(langageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRead(langageParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRead(langageParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(langageParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(langageParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(langageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(langageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssign(langageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssign(langageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterConditional(langageParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitConditional(langageParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile(langageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile(langageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code increment}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(langageParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(langageParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(langageParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link langageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(langageParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link langageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(langageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link langageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(langageParser.ProgContext ctx);
}