/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.ObjectWrapper;
/*     */ import abl.runtime.SequentialBehavior;
/*     */ import abl.runtime.__StepDesc;
/*     */ import abl.runtime.__ValueTypes.FloatVar;
/*     */ import abl.runtime.__ValueTypes.IntVar;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class Player_BehaviorFactories implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants
/*     */ {
/*     */   public static abl.runtime.Behavior behaviorFactory0(int paramInt, Object[] paramArrayOfObject, Hashtable paramHashtable, abl.runtime.GoalStep paramGoalStep, String paramString)
/*     */   {
/*     */     Object localObject;
/*     */     __StepDesc[] arrayOf__StepDesc;
/*     */     abl.runtime.BehavingEntity[] arrayOfBehavingEntity;
/*  17 */     switch (paramInt)
/*     */     {
/*     */     case 0: 
/*  20 */       localObject = new Object[2];
/*  21 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX"));
/*  22 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ"));
/*     */       
/*  24 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(0, Player.__$stepFactory0_rfield) };
/*  25 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 0, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 1: 
/*  29 */       localObject = new Object[8];
/*  30 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ2"));
/*  31 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ1"));
/*  32 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("settledWME")).objectValue();
/*  33 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX2"));
/*  34 */       localObject[4] = ((ObjectWrapper)paramHashtable.get("prevWME")).objectValue();
/*  35 */       localObject[5] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX1"));
/*  36 */       localObject[6] = ((ObjectWrapper)paramHashtable.get("movWME")).objectValue();
/*  37 */       localObject[7] = ((ObjectWrapper)paramHashtable.get("transWME")).objectValue();
/*     */       
/*  39 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(1, Player.__$stepFactory0_rfield) };
/*  40 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 1, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 2: 
/*  44 */       localObject = new Object[8];
/*  45 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ2"));
/*  46 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ1"));
/*  47 */       localObject[2] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX2"));
/*  48 */       localObject[3] = ((ObjectWrapper)paramHashtable.get("prevWME")).objectValue();
/*  49 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX1"));
/*  50 */       localObject[5] = ((ObjectWrapper)paramHashtable.get("movWME")).objectValue();
/*  51 */       localObject[6] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("bRotating"));
/*  52 */       localObject[7] = ((ObjectWrapper)paramHashtable.get("transWME")).objectValue();
/*     */       
/*  54 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(2, Player.__$stepFactory0_rfield) };
/*  55 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 2, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 3: 
/*  59 */       localObject = new Object[1];
/*  60 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot"));
/*     */       
/*  62 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(3, Player.__$stepFactory0_rfield) };
/*  63 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 3, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 4: 
/*  67 */       localObject = new Object[6];
/*  68 */       localObject[0] = ((ObjectWrapper)paramHashtable.get("settledWME")).objectValue();
/*  69 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot1"));
/*  70 */       localObject[2] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot2"));
/*  71 */       localObject[3] = ((ObjectWrapper)paramHashtable.get("prevWME")).objectValue();
/*  72 */       localObject[4] = ((ObjectWrapper)paramHashtable.get("movWME")).objectValue();
/*  73 */       localObject[5] = ((ObjectWrapper)paramHashtable.get("rotWME")).objectValue();
/*     */       
/*  75 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(4, Player.__$stepFactory0_rfield) };
/*  76 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 4, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 5: 
/*  80 */       localObject = new Object[6];
/*  81 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot1"));
/*  82 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot2"));
/*  83 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("prevWME")).objectValue();
/*  84 */       localObject[3] = ((ObjectWrapper)paramHashtable.get("movWME")).objectValue();
/*  85 */       localObject[4] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("bTranslating"));
/*  86 */       localObject[5] = ((ObjectWrapper)paramHashtable.get("rotWME")).objectValue();
/*     */       
/*  88 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(5, Player.__$stepFactory0_rfield) };
/*  89 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 5, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 6: 
/*  94 */       localObject = new __StepDesc[] { new __StepDesc(6, Player.__$stepFactory0_rfield), new __StepDesc(7, Player.__$stepFactory0_rfield) };
/*  95 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 6, null, (__StepDesc[])localObject);
/*     */     
/*     */ 
/*     */     case 7: 
/*  99 */       localObject = new Object[1];
/* 100 */       localObject[0] = ((ObjectWrapper)paramHashtable.get("settledWME")).objectValue();
/*     */       
/* 102 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(8, Player.__$stepFactory0_rfield), new __StepDesc(9, Player.__$stepFactory0_rfield) };
/* 103 */       return new SequentialBehavior(paramGoalStep, Player.__$contextCondition0_rfield, null, false, paramString, (short)0, 7, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 8: 
/* 108 */       localObject = new __StepDesc[] { new __StepDesc(10, Player.__$stepFactory0_rfield) };
/* 109 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 8, null, (__StepDesc[])localObject);
/*     */     
/*     */ 
/*     */     case 9: 
/* 113 */       localObject = new Object[10];
/* 114 */       localObject[0] = new abl.runtime.__ValueTypes.LongVar();
/* 115 */       localObject[1] = new __ValueTypes.FloatVar();
/* 116 */       localObject[2] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerXPos"));
/* 117 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYRot"));
/* 118 */       localObject[4] = ((ObjectWrapper)paramHashtable.get("cachedPlayerPositionWME")).objectValue();
/* 119 */       localObject[5] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerYPos"));
/* 120 */       localObject[6] = ((ObjectWrapper)paramHashtable.get("playerFutureRotationWME")).objectValue();
/* 121 */       localObject[7] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZPos"));
/* 122 */       localObject[8] = ((ObjectWrapper)paramHashtable.get("cachedPlayerRotationWME")).objectValue();
/* 123 */       localObject[9] = ((ObjectWrapper)paramHashtable.get("playerFuturePositionWME")).objectValue();
/*     */       
/* 125 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(11, Player.__$stepFactory0_rfield), new __StepDesc(12, Player.__$stepFactory0_rfield), new __StepDesc(13, Player.__$stepFactory0_rfield), new __StepDesc(14, Player.__$stepFactory0_rfield) };
/* 126 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 9, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 10: 
/* 130 */       localObject = new Object[4];
/* 131 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 132 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/* 133 */       localObject[2] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[2]);
/* 134 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[3]);
/*     */       
/* 136 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(15, Player.__$stepFactory0_rfield), new __StepDesc(16, Player.__$stepFactory0_rfield) };
/* 137 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 10, (Object[])localObject, arrayOf__StepDesc, 2);
/*     */     
/*     */ 
/*     */     case 11: 
/* 141 */       localObject = new Object[4];
/* 142 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 143 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/* 144 */       localObject[2] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[2]);
/* 145 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[3]);
/*     */       
/* 147 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(17, Player.__$stepFactory0_rfield) };
/* 148 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 11, (Object[])localObject, arrayOf__StepDesc, 1);
/*     */     
/*     */ 
/*     */     case 12: 
/* 152 */       localObject = new Object[4];
/* 153 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 154 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/* 155 */       localObject[2] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[2]);
/* 156 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[3]);
/*     */       
/* 158 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(18, Player.__$stepFactory0_rfield) };
/* 159 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 12, (Object[])localObject, arrayOf__StepDesc, 1);
/*     */     
/*     */ 
/*     */     case 13: 
/* 163 */       localObject = new Object[4];
/* 164 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 165 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/* 166 */       localObject[2] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[2]);
/* 167 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[3]);
/*     */       
/* 169 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(-1, Player.__$stepFactory0_rfield) };
/* 170 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 13, (Object[])localObject, arrayOf__StepDesc, 1);
/*     */     
/*     */ 
/*     */     case 14: 
/* 174 */       localObject = new Object[2];
/* 175 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 176 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/*     */       
/* 178 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(19, Player.__$stepFactory0_rfield), new __StepDesc(20, Player.__$stepFactory0_rfield), new __StepDesc(21, Player.__$stepFactory0_rfield), new __StepDesc(22, Player.__$stepFactory0_rfield) };
/* 179 */       arrayOfBehavingEntity = new abl.runtime.BehavingEntity[] { abl.runtime.BehavingEntity.getBehavingEntity("Trip"), abl.runtime.BehavingEntity.getBehavingEntity("Player") };
/* 180 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 14, (Object[])localObject, arrayOf__StepDesc, arrayOfBehavingEntity);
/*     */     
/*     */ 
/*     */     case 15: 
/* 184 */       localObject = new Object[3];
/* 185 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 186 */       localObject[1] = ((ObjectWrapper)paramHashtable.get("gWME")).objectValue();
/* 187 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("objID")).objectValue();
/*     */       
/* 189 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(23, Player.__$stepFactory0_rfield) };
/* 190 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 15, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 16: 
/* 194 */       localObject = new Object[2];
/* 195 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 196 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/*     */       
/* 198 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(24, Player.__$stepFactory0_rfield), new __StepDesc(25, Player.__$stepFactory0_rfield), new __StepDesc(26, Player.__$stepFactory0_rfield) };
/* 199 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 16, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 17: 
/* 203 */       localObject = new Object[5];
/* 204 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 205 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("lookActive"));
/* 206 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("overallControl_Body")).objectValue();
/* 207 */       localObject[3] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("objectActivateActive"));
/* 208 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("lDistance"));
/*     */       
/* 210 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(27, Player.__$stepFactory0_rfield) };
/* 211 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 17, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 18: 
/* 215 */       localObject = new Object[5];
/* 216 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 217 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("lookActive"));
/* 218 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("overallControl_Body")).objectValue();
/* 219 */       localObject[3] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("objectActivateActive"));
/* 220 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("lDistance"));
/*     */       
/* 222 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(28, Player.__$stepFactory0_rfield), new __StepDesc(29, Player.__$stepFactory0_rfield), new __StepDesc(30, Player.__$stepFactory0_rfield) };
/* 223 */       arrayOfBehavingEntity = new abl.runtime.BehavingEntity[] { abl.runtime.BehavingEntity.getBehavingEntity("Trip"), abl.runtime.BehavingEntity.getBehavingEntity("Player") };
/* 224 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 18, (Object[])localObject, arrayOf__StepDesc, arrayOfBehavingEntity);
/*     */     
/*     */ 
/*     */     case 19: 
/* 228 */       localObject = new Object[3];
/* 229 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 230 */       localObject[1] = ((ObjectWrapper)paramHashtable.get("gWME")).objectValue();
/* 231 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("objID")).objectValue();
/*     */       
/* 233 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(31, Player.__$stepFactory0_rfield) };
/* 234 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 19, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 20: 
/* 238 */       localObject = new Object[2];
/* 239 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/*     */       
/* 241 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(32, Player.__$stepFactory0_rfield), new __StepDesc(33, Player.__$stepFactory0_rfield), new __StepDesc(34, Player.__$stepFactory0_rfield) };
/* 242 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 20, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 21: 
/* 246 */       localObject = new Object[12];
/* 247 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 248 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[1]);
/* 249 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("graceX"));
/* 250 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerRotY"));
/* 251 */       localObject[5] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX"));
/* 252 */       localObject[6] = new __ValueTypes.FloatVar((Float)paramHashtable.get("graceZ"));
/* 253 */       localObject[7] = new __ValueTypes.FloatVar((Float)paramHashtable.get("tripZ"));
/* 254 */       localObject[8] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ"));
/* 255 */       localObject[9] = new __ValueTypes.FloatVar((Float)paramHashtable.get("objZ"));
/* 256 */       localObject[10] = new __ValueTypes.FloatVar((Float)paramHashtable.get("tripX"));
/* 257 */       localObject[11] = new __ValueTypes.FloatVar((Float)paramHashtable.get("objX"));
/*     */       
/* 259 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(35, Player.__$stepFactory0_rfield), new __StepDesc(36, Player.__$stepFactory0_rfield), new __StepDesc(37, Player.__$stepFactory0_rfield) };
/* 260 */       return new SequentialBehavior(paramGoalStep, Player.__$contextCondition0_rfield, Player.__$contextConditionSensorFactory0_rfield, false, paramString, (short)3, 21, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 22: 
/* 264 */       localObject = new Object[2];
/* 265 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 266 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[1]);
/*     */       
/* 268 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(-3, Player.__$stepFactory0_rfield) };
/* 269 */       return new SequentialBehavior(paramGoalStep, Player.__$contextCondition0_rfield, Player.__$contextConditionSensorFactory0_rfield, false, paramString, (short)2, 22, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 23: 
/* 273 */       localObject = new Object[16];
/* 274 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 275 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[1]);
/* 276 */       localObject[2] = new __ValueTypes.FloatVar();
/* 277 */       localObject[3] = new abl.runtime.__ValueTypes.BooleanVar();
/* 278 */       localObject[4] = new abl.runtime.__ValueTypes.BooleanVar();
/* 279 */       localObject[5] = new abl.runtime.__ValueTypes.BooleanVar();
/* 280 */       localObject[6] = new abl.runtime.__ValueTypes.LongVar();
/* 281 */       localObject[7] = new __ValueTypes.FloatVar();
/* 282 */       localObject[8] = new __ValueTypes.FloatVar();
/* 283 */       localObject[9] = new __ValueTypes.FloatVar();
/* 284 */       localObject[10] = new __ValueTypes.FloatVar();
/* 285 */       localObject[11] = new __ValueTypes.FloatVar();
/* 286 */       localObject[12] = new __ValueTypes.FloatVar();
/* 287 */       localObject[13] = new __ValueTypes.FloatVar();
/* 288 */       localObject[14] = new __ValueTypes.FloatVar();
/* 289 */       localObject[15] = new __ValueTypes.FloatVar();
/*     */       
/* 291 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(-3, Player.__$stepFactory0_rfield) };
/* 292 */       return new SequentialBehavior(paramGoalStep, Player.__$contextCondition0_rfield, Player.__$contextConditionSensorFactory0_rfield, false, paramString, (short)1, 23, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 24: 
/* 296 */       localObject = new Object[1];
/* 297 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/*     */       
/* 299 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(38, Player.__$stepFactory0_rfield), new __StepDesc(39, Player.__$stepFactory0_rfield), new __StepDesc(40, Player.__$stepFactory0_rfield) };
/* 300 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 24, (Object[])localObject, arrayOf__StepDesc, 3);
/*     */     
/*     */ 
/*     */     case 25: 
/* 304 */       localObject = new Object[5];
/* 305 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 306 */       localObject[1] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX"));
/* 307 */       localObject[2] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ"));
/* 308 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("objZ"));
/* 309 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("objX"));
/*     */       
/* 311 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(41, Player.__$stepFactory0_rfield), new __StepDesc(42, Player.__$stepFactory0_rfield) };
/* 312 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 25, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 26: 
/* 316 */       localObject = new Object[1];
/* 317 */       localObject[0] = ((facade.characters.wmedef.PhysicallyFavorWME)paramArrayOfObject[0]);
/*     */       
/* 319 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(43, Player.__$stepFactory0_rfield), new __StepDesc(44, Player.__$stepFactory0_rfield) };
/* 320 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 26, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 27: 
/* 325 */       localObject = new __StepDesc[] { new __StepDesc(45, Player.__$stepFactory0_rfield), new __StepDesc(46, Player.__$stepFactory0_rfield), new __StepDesc(47, Player.__$stepFactory0_rfield) };
/* 326 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 27, null, (__StepDesc[])localObject);
/*     */     
/*     */ 
/*     */     case 28: 
/* 330 */       localObject = new Object[2];
/* 331 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 332 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/*     */       
/* 334 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(48, Player.__$stepFactory0_rfield), new __StepDesc(49, Player.__$stepFactory0_rfield), new __StepDesc(50, Player.__$stepFactory0_rfield) };
/* 335 */       return new abl.runtime.ParallelBehavior(paramGoalStep, null, null, false, paramString, (short)0, 28, (Object[])localObject, arrayOf__StepDesc, 3);
/*     */     
/*     */ 
/*     */     case 29: 
/* 339 */       localObject = new Object[6];
/* 340 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 341 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/* 342 */       dramaman.runtime.DramaManager.getDramaManager();localObject[2] = dramaman.runtime.DramaManager.getStoryMemory();
/* 343 */       localObject[3] = new abl.runtime.__ValueTypes.LongVar();
/* 344 */       localObject[4] = new __ValueTypes.IntVar((Integer)paramHashtable.get("currentAffinity"));
/* 345 */       localObject[5] = ((ObjectWrapper)paramHashtable.get("affinityCounter")).objectValue();
/*     */       
/* 347 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(51, Player.__$stepFactory0_rfield), new __StepDesc(52, Player.__$stepFactory0_rfield), new __StepDesc(53, Player.__$stepFactory0_rfield), new __StepDesc(54, Player.__$stepFactory0_rfield) };
/* 348 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)2, 29, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 30: 
/* 352 */       localObject = new Object[4];
/* 353 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 354 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/* 355 */       localObject[2] = new __ValueTypes.IntVar((Integer)paramHashtable.get("currentAffinity"));
/* 356 */       localObject[3] = ((ObjectWrapper)paramHashtable.get("affinityCounter")).objectValue();
/*     */       
/* 358 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(55, Player.__$stepFactory0_rfield), new __StepDesc(56, Player.__$stepFactory0_rfield), new __StepDesc(57, Player.__$stepFactory0_rfield) };
/* 359 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)1, 30, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 31: 
/* 363 */       localObject = new Object[3];
/* 364 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 365 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/* 366 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("sameAffinityWME")).objectValue();
/*     */       
/* 368 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(58, Player.__$stepFactory0_rfield) };
/* 369 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 31, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 32: 
/* 373 */       localObject = new Object[2];
/* 374 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 375 */       localObject[1] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[1]);
/*     */       
/* 377 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(59, Player.__$stepFactory0_rfield), new __StepDesc(60, Player.__$stepFactory0_rfield), new __StepDesc(61, Player.__$stepFactory0_rfield) };
/* 378 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 32, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 33: 
/* 382 */       localObject = new Object[2];
/* 383 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[0]);
/* 384 */       localObject[1] = ((ObjectWrapper)paramHashtable.get("oneCharacterVisibleInfoWME")).objectValue();
/*     */       
/* 386 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(62, Player.__$stepFactory0_rfield) };
/* 387 */       arrayOfBehavingEntity = new abl.runtime.BehavingEntity[] { abl.runtime.BehavingEntity.getBehavingEntity("Player"), abl.runtime.BehavingEntity.getBehavingEntity("Trip") };
/* 388 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)2, 33, (Object[])localObject, arrayOf__StepDesc, arrayOfBehavingEntity);
/*     */     
/*     */ 
/*     */     case 34: 
/* 392 */       localObject = new Object[1];
/* 393 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[0]);
/*     */       
/* 395 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(63, Player.__$stepFactory0_rfield) };
/* 396 */       arrayOfBehavingEntity = new abl.runtime.BehavingEntity[] { abl.runtime.BehavingEntity.getBehavingEntity("Player"), abl.runtime.BehavingEntity.getBehavingEntity("Trip") };
/* 397 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)1, 34, (Object[])localObject, arrayOf__StepDesc, arrayOfBehavingEntity);
/*     */     
/*     */ 
/*     */     case 35: 
/* 401 */       localObject = new Object[10];
/* 402 */       localObject[0] = new abl.runtime.__ValueTypes.BooleanVar();
/* 403 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar();
/* 404 */       localObject[2] = new __ValueTypes.FloatVar((Float)paramHashtable.get("graceX"));
/* 405 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerRotY"));
/* 406 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX"));
/* 407 */       localObject[5] = new __ValueTypes.FloatVar((Float)paramHashtable.get("graceZ"));
/* 408 */       localObject[6] = new __ValueTypes.FloatVar((Float)paramHashtable.get("tripZ"));
/* 409 */       localObject[7] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ"));
/* 410 */       localObject[8] = new __ValueTypes.FloatVar((Float)paramHashtable.get("tripX"));
/* 411 */       localObject[9] = new __ValueTypes.FloatVar((Float)paramHashtable.get("lookDistance"));
/*     */       
/* 413 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(64, Player.__$stepFactory0_rfield), new __StepDesc(65, Player.__$stepFactory0_rfield) };
/* 414 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 35, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 36: 
/* 418 */       localObject = new Object[4];
/* 419 */       localObject[0] = new abl.runtime.__ValueTypes.BooleanVar();
/* 420 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar();
/* 421 */       localObject[2] = ((ObjectWrapper)paramHashtable.get("visibleWME")).objectValue();
/* 422 */       localObject[3] = new __ValueTypes.IntVar((Integer)paramHashtable.get("charID"));
/*     */       
/* 424 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(66, Player.__$stepFactory0_rfield), new __StepDesc(67, Player.__$stepFactory0_rfield) };
/* 425 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 36, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 37: 
/* 429 */       localObject = new Object[2];
/* 430 */       localObject[0] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[0]);
/* 431 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/*     */       
/* 433 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(68, Player.__$stepFactory0_rfield), new __StepDesc(69, Player.__$stepFactory0_rfield) };
/* 434 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 37, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 38: 
/* 438 */       localObject = new Object[2];
/* 439 */       localObject[0] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[0]);
/* 440 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramArrayOfObject[1]);
/*     */       
/* 442 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(70, Player.__$stepFactory0_rfield) };
/* 443 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 38, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 39: 
/* 448 */       localObject = new __StepDesc[] { new __StepDesc(71, Player.__$stepFactory0_rfield), new __StepDesc(72, Player.__$stepFactory0_rfield) };
/* 449 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 39, null, (__StepDesc[])localObject);
/*     */     
/*     */ 
/*     */     case 40: 
/* 453 */       localObject = new Object[8];
/* 454 */       localObject[0] = new abl.runtime.__ValueTypes.BooleanVar();
/* 455 */       localObject[1] = new abl.runtime.__ValueTypes.BooleanVar();
/* 456 */       localObject[2] = new abl.runtime.__ValueTypes.BooleanVar();
/* 457 */       localObject[3] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerRotY"));
/* 458 */       localObject[4] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerX"));
/* 459 */       localObject[5] = new abl.runtime.__ValueTypes.BooleanVar((Boolean)paramHashtable.get("bRecentlyTyped"));
/* 460 */       localObject[6] = new __ValueTypes.FloatVar((Float)paramHashtable.get("playerZ"));
/* 461 */       localObject[7] = ((ObjectWrapper)paramHashtable.get("w")).objectValue();
/*     */       
/* 463 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(73, Player.__$stepFactory0_rfield) };
/* 464 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 40, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 41: 
/* 468 */       localObject = new Object[2];
/* 469 */       localObject[0] = new __ValueTypes.FloatVar((Float)paramArrayOfObject[0]);
/* 470 */       localObject[1] = new abl.runtime.__ValueTypes.LongVar();
/*     */       
/* 472 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(74, Player.__$stepFactory0_rfield), new __StepDesc(75, Player.__$stepFactory0_rfield) };
/* 473 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 41, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 42: 
/* 477 */       localObject = new Object[2];
/* 478 */       localObject[0] = new __ValueTypes.IntVar((Integer)paramArrayOfObject[0]);
/* 479 */       localObject[1] = new __ValueTypes.FloatVar();
/*     */       
/* 481 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(76, Player.__$stepFactory0_rfield), new __StepDesc(77, Player.__$stepFactory0_rfield) };
/* 482 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 42, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 43: 
/* 487 */       localObject = new __StepDesc[] { new __StepDesc(78, Player.__$stepFactory0_rfield), new __StepDesc(79, Player.__$stepFactory0_rfield), new __StepDesc(80, Player.__$stepFactory0_rfield), new __StepDesc(81, Player.__$stepFactory0_rfield) };
/* 488 */       return new SequentialBehavior(paramGoalStep, null, null, false, paramString, (short)0, 43, null, (__StepDesc[])localObject);
/*     */     
/*     */ 
/*     */ 
/*     */     case 44: 
/* 493 */       localObject = new __StepDesc[] { new __StepDesc(82, Player.__$stepFactory0_rfield), new __StepDesc(83, Player.__$stepFactory0_rfield), new __StepDesc(84, Player.__$stepFactory0_rfield), new __StepDesc(85, Player.__$stepFactory0_rfield), new __StepDesc(86, Player.__$stepFactory0_rfield), new __StepDesc(87, Player.__$stepFactory0_rfield), new __StepDesc(88, Player.__$stepFactory0_rfield) };
/* 494 */       return new abl.runtime.CollectionBehavior(paramGoalStep, null, null, false, paramString, (short)0, 44, null, (__StepDesc[])localObject, 7);
/*     */     
/*     */ 
/*     */     case 45: 
/* 498 */       localObject = new Object[2];
/* 499 */       localObject[1] = ((ObjectWrapper)paramHashtable.get("overallControl_Body")).objectValue();
/*     */       
/* 501 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(89, Player.__$stepFactory0_rfield), new __StepDesc(90, Player.__$stepFactory0_rfield) };
/* 502 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)0, 45, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 46: 
/* 506 */       localObject = new Object[7];
/* 507 */       localObject[0] = ((abl.runtime.CollectionBehaviorWME)paramArrayOfObject[0]);
/* 508 */       localObject[1] = ((java.util.List)paramArrayOfObject[1]);
/* 509 */       localObject[3] = new __ValueTypes.IntVar();
/* 510 */       localObject[4] = new __ValueTypes.FloatVar();
/* 511 */       localObject[5] = new abl.runtime.__ValueTypes.BooleanVar();
/* 512 */       localObject[6] = new abl.runtime.__ValueTypes.BooleanVar();
/*     */       
/* 514 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(91, Player.__$stepFactory0_rfield), new __StepDesc(92, Player.__$stepFactory0_rfield), new __StepDesc(93, Player.__$stepFactory0_rfield) };
/* 515 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)2, 46, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */     case 47: 
/* 519 */       localObject = new Object[2];
/* 520 */       localObject[0] = ((abl.runtime.CollectionBehaviorWME)paramArrayOfObject[0]);
/* 521 */       localObject[1] = ((java.util.List)paramArrayOfObject[1]);
/*     */       
/* 523 */       arrayOf__StepDesc = new __StepDesc[] { new __StepDesc(-1, Player.__$stepFactory0_rfield) };
/* 524 */       return new SequentialBehavior(paramGoalStep, null, null, true, paramString, (short)1, 47, (Object[])localObject, arrayOf__StepDesc);
/*     */     
/*     */ 
/*     */ 
/*     */     case 48: 
/* 529 */       localObject = new __StepDesc[] { new __StepDesc(94, Player.__$stepFactory0_rfield) };
/* 530 */       return new abl.runtime.CollectionBehavior(paramGoalStep, null, null, false, paramString, (short)0, 48, null, (__StepDesc[])localObject, 1);
/*     */     }
/*     */     
/* 533 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_BehaviorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */