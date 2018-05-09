/*     */ package facade.characters.grace.java;
/*     */ 
/*     */ import abl.runtime.SensorActivation;
/*     */ import facade.sensor.GraceAnimationCueSensor;
/*     */ import facade.sensor.HeldObjectsSensor;
/*     */ import facade.sensor.ObjectPositionSensor;
/*     */ import facade.sensor.ObjectRotationSensor;
/*     */ import facade.util.BackstoryCategories;
/*     */ import facade.util.BeatConstants;
/*     */ import facade.util.BeatID;
/*     */ import facade.util.BeatStatus;
/*     */ import facade.util.BodyResource;
/*     */ import facade.util.PoseScripts;
/*     */ 
/*     */ public class Grace_SuccessTestSensorFactories implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, PoseScripts, facade.util.GestureBodyPart, BodyResource, BeatStatus, BeatConstants, facade.util.ReactionConstants, facade.util.DAType, facade.util.ReactionID, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.BeatArguments, BeatID, facade.util.EpisodicMemoryConstants, BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*     */ {
/*     */   public static SensorActivation[] successTestSensorFactory0(int paramInt)
/*     */   {
/*     */     SensorActivation[] arrayOfSensorActivation;
/*  20 */     switch (paramInt) {
/*     */     case 52: 
/*  22 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  27 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 9104: 
/*  31 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  35 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 9106: 
/*  39 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  43 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 9420: 
/*  47 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  51 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 9422: 
/*  55 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  59 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16117: 
/*  63 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  67 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16121: 
/*  71 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  75 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16126: 
/*  79 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  83 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16131: 
/*  87 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  91 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16142: 
/*  95 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  99 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16153: 
/* 103 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 107 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16154: 
/* 111 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceAnimationCueSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 115 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16301: 
/* 119 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 123 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16325: 
/* 127 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 131 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16369: 
/* 135 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 140 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16387: 
/* 144 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 148 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 16487: 
/* 152 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 156 */       return arrayOfSensorActivation;
/*     */     }
/*     */     
/*     */     
/* 160 */     throw new abl.runtime.AblRuntimeError("Unexpected stepID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\Grace_SuccessTestSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */