/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import jess.factory.Factory;
/*     */ 
/*     */ class NodeNot2
/*     */   extends Node2
/*     */   implements Serializable
/*     */ {
/*     */   private int m_size;
/*     */   
/*     */   NodeNot2(int paramInt1, int paramInt2)
/*     */     throws JessException
/*     */   {
/*  15 */     super(paramInt1);
/*  16 */     this.m_size = paramInt2;
/*  17 */     complete();
/*     */   }
/*     */   
/*     */   void callNodeLeft(Token paramToken, Context paramContext) throws JessException {
/*  21 */     if ((paramToken.m_tag == 0) || (paramToken.m_tag == 2)) {
/*  22 */       paramToken = Rete.getFactory().newToken(paramToken);
/*     */     }
/*  24 */     super.callNodeLeft(paramToken, paramContext);
/*     */   }
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
/*  37 */     if (paramToken.m_tag != 1) {
/*  38 */       super.runTestsVaryRight(paramToken, paramTokenTree, paramContext);
/*     */     }
/*  40 */     if (paramToken.m_negcnt == 0) {
/*  41 */       Token localToken = Rete.getFactory().newToken(paramToken, Fact.getNullFact());
/*  42 */       localToken.updateTime(paramContext.getEngine());
/*  43 */       this.m_matches += 1;
/*  44 */       passAlong(localToken, paramContext);
/*  45 */       if (this.m_logicalDepends != null) {
/*  46 */         removeLogicalSupportFrom(localToken, paramContext);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void doRunTestsVaryRight(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  55 */     if (paramTokenTree == null) {
/*  56 */       return;
/*     */     }
/*  58 */     int i = paramToken.hashCode();
/*  59 */     TokenVector localTokenVector = paramTokenTree.findCodeInTree(i, false);
/*  60 */     doRunTestsVaryRight(paramToken, localTokenVector, paramContext);
/*     */   }
/*     */   
/*     */   boolean doRunTestsVaryRight(Token paramToken, TokenVector paramTokenVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  66 */     if (paramTokenVector != null) {
/*  67 */       int i = paramTokenVector.size();
/*  68 */       if (i > 0) {
/*  69 */         int j = this.m_nTests;
/*  70 */         paramContext.setToken(paramToken);
/*     */         
/*  72 */         for (int k = 0; k < i; k++) {
/*  73 */           Token localToken = paramTokenVector.elementAt(k);
/*     */           
/*  75 */           if (runTests(j, paramContext, localToken)) {
/*  76 */             paramToken.m_negcnt += 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  81 */     return false;
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
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenTree paramTokenTree, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  97 */     if (paramTokenTree == null) {
/*  98 */       return;
/*     */     }
/* 100 */     Token localToken = subsetRightToken(paramToken);
/* 101 */     int i = localToken.hashCode();
/* 102 */     TokenVector localTokenVector = paramTokenTree.findCodeInTree(i, false);
/*     */     
/* 104 */     doRunTestsVaryLeft(paramToken, localTokenVector, paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */   void doRunTestsVaryLeft(Token paramToken, TokenVector paramTokenVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 111 */     if (paramTokenVector != null) {
/* 112 */       int i = paramTokenVector.size();
/* 113 */       if (i > 0) {
/* 114 */         int j = this.m_nTests;
/* 115 */         int k = paramToken.m_tag;
/* 116 */         for (int m = 0; m < i; m++) {
/* 117 */           Token localToken1 = paramTokenVector.elementAt(m);
/* 118 */           paramContext.setToken(localToken1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 123 */           if ((k != 1) || (localToken1.m_negcnt != 0))
/*     */           {
/*     */ 
/*     */ 
/* 127 */             if (runTests(j, paramContext, paramToken)) { Token localToken2;
/* 128 */               if ((k == 0) || (k == 2))
/*     */               {
/* 130 */                 localToken2 = Rete.getFactory().newToken(localToken1, Fact.getNullFact());
/*     */                 
/* 132 */                 localToken2.updateTime(paramContext.getEngine());
/* 133 */                 localToken2.m_tag = 1;
/* 134 */                 passAlong(localToken2, paramContext);
/* 135 */                 if (this.m_logicalDepends != null)
/* 136 */                   removeLogicalSupportFrom(localToken2, paramContext);
/* 137 */                 localToken1.m_negcnt += 1;
/*     */               }
/* 139 */               else if (--localToken1.m_negcnt == 0)
/*     */               {
/* 141 */                 localToken2 = Rete.getFactory().newToken(localToken1, Fact.getNullFact());
/*     */                 
/* 143 */                 localToken2.updateTime(paramContext.getEngine());
/* 144 */                 passAlong(localToken2, paramContext);
/* 145 */                 if (this.m_logicalDepends != null) {
/* 146 */                   removeLogicalSupportFrom(localToken2, paramContext);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   Token subsetRightToken(Token paramToken) {
/* 157 */     Token localToken = paramToken;
/* 158 */     while (localToken.size() > this.m_size)
/* 159 */       localToken = localToken.getParent();
/* 160 */     return localToken;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   boolean runTests(int paramInt, Context paramContext, Token paramToken)
/*     */     throws JessException
/*     */   {
/* 171 */     Token localToken = paramContext.getToken();
/* 172 */     paramToken = subsetRightToken(paramToken);
/* 173 */     if ((paramToken == localToken) || (paramToken.dataEquals(localToken))) 0; return true;
/*     */   }
/*     */   
/*     */   protected void initTokenTrees()
/*     */   {
/* 178 */     boolean bool = true;
/*     */     
/* 180 */     if (this.m_left == null) {
/* 181 */       this.m_left = new TokenTree(this.m_hashkey, bool, 0, 0, 0);
/*     */     } else {
/* 183 */       this.m_left.clear();
/*     */     }
/* 185 */     if (this.m_right == null) {
/* 186 */       this.m_right = new TokenTree(this.m_hashkey, bool, this.m_size, 0, 0);
/*     */     } else {
/* 188 */       this.m_right.clear();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public String toString()
/*     */   {
/* 195 */     StringBuffer localStringBuffer = new StringBuffer(256);
/* 196 */     localStringBuffer.append("[NodeNot2");
/* 197 */     localStringBuffer.append(";usecount = ");
/* 198 */     localStringBuffer.append(this.m_usecount);
/* 199 */     localStringBuffer.append("]");
/* 200 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */   void addTest(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 206 */     addTest(null);
/*     */   }
/*     */   
/*     */   void addTest(TestBase paramTestBase) {
/* 210 */     throw new RuntimeException("ABORT: Can't add tests to NodeNot2");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\NodeNot2.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */