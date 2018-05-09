/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class TokenTree
/*     */   implements Serializable
/*     */ {
/*     */   int m_hash;
/*     */   TokenVector[] m_tokens;
/*     */   boolean m_useSortcode;
/*     */   int m_tokenIdx;
/*     */   int m_factIdx;
/*     */   int m_subIdx;
/*     */   
/*     */   TokenTree(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     this.m_hash = paramInt1;
/*  23 */     this.m_useSortcode = paramBoolean;
/*  24 */     this.m_factIdx = paramInt3;
/*  25 */     this.m_subIdx = paramInt4;
/*  26 */     this.m_tokenIdx = paramInt2;
/*  27 */     this.m_tokens = new TokenVector[this.m_hash];
/*     */   }
/*     */   
/*     */   final void clear() {
/*  31 */     for (int i = 0; i < this.m_hash; i++)
/*  32 */       if (this.m_tokens[i] != null)
/*  33 */         this.m_tokens[i].clear();
/*     */   }
/*     */   
/*     */   private final Token subsetToken(Token paramToken) {
/*  37 */     Token localToken = paramToken;
/*  38 */     while (localToken.size() > this.m_tokenIdx)
/*  39 */       localToken = localToken.getParent();
/*  40 */     return localToken;
/*     */   }
/*     */   
/*     */   private final int codeForToken(Token paramToken)
/*     */     throws JessException
/*     */   {
/*     */     int i;
/*  47 */     if (this.m_useSortcode) {
/*  48 */       if (this.m_tokenIdx == 0) {
/*  49 */         i = paramToken.m_sortcode;
/*     */       } else {
/*  51 */         i = subsetToken(paramToken).m_sortcode;
/*     */       }
/*  53 */     } else if (this.m_factIdx == -1) {
/*  54 */       i = paramToken.fact(this.m_tokenIdx).getFactId();
/*     */     }
/*  56 */     else if (this.m_subIdx == -1) {
/*  57 */       i = paramToken.fact(this.m_tokenIdx).m_v[this.m_factIdx].hashCode();
/*     */     }
/*     */     else {
/*  60 */       i = paramToken.fact(this.m_tokenIdx).m_v[this.m_factIdx].listValue(null).m_v[this.m_subIdx].hashCode();
/*     */     }
/*     */     
/*     */ 
/*  64 */     if (i < 0) {
/*  65 */       i = -i;
/*     */     }
/*  67 */     return i;
/*     */   }
/*     */   
/*     */   synchronized boolean add(Token paramToken, boolean paramBoolean) throws JessException
/*     */   {
/*  72 */     int i = codeForToken(paramToken);
/*     */     
/*  74 */     TokenVector localTokenVector = findCodeInTree(i, true);
/*     */     
/*  76 */     if (paramBoolean) {
/*  77 */       int j = localTokenVector.size();
/*  78 */       for (int k = 0; k < j; k++) {
/*  79 */         Token localToken = localTokenVector.elementAt(k);
/*  80 */         if (paramToken.dataEquals(localToken)) {
/*  81 */           return false;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  86 */     localTokenVector.addElement(paramToken);
/*  87 */     return true;
/*     */   }
/*     */   
/*     */   synchronized boolean remove(Token paramToken) throws JessException
/*     */   {
/*  92 */     int i = codeForToken(paramToken);
/*     */     
/*  94 */     TokenVector localTokenVector = findCodeInTree(i, false);
/*     */     
/*  96 */     if (localTokenVector == null) {
/*  97 */       return false;
/*     */     }
/*  99 */     int j = localTokenVector.size();
/*     */     
/* 101 */     if (j == 0) {
/* 102 */       return false;
/*     */     }
/* 104 */     for (int k = 0; k < j; k++) {
/* 105 */       Token localToken = localTokenVector.elementAt(k);
/* 106 */       if (paramToken.dataEquals(localToken)) {
/* 107 */         localTokenVector.removeElementAt(k);
/* 108 */         return true;
/*     */       }
/*     */     }
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   synchronized TokenVector findCodeInTree(int paramInt, boolean paramBoolean) {
/* 115 */     paramInt %= this.m_hash;
/*     */     
/* 117 */     if (paramInt < 0) {
/* 118 */       paramInt = -paramInt;
/*     */     }
/* 120 */     if ((paramBoolean) && (this.m_tokens[paramInt] == null)) {
/* 121 */       return this.m_tokens[paramInt] = new TokenVector();
/*     */     }
/* 123 */     return this.m_tokens[paramInt];
/*     */   }
/*     */   
/*     */   public String toString() {
/* 127 */     StringBuffer localStringBuffer = new StringBuffer();
/* 128 */     for (int i = 0; i < this.m_hash; i++) {
/* 129 */       if (this.m_tokens[i] != null) {
/* 130 */         localStringBuffer.append(i);
/* 131 */         localStringBuffer.append(": ");
/* 132 */         localStringBuffer.append(this.m_tokens[i]);
/* 133 */         localStringBuffer.append("\n");
/*     */       }
/*     */     }
/* 136 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\TokenTree.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */