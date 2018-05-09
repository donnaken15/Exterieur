/*      */ package facade.characters.trip.java;
/*      */ 
/*      */ import abl.runtime.GoalStepWME;
/*      */ import dramaman.runtime.StoryStatusWME;
/*      */ import facade.characters.wmedef.BeatFlagWME;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import wm.WorkingMemory;
/*      */ 
/*      */ public class Trip_ContextConditions implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, facade.util.PoseScripts, facade.util.GestureBodyPart, facade.util.BodyResource, facade.util.BeatStatus, facade.util.BeatConstants, facade.util.ReactionID, facade.util.ReactionConstants, facade.util.DAType, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.PlayerGestureID, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, facade.util.BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*      */ {
/*      */   public static boolean contextCondition0(int paramInt, Object[] paramArrayOfObject, abl.runtime.BehavingEntity paramBehavingEntity)
/*      */   {
/*      */     Object localObject1;
/*      */     ListIterator localListIterator1;
/*      */     Object localObject2;
/*      */     Object localObject3;
/*      */     Object localObject4;
/*      */     Object localObject5;
/*      */     ListIterator localListIterator2;
/*      */     Object localObject6;
/*   22 */     switch (paramInt)
/*      */     {
/*      */ 
/*      */ 
/*      */     case 5: 
/*   27 */       localObject1 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*   28 */       localListIterator1 = ((List)localObject1).listIterator();
/*   29 */       while (localListIterator1.hasNext()) {
/*   30 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/*   31 */         if (((facade.characters.wmedef.BeatStatusWME)localObject2).getStatus() != 6)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   36 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*   42 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 28: 
/*   48 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*   49 */       localListIterator1 = ((List)localObject1).listIterator();
/*   50 */       while (localListIterator1.hasNext()) {
/*   51 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*   52 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[2]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   57 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*   63 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 29: 
/*   69 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*   70 */       localListIterator1 = ((List)localObject1).listIterator();
/*   71 */       while (localListIterator1.hasNext()) {
/*   72 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*   73 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[3]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   80 */           localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", (String)paramArrayOfObject[2]);
/*   81 */           localObject4 = ((List)localObject3).listIterator();
/*   82 */           while (((ListIterator)localObject4).hasNext()) {
/*   83 */             localObject5 = (GoalStepWME)((ListIterator)localObject4).next();
/*   84 */             if ((((GoalStepWME)localObject5).getSignature().equals((String)paramArrayOfObject[2])) && (((GoalStepWME)localObject5).getIsExecuting()))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   91 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  102 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 103: 
/*  108 */       localObject1 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*  109 */       localListIterator1 = ((List)localObject1).listIterator();
/*  110 */       while (localListIterator1.hasNext()) {
/*  111 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/*  112 */         if (!((facade.characters.wmedef.BeatStatusWME)localObject2).getCommitPointReached())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  117 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  123 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 169: 
/*  129 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  130 */       localListIterator1 = ((List)localObject1).listIterator();
/*  131 */       while (localListIterator1.hasNext()) {
/*  132 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  133 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  140 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  141 */           localObject4 = ((List)localObject3).listIterator();
/*  142 */           while (((ListIterator)localObject4).hasNext()) {
/*  143 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  144 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  149 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  154 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  161 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 729: 
/*  167 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  168 */       localListIterator1 = ((List)localObject1).listIterator();
/*  169 */       while (localListIterator1.hasNext()) {
/*  170 */         localObject2 = (BeatFlagWME)localListIterator1.next();
/*  171 */         if (((BeatFlagWME)localObject2).getSVal().equals("player hung up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  176 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  183 */       localObject2 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  184 */       localObject3 = ((List)localObject2).listIterator();
/*  185 */       while (((ListIterator)localObject3).hasNext()) {
/*  186 */         localObject4 = (BeatFlagWME)((ListIterator)localObject3).next();
/*  187 */         if (((BeatFlagWME)localObject4).getSVal().equals("phone call ended"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  192 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  197 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 750: 
/*  205 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  206 */       localListIterator1 = ((List)localObject1).listIterator();
/*  207 */       while (localListIterator1.hasNext()) {
/*  208 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  209 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  214 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  220 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 840: 
/*  226 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  227 */       localListIterator1 = ((List)localObject1).listIterator();
/*  228 */       while (localListIterator1.hasNext()) {
/*  229 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  230 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  235 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  241 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 858: 
/*  247 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  248 */       localListIterator1 = ((List)localObject1).listIterator();
/*  249 */       while (localListIterator1.hasNext()) {
/*  250 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  251 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  256 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  261 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 859: 
/*  268 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  269 */       localListIterator1 = ((List)localObject1).listIterator();
/*  270 */       while (localListIterator1.hasNext()) {
/*  271 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  272 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  277 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  282 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 860: 
/*  289 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  290 */       localListIterator1 = ((List)localObject1).listIterator();
/*  291 */       while (localListIterator1.hasNext()) {
/*  292 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  293 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  298 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  303 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1532: 
/*  310 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  311 */       localListIterator1 = ((List)localObject1).listIterator();
/*  312 */       while (localListIterator1.hasNext()) {
/*  313 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  314 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  319 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  324 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1535: 
/*  331 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  332 */       localListIterator1 = ((List)localObject1).listIterator();
/*  333 */       while (localListIterator1.hasNext()) {
/*  334 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  335 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  340 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  347 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  348 */       localObject3 = ((List)localObject2).listIterator();
/*  349 */       while (((ListIterator)localObject3).hasNext()) {
/*  350 */         localObject4 = (GoalStepWME)((ListIterator)localObject3).next();
/*  351 */         if (((GoalStepWME)localObject4).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  356 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  361 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1681: 
/*  369 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  370 */       localListIterator1 = ((List)localObject1).listIterator();
/*  371 */       while (localListIterator1.hasNext()) {
/*  372 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  373 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  378 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  383 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1684: 
/*  390 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  391 */       localListIterator1 = ((List)localObject1).listIterator();
/*  392 */       while (localListIterator1.hasNext()) {
/*  393 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  394 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  399 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  406 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  407 */       localObject3 = ((List)localObject2).listIterator();
/*  408 */       while (((ListIterator)localObject3).hasNext()) {
/*  409 */         localObject4 = (GoalStepWME)((ListIterator)localObject3).next();
/*  410 */         if (((GoalStepWME)localObject4).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  415 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  420 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1823: 
/*  428 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  429 */       localListIterator1 = ((List)localObject1).listIterator();
/*  430 */       while (localListIterator1.hasNext()) {
/*  431 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  432 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  437 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  442 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1826: 
/*  449 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  450 */       localListIterator1 = ((List)localObject1).listIterator();
/*  451 */       while (localListIterator1.hasNext()) {
/*  452 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  453 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  458 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  465 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  466 */       localObject3 = ((List)localObject2).listIterator();
/*  467 */       while (((ListIterator)localObject3).hasNext()) {
/*  468 */         localObject4 = (GoalStepWME)((ListIterator)localObject3).next();
/*  469 */         if (((GoalStepWME)localObject4).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  474 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  479 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3009: 
/*  487 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  488 */       localListIterator1 = ((List)localObject1).listIterator();
/*  489 */       while (localListIterator1.hasNext()) {
/*  490 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  491 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  496 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  501 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3012: 
/*  508 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  509 */       localListIterator1 = ((List)localObject1).listIterator();
/*  510 */       while (localListIterator1.hasNext()) {
/*  511 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  512 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  517 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  524 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  525 */       localObject3 = ((List)localObject2).listIterator();
/*  526 */       while (((ListIterator)localObject3).hasNext()) {
/*  527 */         localObject4 = (GoalStepWME)((ListIterator)localObject3).next();
/*  528 */         if (((GoalStepWME)localObject4).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  533 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  538 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3134: 
/*  546 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  547 */       localListIterator1 = ((List)localObject1).listIterator();
/*  548 */       while (localListIterator1.hasNext()) {
/*  549 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  550 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  555 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  560 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3137: 
/*  567 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  568 */       localListIterator1 = ((List)localObject1).listIterator();
/*  569 */       while (localListIterator1.hasNext()) {
/*  570 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  571 */         if (((GoalStepWME)localObject2).getProperty("isTxnOutBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  576 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  583 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  584 */       localObject3 = ((List)localObject2).listIterator();
/*  585 */       while (((ListIterator)localObject3).hasNext()) {
/*  586 */         localObject4 = (GoalStepWME)((ListIterator)localObject3).next();
/*  587 */         if (((GoalStepWME)localObject4).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  592 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  597 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3393: 
/*  605 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  606 */       localListIterator1 = ((List)localObject1).listIterator();
/*  607 */       while (localListIterator1.hasNext()) {
/*  608 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  609 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  616 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  617 */           localObject4 = ((List)localObject3).listIterator();
/*  618 */           while (((ListIterator)localObject4).hasNext()) {
/*  619 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  620 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  625 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  630 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  637 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3397: 
/*  643 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  644 */       localListIterator1 = ((List)localObject1).listIterator();
/*  645 */       while (localListIterator1.hasNext()) {
/*  646 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  647 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  654 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  655 */           localObject4 = ((List)localObject3).listIterator();
/*  656 */           while (((ListIterator)localObject4).hasNext()) {
/*  657 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  658 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  663 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  668 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  675 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3400: 
/*  681 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  682 */       localListIterator1 = ((List)localObject1).listIterator();
/*  683 */       while (localListIterator1.hasNext()) {
/*  684 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  685 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  692 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  693 */           localObject4 = ((List)localObject3).listIterator();
/*  694 */           while (((ListIterator)localObject4).hasNext()) {
/*  695 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  696 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  701 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  708 */           localObject5 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*  709 */           localListIterator2 = ((List)localObject5).listIterator();
/*  710 */           while (localListIterator2.hasNext()) {
/*  711 */             localObject6 = (facade.characters.wmedef.BeatStatusWME)localListIterator2.next();
/*  712 */             if (!((facade.characters.wmedef.BeatStatusWME)localObject6).getBTxningOut())
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  717 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  729 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3404: 
/*  735 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  736 */       localListIterator1 = ((List)localObject1).listIterator();
/*  737 */       while (localListIterator1.hasNext()) {
/*  738 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  739 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  746 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  747 */           localObject4 = ((List)localObject3).listIterator();
/*  748 */           while (((ListIterator)localObject4).hasNext()) {
/*  749 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  750 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  755 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  762 */           localObject5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isTxnOutBeatGoal");
/*  763 */           localListIterator2 = ((List)localObject5).listIterator();
/*  764 */           while (localListIterator2.hasNext()) {
/*  765 */             localObject6 = (GoalStepWME)localListIterator2.next();
/*  766 */             if (((GoalStepWME)localObject6).getProperty("isTxnOutBeatGoal") != null)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  771 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  776 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3760: 
/*  790 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  791 */       localListIterator1 = ((List)localObject1).listIterator();
/*  792 */       while (localListIterator1.hasNext()) {
/*  793 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  794 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 27)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  799 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  805 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3761: 
/*  811 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  812 */       localListIterator1 = ((List)localObject1).listIterator();
/*  813 */       while (localListIterator1.hasNext()) {
/*  814 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  815 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 27)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  820 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  826 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3762: 
/*  832 */       localObject1 = WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", ((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica);
/*  833 */       localListIterator1 = ((List)localObject1).listIterator();
/*  834 */       while (localListIterator1.hasNext()) {
/*  835 */         localObject2 = (GoalStepWME)localListIterator1.next();
/*  836 */         if (((GoalStepWME)localObject2).getSignature().equals(((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  841 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  847 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4326: 
/*  853 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  854 */       localListIterator1 = ((List)localObject1).listIterator();
/*  855 */       while (localListIterator1.hasNext()) {
/*  856 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  857 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 32)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  865 */           localObject4 = ((List)localObject3).listIterator();
/*  866 */           while (((ListIterator)localObject4).hasNext()) {
/*  867 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  868 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  873 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  878 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  885 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4327: 
/*  891 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  892 */       localListIterator1 = ((List)localObject1).listIterator();
/*  893 */       while (localListIterator1.hasNext()) {
/*  894 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  895 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 32)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  902 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  903 */           localObject4 = ((List)localObject3).listIterator();
/*  904 */           while (((ListIterator)localObject4).hasNext()) {
/*  905 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  906 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  911 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  916 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  923 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4329: 
/*  929 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  930 */       localListIterator1 = ((List)localObject1).listIterator();
/*  931 */       while (localListIterator1.hasNext()) {
/*  932 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  933 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 32)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  940 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  941 */           localObject4 = ((List)localObject3).listIterator();
/*  942 */           while (((ListIterator)localObject4).hasNext()) {
/*  943 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  944 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  949 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  954 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  961 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5304: 
/*  967 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  968 */       localListIterator1 = ((List)localObject1).listIterator();
/*  969 */       while (localListIterator1.hasNext()) {
/*  970 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/*  971 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 36)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  978 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  979 */           localObject4 = ((List)localObject3).listIterator();
/*  980 */           while (((ListIterator)localObject4).hasNext()) {
/*  981 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/*  982 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  987 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  992 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  999 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5305: 
/* 1005 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1006 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1007 */       while (localListIterator1.hasNext()) {
/* 1008 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1009 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 36)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1016 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1017 */           localObject4 = ((List)localObject3).listIterator();
/* 1018 */           while (((ListIterator)localObject4).hasNext()) {
/* 1019 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1020 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1025 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1030 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1037 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5397: 
/* 1043 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1044 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1045 */       while (localListIterator1.hasNext()) {
/* 1046 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1047 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 37)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1054 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1055 */           localObject4 = ((List)localObject3).listIterator();
/* 1056 */           while (((ListIterator)localObject4).hasNext()) {
/* 1057 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1058 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1063 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1068 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1075 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5398: 
/* 1081 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1082 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1083 */       while (localListIterator1.hasNext()) {
/* 1084 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1085 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 37)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1092 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1093 */           localObject4 = ((List)localObject3).listIterator();
/* 1094 */           while (((ListIterator)localObject4).hasNext()) {
/* 1095 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1096 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1101 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1106 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1113 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5544: 
/* 1119 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1120 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1121 */       while (localListIterator1.hasNext()) {
/* 1122 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1123 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 38)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1130 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1131 */           localObject4 = ((List)localObject3).listIterator();
/* 1132 */           while (((ListIterator)localObject4).hasNext()) {
/* 1133 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1134 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1139 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1144 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1151 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5545: 
/* 1157 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1158 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1159 */       while (localListIterator1.hasNext()) {
/* 1160 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1161 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 38)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1168 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1169 */           localObject4 = ((List)localObject3).listIterator();
/* 1170 */           while (((ListIterator)localObject4).hasNext()) {
/* 1171 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1172 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1177 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1182 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1189 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5590: 
/* 1195 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1196 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1197 */       while (localListIterator1.hasNext()) {
/* 1198 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1199 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 39)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1206 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1207 */           localObject4 = ((List)localObject3).listIterator();
/* 1208 */           while (((ListIterator)localObject4).hasNext()) {
/* 1209 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1210 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1215 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1220 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1227 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5591: 
/* 1233 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1234 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1235 */       while (localListIterator1.hasNext()) {
/* 1236 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1237 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 39)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1244 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1245 */           localObject4 = ((List)localObject3).listIterator();
/* 1246 */           while (((ListIterator)localObject4).hasNext()) {
/* 1247 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1248 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1253 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1258 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1265 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5636: 
/* 1271 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1272 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1273 */       while (localListIterator1.hasNext()) {
/* 1274 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1275 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 40)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1282 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1283 */           localObject4 = ((List)localObject3).listIterator();
/* 1284 */           while (((ListIterator)localObject4).hasNext()) {
/* 1285 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1286 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1291 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1296 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1303 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5637: 
/* 1309 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1310 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1311 */       while (localListIterator1.hasNext()) {
/* 1312 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1313 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == 40)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1320 */           localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1321 */           localObject4 = ((List)localObject3).listIterator();
/* 1322 */           while (((ListIterator)localObject4).hasNext()) {
/* 1323 */             localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1324 */             if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1329 */               return false;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/* 1334 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1341 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6478: 
/* 1347 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1348 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1349 */       while (localListIterator1.hasNext()) {
/* 1350 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1351 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1356 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1362 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6492: 
/* 1368 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1369 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1370 */       while (localListIterator1.hasNext()) {
/* 1371 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1372 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1377 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1383 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6495: 
/* 1389 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1390 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1391 */       while (localListIterator1.hasNext()) {
/* 1392 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1393 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1398 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1404 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6498: 
/* 1410 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1411 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1412 */       while (localListIterator1.hasNext()) {
/* 1413 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1414 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1419 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1425 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6509: 
/* 1431 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1432 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1433 */       while (localListIterator1.hasNext()) {
/* 1434 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1435 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBNotSpeaking())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1440 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1446 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6521: 
/* 1452 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1453 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1454 */       while (localListIterator1.hasNext()) {
/* 1455 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1456 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBNotMoving())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1461 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1467 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6535: 
/* 1473 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1474 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1475 */       while (localListIterator1.hasNext()) {
/* 1476 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1477 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBFidgety())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1482 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1488 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6838: 
/* 1494 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1495 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1496 */       while (localListIterator1.hasNext()) {
/* 1497 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1498 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1503 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1509 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6851: 
/* 1515 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1516 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1517 */       while (localListIterator1.hasNext()) {
/* 1518 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1519 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1524 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1530 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6854: 
/* 1536 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1537 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1538 */       while (localListIterator1.hasNext()) {
/* 1539 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1540 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1545 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1551 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6865: 
/* 1557 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1558 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1559 */       while (localListIterator1.hasNext()) {
/* 1560 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1561 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBNotSpeaking())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1566 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1572 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6877: 
/* 1578 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1579 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1580 */       while (localListIterator1.hasNext()) {
/* 1581 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1582 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBNotMoving())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1587 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1593 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6891: 
/* 1599 */       localObject1 = WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 1600 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1601 */       while (localListIterator1.hasNext()) {
/* 1602 */         localObject2 = (facade.characters.wmedef.PlayerUncoopWME)localListIterator1.next();
/* 1603 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject2).getBFidgety())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1608 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1614 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8244: 
/* 1620 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/* 1621 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1622 */       while (localListIterator1.hasNext()) {
/* 1623 */         localObject2 = (facade.characters.wmedef.BodyResourceWME)localListIterator1.next();
/* 1624 */         if ((((facade.characters.wmedef.BodyResourceWME)localObject2).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.BodyResourceWME)localObject2).getOwner() == (abl.runtime.BehaviorWME)paramArrayOfObject[1]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1631 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1637 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8246: 
/* 1643 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("SequentialBehaviorWME", (String)paramArrayOfObject[0]);
/* 1644 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1645 */       while (localListIterator1.hasNext()) {
/* 1646 */         localObject2 = (abl.runtime.SequentialBehaviorWME)localListIterator1.next();
/* 1647 */         paramArrayOfObject[2] = localObject2;
/* 1648 */         if (((abl.runtime.SequentialBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1653 */           if ((abl.runtime.SequentialBehaviorWME)paramArrayOfObject[2] == (abl.runtime.BehaviorWME)paramArrayOfObject[1])
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1658 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1667 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8247: 
/* 1673 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("ParallelBehaviorWME", (String)paramArrayOfObject[0]);
/* 1674 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1675 */       while (localListIterator1.hasNext()) {
/* 1676 */         localObject2 = (abl.runtime.ParallelBehaviorWME)localListIterator1.next();
/* 1677 */         paramArrayOfObject[2] = localObject2;
/* 1678 */         if (((abl.runtime.ParallelBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1683 */           if ((abl.runtime.ParallelBehaviorWME)paramArrayOfObject[2] == (abl.runtime.BehaviorWME)paramArrayOfObject[1])
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1688 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1697 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8248: 
/* 1703 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("CollectionBehaviorWME", (String)paramArrayOfObject[0]);
/* 1704 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1705 */       while (localListIterator1.hasNext()) {
/* 1706 */         localObject2 = (abl.runtime.CollectionBehaviorWME)localListIterator1.next();
/* 1707 */         paramArrayOfObject[2] = localObject2;
/* 1708 */         if (((abl.runtime.CollectionBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1713 */           if ((abl.runtime.CollectionBehaviorWME)paramArrayOfObject[2] == (abl.runtime.BehaviorWME)paramArrayOfObject[1])
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1718 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1727 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8249: 
/* 1733 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/* 1734 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1735 */       while (localListIterator1.hasNext()) {
/* 1736 */         localObject2 = (facade.characters.wmedef.BodyResourceWME)localListIterator1.next();
/* 1737 */         if ((((facade.characters.wmedef.BodyResourceWME)localObject2).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.BodyResourceWME)localObject2).getOwner() == (abl.runtime.BehaviorWME)paramArrayOfObject[2]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1744 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1750 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8397: 
/* 1756 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("MoodWME");
/* 1757 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1758 */       while (localListIterator1.hasNext()) {
/* 1759 */         localObject2 = (facade.characters.wmedef.MoodWME)localListIterator1.next();
/* 1760 */         if ((((facade.characters.wmedef.MoodWME)localObject2).getType() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[2]).i) && (((facade.characters.wmedef.MoodWME)localObject2).getStrength() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[3]).i) && (!((facade.characters.wmedef.MoodWME)localObject2).getBTerminate()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1769 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1775 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8514: 
/* 1781 */       localObject1 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 1782 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1783 */       while (localListIterator1.hasNext()) {
/* 1784 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/* 1785 */         if (((facade.characters.wmedef.BeatStatusWME)localObject2).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1790 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1796 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8583: 
/* 1802 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPickupPositionWME");
/* 1803 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1804 */       while (localListIterator1.hasNext()) {
/* 1805 */         localObject2 = (facade.characters.wmedef.ObjectPickupPositionWME)localListIterator1.next();
/* 1806 */         if ((((facade.characters.wmedef.ObjectPickupPositionWME)localObject2).getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i) && (((facade.characters.wmedef.ObjectPickupPositionWME)localObject2).getX() == ((facade.util.Point3D)paramArrayOfObject[2]).x) && (((facade.characters.wmedef.ObjectPickupPositionWME)localObject2).getZ() == ((facade.util.Point3D)paramArrayOfObject[2]).z))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1815 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1821 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8849: 
/* 1827 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1828 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1829 */       while (localListIterator1.hasNext()) {
/* 1830 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1831 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1836 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1842 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8858: 
/* 1848 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "AmbEightballWME");
/* 1849 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1850 */       while (localListIterator1.hasNext()) {
/* 1851 */         localObject2 = (facade.characters.wmedef.AmbEightballWME)localListIterator1.next();
/* 1852 */         if (((facade.characters.wmedef.AmbEightballWME)localObject2).getReadingCtr() <= 3)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1857 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1863 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8866: 
/* 1869 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1870 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1871 */       while (localListIterator1.hasNext()) {
/* 1872 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1873 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1878 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1884 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8881: 
/* 1890 */       localObject1 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 1891 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1892 */       while (localListIterator1.hasNext()) {
/* 1893 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/* 1894 */         if (((facade.characters.wmedef.BeatStatusWME)localObject2).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1899 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1905 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8888: 
/* 1911 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1912 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1913 */       while (localListIterator1.hasNext()) {
/* 1914 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1915 */         if (((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1920 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1926 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8895: 
/* 1932 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1933 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1934 */       while (localListIterator1.hasNext()) {
/* 1935 */         localObject2 = (BeatFlagWME)localListIterator1.next();
/* 1936 */         if (((BeatFlagWME)localObject2).getSVal().equals("Amb_bgMixin_LightenUp done"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1941 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1946 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8899: 
/* 1953 */       localObject1 = WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1954 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1955 */       while (localListIterator1.hasNext()) {
/* 1956 */         localObject2 = (StoryStatusWME)localListIterator1.next();
/* 1957 */         if ((((StoryStatusWME)localObject2).getCurrentBeat() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((StoryStatusWME)localObject2).getCurrentBeat() != 7) && (((StoryStatusWME)localObject2).getCurrentBeat() != 8))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1966 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1972 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9000: 
/* 1978 */       localObject1 = WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 1979 */       localListIterator1 = ((List)localObject1).listIterator();
/* 1980 */       while (localListIterator1.hasNext()) {
/* 1981 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/* 1982 */         if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i = ((facade.characters.wmedef.BeatStatusWME)localObject2).getAbortReason()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1987 */           if ((((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i == -1) || (((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i == 1) || (((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i == 2) || (((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i == 5))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1994 */             localObject3 = WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1995 */             localObject4 = ((List)localObject3).listIterator();
/* 1996 */             while (((ListIterator)localObject4).hasNext()) {
/* 1997 */               localObject5 = (BeatFlagWME)((ListIterator)localObject4).next();
/* 1998 */               if (((BeatFlagWME)localObject5).getSVal().equals("EndingExperience"))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2003 */                 return false;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/* 2008 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2018 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9018: 
/* 2024 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "Amb_Fixdrinkopt_DoItThisBeat_PerformAtThisBeatGoal()");
/* 2025 */       localListIterator1 = ((List)localObject1).listIterator();
/* 2026 */       while (localListIterator1.hasNext()) {
/* 2027 */         localObject2 = (GoalStepWME)localListIterator1.next();
/* 2028 */         if (((GoalStepWME)localObject2).getSignature().equals("Amb_Fixdrinkopt_DoItThisBeat_PerformAtThisBeatGoal()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2033 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2038 */       return true;
/*      */     }
/*      */     
/*      */     
/* 2042 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\Trip_ContextConditions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */