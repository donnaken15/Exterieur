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
/*    */ class DeleteMF
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 78 */     return "delete$";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 82 */     ValueVector localValueVector1 = new ValueVector();
/*    */     
/* 84 */     ValueVector localValueVector2 = paramValueVector.get(1).listValue(paramContext);
/* 85 */     int i = (int)paramValueVector.get(2).numericValue(paramContext);
/* 86 */     int j = (int)paramValueVector.get(3).numericValue(paramContext);
/*    */     
/* 88 */     if ((j < i) || (i < 1) || (j > localValueVector2.size())) {
/* 89 */       throw new JessException("delete$", "invalid range", "(" + i + ',' + j + ')');
/*    */     }
/*    */     
/* 92 */     for (int k = 0; k < localValueVector2.size(); k++) {
/* 93 */       if ((k < i - 1) || (k > j - 1))
/*    */       {
/*    */ 
/* 96 */         localValueVector1.add(localValueVector2.get(k).resolveValue(paramContext));
/*    */       }
/*    */     }
/* 99 */     return new Value(localValueVector1, 512);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\DeleteMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */