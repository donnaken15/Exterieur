/*     */ package abl.runtime;
/*     */ 
/*     */ import wm.WME;
/*     */ 
/*     */ public class StepWME extends WME {
/*     */   protected Step s;
/*     */   protected BehaviorWME parent;
/*     */   protected boolean valid;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.StepWME;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final void jdMethod_this() {
/*  12 */     this.valid = true;
/*     */   }
/*     */   
/*     */ 
/*     */   public StepWME(Step paramStep, BehaviorWME paramBehaviorWME)
/*     */   {
/*  18 */     jdMethod_this();
/*  19 */     if ((!$noassert) && (paramBehaviorWME == null)) throw new AssertionError();
/*  20 */     this.s = paramStep;
/*  21 */     this.parent = paramBehaviorWME;
/*  22 */     paramStep.setReflectionWME(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  27 */   public synchronized boolean getPersistent() { return this.s.getPersistent(); }
/*  28 */   public synchronized boolean getPersistentWhenSucceeds() { return this.s.getPersistentWhenSucceeds(); }
/*  29 */   public synchronized boolean getPersistentWhenFails() { return this.s.getPersistentWhenFails(); }
/*  30 */   public synchronized boolean getIgnoreFailure() { return this.s.getIgnoreFailure(); }
/*  31 */   public synchronized boolean getHasSuccessTest() { return this.s.getHasSuccessTest(); }
/*  32 */   public synchronized boolean getEffectOnly() { return this.s.getEffectOnly(); }
/*  33 */   public synchronized boolean getIsAtomic() { return this.s.getIsAtomic(); }
/*  34 */   public synchronized short getPriority() { return this.s.getPriority(); }
/*  35 */   public synchronized boolean getIsSuspended() { return this.s.isSuspended(); }
/*  36 */   public synchronized BehaviorWME getParent() { return this.parent; }
/*  37 */   public synchronized short getStepType() { return this.s.getStepType(); }
/*     */   
/*     */   public synchronized boolean getValid() {
/*  40 */     return this.valid;
/*     */   }
/*     */   
/*  43 */   public synchronized void setPersistent(boolean paramBoolean) { this.s.setPersistent(paramBoolean); }
/*  44 */   public synchronized void setPersistentWhenSucceeds(boolean paramBoolean) { this.s.setPersistentWhenSucceeds(paramBoolean); }
/*  45 */   public synchronized void setPersistentWhenFails(boolean paramBoolean) { this.s.setPersistentWhenFails(paramBoolean); }
/*  46 */   public synchronized void setIgnoreFailure(boolean paramBoolean) { this.s.setIgnoreFailure(paramBoolean); }
/*  47 */   public synchronized void setEffectOnly(boolean paramBoolean) { this.s.setEffectOnly(paramBoolean); }
/*  48 */   public synchronized void setPriority(short paramShort) { this.s.setPriority(paramShort); }
/*     */   
/*     */ 
/*  51 */   public synchronized Object getProperty(String paramString) { return this.s.propertyTable.getProperty(paramString); }
/*  52 */   public synchronized void setProperty(String paramString, Object paramObject) { ((GoalStep)this.s).propertyTable.setProperty(paramString, paramObject); }
/*  53 */   public synchronized void deleteProperty(String paramString) { ((GoalStep)this.s).propertyTable.deleteProperty(paramString); }
/*  54 */   public synchronized java.util.List getAllDefinedProperties() { return this.s.propertyTable.getAllDefinedProperties(); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isValid()
/*     */   {
/*  95 */     return this.valid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public synchronized void fail()
/*     */   {
/* 102 */     if ((isValid()) && (this.s != null)) {
/* 103 */       this.s.failStep();
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void succeed()
/*     */   {
/* 109 */     if ((isValid()) && (this.s != null))
/* 110 */       this.s.succeedStep();
/*     */   }
/*     */   
/*     */   public synchronized boolean isParent(GoalStepWME paramGoalStepWME) {
/* 114 */     return this.parent.isParent(paramGoalStepWME);
/*     */   }
/*     */   
/*     */   public synchronized boolean isParent(BehaviorWME paramBehaviorWME)
/*     */   {
/* 119 */     if (this.parent == paramBehaviorWME) {
/* 120 */       return true;
/*     */     }
/* 122 */     return this.parent.isParent(paramBehaviorWME);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 127 */   void delete() { this.valid = false; }
/*     */   
/* 129 */   public String toString() { return objectToString() + super.toString(); }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\StepWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */