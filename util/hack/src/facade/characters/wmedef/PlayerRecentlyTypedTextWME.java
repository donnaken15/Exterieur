/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PlayerRecentlyTypedTextWME extends WME {
/*    */   private boolean b;
/*    */   private long timestamp;
/*    */   private long graceIgnoreTillTimestamp;
/*    */   private long tripIgnoreTillTimestamp;
/*    */   
/*    */   public PlayerRecentlyTypedTextWME(boolean paramBoolean, long paramLong) {
/* 12 */     this.b = paramBoolean;
/* 13 */     this.timestamp = paramLong;
/* 14 */     this.graceIgnoreTillTimestamp = paramLong;
/* 15 */     this.tripIgnoreTillTimestamp = paramLong;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 20 */   public synchronized boolean getB() { return this.b; }
/* 21 */   public synchronized long getTimestamp() { return this.timestamp; }
/* 22 */   public synchronized long getGraceIgnoreTillTimestamp() { return this.graceIgnoreTillTimestamp; }
/* 23 */   public synchronized long getTripIgnoreTillTimestamp() { return this.tripIgnoreTillTimestamp; }
/*    */   
/* 25 */   public synchronized void setB(boolean paramBoolean) { this.b = paramBoolean; }
/* 26 */   public synchronized void setTimestamp(long paramLong) { this.timestamp = paramLong; }
/* 27 */   public synchronized void setGraceIgnoreTillTimestamp(long paramLong) { this.graceIgnoreTillTimestamp = paramLong; }
/* 28 */   public synchronized void setTripIgnoreTillTimestamp(long paramLong) { this.tripIgnoreTillTimestamp = paramLong; }
/*    */   
/*    */   public PlayerRecentlyTypedTextWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerRecentlyTypedTextWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */