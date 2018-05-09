/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import abl.runtime.RuntimeError;
/*    */ import facade.characters.wmedef.AnimationCueWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.AnimCueSensePacket;
/*    */ import facade.util.AnimLayer;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AnimationCueSensor
/*    */   extends FacadeSensor
/*    */   implements SpriteID, AnimLayer
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.AnimationCueSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 21 */     throw new RuntimeError("Attempt to sense animation cue in a precondition");
/*    */   }
/*    */   
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 26 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 27 */     if ((!$noassert) && ((i < 0) || (i > 2))) throw new AssertionError();
/* 28 */     NativeAnimationInterface.resetMyCopyOfAllAnimCues(i);
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 33 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 34 */     if ((!$noassert) && ((i < 0) || (i > 2))) { throw new AssertionError();
/*    */     }
/* 36 */     AnimCueSensePacket localAnimCueSensePacket = new AnimCueSensePacket();
/*    */     
/* 38 */     NativeAnimationInterface.getMyCopyOfAllAnimCues(i, localAnimCueSensePacket);
/* 39 */     for (int j = 0; j < 3; j++) {
/* 40 */       for (int k = 0; k < 8; k++) {
/* 41 */         if (localAnimCueSensePacket.getCueInfo(j, k) != -1) {
/* 42 */           BehavingEntity.getBehavingEntity().addWME(new AnimationCueWME(j, k, localAnimCueSensePacket.getCueInfo(j, k)));
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\AnimationCueSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */