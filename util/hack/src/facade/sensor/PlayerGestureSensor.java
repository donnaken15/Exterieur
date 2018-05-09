/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import abl.runtime.RuntimeError;
/*    */ import facade.characters.wmedef.PlayerGestureWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.AnimLayer;
/*    */ import facade.util.IntegerRef;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ public class PlayerGestureSensor
/*    */   extends FacadeSensor
/*    */   implements SpriteID, AnimLayer
/*    */ {
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 18 */     throw new RuntimeError("Attempt to sense player gesture in a precondition");
/*    */   }
/*    */   
/*    */ 
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 24 */     IntegerRef localIntegerRef1 = new IntegerRef(-1);
/* 25 */     IntegerRef localIntegerRef2 = new IntegerRef(-1);
/* 26 */     IntegerRef localIntegerRef3 = new IntegerRef(-1);
/*    */     
/* 28 */     NativeAnimationInterface.getPlayerGesture(localIntegerRef1, localIntegerRef2, localIntegerRef3);
/* 29 */     BehavingEntity.getBehavingEntity().deleteAllWMEClass("PlayerGestureWME");
/* 30 */     if (localIntegerRef1.i != -1) {
/* 31 */       BehavingEntity.getBehavingEntity().addWME(new PlayerGestureWME(localIntegerRef1.i, localIntegerRef2.i, localIntegerRef3.i));
/*    */     }
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject) {
/* 36 */     IntegerRef localIntegerRef1 = new IntegerRef(-1);
/* 37 */     IntegerRef localIntegerRef2 = new IntegerRef(-1);
/* 38 */     IntegerRef localIntegerRef3 = new IntegerRef(-1);
/*    */     
/* 40 */     NativeAnimationInterface.getPlayerGesture(localIntegerRef1, localIntegerRef2, localIntegerRef3);
/* 41 */     if (localIntegerRef1.i != -1) {
/* 42 */       BehavingEntity.getBehavingEntity().addWME(new PlayerGestureWME(localIntegerRef1.i, localIntegerRef2.i, localIntegerRef3.i));
/*    */     }
/*    */     
/*    */     try
/*    */     {
/* 47 */       Thread.currentThread();Thread.sleep(33L);
/* 48 */     } catch (InterruptedException localInterruptedException) { throw new RuntimeError("Unexpected interruption");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\PlayerGestureSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */