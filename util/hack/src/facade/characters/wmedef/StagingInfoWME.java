/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StagingInfoWME
/*    */   extends WME
/*    */ {
/*    */   private int resourcePriority;
/*    */   private int targetObjectID;
/*    */   private float targetX;
/*    */   private float targetZ;
/*    */   private float targetRot;
/*    */   private int walkType;
/*    */   private boolean bObjMovedFromOrig;
/*    */   
/*    */   public StagingInfoWME(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3)
/*    */   {
/* 23 */     this.resourcePriority = paramInt1;
/* 24 */     this.targetObjectID = paramInt2;
/* 25 */     this.targetX = paramFloat1;
/* 26 */     this.targetZ = paramFloat2;
/* 27 */     this.targetRot = paramFloat3;
/* 28 */     this.walkType = paramInt3;
/* 29 */     this.bObjMovedFromOrig = false;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public synchronized int getResourcePriority() { return this.resourcePriority; }
/* 36 */   public synchronized int getTargetObjectID() { return this.targetObjectID; }
/* 37 */   public synchronized float getTargetX() { return this.targetX; }
/* 38 */   public synchronized float getTargetZ() { return this.targetZ; }
/* 39 */   public synchronized float getTargetRot() { return this.targetRot; }
/* 40 */   public synchronized int getWalkType() { return this.walkType; }
/* 41 */   public synchronized boolean getBObjMovedFromOrig() { return this.bObjMovedFromOrig; }
/*    */   
/*    */ 
/*    */ 
/* 45 */   public synchronized void setResourcePriority(int paramInt) { this.resourcePriority = paramInt; }
/* 46 */   public synchronized void setTargetObjectID(int paramInt) { this.targetObjectID = paramInt; }
/* 47 */   public synchronized void setTargetX(float paramFloat) { this.targetX = paramFloat; }
/* 48 */   public synchronized void setTargetZ(float paramFloat) { this.targetZ = paramFloat; }
/* 49 */   public synchronized void setTargetRot(float paramFloat) { this.targetRot = paramFloat; }
/* 50 */   public synchronized void setWalkType(int paramInt) { this.walkType = paramInt; }
/* 51 */   public synchronized void setBObjMovedFromOrig(boolean paramBoolean) { this.bObjMovedFromOrig = paramBoolean; }
/*    */   
/*    */   public StagingInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\StagingInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */