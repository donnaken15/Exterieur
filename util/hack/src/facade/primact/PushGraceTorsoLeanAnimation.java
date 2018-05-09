/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PushGraceTorsoLeanAnimation
/*    */   extends PushAnimationScript
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 12 */     Object[] arrayOfObject = new Object[4];
/*    */     
/* 14 */     arrayOfObject[0] = new Integer(0);
/* 15 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 16 */     arrayOfObject[2] = new Integer(2);
/* 17 */     if (paramArrayOfObject.length == 2) {
/* 18 */       arrayOfObject[3] = paramArrayOfObject[1];
/*    */     } else {
/* 20 */       arrayOfObject[3] = new Boolean(true);
/*    */     }
/* 22 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushGraceTorsoLeanAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */