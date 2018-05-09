/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class ASTTypeDefOr extends ASTJessRule
/*    */ {
/*    */   public ASTTypeDefOr(int paramInt)
/*    */   {
/*  9 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTTypeDefOr(NLU paramNLU, int paramInt) {
/* 13 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public Vector extractargs() {
/* 17 */     Vector localVector = new Vector();
/*    */     
/* 19 */     for (int i = 0; i < this.children.length; i++) {
/* 20 */       ASTTypeDefArg localASTTypeDefArg = (ASTTypeDefArg)this.children[i];
/* 21 */       if (localASTTypeDefArg != null) {
/* 22 */         localVector.addElement(localASTTypeDefArg.extractargs());
/*    */       }
/*    */     }
/*    */     
/* 26 */     return localVector;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTypeDefOr.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */