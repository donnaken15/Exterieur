/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class SetPlayerRotation
/*    */   extends SetObjectRotation
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/*  9 */     Object[] arrayOfObject = new Object[4];
/* 10 */     arrayOfObject[0] = new Integer(2);
/* 11 */     arrayOfObject[1] = new Float(0.0D);
/* 12 */     arrayOfObject[2] = paramArrayOfObject[0];
/* 13 */     arrayOfObject[3] = new Float(0.0D);
/* 14 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetPlayerRotation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */