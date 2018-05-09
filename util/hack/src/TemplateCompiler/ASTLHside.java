/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class ASTLHside extends ASTRHside
/*    */ {
/*    */   public ASTLHside(int paramInt)
/*    */   {
/*  9 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTLHside(NLU paramNLU, int paramInt) {
/* 13 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public void compileToJess(StringWriter paramStringWriter)
/*    */     throws java.io.IOException
/*    */   {
/* 19 */     paramStringWriter.write(dumpTokens() + ' ');
/*    */   }
/*    */   
/*    */   public void typeCheck(java.util.HashSet paramHashSet) throws CompileException {
/* 23 */     super.typeCheck(paramHashSet);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTLHside.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */