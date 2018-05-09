/*     */ package facade.util;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProvocativeContentArchive
/*     */   implements SpriteID, EpisodicMemoryConstants
/*     */ {
/*  12 */   public ProvocativeContentArchive() { archive = this; }
/*     */   
/*     */   class ProvocativeContent { public int uniqueID; public int type; public int param; public int buggedChr; public int provocativeTier; public boolean bPlayerDirect; public boolean bAccusable;
/*  15 */     ProvocativeContent() { jdMethod_this(); }
/*  16 */     public int buttonPush; public int affinityEffect; public int constructiveness; public int backstoryCategory1; private final void jdMethod_this() { this.uniqueID = -1;
/*  17 */       this.type = -1;
/*  18 */       this.param = -1;
/*  19 */       this.buggedChr = -1;
/*  20 */       this.provocativeTier = -1;
/*  21 */       this.bPlayerDirect = false;
/*  22 */       this.bAccusable = false;
/*  23 */       this.buttonPush = 0;
/*  24 */       this.affinityEffect = 0;
/*  25 */       this.constructiveness = 0;
/*  26 */       this.backstoryCategory1 = -1;
/*  27 */       this.backstoryCategory2 = -1;
/*  28 */       this.backstoryCategory3 = -1;
/*  29 */       this.bReactedToInCrisis = false; }
/*     */     
/*     */     public int backstoryCategory2; public int backstoryCategory3; public boolean bReactedToInCrisis; }
/*  32 */   private static final boolean $noassert = Class.forName("[Lfacade.util.ProvocativeContentArchive;").getComponentType().desiredAssertionStatus() ^ true; public static LinkedList pcList = new LinkedList();
/*     */   
/*     */   public static ProvocativeContentArchive archive;
/*     */   
/*     */   public int AddContent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  38 */     return AddContent(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, false);
/*     */   }
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
/*     */   public int AddContent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*     */   {
/*  52 */     ProvocativeContent localProvocativeContent = new ProvocativeContent();
/*  53 */     localProvocativeContent.uniqueID = pcList.size();
/*  54 */     localProvocativeContent.type = paramInt1;
/*  55 */     localProvocativeContent.param = paramInt2;
/*  56 */     localProvocativeContent.buggedChr = paramInt3;
/*  57 */     localProvocativeContent.backstoryCategory1 = paramInt4;
/*  58 */     localProvocativeContent.backstoryCategory2 = paramInt5;
/*  59 */     localProvocativeContent.backstoryCategory3 = paramInt6;
/*     */     
/*     */ 
/*  62 */     pcList.add(localProvocativeContent);
/*     */     
/*  64 */     StringUtil.println("### ProvocativeContentArchive added type " + paramInt1 + " param " + paramInt2 + " buggedChr " + paramInt3 + " backstoryCategories " + paramInt4 + ' ' + paramInt5 + ' ' + paramInt6);
/*     */     
/*     */ 
/*     */ 
/*  68 */     if (paramBoolean) {
/*  69 */       CrisisCalculus.incitingContentID = localProvocativeContent.uniqueID;
/*  70 */       CrisisCalculus.incitingContentType = paramInt1;
/*  71 */       CrisisCalculus.incitingContentParam = paramInt2;
/*     */       
/*  73 */       if (paramInt3 == 0) CrisisCalculus.incitingContentChr = 1; else {
/*  74 */         CrisisCalculus.incitingContentChr = 0;
/*     */       }
/*     */     }
/*  77 */     return localProvocativeContent.uniqueID;
/*     */   }
/*     */   
/*     */   public int GetNumContents() {
/*  81 */     return pcList.size();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void GetContentInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2)
/*     */   {
/*  88 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/*  89 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt);
/*     */     
/*  91 */     paramIntegerRef1.i = localProvocativeContent.type;
/*  92 */     paramIntegerRef2.i = localProvocativeContent.param;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void GetContentInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5, IntegerRef paramIntegerRef6, BooleanRef paramBooleanRef)
/*     */   {
/* 104 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/* 105 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt);
/*     */     
/* 107 */     paramIntegerRef1.i = localProvocativeContent.type;
/* 108 */     paramIntegerRef2.i = localProvocativeContent.param;
/* 109 */     paramIntegerRef3.i = localProvocativeContent.buggedChr;
/* 110 */     paramIntegerRef4.i = localProvocativeContent.backstoryCategory1;
/* 111 */     paramIntegerRef5.i = localProvocativeContent.backstoryCategory2;
/* 112 */     paramIntegerRef6.i = localProvocativeContent.backstoryCategory3;
/* 113 */     paramBooleanRef.b = localProvocativeContent.bReactedToInCrisis;
/*     */   }
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
/*     */   public void GetContentInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, BooleanRef paramBooleanRef1, BooleanRef paramBooleanRef2, IntegerRef paramIntegerRef5, IntegerRef paramIntegerRef6, IntegerRef paramIntegerRef7, IntegerRef paramIntegerRef8, IntegerRef paramIntegerRef9, IntegerRef paramIntegerRef10, BooleanRef paramBooleanRef3)
/*     */   {
/* 131 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/* 132 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt);
/*     */     
/* 134 */     paramIntegerRef1.i = localProvocativeContent.type;
/* 135 */     paramIntegerRef2.i = localProvocativeContent.param;
/* 136 */     paramIntegerRef3.i = localProvocativeContent.buggedChr;
/* 137 */     paramIntegerRef4.i = localProvocativeContent.provocativeTier;
/* 138 */     paramBooleanRef1.b = localProvocativeContent.bPlayerDirect;
/* 139 */     paramBooleanRef2.b = localProvocativeContent.bAccusable;
/* 140 */     paramIntegerRef5.i = localProvocativeContent.buttonPush;
/* 141 */     paramIntegerRef6.i = localProvocativeContent.affinityEffect;
/* 142 */     paramIntegerRef7.i = localProvocativeContent.constructiveness;
/* 143 */     paramIntegerRef8.i = localProvocativeContent.backstoryCategory1;
/* 144 */     paramIntegerRef9.i = localProvocativeContent.backstoryCategory2;
/* 145 */     paramIntegerRef10.i = localProvocativeContent.backstoryCategory3;
/* 146 */     paramBooleanRef3.b = localProvocativeContent.bReactedToInCrisis;
/*     */   }
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
/*     */   public void SetContentInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, boolean paramBoolean3)
/*     */   {
/* 164 */     if ((!$noassert) && ((paramInt1 < 0) || (paramInt1 >= pcList.size()))) throw new AssertionError();
/* 165 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt1);
/*     */     
/* 167 */     localProvocativeContent.type = paramInt2;
/* 168 */     localProvocativeContent.param = paramInt3;
/* 169 */     localProvocativeContent.buggedChr = paramInt4;
/* 170 */     localProvocativeContent.provocativeTier = paramInt5;
/* 171 */     localProvocativeContent.bPlayerDirect = paramBoolean1;
/* 172 */     localProvocativeContent.bAccusable = paramBoolean2;
/* 173 */     localProvocativeContent.buttonPush = paramInt6;
/* 174 */     localProvocativeContent.affinityEffect = paramInt7;
/* 175 */     localProvocativeContent.constructiveness = paramInt8;
/* 176 */     localProvocativeContent.backstoryCategory1 = paramInt9;
/* 177 */     localProvocativeContent.backstoryCategory2 = paramInt10;
/* 178 */     localProvocativeContent.backstoryCategory3 = paramInt11;
/* 179 */     localProvocativeContent.bReactedToInCrisis = paramBoolean3;
/*     */   }
/*     */   
/*     */   public void DeleteContent(int paramInt)
/*     */   {
/* 184 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/* 185 */     pcList.remove(paramInt);
/*     */   }
/*     */   
/*     */   public boolean GetReactedToInCrisis(int paramInt)
/*     */   {
/* 190 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/* 191 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt);
/* 192 */     return localProvocativeContent.bReactedToInCrisis;
/*     */   }
/*     */   
/*     */   public void SetReactedToInCrisis(int paramInt, boolean paramBoolean)
/*     */   {
/* 197 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= pcList.size()))) throw new AssertionError();
/* 198 */     ProvocativeContent localProvocativeContent = (ProvocativeContent)pcList.get(paramInt);
/* 199 */     localProvocativeContent.bReactedToInCrisis = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ProvocativeContentArchive.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */