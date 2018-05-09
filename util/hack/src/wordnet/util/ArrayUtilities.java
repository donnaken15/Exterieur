/*    */ package wordnet.util;
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
/*    */ public abstract class ArrayUtilities
/*    */ {
/*    */   public static int indexOf(Object[] paramArrayOfObject, Object paramObject)
/*    */   {
/* 20 */     for (int i = 0; i < paramArrayOfObject.length; i++) {
/* 21 */       if (paramArrayOfObject[i].equals(paramObject)) {
/* 22 */         return i;
/*    */       }
/*    */     }
/* 25 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\util\ArrayUtilities.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */