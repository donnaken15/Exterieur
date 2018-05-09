/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class TripReactiveWalk
/*    */   extends ReactiveWalk
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/*  9 */     Object[] arrayOfObject = new Object[3];
/*    */     
/* 11 */     arrayOfObject[0] = new Integer(1);
/* 12 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 13 */     arrayOfObject[2] = paramArrayOfObject[1];
/*    */     
/* 15 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\TripReactiveWalk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */