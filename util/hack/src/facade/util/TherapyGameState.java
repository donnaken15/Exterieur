/*      */ package facade.util;
/*      */ 
/*      */ import java.util.LinkedList;
/*      */ import java.util.Random;
/*      */ 
/*      */ public class TherapyGameState
/*      */   implements TherapyGameConstants, DAType, SpriteID
/*      */ {
/*      */   public TherapyGameState()
/*      */   {
/*   11 */     state = this;
/*      */   }
/*      */   
/*      */ 
/*   15 */   public static int maxNumMixinsTimeout = 25; private static final boolean $noassert = Class.forName("[Lfacade.util.TherapyGameState;").getComponentType().desiredAssertionStatus() ^ true;
/*      */   
/*   17 */   public static int minNumMixinsTimeout = 17;
/*      */   
/*   19 */   public static int noScoreStretchEarlyEnd = 6;
/*      */   
/*      */ 
/*      */ 
/*   23 */   public static int calculusScoreThreshold = 1;
/*      */   
/*   25 */   public static int initialAccuser = -1;
/*      */   
/*   27 */   public static int currentMixinID = -1;
/*   28 */   public static int currentMixinType = -1;
/*   29 */   public static int prevMixinType = -1;
/*   30 */   public static int currentMixinDAType = -1;
/*   31 */   public static boolean bMixinCausedByPlayer = false;
/*   32 */   public static int currentStoryTopic = 58;
/*   33 */   public static int currentCharFocus = -1;
/*   34 */   public static int previousStoryTopic = 58;
/*   35 */   public static int previousCharFocus = -1;
/*   36 */   public static boolean bVeryBeginningOfNewMixin = false;
/*   37 */   public static long currentMixinTestBeganMillis = -1;
/*   38 */   public static boolean bSignaledNewCharFocus = false;
/*   39 */   public static boolean bSignaledNewMixinScoreIncrease = false;
/*   40 */   public static int signalNewCharFocusWho = -1;
/*   41 */   public static boolean bChangedCharFocus = false;
/*   42 */   public static int newMixinScoreIncreaseWho = -1;
/*   43 */   public static int numSignalsPlayed = 0;
/*   44 */   public static int numNewMixinsSinceSwitch = 0;
/*   45 */   public static int previousPlayerStandPositionCharFocus = -1;
/*   46 */   public static int currentMood = -1;
/*   47 */   public static int currentMoodCause = -1;
/*   48 */   public static int currentPastPresent = -1;
/*      */   
/*   50 */   public static int numMixinsPlayed = 0;
/*   51 */   public static int numTestMixinsPlayed = 0;
/*   52 */   public static int numCajolesPlayed = 0;
/*   53 */   public static int numLeaveRoomCajolesPlayed = 0;
/*   54 */   public static int cajoleCharFocus = -1;
/*   55 */   public static int cajolePrevCharFocus = -1;
/*   56 */   public static int cajoleSpeaker = -1;
/*   57 */   public static boolean bCajoleToChangePosition = false;
/*      */   
/*      */ 
/*   60 */   public static int strongMoodDialogStage = -1;
/*      */   
/*   62 */   public static int currentPostAskPlayer = -1;
/*   63 */   public static int lastTimeDidAskPlayer = -1;
/*      */   
/*   65 */   public static int numTimesScoreChanged = 0;
/*   66 */   public static int lastTimeScoreChanged = 0;
/*      */   
/*   68 */   public static int currentStagingID = -1;
/*   69 */   public static float curGraceX = 0.0F;
/*   70 */   public static float curGraceZ = 0.0F;
/*   71 */   public static float curGraceRot = 0.0F;
/*   72 */   public static float curTripX = 0.0F;
/*   73 */   public static float curTripZ = 0.0F;
/*   74 */   public static float curTripRot = 0.0F;
/*      */   
/*   76 */   public static int calculusScore_AA_G = 0;
/*   77 */   public static int calculusScore_AA_T = 0;
/*   78 */   public static int calculusScore_AA_R = 0;
/*   79 */   public static int calculusScore_F_G = 0;
/*   80 */   public static int calculusScore_F_T = 0;
/*   81 */   public static int calculusScore_F_R = 0;
/*   82 */   public static int calculusScore_RM_G = 0;
/*   83 */   public static int calculusScore_RM_T = 0;
/*   84 */   public static int calculusScore_RM_R = 0;
/*      */   
/*      */ 
/*      */ 
/*   88 */   public static int calculusScoreWhenCtr_AA_G = -1;
/*   89 */   public static int calculusScoreWhenCtr_AA_T = -1;
/*   90 */   public static int calculusScoreWhenCtr_AA_R = -1;
/*   91 */   public static int calculusScoreWhenCtr_F_G = -1;
/*   92 */   public static int calculusScoreWhenCtr_F_T = -1;
/*   93 */   public static int calculusScoreWhenCtr_F_R = -1;
/*   94 */   public static int calculusScoreWhenCtr_RM_G = -1;
/*   95 */   public static int calculusScoreWhenCtr_RM_T = -1;
/*   96 */   public static int calculusScoreWhenCtr_RM_R = -1;
/*      */   
/*   98 */   public static boolean bDidRevelationOutburst_AA_G = false;
/*   99 */   public static boolean bDidRevelationOutburst_AA_T = false;
/*  100 */   public static boolean bDidRevelationOutburst_AA_R = false;
/*  101 */   public static boolean bDidRevelationOutburst_F_G = false;
/*  102 */   public static boolean bDidRevelationOutburst_F_T = false;
/*  103 */   public static boolean bDidRevelationOutburst_F_R = false;
/*  104 */   public static boolean bDidRevelationOutburst_RM_G = false;
/*  105 */   public static boolean bDidRevelationOutburst_RM_T = false;
/*  106 */   public static boolean bDidRevelationOutburst_RM_R = false;
/*      */   
/*  108 */   public static long lastAccusationMillis = -1;
/*  109 */   public static long timeTherapyGameBegan = -1;
/*  110 */   public static long lastLeftRoomCajoleMillis = -1;
/*      */   
/*  112 */   public static boolean bPlayerInitiallyInKitchen = false;
/*      */   
/*  114 */   private static final Random randGen = new Random();
/*      */   
/*      */   class TherapyGameMixin { public int who_or1;
/*      */     public int daType_or1; public int param_or1; public int param2_or1; public int param3_or1; public int who_or2; public int daType_or2; public int param_or2; public int param2_or2; public int param3_or2; public int who_or3; public int daType_or3; public int param_or3; public int param2_or3; public int param3_or3; public int who_or4; public int daType_or4; public int param_or4;
/*  118 */     TherapyGameMixin() { jdMethod_this(); }
/*      */     
/*      */     public int param2_or4; public int param3_or4; public int mixinType; public int storyTopic; public int charFocus; public int repeatCategory; public int availability; public boolean bFinalRxnPlayed; public int mood;
/*  121 */     private final void jdMethod_this() { this.who_or1 = -1;
/*  122 */       this.daType_or1 = -1;
/*  123 */       this.param_or1 = -1;
/*  124 */       this.param2_or1 = -1;
/*  125 */       this.param3_or1 = -1;
/*      */       
/*  127 */       this.who_or2 = -1;
/*  128 */       this.daType_or2 = -1;
/*  129 */       this.param_or2 = -1;
/*  130 */       this.param2_or2 = -1;
/*  131 */       this.param3_or2 = -1;
/*      */       
/*  133 */       this.who_or3 = -1;
/*  134 */       this.daType_or3 = -1;
/*  135 */       this.param_or3 = -1;
/*  136 */       this.param2_or3 = -1;
/*  137 */       this.param3_or3 = -1;
/*      */       
/*  139 */       this.who_or4 = -1;
/*  140 */       this.daType_or4 = -1;
/*  141 */       this.param_or4 = -1;
/*  142 */       this.param2_or4 = -1;
/*  143 */       this.param3_or4 = -1;
/*      */       
/*      */ 
/*  146 */       this.mixinType = -1;
/*  147 */       this.storyTopic = -1;
/*  148 */       this.charFocus = -1;
/*  149 */       this.repeatCategory = -1;
/*  150 */       this.availability = -1;
/*  151 */       this.bFinalRxnPlayed = false;
/*  152 */       this.mood = -1;
/*  153 */       this.pastPresent = -1;
/*      */       
/*      */ 
/*  156 */       this.redirectWho = -1;
/*  157 */       this.redirectDaType = -1;
/*  158 */       this.redirectParam = -1;
/*  159 */       this.redirectParam2 = -1;
/*  160 */       this.redirectParam3 = -1;
/*      */       
/*  162 */       this.bAutonomouslyChoosable = false;
/*      */       
/*  164 */       this.scoreIncr = 0;
/*      */       
/*  166 */       this.bCausedByPlayer = false; }
/*      */     
/*      */     public int pastPresent; public int redirectWho; public int redirectDaType; public int redirectParam; public int redirectParam2; public int redirectParam3; public boolean bAutonomouslyChoosable; public int scoreIncr; public boolean bCausedByPlayer; }
/*  169 */   public static LinkedList mixinList = new LinkedList();
/*      */   
/*      */   class TherapyGameStaging { public float graceX; public float graceZ; public float graceRot;
/*  172 */     TherapyGameStaging() { jdMethod_this(); }
/*      */     
/*      */     public float tripX;
/*      */     public float tripZ;
/*      */     public float tripRot;
/*      */     public boolean bUsed;
/*      */     
/*  179 */     private final void jdMethod_this() { this.bUsed = false; }
/*      */      }
/*  181 */   public static LinkedList stagingList = new LinkedList();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public static TherapyGameState state;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddMixin(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28, int paramInt29, int paramInt30, int paramInt31, int paramInt32)
/*      */   {
/*  193 */     TherapyGameMixin localTherapyGameMixin = new TherapyGameMixin();
/*      */     
/*  195 */     localTherapyGameMixin.who_or1 = paramInt2;
/*  196 */     localTherapyGameMixin.daType_or1 = paramInt3;
/*  197 */     localTherapyGameMixin.param_or1 = paramInt4;
/*  198 */     localTherapyGameMixin.param2_or1 = paramInt5;
/*  199 */     localTherapyGameMixin.param3_or1 = paramInt6;
/*      */     
/*  201 */     localTherapyGameMixin.who_or2 = paramInt7;
/*  202 */     localTherapyGameMixin.daType_or2 = paramInt8;
/*  203 */     localTherapyGameMixin.param_or2 = paramInt9;
/*  204 */     localTherapyGameMixin.param2_or2 = paramInt10;
/*  205 */     localTherapyGameMixin.param3_or2 = paramInt11;
/*      */     
/*  207 */     localTherapyGameMixin.who_or3 = paramInt12;
/*  208 */     localTherapyGameMixin.daType_or3 = paramInt13;
/*  209 */     localTherapyGameMixin.param_or3 = paramInt14;
/*  210 */     localTherapyGameMixin.param2_or3 = paramInt15;
/*  211 */     localTherapyGameMixin.param3_or3 = paramInt16;
/*      */     
/*  213 */     localTherapyGameMixin.who_or4 = paramInt17;
/*  214 */     localTherapyGameMixin.daType_or4 = paramInt18;
/*  215 */     localTherapyGameMixin.param_or4 = paramInt19;
/*  216 */     localTherapyGameMixin.param2_or4 = paramInt20;
/*  217 */     localTherapyGameMixin.param3_or4 = paramInt21;
/*      */     
/*  219 */     localTherapyGameMixin.mixinType = paramInt22;
/*  220 */     localTherapyGameMixin.storyTopic = paramInt23;
/*  221 */     localTherapyGameMixin.charFocus = paramInt24;
/*  222 */     localTherapyGameMixin.repeatCategory = paramInt25;
/*  223 */     localTherapyGameMixin.availability = 0;
/*  224 */     if ((paramInt22 == 2) || (paramInt22 == 3) || (paramInt22 == 4))
/*      */     {
/*      */ 
/*  227 */       localTherapyGameMixin.bFinalRxnPlayed = true;
/*      */     } else {
/*  229 */       localTherapyGameMixin.bFinalRxnPlayed = false;
/*      */     }
/*      */     
/*  232 */     localTherapyGameMixin.mood = paramInt26;
/*  233 */     localTherapyGameMixin.pastPresent = paramInt27;
/*      */     
/*  235 */     localTherapyGameMixin.redirectWho = paramInt28;
/*  236 */     localTherapyGameMixin.redirectDaType = paramInt29;
/*  237 */     localTherapyGameMixin.redirectParam = paramInt30;
/*  238 */     localTherapyGameMixin.redirectParam2 = paramInt31;
/*  239 */     localTherapyGameMixin.redirectParam3 = paramInt32;
/*      */     
/*  241 */     localTherapyGameMixin.bAutonomouslyChoosable = paramBoolean;
/*  242 */     localTherapyGameMixin.scoreIncr = paramInt1;
/*      */     
/*      */ 
/*  245 */     mixinList.add(localTherapyGameMixin);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddMixin(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27)
/*      */   {
/*  257 */     AddMixin(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, -1, -1, -1, -1, -1, paramInt17, paramInt18, paramInt19, paramInt20, paramInt21, paramInt22, paramInt23, paramInt24, paramInt25, paramInt26, paramInt27);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddMixin(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22)
/*      */   {
/*  275 */     AddMixin(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17, paramInt18, paramInt19, paramInt20, paramInt21, paramInt22);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddMixin(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17)
/*      */   {
/*  292 */     AddMixin(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int GetNumMixins()
/*      */   {
/*  304 */     return mixinList.size();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void GetMixinInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5, IntegerRef paramIntegerRef6, IntegerRef paramIntegerRef7, IntegerRef paramIntegerRef8, IntegerRef paramIntegerRef9, IntegerRef paramIntegerRef10, IntegerRef paramIntegerRef11, IntegerRef paramIntegerRef12, IntegerRef paramIntegerRef13, IntegerRef paramIntegerRef14, IntegerRef paramIntegerRef15)
/*      */   {
/*  325 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= mixinList.size()))) throw new AssertionError();
/*  326 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/*      */     
/*  328 */     paramIntegerRef1.i = localTherapyGameMixin.who_or1;
/*  329 */     paramIntegerRef2.i = localTherapyGameMixin.daType_or1;
/*  330 */     paramIntegerRef3.i = localTherapyGameMixin.param_or1;
/*  331 */     paramIntegerRef4.i = localTherapyGameMixin.param2_or1;
/*  332 */     paramIntegerRef5.i = localTherapyGameMixin.param3_or1;
/*      */     
/*  334 */     paramIntegerRef6.i = localTherapyGameMixin.mixinType;
/*  335 */     paramIntegerRef7.i = localTherapyGameMixin.storyTopic;
/*  336 */     paramIntegerRef8.i = localTherapyGameMixin.charFocus;
/*  337 */     paramIntegerRef9.i = localTherapyGameMixin.mood;
/*  338 */     paramIntegerRef10.i = localTherapyGameMixin.pastPresent;
/*      */     
/*  340 */     paramIntegerRef11.i = localTherapyGameMixin.redirectWho;
/*  341 */     paramIntegerRef12.i = localTherapyGameMixin.redirectDaType;
/*  342 */     paramIntegerRef13.i = localTherapyGameMixin.redirectParam;
/*  343 */     paramIntegerRef14.i = localTherapyGameMixin.redirectParam2;
/*  344 */     paramIntegerRef15.i = localTherapyGameMixin.redirectParam3;
/*      */   }
/*      */   
/*      */ 
/*      */   public void DeleteMixin(int paramInt)
/*      */   {
/*  350 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= mixinList.size()))) throw new AssertionError();
/*  351 */     mixinList.remove(paramInt);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseNewAccusation(int paramInt1, int paramInt2)
/*      */   {
/*  363 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  364 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  365 */     BooleanRef localBooleanRef = new BooleanRef();
/*      */     int k;
/*      */     int m;
/*      */     int n;
/*  369 */     int i; if (paramInt1 != -1) {
/*  370 */       k = paramInt1;
/*  371 */       m = paramInt1;
/*  372 */       n = paramInt1;
/*      */     }
/*      */     else
/*      */     {
/*  376 */       i = randGen.nextInt(3);
/*  377 */       if (i == 0) { k = 59;
/*  378 */       } else if (i == 1) k = 60; else
/*  379 */         k = 61;
/*  380 */       if (k == 59) {
/*  381 */         m = 60;
/*  382 */         n = 61;
/*  383 */       } else if (k == 60) {
/*  384 */         m = 59;
/*  385 */         n = 61;
/*      */       } else {
/*  387 */         m = 59;
/*  388 */         n = 60;
/*      */       }
/*  390 */       if (randGen.nextInt(2) == 0) {
/*  391 */         i = m;m = n;n = i;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  396 */     if (paramInt2 == -1) {
/*  397 */       i = randGen.nextInt(2);
/*  398 */       if (i == 0) paramInt2 = 0; else {
/*  399 */         paramInt2 = 1;
/*      */       }
/*      */     }
/*      */     
/*  403 */     int j = k;
/*  404 */     GetMixinID(-1, -1, -1, -1, -1, 6, j, paramInt2, localIntegerRef1, localIntegerRef2, localBooleanRef);
/*      */     
/*      */ 
/*      */     int i1;
/*      */     
/*  409 */     if (localIntegerRef2.i == 0) i1 = localIntegerRef1.i; else {
/*  410 */       i1 = -1;
/*      */     }
/*      */     
/*  413 */     if (i1 == -1) {
/*  414 */       j = m;
/*  415 */       GetMixinID(-1, -1, -1, -1, -1, 6, j, paramInt2, localIntegerRef1, localIntegerRef2, localBooleanRef);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  420 */       if (localIntegerRef2.i == 0) i1 = localIntegerRef1.i; else {
/*  421 */         i1 = -1;
/*      */       }
/*      */     }
/*      */     
/*  425 */     if (i1 == -1) {
/*  426 */       j = n;
/*  427 */       GetMixinID(-1, -1, -1, -1, -1, 6, j, paramInt2, localIntegerRef1, localIntegerRef2, localBooleanRef);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  432 */       if (localIntegerRef2.i == 0) i1 = localIntegerRef1.i; else {
/*  433 */         i1 = -1;
/*      */       }
/*      */     }
/*      */     
/*  437 */     if (i1 != -1) {
/*  438 */       currentStoryTopic = j;
/*  439 */       lastAccusationMillis = System.currentTimeMillis();
/*      */     }
/*      */     
/*  442 */     return i1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseNewCajoleMixin(float paramFloat1, float paramFloat2, int paramInt)
/*      */   {
/*  455 */     if (paramInt < 0) {
/*  456 */       StringUtil.println("ChooseNewCajoleMixin for player leaving room " + paramFloat1);
/*  457 */       cajoleSpeaker = paramInt;
/*      */     }
/*      */     else
/*      */     {
/*  461 */       if ((!$noassert) && (previousPlayerStandPositionCharFocus == -1)) throw new AssertionError();
/*  462 */       int j = GetPlayerStandPositionCharFocus(paramFloat1, paramFloat2);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  467 */       if ((j != previousPlayerStandPositionCharFocus) && (j != cajolePrevCharFocus))
/*      */       {
/*  469 */         cajoleCharFocus = j;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  476 */         if (cajolePrevCharFocus == -1) {
/*  477 */           if (randGen.nextInt(2) == 0) cajolePrevCharFocus = 2; else {
/*  478 */             cajolePrevCharFocus = 0;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  483 */         if (cajolePrevCharFocus == 2) {
/*  484 */           if (currentMood < 4)
/*  485 */             cajoleCharFocus = 0; else {
/*  486 */             cajoleCharFocus = 1;
/*      */           }
/*      */         } else {
/*  489 */           cajoleCharFocus = 2;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  495 */       if (cajoleCharFocus == 0) {
/*  496 */         cajoleSpeaker = 1;
/*  497 */       } else if (cajoleCharFocus == 1) {
/*  498 */         cajoleSpeaker = 0;
/*      */ 
/*      */       }
/*  501 */       else if (currentMood < 4)
/*  502 */         cajoleSpeaker = 1; else {
/*  503 */         cajoleSpeaker = 0;
/*      */       }
/*      */       
/*      */ 
/*  507 */       currentCharFocus = cajoleCharFocus;
/*      */       
/*      */ 
/*  510 */       if (currentCharFocus == j)
/*  511 */         bCajoleToChangePosition = false; else {
/*  512 */         bCajoleToChangePosition = true;
/*      */       }
/*      */     }
/*      */     
/*  516 */     for (int i = 0; i < mixinList.size(); i++) {
/*  517 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  518 */       if (localTherapyGameMixin.mixinType == 2) { return i;
/*      */       }
/*      */     }
/*  521 */     if (!$noassert) throw new AssertionError();
/*  522 */     return -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseStrongMoodMixin()
/*      */   {
/*  533 */     for (int i = 0; i < mixinList.size(); i++) {
/*  534 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  535 */       if (localTherapyGameMixin.mixinType == 3) { return i;
/*      */       }
/*      */     }
/*  538 */     if (!$noassert) throw new AssertionError();
/*  539 */     return -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseRepeatVersionOfMixinID(int paramInt)
/*      */   {
/*  551 */     int i = GetMixinRepeatCategory(paramInt);
/*      */     
/*  553 */     StringUtil.println("## ChooseRepeatVersionOfMixinID for mixin " + paramInt + " repeatCategory " + i);
/*      */     
/*      */ 
/*  556 */     for (int j = 0; j < mixinList.size(); j++) {
/*  557 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(j);
/*  558 */       if ((localTherapyGameMixin.mixinType == 5) && (localTherapyGameMixin.repeatCategory == i) && (localTherapyGameMixin.availability == 0))
/*      */       {
/*      */ 
/*  561 */         return j; }
/*      */     }
/*  563 */     return -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public int GetMixinType(int paramInt)
/*      */   {
/*  570 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/*  571 */     return localTherapyGameMixin.mixinType;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public int GetMixinAvailability(int paramInt)
/*      */   {
/*  578 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/*  579 */     return localTherapyGameMixin.availability;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int GetMixinRedirectID(int paramInt)
/*      */   {
/*  587 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/*  588 */     if (GetMixinType(paramInt) != 1) return paramInt;
/*  589 */     int i = DoesMixinExist(localTherapyGameMixin.redirectWho, localTherapyGameMixin.redirectDaType, localTherapyGameMixin.redirectParam, localTherapyGameMixin.redirectParam2, localTherapyGameMixin.redirectParam3, -2, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  594 */     if ((!$noassert) && (i == -1)) throw new AssertionError();
/*  595 */     return i;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public int GetMixinRepeatCategory(int paramInt)
/*      */   {
/*  602 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/*  603 */     return localTherapyGameMixin.repeatCategory;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseNewMixin(int paramInt)
/*      */   {
/*  614 */     int i = ChooseNewMixin_Body(true, paramInt);
/*  615 */     if (i != -1) {
/*  616 */       StringUtil.println("ChooseNewMixin kept the current mood " + currentMood + " and pastPresent " + currentPastPresent);
/*      */     }
/*      */     else
/*      */     {
/*  620 */       i = ChooseNewMixin_Body(false, paramInt);
/*  621 */       StringUtil.println("ChooseNewMixin did not keep the current mood " + currentMood + " and pastPresent " + currentPastPresent);
/*      */     }
/*      */     
/*  624 */     return i;
/*      */   }
/*      */   
/*      */ 
/*      */   public int ChooseNewMixin_Body(boolean paramBoolean, int paramInt)
/*      */   {
/*  630 */     LinkedList localLinkedList = new LinkedList();
/*      */     
/*  632 */     int k = -1;
/*  633 */     int m = currentCharFocus;
/*      */     
/*  635 */     StringUtil.println("## ChooseNewMixin starting with requested charFocus " + paramInt);
/*      */     int i;
/*      */     TherapyGameMixin localTherapyGameMixin;
/*  638 */     if (randGen.nextInt(3) == 0) {
/*  639 */       localLinkedList.clear();
/*  640 */       for (i = 0; i < mixinList.size(); i++) {
/*  641 */         localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  642 */         if ((localTherapyGameMixin.mixinType == 7) && (localTherapyGameMixin.storyTopic == currentStoryTopic) && (localTherapyGameMixin.charFocus == paramInt) && (localTherapyGameMixin.availability == 0) && ((!paramBoolean) || ((localTherapyGameMixin.mood == currentMood) && (localTherapyGameMixin.pastPresent == currentPastPresent))))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  647 */           localLinkedList.add(new IntegerRef(i));
/*      */         }
/*      */       }
/*  650 */       if (localLinkedList.size() > 0) {
/*  651 */         k = ((IntegerRef)localLinkedList.get(randGen.nextInt(localLinkedList.size()))).i;
/*  652 */         currentCharFocus = paramInt;
/*  653 */         StringUtil.println("ChooseNewMixin chose miscAutonomous " + k + " bMatchMoodAndPP " + paramBoolean);
/*      */       } else {
/*  655 */         StringUtil.println("ChooseNewMixin no luck choosing a new miscAutonomous, bMatchMoodAndPP " + paramBoolean);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  660 */     if (k == -1)
/*      */     {
/*      */ 
/*  663 */       if ((numNewMixinsSinceSwitch > 3) && (currentCharFocus == paramInt)) {
/*  664 */         if (currentCharFocus == 0) {
/*  665 */           if (randGen.nextInt(2) == 0) currentCharFocus = 1; else
/*  666 */             currentCharFocus = 2;
/*  667 */         } else if (currentCharFocus == 1) {
/*  668 */           if (randGen.nextInt(2) == 0) currentCharFocus = 0; else {
/*  669 */             currentCharFocus = 2;
/*      */           }
/*  671 */         } else if (randGen.nextInt(2) == 0) currentCharFocus = 0; else {
/*  672 */           currentCharFocus = 1;
/*      */         }
/*  674 */         StringUtil.println("ChooseNewMixin autonomously chose new charFocus " + currentCharFocus);
/*      */         
/*      */ 
/*      */ 
/*  678 */         paramInt = currentCharFocus;
/*      */       }
/*      */       
/*  681 */       localLinkedList.clear();
/*  682 */       for (i = 0; i < mixinList.size(); i++) {
/*  683 */         localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  684 */         if ((localTherapyGameMixin.mixinType == 0) && (localTherapyGameMixin.bAutonomouslyChoosable) && (localTherapyGameMixin.storyTopic == currentStoryTopic) && (localTherapyGameMixin.charFocus == paramInt) && (localTherapyGameMixin.availability == 0) && ((!paramBoolean) || ((localTherapyGameMixin.mood == currentMood) && (localTherapyGameMixin.pastPresent == currentPastPresent))))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  690 */           localLinkedList.add(new IntegerRef(i));
/*      */         }
/*      */       }
/*  693 */       if (localLinkedList.size() > 0) {
/*  694 */         k = ((IntegerRef)localLinkedList.get(randGen.nextInt(localLinkedList.size()))).i;
/*  695 */         currentCharFocus = paramInt;
/*  696 */         StringUtil.println("ChooseNewMixin chose among " + localLinkedList.size() + " for same storytopic new mixin " + k + " charFocus " + currentCharFocus + " bMatchMoodAndPP " + paramBoolean);
/*      */       }
/*      */       else {
/*  699 */         StringUtil.println("ChooseNewMixin no luck choosing for same storytopic, with reqCharFocus, bMatchMoodAndPP " + paramBoolean);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  704 */     if (k == -1) {
/*  705 */       localLinkedList.clear();
/*  706 */       for (i = 0; i < mixinList.size(); i++) {
/*  707 */         localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  708 */         if ((localTherapyGameMixin.mixinType == 0) && (localTherapyGameMixin.bAutonomouslyChoosable) && (localTherapyGameMixin.charFocus == paramInt) && (localTherapyGameMixin.availability == 0) && ((!paramBoolean) || ((localTherapyGameMixin.mood == currentMood) && (localTherapyGameMixin.pastPresent == currentPastPresent))))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  713 */           localLinkedList.add(new IntegerRef(i));
/*      */         }
/*      */       }
/*  716 */       if (localLinkedList.size() > 0) {
/*  717 */         k = ((IntegerRef)localLinkedList.get(randGen.nextInt(localLinkedList.size()))).i;
/*      */         
/*  719 */         localTherapyGameMixin = (TherapyGameMixin)mixinList.get(k);
/*  720 */         currentStoryTopic = localTherapyGameMixin.storyTopic;
/*  721 */         currentCharFocus = paramInt;
/*  722 */         StringUtil.println("ChooseNewMixin chose among " + localLinkedList.size() + " for new mixin " + k + " storyTopic " + currentStoryTopic + " charFocus " + currentCharFocus + " bMatchMoodAndPP " + paramBoolean);
/*      */       }
/*      */       else {
/*  725 */         StringUtil.println("ChooseNewMixin no luck choosing for any storytopic, but with reqCharFocus, bMatchMoodAndPP " + paramBoolean);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  731 */     if ((k == -1) && (!paramBoolean))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*  736 */       for (int j = 0; j < 2; j++) {
/*  737 */         if (j == 0) paramBoolean = true; else {
/*  738 */           paramBoolean = false;
/*      */         }
/*  740 */         localLinkedList.clear();
/*  741 */         for (i = 0; i < mixinList.size(); i++) {
/*  742 */           localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  743 */           if ((localTherapyGameMixin.mixinType == 0) && (localTherapyGameMixin.bAutonomouslyChoosable) && (localTherapyGameMixin.availability == 0) && ((!paramBoolean) || ((localTherapyGameMixin.mood == currentMood) && (localTherapyGameMixin.pastPresent == currentPastPresent))))
/*      */           {
/*      */ 
/*      */ 
/*  747 */             localLinkedList.add(new IntegerRef(i));
/*      */           }
/*      */         }
/*  750 */         if (localLinkedList.size() > 0) {
/*  751 */           k = ((IntegerRef)localLinkedList.get(randGen.nextInt(localLinkedList.size()))).i;
/*      */           
/*  753 */           localTherapyGameMixin = (TherapyGameMixin)mixinList.get(k);
/*  754 */           currentStoryTopic = localTherapyGameMixin.storyTopic;
/*  755 */           currentCharFocus = localTherapyGameMixin.charFocus;
/*  756 */           StringUtil.println("ChooseNewMixin chose among " + localLinkedList.size() + " for new mixin " + k + " storyTopic " + currentStoryTopic + " charFocus " + currentCharFocus + " bMatchMoodAndPP " + paramBoolean);
/*      */         }
/*      */         else {
/*  759 */           StringUtil.println("ChooseNewMixin no luck choosing for any storytopic and any charFocus, bMatchMoodAndPP " + paramBoolean);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  764 */     if ((!paramBoolean) && (!$noassert) && (k == -1)) throw new AssertionError("TherapyGameState.ChooseNewMixin() can't find a mixin, bMatchMoodAndPP" + paramBoolean);
/*  765 */     if (k == -1) currentCharFocus = m;
/*  766 */     return k;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public int GetPlayerStandPositionCharFocus(float paramFloat1, float paramFloat2)
/*      */   {
/*  773 */     float f = 70.0F;
/*  774 */     int i; if ((paramFloat1 < f) && (paramFloat1 < paramFloat2)) {
/*  775 */       i = 0;
/*  776 */     } else if ((paramFloat2 < f) && (paramFloat2 < paramFloat1))
/*  777 */       i = 1; else
/*  778 */       i = 2;
/*  779 */     return i;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void GetMixinID(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, BooleanRef paramBooleanRef)
/*      */   {
/*  792 */     int i = DoesMixinExist(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  793 */     paramIntegerRef1.i = i;
/*  794 */     if (i != -1) {
/*  795 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*  796 */       paramIntegerRef2.i = localTherapyGameMixin.availability;
/*  797 */       paramBooleanRef.b = localTherapyGameMixin.bCausedByPlayer;
/*      */     }
/*      */     else {
/*  800 */       paramIntegerRef2.i = -1;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int GetRelatedMixin(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  812 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  813 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  814 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  815 */     BooleanRef localBooleanRef = new BooleanRef();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  822 */     StringUtil.println("## GetRelatedMixin for who " + paramInt1 + " daType " + paramInt2 + " param " + paramInt3 + " param2 " + paramInt4 + " param3 " + paramInt5 + " storyTopic " + currentStoryTopic + " charFocus " + currentCharFocus + " reqCharFocus " + paramInt6);
/*      */     
/*      */     int k;
/*      */     
/*      */     int m;
/*  827 */     if (currentStoryTopic == 59) {
/*  828 */       k = 60;m = 61;
/*  829 */     } else if (currentStoryTopic == 60) {
/*  830 */       k = 59;m = 61;
/*      */     } else {
/*  832 */       k = 59;m = 60;
/*      */     }
/*  834 */     if (randGen.nextInt(2) == 0) {
/*  835 */       int n = k;k = m;m = n;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  840 */     StringUtil.println("## Attempting other story topic " + k + " reqCharFocus " + paramInt6);
/*  841 */     GetMixinID(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, k, paramInt6, localIntegerRef1, localIntegerRef3, localBooleanRef);
/*      */     
/*  843 */     int i = localIntegerRef1.i;
/*  844 */     int j = localIntegerRef3.i;
/*      */     
/*  846 */     if ((i != -1) && (j == 0)) {
/*  847 */       currentStoryTopic = k;
/*  848 */       currentCharFocus = paramInt6;
/*  849 */       StringUtil.println("## Found other story topic, new currentStoryTopic " + currentStoryTopic + ", charFocus " + currentCharFocus);
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*  854 */       StringUtil.println("## Attempting other story topic " + m + " reqCharFocus " + paramInt6);
/*  855 */       GetMixinID(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, m, paramInt6, localIntegerRef1, localIntegerRef3, localBooleanRef);
/*      */       
/*  857 */       i = localIntegerRef1.i;
/*  858 */       j = localIntegerRef3.i;
/*      */       
/*  860 */       if ((i != -1) && (j == 0)) {
/*  861 */         currentStoryTopic = m;
/*  862 */         currentCharFocus = paramInt6;
/*  863 */         StringUtil.println("## Found other story topic, new currentStoryTopic " + currentStoryTopic + ", charFocus " + currentCharFocus);
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*  868 */         StringUtil.println("## Attempting GTRSibling current story topic " + currentStoryTopic + " reqCharFocus " + paramInt6);
/*  869 */         GetMixinGTRSibling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, currentStoryTopic, paramInt6, localIntegerRef1, localIntegerRef3, localIntegerRef2);
/*      */         
/*      */ 
/*  872 */         i = localIntegerRef1.i;
/*  873 */         j = localIntegerRef3.i;
/*      */         
/*  875 */         if ((i != -1) && (j == 0)) {
/*  876 */           currentCharFocus = localIntegerRef2.i;
/*  877 */           StringUtil.println("## Found GTR sibling, new currentCharFocus " + currentCharFocus);
/*      */         }
/*      */         else
/*      */         {
/*  881 */           StringUtil.println("## Attempting GTRSibling other story topic " + k + " reqCharFocus " + paramInt6);
/*  882 */           GetMixinGTRSibling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, k, paramInt6, localIntegerRef1, localIntegerRef3, localIntegerRef2);
/*      */           
/*      */ 
/*  885 */           i = localIntegerRef1.i;
/*  886 */           j = localIntegerRef3.i;
/*      */           
/*  888 */           if ((i != -1) && (j == 0)) {
/*  889 */             currentStoryTopic = k;
/*  890 */             currentCharFocus = localIntegerRef2.i;
/*  891 */             StringUtil.println("## Found other story topic and GTR sibling, new currentStoryTopic " + currentStoryTopic + " and new currentCharFocus " + currentCharFocus);
/*      */           }
/*      */           else
/*      */           {
/*  895 */             StringUtil.println("## Attempting GTRSibling other story topic " + m + " reqCharFocus " + paramInt6);
/*  896 */             GetMixinGTRSibling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, m, paramInt6, localIntegerRef1, localIntegerRef3, localIntegerRef2);
/*      */             
/*      */ 
/*  899 */             i = localIntegerRef1.i;
/*  900 */             j = localIntegerRef3.i;
/*      */             
/*  902 */             if ((i != -1) && (j == 0)) {
/*  903 */               currentStoryTopic = m;
/*  904 */               currentCharFocus = localIntegerRef2.i;
/*  905 */               StringUtil.println("## Found other story topic and GTR sibling, new currentStoryTopic " + currentStoryTopic + " and new currentCharFocus " + currentCharFocus);
/*      */             }
/*      */             else {
/*  908 */               StringUtil.println("## Could not find related mixin!");
/*  909 */               i = -1;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  916 */     return i;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void GetMixinGTRSibling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3)
/*      */   {
/*  929 */     BooleanRef localBooleanRef = new BooleanRef();
/*      */     
/*  931 */     int m = -1;
/*  932 */     paramIntegerRef1.i = -1;
/*  933 */     paramIntegerRef3.i = -1;
/*      */     int i;
/*      */     int j;
/*  936 */     if (paramInt8 == 0) {
/*  937 */       i = 1;j = 2;
/*  938 */     } else if (paramInt8 == 1) {
/*  939 */       i = 0;j = 2;
/*      */     } else {
/*  941 */       i = 0;j = 1;
/*      */     }
/*  943 */     if (randGen.nextInt(2) == 0) {
/*  944 */       int k = i;i = j;j = k;
/*      */     }
/*      */     
/*      */ 
/*  948 */     StringUtil.println(" GetMixinGTRSibling for who " + paramInt1 + " daType " + paramInt2 + " param " + paramInt3 + " storyTopic " + paramInt7 + " charFocus " + i);
/*      */     
/*  950 */     GetMixinID(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, i, paramIntegerRef1, paramIntegerRef2, localBooleanRef);
/*      */     
/*  952 */     m = paramIntegerRef1.i;
/*  953 */     paramIntegerRef3.i = i;
/*      */     
/*      */ 
/*  956 */     if (m == -1) {
/*  957 */       StringUtil.println(" GetMixinGTRSibling for who " + paramInt1 + " daType " + paramInt2 + " param " + paramInt3 + " storyTopic " + paramInt7 + " charFocus " + j);
/*      */       
/*  959 */       GetMixinID(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, j, paramIntegerRef1, paramIntegerRef2, localBooleanRef);
/*      */       
/*  961 */       m = paramIntegerRef1.i;
/*  962 */       paramIntegerRef3.i = j;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int DoesMixinExist(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/*  977 */     for (int i = 0; i < mixinList.size(); i++)
/*      */     {
/*  979 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  992 */       if (((paramInt1 != localTherapyGameMixin.who_or1) && (localTherapyGameMixin.who_or1 != 3) && ((paramInt1 != 0) || (localTherapyGameMixin.who_or1 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or1 != 0)) && ((paramInt1 != 1) || (localTherapyGameMixin.who_or1 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or1 != 1))) || (((paramInt2 == localTherapyGameMixin.daType_or1) && (paramInt3 == localTherapyGameMixin.param_or1) && (paramInt4 == localTherapyGameMixin.param2_or1) && (paramInt5 == localTherapyGameMixin.param3_or1)) || (((paramInt1 != localTherapyGameMixin.who_or2) && (localTherapyGameMixin.who_or2 != 3) && ((paramInt1 != 0) || (localTherapyGameMixin.who_or2 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or2 != 0)) && ((paramInt1 != 1) || (localTherapyGameMixin.who_or2 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or2 != 1))) || (((paramInt2 == localTherapyGameMixin.daType_or2) && (paramInt3 == localTherapyGameMixin.param_or2) && (paramInt4 == localTherapyGameMixin.param2_or2) && (paramInt5 == localTherapyGameMixin.param3_or2)) || (((paramInt1 != localTherapyGameMixin.who_or3) && (localTherapyGameMixin.who_or3 != 3) && ((paramInt1 != 0) || (localTherapyGameMixin.who_or3 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or3 != 0)) && ((paramInt1 != 1) || (localTherapyGameMixin.who_or3 != 2)) && ((paramInt1 != 2) || (localTherapyGameMixin.who_or3 != 1))) || (((paramInt2 == localTherapyGameMixin.daType_or3) && (paramInt3 == localTherapyGameMixin.param_or3) && (paramInt4 == localTherapyGameMixin.param2_or3) && (paramInt5 == localTherapyGameMixin.param3_or3)) || (((paramInt1 == localTherapyGameMixin.who_or4) || (localTherapyGameMixin.who_or4 == 3) || ((paramInt1 == 0) && (localTherapyGameMixin.who_or4 == 2)) || ((paramInt1 == 2) && (localTherapyGameMixin.who_or4 == 0)) || ((paramInt1 == 1) && (localTherapyGameMixin.who_or4 == 2)) || ((paramInt1 == 2) && (localTherapyGameMixin.who_or4 == 1))) && (paramInt2 == localTherapyGameMixin.daType_or4) && (paramInt3 == localTherapyGameMixin.param_or4) && (paramInt4 == localTherapyGameMixin.param2_or4) && (paramInt5 == localTherapyGameMixin.param3_or4))))))))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1033 */         switch (paramInt6)
/*      */         {
/*      */         case 0: 
/* 1036 */           if (((localTherapyGameMixin.mixinType == 0) && (localTherapyGameMixin.storyTopic == paramInt7) && (localTherapyGameMixin.charFocus == paramInt8)) || (localTherapyGameMixin.mixinType == 1) || (localTherapyGameMixin.mixinType == 4))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1042 */             return i;
/*      */           }
/* 1044 */           break;
/*      */         
/*      */         case 1: 
/*      */         case 4: 
/* 1048 */           if ((localTherapyGameMixin.mixinType == paramInt6) && (localTherapyGameMixin.storyTopic == paramInt7))
/*      */           {
/*      */ 
/* 1051 */             return i;
/*      */           }
/* 1053 */           break;
/*      */         
/*      */ 
/*      */         case 6: 
/*      */         case 7: 
/* 1058 */           if ((localTherapyGameMixin.mixinType == paramInt6) && (localTherapyGameMixin.storyTopic == paramInt7) && (localTherapyGameMixin.charFocus == paramInt8))
/*      */           {
/*      */ 
/*      */ 
/* 1062 */             return i;
/*      */           }
/* 1064 */           break;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         case -2: 
/* 1070 */           return i;
/*      */         case -1: case 2: case 3: 
/*      */         case 5: default: 
/* 1073 */           if (!$noassert) { throw new AssertionError("DoesMixinExist: requesting illegal mixinType " + paramInt6);
/*      */           }
/*      */           break;
/*      */         }
/*      */         
/*      */       }
/*      */     }
/* 1080 */     return -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void SetMixinAndGTRSiblingsAsUsed(int paramInt)
/*      */   {
/* 1098 */     StringUtil.println("SetMixinAndGTRSiblingsAsUsed for mixinID " + paramInt + "...");
/*      */     
/* 1100 */     if (paramInt != -1)
/*      */     {
/* 1102 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1103 */       int i = localTherapyGameMixin.who_or1;
/* 1104 */       int j = localTherapyGameMixin.daType_or1;
/* 1105 */       int k = localTherapyGameMixin.param_or1;
/* 1106 */       int m = localTherapyGameMixin.param2_or1;
/* 1107 */       int n = localTherapyGameMixin.param3_or1;
/* 1108 */       int i1 = localTherapyGameMixin.mixinType;
/* 1109 */       int i2 = localTherapyGameMixin.storyTopic;
/*      */       
/*      */ 
/* 1112 */       if ((i1 == 2) || (i1 == 3)) {
/* 1113 */         return;
/*      */       }
/*      */       
/* 1116 */       if (i1 == 5)
/*      */       {
/*      */ 
/* 1119 */         return;
/*      */       }
/*      */       
/*      */ 
/* 1123 */       int i3 = DoesMixinExist(i, j, k, m, n, i1, i2, 0);
/* 1124 */       int i4 = DoesMixinExist(i, j, k, m, n, i1, i2, 1);
/* 1125 */       int i5 = DoesMixinExist(i, j, k, m, n, i1, i2, 2);
/* 1126 */       if ((!$noassert) && (i3 == -1) && (i4 == -1) && (i5 == -1)) throw new AssertionError();
/* 1127 */       if ((!$noassert) && (i3 != paramInt) && (i4 != paramInt) && (i5 != paramInt)) { throw new AssertionError();
/*      */       }
/*      */       
/* 1130 */       SetMixinAsUsed(i3);
/* 1131 */       SetMixinAsUsed(i4);
/* 1132 */       SetMixinAsUsed(i5);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void SetMixinCousinsAsUsed(int paramInt)
/*      */   {
/* 1165 */     StringUtil.println("SetMixinCousinsAsUsed for mixinID " + paramInt + "...");
/*      */     
/* 1167 */     if (paramInt != -1) {
/* 1168 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1169 */       int i = localTherapyGameMixin.who_or1;
/* 1170 */       int j = localTherapyGameMixin.daType_or1;
/* 1171 */       int k = localTherapyGameMixin.param_or1;
/* 1172 */       int m = localTherapyGameMixin.param2_or1;
/* 1173 */       int n = localTherapyGameMixin.param3_or1;
/* 1174 */       int i1 = localTherapyGameMixin.mixinType;
/* 1175 */       int i2 = localTherapyGameMixin.storyTopic;
/*      */       
/*      */       int i6;
/*      */       
/* 1179 */       if ((i == 2) && ((j == 23) || (j == 24) || (j == 25) || (j == 26)))
/*      */       {
/*      */         int i9;
/*      */         
/* 1183 */         if ((k == 111) || (k == 112)) {
/* 1184 */           k = 111;
/* 1185 */           i9 = 112;
/*      */         } else {
/* 1187 */           i9 = -1;
/*      */         }
/*      */         
/*      */ 
/* 1191 */         for (int i4 = 0; i4 < 2; i4++) {
/* 1192 */           int i10 = -1;
/* 1193 */           if (i4 == 0) i10 = k;
/* 1194 */           if (i4 == 1) i10 = i9;
/* 1195 */           if (i10 != -1)
/*      */           {
/*      */ 
/* 1198 */             for (i6 = 0; i6 <= 1; i6++) {
/* 1199 */               for (int i7 = 59; i7 <= 61; i7++) {
/* 1200 */                 for (int i5 = 23; i5 <= 26; i5++) {
/* 1201 */                   for (int i8 = 0; i8 <= 2; i8++)
/*      */                   {
/*      */ 
/* 1204 */                     int i3 = DoesMixinExist(i6, i5, i10, m, n, 0, i7, i8);
/* 1205 */                     if ((i3 != -1) && 
/* 1206 */                       (SetMixinAsUsed(i3))) {
/* 1207 */                       StringUtil.println("### Setting cousin mixin " + i3 + " as used: who " + i6 + " daType " + j + " param " + i10 + " storyTopic " + i7 + " charFocus " + i8);
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1221 */       if (i1 == 0) {
/* 1222 */         for (i6 = 0; i6 < mixinList.size(); i6++) {
/* 1223 */           localTherapyGameMixin = (TherapyGameMixin)mixinList.get(i6);
/* 1224 */           if ((i == localTherapyGameMixin.redirectWho) && (j == localTherapyGameMixin.redirectDaType) && (k == localTherapyGameMixin.redirectParam) && (m == localTherapyGameMixin.redirectParam2) && (n == localTherapyGameMixin.redirectParam3))
/*      */           {
/* 1226 */             if (SetMixinAsUsed(i6)) {
/* 1227 */               StringUtil.println("### Setting redirect cousin mixin " + i6 + " as used: who " + localTherapyGameMixin.redirectWho + " daType " + localTherapyGameMixin.redirectDaType + " param " + localTherapyGameMixin.redirectParam + " storyTopic " + localTherapyGameMixin.storyTopic + " charFocus " + localTherapyGameMixin.charFocus);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean SetMixinAsUsed(int paramInt)
/*      */   {
/* 1241 */     if (paramInt != -1) {
/* 1242 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1243 */       if (localTherapyGameMixin.availability == 0) {
/* 1244 */         localTherapyGameMixin.availability = 1;
/* 1245 */         StringUtil.println("SetMixinAsUsed " + paramInt);
/* 1246 */         return true;
/*      */       }
/*      */     }
/* 1249 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public boolean GetIfMixinCausedByPlayer(int paramInt)
/*      */   {
/* 1256 */     if (paramInt != -1) {
/* 1257 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1258 */       return localTherapyGameMixin.bCausedByPlayer;
/*      */     }
/* 1260 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */   public void SetMixinAsCausedByPlayer(int paramInt)
/*      */   {
/* 1266 */     if (paramInt != -1) {
/* 1267 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1268 */       localTherapyGameMixin.bCausedByPlayer = true;
/* 1269 */       StringUtil.println("SetMixinAsCausedByPlayer " + paramInt);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean GetIfFinalRxnOfMixinAvailable(int paramInt)
/*      */   {
/* 1278 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= mixinList.size()))) throw new AssertionError();
/* 1279 */     TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1280 */     if (((localTherapyGameMixin.mixinType == 0) || (localTherapyGameMixin.mixinType == 6) || (localTherapyGameMixin.mixinType == 7)) && (!localTherapyGameMixin.bFinalRxnPlayed))
/*      */     {
/*      */ 
/*      */ 
/* 1284 */       return true;
/*      */     }
/*      */     
/* 1287 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */   public void SetFinalRxnOfMixinAsUsed(int paramInt)
/*      */   {
/* 1293 */     if (paramInt != -1) {
/* 1294 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1295 */       localTherapyGameMixin.bFinalRxnPlayed = true;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void AddMixinScore(int paramInt)
/*      */   {
/* 1303 */     if (paramInt != -1) {
/* 1304 */       TherapyGameMixin localTherapyGameMixin = (TherapyGameMixin)mixinList.get(paramInt);
/* 1305 */       StringUtil.println("AddMixinScore mixinID " + paramInt + " scoreIncr " + localTherapyGameMixin.scoreIncr);
/* 1306 */       AddToScore(localTherapyGameMixin.storyTopic, localTherapyGameMixin.charFocus, localTherapyGameMixin.scoreIncr);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddToScore(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1315 */     numTimesScoreChanged += 1;
/* 1316 */     lastTimeScoreChanged = numMixinsPlayed;
/*      */     
/* 1318 */     if (paramInt1 == 59) {
/* 1319 */       if (paramInt2 == 0) { calculusScore_AA_G += paramInt3;calculusScoreWhenCtr_AA_G = numMixinsPlayed; }
/* 1320 */       if (paramInt2 == 1) { calculusScore_AA_T += paramInt3;calculusScoreWhenCtr_AA_T = numMixinsPlayed; }
/* 1321 */       if (paramInt2 == 2) { calculusScore_AA_R += paramInt3;calculusScoreWhenCtr_AA_R = numMixinsPlayed;
/*      */       } }
/* 1323 */     if (paramInt1 == 60) {
/* 1324 */       if (paramInt2 == 0) { calculusScore_F_G += paramInt3;calculusScoreWhenCtr_F_G = numMixinsPlayed; }
/* 1325 */       if (paramInt2 == 1) { calculusScore_F_T += paramInt3;calculusScoreWhenCtr_F_T = numMixinsPlayed; }
/* 1326 */       if (paramInt2 == 2) { calculusScore_F_R += paramInt3;calculusScoreWhenCtr_F_R = numMixinsPlayed;
/*      */       } }
/* 1328 */     if (paramInt1 == 61) {
/* 1329 */       if (paramInt2 == 0) { calculusScore_RM_G += paramInt3;calculusScoreWhenCtr_RM_G = numMixinsPlayed; }
/* 1330 */       if (paramInt2 == 1) { calculusScore_RM_T += paramInt3;calculusScoreWhenCtr_RM_T = numMixinsPlayed; }
/* 1331 */       if (paramInt2 == 2) { calculusScore_RM_R += paramInt3;calculusScoreWhenCtr_RM_R = numMixinsPlayed;
/*      */       }
/*      */     }
/* 1334 */     StringUtil.println("### TherapyGame AddToScore storyTopic " + paramInt1 + " charFocus " + paramInt2 + " val " + paramInt3);
/* 1335 */     StringUtil.println("AA_G = " + calculusScore_AA_G);
/* 1336 */     StringUtil.println("AA_T = " + calculusScore_AA_T);
/* 1337 */     StringUtil.println("AA_R = " + calculusScore_AA_R);
/* 1338 */     StringUtil.println("F_G = " + calculusScore_F_G);
/* 1339 */     StringUtil.println("F_T = " + calculusScore_F_T);
/* 1340 */     StringUtil.println("F_R = " + calculusScore_F_R);
/* 1341 */     StringUtil.println("RM_G = " + calculusScore_RM_G);
/* 1342 */     StringUtil.println("RM_T = " + calculusScore_RM_T);
/* 1343 */     StringUtil.println("RM_R = " + calculusScore_RM_R);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean DoWeHaveGTRRevelations()
/*      */   {
/* 1364 */     if ((calculusScore_AA_G + calculusScore_F_G + calculusScore_RM_G >= calculusScoreThreshold) && (calculusScore_AA_T + calculusScore_F_T + calculusScore_RM_T >= calculusScoreThreshold) && (calculusScore_AA_R + calculusScore_F_R + calculusScore_RM_R >= calculusScoreThreshold)) 0; return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void InitTherapyGame()
/*      */   {
/* 1375 */     StringUtil.println("### InitTherapyGame...");
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1382 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1395 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1408 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 59, 0, -1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1416 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 59, 1, -1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1424 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 60, 0, -1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1432 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 60, 1, -1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1440 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 61, 0, -1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1448 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 6, 61, 1, -1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1463 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 7, 59, 1, -1, 5, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1471 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 7, 61, 0, -1, 1, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1479 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 7, 61, 1, -1, 5, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1492 */     AddMixin(true, 2, 1, 23, 100, -1, -1, 0, 23, 101, -1, -1, 1, 26, 100, -1, -1, 1, 26, 101, -1, -1, 0, 59, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1502 */     AddMixin(true, 2, 1, 23, 100, -1, -1, 0, 23, 101, -1, -1, 1, 26, 100, -1, -1, 1, 26, 101, -1, -1, 0, 59, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1512 */     AddMixin(true, 2, 1, 23, 100, -1, -1, 0, 23, 101, -1, -1, 1, 26, 100, -1, -1, 1, 26, 101, -1, -1, 0, 59, 2, 0, 1, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1522 */     AddMixin(true, 2, 1, 23, 100, -1, -1, 0, 23, 101, -1, -1, 1, 26, 100, -1, -1, 1, 26, 101, -1, -1, 0, 61, 2, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1533 */     AddMixin(false, 0, 0, 24, 102, -1, -1, 1, 24, 103, -1, -1, 0, 25, 102, -1, -1, 1, 25, 103, -1, -1, 0, 61, 0, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1543 */     AddMixin(true, 2, 0, 24, 102, -1, -1, 1, 24, 103, -1, -1, 0, 25, 102, -1, -1, 1, 25, 103, -1, -1, 0, 61, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1553 */     AddMixin(true, 2, 0, 24, 102, -1, -1, 1, 24, 103, -1, -1, 0, 25, 102, -1, -1, 1, 25, 103, -1, -1, 0, 61, 2, 0, 5, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1564 */     AddMixin(true, 2, 1, 23, 102, -1, -1, 0, 23, 103, -1, -1, 0, 25, 103, -1, -1, 1, 25, 102, -1, -1, 0, 61, 0, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1574 */     AddMixin(true, 2, 1, 23, 102, -1, -1, 0, 23, 103, -1, -1, 0, 25, 103, -1, -1, 1, 25, 102, -1, -1, 0, 61, 1, 0, 5, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1584 */     AddMixin(true, 2, 1, 23, 102, -1, -1, 0, 23, 103, -1, -1, 0, 25, 103, -1, -1, 1, 25, 102, -1, -1, 0, 61, 2, 0, 4, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1596 */     AddMixin(false, 0, 0, 23, 105, -1, -1, 0, 26, 105, -1, -1, 0, 59, 0, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1604 */     AddMixin(true, 2, 0, 23, 105, -1, -1, 0, 26, 105, -1, -1, 0, 59, 2, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1612 */     AddMixin(true, 2, 0, 23, 105, -1, -1, 0, 26, 105, -1, -1, 0, 60, 0, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1620 */     AddMixin(true, 2, 0, 23, 105, -1, -1, 0, 26, 105, -1, -1, 0, 61, 0, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1630 */     AddMixin(false, 0, 1, 24, 106, -1, -1, 1, 25, 106, -1, -1, 0, 61, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1638 */     AddMixin(true, 2, 1, 24, 106, -1, -1, 1, 25, 106, -1, -1, 0, 61, 2, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1647 */     AddMixin(false, 0, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 59, 0, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1655 */     AddMixin(false, 0, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 59, 2, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1663 */     AddMixin(true, 2, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 60, 0, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1671 */     AddMixin(true, 2, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 60, 2, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1679 */     AddMixin(true, 2, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 60, 1, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1687 */     AddMixin(true, 2, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 60, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1695 */     AddMixin(true, 2, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 61, 0, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1703 */     AddMixin(true, 2, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 61, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1711 */     AddMixin(true, 2, 0, 23, 107, -1, -1, 0, 26, 107, -1, -1, 0, 61, 2, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1720 */     AddMixin(false, 0, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 59, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1728 */     AddMixin(false, 0, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 61, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1736 */     AddMixin(false, 0, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 61, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1744 */     AddMixin(false, 0, 1, 23, 107, -1, -1, 1, 26, 107, -1, -1, 0, 61, 2, 0, 4, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1753 */     AddMixin(false, 0, 2, 24, 111, -1, -1, 2, 26, 111, -1, -1, 0, 61, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1762 */     AddMixin(false, 0, 2, 24, 112, -1, -1, 2, 26, 112, -1, -1, 0, 61, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1771 */     AddMixin(false, 0, 2, 23, 113, -1, -1, 2, 25, 113, -1, -1, 0, 59, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1779 */     AddMixin(false, 0, 2, 23, 113, -1, -1, 2, 25, 113, -1, -1, 0, 60, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1787 */     AddMixin(false, 0, 2, 23, 113, -1, -1, 2, 25, 113, -1, -1, 0, 61, 2, 0, 1, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1796 */     AddMixin(true, 2, 0, 23, 117, -1, -1, 0, 25, 117, -1, -1, 0, 59, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1805 */     AddMixin(false, 0, 0, 23, 118, -1, -1, 0, 25, 118, -1, -1, 0, 24, 118, -1, -1, 0, 26, 118, -1, -1, 0, 59, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1817 */     AddMixin(true, 2, 1, 23, 118, -1, -1, 1, 25, 118, -1, -1, 0, 60, 1, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1831 */     AddMixin(false, 0, 1, 24, 100, -1, -1, 0, 24, 101, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 100, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1839 */     AddMixin(true, 0, 0, 23, 102, -1, -1, 1, 23, 103, -1, -1, 0, 61, 0, 1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1847 */     AddMixin(true, 0, 0, 23, 102, -1, -1, 1, 23, 103, -1, -1, 0, 61, 1, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1855 */     AddMixin(true, 0, 0, 23, 102, -1, -1, 1, 23, 103, -1, -1, 0, 61, 2, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1864 */     AddMixin(false, 0, 1, 24, 102, -1, -1, 0, 24, 103, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 102, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1872 */     AddMixin(false, 0, 0, 24, 105, -1, -1, 1, -1, -1, -1, -1, -1, 0, 23, 105, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1879 */     AddMixin(false, 0, 0, 23, 109, -1, -1, 0, 25, 109, -1, -1, 0, 26, 109, -1, -1, 1, 24, 109, -1, -1, 0, 59, 0, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1889 */     AddMixin(true, 0, 0, 23, 109, -1, -1, 0, 25, 109, -1, -1, 0, 26, 109, -1, -1, 1, 24, 109, -1, -1, 0, 59, 1, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1899 */     AddMixin(true, 0, 0, 23, 109, -1, -1, 0, 25, 109, -1, -1, 0, 26, 109, -1, -1, 1, 24, 109, -1, -1, 0, 59, 2, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1909 */     AddMixin(true, 0, 0, 23, 109, -1, -1, 0, 25, 109, -1, -1, 0, 26, 109, -1, -1, 1, 24, 109, -1, -1, 0, 60, 0, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1919 */     AddMixin(false, 0, 0, 23, 109, -1, -1, 0, 25, 109, -1, -1, 0, 26, 109, -1, -1, 1, 24, 109, -1, -1, 0, 61, 0, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1930 */     AddMixin(true, -1, 1, 23, 109, -1, -1, 1, 25, 109, -1, -1, 1, 26, 109, -1, -1, 0, 24, 109, -1, -1, 0, 59, 0, 1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1940 */     AddMixin(true, -1, 1, 23, 109, -1, -1, 1, 25, 109, -1, -1, 1, 26, 109, -1, -1, 0, 24, 109, -1, -1, 0, 59, 1, 1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1950 */     AddMixin(true, -1, 1, 23, 109, -1, -1, 1, 25, 109, -1, -1, 1, 26, 109, -1, -1, 0, 24, 109, -1, -1, 0, 59, 2, 1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1960 */     AddMixin(true, -1, 1, 23, 109, -1, -1, 1, 25, 109, -1, -1, 1, 26, 109, -1, -1, 0, 24, 109, -1, -1, 0, 60, 2, 1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1970 */     AddMixin(false, 0, 1, 23, 109, -1, -1, 1, 25, 109, -1, -1, 1, 26, 109, -1, -1, 0, 24, 109, -1, -1, 0, 61, 1, 1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1981 */     AddMixin(false, 0, 0, 23, 110, -1, -1, 0, 25, 110, -1, -1, 1, 24, 110, -1, -1, 1, 26, 110, -1, -1, 0, 59, 0, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1991 */     AddMixin(true, -1, 0, 23, 110, -1, -1, 0, 25, 110, -1, -1, 1, 24, 110, -1, -1, 1, 26, 110, -1, -1, 0, 59, 1, 1, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2001 */     AddMixin(true, -1, 0, 23, 110, -1, -1, 0, 25, 110, -1, -1, 1, 24, 110, -1, -1, 1, 26, 110, -1, -1, 0, 59, 2, 1, 4, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2011 */     AddMixin(true, -1, 0, 23, 110, -1, -1, 0, 25, 110, -1, -1, 1, 24, 110, -1, -1, 1, 26, 110, -1, -1, 0, 60, 1, 1, 4, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2021 */     AddMixin(true, -1, 0, 23, 110, -1, -1, 0, 25, 110, -1, -1, 1, 24, 110, -1, -1, 1, 26, 110, -1, -1, 0, 61, 0, 1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2032 */     AddMixin(true, -1, 1, 23, 110, -1, -1, 1, 25, 110, -1, -1, 0, 24, 110, -1, -1, 0, 26, 110, -1, -1, 0, 59, 0, 1, 1, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2042 */     AddMixin(true, -1, 1, 23, 110, -1, -1, 1, 25, 110, -1, -1, 0, 24, 110, -1, -1, 0, 26, 110, -1, -1, 0, 59, 1, 1, 1, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2052 */     AddMixin(true, -1, 1, 23, 110, -1, -1, 1, 25, 110, -1, -1, 0, 24, 110, -1, -1, 0, 26, 110, -1, -1, 0, 59, 2, 1, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2062 */     AddMixin(true, -1, 1, 23, 110, -1, -1, 1, 25, 110, -1, -1, 0, 24, 110, -1, -1, 0, 26, 110, -1, -1, 0, 60, 0, 1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2072 */     AddMixin(true, -1, 1, 23, 110, -1, -1, 1, 25, 110, -1, -1, 0, 24, 110, -1, -1, 0, 26, 110, -1, -1, 0, 61, 1, 1, 4, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2083 */     AddMixin(false, 0, 1, 23, 106, -1, -1, 1, -1, -1, -1, -1, -1, 1, 24, 106, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2090 */     AddMixin(false, 0, 0, 24, 107, -1, -1, 1, -1, -1, -1, -1, -1, 0, 23, 107, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2097 */     AddMixin(false, 0, 1, 24, 107, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 107, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2104 */     AddMixin(false, 0, 2, 23, 111, -1, -1, 2, 25, 111, -1, -1, 0, 61, 2, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2113 */     AddMixin(false, 0, 2, 23, 112, -1, -1, 2, 25, 112, -1, -1, 0, 61, 2, 1, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2122 */     AddMixin(false, 0, 2, 24, 113, -1, -1, 2, 26, 113, -1, -1, 1, -1, -1, -1, -1, -1, 2, 23, 113, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2130 */     AddMixin(false, 0, 2, 23, 115, -1, -1, 2, 25, 115, -1, -1, 0, 61, 2, 1, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2139 */     AddMixin(false, 0, 0, 24, 117, -1, -1, 0, 26, 117, -1, -1, 1, -1, -1, -1, -1, -1, 0, 23, 117, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2147 */     AddMixin(false, 0, 1, 24, 118, -1, -1, 1, 26, 118, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 118, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2160 */     AddMixin(false, 0, 0, 24, 100, -1, -1, 1, 24, 101, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 100, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2168 */     AddMixin(true, 0, 0, 23, 104, -1, -1, 0, 26, 104, -1, -1, 4, -1, -1, 0, 1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2177 */     AddMixin(true, 1, 1, 23, 105, -1, -1, 1, 26, 105, -1, -1, 0, 59, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2185 */     AddMixin(false, 0, 1, 23, 105, -1, -1, 1, 26, 105, -1, -1, 0, 61, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2194 */     AddMixin(true, 1, 0, 23, 106, -1, -1, 0, 61, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2202 */     AddMixin(true, 1, 0, 23, 108, -1, -1, 0, 25, 108, -1, -1, 0, 26, 108, -1, -1, 0, 59, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2211 */     AddMixin(true, 1, 0, 23, 108, -1, -1, 0, 25, 108, -1, -1, 0, 26, 108, -1, -1, 0, 59, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2220 */     AddMixin(true, 1, 0, 23, 108, -1, -1, 0, 25, 108, -1, -1, 0, 26, 108, -1, -1, 0, 59, 2, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2229 */     AddMixin(true, 1, 0, 23, 108, -1, -1, 0, 25, 108, -1, -1, 0, 26, 108, -1, -1, 0, 61, 0, 0, 0, 0, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2238 */     AddMixin(true, 1, 0, 23, 108, -1, -1, 0, 25, 108, -1, -1, 0, 26, 108, -1, -1, 0, 61, 2, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2248 */     AddMixin(true, 1, 1, 23, 108, -1, -1, 1, 25, 108, -1, -1, 1, 26, 108, -1, -1, 0, 59, 0, 0, 0, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2257 */     AddMixin(true, 1, 1, 23, 108, -1, -1, 1, 25, 108, -1, -1, 1, 26, 108, -1, -1, 0, 59, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2266 */     AddMixin(true, 1, 1, 23, 108, -1, -1, 1, 25, 108, -1, -1, 1, 26, 108, -1, -1, 0, 59, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2275 */     AddMixin(true, 1, 1, 23, 108, -1, -1, 1, 25, 108, -1, -1, 1, 26, 108, -1, -1, 0, 61, 1, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2284 */     AddMixin(true, 1, 1, 23, 108, -1, -1, 1, 25, 108, -1, -1, 1, 26, 108, -1, -1, 0, 61, 2, 0, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2294 */     AddMixin(false, 0, 2, 24, 115, -1, -1, 2, 26, 115, -1, -1, 0, 61, 2, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2303 */     AddMixin(false, 0, 2, 23, 116, -1, -1, 2, 25, 116, -1, -1, 2, 24, 116, -1, -1, 2, 26, 116, -1, -1, 4, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2314 */     AddMixin(false, 0, 1, 23, 117, -1, -1, 1, 25, 117, -1, -1, 0, 59, 1, 0, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2324 */     AddMixin(true, 0, 1, 24, 104, -1, -1, 4, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2337 */     AddMixin(true, 0, 0, 23, 100, -1, -1, 0, 26, 100, -1, -1, 1, 23, 101, -1, -1, 1, 26, 101, -1, -1, 4, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2348 */     AddMixin(true, 0, 0, 24, 104, -1, -1, 4, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2356 */     AddMixin(true, 0, 1, 23, 104, -1, -1, 1, 26, 104, -1, -1, 4, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2365 */     AddMixin(false, 0, 1, 24, 105, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 105, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2372 */     AddMixin(true, 0, 0, 24, 106, -1, -1, 0, 25, 106, -1, -1, 4, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2381 */     AddMixin(false, 0, 0, 24, 108, -1, -1, 1, -1, -1, -1, -1, -1, 0, 23, 108, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2388 */     AddMixin(false, 0, 1, 24, 108, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 108, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2395 */     AddMixin(false, 0, 2, 24, 114, -1, -1, 2, 26, 114, -1, -1, 4, -1, -1, 1, 5, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2404 */     AddMixin(false, 0, 1, 24, 117, -1, -1, 1, 26, 117, -1, -1, 1, -1, -1, -1, -1, -1, 1, 23, 117, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2419 */     AddMixin(false, 0, 0, 25, 100, -1, -1, 1, 25, 100, -1, -1, 0, 25, 101, -1, -1, 1, 25, 101, -1, -1, 4, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2461 */     AddMixin(false, 0, 2, 27, 125, 128, 127, 2, 28, 125, 128, 127, 0, 61, 1, 0, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2470 */     AddMixin(false, 0, 2, 27, 123, 128, 129, 2, 28, 123, 128, 129, 2, 27, 123, 129, 128, 2, 28, 123, 129, 128, 1, -1, -1, -1, -1, -1, 1, 27, 125, 128, 127);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2480 */     AddMixin(false, 0, 2, 27, 124, 128, 129, 2, 28, 124, 128, 129, 2, 27, 124, 129, 128, 2, 28, 124, 129, 128, 1, -1, -1, -1, -1, -1, 1, 27, 125, 128, 127);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2503 */     AddMixin(false, 0, 2, 27, 125, 127, 128, 2, 28, 125, 127, 128, 0, 61, 0, 0, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2512 */     AddMixin(false, 0, 2, 27, 123, 127, 130, 2, 28, 123, 127, 130, 2, 27, 123, 130, 127, 2, 28, 123, 130, 127, 1, -1, -1, -1, -1, -1, 0, 27, 125, 127, 128);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2522 */     AddMixin(false, 0, 2, 27, 124, 127, 130, 2, 28, 124, 127, 130, 2, 27, 124, 130, 127, 2, 28, 124, 130, 127, 1, -1, -1, -1, -1, -1, 0, 27, 125, 127, 128);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2550 */     AddMixin(false, 0, 2, 27, 123, 127, 131, 2, 28, 123, 127, 131, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2558 */     AddMixin(false, 0, 2, 27, 124, 127, 131, 2, 28, 124, 127, 131, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2566 */     AddMixin(false, 0, 2, 27, 123, 128, 131, 2, 28, 123, 128, 131, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2574 */     AddMixin(false, 0, 2, 27, 124, 128, 131, 2, 28, 124, 128, 131, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2582 */     AddMixin(false, 0, 2, 27, 123, 131, 127, 2, 28, 123, 131, 127, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2590 */     AddMixin(false, 0, 2, 27, 124, 131, 127, 2, 28, 124, 131, 127, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2598 */     AddMixin(false, 0, 2, 27, 123, 131, 128, 2, 28, 123, 131, 128, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2606 */     AddMixin(false, 0, 2, 27, 124, 131, 128, 2, 28, 124, 131, 128, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2614 */     AddMixin(false, 0, 2, 27, 123, 131, 132, 2, 28, 123, 131, 132, 2, 27, 124, 131, 132, 2, 28, 124, 131, 132, 1, -1, -1, -1, -1, -1, 3, 10, 78, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2627 */     AddMixin(false, 0, 2, 27, 123, 127, 132, 2, 28, 123, 127, 132, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2635 */     AddMixin(false, 0, 2, 27, 124, 127, 132, 2, 28, 124, 127, 132, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2643 */     AddMixin(false, 0, 2, 27, 123, 128, 132, 2, 28, 123, 128, 132, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2651 */     AddMixin(false, 0, 2, 27, 124, 128, 132, 2, 28, 124, 128, 132, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2659 */     AddMixin(false, 0, 2, 27, 123, 132, 127, 2, 28, 123, 132, 127, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2667 */     AddMixin(false, 0, 2, 27, 124, 132, 127, 2, 28, 124, 132, 127, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2675 */     AddMixin(false, 0, 2, 27, 123, 132, 128, 2, 28, 123, 132, 128, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2683 */     AddMixin(false, 0, 2, 27, 124, 132, 128, 2, 28, 124, 132, 128, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2691 */     AddMixin(false, 0, 2, 27, 123, 132, 131, 2, 28, 123, 132, 131, 2, 27, 124, 132, 131, 2, 28, 124, 132, 131, 1, -1, -1, -1, -1, -1, 3, 10, 79, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2707 */     AddMixin(false, 0, 2, 27, 123, 127, 128, 2, 28, 123, 127, 128, 2, 27, 124, 127, 128, 2, 28, 124, 127, 128, 0, 61, 2, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2723 */     AddMixin(false, 0, 2, 27, 123, 128, 127, 2, 28, 123, 128, 127, 2, 27, 124, 128, 127, 2, 28, 124, 128, 127, 0, 61, 2, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2737 */     AddMixin(false, 0, 2, 28, 123, 128, 130, 2, 27, 124, 128, 130, 2, 28, 123, 130, 128, 2, 27, 124, 130, 128, 4, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2753 */     AddMixin(false, 0, 2, 27, 123, 128, 130, 2, 28, 124, 128, 130, 2, 27, 123, 130, 128, 2, 28, 124, 130, 128, 4, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2778 */     AddMixin(false, 0, 2, 27, 123, 132, 129, 4, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2790 */     AddMixin(false, 0, 3, 10, 71, -1, -1, 3, 10, 61, -1, -1, 0, 61, 1, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2798 */     AddMixin(false, 0, 3, 10, 71, -1, -1, 0, 61, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2807 */     AddMixin(false, 0, 3, 10, 72, -1, -1, 0, 61, 0, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2814 */     AddMixin(false, 0, 3, 10, 72, -1, -1, 0, 61, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2823 */     AddMixin(false, 0, 3, 10, 73, -1, -1, 0, 61, 0, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2830 */     AddMixin(false, 0, 3, 10, 73, -1, -1, 0, 61, 1, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2839 */     AddMixin(false, 0, 3, 10, 74, -1, -1, 1, -1, -1, -1, -1, -1, 2, 23, 113, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2847 */     AddMixin(false, 0, 3, 10, 75, -1, -1, 0, 61, 0, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2854 */     AddMixin(false, 0, 3, 10, 75, -1, -1, 0, 61, 1, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2862 */     AddMixin(false, 0, 3, 10, 96, -1, -1, 0, 61, 2, 5, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2870 */     AddMixin(true, 0, 3, 10, 97, -1, -1, 3, 10, 80, -1, -1, 3, 10, 92, -1, -1, 3, 10, 95, -1, -1, 0, 60, 0, 4, 5, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2881 */     AddMixin(true, 0, 3, 10, 97, -1, -1, 3, 10, 80, -1, -1, 3, 10, 93, -1, -1, 3, 10, 60, -1, -1, 0, 60, 1, 4, 4, 1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2892 */     AddMixin(false, 0, 3, 10, 90, -1, -1, 0, 60, 0, 5, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2900 */     AddMixin(false, 0, 3, 10, 91, -1, -1, 0, 60, 1, 5, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2909 */     AddMixin(false, 0, 3, 10, 88, -1, -1, 3, 10, 59, -1, -1, 0, 59, 0, 4, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2918 */     AddMixin(false, 0, 3, 10, 98, -1, -1, 0, 59, 0, 4, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2927 */     AddMixin(false, 0, 3, 10, 76, -1, -1, 0, 61, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2935 */     AddMixin(false, 0, 3, 10, 77, -1, -1, 0, 59, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2943 */     AddMixin(false, 0, 3, 10, 78, -1, -1, 0, 59, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2950 */     AddMixin(false, 0, 3, 10, 78, -1, -1, 0, 60, 0, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2958 */     AddMixin(false, 0, 3, 10, 79, -1, -1, 3, 10, 99, -1, -1, 0, 60, 2, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2972 */     AddMixin(false, 0, 0, 16, -1, -1, -1, 0, 17, -1, -1, -1, 0, 22, -1, -1, -1, 0, 19, -1, -1, -1, 4, -1, -1, 8, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2984 */     AddMixin(false, 0, 0, 20, -1, -1, -1, 0, 21, -1, -1, -1, 0, 29, -1, -1, -1, 1, -1, -1, -1, -1, -1, 0, 16, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2994 */     AddMixin(false, 0, 1, 16, -1, -1, -1, 1, 17, -1, -1, -1, 1, 22, -1, -1, -1, 1, 19, -1, -1, -1, 4, -1, -1, 9, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3005 */     AddMixin(false, 0, 1, 20, -1, -1, -1, 1, 21, -1, -1, -1, 1, 29, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 16, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3020 */     AddMixin(false, 0, 0, 11, -1, -1, -1, 0, 13, -1, -1, -1, 4, -1, -1, 6, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3029 */     AddMixin(false, 0, 1, 11, -1, -1, -1, 1, 13, -1, -1, -1, 4, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3038 */     AddMixin(false, 0, 0, 12, -1, -1, -1, 4, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3046 */     AddMixin(false, 0, 1, 12, -1, -1, -1, 4, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3054 */     AddMixin(false, 0, 2, 15, -1, -1, -1, 4, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3063 */     AddMixin(false, 0, 3, 10, 87, -1, -1, 3, 10, 86, -1, -1, 4, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3079 */     AddMixin(false, 0, 2, 14, -1, -1, -1, 2, 18, -1, -1, -1, 2, 34, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3093 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3101 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3109 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3117 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3125 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3133 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3141 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 6, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3149 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3157 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 8, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3165 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 9, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3173 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3181 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3190 */     AddMixin(false, 0, -1, -1, -1, -1, -1, 5, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3206 */     AddStaging(69.0F, -389.0F, 84.0F, -124.0F, -209.0F, 332.0F);
/* 3207 */     AddStaging(-134.0F, -349.0F, 12.0F, 144.0F, -180.0F, 166.0F);
/* 3208 */     AddStaging(19.0F, -455.0F, 68.0F, 103.0F, -228.0F, 204.0F);
/* 3209 */     AddStaging(30.0F, -472.0F, 60.0F, -135.0F, -290.0F, 276.0F);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void TestTherapyGamePermutations()
/*      */   {
/* 3223 */     StringUtil.println("### TestTherapyGamePermutations testing Explain, Advice");
/* 3224 */     for (int j = 23; j <= 26; j++) {
/* 3225 */       for (int k = 100; k <= 122; k++) {
/* 3226 */         for (int m = 59; m <= 61; m++) {
/* 3227 */           for (int i = 0; i <= 1; i++) {
/* 3228 */             for (int n = 0; n <= 2; n++) {
/* 3229 */               int i1 = DoesMixinExist(i, j, k, -1, -1, 0, m, n);
/* 3230 */               if (i1 != -1) {
/* 3231 */                 StringUtil.println("### TGM " + i1 + " exists: who " + i + " daType " + j + " param " + k + " storyTopic " + m + " charFocus " + n);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddStaging(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*      */   {
/* 3252 */     TherapyGameStaging localTherapyGameStaging = new TherapyGameStaging();
/*      */     
/* 3254 */     localTherapyGameStaging.graceX = paramFloat1;
/* 3255 */     localTherapyGameStaging.graceZ = paramFloat2;
/* 3256 */     localTherapyGameStaging.graceRot = paramFloat3;
/* 3257 */     localTherapyGameStaging.tripX = paramFloat4;
/* 3258 */     localTherapyGameStaging.tripZ = paramFloat5;
/* 3259 */     localTherapyGameStaging.tripRot = paramFloat6;
/*      */     
/* 3261 */     stagingList.add(localTherapyGameStaging);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseStaging()
/*      */   {
/* 3273 */     int k = 0;
/* 3274 */     TherapyGameStaging localTherapyGameStaging; for (int i = 0; i < stagingList.size(); i++) {
/* 3275 */       localTherapyGameStaging = (TherapyGameStaging)stagingList.get(i);
/* 3276 */       if (!localTherapyGameStaging.bUsed) { k = 1;
/*      */       }
/*      */     }
/* 3279 */     if (k == 0) {
/* 3280 */       for (i = 0; i < stagingList.size(); i++) {
/* 3281 */         localTherapyGameStaging = (TherapyGameStaging)stagingList.get(i);
/* 3282 */         localTherapyGameStaging.bUsed = false;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 3287 */     currentStagingID = -1;
/* 3288 */     for (i = 0; (i < 100) && (currentStagingID == -1); i++) {
/* 3289 */       int j = randGen.nextInt(stagingList.size());
/* 3290 */       localTherapyGameStaging = (TherapyGameStaging)stagingList.get(j);
/* 3291 */       if (!localTherapyGameStaging.bUsed) { currentStagingID = j;
/*      */       }
/*      */     }
/* 3294 */     if (currentStagingID == -1) { currentStagingID = 0;
/*      */     }
/*      */     
/* 3297 */     return UpdateStagingVariables();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int UpdateStagingVariables()
/*      */   {
/* 3305 */     int i = 0;
/* 3306 */     int j = -1;
/* 3307 */     float f1 = 0.0F;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 3312 */     float f6 = 0.3F;
/* 3313 */     float f7 = 0.2F;
/*      */     
/*      */ 
/* 3316 */     if ((currentStoryTopic == 59) && (currentCharFocus == 0)) {
/* 3317 */       i = calculusScore_AA_G;j = 0; }
/* 3318 */     if ((currentStoryTopic == 59) && (currentCharFocus == 1)) {
/* 3319 */       i = calculusScore_AA_T;j = 1; }
/* 3320 */     if ((currentStoryTopic == 59) && (currentCharFocus == 2)) {
/* 3321 */       i = calculusScore_AA_R;j = 2; }
/* 3322 */     if ((currentStoryTopic == 60) && (currentCharFocus == 0)) {
/* 3323 */       i = calculusScore_F_G;j = 0; }
/* 3324 */     if ((currentStoryTopic == 60) && (currentCharFocus == 1)) {
/* 3325 */       i = calculusScore_F_T;j = 1; }
/* 3326 */     if ((currentStoryTopic == 60) && (currentCharFocus == 2)) {
/* 3327 */       i = calculusScore_F_R;j = 2; }
/* 3328 */     if ((currentStoryTopic == 61) && (currentCharFocus == 0)) {
/* 3329 */       i = calculusScore_RM_G;j = 0; }
/* 3330 */     if ((currentStoryTopic == 61) && (currentCharFocus == 1)) {
/* 3331 */       i = calculusScore_RM_T;j = 1; }
/* 3332 */     if ((currentStoryTopic == 61) && (currentCharFocus == 2)) {
/* 3333 */       i = calculusScore_RM_R;j = 2;
/*      */     }
/*      */     
/* 3336 */     f1 = i / 4;
/* 3337 */     if (f1 < 0.0F) f1 = 0.0F;
/* 3338 */     if (f1 > 1.0F) { f1 = 1.0F;
/*      */     }
/*      */     
/* 3341 */     TherapyGameStaging localTherapyGameStaging = (TherapyGameStaging)stagingList.get(currentStagingID);
/* 3342 */     curGraceX = localTherapyGameStaging.graceX;
/* 3343 */     curGraceZ = localTherapyGameStaging.graceZ;
/* 3344 */     curGraceRot = localTherapyGameStaging.graceRot;
/* 3345 */     curTripX = localTherapyGameStaging.tripX;
/* 3346 */     curTripZ = localTherapyGameStaging.tripZ;
/* 3347 */     curTripRot = localTherapyGameStaging.tripRot;
/*      */     float f2;
/*      */     float f4;
/* 3350 */     float f3; float f5; if (j == 0) {
/* 3351 */       f2 = localTherapyGameStaging.graceX;
/* 3352 */       f4 = localTherapyGameStaging.graceZ;
/* 3353 */       f3 = localTherapyGameStaging.graceX + (localTherapyGameStaging.tripX - localTherapyGameStaging.graceX) * f6;
/* 3354 */       f5 = localTherapyGameStaging.graceZ + (localTherapyGameStaging.tripZ - localTherapyGameStaging.graceZ) * f6;
/* 3355 */       curGraceX = f2 + (f3 - f2) * f1;
/* 3356 */       curGraceZ = f4 + (f5 - f4) * f1;
/*      */     }
/* 3358 */     else if (j == 1) {
/* 3359 */       f2 = localTherapyGameStaging.tripX;
/* 3360 */       f4 = localTherapyGameStaging.tripZ;
/* 3361 */       f3 = localTherapyGameStaging.tripX + (localTherapyGameStaging.graceX - localTherapyGameStaging.tripX) * f6;
/* 3362 */       f5 = localTherapyGameStaging.tripZ + (localTherapyGameStaging.graceZ - localTherapyGameStaging.tripZ) * f6;
/* 3363 */       curTripX = f2 + (f3 - f2) * f1;
/* 3364 */       curTripZ = f4 + (f5 - f4) * f1;
/*      */     }
/* 3366 */     else if (j == 2) {
/* 3367 */       f2 = localTherapyGameStaging.graceX;
/* 3368 */       f4 = localTherapyGameStaging.graceZ;
/* 3369 */       f3 = localTherapyGameStaging.graceX + (localTherapyGameStaging.tripX - localTherapyGameStaging.graceX) * f7;
/* 3370 */       f5 = localTherapyGameStaging.graceZ + (localTherapyGameStaging.tripZ - localTherapyGameStaging.graceZ) * f7;
/* 3371 */       curGraceX = f2 + (f3 - f2) * f1;
/* 3372 */       curGraceZ = f4 + (f5 - f4) * f1;
/*      */       
/* 3374 */       f2 = localTherapyGameStaging.tripX;
/* 3375 */       f4 = localTherapyGameStaging.tripZ;
/* 3376 */       f3 = localTherapyGameStaging.tripX + (localTherapyGameStaging.graceX - localTherapyGameStaging.tripX) * f7;
/* 3377 */       f5 = localTherapyGameStaging.tripZ + (localTherapyGameStaging.graceZ - localTherapyGameStaging.tripZ) * f7;
/* 3378 */       curTripX = f2 + (f3 - f2) * f1;
/* 3379 */       curTripZ = f4 + (f5 - f4) * f1;
/*      */     }
/*      */     
/* 3382 */     return currentStagingID;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void SetCurrentTherapyGameMood(int paramInt)
/*      */   {
/* 3390 */     currentMood = paramInt;
/* 3391 */     if (bMixinCausedByPlayer) currentMoodCause = 2; else {
/* 3392 */       currentMoodCause = -1;
/*      */     }
/* 3394 */     if ((paramInt == 2) || (paramInt == 6) || (paramInt == 1) || (paramInt == 5))
/*      */     {
/*      */ 
/* 3397 */       strongMoodDialogStage = 0;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void InitRevBuildup(IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5, IntegerRef paramIntegerRef6, IntegerRef paramIntegerRef7, IntegerRef paramIntegerRef8, IntegerRef paramIntegerRef9, IntegerRef paramIntegerRef10, IntegerRef paramIntegerRef11, IntegerRef paramIntegerRef12)
/*      */   {
/* 3413 */     int j = -1;
/* 3414 */     int k = -1;
/* 3415 */     int m = -1;
/* 3416 */     int n = -1;
/* 3417 */     int i1 = -1;
/* 3418 */     int i2 = -1;
/* 3419 */     int i3 = -1;
/* 3420 */     int i4 = -1;
/* 3421 */     int i5 = -1;
/* 3422 */     int i6 = -1;
/* 3423 */     int i7 = -1;
/* 3424 */     int i8 = -1;
/*      */     
/* 3426 */     int i9 = 0;
/* 3427 */     int i10 = 0;
/* 3428 */     int i11 = -1;
/* 3429 */     int i12 = -1;
/* 3430 */     int i13 = -1;
/*      */     
/* 3432 */     int i14 = 0;
/* 3433 */     int i15 = 0;
/* 3434 */     int i16 = -1;
/* 3435 */     int i17 = -1;
/* 3436 */     int i18 = -1;
/*      */     
/* 3438 */     int i19 = 0;
/* 3439 */     int i20 = 0;
/* 3440 */     int i21 = -1;
/* 3441 */     int i22 = -1;
/* 3442 */     int i23 = -1;
/*      */     
/* 3444 */     int i24 = 0;
/* 3445 */     if (calculusScore_AA_G + calculusScore_F_G + calculusScore_RM_G >= calculusScoreThreshold) {
/* 3446 */       i9 = 1;i24++;
/*      */     }
/* 3448 */     if (calculusScore_AA_T + calculusScore_F_T + calculusScore_RM_T >= calculusScoreThreshold) {
/* 3449 */       i14 = 1;i24++;
/*      */     }
/* 3451 */     if (calculusScore_AA_R + calculusScore_F_R + calculusScore_RM_R >= calculusScoreThreshold) {
/* 3452 */       i19 = 1;i24++;
/*      */     }
/*      */     
/* 3455 */     StringUtil.println("## ");
/* 3456 */     StringUtil.println("## InitRevBuildup");
/* 3457 */     StringUtil.println("## numRevThresholdsReached " + i24);
/*      */     
/*      */ 
/*      */ 
/* 3461 */     if ((i9 != 0) && (calculusScore_AA_G > i10)) {
/* 3462 */       i10 = calculusScore_AA_G;i12 = 59;
/* 3463 */       i11 = 0;i13 = calculusScoreWhenCtr_AA_G;
/* 3464 */       StringUtil.println("calculusScore_AA_G is currently chosen, score " + i10);
/*      */     }
/* 3466 */     if ((i9 != 0) && (calculusScore_F_G > i10)) {
/* 3467 */       i10 = calculusScore_F_G;i12 = 60;
/* 3468 */       i11 = 0;i13 = calculusScoreWhenCtr_F_G;
/* 3469 */       StringUtil.println("calculusScore_F_G is currently chosen, score " + i10);
/*      */     }
/* 3471 */     if ((i9 != 0) && (calculusScore_RM_G > i10)) {
/* 3472 */       i10 = calculusScore_RM_G;i12 = 61;
/* 3473 */       i11 = 0;i13 = calculusScoreWhenCtr_RM_G;
/* 3474 */       StringUtil.println("calculusScore_RM_G is currently chosen, score " + i10);
/*      */     }
/*      */     
/* 3477 */     if ((i14 != 0) && (calculusScore_AA_T > i15)) {
/* 3478 */       i15 = calculusScore_AA_T;i17 = 59;
/* 3479 */       i16 = 1;i18 = calculusScoreWhenCtr_AA_T;
/* 3480 */       StringUtil.println("calculusScore_AA_T is currently chosen, score " + i15);
/*      */     }
/* 3482 */     if ((i14 != 0) && (calculusScore_F_T > i15)) {
/* 3483 */       i15 = calculusScore_F_T;i17 = 60;
/* 3484 */       i16 = 1;i18 = calculusScoreWhenCtr_F_T;
/* 3485 */       StringUtil.println("calculusScore_F_T is currently chosen, score " + i15);
/*      */     }
/* 3487 */     if ((i14 != 0) && (calculusScore_RM_T > i15)) {
/* 3488 */       i15 = calculusScore_RM_T;i17 = 61;
/* 3489 */       i16 = 1;i18 = calculusScoreWhenCtr_RM_T;
/* 3490 */       StringUtil.println("calculusScore_RM_T is currently chosen, score " + i15);
/*      */     }
/*      */     
/* 3493 */     if ((i19 != 0) && (calculusScore_AA_R > i20)) {
/* 3494 */       i20 = calculusScore_AA_R;i22 = 59;
/* 3495 */       i21 = 0;i23 = calculusScoreWhenCtr_AA_R;
/* 3496 */       StringUtil.println("calculusScore_AA_R is currently chosen, score " + i20);
/*      */     }
/* 3498 */     if ((i19 != 0) && (calculusScore_F_R > i20)) {
/* 3499 */       i20 = calculusScore_F_R;i22 = 60;
/* 3500 */       i21 = 1;i23 = calculusScoreWhenCtr_F_R;
/* 3501 */       StringUtil.println("calculusScore_F_R is currently chosen, score " + i20);
/*      */     }
/* 3503 */     if ((i19 != 0) && (calculusScore_RM_R > i20)) {
/* 3504 */       i20 = calculusScore_RM_R;i22 = 61;
/* 3505 */       i21 = 1;i23 = calculusScoreWhenCtr_RM_R;
/* 3506 */       StringUtil.println("calculusScore_RM_R is currently chosen, score " + i20);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 3512 */     if (i24 <= 0) {
/* 3513 */       if (randGen.nextInt(2) == 0) j = 0; else {
/* 3514 */         j = 1;
/*      */       }
/*      */     }
/*      */     else {
/* 3518 */       if ((!$noassert) && (i11 == -1) && (i16 == -1) && (i21 == -1)) { throw new AssertionError();
/*      */       }
/*      */       
/*      */ 
/* 3522 */       if (i11 != -1) {
/* 3523 */         j = i11;k = i12;m = 0;n = i13;
/* 3524 */         StringUtil.println("G currently rev1");
/*      */       }
/*      */       
/* 3527 */       if (i16 != -1) {
/* 3528 */         if (j == -1) {
/* 3529 */           j = i16;k = i17;m = 1;n = i18;
/* 3530 */           StringUtil.println("T currently rev1");
/*      */         } else {
/* 3532 */           i1 = i16;i2 = i17;i3 = 1;i4 = i18;
/* 3533 */           StringUtil.println("T currently rev2");
/*      */         }
/*      */       }
/*      */       
/* 3537 */       if (i21 != -1) {
/* 3538 */         if (j == -1) {
/* 3539 */           j = i21;k = i22;m = 2;n = i23;
/* 3540 */           StringUtil.println("R currently rev1");
/* 3541 */         } else if (i1 == -1) {
/* 3542 */           i1 = i21;i2 = i22;i3 = 2;i4 = i23;
/* 3543 */           StringUtil.println("R currently rev2");
/*      */         } else {
/* 3545 */           i5 = i21;i6 = i22;i7 = 2;i8 = i23;
/* 3546 */           StringUtil.println("R currently rev3");
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */     int i;
/*      */     
/* 3554 */     if ((i1 != -1) && (i4 > n)) {
/* 3555 */       i = j;j = i1;i1 = i;
/* 3556 */       i = k;k = i2;i2 = i;
/* 3557 */       i = m;m = i3;i3 = i;
/* 3558 */       i = n;n = i4;i4 = i;
/* 3559 */       StringUtil.println("swap rev1 and 2");
/*      */     }
/*      */     
/* 3562 */     if ((i5 != -1) && (i8 > n)) {
/* 3563 */       i = j;j = i5;i5 = i;
/* 3564 */       i = k;k = i6;i6 = i;
/* 3565 */       i = m;m = i7;i7 = i;
/* 3566 */       i = n;n = i8;i8 = i;
/* 3567 */       StringUtil.println("then swap rev1 and 3");
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 3572 */     if ((i5 != -1) && ((m == 0) || (i3 == 0) || (i7 == 0)) && ((m == 1) || (i3 == 1) || (i7 == 1)) && (j == i1))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 3577 */       i = i1;i1 = i5;i5 = i;
/* 3578 */       i = i2;i2 = i6;i6 = i;
/* 3579 */       i = i3;i3 = i7;i7 = i;
/* 3580 */       i = i4;i4 = i8;i8 = i;
/* 3581 */       StringUtil.println("then swap rev2 and 3");
/*      */     }
/*      */     
/*      */ 
/* 3585 */     paramIntegerRef1.i = j;
/* 3586 */     paramIntegerRef2.i = k;
/* 3587 */     paramIntegerRef3.i = m;
/* 3588 */     paramIntegerRef4.i = n;
/* 3589 */     paramIntegerRef5.i = i1;
/* 3590 */     paramIntegerRef6.i = i2;
/* 3591 */     paramIntegerRef7.i = i3;
/* 3592 */     paramIntegerRef8.i = i4;
/* 3593 */     paramIntegerRef9.i = i5;
/* 3594 */     paramIntegerRef10.i = i6;
/* 3595 */     paramIntegerRef11.i = i7;
/* 3596 */     paramIntegerRef12.i = i8;
/*      */     
/* 3598 */     StringUtil.println("## rev1 who " + j + " topic " + k + " charFocus " + m + " whenCtr " + n);
/* 3599 */     StringUtil.println("## rev2 who " + i1 + " topic " + i2 + " charFocus " + i3 + " whenCtr " + i4);
/* 3600 */     StringUtil.println("## rev3 who " + i5 + " topic " + i6 + " charFocus " + i7 + " whenCtr " + i8);
/* 3601 */     StringUtil.println("## ");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean PossibleManualHackMapping(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5)
/*      */   {
/* 3627 */     if ((paramInt2 == 26) && ((paramInt1 == 0) || (paramInt1 == 1)) && ((paramInt3 == 102) || (paramInt3 == 103) || (paramInt3 == 106)))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3633 */       StringUtil.println("## hack map grace should not be loving, etc. to grace advice controlling");
/* 3634 */       paramIntegerRef1.i = 0;
/* 3635 */       paramIntegerRef2.i = 25;
/* 3636 */       paramIntegerRef3.i = 100;
/* 3637 */       paramIntegerRef4.i = -1;
/* 3638 */       paramIntegerRef5.i = -1;
/* 3639 */       return true;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3648 */     if ((paramInt2 == 25) && ((paramInt1 == 0) || (paramInt1 == 1)) && ((paramInt3 == 104) || (paramInt3 == 105) || (paramInt3 == 107)))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3654 */       StringUtil.println("## hack map grace should be depressing, etc. to grace advice controlling");
/* 3655 */       paramIntegerRef1.i = 0;
/* 3656 */       paramIntegerRef2.i = 25;
/* 3657 */       paramIntegerRef3.i = 100;
/* 3658 */       paramIntegerRef4.i = -1;
/* 3659 */       paramIntegerRef5.i = -1;
/* 3660 */       return true;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3676 */     if (((paramInt1 == 0) || (paramInt1 == 1)) && ((paramInt3 == 119) || (paramInt3 == 120) || (paramInt3 == 121)))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 3681 */       StringUtil.println("## hack map kill, etc. to grace advice controlling");
/* 3682 */       paramIntegerRef1.i = 0;
/* 3683 */       paramIntegerRef2.i = 25;
/* 3684 */       paramIntegerRef3.i = 100;
/* 3685 */       paramIntegerRef4.i = -1;
/* 3686 */       paramIntegerRef5.i = -1;
/* 3687 */       return true;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 3693 */     if ((paramInt2 != 27) && (paramInt2 != 28)) { return false;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 3699 */     if ((paramInt3 == 125) && ((paramInt4 != 127) || (paramInt5 != 128)) && ((paramInt4 != 128) || (paramInt5 != 127)))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 3704 */       StringUtil.println("## hack map cheating to trip loves vince");
/* 3705 */       paramIntegerRef1.i = paramInt1;
/* 3706 */       paramIntegerRef2.i = 27;
/* 3707 */       paramIntegerRef3.i = 123;
/* 3708 */       paramIntegerRef4.i = 128;
/* 3709 */       paramIntegerRef5.i = 130;
/* 3710 */       return true;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3722 */     if (((paramInt4 != 128) || (paramInt5 != 129)) && ((paramInt4 != 129) || (paramInt5 != 128)) && ((paramInt4 != 127) || (paramInt5 != 130)) && ((paramInt4 != 130) || (paramInt5 != 127)) && ((paramInt4 != 127) || (paramInt5 != 131)) && ((paramInt4 != 131) || (paramInt5 != 127)) && ((paramInt4 != 128) || (paramInt5 != 132)) && ((paramInt4 != 132) || (paramInt5 != 128)) && ((paramInt4 != 127) || (paramInt5 != 128)) && ((paramInt4 != 128) || (paramInt5 != 127)) && ((paramInt4 != 128) || (paramInt5 != 130)) && ((paramInt4 != 130) || (paramInt5 != 128)))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3736 */       StringUtil.println("## hack map to tripsparents loves maria");
/* 3737 */       paramIntegerRef1.i = paramInt1;
/* 3738 */       paramIntegerRef2.i = 27;
/* 3739 */       paramIntegerRef3.i = 123;
/* 3740 */       paramIntegerRef4.i = 132;
/* 3741 */       paramIntegerRef5.i = 129;
/* 3742 */       return true;
/*      */     }
/*      */     
/* 3745 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\TherapyGameState.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */