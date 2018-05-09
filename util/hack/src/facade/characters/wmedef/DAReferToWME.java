/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class DAReferToWME extends WME
/*    */ {
/*    */   private int topicID;
/*    */   private long timestamp;
/*    */   
/*    */   public DAReferToWME(int paramInt, long paramLong) {
/* 11 */     this.topicID = paramInt;
/* 12 */     this.timestamp = paramLong;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 18 */   public synchronized int getTopicID() { return this.topicID; }
/* 19 */   public synchronized long getTimestamp() { return this.timestamp; }
/*    */   
/*    */ 
/* 22 */   public synchronized void setTopicID(int paramInt) { this.topicID = paramInt; }
/* 23 */   public synchronized void setTimestamp(long paramLong) { this.timestamp = paramLong; }
/*    */   
/*    */   public DAReferToWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAReferToWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */