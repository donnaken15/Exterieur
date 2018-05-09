/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTOsingle extends ASTJessRule implements NLUTreeConstants, PatternProducingNode {
/*  6 */   ASTOsingle(int paramInt) { super(paramInt); }
/*    */   
/*    */   ASTOsingle(NLU paramNLU, int paramInt)
/*    */   {
/* 10 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException
/*    */   {
/* 15 */     ASTTemplate localASTTemplate = (ASTTemplate)this.children[0];
/* 16 */     if ((!$noassert) && (localASTTemplate == null)) { throw new AssertionError();
/*    */     }
/* 18 */     String str = getID(dumpTokens());
/*    */     
/* 20 */     this.ruleName = ("occurssingletest" + str);
/* 21 */     this.patternHead = ("occurs-single" + str);
/*    */     
/* 23 */     paramBufferedWriter.write("(definerule occurssingletest" + str + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) " + localASTTemplate.getPatternToMatch(0) + " => (assert" + getPatternToMatch(0) + ")\")\n\n");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTOsingle;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */ 
/*    */   boolean isRegexp()
/*    */   {
/* 34 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTOsingle.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */