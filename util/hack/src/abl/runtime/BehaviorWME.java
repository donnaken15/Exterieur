/*    */ package abl.runtime;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class BehaviorWME extends WME {
/*    */   protected Behavior behavior;
/*    */   protected GoalStepWME parent;
/*    */   protected boolean valid;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.BehaviorWME;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   private final void jdMethod_this() {
/* 12 */     this.parent = null;
/* 13 */     this.valid = true; }
/*    */   
/* 15 */   public BehaviorWME(Behavior paramBehavior, GoalStepWME paramGoalStepWME) { jdMethod_this();
/* 16 */     this.behavior = paramBehavior;
/* 17 */     this.parent = paramGoalStepWME;
/* 18 */     paramBehavior.setReflectionWME(this);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 23 */   public synchronized boolean getHasContextCondition() { return this.behavior.getHasContextCondition(); }
/*    */   
/* 25 */   public synchronized int getSpecificity() { return this.behavior.getSpecificity(); }
/* 26 */   public synchronized String getSignature() { return this.behavior.getSignature(); }
/*    */   
/*    */   public synchronized GoalStepWME getParent()
/*    */   {
/* 30 */     if ((!$noassert) && ((this.behavior.isRootBehavior()) || (this.parent == null)) && ((!this.behavior.isRootBehavior()) || (this.parent != null))) throw new AssertionError();
/* 31 */     return this.parent;
/*    */   }
/*    */   
/* 34 */   public synchronized int getBehaviorType() { return this.behavior.getBehaviorType(); }
/*    */   
/*    */ 
/* 37 */   public synchronized Object getProperty(String paramString) { return this.behavior.propertyTable.getProperty(paramString); }
/* 38 */   public synchronized void setProperty(String paramString, Object paramObject) { this.behavior.propertyTable.setProperty(paramString, paramObject); }
/* 39 */   public synchronized void deleteProperty(String paramString) { this.behavior.propertyTable.deleteProperty(paramString); }
/* 40 */   public synchronized java.util.List getAllDefinedProperties() { return this.behavior.propertyTable.getAllDefinedProperties(); }
/*    */   
/*    */ 
/*    */   synchronized Behavior getBehavior()
/*    */   {
/* 45 */     if (isValid()) {
/* 46 */       return this.behavior;
/*    */     }
/* 48 */     return null;
/*    */   }
/*    */   
/*    */   public synchronized boolean isValid() {
/* 52 */     return this.valid;
/*    */   }
/*    */   
/*    */   public synchronized boolean isParent(GoalStepWME paramGoalStepWME)
/*    */   {
/* 57 */     if (this.parent == null)
/* 58 */       return false;
/* 59 */     if (this.parent == paramGoalStepWME) {
/* 60 */       return true;
/*    */     }
/* 62 */     return this.parent.isParent(paramGoalStepWME);
/*    */   }
/*    */   
/*    */ 
/*    */   public synchronized boolean isParent(BehaviorWME paramBehaviorWME)
/*    */   {
/* 68 */     if (this.parent == null) {
/* 69 */       return false;
/*    */     }
/* 71 */     return this.parent.isParent(paramBehaviorWME);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 76 */   void delete() { this.valid = false; }
/*    */   
/* 78 */   public String toString() { return objectToString() + super.toString(); }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehaviorWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */