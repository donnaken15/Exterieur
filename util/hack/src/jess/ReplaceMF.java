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
/*     */ class ReplaceMF
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/* 215 */     return "replace$";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException
/*     */   {
/* 220 */     ValueVector localValueVector1 = paramValueVector.get(1).listValue(paramContext);
/* 221 */     int i = (int)paramValueVector.get(2).numericValue(paramContext);
/* 222 */     int j = (int)paramValueVector.get(3).numericValue(paramContext);
/*     */     
/* 224 */     if ((i < 1) || (i > localValueVector1.size() + 1) || (j < 1) || (j > localValueVector1.size() + 1) || (i > j))
/*     */     {
/* 226 */       throw new JessException("replace$", "index must be >= 1 and <= " + (localValueVector1.size() + 1), ": " + i + ' ' + j);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 231 */     ValueVector localValueVector2 = new ValueVector();
/*     */     
/*     */ 
/* 234 */     i--;
/* 235 */     j--;
/*     */     
/* 237 */     for (int k = 0; k <= i - 1; k++) {
/* 238 */       localValueVector2.add(localValueVector1.get(k).resolveValue(paramContext));
/*     */     }
/*     */     
/* 241 */     for (k = 4; k < paramValueVector.size(); k++) {
/* 242 */       Value localValue = paramValueVector.get(k).resolveValue(paramContext);
/* 243 */       if (localValue.type() != 512) {
/* 244 */         localValueVector2.add(localValue);
/*     */       } else {
/* 246 */         ValueVector localValueVector3 = localValue.listValue(paramContext);
/* 247 */         for (int m = 0; m < localValueVector3.size(); m++) {
/* 248 */           localValueVector2.add(localValueVector3.get(m).resolveValue(paramContext));
/*     */         }
/*     */       }
/*     */     }
/* 252 */     for (k = j + 1; k < localValueVector1.size(); k++) {
/* 253 */       localValueVector2.add(localValueVector1.get(k).resolveValue(paramContext));
/*     */     }
/*     */     
/* 256 */     return new Value(localValueVector2, 512);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ReplaceMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */