/*    */ package facade.characters.trip.java;
/*    */ 
/*    */ import abl.runtime.SensorActivation;
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ import facade.util.BackstoryCategories;
/*    */ import facade.util.BeatArguments;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.BeatID;
/*    */ import facade.util.BeatStatus;
/*    */ import facade.util.BodyResource;
/*    */ import facade.util.CrisisAccusations;
/*    */ import facade.util.EpisodicMemoryConstants;
/*    */ import facade.util.GestureBodyPart;
/*    */ import facade.util.MusicDefs;
/*    */ import facade.util.PoseScripts;
/*    */ import facade.util.UniversalScript;
/*    */ 
/*    */ public class Trip_ContextConditionSensorFactories implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, PoseScripts, GestureBodyPart, BodyResource, BeatStatus, BeatConstants, facade.util.ReactionID, facade.util.ReactionConstants, facade.util.DAType, UniversalScript, DramaManagerConstants, facade.util.PlayerGestureID, BeatArguments, BeatID, EpisodicMemoryConstants, BackstoryCategories, CrisisAccusations, facade.util.TherapyGameConstants, MusicDefs
/*    */ {
/*    */   public static SensorActivation[] contextConditionSensorFactory0(int paramInt)
/*    */   {
/* 22 */     switch (paramInt) {
/*    */     case 8583: 
/* 24 */       SensorActivation[] arrayOfSensorActivation = { new SensorActivation(new facade.sensor.TripObjectPickupPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 28 */       return arrayOfSensorActivation;
/*    */     }
/*    */     
/*    */     
/* 32 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\Trip_ContextConditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */