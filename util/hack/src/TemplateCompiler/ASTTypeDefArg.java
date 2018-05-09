/*    */ package TemplateCompiler;
/*    */ 
/*    */ public class ASTTypeDefArg extends ASTJessRule
/*    */ {
/*    */   public ASTTypeDefArg(int paramInt)
/*    */   {
/*  7 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTTypeDefArg(NLU paramNLU, int paramInt) {
/* 11 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public String extractargs() {
/* 15 */     return dumpTokens();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTypeDefArg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */