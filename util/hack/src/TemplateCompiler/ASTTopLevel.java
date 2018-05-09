/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ public class ASTTopLevel extends ASTJessRule {
/*    */   public ASTTopLevel(int paramInt) {
/*  7 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTTopLevel(NLU paramNLU, int paramInt) {
/* 11 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException
/*    */   {
/* 16 */     for (int i = 0; i < this.children.length; i++) {
/* 17 */       ASTStart localASTStart = (ASTStart)this.children[i];
/*    */       
/* 19 */       if (localASTStart != null) {
/* 20 */         localASTStart.compileToJess(paramBufferedWriter);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTopLevel.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */