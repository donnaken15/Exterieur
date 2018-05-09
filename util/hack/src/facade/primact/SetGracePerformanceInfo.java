/*    */ package facade.primact;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SetGracePerformanceInfo
/*    */   extends SetPerformanceInfo
/*    */   implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 14 */     Object[] arrayOfObject = new Object[85];
/*    */     
/* 16 */     arrayOfObject[0] = new Integer(0);
/*    */     
/*    */ 
/* 19 */     for (int i = 1; i < 85; i++) {
/* 20 */       arrayOfObject[i] = paramArrayOfObject[(i - 1)];
/*    */     }
/*    */     
/* 23 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetGracePerformanceInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */