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
/*    */ class Progn
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 32 */     return "progn";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 36 */     Value localValue = Funcall.NIL;
/* 37 */     for (int i = 1; i < paramValueVector.size(); i++)
/* 38 */       localValue = paramValueVector.get(i).resolveValue(paramContext);
/* 39 */     return localValue;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Progn.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */