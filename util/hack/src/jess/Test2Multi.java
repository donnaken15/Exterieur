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
/*     */ class Test2Multi
/*     */   implements TestBase, Serializable
/*     */ {
/*  17 */   public static int m_count = 0;
/*     */   private boolean m_test;
/*     */   private int m_tokenIdx;
/*     */   private int m_leftIdx;
/*     */   
/*     */   boolean getTest()
/*     */   {
/*  24 */     return this.m_test;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   int getTokenIndex()
/*     */   {
/*  31 */     return this.m_tokenIdx;
/*     */   }
/*     */   
/*     */ 
/*     */   int getLeftIndex()
/*     */   {
/*  37 */     return this.m_leftIdx;
/*     */   }
/*     */   
/*     */ 
/*     */   int getLeftSubIndex()
/*     */   {
/*  43 */     return this.m_leftSubIdx;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   int getRightIndex()
/*     */   {
/*  50 */     return this.m_rightIdx;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   int getRightSubIndex()
/*     */   {
/*  57 */     return this.m_rightSubIdx;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private int m_leftSubIdx;
/*     */   
/*     */ 
/*     */   private int m_rightIdx;
/*     */   
/*     */   int m_rightSubIdx;
/*     */   
/*     */   Test2Multi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  71 */     if (paramInt1 == 0) 0; this.m_test = true;
/*  72 */     this.m_tokenIdx = paramInt2;
/*  73 */     this.m_rightIdx = paramInt5;
/*  74 */     this.m_rightSubIdx = paramInt6;
/*  75 */     this.m_leftIdx = paramInt3;
/*  76 */     this.m_leftSubIdx = paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  85 */     if (!(paramObject instanceof Test2Multi)) {
/*  86 */       return false;
/*     */     }
/*  88 */     Test2Multi localTest2Multi = (Test2Multi)paramObject;
/*     */     
/*  90 */     if ((this.m_test == localTest2Multi.m_test) && (this.m_tokenIdx == localTest2Multi.m_tokenIdx) && (this.m_rightIdx == localTest2Multi.m_rightIdx) && (this.m_leftIdx == localTest2Multi.m_leftIdx) && (this.m_rightSubIdx == localTest2Multi.m_rightSubIdx) && (this.m_leftSubIdx == localTest2Multi.m_leftSubIdx)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean doTest(Context paramContext)
/*     */     throws JessException
/*     */   {
/* 101 */     m_count += 1;
/* 102 */     Token localToken = paramContext.getToken();
/*     */     
/* 104 */     Fact localFact1 = localToken.fact(this.m_tokenIdx);
/*     */     
/* 106 */     if (localFact1 == null) {
/* 107 */       return true;
/*     */     }
/*     */     
/* 110 */     Fact localFact2 = paramContext.getFact();
/*     */     
/*     */     Value localValue;
/*     */     
/* 114 */     if (this.m_leftSubIdx != -1) {
/* 115 */       localValue = localFact1.get(this.m_leftIdx).listValue(null).get(this.m_leftSubIdx);
/*     */     } else {
/* 117 */       localValue = localFact1.get(this.m_leftIdx);
/*     */     }
/*     */     
/*     */     boolean bool;
/* 121 */     if (this.m_rightSubIdx != -1) {
/* 122 */       bool = localValue.equals(localFact2.get(this.m_rightIdx).listValue(null).get(this.m_rightSubIdx));
/*     */     } else {
/* 124 */       bool = localValue.equals(localFact2.get(this.m_rightIdx));
/*     */     }
/* 126 */     return bool ^ this.m_test ^ true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 135 */     localStringBuffer.append("[Test2Multi: test=");
/* 136 */     localStringBuffer.append(this.m_test ? "EQ" : "NEQ");
/* 137 */     localStringBuffer.append(";tokenIdx=");
/* 138 */     localStringBuffer.append(this.m_tokenIdx);
/* 139 */     localStringBuffer.append(";leftIdx=");
/* 140 */     localStringBuffer.append(this.m_leftIdx);
/* 141 */     localStringBuffer.append(";leftSubIdx=");
/* 142 */     localStringBuffer.append(this.m_leftSubIdx);
/* 143 */     localStringBuffer.append(";rightIdx=");
/* 144 */     localStringBuffer.append(this.m_rightIdx);
/* 145 */     localStringBuffer.append(";rightSubIdx=");
/* 146 */     localStringBuffer.append(this.m_rightSubIdx);
/* 147 */     localStringBuffer.append("]");
/*     */     
/* 149 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Test2Multi.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */