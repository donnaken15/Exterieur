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
/*     */ class InsertMF
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/* 143 */     return "insert$";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 147 */     ValueVector localValueVector1 = paramValueVector.get(1).listValue(paramContext);
/* 148 */     int i = (int)paramValueVector.get(2).numericValue(paramContext);
/*     */     
/* 150 */     if ((i < 1) || (i > localValueVector1.size() + 1)) {
/* 151 */       throw new JessException("insert$", "index must be >= 1 and <= " + (localValueVector1.size() + 1), ": " + i);
/*     */     }
/*     */     
/*     */ 
/* 155 */     ValueVector localValueVector2 = new ValueVector();
/*     */     
/* 157 */     i--;
/* 158 */     for (int j = 0; j < i; j++) {
/* 159 */       localValueVector2.add(localValueVector1.get(j).resolveValue(paramContext));
/*     */     }
/*     */     
/* 162 */     for (j = 3; j < paramValueVector.size(); j++) {
/* 163 */       Value localValue = paramValueVector.get(j).resolveValue(paramContext);
/* 164 */       if (localValue.type() != 512) {
/* 165 */         localValueVector2.add(localValue);
/*     */       } else {
/* 167 */         ValueVector localValueVector3 = localValue.listValue(paramContext);
/* 168 */         for (int k = 0; k < localValueVector3.size(); k++) {
/* 169 */           localValueVector2.add(localValueVector3.get(k).resolveValue(paramContext));
/*     */         }
/*     */       }
/*     */     }
/* 173 */     for (j = i; j < localValueVector1.size(); j++) {
/* 174 */       localValueVector2.add(localValueVector1.get(j).resolveValue(paramContext));
/*     */     }
/*     */     
/* 177 */     return new Value(localValueVector2, 512);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\InsertMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */