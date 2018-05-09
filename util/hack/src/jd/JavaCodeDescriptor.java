/*    */ package jd;
/*    */ 
/*    */ public abstract class JavaCodeDescriptor
/*    */ {
/*    */   public abstract String toString();
/*    */   
/*    */   protected static String delimitedList(Object[] paramArrayOfObject, String paramString) {
/*  8 */     if (paramArrayOfObject.length == 0)
/*  9 */       return "";
/* 10 */     if (paramArrayOfObject.length == 1) {
/* 11 */       return (String)paramArrayOfObject[0];
/*    */     }
/* 13 */     StringBuffer localStringBuffer = new StringBuffer();
/* 14 */     for (int i = 0; i < paramArrayOfObject.length - 1; i++) {
/* 15 */       localStringBuffer.append((String)paramArrayOfObject[i] + paramString);
/*    */     }
/* 17 */     localStringBuffer.append((String)paramArrayOfObject[(paramArrayOfObject.length - 1)]);
/* 18 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\JavaCodeDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */