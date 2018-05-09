/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ public class ASTWildMatch extends ASTJessRule implements PatternProducingNode {
/*  6 */   public ASTWildMatch(int paramInt) { super(paramInt);jdMethod_this(); }
/*    */   
/*    */   private String previousFact;
/*    */   private String previousMatchTest;
/* 10 */   public ASTWildMatch(NLU paramNLU, int paramInt) { super(paramNLU, paramInt);jdMethod_this();
/*    */   }
/*    */   
/* 13 */   private final void jdMethod_this() { this.previousFact = null;
/* 14 */     this.previousMatchTest = null;
/*    */   }
/*    */   
/*    */   public void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException {
/* 18 */     String str = dumpTokens();
/* 19 */     if (str.equals("*")) {
/* 20 */       if (this.previousFact == null)
/*    */       {
/*    */ 
/* 23 */         paramBufferedWriter.write("(definerule starmatch " + NLU.salience + " \" (declare (salience " + NLU.salience + ")) (initial-fact) => (assert(splat 1 any))\")\n\n");
/*    */       }
/*    */       else {
/* 26 */         StringBuffer localStringBuffer = new StringBuffer();
/* 27 */         localStringBuffer.append("(definerule starmatch" + this.previousFact + ' ' + NLU.salience + ' ');
/* 28 */         localStringBuffer.append(" \" (declare (salience " + NLU.salience + ")) ");
/* 29 */         localStringBuffer.append(this.previousMatchTest);
/* 30 */         localStringBuffer.append(" => (assert(splat (MyPlus ?endpos 1) any))\")\n\n");
/* 31 */         paramBufferedWriter.write(localStringBuffer.toString());
/*    */       }
/* 33 */       this.patternHead = "splat";
/* 34 */       this.ruleName = ("starmatch" + this.previousFact);
/*    */     }
/*    */     else
/*    */     {
/* 38 */       if (this.previousFact == null)
/*    */       {
/* 40 */         paramBufferedWriter.write("(definerule qmarkmatch " + NLU.salience + " \" (declare (salience " + NLU.salience + ")) (SENTENCE $?sentence) => (if(neq (length$ $?sentence) 0) then (assert(word-wildcard 1 1)))\")\n\n");
/*    */ 
/*    */ 
/*    */       }
/*    */       else
/*    */       {
/*    */ 
/* 47 */         paramBufferedWriter.write("(definerule qmarkmatch" + this.previousFact + ' ' + NLU.salience + " \" (declare (salience " + NLU.salience + ")) " + this.previousMatchTest + " (SENTENCE ?sentence)  => (bind ?result (call ?mysearch IsThereWord ?sentence (MyPlus ?endpos 1))) (if(neq ?result -1) then (assert(word-wildcard (MyPlus ?endpos 1) (MyPlus ?endpos 1))))\")\n\n");
/*    */       }
/* 49 */       this.ruleName = ("qmarkmatch" + this.previousFact);
/* 50 */       this.patternHead = "word-wildcard";
/*    */     }
/*    */   }
/*    */   
/*    */   void setPreviousMatchTest(String paramString1, String paramString2)
/*    */   {
/* 56 */     this.previousFact = paramString1;
/* 57 */     this.previousMatchTest = paramString2;
/*    */   }
/*    */   
/* 60 */   public boolean isRegexp() { return true; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTWildMatch.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */