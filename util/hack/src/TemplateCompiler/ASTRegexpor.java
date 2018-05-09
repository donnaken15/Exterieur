/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTRegexpor extends ASTJessRule implements NLUTreeConstants, PatternProducingNode {
/*    */   ASTRegexpor(int paramInt) {
/*  7 */     super(paramInt);
/*    */   }
/*    */   
/*    */   ASTRegexpor(NLU paramNLU, int paramInt) {
/* 11 */     super(paramNLU, paramInt);
/*    */   }
/*    */   
/*    */   private final void checkVariableBindings()
/*    */     throws CompileException
/*    */   {
/* 17 */     java.util.HashSet localHashSet = ((ASTTemplate)jjtGetChild(0)).getPatternBindingVariables();
/* 18 */     for (int i = 1; i < jjtGetNumChildren(); i++) {
/* 19 */       if (!localHashSet.equals(((ASTTemplate)jjtGetChild(i)).getPatternBindingVariables()))
/* 20 */         throw new CompileException("Line " + getFirstLineNumber() + ": Variable bindings introduced by positional facts must be equal across all branches of the regexp-or");
/*    */     }
/*    */   }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/* 25 */     String str1 = getID(dumpTokens());
/* 26 */     this.patternHead = ("po-" + str1);
/*    */     
/*    */ 
/* 29 */     checkVariableBindings();
/*    */     
/* 31 */     for (int i = 0; i < this.children.length; i++)
/*    */     {
/*    */ 
/* 34 */       ASTTemplate localASTTemplate = (ASTTemplate)this.children[i];
/* 35 */       if (localASTTemplate != null)
/*    */       {
/* 37 */         String str2 = getID(localASTTemplate.dumpTokens() + " ortest" + str1);
/* 38 */         paramBufferedWriter.write("(definerule ortest" + str2 + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) " + localASTTemplate.getPatternToMatch(0) + " => (assert" + getPatternToMatch(0) + ")\")\n\n");
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 47 */         this.ruleName = (this.ruleName + "ortest" + str2 + ' ');
/*    */       }
/*    */     }
/*    */   }
/*    */   
/* 52 */   boolean isRegexp() { return true; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTRegexpor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */