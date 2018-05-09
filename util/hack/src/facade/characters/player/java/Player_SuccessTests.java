/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ public class Player_SuccessTests implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants { public static boolean successTest0(int paramInt, Object[] paramArrayOfObject, abl.runtime.BehavingEntity paramBehavingEntity) { Object localObject1;
/*     */     Object localObject2;
/*     */     Object localObject3;
/*     */     java.util.LinkedList localLinkedList2;
/*     */     java.util.LinkedList localLinkedList3;
/*     */     java.util.LinkedList localLinkedList4;
/*     */     ListIterator localListIterator1;
/*     */     facade.characters.wmedef.ObjectPositionWME localObjectPositionWME1;
/*     */     float f3;
/*     */     float f6;
/*     */     java.util.LinkedList localLinkedList5;
/*     */     ListIterator localListIterator2;
/*  17 */     facade.characters.wmedef.ObjectRotationWME localObjectRotationWME; float f2; java.util.LinkedList localLinkedList6; ListIterator localListIterator3; facade.characters.wmedef.ObjectPositionWME localObjectPositionWME2; float f7; float f5; java.util.LinkedList localLinkedList7; ListIterator localListIterator4; facade.characters.wmedef.ObjectPositionWME localObjectPositionWME3; float f1; float f4; java.util.LinkedList localLinkedList8; ListIterator localListIterator5; OneCharacterVisibleInfoWME localOneCharacterVisibleInfoWME; float f8; switch (paramInt)
/*     */     {
/*     */ 
/*     */ 
/*     */     case 6: 
/*  22 */       java.util.LinkedList localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  23 */       localObject1 = localLinkedList1.listIterator();
/*  24 */       while (((ListIterator)localObject1).hasNext()) {
/*  25 */         localObject2 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)((ListIterator)localObject1).next();
/*  26 */         if (!((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localObject2).getB())
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  31 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*  37 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 32: 
/*  44 */       localObject1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectActivationWME");
/*  45 */       localObject2 = ((java.util.List)localObject1).listIterator();
/*  46 */       while (((ListIterator)localObject2).hasNext()) {
/*  47 */         localObject3 = (facade.characters.wmedef.ObjectActivationWME)((ListIterator)localObject2).next();
/*  48 */         int i; if ((((facade.characters.wmedef.ObjectActivationWME)localObject3).getActivatorID() == 2) && (abl.runtime.BehavingEntity.constantTrue(i = ((facade.characters.wmedef.ObjectActivationWME)localObject3).getActivationID())) && (((facade.characters.wmedef.ObjectActivationWME)localObject3).getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */           if (System.currentTimeMillis() - ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime > ((Player)paramBehavingEntity).g_physicallyFavorLatencyInMS)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  62 */             if ((i == 0) || (i == 2) || (i == 4))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*  67 */               return true;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       return false;
/*     */     
/*     */ 
/*     */     case 39: 
/*  83 */       if (System.currentTimeMillis() - ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime >= ((Player)paramBehavingEntity).g_physicallyFavorLatencyInMS)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  88 */         return true;
/*     */       }
/*     */       
/*     */ 
/*  92 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 40: 
/*  98 */       localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorWME");
/*  99 */       localObject1 = localLinkedList2.listIterator();
/* 100 */       while (((ListIterator)localObject1).hasNext()) {
/* 101 */         localObject2 = (facade.characters.wmedef.PhysicallyFavorWME)((ListIterator)localObject1).next();
/* 102 */         if ((((facade.characters.wmedef.PhysicallyFavorWME)localObject2).getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.PhysicallyFavorWME)localObject2).getFavoringCharID() == 2))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           return false;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 114 */       return true;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 45: 
/* 121 */       localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorWME");
/* 122 */       localObject1 = localLinkedList2.listIterator();
/* 123 */       while (((ListIterator)localObject1).hasNext()) {
/* 124 */         localObject2 = (facade.characters.wmedef.PhysicallyFavorWME)((ListIterator)localObject1).next();
/* 125 */         if (!((facade.characters.wmedef.PhysicallyFavorWME)localObject2).getHandled())
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 130 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 136 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 52: 
/* 142 */       localLinkedList2 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatCompletedWME");
/* 143 */       localObject1 = localLinkedList2.listIterator();
/* 144 */       while (((ListIterator)localObject1).hasNext()) {
/* 145 */         localObject2 = (dramaman.runtime.BeatCompletedWME)((ListIterator)localObject1).next();
/* 146 */         if (((dramaman.runtime.BeatCompletedWME)localObject2).getTimestamp() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 151 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 157 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 54: 
/* 163 */       localLinkedList2 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatStartWME");
/* 164 */       localObject1 = localLinkedList2.listIterator();
/* 165 */       while (((ListIterator)localObject1).hasNext()) {
/* 166 */         localObject2 = (dramaman.runtime.BeatStartWME)((ListIterator)localObject1).next();
/* 167 */         if (((dramaman.runtime.BeatStartWME)localObject2).getTimestamp() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 172 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 178 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 57: 
/* 185 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 186 */       localObject2 = ((java.util.List)localObject1).listIterator();
/* 187 */       while (((ListIterator)localObject2).hasNext()) {
/* 188 */         localObject3 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject2).next();
/* 189 */         int j; if (abl.runtime.BehavingEntity.constantTrue(j = ((dramaman.runtime.StoryStatusWME)localObject3).getAffinity()))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 194 */           if (((((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i <= -1) && (j <= -1)) || ((((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i >= 1) && (j >= 1)) || ((((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i == 0) && (j == 0)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 199 */             return true;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 59: 
/* 214 */       localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("SameAffinityBeatCounterWME");
/* 215 */       localObject1 = localLinkedList3.listIterator();
/* 216 */       while (((ListIterator)localObject1).hasNext()) {
/* 217 */         localObject2 = (SameAffinityBeatCounterWME)((ListIterator)localObject1).next();
/* 218 */         if ((((SameAffinityBeatCounterWME)localObject2).getTargetBeatCount() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((SameAffinityBeatCounterWME)localObject2).getCounter() >= ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((SameAffinityBeatCounterWME)localObject2).getTargetAffinity() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 233 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 61: 
/* 239 */       localLinkedList3 = wm.WorkingMemory.lookupWME("BeatMemory", "SameAffinityNBeatsWME");
/* 240 */       localObject1 = localLinkedList3.listIterator();
/* 241 */       while (((ListIterator)localObject1).hasNext()) {
/* 242 */         localObject2 = (facade.characters.wmedef.SameAffinityNBeatsWME)((ListIterator)localObject1).next();
/* 243 */         if ((((facade.characters.wmedef.SameAffinityNBeatsWME)localObject2).getBeatCount() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((facade.characters.wmedef.SameAffinityNBeatsWME)localObject2).getTargetAffinity() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[1]).i))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */           return false;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 255 */       return true;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 66: 
/* 270 */       localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 271 */       localListIterator1 = localLinkedList4.listIterator();
/* 272 */       for (; localListIterator1.hasNext(); 
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */           localListIterator2.hasNext())
/*     */       {
/* 273 */         localObjectPositionWME1 = (facade.characters.wmedef.ObjectPositionWME)localListIterator1.next();
/* 274 */         if ((localObjectPositionWME1.getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(f3 = localObjectPositionWME1.getX())) || (!abl.runtime.BehavingEntity.constantTrue(f6 = localObjectPositionWME1.getZ()))) {
/*     */           break label1381;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */         localLinkedList5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 286 */         localListIterator2 = localLinkedList5.listIterator();
/* 287 */         continue;
/* 288 */         localObjectRotationWME = (facade.characters.wmedef.ObjectRotationWME)localListIterator2.next();
/* 289 */         if ((localObjectRotationWME.getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f2 = localObjectRotationWME.getY())))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */           localLinkedList6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 299 */           localListIterator3 = localLinkedList6.listIterator();
/* 300 */           for (; localListIterator3.hasNext(); 
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */               localListIterator4.hasNext())
/*     */           {
/* 301 */             localObjectPositionWME2 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/* 302 */             if ((localObjectPositionWME2.getObjectID() != 1) || (!abl.runtime.BehavingEntity.constantTrue(f7 = localObjectPositionWME2.getX())) || (!abl.runtime.BehavingEntity.constantTrue(f5 = localObjectPositionWME2.getZ()))) {
/*     */               break label1361;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */             localLinkedList7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 314 */             localListIterator4 = localLinkedList7.listIterator();
/* 315 */             continue;
/* 316 */             localObjectPositionWME3 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 317 */             if ((localObjectPositionWME3.getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(f1 = localObjectPositionWME3.getX())) && (abl.runtime.BehavingEntity.constantTrue(f4 = localObjectPositionWME3.getZ())))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */               localLinkedList8 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("OneCharacterVisibleInfoWME");
/* 329 */               localListIterator5 = localLinkedList8.listIterator();
/* 330 */               while (localListIterator5.hasNext()) {
/* 331 */                 localOneCharacterVisibleInfoWME = (OneCharacterVisibleInfoWME)localListIterator5.next();
/* 332 */                 if (abl.runtime.BehavingEntity.constantTrue(f8 = localOneCharacterVisibleInfoWME.getLookDistance()))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 337 */                   if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b = facade.util.Staging.isPointWithinCharCone(f7, f5, f3, f6, f2, 45.0F, 0.0F, f8)))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 342 */                     if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b = facade.util.Staging.isPointWithinCharCone(f1, f4, f3, f6, f2, 45.0F, 0.0F, f8)))
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 347 */                       if (((((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b)) || ((!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b)) || ((((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[3]).i == 0)) || ((((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b) && (((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[3]).i == 1)))
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 352 */                         return true;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 68: 
/* 401 */       localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 402 */       localListIterator1 = localLinkedList4.listIterator();
/* 403 */       for (; localListIterator1.hasNext(); 
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */           localListIterator2.hasNext())
/*     */       {
/* 404 */         localObjectPositionWME1 = (facade.characters.wmedef.ObjectPositionWME)localListIterator1.next();
/* 405 */         if ((localObjectPositionWME1.getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(f3 = localObjectPositionWME1.getX())) || (!abl.runtime.BehavingEntity.constantTrue(f6 = localObjectPositionWME1.getZ()))) {
/*     */           break label1866;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */         localLinkedList5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 417 */         localListIterator2 = localLinkedList5.listIterator();
/* 418 */         continue;
/* 419 */         localObjectRotationWME = (facade.characters.wmedef.ObjectRotationWME)localListIterator2.next();
/* 420 */         if ((localObjectRotationWME.getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f2 = localObjectRotationWME.getY())))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */           localLinkedList6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 430 */           localListIterator3 = localLinkedList6.listIterator();
/* 431 */           for (; localListIterator3.hasNext(); 
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */               localListIterator4.hasNext())
/*     */           {
/* 432 */             localObjectPositionWME2 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/* 433 */             if ((localObjectPositionWME2.getObjectID() != 1) || (!abl.runtime.BehavingEntity.constantTrue(f7 = localObjectPositionWME2.getX())) || (!abl.runtime.BehavingEntity.constantTrue(f5 = localObjectPositionWME2.getZ()))) {
/*     */               break label1846;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */             localLinkedList7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 445 */             localListIterator4 = localLinkedList7.listIterator();
/* 446 */             continue;
/* 447 */             localObjectPositionWME3 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 448 */             if ((localObjectPositionWME3.getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(f1 = localObjectPositionWME3.getX())) && (abl.runtime.BehavingEntity.constantTrue(f4 = localObjectPositionWME3.getZ())))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */               localLinkedList8 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("OneCharacterVisibleInfoWME");
/* 460 */               localListIterator5 = localLinkedList8.listIterator();
/* 461 */               while (localListIterator5.hasNext()) {
/* 462 */                 localOneCharacterVisibleInfoWME = (OneCharacterVisibleInfoWME)localListIterator5.next();
/* 463 */                 if (abl.runtime.BehavingEntity.constantTrue(f8 = localOneCharacterVisibleInfoWME.getLookDistance()))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 468 */                   if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b = facade.util.Staging.isPointWithinCharCone(f7, f5, f3, f6, f2, 45.0F, 0.0F, f8)))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 473 */                     if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b = facade.util.Staging.isPointWithinCharCone(f1, f4, f3, f6, f2, 45.0F, 0.0F, f8)))
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 478 */                       if (((((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b)) || ((!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) && (((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[1]).b)))
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 483 */                         return true;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */       return false; case 75:  label1361:
/*     */       label1381:
/*     */       label1846:
/*     */       label1866:
/* 522 */       if (System.currentTimeMillis() > ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[1]).l)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 527 */         return true;
/*     */       }
/*     */       
/*     */ 
/* 531 */       return false;
/*     */     }
/*     */     
/* 534 */     throw new abl.runtime.AblRuntimeError("Unexpected stepID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_SuccessTests.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */