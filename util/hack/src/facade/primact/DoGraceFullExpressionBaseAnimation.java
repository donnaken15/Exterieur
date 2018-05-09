/*    */ package facade.primact;
/*    */ 
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DoGraceFullExpressionBaseAnimation
/*    */   extends DoFullExpressionBaseAnimation
/*    */   implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 13 */     Object[] arrayOfObject = new Object[5];
/*    */     
/* 15 */     arrayOfObject[0] = new Integer(0);
/* 16 */     arrayOfObject[1] = paramArrayOfObject[0];
/* 17 */     arrayOfObject[2] = paramArrayOfObject[1];
/* 18 */     arrayOfObject[3] = paramArrayOfObject[2];
/*    */     
/* 20 */     super.execute(arrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoGraceFullExpressionBaseAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */