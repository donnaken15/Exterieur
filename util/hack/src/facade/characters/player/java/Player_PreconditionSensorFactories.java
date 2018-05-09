/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import abl.runtime.AblRuntimeError;
/*    */ import abl.runtime.SensorActivation;
/*    */ import facade.sensor.HeldObjectsSensor;
/*    */ import facade.sensor.ObjectPositionSensor;
/*    */ import facade.sensor.ObjectRotationSensor;
/*    */ import facade.sensor.PlayerRotationSensor;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ public class Player_PreconditionSensorFactories implements BeatConstants, SpriteID, dramaman.runtime.DramaManagerConstants
/*    */ {
/*    */   public static SensorActivation[] preconditionSensorFactory0(int paramInt)
/*    */   {
/*    */     SensorActivation[] arrayOfSensorActivation;
/* 17 */     switch (paramInt) {
/*    */     case 9: 
/* 19 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new facade.sensor.PlayerPositionSensor(), null), new SensorActivation(new PlayerRotationSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 24 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 21: 
/* 28 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 34 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 22: 
/* 38 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 42 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 25: 
/* 46 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 50 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 35: 
/* 54 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 59 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 40: 
/* 63 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 68 */       return arrayOfSensorActivation;
/*    */     }
/*    */     
/*    */     
/* 72 */     throw new AblRuntimeError("Unexpected behaviorID " + paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_PreconditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */