/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.AblRuntimeError;
/*     */ import abl.runtime.BehavingEntity;
/*     */ import abl.runtime.BehavingEntity.BehaviorLibrary;
/*     */ import abl.runtime.CollectionBehavior;
/*     */ import abl.runtime.__BehaviorDesc;
/*     */ import facade.util.BeatConstants;
/*     */ import facade.util.SpriteID;
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public class Player extends BehavingEntity implements BeatConstants, SpriteID, dramaman.runtime.DramaManagerConstants
/*     */ {
/*     */   private final void jdMethod_this()
/*     */   {
/*  16 */     this.g_previousPhysicallyFavoredTime = 0L;
/*  17 */     this.g_physicallyFavorLatencyInMS = 10000L;
/*  18 */     this.g_physicallyFavorObjectLatency = 60;
/*  19 */     this.g_physicallyFavorLookDistance_Medium = 100.0F;
/*  20 */     this.g_physicallyFavorLookDistance_Long = 150.0F;
/*  21 */     this.g_physicallyFavorLookTime = 5; }
/*  22 */   private static final Object[] __$tempObjArray = new Object[1];
/*  23 */   private static final Class[] __$sensorFactoryArgArray = new Class[1];
/*  24 */   private static final Class[] __$behFactoryArgArray = new Class[5];
/*  25 */   private static final Class[] __$preconditionArgArray = new Class[4];
/*  26 */   private static final Class[] __$continuousConditionArgArray = new Class[3];
/*  27 */   private static final Class[] __$stepFactoryArgArray = new Class[3];
/*  28 */   private static final Class[] __$argumentStepExecuteArgArray = new Class[3];
/*  29 */   private static final Class[] __$mentalStepExecuteArgArray = new Class[4];
/*     */   
/*     */   private static final Class __$Player_BehaviorFactories_rfield;
/*     */   
/*     */   static final Method __$behaviorFactory0_rfield;
/*     */   
/*     */   private static final Class __$Player_Preconditions_rfield;
/*     */   
/*     */   static final Method __$precondition0_rfield;
/*     */   
/*     */   private static final Class __$Player_PreconditionSensorFactories_rfield;
/*     */   static final Method __$preconditionSensorFactory0_rfield;
/*     */   private static final Class __$Player_ContextConditions_rfield;
/*     */   static final Method __$contextCondition0_rfield;
/*     */   private static final Class __$Player_ContextConditionSensorFactories_rfield;
/*     */   static final Method __$contextConditionSensorFactory0_rfield;
/*     */   private static final Class __$Player_StepFactories_rfield;
/*     */   static final Method __$stepFactory0_rfield;
/*     */   private static final Class __$Player_ArgumentStepExecute_rfield;
/*     */   
/*     */   static
/*     */   {
/*     */     try
/*     */     {
/*  53 */       __$sensorFactoryArgArray[0] = Integer.TYPE;
/*  54 */       __$behFactoryArgArray[0] = Integer.TYPE;
/*  55 */       __$behFactoryArgArray[1] = __$tempObjArray.getClass();
/*  56 */       __$behFactoryArgArray[2] = Class.forName("java.util.Hashtable");
/*  57 */       __$behFactoryArgArray[3] = Class.forName("abl.runtime.GoalStep");
/*  58 */       __$behFactoryArgArray[4] = Class.forName("java.lang.String");
/*  59 */       __$preconditionArgArray[0] = Integer.TYPE;
/*  60 */       __$preconditionArgArray[1] = __$tempObjArray.getClass();
/*  61 */       __$preconditionArgArray[2] = Class.forName("java.util.Hashtable");
/*  62 */       __$preconditionArgArray[3] = Class.forName("abl.runtime.BehavingEntity");
/*  63 */       __$continuousConditionArgArray[0] = Integer.TYPE;
/*  64 */       __$continuousConditionArgArray[1] = __$tempObjArray.getClass();
/*  65 */       __$continuousConditionArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
/*  66 */       __$stepFactoryArgArray[0] = Integer.TYPE;
/*  67 */       __$stepFactoryArgArray[1] = Class.forName("abl.runtime.Behavior");
/*  68 */       __$stepFactoryArgArray[2] = __$tempObjArray.getClass();
/*  69 */       __$argumentStepExecuteArgArray[0] = Integer.TYPE;
/*  70 */       __$argumentStepExecuteArgArray[1] = __$tempObjArray.getClass();
/*  71 */       __$argumentStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
/*  72 */       __$mentalStepExecuteArgArray[0] = Integer.TYPE;
/*  73 */       __$mentalStepExecuteArgArray[1] = __$tempObjArray.getClass();
/*  74 */       __$mentalStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
/*  75 */       __$mentalStepExecuteArgArray[3] = Class.forName("abl.runtime.MentalStep");
/*  76 */     } catch (Exception localException1) { throw new AblRuntimeError("Error in static initializer", localException1);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/*  81 */       __$Player_BehaviorFactories_rfield = Class.forName("facade.characters.player.java.Player_BehaviorFactories");
/*  82 */       __$behaviorFactory0_rfield = __$Player_BehaviorFactories_rfield.getDeclaredMethod("behaviorFactory0", __$behFactoryArgArray);
/*  83 */       __$behaviorFactory0_rfield.setAccessible(true);
/*     */     } catch (Exception localException2) {
/*  85 */       throw new AblRuntimeError("Error in static initializer", localException2);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/*  90 */       __$Player_Preconditions_rfield = Class.forName("facade.characters.player.java.Player_Preconditions");
/*  91 */       __$precondition0_rfield = __$Player_Preconditions_rfield.getDeclaredMethod("precondition0", __$preconditionArgArray);
/*  92 */       __$precondition0_rfield.setAccessible(true);
/*     */     } catch (Exception localException3) {
/*  94 */       throw new AblRuntimeError("Error in static initializer", localException3);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/*  99 */       __$Player_PreconditionSensorFactories_rfield = Class.forName("facade.characters.player.java.Player_PreconditionSensorFactories");
/* 100 */       __$preconditionSensorFactory0_rfield = __$Player_PreconditionSensorFactories_rfield.getDeclaredMethod("preconditionSensorFactory0", __$sensorFactoryArgArray);
/* 101 */       __$preconditionSensorFactory0_rfield.setAccessible(true);
/*     */     } catch (Exception localException4) {
/* 103 */       throw new AblRuntimeError("Error in static initializer", localException4);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 108 */       __$Player_ContextConditions_rfield = Class.forName("facade.characters.player.java.Player_ContextConditions");
/* 109 */       __$contextCondition0_rfield = __$Player_ContextConditions_rfield.getDeclaredMethod("contextCondition0", __$continuousConditionArgArray);
/* 110 */       __$contextCondition0_rfield.setAccessible(true);
/*     */     } catch (Exception localException5) {
/* 112 */       throw new AblRuntimeError("Error in static initializer", localException5);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 117 */       __$Player_ContextConditionSensorFactories_rfield = Class.forName("facade.characters.player.java.Player_ContextConditionSensorFactories");
/* 118 */       __$contextConditionSensorFactory0_rfield = __$Player_ContextConditionSensorFactories_rfield.getDeclaredMethod("contextConditionSensorFactory0", __$sensorFactoryArgArray);
/* 119 */       __$contextConditionSensorFactory0_rfield.setAccessible(true);
/*     */     } catch (Exception localException6) {
/* 121 */       throw new AblRuntimeError("Error in static initializer", localException6);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 126 */       __$Player_StepFactories_rfield = Class.forName("facade.characters.player.java.Player_StepFactories");
/* 127 */       __$stepFactory0_rfield = __$Player_StepFactories_rfield.getDeclaredMethod("stepFactory0", __$stepFactoryArgArray);
/* 128 */       __$stepFactory0_rfield.setAccessible(true);
/*     */     } catch (Exception localException7) {
/* 130 */       throw new AblRuntimeError("Error in static initializer", localException7);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 135 */       __$Player_ArgumentStepExecute_rfield = Class.forName("facade.characters.player.java.Player_ArgumentStepExecute");
/* 136 */       __$argumentExecute0_rfield = __$Player_ArgumentStepExecute_rfield.getDeclaredMethod("argumentExecute0", __$argumentStepExecuteArgArray);
/* 137 */       __$argumentExecute0_rfield.setAccessible(true);
/*     */     } catch (Exception localException8) {
/* 139 */       throw new AblRuntimeError("Error in static initializer", localException8);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 144 */       __$Player_MentalStepExecute_rfield = Class.forName("facade.characters.player.java.Player_MentalStepExecute");
/* 145 */       __$mentalExecute0_rfield = __$Player_MentalStepExecute_rfield.getDeclaredMethod("mentalExecute0", __$mentalStepExecuteArgArray);
/* 146 */       __$mentalExecute0_rfield.setAccessible(true);
/*     */     } catch (Exception localException9) {
/* 148 */       throw new AblRuntimeError("Error in static initializer", localException9);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 153 */       __$Player_SuccessTests_rfield = Class.forName("facade.characters.player.java.Player_SuccessTests");
/* 154 */       __$successTest0_rfield = __$Player_SuccessTests_rfield.getDeclaredMethod("successTest0", __$continuousConditionArgArray);
/* 155 */       __$successTest0_rfield.setAccessible(true);
/*     */     } catch (Exception localException10) {
/* 157 */       throw new AblRuntimeError("Error in static initializer", localException10);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 162 */       __$Player_SuccessTestSensorFactories_rfield = Class.forName("facade.characters.player.java.Player_SuccessTestSensorFactories");
/* 163 */       __$successTestSensorFactory0_rfield = __$Player_SuccessTestSensorFactories_rfield.getDeclaredMethod("successTestSensorFactory0", __$sensorFactoryArgArray);
/* 164 */       __$successTestSensorFactory0_rfield.setAccessible(true);
/*     */     } catch (Exception localException11) {
/* 166 */       throw new AblRuntimeError("Error in static initializer", localException11);
/*     */     } }
/*     */   
/*     */   static final Method __$argumentExecute0_rfield;
/*     */   
/* 171 */   private static final void registerBehaviors_0(BehavingEntity.BehaviorLibrary paramBehaviorLibrary) { paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(0, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerTranslating()", null, (short)0));
/* 172 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(1, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerTranslating()", null, (short)0));
/* 173 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(2, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerTranslating()", null, (short)0));
/* 174 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(3, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerRotating()", null, (short)0));
/* 175 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(4, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerRotating()", null, (short)0));
/* 176 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(5, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csIsPlayerRotating()", null, (short)0));
/* 177 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(6, __$behaviorFactory0_rfield, null, null, "csPlayerSettled()", null, (short)0));
/* 178 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(7, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csPlayerSettled_Part2()", null, (short)0));
/* 179 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(8, __$behaviorFactory0_rfield, null, null, "InitCSensors()", null, (short)0));
/* 180 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(9, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "CSensorsLowLevel()", null, (short)0));
/* 181 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(10, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)0));
/* 182 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(11, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)0));
/* 183 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(12, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)0));
/* 184 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(13, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)0));
/* 185 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(15, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "TurnOffPhysicallyFavorsWithTimeout_KillSensor(int)", null, (short)0));
/* 186 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(16, __$behaviorFactory0_rfield, null, null, "TurnPhysicallyFavorsBackOnAfterTimeout_Demon(int, int)", null, (short)0));
/* 187 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(17, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "TurnPhysicallyFavorsBackOnAfterTimeout_Demon_Body(int)", null, (short)0));
/* 188 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(19, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "PhysicallyFavorsCSensor_KillTimeoutDemon(int)", null, (short)0));
/* 189 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(20, __$behaviorFactory0_rfield, null, null, "csPlayerPhysicallyFavors_ObjectActivation(int)", null, (short)0));
/* 190 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(21, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "csPlayerPhysicallyFavors_LookAt(int, float)", null, (short)3));
/* 191 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(22, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "csPlayerPhysicallyFavors_LookAt(int, float)", null, (short)2));
/* 192 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(23, __$behaviorFactory0_rfield, null, null, "csPlayerPhysicallyFavors_LookAt(int, float)", null, (short)1));
/* 193 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(24, __$behaviorFactory0_rfield, null, null, "csPlayerPhysicallyFavors_LookAt_Wait(int)", null, (short)0));
/* 194 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(25, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "printDistanceToObject(int)", null, (short)0));
/* 195 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(26, __$behaviorFactory0_rfield, null, null, "csPlayerPhysicallyFavors_CleanupDemon(PhysicallyFavorWME)", null, (short)0));
/* 196 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(27, __$behaviorFactory0_rfield, null, null, "csPlayerPhysicallyFavors_LookAt_PostWMEsDemon()", null, (short)0));
/* 197 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(28, __$behaviorFactory0_rfield, null, null, "csNBeatsSameAffinity(int, int)", null, (short)0));
/* 198 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(29, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csNBeatsSameAffinity_CountBeats(int, int)", null, (short)2));
/* 199 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(30, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csNBeatsSameAffinity_CountBeats(int, int)", null, (short)1));
/* 200 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(31, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "DeleteSameAffinityNBeatsWME(int, int)", null, (short)0));
/* 201 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(32, __$behaviorFactory0_rfield, null, null, "csNBeatsSameAffinity_Trigger(int, int)", null, (short)0));
/* 202 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(35, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "csOneCharacterVisible()", null, (short)0));
/* 203 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(36, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csOneCharacterVisible()", null, (short)0));
/* 204 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(37, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csOneCharacterVisible_NoOneCharacterVisibleWME(boolean, boolean)", null, (short)0));
/* 205 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(38, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "csOneCharacterVisible_NoOneCharacterVisibleWME(boolean, boolean)", null, (short)0));
/* 206 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(39, __$behaviorFactory0_rfield, null, null, "csPlayerUncoop()", null, (short)0));
/* 207 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(40, __$behaviorFactory0_rfield, __$precondition0_rfield, __$preconditionSensorFactory0_rfield, "csPlayerUncoop_Body()", null, (short)0));
/* 208 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(41, __$behaviorFactory0_rfield, null, null, "WaitFor(float)", null, (short)0));
/* 209 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(42, __$behaviorFactory0_rfield, null, null, "WaitFor(int)", null, (short)0));
/* 210 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(43, __$behaviorFactory0_rfield, null, null, "OverallControl()", null, (short)0));
/* 211 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(44, __$behaviorFactory0_rfield, null, null, "OverallControl_Body()", null, (short)0));
/* 212 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(45, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "InitPhysicallyFavors()", null, (short)0));
/* 213 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(46, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "InitPhysicallyFavors_Body(CollectionBehaviorWME, List)", null, (short)2));
/* 214 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(47, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "InitPhysicallyFavors_Body(CollectionBehaviorWME, List)", null, (short)1));
/* 215 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(48, __$behaviorFactory0_rfield, null, null, "Player_RootCollectionBehavior()", null, (short)0)); }
/*     */   
/*     */   private static final Class __$Player_MentalStepExecute_rfield;
/*     */   
/* 219 */   private static final void registerBehaviors_1(BehavingEntity.BehaviorLibrary paramBehaviorLibrary) { paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(14, __$behaviorFactory0_rfield, null, null, "TurnOffPhysicallyFavorsWithTimeout(int, int)", new String[] { "Trip", "Player" }, (short)0));
/* 220 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(18, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "TurnOnPhysicallyFavors(int)", new String[] { "Trip", "Player" }, (short)0));
/* 221 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(33, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "SetOneCharacterVisibleDistance(float)", new String[] { "Player", "Trip" }, (short)2));
/* 222 */     paramBehaviorLibrary.registerBehavior(new __BehaviorDesc(34, __$behaviorFactory0_rfield, null, null, "SetOneCharacterVisibleDistance(float)", new String[] { "Player", "Trip" }, (short)1));
/*     */   }
/*     */   
/* 225 */   public Player() { jdMethod_this();
/* 226 */     this.individualBehaviorLibrary = new BehavingEntity.BehaviorLibrary(this, 90);
/* 227 */     this.jointBehaviorLibrary = new BehavingEntity.BehaviorLibrary(this, 8);
/* 228 */     registerBehaviors_0(this.individualBehaviorLibrary);
/* 229 */     registerBehaviors_1(this.jointBehaviorLibrary);
/* 230 */     this.ABT = ((CollectionBehavior)Player_BehaviorFactories.behaviorFactory0(48, null, null, null, "Player_RootCollectionBehavior()"));
/* 231 */     startWMEReflection(this.ABT);
/* 232 */     this.ABT.initRootBehavior();
/* 233 */     registerEntity("Player", this);
/*     */   }
/*     */   
/*     */   static final Method __$mentalExecute0_rfield;
/*     */   private static final Class __$Player_SuccessTests_rfield;
/*     */   static final Method __$successTest0_rfield;
/*     */   private static final Class __$Player_SuccessTestSensorFactories_rfield;
/*     */   static final Method __$successTestSensorFactory0_rfield;
/*     */   long g_previousPhysicallyFavoredTime;
/*     */   long g_physicallyFavorLatencyInMS;
/*     */   int g_physicallyFavorObjectLatency;
/*     */   float g_physicallyFavorLookDistance_Medium;
/*     */   float g_physicallyFavorLookDistance_Long;
/*     */   int g_physicallyFavorLookTime;
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */