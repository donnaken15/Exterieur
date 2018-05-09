/*      */ package facade.characters.player.java;
/*      */ 
/*      */ import java.util.ListIterator;
/*      */ 
/*      */ public class Player_Preconditions implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants { public static boolean precondition0(int paramInt, Object[] paramArrayOfObject, java.util.Hashtable paramHashtable, abl.runtime.BehavingEntity paramBehavingEntity) { Object localObject7;
/*      */     Object localObject13;
/*      */     Object localObject21;
/*      */     float f1;
/*      */     float f6;
/*      */     Object localObject26;
/*      */     Object localObject28;
/*      */     Object localObject30;
/*      */     Object localObject24;
/*      */     Object localObject32;
/*      */     Object localObject33;
/*      */     Object localObject34;
/*   17 */     Object localObject35; Object localObject36; Object localObject37; Object localObject38; Object localObject39; Object localObject40; Object localObject41; Object localObject42; Object localObject43; label772: Object localObject11; Object localObject18; label1214: Object localObject14; Object localObject22; float f7; Object localObject8; float f18; Object localObject44; Object localObject45; Object localObject46; Object localObject15; label2638: int i; boolean bool2; boolean bool5; Object localObject19; Object localObject9; boolean bool3; boolean bool7; float f24; label3489: float f9; label4368: Object localObject20; Object localObject23; Object localObject25; Object localObject27; Object localObject29; Object localObject31; label4695: int j; Object localObject16; int m; Object localObject12; Object localObject10; float f4; label5825: label5845: Object localObject17; boolean bool1; boolean bool4; label6373: java.util.List localList1; abl.runtime.CollectionBehaviorWME localCollectionBehaviorWME1; switch (paramInt)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 0: 
/*   24 */       localObject7 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerPositionWME");
/*   25 */       ListIterator localListIterator3 = ((java.util.List)localObject7).listIterator();
/*   26 */       while (localListIterator3.hasNext()) {
/*   27 */         localObject13 = (PreviousCachedPlayerPositionWME)localListIterator3.next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   33 */         return false;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   40 */       localObject13 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerPositionWME");
/*   41 */       ListIterator localListIterator7 = ((java.util.List)localObject13).listIterator();
/*   42 */       while (localListIterator7.hasNext()) {
/*   43 */         localObject21 = (CachedPlayerPositionWME)localListIterator7.next();
/*   44 */         if ((abl.runtime.BehavingEntity.constantTrue(f1 = ((CachedPlayerPositionWME)localObject21).getX())) && (abl.runtime.BehavingEntity.constantTrue(f6 = ((CachedPlayerPositionWME)localObject21).getZ())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   51 */           paramHashtable.put("playerX", new Float(f1));
/*   52 */           paramHashtable.put("playerZ", new Float(f6));
/*   53 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*   60 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 1: 
/*   74 */       localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingWME");
/*   75 */       localObject28 = ((java.util.List)localObject26).listIterator();
/*   76 */       while (((ListIterator)localObject28).hasNext()) {
/*   77 */         localObject30 = (facade.characters.wmedef.IsPlayerTranslatingWME)((ListIterator)localObject28).next();
/*   78 */         localObject24 = localObject30;
/*   79 */         if (!((facade.characters.wmedef.IsPlayerTranslatingWME)localObject30).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   86 */           localObject32 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerPositionWME");
/*   87 */           localObject33 = ((java.util.List)localObject32).listIterator();
/*   88 */           for (; ((ListIterator)localObject33).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  102 */               ((ListIterator)localObject36).hasNext())
/*      */           {
/*   89 */             localObject34 = (PreviousCachedPlayerPositionWME)((ListIterator)localObject33).next();
/*   90 */             localObject13 = localObject34;
/*   91 */             float f28; if ((!abl.runtime.BehavingEntity.constantTrue(f28 = ((PreviousCachedPlayerPositionWME)localObject34).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f6 = ((PreviousCachedPlayerPositionWME)localObject34).getZ()))) {
/*      */               break label772;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  100 */             localObject35 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerPositionWME");
/*  101 */             localObject36 = ((java.util.List)localObject35).listIterator();
/*  102 */             continue;
/*  103 */             localObject37 = (CachedPlayerPositionWME)((ListIterator)localObject36).next();
/*  104 */             float f17; if ((abl.runtime.BehavingEntity.constantTrue(f17 = ((CachedPlayerPositionWME)localObject37).getX())) && (abl.runtime.BehavingEntity.constantTrue(f1 = ((CachedPlayerPositionWME)localObject37).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  113 */               localObject38 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  114 */               localObject39 = ((java.util.List)localObject38).listIterator();
/*  115 */               for (; ((ListIterator)localObject39).hasNext(); 
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  127 */                   ((ListIterator)localObject42).hasNext())
/*      */               {
/*  116 */                 localObject40 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)((ListIterator)localObject39).next();
/*  117 */                 localObject21 = localObject40;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  125 */                 localObject41 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerSettledWME");
/*  126 */                 localObject42 = ((java.util.List)localObject41).listIterator();
/*  127 */                 continue;
/*  128 */                 localObject43 = (facade.characters.wmedef.IsPlayerSettledWME)((ListIterator)localObject42).next();
/*  129 */                 localObject7 = localObject43;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  135 */                 paramHashtable.put("settledWME", new abl.runtime.ObjectWrapper(localObject7));
/*  136 */                 paramHashtable.put("playerX2", new Float(f17));
/*  137 */                 paramHashtable.put("transWME", new abl.runtime.ObjectWrapper(localObject24));
/*  138 */                 paramHashtable.put("playerZ1", new Float(f6));
/*  139 */                 paramHashtable.put("prevWME", new abl.runtime.ObjectWrapper(localObject13));
/*  140 */                 paramHashtable.put("playerX1", new Float(f28));
/*  141 */                 paramHashtable.put("movWME", new abl.runtime.ObjectWrapper(localObject21));
/*  142 */                 paramHashtable.put("playerZ2", new Float(f1));
/*  143 */                 return true;
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
/*      */ 
/*      */ 
/*      */ 
/*  169 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2: 
/*  183 */       localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingWME");
/*  184 */       localObject28 = ((java.util.List)localObject26).listIterator();
/*  185 */       while (((ListIterator)localObject28).hasNext()) {
/*  186 */         localObject30 = (facade.characters.wmedef.IsPlayerTranslatingWME)((ListIterator)localObject28).next();
/*  187 */         localObject24 = localObject30;
/*  188 */         if (((facade.characters.wmedef.IsPlayerTranslatingWME)localObject30).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  195 */           localObject32 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerPositionWME");
/*  196 */           localObject33 = ((java.util.List)localObject32).listIterator();
/*  197 */           for (; ((ListIterator)localObject33).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  211 */               ((ListIterator)localObject36).hasNext())
/*      */           {
/*  198 */             localObject34 = (PreviousCachedPlayerPositionWME)((ListIterator)localObject33).next();
/*  199 */             localObject11 = localObject34;
/*  200 */             float f23; if ((!abl.runtime.BehavingEntity.constantTrue(f23 = ((PreviousCachedPlayerPositionWME)localObject34).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f6 = ((PreviousCachedPlayerPositionWME)localObject34).getZ()))) {
/*      */               break label1214;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  209 */             localObject35 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerPositionWME");
/*  210 */             localObject36 = ((java.util.List)localObject35).listIterator();
/*  211 */             continue;
/*  212 */             localObject37 = (CachedPlayerPositionWME)((ListIterator)localObject36).next();
/*  213 */             float f12; if ((abl.runtime.BehavingEntity.constantTrue(f12 = ((CachedPlayerPositionWME)localObject37).getX())) && (abl.runtime.BehavingEntity.constantTrue(f1 = ((CachedPlayerPositionWME)localObject37).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  222 */               localObject38 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  223 */               localObject39 = ((java.util.List)localObject38).listIterator();
/*  224 */               for (; ((ListIterator)localObject39).hasNext(); 
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  236 */                   ((ListIterator)localObject42).hasNext())
/*      */               {
/*  225 */                 localObject40 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)((ListIterator)localObject39).next();
/*  226 */                 localObject18 = localObject40;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */                 localObject41 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerRotatingWME");
/*  235 */                 localObject42 = ((java.util.List)localObject41).listIterator();
/*  236 */                 continue;
/*  237 */                 localObject43 = (facade.characters.wmedef.IsPlayerRotatingWME)((ListIterator)localObject42).next();
/*  238 */                 boolean bool9; if (abl.runtime.BehavingEntity.constantTrue(bool9 = ((facade.characters.wmedef.IsPlayerRotatingWME)localObject43).getB()))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  243 */                   paramHashtable.put("playerX2", new Float(f12));
/*  244 */                   paramHashtable.put("transWME", new abl.runtime.ObjectWrapper(localObject24));
/*  245 */                   paramHashtable.put("playerZ1", new Float(f6));
/*  246 */                   paramHashtable.put("prevWME", new abl.runtime.ObjectWrapper(localObject11));
/*  247 */                   paramHashtable.put("playerX1", new Float(f23));
/*  248 */                   paramHashtable.put("movWME", new abl.runtime.ObjectWrapper(localObject18));
/*  249 */                   paramHashtable.put("bRotating", new Boolean(bool9));
/*  250 */                   paramHashtable.put("playerZ2", new Float(f1));
/*  251 */                   return true;
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
/*      */ 
/*      */ 
/*  277 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/*  284 */       java.util.LinkedList localLinkedList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerRotationWME");
/*  285 */       ListIterator localListIterator1 = localLinkedList1.listIterator();
/*  286 */       while (localListIterator1.hasNext()) {
/*  287 */         localObject11 = (PreviousCachedPlayerRotationWME)localListIterator1.next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  293 */         return false;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  300 */       localObject11 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerRotationWME");
/*  301 */       localObject14 = ((java.util.List)localObject11).listIterator();
/*  302 */       while (((ListIterator)localObject14).hasNext()) {
/*  303 */         localObject18 = (CachedPlayerRotationWME)((ListIterator)localObject14).next();
/*  304 */         if (abl.runtime.BehavingEntity.constantTrue(f1 = ((CachedPlayerRotationWME)localObject18).getY()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  309 */           paramHashtable.put("playerYRot", new Float(f1));
/*  310 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  317 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 4: 
/*  329 */       localObject22 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerRotatingWME");
/*  330 */       localObject24 = ((java.util.List)localObject22).listIterator();
/*  331 */       while (((ListIterator)localObject24).hasNext()) {
/*  332 */         localObject26 = (facade.characters.wmedef.IsPlayerRotatingWME)((ListIterator)localObject24).next();
/*  333 */         localObject18 = localObject26;
/*  334 */         if (!((facade.characters.wmedef.IsPlayerRotatingWME)localObject26).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  341 */           localObject28 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerRotationWME");
/*  342 */           localObject30 = ((java.util.List)localObject28).listIterator();
/*  343 */           while (((ListIterator)localObject30).hasNext()) {
/*  344 */             localObject32 = (PreviousCachedPlayerRotationWME)((ListIterator)localObject30).next();
/*  345 */             localObject11 = localObject32;
/*  346 */             if (abl.runtime.BehavingEntity.constantTrue(f7 = ((PreviousCachedPlayerRotationWME)localObject32).getY()))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  353 */               localObject33 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerRotationWME");
/*  354 */               localObject34 = ((java.util.List)localObject33).listIterator();
/*  355 */               while (((ListIterator)localObject34).hasNext()) {
/*  356 */                 localObject35 = (CachedPlayerRotationWME)((ListIterator)localObject34).next();
/*  357 */                 float f13; if (abl.runtime.BehavingEntity.constantTrue(f13 = ((CachedPlayerRotationWME)localObject35).getY()))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  364 */                   localObject36 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  365 */                   localObject37 = ((java.util.List)localObject36).listIterator();
/*  366 */                   for (; ((ListIterator)localObject37).hasNext(); 
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  378 */                       ((ListIterator)localObject40).hasNext())
/*      */                   {
/*  367 */                     localObject38 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)((ListIterator)localObject37).next();
/*  368 */                     localObject14 = localObject38;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  376 */                     localObject39 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerSettledWME");
/*  377 */                     localObject40 = ((java.util.List)localObject39).listIterator();
/*  378 */                     continue;
/*  379 */                     localObject41 = (facade.characters.wmedef.IsPlayerSettledWME)((ListIterator)localObject40).next();
/*  380 */                     Object localObject1 = localObject41;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  386 */                     paramHashtable.put("settledWME", new abl.runtime.ObjectWrapper(localObject1));
/*  387 */                     paramHashtable.put("playerYRot2", new Float(f13));
/*  388 */                     paramHashtable.put("prevWME", new abl.runtime.ObjectWrapper(localObject11));
/*  389 */                     paramHashtable.put("movWME", new abl.runtime.ObjectWrapper(localObject14));
/*  390 */                     paramHashtable.put("rotWME", new abl.runtime.ObjectWrapper(localObject18));
/*  391 */                     paramHashtable.put("playerYRot1", new Float(f7));
/*  392 */                     return true;
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
/*      */ 
/*  418 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 5: 
/*  430 */       localObject22 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerRotatingWME");
/*  431 */       localObject24 = ((java.util.List)localObject22).listIterator();
/*  432 */       while (((ListIterator)localObject24).hasNext()) {
/*  433 */         localObject26 = (facade.characters.wmedef.IsPlayerRotatingWME)((ListIterator)localObject24).next();
/*  434 */         localObject18 = localObject26;
/*  435 */         if (((facade.characters.wmedef.IsPlayerRotatingWME)localObject26).getB())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  442 */           localObject28 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PreviousCachedPlayerRotationWME");
/*  443 */           localObject30 = ((java.util.List)localObject28).listIterator();
/*  444 */           while (((ListIterator)localObject30).hasNext()) {
/*  445 */             localObject32 = (PreviousCachedPlayerRotationWME)((ListIterator)localObject30).next();
/*  446 */             localObject8 = localObject32;
/*  447 */             float f2; if (abl.runtime.BehavingEntity.constantTrue(f2 = ((PreviousCachedPlayerRotationWME)localObject32).getY()))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  454 */               localObject33 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerRotationWME");
/*  455 */               localObject34 = ((java.util.List)localObject33).listIterator();
/*  456 */               while (((ListIterator)localObject34).hasNext()) {
/*  457 */                 localObject35 = (CachedPlayerRotationWME)((ListIterator)localObject34).next();
/*  458 */                 if (abl.runtime.BehavingEntity.constantTrue(f7 = ((CachedPlayerRotationWME)localObject35).getY()))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  465 */                   localObject36 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingOrRotatingWME");
/*  466 */                   localObject37 = ((java.util.List)localObject36).listIterator();
/*  467 */                   for (; ((ListIterator)localObject37).hasNext(); 
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  479 */                       ((ListIterator)localObject40).hasNext())
/*      */                   {
/*  468 */                     localObject38 = (facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)((ListIterator)localObject37).next();
/*  469 */                     localObject11 = localObject38;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  477 */                     localObject39 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerTranslatingWME");
/*  478 */                     localObject40 = ((java.util.List)localObject39).listIterator();
/*  479 */                     continue;
/*  480 */                     localObject41 = (facade.characters.wmedef.IsPlayerTranslatingWME)((ListIterator)localObject40).next();
/*  481 */                     boolean bool8; if (abl.runtime.BehavingEntity.constantTrue(bool8 = ((facade.characters.wmedef.IsPlayerTranslatingWME)localObject41).getB()))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  486 */                       paramHashtable.put("playerYRot2", new Float(f7));
/*  487 */                       paramHashtable.put("prevWME", new abl.runtime.ObjectWrapper(localObject8));
/*  488 */                       paramHashtable.put("bTranslating", new Boolean(bool8));
/*  489 */                       paramHashtable.put("movWME", new abl.runtime.ObjectWrapper(localObject11));
/*  490 */                       paramHashtable.put("rotWME", new abl.runtime.ObjectWrapper(localObject18));
/*  491 */                       paramHashtable.put("playerYRot1", new Float(f2));
/*  492 */                       return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */     case 7: 
/*  525 */       java.util.LinkedList localLinkedList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("IsPlayerSettledWME");
/*  526 */       localObject8 = localLinkedList2.listIterator();
/*  527 */       while (((ListIterator)localObject8).hasNext()) {
/*  528 */         localObject11 = (facade.characters.wmedef.IsPlayerSettledWME)((ListIterator)localObject8).next();
/*  529 */         Object localObject2 = localObject11;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */         paramHashtable.put("settledWME", new abl.runtime.ObjectWrapper(localObject2));
/*  536 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  542 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 9: 
/*  556 */       localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerPositionWME");
/*  557 */       localObject28 = ((java.util.List)localObject26).listIterator();
/*  558 */       for (; ((ListIterator)localObject28).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  573 */           ((ListIterator)localObject33).hasNext())
/*      */       {
/*  559 */         localObject30 = (facade.characters.wmedef.PlayerPositionWME)((ListIterator)localObject28).next();
/*  560 */         float f3; float f29; if ((!abl.runtime.BehavingEntity.constantTrue(f3 = ((facade.characters.wmedef.PlayerPositionWME)localObject30).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f18 = ((facade.characters.wmedef.PlayerPositionWME)localObject30).getY())) || (!abl.runtime.BehavingEntity.constantTrue(f29 = ((facade.characters.wmedef.PlayerPositionWME)localObject30).getZ()))) {
/*      */           break label2638;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  571 */         localObject32 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerRotationWME");
/*  572 */         localObject33 = ((java.util.List)localObject32).listIterator();
/*  573 */         continue;
/*  574 */         localObject34 = (facade.characters.wmedef.PlayerRotationWME)((ListIterator)localObject33).next();
/*  575 */         float f8; if (abl.runtime.BehavingEntity.constantTrue(f8 = ((facade.characters.wmedef.PlayerRotationWME)localObject34).getY()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */           localObject35 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerPositionWME");
/*  583 */           localObject36 = ((java.util.List)localObject35).listIterator();
/*  584 */           for (; ((ListIterator)localObject36).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  596 */               ((ListIterator)localObject39).hasNext())
/*      */           {
/*  585 */             localObject37 = (CachedPlayerPositionWME)((ListIterator)localObject36).next();
/*  586 */             localObject8 = localObject37;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  594 */             localObject38 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("CachedPlayerRotationWME");
/*  595 */             localObject39 = ((java.util.List)localObject38).listIterator();
/*  596 */             continue;
/*  597 */             localObject40 = (CachedPlayerRotationWME)((ListIterator)localObject39).next();
/*  598 */             localObject22 = localObject40;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  606 */             localObject41 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerFuturePositionWME");
/*  607 */             localObject42 = ((java.util.List)localObject41).listIterator();
/*  608 */             for (; ((ListIterator)localObject42).hasNext(); 
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  620 */                 ((ListIterator)localObject45).hasNext())
/*      */             {
/*  609 */               localObject43 = (facade.characters.wmedef.PlayerFuturePositionWME)((ListIterator)localObject42).next();
/*  610 */               localObject24 = localObject43;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  618 */               localObject44 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerFutureRotationWME");
/*  619 */               localObject45 = ((java.util.List)localObject44).listIterator();
/*  620 */               continue;
/*  621 */               localObject46 = (facade.characters.wmedef.PlayerFutureRotationWME)((ListIterator)localObject45).next();
/*  622 */               localObject15 = localObject46;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  628 */               paramHashtable.put("playerZPos", new Float(f29));
/*  629 */               paramHashtable.put("cachedPlayerPositionWME", new abl.runtime.ObjectWrapper(localObject8));
/*  630 */               paramHashtable.put("playerYPos", new Float(f18));
/*  631 */               paramHashtable.put("playerFutureRotationWME", new abl.runtime.ObjectWrapper(localObject15));
/*  632 */               paramHashtable.put("playerFuturePositionWME", new abl.runtime.ObjectWrapper(localObject24));
/*  633 */               paramHashtable.put("playerXPos", new Float(f3));
/*  634 */               paramHashtable.put("cachedPlayerRotationWME", new abl.runtime.ObjectWrapper(localObject22));
/*  635 */               paramHashtable.put("playerYRot", new Float(f8));
/*  636 */               return true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  667 */       return false;
/*      */     
/*      */ 
/*      */     case 10: 
/*  671 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*  672 */       bool2 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/*  673 */       bool5 = ((Boolean)paramArrayOfObject[2]).booleanValue();
/*  674 */       f18 = ((Float)paramArrayOfObject[3]).floatValue();
/*  675 */       if ((bool2) && (bool5))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  680 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  684 */       return false;
/*      */     
/*      */ 
/*      */     case 11: 
/*  688 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*  689 */       bool2 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/*  690 */       bool5 = ((Boolean)paramArrayOfObject[2]).booleanValue();
/*  691 */       f18 = ((Float)paramArrayOfObject[3]).floatValue();
/*  692 */       if ((bool2) && (!bool5))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  697 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  701 */       return false;
/*      */     
/*      */ 
/*      */     case 12: 
/*  705 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*  706 */       bool2 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/*  707 */       bool5 = ((Boolean)paramArrayOfObject[2]).booleanValue();
/*  708 */       f18 = ((Float)paramArrayOfObject[3]).floatValue();
/*  709 */       if ((!bool2) && (bool5))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  714 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  718 */       return false;
/*      */     
/*      */ 
/*      */     case 13: 
/*  722 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*  723 */       bool2 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/*  724 */       bool5 = ((Boolean)paramArrayOfObject[2]).booleanValue();
/*  725 */       f18 = ((Float)paramArrayOfObject[3]).floatValue();
/*  726 */       if ((!bool2) && (!bool5))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  731 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  735 */       return false;
/*      */     
/*      */ 
/*      */     case 15: 
/*  739 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  744 */       java.util.List localList2 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "csPlayerPhysicallyFavors(int, boolean, boolean, float)");
/*  745 */       localObject15 = localList2.listIterator();
/*  746 */       while (((ListIterator)localObject15).hasNext()) {
/*  747 */         localObject19 = (abl.runtime.GoalStepWME)((ListIterator)localObject15).next();
/*  748 */         Object localObject4 = localObject19;
/*  749 */         if ((((abl.runtime.GoalStepWME)localObject19).getSignature().equals("csPlayerPhysicallyFavors(int, boolean, boolean, float)")) && (abl.runtime.BehavingEntity.constantTrue(localObject9 = ((abl.runtime.GoalStepWME)localObject19).getProperty("physicallyFavorsID"))))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  756 */           if (((Integer)localObject9).intValue() == i)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  761 */             paramHashtable.put("objID", new abl.runtime.ObjectWrapper(localObject9));
/*  762 */             paramHashtable.put("gWME", new abl.runtime.ObjectWrapper(localObject4));
/*  763 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  772 */       return false;
/*      */     
/*      */ 
/*      */     case 17: 
/*  776 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  783 */       localObject19 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("CollectionBehaviorWME", "OverallControl_Body()");
/*  784 */       localObject22 = ((java.util.List)localObject19).listIterator();
/*  785 */       while (((ListIterator)localObject22).hasNext()) {
/*  786 */         localObject24 = (abl.runtime.CollectionBehaviorWME)((ListIterator)localObject22).next();
/*  787 */         localObject9 = localObject24;
/*  788 */         if (((abl.runtime.CollectionBehaviorWME)localObject24).getSignature().equals("OverallControl_Body()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  795 */           localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorInfoWME");
/*  796 */           localObject28 = ((java.util.List)localObject26).listIterator();
/*  797 */           while (((ListIterator)localObject28).hasNext()) {
/*  798 */             localObject30 = (PhysicallyFavorInfoWME)((ListIterator)localObject28).next();
/*  799 */             if ((((PhysicallyFavorInfoWME)localObject30).getSpriteID() == i) && (abl.runtime.BehavingEntity.constantTrue(bool3 = ((PhysicallyFavorInfoWME)localObject30).getLookAtSensorActive())) && (abl.runtime.BehavingEntity.constantTrue(bool7 = ((PhysicallyFavorInfoWME)localObject30).getObjectActivateSensorActive())) && (abl.runtime.BehavingEntity.constantTrue(f24 = ((PhysicallyFavorInfoWME)localObject30).getLookDistance())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */               paramHashtable.put("lDistance", new Float(f24));
/*  811 */               paramHashtable.put("objectActivateActive", new Boolean(bool7));
/*  812 */               paramHashtable.put("overallControl_Body", new abl.runtime.ObjectWrapper(localObject9));
/*  813 */               paramHashtable.put("lookActive", new Boolean(bool3));
/*  814 */               return true;
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
/*  825 */       return false;
/*      */     
/*      */ 
/*      */     case 18: 
/*  829 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  836 */       localObject19 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorInfoWME");
/*  837 */       localObject22 = ((java.util.List)localObject19).listIterator();
/*  838 */       for (; ((ListIterator)localObject22).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  855 */           ((ListIterator)localObject28).hasNext())
/*      */       {
/*  839 */         localObject24 = (PhysicallyFavorInfoWME)((ListIterator)localObject22).next();
/*  840 */         if ((((PhysicallyFavorInfoWME)localObject24).getSpriteID() != i) || (!abl.runtime.BehavingEntity.constantTrue(bool3 = ((PhysicallyFavorInfoWME)localObject24).getLookAtSensorActive())) || (!abl.runtime.BehavingEntity.constantTrue(bool7 = ((PhysicallyFavorInfoWME)localObject24).getObjectActivateSensorActive())) || (!abl.runtime.BehavingEntity.constantTrue(f24 = ((PhysicallyFavorInfoWME)localObject24).getLookDistance()))) {
/*      */           break label3489;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  853 */         localObject26 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("CollectionBehaviorWME", "OverallControl_Body()");
/*  854 */         localObject28 = ((java.util.List)localObject26).listIterator();
/*  855 */         continue;
/*  856 */         localObject30 = (abl.runtime.CollectionBehaviorWME)((ListIterator)localObject28).next();
/*  857 */         localObject9 = localObject30;
/*  858 */         if (((abl.runtime.CollectionBehaviorWME)localObject30).getSignature().equals("OverallControl_Body()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  863 */           paramHashtable.put("lDistance", new Float(f24));
/*  864 */           paramHashtable.put("objectActivateActive", new Boolean(bool7));
/*  865 */           paramHashtable.put("overallControl_Body", new abl.runtime.ObjectWrapper(localObject9));
/*  866 */           paramHashtable.put("lookActive", new Boolean(bool3));
/*  867 */           return true;
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
/*  878 */       return false;
/*      */     
/*      */ 
/*      */     case 19: 
/*  882 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  887 */       java.util.List localList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("GoalStepWME", "TurnPhysicallyFavorsBackOnAfterTimeout_Demon(int, int)");
/*  888 */       ListIterator localListIterator6 = localList3.listIterator();
/*  889 */       while (localListIterator6.hasNext()) {
/*  890 */         localObject19 = (abl.runtime.GoalStepWME)localListIterator6.next();
/*  891 */         Object localObject5 = localObject19;
/*  892 */         if ((((abl.runtime.GoalStepWME)localObject19).getSignature().equals("TurnPhysicallyFavorsBackOnAfterTimeout_Demon(int, int)")) && (abl.runtime.BehavingEntity.constantTrue(localObject9 = ((abl.runtime.GoalStepWME)localObject19).getProperty("physicallyFavorsID"))))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  899 */           if (((Integer)localObject9).intValue() == i)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  904 */             paramHashtable.put("objID", new abl.runtime.ObjectWrapper(localObject9));
/*  905 */             paramHashtable.put("gWME", new abl.runtime.ObjectWrapper(localObject5));
/*  906 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  915 */       return false;
/*      */     
/*      */ 
/*      */     case 21: 
/*  919 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*  920 */       f9 = ((Float)paramArrayOfObject[1]).floatValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  932 */       localObject32 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  933 */       localObject33 = ((java.util.List)localObject32).listIterator();
/*  934 */       for (; ((ListIterator)localObject33).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  949 */           ((ListIterator)localObject36).hasNext())
/*      */       {
/*  935 */         localObject34 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject33).next();
/*  936 */         float f25; float f34; if ((((facade.characters.wmedef.ObjectPositionWME)localObject34).getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(f25 = ((facade.characters.wmedef.ObjectPositionWME)localObject34).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f34 = ((facade.characters.wmedef.ObjectPositionWME)localObject34).getZ()))) {
/*      */           break label4368;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  947 */         localObject35 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/*  948 */         localObject36 = ((java.util.List)localObject35).listIterator();
/*  949 */         continue;
/*  950 */         localObject37 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject36).next();
/*  951 */         float f19; if ((((facade.characters.wmedef.ObjectRotationWME)localObject37).getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f19 = ((facade.characters.wmedef.ObjectRotationWME)localObject37).getY())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  960 */           localObject38 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  961 */           localObject39 = ((java.util.List)localObject38).listIterator();
/*  962 */           while (((ListIterator)localObject39).hasNext()) {
/*  963 */             localObject40 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject39).next();
/*  964 */             float f38; float f36; if ((((facade.characters.wmedef.ObjectPositionWME)localObject40).getObjectID() == i) && (abl.runtime.BehavingEntity.constantTrue(f38 = ((facade.characters.wmedef.ObjectPositionWME)localObject40).getX())) && (abl.runtime.BehavingEntity.constantTrue(f36 = ((facade.characters.wmedef.ObjectPositionWME)localObject40).getZ())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  973 */               if (facade.util.Staging.isPointWithinCharCone(f38, f36, f25, f34, f19, 45.0F, 0.0F, 9999.0F))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  978 */                 if (facade.util.Staging.getXZDistanceBetweenPoints(f25, f34, f38, f36) < f9)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  983 */                   if (System.currentTimeMillis() - ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime >= ((Player)paramBehavingEntity).g_physicallyFavorLatencyInMS)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  990 */                     localObject41 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/*  991 */                     localObject42 = ((java.util.List)localObject41).listIterator();
/*  992 */                     while (((ListIterator)localObject42).hasNext()) {
/*  993 */                       localObject43 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject42).next();
/*  994 */                       float f37; float f32; if ((((facade.characters.wmedef.ObjectPositionWME)localObject43).getObjectID() == 1) && (abl.runtime.BehavingEntity.constantTrue(f37 = ((facade.characters.wmedef.ObjectPositionWME)localObject43).getX())) && (abl.runtime.BehavingEntity.constantTrue(f32 = ((facade.characters.wmedef.ObjectPositionWME)localObject43).getZ())))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1003 */                         if (!facade.util.Staging.isPointWithinCharCone(f37, f32, f25, f34, f19, 45.0F, 0.0F, 9999.0F))
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1010 */                           localObject44 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1011 */                           localObject45 = ((java.util.List)localObject44).listIterator();
/* 1012 */                           while (((ListIterator)localObject45).hasNext()) {
/* 1013 */                             localObject46 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject45).next();
/* 1014 */                             float f14; float f30; if ((((facade.characters.wmedef.ObjectPositionWME)localObject46).getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(f14 = ((facade.characters.wmedef.ObjectPositionWME)localObject46).getX())) && (abl.runtime.BehavingEntity.constantTrue(f30 = ((facade.characters.wmedef.ObjectPositionWME)localObject46).getZ())))
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1023 */                               if (!facade.util.Staging.isPointWithinCharCone(f14, f30, f25, f34, f19, 45.0F, 0.0F, 9999.0F))
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1030 */                                 java.util.LinkedList localLinkedList6 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 1031 */                                 ListIterator localListIterator9 = localLinkedList6.listIterator();
/* 1032 */                                 while (localListIterator9.hasNext()) {
/* 1033 */                                   facade.characters.wmedef.HeldObjectWME localHeldObjectWME2 = (facade.characters.wmedef.HeldObjectWME)localListIterator9.next();
/* 1034 */                                   if (localHeldObjectWME2.getObjectID() == i)
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/* 1039 */                                     return false;
/*      */                                   }
/*      */                                 }
/*      */                                 
/*      */ 
/* 1044 */                                 paramHashtable.put("playerX", new Float(f25));
/* 1045 */                                 paramHashtable.put("graceX", new Float(f14));
/* 1046 */                                 paramHashtable.put("objX", new Float(f38));
/* 1047 */                                 paramHashtable.put("tripZ", new Float(f32));
/* 1048 */                                 paramHashtable.put("objZ", new Float(f36));
/* 1049 */                                 paramHashtable.put("playerRotY", new Float(f19));
/* 1050 */                                 paramHashtable.put("playerZ", new Float(f34));
/* 1051 */                                 paramHashtable.put("tripX", new Float(f37));
/* 1052 */                                 paramHashtable.put("graceZ", new Float(f30));
/* 1053 */                                 return true;
/*      */                               }
/*      */                             }
/*      */                           }
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
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1095 */       return false;
/*      */     
/*      */ 
/*      */     case 22: 
/* 1099 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/* 1100 */       f9 = ((Float)paramArrayOfObject[1]).floatValue();
/*      */       
/*      */ 
/* 1103 */       java.util.LinkedList localLinkedList3 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME");
/* 1104 */       ListIterator localListIterator4 = localLinkedList3.listIterator();
/* 1105 */       while (localListIterator4.hasNext()) {
/* 1106 */         facade.characters.wmedef.HeldObjectWME localHeldObjectWME1 = (facade.characters.wmedef.HeldObjectWME)localListIterator4.next();
/* 1107 */         if (localHeldObjectWME1.getObjectID() == i)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1112 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1118 */       return false;
/*      */     
/*      */ 
/*      */     case 25: 
/* 1122 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1129 */       localObject20 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1130 */       localObject23 = ((java.util.List)localObject20).listIterator();
/* 1131 */       for (; ((ListIterator)localObject23).hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1146 */           ((ListIterator)localObject29).hasNext())
/*      */       {
/* 1132 */         localObject25 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject23).next();
/* 1133 */         float f26; float f20; if ((((facade.characters.wmedef.ObjectPositionWME)localObject25).getObjectID() != i) || (!abl.runtime.BehavingEntity.constantTrue(f26 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f20 = ((facade.characters.wmedef.ObjectPositionWME)localObject25).getZ()))) {
/*      */           break label4695;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1144 */         localObject27 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1145 */         localObject29 = ((java.util.List)localObject27).listIterator();
/* 1146 */         continue;
/* 1147 */         localObject31 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject29).next();
/* 1148 */         float f15; if ((((facade.characters.wmedef.ObjectPositionWME)localObject31).getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f9 = ((facade.characters.wmedef.ObjectPositionWME)localObject31).getX())) && (abl.runtime.BehavingEntity.constantTrue(f15 = ((facade.characters.wmedef.ObjectPositionWME)localObject31).getZ())))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1157 */           paramHashtable.put("playerX", new Float(f9));
/* 1158 */           paramHashtable.put("objX", new Float(f26));
/* 1159 */           paramHashtable.put("objZ", new Float(f20));
/* 1160 */           paramHashtable.put("playerZ", new Float(f15));
/* 1161 */           return true;
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
/* 1172 */       return false;
/*      */     
/*      */ 
/*      */     case 29: 
/* 1176 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/* 1177 */       j = ((Integer)paramArrayOfObject[1]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1182 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1183 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1184 */       while (((ListIterator)localObject20).hasNext()) {
/* 1185 */         localObject23 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject20).next();
/* 1186 */         if (abl.runtime.BehavingEntity.constantTrue(m = ((dramaman.runtime.StoryStatusWME)localObject23).getAffinity()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1191 */           if (((j <= -1) && (m <= -1)) || ((j >= 1) && (m >= 1)) || ((j == 0) && (m == 0)))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1198 */             localObject25 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("SameAffinityBeatCounterWME");
/* 1199 */             localObject27 = ((java.util.List)localObject25).listIterator();
/* 1200 */             while (((ListIterator)localObject27).hasNext()) {
/* 1201 */               localObject29 = (SameAffinityBeatCounterWME)((ListIterator)localObject27).next();
/* 1202 */               localObject12 = localObject29;
/* 1203 */               if ((((SameAffinityBeatCounterWME)localObject29).getTargetBeatCount() == i) && (((SameAffinityBeatCounterWME)localObject29).getTargetAffinity() == j))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1210 */                 paramHashtable.put("currentAffinity", new Integer(m));
/* 1211 */                 paramHashtable.put("affinityCounter", new abl.runtime.ObjectWrapper(localObject12));
/* 1212 */                 return true;
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
/* 1226 */       return false;
/*      */     
/*      */ 
/*      */     case 30: 
/* 1230 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/* 1231 */       j = ((Integer)paramArrayOfObject[1]).intValue();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1236 */       localObject16 = wm.WorkingMemory.lookupWME("StoryMemory", "StoryStatusWME");
/* 1237 */       localObject20 = ((java.util.List)localObject16).listIterator();
/* 1238 */       while (((ListIterator)localObject20).hasNext()) {
/* 1239 */         localObject23 = (dramaman.runtime.StoryStatusWME)((ListIterator)localObject20).next();
/* 1240 */         if (abl.runtime.BehavingEntity.constantTrue(m = ((dramaman.runtime.StoryStatusWME)localObject23).getAffinity()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1247 */           localObject25 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("SameAffinityBeatCounterWME");
/* 1248 */           localObject27 = ((java.util.List)localObject25).listIterator();
/* 1249 */           while (((ListIterator)localObject27).hasNext()) {
/* 1250 */             localObject29 = (SameAffinityBeatCounterWME)((ListIterator)localObject27).next();
/* 1251 */             localObject12 = localObject29;
/* 1252 */             if ((((SameAffinityBeatCounterWME)localObject29).getTargetBeatCount() == i) && (((SameAffinityBeatCounterWME)localObject29).getTargetAffinity() == j))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1259 */               paramHashtable.put("currentAffinity", new Integer(m));
/* 1260 */               paramHashtable.put("affinityCounter", new abl.runtime.ObjectWrapper(localObject12));
/* 1261 */               return true;
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
/* 1272 */       return false;
/*      */     
/*      */ 
/*      */     case 31: 
/* 1276 */       i = ((Integer)paramArrayOfObject[0]).intValue();
/* 1277 */       j = ((Integer)paramArrayOfObject[1]).intValue();
/*      */       
/*      */ 
/*      */ 
/* 1281 */       localObject12 = wm.WorkingMemory.lookupWME("BeatMemory", "SameAffinityNBeatsWME");
/* 1282 */       localObject16 = ((java.util.List)localObject12).listIterator();
/* 1283 */       while (((ListIterator)localObject16).hasNext()) {
/* 1284 */         localObject20 = (facade.characters.wmedef.SameAffinityNBeatsWME)((ListIterator)localObject16).next();
/* 1285 */         localObject10 = localObject20;
/* 1286 */         if ((((facade.characters.wmedef.SameAffinityNBeatsWME)localObject20).getBeatCount() == i) && (((facade.characters.wmedef.SameAffinityNBeatsWME)localObject20).getTargetAffinity() == j))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1293 */           paramHashtable.put("sameAffinityWME", new abl.runtime.ObjectWrapper(localObject10));
/* 1294 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1300 */       return false;
/*      */     
/*      */ 
/*      */     case 33: 
/* 1304 */       f4 = ((Float)paramArrayOfObject[0]).floatValue();
/*      */       
/*      */ 
/*      */ 
/* 1308 */       localObject10 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("OneCharacterVisibleInfoWME");
/* 1309 */       localObject12 = ((java.util.List)localObject10).listIterator();
/* 1310 */       while (((ListIterator)localObject12).hasNext()) {
/* 1311 */         localObject16 = (OneCharacterVisibleInfoWME)((ListIterator)localObject12).next();
/* 1312 */         Object localObject6 = localObject16;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1318 */         paramHashtable.put("oneCharacterVisibleInfoWME", new abl.runtime.ObjectWrapper(localObject6));
/* 1319 */         return true;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1325 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 35: 
/* 1339 */       localObject27 = wm.WorkingMemory.lookupWME("BeatMemory", "OneCharacterVisibleWME");
/* 1340 */       localObject29 = ((java.util.List)localObject27).listIterator();
/* 1341 */       while (((ListIterator)localObject29).hasNext()) {
/* 1342 */         localObject31 = (facade.characters.wmedef.OneCharacterVisibleWME)((ListIterator)localObject29).next();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1348 */         return false;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1355 */       localObject31 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("OneCharacterVisibleInfoWME");
/* 1356 */       localObject32 = ((java.util.List)localObject31).listIterator();
/* 1357 */       while (((ListIterator)localObject32).hasNext()) {
/* 1358 */         localObject33 = (OneCharacterVisibleInfoWME)((ListIterator)localObject32).next();
/* 1359 */         float f35; if (abl.runtime.BehavingEntity.constantTrue(f35 = ((OneCharacterVisibleInfoWME)localObject33).getLookDistance()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1366 */           localObject34 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1367 */           localObject35 = ((java.util.List)localObject34).listIterator();
/* 1368 */           for (; ((ListIterator)localObject35).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1383 */               ((ListIterator)localObject38).hasNext())
/*      */           {
/* 1369 */             localObject36 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject35).next();
/* 1370 */             float f16; float f31; if ((((facade.characters.wmedef.ObjectPositionWME)localObject36).getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(f16 = ((facade.characters.wmedef.ObjectPositionWME)localObject36).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f31 = ((facade.characters.wmedef.ObjectPositionWME)localObject36).getZ()))) {
/*      */               break label5845;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1381 */             localObject37 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 1382 */             localObject38 = ((java.util.List)localObject37).listIterator();
/* 1383 */             continue;
/* 1384 */             localObject39 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject38).next();
/* 1385 */             float f10; if ((((facade.characters.wmedef.ObjectRotationWME)localObject39).getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f10 = ((facade.characters.wmedef.ObjectRotationWME)localObject39).getY())))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1394 */               localObject40 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1395 */               localObject41 = ((java.util.List)localObject40).listIterator();
/* 1396 */               for (; ((ListIterator)localObject41).hasNext(); 
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1411 */                   ((ListIterator)localObject44).hasNext())
/*      */               {
/* 1397 */                 localObject42 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject41).next();
/* 1398 */                 float f33; float f27; if ((((facade.characters.wmedef.ObjectPositionWME)localObject42).getObjectID() != 1) || (!abl.runtime.BehavingEntity.constantTrue(f33 = ((facade.characters.wmedef.ObjectPositionWME)localObject42).getX())) || (!abl.runtime.BehavingEntity.constantTrue(f27 = ((facade.characters.wmedef.ObjectPositionWME)localObject42).getZ()))) {
/*      */                   break label5825;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1409 */                 localObject43 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1410 */                 localObject44 = ((java.util.List)localObject43).listIterator();
/* 1411 */                 continue;
/* 1412 */                 localObject45 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject44).next();
/* 1413 */                 float f21; if ((((facade.characters.wmedef.ObjectPositionWME)localObject45).getObjectID() == 0) && (abl.runtime.BehavingEntity.constantTrue(f4 = ((facade.characters.wmedef.ObjectPositionWME)localObject45).getX())) && (abl.runtime.BehavingEntity.constantTrue(f21 = ((facade.characters.wmedef.ObjectPositionWME)localObject45).getZ())))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1422 */                   paramHashtable.put("playerX", new Float(f16));
/* 1423 */                   paramHashtable.put("lookDistance", new Float(f35));
/* 1424 */                   paramHashtable.put("graceX", new Float(f4));
/* 1425 */                   paramHashtable.put("tripZ", new Float(f27));
/* 1426 */                   paramHashtable.put("playerRotY", new Float(f10));
/* 1427 */                   paramHashtable.put("playerZ", new Float(f31));
/* 1428 */                   paramHashtable.put("tripX", new Float(f33));
/* 1429 */                   paramHashtable.put("graceZ", new Float(f21));
/* 1430 */                   return true;
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
/*      */ 
/*      */ 
/*      */ 
/* 1457 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 36: 
/* 1465 */       java.util.LinkedList localLinkedList4 = wm.WorkingMemory.lookupWME("BeatMemory", "OneCharacterVisibleWME");
/* 1466 */       ListIterator localListIterator5 = localLinkedList4.listIterator();
/* 1467 */       while (localListIterator5.hasNext()) {
/* 1468 */         localObject17 = (facade.characters.wmedef.OneCharacterVisibleWME)localListIterator5.next();
/* 1469 */         Object localObject3 = localObject17;
/* 1470 */         int k; if (abl.runtime.BehavingEntity.constantTrue(k = ((facade.characters.wmedef.OneCharacterVisibleWME)localObject17).getVisibleCharID()))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1475 */           paramHashtable.put("charID", new Integer(k));
/* 1476 */           paramHashtable.put("visibleWME", new abl.runtime.ObjectWrapper(localObject3));
/* 1477 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1483 */       return false;
/*      */     
/*      */ 
/*      */     case 37: 
/* 1487 */       bool1 = ((Boolean)paramArrayOfObject[0]).booleanValue();
/* 1488 */       bool4 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/* 1489 */       if (((bool1) && (bool4)) || ((!bool1) && (!bool4)))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1494 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1498 */       return false;
/*      */     
/*      */ 
/*      */     case 38: 
/* 1502 */       bool1 = ((Boolean)paramArrayOfObject[0]).booleanValue();
/* 1503 */       bool4 = ((Boolean)paramArrayOfObject[1]).booleanValue();
/* 1504 */       if (((bool1) && (!bool4)) || ((!bool1) && (bool4)))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1509 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1513 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 40: 
/* 1524 */       java.util.LinkedList localLinkedList5 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerUncoopWME");
/* 1525 */       ListIterator localListIterator8 = localLinkedList5.listIterator();
/* 1526 */       for (; localListIterator8.hasNext(); 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1538 */           ((ListIterator)localObject29).hasNext())
/*      */       {
/* 1527 */         facade.characters.wmedef.PlayerUncoopWME localPlayerUncoopWME = (facade.characters.wmedef.PlayerUncoopWME)localListIterator8.next();
/* 1528 */         localObject17 = localPlayerUncoopWME;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1536 */         localObject27 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectPositionWME");
/* 1537 */         localObject29 = ((java.util.List)localObject27).listIterator();
/* 1538 */         continue;
/* 1539 */         localObject31 = (facade.characters.wmedef.ObjectPositionWME)((ListIterator)localObject29).next();
/* 1540 */         float f11; float f22; if ((((facade.characters.wmedef.ObjectPositionWME)localObject31).getObjectID() == 2) && (abl.runtime.BehavingEntity.constantTrue(f11 = ((facade.characters.wmedef.ObjectPositionWME)localObject31).getX())) && (abl.runtime.BehavingEntity.constantTrue(f22 = ((facade.characters.wmedef.ObjectPositionWME)localObject31).getZ())))
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
/* 1551 */           localObject32 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME");
/* 1552 */           localObject33 = ((java.util.List)localObject32).listIterator();
/* 1553 */           for (; ((ListIterator)localObject33).hasNext(); 
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1566 */               ((ListIterator)localObject36).hasNext())
/*      */           {
/* 1554 */             localObject34 = (facade.characters.wmedef.ObjectRotationWME)((ListIterator)localObject33).next();
/* 1555 */             float f5; if ((((facade.characters.wmedef.ObjectRotationWME)localObject34).getObjectID() != 2) || (!abl.runtime.BehavingEntity.constantTrue(f5 = ((facade.characters.wmedef.ObjectRotationWME)localObject34).getY()))) {
/*      */               break label6373;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1564 */             localObject35 = abl.runtime.BehavingEntity.getBehavingEntity().lookupWME("PlayerRecentlyTypedTextWME");
/* 1565 */             localObject36 = ((java.util.List)localObject35).listIterator();
/* 1566 */             continue;
/* 1567 */             localObject37 = (facade.characters.wmedef.PlayerRecentlyTypedTextWME)((ListIterator)localObject36).next();
/* 1568 */             boolean bool6; if (abl.runtime.BehavingEntity.constantTrue(bool6 = ((facade.characters.wmedef.PlayerRecentlyTypedTextWME)localObject37).getB()))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1573 */               paramHashtable.put("playerX", new Float(f11));
/* 1574 */               paramHashtable.put("w", new abl.runtime.ObjectWrapper(localObject17));
/* 1575 */               paramHashtable.put("playerRotY", new Float(f5));
/* 1576 */               paramHashtable.put("playerZ", new Float(f22));
/* 1577 */               paramHashtable.put("bRecentlyTyped", new Boolean(bool6));
/* 1578 */               return true;
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
/* 1599 */       return false;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     case 45: 
/* 1606 */       localList1 = abl.runtime.BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("CollectionBehaviorWME", "OverallControl_Body()");
/* 1607 */       ListIterator localListIterator2 = localList1.listIterator();
/* 1608 */       while (localListIterator2.hasNext()) {
/* 1609 */         abl.runtime.CollectionBehaviorWME localCollectionBehaviorWME2 = (abl.runtime.CollectionBehaviorWME)localListIterator2.next();
/* 1610 */         localCollectionBehaviorWME1 = localCollectionBehaviorWME2;
/* 1611 */         if (localCollectionBehaviorWME2.getSignature().equals("OverallControl_Body()"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1616 */           paramHashtable.put("overallControl_Body", new abl.runtime.ObjectWrapper(localCollectionBehaviorWME1));
/* 1617 */           return true;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 1623 */       return false;
/*      */     
/*      */ 
/*      */     case 46: 
/* 1627 */       localCollectionBehaviorWME1 = (abl.runtime.CollectionBehaviorWME)paramArrayOfObject[0];
/* 1628 */       localList1 = (java.util.List)paramArrayOfObject[1];
/* 1629 */       if (!localList1.isEmpty())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1634 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1638 */       return false;
/*      */     
/*      */ 
/*      */     case 47: 
/* 1642 */       localCollectionBehaviorWME1 = (abl.runtime.CollectionBehaviorWME)paramArrayOfObject[0];
/* 1643 */       localList1 = (java.util.List)paramArrayOfObject[1];
/* 1644 */       if (localList1.isEmpty())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1649 */         return true;
/*      */       }
/*      */       
/*      */ 
/* 1653 */       return false;
/*      */     }
/*      */     
/* 1656 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_Preconditions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */