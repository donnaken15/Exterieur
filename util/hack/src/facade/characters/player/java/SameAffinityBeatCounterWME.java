/*    */ package facade.characters.player.java;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class SameAffinityBeatCounterWME extends WME
/*    */ {
/*    */   private int targetBeatCount;
/*    */   private int counter;
/*    */   private int targetAffinity;
/*    */   
/*    */   public SameAffinityBeatCounterWME(int paramInt1, int paramInt2, int paramInt3) {
/* 12 */     this.targetBeatCount = paramInt1;this.counter = paramInt2;this.targetAffinity = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized int getTargetBeatCount()
/*    */   {
/* 19 */     return this.targetBeatCount;
/*    */   }
/*    */   
/*    */   public synchronized int getCounter() {
/* 23 */     return this.counter;
/*    */   }
/*    */   
/*    */   public synchronized int getTargetAffinity() {
/* 27 */     return this.targetAffinity;
/*    */   }
/*    */   
/*    */   public synchronized void setTargetBeatCount(int paramInt) {
/* 31 */     this.targetBeatCount = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setCounter(int paramInt) {
/* 35 */     this.counter = paramInt;
/*    */   }
/*    */   
/*    */   public synchronized void setTargetAffinity(int paramInt) {
/* 39 */     this.targetAffinity = paramInt;
/*    */   }
/*    */   
/*    */   public SameAffinityBeatCounterWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\SameAffinityBeatCounterWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */