/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.StringWriter;
/*     */ 
/*     */ class ASTStart extends ASTJessRule implements NLUTreeConstants
/*     */ {
/*     */   ASTStart(int paramInt)
/*     */   {
/*   9 */     super(paramInt);
/*     */   }
/*     */   
/*     */   ASTStart(NLU paramNLU, int paramInt) {
/*  13 */     super(paramNLU, paramInt);
/*     */   }
/*     */   
/*  16 */   private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTStart;").getComponentType().desiredAssertionStatus() ^ true; private static long ruleCounter = 0L;
/*     */   
/*     */   void compileToJess(java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/*  19 */     if (!$noassert) throw new AssertionError("don't call compileToJess on ASTStart");
/*     */   }
/*     */   
/*     */   void compileToJessChildren(ASTJessRule paramASTJessRule, java.io.BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException
/*     */   {
/*  24 */     if (paramASTJessRule.children != null) {
/*  25 */       for (int i = 0; i < paramASTJessRule.children.length; i++) {
/*  26 */         ASTJessRule localASTJessRule1 = (ASTJessRule)paramASTJessRule.children[i];
/*  27 */         if (localASTJessRule1 != null)
/*     */         {
/*  29 */           compileToJessChildren(localASTJessRule1, paramBufferedWriter);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*  34 */           if ((localASTJessRule1.toString().equals("RHside")) || (localASTJessRule1.toString().equals("worddump"))) return;
/*  35 */           if (!localASTJessRule1.toString().equals("WildMatch")) {
/*  36 */             localASTJessRule1.compileToJess(paramBufferedWriter);
/*     */           }
/*     */           else {
/*  39 */             ASTJessRule localASTJessRule2 = (ASTJessRule)localASTJessRule1.parent;
/*  40 */             localASTJessRule2 = (ASTJessRule)localASTJessRule2.parent;
/*  41 */             int j = 0;
/*  42 */             while (((ASTJessRule)localASTJessRule2.children[j]).children[0] != localASTJessRule1) {
/*  43 */               j++;
/*     */             }
/*  45 */             if (j == 0) { localASTJessRule1.compileToJess(paramBufferedWriter);
/*     */             } else {
/*  47 */               ASTTemplate localASTTemplate = (ASTTemplate)localASTJessRule2.children[(j - 1)];
/*  48 */               ((ASTWildMatch)localASTJessRule1).setPreviousMatchTest(localASTTemplate.getPatternHead(), localASTTemplate.getPatternToMatch(-1));
/*  49 */               localASTJessRule1.compileToJess(paramBufferedWriter);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void prepareChildrenRetract(StringWriter paramStringWriter) {
/*  58 */     java.util.HashSet localHashSet = NLU.retractThese;
/*  59 */     java.util.Iterator localIterator = localHashSet.iterator();
/*  60 */     while (localIterator.hasNext()) {
/*  61 */       String str1 = (String)localIterator.next();
/*  62 */       String str2 = "\n(conditionalRetract " + str1 + " ?startpos1 ?endpos1)\n";
/*  63 */       paramStringWriter.write(str2);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void compileToplevel(StringWriter paramStringWriter1, StringWriter paramStringWriter2, java.io.BufferedWriter paramBufferedWriter, String paramString)
/*     */     throws java.io.IOException, CompileException
/*     */   {
/*  72 */     if ((!$noassert) && (jjtGetNumChildren() != 1)) { throw new AssertionError();
/*     */     }
/*  74 */     if (++ruleCounter % 100L == 0L) {
/*  75 */       System.out.print(ruleCounter + ' ');
/*     */     }
/*     */     
/*  78 */     Token localToken = this.firstToken;
/*  79 */     String str = localToken.next.next.image;
/*     */     
/*     */ 
/*  82 */     NLU.retractThese.clear();
/*     */     
/*     */ 
/*  85 */     compileToJessChildren(this, paramBufferedWriter);
/*     */     
/*     */ 
/*     */ 
/*  89 */     int i = 1;
/*  90 */     ASTTemplate localASTTemplate = (ASTTemplate)this.children[0];
/*  91 */     if (localASTTemplate.toStringNodeBelow().startsWith("O")) { i = 0;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  97 */     StringBuffer localStringBuffer = new StringBuffer();
/*  98 */     if (NLU.retractThese.size() == 0)
/*     */     {
/* 100 */       localStringBuffer.append(localASTTemplate.getPatternToMatch(1));
/*     */     }
/*     */     else
/*     */     {
/* 104 */       localStringBuffer.append(localASTTemplate.getPatternToMatchNoDependency(1));
/*     */     }
/*     */     
/* 107 */     if (i != 0)
/*     */     {
/* 109 */       localObject = (ASTJessRule)this.children[0];
/* 110 */       localObject = (ASTJessRule)localObject.children[0];
/* 111 */       if ((((ASTJessRule)localObject).getParseNodeID() != 13) && (((ASTJessRule)localObject).getParseNodeID() != 17))
/*     */       {
/* 113 */         localObject = (ASTJessRule)localObject.children[0]; }
/* 114 */       if (((ASTJessRule)localObject).isRegexp()) {
/* 115 */         localStringBuffer.append(" (test (MyEquals ?startpos1 1)) ");
/*     */       }
/* 117 */       localObject = (ASTJessRule)((ASTJessRule)localObject).parent;
/* 118 */       localObject = (ASTJessRule)localObject.children[(localObject.children.length - 1)];
/* 119 */       if (((ASTJessRule)localObject).isRegexp()) {
/* 120 */         localStringBuffer.append("(_wordcount ?wordno) (test (MyEquals ?endpos" + Integer.toString(this.children.length) + " ?wordno))");
/*     */       }
/*     */     }
/* 123 */     paramStringWriter1.write(localStringBuffer.toString());
/*     */     
/* 125 */     Object localObject = new StringWriter();
/* 126 */     prepareChildrenRetract((StringWriter)localObject);
/* 127 */     paramStringWriter2.write(((StringWriter)localObject).getBuffer().toString());
/*     */     
/* 129 */     paramStringWriter2.flush();
/* 130 */     paramStringWriter1.flush();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void runNetwork(jess.Rete paramRete, String paramString)
/*     */     throws jess.JessException
/*     */   {
/* 138 */     paramRete.executeCommand("(assert(SENTENCE " + paramString + "))");
/* 139 */     paramRete.run();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTStart.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */