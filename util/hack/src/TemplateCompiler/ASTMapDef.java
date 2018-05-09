/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ 
/*    */ public class ASTMapDef extends ASTJessRule {
/*    */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTMapDef;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public ASTMapDef(int paramInt) {
/*  9 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public ASTMapDef(NLU paramNLU, int paramInt) {
/* 13 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   public void AddDef(HashSet paramHashSet) throws CompileException {
/* 17 */     Token localToken = this.firstToken;
/* 18 */     localToken = localToken.next.next;
/* 19 */     String str1 = localToken.image;
/* 20 */     localToken = localToken.next;
/* 21 */     String str2 = localToken.image;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 26 */       Class localClass = Class.forName("facade.characters.wmedef." + str2);
/*    */     }
/*    */     catch (ClassNotFoundException localClassNotFoundException) {
/* 29 */       throw new CompileException(getFirstLineNumber(), localClassNotFoundException.getMessage());
/*    */     }
/* 31 */     paramHashSet.add("(assert (DefMap " + str1 + ' ' + str2 + "))");
/*    */   }
/*    */   
/*    */   public void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException {
/* 35 */     if (!$noassert) throw new AssertionError("Don't call compileToJess on ASTMapDef");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTMapDef.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */