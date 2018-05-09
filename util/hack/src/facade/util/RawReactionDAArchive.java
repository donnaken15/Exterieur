/*     */ package facade.util;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RawReactionDAArchive
/*     */ {
/*  12 */   public RawReactionDAArchive() { archive = this; }
/*     */   
/*     */   class RawReactionDA { public int daType; public int charID; public int param1;
/*  15 */     RawReactionDA() { jdMethod_this(); }
/*     */     public int param2;
/*  17 */     private final void jdMethod_this() { this.daType = -1;
/*  18 */       this.charID = -1;
/*  19 */       this.param1 = -1;
/*  20 */       this.param2 = -1;
/*  21 */       this.param3 = -1;
/*  22 */       this.timestamp = 0L; }
/*     */     
/*     */     public int param3;
/*     */     public long timestamp; }
/*  26 */   private static final boolean $noassert = Class.forName("[Lfacade.util.RawReactionDAArchive;").getComponentType().desiredAssertionStatus() ^ true; public static LinkedList icList = new LinkedList();
/*     */   public static RawReactionDAArchive archive;
/*     */   
/*     */   public void AddContent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong) {
/*  30 */     RawReactionDA localRawReactionDA = new RawReactionDA();
/*  31 */     localRawReactionDA.daType = paramInt1;
/*  32 */     localRawReactionDA.charID = paramInt2;
/*  33 */     localRawReactionDA.param1 = paramInt3;
/*  34 */     localRawReactionDA.param2 = paramInt4;
/*  35 */     localRawReactionDA.param3 = paramInt5;
/*  36 */     localRawReactionDA.timestamp = paramLong;
/*     */     
/*  38 */     StringUtil.println("### RawReactionDAArchive added daType " + paramInt1 + " charID " + paramInt2 + " param1 " + paramInt3 + " param2 " + paramInt4 + " param3 " + paramInt5 + " timestamp " + paramLong);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  46 */     icList.add(localRawReactionDA);
/*     */   }
/*     */   
/*     */   public int GetNumContents() {
/*  50 */     return icList.size();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long GetContentInfo(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3, IntegerRef paramIntegerRef4, IntegerRef paramIntegerRef5)
/*     */   {
/*  60 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= icList.size()))) throw new AssertionError();
/*  61 */     RawReactionDA localRawReactionDA = (RawReactionDA)icList.get(paramInt);
/*     */     
/*  63 */     paramIntegerRef1.i = localRawReactionDA.daType;
/*  64 */     paramIntegerRef2.i = localRawReactionDA.charID;
/*  65 */     paramIntegerRef3.i = localRawReactionDA.param1;
/*  66 */     paramIntegerRef4.i = localRawReactionDA.param2;
/*  67 */     paramIntegerRef5.i = localRawReactionDA.param3;
/*     */     
/*  69 */     return localRawReactionDA.timestamp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void SetContentInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong)
/*     */   {
/*  80 */     if ((!$noassert) && ((paramInt1 < 0) || (paramInt1 >= icList.size()))) throw new AssertionError();
/*  81 */     RawReactionDA localRawReactionDA = (RawReactionDA)icList.get(paramInt1);
/*     */     
/*  83 */     localRawReactionDA.daType = paramInt2;
/*  84 */     localRawReactionDA.charID = paramInt3;
/*  85 */     localRawReactionDA.param1 = paramInt4;
/*  86 */     localRawReactionDA.param2 = paramInt5;
/*  87 */     localRawReactionDA.param3 = paramInt6;
/*  88 */     localRawReactionDA.timestamp = paramLong;
/*     */   }
/*     */   
/*     */   public void DeleteContent(int paramInt)
/*     */   {
/*  93 */     if ((!$noassert) && ((paramInt < 0) || (paramInt >= icList.size()))) throw new AssertionError();
/*  94 */     icList.remove(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean DoesExist(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 103 */     for (int i = 0; i < icList.size(); i++) {
/* 104 */       RawReactionDA localRawReactionDA = (RawReactionDA)icList.get(i);
/* 105 */       if ((paramInt1 == localRawReactionDA.daType) && (paramInt2 == localRawReactionDA.charID) && ((paramInt3 == -2) || (paramInt3 == localRawReactionDA.param1)) && ((paramInt4 == -2) || (paramInt4 == localRawReactionDA.param2)) && ((paramInt5 == -2) || (paramInt5 == localRawReactionDA.param3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 110 */         return true;
/*     */       }
/*     */     }
/* 113 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\RawReactionDAArchive.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */