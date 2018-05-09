/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import abl.runtime.AblRuntimeError;
/*    */ import abl.runtime.SensorActivation;
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ import facade.sensor.ObjectPositionSensor;
/*    */ import facade.sensor.ObjectRotationSensor;
/*    */ import facade.sensor.PlayerObjectActivationSensor;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.SpriteID;
/*    */ 
/*    */ public class Player_SuccessTestSensorFactories implements BeatConstants, SpriteID, DramaManagerConstants
/*    */ {
/*    */   public static SensorActivation[] successTestSensorFactory0(int paramInt)
/*    */   {
/*    */     SensorActivation[] arrayOfSensorActivation;
/* 17 */     switch (paramInt) {
/*    */     case 32: 
/* 19 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new PlayerObjectActivationSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 23 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 66: 
/* 27 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 32 */       return arrayOfSensorActivation;
/*    */     
/*    */ 
/*    */     case 68: 
/* 36 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 41 */       return arrayOfSensorActivation;
/*    */     }
/*    */     
/*    */     
/* 45 */     throw new AblRuntimeError("Unexpected stepID " + paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_SuccessTestSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */