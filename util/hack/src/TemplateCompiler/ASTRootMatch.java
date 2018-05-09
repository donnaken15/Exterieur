/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ import java.util.HashSet;
/*    */ import wordnet.wn.DictionaryDatabase;
/*    */ import wordnet.wn.POS;
/*    */ 
/*    */ class ASTRootMatch extends ASTJessRule implements PatternProducingNode
/*    */ {
/* 10 */   private static DictionaryDatabase dictionary = new wordnet.wn.FileBackedDictionary("C:\\WN16\\DICT");
/*    */   private String word;
/*    */   
/* 13 */   ASTRootMatch(int paramInt) { super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   ASTRootMatch(NLU paramNLU, int paramInt) {
/* 17 */     super(paramNLU, paramInt);jdMethod_this();
/*    */   }
/*    */   
/* 20 */   private final void jdMethod_this() { this.word = null; }
/*    */   
/*    */ 
/*    */   void compileToJess(BufferedWriter paramBufferedWriter)
/*    */     throws java.io.IOException, CompileException
/*    */   {
/* 26 */     this.word = dumpTokens().substring(2, dumpTokens().indexOf(":") - 1);
/*    */   }
/*    */   
/*    */   public String getRuleName() {
/* 30 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public String getPatternHead()
/*    */   {
/* 36 */     if ((dictionary.lookupIndexWord(POS.NOUN, this.word) == null) && (dictionary.lookupIndexWord(POS.VERB, this.word) == null) && (dictionary.lookupIndexWord(POS.ADJ, this.word) == null))
/*    */     {
/*    */ 
/*    */ 
/* 40 */       System.out.println("Warning: stemming ignored for " + this.word);
/* 41 */       return "wo-" + this.word;
/*    */     }
/*    */     
/* 44 */     return "ro-" + this.word;
/*    */   }
/*    */   
/*    */   public String getPatternToMatch(int paramInt) {
/* 48 */     return null;
/*    */   }
/*    */   
/*    */   public HashSet getPatternBindingVariables() {
/* 52 */     return new HashSet();
/*    */   }
/*    */   
/* 55 */   public java.util.List getPatternBindingVariablesCanonical() { return new java.util.ArrayList(); }
/*    */   
/* 57 */   boolean isRegexp() { return true; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTRootMatch.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */