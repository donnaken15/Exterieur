/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PushAnimationScript
/*    */   extends PushMultipleAnimationScripts
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 16 */     Object[] arrayOfObject = new Object[7];
/* 17 */     arrayOfObject[0] = paramArrayOfObject[0];
/* 18 */     arrayOfObject[1] = paramArrayOfObject[1];
/* 19 */     arrayOfObject[2] = new Integer(-1);
/* 20 */     arrayOfObject[3] = new Integer(-1);
/* 21 */     arrayOfObject[4] = new Integer(-1);
/* 22 */     arrayOfObject[5] = paramArrayOfObject[2];
/* 23 */     arrayOfObject[6] = paramArrayOfObject[3];
/* 24 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushAnimationScript.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */