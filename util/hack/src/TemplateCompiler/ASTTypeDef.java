/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class ASTTypeDef extends ASTRHside
/*    */ {
/*    */   String name;
/*    */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTTypeDef;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public ASTTypeDef(int paramInt) {
/* 11 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTTypeDef(NLU paramNLU, int paramInt) {
/* 15 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public void AddToList()
/*    */     throws ParseException
/*    */   {
/* 21 */     Token localToken = this.firstToken;
/* 22 */     localToken = localToken.next.next;
/* 23 */     this.name = localToken.image;
/*    */     
/* 25 */     Vector localVector = new Vector();
/*    */     
/* 27 */     if (this.children != null) {
/* 28 */       for (int i = 0; i < this.children.length; i++)
/*    */       {
/* 30 */         ASTJessRule localASTJessRule = (ASTJessRule)this.children[i];
/*    */         
/*    */ 
/* 33 */         if (localASTJessRule != null) {
/*    */           Object localObject;
/* 35 */           if (localASTJessRule.toString().equals("TypeDefArg")) {
/* 36 */             localObject = (ASTTypeDefArg)this.children[i];
/* 37 */             localVector.addElement(((ASTTypeDefArg)localObject).extractargs());
/*    */           }
/*    */           else {
/* 40 */             localObject = (ASTTypeDefOr)this.children[i];
/* 41 */             localVector.addElement(((ASTTypeDefOr)localObject).extractargs());
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 46 */     tableOfConsts.put(this.name, localVector);
/*    */   }
/*    */   
/*    */   public void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException
/*    */   {
/* 51 */     if (!$noassert) throw new AssertionError("don't call compileToJess on ASTTypeDef");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTypeDef.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */