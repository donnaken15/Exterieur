/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTAbortAction extends BeatAction {
/*  6 */   public ASTAbortAction(int paramInt) { super(paramInt); }
/*    */   
/*  8 */   public ASTAbortAction(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/* 10 */   String abortActionName(String paramString) { return "_" + paramString + "_abortAction"; }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 14 */     return super.compileToJava(abortActionName(paramString));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTAbortAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */