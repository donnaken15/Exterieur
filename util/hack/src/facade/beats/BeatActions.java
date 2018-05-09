/*     */ package facade.beats;
/*     */ 
/*     */ import dramaman.runtime.BeatStartWME;
/*     */ import dramaman.runtime.DramaManager;
/*     */ import dramaman.runtime.StoryMemory;
/*     */ import dramaman.runtime.StoryStatusWME;
/*     */ import facade.characters.wmedef.BeatArgumentWME;
/*     */ import facade.characters.wmedef.BeatRevelationsP2WME;
/*     */ import facade.characters.wmedef.DAWME;
/*     */ import java.util.LinkedList;
/*     */ import scope.VariableScope;
/*     */ import scope.VariableScope.BooleanValue;
/*     */ import scope.VariableScope.IntValue;
/*     */ import scope.VariableScope.Variable;
/*     */ import scope.VariableScopeThrowsErrors;
/*     */ import wm.WorkingMemory;
/*     */ 
/*     */ public class BeatActions implements facade.util.BeatID, dramaman.runtime.DramaManagerConstants, facade.util.DAType, facade.util.BeatArguments, facade.util.TherapyGameConstants
/*     */ {
/*     */   public static void _ExplDatAnniv_T1_initAction(VariableScope paramVariableScope)
/*     */   {
/*  22 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ExplDatAnniv_T1_initAction_scope");
/*  23 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/*  24 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/*  25 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*  26 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ExplDatAnniv_T1_selectAction(VariableScope paramVariableScope) {
/*  30 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ExplDatAnniv_T1_selectAction_scope");
/*  31 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/*  32 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _ExplDatAnniv_T1_succeedAction(VariableScope paramVariableScope) {
/*  36 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ExplDatAnniv_T1_succeedAction_scope");
/*  37 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _PhoneCall_NGPA_T1_initAction(VariableScope paramVariableScope) {
/*  41 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NGPA_T1_initAction_scope");
/*  42 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/*     */   }
/*     */   
/*     */   public static void _PhoneCall_NGPA_T1_selectAction(VariableScope paramVariableScope) {
/*  46 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NGPA_T1_selectAction_scope");
/*  47 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/*  48 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _PhoneCall_NTPA_T1_initAction(VariableScope paramVariableScope) {
/*  52 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NTPA_T1_initAction_scope");
/*  53 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/*     */   }
/*     */   
/*     */   public static void _PhoneCall_NTPA_T1_selectAction(VariableScope paramVariableScope) {
/*  57 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NTPA_T1_selectAction_scope");
/*  58 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/*  59 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_N_T1_initAction(VariableScope paramVariableScope) {
/*  63 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_initAction_scope");
/*  64 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/*  65 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/*  66 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/*  67 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/*  68 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*  69 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_N_T1_selectAction(VariableScope paramVariableScope) {
/*  73 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_selectAction_scope");
/*  74 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/*  75 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i, -1, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 1)) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/*  76 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_N_T1_succeedAction(VariableScope paramVariableScope) {
/*  80 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_succeedAction_scope");
/*  81 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T1_initAction(VariableScope paramVariableScope) {
/*  85 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_initAction_scope");
/*  86 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/*  87 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/*  88 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/*  89 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/*  90 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*  91 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T1_selectAction(VariableScope paramVariableScope) {
/*  95 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_selectAction_scope");
/*  96 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/*  97 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i, -1, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 1) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/*  98 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 102 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_succeedAction_scope");
/* 103 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T1_initAction(VariableScope paramVariableScope) {
/* 107 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_initAction_scope");
/* 108 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 109 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 110 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 111 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/* 112 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 113 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T1_selectAction(VariableScope paramVariableScope) {
/* 117 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_selectAction_scope");
/* 118 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 119 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i, -1, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/* 120 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 124 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_succeedAction_scope");
/* 125 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_N_T1_initAction(VariableScope paramVariableScope) {
/* 129 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_initAction_scope");
/* 130 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 131 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 132 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 133 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 134 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_N_T1_selectAction(VariableScope paramVariableScope) {
/* 138 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_selectAction_scope");
/* 139 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 140 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 141 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_N_T1_succeedAction(VariableScope paramVariableScope) {
/* 145 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_succeedAction_scope");
/* 146 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T1_initAction(VariableScope paramVariableScope) {
/* 150 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_initAction_scope");
/* 151 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 152 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 153 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 154 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 155 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T1_selectAction(VariableScope paramVariableScope) {
/* 159 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_selectAction_scope");
/* 160 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 161 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 162 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 166 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_succeedAction_scope");
/* 167 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T1_initAction(VariableScope paramVariableScope) {
/* 171 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_initAction_scope");
/* 172 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 173 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 174 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 175 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 176 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T1_selectAction(VariableScope paramVariableScope) {
/* 180 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_selectAction_scope");
/* 181 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 182 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 183 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 187 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_succeedAction_scope");
/* 188 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _Facade_NTPA_T1_initAction(VariableScope paramVariableScope) {
/* 192 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_initAction_scope");
/* 193 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 194 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 195 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 196 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 197 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _Facade_NTPA_T1_selectAction(VariableScope paramVariableScope) {
/* 201 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_selectAction_scope");
/* 202 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 203 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/* 204 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _Facade_NTPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 208 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_succeedAction_scope");
/* 209 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T1_initAction(VariableScope paramVariableScope) {
/* 213 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_initAction_scope");
/* 214 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 215 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 216 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 217 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 218 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T1_selectAction(VariableScope paramVariableScope) {
/* 222 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_selectAction_scope");
/* 223 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 224 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 225 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T1_succeedAction(VariableScope paramVariableScope) {
/* 229 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_succeedAction_scope");
/* 230 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _TxnT1ToT2NGPA_selectAction(VariableScope paramVariableScope) {
/* 234 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2NGPA_selectAction_scope");
/* 235 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/* 236 */     WorkingMemory.addWME("BeatMemory", new BeatArgumentWME(0));
/*     */   }
/*     */   
/*     */   public static void _TxnT1ToT2TPA_selectAction(VariableScope paramVariableScope) {
/* 240 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2TPA_selectAction_scope");
/* 241 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/* 242 */     WorkingMemory.addWME("BeatMemory", new BeatArgumentWME(0));
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGAffChr_T2_initAction(VariableScope paramVariableScope) {
/* 246 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGAffChr_T2_initAction_scope");
/* 247 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 248 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 249 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGAffChr_T2_selectAction(VariableScope paramVariableScope) {
/* 253 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGAffChr_T2_selectAction_scope");
/* 254 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 255 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGAffChr_T2_succeedAction(VariableScope paramVariableScope) {
/* 259 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGAffChr_T2_succeedAction_scope");
/* 260 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTAffChr_T2_initAction(VariableScope paramVariableScope) {
/* 264 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTAffChr_T2_initAction_scope");
/* 265 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 266 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 267 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTAffChr_T2_selectAction(VariableScope paramVariableScope) {
/* 271 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTAffChr_T2_selectAction_scope");
/* 272 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 273 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTAffChr_T2_succeedAction(VariableScope paramVariableScope) {
/* 277 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTAffChr_T2_succeedAction_scope");
/* 278 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _NonAffChrGReturns_T2_initAction(VariableScope paramVariableScope) {
/* 282 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrGReturns_T2_initAction_scope");
/* 283 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 284 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 285 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 286 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _NonAffChrGReturns_T2_selectAction(VariableScope paramVariableScope) {
/* 290 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrGReturns_T2_selectAction_scope");
/* 291 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 292 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _NonAffChrGReturns_T2_succeedAction(VariableScope paramVariableScope) {
/* 296 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrGReturns_T2_succeedAction_scope");
/* 297 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _NonAffChrTReturns_T2_initAction(VariableScope paramVariableScope) {
/* 301 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrTReturns_T2_initAction_scope");
/* 302 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 303 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 304 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 305 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _NonAffChrTReturns_T2_selectAction(VariableScope paramVariableScope) {
/* 309 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrTReturns_T2_selectAction_scope");
/* 310 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 311 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _NonAffChrTReturns_T2_succeedAction(VariableScope paramVariableScope) {
/* 315 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrTReturns_T2_succeedAction_scope");
/* 316 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGNonAffChr_T2_initAction(VariableScope paramVariableScope) {
/* 320 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGNonAffChr_T2_initAction_scope");
/* 321 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 322 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 323 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 324 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGNonAffChr_T2_selectAction(VariableScope paramVariableScope) {
/* 328 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGNonAffChr_T2_selectAction_scope");
/* 329 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 330 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _OneOnOneGNonAffChr_T2_succeedAction(VariableScope paramVariableScope) {
/* 334 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGNonAffChr_T2_succeedAction_scope");
/* 335 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTNonAffChr_T2_initAction(VariableScope paramVariableScope) {
/* 339 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTNonAffChr_T2_initAction_scope");
/* 340 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 341 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 342 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 343 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTNonAffChr_T2_selectAction(VariableScope paramVariableScope) {
/* 347 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTNonAffChr_T2_selectAction_scope");
/* 348 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 349 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/*     */   }
/*     */   
/*     */   public static void _OneOnOneTNonAffChr_T2_succeedAction(VariableScope paramVariableScope) {
/* 353 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTNonAffChr_T2_succeedAction_scope");
/* 354 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2_initAction(VariableScope paramVariableScope) {
/* 358 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_initAction_scope");
/* 359 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 360 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 361 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 362 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/* 363 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 364 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2_selectAction(VariableScope paramVariableScope) {
/* 368 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_selectAction_scope");
/* 369 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 370 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i, -1, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 1) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/* 371 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 375 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_succeedAction_scope");
/* 376 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2ToT3_initAction(VariableScope paramVariableScope) {
/* 380 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_initAction_scope");
/* 381 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 382 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 383 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 384 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/* 385 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 386 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2ToT3_selectAction(VariableScope paramVariableScope) {
/* 390 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_selectAction_scope");
/* 391 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 392 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(0, 4, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 1) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3, 4));
/* 393 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_GPA_T2ToT3_succeedAction(VariableScope paramVariableScope) {
/* 397 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_succeedAction_scope");
/* 398 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2_initAction(VariableScope paramVariableScope) {
/* 402 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_initAction_scope");
/* 403 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 404 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 405 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 406 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/* 407 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 408 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2_selectAction(VariableScope paramVariableScope) {
/* 412 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_selectAction_scope");
/* 413 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 414 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i, -1, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3));
/* 415 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 419 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_succeedAction_scope");
/* 420 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2ToT3_initAction(VariableScope paramVariableScope) {
/* 424 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_initAction_scope");
/* 425 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 426 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 427 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 428 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = -1;
/* 429 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 430 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2ToT3_selectAction(VariableScope paramVariableScope) {
/* 434 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_selectAction_scope");
/* 435 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 436 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(0, 4, -1, false, ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i)); else if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(3, 4));
/* 437 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _ArtistAdvertising_TPA_T2ToT3_succeedAction(VariableScope paramVariableScope) {
/* 441 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_succeedAction_scope");
/* 442 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2_initAction(VariableScope paramVariableScope) {
/* 446 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_initAction_scope");
/* 447 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 448 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 449 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 450 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 451 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2_selectAction(VariableScope paramVariableScope) {
/* 455 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_selectAction_scope");
/* 456 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 457 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 458 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 462 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_succeedAction_scope");
/* 463 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2ToT3_initAction(VariableScope paramVariableScope) {
/* 467 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_initAction_scope");
/* 468 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 469 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 470 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 471 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 472 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2ToT3_selectAction(VariableScope paramVariableScope) {
/* 476 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_selectAction_scope");
/* 477 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 478 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(0, 4));
/* 479 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_GPA_T2ToT3_succeedAction(VariableScope paramVariableScope) {
/* 483 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_succeedAction_scope");
/* 484 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2_initAction(VariableScope paramVariableScope) {
/* 488 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_initAction_scope");
/* 489 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 490 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 491 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 492 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 493 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2_selectAction(VariableScope paramVariableScope) {
/* 497 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_selectAction_scope");
/* 498 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 499 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 500 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 504 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_succeedAction_scope");
/* 505 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2ToT3_initAction(VariableScope paramVariableScope) {
/* 509 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_initAction_scope");
/* 510 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 511 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 512 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 513 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 514 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2ToT3_selectAction(VariableScope paramVariableScope) {
/* 518 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_selectAction_scope");
/* 519 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 520 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(0, 4));
/* 521 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _RockyMarriage_TPA_T2ToT3_succeedAction(VariableScope paramVariableScope) {
/* 525 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_succeedAction_scope");
/* 526 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _Facade_TPA_T2_initAction(VariableScope paramVariableScope) {
/* 530 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_initAction_scope");
/* 531 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 532 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 533 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 534 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 535 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _Facade_TPA_T2_selectAction(VariableScope paramVariableScope) {
/* 539 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_selectAction_scope");
/* 540 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 541 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 542 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _Facade_TPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 546 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_succeedAction_scope");
/* 547 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T2_initAction(VariableScope paramVariableScope) {
/* 551 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_initAction_scope");
/* 552 */     localVariableScopeThrowsErrors.getVariable("unhandledAct").value = null;
/* 553 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 0;
/* 554 */     ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = 0;
/* 555 */     localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 556 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value == null) localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = null; else localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value = ((StoryMemory)localVariableScopeThrowsErrors.getVariable("storyMemory").value).findPrev("dramaman.runtime.BeatStartWME", ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp());
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T2_selectAction(VariableScope paramVariableScope) {
/* 560 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_selectAction_scope");
/* 561 */     ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).deleteAllWMEClass("BeatArgumentWME");
/* 562 */     if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 0) ((WorkingMemory)localVariableScopeThrowsErrors.getVariable("beatMemory").value).addWME(new BeatArgumentWME(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i));
/* 563 */     ((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).setStoryTopicBeatCount(((StoryStatusWME)localVariableScopeThrowsErrors.getVariable("storyStatusWME").value).getStoryTopicBeatCount() + 1);
/*     */   }
/*     */   
/*     */   public static void _Facade_GPA_T2_succeedAction(VariableScope paramVariableScope) {
/* 567 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_succeedAction_scope");
/* 568 */     if (localVariableScopeThrowsErrors.getVariable("unhandledAct").value != null) ((DAWME)localVariableScopeThrowsErrors.getVariable("unhandledAct").value).setHandledStatus(2);
/*     */   }
/*     */   
/*     */   public static void _TxnT2ToT3_selectAction(VariableScope paramVariableScope) {
/* 572 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT2ToT3_selectAction_scope");
/* 573 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/* 574 */     WorkingMemory.addWME("BeatMemory", new BeatArgumentWME(0));
/*     */   }
/*     */   
/*     */   public static void _RomPrp_GPA_T2_selectAction(VariableScope paramVariableScope) {
/* 578 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RomPrp_GPA_T2_selectAction_scope");
/* 579 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/* 580 */     WorkingMemory.addWME("BeatMemory", new BeatArgumentWME(0));
/*     */   }
/*     */   
/*     */   public static void _CrisisP1_selectAction(VariableScope paramVariableScope) {
/* 584 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_CrisisP1_selectAction_scope");
/* 585 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/* 586 */     WorkingMemory.addWME("BeatMemory", new BeatArgumentWME(0));
/*     */   }
/*     */   
/*     */   public static void _CrisisToTherapyGameGlue_P2_initAction(VariableScope paramVariableScope) {
/* 590 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_CrisisToTherapyGameGlue_P2_initAction_scope");
/* 591 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = DramaManager.getStoryMemory().findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _CrisisToTherapyGameGlue_P2_selectAction(VariableScope paramVariableScope) {
/* 595 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_CrisisToTherapyGameGlue_P2_selectAction_scope");
/* 596 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _TherapyGame_P2_initAction(VariableScope paramVariableScope) {
/* 600 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TherapyGame_P2_initAction_scope");
/* 601 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = DramaManager.getStoryMemory().findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _TherapyGame_P2_selectAction(VariableScope paramVariableScope) {
/* 605 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TherapyGame_P2_selectAction_scope");
/* 606 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _RevelationBuildup_P2_initAction(VariableScope paramVariableScope) {
/* 610 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RevelationBuildup_P2_initAction_scope");
/* 611 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.getVariable("lastBeatStart").value = DramaManager.getStoryMemory().findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static void _RevelationBuildup_P2_selectAction(VariableScope paramVariableScope) {
/* 615 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RevelationBuildup_P2_selectAction_scope");
/* 616 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _Revelations_P2_selectAction(VariableScope paramVariableScope) {
/* 620 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Revelations_P2_selectAction_scope");
/* 621 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _EndingNoRevelations_selectAction(VariableScope paramVariableScope) {
/* 625 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingNoRevelations_selectAction_scope");
/* 626 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _EndingSelfRevelationOnly_selectAction(VariableScope paramVariableScope) {
/* 630 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingSelfRevelationOnly_selectAction_scope");
/* 631 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _EndingRelationshipRevelationOnly_selectAction(VariableScope paramVariableScope) {
/* 635 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingRelationshipRevelationOnly_selectAction_scope");
/* 636 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _EndingSelfAndRelationshipNotGTR_initAction(VariableScope paramVariableScope) {
/* 640 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingSelfAndRelationshipNotGTR_initAction_scope");
/* 641 */     localVariableScopeThrowsErrors.getVariable("wmeList").value = WorkingMemory.lookupWME("StoryMemory", "BeatRevelationsP2WME");
/* 642 */     if (((LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).size() == 1) { localVariableScopeThrowsErrors.getVariable("revWME").value = ((BeatRevelationsP2WME)((LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).get(0));((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev1CharFocus();((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev2CharFocus();((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev3CharFocus(); if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 1)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("tripRev")).b = true; if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 0)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("graceRev")).b = true; if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 2)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("relationshipRev")).b = true;
/*     */     }
/*     */   }
/*     */   
/* 646 */   public static void _EndingSelfAndRelationshipNotGTR_selectAction(VariableScope paramVariableScope) { VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingSelfAndRelationshipNotGTR_selectAction_scope");
/* 647 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */   
/*     */   public static void _EndingGTR_initAction(VariableScope paramVariableScope) {
/* 651 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingGTR_initAction_scope");
/* 652 */     localVariableScopeThrowsErrors.getVariable("wmeList").value = WorkingMemory.lookupWME("StoryMemory", "BeatRevelationsP2WME");
/* 653 */     if (((LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).size() == 1) { localVariableScopeThrowsErrors.getVariable("revWME").value = ((BeatRevelationsP2WME)((LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).get(0));((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev1CharFocus();((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev2CharFocus();((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i = ((BeatRevelationsP2WME)localVariableScopeThrowsErrors.getVariable("revWME").value).getRev3CharFocus(); if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 1)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("tripRev")).b = true; if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 0)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("graceRev")).b = true; if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 2)) ((VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("relationshipRev")).b = true;
/*     */     }
/*     */   }
/*     */   
/* 657 */   public static void _EndingGTR_selectAction(VariableScope paramVariableScope) { VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingGTR_selectAction_scope");
/* 658 */     WorkingMemory.deleteAllWMEClass("BeatMemory", "BeatArgumentWME");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\beats\BeatActions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */