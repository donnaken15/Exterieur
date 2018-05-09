/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class CurrentTimeWME extends WME
/*    */ {
/*    */   private long currentTime;
/*    */   
/*    */   public CurrentTimeWME(long paramLong)
/*    */   {
/* 11 */     this.currentTime = paramLong;
/*    */   }
/*    */   
/*    */ 
/*    */   public synchronized long getCurrentTime()
/*    */   {
/* 17 */     return this.currentTime;
/*    */   }
/*    */   
/* 20 */   public synchronized void setCurrentTime(int paramInt) { this.currentTime = paramInt; }
/*    */   
/*    */   public CurrentTimeWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\CurrentTimeWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */