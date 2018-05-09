/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class EventWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int type;
/*    */   private int charID;
/*    */   private int objID;
/*    */   private int action;
/*    */   private boolean bVal;
/*    */   private int iVal;
/*    */   private int iVal2;
/*    */   private float fVal;
/*    */   
/*    */   public EventWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, float paramFloat)
/*    */   {
/* 19 */     this.type = paramInt1;
/* 20 */     this.charID = paramInt2;
/* 21 */     this.objID = paramInt3;
/* 22 */     this.action = paramInt4;
/* 23 */     this.bVal = paramBoolean;
/* 24 */     this.iVal = paramInt5;
/* 25 */     this.iVal2 = paramInt6;
/* 26 */     this.fVal = paramFloat;
/*    */   }
/*    */   
/* 29 */   public synchronized int getType() { return this.type; }
/* 30 */   public synchronized int getCharID() { return this.charID; }
/* 31 */   public synchronized int getObjID() { return this.objID; }
/* 32 */   public synchronized int getAction() { return this.action; }
/* 33 */   public synchronized boolean getBVal() { return this.bVal; }
/* 34 */   public synchronized int getIVal() { return this.iVal; }
/* 35 */   public synchronized int getIVal2() { return this.iVal2; }
/* 36 */   public synchronized float getFVal() { return this.fVal; }
/*    */   
/* 38 */   public synchronized void setType(int paramInt) { this.type = paramInt; }
/* 39 */   public synchronized void setcharID(int paramInt) { this.charID = paramInt; }
/* 40 */   public synchronized void setObjID(int paramInt) { this.objID = paramInt; }
/* 41 */   public synchronized void setAction(int paramInt) { this.action = paramInt; }
/* 42 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/* 43 */   public synchronized void setIVal(int paramInt) { this.iVal = paramInt; }
/* 44 */   public synchronized void setIVal2(int paramInt) { this.iVal2 = paramInt; }
/* 45 */   public synchronized void setFVal(float paramFloat) { this.fVal = paramFloat; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\EventWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */