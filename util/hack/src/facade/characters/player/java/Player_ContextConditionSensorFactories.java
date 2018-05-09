/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import abl.runtime.AblRuntimeError;
/*    */ import abl.runtime.SensorActivation;
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ import facade.sensor.HeldObjectsSensor;
/*    */ import facade.sensor.ObjectPositionSensor;
/*    */ import facade.sensor.ObjectRotationSensor;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ public class Player_ContextConditionSensorFactories implements BeatConstants, SpriteID, DramaManagerConstants
/*    */ {
/*    */   public static SensorActivation[] contextConditionSensorFactory0(int paramInt)
/*    */   {
/*    */     SensorActivation[] arrayOfSensorActivation;
/* 17 */     switch (paramInt) {
/*    */     case 21: 
/* 19 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 25 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 22: 
/* 29 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 33 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 23: 
/* 37 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 42 */       return arrayOfSensorActivation;
/*    */     }
/*    */     
/*    */     
/* 46 */     throw new AblRuntimeError("Unexpected behaviorID " + paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_ContextConditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */