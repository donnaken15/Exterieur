/*    */ package jess;
/*    */ 
/*    */ 
/*    */ class Node1TNEQ
/*    */   extends Node1
/*    */ {
/*    */   private Value m_value;
/*    */   
/*    */   private int m_idx;
/*    */   
/*    */   Node1TNEQ(int paramInt, Value paramValue)
/*    */     throws JessException
/*    */   {
/* 14 */     this.m_value = cleanupBindings(paramValue);
/* 15 */     this.m_idx = paramInt;
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
/* 29 */       if (this.m_value.type() == 64) {
/* 30 */         paramContext.setFact((Fact)localObject);
/* 31 */         paramContext.setToken(paramToken);
/*    */         
/* 33 */         if (this.m_value.resolveValue(paramContext).equals(Funcall.FALSE)) {
/* 34 */           bool = true;
/*    */         }
/*    */         
/* 37 */         paramToken = paramToken.prepare(bool);
/* 38 */       } else if (!((Fact)localObject).get(this.m_idx).equals(this.m_value.resolveValue(paramContext))) {
/* 39 */         bool = true;
/*    */       }
/*    */       
/* 42 */       if (bool) {
/* 43 */         passAlong(paramToken, paramContext);
/*    */       }
/*    */       
/* 46 */       return;
/*    */     } catch (JessException localJessException) {
/* 48 */       localJessException.addContext("rule LHS (TNEQ)");
/* 49 */       throw localJessException;
/*    */     } catch (Exception localException) {
/* 51 */       Object localObject = new JessException("Node1TNEQ.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 54 */       ((JessException)localObject).addContext("rule LHS (TNEQ)");
/* 55 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 61 */     return "[Test that slot at index " + this.m_idx + " is not equal to " + this.m_value + ']';
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 65 */     if ((paramObject instanceof Node1TNEQ)) {
/* 66 */       Node1TNEQ localNode1TNEQ = (Node1TNEQ)paramObject;
/* 67 */       if ((this.m_idx == localNode1TNEQ.m_idx) && (this.m_value.equals(localNode1TNEQ.m_value))) 0; return true;
/*    */     }
/* 69 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1TNEQ.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */