/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class DoGraceArmRPickupObjGesture
/*    */   extends DoPickupObjGestureAnimation
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/*  9 */     Object[] arrayOfObject = new Object[5];
/*    */     
/* 11 */     arrayOfObject[0] = new Integer(0);
/* 12 */     arrayOfObject[1] = new Integer(1);
/* 13 */     arrayOfObject[2] = paramArrayOfObject[0];
/* 14 */     arrayOfObject[3] = paramArrayOfObject[1];
/* 15 */     arrayOfObject[4] = new Integer(-1);
/*    */     
/* 17 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoGraceArmRPickupObjGesture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */