/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ class ASTRHside
/*    */   extends ASTJessRule
/*    */ {
/*    */   ASTRHside(int paramInt)
/*    */   {
/* 11 */     super(paramInt);
/*    */   }
/*    */   
/*    */   ASTRHside(NLU paramNLU, int paramInt) {
/* 15 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   void compileToJess(StringWriter paramStringWriter) throws IOException
/*    */   {
/* 20 */     String str = dumpTokens();
/* 21 */     int i = 1;
/* 22 */     paramStringWriter.write("\n(");
/* 23 */     if (str.indexOf("(", 2) > 0) {
/* 24 */       paramStringWriter.write(str.substring(2, str.indexOf("(", 2) - 1));
/*    */     } else
/* 26 */       paramStringWriter.write(str.substring(2, str.indexOf(")", 2) - 1));
/* 27 */     if (this.children != null) {
/* 28 */       for (int j = 0; j < this.children.length; j++) {
/* 29 */         ASTRHside localASTRHside = (ASTRHside)this.children[j];
/* 30 */         if (localASTRHside != null) {
/* 31 */           localASTRHside.compileToJess(paramStringWriter);
/*    */         }
/*    */       }
/*    */     }
/* 35 */     paramStringWriter.write(")");
/* 36 */     paramStringWriter.flush();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTRHside.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */