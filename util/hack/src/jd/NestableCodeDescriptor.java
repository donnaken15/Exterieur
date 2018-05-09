/*    */ package jd;
/*    */ 
/*    */ public abstract class NestableCodeDescriptor extends JavaCodeDescriptor
/*    */ {
/*    */   private static final String tabSpaces = "   ";
/*    */   
/*    */   public abstract String toString(int paramInt);
/*    */   
/*    */   public String toString()
/*    */   {
/* 11 */     return toString(0);
/*    */   }
/*    */   
/*    */   public static String leadingTabs(int paramInt) {
/* 15 */     StringBuffer localStringBuffer = new StringBuffer();
/*    */     
/* 17 */     for (int i = 0; i < paramInt; i++) {
/* 18 */       localStringBuffer.append("   ");
/*    */     }
/* 20 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\NestableCodeDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */