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
/*    */ public class SetObjectPosition
/*    */   extends PrimitiveAction
/*    */   implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 17 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 18 */     float f1 = ((Float)paramArrayOfObject[1]).floatValue();
/* 19 */     float f2 = ((Float)paramArrayOfObject[2]).floatValue();
/* 20 */     float f3 = ((Float)paramArrayOfObject[3]).floatValue();
/*    */     
/* 22 */     NativeAnimationInterface.setObjectPosition(i, f1, f2, f3);
/* 23 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\SetObjectPosition.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */