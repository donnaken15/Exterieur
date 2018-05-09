/*      */ package facade.util;
/*      */ 
/*      */ import dramaman.runtime.DramaManagerConstants;
/*      */ import java.util.Random;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class CrisisCalculus
/*      */   implements SpriteID, EpisodicMemoryConstants, BackstoryCategories, CrisisAccusations, DAType, DramaManagerConstants, BeatConstants
/*      */ {
/*      */   public CrisisCalculus()
/*      */   {
/*   13 */     calculus = this;
/*      */   }
/*      */   
/*      */ 
/*   17 */   public static int firstPostGreetingBeatCtr = -1; private static final boolean $noassert = Class.forName("[Lfacade.util.CrisisCalculus;").getComponentType().desiredAssertionStatus() ^ true;
/*   18 */   public static int firstT2BeatCtr = -1;
/*   19 */   public static int incitingContentID = -1;
/*   20 */   public static int incitingContentType = -1;
/*   21 */   public static int incitingContentParam = -1;
/*   22 */   public static int incitingContentChr = -1;
/*      */   
/*   24 */   public static int gpta = 0;
/*   25 */   public static int tpta = 0;
/*   26 */   public static int gbp = 0;
/*   27 */   public static int tbp = 0;
/*   28 */   public static int mostBuggedChr = -1;
/*   29 */   public static int focusStoryTopic = -1;
/*   30 */   public static int focusMetaTopic = -1;
/*   31 */   public static int dramaticQuestion = -1;
/*   32 */   public static int dramaticQuestionWho = -1;
/*   33 */   public static int overallConstructiveness = 0;
/*      */   
/*   35 */   public static int initialAccuserChr = -1;
/*   36 */   public static int initialAccusedChr = -1;
/*      */   
/*   38 */   public static int secondAccuserChr = -1;
/*   39 */   public static int secondAccusedChr = -1;
/*   40 */   public static int accusation2ID = -1;
/*   41 */   public static int accusation2PcType = -1;
/*   42 */   public static int accusation2PcParam = -1;
/*      */   
/*   44 */   public static int accusation3ID = -1;
/*   45 */   public static int accusation3PcType = -1;
/*   46 */   public static int accusation3PcParam = -1;
/*      */   
/*   48 */   public static boolean bWantYesToBigQuestion = false;
/*   49 */   public static boolean bGotYesNoAnswerToBigQuestion = false;
/*   50 */   public static boolean bGotRightAnswerToBigQuestion = false;
/*   51 */   public static boolean bGotHelpfulAnswerToBigQuestion = false;
/*      */   
/*   53 */   public static int whoSelfRevelation = -1;
/*   54 */   public static int whichSelfRevelation = -1;
/*   55 */   public static boolean bFuriousOrUpsetAtEndOfCrisis = false;
/*      */   
/*   57 */   public static int numLeaveRoomCajolesPlayed = 0;
/*      */   
/*   59 */   public static int tempInt = 0;
/*      */   
/*   61 */   private static final Random randomGen = new Random();
/*      */   
/*      */   public static CrisisCalculus calculus;
/*      */   
/*      */   public void CalculateTerms()
/*      */   {
/*   67 */     StringUtil.println("### CrisisCalculus.CalculateTerms()");
/*      */     
/*      */ 
/*   70 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*   71 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*   72 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*   73 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*   74 */     BooleanRef localBooleanRef1 = new BooleanRef();
/*   75 */     BooleanRef localBooleanRef2 = new BooleanRef();
/*   76 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*   77 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*   78 */     IntegerRef localIntegerRef7 = new IntegerRef();
/*   79 */     IntegerRef localIntegerRef8 = new IntegerRef();
/*   80 */     IntegerRef localIntegerRef9 = new IntegerRef();
/*   81 */     IntegerRef localIntegerRef10 = new IntegerRef();
/*   82 */     BooleanRef localBooleanRef3 = new BooleanRef();
/*   83 */     int j = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*      */ 
/*   86 */     gpta = 0;
/*   87 */     tpta = 0;
/*   88 */     gbp = 0;
/*   89 */     tbp = 0;
/*      */     
/*   91 */     for (int i = 0; i < j; i++) {
/*   92 */       ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localBooleanRef1, localBooleanRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localIntegerRef9, localIntegerRef10, localBooleanRef3);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*   97 */       if (localIntegerRef3.i == 0) {
/*   98 */         gpta += localIntegerRef6.i;
/*   99 */         gbp += localIntegerRef5.i;
/*      */       }
/*  101 */       if (localIntegerRef3.i == 1) {
/*  102 */         tpta += localIntegerRef6.i;
/*  103 */         tbp += localIntegerRef5.i;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  110 */     int k = tpta - gpta + (gbp - tbp);
/*      */     
/*  112 */     if (k > 0) { mostBuggedChr = 0;
/*  113 */     } else if (k < 0) { mostBuggedChr = 1;
/*  114 */     } else if (randomGen.nextInt(2) == 0) mostBuggedChr = 0; else {
/*  115 */       mostBuggedChr = 1;
/*      */     }
/*  117 */     StringUtil.println("  gpta = " + gpta);
/*  118 */     StringUtil.println("  tpta = " + tpta);
/*  119 */     StringUtil.println("  gbp = " + gbp);
/*  120 */     StringUtil.println("  tbp = " + tbp);
/*  121 */     StringUtil.println("  mostBuggedChr = " + mostBuggedChr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void DetermineFocusStoryTopicAndMetaTopic()
/*      */   {
/*  130 */     StringUtil.println("### CrisisCalculus.DetermineFocusStoryTopicAndMetaTopic()");
/*      */     
/*      */ 
/*  133 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  134 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  135 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  136 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  137 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  138 */     int j = IntermediateContentArchive.archive.GetNumContents();
/*  139 */     int k = 0;
/*  140 */     int m = 0;
/*  141 */     int n = 0;
/*  142 */     int i1 = 0;
/*  143 */     int i2 = 0;
/*  144 */     int i3 = 0;
/*      */     
/*      */ 
/*  147 */     int i4 = 0;
/*      */     
/*  149 */     int i5 = 0;
/*  150 */     int i6 = 0;
/*      */     
/*  152 */     for (int i = 0; i < j; i++) {
/*  153 */       IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*  154 */       if (localIntegerRef1.i == 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  161 */         if (localIntegerRef3.i == 60) {
/*  162 */           if (localIntegerRef4.i == 1) k = 1;
/*  163 */           if (localIntegerRef4.i == 2) m = 1;
/*      */         }
/*  165 */         if (localIntegerRef3.i == 59) {
/*  166 */           if (localIntegerRef4.i == 1) n = 1;
/*  167 */           if (localIntegerRef4.i == 2) i1 = 1;
/*      */         }
/*  169 */         if (localIntegerRef3.i == 61) {
/*  170 */           if (localIntegerRef4.i == 1) i2 = 1;
/*  171 */           if (localIntegerRef4.i == 2) { i3 = 1;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  182 */     if ((k != 0) && (m != 0)) i4++;
/*  183 */     if ((n != 0) && (i1 != 0)) i4++;
/*  184 */     if ((i2 != 0) && (i3 != 0)) { i4++;
/*      */     }
/*      */     
/*  187 */     if (i4 == 1) {
/*  188 */       if ((k != 0) && (m != 0)) focusStoryTopic = 60;
/*  189 */       if ((n != 0) && (i1 != 0)) focusStoryTopic = 59;
/*  190 */       if ((i2 != 0) && (i3 != 0)) { focusStoryTopic = 61;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  198 */     if (n != 0) i5++;
/*  199 */     if (i1 != 0) i5++;
/*  200 */     if (k != 0) i5++;
/*  201 */     if (m != 0) { i5++;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  206 */     if (n != 0) i6++;
/*  207 */     if (i1 != 0) i6++;
/*  208 */     if (i2 != 0) i6++;
/*  209 */     if (i3 != 0) { i6++;
/*      */     }
/*  211 */     if (i5 > i6) {
/*  212 */       focusMetaTopic = 0;
/*  213 */     } else if (i5 < i6) {
/*  214 */       focusMetaTopic = 1;
/*      */ 
/*      */     }
/*  217 */     else if (randomGen.nextInt(2) == 0) {
/*  218 */       focusMetaTopic = 0;
/*      */     } else {
/*  220 */       focusMetaTopic = 1;
/*      */     }
/*      */     
/*      */ 
/*  224 */     StringUtil.println("  focusStoryTopic = " + focusStoryTopic);
/*  225 */     StringUtil.println("  focusMetaTopic = " + focusMetaTopic);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void DetermineInitialAccuserChr()
/*      */   {
/*  233 */     StringUtil.println("### CrisisCalculus.DetermineInitialAccuserChr()");
/*      */     
/*  235 */     if ((!$noassert) && (mostBuggedChr == -1)) { throw new AssertionError();
/*      */     }
/*  237 */     if (gpta < tpta) { initialAccuserChr = 0;
/*  238 */     } else if (tpta < gpta) initialAccuserChr = 1; else {
/*  239 */       initialAccuserChr = mostBuggedChr;
/*      */     }
/*  241 */     if (initialAccuserChr == 0) initialAccusedChr = 1; else {
/*  242 */       initialAccusedChr = 0;
/*      */     }
/*  244 */     StringUtil.println("  initialAccuserChr = " + initialAccuserChr);
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
/*      */   public int ChooseProvocativeContent(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
/*      */   {
/*  262 */     StringUtil.println("### CrisisCalculus.ChooseProvocativeContent() chr " + paramInt1 + " bWantPlayerDirect " + paramBoolean1 + " bWantAccusable " + paramBoolean2 + " matchBackstoryCategory " + paramInt2 + " matchStoryTopic " + paramInt3);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  270 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  271 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  272 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  273 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  274 */     BooleanRef localBooleanRef1 = new BooleanRef();
/*  275 */     BooleanRef localBooleanRef2 = new BooleanRef();
/*  276 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  277 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*  278 */     IntegerRef localIntegerRef7 = new IntegerRef();
/*  279 */     IntegerRef localIntegerRef8 = new IntegerRef();
/*  280 */     IntegerRef localIntegerRef9 = new IntegerRef();
/*  281 */     IntegerRef localIntegerRef10 = new IntegerRef();
/*  282 */     BooleanRef localBooleanRef3 = new BooleanRef();
/*  283 */     int j = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*  285 */     int k = -1;
/*  286 */     int m = 999;
/*  287 */     int n = -1;
/*  288 */     int i1 = -1;
/*  289 */     int i2 = 0;
/*  290 */     int i3 = 0;
/*  291 */     int i4 = 0;
/*      */     
/*  293 */     for (int i = 0; i < j; i++) {
/*  294 */       ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localBooleanRef1, localBooleanRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localIntegerRef9, localIntegerRef10, localBooleanRef3);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  301 */       if ((!localBooleanRef3.b) && ((localIntegerRef3.i == paramInt1) || (localIntegerRef3.i == -1)) && (localIntegerRef4.i < m) && ((localBooleanRef1.b) || (!paramBoolean1)) && ((localBooleanRef2.b) || (!paramBoolean2)) && (localIntegerRef1.i != 7) && (localIntegerRef2.i != 61) && (localIntegerRef2.i != 62) && ((paramInt2 == localIntegerRef8.i) || (paramInt2 == localIntegerRef9.i) || (paramInt2 == localIntegerRef10.i) || (paramInt2 == -1)) && ((DoesBCMatchST(localIntegerRef8.i, paramInt3)) || (DoesBCMatchST(localIntegerRef9.i, paramInt3)) || (DoesBCMatchST(localIntegerRef10.i, paramInt3)) || (paramInt3 == -1)))
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
/*  322 */         m = localIntegerRef4.i;
/*  323 */         i2++;
/*      */       }
/*      */     }
/*      */     
/*  327 */     if (i2 > 0)
/*      */     {
/*      */ 
/*  330 */       i3 = randomGen.nextInt(i2);
/*  331 */       i4 = 0;
/*      */       
/*      */ 
/*  334 */       m = 999;
/*  335 */       for (i = 0; (i < j) && (k == -1); i++) {
/*  336 */         ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localBooleanRef1, localBooleanRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localIntegerRef9, localIntegerRef10, localBooleanRef3);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  343 */         if ((!localBooleanRef3.b) && ((localIntegerRef3.i == paramInt1) || (localIntegerRef3.i == -1)) && (localIntegerRef4.i < m) && ((localBooleanRef1.b) || (!paramBoolean1)) && ((localBooleanRef2.b) || (!paramBoolean2)) && (localIntegerRef1.i != 7) && (localIntegerRef2.i != 61) && (localIntegerRef2.i != 62) && ((paramInt2 == localIntegerRef8.i) || (paramInt2 == localIntegerRef9.i) || (paramInt2 == localIntegerRef10.i) || (paramInt2 == -1)) && ((DoesBCMatchST(localIntegerRef8.i, paramInt3)) || (DoesBCMatchST(localIntegerRef9.i, paramInt3)) || (DoesBCMatchST(localIntegerRef10.i, paramInt3)) || (paramInt3 == -1)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  359 */           m = localIntegerRef4.i;
/*      */           
/*  361 */           if (i4 == i3) {
/*  362 */             k = i;
/*  363 */             n = localIntegerRef1.i;
/*  364 */             i1 = localIntegerRef2.i;
/*      */           }
/*      */           
/*  367 */           i4++;
/*      */         }
/*      */       }
/*      */       
/*  371 */       if ((!$noassert) && (k == -1)) throw new AssertionError();
/*  372 */       ProvocativeContentArchive.archive.SetReactedToInCrisis(k, true);
/*  373 */       StringUtil.println("ChooseProvocativeContent chose id " + k + " type " + n + " param " + i1);
/*      */     }
/*      */     else {
/*  376 */       StringUtil.println("ChooseProvocativeContent: no match!");
/*      */     }
/*      */     
/*  379 */     return k;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean DoesBCMatchST(int paramInt1, int paramInt2)
/*      */   {
/*  387 */     switch (paramInt1)
/*      */     {
/*      */ 
/*      */     case 0: 
/*      */     case 2: 
/*      */     case 4: 
/*  393 */       if (paramInt2 == 59) return true;
/*  394 */       break;
/*      */     
/*      */     case 3: 
/*      */     case 5: 
/*      */     case 6: 
/*  399 */       if (paramInt2 == 60) return true;
/*  400 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 1: 
/*      */     case 7: 
/*      */     case 8: 
/*      */     case 9: 
/*  408 */       if (paramInt2 == 61) return true;
/*      */       break;
/*      */     }
/*      */     
/*  412 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void ChooseDramaticQuestion(boolean paramBoolean)
/*      */   {
/*  424 */     StringUtil.println("### CrisisCalculus.ChooseDramaticQuestion()");
/*      */     
/*  426 */     dramaticQuestion = GetMostAddressedBackstoryCategory(paramBoolean);
/*  427 */     StringUtil.println("  dramaticQuestion = " + dramaticQuestion);
/*      */     
/*      */ 
/*  430 */     if (randomGen.nextInt(3) == 0) {
/*  431 */       StringUtil.println("    but going to mix it up!");
/*      */       
/*      */       int i;
/*  434 */       if ((dramaticQuestion == 0) || (dramaticQuestion == 2) || (dramaticQuestion == 4))
/*      */       {
/*      */ 
/*  437 */         i = randomGen.nextInt(3);
/*  438 */         if (i == 0) { dramaticQuestion = 0;
/*  439 */         } else if (i == 1) dramaticQuestion = 2; else {
/*  440 */           dramaticQuestion = 4;
/*      */         }
/*      */       }
/*      */       
/*  444 */       if ((dramaticQuestion == 3) || (dramaticQuestion == 5) || (dramaticQuestion == 6))
/*      */       {
/*      */ 
/*  447 */         i = randomGen.nextInt(3);
/*  448 */         if (i == 0) { dramaticQuestion = 3;
/*  449 */         } else if (i == 1) dramaticQuestion = 5; else {
/*  450 */           dramaticQuestion = 6;
/*      */         }
/*      */       }
/*      */       
/*  454 */       if ((dramaticQuestion == 1) || (dramaticQuestion == 4) || (dramaticQuestion == 9))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  459 */         i = randomGen.nextInt(5);
/*  460 */         if (i == 0) { dramaticQuestion = 1;
/*  461 */         } else if (i == 1) { dramaticQuestion = 4;
/*  462 */         } else if (i == 2) { dramaticQuestion = 7;
/*  463 */         } else if (i == 3) dramaticQuestion = 8; else {
/*  464 */           dramaticQuestion = 9;
/*      */         }
/*      */       }
/*  467 */       StringUtil.println("  new dramaticQuestion = " + dramaticQuestion);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int GetMostAddressedBackstoryCategory(boolean paramBoolean)
/*      */   {
/*  476 */     StringUtil.println("### CrisisCalculus.GetMostAddressedBackstoryCategory()");
/*      */     
/*  478 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  479 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  480 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  481 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  482 */     BooleanRef localBooleanRef1 = new BooleanRef();
/*  483 */     BooleanRef localBooleanRef2 = new BooleanRef();
/*  484 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  485 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*  486 */     IntegerRef localIntegerRef7 = new IntegerRef();
/*  487 */     IntegerRef localIntegerRef8 = new IntegerRef();
/*  488 */     IntegerRef localIntegerRef9 = new IntegerRef();
/*  489 */     IntegerRef localIntegerRef10 = new IntegerRef();
/*  490 */     BooleanRef localBooleanRef3 = new BooleanRef();
/*  491 */     int j = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*      */ 
/*  494 */     int[] arrayOfInt = new int[10];
/*      */     
/*  496 */     int k = 0;
/*  497 */     int m = -1;
/*      */     
/*  499 */     for (int i = 0; i < 10; i++) {
/*  500 */       arrayOfInt[i] = 0;
/*      */     }
/*      */     
/*  503 */     for (i = 0; i < j; i++) {
/*  504 */       ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localBooleanRef1, localBooleanRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localIntegerRef9, localIntegerRef10, localBooleanRef3);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  511 */       if ((!paramBoolean) || (localBooleanRef2.b))
/*      */       {
/*  513 */         if ((localIntegerRef8.i >= 0) && (localIntegerRef8.i < 10)) {
/*  514 */           arrayOfInt[localIntegerRef8.i] += 1;
/*  515 */           if ((arrayOfInt[localIntegerRef8.i] > k) || ((arrayOfInt[localIntegerRef8.i] == k) && (randomGen.nextInt(2) == 0)))
/*      */           {
/*  517 */             k = arrayOfInt[localIntegerRef8.i];
/*  518 */             m = localIntegerRef8.i;
/*      */           }
/*      */         }
/*      */         
/*  522 */         if ((localIntegerRef9.i >= 0) && (localIntegerRef9.i < 10)) {
/*  523 */           arrayOfInt[localIntegerRef9.i] += 1;
/*  524 */           if ((arrayOfInt[localIntegerRef9.i] > k) || ((arrayOfInt[localIntegerRef9.i] == k) && (randomGen.nextInt(2) == 0)))
/*      */           {
/*  526 */             k = arrayOfInt[localIntegerRef9.i];
/*  527 */             m = localIntegerRef9.i;
/*      */           }
/*      */         }
/*      */         
/*  531 */         if ((localIntegerRef10.i >= 0) && (localIntegerRef10.i < 10)) {
/*  532 */           arrayOfInt[localIntegerRef10.i] += 1;
/*  533 */           if ((arrayOfInt[localIntegerRef10.i] > k) || ((arrayOfInt[localIntegerRef10.i] == k) && (randomGen.nextInt(2) == 0)))
/*      */           {
/*  535 */             k = arrayOfInt[localIntegerRef10.i];
/*  536 */             m = localIntegerRef10.i;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  543 */     if (m == -1) {
/*  544 */       StringUtil.println("### WARNING: GetMostAddressedBackstoryCategory got no results, randomly choosing");
/*  545 */       m = randomGen.nextInt(10);
/*      */     }
/*      */     
/*  548 */     return m;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void CalculateConstructiveness()
/*      */   {
/*  555 */     StringUtil.println("### CrisisCalculus.CalculateConstructiveness()");
/*      */     
/*      */ 
/*  558 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  559 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  560 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  561 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  562 */     BooleanRef localBooleanRef1 = new BooleanRef();
/*  563 */     BooleanRef localBooleanRef2 = new BooleanRef();
/*  564 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  565 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*  566 */     IntegerRef localIntegerRef7 = new IntegerRef();
/*  567 */     IntegerRef localIntegerRef8 = new IntegerRef();
/*  568 */     IntegerRef localIntegerRef9 = new IntegerRef();
/*  569 */     IntegerRef localIntegerRef10 = new IntegerRef();
/*  570 */     BooleanRef localBooleanRef3 = new BooleanRef();
/*  571 */     int j = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*  573 */     overallConstructiveness = 0;
/*  574 */     for (int i = 0; i < j; i++) {
/*  575 */       ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localBooleanRef1, localBooleanRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localIntegerRef9, localIntegerRef10, localBooleanRef3);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  580 */       overallConstructiveness += localIntegerRef7.i;
/*      */     }
/*      */     
/*  583 */     StringUtil.println("  overallConstructiveness = " + overallConstructiveness);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void RecognizePatternsAndAddProvocativeContent()
/*      */   {
/*  591 */     StringUtil.println("### CrisisCalculus.RecognizePatternsAndAddProvocativeContent()");
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  597 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  598 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  599 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  600 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  601 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  602 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*  603 */     IntegerRef localIntegerRef7 = new IntegerRef();
/*  604 */     IntegerRef localIntegerRef8 = new IntegerRef();
/*  605 */     BooleanRef localBooleanRef = new BooleanRef();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  610 */     int i3 = 0;
/*  611 */     int i4 = 0;
/*  612 */     int i5 = 0;
/*  613 */     int i6 = 0;
/*  614 */     int i7 = 0;
/*  615 */     int i8 = 0;
/*  616 */     int i9 = 0;
/*  617 */     int i10 = 0;
/*      */     
/*  619 */     int k = IntermediateContentArchive.archive.GetNumContents();
/*  620 */     int m = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  630 */     int i1 = 0;
/*  631 */     int n; for (int j = 0; (j <= 1) && (i1 == 0); j++) {
/*  632 */       n = 0;
/*  633 */       for (i = 0; (i < k) && (n == 0); i++) {
/*  634 */         IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*  635 */         if (localIntegerRef1.i == 1) {
/*  636 */           if ((j == 0) && (localIntegerRef3.i < 0)) n = 1;
/*  637 */           if ((j == 1) && (localIntegerRef3.i > 0)) n = 1;
/*  638 */           if ((localIntegerRef2.i >= firstPostGreetingBeatCtr) && (localIntegerRef3.i == 0)) { n = 1;
/*      */           }
/*      */         }
/*      */       }
/*  642 */       if (n == 0) {
/*  643 */         ProvocativeContentArchive.archive.AddContent(5, 60, j, -1, -1, -1);
/*      */         
/*      */ 
/*      */ 
/*  647 */         i1 = 1;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  654 */     i1 = 0;
/*  655 */     for (j = 0; (j <= 1) && (i1 == 0); j++) {
/*  656 */       n = 0;
/*  657 */       for (i = 0; (i < k) && (n == 0); i++) {
/*  658 */         IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*  659 */         if (localIntegerRef1.i == 1) {
/*  660 */           if ((j == 0) && (localIntegerRef3.i < 0)) n = 1;
/*  661 */           if ((j == 1) && (localIntegerRef3.i > 0)) n = 1;
/*  662 */           if ((localIntegerRef2.i >= firstT2BeatCtr) && (localIntegerRef3.i == 0)) { n = 1;
/*      */           }
/*      */         }
/*      */       }
/*  666 */       if (n == 0) {
/*  667 */         ProvocativeContentArchive.archive.AddContent(5, 61, j, -1, -1, -1);
/*      */         
/*      */ 
/*      */ 
/*  671 */         i1 = 1;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  677 */     i1 = 0;
/*  678 */     for (j = 0; (j <= 1) && (i1 == 0); j++) {
/*  679 */       n = 0;
/*  680 */       int i2 = 0;
/*  681 */       for (i = 0; (i < k) && (n == 0); i++) {
/*  682 */         IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*  683 */         if (localIntegerRef1.i == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  688 */           if (i2 == 0) {
/*  689 */             if ((j == 0) && (localIntegerRef3.i < 0)) i2 = 1;
/*  690 */             if ((j == 1) && (localIntegerRef3.i > 0)) { i2 = 1;
/*      */             }
/*      */           }
/*      */           
/*  694 */           if (i2 == 1) {
/*  695 */             if ((j == 0) && (localIntegerRef3.i > 0)) i2 = 2;
/*  696 */             if ((j == 1) && (localIntegerRef3.i < 0)) { i2 = 2;
/*      */             }
/*      */           }
/*      */           
/*  700 */           if (i2 == 2) {
/*  701 */             if ((j == 0) && (localIntegerRef3.i >= 0)) n = 1;
/*  702 */             if ((j == 1) && (localIntegerRef3.i <= 0)) { n = 1;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*  707 */       if ((i2 == 2) && (n == 0)) {
/*  708 */         ProvocativeContentArchive.archive.AddContent(5, 62, j, -1, -1, -1);
/*      */         
/*      */ 
/*      */ 
/*  712 */         i1 = 1;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  720 */     for (j = 0; j <= 1; j++)
/*      */     {
/*      */ 
/*  723 */       i3 = 0;
/*  724 */       i4 = 0;
/*  725 */       i5 = 0;
/*  726 */       i6 = 0;
/*      */       
/*  728 */       for (i = 0; i < k; i++) {
/*  729 */         IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*      */         
/*      */ 
/*  732 */         if (localIntegerRef1.i == 0) {
/*  733 */           if ((localIntegerRef2.i == 20) && (localIntegerRef5.i != j)) i3++;
/*  734 */           if ((localIntegerRef2.i == 21) && (localIntegerRef5.i == j)) i4++;
/*  735 */           if ((localIntegerRef2.i == 22) && (localIntegerRef5.i != j)) i5++;
/*  736 */           if ((localIntegerRef2.i == 23) && (localIntegerRef5.i != j)) { i6++;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  742 */       for (i = 0; i < m; i++) {
/*  743 */         ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef5, localIntegerRef6, localIntegerRef7, localIntegerRef8, localBooleanRef);
/*      */         
/*      */ 
/*      */ 
/*  747 */         if (localIntegerRef1.i == 1) {
/*  748 */           if ((localIntegerRef2.i == 20) && (localIntegerRef5.i != j)) i3 = 0;
/*  749 */           if ((localIntegerRef2.i == 21) && (localIntegerRef5.i == j)) i4 = 0;
/*  750 */           if ((localIntegerRef2.i == 22) && (localIntegerRef5.i != j)) { i5 = 0;i6 = 0; }
/*  751 */           if ((localIntegerRef2.i == 23) && (localIntegerRef5.i != j)) { i5 = 0;i6 = 0;
/*      */           }
/*      */         }
/*      */       }
/*  755 */       if (i3 > 0) {
/*  756 */         StringUtil.println("ActedSomewhat praise chr " + j);
/*  757 */         ProvocativeContentArchive.archive.AddContent(2, 20, j, -1, -1, -1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  763 */       if (i4 > 0) {
/*  764 */         StringUtil.println("ActedSomewhat criticize chr " + j);
/*  765 */         ProvocativeContentArchive.archive.AddContent(2, 21, j, -1, -1, -1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  771 */       if (i5 > 0) {
/*  772 */         StringUtil.println("ActedSomewhat flirt chr " + j);
/*  773 */         ProvocativeContentArchive.archive.AddContent(2, 22, j, -1, -1, -1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  779 */       if (i6 > 0) {
/*  780 */         StringUtil.println("ActedSomewhat kiss chr " + j);
/*  781 */         ProvocativeContentArchive.archive.AddContent(2, 23, j, -1, -1, -1);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  790 */     i7 = 0;
/*  791 */     i8 = 0;
/*  792 */     i9 = 0;
/*  793 */     i10 = 0;
/*  794 */     for (int i = 0; i < k; i++) {
/*  795 */       IntermediateContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5);
/*      */       
/*      */ 
/*  798 */       if (localIntegerRef1.i == 0) {
/*  799 */         if (localIntegerRef2.i == 27) i7++;
/*  800 */         if (localIntegerRef2.i == 28) i8++;
/*  801 */         if (localIntegerRef2.i == 29) i9++;
/*  802 */         if (localIntegerRef2.i == 30) { i10++;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  807 */     if (i8 >= 4) {
/*  808 */       StringUtil.println("ActedOverly negative");
/*  809 */       ProvocativeContentArchive.archive.AddContent(1, 28, -1, -1, -1, -1);
/*      */       
/*      */ 
/*      */ 
/*  813 */       i7 = 0;
/*      */     }
/*      */     
/*  816 */     if (i7 >= 4) {
/*  817 */       StringUtil.println("ActedOverly positive");
/*  818 */       ProvocativeContentArchive.archive.AddContent(1, 27, -1, -1, -1, -1);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  824 */     if (i9 >= 6) {
/*  825 */       StringUtil.println("ActedOverly quiet");
/*  826 */       ProvocativeContentArchive.archive.AddContent(1, 29, -1, -1, -1, -1);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  832 */     if (i10 >= 4) {
/*  833 */       StringUtil.println("ActedOverly uncooperative");
/*  834 */       ProvocativeContentArchive.archive.AddContent(1, 30, -1, -1, -1, -1);
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
/*      */   public void AssignValuesToProvocativeContent()
/*      */   {
/*  849 */     StringUtil.println("### CrisisCalculus.AssignValuesToProvocativeContent()");
/*      */     
/*      */ 
/*  852 */     IntegerRef localIntegerRef1 = new IntegerRef();
/*  853 */     IntegerRef localIntegerRef2 = new IntegerRef();
/*  854 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*  855 */     IntegerRef localIntegerRef4 = new IntegerRef();
/*  856 */     IntegerRef localIntegerRef5 = new IntegerRef();
/*  857 */     IntegerRef localIntegerRef6 = new IntegerRef();
/*  858 */     BooleanRef localBooleanRef = new BooleanRef();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  865 */     int i1 = ProvocativeContentArchive.archive.GetNumContents();
/*      */     
/*      */ 
/*  868 */     for (int i = 0; i < i1; i++) {
/*  869 */       ProvocativeContentArchive.archive.GetContentInfo(i, localIntegerRef1, localIntegerRef2, localIntegerRef3, localIntegerRef4, localIntegerRef5, localIntegerRef6, localBooleanRef);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  875 */       int j = -1;
/*  876 */       boolean bool1 = false;
/*  877 */       boolean bool2 = false;
/*  878 */       int k = -1;
/*  879 */       int m = -1;
/*  880 */       int n = -1;
/*  881 */       int i2 = 0;
/*      */       
/*  883 */       switch (localIntegerRef1.i)
/*      */       {
/*      */ 
/*      */       case 0: 
/*  887 */         switch (localIntegerRef2.i)
/*      */         {
/*      */         case 4: 
/*      */         case 10: 
/*  891 */           j = 1;
/*  892 */           bool1 = true;
/*  893 */           bool2 = true;
/*  894 */           k = 3;
/*  895 */           m = -3;
/*  896 */           n = 2;
/*  897 */           break;
/*      */         
/*      */         case 1: 
/*      */         case 3: 
/*      */         case 7: 
/*      */         case 9: 
/*      */         case 11: 
/*      */         case 12: 
/*      */         case 13: 
/*  906 */           j = 2;
/*  907 */           bool1 = true;
/*  908 */           bool2 = true;
/*  909 */           k = 2;
/*  910 */           m = -2;
/*  911 */           n = 2;
/*  912 */           break;
/*      */         
/*      */         case 0: 
/*      */         case 2: 
/*      */         case 5: 
/*      */         case 8: 
/*  918 */           j = 3;
/*  919 */           bool1 = true;
/*  920 */           bool2 = true;
/*  921 */           k = 2;
/*  922 */           m = -2;
/*  923 */           n = 2;
/*      */         }
/*      */         
/*  926 */         break;
/*      */       
/*      */ 
/*      */ 
/*      */       case 1: 
/*  931 */         switch (localIntegerRef2.i)
/*      */         {
/*      */         case 22: 
/*      */         case 23: 
/*      */         case 26: 
/*  936 */           j = 1;
/*  937 */           bool1 = true;
/*  938 */           bool2 = true;
/*  939 */           k = 3;
/*  940 */           m = -3;
/*  941 */           n = -2;
/*  942 */           break;
/*      */         
/*      */         case 21: 
/*  945 */           j = 2;
/*  946 */           bool1 = true;
/*  947 */           bool2 = true;
/*  948 */           k = 2;
/*  949 */           m = -2;
/*  950 */           n = -1;
/*  951 */           break;
/*      */         
/*      */         case 31: 
/*  954 */           j = 3;
/*  955 */           bool1 = true;
/*  956 */           bool2 = true;
/*  957 */           k = 2;
/*  958 */           m = 0;
/*  959 */           n = -1;
/*  960 */           break;
/*      */         
/*      */         case 20: 
/*      */         case 24: 
/*      */         case 25: 
/*  965 */           j = 5;
/*  966 */           bool1 = true;
/*  967 */           bool2 = false;
/*  968 */           k = 1;
/*  969 */           m = -1;
/*  970 */           n = -1;
/*  971 */           break;
/*      */         
/*      */         case 27: 
/*      */         case 28: 
/*      */         case 29: 
/*      */         case 30: 
/*  977 */           j = 6;
/*  978 */           bool1 = true;
/*  979 */           bool2 = false;
/*  980 */           k = 0;
/*  981 */           m = 0;
/*  982 */           n = 0;
/*      */         }
/*      */         
/*  985 */         break;
/*      */       
/*      */ 
/*      */ 
/*      */       case 2: 
/*  990 */         switch (localIntegerRef2.i)
/*      */         {
/*      */         case 22: 
/*      */         case 23: 
/*  994 */           j = 4;
/*  995 */           bool1 = true;
/*  996 */           bool2 = false;
/*  997 */           k = 2;
/*  998 */           m = -2;
/*  999 */           n = -1;
/* 1000 */           break;
/*      */         
/*      */         case 20: 
/*      */         case 21: 
/* 1004 */           i2 = 1;
/*      */         }
/*      */         
/* 1007 */         break;
/*      */       
/*      */ 
/*      */       case 3: 
/* 1011 */         j = 3;
/* 1012 */         bool1 = true;
/* 1013 */         bool2 = true;
/* 1014 */         k = 2;
/* 1015 */         m = -2;
/* 1016 */         n = 2;
/* 1017 */         break;
/*      */       
/*      */       case 4: 
/* 1020 */         j = 5;
/* 1021 */         bool1 = true;
/* 1022 */         bool2 = false;
/* 1023 */         k = 1;
/* 1024 */         m = 0;
/* 1025 */         n = 1;
/* 1026 */         break;
/*      */       
/*      */ 
/*      */       case 5: 
/* 1030 */         switch (localIntegerRef2.i)
/*      */         {
/*      */         case 60: 
/* 1033 */           j = 3;
/* 1034 */           bool1 = true;
/* 1035 */           bool2 = true;
/* 1036 */           k = 2;
/* 1037 */           m = -3;
/* 1038 */           n = -1;
/* 1039 */           break;
/*      */         
/*      */         case 61: 
/*      */         case 62: 
/* 1043 */           j = 5;
/* 1044 */           bool1 = true;
/* 1045 */           bool2 = false;
/* 1046 */           k = 1;
/* 1047 */           m = -1;
/* 1048 */           n = 0;
/*      */         }
/*      */         
/* 1051 */         break;
/*      */       
/*      */ 
/*      */       case 6: 
/* 1055 */         j = 3;
/* 1056 */         bool1 = false;
/* 1057 */         bool2 = true;
/* 1058 */         k = 2;
/* 1059 */         m = 0;
/* 1060 */         n = 0;
/* 1061 */         break;
/*      */       
/*      */       case 7: 
/* 1064 */         if (localIntegerRef3.i != -1) {
/* 1065 */           j = 5;
/* 1066 */           bool1 = false;
/* 1067 */           bool2 = false;
/* 1068 */           k = 1;
/* 1069 */           m = 0;
/* 1070 */           n = 0;
/*      */         } else {
/* 1072 */           j = 6;
/* 1073 */           bool1 = false;
/* 1074 */           bool2 = false;
/* 1075 */           k = 0;
/* 1076 */           m = 0;
/* 1077 */           n = 0;
/*      */         }
/* 1079 */         break;
/*      */       
/*      */       default: 
/* 1082 */         StringUtil.println("### Unknown type in AssignValuesToProvocativeContent");
/* 1083 */         if (!$noassert) { throw new AssertionError();
/*      */         }
/*      */         break;
/*      */       }
/*      */       
/* 1088 */       if (i2 == 0)
/*      */       {
/*      */ 
/* 1091 */         if ((j == -1) && (!bool1) && (!bool2) && (k == -1) && (m == -1) && (n == -1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1097 */           StringUtil.println("### Bug in AssignValuesToProvocativeContent type " + localIntegerRef1.i + " param " + localIntegerRef2.i);
/*      */           
/* 1099 */           if (!$noassert) { throw new AssertionError();
/*      */           }
/*      */         }
/*      */         
/*      */ 
/* 1104 */         ProvocativeContentArchive.archive.SetContentInfo(i, localIntegerRef1.i, localIntegerRef2.i, localIntegerRef3.i, j, bool1, bool2, k, m, n, localIntegerRef4.i, localIntegerRef5.i, localIntegerRef6.i, localBooleanRef.b);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1120 */         if (bool2) { StringUtil.println("Provocative content type " + localIntegerRef1.i + " param " + localIntegerRef2.i + " is accusable");
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void CalculateSelfRevelation(int paramInt)
/*      */   {
/* 1129 */     int i = 3;
/*      */     
/* 1131 */     StringUtil.println("### CrisisCalculus.CalculateSelfRevelation()");
/*      */     
/* 1133 */     whoSelfRevelation = paramInt;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1138 */     if (overallConstructiveness <= 0) {
/* 1139 */       if (((paramInt == 0) && (gbp >= i)) || ((paramInt == 1) && (tbp >= i)))
/*      */       {
/* 1141 */         whichSelfRevelation = 0;
/* 1142 */         bFuriousOrUpsetAtEndOfCrisis = true;
/*      */       }
/*      */       else {
/* 1145 */         whichSelfRevelation = 1;
/* 1146 */         bFuriousOrUpsetAtEndOfCrisis = false;
/*      */       }
/*      */     }
/*      */     else {
/* 1150 */       whichSelfRevelation = 2;
/* 1151 */       bFuriousOrUpsetAtEndOfCrisis = false;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\CrisisCalculus.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */