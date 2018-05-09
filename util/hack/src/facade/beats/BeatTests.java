/*      */ package facade.beats;
/*      */ 
/*      */ import dramaman.runtime.BeatAbortWME;
/*      */ import dramaman.runtime.BeatCompletedWME;
/*      */ import dramaman.runtime.BeatStartWME;
/*      */ import dramaman.runtime.DramaManager;
/*      */ import dramaman.runtime.StoryStatusWME;
/*      */ import facade.characters.wmedef.DAWME;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import scope.VariableScope;
/*      */ import scope.VariableScope.IntValue;
/*      */ import scope.VariableScope.LongValue;
/*      */ import scope.VariableScope.Variable;
/*      */ import scope.VariableScopeThrowsErrors;
/*      */ 
/*      */ public class BeatTests implements facade.util.BeatID, dramaman.runtime.DramaManagerConstants, facade.util.DAType, facade.util.BeatArguments, facade.util.TherapyGameConstants
/*      */ {
/*      */   public static boolean _PBehindDoor_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*   22 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PBehindDoor_T1_precondition1_scope");
/*      */     
/*      */ 
/*   25 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/*   26 */     ListIterator localListIterator = localList.listIterator();
/*   27 */     while (localListIterator.hasNext()) {
/*   28 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/*   29 */       if (localStoryStatusWME.getBeatCount() == 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   34 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*   39 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TGreetsP_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*   44 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TGreetsP_T1_precondition1_scope");
/*      */     
/*      */ 
/*   47 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/*   48 */     ListIterator localListIterator = localList.listIterator();
/*   49 */     while (localListIterator.hasNext()) {
/*   50 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/*   51 */       if (localStoryStatusWME.getBeatCount() == 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   56 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*   61 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TFetchesG_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*   66 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TFetchesG_T1_precondition1_scope");
/*      */     
/*      */ 
/*   69 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/*   70 */     ListIterator localListIterator = localList.listIterator();
/*   71 */     while (localListIterator.hasNext()) {
/*   72 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/*   73 */       if (localStoryStatusWME.getBeatCount() == 3)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   78 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*   83 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _GGreetsP_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*   88 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_GGreetsP_T1_precondition1_scope");
/*      */     
/*      */ 
/*   91 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/*   92 */     ListIterator localListIterator = localList.listIterator();
/*   93 */     while (localListIterator.hasNext()) {
/*   94 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/*   95 */       if (localStoryStatusWME.getBeatCount() == 4)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  100 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  105 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ExplDatAnniv_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*  110 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ExplDatAnniv_T1_precondition1_scope");
/*      */     
/*      */ 
/*  113 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/*  114 */     ListIterator localListIterator1 = localList1.listIterator();
/*  115 */     while (localListIterator1.hasNext()) {
/*  116 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/*  117 */       if (localStoryStatusWME.getBeatCount() > 4)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  124 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/*  125 */         ListIterator localListIterator2 = localList2.listIterator();
/*  126 */         while (localListIterator2.hasNext()) {
/*  127 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/*  128 */           if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  135 */             List localList3 = DramaManager.lookupWME("DAWME");
/*  136 */             ListIterator localListIterator3 = localList3.listIterator();
/*  137 */             while (localListIterator3.hasNext()) {
/*  138 */               DAWME localDAWME = (DAWME)localListIterator3.next();
/*  139 */               if ((localDAWME.getId() == 10) && (localDAWME.getParam1() == 63))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  146 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*  151 */             return true;
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
/*  162 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ExplDatAnniv_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/*  167 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ExplDatAnniv_T1_weighttest1_scope");
/*      */     
/*      */ 
/*  170 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/*  171 */     ListIterator localListIterator = localList.listIterator();
/*  172 */     while (localListIterator.hasNext()) {
/*  173 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/*  174 */       if (localStoryStatusWME.getBeatCount() < 7)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  179 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  184 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _PhoneCall_NGPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*  189 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NGPA_T1_precondition1_scope");
/*      */     
/*      */ 
/*  192 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/*  193 */     ListIterator localListIterator1 = localList1.listIterator();
/*  194 */     ListIterator localListIterator2; label232: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  207 */         localListIterator2.hasNext())
/*      */     {
/*  195 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/*  196 */       if ((localStoryStatusWME.getBeatCount() <= 4) || (localStoryStatusWME.getAffinity() > 0)) {
/*      */         break label232;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  205 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/*  206 */       localListIterator2 = localList2.listIterator();
/*  207 */       continue;
/*  208 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/*  209 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  216 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/*  217 */         ListIterator localListIterator3 = localList3.listIterator();
/*  218 */         while (localListIterator3.hasNext()) {
/*  219 */           localObject = (BeatCompletedWME)localListIterator3.next();
/*  220 */           if ((((BeatCompletedWME)localObject).getBeatID() >= 5) && (((BeatCompletedWME)localObject).getBeatID() <= 6))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  234 */         Object localObject = DramaManager.lookupWME("BeatAbortWME");
/*  235 */         ListIterator localListIterator4 = ((List)localObject).listIterator();
/*  236 */         while (localListIterator4.hasNext()) {
/*  237 */           BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator4.next();
/*  238 */           if ((localBeatAbortWME.getBeatID() >= 5) && (localBeatAbortWME.getBeatID() <= 6))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  245 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  250 */         return true;
/*      */       }
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
/*  262 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _PhoneCall_NTPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*  267 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_PhoneCall_NTPA_T1_precondition1_scope");
/*      */     
/*      */ 
/*  270 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/*  271 */     ListIterator localListIterator1 = localList1.listIterator();
/*  272 */     ListIterator localListIterator2; label232: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  285 */         localListIterator2.hasNext())
/*      */     {
/*  273 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/*  274 */       if ((localStoryStatusWME.getBeatCount() <= 4) || (localStoryStatusWME.getAffinity() < 0)) {
/*      */         break label232;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  283 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/*  284 */       localListIterator2 = localList2.listIterator();
/*  285 */       continue;
/*  286 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/*  287 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/*  295 */         ListIterator localListIterator3 = localList3.listIterator();
/*  296 */         while (localListIterator3.hasNext()) {
/*  297 */           localObject = (BeatCompletedWME)localListIterator3.next();
/*  298 */           if ((((BeatCompletedWME)localObject).getBeatID() >= 5) && (((BeatCompletedWME)localObject).getBeatID() <= 6))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  305 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  312 */         Object localObject = DramaManager.lookupWME("BeatAbortWME");
/*  313 */         ListIterator localListIterator4 = ((List)localObject).listIterator();
/*  314 */         while (localListIterator4.hasNext()) {
/*  315 */           BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator4.next();
/*  316 */           if ((localBeatAbortWME.getBeatID() >= 5) && (localBeatAbortWME.getBeatID() <= 6))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  323 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  328 */         return true;
/*      */       }
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
/*  340 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*  345 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_precondition1_scope");
/*  346 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/*  349 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/*  350 */     ListIterator localListIterator1 = localList1.listIterator();
/*  351 */     ListIterator localListIterator2; label340: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  364 */         localListIterator2.hasNext())
/*      */     {
/*  352 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/*  353 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() != 0)) {
/*      */         break label340;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  362 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/*  363 */       localListIterator2 = localList2.listIterator();
/*  364 */       continue;
/*  365 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/*  366 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  373 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/*  374 */         ListIterator localListIterator3 = localList3.listIterator();
/*  375 */         while (localListIterator3.hasNext()) {
/*  376 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/*  377 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  384 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  391 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/*  392 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/*  393 */         while (localListIterator4.hasNext()) {
/*  394 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/*  395 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 9) && (((BeatAbortWME)localObject2).getBeatID() <= 11) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 2) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 1))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  406 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  413 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/*  414 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/*  415 */         while (localListIterator5.hasNext()) {
/*  416 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/*  417 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/*  418 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  423 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/*  424 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  441 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/*  446 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_weighttest1_scope");
/*  447 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/*  448 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/*  449 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*  450 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/*  453 */     List localList1 = DramaManager.lookupWME("DAWME");
/*  454 */     ListIterator localListIterator1 = localList1.listIterator();
/*  455 */     while (localListIterator1.hasNext()) {
/*  456 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/*  457 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/*  458 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/*  469 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  474 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  479 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  486 */               List localList2 = DramaManager.lookupWME("DAWME");
/*  487 */               ListIterator localListIterator2 = localList2.listIterator();
/*  488 */               while (localListIterator2.hasNext()) {
/*  489 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/*  490 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  499 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  504 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  509 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  514 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*  519 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/*  520 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  551 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_weighttest2(VariableScope paramVariableScope)
/*      */   {
/*  556 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_weighttest2_scope");
/*  557 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/*  558 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/*  559 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/*  562 */     List localList = DramaManager.lookupWME("DAWME");
/*  563 */     ListIterator localListIterator = localList.listIterator();
/*  564 */     while (localListIterator.hasNext()) {
/*  565 */       DAWME localDAWME = (DAWME)localListIterator.next();
/*  566 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/*  567 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/*  578 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  583 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  588 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  593 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  598 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/*  599 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  616 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/*  621 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_prioritytest1_scope");
/*  622 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/*  623 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/*  624 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/*  627 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/*  628 */     ListIterator localListIterator = localList.listIterator();
/*  629 */     while (localListIterator.hasNext()) {
/*  630 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/*  631 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 9) && (localBeatAbortWME.getBeatID() <= 11) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/*  644 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  649 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  654 */             if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i == 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  659 */               localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/*  660 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/*  674 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/*  679 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_prioritytest2_scope");
/*  680 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/*  681 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/*  682 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*  683 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/*  686 */     List localList1 = DramaManager.lookupWME("DAWME");
/*  687 */     ListIterator localListIterator1 = localList1.listIterator();
/*  688 */     while (localListIterator1.hasNext()) {
/*  689 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/*  690 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/*  691 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/*  702 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  707 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */             List localList2 = DramaManager.lookupWME("DAWME");
/*  715 */             ListIterator localListIterator2 = localList2.listIterator();
/*  716 */             while (localListIterator2.hasNext()) {
/*  717 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/*  718 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  727 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  732 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  737 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  742 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  747 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/*  748 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_N_T1_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/*  781 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_N_T1_prioritytest3_scope");
/*  782 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/*  783 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/*  784 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/*  787 */     List localList = DramaManager.lookupWME("DAWME");
/*  788 */     ListIterator localListIterator = localList.listIterator();
/*  789 */     while (localListIterator.hasNext()) {
/*  790 */       DAWME localDAWME = (DAWME)localListIterator.next();
/*  791 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/*  792 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/*  803 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  808 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  813 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  818 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/*  819 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/*  833 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/*  838 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_precondition1_scope");
/*  839 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/*  842 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/*  843 */     ListIterator localListIterator1 = localList1.listIterator();
/*  844 */     ListIterator localListIterator2; label341: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  857 */         localListIterator2.hasNext())
/*      */     {
/*  845 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/*  846 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() > -1)) {
/*      */         break label341;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  855 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/*  856 */       localListIterator2 = localList2.listIterator();
/*  857 */       continue;
/*  858 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/*  859 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  866 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/*  867 */         ListIterator localListIterator3 = localList3.listIterator();
/*  868 */         while (localListIterator3.hasNext()) {
/*  869 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/*  870 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  877 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  884 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/*  885 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/*  886 */         while (localListIterator4.hasNext()) {
/*  887 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/*  888 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 9) && (((BeatAbortWME)localObject2).getBeatID() <= 11) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 2) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 1))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  899 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  906 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/*  907 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/*  908 */         while (localListIterator5.hasNext()) {
/*  909 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/*  910 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/*  911 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  916 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/*  917 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  934 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/*  939 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_weighttest1_scope");
/*  940 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/*  941 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/*  942 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*  943 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/*  946 */     List localList1 = DramaManager.lookupWME("DAWME");
/*  947 */     ListIterator localListIterator1 = localList1.listIterator();
/*  948 */     while (localListIterator1.hasNext()) {
/*  949 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/*  950 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/*  951 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/*  962 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  967 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  972 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  979 */               List localList2 = DramaManager.lookupWME("DAWME");
/*  980 */               ListIterator localListIterator2 = localList2.listIterator();
/*  981 */               while (localListIterator2.hasNext()) {
/*  982 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/*  983 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  992 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  997 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1002 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1007 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1012 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1013 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1044 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 1049 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_weighttest2_scope");
/* 1050 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1051 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1052 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1055 */     List localList = DramaManager.lookupWME("DAWME");
/* 1056 */     ListIterator localListIterator = localList.listIterator();
/* 1057 */     while (localListIterator.hasNext()) {
/* 1058 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1059 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1060 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 1071 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1076 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1081 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1086 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1091 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1092 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1109 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 1114 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_prioritytest1_scope");
/* 1115 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 1116 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 1117 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 1120 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 1121 */     ListIterator localListIterator = localList.listIterator();
/* 1122 */     while (localListIterator.hasNext()) {
/* 1123 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 1124 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 9) && (localBeatAbortWME.getBeatID() <= 11) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 1) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 1139 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1144 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1149 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 1150 */             return true;
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
/* 1161 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 1166 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_prioritytest2_scope");
/* 1167 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1168 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1169 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 1170 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 1173 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 1174 */     ListIterator localListIterator1 = localList1.listIterator();
/* 1175 */     while (localListIterator1.hasNext()) {
/* 1176 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 1177 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 1178 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 1189 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1194 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1201 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 1202 */             ListIterator localListIterator2 = localList2.listIterator();
/* 1203 */             while (localListIterator2.hasNext()) {
/* 1204 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 1205 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1214 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1219 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1224 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1229 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1234 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1235 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1263 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T1_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 1268 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T1_prioritytest3_scope");
/* 1269 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1270 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1271 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1274 */     List localList = DramaManager.lookupWME("DAWME");
/* 1275 */     ListIterator localListIterator = localList.listIterator();
/* 1276 */     while (localListIterator.hasNext()) {
/* 1277 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1278 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1279 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 1290 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1295 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1300 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1305 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1306 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 1320 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 1325 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_precondition1_scope");
/* 1326 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 1329 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 1330 */     ListIterator localListIterator1 = localList1.listIterator();
/* 1331 */     ListIterator localListIterator2; label341: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1344 */         localListIterator2.hasNext())
/*      */     {
/* 1332 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 1333 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() < 1)) {
/*      */         break label341;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1342 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 1343 */       localListIterator2 = localList2.listIterator();
/* 1344 */       continue;
/* 1345 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 1346 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1353 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 1354 */         ListIterator localListIterator3 = localList3.listIterator();
/* 1355 */         while (localListIterator3.hasNext()) {
/* 1356 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 1357 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1364 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1371 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 1372 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 1373 */         while (localListIterator4.hasNext()) {
/* 1374 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 1375 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 9) && (((BeatAbortWME)localObject2).getBeatID() <= 11) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 2) && (((BeatAbortWME)localObject2).getBeatAbortReason() != 1))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1386 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1393 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 1394 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 1395 */         while (localListIterator5.hasNext()) {
/* 1396 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 1397 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 1398 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1403 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 1404 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1421 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 1426 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_weighttest1_scope");
/* 1427 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1428 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1429 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 1430 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 1433 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 1434 */     ListIterator localListIterator1 = localList1.listIterator();
/* 1435 */     while (localListIterator1.hasNext()) {
/* 1436 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 1437 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 1438 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 1449 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1454 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1459 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1466 */               List localList2 = DramaManager.lookupWME("DAWME");
/* 1467 */               ListIterator localListIterator2 = localList2.listIterator();
/* 1468 */               while (localListIterator2.hasNext()) {
/* 1469 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 1470 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1479 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1484 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1489 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1494 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1499 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1500 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1531 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 1536 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_weighttest2_scope");
/* 1537 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1538 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1539 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1542 */     List localList = DramaManager.lookupWME("DAWME");
/* 1543 */     ListIterator localListIterator = localList.listIterator();
/* 1544 */     while (localListIterator.hasNext()) {
/* 1545 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1546 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1547 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 1558 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1563 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1568 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1573 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1578 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1579 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1596 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 1601 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_prioritytest1_scope");
/* 1602 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 1603 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 1604 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 1607 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 1608 */     ListIterator localListIterator = localList.listIterator();
/* 1609 */     while (localListIterator.hasNext()) {
/* 1610 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 1611 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 9) && (localBeatAbortWME.getBeatID() <= 11) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 1626 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1631 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1636 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 1637 */             return true;
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
/* 1648 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 1653 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_prioritytest2_scope");
/* 1654 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1655 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1656 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 1657 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 1660 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 1661 */     ListIterator localListIterator1 = localList1.listIterator();
/* 1662 */     while (localListIterator1.hasNext()) {
/* 1663 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 1664 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 1665 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 1676 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1681 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1688 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 1689 */             ListIterator localListIterator2 = localList2.listIterator();
/* 1690 */             while (localListIterator2.hasNext()) {
/* 1691 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 1692 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1701 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1706 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1711 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1716 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1721 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1722 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1750 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T1_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 1755 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T1_prioritytest3_scope");
/* 1756 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1757 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1758 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1761 */     List localList = DramaManager.lookupWME("DAWME");
/* 1762 */     ListIterator localListIterator = localList.listIterator();
/* 1763 */     while (localListIterator.hasNext()) {
/* 1764 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1765 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1766 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 1777 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1782 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1787 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1792 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1793 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 1807 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_N_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 1812 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_precondition1_scope");
/* 1813 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 1816 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 1817 */     ListIterator localListIterator1 = localList1.listIterator();
/* 1818 */     ListIterator localListIterator2; label323: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1831 */         localListIterator2.hasNext())
/*      */     {
/* 1819 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 1820 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() != 0)) {
/*      */         break label323;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1829 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 1830 */       localListIterator2 = localList2.listIterator();
/* 1831 */       continue;
/* 1832 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 1833 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1840 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 1841 */         ListIterator localListIterator3 = localList3.listIterator();
/* 1842 */         while (localListIterator3.hasNext()) {
/* 1843 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 1844 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1851 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1858 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 1859 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 1860 */         while (localListIterator4.hasNext()) {
/* 1861 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 1862 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 14) && (((BeatAbortWME)localObject2).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1869 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1876 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 1877 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 1878 */         while (localListIterator5.hasNext()) {
/* 1879 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 1880 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 1881 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1886 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 1887 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1904 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_N_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 1909 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_weighttest1_scope");
/* 1910 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1911 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1912 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1915 */     List localList = DramaManager.lookupWME("DAWME");
/* 1916 */     ListIterator localListIterator = localList.listIterator();
/* 1917 */     while (localListIterator.hasNext()) {
/* 1918 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1919 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1920 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 1931 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1936 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1941 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1946 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1951 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 1952 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1969 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_N_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 1974 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_N_T1_prioritytest1_scope");
/* 1975 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 1976 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 1977 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 1980 */     List localList = DramaManager.lookupWME("DAWME");
/* 1981 */     ListIterator localListIterator = localList.listIterator();
/* 1982 */     while (localListIterator.hasNext()) {
/* 1983 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 1984 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 1985 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 1996 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2001 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2006 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2011 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2012 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 2026 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2031 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_precondition1_scope");
/* 2032 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 2035 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2036 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2037 */     ListIterator localListIterator2; label324: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2050 */         localListIterator2.hasNext())
/*      */     {
/* 2038 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 2039 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() > -1)) {
/*      */         break label324;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2048 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2049 */       localListIterator2 = localList2.listIterator();
/* 2050 */       continue;
/* 2051 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2052 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2059 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 2060 */         ListIterator localListIterator3 = localList3.listIterator();
/* 2061 */         while (localListIterator3.hasNext()) {
/* 2062 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 2063 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2070 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2077 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 2078 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 2079 */         while (localListIterator4.hasNext()) {
/* 2080 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 2081 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 14) && (((BeatAbortWME)localObject2).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2088 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2095 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 2096 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 2097 */         while (localListIterator5.hasNext()) {
/* 2098 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 2099 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 2100 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2105 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 2106 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2123 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 2128 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_weighttest1_scope");
/* 2129 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2130 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2131 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2134 */     List localList = DramaManager.lookupWME("DAWME");
/* 2135 */     ListIterator localListIterator = localList.listIterator();
/* 2136 */     while (localListIterator.hasNext()) {
/* 2137 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2138 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2139 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 2150 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2155 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2160 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2165 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2170 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2171 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2188 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 2193 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T1_prioritytest1_scope");
/* 2194 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2195 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2196 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2199 */     List localList = DramaManager.lookupWME("DAWME");
/* 2200 */     ListIterator localListIterator = localList.listIterator();
/* 2201 */     while (localListIterator.hasNext()) {
/* 2202 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2203 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2204 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 2215 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2220 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2225 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2230 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2231 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 2245 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2250 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_precondition1_scope");
/* 2251 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 2254 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2255 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2256 */     ListIterator localListIterator2; label324: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2269 */         localListIterator2.hasNext())
/*      */     {
/* 2257 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 2258 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() < 1)) {
/*      */         break label324;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2267 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2268 */       localListIterator2 = localList2.listIterator();
/* 2269 */       continue;
/* 2270 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2271 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2278 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 2279 */         ListIterator localListIterator3 = localList3.listIterator();
/* 2280 */         while (localListIterator3.hasNext()) {
/* 2281 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 2282 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2289 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2296 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 2297 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 2298 */         while (localListIterator4.hasNext()) {
/* 2299 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 2300 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 14) && (((BeatAbortWME)localObject2).getBeatID() <= 16))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2307 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2314 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 2315 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 2316 */         while (localListIterator5.hasNext()) {
/* 2317 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 2318 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 2319 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2324 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 2325 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2342 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 2347 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_weighttest1_scope");
/* 2348 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2349 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2350 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2353 */     List localList = DramaManager.lookupWME("DAWME");
/* 2354 */     ListIterator localListIterator = localList.listIterator();
/* 2355 */     while (localListIterator.hasNext()) {
/* 2356 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2357 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2358 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 2369 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2374 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2379 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2384 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2389 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2390 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2407 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 2412 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T1_prioritytest1_scope");
/* 2413 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2414 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2415 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2418 */     List localList = DramaManager.lookupWME("DAWME");
/* 2419 */     ListIterator localListIterator = localList.listIterator();
/* 2420 */     while (localListIterator.hasNext()) {
/* 2421 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2422 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2423 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 2434 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2439 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2444 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2449 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2450 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 2464 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_NTPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2469 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_precondition1_scope");
/* 2470 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 2473 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2474 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2475 */     ListIterator localListIterator2; label323: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2488 */         localListIterator2.hasNext())
/*      */     {
/* 2476 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 2477 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() < 0)) {
/*      */         break label323;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2486 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2487 */       localListIterator2 = localList2.listIterator();
/* 2488 */       continue;
/* 2489 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2490 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2497 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 2498 */         ListIterator localListIterator3 = localList3.listIterator();
/* 2499 */         while (localListIterator3.hasNext()) {
/* 2500 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 2501 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 12) && (((BeatCompletedWME)localObject1).getBeatID() <= 13))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2508 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2515 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 2516 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 2517 */         while (localListIterator4.hasNext()) {
/* 2518 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 2519 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 12) && (((BeatAbortWME)localObject2).getBeatID() <= 13))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2526 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2533 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 2534 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 2535 */         while (localListIterator5.hasNext()) {
/* 2536 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 2537 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 2538 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2543 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 2544 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2561 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_NTPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 2566 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_weighttest1_scope");
/* 2567 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2568 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2569 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2572 */     List localList = DramaManager.lookupWME("DAWME");
/* 2573 */     ListIterator localListIterator = localList.listIterator();
/* 2574 */     while (localListIterator.hasNext()) {
/* 2575 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2576 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2577 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 2588 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2593 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2598 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2603 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2608 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2609 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2626 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_NTPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 2631 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_NTPA_T1_prioritytest1_scope");
/* 2632 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2633 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2634 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2637 */     List localList = DramaManager.lookupWME("DAWME");
/* 2638 */     ListIterator localListIterator = localList.listIterator();
/* 2639 */     while (localListIterator.hasNext()) {
/* 2640 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2641 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2642 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 2653 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2658 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2663 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2668 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2669 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 2683 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2688 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_precondition1_scope");
/* 2689 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 2692 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2693 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2694 */     ListIterator localListIterator2; label324: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2707 */         localListIterator2.hasNext())
/*      */     {
/* 2695 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 2696 */       if ((localStoryStatusWME1.getBeatCount() <= 4) || (localStoryStatusWME1.getAffinity() > -1)) {
/*      */         break label324;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2705 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2706 */       localListIterator2 = localList2.listIterator();
/* 2707 */       continue;
/* 2708 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2709 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2716 */         List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 2717 */         ListIterator localListIterator3 = localList3.listIterator();
/* 2718 */         while (localListIterator3.hasNext()) {
/* 2719 */           localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 2720 */           if ((((BeatCompletedWME)localObject1).getBeatID() >= 12) && (((BeatCompletedWME)localObject1).getBeatID() <= 13))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2727 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2734 */         Object localObject1 = DramaManager.lookupWME("BeatAbortWME");
/* 2735 */         ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 2736 */         while (localListIterator4.hasNext()) {
/* 2737 */           localObject2 = (BeatAbortWME)localListIterator4.next();
/* 2738 */           if ((((BeatAbortWME)localObject2).getBeatID() >= 12) && (((BeatAbortWME)localObject2).getBeatID() <= 13))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2745 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2752 */         Object localObject2 = DramaManager.lookupWME("StoryStatusWME");
/* 2753 */         ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 2754 */         while (localListIterator5.hasNext()) {
/* 2755 */           StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator5.next();
/* 2756 */           localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 2757 */           if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2762 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 2763 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2780 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T1_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 2785 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_weighttest1_scope");
/* 2786 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2787 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2788 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2791 */     List localList = DramaManager.lookupWME("DAWME");
/* 2792 */     ListIterator localListIterator = localList.listIterator();
/* 2793 */     while (localListIterator.hasNext()) {
/* 2794 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2795 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2796 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 2807 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2812 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2817 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2822 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2827 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2828 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2845 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T1_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 2850 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T1_prioritytest1_scope");
/* 2851 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 2852 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 2853 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 2856 */     List localList = DramaManager.lookupWME("DAWME");
/* 2857 */     ListIterator localListIterator = localList.listIterator();
/* 2858 */     while (localListIterator.hasNext()) {
/* 2859 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 2860 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 2861 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 2872 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2877 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2882 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2887 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 2888 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 2902 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TxnT1ToT2NGPA_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2907 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2NGPA_precondition1_scope");
/*      */     
/*      */ 
/* 2910 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2911 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2912 */     ListIterator localListIterator2; label109: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2925 */         localListIterator2.hasNext())
/*      */     {
/* 2913 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 2914 */       if ((localStoryStatusWME.getBeatCount() <= 4) || (localStoryStatusWME.getAffinity() > 0)) {
/*      */         break label109;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2923 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2924 */       localListIterator2 = localList2.listIterator();
/* 2925 */       continue;
/* 2926 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2927 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 2932 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2942 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TxnT1ToT2NGPA_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 2947 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2NGPA_prioritytest1_scope");
/* 2948 */     localVariableScopeThrowsErrors.defineVariable("count", null, "int");
/*      */     
/*      */ 
/* 2951 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/* 2952 */     ListIterator localListIterator = localList.listIterator();
/* 2953 */     while (localListIterator.hasNext()) {
/* 2954 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/* 2955 */       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("count")).i = localStoryStatusWME.getBeatCount()))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 2960 */         if (DramaManager.getDramaManager().getStoryTarget("tension").getDesiredValue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("count")).i) > 1.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2965 */           return true;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 2973 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TxnT1ToT2TPA_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 2978 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2TPA_precondition1_scope");
/*      */     
/*      */ 
/* 2981 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 2982 */     ListIterator localListIterator1 = localList1.listIterator();
/* 2983 */     ListIterator localListIterator2; label110: for (; localListIterator1.hasNext(); 
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2996 */         localListIterator2.hasNext())
/*      */     {
/* 2984 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 2985 */       if ((localStoryStatusWME.getBeatCount() <= 4) || (localStoryStatusWME.getAffinity() < 1)) {
/*      */         break label110;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2994 */       List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 2995 */       localListIterator2 = localList2.listIterator();
/* 2996 */       continue;
/* 2997 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 2998 */       if (localTensionStoryValueWME.getValue() == 1.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3003 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3013 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TxnT1ToT2TPA_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 3018 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT1ToT2TPA_prioritytest1_scope");
/* 3019 */     localVariableScopeThrowsErrors.defineVariable("count", null, "int");
/*      */     
/*      */ 
/* 3022 */     List localList = DramaManager.lookupWME("StoryStatusWME");
/* 3023 */     ListIterator localListIterator = localList.listIterator();
/* 3024 */     while (localListIterator.hasNext()) {
/* 3025 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator.next();
/* 3026 */       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("count")).i = localStoryStatusWME.getBeatCount()))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3031 */         if (DramaManager.getDramaManager().getStoryTarget("tension").getDesiredValue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("count")).i) > 1.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3036 */           return true;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 3044 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _OneOnOneGAffChr_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3049 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGAffChr_T2_precondition1_scope");
/*      */     
/*      */ 
/* 3052 */     List localList1 = DramaManager.lookupWME("TensionStoryValueWME");
/* 3053 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3054 */     while (localListIterator1.hasNext()) {
/* 3055 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator1.next();
/* 3056 */       if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3063 */         List localList2 = DramaManager.lookupWME("StoryStatusWME");
/* 3064 */         ListIterator localListIterator2 = localList2.listIterator();
/* 3065 */         while (localListIterator2.hasNext()) {
/* 3066 */           StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator2.next();
/* 3067 */           if (localStoryStatusWME.getAffinity() <= -1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3074 */             java.util.LinkedList localLinkedList = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3075 */             ListIterator localListIterator3 = localLinkedList.listIterator();
/* 3076 */             while (localListIterator3.hasNext()) {
/* 3077 */               facade.characters.wmedef.BeatStatusWME localBeatStatusWME = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3078 */               if (localBeatStatusWME.getAbortReason() == 3)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3083 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/* 3098 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _OneOnOneTAffChr_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3103 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTAffChr_T2_precondition1_scope");
/*      */     
/*      */ 
/* 3106 */     List localList1 = DramaManager.lookupWME("TensionStoryValueWME");
/* 3107 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3108 */     while (localListIterator1.hasNext()) {
/* 3109 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator1.next();
/* 3110 */       if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3117 */         List localList2 = DramaManager.lookupWME("StoryStatusWME");
/* 3118 */         ListIterator localListIterator2 = localList2.listIterator();
/* 3119 */         while (localListIterator2.hasNext()) {
/* 3120 */           StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator2.next();
/* 3121 */           if (localStoryStatusWME.getAffinity() >= 1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3128 */             java.util.LinkedList localLinkedList = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3129 */             ListIterator localListIterator3 = localLinkedList.listIterator();
/* 3130 */             while (localListIterator3.hasNext()) {
/* 3131 */               facade.characters.wmedef.BeatStatusWME localBeatStatusWME = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3132 */               if (localBeatStatusWME.getAbortReason() == 3)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3137 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/* 3152 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _NonAffChrGReturns_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3157 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrGReturns_T2_precondition1_scope");
/* 3158 */     localVariableScopeThrowsErrors.defineVariable("lastBeatID", null, "int");
/*      */     
/*      */ 
/* 3161 */     List localList1 = DramaManager.lookupWME("BeatStartWME");
/* 3162 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3163 */     while (localListIterator1.hasNext()) {
/* 3164 */       BeatStartWME localBeatStartWME = (BeatStartWME)localListIterator1.next();
/* 3165 */       if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i = localBeatStartWME.getBeatID())) && (localBeatStartWME.getBeatID() == 24))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3172 */         if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3179 */           List localList2 = DramaManager.lookupWME("BeatAbortWME");
/* 3180 */           ListIterator localListIterator2 = localList2.listIterator();
/* 3181 */           while (localListIterator2.hasNext()) {
/* 3182 */             BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator2.next();
/* 3183 */             if (localBeatAbortWME.getBeatID() == ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3188 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 3193 */           return true;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3202 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _NonAffChrTReturns_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3207 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_NonAffChrTReturns_T2_precondition1_scope");
/* 3208 */     localVariableScopeThrowsErrors.defineVariable("lastBeatID", null, "int");
/*      */     
/*      */ 
/* 3211 */     List localList1 = DramaManager.lookupWME("BeatStartWME");
/* 3212 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3213 */     while (localListIterator1.hasNext()) {
/* 3214 */       BeatStartWME localBeatStartWME = (BeatStartWME)localListIterator1.next();
/* 3215 */       if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i = localBeatStartWME.getBeatID())) && (localBeatStartWME.getBeatID() == 23))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3222 */         if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3229 */           List localList2 = DramaManager.lookupWME("BeatAbortWME");
/* 3230 */           ListIterator localListIterator2 = localList2.listIterator();
/* 3231 */           while (localListIterator2.hasNext()) {
/* 3232 */             BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator2.next();
/* 3233 */             if (localBeatAbortWME.getBeatID() == ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3238 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 3243 */           return true;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3252 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _OneOnOneGNonAffChr_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3257 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneGNonAffChr_T2_precondition1_scope");
/* 3258 */     localVariableScopeThrowsErrors.defineVariable("lastBeatID", null, "int");
/*      */     
/*      */ 
/* 3261 */     List localList1 = DramaManager.lookupWME("BeatStartWME");
/* 3262 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3263 */     while (localListIterator1.hasNext()) {
/* 3264 */       BeatStartWME localBeatStartWME = (BeatStartWME)localListIterator1.next();
/* 3265 */       if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i = localBeatStartWME.getBeatID())) && (localBeatStartWME.getBeatID() == 24))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3272 */         if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3279 */           List localList2 = DramaManager.lookupWME("BeatAbortWME");
/* 3280 */           ListIterator localListIterator2 = localList2.listIterator();
/* 3281 */           while (localListIterator2.hasNext()) {
/* 3282 */             BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator2.next();
/* 3283 */             if (localBeatAbortWME.getBeatID() == ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3288 */               return true;
/*      */             }
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
/*      */ 
/* 3301 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _OneOnOneTNonAffChr_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3306 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_OneOnOneTNonAffChr_T2_precondition1_scope");
/* 3307 */     localVariableScopeThrowsErrors.defineVariable("lastBeatID", null, "int");
/*      */     
/*      */ 
/* 3310 */     List localList1 = DramaManager.lookupWME("BeatStartWME");
/* 3311 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3312 */     while (localListIterator1.hasNext()) {
/* 3313 */       BeatStartWME localBeatStartWME = (BeatStartWME)localListIterator1.next();
/* 3314 */       if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i = localBeatStartWME.getBeatID())) && (localBeatStartWME.getBeatID() == 23))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3321 */         if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3328 */           List localList2 = DramaManager.lookupWME("BeatAbortWME");
/* 3329 */           ListIterator localListIterator2 = localList2.listIterator();
/* 3330 */           while (localListIterator2.hasNext()) {
/* 3331 */             BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator2.next();
/* 3332 */             if (localBeatAbortWME.getBeatID() == ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("lastBeatID")).i)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3337 */               return true;
/*      */             }
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
/*      */ 
/* 3350 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3355 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_precondition1_scope");
/* 3356 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 3359 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 3360 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3361 */     while (localListIterator1.hasNext()) {
/* 3362 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 3363 */       if (localStoryStatusWME1.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3370 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 3371 */         ListIterator localListIterator2 = localList2.listIterator();
/* 3372 */         while (localListIterator2.hasNext()) {
/* 3373 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 3374 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3381 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 3382 */             ListIterator localListIterator3 = localList3.listIterator();
/* 3383 */             while (localListIterator3.hasNext()) {
/* 3384 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 3385 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3392 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3399 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 3400 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 3401 */             while (localListIterator4.hasNext()) {
/* 3402 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 3403 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 17) && (((BeatCompletedWME)localObject2).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3410 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3417 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 3418 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 3419 */             while (localListIterator5.hasNext()) {
/* 3420 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 3421 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 9) && (((BeatAbortWME)localObject3).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3428 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3435 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 3436 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 3437 */             while (localListIterator6.hasNext()) {
/* 3438 */               localObject4 = (BeatAbortWME)localListIterator6.next();
/* 3439 */               if ((((BeatAbortWME)localObject4).getBeatID() >= 17) && (((BeatAbortWME)localObject4).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3446 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3453 */             Object localObject4 = DramaManager.lookupWME("StoryStatusWME");
/* 3454 */             ListIterator localListIterator7 = ((List)localObject4).listIterator();
/* 3455 */             while (localListIterator7.hasNext()) {
/* 3456 */               StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator7.next();
/* 3457 */               localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 3458 */               if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3463 */                 localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 3464 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3483 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 3488 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_weighttest1_scope");
/* 3489 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 3490 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 3491 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 3492 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 3495 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 3496 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3497 */     while (localListIterator1.hasNext()) {
/* 3498 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 3499 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 3500 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 3511 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3516 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 3521 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3528 */               List localList2 = DramaManager.lookupWME("DAWME");
/* 3529 */               ListIterator localListIterator2 = localList2.listIterator();
/* 3530 */               while (localListIterator2.hasNext()) {
/* 3531 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 3532 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3541 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 3546 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 3551 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 3556 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 3561 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 3562 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3593 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 3598 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_weighttest2_scope");
/* 3599 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 3600 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 3601 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 3604 */     List localList = DramaManager.lookupWME("DAWME");
/* 3605 */     ListIterator localListIterator = localList.listIterator();
/* 3606 */     while (localListIterator.hasNext()) {
/* 3607 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 3608 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 3609 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 3620 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3625 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 3630 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3635 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3640 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 3641 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3658 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 3663 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_prioritytest1_scope");
/* 3664 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 3665 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 3666 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 3669 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 3670 */     ListIterator localListIterator = localList.listIterator();
/* 3671 */     while (localListIterator.hasNext()) {
/* 3672 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 3673 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 1) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 3688 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3693 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 3698 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 3699 */             return true;
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
/* 3710 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 3715 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_prioritytest2_scope");
/* 3716 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 3717 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 3718 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 3719 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 3722 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 3723 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3724 */     while (localListIterator1.hasNext()) {
/* 3725 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 3726 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 3727 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 3738 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3743 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3750 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 3751 */             ListIterator localListIterator2 = localList2.listIterator();
/* 3752 */             while (localListIterator2.hasNext()) {
/* 3753 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 3754 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3763 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 3768 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 3773 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 3778 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 3783 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 3784 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3812 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 3817 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2_prioritytest3_scope");
/* 3818 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 3819 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 3820 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 3823 */     List localList = DramaManager.lookupWME("DAWME");
/* 3824 */     ListIterator localListIterator = localList.listIterator();
/* 3825 */     while (localListIterator.hasNext()) {
/* 3826 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 3827 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 3828 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 3839 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3844 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 3849 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 3854 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 3855 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 3869 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 3874 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_precondition1_scope");
/* 3875 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 3878 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 3879 */     ListIterator localListIterator1 = localList1.listIterator();
/* 3880 */     while (localListIterator1.hasNext()) {
/* 3881 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 3882 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 3883 */       if (localStoryStatusWME.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3890 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 3891 */         ListIterator localListIterator2 = localList2.listIterator();
/* 3892 */         while (localListIterator2.hasNext()) {
/* 3893 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 3894 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3901 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 3902 */             ListIterator localListIterator3 = localList3.listIterator();
/* 3903 */             while (localListIterator3.hasNext()) {
/* 3904 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 3905 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3912 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3919 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 3920 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 3921 */             while (localListIterator4.hasNext()) {
/* 3922 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 3923 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 17) && (((BeatCompletedWME)localObject2).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3930 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3937 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 3938 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 3939 */             while (localListIterator5.hasNext()) {
/* 3940 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 3941 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 9) && (((BeatAbortWME)localObject3).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3948 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 3955 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 3956 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 3957 */             while (localListIterator6.hasNext()) {
/* 3958 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 3959 */               if ((localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3966 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 3971 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 3972 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 3986 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 3991 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_weighttest1_scope");
/* 3992 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 3993 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 3994 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 3995 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 3998 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 3999 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4000 */     while (localListIterator1.hasNext()) {
/* 4001 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 4002 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 4003 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 4014 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4019 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4024 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4031 */               List localList2 = DramaManager.lookupWME("DAWME");
/* 4032 */               ListIterator localListIterator2 = localList2.listIterator();
/* 4033 */               while (localListIterator2.hasNext()) {
/* 4034 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 4035 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4044 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 4049 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 4054 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 4059 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 4064 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4065 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4096 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 4101 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_weighttest2_scope");
/* 4102 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4103 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4104 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 4107 */     List localList = DramaManager.lookupWME("DAWME");
/* 4108 */     ListIterator localListIterator = localList.listIterator();
/* 4109 */     while (localListIterator.hasNext()) {
/* 4110 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 4111 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 4112 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 4123 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4128 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4133 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 4138 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 4143 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4144 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4161 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 4166 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_prioritytest1_scope");
/* 4167 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 4168 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 4169 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 4172 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 4173 */     ListIterator localListIterator = localList.listIterator();
/* 4174 */     while (localListIterator.hasNext()) {
/* 4175 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 4176 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 1) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 4191 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4196 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4201 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 4202 */             return true;
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
/* 4213 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 4218 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_prioritytest2_scope");
/* 4219 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4220 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4221 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 4222 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 4225 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 4226 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4227 */     while (localListIterator1.hasNext()) {
/* 4228 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 4229 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 4230 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 4241 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4246 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4253 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 4254 */             ListIterator localListIterator2 = localList2.listIterator();
/* 4255 */             while (localListIterator2.hasNext()) {
/* 4256 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 4257 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4266 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 4271 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 4276 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 4281 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 4286 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4287 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4315 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_GPA_T2ToT3_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 4320 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_GPA_T2ToT3_prioritytest3_scope");
/* 4321 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4322 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4323 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 4326 */     List localList = DramaManager.lookupWME("DAWME");
/* 4327 */     ListIterator localListIterator = localList.listIterator();
/* 4328 */     while (localListIterator.hasNext()) {
/* 4329 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 4330 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 4331 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 4342 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4347 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4352 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 4357 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4358 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 4372 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 4377 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_precondition1_scope");
/* 4378 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 4381 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 4382 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4383 */     while (localListIterator1.hasNext()) {
/* 4384 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 4385 */       if (localStoryStatusWME1.getAffinity() >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4392 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 4393 */         ListIterator localListIterator2 = localList2.listIterator();
/* 4394 */         while (localListIterator2.hasNext()) {
/* 4395 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 4396 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4403 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 4404 */             ListIterator localListIterator3 = localList3.listIterator();
/* 4405 */             while (localListIterator3.hasNext()) {
/* 4406 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 4407 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4414 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4421 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 4422 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 4423 */             while (localListIterator4.hasNext()) {
/* 4424 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 4425 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 17) && (((BeatCompletedWME)localObject2).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4432 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4439 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 4440 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 4441 */             while (localListIterator5.hasNext()) {
/* 4442 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 4443 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 9) && (((BeatAbortWME)localObject3).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4450 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4457 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 4458 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 4459 */             while (localListIterator6.hasNext()) {
/* 4460 */               localObject4 = (BeatAbortWME)localListIterator6.next();
/* 4461 */               if ((((BeatAbortWME)localObject4).getBeatID() >= 17) && (((BeatAbortWME)localObject4).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4468 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4475 */             Object localObject4 = DramaManager.lookupWME("StoryStatusWME");
/* 4476 */             ListIterator localListIterator7 = ((List)localObject4).listIterator();
/* 4477 */             while (localListIterator7.hasNext()) {
/* 4478 */               StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator7.next();
/* 4479 */               localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 4480 */               if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 4485 */                 localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 4486 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4505 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 4510 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_weighttest1_scope");
/* 4511 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4512 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4513 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 4514 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 4517 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 4518 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4519 */     while (localListIterator1.hasNext()) {
/* 4520 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 4521 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 4522 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 4533 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4538 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4543 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4550 */               List localList2 = DramaManager.lookupWME("DAWME");
/* 4551 */               ListIterator localListIterator2 = localList2.listIterator();
/* 4552 */               while (localListIterator2.hasNext()) {
/* 4553 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 4554 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4563 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 4568 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 4573 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 4578 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 4583 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4584 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4615 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 4620 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_weighttest2_scope");
/* 4621 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4622 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4623 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 4626 */     List localList = DramaManager.lookupWME("DAWME");
/* 4627 */     ListIterator localListIterator = localList.listIterator();
/* 4628 */     while (localListIterator.hasNext()) {
/* 4629 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 4630 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 4631 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 4642 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4647 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4652 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 4657 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 4662 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4663 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4680 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 4685 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_prioritytest1_scope");
/* 4686 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 4687 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 4688 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 4691 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 4692 */     ListIterator localListIterator = localList.listIterator();
/* 4693 */     while (localListIterator.hasNext()) {
/* 4694 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 4695 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 4710 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4715 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4720 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 4721 */             return true;
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
/* 4732 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 4737 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_prioritytest2_scope");
/* 4738 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4739 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4740 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 4741 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 4744 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 4745 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4746 */     while (localListIterator1.hasNext()) {
/* 4747 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 4748 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 4749 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 4760 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4765 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4772 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 4773 */             ListIterator localListIterator2 = localList2.listIterator();
/* 4774 */             while (localListIterator2.hasNext()) {
/* 4775 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 4776 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4785 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 4790 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 4795 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 4800 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 4805 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4806 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4834 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 4839 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2_prioritytest3_scope");
/* 4840 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 4841 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 4842 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 4845 */     List localList = DramaManager.lookupWME("DAWME");
/* 4846 */     ListIterator localListIterator = localList.listIterator();
/* 4847 */     while (localListIterator.hasNext()) {
/* 4848 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 4849 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 4850 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 4861 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4866 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 4871 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 4876 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 4877 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 4891 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 4896 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_precondition1_scope");
/* 4897 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 4900 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 4901 */     ListIterator localListIterator1 = localList1.listIterator();
/* 4902 */     while (localListIterator1.hasNext()) {
/* 4903 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 4904 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 4905 */       if (localStoryStatusWME.getAffinity() >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4912 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 4913 */         ListIterator localListIterator2 = localList2.listIterator();
/* 4914 */         while (localListIterator2.hasNext()) {
/* 4915 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 4916 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4923 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 4924 */             ListIterator localListIterator3 = localList3.listIterator();
/* 4925 */             while (localListIterator3.hasNext()) {
/* 4926 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 4927 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 9) && (((BeatCompletedWME)localObject1).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4934 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4941 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 4942 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 4943 */             while (localListIterator4.hasNext()) {
/* 4944 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 4945 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 17) && (((BeatCompletedWME)localObject2).getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4952 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4959 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 4960 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 4961 */             while (localListIterator5.hasNext()) {
/* 4962 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 4963 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 9) && (((BeatAbortWME)localObject3).getBeatID() <= 11))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4970 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 4977 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 4978 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 4979 */             while (localListIterator6.hasNext()) {
/* 4980 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 4981 */               if ((localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4988 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 4993 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 4994 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 5008 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 5013 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_weighttest1_scope");
/* 5014 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5015 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5016 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 5017 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 5020 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 5021 */     ListIterator localListIterator1 = localList1.listIterator();
/* 5022 */     while (localListIterator1.hasNext()) {
/* 5023 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 5024 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 5025 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 5036 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5041 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5046 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5053 */               List localList2 = DramaManager.lookupWME("DAWME");
/* 5054 */               ListIterator localListIterator2 = localList2.listIterator();
/* 5055 */               while (localListIterator2.hasNext()) {
/* 5056 */                 DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 5057 */                 if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5066 */                   if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 5071 */                     if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 5076 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 5081 */                         if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 5086 */                           localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5087 */                           return true;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5118 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_weighttest2(VariableScope paramVariableScope)
/*      */   {
/* 5123 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_weighttest2_scope");
/* 5124 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5125 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5126 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5129 */     List localList = DramaManager.lookupWME("DAWME");
/* 5130 */     ListIterator localListIterator = localList.listIterator();
/* 5131 */     while (localListIterator.hasNext()) {
/* 5132 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5133 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5134 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 5145 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5150 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5155 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5160 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 5165 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5166 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5183 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 5188 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_prioritytest1_scope");
/* 5189 */     localVariableScopeThrowsErrors.defineVariable("abortTimestamp", null, "long");
/* 5190 */     localVariableScopeThrowsErrors.defineVariable("abortBeatID", null, "int");
/* 5191 */     localVariableScopeThrowsErrors.defineVariable("abortReason", null, "int");
/*      */     
/*      */ 
/* 5194 */     List localList = DramaManager.lookupWME("BeatAbortWME");
/* 5195 */     ListIterator localListIterator = localList.listIterator();
/* 5196 */     while (localListIterator.hasNext()) {
/* 5197 */       BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator.next();
/* 5198 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l = localBeatAbortWME.getTimestamp())) && (localBeatAbortWME.getBeatID() >= 17) && (localBeatAbortWME.getBeatID() <= 18) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i = localBeatAbortWME.getBeatID())) && (localBeatAbortWME.getBeatAbortReason() == 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortReason")).i = localBeatAbortWME.getBeatAbortReason())))
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
/* 5213 */         if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("abortTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5218 */           if (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("abortBeatID")).i == ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5223 */             localVariableScopeThrowsErrors.getParentVariable("abortReason").value = localVariableScopeThrowsErrors.getVariable("abortReason").value;
/* 5224 */             return true;
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
/* 5235 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_prioritytest2(VariableScope paramVariableScope)
/*      */   {
/* 5240 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_prioritytest2_scope");
/* 5241 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5242 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5243 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/* 5244 */     localVariableScopeThrowsErrors.defineVariable("objectReference", null, "int");
/*      */     
/*      */ 
/* 5247 */     List localList1 = DramaManager.lookupWME("DAWME");
/* 5248 */     ListIterator localListIterator1 = localList1.listIterator();
/* 5249 */     while (localListIterator1.hasNext()) {
/* 5250 */       DAWME localDAWME1 = (DAWME)localListIterator1.next();
/* 5251 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME1;
/* 5252 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME1.getTimestamp())) && (localDAWME1.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME1.getId())) && (localDAWME1.getParam1() == 59))
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
/* 5263 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5268 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5275 */             List localList2 = DramaManager.lookupWME("DAWME");
/* 5276 */             ListIterator localListIterator2 = localList2.listIterator();
/* 5277 */             while (localListIterator2.hasNext()) {
/* 5278 */               DAWME localDAWME2 = (DAWME)localListIterator2.next();
/* 5279 */               if ((localDAWME2.getTimestamp() == ((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME2.getId())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i = localDAWME2.getParam1())))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5288 */                 if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 5293 */                   if (facade.util.BeatHelperFxns.isAASubtopic(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 5298 */                     if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 5303 */                       if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("subtopic")).i = ((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("objectReference")).i))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 5308 */                         localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5309 */                         return true;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5337 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _ArtistAdvertising_TPA_T2ToT3_prioritytest3(VariableScope paramVariableScope)
/*      */   {
/* 5342 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_ArtistAdvertising_TPA_T2ToT3_prioritytest3_scope");
/* 5343 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5344 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5345 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5348 */     List localList = DramaManager.lookupWME("DAWME");
/* 5349 */     ListIterator localListIterator = localList.listIterator();
/* 5350 */     while (localListIterator.hasNext()) {
/* 5351 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5352 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5353 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 59))
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
/* 5364 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5369 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5374 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5379 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5380 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 5394 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 5399 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_precondition1_scope");
/* 5400 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 5403 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 5404 */     ListIterator localListIterator1 = localList1.listIterator();
/* 5405 */     while (localListIterator1.hasNext()) {
/* 5406 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 5407 */       if (localStoryStatusWME1.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5414 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 5415 */         ListIterator localListIterator2 = localList2.listIterator();
/* 5416 */         while (localListIterator2.hasNext()) {
/* 5417 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 5418 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5425 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 5426 */             ListIterator localListIterator3 = localList3.listIterator();
/* 5427 */             while (localListIterator3.hasNext()) {
/* 5428 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 5429 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5436 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5443 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 5444 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 5445 */             while (localListIterator4.hasNext()) {
/* 5446 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 5447 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 21) && (((BeatCompletedWME)localObject2).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5454 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5461 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 5462 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 5463 */             while (localListIterator5.hasNext()) {
/* 5464 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 5465 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 14) && (((BeatAbortWME)localObject3).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5472 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5479 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 5480 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 5481 */             while (localListIterator6.hasNext()) {
/* 5482 */               localObject4 = (BeatAbortWME)localListIterator6.next();
/* 5483 */               if ((((BeatAbortWME)localObject4).getBeatID() >= 21) && (((BeatAbortWME)localObject4).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5490 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5497 */             Object localObject4 = DramaManager.lookupWME("StoryStatusWME");
/* 5498 */             ListIterator localListIterator7 = ((List)localObject4).listIterator();
/* 5499 */             while (localListIterator7.hasNext()) {
/* 5500 */               StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator7.next();
/* 5501 */               localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 5502 */               if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 5507 */                 localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 5508 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5527 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 5532 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_weighttest1_scope");
/* 5533 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5534 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5535 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5538 */     List localList = DramaManager.lookupWME("DAWME");
/* 5539 */     ListIterator localListIterator = localList.listIterator();
/* 5540 */     while (localListIterator.hasNext()) {
/* 5541 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5542 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5543 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 5554 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5559 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5564 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5569 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 5574 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5575 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5592 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 5597 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2_prioritytest1_scope");
/* 5598 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5599 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5600 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5603 */     List localList = DramaManager.lookupWME("DAWME");
/* 5604 */     ListIterator localListIterator = localList.listIterator();
/* 5605 */     while (localListIterator.hasNext()) {
/* 5606 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5607 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5608 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 5619 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5624 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5629 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5634 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5635 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 5649 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2ToT3_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 5654 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_precondition1_scope");
/* 5655 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 5658 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 5659 */     ListIterator localListIterator1 = localList1.listIterator();
/* 5660 */     while (localListIterator1.hasNext()) {
/* 5661 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 5662 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 5663 */       if (localStoryStatusWME.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5670 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 5671 */         ListIterator localListIterator2 = localList2.listIterator();
/* 5672 */         while (localListIterator2.hasNext()) {
/* 5673 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 5674 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5681 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 5682 */             ListIterator localListIterator3 = localList3.listIterator();
/* 5683 */             while (localListIterator3.hasNext()) {
/* 5684 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 5685 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5692 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5699 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 5700 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 5701 */             while (localListIterator4.hasNext()) {
/* 5702 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 5703 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 21) && (((BeatCompletedWME)localObject2).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5710 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5717 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 5718 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 5719 */             while (localListIterator5.hasNext()) {
/* 5720 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 5721 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 14) && (((BeatAbortWME)localObject3).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5728 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5735 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 5736 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 5737 */             while (localListIterator6.hasNext()) {
/* 5738 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 5739 */               if ((localBeatAbortWME.getBeatID() >= 21) && (localBeatAbortWME.getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5746 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 5751 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 5752 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 5766 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2ToT3_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 5771 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_weighttest1_scope");
/* 5772 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5773 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5774 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5777 */     List localList = DramaManager.lookupWME("DAWME");
/* 5778 */     ListIterator localListIterator = localList.listIterator();
/* 5779 */     while (localListIterator.hasNext()) {
/* 5780 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5781 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5782 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 5793 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5798 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5803 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5808 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 5813 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5814 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5831 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_GPA_T2ToT3_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 5836 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_GPA_T2ToT3_prioritytest1_scope");
/* 5837 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 5838 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 5839 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 5842 */     List localList = DramaManager.lookupWME("DAWME");
/* 5843 */     ListIterator localListIterator = localList.listIterator();
/* 5844 */     while (localListIterator.hasNext()) {
/* 5845 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 5846 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 5847 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 5858 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 5863 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 5868 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 5873 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 5874 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 5888 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 5893 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_precondition1_scope");
/* 5894 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 5897 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 5898 */     ListIterator localListIterator1 = localList1.listIterator();
/* 5899 */     while (localListIterator1.hasNext()) {
/* 5900 */       StoryStatusWME localStoryStatusWME1 = (StoryStatusWME)localListIterator1.next();
/* 5901 */       if (localStoryStatusWME1.getAffinity() >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5908 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 5909 */         ListIterator localListIterator2 = localList2.listIterator();
/* 5910 */         while (localListIterator2.hasNext()) {
/* 5911 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 5912 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5919 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 5920 */             ListIterator localListIterator3 = localList3.listIterator();
/* 5921 */             while (localListIterator3.hasNext()) {
/* 5922 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 5923 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5930 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5937 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 5938 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 5939 */             while (localListIterator4.hasNext()) {
/* 5940 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 5941 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 21) && (((BeatCompletedWME)localObject2).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5948 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5955 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 5956 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 5957 */             while (localListIterator5.hasNext()) {
/* 5958 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 5959 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 14) && (((BeatAbortWME)localObject3).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5966 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5973 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 5974 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 5975 */             while (localListIterator6.hasNext()) {
/* 5976 */               localObject4 = (BeatAbortWME)localListIterator6.next();
/* 5977 */               if ((((BeatAbortWME)localObject4).getBeatID() >= 21) && (((BeatAbortWME)localObject4).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5984 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 5991 */             Object localObject4 = DramaManager.lookupWME("StoryStatusWME");
/* 5992 */             ListIterator localListIterator7 = ((List)localObject4).listIterator();
/* 5993 */             while (localListIterator7.hasNext()) {
/* 5994 */               StoryStatusWME localStoryStatusWME2 = (StoryStatusWME)localListIterator7.next();
/* 5995 */               localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME2;
/* 5996 */               if (localStoryStatusWME2.getStoryTopicBeatCount() < 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 6001 */                 localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 6002 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6021 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 6026 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_weighttest1_scope");
/* 6027 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6028 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6029 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6032 */     List localList = DramaManager.lookupWME("DAWME");
/* 6033 */     ListIterator localListIterator = localList.listIterator();
/* 6034 */     while (localListIterator.hasNext()) {
/* 6035 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6036 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6037 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 6048 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6053 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6058 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6063 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 6068 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6069 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6086 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 6091 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2_prioritytest1_scope");
/* 6092 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6093 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6094 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6097 */     List localList = DramaManager.lookupWME("DAWME");
/* 6098 */     ListIterator localListIterator = localList.listIterator();
/* 6099 */     while (localListIterator.hasNext()) {
/* 6100 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6101 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6102 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 6113 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6118 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6123 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6128 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6129 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 6143 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2ToT3_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6148 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_precondition1_scope");
/* 6149 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 6152 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 6153 */     ListIterator localListIterator1 = localList1.listIterator();
/* 6154 */     while (localListIterator1.hasNext()) {
/* 6155 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 6156 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 6157 */       if (localStoryStatusWME.getAffinity() >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6164 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 6165 */         ListIterator localListIterator2 = localList2.listIterator();
/* 6166 */         while (localListIterator2.hasNext()) {
/* 6167 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 6168 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6175 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 6176 */             ListIterator localListIterator3 = localList3.listIterator();
/* 6177 */             while (localListIterator3.hasNext()) {
/* 6178 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 6179 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 14) && (((BeatCompletedWME)localObject1).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6186 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6193 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 6194 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 6195 */             while (localListIterator4.hasNext()) {
/* 6196 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 6197 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 21) && (((BeatCompletedWME)localObject2).getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6204 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6211 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 6212 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 6213 */             while (localListIterator5.hasNext()) {
/* 6214 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 6215 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 14) && (((BeatAbortWME)localObject3).getBeatID() <= 16))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6222 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6229 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 6230 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 6231 */             while (localListIterator6.hasNext()) {
/* 6232 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 6233 */               if ((localBeatAbortWME.getBeatID() >= 21) && (localBeatAbortWME.getBeatID() <= 22))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6240 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 6245 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 6246 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 6260 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2ToT3_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 6265 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_weighttest1_scope");
/* 6266 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6267 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6268 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6271 */     List localList = DramaManager.lookupWME("DAWME");
/* 6272 */     ListIterator localListIterator = localList.listIterator();
/* 6273 */     while (localListIterator.hasNext()) {
/* 6274 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6275 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6276 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 6287 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6292 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6297 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6302 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 6307 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6308 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6325 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RockyMarriage_TPA_T2ToT3_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 6330 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RockyMarriage_TPA_T2ToT3_prioritytest1_scope");
/* 6331 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6332 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6333 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6336 */     List localList = DramaManager.lookupWME("DAWME");
/* 6337 */     ListIterator localListIterator = localList.listIterator();
/* 6338 */     while (localListIterator.hasNext()) {
/* 6339 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6340 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6341 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 61))
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
/* 6352 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6357 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6362 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6367 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6368 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 6382 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_TPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6387 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_precondition1_scope");
/* 6388 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 6391 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 6392 */     ListIterator localListIterator1 = localList1.listIterator();
/* 6393 */     while (localListIterator1.hasNext()) {
/* 6394 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 6395 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 6396 */       if (localStoryStatusWME.getAffinity() >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6403 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 6404 */         ListIterator localListIterator2 = localList2.listIterator();
/* 6405 */         while (localListIterator2.hasNext()) {
/* 6406 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 6407 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6414 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 6415 */             ListIterator localListIterator3 = localList3.listIterator();
/* 6416 */             while (localListIterator3.hasNext()) {
/* 6417 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 6418 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 12) && (((BeatCompletedWME)localObject1).getBeatID() <= 13))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6425 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6432 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 6433 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 6434 */             while (localListIterator4.hasNext()) {
/* 6435 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 6436 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 19) && (((BeatCompletedWME)localObject2).getBeatID() <= 20))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6443 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6450 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 6451 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 6452 */             while (localListIterator5.hasNext()) {
/* 6453 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 6454 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 12) && (((BeatAbortWME)localObject3).getBeatID() <= 13))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6461 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6468 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 6469 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 6470 */             while (localListIterator6.hasNext()) {
/* 6471 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 6472 */               if ((localBeatAbortWME.getBeatID() >= 19) && (localBeatAbortWME.getBeatID() <= 20))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6479 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 6484 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 6485 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 6499 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_TPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 6504 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_weighttest1_scope");
/* 6505 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6506 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6507 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6510 */     List localList = DramaManager.lookupWME("DAWME");
/* 6511 */     ListIterator localListIterator = localList.listIterator();
/* 6512 */     while (localListIterator.hasNext()) {
/* 6513 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6514 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6515 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 6526 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6531 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6536 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6541 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 6546 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6547 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6564 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_TPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 6569 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_TPA_T2_prioritytest1_scope");
/* 6570 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6571 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6572 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6575 */     List localList = DramaManager.lookupWME("DAWME");
/* 6576 */     ListIterator localListIterator = localList.listIterator();
/* 6577 */     while (localListIterator.hasNext()) {
/* 6578 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6579 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6580 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 6591 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6596 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6601 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6606 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6607 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 6621 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6626 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_precondition1_scope");
/* 6627 */     localVariableScopeThrowsErrors.defineVariable("storyStatusWME", null, "StoryStatusWME");
/*      */     
/*      */ 
/* 6630 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 6631 */     ListIterator localListIterator1 = localList1.listIterator();
/* 6632 */     while (localListIterator1.hasNext()) {
/* 6633 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 6634 */       localVariableScopeThrowsErrors.getVariable("storyStatusWME").value = localStoryStatusWME;
/* 6635 */       if (localStoryStatusWME.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6642 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 6643 */         ListIterator localListIterator2 = localList2.listIterator();
/* 6644 */         while (localListIterator2.hasNext()) {
/* 6645 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 6646 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6653 */             List localList3 = DramaManager.lookupWME("BeatCompletedWME");
/* 6654 */             ListIterator localListIterator3 = localList3.listIterator();
/* 6655 */             while (localListIterator3.hasNext()) {
/* 6656 */               localObject1 = (BeatCompletedWME)localListIterator3.next();
/* 6657 */               if ((((BeatCompletedWME)localObject1).getBeatID() >= 12) && (((BeatCompletedWME)localObject1).getBeatID() <= 13))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6664 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6671 */             Object localObject1 = DramaManager.lookupWME("BeatCompletedWME");
/* 6672 */             ListIterator localListIterator4 = ((List)localObject1).listIterator();
/* 6673 */             while (localListIterator4.hasNext()) {
/* 6674 */               localObject2 = (BeatCompletedWME)localListIterator4.next();
/* 6675 */               if ((((BeatCompletedWME)localObject2).getBeatID() >= 19) && (((BeatCompletedWME)localObject2).getBeatID() <= 20))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6682 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6689 */             Object localObject2 = DramaManager.lookupWME("BeatAbortWME");
/* 6690 */             ListIterator localListIterator5 = ((List)localObject2).listIterator();
/* 6691 */             while (localListIterator5.hasNext()) {
/* 6692 */               localObject3 = (BeatAbortWME)localListIterator5.next();
/* 6693 */               if ((((BeatAbortWME)localObject3).getBeatID() >= 12) && (((BeatAbortWME)localObject3).getBeatID() <= 13))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6700 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 6707 */             Object localObject3 = DramaManager.lookupWME("BeatAbortWME");
/* 6708 */             ListIterator localListIterator6 = ((List)localObject3).listIterator();
/* 6709 */             while (localListIterator6.hasNext()) {
/* 6710 */               BeatAbortWME localBeatAbortWME = (BeatAbortWME)localListIterator6.next();
/* 6711 */               if ((localBeatAbortWME.getBeatID() >= 19) && (localBeatAbortWME.getBeatID() <= 20))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6718 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 6723 */             localVariableScopeThrowsErrors.getParentVariable("storyStatusWME").value = localVariableScopeThrowsErrors.getVariable("storyStatusWME").value;
/* 6724 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 6738 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T2_weighttest1(VariableScope paramVariableScope)
/*      */   {
/* 6743 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_weighttest1_scope");
/* 6744 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6745 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6746 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6749 */     List localList = DramaManager.lookupWME("DAWME");
/* 6750 */     ListIterator localListIterator = localList.listIterator();
/* 6751 */     while (localListIterator.hasNext()) {
/* 6752 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6753 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6754 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 6765 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6770 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l <= ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6775 */             if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("beatBeforeLastStart").value).getTimestamp())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6780 */               if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 6785 */                 localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6786 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6803 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Facade_GPA_T2_prioritytest1(VariableScope paramVariableScope)
/*      */   {
/* 6808 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Facade_GPA_T2_prioritytest1_scope");
/* 6809 */     localVariableScopeThrowsErrors.defineVariable("daTimestamp", null, "long");
/* 6810 */     localVariableScopeThrowsErrors.defineVariable("daType", null, "int");
/* 6811 */     localVariableScopeThrowsErrors.defineVariable("unhandledAct", null, "DAWME");
/*      */     
/*      */ 
/* 6814 */     List localList = DramaManager.lookupWME("DAWME");
/* 6815 */     ListIterator localListIterator = localList.listIterator();
/* 6816 */     while (localListIterator.hasNext()) {
/* 6817 */       DAWME localDAWME = (DAWME)localListIterator.next();
/* 6818 */       localVariableScopeThrowsErrors.getVariable("unhandledAct").value = localDAWME;
/* 6819 */       if ((DramaManager.constantTrue(((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l = localDAWME.getTimestamp())) && (localDAWME.getHandledStatus() != 2) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i = localDAWME.getId())) && (localDAWME.getParam1() == 60))
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
/* 6830 */         if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 10) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("daType")).i == 35))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 6835 */           if (((VariableScope.LongValue)localVariableScopeThrowsErrors.getValue("daTimestamp")).l > ((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getTimestamp())
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 6840 */             if (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("txnInType")).i = 1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 6845 */               localVariableScopeThrowsErrors.getParentVariable("unhandledAct").value = localVariableScopeThrowsErrors.getVariable("unhandledAct").value;
/* 6846 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 6860 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TxnT2ToT3_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6865 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TxnT2ToT3_precondition1_scope");
/*      */     
/*      */ 
/* 6868 */     List localList = DramaManager.lookupWME("TensionStoryValueWME");
/* 6869 */     ListIterator localListIterator = localList.listIterator();
/* 6870 */     while (localListIterator.hasNext()) {
/* 6871 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator.next();
/* 6872 */       if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 6877 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 6882 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RomPrp_GPA_T2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6887 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RomPrp_GPA_T2_precondition1_scope");
/*      */     
/*      */ 
/* 6890 */     List localList1 = DramaManager.lookupWME("StoryStatusWME");
/* 6891 */     ListIterator localListIterator1 = localList1.listIterator();
/* 6892 */     while (localListIterator1.hasNext()) {
/* 6893 */       StoryStatusWME localStoryStatusWME = (StoryStatusWME)localListIterator1.next();
/* 6894 */       if (localStoryStatusWME.getAffinity() <= -1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6901 */         List localList2 = DramaManager.lookupWME("TensionStoryValueWME");
/* 6902 */         ListIterator localListIterator2 = localList2.listIterator();
/* 6903 */         while (localListIterator2.hasNext()) {
/* 6904 */           dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator2.next();
/* 6905 */           if (localTensionStoryValueWME.getValue() == 2.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6912 */             java.util.LinkedList localLinkedList = wm.WorkingMemory.lookupWME("BeatMemory", "SameAffinityNBeatsWME");
/* 6913 */             ListIterator localListIterator3 = localLinkedList.listIterator();
/* 6914 */             while (localListIterator3.hasNext()) {
/* 6915 */               facade.characters.wmedef.SameAffinityNBeatsWME localSameAffinityNBeatsWME = (facade.characters.wmedef.SameAffinityNBeatsWME)localListIterator3.next();
/* 6916 */               if ((localSameAffinityNBeatsWME.getBeatCount() == 2) && (localSameAffinityNBeatsWME.getTargetAffinity() == -1))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6923 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/* 6938 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _CrisisP1_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6943 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_CrisisP1_precondition1_scope");
/*      */     
/*      */ 
/* 6946 */     List localList = DramaManager.lookupWME("TensionStoryValueWME");
/* 6947 */     ListIterator localListIterator = localList.listIterator();
/* 6948 */     while (localListIterator.hasNext()) {
/* 6949 */       dramaman.runtime.TensionStoryValueWME localTensionStoryValueWME = (dramaman.runtime.TensionStoryValueWME)localListIterator.next();
/* 6950 */       if (localTensionStoryValueWME.getValue() == 3)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 6955 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 6960 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _CrisisToTherapyGameGlue_P2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6965 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_CrisisToTherapyGameGlue_P2_precondition1_scope");
/* 6966 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value != null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 6971 */       if (((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID() == 31)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 6976 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 6982 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _TherapyGame_P2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 6987 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_TherapyGame_P2_precondition1_scope");
/* 6988 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value != null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 6993 */       if (((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID() == 32)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 6998 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 7004 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _RevelationBuildup_P2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7009 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_RevelationBuildup_P2_precondition1_scope");
/* 7010 */     if (localVariableScopeThrowsErrors.getVariable("lastBeatStart").value != null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/* 7015 */       if (((BeatStartWME)localVariableScopeThrowsErrors.getVariable("lastBeatStart").value).getBeatID() == 33)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 7020 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 7026 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _Revelations_P2_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7031 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_Revelations_P2_precondition1_scope");
/* 7032 */     localVariableScopeThrowsErrors.defineVariable("rev1Focus", null, "int");
/* 7033 */     localVariableScopeThrowsErrors.defineVariable("rev2Focus", null, "int");
/* 7034 */     localVariableScopeThrowsErrors.defineVariable("rev3Focus", null, "int");
/*      */     
/*      */ 
/* 7037 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7038 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7039 */     while (localListIterator1.hasNext()) {
/* 7040 */       localObject = (BeatCompletedWME)localListIterator1.next();
/* 7041 */       if ((((BeatCompletedWME)localObject).getBeatID() >= 36) && (((BeatCompletedWME)localObject).getBeatID() <= 40))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7048 */         return false;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 7055 */     Object localObject = DramaManager.lookupWME("BeatCompletedWME");
/* 7056 */     ListIterator localListIterator2 = ((List)localObject).listIterator();
/* 7057 */     while (localListIterator2.hasNext()) {
/* 7058 */       BeatCompletedWME localBeatCompletedWME = (BeatCompletedWME)localListIterator2.next();
/* 7059 */       if (localBeatCompletedWME.getBeatID() == 34)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7066 */         List localList2 = DramaManager.lookupWME("BeatRevelationsP2WME");
/* 7067 */         ListIterator localListIterator3 = localList2.listIterator();
/* 7068 */         while (localListIterator3.hasNext()) {
/* 7069 */           facade.characters.wmedef.BeatRevelationsP2WME localBeatRevelationsP2WME = (facade.characters.wmedef.BeatRevelationsP2WME)localListIterator3.next();
/* 7070 */           if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i = localBeatRevelationsP2WME.getRev1CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i = localBeatRevelationsP2WME.getRev2CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i = localBeatRevelationsP2WME.getRev3CharFocus())))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7079 */             if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i != -1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i != -1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i != -1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 7084 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/* 7098 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _EndingNoRevelations_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7103 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingNoRevelations_precondition1_scope");
/*      */     
/*      */ 
/* 7106 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7107 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7108 */     while (localListIterator1.hasNext()) {
/* 7109 */       localObject = (BeatCompletedWME)localListIterator1.next();
/* 7110 */       if ((((BeatCompletedWME)localObject).getBeatID() >= 36) && (((BeatCompletedWME)localObject).getBeatID() <= 40))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7117 */         return false;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 7124 */     Object localObject = DramaManager.lookupWME("BeatCompletedWME");
/* 7125 */     ListIterator localListIterator2 = ((List)localObject).listIterator();
/* 7126 */     while (localListIterator2.hasNext()) {
/* 7127 */       BeatCompletedWME localBeatCompletedWME = (BeatCompletedWME)localListIterator2.next();
/* 7128 */       if (localBeatCompletedWME.getBeatID() == 34)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7135 */         List localList2 = DramaManager.lookupWME("BeatRevelationsP2WME");
/* 7136 */         ListIterator localListIterator3 = localList2.listIterator();
/* 7137 */         while (localListIterator3.hasNext()) {
/* 7138 */           facade.characters.wmedef.BeatRevelationsP2WME localBeatRevelationsP2WME = (facade.characters.wmedef.BeatRevelationsP2WME)localListIterator3.next();
/* 7139 */           if ((localBeatRevelationsP2WME.getRev1CharFocus() == -1) && (localBeatRevelationsP2WME.getRev2CharFocus() == -1) && (localBeatRevelationsP2WME.getRev3CharFocus() == -1))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7148 */             return true;
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
/* 7159 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _EndingSelfRevelationOnly_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7164 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingSelfRevelationOnly_precondition1_scope");
/* 7165 */     localVariableScopeThrowsErrors.defineVariable("rev1Focus", null, "int");
/* 7166 */     localVariableScopeThrowsErrors.defineVariable("rev2Focus", null, "int");
/* 7167 */     localVariableScopeThrowsErrors.defineVariable("rev3Focus", null, "int");
/*      */     
/*      */ 
/* 7170 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7171 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7172 */     while (localListIterator1.hasNext()) {
/* 7173 */       BeatCompletedWME localBeatCompletedWME = (BeatCompletedWME)localListIterator1.next();
/* 7174 */       if (localBeatCompletedWME.getBeatID() == 35)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7181 */         List localList2 = DramaManager.lookupWME("BeatCompletedWME");
/* 7182 */         ListIterator localListIterator2 = localList2.listIterator();
/* 7183 */         while (localListIterator2.hasNext()) {
/* 7184 */           localObject = (BeatCompletedWME)localListIterator2.next();
/* 7185 */           if ((((BeatCompletedWME)localObject).getBeatID() >= 36) && (((BeatCompletedWME)localObject).getBeatID() <= 40))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7192 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 7199 */         Object localObject = DramaManager.lookupWME("BeatRevelationsP2WME");
/* 7200 */         ListIterator localListIterator3 = ((List)localObject).listIterator();
/* 7201 */         while (localListIterator3.hasNext()) {
/* 7202 */           facade.characters.wmedef.BeatRevelationsP2WME localBeatRevelationsP2WME = (facade.characters.wmedef.BeatRevelationsP2WME)localListIterator3.next();
/* 7203 */           if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i = localBeatRevelationsP2WME.getRev1CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i = localBeatRevelationsP2WME.getRev2CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i = localBeatRevelationsP2WME.getRev3CharFocus())))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7212 */             if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 0) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 1) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 0))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 7217 */               if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i != 2) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i != 2) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i != 2))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 7222 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7239 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _EndingRelationshipRevelationOnly_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7244 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingRelationshipRevelationOnly_precondition1_scope");
/* 7245 */     localVariableScopeThrowsErrors.defineVariable("rev1Focus", null, "int");
/* 7246 */     localVariableScopeThrowsErrors.defineVariable("rev2Focus", null, "int");
/* 7247 */     localVariableScopeThrowsErrors.defineVariable("rev3Focus", null, "int");
/*      */     
/*      */ 
/* 7250 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7251 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7252 */     while (localListIterator1.hasNext()) {
/* 7253 */       BeatCompletedWME localBeatCompletedWME = (BeatCompletedWME)localListIterator1.next();
/* 7254 */       if (localBeatCompletedWME.getBeatID() == 35)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7261 */         List localList2 = DramaManager.lookupWME("BeatCompletedWME");
/* 7262 */         ListIterator localListIterator2 = localList2.listIterator();
/* 7263 */         while (localListIterator2.hasNext()) {
/* 7264 */           localObject = (BeatCompletedWME)localListIterator2.next();
/* 7265 */           if ((((BeatCompletedWME)localObject).getBeatID() >= 36) && (((BeatCompletedWME)localObject).getBeatID() <= 40))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7272 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 7279 */         Object localObject = DramaManager.lookupWME("BeatRevelationsP2WME");
/* 7280 */         ListIterator localListIterator3 = ((List)localObject).listIterator();
/* 7281 */         while (localListIterator3.hasNext()) {
/* 7282 */           facade.characters.wmedef.BeatRevelationsP2WME localBeatRevelationsP2WME = (facade.characters.wmedef.BeatRevelationsP2WME)localListIterator3.next();
/* 7283 */           if ((DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i = localBeatRevelationsP2WME.getRev1CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i = localBeatRevelationsP2WME.getRev2CharFocus())) && (DramaManager.constantTrue(((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i = localBeatRevelationsP2WME.getRev3CharFocus())))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7292 */             if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i == 2) || (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i == 2))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 7297 */               if ((((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i != 1) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev1Focus")).i != 0) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i != 1) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev2Focus")).i != 0) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i != 1) && (((VariableScope.IntValue)localVariableScopeThrowsErrors.getValue("rev3Focus")).i != 0))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 7302 */                 return true;
/*      */               }
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7319 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _EndingSelfAndRelationshipNotGTR_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7324 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingSelfAndRelationshipNotGTR_precondition1_scope");
/*      */     
/*      */ 
/* 7327 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7328 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7329 */     while (localListIterator1.hasNext()) {
/* 7330 */       BeatCompletedWME localBeatCompletedWME1 = (BeatCompletedWME)localListIterator1.next();
/* 7331 */       if (localBeatCompletedWME1.getBeatID() == 35)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7338 */         List localList2 = DramaManager.lookupWME("BeatCompletedWME");
/* 7339 */         ListIterator localListIterator2 = localList2.listIterator();
/* 7340 */         while (localListIterator2.hasNext()) {
/* 7341 */           BeatCompletedWME localBeatCompletedWME2 = (BeatCompletedWME)localListIterator2.next();
/* 7342 */           if ((localBeatCompletedWME2.getBeatID() >= 36) && (localBeatCompletedWME2.getBeatID() <= 40))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7349 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/* 7354 */         if (((java.util.LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).size() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 7359 */           if (((((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("tripRev")).b) && (((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("relationshipRev")).b)) || ((((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("graceRev")).b) && (((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("relationshipRev")).b)))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 7364 */             if ((!((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("tripRev")).b) || (!((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("graceRev")).b))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 7369 */               return true;
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/* 7384 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean _EndingGTR_precondition1(VariableScope paramVariableScope)
/*      */   {
/* 7389 */     VariableScopeThrowsErrors localVariableScopeThrowsErrors = new VariableScopeThrowsErrors(paramVariableScope, "_EndingGTR_precondition1_scope");
/*      */     
/*      */ 
/* 7392 */     List localList1 = DramaManager.lookupWME("BeatCompletedWME");
/* 7393 */     ListIterator localListIterator1 = localList1.listIterator();
/* 7394 */     while (localListIterator1.hasNext()) {
/* 7395 */       BeatCompletedWME localBeatCompletedWME1 = (BeatCompletedWME)localListIterator1.next();
/* 7396 */       if (localBeatCompletedWME1.getBeatID() == 35)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7403 */         List localList2 = DramaManager.lookupWME("BeatCompletedWME");
/* 7404 */         ListIterator localListIterator2 = localList2.listIterator();
/* 7405 */         while (localListIterator2.hasNext()) {
/* 7406 */           BeatCompletedWME localBeatCompletedWME2 = (BeatCompletedWME)localListIterator2.next();
/* 7407 */           if ((localBeatCompletedWME2.getBeatID() >= 36) && (localBeatCompletedWME2.getBeatID() <= 40))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7414 */             return false;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/* 7419 */         if (((java.util.LinkedList)localVariableScopeThrowsErrors.getVariable("wmeList").value).size() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 7424 */           if ((((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("tripRev")).b) && (((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("graceRev")).b) && (((scope.VariableScope.BooleanValue)localVariableScopeThrowsErrors.getValue("relationshipRev")).b))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 7429 */             return true;
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
/*      */ 
/* 7441 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\beats\BeatTests.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */