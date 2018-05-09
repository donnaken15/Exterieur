/*    */ package jess;
/*    */ 
/*    */ class Node1MTNEQ
/*    */   extends Node1
/*    */ {
/*    */   private int m_idx;
/*    */   private int m_subidx;
/*    */   private Value m_value;
/*    */   
/*    */   Node1MTNEQ(int paramInt1, int paramInt2, Value paramValue)
/*    */     throws JessException
/*    */   {
/* 13 */     this.m_idx = paramInt1;
/* 14 */     this.m_subidx = paramInt2;
/* 15 */     this.m_value = cleanupBindings(paramValue);
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/* 19 */     if (processClearCommand(paramToken, paramContext))
/* 20 */       return;
/* 21 */     if (paramToken.m_tag == 1) {
/* 22 */       passAlong(paramToken, paramContext);
/* 23 */       return;
/*    */     }
/*    */     try
/*    */     {
/* 27 */       boolean bool = false;
/* 28 */       localObject = paramToken.topFact();
/*    */       Value localValue1;
/* 30 */       if ((localValue1 = ((Fact)localObject).get(this.m_idx)).type() == 512) {
/* 31 */         ValueVector localValueVector = localValue1.listValue(null);
/* 32 */         if (localValueVector.size() >= this.m_subidx)
/*    */         {
/* 34 */           Value localValue2 = localValueVector.get(this.m_subidx);
/* 35 */           if (this.m_value.type() == 64) {
/* 36 */             paramContext.setFact((Fact)localObject);
/* 37 */             paramContext.setToken(paramToken);
/*    */             
/* 39 */             if (this.m_value.resolveValue(paramContext).equals(Funcall.FALSE)) {
/* 40 */               bool = true;
/*    */             }
/*    */             
/* 43 */             paramToken = paramToken.prepare(bool);
/* 44 */           } else if (!localValue2.equals(this.m_value.resolveValue(paramContext))) {
/* 45 */             bool = true;
/*    */           }
/*    */         }
/*    */       }
/* 49 */       if (bool) {
/* 50 */         passAlong(paramToken, paramContext);
/*    */       }
/*    */       
/* 53 */       return;
/*    */     } catch (JessException localJessException) {
/* 55 */       localJessException.addContext("rule LHS (MTNEQ)");
/* 56 */       throw localJessException;
/*    */     } catch (Exception localException) {
/* 58 */       Object localObject = new JessException("Node1MTNEQ.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 61 */       ((JessException)localObject).addContext("rule LHS (MTNEQ)");
/* 62 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 68 */     return "[Test that subslot " + this.m_subidx + " of multislot " + this.m_idx + " does not equal " + this.m_value + ']';
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 73 */     if ((paramObject instanceof Node1MTNEQ)) {
/* 74 */       Node1MTNEQ localNode1MTNEQ = (Node1MTNEQ)paramObject;
/* 75 */       if ((this.m_idx == localNode1MTNEQ.m_idx) && (this.m_subidx == localNode1MTNEQ.m_subidx) && (this.m_value.equals(localNode1MTNEQ.m_value))) 0; return true;
/*    */     }
/* 77 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1MTNEQ.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */