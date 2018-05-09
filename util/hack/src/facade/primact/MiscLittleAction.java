/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ public class MiscLittleAction
/*    */   extends PrimitiveAction
/*    */   implements SpriteID
/*    */ {
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 14 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 15 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 16 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/* 17 */     float f = ((Float)paramArrayOfObject[3]).floatValue();
/*    */     
/* 19 */     NativeAnimationInterface.miscLittleAction(i, j, k, f);
/* 20 */     this.completionStatus = 1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\MiscLittleAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */