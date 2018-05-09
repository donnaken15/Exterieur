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
/*     */ class StrSimple
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public static final int LENGTH = 0;
/*     */   public static final int UPCASE = 1;
/*     */   public static final int LOWCASE = 2;
/*  98 */   public static final String[] m_names = { "str-length", "upcase", "lowcase" };
/*     */   private int m_name;
/*     */   
/*     */   StrSimple(int paramInt)
/*     */   {
/* 103 */     this.m_name = paramInt;
/*     */   }
/*     */   
/*     */   public String getName() {
/* 107 */     return m_names[this.m_name];
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 111 */     switch (this.m_name) {
/*     */     case 1: 
/* 113 */       return new Value(paramValueVector.get(1).stringValue(paramContext).toUpperCase(), 2);
/*     */     case 2: 
/* 115 */       return new Value(paramValueVector.get(1).stringValue(paramContext).toLowerCase(), 2);
/*     */     case 0: 
/* 117 */       return new Value(paramValueVector.get(1).stringValue(paramContext).length(), 4);
/*     */     }
/* 119 */     return Funcall.NIL;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\StrSimple.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */