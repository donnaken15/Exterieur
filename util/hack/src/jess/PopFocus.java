/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class PopFocus
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 65 */     return "pop-focus";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 69 */     String str = paramContext.getEngine().popFocus(null);
/* 70 */     return new Value(str, 1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\PopFocus.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */