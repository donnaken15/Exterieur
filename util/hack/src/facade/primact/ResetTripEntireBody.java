/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class ResetTripEntireBody
/*    */   extends ResetEntireBody
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.ResetTripEntireBody;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 11 */     if ((!$noassert) && (paramArrayOfObject.length != 0)) { throw new AssertionError();
/*    */     }
/* 13 */     Object[] arrayOfObject = new Object[1];
/* 14 */     arrayOfObject[0] = new Integer(1);
/* 15 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\ResetTripEntireBody.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */