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
/*    */ class SetFocus
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 38 */     return "focus";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 42 */     Rete localRete = paramContext.getEngine();
/* 43 */     String str1 = localRete.getFocus();
/* 44 */     for (int i = paramValueVector.size() - 1; i > 0; i--) {
/* 45 */       String str2 = paramValueVector.get(i).stringValue(paramContext);
/* 46 */       localRete.setFocus(str2);
/*    */     }
/* 48 */     return new Value(str1, 1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\SetFocus.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */