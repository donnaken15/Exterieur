/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTOor extends ASTJessRule implements NLUTreeConstants, PatternProducingNode
/*    */ {
/*    */   ASTOor(int paramInt) {
/*  8 */     super(paramInt);
/*    */   }
/*    */   
/*    */   ASTOor(NLU paramNLU, int paramInt) {
/* 12 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   private final void checkVariableBindings()
/*    */     throws CompileException
/*    */   {
/* 18 */     java.util.HashSet localHashSet = ((ASTTemplate)jjtGetChild(0)).getPatternBindingVariables();
/* 19 */     for (int i = 1; i < jjtGetNumChildren(); i++) {
/* 20 */       if (!localHashSet.equals(((ASTTemplate)jjtGetChild(i)).getPatternBindingVariables()))
/* 21 */         throw new CompileException(getFirstLineNumber() + " Variable bindings introduced by positional facts must be equal across all branches of the occurs-or");
/*    */     }
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/* 26 */     checkVariableBindings();
/*    */     
/* 28 */     String str1 = getID(dumpTokens());
/* 29 */     this.patternHead = ("occurs-or" + str1);
/* 30 */     for (int i = 0; i < this.children.length; i++) {
/* 31 */       ASTTemplate localASTTemplate = (ASTTemplate)this.children[i];
/* 32 */       if (localASTTemplate != null)
/*    */       {
/* 34 */         String str2 = getID(localASTTemplate.dumpTokens() + " occurs-or" + str1);
/*    */         
/* 36 */         paramBufferedWriter.write("(definerule occursortest" + str2 + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) " + localASTTemplate.getPatternToMatch(0) + " => (assert" + getPatternToMatch(0) + ")\")\n\n");
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 46 */         this.ruleName = (this.ruleName + "occursortest" + str2 + ' ');
/*    */       }
/*    */     }
/*    */   }
/*    */   
/* 51 */   boolean isRegexp() { return false; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTOor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */