/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Min
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/* 120 */     return "min";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 124 */     Value localValue1 = paramValueVector.get(1).resolveValue(paramContext);
/* 125 */     int i = localValue1.type();
/* 126 */     double d1 = localValue1.numericValue(paramContext);
/*     */     
/* 128 */     for (int j = 2; j < paramValueVector.size(); j++) {
/* 129 */       Value localValue2 = paramValueVector.get(j).resolveValue(paramContext);
/* 130 */       if (localValue2.type() == 32) i = 32;
/* 131 */       double d2 = localValue2.numericValue(paramContext);
/* 132 */       if (d2 < d1) {
/* 133 */         d1 = d2;
/*     */       }
/*     */     }
/* 136 */     return new Value(d1, i);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Min.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */