// Generated from morphinity.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link morphinityParser}.
 */
public interface morphinityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link morphinityParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(morphinityParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(morphinityParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(morphinityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(morphinityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(morphinityParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(morphinityParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(morphinityParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(morphinityParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(morphinityParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(morphinityParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(morphinityParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(morphinityParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(morphinityParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(morphinityParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(morphinityParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(morphinityParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(morphinityParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(morphinityParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(morphinityParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(morphinityParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link morphinityParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(morphinityParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link morphinityParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(morphinityParser.SpaceContext ctx);
}