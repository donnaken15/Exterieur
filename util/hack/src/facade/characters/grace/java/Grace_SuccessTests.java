/*      */ package facade.characters.grace.java;
/*      */ 
/*      */ import java.util.ListIterator;
/*      */ 
/*      */ public class Grace_SuccessTests implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, facade.util.PoseScripts, facade.util.GestureBodyPart, facade.util.BodyResource, facade.util.BeatStatus, facade.util.BeatConstants, facade.util.ReactionConstants, facade.util.DAType, facade.util.ReactionID, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, facade.util.BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs { public static boolean successTest0(int paramInt, Object[] paramArrayOfObject, abl.runtime.BehavingEntity paramBehavingEntity) { java.util.LinkedList localLinkedList2;
/*      */     ListIterator localListIterator3;
/*      */     Object localObject7;
/*      */     java.util.LinkedList localLinkedList3;
/*      */     ListIterator localListIterator4;
/*      */     Object localObject8;
/*      */     java.util.LinkedList localLinkedList4;
/*      */     ListIterator localListIterator5;
/*      */     Object localObject9;
/*      */     label670:
/*      */     Object localObject1;
/*      */     Object localObject3;
/*      */     Object localObject4;
/*      */     ListIterator localListIterator2;
/*      */     Object localObject6;
/*   20 */     Object localObject2; float f8; float f10; float f6; float f2; label3500: label3842: java.util.LinkedList localLinkedList1; ListIterator localListIterator1; Object localObject5; switch (paramInt)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 52: 
/*   30 */       localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*   31 */       localListIterator3 = localLinkedList2.listIterator();
/*   32 */       for (; localListIterator3.hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   47 */           localListIterator4.hasNext())
/*      */       {
/*   33 */         localObject7 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/*   34 */         float f3; float f5; if ((((facade.characters.wmedef.ObjectPositionWME)localObject7).getObjectID() != ((Grace)paramBehavingEntity).player) || (!abl.runtime.BehavingEntity.constantTrue(f3 = ((facade.characters.wmedef.ObjectPositionWME)localObject7).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f5 = ((facade.characters.wmedef.ObjectPositionWME)localObject7).getZ()))) {
/*      */           break label670;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   45 */         localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*   46 */         localListIterator4 = localLinkedList3.listIterator();
/*   47 */         continue;
/*   48 */         localObject8 = (facade.characters.wmedef.ObjectRotationWME)localListIterator4.next();
/*   49 */         float f1; if ((((facade.characters.wmedef.ObjectRotationWME)localObject8).getObjectID() == ((Grace)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f1 = ((facade.characters.wmedef.ObjectRotationWME)localObject8).getY())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   58 */           localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*   59 */           localListIterator5 = localLinkedList4.listIterator();
/*   60 */           while (localListIterator5.hasNext()) {
/*   61 */             localObject9 = (facade.characters.wmedef.ObjectPositionWME)localListIterator5.next();
/*   62 */             float f7; float f9; if ((((facade.characters.wmedef.ObjectPositionWME)localObject9).getObjectID() == ((Grace)paramBehavingEntity).me) && (abl.runtime.BehavingEntity.constantTrue(f7 = ((facade.characters.wmedef.ObjectPositionWME)localObject9).getX())) && (abl.runtime.BehavingEntity.constantTrue(f9 = ((facade.characters.wmedef.ObjectPositionWME)localObject9).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   71 */               if (facade.util.Staging.isPointWithinCharCone(f7, f9, f3, f5, f1, 60.0F, 0.0F, 9999.0F))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*   76 */                 return true;
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
/*   95 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 910: 
/*  101 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  102 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  103 */       while (((ListIterator)localObject3).hasNext()) {
/*  104 */         localObject4 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject3).next();
/*  105 */         if (((facade.characters.wmedef.BeatFlagWME)localObject4).getSVal().equals("answering machine outgoing message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  110 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  116 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1126: 
/*  122 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  123 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  124 */       while (((ListIterator)localObject3).hasNext()) {
/*  125 */         localObject4 = (facade.characters.wmedef.BeatFlagWME)((ListIterator)localObject3).next();
/*  126 */         if (((facade.characters.wmedef.BeatFlagWME)localObject4).getSVal().equals("answering machine outgoing message"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  131 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  137 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 8586: 
/*  143 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isStagingGoal");
/*  144 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  145 */       while (((ListIterator)localObject3).hasNext()) {
/*  146 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  147 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isStagingGoal") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  152 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  157 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9104: 
/*  164 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  165 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  166 */       while (((ListIterator)localObject3).hasNext()) {
/*  167 */         localObject4 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject3).next();
/*  168 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject4).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject4).getY() <= 0.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  175 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  181 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9106: 
/*  187 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  188 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  189 */       while (((ListIterator)localObject3).hasNext()) {
/*  190 */         localObject4 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject3).next();
/*  191 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject4).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject4).getY() > 25.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  198 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  204 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9420: 
/*  210 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  211 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  212 */       while (((ListIterator)localObject3).hasNext()) {
/*  213 */         localObject4 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject3).next();
/*  214 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject4).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject4).getY() <= 0.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  227 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9422: 
/*  233 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  234 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  235 */       while (((ListIterator)localObject3).hasNext()) {
/*  236 */         localObject4 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject3).next();
/*  237 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject4).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject4).getY() <= -60.0F))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  244 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  250 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9426: 
/*  256 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  257 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  258 */       while (((ListIterator)localObject3).hasNext()) {
/*  259 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  260 */         if (((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  265 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  271 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11499: 
/*  277 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  278 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  279 */       while (((ListIterator)localObject3).hasNext()) {
/*  280 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  281 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  286 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  292 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11509: 
/*  298 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  299 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  300 */       while (((ListIterator)localObject3).hasNext()) {
/*  301 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  302 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  307 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  313 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11534: 
/*  319 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  320 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  321 */       while (((ListIterator)localObject3).hasNext()) {
/*  322 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  323 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBNotSpeaking())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  328 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  334 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11544: 
/*  340 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  341 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  342 */       while (((ListIterator)localObject3).hasNext()) {
/*  343 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  344 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBNotMoving())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  349 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  355 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11557: 
/*  361 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  362 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  363 */       while (((ListIterator)localObject3).hasNext()) {
/*  364 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  365 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBFidgety())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  370 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  376 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12525: 
/*  382 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  383 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  384 */       while (((ListIterator)localObject3).hasNext()) {
/*  385 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  386 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBLeavingApartment())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  391 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  397 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 12535: 
/*  403 */       localObject1 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerUncoopWME");
/*  404 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  405 */       while (((ListIterator)localObject3).hasNext()) {
/*  406 */         localObject4 = (facade.characters.wmedef.PlayerUncoopWME)((ListIterator)localObject3).next();
/*  407 */         if (!((facade.characters.wmedef.PlayerUncoopWME)localObject4).getBLeavingForKitchen())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  412 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  418 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15517: 
/*  424 */       localObject1 = wm.WorkingMemory.lookupWME("TripMemory", "SignalWME");
/*  425 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  426 */       while (((ListIterator)localObject3).hasNext()) {
/*  427 */         localObject4 = (facade.characters.wmedef.SignalWME)((ListIterator)localObject3).next();
/*  428 */         if (((facade.characters.wmedef.SignalWME)localObject4).getName().equals((String)paramArrayOfObject[0]))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  433 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  439 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15535: 
/*  445 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/*  446 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  447 */       while (((ListIterator)localObject3).hasNext()) {
/*  448 */         localObject4 = (facade.characters.wmedef.BodyResourceWME)((ListIterator)localObject3).next();
/*  449 */         if ((((facade.characters.wmedef.BodyResourceWME)localObject4).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.BodyResourceWME)localObject4).getOwner() != null))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  456 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  462 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15539: 
/*  468 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "resourceOwner");
/*  469 */       localObject3 = ((java.util.List)localObject1).listIterator();
/*  470 */       while (((ListIterator)localObject3).hasNext()) {
/*  471 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  472 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("resourceOwner") == (abl.runtime.BehaviorWME)paramArrayOfObject[1])
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  477 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  482 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15567: 
/*  491 */       localObject4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/*  492 */       localListIterator2 = ((java.util.List)localObject4).listIterator();
/*  493 */       while (localListIterator2.hasNext()) {
/*  494 */         localObject6 = (facade.characters.wmedef.BodyResourceWME)localListIterator2.next();
/*  495 */         int i; if ((((facade.characters.wmedef.BodyResourceWME)localObject6).getResourceID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (abl.runtime.BehavingEntity.constantTrue(i = ((facade.characters.wmedef.BodyResourceWME)localObject6).getResourcePriority())) && (abl.runtime.BehavingEntity.constantTrue(localObject3 = ((facade.characters.wmedef.BodyResourceWME)localObject6).getOwner())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  504 */           if ((localObject3 == null) || (i <= ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  509 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  518 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 15582: 
/*  525 */       localObject4 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerRecentlyTypedTextWME");
/*  526 */       localListIterator2 = ((java.util.List)localObject4).listIterator();
/*  527 */       while (localListIterator2.hasNext()) {
/*  528 */         localObject6 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)localListIterator2.next();
/*  529 */         long l; if ((((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject6).getB()) && (abl.runtime.BehavingEntity.constantTrue(l = ((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject6).getTimestamp())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  536 */           if (System.currentTimeMillis() < l + 1000L)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  541 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  550 */       return false;
/*      */     
/*      */ 
/*      */     case 15917: 
/*  554 */       if (System.currentTimeMillis() > ((facade.characters.wmedef.MoodWME)paramArrayOfObject[1]).getDecayAtMillis())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  559 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  563 */       return false;
/*      */     
/*      */ 
/*      */     case 15919: 
/*  567 */       if (System.currentTimeMillis() > ((facade.characters.wmedef.MoodWME)paramArrayOfObject[1]).getBurstDecayAtMillis())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  572 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  576 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16009: 
/*  582 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("MoodWME");
/*  583 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  584 */       while (((ListIterator)localObject3).hasNext()) {
/*  585 */         localObject4 = (facade.characters.wmedef.MoodWME)((ListIterator)localObject3).next();
/*  586 */         if (((facade.characters.wmedef.MoodWME)localObject4).getBurstDecay() == 0.0F)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  591 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  597 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16069: 
/*  603 */       localObject2 = wm.WorkingMemory.lookupWME("PlayerMemory", "PlayerRecentlyTypedTextWME");
/*  604 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  605 */       while (((ListIterator)localObject3).hasNext()) {
/*  606 */         localObject4 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)((ListIterator)localObject3).next();
/*  607 */         if (!((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject4).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  612 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  618 */       return false;
/*      */     
/*      */ 
/*      */     case 16071: 
/*  622 */       if (((dramaman.runtime.StoryStatusWME)paramArrayOfObject[0]).getNLPProcessingStarted() == 0L)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  627 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  631 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16117: 
/*  637 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/*  638 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  639 */       while (((ListIterator)localObject3).hasNext()) {
/*  640 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  641 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  648 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  654 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16121: 
/*  660 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/*  661 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  662 */       while (((ListIterator)localObject3).hasNext()) {
/*  663 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  664 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == 1))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  671 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  677 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16126: 
/*  683 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/*  684 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  685 */       while (((ListIterator)localObject3).hasNext()) {
/*  686 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  687 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == 3))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  694 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  700 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16131: 
/*  706 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/*  707 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  708 */       while (((ListIterator)localObject3).hasNext()) {
/*  709 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  710 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == 5))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  717 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  723 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16138: 
/*  729 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isDoDialogBody");
/*  730 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  731 */       while (((ListIterator)localObject3).hasNext()) {
/*  732 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  733 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  738 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  743 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16142: 
/*  750 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("AnimationCueWME");
/*  751 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  752 */       while (((ListIterator)localObject3).hasNext()) {
/*  753 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  754 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == 4))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  761 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  767 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16147: 
/*  773 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEByUserProperty("GoalStepWME", "isDoDialogBody");
/*  774 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  775 */       while (((ListIterator)localObject3).hasNext()) {
/*  776 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  777 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  782 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  787 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16153: 
/*  794 */       localObject2 = wm.WorkingMemory.lookupWME("GraceMemory", "AnimationCueWME");
/*  795 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  796 */       while (((ListIterator)localObject3).hasNext()) {
/*  797 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  798 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  805 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  811 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16154: 
/*  817 */       localObject2 = wm.WorkingMemory.lookupWME("TripMemory", "AnimationCueWME");
/*  818 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  819 */       while (((ListIterator)localObject3).hasNext()) {
/*  820 */         localObject4 = (facade.characters.wmedef.AnimationCueWME)((ListIterator)localObject3).next();
/*  821 */         if ((((facade.characters.wmedef.AnimationCueWME)localObject4).getLayerIndex() == 7) && (((facade.characters.wmedef.AnimationCueWME)localObject4).getCue() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  828 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  834 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16165: 
/*  840 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/*  841 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  842 */       while (((ListIterator)localObject3).hasNext()) {
/*  843 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  844 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  849 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  855 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16167: 
/*  861 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/*  862 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  863 */       while (((ListIterator)localObject3).hasNext()) {
/*  864 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  865 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  870 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  876 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16169: 
/*  882 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/*  883 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  884 */       while (((ListIterator)localObject3).hasNext()) {
/*  885 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  886 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  891 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  897 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16171: 
/*  903 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/*  904 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  905 */       while (((ListIterator)localObject3).hasNext()) {
/*  906 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  907 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  912 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  918 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16173: 
/*  924 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("GraceMemory", "GoalStepWME", "isDoDialogBody");
/*  925 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  926 */       while (((ListIterator)localObject3).hasNext()) {
/*  927 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  928 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  933 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  938 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16174: 
/*  945 */       localObject2 = wm.WorkingMemory.lookupReflectionWMEByUserProperty("TripMemory", "GoalStepWME", "isDoDialogBody");
/*  946 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  947 */       while (((ListIterator)localObject3).hasNext()) {
/*  948 */         localObject4 = (abl.runtime.GoalStepWME)((ListIterator)localObject3).next();
/*  949 */         if (((abl.runtime.GoalStepWME)localObject4).getProperty("isDoDialogBody") != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  954 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  959 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16301: 
/*  966 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/*  967 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  968 */       while (((ListIterator)localObject3).hasNext()) {
/*  969 */         localObject4 = (facade.characters.wmedef.HeldObjectWME)((ListIterator)localObject3).next();
/*  970 */         if ((((facade.characters.wmedef.HeldObjectWME)localObject4).getCharacterID() == ((Grace)paramBehavingEntity).me) && (((facade.characters.wmedef.HeldObjectWME)localObject4).getAttachPointID() == ((Grace)paramBehavingEntity).g_objHand))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  977 */           return false;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  982 */       return true;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16325: 
/*  989 */       localObject2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/*  990 */       localObject3 = ((java.util.List)localObject2).listIterator();
/*  991 */       while (((ListIterator)localObject3).hasNext()) {
/*  992 */         localObject4 = (facade.characters.wmedef.HeldObjectWME)((ListIterator)localObject3).next();
/*  993 */         if ((((facade.characters.wmedef.HeldObjectWME)localObject4).getCharacterID() == ((Grace)paramBehavingEntity).me) && (((facade.characters.wmedef.HeldObjectWME)localObject4).getAttachPointID() == ((Grace)paramBehavingEntity).g_objHand))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1000 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1006 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16369: 
/* 1017 */       localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1018 */       localListIterator3 = localLinkedList2.listIterator();
/* 1019 */       for (; localListIterator3.hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1034 */           localListIterator4.hasNext())
/*      */       {
/* 1020 */         localObject7 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/* 1021 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject7).getObjectID() != ((Grace)paramBehavingEntity).me) || (!abl.runtime.BehavingEntity.constantTrue(f8 = ((facade.characters.wmedef.ObjectPositionWME)localObject7).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f10 = ((facade.characters.wmedef.ObjectPositionWME)localObject7).getZ()))) {
/*      */           break label3500;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1032 */         localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1033 */         localListIterator4 = localLinkedList3.listIterator();
/* 1034 */         continue;
/* 1035 */         localObject8 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 1036 */         float f4; if ((((facade.characters.wmedef.ObjectPositionWME)localObject8).getObjectID() == ((Grace)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f4 = ((facade.characters.wmedef.ObjectPositionWME)localObject8).getX())) && (abl.runtime.BehavingEntity.constantTrue(f6 = ((facade.characters.wmedef.ObjectPositionWME)localObject8).getZ())))
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
/* 1047 */           localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 1048 */           localListIterator5 = localLinkedList4.listIterator();
/* 1049 */           while (localListIterator5.hasNext()) {
/* 1050 */             localObject9 = (facade.characters.wmedef.ObjectRotationWME)localListIterator5.next();
/* 1051 */             if ((((facade.characters.wmedef.ObjectRotationWME)localObject9).getObjectID() == ((Grace)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f2 = ((facade.characters.wmedef.ObjectRotationWME)localObject9).getY())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1058 */               if (!facade.util.Staging.isPointWithinCharCone(f8, f10, f4, f6, f2, 90.0F, 0.0F, 9999.0F))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1063 */                 if (facade.util.Staging.getXZDistanceBetweenPoints(f8, f10, f4, f6) < 200.0F)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1068 */                   return true;
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
/* 1090 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16387: 
/* 1101 */       localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("StagingInfoWME");
/* 1102 */       localListIterator3 = localLinkedList2.listIterator();
/* 1103 */       while (localListIterator3.hasNext()) {
/* 1104 */         localObject7 = (facade.characters.wmedef.StagingInfoWME)localListIterator3.next();
/* 1105 */         boolean bool; if (abl.runtime.BehavingEntity.constantTrue(bool = ((facade.characters.wmedef.StagingInfoWME)localObject7).getBObjMovedFromOrig()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1112 */           localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1113 */           localListIterator4 = localLinkedList3.listIterator();
/* 1114 */           for (; localListIterator4.hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1129 */               localListIterator5.hasNext())
/*      */           {
/* 1115 */             localObject8 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 1116 */             if ((((facade.characters.wmedef.ObjectPositionWME)localObject8).getObjectID() != ((Grace)paramBehavingEntity).me) || (!abl.runtime.BehavingEntity.constantTrue(f8 = ((facade.characters.wmedef.ObjectPositionWME)localObject8).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f10 = ((facade.characters.wmedef.ObjectPositionWME)localObject8).getZ()))) {
/*      */               break label3842;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1127 */             localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1128 */             localListIterator5 = localLinkedList4.listIterator();
/* 1129 */             continue;
/* 1130 */             localObject9 = (facade.characters.wmedef.ObjectPositionWME)localListIterator5.next();
/* 1131 */             if ((((facade.characters.wmedef.ObjectPositionWME)localObject9).getObjectID() == ((Grace)paramBehavingEntity).player) && (abl.runtime.BehavingEntity.constantTrue(f2 = ((facade.characters.wmedef.ObjectPositionWME)localObject9).getX())) && (abl.runtime.BehavingEntity.constantTrue(f6 = ((facade.characters.wmedef.ObjectPositionWME)localObject9).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1140 */               if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[1]).f = facade.util.Staging.getXZDistanceBetweenPoints(f8, f10, f2, f6)))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1145 */                 if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[2]).f = facade.util.Staging.getXZDistanceBetweenPoints(f8, f10, ((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[4]).f)))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1150 */                   if ((!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (bool) && ((((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[1]).f <= 150.0F) || (((abl.runtime.__ValueTypes.FloatVar)paramArrayOfObject[2]).f <= 150.0F)))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1155 */                     return true;
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
/* 1180 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16388: 
/* 1186 */       localLinkedList1 = wm.WorkingMemory.lookupWME("PlayerMemory", "IsPlayerTranslatingOrRotatingWME");
/* 1187 */       localListIterator1 = localLinkedList1.listIterator();
/* 1188 */       while (localListIterator1.hasNext()) {
/* 1189 */         localObject5 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localListIterator1.next();
/* 1190 */         if (((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localObject5).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1195 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1201 */       return false;
/*      */     
/*      */ 
/*      */     case 16466: 
/* 1205 */       if (System.currentTimeMillis() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[1]).l)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1210 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1214 */       return false;
/*      */     
/*      */ 
/*      */     case 16473: 
/* 1218 */       if (System.currentTimeMillis() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1223 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1227 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16487: 
/* 1233 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 1234 */       localListIterator1 = localLinkedList1.listIterator();
/* 1235 */       while (localListIterator1.hasNext()) {
/* 1236 */         localObject5 = (facade.characters.wmedef.ObjectRotationWME)localListIterator1.next();
/* 1237 */         if ((((facade.characters.wmedef.ObjectRotationWME)localObject5).getObjectID() == 47) && (((facade.characters.wmedef.ObjectRotationWME)localObject5).getY() <= ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1244 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1250 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 16636: 
/* 1256 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("UserTestWME");
/* 1257 */       localListIterator1 = localLinkedList1.listIterator();
/* 1258 */       while (localListIterator1.hasNext()) {
/* 1259 */         localObject5 = (facade.characters.wmedef.UserTestWME)localListIterator1.next();
/* 1260 */         if (((facade.characters.wmedef.UserTestWME)localObject5).getParam1() != -1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1265 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1271 */       return false;
/*      */     }
/*      */     
/* 1274 */     throw new abl.runtime.AblRuntimeError("Unexpected stepID " + paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\Grace_SuccessTests.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */