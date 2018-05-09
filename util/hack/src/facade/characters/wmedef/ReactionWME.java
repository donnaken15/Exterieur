/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class ReactionWME extends WME { private int rxnType;
/*    */   private int rxnCategory;
/*    */   private int rxnCategoryLevel;
/*    */   private int order;
/*    */   private int rxnPriority;
/*    */   private int param1;
/*    */   
/* 12 */   private final void jdMethod_this() { this.param1 = -1;
/* 13 */     this.param2 = -1; }
/*    */   
/*    */   private int param2;
/*    */   private DAWME daWME;
/*    */   private ReactionInfoWME reactionInfo;
/*    */   
/* 19 */   public ReactionWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, DAWME paramDAWME, ReactionInfoWME paramReactionInfoWME) { jdMethod_this();
/* 20 */     this.rxnType = paramInt1;
/* 21 */     this.rxnCategory = paramInt2;
/* 22 */     this.rxnCategoryLevel = paramInt3;
/* 23 */     this.order = paramInt4;
/* 24 */     this.rxnPriority = paramInt5;
/* 25 */     this.param1 = paramInt6;
/* 26 */     this.param2 = paramInt7;
/* 27 */     this.daWME = paramDAWME;
/* 28 */     this.reactionInfo = paramReactionInfoWME;
/*    */   }
/*    */   
/* 31 */   public ReactionWME() { jdMethod_this(); }
/*    */   
/* 33 */   public synchronized String formatRxnType() { return facade.util.PrintUtilities.rxnType_EnumToString(getRxnType()); }
/*    */   
/* 35 */   public synchronized int getRxnType() { return this.rxnType; }
/* 36 */   public synchronized void setRxnType(int paramInt) { this.rxnType = paramInt; }
/*    */   
/* 38 */   public synchronized int getRxnCategory() { return this.rxnCategory; }
/* 39 */   public synchronized void setRxnCategory(int paramInt) { this.rxnCategory = paramInt; }
/*    */   
/* 41 */   public synchronized int getRxnCategoryLevel() { return this.rxnCategoryLevel; }
/* 42 */   public synchronized void setRxnCategoryLevel(int paramInt) { this.rxnCategoryLevel = paramInt; }
/*    */   
/* 44 */   public synchronized int getOrder() { return this.order; }
/* 45 */   public synchronized void setOrder(int paramInt) { this.order = paramInt; }
/*    */   
/* 47 */   public synchronized int getRxnPriority() { return this.rxnPriority; }
/* 48 */   public synchronized void setRxnPriority(int paramInt) { this.rxnPriority = paramInt; }
/*    */   
/* 50 */   public synchronized int getParam1() { return this.param1; }
/* 51 */   public synchronized void setParam1(int paramInt) { this.param1 = paramInt; }
/*    */   
/* 53 */   public synchronized int getParam2() { return this.param2; }
/* 54 */   public synchronized void setParam2(int paramInt) { this.param2 = paramInt; }
/*    */   
/* 56 */   public synchronized DAWME getDaWME() { return this.daWME; }
/* 57 */   public synchronized void setDaWME(DAWME paramDAWME) { this.daWME = paramDAWME; }
/*    */   
/* 59 */   public synchronized ReactionInfoWME getReactionInfo() { return this.reactionInfo; }
/* 60 */   public synchronized void setReactionInfo(ReactionInfoWME paramReactionInfoWME) { this.reactionInfo = paramReactionInfoWME; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ReactionWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */