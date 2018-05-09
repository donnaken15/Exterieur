/*      */ package facade.util;
/*      */ 
/*      */ import java.util.LinkedList;
/*      */ 
/*      */ public class CrisisAccusationMapping implements SpriteID, EpisodicMemoryConstants, BackstoryCategories, CrisisAccusations { public static CrisisAccusationMapping mapping;
/*      */   
/*      */   class CrisisAccusationMappingElement { public int pcType;
/*      */     public int pcParam;
/*      */     public int buggedChr;
/*      */     public int chrToSpeak;
/*      */     public int accusationID1;
/*      */     public int accusationID2;
/*   13 */     CrisisAccusationMappingElement() { jdMethod_this(); }
/*   14 */     private final void jdMethod_this() { this.pcType = -1;
/*   15 */       this.pcParam = -1;
/*   16 */       this.buggedChr = -1;
/*   17 */       this.chrToSpeak = -1;
/*   18 */       this.accusationID1 = -1;
/*   19 */       this.accusationID2 = -1; } }
/*      */   
/*      */   class CrisisAccusation { public int accusationID; public int backstoryCategory; public int chrToSpeak;
/*   22 */     CrisisAccusation() { jdMethod_this(); }
/*   23 */     public int dialogToSpeak; private final void jdMethod_this() { this.accusationID = -1;
/*   24 */       this.backstoryCategory = -1;
/*   25 */       this.chrToSpeak = -1;
/*   26 */       this.dialogToSpeak = -1;
/*   27 */       this.bSpoken = false; }
/*      */     
/*      */     public boolean bSpoken; }
/*   30 */   public static LinkedList accList = new LinkedList();
/*   31 */   public static LinkedList accMapList = new LinkedList();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddAccusationMapping(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*   42 */     CrisisAccusationMappingElement localCrisisAccusationMappingElement = new CrisisAccusationMappingElement();
/*   43 */     localCrisisAccusationMappingElement.pcType = paramInt1;
/*   44 */     localCrisisAccusationMappingElement.pcParam = paramInt2;
/*   45 */     localCrisisAccusationMappingElement.buggedChr = paramInt3;
/*   46 */     localCrisisAccusationMappingElement.chrToSpeak = paramInt4;
/*   47 */     localCrisisAccusationMappingElement.accusationID1 = paramInt5;
/*   48 */     localCrisisAccusationMappingElement.accusationID2 = paramInt6;
/*      */     
/*      */ 
/*   51 */     accMapList.add(localCrisisAccusationMappingElement);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void AddAccusation(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   60 */     CrisisAccusation localCrisisAccusation = new CrisisAccusation();
/*   61 */     localCrisisAccusation.accusationID = paramInt1;
/*   62 */     localCrisisAccusation.backstoryCategory = paramInt2;
/*   63 */     localCrisisAccusation.chrToSpeak = paramInt3;
/*   64 */     localCrisisAccusation.dialogToSpeak = paramInt4;
/*      */     
/*      */ 
/*   67 */     accList.add(localCrisisAccusation);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseAccusation(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   75 */     return ChooseAccusation(paramInt1, paramInt2, paramInt3, true);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int ChooseAccusation(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/*   85 */     for (int i = 0; i < accMapList.size(); i++) {
/*   86 */       CrisisAccusationMappingElement localCrisisAccusationMappingElement = (CrisisAccusationMappingElement)accMapList.get(i);
/*      */       
/*      */ 
/*   89 */       if ((localCrisisAccusationMappingElement.pcType == paramInt1) && (localCrisisAccusationMappingElement.pcParam == paramInt2) && (localCrisisAccusationMappingElement.chrToSpeak == paramInt3))
/*      */       {
/*      */         CrisisAccusation localCrisisAccusation;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*   96 */         for (int j = 0; j < accList.size(); j++) {
/*   97 */           localCrisisAccusation = (CrisisAccusation)accList.get(j);
/*   98 */           if ((localCrisisAccusation.accusationID == localCrisisAccusationMappingElement.accusationID1) && (!localCrisisAccusation.bSpoken)) {
/*   99 */             if (paramBoolean) localCrisisAccusation.bSpoken = true;
/*  100 */             return localCrisisAccusationMappingElement.accusationID1;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  105 */         for (j = 0; j < accList.size(); j++) {
/*  106 */           localCrisisAccusation = (CrisisAccusation)accList.get(j);
/*  107 */           if ((localCrisisAccusation.accusationID == localCrisisAccusationMappingElement.accusationID2) && (!localCrisisAccusation.bSpoken)) {
/*  108 */             if (paramBoolean) localCrisisAccusation.bSpoken = true;
/*  109 */             return localCrisisAccusationMappingElement.accusationID2;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  115 */     StringUtil.println("### ChooseAccusation could not find an unspoken accusation that matched pcType " + paramInt1 + " pcParam " + paramInt2 + " chrToSpeak " + paramInt3);
/*      */     
/*  117 */     if (paramInt3 == 0) return 0;
/*  118 */     return 80;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean DidBCAccusationOccur(int paramInt)
/*      */   {
/*  128 */     for (int i = 0; i < accList.size(); i++) {
/*  129 */       CrisisAccusation localCrisisAccusation = (CrisisAccusation)accList.get(i);
/*  130 */       if ((localCrisisAccusation.backstoryCategory == paramInt) && (localCrisisAccusation.bSpoken)) return true;
/*      */     }
/*  132 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public CrisisAccusationMapping()
/*      */   {
/*  139 */     mapping = this;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  150 */     AddAccusationMapping(6, 100, -1, 0, 0, 42);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  157 */     AddAccusationMapping(6, 100, -1, 1, 80, 44);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  164 */     AddAccusationMapping(6, 101, -1, 0, 40, 42);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  171 */     AddAccusationMapping(6, 101, -1, 1, 60, 44);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  178 */     AddAccusationMapping(6, 208, -1, 0, 81, 42);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  185 */     AddAccusationMapping(6, 208, -1, 1, 41, 83);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */     AddAccusationMapping(6, 209, -1, 0, 81, 42);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  199 */     AddAccusationMapping(6, 209, -1, 1, 41, 83);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  206 */     AddAccusationMapping(6, 102, -1, 0, 82, 40);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  213 */     AddAccusationMapping(6, 102, -1, 1, 1, 41);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  220 */     AddAccusationMapping(6, 210, -1, 0, 40, 0);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */     AddAccusationMapping(6, 210, -1, 1, 80, 20);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */     AddAccusationMapping(6, 106, -1, 0, 120, 121);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  241 */     AddAccusationMapping(6, 106, -1, 1, 122, 103);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  248 */     AddAccusationMapping(6, 107, -1, 0, 123, 120);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  255 */     AddAccusationMapping(6, 107, -1, 1, 21, 122);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  262 */     AddAccusationMapping(6, 105, -1, 0, 30, 30);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  269 */     AddAccusationMapping(6, 105, -1, 1, 23, 21);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  276 */     AddAccusationMapping(6, 103, -1, 0, 121, 123);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  283 */     AddAccusationMapping(6, 103, -1, 1, 122, 103);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  290 */     AddAccusationMapping(6, 104, -1, 0, 100, 121);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  297 */     AddAccusationMapping(6, 104, -1, 1, 22, 103);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  304 */     AddAccusationMapping(6, 109, -1, 0, 140, 121);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  311 */     AddAccusationMapping(6, 109, -1, 1, 41, 122);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  318 */     AddAccusationMapping(6, 108, -1, 0, 0, 140);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  325 */     AddAccusationMapping(6, 108, -1, 1, 23, 143);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  332 */     AddAccusationMapping(6, 111, -1, 0, 0, 81);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  339 */     AddAccusationMapping(6, 111, -1, 1, 24, 44);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  346 */     AddAccusationMapping(6, 112, -1, 0, 2, 0);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  353 */     AddAccusationMapping(6, 112, -1, 1, 22, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  360 */     AddAccusationMapping(6, 110, -1, 0, 4, 187);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  367 */     AddAccusationMapping(6, 110, -1, 1, 5, 188);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  374 */     AddAccusationMapping(6, 116, -1, 0, 100, 123);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  381 */     AddAccusationMapping(6, 116, -1, 1, 101, 27);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  388 */     AddAccusationMapping(6, 117, -1, 0, 120, 121);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  395 */     AddAccusationMapping(6, 117, -1, 1, 122, 122);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  403 */     AddAccusationMapping(6, 118, -1, 0, 123, 82);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  410 */     AddAccusationMapping(6, 118, -1, 1, 122, 122);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  418 */     AddAccusationMapping(6, 119, -1, 0, 3, 82);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  425 */     AddAccusationMapping(6, 119, -1, 1, 61, 61);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  433 */     AddAccusationMapping(6, 122, -1, 0, 2, 0);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  440 */     AddAccusationMapping(6, 122, -1, 1, 80, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  447 */     AddAccusationMapping(6, 123, -1, 0, 2, 100);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  454 */     AddAccusationMapping(6, 123, -1, 1, 23, 20);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  461 */     AddAccusationMapping(6, 124, -1, 0, 2, 100);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  468 */     AddAccusationMapping(6, 124, -1, 1, 23, 24);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  475 */     AddAccusationMapping(6, 125, -1, 0, 200, 100);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  482 */     AddAccusationMapping(6, 125, -1, 1, 26, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  489 */     AddAccusationMapping(6, 126, -1, 0, 201, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  496 */     AddAccusationMapping(6, 126, -1, 1, 181, 27);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  503 */     AddAccusationMapping(6, 120, -1, 0, 144, 144);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  510 */     AddAccusationMapping(6, 120, -1, 1, 45, 45);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */     AddAccusationMapping(6, 121, -1, 0, 104, 104);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  524 */     AddAccusationMapping(6, 121, -1, 1, 105, 105);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  531 */     AddAccusationMapping(6, 127, -1, 0, 161, 161);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  538 */     AddAccusationMapping(6, 127, -1, 1, 143, 142);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */     AddAccusationMapping(6, 128, -1, 0, 201, 201);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  552 */     AddAccusationMapping(6, 128, -1, 1, 186, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  559 */     AddAccusationMapping(1, 20, 1, 1, 25, 101);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  566 */     AddAccusationMapping(1, 20, 0, 0, 160, 202);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  573 */     AddAccusationMapping(1, 21, 0, 0, 202, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  580 */     AddAccusationMapping(1, 21, 1, 1, 101, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  587 */     AddAccusationMapping(1, 22, 1, 1, 25, 183);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  594 */     AddAccusationMapping(1, 22, 0, 0, 161, 182);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  601 */     AddAccusationMapping(1, 23, 1, 1, 25, 183);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  608 */     AddAccusationMapping(1, 23, 0, 0, 161, 182);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  615 */     AddAccusationMapping(1, 31, -1, 0, 187, 187);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  623 */     AddAccusationMapping(1, 31, -1, 1, 188, 188);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  631 */     AddAccusationMapping(3, 40, -1, 0, 180, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  638 */     AddAccusationMapping(3, 40, -1, 1, 181, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  645 */     AddAccusationMapping(3, 41, -1, 0, 180, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  652 */     AddAccusationMapping(3, 41, -1, 1, 181, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  659 */     AddAccusationMapping(3, 42, -1, 0, 182, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  666 */     AddAccusationMapping(3, 42, -1, 1, 184, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  673 */     AddAccusationMapping(3, 43, -1, 0, 141, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  680 */     AddAccusationMapping(3, 43, -1, 1, 142, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  687 */     AddAccusationMapping(3, 44, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  694 */     AddAccusationMapping(3, 44, -1, 1, 185, 181);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */     AddAccusationMapping(3, 45, -1, 0, 200, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  708 */     AddAccusationMapping(3, 45, -1, 1, 26, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  715 */     AddAccusationMapping(3, 46, -1, 0, 2, 102);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  722 */     AddAccusationMapping(3, 46, -1, 1, 23, 26);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  729 */     AddAccusationMapping(3, 47, -1, 0, 0, 3);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  737 */     AddAccusationMapping(3, 47, -1, 1, 20, 5);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  745 */     AddAccusationMapping(3, 48, -1, 0, 140, 160);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  753 */     AddAccusationMapping(3, 48, -1, 1, 143, 181);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  761 */     AddAccusationMapping(3, 49, -1, 0, 62, 28);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  768 */     AddAccusationMapping(3, 49, -1, 1, 125, 27);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  775 */     AddAccusationMapping(3, 50, -1, 0, 42, 124);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  782 */     AddAccusationMapping(3, 50, -1, 1, 60, 83);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  789 */     AddAccusationMapping(3, 51, -1, 0, 43, 124);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  796 */     AddAccusationMapping(3, 51, -1, 1, 44, 61);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  803 */     AddAccusationMapping(3, 52, -1, 0, 102, 28);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */     AddAccusationMapping(3, 52, -1, 1, 27, 103);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */     AddAccusationMapping(3, 53, -1, 0, 43, 124);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  824 */     AddAccusationMapping(3, 53, -1, 1, 61, 44);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  831 */     AddAccusationMapping(3, 54, -1, 0, 104, 100);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  838 */     AddAccusationMapping(3, 54, -1, 1, 105, 101);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  845 */     AddAccusationMapping(0, 0, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  852 */     AddAccusationMapping(0, 0, -1, 1, 186, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  859 */     AddAccusationMapping(0, 1, -1, 0, 29, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  866 */     AddAccusationMapping(0, 1, -1, 1, 186, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  873 */     AddAccusationMapping(0, 2, -1, 0, 82, 0);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  880 */     AddAccusationMapping(0, 2, -1, 1, 143, 80);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  887 */     AddAccusationMapping(0, 3, -1, 0, 201, 29);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  894 */     AddAccusationMapping(0, 3, -1, 1, 80, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  901 */     AddAccusationMapping(0, 4, -1, 0, 184, 201);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  908 */     AddAccusationMapping(0, 4, -1, 1, 186, 183);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  915 */     AddAccusationMapping(0, 5, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  922 */     AddAccusationMapping(0, 5, -1, 1, 186, 23);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  929 */     AddAccusationMapping(0, 7, -1, 0, 82, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  936 */     AddAccusationMapping(0, 7, -1, 1, 143, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  943 */     AddAccusationMapping(0, 8, -1, 0, 29, 201);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  950 */     AddAccusationMapping(0, 8, -1, 1, 80, 186);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  957 */     AddAccusationMapping(0, 9, -1, 0, 82, 0);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  964 */     AddAccusationMapping(0, 9, -1, 1, 143, 80);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  971 */     AddAccusationMapping(0, 10, -1, 0, 141, 184);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  978 */     AddAccusationMapping(0, 10, -1, 1, 143, 142);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  985 */     AddAccusationMapping(0, 11, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  992 */     AddAccusationMapping(0, 11, -1, 1, 186, 181);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  999 */     AddAccusationMapping(0, 12, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1006 */     AddAccusationMapping(0, 12, -1, 1, 186, 181);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1013 */     AddAccusationMapping(0, 13, -1, 0, 184, 180);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1020 */     AddAccusationMapping(0, 13, -1, 1, 185, 181);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1031 */     AddAccusation(0, 0, 0, 0);
/*      */     
/*      */ 
/* 1034 */     AddAccusation(1, 0, 1, 0);
/*      */     
/*      */ 
/* 1037 */     AddAccusation(2, 0, 0, 0);
/*      */     
/*      */ 
/* 1040 */     AddAccusation(3, 0, 0, 0);
/*      */     
/*      */ 
/* 1043 */     AddAccusation(4, 0, 0, 0);
/*      */     
/*      */ 
/* 1046 */     AddAccusation(5, 0, 1, 0);
/*      */     
/*      */ 
/*      */ 
/* 1050 */     AddAccusation(20, 1, 1, 0);
/*      */     
/*      */ 
/* 1053 */     AddAccusation(21, 1, 1, 0);
/*      */     
/*      */ 
/* 1056 */     AddAccusation(22, 1, 1, 0);
/*      */     
/*      */ 
/* 1059 */     AddAccusation(23, 1, 1, 0);
/*      */     
/*      */ 
/* 1062 */     AddAccusation(24, 1, 1, 0);
/*      */     
/*      */ 
/* 1065 */     AddAccusation(25, 1, 1, 0);
/*      */     
/*      */ 
/* 1068 */     AddAccusation(26, 1, 1, 0);
/*      */     
/*      */ 
/* 1071 */     AddAccusation(27, 1, 1, 0);
/*      */     
/*      */ 
/* 1074 */     AddAccusation(28, 1, 0, 0);
/*      */     
/*      */ 
/* 1077 */     AddAccusation(29, 1, 0, 0);
/*      */     
/*      */ 
/* 1080 */     AddAccusation(30, 1, 0, 0);
/*      */     
/*      */ 
/*      */ 
/* 1084 */     AddAccusation(40, 2, 0, 0);
/*      */     
/*      */ 
/* 1087 */     AddAccusation(41, 2, 1, 0);
/*      */     
/*      */ 
/* 1090 */     AddAccusation(42, 2, 0, 0);
/*      */     
/*      */ 
/* 1093 */     AddAccusation(43, 2, 0, 0);
/*      */     
/*      */ 
/* 1096 */     AddAccusation(44, 2, 1, 0);
/*      */     
/*      */ 
/* 1099 */     AddAccusation(45, 2, 1, 0);
/*      */     
/*      */ 
/*      */ 
/* 1103 */     AddAccusation(60, 3, 1, 0);
/*      */     
/*      */ 
/* 1106 */     AddAccusation(61, 3, 1, 0);
/*      */     
/*      */ 
/* 1109 */     AddAccusation(62, 3, 0, 0);
/*      */     
/*      */ 
/*      */ 
/* 1113 */     AddAccusation(80, 4, 1, 0);
/*      */     
/*      */ 
/* 1116 */     AddAccusation(81, 4, 0, 0);
/*      */     
/*      */ 
/* 1119 */     AddAccusation(82, 4, 0, 0);
/*      */     
/*      */ 
/* 1122 */     AddAccusation(83, 4, 1, 0);
/*      */     
/*      */ 
/*      */ 
/* 1126 */     AddAccusation(100, 5, 0, 0);
/*      */     
/*      */ 
/* 1129 */     AddAccusation(101, 5, 1, 0);
/*      */     
/*      */ 
/* 1132 */     AddAccusation(102, 5, 0, 0);
/*      */     
/*      */ 
/* 1135 */     AddAccusation(103, 5, 1, 0);
/*      */     
/*      */ 
/* 1138 */     AddAccusation(104, 5, 0, 0);
/*      */     
/*      */ 
/* 1141 */     AddAccusation(105, 5, 1, 0);
/*      */     
/*      */ 
/*      */ 
/* 1145 */     AddAccusation(120, 6, 0, 0);
/*      */     
/*      */ 
/* 1148 */     AddAccusation(121, 6, 0, 0);
/*      */     
/*      */ 
/* 1151 */     AddAccusation(122, 6, 1, 0);
/*      */     
/*      */ 
/* 1154 */     AddAccusation(123, 6, 0, 0);
/*      */     
/*      */ 
/* 1157 */     AddAccusation(124, 6, 0, 0);
/*      */     
/*      */ 
/* 1160 */     AddAccusation(125, 6, 1, 0);
/*      */     
/*      */ 
/*      */ 
/* 1164 */     AddAccusation(140, 7, 0, 0);
/*      */     
/*      */ 
/* 1167 */     AddAccusation(141, 7, 0, 0);
/*      */     
/*      */ 
/* 1170 */     AddAccusation(142, 7, 1, 0);
/*      */     
/*      */ 
/* 1173 */     AddAccusation(143, 7, 1, 0);
/*      */     
/*      */ 
/* 1176 */     AddAccusation(144, 7, 0, 0);
/*      */     
/*      */ 
/*      */ 
/* 1180 */     AddAccusation(160, 8, 0, 0);
/*      */     
/*      */ 
/* 1183 */     AddAccusation(161, 8, 0, 0);
/*      */     
/*      */ 
/* 1186 */     AddAccusation(162, 8, 0, 0);
/*      */     
/*      */ 
/*      */ 
/* 1190 */     AddAccusation(180, 9, 0, 0);
/*      */     
/*      */ 
/* 1193 */     AddAccusation(181, 9, 1, 0);
/*      */     
/*      */ 
/* 1196 */     AddAccusation(182, 9, 0, 0);
/*      */     
/*      */ 
/* 1199 */     AddAccusation(183, 9, 1, 0);
/*      */     
/*      */ 
/* 1202 */     AddAccusation(184, 9, 0, 0);
/*      */     
/*      */ 
/* 1205 */     AddAccusation(185, 9, 1, 0);
/*      */     
/*      */ 
/* 1208 */     AddAccusation(186, 9, 1, 0);
/*      */     
/*      */ 
/* 1211 */     AddAccusation(187, 9, 0, 0);
/*      */     
/*      */ 
/* 1214 */     AddAccusation(188, 9, 1, 0);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\CrisisAccusationMapping.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */