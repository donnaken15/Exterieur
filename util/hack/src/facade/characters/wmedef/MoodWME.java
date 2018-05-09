/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MoodWME
/*    */   extends WME
/*    */ {
/*    */   private int type;
/*    */   private int alt;
/*    */   private int strength;
/*    */   private int priority;
/*    */   private float decay;
/*    */   private int decayToType;
/*    */   private float burstDecay;
/*    */   private int charID1;
/*    */   private int charID2;
/*    */   private long decayAtMillis;
/*    */   private long burstDecayAtMillis;
/*    */   private boolean bTerminate;
/*    */   private float stagingConverseDist;
/*    */   private float stagingConverseOutwardAngleOffset;
/*    */   
/*    */   public MoodWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, int paramInt5, float paramFloat2, int paramInt6, int paramInt7, float paramFloat3, float paramFloat4)
/*    */   {
/* 27 */     this.type = paramInt1;
/* 28 */     this.alt = paramInt2;
/* 29 */     this.strength = paramInt3;
/* 30 */     this.priority = paramInt4;
/* 31 */     this.decay = paramFloat1;
/* 32 */     this.decayToType = paramInt5;
/* 33 */     this.burstDecay = paramFloat2;
/* 34 */     this.charID1 = paramInt6;
/* 35 */     this.charID2 = paramInt7;
/*    */     
/*    */ 
/* 38 */     this.decayAtMillis = (System.currentTimeMillis() + (1000.0F * paramFloat1));
/* 39 */     this.burstDecayAtMillis = (System.currentTimeMillis() + (1000.0F * paramFloat2));
/*    */     
/* 41 */     this.bTerminate = false;
/* 42 */     this.stagingConverseDist = paramFloat3;
/* 43 */     this.stagingConverseOutwardAngleOffset = paramFloat4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 49 */   public synchronized int getType() { return this.type; }
/* 50 */   public synchronized int getAlt() { return this.alt; }
/* 51 */   public synchronized int getStrength() { return this.strength; }
/* 52 */   public synchronized int getPriority() { return this.priority; }
/* 53 */   public synchronized float getDecay() { return this.decay; }
/* 54 */   public synchronized int getDecayToType() { return this.decayToType; }
/* 55 */   public synchronized float getBurstDecay() { return this.burstDecay; }
/* 56 */   public synchronized int getCharID1() { return this.charID1; }
/* 57 */   public synchronized int getCharID2() { return this.charID2; }
/* 58 */   public synchronized long getDecayAtMillis() { return this.decayAtMillis; }
/* 59 */   public synchronized long getBurstDecayAtMillis() { return this.burstDecayAtMillis; }
/* 60 */   public synchronized boolean getBTerminate() { return this.bTerminate; }
/* 61 */   public synchronized float getStagingConverseDist() { return this.stagingConverseDist; }
/* 62 */   public synchronized float getStagingConverseOutwardAngleOffset() { return this.stagingConverseOutwardAngleOffset; }
/*    */   
/*    */ 
/* 65 */   public synchronized void setType(int paramInt) { this.type = paramInt; }
/* 66 */   public synchronized void setAlt(int paramInt) { this.alt = paramInt; }
/* 67 */   public synchronized void setStrength(int paramInt) { this.strength = paramInt; }
/* 68 */   public synchronized void setPriority(int paramInt) { this.priority = paramInt; }
/*    */   
/*    */   public synchronized void setDecay(float paramFloat) {
/* 71 */     this.decay = paramFloat;
/* 72 */     this.decayAtMillis = (System.currentTimeMillis() + (1000.0F * paramFloat));
/*    */   }
/*    */   
/* 75 */   public synchronized void setDecayToType(int paramInt) { this.decayToType = paramInt; }
/*    */   
/*    */   public synchronized void setBurstDecay(float paramFloat) {
/* 78 */     this.burstDecay = paramFloat;
/* 79 */     this.burstDecayAtMillis = (System.currentTimeMillis() + (1000.0F * paramFloat));
/*    */   }
/*    */   
/* 82 */   public synchronized void setCharID1(int paramInt) { this.charID1 = paramInt; }
/* 83 */   public synchronized void setCharID2(int paramInt) { this.charID2 = paramInt; }
/* 84 */   public synchronized void setDecayAtMillis(long paramLong) { this.decayAtMillis = paramLong; }
/* 85 */   public synchronized void setBurstDecayAtMillis(long paramLong) { this.burstDecayAtMillis = paramLong; }
/* 86 */   public synchronized void setBTerminate(boolean paramBoolean) { this.bTerminate = paramBoolean; }
/* 87 */   public synchronized void setStagingConverseDist(float paramFloat) { this.stagingConverseDist = paramFloat; }
/* 88 */   public synchronized void setStagingConverseOutwardAngleOffset(float paramFloat) { this.stagingConverseOutwardAngleOffset = paramFloat; }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized void setStagingConverseInfo(float paramFloat1, float paramFloat2)
/*    */   {
/* 94 */     this.stagingConverseDist = paramFloat1;
/* 95 */     this.stagingConverseOutwardAngleOffset = paramFloat2;
/*    */   }
/*    */   
/*    */   public MoodWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\MoodWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */