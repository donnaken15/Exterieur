/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import abl.runtime.RuntimeError;
/*    */ import facade.characters.wmedef.ObjectActivationWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.ObjectActivationSensePacket;
/*    */ import facade.util.ObjectActivationSensePacket.ObjectActivationEntry;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ public abstract class ObjectActivationSensor
/*    */   extends FacadeSensor
/*    */   implements SpriteID, BeatConstants
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.ObjectActivationSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 20 */     throw new RuntimeError("Attempt to sense object activation in a precondition");
/*    */   }
/*    */   
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 25 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 26 */     if ((!$noassert) && ((i < 0) || (i > 2))) throw new AssertionError();
/* 27 */     NativeAnimationInterface.resetMyCopyOfAllObjectActivations(i);
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 32 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 33 */     if ((!$noassert) && ((i < 0) || (i > 2))) { throw new AssertionError();
/*    */     }
/* 35 */     ObjectActivationSensePacket localObjectActivationSensePacket = new ObjectActivationSensePacket();
/*    */     
/* 37 */     NativeAnimationInterface.getMyCopyOfAllObjectActivations(i, localObjectActivationSensePacket);
/* 38 */     for (int j = 0; j < 49; j++) {
/* 39 */       ObjectActivationSensePacket.ObjectActivationEntry localObjectActivationEntry = localObjectActivationSensePacket.getActivationInfo(j);
/* 40 */       if (localObjectActivationEntry.activation != -1) {
/* 41 */         BehavingEntity.getBehavingEntity().addWME(new ObjectActivationWME(j, localObjectActivationEntry.activation, localObjectActivationEntry.activatorID));
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ObjectActivationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */