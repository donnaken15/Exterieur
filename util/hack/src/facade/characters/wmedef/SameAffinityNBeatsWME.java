/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ import wm.WME;
/*    */ 
/*    */ public class SameAffinityNBeatsWME extends WME implements DramaManagerConstants
/*    */ {
/*    */   private int beatCount;
/*    */   private int targetAffinity;
/*    */   
/*    */   public SameAffinityNBeatsWME(int paramInt1, int paramInt2)
/*    */   {
/* 13 */     this.beatCount = paramInt1;
/* 14 */     this.targetAffinity = paramInt2;
/*    */   }
/*    */   
/*    */   public SameAffinityNBeatsWME()
/*    */   {
/* 19 */     this.beatCount = 0;
/* 20 */     this.targetAffinity = 0;
/*    */   }
/*    */   
/*    */ 
/* 24 */   public synchronized int getBeatCount() { return this.beatCount; }
/* 25 */   public synchronized int getTargetAffinity() { return this.targetAffinity; }
/*    */   
/*    */ 
/* 28 */   public synchronized void setBeatCount(int paramInt) { this.beatCount = paramInt; }
/* 29 */   public synchronized void setTargetAffinity(int paramInt) { this.targetAffinity = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\SameAffinityNBeatsWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */