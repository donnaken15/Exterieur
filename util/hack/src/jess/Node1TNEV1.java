/*    */ package jess;
/*    */ 
/*    */ 
/*    */ class Node1TNEV1
/*    */   extends Node1
/*    */ {
/*    */   private int m_idx1;
/*    */   
/*    */   private int m_idx2;
/*    */   
/*    */   private int m_subidx1;
/*    */   private int m_subidx2;
/*    */   
/*    */   Node1TNEV1(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 16 */     this.m_idx1 = paramInt1;
/* 17 */     this.m_subidx1 = paramInt2;
/* 18 */     this.m_idx2 = paramInt3;
/* 19 */     this.m_subidx2 = paramInt4;
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException
/*    */   {
/* 24 */     if (processClearCommand(paramToken, paramContext)) {
/* 25 */       return;
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 32 */       Fact localFact = paramToken.topFact();
/* 33 */       if (this.m_subidx1 != -1) {
/* 34 */         localObject = localFact.get(this.m_idx1).listValue(null).get(this.m_subidx1);
/*    */       } else
/* 36 */         localObject = localFact.get(this.m_idx1);
/*    */       Value localValue;
/* 38 */       if (this.m_subidx2 != -1) {
/* 39 */         localValue = localFact.get(this.m_idx2).listValue(null).get(this.m_subidx2);
/*    */       } else {
/* 41 */         localValue = localFact.get(this.m_idx2);
/*    */       }
/* 43 */       boolean bool = ((Value)localObject).equals(localValue) ^ true;
/*    */       
/* 45 */       if (bool)
/*    */       {
/* 47 */         passAlong(paramToken, paramContext);
/*    */       }
/* 49 */       return;
/*    */     }
/*    */     catch (JessException localJessException)
/*    */     {
/* 53 */       localJessException.addContext("rule LHS (TNEV1)");
/* 54 */       throw localJessException;
/*    */     }
/*    */     catch (Exception localException)
/*    */     {
/* 58 */       Object localObject = new JessException("Node1TNEV1.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 61 */       ((JessException)localObject).addContext("rule LHS (TNEV1)");
/* 62 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 69 */     if ((paramObject instanceof Node1TNEV1))
/*    */     {
/* 71 */       Node1TNEV1 localNode1TNEV1 = (Node1TNEV1)paramObject;
/* 72 */       if ((this.m_idx1 == localNode1TNEV1.m_idx1) && (this.m_idx2 == localNode1TNEV1.m_idx2) && (this.m_subidx1 == localNode1TNEV1.m_subidx1) && (this.m_subidx2 == localNode1TNEV1.m_subidx2)) 0; return true;
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 77 */     return false;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 82 */     StringBuffer localStringBuffer = new StringBuffer("[Test that slot #");
/* 83 */     localStringBuffer.append(this.m_idx1);
/* 84 */     if (this.m_subidx1 != -1)
/*    */     {
/* 86 */       localStringBuffer.append(", subindex ");
/* 87 */       localStringBuffer.append(this.m_subidx1);
/*    */     }
/* 89 */     localStringBuffer.append(" != slot#");
/* 90 */     localStringBuffer.append(this.m_idx2);
/* 91 */     if (this.m_subidx2 != -1)
/*    */     {
/* 93 */       localStringBuffer.append(", subindex ");
/* 94 */       localStringBuffer.append(this.m_subidx2);
/*    */     }
/* 96 */     localStringBuffer.append("]");
/* 97 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1TNEV1.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */