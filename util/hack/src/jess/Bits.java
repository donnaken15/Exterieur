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
/*     */ class Bits
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   static final String AND = "bit-and";
/*     */   static final String OR = "bit-or";
/*     */   static final String NOT = "bit-not";
/*     */   private String m_name;
/*     */   
/*     */   Bits(String paramString)
/*     */   {
/* 135 */     this.m_name = paramString;
/*     */   }
/*     */   
/*     */   public String getName() {
/* 139 */     return this.m_name;
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 143 */     int i = paramValueVector.get(1).intValue(paramContext);
/*     */     int j;
/* 145 */     if (this.m_name.equals("bit-and")) {
/* 146 */       for (j = 2; j < paramValueVector.size(); j++)
/* 147 */         i &= paramValueVector.get(j).intValue(paramContext);
/* 148 */     } else if (this.m_name.equals("bit-or")) {
/* 149 */       for (j = 2; j < paramValueVector.size(); j++) {
/* 150 */         i |= paramValueVector.get(j).intValue(paramContext);
/*     */       }
/*     */     } else {
/* 153 */       i ^= 0xFFFFFFFF;
/*     */     }
/* 155 */     return new Value(i, 4);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Bits.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */