/*    */ package jess;
/*    */ 
/*    */ 
/*    */ class Node1MTELN
/*    */   extends Node1
/*    */ {
/*    */   private int m_idx;
/*    */   
/*    */   private int m_len;
/*    */   
/*    */ 
/*    */   Node1MTELN(int paramInt1, int paramInt2)
/*    */   {
/* 14 */     this.m_idx = paramInt1;
/* 15 */     this.m_len = paramInt2;
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException
/*    */   {
/* 20 */     if (processClearCommand(paramToken, paramContext)) {
/* 21 */       return;
/*    */     }
/*    */     try
/*    */     {
/* 25 */       int i = 0;
/* 26 */       localObject = paramToken.topFact();
/*    */       Value localValue;
/* 28 */       if ((localValue = ((Fact)localObject).get(this.m_idx)).type() == 512)
/*    */       {
/* 30 */         ValueVector localValueVector = localValue.listValue(null);
/* 31 */         if (localValueVector.size() == this.m_len) {
/* 32 */           i = 1;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/* 37 */       if (i != 0) {
/* 38 */         passAlong(paramToken, paramContext);
/*    */       }
/* 40 */       return;
/*    */     }
/*    */     catch (JessException localJessException)
/*    */     {
/* 44 */       localJessException.addContext("rule LHS (MTELN)");
/* 45 */       throw localJessException;
/*    */     }
/*    */     catch (Exception localException)
/*    */     {
/* 49 */       Object localObject = new JessException("Node1MTELN.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 52 */       ((JessException)localObject).addContext("rule LHS (MTELN)");
/* 53 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 60 */     return "[Test that the multislot at index " + this.m_idx + " is " + this.m_len + " items long]";
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 65 */     if ((paramObject instanceof Node1MTELN))
/*    */     {
/* 67 */       Node1MTELN localNode1MTELN = (Node1MTELN)paramObject;
/* 68 */       if ((this.m_idx == localNode1MTELN.m_idx) && (this.m_len == localNode1MTELN.m_len)) 0; return true;
/*    */     }
/*    */     
/* 71 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1MTELN.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */