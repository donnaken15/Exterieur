/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class Token
/*     */   implements Serializable
/*     */ {
/*     */   int m_tag;
/*     */   int m_negcnt;
/*     */   int m_sortcode;
/*     */   private Fact m_fact;
/*     */   private int m_size;
/*     */   private Token m_parent;
/*     */   private int m_totalTime;
/*     */   private int m_time;
/*     */   
/*     */   Token getParent()
/*     */   {
/*  35 */     return this.m_parent;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Fact topFact()
/*     */   {
/*  44 */     return this.m_fact;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Fact fact(int paramInt)
/*     */   {
/*  56 */     int i = this.m_size - paramInt;
/*     */     
/*  58 */     Token localToken = this;
/*     */     do {
/*  60 */       localToken = localToken.m_parent;i--;
/*  59 */     } while (i > 0);
/*     */     
/*     */ 
/*  62 */     return localToken.m_fact;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final int size()
/*     */   {
/*  70 */     return this.m_size;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Token(Fact paramFact, int paramInt)
/*     */     throws JessException
/*     */   {
/*  79 */     this.m_size += 1;
/*  80 */     this.m_fact = paramFact;
/*  81 */     this.m_tag = paramInt;
/*  82 */     this.m_totalTime = paramFact.getTime();
/*  83 */     this.m_time = this.m_totalTime;
/*     */     
/*  85 */     this.m_sortcode = paramFact.getFactId();
/*     */   }
/*     */   
/*     */ 
/*     */   public Token(Token paramToken, Fact paramFact)
/*     */     throws JessException
/*     */   {
/*  92 */     this.m_fact = paramFact;
/*  93 */     this.m_parent = paramToken;
/*  94 */     this.m_tag = paramToken.m_tag;
/*     */     
/*  96 */     paramToken.m_size += 1;
/*  97 */     this.m_sortcode = ((paramToken.m_sortcode << 3) + paramFact.getFactId());
/*  98 */     int i = paramFact.getTime();
/*  99 */     paramToken.m_totalTime += i;
/* 100 */     this.m_time = Math.max(i, paramToken.m_time);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Token(Token paramToken1, Token paramToken2)
/*     */     throws JessException
/*     */   {
/* 108 */     this(paramToken1, paramToken2.topFact());
/*     */   }
/*     */   
/*     */ 
/*     */   public Token(Token paramToken)
/*     */     throws JessException
/*     */   {
/* 115 */     this.m_fact = paramToken.m_fact;
/* 116 */     this.m_parent = paramToken.m_parent;
/* 117 */     this.m_tag = paramToken.m_tag;
/*     */     
/* 119 */     this.m_size = paramToken.m_size;
/* 120 */     this.m_sortcode = paramToken.m_sortcode;
/* 121 */     this.m_time = paramToken.m_time;
/* 122 */     this.m_totalTime = paramToken.m_totalTime;
/* 123 */     this.m_negcnt = paramToken.m_negcnt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void updateTime(Rete paramRete)
/*     */   {
/* 130 */     int i = paramRete.getTime();
/* 131 */     this.m_totalTime = (this.m_totalTime - this.m_fact.getTime() + i);
/* 132 */     this.m_time = i;
/*     */   }
/*     */   
/*     */   int getTime() {
/* 136 */     return this.m_time;
/*     */   }
/*     */   
/*     */   int getTotalTime() {
/* 140 */     return this.m_totalTime;
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
/*     */   public final boolean dataEquals(Token paramToken)
/*     */   {
/* 154 */     if (paramToken == this) {
/* 155 */       return true;
/*     */     }
/* 157 */     if (this.m_sortcode != paramToken.m_sortcode) {
/* 158 */       return false;
/*     */     }
/* 160 */     if (this.m_fact.getFactId() != paramToken.m_fact.getFactId()) {
/* 161 */       return false;
/*     */     }
/* 163 */     if (!this.m_fact.equals(paramToken.m_fact)) {
/* 164 */       return false;
/*     */     }
/* 166 */     if (this.m_parent == paramToken.m_parent) {
/* 167 */       return true;
/*     */     }
/*     */     
/* 170 */     return this.m_parent.dataEquals(paramToken.m_parent);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 181 */     if ((paramObject instanceof Token)) {
/* 182 */       return dataEquals((Token)paramObject);
/*     */     }
/* 184 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 193 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 194 */     localStringBuffer.append("[Token: size=");
/* 195 */     localStringBuffer.append(this.m_size);
/* 196 */     localStringBuffer.append(";sortcode=");
/* 197 */     localStringBuffer.append(this.m_sortcode);
/* 198 */     localStringBuffer.append(";tag=");
/* 199 */     localStringBuffer.append(this.m_tag == 2 ? "UPDATE" : this.m_tag == 0 ? "ADD" : "REMOVE");
/*     */     
/* 201 */     localStringBuffer.append(";negcnt=");
/* 202 */     localStringBuffer.append(this.m_negcnt);
/* 203 */     localStringBuffer.append(";facts=");
/* 204 */     for (int i = 0; i < this.m_size; i++) {
/* 205 */       localStringBuffer.append(fact(i).toString());
/* 206 */       localStringBuffer.append(";");
/*     */     }
/* 208 */     localStringBuffer.append("]");
/* 209 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   String factList()
/*     */   {
/* 217 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 218 */     int i = 1;
/* 219 */     for (int j = 0; j < size(); j++) {
/* 220 */       if (i == 0)
/* 221 */         localStringBuffer.append(",");
/* 222 */       int k = fact(j).getFactId();
/* 223 */       if (k != -1) {
/* 224 */         localStringBuffer.append(" f-");
/* 225 */         localStringBuffer.append(k);
/*     */       }
/* 227 */       i = 0;
/*     */     }
/* 229 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 237 */     return this.m_sortcode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Token prepare(boolean paramBoolean)
/*     */     throws JessException
/*     */   {
/* 246 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Token.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */