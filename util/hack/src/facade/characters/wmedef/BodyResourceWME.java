/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import abl.runtime.BehaviorWME;
/*    */ import wm.WME;
/*    */ 
/*    */ public class BodyResourceWME extends WME
/*    */ {
/*    */   private int resourceID;
/*    */   private BehaviorWME owner;
/*    */   private int resourcePriority;
/*    */   private int timeout;
/*    */   
/*    */   public BodyResourceWME(int paramInt1, BehaviorWME paramBehaviorWME, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     this.resourceID = paramInt1;
/* 16 */     this.owner = paramBehaviorWME;
/* 17 */     this.resourcePriority = paramInt2;
/* 18 */     this.timeout = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 24 */   public synchronized String formatResourceID() { return facade.util.PrintUtilities.bodyResource_EnumToString(getResourceID()); }
/*    */   
/*    */   public synchronized String formatOwner() {
/* 27 */     if (this.owner != null) {
/* 28 */       return this.owner.getSignature();
/*    */     }
/* 30 */     return "null";
/*    */   }
/*    */   
/*    */ 
/* 34 */   public synchronized int getResourceID() { return this.resourceID; }
/* 35 */   public synchronized BehaviorWME getOwner() { return this.owner; }
/* 36 */   public synchronized int getResourcePriority() { return this.resourcePriority; }
/* 37 */   public synchronized int getTimeout() { return this.timeout; }
/*    */   
/*    */ 
/* 40 */   public synchronized void setResourceID(int paramInt) { this.resourceID = paramInt; }
/* 41 */   public synchronized void setOwner(BehaviorWME paramBehaviorWME) { this.owner = paramBehaviorWME; }
/* 42 */   public synchronized void setResourcePriority(int paramInt) { this.resourcePriority = paramInt; }
/* 43 */   public synchronized void setTimeout(int paramInt) { this.timeout = paramInt; }
/*    */   
/*    */   public BodyResourceWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BodyResourceWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */