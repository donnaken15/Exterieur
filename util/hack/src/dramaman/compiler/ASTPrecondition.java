/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTPrecondition extends BeatTest
/*    */ {
/*    */   public ASTPrecondition(int paramInt) {
/*  8 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTPrecondition(BeatParser paramBeatParser, int paramInt) {
/* 12 */     super(paramBeatParser, paramInt);
/*    */   }
/*    */   
/*    */ 
/* 16 */   BeatScopeMaintainer getEnclosingBeatScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingBeatScope(); }
/*    */   
/* 18 */   BeatScopeMaintainer getEnclosingScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingScope(); }
/*    */   
/*    */ 
/*    */   String preconditionName(String paramString, int paramInt)
/*    */   {
/* 23 */     return "_" + paramString + "_precondition" + paramInt;
/*    */   }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString, int paramInt)
/*    */     throws CompileException
/*    */   {
/* 29 */     return super.compileToJava(preconditionName(paramString, paramInt));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTPrecondition.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */