/*    */ package dramaman.runtime;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import java.util.List;
/*    */ 
/*    */ public class BeatDistributionWME extends wm.TimeStampedWME
/*    */ {
/*    */   private List beatIDs;
/*    */   private List beats;
/*    */   private static final boolean $noassert = Class.forName("[Ldramaman.runtime.BeatDistributionWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public BeatDistributionWME(List paramList1, List paramList2)
/*    */   {
/* 14 */     if ((!$noassert) && (paramList1.size() != 0) && (!paramList1.get(0).getClass().getName().equals("java.lang.Integer"))) { throw new AssertionError("Type error in first argument of BeatDistributionWME constructor");
/*    */     }
/* 16 */     if ((!$noassert) && (paramList2.size() != 0) && (!paramList2.get(0).getClass().getName().equals("dramaman.runtime.Beat"))) { throw new AssertionError("Type error in second argument of BeatDistributionWME constructor");
/*    */     }
/* 18 */     if ((!$noassert) && (paramList1.size() != paramList2.size())) { throw new AssertionError("BeatDistributionWME constructor arguments must be the same size");
/*    */     }
/* 20 */     this.beatIDs = paramList1;
/* 21 */     this.beats = paramList2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized String formatBeatIDs()
/*    */   {
/* 29 */     StringBuffer localStringBuffer = new StringBuffer();
/* 30 */     localStringBuffer.append("{");
/* 31 */     if (!this.beatIDs.isEmpty()) {
/* 32 */       for (int i = 0; i < this.beatIDs.size() - 1; i++)
/* 33 */         localStringBuffer.append(PrintUtilities.beatID_EnumToString(((Integer)this.beatIDs.get(i)).intValue()) + ", ");
/* 34 */       localStringBuffer.append(PrintUtilities.beatID_EnumToString(((Integer)this.beatIDs.get(this.beatIDs.size() - 1)).intValue()) + '}');
/*    */     }
/*    */     else {
/* 37 */       localStringBuffer.append("}"); }
/* 38 */     return localStringBuffer.toString();
/*    */   }
/*    */   
/*    */ 
/* 42 */   public synchronized List getBeatIDs() { return this.beatIDs; }
/* 43 */   public synchronized void setBeatIDs(List paramList) { this.beatIDs = paramList; }
/*    */   
/* 45 */   public synchronized List getBeats() { return this.beats; }
/* 46 */   public synchronized void setBeats(List paramList) { this.beats = paramList; }
/*    */   
/*    */   public BeatDistributionWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\BeatDistributionWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */