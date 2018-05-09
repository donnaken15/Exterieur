/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PushGracePoseScript
/*    */   extends PushPoseScript
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 11 */     Object[] arrayOfObject = new Object[2];
/*    */     
/* 13 */     arrayOfObject[0] = new Integer(0);
/* 14 */     arrayOfObject[1] = paramArrayOfObject[0];
/*    */     
/* 16 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\PushGracePoseScript.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */