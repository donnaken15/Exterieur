/*    */ package facade.primact;
/*    */ 
/*    */ 
/*    */ public class TripWalk
/*    */   extends Walk
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/*  9 */     Object[] arrayOfObject = new Object[7];
/*    */     
/* 11 */     arrayOfObject[0] = new Integer(1);
/* 12 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 13 */     arrayOfObject[2] = paramArrayOfObject[1];
/* 14 */     arrayOfObject[3] = paramArrayOfObject[2];
/* 15 */     arrayOfObject[4] = paramArrayOfObject[3];
/* 16 */     arrayOfObject[5] = paramArrayOfObject[4];
/* 17 */     arrayOfObject[6] = paramArrayOfObject[5];
/*    */     
/* 19 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\TripWalk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */