/*    */ package jess;
/*    */ 
/*    */ 
/*    */ 
/*    */ class Node1LTR
/*    */   extends Node
/*    */ {
/*    */   void callNodeLeft(Token paramToken, Context paramContext)
/*    */     throws JessException
/*    */   {
/* 11 */     broadcastEvent(32768, paramToken);
/* 12 */     passAlong(paramToken, paramContext);
/*    */   }
/*    */   
/*    */   void passAlong(Token paramToken, Context paramContext) throws JessException {
/* 16 */     Node[] arrayOfNode = this.m_succ;
/* 17 */     for (int i = 0; i < this.m_nSucc; i++) {
/* 18 */       Node localNode = arrayOfNode[i];
/*    */       
/* 20 */       localNode.callNodeRight(paramToken, paramContext);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 25 */     return paramObject instanceof Node1LTR;
/*    */   }
/*    */   
/*    */   public String getCompilationTraceToken() {
/* 29 */     return "a";
/*    */   }
/*    */   
/*    */   public String toString() {
/* 33 */     return "[Right input adapter]";
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1LTR.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */