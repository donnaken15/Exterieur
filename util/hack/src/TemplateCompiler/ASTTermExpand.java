/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTTermExpand extends ASTJessRule implements PatternProducingNode {
/*    */   private String word;
/*    */   
/*    */   ASTTermExpand(int paramInt) {
/*  9 */     super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   ASTTermExpand(NLU paramNLU, int paramInt) {
/* 13 */     super(paramNLU, paramInt);jdMethod_this();
/*    */   }
/*    */   
/* 16 */   private final void jdMethod_this() { this.word = ""; }
/*    */   
/*    */ 
/*    */ 
/*    */   void compileToJess(BufferedWriter paramBufferedWriter)
/*    */     throws java.io.IOException, CompileException
/*    */   {
/* 23 */     int i = 0;
/* 24 */     this.word = dumpTokens();
/* 25 */     int j = this.word.indexOf(":");
/*    */     
/* 27 */     String str1 = this.word.substring(j + 1, this.word.length() - 2);
/* 28 */     this.word = this.word.substring(2, j - 1);
/*    */     
/* 30 */     if ((str1.equals("N")) || (str1.equals("n"))) {
/* 31 */       i = 0;
/* 32 */     } else if ((str1.equals("V")) || (str1.equals("v"))) {
/* 33 */       i = 1;
/* 34 */     } else if ((str1.equals("ADJ")) || (str1.equals("adj"))) {
/* 35 */       i = 2;
/* 36 */     } else if ((str1.equals("ADV")) || (str1.equals("adv"))) {
/* 37 */       i = 3;
/*    */     } else {
/* 39 */       throw new CompileException("Illegal part of speech in term expansion " + dumpTokens());
/*    */     }
/* 41 */     String str2 = getID(this.word);
/* 42 */     this.ruleName = ("termexptest" + str2);
/* 43 */     this.patternHead = ("to-" + this.word);
/*    */     
/* 45 */     WordNet.BuildSynsetHashtable(this.word, i);
/*    */     
/*    */ 
/* 48 */     paramBufferedWriter.write("(definerule termexptest" + str2 + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) (SENTENCE ?sentence) => (bind $?result (call ?mysearch TermExpander ?sentence " + this.word + ' ' + i + ")) (foreach ?x $?result (if (not(eq* ?x nil)) then (assert(to-" + this.word + " ?x ?x))))\")\n\n");
/*    */   }
/*    */   
/* 51 */   boolean isRegexp() { return true; }
/*    */   
/*    */   public java.util.HashSet getPatternBindingVariables()
/*    */   {
/* 55 */     return new java.util.HashSet();
/*    */   }
/*    */   
/* 58 */   public java.util.List getPatternBindingVariablesCanonical() { return new java.util.ArrayList(); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTermExpand.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */