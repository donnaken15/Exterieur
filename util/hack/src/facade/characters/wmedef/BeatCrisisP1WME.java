/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ 
/*    */ public class BeatCrisisP1WME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int currentAccusationID;
/*    */   private int currentAccuserChr;
/*    */   private int currentAccusationPCType;
/*    */   private int currentAccusationPCParam;
/*    */   private int currentAccusedChr;
/*    */   private float graceX;
/*    */   private float graceZ;
/*    */   private float graceFaceRot;
/*    */   private float graceFaceAwayRot;
/*    */   private float tripX;
/*    */   private float tripZ;
/*    */   private float tripFaceRot;
/*    */   private float tripFaceAwayRot;
/*    */   private boolean bVal;
/*    */   private String sVal;
/*    */   
/*    */   public BeatCrisisP1WME()
/*    */   {
/* 27 */     this.currentAccusationID = -1;
/* 28 */     this.currentAccuserChr = -1;
/* 29 */     this.currentAccusationPCType = -1;
/* 30 */     this.currentAccusationPCParam = -1;
/* 31 */     this.currentAccusedChr = -1;
/*    */     
/* 33 */     this.graceX = 0.0F;
/* 34 */     this.graceZ = 0.0F;
/* 35 */     this.graceFaceRot = 0.0F;
/* 36 */     this.graceFaceAwayRot = 0.0F;
/* 37 */     this.tripX = 0.0F;
/* 38 */     this.tripZ = 0.0F;
/* 39 */     this.tripFaceRot = 0.0F;
/* 40 */     this.tripFaceAwayRot = 0.0F;
/*    */     
/* 42 */     this.bVal = false;
/* 43 */     this.sVal = "";
/*    */   }
/*    */   
/* 46 */   public synchronized int getCurrentAccusationID() { return this.currentAccusationID; }
/* 47 */   public synchronized int getCurrentAccuserChr() { return this.currentAccuserChr; }
/* 48 */   public synchronized int getCurrentAccusationPCType() { return this.currentAccusationPCType; }
/* 49 */   public synchronized int getCurrentAccusationPCParam() { return this.currentAccusationPCParam; }
/* 50 */   public synchronized int getCurrentAccusedChr() { return this.currentAccusedChr; }
/* 51 */   public synchronized float getGraceX() { return this.graceX; }
/* 52 */   public synchronized float getGraceZ() { return this.graceZ; }
/* 53 */   public synchronized float getGraceFaceRot() { return this.graceFaceRot; }
/* 54 */   public synchronized float getGraceFaceAwayRot() { return this.graceFaceAwayRot; }
/* 55 */   public synchronized float getTripX() { return this.tripX; }
/* 56 */   public synchronized float getTripZ() { return this.tripZ; }
/* 57 */   public synchronized float getTripFaceRot() { return this.tripFaceRot; }
/* 58 */   public synchronized float getTripFaceAwayRot() { return this.tripFaceAwayRot; }
/* 59 */   public synchronized boolean getBVal() { return this.bVal; }
/* 60 */   public synchronized String getSVal() { return this.sVal; }
/*    */   
/* 62 */   public synchronized void setCurrentAccusationID(int paramInt) { this.currentAccusationID = paramInt; }
/* 63 */   public synchronized void setCurrentAccuserChr(int paramInt) { this.currentAccuserChr = paramInt; }
/* 64 */   public synchronized void setCurrentAccusationPCType(int paramInt) { this.currentAccusationPCType = paramInt; }
/* 65 */   public synchronized void setCurrentAccusationPCParam(int paramInt) { this.currentAccusationPCParam = paramInt; }
/* 66 */   public synchronized void setCurrentAccusedChr(int paramInt) { this.currentAccusedChr = paramInt; }
/* 67 */   public synchronized void setGraceX(float paramFloat) { this.graceX = paramFloat; }
/* 68 */   public synchronized void setGraceZ(float paramFloat) { this.graceZ = paramFloat; }
/* 69 */   public synchronized void setGraceFaceRot(float paramFloat) { this.graceFaceRot = paramFloat; }
/* 70 */   public synchronized void setGraceFaceAwayRot(float paramFloat) { this.graceFaceAwayRot = paramFloat; }
/* 71 */   public synchronized void setTripX(float paramFloat) { this.tripX = paramFloat; }
/* 72 */   public synchronized void setTripZ(float paramFloat) { this.tripZ = paramFloat; }
/* 73 */   public synchronized void setTripFaceRot(float paramFloat) { this.tripFaceRot = paramFloat; }
/* 74 */   public synchronized void setTripFaceAwayRot(float paramFloat) { this.tripFaceAwayRot = paramFloat; }
/* 75 */   public synchronized void setBVal(boolean paramBoolean) { this.bVal = paramBoolean; }
/* 76 */   public synchronized void setSVal(String paramString) { this.sVal = paramString; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatCrisisP1WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */