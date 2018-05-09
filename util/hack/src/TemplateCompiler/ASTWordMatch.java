/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTWordMatch extends ASTJessRule implements PatternProducingNode {
/*    */   ASTWordMatch(int paramInt) {
/*  7 */     super(paramInt);
/*    */   }
/*    */   
/*    */   ASTWordMatch(NLU paramNLU, int paramInt) {
/* 11 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter)
/*    */     throws java.io.IOException
/*    */   {
/* 17 */     String str = dumpTokens();
/*    */     
/* 19 */     str = Preprocessor.replaceAll(str, "(", "\\\\(");
/* 20 */     str = Preprocessor.replaceAll(str, ")", "\\\\)");
/* 21 */     str = Preprocessor.replaceAll(str, ";", "\\\\;");
/* 22 */     this.patternHead = ("wo-" + str);
/* 23 */     this.ruleName = "";
/*    */   }
/*    */   
/* 26 */   boolean isRegexp() { return true; }
/*    */   
/*    */   public java.util.HashSet getPatternBindingVariables()
/*    */   {
/* 30 */     return new java.util.HashSet();
/*    */   }
/*    */   
/* 33 */   public java.util.List getPatternBindingVariablesCanonical() { return new java.util.ArrayList(); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTWordMatch.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */