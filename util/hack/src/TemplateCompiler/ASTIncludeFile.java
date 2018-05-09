/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ public class ASTIncludeFile extends ASTJessRule
/*    */ {
/*    */   public ASTIncludeFile(int paramInt) {
/*  8 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTIncludeFile(NLU paramNLU, int paramInt) {
/* 12 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   String getfile() {
/* 16 */     StringTokenizer localStringTokenizer = new StringTokenizer(dumpTokens());
/* 17 */     localStringTokenizer.nextToken();
/* 18 */     return localStringTokenizer.nextToken();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTIncludeFile.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */