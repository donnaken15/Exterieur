/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTSelectAction
/*    */   extends BeatAction
/*    */ {
/*  8 */   public ASTSelectAction(int paramInt) { super(paramInt); }
/*    */   
/* 10 */   public ASTSelectAction(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt); }
/*    */   
/* 12 */   String selectActionName(String paramString) { return "_" + paramString + "_selectAction"; }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString) throws CompileException
/*    */   {
/* 16 */     return super.compileToJava(selectActionName(paramString));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTSelectAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */