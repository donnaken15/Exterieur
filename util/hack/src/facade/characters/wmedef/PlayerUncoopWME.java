/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import wm.WME;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlayerUncoopWME
/*     */   extends WME
/*     */ {
/*     */   boolean bCurrentlyUncooperative;
/*     */   boolean bNotSpeaking;
/*     */   boolean bNotMoving;
/*     */   boolean bActingWeird;
/*     */   boolean bFidgety;
/*     */   boolean bLeavingForKitchen;
/*     */   boolean bLeavingApartment;
/*     */   boolean bLeftApartment;
/*     */   boolean bMonitorAntisocial;
/*     */   boolean bMonitorLeavingApartment;
/*     */   boolean bMonitorLeavingForKitchen;
/*     */   float prevPlayerX;
/*     */   float prevPlayerZ;
/*     */   float prevPlayerRot;
/*     */   long millisLastSpoke;
/*     */   long millisLastStill;
/*     */   long millisLastBeganMoving;
/*     */   long millisStartedLeavingApartment;
/*     */   long millisStartedLeavingForKitchen;
/*     */   long millisLastGeneratedUncoopDA;
/*     */   long millisLastGeneratedLeavingDA;
/*     */   int weirdObjPlacementDecayCtr;
/*     */   int couchSitsDecayCtr;
/*     */   float leavingForKitchenZ;
/*     */   
/*     */   public PlayerUncoopWME()
/*     */   {
/*  38 */     this.bCurrentlyUncooperative = false;
/*  39 */     this.bNotSpeaking = false;
/*  40 */     this.bNotMoving = false;
/*  41 */     this.bActingWeird = false;
/*  42 */     this.bFidgety = false;
/*  43 */     this.bLeavingForKitchen = false;
/*  44 */     this.bLeavingApartment = false;
/*  45 */     this.bLeftApartment = false;
/*     */     
/*  47 */     this.bMonitorAntisocial = false;
/*  48 */     this.bMonitorLeavingApartment = false;
/*  49 */     this.bMonitorLeavingForKitchen = false;
/*     */     
/*  51 */     this.prevPlayerX = 0.0F;
/*  52 */     this.prevPlayerZ = 0.0F;
/*  53 */     this.prevPlayerRot = 0.0F;
/*  54 */     this.millisLastSpoke = 0L;
/*  55 */     this.millisLastStill = 0L;
/*  56 */     this.millisLastBeganMoving = 0L;
/*  57 */     this.millisStartedLeavingApartment = 0L;
/*  58 */     this.millisStartedLeavingForKitchen = 0L;
/*  59 */     this.millisLastGeneratedUncoopDA = 0L;
/*  60 */     this.millisLastGeneratedLeavingDA = 0L;
/*  61 */     this.weirdObjPlacementDecayCtr = 0;
/*  62 */     this.couchSitsDecayCtr = 0;
/*  63 */     this.leavingForKitchenZ = 0.0F;
/*     */   }
/*     */   
/*     */ 
/*  67 */   public synchronized boolean getBCurrentlyUncooperative() { return this.bCurrentlyUncooperative; }
/*  68 */   public synchronized boolean getBNotSpeaking() { return this.bNotSpeaking; }
/*  69 */   public synchronized boolean getBNotMoving() { return this.bNotMoving; }
/*  70 */   public synchronized boolean getBActingWeird() { return this.bActingWeird; }
/*  71 */   public synchronized boolean getBFidgety() { return this.bFidgety; }
/*  72 */   public synchronized boolean getBLeavingForKitchen() { return this.bLeavingForKitchen; }
/*  73 */   public synchronized boolean getBLeavingApartment() { return this.bLeavingApartment; }
/*  74 */   public synchronized boolean getBLeftApartment() { return this.bLeftApartment; }
/*  75 */   public synchronized boolean getBMonitorAntisocial() { return this.bMonitorAntisocial; }
/*  76 */   public synchronized boolean getBMonitorLeavingApartment() { return this.bMonitorLeavingApartment; }
/*  77 */   public synchronized boolean getBMonitorLeavingForKitchen() { return this.bMonitorLeavingForKitchen; }
/*  78 */   public synchronized float getPrevPlayerX() { return this.prevPlayerX; }
/*  79 */   public synchronized float getPrevPlayerZ() { return this.prevPlayerZ; }
/*  80 */   public synchronized float getPrevPlayerRot() { return this.prevPlayerRot; }
/*  81 */   public synchronized long getMillisLastSpoke() { return this.millisLastSpoke; }
/*  82 */   public synchronized long getMillisLastStill() { return this.millisLastStill; }
/*  83 */   public synchronized long getMillisLastBeganMoving() { return this.millisLastBeganMoving; }
/*  84 */   public synchronized long getMillisStartedLeavingApartment() { return this.millisStartedLeavingApartment; }
/*  85 */   public synchronized long getMillisStartedLeavingForKitchen() { return this.millisStartedLeavingForKitchen; }
/*  86 */   public synchronized long getMillisLastGeneratedUncoopDA() { return this.millisLastGeneratedUncoopDA; }
/*  87 */   public synchronized long getMillisLastGeneratedLeavingDA() { return this.millisLastGeneratedLeavingDA; }
/*  88 */   public synchronized int getWeirdObjPlacementDecayCtr() { return this.weirdObjPlacementDecayCtr; }
/*  89 */   public synchronized int getCouchSitsDecayCtr() { return this.couchSitsDecayCtr; }
/*  90 */   public synchronized float getLeavingForKitchenZ() { return this.leavingForKitchenZ; }
/*     */   
/*     */ 
/*     */ 
/*  94 */   public synchronized void setBCurrentlyUncooperative(boolean paramBoolean) { this.bCurrentlyUncooperative = paramBoolean; }
/*  95 */   public synchronized void setBNotSpeaking(boolean paramBoolean) { this.bNotSpeaking = paramBoolean; }
/*  96 */   public synchronized void setBNotMoving(boolean paramBoolean) { this.bNotMoving = paramBoolean; }
/*  97 */   public synchronized void setBActingWeird(boolean paramBoolean) { this.bActingWeird = paramBoolean; }
/*  98 */   public synchronized void setBFidgety(boolean paramBoolean) { this.bFidgety = paramBoolean; }
/*  99 */   public synchronized void setBLeavingForKitchen(boolean paramBoolean) { this.bLeavingForKitchen = paramBoolean; }
/* 100 */   public synchronized void setBLeavingApartment(boolean paramBoolean) { this.bLeavingApartment = paramBoolean; }
/* 101 */   public synchronized void setBLeftApartment(boolean paramBoolean) { this.bLeftApartment = paramBoolean; }
/* 102 */   public synchronized void setBMonitorAntisocial(boolean paramBoolean) { this.bMonitorAntisocial = paramBoolean; }
/* 103 */   public synchronized void setBMonitorLeavingApartment(boolean paramBoolean) { this.bMonitorLeavingApartment = paramBoolean; }
/* 104 */   public synchronized void setBMonitorLeavingForKitchen(boolean paramBoolean) { this.bMonitorLeavingForKitchen = paramBoolean; }
/* 105 */   public synchronized void setPrevPlayerX(float paramFloat) { this.prevPlayerX = paramFloat; }
/* 106 */   public synchronized void setPrevPlayerZ(float paramFloat) { this.prevPlayerZ = paramFloat; }
/* 107 */   public synchronized void setPrevPlayerRot(float paramFloat) { this.prevPlayerRot = paramFloat; }
/* 108 */   public synchronized void setMillisLastSpoke(long paramLong) { this.millisLastSpoke = paramLong; }
/* 109 */   public synchronized void setMillisLastStill(long paramLong) { this.millisLastStill = paramLong; }
/* 110 */   public synchronized void setMillisLastBeganMoving(long paramLong) { this.millisLastBeganMoving = paramLong; }
/* 111 */   public synchronized void setMillisStartedLeavingApartment(long paramLong) { this.millisStartedLeavingApartment = paramLong; }
/* 112 */   public synchronized void setMillisStartedLeavingForKitchen(long paramLong) { this.millisStartedLeavingForKitchen = paramLong; }
/* 113 */   public synchronized void setMillisLastGeneratedUncoopDA(long paramLong) { this.millisLastGeneratedUncoopDA = paramLong; }
/* 114 */   public synchronized void setMillisLastGeneratedLeavingDA(long paramLong) { this.millisLastGeneratedLeavingDA = paramLong; }
/* 115 */   public synchronized void setWeirdObjPlacementDecayCtr(int paramInt) { this.weirdObjPlacementDecayCtr = paramInt; }
/* 116 */   public synchronized void setCouchSitsDecayCtr(int paramInt) { this.couchSitsDecayCtr = paramInt; }
/* 117 */   public synchronized void setLeavingForKitchenZ(float paramFloat) { this.leavingForKitchenZ = paramFloat; }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerUncoopWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */