/*      */ package facade.characters.trip.java;
/*      */ 
/*      */ import java.util.ListIterator;
/*      */ 
/*      */ public class Trip_SuccessTests implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, facade.util.PoseScripts, facade.util.GestureBodyPart, facade.util.BodyResource, facade.util.BeatStatus, facade.util.BeatConstants, facade.util.ReactionID, facade.util.ReactionConstants, facade.util.DAType, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.PlayerGestureID, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, facade.util.BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs { public static boolean successTest0(int paramInt, Object[] paramArrayOfObject, abl.runtime.BehavingEntity paramBehavingEntity) { Object localObject1;
/*      */     Object localObject11;
/*      */     Object localObject14;
/*      */     Object localObject19;
/*      */     Object localObject21;
/*      */     Object localObject23;
/*      */     Object localObject24;
/*      */     Object localObject25;
/*      */     label2175:
/*      */     label2855:
/*      */     long l1;
/*      */     java.util.LinkedList localLinkedList1;
/*      */     long l2;
/*      */     Object localObject2;
/*      */     ListIterator localListIterator1;
/*      */     label4004:
/*      */     float f13;
/*   22 */     Object localObject26; Object localObject27; label4415: Object localObject3; ListIterator localListIterator2; Object localObject15; float f6; float f10; float f2; label5107: label5303: Object localObject4; Object localObject12; Object localObject16; Object localObject20; int j; Object localObject5; long l3; Object localObject6; long l4; Object localObject7; Object localObject28; java.util.LinkedList localLinkedList4; ListIterator localListIterator6; Object localObject29; label10104: Object localObject8; Object localObject13; Object localObject17; ListIterator localListIterator4; Object localObject22; Object localObject9; float f15; float f17; float f12; float f4; label12017: label12361: Object localObject10; ListIterator localListIterator3; Object localObject18; java.util.LinkedList localLinkedList3; ListIterator localListIterator5; switch (paramInt)
/*      */     {
/*      */ 
/*      */ 
/*      */     case 1: 
/*   27 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "PlayerInfoWME");
/*   28 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*   29 */       while (((ListIterator)localObject11).hasNext()) {
/*   30 */         localObject14 = (facade.characters.wmedef.PlayerInfoWME)((ListIterator)localObject11).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   36 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*   42 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*   48 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*   49 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*   50 */       while (((ListIterator)localObject11).hasNext()) {
/*   51 */         localObject14 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject11).next();
/*   52 */         if (((dramaman.runtime.StoryStatusWME)localObject14).getCurrentBeat() == -1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   57 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*   62 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21: 
/*   69 */       localObject1 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*   70 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*   71 */       while (((ListIterator)localObject11).hasNext()) {
/*   72 */         localObject14 = (facade.characters.wmedef.BeatStatusWME)((ListIterator)localObject11).next();
/*   73 */         if (((facade.characters.wmedef.BeatStatusWME)localObject14).getStatus() == 5)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   78 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*   84 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31: 
/*   90 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "LastBeatGoalForThisBeat()");
/*   91 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*   92 */       while (((ListIterator)localObject11).hasNext()) {
/*   93 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*   94 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals("LastBeatGoalForThisBeat()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   99 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  105 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32: 
/*  111 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "LastBeatGoalForThisBeat()");
/*  112 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  113 */       while (((ListIterator)localObject11).hasNext()) {
/*  114 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  115 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals("LastBeatGoalForThisBeat()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  120 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  125 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 38: 
/*  132 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  133 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  134 */       while (((ListIterator)localObject11).hasNext()) {
/*  135 */         localObject14 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject11).next();
/*  136 */         if (((dramaman.runtime.StoryStatusWME)localObject14).getCurrentBeat() != ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  141 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  147 */       return false;
/*      */     
/*      */ 
/*      */     case 55: 
/*  151 */       if (!((abl.runtime.GoalStepWME)paramArrayOfObject[0]).isValid())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  156 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  160 */       return false;
/*      */     
/*      */ 
/*      */     case 68: 
/*  164 */       if (!((abl.runtime.GoalStepWME)paramArrayOfObject[1]).getIsExecuting())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  169 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  173 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 73: 
/*  179 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", (String)paramArrayOfObject[0]);
/*  180 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  181 */       while (((ListIterator)localObject11).hasNext()) {
/*  182 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  183 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  188 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  194 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 74: 
/*  200 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", (String)paramArrayOfObject[0]);
/*  201 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  202 */       while (((ListIterator)localObject11).hasNext()) {
/*  203 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  204 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  209 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  214 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 87: 
/*  221 */       localObject1 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", (String)paramArrayOfObject[0]);
/*  222 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  223 */       while (((ListIterator)localObject11).hasNext()) {
/*  224 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  225 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  230 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  235 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 100: 
/*  244 */       localObject14 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/*  245 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  246 */       for (; ((ListIterator)localObject19).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  261 */           ((ListIterator)localObject24).hasNext())
/*      */       {
/*  247 */         localObject21 = (abl.runtime.GoalStepWME)((ListIterator)localObject19).next();
/*  248 */         if ((((abl.runtime.GoalStepWME)localObject21).getProperty("isBeatGoal") == null) || (!((abl.runtime.GoalStepWME)localObject21).getIsExecuting()) || (!abl.runtime.BehavingEntity.constantTrue(localObject11 = ((abl.runtime.GoalStepWME)localObject21).getSignature()))) {
/*      */           break label2175;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  259 */         localObject23 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*  260 */         localObject24 = ((java.util.List)localObject23).listIterator();
/*  261 */         continue;
/*  262 */         localObject25 = (facade.characters.wmedef.BeatStatusWME)((ListIterator)localObject24).next();
/*  263 */         if (abl.runtime.BehavingEntity.constantTrue(localObject1 = ((facade.characters.wmedef.BeatStatusWME)localObject25).getCurBGSig()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  268 */           if (localObject11 != localObject1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  273 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/*  287 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 108: 
/*  293 */       localObject1 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", (String)paramArrayOfObject[0]);
/*  294 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  295 */       while (((ListIterator)localObject11).hasNext()) {
/*  296 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  297 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  302 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  307 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 110: 
/*  314 */       localObject1 = wm.WorkingMemory.lookupWME("GraceMemory", "SignalWME");
/*  315 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  316 */       while (((ListIterator)localObject11).hasNext()) {
/*  317 */         localObject14 = (facade.characters.wmedef.SignalWME)((ListIterator)localObject11).next();
/*  318 */         if (((facade.characters.wmedef.SignalWME)localObject14).getName().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  323 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  329 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 130: 
/*  335 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/*  336 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  337 */       while (((ListIterator)localObject11).hasNext()) {
/*  338 */         localObject14 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject11).next();
/*  339 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject14).getObjectID() == 48) && (((facade.characters.wmedef.ObjectActivationWME)localObject14).getActivationID() == 4))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  346 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  352 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 152: 
/*  358 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "TurnOffLocalPhysicallyFavorsWithTimeout(int, int)");
/*  359 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  360 */       while (((ListIterator)localObject11).hasNext()) {
/*  361 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  362 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals("TurnOffLocalPhysicallyFavorsWithTimeout(int, int)"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  367 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  372 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 162: 
/*  379 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "TurnOffPhysicallyFavorsWithTimeout(int, int)");
/*  380 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  381 */       while (((ListIterator)localObject11).hasNext()) {
/*  382 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  383 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals("TurnOffPhysicallyFavorsWithTimeout(int, int)"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  388 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  393 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 171: 
/*  400 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "TurnOffPhysicallyFavorsWithTimeout(int, int)");
/*  401 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  402 */       while (((ListIterator)localObject11).hasNext()) {
/*  403 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  404 */         if (((abl.runtime.GoalStepWME)localObject14).getSignature().equals("TurnOffPhysicallyFavorsWithTimeout(int, int)"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  409 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  414 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 177: 
/*  421 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("DAWME");
/*  422 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  423 */       while (((ListIterator)localObject11).hasNext()) {
/*  424 */         localObject14 = (facade.characters.wmedef.DAWME)((ListIterator)localObject11).next();
/*  425 */         if (((facade.characters.wmedef.DAWME)localObject14).getHandledStatus() == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  430 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  436 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 189: 
/*  442 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ReactionWME");
/*  443 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  444 */       while (((ListIterator)localObject11).hasNext()) {
/*  445 */         localObject14 = (facade.characters.wmedef.ReactionWME)((ListIterator)localObject11).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  451 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  457 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 214: 
/*  463 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isMixinBeatGoal");
/*  464 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  465 */       while (((ListIterator)localObject11).hasNext()) {
/*  466 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  467 */         if (((abl.runtime.GoalStepWME)localObject14).getProperty("isMixinBeatGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  472 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  477 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 230: 
/*  485 */       localObject11 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/*  486 */       localObject14 = ((java.util.List)localObject11).listIterator();
/*  487 */       for (; ((ListIterator)localObject14).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  502 */           ((ListIterator)localObject23).hasNext())
/*      */       {
/*  488 */         localObject19 = (abl.runtime.GoalStepWME)((ListIterator)localObject14).next();
/*  489 */         if ((!abl.runtime.BehavingEntity.constantTrue(localObject1 = ((abl.runtime.GoalStepWME)localObject19).getSignature())) || (((abl.runtime.GoalStepWME)localObject19).getProperty("isBeatGoal") == null) || (!((abl.runtime.GoalStepWME)localObject19).getIsExecuting())) {
/*      */           break label2855;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  500 */         localObject21 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/*  501 */         localObject23 = ((java.util.List)localObject21).listIterator();
/*  502 */         continue;
/*  503 */         localObject24 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject23).next();
/*  504 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject24).getBgSig().equals(localObject1)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject24).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  511 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  522 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 231: 
/*  528 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/*  529 */       localObject11 = ((java.util.List)localObject1).listIterator();
/*  530 */       while (((ListIterator)localObject11).hasNext()) {
/*  531 */         localObject14 = (abl.runtime.GoalStepWME)((ListIterator)localObject11).next();
/*  532 */         if ((((abl.runtime.GoalStepWME)localObject14).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject14).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  539 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  544 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 233: 
/*  552 */       localObject14 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("DAWME");
/*  553 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  554 */       while (((ListIterator)localObject19).hasNext()) {
/*  555 */         localObject21 = (facade.characters.wmedef.DAWME)((ListIterator)localObject19).next();
/*  556 */         if (abl.runtime.BehavingEntity.constantTrue(l1 = ((facade.characters.wmedef.DAWME)localObject21).getTimestamp()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  563 */           localObject23 = wm.WorkingMemory.lookupWME("BeatMemory", "DAMiscStatusWME");
/*  564 */           localObject24 = ((java.util.List)localObject23).listIterator();
/*  565 */           while (((ListIterator)localObject24).hasNext()) {
/*  566 */             localObject25 = (facade.characters.wmedef.DAMiscStatusWME)((ListIterator)localObject24).next();
/*  567 */             if ((!((facade.characters.wmedef.DAMiscStatusWME)localObject25).getBHandlersActive()) && (((facade.characters.wmedef.DAMiscStatusWME)localObject25).getLastDAHandlersActiveCheck() < l1))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  574 */               return true;
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
/*  585 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 238: 
/*  592 */       localObject14 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("DAWME");
/*  593 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  594 */       while (((ListIterator)localObject19).hasNext()) {
/*  595 */         localObject21 = (facade.characters.wmedef.DAWME)((ListIterator)localObject19).next();
/*  596 */         if (abl.runtime.BehavingEntity.constantTrue(l1 = ((facade.characters.wmedef.DAWME)localObject21).getTimestamp()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  603 */           localObject23 = wm.WorkingMemory.lookupWME("BeatMemory", "DAMiscStatusWME");
/*  604 */           localObject24 = ((java.util.List)localObject23).listIterator();
/*  605 */           while (((ListIterator)localObject24).hasNext()) {
/*  606 */             localObject25 = (facade.characters.wmedef.DAMiscStatusWME)((ListIterator)localObject24).next();
/*  607 */             if (((facade.characters.wmedef.DAMiscStatusWME)localObject25).getLastDACommitCheck() < l1)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  612 */               return true;
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
/*  623 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 242: 
/*  629 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerGestureWME");
/*  630 */       localObject11 = localLinkedList1.listIterator();
/*  631 */       while (((ListIterator)localObject11).hasNext()) {
/*  632 */         localObject14 = (facade.characters.wmedef.PlayerGestureWME)((ListIterator)localObject11).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  638 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  644 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 244: 
/*  650 */       localLinkedList1 = wm.WorkingMemory.lookupWME("BeatMemory", "PhysicallyFavorWME");
/*  651 */       localObject11 = localLinkedList1.listIterator();
/*  652 */       while (((ListIterator)localObject11).hasNext()) {
/*  653 */         localObject14 = (facade.characters.wmedef.PhysicallyFavorWME)((ListIterator)localObject11).next();
/*  654 */         if (((facade.characters.wmedef.PhysicallyFavorWME)localObject14).getFavoringCharID() == 2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  659 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  665 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 260: 
/*  671 */       localLinkedList1 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/*  672 */       localObject11 = localLinkedList1.listIterator();
/*  673 */       while (((ListIterator)localObject11).hasNext()) {
/*  674 */         localObject14 = (facade.characters.wmedef.BeatStatusWME)((ListIterator)localObject11).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  680 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  686 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 262: 
/*  693 */       localObject14 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  694 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  695 */       while (((ListIterator)localObject19).hasNext()) {
/*  696 */         localObject21 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject19).next();
/*  697 */         if (abl.runtime.BehavingEntity.constantTrue(l2 = ((dramaman.runtime.StoryStatusWME)localObject21).getNLPProcessingStarted()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  702 */           if (l2 > 0L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  707 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  716 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 263: 
/*  723 */       localObject14 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/*  724 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  725 */       while (((ListIterator)localObject19).hasNext()) {
/*  726 */         localObject21 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject19).next();
/*  727 */         if (abl.runtime.BehavingEntity.constantTrue(l2 = ((dramaman.runtime.StoryStatusWME)localObject21).getNLPProcessingStarted()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  732 */           if (System.currentTimeMillis() > l2 + 8000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  737 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  746 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 280: 
/*  752 */       java.util.LinkedList localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerGestureWME");
/*  753 */       localObject11 = localLinkedList2.listIterator();
/*  754 */       while (((ListIterator)localObject11).hasNext()) {
/*  755 */         localObject14 = (facade.characters.wmedef.PlayerGestureWME)((ListIterator)localObject11).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  761 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  767 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 282: 
/*  775 */       localObject14 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/*  776 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  777 */       while (((ListIterator)localObject19).hasNext()) {
/*  778 */         localObject21 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject19).next();
/*  779 */         int m; int i; if ((((facade.characters.wmedef.ObjectActivationWME)localObject21).getActivatorID() == 2) && (abl.runtime.BehavingEntity.constantTrue(m = ((facade.characters.wmedef.ObjectActivationWME)localObject21).getActivationID())) && (abl.runtime.BehavingEntity.constantTrue(i = ((facade.characters.wmedef.ObjectActivationWME)localObject21).getObjectID())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  788 */           if ((m == 0) || (m == 1))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  793 */             if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i = i))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  798 */               return true;
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
/*  810 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 286: 
/*  816 */       localObject2 = wm.WorkingMemory.lookupWME("BeatMemory", "OneCharacterVisibleWME");
/*  817 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  818 */       while (localListIterator1.hasNext()) {
/*  819 */         localObject14 = (facade.characters.wmedef.OneCharacterVisibleWME)localListIterator1.next();
/*  820 */         if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i = ((facade.characters.wmedef.OneCharacterVisibleWME)localObject14).getVisibleCharID()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  827 */           localObject19 = wm.WorkingMemory.lookupWME("StoryMemory", "AnaphoricReferenceWME");
/*  828 */           localObject21 = ((java.util.List)localObject19).listIterator();
/*  829 */           while (((ListIterator)localObject21).hasNext()) {
/*  830 */             localObject23 = (facade.characters.wmedef.AnaphoricReferenceWME)((ListIterator)localObject21).next();
/*  831 */             paramArrayOfObject[2] = localObject23;
/*  832 */             if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i = ((facade.characters.wmedef.AnaphoricReferenceWME)localObject23).getYouRef()))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  837 */               return true;
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
/*  848 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 292: 
/*  854 */       localObject2 = wm.WorkingMemory.lookupWME("BeatMemory", "OneCharacterVisibleWME");
/*  855 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  856 */       while (localListIterator1.hasNext()) {
/*  857 */         localObject14 = (facade.characters.wmedef.OneCharacterVisibleWME)localListIterator1.next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  863 */         return false;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  870 */       localObject14 = wm.WorkingMemory.lookupWME("StoryMemory", "AnaphoricReferenceWME");
/*  871 */       localObject19 = ((java.util.List)localObject14).listIterator();
/*  872 */       while (((ListIterator)localObject19).hasNext()) {
/*  873 */         localObject21 = (facade.characters.wmedef.AnaphoricReferenceWME)((ListIterator)localObject19).next();
/*  874 */         paramArrayOfObject[2] = localObject21;
/*  875 */         if ((abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i = ((facade.characters.wmedef.AnaphoricReferenceWME)localObject21).getYouRefNoOverride())) && (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i = ((facade.characters.wmedef.AnaphoricReferenceWME)localObject21).getYouRefDefaultNoOverride())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  882 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  889 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 294: 
/*  895 */       localObject2 = wm.WorkingMemory.lookupWME("BeatMemory", "OneCharacterVisibleWME");
/*  896 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  897 */       for (; localListIterator1.hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  910 */           ((ListIterator)localObject21).hasNext())
/*      */       {
/*  898 */         localObject14 = (facade.characters.wmedef.OneCharacterVisibleWME)localListIterator1.next();
/*  899 */         if ((((facade.characters.wmedef.OneCharacterVisibleWME)localObject14).getVisibleCharID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) || (!abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i = ((facade.characters.wmedef.OneCharacterVisibleWME)localObject14).getVisibleCharID()))) {
/*      */           break label4004;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  908 */         localObject19 = wm.WorkingMemory.lookupWME("StoryMemory", "AnaphoricReferenceWME");
/*  909 */         localObject21 = ((java.util.List)localObject19).listIterator();
/*  910 */         continue;
/*  911 */         localObject23 = (facade.characters.wmedef.AnaphoricReferenceWME)((ListIterator)localObject21).next();
/*  912 */         paramArrayOfObject[2] = localObject23;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  918 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  929 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 365: 
/*  935 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/*  936 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  937 */       while (localListIterator1.hasNext()) {
/*  938 */         localObject14 = (facade.characters.wmedef.ObjectActivationWME)localListIterator1.next();
/*  939 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject14).getObjectID() == 47) && (((facade.characters.wmedef.ObjectActivationWME)localObject14).getActivationID() == 4))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  946 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  952 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 425: 
/*  958 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  959 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  960 */       while (localListIterator1.hasNext()) {
/*  961 */         localObject14 = (facade.characters.wmedef.ObjectPositionWME)localListIterator1.next();
/*  962 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject14).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject14).getZ() < 100.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  969 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  975 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 608: 
/*  981 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isStagingGoal");
/*  982 */       localListIterator1 = ((java.util.List)localObject2).listIterator();
/*  983 */       while (localListIterator1.hasNext()) {
/*  984 */         localObject14 = (abl.runtime.GoalStepWME)localListIterator1.next();
/*  985 */         if (((abl.runtime.GoalStepWME)localObject14).getProperty("isStagingGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  990 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  995 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 609: 
/* 1006 */       localObject21 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1007 */       localObject23 = ((java.util.List)localObject21).listIterator();
/* 1008 */       for (; ((ListIterator)localObject23).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1023 */           ((ListIterator)localObject26).hasNext())
/*      */       {
/* 1009 */         localObject24 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject23).next();
/* 1010 */         float f1; if ((((facade.characters.wmedef.ObjectPositionWME)localObject24).getObjectID() != ((Trip)paramBehavingEntity).player) || (!abl.runtime.BehavingEntity.constantTrue(f1 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f13 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getZ()))) {
/*      */           break label4415;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1021 */         localObject25 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1022 */         localObject26 = ((java.util.List)localObject25).listIterator();
/* 1023 */         continue;
/* 1024 */         localObject27 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject26).next();
/* 1025 */         float f5; float f9; if ((((facade.characters.wmedef.ObjectPositionWME)localObject27).getObjectID() == ((Trip)paramBehavingEntity).me) && (abl.runtime.BehavingEntity.constantTrue(f5 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getX())) && (abl.runtime.BehavingEntity.constantTrue(f9 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getZ())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1034 */           if (facade.util.Staging.getXZDistanceBetweenPoints(new facade.util.Point3D(f1, 0.0F, f13), new facade.util.Point3D(f5, 0.0F, f9)) <= 100.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1039 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 1053 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 628: 
/* 1059 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1060 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1061 */       while (localListIterator2.hasNext()) {
/* 1062 */         localObject15 = (facade.characters.wmedef.ObjectPositionWME)localListIterator2.next();
/* 1063 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject15).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getX() > -180.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getZ() < 150.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1072 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1078 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1089: 
/* 1084 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isStagingGoal");
/* 1085 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1086 */       while (localListIterator2.hasNext()) {
/* 1087 */         localObject15 = (abl.runtime.GoalStepWME)localListIterator2.next();
/* 1088 */         if (((abl.runtime.GoalStepWME)localObject15).getProperty("isStagingGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1093 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1098 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1104: 
/* 1105 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isStagingGoal");
/* 1106 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1107 */       while (localListIterator2.hasNext()) {
/* 1108 */         localObject15 = (abl.runtime.GoalStepWME)localListIterator2.next();
/* 1109 */         if (((abl.runtime.GoalStepWME)localObject15).getProperty("isStagingGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1114 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1119 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1118: 
/* 1126 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isStagingGoal");
/* 1127 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1128 */       while (localListIterator2.hasNext()) {
/* 1129 */         localObject15 = (abl.runtime.GoalStepWME)localListIterator2.next();
/* 1130 */         if (((abl.runtime.GoalStepWME)localObject15).getProperty("isStagingGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1135 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1140 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1177: 
/* 1147 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1148 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1149 */       while (localListIterator2.hasNext()) {
/* 1150 */         localObject15 = (facade.characters.wmedef.ObjectPositionWME)localListIterator2.next();
/* 1151 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject15).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getX() > 50.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getZ() > 0.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1160 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1166 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1178: 
/* 1172 */       localObject3 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1173 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1174 */       while (localListIterator2.hasNext()) {
/* 1175 */         localObject15 = (facade.characters.wmedef.BeatFlagWME)localListIterator2.next();
/* 1176 */         if (((facade.characters.wmedef.BeatFlagWME)localObject15).getSVal().equals("GreetingPlayerBargedIn"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1181 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1187 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1179: 
/* 1193 */       localObject3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1194 */       localListIterator2 = ((java.util.List)localObject3).listIterator();
/* 1195 */       while (localListIterator2.hasNext()) {
/* 1196 */         localObject15 = (facade.characters.wmedef.ObjectPositionWME)localListIterator2.next();
/* 1197 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject15).getObjectID() == ((Trip)paramBehavingEntity).trip) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getX() < -100.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject15).getZ() < 80.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1206 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1212 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1483: 
/* 1222 */       localObject21 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1223 */       localObject23 = ((java.util.List)localObject21).listIterator();
/* 1224 */       for (; ((ListIterator)localObject23).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1239 */           ((ListIterator)localObject26).hasNext())
/*      */       {
/* 1225 */         localObject24 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject23).next();
/* 1226 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject24).getObjectID() != ((Trip)paramBehavingEntity).grace) || (!abl.runtime.BehavingEntity.constantTrue(f6 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f10 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getZ()))) {
/*      */           break label5107;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1237 */         localObject25 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1238 */         localObject26 = ((java.util.List)localObject25).listIterator();
/* 1239 */         continue;
/* 1240 */         localObject27 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject26).next();
/* 1241 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject27).getObjectID() == ((Trip)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f2 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getX())) && (abl.runtime.BehavingEntity.constantTrue(f13 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getZ())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1250 */           if (facade.util.Staging.getXZDistanceBetweenPoints(f6, f10, f2, f13) < 50.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1255 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 1269 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1485: 
/* 1279 */       localObject21 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1280 */       localObject23 = ((java.util.List)localObject21).listIterator();
/* 1281 */       for (; ((ListIterator)localObject23).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1296 */           ((ListIterator)localObject26).hasNext())
/*      */       {
/* 1282 */         localObject24 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject23).next();
/* 1283 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject24).getObjectID() != ((Trip)paramBehavingEntity).grace) || (!abl.runtime.BehavingEntity.constantTrue(f6 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f10 = ((facade.characters.wmedef.ObjectPositionWME)localObject24).getZ()))) {
/*      */           break label5303;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1294 */         localObject25 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1295 */         localObject26 = ((java.util.List)localObject25).listIterator();
/* 1296 */         continue;
/* 1297 */         localObject27 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject26).next();
/* 1298 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject27).getObjectID() == ((Trip)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f2 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getX())) && (abl.runtime.BehavingEntity.constantTrue(f13 = ((facade.characters.wmedef.ObjectPositionWME)localObject27).getZ())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1307 */           if (facade.util.Staging.getXZDistanceBetweenPoints(f6, f10, f2, f13) > 50.0F)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1312 */             return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 1326 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2561: 
/* 1332 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1333 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1334 */       while (((ListIterator)localObject12).hasNext()) {
/* 1335 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1336 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1341 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1347 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2664: 
/* 1353 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1354 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1355 */       while (((ListIterator)localObject12).hasNext()) {
/* 1356 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1357 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1362 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1368 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2839: 
/* 1374 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1375 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1376 */       while (((ListIterator)localObject12).hasNext()) {
/* 1377 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1378 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1383 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1389 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2841: 
/* 1395 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1396 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1397 */       while (((ListIterator)localObject12).hasNext()) {
/* 1398 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1399 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("started leaving message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1404 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1410 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2844: 
/* 1416 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1417 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1418 */       while (((ListIterator)localObject12).hasNext()) {
/* 1419 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1420 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("answering machine outgoing message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1425 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1431 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2933: 
/* 1437 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/* 1438 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1439 */       while (((ListIterator)localObject12).hasNext()) {
/* 1440 */         localObject16 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject12).next();
/* 1441 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivatorID() == 2) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getObjectID() == 10) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivationID() == 0))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1450 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1456 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2946: 
/* 1462 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/* 1463 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1464 */       while (((ListIterator)localObject12).hasNext()) {
/* 1465 */         localObject16 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject12).next();
/* 1466 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivatorID() == 2) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getObjectID() == 10) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivationID() == 1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1475 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1481 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3004: 
/* 1487 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1488 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1489 */       while (((ListIterator)localObject12).hasNext()) {
/* 1490 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1491 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1496 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1502 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3095: 
/* 1508 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1509 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1510 */       while (((ListIterator)localObject12).hasNext()) {
/* 1511 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1512 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1517 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1523 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3256: 
/* 1529 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1530 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1531 */       while (((ListIterator)localObject12).hasNext()) {
/* 1532 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1533 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("player picked up phone"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1538 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1544 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3258: 
/* 1550 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1551 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1552 */       while (((ListIterator)localObject12).hasNext()) {
/* 1553 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1554 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("started leaving message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1559 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1565 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3261: 
/* 1571 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 1572 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1573 */       while (((ListIterator)localObject12).hasNext()) {
/* 1574 */         localObject16 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject12).next();
/* 1575 */         if (((facade.characters.wmedef.BeatFlagWME)localObject16).getSVal().equals("answering machine outgoing message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1580 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1586 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3344: 
/* 1592 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/* 1593 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1594 */       while (((ListIterator)localObject12).hasNext()) {
/* 1595 */         localObject16 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject12).next();
/* 1596 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivatorID() == 2) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getObjectID() == 10) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivationID() == 0))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1605 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1611 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3357: 
/* 1617 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/* 1618 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1619 */       while (((ListIterator)localObject12).hasNext()) {
/* 1620 */         localObject16 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject12).next();
/* 1621 */         if ((((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivatorID() == 2) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getObjectID() == 10) && (((facade.characters.wmedef.ObjectActivationWME)localObject16).getActivationID() == 1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1630 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1636 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3376: 
/* 1642 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("ParallelBehaviorWME", "BeatGoals_Body()");
/* 1643 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1644 */       while (((ListIterator)localObject12).hasNext()) {
/* 1645 */         localObject16 = (abl.runtime.ParallelBehaviorWME)((ListIterator)localObject12).next();
/* 1646 */         if (((abl.runtime.ParallelBehaviorWME)localObject16).getSignature().equals("BeatGoals_Body()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1651 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1657 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3378: 
/* 1663 */       localObject4 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1664 */       localObject12 = ((java.util.List)localObject4).listIterator();
/* 1665 */       while (((ListIterator)localObject12).hasNext()) {
/* 1666 */         localObject16 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject12).next();
/* 1667 */         if (((dramaman.runtime.StoryStatusWME)localObject16).getAffinity() != ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1672 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1678 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3383: 
/* 1685 */       localObject12 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1686 */       localObject16 = ((java.util.List)localObject12).listIterator();
/* 1687 */       while (((ListIterator)localObject16).hasNext()) {
/* 1688 */         localObject20 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject16).next();
/* 1689 */         if (abl.runtime.BehavingEntity.constantTrue(j = ((dramaman.runtime.StoryStatusWME)localObject20).getAffinity()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1694 */           if (j <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1699 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1708 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3388: 
/* 1715 */       localObject12 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1716 */       localObject16 = ((java.util.List)localObject12).listIterator();
/* 1717 */       while (((ListIterator)localObject16).hasNext()) {
/* 1718 */         localObject20 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject16).next();
/* 1719 */         if (abl.runtime.BehavingEntity.constantTrue(j = ((dramaman.runtime.StoryStatusWME)localObject20).getAffinity()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1724 */           if (j >= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1729 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1738 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6303: 
/* 1744 */       localObject5 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/* 1745 */       localObject12 = ((java.util.List)localObject5).listIterator();
/* 1746 */       while (((ListIterator)localObject12).hasNext()) {
/* 1747 */         localObject16 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject12).next();
/* 1748 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBgSig().equals(((Trip)paramBehavingEntity).sig_bRMt1N_bgLurePlayer)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1755 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1761 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6536: 
/* 1767 */       localObject5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "bRMt1N_Demon_FirstGuessTimeout()");
/* 1768 */       localObject12 = ((java.util.List)localObject5).listIterator();
/* 1769 */       while (((ListIterator)localObject12).hasNext()) {
/* 1770 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 1771 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals("bRMt1N_Demon_FirstGuessTimeout()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1776 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1781 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6729: 
/* 1789 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatRMp1WME");
/* 1790 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1791 */       while (((ListIterator)localObject20).hasNext()) {
/* 1792 */         localObject21 = (facade.characters.wmedef.BeatRMp1WME)((ListIterator)localObject20).next();
/* 1793 */         if (abl.runtime.BehavingEntity.constantTrue(l3 = ((facade.characters.wmedef.BeatRMp1WME)localObject21).getTempMillis()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1798 */           if (System.currentTimeMillis() > l3 + 3000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1803 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1812 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6773: 
/* 1819 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatRMp1WME");
/* 1820 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1821 */       while (((ListIterator)localObject20).hasNext()) {
/* 1822 */         localObject21 = (facade.characters.wmedef.BeatRMp1WME)((ListIterator)localObject20).next();
/* 1823 */         if (abl.runtime.BehavingEntity.constantTrue(l3 = ((facade.characters.wmedef.BeatRMp1WME)localObject21).getTempMillis()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1828 */           if (System.currentTimeMillis() > l3 + 3000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1833 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1842 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 6956: 
/* 1848 */       localObject6 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/* 1849 */       localObject12 = ((java.util.List)localObject6).listIterator();
/* 1850 */       while (((ListIterator)localObject12).hasNext()) {
/* 1851 */         localObject16 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject12).next();
/* 1852 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBgSig().equals(((Trip)paramBehavingEntity).sig_bRMt1GPA_bgLurePlayer)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1859 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1865 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7199: 
/* 1871 */       localObject6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "bRMt1GPA_Demon_FirstGuessTimeout()");
/* 1872 */       localObject12 = ((java.util.List)localObject6).listIterator();
/* 1873 */       while (((ListIterator)localObject12).hasNext()) {
/* 1874 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 1875 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals("bRMt1GPA_Demon_FirstGuessTimeout()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1880 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1885 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7598: 
/* 1892 */       localObject6 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/* 1893 */       localObject12 = ((java.util.List)localObject6).listIterator();
/* 1894 */       while (((ListIterator)localObject12).hasNext()) {
/* 1895 */         localObject16 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject12).next();
/* 1896 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBgSig().equals(((Trip)paramBehavingEntity).sig_bRMt1TPA_bgLurePlayer)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1903 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1909 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 7820: 
/* 1915 */       localObject6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "bRMt1TPA_Demon_FirstGuessTimeout()");
/* 1916 */       localObject12 = ((java.util.List)localObject6).listIterator();
/* 1917 */       while (((ListIterator)localObject12).hasNext()) {
/* 1918 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 1919 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals("bRMt1TPA_Demon_FirstGuessTimeout()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1924 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1929 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8025: 
/* 1937 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatRMp1WME");
/* 1938 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1939 */       while (((ListIterator)localObject20).hasNext()) {
/* 1940 */         localObject21 = (facade.characters.wmedef.BeatRMp1WME)((ListIterator)localObject20).next();
/* 1941 */         if (abl.runtime.BehavingEntity.constantTrue(l4 = ((facade.characters.wmedef.BeatRMp1WME)localObject21).getTempMillis()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1946 */           if (System.currentTimeMillis() > l4 + 3000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1951 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1960 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8061: 
/* 1967 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatRMp1WME");
/* 1968 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1969 */       while (((ListIterator)localObject20).hasNext()) {
/* 1970 */         localObject21 = (facade.characters.wmedef.BeatRMp1WME)((ListIterator)localObject20).next();
/* 1971 */         if (abl.runtime.BehavingEntity.constantTrue(l4 = ((facade.characters.wmedef.BeatRMp1WME)localObject21).getTempMillis()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1976 */           if (System.currentTimeMillis() > l4 + 3000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1981 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1990 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12013: 
/* 1996 */       localObject7 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/* 1997 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 1998 */       while (((ListIterator)localObject12).hasNext()) {
/* 1999 */         localObject16 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject12).next();
/* 2000 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBgSig().equals(((Trip)paramBehavingEntity).sig_bRMt2GPA_bgLurePlayer)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2007 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2013 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12267: 
/* 2019 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "bRMt2GPA_Demon_FirstGuessTimeout()");
/* 2020 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2021 */       while (((ListIterator)localObject12).hasNext()) {
/* 2022 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2023 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals("bRMt2GPA_Demon_FirstGuessTimeout()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2028 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2033 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12602: 
/* 2040 */       localObject7 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatGoalStatusWME");
/* 2041 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2042 */       while (((ListIterator)localObject12).hasNext()) {
/* 2043 */         localObject16 = (facade.characters.wmedef.BeatGoalStatusWME)((ListIterator)localObject12).next();
/* 2044 */         if ((((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBgSig().equals(((Trip)paramBehavingEntity).sig_bRMt2TPA_bgLurePlayer)) && (!((facade.characters.wmedef.BeatGoalStatusWME)localObject16).getBLetBeatGoalFinish()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2051 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2057 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12828: 
/* 2063 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "bRMt2TPA_Demon_FirstGuessTimeout()");
/* 2064 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2065 */       while (((ListIterator)localObject12).hasNext()) {
/* 2066 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2067 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals("bRMt2TPA_Demon_FirstGuessTimeout()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2072 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2077 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15464: 
/* 2084 */       localObject7 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", ((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica);
/* 2085 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2086 */       while (((ListIterator)localObject12).hasNext()) {
/* 2087 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2088 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2093 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2099 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15466: 
/* 2105 */       localObject7 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", ((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica);
/* 2106 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2107 */       while (((ListIterator)localObject12).hasNext()) {
/* 2108 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2109 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2114 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2119 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15470: 
/* 2126 */       localObject7 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", ((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica);
/* 2127 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2128 */       while (((ListIterator)localObject12).hasNext()) {
/* 2129 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2130 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bNonAffChrGReturnsT2_bgTxnIn_Veronica))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2135 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2141 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15473: 
/* 2147 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2148 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2149 */       while (((ListIterator)localObject12).hasNext()) {
/* 2150 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2151 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == 2) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 80.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2158 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2164 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 17582: 
/* 2170 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2171 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2172 */       while (((ListIterator)localObject12).hasNext()) {
/* 2173 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2174 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2183 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2189 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 17586: 
/* 2195 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2196 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2197 */       while (((ListIterator)localObject12).hasNext()) {
/* 2198 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2199 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2208 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2214 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 17599: 
/* 2220 */       localObject7 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatC2TGGlueWME");
/* 2221 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2222 */       while (((ListIterator)localObject12).hasNext()) {
/* 2223 */         localObject16 = (facade.characters.wmedef.BeatC2TGGlueWME)((ListIterator)localObject12).next();
/* 2224 */         if (((facade.characters.wmedef.BeatC2TGGlueWME)localObject16).getBSwitchedToKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2229 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2235 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 17601: 
/* 2241 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2242 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2243 */       while (((ListIterator)localObject12).hasNext()) {
/* 2244 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2245 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 50.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() < 175.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2254 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2260 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19279: 
/* 2266 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2267 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2268 */       while (((ListIterator)localObject12).hasNext()) {
/* 2269 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2270 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgBody4a)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2279 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2285 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19280: 
/* 2291 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2292 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2293 */       while (((ListIterator)localObject12).hasNext()) {
/* 2294 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2295 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgBody4a)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2304 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2309 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19304: 
/* 2316 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2317 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2318 */       while (((ListIterator)localObject12).hasNext()) {
/* 2319 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2320 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgBody4b)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2329 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2335 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19305: 
/* 2341 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2342 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2343 */       while (((ListIterator)localObject12).hasNext()) {
/* 2344 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2345 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgBody4b)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2354 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2359 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19318: 
/* 2366 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2367 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2368 */       while (((ListIterator)localObject12).hasNext()) {
/* 2369 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2370 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgBody4_mixin)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2379 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2384 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19322: 
/* 2391 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2392 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2393 */       while (((ListIterator)localObject12).hasNext()) {
/* 2394 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2395 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgLitany)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2404 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2410 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 19323: 
/* 2416 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 2417 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2418 */       while (((ListIterator)localObject12).hasNext()) {
/* 2419 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2420 */         if ((((abl.runtime.GoalStepWME)localObject16).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject16).getIsExecuting()) && (((abl.runtime.GoalStepWME)localObject16).getSignature().equals(((Trip)paramBehavingEntity).sig_bRevBuildupP2_bgLitany)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2429 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2434 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20581: 
/* 2441 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2442 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2443 */       while (((ListIterator)localObject12).hasNext()) {
/* 2444 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2445 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2454 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2460 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20585: 
/* 2466 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2467 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2468 */       while (((ListIterator)localObject12).hasNext()) {
/* 2469 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2470 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2479 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2485 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20620: 
/* 2491 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 2492 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2493 */       while (((ListIterator)localObject12).hasNext()) {
/* 2494 */         localObject16 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject12).next();
/* 2495 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject16).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject16).getY() <= 0.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2502 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2508 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20622: 
/* 2514 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 2515 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2516 */       while (((ListIterator)localObject12).hasNext()) {
/* 2517 */         localObject16 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject12).next();
/* 2518 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject16).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject16).getY() > 25.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2525 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2531 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20967: 
/* 2537 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2538 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2539 */       while (((ListIterator)localObject12).hasNext()) {
/* 2540 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2541 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2550 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2556 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 20971: 
/* 2562 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2563 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2564 */       while (((ListIterator)localObject12).hasNext()) {
/* 2565 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2566 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2575 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2581 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21045: 
/* 2587 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 2588 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2589 */       while (((ListIterator)localObject12).hasNext()) {
/* 2590 */         localObject16 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject12).next();
/* 2591 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject16).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject16).getY() <= 0.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2598 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2604 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21047: 
/* 2610 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 2611 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2612 */       while (((ListIterator)localObject12).hasNext()) {
/* 2613 */         localObject16 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject12).next();
/* 2614 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject16).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject16).getY() <= -60.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2621 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2627 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21051: 
/* 2633 */       localObject7 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/* 2634 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2635 */       while (((ListIterator)localObject12).hasNext()) {
/* 2636 */         localObject16 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject12).next();
/* 2637 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject16).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2642 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2648 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21449: 
/* 2654 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2655 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2656 */       while (((ListIterator)localObject12).hasNext()) {
/* 2657 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2658 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2667 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2673 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21453: 
/* 2679 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2680 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2681 */       while (((ListIterator)localObject12).hasNext()) {
/* 2682 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2683 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2692 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2698 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21658: 
/* 2704 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2705 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2706 */       while (((ListIterator)localObject12).hasNext()) {
/* 2707 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2708 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2717 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2723 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21662: 
/* 2729 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2730 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2731 */       while (((ListIterator)localObject12).hasNext()) {
/* 2732 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2733 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2742 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2748 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21862: 
/* 2754 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2755 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2756 */       while (((ListIterator)localObject12).hasNext()) {
/* 2757 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2758 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() < -150.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 50.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2767 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2773 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 21866: 
/* 2779 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2780 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2781 */       while (((ListIterator)localObject12).hasNext()) {
/* 2782 */         localObject16 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject12).next();
/* 2783 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject16).getObjectID() == ((Trip)paramBehavingEntity).player) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getX() > 0.0F) && (((facade.characters.wmedef.ObjectPositionWME)localObject16).getZ() > 215.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2792 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2798 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 22202: 
/* 2804 */       localObject7 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", (String)paramArrayOfObject[0]);
/* 2805 */       localObject12 = ((java.util.List)localObject7).listIterator();
/* 2806 */       while (((ListIterator)localObject12).hasNext()) {
/* 2807 */         localObject16 = (abl.runtime.GoalStepWME)((ListIterator)localObject12).next();
/* 2808 */         if (((abl.runtime.GoalStepWME)localObject16).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2813 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2818 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 26614: 
/* 2830 */       localObject23 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2831 */       localObject24 = ((java.util.List)localObject23).listIterator();
/* 2832 */       for (; ((ListIterator)localObject24).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2847 */           ((ListIterator)localObject27).hasNext())
/*      */       {
/* 2833 */         localObject25 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject24).next();
/* 2834 */         float f14; float f16; if ((((facade.characters.wmedef.ObjectPositionWME)localObject25).getObjectID() != ((Trip)paramBehavingEntity).me) || (!abl.runtime.BehavingEntity.constantTrue(f14 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f16 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getZ()))) {
/*      */           break label10104;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2845 */         localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 2846 */         localObject27 = ((java.util.List)localObject26).listIterator();
/* 2847 */         continue;
/* 2848 */         localObject28 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject27).next();
/* 2849 */         float f11; if ((((facade.characters.wmedef.ObjectRotationWME)localObject28).getObjectID() == ((Trip)paramBehavingEntity).me) && (abl.runtime.BehavingEntity.constantTrue(f11 = ((facade.characters.wmedef.ObjectRotationWME)localObject28).getY())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2858 */           localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 2859 */           localListIterator6 = localLinkedList4.listIterator();
/* 2860 */           while (localListIterator6.hasNext()) {
/* 2861 */             localObject29 = (facade.characters.wmedef.ObjectPositionWME)localListIterator6.next();
/* 2862 */             float f3; float f7; if ((((facade.characters.wmedef.ObjectPositionWME)localObject29).getObjectID() == 47) && (abl.runtime.BehavingEntity.constantTrue(f3 = ((facade.characters.wmedef.ObjectPositionWME)localObject29).getX())) && (abl.runtime.BehavingEntity.constantTrue(f7 = ((facade.characters.wmedef.ObjectPositionWME)localObject29).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2871 */               if (facade.util.Staging.isPointWithinCharCone(f3, f7, f14, f16, f11, 60.0F, 0.0F, 80.0F))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2876 */                 return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2895 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31243: 
/* 2901 */       localObject8 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/* 2902 */       localObject13 = ((java.util.List)localObject8).listIterator();
/* 2903 */       while (((ListIterator)localObject13).hasNext()) {
/* 2904 */         localObject17 = (facade.characters.wmedef.BodyResourceWME)((ListIterator)localObject13).next();
/* 2905 */         if ((((facade.characters.wmedef.BodyResourceWME)localObject17).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.BodyResourceWME)localObject17).getOwner() != null))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2912 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2918 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31247: 
/* 2924 */       localObject8 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "resourceOwner");
/* 2925 */       localObject13 = ((java.util.List)localObject8).listIterator();
/* 2926 */       while (((ListIterator)localObject13).hasNext()) {
/* 2927 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 2928 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("resourceOwner") == (abl.runtime.BehaviorWME)paramArrayOfObject[1])
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2933 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 2938 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31275: 
/* 2947 */       localObject17 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/* 2948 */       localListIterator4 = ((java.util.List)localObject17).listIterator();
/* 2949 */       while (localListIterator4.hasNext()) {
/* 2950 */         localObject22 = (facade.characters.wmedef.BodyResourceWME)localListIterator4.next();
/* 2951 */         int k; if ((((facade.characters.wmedef.BodyResourceWME)localObject22).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (abl.runtime.BehavingEntity.constantTrue(k = ((facade.characters.wmedef.BodyResourceWME)localObject22).getResourcePriority())) && (abl.runtime.BehavingEntity.constantTrue(localObject13 = ((facade.characters.wmedef.BodyResourceWME)localObject22).getOwner())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2960 */           if ((localObject13 == null) || (k <= ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2965 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2974 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31290: 
/* 2981 */       localObject17 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerRecentlyTypedTextWME");
/* 2982 */       localListIterator4 = ((java.util.List)localObject17).listIterator();
/* 2983 */       while (localListIterator4.hasNext()) {
/* 2984 */         localObject22 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)localListIterator4.next();
/* 2985 */         long l5; if ((((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject22).getB()) && (abl.runtime.BehavingEntity.constantTrue(l5 = ((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject22).getTimestamp())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2992 */           if (System.currentTimeMillis() < l5 + 1000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2997 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3006 */       return false;
/*      */     
/*      */ 
/*      */     case 31625: 
/* 3010 */       if (System.currentTimeMillis() > ((facade.characters.wmedef.MoodWME)paramArrayOfObject[1]).getDecayAtMillis())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3015 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 3019 */       return false;
/*      */     
/*      */ 
/*      */     case 31627: 
/* 3023 */       if (System.currentTimeMillis() > ((facade.characters.wmedef.MoodWME)paramArrayOfObject[1]).getBurstDecayAtMillis())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3028 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 3032 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31717: 
/* 3038 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("MoodWME");
/* 3039 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3040 */       while (((ListIterator)localObject13).hasNext()) {
/* 3041 */         localObject17 = (facade.characters.wmedef.MoodWME)((ListIterator)localObject13).next();
/* 3042 */         if (((facade.characters.wmedef.MoodWME)localObject17).getBurstDecay() == 0.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3047 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3053 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31777: 
/* 3059 */       localObject9 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerRecentlyTypedTextWME");
/* 3060 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3061 */       while (((ListIterator)localObject13).hasNext()) {
/* 3062 */         localObject17 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)((ListIterator)localObject13).next();
/* 3063 */         if (!((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject17).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3068 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3074 */       return false;
/*      */     
/*      */ 
/*      */     case 31779: 
/* 3078 */       if (((dramaman.runtime.StoryStatusWME)paramArrayOfObject[0]).getNLPProcessingStarted() == 0L)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3083 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 3087 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31825: 
/* 3093 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/* 3094 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3095 */       while (((ListIterator)localObject13).hasNext()) {
/* 3096 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3097 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3104 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3110 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31829: 
/* 3116 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/* 3117 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3118 */       while (((ListIterator)localObject13).hasNext()) {
/* 3119 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3120 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == 1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3127 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3133 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31834: 
/* 3139 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/* 3140 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3141 */       while (((ListIterator)localObject13).hasNext()) {
/* 3142 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3143 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == 3))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3150 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3156 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31839: 
/* 3162 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/* 3163 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3164 */       while (((ListIterator)localObject13).hasNext()) {
/* 3165 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3166 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == 5))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3173 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3179 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31846: 
/* 3185 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isDoDialogBody");
/* 3186 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3187 */       while (((ListIterator)localObject13).hasNext()) {
/* 3188 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3189 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3194 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3199 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31850: 
/* 3206 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/* 3207 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3208 */       while (((ListIterator)localObject13).hasNext()) {
/* 3209 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3210 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == 4))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3217 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3223 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31855: 
/* 3229 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isDoDialogBody");
/* 3230 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3231 */       while (((ListIterator)localObject13).hasNext()) {
/* 3232 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3233 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3238 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3243 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31861: 
/* 3250 */       localObject9 = wm.WorkingMemory.lookupWME("GraceMemory", "AnimationCueWME");
/* 3251 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3252 */       while (((ListIterator)localObject13).hasNext()) {
/* 3253 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3254 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3261 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3267 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31862: 
/* 3273 */       localObject9 = wm.WorkingMemory.lookupWME("TripMemory", "AnimationCueWME");
/* 3274 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3275 */       while (((ListIterator)localObject13).hasNext()) {
/* 3276 */         localObject17 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject13).next();
/* 3277 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject17).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject17).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3284 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3290 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31873: 
/* 3296 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/* 3297 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3298 */       while (((ListIterator)localObject13).hasNext()) {
/* 3299 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3300 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3305 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3311 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31875: 
/* 3317 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/* 3318 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3319 */       while (((ListIterator)localObject13).hasNext()) {
/* 3320 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3321 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3326 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3332 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31877: 
/* 3338 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/* 3339 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3340 */       while (((ListIterator)localObject13).hasNext()) {
/* 3341 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3342 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3347 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3353 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31879: 
/* 3359 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/* 3360 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3361 */       while (((ListIterator)localObject13).hasNext()) {
/* 3362 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3363 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3368 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3374 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31881: 
/* 3380 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/* 3381 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3382 */       while (((ListIterator)localObject13).hasNext()) {
/* 3383 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3384 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3389 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3394 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 31882: 
/* 3401 */       localObject9 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/* 3402 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3403 */       while (((ListIterator)localObject13).hasNext()) {
/* 3404 */         localObject17 = (abl.runtime.GoalStepWME)((ListIterator)localObject13).next();
/* 3405 */         if (((abl.runtime.GoalStepWME)localObject17).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3410 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3415 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32009: 
/* 3422 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 3423 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3424 */       while (((ListIterator)localObject13).hasNext()) {
/* 3425 */         localObject17 = (facade.characters.wmedef.HeldObjectWME)((ListIterator)localObject13).next();
/* 3426 */         if ((((facade.characters.wmedef.HeldObjectWME)localObject17).getCharacterID() == ((Trip)paramBehavingEntity).me) && (((facade.characters.wmedef.HeldObjectWME)localObject17).getAttachPointID() == ((Trip)paramBehavingEntity).g_objHand))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3433 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3438 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32033: 
/* 3445 */       localObject9 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 3446 */       localObject13 = ((java.util.List)localObject9).listIterator();
/* 3447 */       while (((ListIterator)localObject13).hasNext()) {
/* 3448 */         localObject17 = (facade.characters.wmedef.HeldObjectWME)((ListIterator)localObject13).next();
/* 3449 */         if ((((facade.characters.wmedef.HeldObjectWME)localObject17).getCharacterID() == ((Trip)paramBehavingEntity).me) && (((facade.characters.wmedef.HeldObjectWME)localObject17).getAttachPointID() == ((Trip)paramBehavingEntity).g_objHand))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3456 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3462 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32077: 
/* 3473 */       localObject23 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 3474 */       localObject24 = ((java.util.List)localObject23).listIterator();
/* 3475 */       for (; ((ListIterator)localObject24).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3490 */           ((ListIterator)localObject27).hasNext())
/*      */       {
/* 3476 */         localObject25 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject24).next();
/* 3477 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject25).getObjectID() != ((Trip)paramBehavingEntity).me) || (!abl.runtime.BehavingEntity.constantTrue(f15 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f17 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getZ()))) {
/*      */           break label12017;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3488 */         localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 3489 */         localObject27 = ((java.util.List)localObject26).listIterator();
/* 3490 */         continue;
/* 3491 */         localObject28 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject27).next();
/* 3492 */         float f8; if ((((facade.characters.wmedef.ObjectPositionWME)localObject28).getObjectID() == ((Trip)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f8 = ((facade.characters.wmedef.ObjectPositionWME)localObject28).getX())) && (abl.runtime.BehavingEntity.constantTrue(f12 = ((facade.characters.wmedef.ObjectPositionWME)localObject28).getZ())))
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
/* 3503 */           localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 3504 */           localListIterator6 = localLinkedList4.listIterator();
/* 3505 */           while (localListIterator6.hasNext()) {
/* 3506 */             localObject29 = (facade.characters.wmedef.ObjectRotationWME)localListIterator6.next();
/* 3507 */             if ((((facade.characters.wmedef.ObjectRotationWME)localObject29).getObjectID() == ((Trip)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f4 = ((facade.characters.wmedef.ObjectRotationWME)localObject29).getY())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3514 */               if (!facade.util.Staging.isPointWithinCharCone(f15, f17, f8, f12, f4, 90.0F, 0.0F, 9999.0F))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3519 */                 if (facade.util.Staging.getXZDistanceBetweenPoints(f15, f17, f8, f12) < 200.0F)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 3524 */                   return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3546 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32095: 
/* 3557 */       localObject23 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("StagingInfoWME");
/* 3558 */       localObject24 = ((java.util.List)localObject23).listIterator();
/* 3559 */       while (((ListIterator)localObject24).hasNext()) {
/* 3560 */         localObject25 = (facade.characters.wmedef.StagingInfoWME)((ListIterator)localObject24).next();
/* 3561 */         boolean bool; if (abl.runtime.BehavingEntity.constantTrue(bool = ((facade.characters.wmedef.StagingInfoWME)localObject25).getBObjMovedFromOrig()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3568 */           localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 3569 */           localObject27 = ((java.util.List)localObject26).listIterator();
/* 3570 */           for (; ((ListIterator)localObject27).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3585 */               localListIterator6.hasNext())
/*      */           {
/* 3571 */             localObject28 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject27).next();
/* 3572 */             if ((((facade.characters.wmedef.ObjectPositionWME)localObject28).getObjectID() != ((Trip)paramBehavingEntity).me) || (!abl.runtime.BehavingEntity.constantTrue(f15 = ((facade.characters.wmedef.ObjectPositionWME)localObject28).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f17 = ((facade.characters.wmedef.ObjectPositionWME)localObject28).getZ()))) {
/*      */               break label12361;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3583 */             localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 3584 */             localListIterator6 = localLinkedList4.listIterator();
/* 3585 */             continue;
/* 3586 */             localObject29 = (facade.characters.wmedef.ObjectPositionWME)localListIterator6.next();
/* 3587 */             if ((((facade.characters.wmedef.ObjectPositionWME)localObject29).getObjectID() == ((Trip)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f4 = ((facade.characters.wmedef.ObjectPositionWME)localObject29).getX())) && (abl.runtime.BehavingEntity.constantTrue(f12 = ((facade.characters.wmedef.ObjectPositionWME)localObject29).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3596 */               if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[1]).f = facade.util.Staging.getXZDistanceBetweenPoints(f15, f17, f4, f12)))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 3601 */                 if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[2]).f = facade.util.Staging.getXZDistanceBetweenPoints(f15, f17, ((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[4]).f)))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 3606 */                   if ((!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (bool) && ((((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[1]).f <= 150.0F) || (((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[2]).f <= 150.0F)))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 3611 */                     return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3636 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32096: 
/* 3642 */       localObject10 = wm.WorkingMemory.lookupWME("PlayerMemory", "IsPlayerTranslatingOrRotatingWME");
/* 3643 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3644 */       while (localListIterator3.hasNext()) {
/* 3645 */         localObject18 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localListIterator3.next();
/* 3646 */         if (((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localObject18).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3651 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3657 */       return false;
/*      */     
/*      */ 
/*      */     case 32174: 
/* 3661 */       if (System.currentTimeMillis() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[1]).l)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3666 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 3670 */       return false;
/*      */     
/*      */ 
/*      */     case 32181: 
/* 3674 */       if (System.currentTimeMillis() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 3679 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 3683 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32195: 
/* 3689 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 3690 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3691 */       while (localListIterator3.hasNext()) {
/* 3692 */         localObject18 = (facade.characters.wmedef.ObjectRotationWME)localListIterator3.next();
/* 3693 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject18).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject18).getY() <= ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3700 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3706 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32344: 
/* 3712 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("UserTestWME");
/* 3713 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3714 */       while (localListIterator3.hasNext()) {
/* 3715 */         localObject18 = (facade.characters.wmedef.UserTestWME)localListIterator3.next();
/* 3716 */         if (((facade.characters.wmedef.UserTestWME)localObject18).getParam1() != -1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3721 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3727 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32537: 
/* 3733 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 3734 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3735 */       while (localListIterator3.hasNext()) {
/* 3736 */         localObject18 = (dramaman.runtime.StoryStatusWME)localListIterator3.next();
/* 3737 */         if (((dramaman.runtime.StoryStatusWME)localObject18).getBeatCountOfLastGreetingBeat() > 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3742 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3748 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32542: 
/* 3754 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3755 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3756 */       while (localListIterator3.hasNext()) {
/* 3757 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3758 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3763 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3769 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32545: 
/* 3775 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3776 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3777 */       while (localListIterator3.hasNext()) {
/* 3778 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3779 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() != 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3784 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3790 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32549: 
/* 3796 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3797 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3798 */       while (localListIterator3.hasNext()) {
/* 3799 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3800 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3805 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3811 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32558: 
/* 3817 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isBeatGoal");
/* 3818 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3819 */       while (localListIterator3.hasNext()) {
/* 3820 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 3821 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getProperty("isAmbSafe") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3830 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3836 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32563: 
/* 3842 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", (String)paramArrayOfObject[0]);
/* 3843 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3844 */       while (localListIterator3.hasNext()) {
/* 3845 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 3846 */         if (((abl.runtime.GoalStepWME)localObject18).getSignature().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3851 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3856 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32564: 
/* 3863 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3864 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3865 */       while (localListIterator3.hasNext()) {
/* 3866 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3867 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 3)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3872 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3878 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32571: 
/* 3884 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3885 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3886 */       while (localListIterator3.hasNext()) {
/* 3887 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3888 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3893 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3899 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32574: 
/* 3905 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3906 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3907 */       while (localListIterator3.hasNext()) {
/* 3908 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3909 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() != 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3914 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3920 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32581: 
/* 3926 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3927 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3928 */       while (localListIterator3.hasNext()) {
/* 3929 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3930 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3935 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3941 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32593: 
/* 3947 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isBeatGoal");
/* 3948 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3949 */       while (localListIterator3.hasNext()) {
/* 3950 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 3951 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getProperty("isAmbSafe") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3960 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 3966 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32607: 
/* 3972 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEBySignature("TripMemory", "GoalStepWME", (String)paramArrayOfObject[1]);
/* 3973 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3974 */       while (localListIterator3.hasNext()) {
/* 3975 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 3976 */         if (((abl.runtime.GoalStepWME)localObject18).getSignature().equals((String)paramArrayOfObject[1]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 3981 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 3986 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32608: 
/* 3993 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 3994 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 3995 */       while (localListIterator3.hasNext()) {
/* 3996 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 3997 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 3)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4002 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4008 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32615: 
/* 4014 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4015 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4016 */       while (localListIterator3.hasNext()) {
/* 4017 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4018 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4023 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4029 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32617: 
/* 4035 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isBeatGoal");
/* 4036 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4037 */       while (localListIterator3.hasNext()) {
/* 4038 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4039 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getProperty("isAmbSafe") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4048 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4054 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32620: 
/* 4060 */       localObject10 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isBeatGoal");
/* 4061 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4062 */       while (localListIterator3.hasNext()) {
/* 4063 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4064 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getProperty("isAmbSafe") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4073 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4078 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32623: 
/* 4085 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/* 4086 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4087 */       while (localListIterator3.hasNext()) {
/* 4088 */         localObject18 = (facade.characters.wmedef.BeatFlagWME)localListIterator3.next();
/* 4089 */         if (((facade.characters.wmedef.BeatFlagWME)localObject18).getSVal().equals("ReadyToDecideToDoFixdrinkoptAmb"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4094 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4100 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32628: 
/* 4106 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4107 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4108 */       while (localListIterator3.hasNext()) {
/* 4109 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4110 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4115 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4121 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32634: 
/* 4127 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4128 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4129 */       while (localListIterator3.hasNext()) {
/* 4130 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4131 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4136 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4142 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32641: 
/* 4148 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4149 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4150 */       while (localListIterator3.hasNext()) {
/* 4151 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4152 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4159 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4165 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32642: 
/* 4171 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4172 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4173 */       while (localListIterator3.hasNext()) {
/* 4174 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4175 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4182 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4187 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32643: 
/* 4194 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4195 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4196 */       while (localListIterator3.hasNext()) {
/* 4197 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4198 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4205 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4211 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32652: 
/* 4217 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4218 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4219 */       while (localListIterator3.hasNext()) {
/* 4220 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4221 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4226 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4232 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32655: 
/* 4238 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4239 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4240 */       while (localListIterator3.hasNext()) {
/* 4241 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4242 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() != 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4247 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4253 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32659: 
/* 4259 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4260 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4261 */       while (localListIterator3.hasNext()) {
/* 4262 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4263 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4268 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4274 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32662: 
/* 4280 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4281 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4282 */       while (localListIterator3.hasNext()) {
/* 4283 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4284 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 3)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4289 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4295 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32672: 
/* 4301 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4302 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4303 */       while (localListIterator3.hasNext()) {
/* 4304 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4305 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() == 2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4310 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4316 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 32675: 
/* 4322 */       localObject10 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 4323 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4324 */       while (localListIterator3.hasNext()) {
/* 4325 */         localObject18 = (facade.characters.wmedef.BeatStatusWME)localListIterator3.next();
/* 4326 */         if (((facade.characters.wmedef.BeatStatusWME)localObject18).getStatus() != 2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4331 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4337 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33044: 
/* 4343 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "Global_bgMixin_LTBFixDrink_GraceDrinkReady()");
/* 4344 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4345 */       while (localListIterator3.hasNext()) {
/* 4346 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4347 */         if (((abl.runtime.GoalStepWME)localObject18).getSignature().equals("Global_bgMixin_LTBFixDrink_GraceDrinkReady()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4352 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4357 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33055: 
/* 4364 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4365 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4366 */       while (localListIterator3.hasNext()) {
/* 4367 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4368 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4375 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4380 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33234: 
/* 4387 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4388 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4389 */       while (localListIterator3.hasNext()) {
/* 4390 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4391 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4398 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4403 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33273: 
/* 4410 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isBeatGoal");
/* 4411 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4412 */       while (localListIterator3.hasNext()) {
/* 4413 */         localObject18 = (abl.runtime.GoalStepWME)localListIterator3.next();
/* 4414 */         if ((((abl.runtime.GoalStepWME)localObject18).getProperty("isBeatGoal") != null) && (((abl.runtime.GoalStepWME)localObject18).getIsExecuting()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4421 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 4426 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33388: 
/* 4433 */       localObject10 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerRecentlyTypedTextWME");
/* 4434 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4435 */       while (localListIterator3.hasNext()) {
/* 4436 */         localObject18 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)localListIterator3.next();
/* 4437 */         if (((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject18).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4442 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4448 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33412: 
/* 4454 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "TensionStoryValueWME");
/* 4455 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4456 */       while (localListIterator3.hasNext()) {
/* 4457 */         localObject18 = (dramaman.runtime.TensionStoryValueWME)localListIterator3.next();
/* 4458 */         if (((dramaman.runtime.TensionStoryValueWME)localObject18).getValue() == 1.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4465 */           localLinkedList3 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 4466 */           localListIterator5 = localLinkedList3.listIterator();
/* 4467 */           while (localListIterator5.hasNext()) {
/* 4468 */             localObject23 = (dramaman.runtime.StoryStatusWME)localListIterator5.next();
/* 4469 */             if (((dramaman.runtime.StoryStatusWME)localObject23).getAffinity() != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 4474 */               return true;
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
/* 4485 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33413: 
/* 4491 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "TensionStoryValueWME");
/* 4492 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4493 */       while (localListIterator3.hasNext()) {
/* 4494 */         localObject18 = (dramaman.runtime.TensionStoryValueWME)localListIterator3.next();
/* 4495 */         if (((dramaman.runtime.TensionStoryValueWME)localObject18).getValue() == 1.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4502 */           localLinkedList3 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 4503 */           localListIterator5 = localLinkedList3.listIterator();
/* 4504 */           while (localListIterator5.hasNext()) {
/* 4505 */             localObject23 = (dramaman.runtime.StoryStatusWME)localListIterator5.next();
/* 4506 */             if ((((dramaman.runtime.StoryStatusWME)localObject23).getBeatCountOfLastGreetingBeat() == 4) && (((dramaman.runtime.StoryStatusWME)localObject23).getBeatCount() == 6))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4513 */               return true;
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
/* 4524 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33414: 
/* 4530 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "TensionStoryValueWME");
/* 4531 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4532 */       while (localListIterator3.hasNext()) {
/* 4533 */         localObject18 = (dramaman.runtime.TensionStoryValueWME)localListIterator3.next();
/* 4534 */         if (((dramaman.runtime.TensionStoryValueWME)localObject18).getValue() == 1.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4541 */           localLinkedList3 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 4542 */           localListIterator5 = localLinkedList3.listIterator();
/* 4543 */           while (localListIterator5.hasNext()) {
/* 4544 */             localObject23 = (dramaman.runtime.StoryStatusWME)localListIterator5.next();
/* 4545 */             if ((((dramaman.runtime.StoryStatusWME)localObject23).getBeatCountOfLastGreetingBeat() == 3) && (((dramaman.runtime.StoryStatusWME)localObject23).getBeatCount() == 5))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4552 */               return true;
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
/* 4563 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 33415: 
/* 4569 */       localObject10 = wm.WorkingMemory.lookupWME("StoryMemory", "TensionStoryValueWME");
/* 4570 */       localListIterator3 = ((java.util.List)localObject10).listIterator();
/* 4571 */       while (localListIterator3.hasNext()) {
/* 4572 */         localObject18 = (dramaman.runtime.TensionStoryValueWME)localListIterator3.next();
/* 4573 */         if (((dramaman.runtime.TensionStoryValueWME)localObject18).getValue() == 2.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 4578 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 4584 */       return false;
/*      */     }
/*      */     
/* 4587 */     throw new abl.runtime.AblRuntimeError("Unexpected stepID " + paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\Trip_SuccessTests.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */