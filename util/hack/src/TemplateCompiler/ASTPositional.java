/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ class ASTPositional extends ASTJessRule implements NLUConstants, PatternProducingNode
/*    */ {
/*    */   private final List arguments;
/*    */   private final List variables;
/*    */   
/*    */   ASTPositional(int paramInt) {
/* 11 */     super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   ASTPositional(NLU paramNLU, int paramInt) {
/* 15 */     super(paramNLU, paramInt);jdMethod_this();
/*    */   }
/*    */   
/* 18 */   private final void jdMethod_this() { this.arguments = new java.util.ArrayList();
/* 19 */     this.variables = new java.util.ArrayList();
/*    */   }
/*    */   
/*    */   void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws CompileException {
/* 23 */     this.patternHead = this.firstToken.next.image;
/* 24 */     this.ruleName = "";
/*    */     
/* 26 */     Token localToken = this.firstToken.next.next;
/* 27 */     while (localToken != this.lastToken)
/*    */     {
/* 29 */       this.arguments.add(localToken.image);
/* 30 */       if (localToken.kind == 52)
/* 31 */         this.variables.add(localToken.image);
/* 32 */       localToken = localToken.next;
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 37 */     if (!isDeclaredFact(this.patternHead))
/* 38 */       throw new CompileException("Positional fact " + this.patternHead + " on line " + localToken.beginLine + " has not been declared");
/* 39 */     if (this.arguments.size() > getNumberOfArgumentsForDeclaredFact(this.patternHead) - 2) {
/* 40 */       throw new CompileException("Number of variable arguments for positional fact " + this.patternHead + " on line " + localToken.beginLine + " exceeds the number of declared arguments for the positional fact");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getPatternToMatch(int paramInt)
/*    */   {
/* 50 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 51 */     if (paramInt != -1) {
/* 52 */       localStringBuffer.append("(" + this.patternHead + " ?startpos" + paramInt + " ?endpos" + paramInt);
/*    */     } else {
/* 54 */       localStringBuffer.append("(" + this.patternHead + " ?startpos ?endpos");
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 59 */     int i = getNumberOfArgumentsForDeclaredFact(this.patternHead) - this.arguments.size() - 2;
/*    */     
/* 61 */     if ((this.arguments.size() != 0) || (i > 0)) {
/* 62 */       localStringBuffer.append(" ");
/*    */     }
/* 64 */     if (this.arguments.size() != 0)
/*    */     {
/* 66 */       java.util.Iterator localIterator = this.arguments.iterator();
/* 67 */       while (localIterator.hasNext()) {
/* 68 */         localStringBuffer.append((String)localIterator.next());
/* 69 */         if (localIterator.hasNext())
/* 70 */           localStringBuffer.append(" ");
/*    */       }
/*    */     }
/* 73 */     if (i > 0)
/*    */     {
/* 75 */       localStringBuffer.append(" ");
/* 76 */       for (int j = 0; j < i - 1; j++) {
/* 77 */         localStringBuffer.append("? ");
/*    */       }
/* 79 */       localStringBuffer.append("?");
/*    */     }
/* 81 */     localStringBuffer.append(")");
/*    */     
/* 83 */     return localStringBuffer.toString();
/*    */   }
/*    */   
/* 86 */   boolean isRegexp() { return true; }
/*    */   
/*    */   public java.util.HashSet getPatternBindingVariables()
/*    */   {
/* 90 */     return new java.util.HashSet(this.variables);
/*    */   }
/*    */   
/* 93 */   public List getPatternBindingVariablesCanonical() { return new java.util.ArrayList(this.variables); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTPositional.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */