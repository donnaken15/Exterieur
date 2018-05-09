/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ class ASTRegexpand extends ASTJessRule implements NLUTreeConstants, PatternProducingNode { private java.util.List subrules;
/*     */   
/*   7 */   ASTRegexpand(int paramInt) { super(paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */   ASTRegexpand(NLU paramNLU, int paramInt) {
/*  11 */     super(paramNLU, paramInt);jdMethod_this();
/*     */   }
/*     */   
/*  14 */   private final void jdMethod_this() { this.subrules = new java.util.Vector(); }
/*     */   
/*     */ 
/*     */   private final void compileAndVariants(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, java.io.BufferedWriter paramBufferedWriter, String paramString)
/*     */     throws java.io.IOException
/*     */   {
/*  20 */     if (paramArrayOfBoolean == null)
/*     */     {
/*  22 */       paramArrayOfBoolean = new boolean[paramInt2];
/*  23 */       for (int i = 0; i < paramArrayOfBoolean.length; i++)
/*  24 */         paramArrayOfBoolean[i] = true;
/*     */     }
/*  26 */     if (paramInt1 == paramInt2)
/*     */     {
/*  28 */       compileRule(paramBufferedWriter, paramString, paramArrayOfBoolean);
/*     */     } else {
/*  30 */       paramArrayOfBoolean[paramInt1] = true;
/*  31 */       compileAndVariants(paramArrayOfBoolean, paramInt1 + 1, paramInt2, paramBufferedWriter, paramString);
/*  32 */       paramArrayOfBoolean[paramInt1] = false;
/*  33 */       compileAndVariants(paramArrayOfBoolean, paramInt1 + 1, paramInt2, paramBufferedWriter, paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void compileRule(java.io.BufferedWriter paramBufferedWriter, String paramString, boolean[] paramArrayOfBoolean) throws java.io.IOException
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*  44 */     int k = 0;
/*  45 */     boolean bool = false;
/*     */     
/*  47 */     StringBuffer localStringBuffer1 = new StringBuffer();
/*  48 */     StringBuffer localStringBuffer2 = new StringBuffer();
/*  49 */     StringBuffer localStringBuffer3 = new StringBuffer("(");
/*     */     
/*  51 */     for (int m = 0; m < this.children.length; m++) {
/*  52 */       ASTTemplate localASTTemplate = (ASTTemplate)this.children[m];
/*  53 */       if (localASTTemplate != null)
/*     */       {
/*     */ 
/*  56 */         str = localASTTemplate.getPatternToMatch(j);
/*  57 */         int n = ((SimpleNode)localASTTemplate.children[0]).getParseNodeID();
/*  58 */         if (((n == 18) && (paramArrayOfBoolean[(i++)] != 0)) || (n != 18))
/*     */         {
/*  60 */           localStringBuffer3.append(" " + localASTTemplate.dumpTokens());
/*  61 */           localStringBuffer1.append(str);
/*  62 */           bool = localASTTemplate.isRegexp();
/*     */           
/*     */ 
/*  65 */           if ((k != 0) && (bool) && (j > 0)) {
/*  66 */             localStringBuffer2.append(" (test (MyEquals ?startpos" + j);
/*  67 */             localStringBuffer2.append(" (MyPlus ?endpos" + (j - 1));
/*  68 */             localStringBuffer2.append(" 1)))");
/*     */ 
/*     */ 
/*     */           }
/*  72 */           else if (((k != 0) || (bool)) && 
/*  73 */             (j > 0)) {
/*  74 */             localStringBuffer2.append(" (test (MyGreater ?startpos" + j);
/*  75 */             localStringBuffer2.append(" ?endpos" + (j - 1));
/*  76 */             localStringBuffer2.append("))");
/*     */           }
/*     */           
/*  79 */           j++;
/*  80 */           k = bool;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  85 */     localStringBuffer3.append(" ) ");
/*     */     
/*     */ 
/*     */ 
/*  89 */     localStringBuffer3.append(dumpTokens());
/*     */     
/*     */ 
/*  92 */     StringBuffer localStringBuffer4 = new StringBuffer();
/*  93 */     String str = "andtest" + getID(localStringBuffer3.toString());
/*  94 */     this.subrules.add(str);
/*  95 */     localStringBuffer4.append("(definerule " + str + ' ' + NLU.salience + ' ');
/*  96 */     localStringBuffer4.append(" \" (declare (salience " + NLU.salience + ")) ");
/*     */     
/*  98 */     localStringBuffer4.append(localStringBuffer1);
/*  99 */     localStringBuffer4.append(localStringBuffer2);
/* 100 */     localStringBuffer4.append(" => ");
/*     */     
/*     */ 
/*     */ 
/* 104 */     localStringBuffer4.append("(assert(po-" + paramString + " ?startpos0 ?endpos" + (j - 1));
/* 105 */     Iterator localIterator = getPatternBindingVariablesCanonical().iterator();
/* 106 */     while (localIterator.hasNext())
/* 107 */       localStringBuffer4.append(" " + localIterator.next());
/* 108 */     localStringBuffer4.append("))\")\n\n");
/* 109 */     paramBufferedWriter.write(localStringBuffer4.toString());
/*     */   }
/*     */   
/*     */ 
/*     */   private final void checkVariableBindings()
/*     */     throws CompileException
/*     */   {
/* 116 */     java.util.HashSet localHashSet = new java.util.HashSet();
/* 117 */     for (int i = 0; i < jjtGetNumChildren(); i++) {
/* 118 */       ASTTemplate localASTTemplate1 = (ASTTemplate)jjtGetChild(i);
/* 119 */       if (localASTTemplate1.getChildNodeID() == 18) {
/* 120 */         localHashSet = localASTTemplate1.getPatternBindingVariables();
/* 121 */         if (localHashSet.size() > 0) {
/*     */           break;
/*     */         }
/*     */       }
/*     */     }
/* 126 */     if (localHashSet.size() > 0) {
/* 127 */       i = 0;
/* 128 */       for (int j = 0; j < jjtGetNumChildren(); j++) {
/* 129 */         ASTTemplate localASTTemplate2 = (ASTTemplate)jjtGetChild(j);
/* 130 */         if (localASTTemplate2.getChildNodeID() == 18) {
/* 131 */           if (!localASTTemplate2.getPatternBindingVariables().equals(localHashSet)) {
/* 132 */             throw new CompileException("Line " + getFirstLineNumber() + ": If a regexp-opt subexpression of a regexp-and expression binds variables, the same variables must be bound by all regexp-opt subexpressions of the regexp-and expression");
/*     */           }
/*     */           
/*     */         }
/* 136 */         else if (localASTTemplate2.getPatternBindingVariables().equals(localHashSet))
/* 137 */           i = 1;
/*     */       }
/* 139 */       if (i == 0) {
/* 140 */         throw new CompileException("Line " + getFirstLineNumber() + ": If a regexp-opt subexpression of a regexp-and expression binds variables, at least one non-opt subexpression must bind the same variables as the opt subexpression");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/* 146 */     int i = 0;
/* 147 */     for (int j = 0; j < jjtGetNumChildren(); j++)
/*     */     {
/* 149 */       localObject = (ASTTemplate)jjtGetChild(j);
/*     */       
/* 151 */       if (((SimpleNode)localObject.children[0]).getParseNodeID() == 18) {
/* 152 */         i++;
/*     */       }
/*     */     }
/* 155 */     if (i == jjtGetNumChildren()) {
/* 156 */       throw new CompileException("An 'and' regular expression can not consist solely of optional expressions");
/*     */     }
/* 158 */     if (i > 0) {
/* 159 */       checkVariableBindings();
/*     */     }
/* 161 */     String str = getID(dumpTokens());
/* 162 */     this.patternHead = ("po-" + str);
/* 163 */     compileAndVariants(null, 0, i, paramBufferedWriter, str);
/*     */     
/* 165 */     Object localObject = this.subrules.iterator();
/* 166 */     while (((Iterator)localObject).hasNext())
/* 167 */       this.ruleName += (String)((Iterator)localObject).next();
/*     */   }
/*     */   
/* 170 */   boolean isRegexp() { return true; }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTRegexpand.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */