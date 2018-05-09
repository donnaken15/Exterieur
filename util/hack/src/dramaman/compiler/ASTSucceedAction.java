/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTSucceedAction extends BeatAction {
/*  6 */   public ASTSucceedAction(int paramInt) { super(paramInt); }
/*    */   
/*  8 */   public ASTSucceedAction(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/* 10 */   String succeedActionName(String paramString) { return "_" + paramString + "_succeedAction"; }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 14 */     return super.compileToJava(succeedActionName(paramString));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTSucceedAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */