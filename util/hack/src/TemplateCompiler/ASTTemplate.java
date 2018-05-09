/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ 
/*    */ class ASTTemplate extends ASTStart implements PatternProducingNode { private boolean retraction;
/*    */   
/*  7 */   ASTTemplate(int paramInt) { super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   ASTTemplate(NLU paramNLU, int paramInt) {
/* 11 */     super(paramNLU, paramInt);jdMethod_this();
/*    */   }
/*    */   
/* 14 */   private final void jdMethod_this() { this.retraction = false;
/* 15 */     this.negated = false; }
/*    */   
/* 17 */   void setRetraction(boolean paramBoolean) { this.retraction = paramBoolean; }
/*    */   
/*    */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException
/*    */   {
/* 21 */     if ((!$noassert) && (jjtGetNumChildren() != 1)) throw new AssertionError();
/* 22 */     PatternProducingNode localPatternProducingNode = (PatternProducingNode)this.children[0];
/* 23 */     if (localPatternProducingNode != null)
/*    */     {
/* 25 */       String str1 = this.firstToken.next.image;
/*    */       
/*    */ 
/* 28 */       String str2 = localPatternProducingNode.getPatternHead();
/*    */       
/* 30 */       if (str1.equals("tnot")) {
/* 31 */         this.negated = true;
/* 32 */         this.ruleName = ("nottest" + str2);
/* 33 */         this.patternHead = ("not" + str2);
/* 34 */         paramBufferedWriter.write("(definerule nottest" + str2 + " \" (declare (salience " + NLU.salience + ")) " + NLU.startDependency + "(not" + localPatternProducingNode.getPatternToMatch(-1) + ')' + NLU.endDependency + " => (assert(" + this.patternHead + " any any))\")\n\n");
/*    */ 
/*    */       }
/*    */       else
/*    */       {
/* 39 */         this.ruleName = localPatternProducingNode.getRuleName();
/* 40 */         this.patternHead = str2;
/*    */       }
/*    */     }
/*    */     
/* 44 */     if (this.retraction) {
/* 45 */       addFactsRecursively(this, NLU.retractThese);
/*    */     }
/*    */   }
/*    */   
/*    */   String toStringNodeBelow()
/*    */   {
/* 51 */     ASTJessRule localASTJessRule = (ASTJessRule)this.children[0];
/* 52 */     if (localASTJessRule != null) {
/* 53 */       return localASTJessRule.toString();
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 58 */     return "";
/*    */   }
/*    */   
/*    */   public String getPatternToMatch(int paramInt)
/*    */   {
/* 63 */     return NLU.startDependency + getPatternToMatchNoDependency(paramInt) + NLU.endDependency;
/*    */   }
/*    */   
/*    */   public String getPatternToMatchNoDependency(int paramInt)
/*    */   {
/* 68 */     return ((PatternProducingNode)this.children[0]).getPatternToMatch(paramInt);
/*    */   }
/*    */   
/*    */   boolean isRegexp()
/*    */   {
/* 73 */     ASTJessRule localASTJessRule = (ASTJessRule)this.children[0];
/* 74 */     if ((!$noassert) && (localASTJessRule == null)) throw new AssertionError();
/* 75 */     return localASTJessRule.isRegexp();
/*    */   }
/*    */   
/*    */   void addFactsRecursively(PatternProducingNode paramPatternProducingNode, java.util.HashSet paramHashSet) {
/* 79 */     if (paramPatternProducingNode.jjtGetNumChildren() != 0) {
/* 80 */       for (int i = 0; i < paramPatternProducingNode.jjtGetNumChildren(); i++)
/*    */       {
/*    */ 
/* 83 */         PatternProducingNode localPatternProducingNode = (PatternProducingNode)paramPatternProducingNode.jjtGetChild(i);
/* 84 */         if (localPatternProducingNode != null) {
/* 85 */           addFactsRecursively(localPatternProducingNode, paramHashSet);
/*    */           
/* 87 */           paramHashSet.add(localPatternProducingNode.getPatternHead());
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean negated;
/*    */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTTemplate;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   int getChildNodeID() {
/* 96 */     return ((SimpleNode)this.children[0]).getParseNodeID();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTTemplate.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */