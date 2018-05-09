/*    */ package jess;
/*    */ 
/*    */ 
/*    */ class Node1TEQ
/*    */   extends Node1
/*    */ {
/*    */   private Value m_value;
/*    */   
/*    */   private int m_idx;
/*    */   
/*    */   Node1TEQ(int paramInt, Value paramValue)
/*    */     throws JessException
/*    */   {
/* 14 */     this.m_value = cleanupBindings(paramValue);
/* 15 */     this.m_idx = paramInt;
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException
/*    */   {
/* 20 */     if (processClearCommand(paramToken, paramContext))
/* 21 */       return;
/* 22 */     if (paramToken.m_tag == 1) {
/* 23 */       passAlong(paramToken, paramContext);
/* 24 */       return;
/*    */     }
/*    */     
/* 27 */     boolean bool = false;
/* 28 */     Fact localFact = paramToken.topFact();
/*    */     try
/*    */     {
/* 31 */       if (this.m_value.type() == 64)
/*    */       {
/* 33 */         paramContext.setFact(localFact);
/* 34 */         paramContext.setToken(paramToken);
/*    */         
/* 36 */         if (!this.m_value.resolveValue(paramContext).equals(Funcall.FALSE)) {
/* 37 */           bool = true;
/*    */         }
/*    */         
/* 40 */         paramToken = paramToken.prepare(bool);
/*    */       }
/* 42 */       else if (localFact.get(this.m_idx).equals(this.m_value.resolveValue(paramContext)))
/*    */       {
/* 44 */         bool = true;
/*    */       }
/*    */       
/* 47 */       if (bool) {
/* 48 */         passAlong(paramToken, paramContext);
/*    */       }
/*    */       
/* 51 */       return;
/*    */     }
/*    */     catch (JessException localJessException1)
/*    */     {
/* 55 */       localJessException1.addContext("rule LHS (TEQ)");
/* 56 */       throw localJessException1;
/*    */     }
/*    */     catch (Exception localException)
/*    */     {
/* 60 */       JessException localJessException2 = new JessException("Node1TEQ.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 63 */       localJessException2.addContext("rule LHS (TEQ)");
/* 64 */       throw localJessException2;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 71 */     return "[Test that slot at index " + this.m_idx + " equals " + this.m_value + ']';
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 76 */     if ((paramObject instanceof Node1TEQ))
/*    */     {
/* 78 */       Node1TEQ localNode1TEQ = (Node1TEQ)paramObject;
/* 79 */       if ((this.m_idx == localNode1TEQ.m_idx) && (this.m_value.equals(localNode1TEQ.m_value))) 0; return true;
/*    */     }
/*    */     
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1TEQ.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */