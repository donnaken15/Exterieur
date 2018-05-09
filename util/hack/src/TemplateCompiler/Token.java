/*    */ package TemplateCompiler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Token
/*    */ {
/*    */   public int kind;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int beginLine;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int beginColumn;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int endLine;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int endColumn;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String image;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Token next;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Token specialToken;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public final String toString()
/*    */   {
/* 56 */     return this.image;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final Token newToken(int paramInt)
/*    */   {
/* 74 */     switch (paramInt) {
/*    */     }
/* 76 */     return new Token();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\Token.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */