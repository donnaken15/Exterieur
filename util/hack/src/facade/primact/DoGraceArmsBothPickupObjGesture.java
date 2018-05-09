/*    */ package facade.primact;
/*    */ 
/*    */ public class DoGraceArmsBothPickupObjGesture extends DoPickupObjGestureAnimation
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject) {
/*  6 */     Object[] arrayOfObject = new Object[5];
/*    */     
/*  8 */     arrayOfObject[0] = new Integer(0);
/*  9 */     arrayOfObject[1] = new Integer(2);
/* 10 */     arrayOfObject[2] = paramArrayOfObject[0];
/* 11 */     arrayOfObject[3] = paramArrayOfObject[1];
/* 12 */     arrayOfObject[4] = paramArrayOfObject[2];
/*    */     
/* 14 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoGraceArmsBothPickupObjGesture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */