/*    */ package jess;
/*    */ 
/*    */ 
/*    */ class Node1TECT
/*    */   extends Node1
/*    */ {
/*    */   private String m_name;
/*    */   
/*    */ 
/*    */   Node1TECT(String paramString)
/*    */   {
/* 12 */     this.m_name = paramString;
/*    */   }
/*    */   
/*    */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/* 16 */     if (processClearCommand(paramToken, paramContext)) {
/* 17 */       return;
/*    */     }
/*    */     try
/*    */     {
/* 21 */       localObject = paramToken.topFact();
/*    */       boolean bool;
/* 23 */       if (!(bool = this.m_name.equals(((Fact)localObject).getName())))
/*    */       {
/*    */ 
/* 26 */         Deftemplate localDeftemplate = ((Fact)localObject).getDeftemplate();
/* 27 */         localDeftemplate = localDeftemplate.getParent();
/* 28 */         while (localDeftemplate != null) {
/* 29 */           if ((bool = this.m_name.equals(localDeftemplate.getName())))
/*    */             break;
/* 31 */           localDeftemplate = localDeftemplate.getParent();
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/* 37 */       if (bool) {
/* 38 */         passAlong(paramToken, paramContext);
/*    */       }
/* 40 */       return;
/*    */     } catch (JessException localJessException) {
/* 42 */       localJessException.addContext("rule LHS (TECT)");
/* 43 */       throw localJessException;
/*    */     } catch (Exception localException) {
/* 45 */       Object localObject = new JessException("Node1TECT.call", "Error during LHS execution", localException);
/*    */       
/*    */ 
/* 48 */       ((JessException)localObject).addContext("rule LHS (TECT)");
/* 49 */       throw ((Throwable)localObject);
/*    */     }
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 55 */     return "[Test that fact class is " + this.m_name + " or a subclass of type " + this.m_name + ']';
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 59 */     if ((paramObject instanceof Node1TECT)) {
/* 60 */       Node1TECT localNode1TECT = (Node1TECT)paramObject;
/* 61 */       return this.m_name.equals(localNode1TECT.m_name);
/*    */     }
/* 63 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1TECT.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */