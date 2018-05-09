/*    */ package jess;
/*    */ 
/*    */ class Node1MTEQ
/*    */   extends Node1
/*    */ {
/*    */   private int m_idx;
/*    */   private int m_subidx;
/*    */   private Value m_value;
/*    */   
/*    */   Node1MTEQ(int paramInt1, int paramInt2, Value paramValue) throws JessException
/*    */   {
/* 12 */     this.m_idx = paramInt1;
/* 13 */     this.m_subidx = paramInt2;
/* 14 */     this.m_value = cleanupBindings(paramValue);
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/*    */     try {
/* 19 */       if (processClearCommand(paramToken, paramContext)) {
/* 20 */         return;
/*    */       }
/* 22 */       if (paramToken.m_tag == 1) {
/* 23 */         passAlong(paramToken, paramContext);
/* 24 */         return;
/*    */       }
/*    */       
/* 27 */       boolean bool = false;
/*    */       
/*    */ 
/* 30 */       Fact localFact = paramToken.topFact();
/* 31 */       if ((localObject = localFact.get(this.m_idx)).type() == 512) {
/* 32 */         ValueVector localValueVector = ((Value)localObject).listValue(null);
/* 33 */         if (localValueVector.size() >= this.m_subidx) {
/* 34 */           Value localValue = localValueVector.get(this.m_subidx);
/* 35 */           if (this.m_value.type() == 64) {
/* 36 */             paramContext.setFact(localFact);
/* 37 */             paramContext.setToken(paramToken);
/*    */             
/* 39 */             if (!this.m_value.resolveValue(paramContext).equals(Funcall.FALSE)) {
/* 40 */               bool = true;
/*    */             }
/*    */             
/*    */ 
/* 44 */             paramToken = paramToken.prepare(bool);
/* 45 */           } else if (localValue.equals(this.m_value.resolveValue(paramContext))) {
/* 46 */             bool = true;
/*    */           }
/*    */         }
/*    */       }
/*    */       
/*    */ 
/* 52 */       if (bool) {
/* 53 */         passAlong(paramToken, paramContext);
/*    */       }
/* 55 */       return;
/*    */     } catch (JessException localJessException) {
/* 57 */       localJessException.addContext("rule LHS (MTEQ)");
/* 58 */       throw localJessException;
/*    */     } catch (Exception localException) {
/* 60 */       Object localObject = new JessException("Node1MTEQ.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 63 */       ((JessException)localObject).addContext("rule LHS");
/* 64 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 71 */     return "[Test that the multislot entry at index " + this.m_idx + ", subindex " + this.m_subidx + " equals " + this.m_value + ']';
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 77 */     if ((paramObject instanceof Node1MTEQ)) {
/* 78 */       Node1MTEQ localNode1MTEQ = (Node1MTEQ)paramObject;
/* 79 */       if ((this.m_idx == localNode1MTEQ.m_idx) && (this.m_subidx == localNode1MTEQ.m_subidx) && (this.m_value.equals(localNode1MTEQ.m_value))) 0; return true;
/*    */     }
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1MTEQ.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */