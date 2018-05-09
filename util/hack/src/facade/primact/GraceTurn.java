/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GraceTurn
/*    */   extends Turn
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 10 */     Object[] arrayOfObject = new Object[2];
/* 11 */     arrayOfObject[0] = new Integer(0);
/* 12 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 13 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\GraceTurn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */