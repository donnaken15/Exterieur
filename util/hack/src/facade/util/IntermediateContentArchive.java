/*     */ package facade.util;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IntermediateContentArchive
/*     */   implements SpriteID, EpisodicMemoryConstants
/*     */ {
/*  12 */   public IntermediateContentArchive() { archive = this; }
/*     */   
/*     */   class IntermediateContent {
/*  15 */     IntermediateContent() { jdMethod_this(); }
/*     */     
/*  17 */     private final void jdMethod_this() { this.type = -1;
/*  18 */       this.param1 = -1;
/*  19 */       this.param2 = -1;
/*  20 */       this.param3 = -1;
/*  21 */       this.chr = -1;
/*     */     }
/*     */     
/*     */ 
/*     */     public int type;
/*     */     
/*     */     public int param1;
/*     */     public int param2;
/*     */     public int param3;
/*     */     public int chr;
/*     */   }
/*     */   
/*  33 */   private static final boolean $noassert = Class.forName("[Lfacade.util.IntermediateContentArchive;").getComponentType().desiredAssertionStatus() ^ true; public static LinkedList icList = new LinkedList();
/*     */   public static IntermediateContentArchive archive;
/*     */   
/*     */   public void AddContent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  37 */     IntermediateContent localIntermediateContent = new IntermediateContent();
/*  38 */     localIntermediateContent.type = paramInt1;
/*  39 */     localIntermediateContent.param1 = paramInt2;
/*  40 */     localIntermediateContent.param2 = paramInt3;
/*  41 */     localIntermediateContent.param3 = paramInt4;
/*  42 */     localIntermediateContent.chr = paramInt5;
/*     */     
/*  44 */     StringUtil.println("### IntermediateContentArchive added type " + paramInt1 + " param1 " + paramInt2 + " param2 " + paramInt3 + " param3 " + paramInt4 + " chr " + paramInt5);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  51 */     icList.add(localIntermediateContent);
/*     */   }
/*     */   
/*     */   public int GetNumContents() {
/*  55 */     return icList.size();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void GetContentInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5)
/*     */   {
/*  65 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= icList.size()))) throw new AssertionError();
/*  66 */     IntermediateContent localIntermediateContent = (IntermediateContent)icList.get(paramInt);
/*     */     
/*  68 */     paramIntegerRef1.i = localIntermediateContent.type;
/*  69 */     paramIntegerRef2.i = localIntermediateContent.param1;
/*  70 */     paramIntegerRef3.i = localIntermediateContent.param2;
/*  71 */     paramIntegerRef4.i = localIntermediateContent.param3;
/*  72 */     paramIntegerRef5.i = localIntermediateContent.chr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void SetContentInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  82 */     if ((!$noassert) && ((paramInt1 < 0) || (paramInt1 >= icList.size()))) throw new AssertionError();
/*  83 */     IntermediateContent localIntermediateContent = (IntermediateContent)icList.get(paramInt1);
/*     */     
/*  85 */     localIntermediateContent.type = paramInt2;
/*  86 */     localIntermediateContent.param1 = paramInt3;
/*  87 */     localIntermediateContent.param2 = paramInt4;
/*  88 */     localIntermediateContent.param3 = paramInt5;
/*  89 */     localIntermediateContent.chr = paramInt6;
/*     */   }
/*     */   
/*     */   public void DeleteContent(int paramInt)
/*     */   {
/*  94 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= icList.size()))) throw new AssertionError();
/*  95 */     icList.remove(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean DoesExist(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 103 */     for (int i = 0; i < icList.size(); i++) {
/* 104 */       IntermediateContent localIntermediateContent = (IntermediateContent)icList.get(i);
/* 105 */       if ((paramInt1 == localIntermediateContent.type) && (paramInt2 == localIntermediateContent.param1) && (paramInt3 == localIntermediateContent.param2) && (paramInt4 == localIntermediateContent.param3))
/*     */       {
/*     */ 
/*     */ 
/* 109 */         return true;
/*     */       }
/*     */     }
/* 112 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\IntermediateContentArchive.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */