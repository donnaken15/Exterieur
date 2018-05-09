/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Test2Simple
/*    */   implements TestBase, Serializable
/*    */ {
/*    */   private boolean m_test;
/*    */   private int m_tokenIdx;
/*    */   private int m_leftIdx;
/*    */   private int m_rightIdx;
/*    */   
/*    */   boolean getTest()
/*    */   {
/* 19 */     return this.m_test;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   int getTokenIndex()
/*    */   {
/* 26 */     return this.m_tokenIdx;
/*    */   }
/*    */   
/*    */ 
/*    */   int getLeftIndex()
/*    */   {
/* 32 */     return this.m_leftIdx;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 39 */   int getRightIndex() { return this.m_rightIdx; }
/*    */   
/*    */   Test2Simple(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 42 */     if (paramInt1 == 0) 0; this.m_test = true;
/* 43 */     this.m_tokenIdx = paramInt2;
/* 44 */     this.m_rightIdx = paramInt4;
/* 45 */     this.m_leftIdx = paramInt3;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 49 */     if (!(paramObject instanceof Test2Simple)) {
/* 50 */       return false;
/*    */     }
/* 52 */     Test2Simple localTest2Simple = (Test2Simple)paramObject;
/* 53 */     if ((this.m_test == localTest2Simple.m_test) && (this.m_tokenIdx == localTest2Simple.m_tokenIdx) && (this.m_rightIdx == localTest2Simple.m_rightIdx) && (this.m_leftIdx == localTest2Simple.m_leftIdx)) 0; return true;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public boolean doTest(Context paramContext)
/*    */     throws JessException
/*    */   {
/* 61 */     Token localToken = paramContext.getToken();
/* 62 */     Fact localFact = paramContext.getFact();
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */     Value localValue1 = localToken.fact(this.m_tokenIdx).get(this.m_leftIdx);
/* 70 */     Value localValue2 = localFact.get(this.m_rightIdx);
/* 71 */     localValue1.equals(localValue2);
/* 72 */     return this.m_test ^ localValue1.equals(localValue2) ^ true;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 76 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 77 */     localStringBuffer.append("[Test2Simple: test=");
/* 78 */     localStringBuffer.append(this.m_test ? "EQ" : "NEQ");
/* 79 */     localStringBuffer.append(";tokenIdx=");
/* 80 */     localStringBuffer.append(this.m_tokenIdx);
/* 81 */     localStringBuffer.append(";leftIdx=");
/* 82 */     localStringBuffer.append(this.m_leftIdx);
/* 83 */     localStringBuffer.append(";rightIdx=");
/* 84 */     localStringBuffer.append(this.m_rightIdx);
/* 85 */     localStringBuffer.append("]");
/*    */     
/* 87 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Test2Simple.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */