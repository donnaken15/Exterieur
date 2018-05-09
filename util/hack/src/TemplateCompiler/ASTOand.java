/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ class ASTOand extends ASTJessRule implements NLUTreeConstants, PatternProducingNode
/*     */ {
/*     */   ASTOand(int paramInt)
/*     */   {
/*   9 */     super(paramInt);
/*     */   }
/*     */   
/*     */   ASTOand(NLU paramNLU, int paramInt) {
/*  13 */     super(paramNLU, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void checkVariableBindings()
/*     */     throws CompileException
/*     */   {
/*  53 */     for (int i = 0; i < jjtGetNumChildren(); i++) {
/*  54 */       ASTTemplate localASTTemplate = (ASTTemplate)jjtGetChild(i);
/*  55 */       if (localASTTemplate.getChildNodeID() == 18) {
/*  56 */         throw new CompileException("Line " + getFirstLineNumber() + ": A known compiler bug incorrectly handles nested opt expressions within tand expressions. Such nesting is currently disallowed.");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException
/*     */   {
/*  63 */     checkVariableBindings();
/*  64 */     StringBuffer localStringBuffer1 = new StringBuffer(100);
/*  65 */     StringBuffer localStringBuffer2 = new StringBuffer(100);
/*  66 */     localStringBuffer1.append("(min");
/*  67 */     localStringBuffer2.append("(max");
/*     */     
/*     */ 
/*  70 */     StringBuffer localStringBuffer3 = new StringBuffer(100);
/*  71 */     StringBuffer localStringBuffer4 = new StringBuffer(100);
/*     */     
/*  73 */     String str = getID(dumpTokens());
/*  74 */     localStringBuffer3.append("(definerule occursandtest" + str + ' ' + NLU.salience + ' ');
/*  75 */     localStringBuffer3.append(" \" (declare (salience " + NLU.salience + ")) ");
/*     */     
/*     */ 
/*  78 */     for (int i = 0; i < this.children.length; i++) {
/*  79 */       ASTTemplate localASTTemplate = (ASTTemplate)this.children[i];
/*  80 */       if (localASTTemplate != null)
/*     */       {
/*     */ 
/*     */ 
/*  84 */         localStringBuffer4.append(localASTTemplate.getPatternToMatch(i + 1));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         localStringBuffer1.append(" ?startpos");
/* 108 */         localStringBuffer1.append(Integer.toString(i + 1));
/* 109 */         localStringBuffer2.append(" ?endpos");
/* 110 */         localStringBuffer2.append(Integer.toString(i + 1));
/*     */       }
/*     */     }
/*     */     
/* 114 */     localStringBuffer3.append(localStringBuffer4.toString() + " => ");
/*     */     
/* 116 */     this.patternHead = ("occurs-and" + str);
/* 117 */     this.ruleName = ("occursandtest" + str);
/* 118 */     localStringBuffer1.append(")");
/* 119 */     localStringBuffer2.append(")");
/*     */     
/*     */ 
/* 122 */     localStringBuffer3.append("(assert(occurs-and" + str + ' ' + localStringBuffer1.toString() + ' ' + localStringBuffer2.toString());
/* 123 */     Iterator localIterator = getPatternBindingVariablesCanonical().iterator();
/* 124 */     while (localIterator.hasNext())
/* 125 */       localStringBuffer3.append(" " + localIterator.next());
/* 126 */     localStringBuffer3.append("))\")\n\n");
/* 127 */     paramBufferedWriter.write(localStringBuffer3.toString());
/*     */   }
/*     */   
/*     */   boolean isRegexp() {
/* 131 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTOand.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */