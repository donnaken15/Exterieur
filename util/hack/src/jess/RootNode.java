/*    */ package jess;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class RootNode
/*    */   extends Node1
/*    */ {
/*    */   void callNodeRight(Token paramToken, Context paramContext)
/*    */     throws JessException
/*    */   {
/* 14 */     passAlong(paramToken, paramContext);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 18 */     return "The root of the Rete network";
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\RootNode.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */