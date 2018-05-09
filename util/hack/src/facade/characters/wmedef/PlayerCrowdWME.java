/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PlayerCrowdWME extends WME {
/*    */   private long timestamp;
/*    */   
/*  8 */   public PlayerCrowdWME(long paramLong) { this.timestamp = paramLong; }
/*    */   
/*    */ 
/*    */ 
/* 12 */   public synchronized long getTimestamp() { return this.timestamp; }
/*    */   
/* 14 */   public synchronized void setTimestamp(long paramLong) { this.timestamp = paramLong; }
/*    */   
/*    */   public PlayerCrowdWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerCrowdWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */