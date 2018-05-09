/*    */ package facade.primact;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ public class DoTripTwoArmGesture extends DoTwoArmGestureAnimation implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject) {
/*  8 */     Object[] arrayOfObject = new Object[3];
/*    */     
/* 10 */     arrayOfObject[0] = new Integer(1);
/* 11 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 12 */     arrayOfObject[2] = paramArrayOfObject[1];
/*    */     
/* 14 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoTripTwoArmGesture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */