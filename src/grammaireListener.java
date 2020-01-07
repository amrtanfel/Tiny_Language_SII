// Generated from E:/compil2/src\grammaire.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammaireParser}.
 */
public interface grammaireListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammaireParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammaireParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(grammaireParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(grammaireParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(grammaireParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(grammaireParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammaireParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammaireParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#list_idfdec}.
	 * @param ctx the parse tree
	 */
	void enterList_idfdec(grammaireParser.List_idfdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#list_idfdec}.
	 * @param ctx the parse tree
	 */
	void exitList_idfdec(grammaireParser.List_idfdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#list_idfInst}.
	 * @param ctx the parse tree
	 */
	void enterList_idfInst(grammaireParser.List_idfInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#list_idfInst}.
	 * @param ctx the parse tree
	 */
	void exitList_idfInst(grammaireParser.List_idfInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#list_inst}.
	 * @param ctx the parse tree
	 */
	void enterList_inst(grammaireParser.List_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#list_inst}.
	 * @param ctx the parse tree
	 */
	void exitList_inst(grammaireParser.List_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(grammaireParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(grammaireParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#lecture}.
	 * @param ctx the parse tree
	 */
	void enterLecture(grammaireParser.LectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#lecture}.
	 * @param ctx the parse tree
	 */
	void exitLecture(grammaireParser.LectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void enterEcriture(grammaireParser.EcritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void exitEcriture(grammaireParser.EcritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#affich}.
	 * @param ctx the parse tree
	 */
	void enterAffich(grammaireParser.AffichContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#affich}.
	 * @param ctx the parse tree
	 */
	void exitAffich(grammaireParser.AffichContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(grammaireParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(grammaireParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(grammaireParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(grammaireParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#exp_ar}.
	 * @param ctx the parse tree
	 */
	void enterExp_ar(grammaireParser.Exp_arContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#exp_ar}.
	 * @param ctx the parse tree
	 */
	void exitExp_ar(grammaireParser.Exp_arContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(grammaireParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(grammaireParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(grammaireParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(grammaireParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(grammaireParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(grammaireParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(grammaireParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(grammaireParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(grammaireParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(grammaireParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#cnd}.
	 * @param ctx the parse tree
	 */
	void enterCnd(grammaireParser.CndContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#cnd}.
	 * @param ctx the parse tree
	 */
	void exitCnd(grammaireParser.CndContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(grammaireParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(grammaireParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(grammaireParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(grammaireParser.CondContext ctx);
}