/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.__ValueTypes.FloatVar;
/*     */ 
/*     */ public class Player_ContextConditions implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants { public static boolean contextCondition0(int paramInt, Object[] paramArrayOfObject, abl.runtime.BehavingEntity paramBehavingEntity) { java.util.LinkedList localLinkedList1;
/*     */     java.util.ListIterator localListIterator1;
/*     */     Object localObject;
/*     */     java.util.LinkedList localLinkedList2;
/*     */     java.util.ListIterator localListIterator2;
/*     */     facade.characters.wmedef.ObjectRotationWME localObjectRotationWME;
/*     */     java.util.LinkedList localLinkedList3;
/*     */     java.util.ListIterator localListIterator3;
/*     */     facade.characters.wmedef.ObjectPositionWME localObjectPositionWME1;
/*     */     java.util.LinkedList localLinkedList4;
/*     */     java.util.ListIterator localListIterator4;
/*     */     facade.characters.wmedef.ObjectPositionWME localObjectPositionWME2;
/*  17 */     java.util.LinkedList localLinkedList5; java.util.ListIterator localListIterator5; facade.characters.wmedef.ObjectPositionWME localObjectPositionWME3; switch (paramInt)
/*     */     {
/*     */ 
/*     */ 
/*     */     case 7: 
/*  22 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  23 */       localListIterator1 = localLinkedList1.listIterator();
/*  24 */       while (localListIterator1.hasNext()) {
/*  25 */         localObject = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localListIterator1.next();
/*  26 */         if (!((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)localObject).getB())
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
/*     */     case 21: 
/*  43 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  44 */       localListIterator1 = localLinkedList1.listIterator();
/*  45 */       for (; localListIterator1.hasNext(); 
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
/*  60 */           localListIterator2.hasNext())
/*     */       {
/*  46 */         localObject = (facade.characters.wmedef.ObjectPositionWME)localListIterator1.next();
/*  47 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject).getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[5]).f = ((facade.characters.wmedef.ObjectPositionWME)localObject).getX())) || (!abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[8]).f = ((facade.characters.wmedef.ObjectPositionWME)localObject).getZ()))) {
/*     */           break label911;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  59 */         localListIterator2 = localLinkedList2.listIterator();
/*  60 */         continue;
/*  61 */         localObjectRotationWME = (facade.characters.wmedef.ObjectRotationWME)localListIterator2.next();
/*  62 */         if ((localObjectRotationWME.getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f = localObjectRotationWME.getY())))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */           localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  72 */           localListIterator3 = localLinkedList3.listIterator();
/*  73 */           while (localListIterator3.hasNext()) {
/*  74 */             localObjectPositionWME1 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/*  75 */             if ((localObjectPositionWME1.getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[11]).f = localObjectPositionWME1.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[9]).f = localObjectPositionWME1.getZ())))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */               if (facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[11]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, 45.0F, 0.0F, 9999.0F))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*  89 */                 if (facade.util.Staging.getXZDistanceBetweenPoints(((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[11]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f) < ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*  94 */                   if (System.currentTimeMillis() - ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime >= ((Player)paramBehavingEntity).g_physicallyFavorLatencyInMS)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */                     localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 102 */                     localListIterator4 = localLinkedList4.listIterator();
/* 103 */                     while (localListIterator4.hasNext()) {
/* 104 */                       localObjectPositionWME2 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 105 */                       if ((localObjectPositionWME2.getObjectID() == 1) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[10]).f = localObjectPositionWME2.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[7]).f = localObjectPositionWME2.getZ())))
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */                         if (!facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[10]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[7]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, 45.0F, 0.0F, 9999.0F))
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */                           localLinkedList5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 122 */                           localListIterator5 = localLinkedList5.listIterator();
/* 123 */                           while (localListIterator5.hasNext()) {
/* 124 */                             localObjectPositionWME3 = (facade.characters.wmedef.ObjectPositionWME)localListIterator5.next();
/* 125 */                             if ((localObjectPositionWME3.getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f = localObjectPositionWME3.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[6]).f = localObjectPositionWME3.getZ())))
/*     */                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */                               if (!facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[6]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, 45.0F, 0.0F, 9999.0F))
/*     */                               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */                                 java.util.LinkedList localLinkedList6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 142 */                                 java.util.ListIterator localListIterator6 = localLinkedList6.listIterator();
/* 143 */                                 while (localListIterator6.hasNext()) {
/* 144 */                                   facade.characters.wmedef.HeldObjectWME localHeldObjectWME = (facade.characters.wmedef.HeldObjectWME)localListIterator6.next();
/* 145 */                                   if (localHeldObjectWME.getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*     */                                   {
/*     */ 
/*     */ 
/*     */ 
/* 150 */                                     return false;
/*     */                                   }
/*     */                                 }
/*     */                                 
/*     */ 
/* 155 */                                 return true;
/*     */                               }
/*     */                             }
/*     */                           }
/*     */                         }
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
/*     */ 
/*     */ 
/*     */ 
/* 197 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 22: 
/* 203 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 204 */       localListIterator1 = localLinkedList1.listIterator();
/* 205 */       while (localListIterator1.hasNext()) {
/* 206 */         localObject = (facade.characters.wmedef.HeldObjectWME)localListIterator1.next();
/* 207 */         if (((facade.characters.wmedef.HeldObjectWME)localObject).getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 212 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 218 */       return false;
/*     */     case 23: 
/*     */       label911:
/*     */       
/*     */ 
/*     */ 
/* 224 */       localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 225 */       localListIterator1 = localLinkedList1.listIterator();
/* 226 */       label1834: for (; localListIterator1.hasNext(); 
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
/* 241 */           localListIterator2.hasNext())
/*     */       {
/* 227 */         localObject = (facade.characters.wmedef.ObjectPositionWME)localListIterator1.next();
/* 228 */         if ((((facade.characters.wmedef.ObjectPositionWME)localObject).getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[9]).f = ((facade.characters.wmedef.ObjectPositionWME)localObject).getX())) || (!abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[12]).f = ((facade.characters.wmedef.ObjectPositionWME)localObject).getZ()))) {
/*     */           break label1834;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */         localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 240 */         localListIterator2 = localLinkedList2.listIterator();
/* 241 */         continue;
/* 242 */         localObjectRotationWME = (facade.characters.wmedef.ObjectRotationWME)localListIterator2.next();
/* 243 */         if ((localObjectRotationWME.getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[8]).f = localObjectRotationWME.getY())))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */           localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 253 */           localListIterator3 = localLinkedList3.listIterator();
/* 254 */           while (localListIterator3.hasNext()) {
/* 255 */             localObjectPositionWME1 = (facade.characters.wmedef.ObjectPositionWME)localListIterator3.next();
/* 256 */             if ((localObjectPositionWME1.getObjectID() == ((abl.runtime.__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[15]).f = localObjectPositionWME1.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[13]).f = localObjectPositionWME1.getZ())))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */               if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[3]).b = facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[15]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[13]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[12]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, 45.0F, 0.0F, 9999.0F)))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 270 */                 if (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[2]).f = facade.util.Staging.getXZDistanceBetweenPoints(((__ValueTypes.FloatVar)paramArrayOfObject[9]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[12]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[15]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[13]).f)))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 275 */                   if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[6]).l = System.currentTimeMillis() - ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */                     localLinkedList4 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 283 */                     localListIterator4 = localLinkedList4.listIterator();
/* 284 */                     while (localListIterator4.hasNext()) {
/* 285 */                       localObjectPositionWME2 = (facade.characters.wmedef.ObjectPositionWME)localListIterator4.next();
/* 286 */                       if ((localObjectPositionWME2.getObjectID() == 1) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[14]).f = localObjectPositionWME2.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[11]).f = localObjectPositionWME2.getZ())))
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */                         if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[4]).b = facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[14]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[11]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[12]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, 45.0F, 0.0F, 9999.0F)))
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */                           localLinkedList5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 303 */                           localListIterator5 = localLinkedList5.listIterator();
/* 304 */                           while (localListIterator5.hasNext()) {
/* 305 */                             localObjectPositionWME3 = (facade.characters.wmedef.ObjectPositionWME)localListIterator5.next();
/* 306 */                             if ((localObjectPositionWME3.getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[7]).f = localObjectPositionWME3.getX())) && (abl.runtime.BehavingEntity.constantTrue(((__ValueTypes.FloatVar)paramArrayOfObject[10]).f = localObjectPositionWME3.getZ())))
/*     */                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */                               if (abl.runtime.BehavingEntity.constantTrue(((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[5]).b = facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[7]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[10]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[12]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, 45.0F, 0.0F, 9999.0F)))
/*     */                               {
/*     */ 
/*     */ 
/*     */ 
/* 320 */                                 if ((((__ValueTypes.FloatVar)paramArrayOfObject[2]).f > ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f) || (!((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[3]).b) || (((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[4]).b) || (((abl.runtime.__ValueTypes.BooleanVar)paramArrayOfObject[5]).b) || (((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[6]).l < ((Player)paramBehavingEntity).g_physicallyFavorLatencyInMS))
/*     */                                 {
/*     */ 
/*     */ 
/*     */ 
/* 325 */                                   return true;
/*     */                                 }
/*     */                               }
/*     */                             }
/*     */                           }
/*     */                         }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */       return false;
/*     */     }
/*     */     
/* 372 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_ContextConditions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */