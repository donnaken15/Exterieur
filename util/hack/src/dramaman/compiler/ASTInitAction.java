/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTInitAction
/*    */   extends BeatAction {
/*  7 */   public ASTInitAction(int paramInt) { super(paramInt); }
/*    */   
/*  9 */   public ASTInitAction(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/* 11 */   String initActionName(String paramString) { return "_" + paramString + "_initAction"; }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 15 */     return super.compileToJava(initActionName(paramString));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTInitAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */