/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import jess.factory.Factory;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class NodeNot2Single
/*     */   extends Node2
/*     */   implements Serializable
/*     */ {
/*     */   NodeNot2Single(int paramInt)
/*     */     throws JessException
/*     */   {
/*  52 */     super(paramInt);
/*     */   }
/*     */   
/*     */   void callNodeLeft(Token paramToken, Context paramContext) throws JessException {
/*  56 */     if ((paramToken.m_tag == 0) || (paramToken.m_tag == 2)) {
/*  57 */       paramToken = Rete.getFactory().newToken(paramToken);
/*     */     }
/*  59 */     super.callNodeLeft(paramToken, paramContext);
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
/*     */   void runTestsVaryRight(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  74 */     if (paramToken.m_tag != 1) {
/*  75 */       super.runTestsVaryRight(paramToken, paramTokenTree, paramContext);
/*     */     }
/*  77 */     if (paramToken.m_negcnt == 0) {
/*  78 */       Token localToken = Rete.getFactory().newToken(paramToken, Fact.getNullFact());
/*  79 */       localToken.updateTime(paramContext.getEngine());
/*  80 */       this.m_matches += 1;
/*  81 */       passAlong(localToken, paramContext);
/*  82 */       if (this.m_logicalDepends != null) {
/*  83 */         removeLogicalSupportFrom(localToken, paramContext);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void doRunTestsVaryRight(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  95 */     if (paramTokenTree == null) {
/*  96 */       return;
/*     */     }
/*  98 */     for (int i = 0; i < paramTokenTree.m_hash; i++) {
/*  99 */       doRunTestsVaryRight(paramToken, paramTokenTree.m_tokens[i], paramContext);
/*     */     }
/*     */   }
/*     */   
/*     */   boolean doRunTestsVaryRight(Token paramToken, TokenVector paramTokenVector, Context paramContext) throws JessException
/*     */   {
/* 105 */     if (paramTokenVector != null) {
/* 106 */       int i = paramTokenVector.size();
/* 107 */       if (i > 0) {
/* 108 */         int j = this.m_nTests;
/* 109 */         paramContext.setToken(paramToken);
/*     */         
/* 111 */         for (int k = 0; k < i; k++) {
/* 112 */           if ((j == 0) || (runTests(j, paramContext, paramTokenVector.elementAt(k))))
/* 113 */             paramToken.m_negcnt += 1;
/*     */         }
/*     */       }
/*     */     }
/* 117 */     return false;
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
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 132 */     if (paramTokenTree == null) {
/* 133 */       return;
/*     */     }
/* 135 */     for (int i = 0; i < paramTokenTree.m_hash; i++) {
/* 136 */       TokenVector localTokenVector = paramTokenTree.m_tokens[i];
/* 137 */       doRunTestsVaryLeft(paramToken, localTokenVector, paramContext);
/*     */     }
/*     */   }
/*     */   
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenVector paramTokenVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 144 */     if (paramTokenVector != null) {
/* 145 */       int i = paramTokenVector.size();
/* 146 */       if (i > 0) {
/* 147 */         int j = this.m_nTests;
/* 148 */         int k = paramToken.m_tag;
/* 149 */         for (int m = 0; m < i; m++) {
/* 150 */           Token localToken1 = paramTokenVector.elementAt(m);
/* 151 */           paramContext.setToken(localToken1);
/*     */           
/* 153 */           if ((j == 0) || (runTests(j, paramContext, paramToken))) { Token localToken2;
/* 154 */             if ((k == 0) || (k == 2))
/*     */             {
/* 156 */               localToken2 = Rete.getFactory().newToken(localToken1, Fact.getNullFact());
/* 157 */               localToken2.updateTime(paramContext.getEngine());
/* 158 */               localToken2.m_tag = 1;
/* 159 */               passAlong(localToken2, paramContext);
/* 160 */               if (this.m_logicalDepends != null)
/* 161 */                 removeLogicalSupportFrom(localToken2, paramContext);
/* 162 */               localToken1.m_negcnt += 1;
/* 163 */             } else if (--localToken1.m_negcnt == 0)
/*     */             {
/* 165 */               localToken2 = Rete.getFactory().newToken(localToken1, Fact.getNullFact());
/* 166 */               localToken2.updateTime(paramContext.getEngine());
/* 167 */               passAlong(localToken2, paramContext);
/* 168 */               if (this.m_logicalDepends != null) {
/* 169 */                 removeLogicalSupportFrom(localToken2, paramContext);
/*     */               }
/* 171 */             } else if (localToken1.m_negcnt < 0) {
/* 172 */               throw new JessException("NodeNot2.RunTestsVaryLeft", "Corrupted Negcnt (< 0)", "");
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 186 */     StringBuffer localStringBuffer = new StringBuffer(256);
/* 187 */     localStringBuffer.append("[NodeNot2Single ntests=");
/* 188 */     localStringBuffer.append(this.m_nTests);
/* 189 */     localStringBuffer.append(" ");
/* 190 */     for (int i = 0; i < this.m_nTests; i++) {
/* 191 */       localStringBuffer.append(this.m_tests[i].toString());
/* 192 */       localStringBuffer.append(" ");
/*     */     }
/* 194 */     localStringBuffer.append(";usecount = ");
/* 195 */     localStringBuffer.append(this.m_usecount);
/* 196 */     localStringBuffer.append("]");
/* 197 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\NodeNot2Single.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */