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
/*     */ class ImplodeMF
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/* 119 */     return "implode$";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 123 */     ValueVector localValueVector = paramValueVector.get(1).listValue(paramContext);
/*     */     
/* 125 */     StringBuffer localStringBuffer = new StringBuffer("");
/*     */     
/* 127 */     for (int i = 0; i < localValueVector.size(); i++) {
/* 128 */       localStringBuffer.append(localValueVector.get(i).resolveValue(paramContext) + ' ');
/*     */     }
/*     */     
/* 131 */     String str = localStringBuffer.toString();
/* 132 */     int j = str.length();
/*     */     
/* 134 */     if (j == 0) {
/* 135 */       return new Value(str, 2);
/*     */     }
/* 137 */     return new Value(str.substring(0, j - 1), 2);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ImplodeMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */