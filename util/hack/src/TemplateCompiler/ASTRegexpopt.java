/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTRegexpopt extends ASTJessRule implements NLUTreeConstants, PatternProducingNode {
/*  6 */   ASTRegexpopt(int paramInt) { super(paramInt); }
/*    */   
/*    */   ASTRegexpopt(NLU paramNLU, int paramInt)
/*    */   {
/* 10 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException
/*    */   {
/* 15 */     ASTTemplate localASTTemplate = (ASTTemplate)this.children[0];
/* 16 */     String str = getID(dumpTokens());
/* 17 */     this.ruleName = ("opttest" + str);
/* 18 */     this.patternHead = ("optoc-" + str);
/* 19 */     paramBufferedWriter.write("(definerule opttest" + str + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) " + localASTTemplate.getPatternToMatch(0) + " => (assert" + getPatternToMatch(0) + ")\")\n\n");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   boolean isRegexp()
/*    */   {
/* 29 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTRegexpopt.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */