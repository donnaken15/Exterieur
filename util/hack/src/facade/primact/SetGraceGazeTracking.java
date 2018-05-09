/*    */ package facade.primact;
/*    */ 
/*    */ public class SetGraceGazeTracking
/*    */   extends SetGazeTracking
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.primact.SetGraceGazeTracking;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 10 */     if ((!$noassert) && (paramArrayOfObject.length != 4) && (paramArrayOfObject.length != 6)) { throw new AssertionError();
/*    */     }
/* 12 */     Object[] arrayOfObject = new Object[paramArrayOfObject.length + 1];
/* 13 */     arrayOfObject[0] = new Integer(0);
/* 14 */     for (int i = 0; i < paramArrayOfObject.length; i++) {
/* 15 */       arrayOfObject[(i + 1)] = paramArrayOfObject[i];
/*    */     }
/* 17 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetGraceGazeTracking.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */