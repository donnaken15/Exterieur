/*    */ package facade.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DramaManagementUtil
/*    */   implements BeatID, DAType
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.util.DramaManagementUtil;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */ 
/*    */ 
/*    */   public static boolean topicAvailable(int paramInt, int[] paramArrayOfInt)
/*    */   {
/* 14 */     if ((!$noassert) && ((paramInt < 58) || (paramInt > 61))) { throw new AssertionError();
/*    */     }
/* 16 */     for (int i = 0; i < paramArrayOfInt.length; i++) {
/* 17 */       if (((paramArrayOfInt[i] >= 9) && (paramArrayOfInt[i] <= 11)) || ((paramArrayOfInt[i] >= 17) && (paramArrayOfInt[i] <= 18) && (paramInt == 59)))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 22 */         return true;
/*    */       }
/* 24 */       if (((paramArrayOfInt[i] >= 12) && (paramArrayOfInt[i] <= 13)) || ((paramArrayOfInt[i] >= 19) && (paramArrayOfInt[i] <= 20) && (paramInt == 60)))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 29 */         return true;
/*    */       }
/* 31 */       if (((paramArrayOfInt[i] >= 14) && (paramArrayOfInt[i] <= 16)) || ((paramArrayOfInt[i] >= 21) && (paramArrayOfInt[i] <= 22) && (paramInt == 61)))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 36 */         return true;
/*    */       }
/*    */     }
/* 39 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\DramaManagementUtil.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */