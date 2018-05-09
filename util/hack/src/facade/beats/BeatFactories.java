/*     */ package facade.beats;
/*     */ 
/*     */ import dramaman.runtime.Beat;
/*     */ import dramaman.runtime.Beat.PriorityTest;
/*     */ import dramaman.runtime.Beat.WeightTest;
/*     */ import dramaman.runtime.DramaManager;
/*     */ import dramaman.runtime.DramaManagerConstants;
/*     */ import dramaman.runtime.StoryEffect;
/*     */ import facade.util.BeatArguments;
/*     */ import facade.util.BeatID;
/*     */ import facade.util.DAType;
/*     */ import facade.util.TherapyGameConstants;
/*     */ import scope.VariableScope.BooleanValue;
/*     */ import scope.VariableScope.IntValue;
/*     */ import scope.VariableScopeThrowsErrors;
/*     */ import wm.WorkingMemory;
/*     */ 
/*     */ public class BeatFactories implements BeatID, DramaManagerConstants, DAType, BeatArguments, TherapyGameConstants
/*     */ {
/*     */   public static Beat _PBehindDoor_T1_factory()
/*     */   {
/*  22 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/*  23 */     String[] arrayOfString = { "_PBehindDoor_T1_precondition1" };
/*  24 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/*  25 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/*  26 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "PBehindDoor_T1_scope");
/*     */     
/*  28 */     String str1 = null;
/*     */     
/*  30 */     String str2 = null;
/*     */     
/*  32 */     String str3 = null;
/*     */     
/*  34 */     String str4 = null;
/*  35 */     return new Beat(0, "PBehindDoor_T1", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TGreetsP_T1_factory() {
/*  39 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/*  40 */     String[] arrayOfString = { "_TGreetsP_T1_precondition1" };
/*  41 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/*  42 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/*  43 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TGreetsP_T1_scope");
/*     */     
/*  45 */     String str1 = null;
/*     */     
/*  47 */     String str2 = null;
/*     */     
/*  49 */     String str3 = null;
/*     */     
/*  51 */     String str4 = null;
/*  52 */     return new Beat(1, "TGreetsP_T1", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TFetchesG_T1_factory() {
/*  56 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/*  57 */     String[] arrayOfString = { "_TFetchesG_T1_precondition1" };
/*  58 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/*  59 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/*  60 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TFetchesG_T1_scope");
/*     */     
/*  62 */     String str1 = null;
/*     */     
/*  64 */     String str2 = null;
/*     */     
/*  66 */     String str3 = null;
/*     */     
/*  68 */     String str4 = null;
/*  69 */     return new Beat(2, "TFetchesG_T1", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _GGreetsP_T1_factory() {
/*  73 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/*  74 */     String[] arrayOfString = { "_GGreetsP_T1_precondition1" };
/*  75 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/*  76 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/*  77 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "GGreetsP_T1_scope");
/*     */     
/*  79 */     String str1 = null;
/*     */     
/*  81 */     String str2 = null;
/*     */     
/*  83 */     String str3 = null;
/*     */     
/*  85 */     String str4 = null;
/*  86 */     return new Beat(3, "GGreetsP_T1", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ExplDatAnniv_T1_factory() {
/*  90 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/*  91 */     String[] arrayOfString = { "_ExplDatAnniv_T1_precondition1" };
/*  92 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ExplDatAnniv_T1_weighttest1", 2.0F) };
/*  93 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/*  94 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ExplDatAnniv_T1_scope");
/*  95 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/*  96 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/*  97 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/*  98 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/*  99 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 100 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 101 */     String str1 = "_ExplDatAnniv_T1_initAction";
/* 102 */     String str2 = "_ExplDatAnniv_T1_selectAction";
/* 103 */     String str3 = "_ExplDatAnniv_T1_succeedAction";
/*     */     
/* 105 */     String str4 = null;
/* 106 */     return new Beat(4, "ExplDatAnniv_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _PhoneCall_NGPA_T1_factory() {
/* 110 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 111 */     String[] arrayOfString = { "_PhoneCall_NGPA_T1_precondition1" };
/* 112 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 113 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 114 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "PhoneCall_NGPA_T1_scope");
/* 115 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 116 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 117 */     String str1 = "_PhoneCall_NGPA_T1_initAction";
/* 118 */     String str2 = "_PhoneCall_NGPA_T1_selectAction";
/*     */     
/* 120 */     String str3 = null;
/*     */     
/* 122 */     String str4 = null;
/* 123 */     return new Beat(5, "PhoneCall_NGPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _PhoneCall_NTPA_T1_factory() {
/* 127 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 128 */     String[] arrayOfString = { "_PhoneCall_NTPA_T1_precondition1" };
/* 129 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 130 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 131 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "PhoneCall_NTPA_T1_scope");
/* 132 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 133 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 134 */     String str1 = "_PhoneCall_NTPA_T1_initAction";
/* 135 */     String str2 = "_PhoneCall_NTPA_T1_selectAction";
/*     */     
/* 137 */     String str3 = null;
/*     */     
/* 139 */     String str4 = null;
/* 140 */     return new Beat(6, "PhoneCall_NTPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_N_T1_factory() {
/* 144 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 145 */     String[] arrayOfString = { "_ArtistAdvertising_N_T1_precondition1" };
/* 146 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_N_T1_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_N_T1_weighttest2", 2.999F) };
/* 147 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_N_T1_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_N_T1_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_N_T1_prioritytest3", 9) };
/* 148 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_N_T1_scope");
/* 149 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 150 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 151 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 152 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 153 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 154 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 155 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 156 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 157 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 158 */     String str1 = "_ArtistAdvertising_N_T1_initAction";
/* 159 */     String str2 = "_ArtistAdvertising_N_T1_selectAction";
/* 160 */     String str3 = "_ArtistAdvertising_N_T1_succeedAction";
/*     */     
/* 162 */     String str4 = null;
/* 163 */     return new Beat(11, "ArtistAdvertising_N_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_GPA_T1_factory() {
/* 167 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 168 */     String[] arrayOfString = { "_ArtistAdvertising_GPA_T1_precondition1" };
/* 169 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_GPA_T1_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_GPA_T1_weighttest2", 2.999F) };
/* 170 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_GPA_T1_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_GPA_T1_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_GPA_T1_prioritytest3", 9) };
/* 171 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_GPA_T1_scope");
/* 172 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 173 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 174 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 175 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 176 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 177 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 178 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 179 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 180 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 181 */     String str1 = "_ArtistAdvertising_GPA_T1_initAction";
/* 182 */     String str2 = "_ArtistAdvertising_GPA_T1_selectAction";
/* 183 */     String str3 = "_ArtistAdvertising_GPA_T1_succeedAction";
/*     */     
/* 185 */     String str4 = null;
/* 186 */     return new Beat(9, "ArtistAdvertising_GPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_TPA_T1_factory() {
/* 190 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 191 */     String[] arrayOfString = { "_ArtistAdvertising_TPA_T1_precondition1" };
/* 192 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_TPA_T1_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_TPA_T1_weighttest2", 2.999F) };
/* 193 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_TPA_T1_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_TPA_T1_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_TPA_T1_prioritytest3", 9) };
/* 194 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_TPA_T1_scope");
/* 195 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 196 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 197 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 198 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 199 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 200 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 201 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 202 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 203 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 204 */     String str1 = "_ArtistAdvertising_TPA_T1_initAction";
/* 205 */     String str2 = "_ArtistAdvertising_TPA_T1_selectAction";
/* 206 */     String str3 = "_ArtistAdvertising_TPA_T1_succeedAction";
/*     */     
/* 208 */     String str4 = null;
/* 209 */     return new Beat(10, "ArtistAdvertising_TPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_N_T1_factory() {
/* 213 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 214 */     String[] arrayOfString = { "_RockyMarriage_N_T1_precondition1" };
/* 215 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_N_T1_weighttest1", 3) };
/* 216 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_N_T1_prioritytest1", 10) };
/* 217 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_N_T1_scope");
/* 218 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 219 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 220 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 221 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 222 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 223 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 224 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 225 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 226 */     String str1 = "_RockyMarriage_N_T1_initAction";
/* 227 */     String str2 = "_RockyMarriage_N_T1_selectAction";
/* 228 */     String str3 = "_RockyMarriage_N_T1_succeedAction";
/*     */     
/* 230 */     String str4 = null;
/* 231 */     return new Beat(16, "RockyMarriage_N_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_GPA_T1_factory() {
/* 235 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 236 */     String[] arrayOfString = { "_RockyMarriage_GPA_T1_precondition1" };
/* 237 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_GPA_T1_weighttest1", 3) };
/* 238 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_GPA_T1_prioritytest1", 10) };
/* 239 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_GPA_T1_scope");
/* 240 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 241 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 242 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 243 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 244 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 245 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 246 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 247 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 248 */     String str1 = "_RockyMarriage_GPA_T1_initAction";
/* 249 */     String str2 = "_RockyMarriage_GPA_T1_selectAction";
/* 250 */     String str3 = "_RockyMarriage_GPA_T1_succeedAction";
/*     */     
/* 252 */     String str4 = null;
/* 253 */     return new Beat(14, "RockyMarriage_GPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_TPA_T1_factory() {
/* 257 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 258 */     String[] arrayOfString = { "_RockyMarriage_TPA_T1_precondition1" };
/* 259 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_TPA_T1_weighttest1", 3) };
/* 260 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_TPA_T1_prioritytest1", 10) };
/* 261 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_TPA_T1_scope");
/* 262 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 263 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 264 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 265 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 266 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 267 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 268 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 269 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 270 */     String str1 = "_RockyMarriage_TPA_T1_initAction";
/* 271 */     String str2 = "_RockyMarriage_TPA_T1_selectAction";
/* 272 */     String str3 = "_RockyMarriage_TPA_T1_succeedAction";
/*     */     
/* 274 */     String str4 = null;
/* 275 */     return new Beat(15, "RockyMarriage_TPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _Facade_NTPA_T1_factory() {
/* 279 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 280 */     String[] arrayOfString = { "_Facade_NTPA_T1_precondition1" };
/* 281 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_Facade_NTPA_T1_weighttest1", 3) };
/* 282 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_Facade_NTPA_T1_prioritytest1", 10) };
/* 283 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "Facade_NTPA_T1_scope");
/* 284 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 285 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 286 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 287 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 288 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 289 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 290 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 291 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 292 */     String str1 = "_Facade_NTPA_T1_initAction";
/* 293 */     String str2 = "_Facade_NTPA_T1_selectAction";
/* 294 */     String str3 = "_Facade_NTPA_T1_succeedAction";
/*     */     
/* 296 */     String str4 = null;
/* 297 */     return new Beat(13, "Facade_NTPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _Facade_GPA_T1_factory() {
/* 301 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 1.0F, true) };
/* 302 */     String[] arrayOfString = { "_Facade_GPA_T1_precondition1" };
/* 303 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_Facade_GPA_T1_weighttest1", 3) };
/* 304 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_Facade_GPA_T1_prioritytest1", 10) };
/* 305 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "Facade_GPA_T1_scope");
/* 306 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 307 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 308 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 309 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 310 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 311 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 312 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 313 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 314 */     String str1 = "_Facade_GPA_T1_initAction";
/* 315 */     String str2 = "_Facade_GPA_T1_selectAction";
/* 316 */     String str3 = "_Facade_GPA_T1_succeedAction";
/*     */     
/* 318 */     String str4 = null;
/* 319 */     return new Beat(12, "Facade_GPA_T1", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TxnT1ToT2NGPA_factory() {
/* 323 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 324 */     String[] arrayOfString = { "_TxnT1ToT2NGPA_precondition1" };
/* 325 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 326 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_TxnT1ToT2NGPA_prioritytest1", 0) };
/* 327 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TxnT1ToT2NGPA_scope");
/*     */     
/* 329 */     String str1 = null;
/* 330 */     String str2 = "_TxnT1ToT2NGPA_selectAction";
/*     */     
/* 332 */     String str3 = null;
/*     */     
/* 334 */     String str4 = null;
/* 335 */     return new Beat(7, "TxnT1ToT2NGPA", arrayOfStoryEffect, 1.0F, -1, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TxnT1ToT2TPA_factory() {
/* 339 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 340 */     String[] arrayOfString = { "_TxnT1ToT2TPA_precondition1" };
/* 341 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 342 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_TxnT1ToT2TPA_prioritytest1", 0) };
/* 343 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TxnT1ToT2TPA_scope");
/*     */     
/* 345 */     String str1 = null;
/* 346 */     String str2 = "_TxnT1ToT2TPA_selectAction";
/*     */     
/* 348 */     String str3 = null;
/*     */     
/* 350 */     String str4 = null;
/* 351 */     return new Beat(8, "TxnT1ToT2TPA", arrayOfStoryEffect, 1.0F, -1, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _OneOnOneGAffChr_T2_factory() {
/* 355 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 356 */     String[] arrayOfString = { "_OneOnOneGAffChr_T2_precondition1" };
/* 357 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 358 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 359 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "OneOnOneGAffChr_T2_scope");
/* 360 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 361 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 362 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 363 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 364 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 365 */     String str1 = "_OneOnOneGAffChr_T2_initAction";
/* 366 */     String str2 = "_OneOnOneGAffChr_T2_selectAction";
/* 367 */     String str3 = "_OneOnOneGAffChr_T2_succeedAction";
/*     */     
/* 369 */     String str4 = null;
/* 370 */     return new Beat(23, "OneOnOneGAffChr_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _OneOnOneTAffChr_T2_factory() {
/* 374 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 375 */     String[] arrayOfString = { "_OneOnOneTAffChr_T2_precondition1" };
/* 376 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 377 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 378 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "OneOnOneTAffChr_T2_scope");
/* 379 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 380 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 381 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 382 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 383 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 384 */     String str1 = "_OneOnOneTAffChr_T2_initAction";
/* 385 */     String str2 = "_OneOnOneTAffChr_T2_selectAction";
/* 386 */     String str3 = "_OneOnOneTAffChr_T2_succeedAction";
/*     */     
/* 388 */     String str4 = null;
/* 389 */     return new Beat(24, "OneOnOneTAffChr_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _NonAffChrGReturns_T2_factory() {
/* 393 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 394 */     String[] arrayOfString = { "_NonAffChrGReturns_T2_precondition1" };
/* 395 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 396 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 397 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "NonAffChrGReturns_T2_scope");
/* 398 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 399 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 400 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 401 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 402 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 403 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 404 */     String str1 = "_NonAffChrGReturns_T2_initAction";
/* 405 */     String str2 = "_NonAffChrGReturns_T2_selectAction";
/* 406 */     String str3 = "_NonAffChrGReturns_T2_succeedAction";
/*     */     
/* 408 */     String str4 = null;
/* 409 */     return new Beat(27, "NonAffChrGReturns_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _NonAffChrTReturns_T2_factory() {
/* 413 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 414 */     String[] arrayOfString = { "_NonAffChrTReturns_T2_precondition1" };
/* 415 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 416 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 417 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "NonAffChrTReturns_T2_scope");
/* 418 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 419 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 420 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 421 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 422 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 423 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 424 */     String str1 = "_NonAffChrTReturns_T2_initAction";
/* 425 */     String str2 = "_NonAffChrTReturns_T2_selectAction";
/* 426 */     String str3 = "_NonAffChrTReturns_T2_succeedAction";
/*     */     
/* 428 */     String str4 = null;
/* 429 */     return new Beat(28, "NonAffChrTReturns_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _OneOnOneGNonAffChr_T2_factory() {
/* 433 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 434 */     String[] arrayOfString = { "_OneOnOneGNonAffChr_T2_precondition1" };
/* 435 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 436 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 437 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "OneOnOneGNonAffChr_T2_scope");
/* 438 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 439 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 440 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 441 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 442 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 443 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 444 */     String str1 = "_OneOnOneGNonAffChr_T2_initAction";
/* 445 */     String str2 = "_OneOnOneGNonAffChr_T2_selectAction";
/* 446 */     String str3 = "_OneOnOneGNonAffChr_T2_succeedAction";
/*     */     
/* 448 */     String str4 = null;
/* 449 */     return new Beat(25, "OneOnOneGNonAffChr_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _OneOnOneTNonAffChr_T2_factory() {
/* 453 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 454 */     String[] arrayOfString = { "_OneOnOneTNonAffChr_T2_precondition1" };
/* 455 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 456 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 457 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "OneOnOneTNonAffChr_T2_scope");
/* 458 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 459 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 460 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 461 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 462 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 463 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 464 */     String str1 = "_OneOnOneTNonAffChr_T2_initAction";
/* 465 */     String str2 = "_OneOnOneTNonAffChr_T2_selectAction";
/* 466 */     String str3 = "_OneOnOneTNonAffChr_T2_succeedAction";
/*     */     
/* 468 */     String str4 = null;
/* 469 */     return new Beat(26, "OneOnOneTNonAffChr_T2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_GPA_T2_factory() {
/* 473 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 474 */     String[] arrayOfString = { "_ArtistAdvertising_GPA_T2_precondition1" };
/* 475 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_GPA_T2_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_GPA_T2_weighttest2", 2.999F) };
/* 476 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_GPA_T2_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_GPA_T2_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_GPA_T2_prioritytest3", 9) };
/* 477 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_GPA_T2_scope");
/* 478 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 479 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 480 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 481 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 482 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 483 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 484 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 485 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 486 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 487 */     String str1 = "_ArtistAdvertising_GPA_T2_initAction";
/* 488 */     String str2 = "_ArtistAdvertising_GPA_T2_selectAction";
/* 489 */     String str3 = "_ArtistAdvertising_GPA_T2_succeedAction";
/*     */     
/* 491 */     String str4 = null;
/* 492 */     return new Beat(17, "ArtistAdvertising_GPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_GPA_T2ToT3_factory() {
/* 496 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 497 */     String[] arrayOfString = { "_ArtistAdvertising_GPA_T2ToT3_precondition1" };
/* 498 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_GPA_T2ToT3_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_GPA_T2ToT3_weighttest2", 2.999F) };
/* 499 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_GPA_T2ToT3_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_GPA_T2ToT3_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_GPA_T2ToT3_prioritytest3", 9) };
/* 500 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_GPA_T2ToT3_scope");
/* 501 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 502 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 503 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 504 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 505 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 506 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 507 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 508 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 509 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 510 */     String str1 = "_ArtistAdvertising_GPA_T2ToT3_initAction";
/* 511 */     String str2 = "_ArtistAdvertising_GPA_T2ToT3_selectAction";
/* 512 */     String str3 = "_ArtistAdvertising_GPA_T2ToT3_succeedAction";
/*     */     
/* 514 */     String str4 = null;
/* 515 */     return new Beat(17, "ArtistAdvertising_GPA_T2ToT3", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_TPA_T2_factory() {
/* 519 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 520 */     String[] arrayOfString = { "_ArtistAdvertising_TPA_T2_precondition1" };
/* 521 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_TPA_T2_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_TPA_T2_weighttest2", 2.999F) };
/* 522 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_TPA_T2_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_TPA_T2_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_TPA_T2_prioritytest3", 9) };
/* 523 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_TPA_T2_scope");
/* 524 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 525 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 526 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 527 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 528 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 529 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 530 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 531 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 532 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 533 */     String str1 = "_ArtistAdvertising_TPA_T2_initAction";
/* 534 */     String str2 = "_ArtistAdvertising_TPA_T2_selectAction";
/* 535 */     String str3 = "_ArtistAdvertising_TPA_T2_succeedAction";
/*     */     
/* 537 */     String str4 = null;
/* 538 */     return new Beat(18, "ArtistAdvertising_TPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _ArtistAdvertising_TPA_T2ToT3_factory() {
/* 542 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 543 */     String[] arrayOfString = { "_ArtistAdvertising_TPA_T2ToT3_precondition1" };
/* 544 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_ArtistAdvertising_TPA_T2ToT3_weighttest1", 3), new Beat.WeightTest("_ArtistAdvertising_TPA_T2ToT3_weighttest2", 2.999F) };
/* 545 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_ArtistAdvertising_TPA_T2ToT3_prioritytest1", Integer.MAX_VALUE), new Beat.PriorityTest("_ArtistAdvertising_TPA_T2ToT3_prioritytest2", 10), new Beat.PriorityTest("_ArtistAdvertising_TPA_T2ToT3_prioritytest3", 9) };
/* 546 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "ArtistAdvertising_TPA_T2ToT3_scope");
/* 547 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 548 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 549 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 550 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 551 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 552 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 553 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 554 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 555 */     localVariableScopeThrowsErrors.defineVariable("subtopic", new VariableScope.IntValue(-1), "int");
/* 556 */     String str1 = "_ArtistAdvertising_TPA_T2ToT3_initAction";
/* 557 */     String str2 = "_ArtistAdvertising_TPA_T2ToT3_selectAction";
/* 558 */     String str3 = "_ArtistAdvertising_TPA_T2ToT3_succeedAction";
/*     */     
/* 560 */     String str4 = null;
/* 561 */     return new Beat(18, "ArtistAdvertising_TPA_T2ToT3", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_GPA_T2_factory() {
/* 565 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 566 */     String[] arrayOfString = { "_RockyMarriage_GPA_T2_precondition1" };
/* 567 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_GPA_T2_weighttest1", 3) };
/* 568 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_GPA_T2_prioritytest1", 10) };
/* 569 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_GPA_T2_scope");
/* 570 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 571 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 572 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 573 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 574 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 575 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 576 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 577 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 578 */     String str1 = "_RockyMarriage_GPA_T2_initAction";
/* 579 */     String str2 = "_RockyMarriage_GPA_T2_selectAction";
/* 580 */     String str3 = "_RockyMarriage_GPA_T2_succeedAction";
/*     */     
/* 582 */     String str4 = null;
/* 583 */     return new Beat(21, "RockyMarriage_GPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_GPA_T2ToT3_factory() {
/* 587 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 588 */     String[] arrayOfString = { "_RockyMarriage_GPA_T2ToT3_precondition1" };
/* 589 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_GPA_T2ToT3_weighttest1", 3) };
/* 590 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_GPA_T2ToT3_prioritytest1", 10) };
/* 591 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_GPA_T2ToT3_scope");
/* 592 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 593 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 594 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 595 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 596 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 597 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 598 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 599 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 600 */     String str1 = "_RockyMarriage_GPA_T2ToT3_initAction";
/* 601 */     String str2 = "_RockyMarriage_GPA_T2ToT3_selectAction";
/* 602 */     String str3 = "_RockyMarriage_GPA_T2ToT3_succeedAction";
/*     */     
/* 604 */     String str4 = null;
/* 605 */     return new Beat(21, "RockyMarriage_GPA_T2ToT3", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_TPA_T2_factory() {
/* 609 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 610 */     String[] arrayOfString = { "_RockyMarriage_TPA_T2_precondition1" };
/* 611 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_TPA_T2_weighttest1", 3) };
/* 612 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_TPA_T2_prioritytest1", 10) };
/* 613 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_TPA_T2_scope");
/* 614 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 615 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 616 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 617 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 618 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 619 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 620 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 621 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 622 */     String str1 = "_RockyMarriage_TPA_T2_initAction";
/* 623 */     String str2 = "_RockyMarriage_TPA_T2_selectAction";
/* 624 */     String str3 = "_RockyMarriage_TPA_T2_succeedAction";
/*     */     
/* 626 */     String str4 = null;
/* 627 */     return new Beat(22, "RockyMarriage_TPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RockyMarriage_TPA_T2ToT3_factory() {
/* 631 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 632 */     String[] arrayOfString = { "_RockyMarriage_TPA_T2ToT3_precondition1" };
/* 633 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_RockyMarriage_TPA_T2ToT3_weighttest1", 3) };
/* 634 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_RockyMarriage_TPA_T2ToT3_prioritytest1", 10) };
/* 635 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RockyMarriage_TPA_T2ToT3_scope");
/* 636 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 637 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 638 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 639 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 640 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 641 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 642 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 643 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 644 */     String str1 = "_RockyMarriage_TPA_T2ToT3_initAction";
/* 645 */     String str2 = "_RockyMarriage_TPA_T2ToT3_selectAction";
/* 646 */     String str3 = "_RockyMarriage_TPA_T2ToT3_succeedAction";
/*     */     
/* 648 */     String str4 = null;
/* 649 */     return new Beat(22, "RockyMarriage_TPA_T2ToT3", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _Facade_TPA_T2_factory() {
/* 653 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 654 */     String[] arrayOfString = { "_Facade_TPA_T2_precondition1" };
/* 655 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_Facade_TPA_T2_weighttest1", 3) };
/* 656 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_Facade_TPA_T2_prioritytest1", 10) };
/* 657 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "Facade_TPA_T2_scope");
/* 658 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 659 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 660 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 661 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 662 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 663 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 664 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 665 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 666 */     String str1 = "_Facade_TPA_T2_initAction";
/* 667 */     String str2 = "_Facade_TPA_T2_selectAction";
/* 668 */     String str3 = "_Facade_TPA_T2_succeedAction";
/*     */     
/* 670 */     String str4 = null;
/* 671 */     return new Beat(20, "Facade_TPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _Facade_GPA_T2_factory() {
/* 675 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 676 */     String[] arrayOfString = { "_Facade_GPA_T2_precondition1" };
/* 677 */     Beat.WeightTest[] arrayOfWeightTest = { new Beat.WeightTest("_Facade_GPA_T2_weighttest1", 3) };
/* 678 */     Beat.PriorityTest[] arrayOfPriorityTest = { new Beat.PriorityTest("_Facade_GPA_T2_prioritytest1", 10) };
/* 679 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "Facade_GPA_T2_scope");
/* 680 */     DramaManager.getDramaManager();localVariableScopeThrowsErrors.defineVariable("storyMemory", DramaManager.getStoryMemory(), "StoryMemory");
/* 681 */     localVariableScopeThrowsErrors.defineVariable("beatMemory", WorkingMemory.lookupRegisteredMemory("BeatMemory"), "WorkingMemory");
/* 682 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 683 */     localVariableScopeThrowsErrors.defineVariable("beatBeforeLastStart", null, "BeatStartWME");
/* 684 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 685 */     localVariableScopeThrowsErrors.defineVariable("txnInType", new VariableScope.IntValue(0), "int");
/* 686 */     localVariableScopeThrowsErrors.defineVariable("abortReason", new VariableScope.IntValue(0), "int");
/* 687 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/* 688 */     String str1 = "_Facade_GPA_T2_initAction";
/* 689 */     String str2 = "_Facade_GPA_T2_selectAction";
/* 690 */     String str3 = "_Facade_GPA_T2_succeedAction";
/*     */     
/* 692 */     String str4 = null;
/* 693 */     return new Beat(19, "Facade_GPA_T2", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TxnT2ToT3_factory() {
/* 697 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 698 */     String[] arrayOfString = { "_TxnT2ToT3_precondition1" };
/* 699 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 700 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 701 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TxnT2ToT3_scope");
/*     */     
/* 703 */     String str1 = null;
/* 704 */     String str2 = "_TxnT2ToT3_selectAction";
/*     */     
/* 706 */     String str3 = null;
/*     */     
/* 708 */     String str4 = null;
/* 709 */     return new Beat(30, "TxnT2ToT3", arrayOfStoryEffect, 1.0F, -1, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RomPrp_GPA_T2_factory() {
/* 713 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 2.0F, true) };
/* 714 */     String[] arrayOfString = { "_RomPrp_GPA_T2_precondition1" };
/* 715 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 716 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 717 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RomPrp_GPA_T2_scope");
/*     */     
/* 719 */     String str1 = null;
/* 720 */     String str2 = "_RomPrp_GPA_T2_selectAction";
/*     */     
/* 722 */     String str3 = null;
/*     */     
/* 724 */     String str4 = null;
/* 725 */     return new Beat(29, "RomPrp_GPA_T2", arrayOfStoryEffect, 5, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _CrisisP1_factory() {
/* 729 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 730 */     String[] arrayOfString = { "_CrisisP1_precondition1" };
/* 731 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 732 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 733 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "CrisisP1_scope");
/*     */     
/* 735 */     String str1 = null;
/* 736 */     String str2 = "_CrisisP1_selectAction";
/*     */     
/* 738 */     String str3 = null;
/*     */     
/* 740 */     String str4 = null;
/* 741 */     return new Beat(31, "CrisisP1", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _CrisisToTherapyGameGlue_P2_factory() {
/* 745 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 746 */     String[] arrayOfString = { "_CrisisToTherapyGameGlue_P2_precondition1" };
/* 747 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 748 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 749 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "CrisisToTherapyGameGlue_P2_scope");
/* 750 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 751 */     String str1 = "_CrisisToTherapyGameGlue_P2_initAction";
/* 752 */     String str2 = "_CrisisToTherapyGameGlue_P2_selectAction";
/*     */     
/* 754 */     String str3 = null;
/*     */     
/* 756 */     String str4 = null;
/* 757 */     return new Beat(32, "CrisisToTherapyGameGlue_P2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _TherapyGame_P2_factory() {
/* 761 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 762 */     String[] arrayOfString = { "_TherapyGame_P2_precondition1" };
/* 763 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 764 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 765 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "TherapyGame_P2_scope");
/* 766 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 767 */     String str1 = "_TherapyGame_P2_initAction";
/* 768 */     String str2 = "_TherapyGame_P2_selectAction";
/*     */     
/* 770 */     String str3 = null;
/*     */     
/* 772 */     String str4 = null;
/* 773 */     return new Beat(33, "TherapyGame_P2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _RevelationBuildup_P2_factory() {
/* 777 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 778 */     String[] arrayOfString = { "_RevelationBuildup_P2_precondition1" };
/* 779 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 780 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 781 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "RevelationBuildup_P2_scope");
/* 782 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/* 783 */     String str1 = "_RevelationBuildup_P2_initAction";
/* 784 */     String str2 = "_RevelationBuildup_P2_selectAction";
/*     */     
/* 786 */     String str3 = null;
/*     */     
/* 788 */     String str4 = null;
/* 789 */     return new Beat(34, "RevelationBuildup_P2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _Revelations_P2_factory() {
/* 793 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 794 */     String[] arrayOfString = { "_Revelations_P2_precondition1" };
/* 795 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 796 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 797 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "Revelations_P2_scope");
/*     */     
/* 799 */     String str1 = null;
/* 800 */     String str2 = "_Revelations_P2_selectAction";
/*     */     
/* 802 */     String str3 = null;
/*     */     
/* 804 */     String str4 = null;
/* 805 */     return new Beat(35, "Revelations_P2", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _EndingNoRevelations_factory() {
/* 809 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 810 */     String[] arrayOfString = { "_EndingNoRevelations_precondition1" };
/* 811 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 812 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 813 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "EndingNoRevelations_scope");
/*     */     
/* 815 */     String str1 = null;
/* 816 */     String str2 = "_EndingNoRevelations_selectAction";
/*     */     
/* 818 */     String str3 = null;
/*     */     
/* 820 */     String str4 = null;
/* 821 */     return new Beat(36, "EndingNoRevelations", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _EndingSelfRevelationOnly_factory() {
/* 825 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 826 */     String[] arrayOfString = { "_EndingSelfRevelationOnly_precondition1" };
/* 827 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 828 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 829 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "EndingSelfRevelationOnly_scope");
/* 830 */     localVariableScopeThrowsErrors.defineVariable("lastBeatStart", null, "BeatStartWME");
/*     */     
/* 832 */     String str1 = null;
/* 833 */     String str2 = "_EndingSelfRevelationOnly_selectAction";
/*     */     
/* 835 */     String str3 = null;
/*     */     
/* 837 */     String str4 = null;
/* 838 */     return new Beat(37, "EndingSelfRevelationOnly", arrayOfStoryEffect, 1.0F, Integer.MAX_VALUE, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _EndingRelationshipRevelationOnly_factory() {
/* 842 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 843 */     String[] arrayOfString = { "_EndingRelationshipRevelationOnly_precondition1" };
/* 844 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 845 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 846 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "EndingRelationshipRevelationOnly_scope");
/*     */     
/* 848 */     String str1 = null;
/* 849 */     String str2 = "_EndingRelationshipRevelationOnly_selectAction";
/*     */     
/* 851 */     String str3 = null;
/*     */     
/* 853 */     String str4 = null;
/* 854 */     return new Beat(38, "EndingRelationshipRevelationOnly", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _EndingSelfAndRelationshipNotGTR_factory() {
/* 858 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 859 */     String[] arrayOfString = { "_EndingSelfAndRelationshipNotGTR_precondition1" };
/* 860 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 861 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 862 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "EndingSelfAndRelationshipNotGTR_scope");
/* 863 */     localVariableScopeThrowsErrors.defineVariable("graceRev", new VariableScope.BooleanValue(false), "boolean");
/* 864 */     localVariableScopeThrowsErrors.defineVariable("tripRev", new VariableScope.BooleanValue(false), "boolean");
/* 865 */     localVariableScopeThrowsErrors.defineVariable("relationshipRev", new VariableScope.BooleanValue(false), "boolean");
/* 866 */     localVariableScopeThrowsErrors.defineVariable("wmeList", null, "LinkedList");
/* 867 */     localVariableScopeThrowsErrors.defineVariable("revWME", null, "BeatRevelationsP2WME");
/* 868 */     localVariableScopeThrowsErrors.defineVariable("rev1Focus", null, "int");
/* 869 */     localVariableScopeThrowsErrors.defineVariable("rev2Focus", null, "int");
/* 870 */     localVariableScopeThrowsErrors.defineVariable("rev3Focus", null, "int");
/* 871 */     String str1 = "_EndingSelfAndRelationshipNotGTR_initAction";
/* 872 */     String str2 = "_EndingSelfAndRelationshipNotGTR_selectAction";
/*     */     
/* 874 */     String str3 = null;
/*     */     
/* 876 */     String str4 = null;
/* 877 */     return new Beat(39, "EndingSelfAndRelationshipNotGTR", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */   
/*     */   public static Beat _EndingGTR_factory() {
/* 881 */     StoryEffect[] arrayOfStoryEffect = { new StoryEffect("tension", 3, true) };
/* 882 */     String[] arrayOfString = { "_EndingGTR_precondition1" };
/* 883 */     Beat.WeightTest[] arrayOfWeightTest = new Beat.WeightTest[0];
/* 884 */     Beat.PriorityTest[] arrayOfPriorityTest = new Beat.PriorityTest[0];
/* 885 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(null, "EndingGTR_scope");
/* 886 */     localVariableScopeThrowsErrors.defineVariable("graceRev", new VariableScope.BooleanValue(false), "boolean");
/* 887 */     localVariableScopeThrowsErrors.defineVariable("tripRev", new VariableScope.BooleanValue(false), "boolean");
/* 888 */     localVariableScopeThrowsErrors.defineVariable("relationshipRev", new VariableScope.BooleanValue(false), "boolean");
/* 889 */     localVariableScopeThrowsErrors.defineVariable("wmeList", null, "LinkedList");
/* 890 */     localVariableScopeThrowsErrors.defineVariable("revWME", null, "BeatRevelationsP2WME");
/* 891 */     localVariableScopeThrowsErrors.defineVariable("rev1Focus", null, "int");
/* 892 */     localVariableScopeThrowsErrors.defineVariable("rev2Focus", null, "int");
/* 893 */     localVariableScopeThrowsErrors.defineVariable("rev3Focus", null, "int");
/* 894 */     String str1 = "_EndingGTR_initAction";
/* 895 */     String str2 = "_EndingGTR_selectAction";
/*     */     
/* 897 */     String str3 = null;
/*     */     
/* 899 */     String str4 = null;
/* 900 */     return new Beat(40, "EndingGTR", arrayOfStoryEffect, 1.0F, 0, arrayOfString, arrayOfWeightTest, arrayOfPriorityTest, localVariableScopeThrowsErrors, str1, str2, str3, str4);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\beats\BeatFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */