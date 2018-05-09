/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.AblNamedPropertySupport;
/*     */ import abl.runtime.AblRuntimeError;
/*     */ import abl.runtime.Behavior;
/*     */ import abl.runtime.GoalStep;
/*     */ import abl.runtime.MentalStep;
/*     */ import abl.runtime.SucceedStep;
/*     */ import abl.runtime.WaitStep;
/*     */ import abl.runtime.__ValueTypes.IntVar;
/*     */ 
/*     */ public class Player_StepFactories implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants
/*     */ {
/*     */   public static abl.runtime.Step stepFactory0(int paramInt, Behavior paramBehavior, Object[] paramArrayOfObject)
/*     */   {
/*     */     AblNamedPropertySupport localAblNamedPropertySupport;
/*  17 */     switch (paramInt)
/*     */     {
/*     */     case -3: 
/*  20 */       return new WaitStep(-3, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null);
/*     */     
/*     */ 
/*     */     case -2: 
/*  24 */       return new abl.runtime.FailStep(-2, paramBehavior, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null);
/*     */     
/*     */ 
/*     */     case -1: 
/*  28 */       return new SucceedStep(-1, paramBehavior, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null);
/*     */     
/*     */ 
/*     */     case 0: 
/*  32 */       return new MentalStep(0, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 1: 
/*  36 */       return new MentalStep(1, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 2: 
/*  40 */       return new MentalStep(2, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 3: 
/*  44 */       return new MentalStep(3, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 4: 
/*  48 */       return new MentalStep(4, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 5: 
/*  52 */       return new MentalStep(5, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 6: 
/*  56 */       return new WaitStep(6, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 7: 
/*  60 */       return new GoalStep(7, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "csPlayerSettled_Part2()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 8: 
/*  64 */       return new GoalStep(8, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 9: 
/*  68 */       return new MentalStep(9, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 10: 
/*  72 */       return new MentalStep(10, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 11: 
/*  76 */       return new MentalStep(11, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 12: 
/*  80 */       return new GoalStep(12, paramBehavior, false, false, false, true, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "csIsPlayerRotating()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 13: 
/*  84 */       return new GoalStep(13, paramBehavior, false, false, false, true, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "csIsPlayerTranslating()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 14: 
/*  88 */       return new MentalStep(14, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 15: 
/*  92 */       return new GoalStep(15, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)1, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_ObjectActivation(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 16: 
/*  96 */       return new GoalStep(16, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_LookAt(int, float)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 17: 
/* 100 */       return new GoalStep(17, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_LookAt(int, float)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 18: 
/* 104 */       return new GoalStep(18, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)1, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_ObjectActivation(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 19: 
/* 108 */       return new MentalStep(19, paramBehavior, false, false, false, false, false, false, (short)40, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 20: 
/* 112 */       return new GoalStep(20, paramBehavior, false, false, false, true, false, false, (short)40, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "TurnOffPhysicallyFavorsWithTimeout_KillSensor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 21: 
/* 116 */       return new GoalStep(21, paramBehavior, false, false, false, true, false, false, (short)40, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "PhysicallyFavorsCSensor_KillTimeoutDemon(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 22: 
/* 120 */       localAblNamedPropertySupport = new AblNamedPropertySupport();
/* 121 */       localAblNamedPropertySupport.setProperty("physicallyFavorsID", new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/*     */       
/* 123 */       return new GoalStep(22, paramBehavior, false, false, false, false, false, false, (short)40, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, localAblNamedPropertySupport, "TurnPhysicallyFavorsBackOnAfterTimeout_Demon(int, int)", null, (short)1);
/*     */     
/*     */ 
/*     */     case 23: 
/* 127 */       return new MentalStep(23, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 24: 
/* 131 */       return new GoalStep(24, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 25: 
/* 135 */       return new MentalStep(25, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 26: 
/* 139 */       return new GoalStep(26, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "TurnPhysicallyFavorsBackOnAfterTimeout_Demon_Body(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 27: 
/* 143 */       localAblNamedPropertySupport = new AblNamedPropertySupport();
/* 144 */       localAblNamedPropertySupport.setProperty("physicallyFavorsID", new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/*     */       
/* 146 */       return new GoalStep(27, paramBehavior, false, false, false, false, false, false, (short)30, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, localAblNamedPropertySupport, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)2);
/*     */     
/*     */ 
/*     */     case 28: 
/* 150 */       return new MentalStep(28, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 29: 
/* 154 */       return new GoalStep(29, paramBehavior, false, false, false, true, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "PhysicallyFavorsCSensor_KillTimeoutDemon(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 30: 
/* 158 */       localAblNamedPropertySupport = new AblNamedPropertySupport();
/* 159 */       localAblNamedPropertySupport.setProperty("physicallyFavorsID", new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/*     */       
/* 161 */       return new GoalStep(30, paramBehavior, false, false, false, false, false, false, (short)30, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, localAblNamedPropertySupport, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)2);
/*     */     
/*     */ 
/*     */     case 31: 
/* 165 */       return new MentalStep(31, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 32: 
/* 169 */       return new WaitStep(32, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, Player.__$successTestSensorFactory0_rfield, null);
/*     */     
/*     */ 
/*     */     case 33: 
/* 173 */       return new MentalStep(33, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 34: 
/* 177 */       return new GoalStep(34, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_CleanupDemon(PhysicallyFavorWME)", null, (short)1);
/*     */     
/*     */ 
/*     */     case 35: 
/* 181 */       return new GoalStep(35, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_LookAt_Wait(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 36: 
/* 185 */       return new MentalStep(36, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 37: 
/* 189 */       return new GoalStep(37, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csPlayerPhysicallyFavors_CleanupDemon(PhysicallyFavorWME)", null, (short)1);
/*     */     
/*     */ 
/*     */     case 38: 
/* 193 */       return new GoalStep(38, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 39: 
/* 197 */       return new WaitStep(39, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 40: 
/* 201 */       return new WaitStep(40, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 41: 
/* 205 */       return new MentalStep(41, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 42: 
/* 209 */       return new GoalStep(42, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 43: 
/* 213 */       return new GoalStep(43, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 44: 
/* 217 */       return new MentalStep(44, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 45: 
/* 221 */       return new WaitStep(45, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 46: 
/* 225 */       return new GoalStep(46, paramBehavior, false, false, false, false, false, false, (short)60, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 47: 
/* 229 */       return new MentalStep(47, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 48: 
/* 233 */       return new MentalStep(48, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)1, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 49: 
/* 237 */       return new GoalStep(49, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csNBeatsSameAffinity_CountBeats(int, int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 50: 
/* 241 */       return new GoalStep(50, paramBehavior, true, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csNBeatsSameAffinity_Trigger(int, int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 51: 
/* 245 */       return new MentalStep(51, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 52: 
/* 249 */       return new WaitStep(52, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 53: 
/* 253 */       return new MentalStep(53, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 54: 
/* 257 */       return new WaitStep(54, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 55: 
/* 261 */       return new MentalStep(55, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 56: 
/* 265 */       return new GoalStep(56, paramBehavior, false, false, false, true, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "DeleteSameAffinityNBeatsWME(int, int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 57: 
/* 269 */       return new WaitStep(57, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 58: 
/* 273 */       return new MentalStep(58, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 59: 
/* 277 */       return new WaitStep(59, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 60: 
/* 281 */       return new MentalStep(60, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 61: 
/* 285 */       return new WaitStep(61, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 62: 
/* 289 */       return new MentalStep(62, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 63: 
/* 293 */       return new MentalStep(63, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 64: 
/* 297 */       return new MentalStep(64, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 65: 
/* 301 */       return new GoalStep(65, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csOneCharacterVisible_NoOneCharacterVisibleWME(boolean, boolean)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 66: 
/* 305 */       return new WaitStep(66, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, Player.__$successTestSensorFactory0_rfield, null);
/*     */     
/*     */ 
/*     */     case 67: 
/* 309 */       return new MentalStep(67, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 68: 
/* 313 */       return new WaitStep(68, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, Player.__$successTestSensorFactory0_rfield, null);
/*     */     
/*     */ 
/*     */     case 69: 
/* 317 */       return new MentalStep(69, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 70: 
/* 321 */       return new MentalStep(70, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 71: 
/* 325 */       return new GoalStep(71, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "csPlayerUncoop_Body()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 72: 
/* 329 */       return new GoalStep(72, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 73: 
/* 333 */       return new MentalStep(73, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 74: 
/* 337 */       return new MentalStep(74, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 75: 
/* 341 */       return new WaitStep(75, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, Player.__$successTest0_rfield, null, null);
/*     */     
/*     */ 
/*     */     case 76: 
/* 345 */       return new MentalStep(76, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 77: 
/* 349 */       return new GoalStep(77, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "WaitFor(float)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 78: 
/* 353 */       return new MentalStep(78, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 79: 
/* 357 */       return new GoalStep(79, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "InitCSensors()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 80: 
/* 361 */       return new MentalStep(80, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 81: 
/* 365 */       return new GoalStep(81, paramBehavior, true, false, false, true, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "OverallControl_Body()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 82: 
/* 369 */       return new GoalStep(82, paramBehavior, true, false, false, false, false, false, (short)-1, (short)0, false, null, null, null, null, null, "CSensorsLowLevel()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 83: 
/* 373 */       return new GoalStep(83, paramBehavior, true, false, false, false, false, false, (short)30, (short)0, false, null, null, null, null, null, "csPlayerSettled()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 84: 
/* 377 */       return new GoalStep(84, paramBehavior, true, false, false, false, false, false, (short)30, (short)0, false, null, null, null, null, null, "csPlayerUncoop()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 85: 
/* 381 */       return new GoalStep(85, paramBehavior, true, false, false, false, false, false, (short)30, (short)0, false, null, null, null, null, null, "csOneCharacterVisible()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 86: 
/* 385 */       return new GoalStep(86, paramBehavior, false, false, false, false, false, false, (short)50, (short)0, false, null, null, null, null, null, "InitPhysicallyFavors()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 87: 
/* 389 */       return new GoalStep(87, paramBehavior, true, false, false, false, false, false, (short)25, (short)0, false, null, null, null, null, null, "csPlayerPhysicallyFavors_LookAt_PostWMEsDemon()", null, (short)0);
/*     */     
/*     */ 
/*     */     case 88: 
/* 393 */       return new GoalStep(88, paramBehavior, false, false, false, false, false, false, (short)25, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "csNBeatsSameAffinity(int, int)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 89: 
/* 397 */       return new MentalStep(89, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 90: 
/* 401 */       return new GoalStep(90, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "InitPhysicallyFavors_Body(CollectionBehaviorWME, List)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 91: 
/* 405 */       return new MentalStep(91, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$mentalExecute0_rfield, null, null, null);
/*     */     
/*     */ 
/*     */     case 92: 
/* 409 */       localAblNamedPropertySupport = new AblNamedPropertySupport();
/* 410 */       localAblNamedPropertySupport.setProperty("physicallyFavorsID", new Integer(((__ValueTypes.IntVar)paramArrayOfObject[3]).i));
/*     */       
/* 412 */       return new GoalStep(92, paramBehavior, false, false, false, false, false, false, (short)30, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, localAblNamedPropertySupport, "csPlayerPhysicallyFavors(int, boolean, boolean, float)", null, (short)2);
/*     */     
/*     */ 
/*     */     case 93: 
/* 416 */       return new GoalStep(93, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, Player.__$argumentExecute0_rfield, null, null, null, "InitPhysicallyFavors_Body(CollectionBehaviorWME, List)", null, (short)0);
/*     */     
/*     */ 
/*     */     case 94: 
/* 420 */       return new GoalStep(94, paramBehavior, false, false, false, false, false, false, (short)Short.MIN_VALUE, (short)0, false, null, null, null, null, null, "OverallControl()", null, (short)0);
/*     */     }
/*     */     
/* 423 */     throw new AblRuntimeError("Unexpected stepID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_StepFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */