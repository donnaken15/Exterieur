/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class SetTripRotation
/*    */   extends SetObjectRotation
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.SetTripRotation;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 11 */     if ((!$noassert) && (paramArrayOfObject.length != 1)) { throw new AssertionError();
/*    */     }
/* 13 */     Object[] arrayOfObject = new Object[4];
/* 14 */     arrayOfObject[0] = new Integer(1);
/* 15 */     arrayOfObject[1] = new Float(0.0D);
/* 16 */     arrayOfObject[2] = paramArrayOfObject[0];
/* 17 */     arrayOfObject[3] = new Float(0.0D);
/* 18 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetTripRotation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */