/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SetObjectToHold
/*    */   extends PrimitiveAction
/*    */   implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 18 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 19 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 20 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/*    */     
/* 22 */     NativeAnimationInterface.setObjectToHold(i, j, k);
/* 23 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetObjectToHold.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */