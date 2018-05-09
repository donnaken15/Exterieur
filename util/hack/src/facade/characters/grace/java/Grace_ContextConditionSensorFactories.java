/*    */ package facade.characters.grace.java;
/*    */ 
/*    */ import abl.runtime.SensorActivation;
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ import facade.util.BackstoryCategories;
/*    */ import facade.util.BeatArguments;
/*    */ import facade.util.BeatConstants;
/*    */ import facade.util.BeatID;
/*    */ import facade.util.BeatStatus;
/*    */ import facade.util.BodyResource;
/*    */ import facade.util.EpisodicMemoryConstants;
/*    */ import facade.util.GestureBodyPart;
/*    */ import facade.util.PoseScripts;
/*    */ import facade.util.UniversalScript;
/*    */ 
/*    */ public class Grace_ContextConditionSensorFactories implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, PoseScripts, GestureBodyPart, BodyResource, BeatStatus, BeatConstants, facade.util.ReactionConstants, facade.util.DAType, facade.util.ReactionID, UniversalScript, DramaManagerConstants, BeatArguments, BeatID, EpisodicMemoryConstants, BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*    */ {
/*    */   public static SensorActivation[] contextConditionSensorFactory0(int paramInt)
/*    */   {
/* 20 */     switch (paramInt) {
/*    */     case 4688: 
/* 22 */       SensorActivation[] arrayOfSensorActivation = { new SensorActivation(new facade.sensor.GraceObjectPickupPositionSensor(), null) };
/*    */       
/*    */ 
/*    */ 
/* 26 */       return arrayOfSensorActivation;
/*    */     }
/*    */     
/*    */     
/* 30 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\Grace_ContextConditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */