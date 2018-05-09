/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PushTripArmRGestureAnimation
/*    */   extends PushAnimationScript
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 13 */     Object[] arrayOfObject = new Object[4];
/*    */     
/* 15 */     arrayOfObject[0] = new Integer(1);
/* 16 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 17 */     arrayOfObject[2] = new Integer(5);
/* 18 */     if (paramArrayOfObject.length == 2) {
/* 19 */       arrayOfObject[3] = paramArrayOfObject[1];
/*    */     } else {
/* 21 */       arrayOfObject[3] = new Boolean(true);
/*    */     }
/* 23 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushTripArmRGestureAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */