/*     */ package abl.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public abstract class ExecutableStep extends Step
/*     */ {
/*     */   protected String[] stepsIConflictWith;
/*     */   protected String name;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  12 */     this.stepsIConflictWith = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExecutableStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, short paramShort3, String[] paramArrayOfString)
/*     */   {
/*  25 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, paramShort3);jdMethod_this();
/*     */     
/*     */ 
/*  28 */     this.stepsIConflictWith = paramArrayOfString;
/*     */   }
/*     */   
/*     */   protected void checkForConflictsOnExecution()
/*     */   {
/*  33 */     if (this.stepsIConflictWith != null) {
/*  34 */       BehavingEntity.getBehavingEntity().findConflictsWithCurrentlyExecutingSteps(this, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void initConflictSteps(String[] paramArrayOfString)
/*     */   {
/*  40 */     this.stepsIConflictWith = paramArrayOfString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   String[] getConflicts()
/*     */   {
/*  49 */     if (this.stepsIConflictWith != null) {
/*  50 */       return (String[])this.stepsIConflictWith.clone();
/*     */     }
/*  52 */     return new String[0];
/*     */   }
/*     */   
/*     */ 
/*     */   private final void unsuspendStepsIHaveSuspended()
/*     */   {
/*  58 */     Step[] arrayOfStep = (Step[])this.stepsIHaveSuspended.toArray(new Step[this.stepsIHaveSuspended.size()]);
/*     */     
/*     */ 
/*     */ 
/*  62 */     for (int i = 0; i < arrayOfStep.length; i++) {
/*  63 */       arrayOfStep[i].unsuspend(this);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void processStepRemoval()
/*     */   {
/*  71 */     unsuspendStepsIHaveSuspended();
/*     */     
/*  73 */     updateStepsSuspendingMe();
/*     */   }
/*     */   
/*     */ 
/*     */   String getName()
/*     */   {
/*  79 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */   void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/*  85 */     if (isExecuting())
/*     */     {
/*  87 */       unsuspendStepsIHaveSuspended();
/*     */     }
/*     */     
/*  90 */     super.suspend(paramExecutableStep);
/*     */   }
/*     */   
/*     */ 
/*     */   void metaSuspend()
/*     */   {
/*  96 */     if (isExecuting())
/*     */     {
/*  98 */       unsuspendStepsIHaveSuspended();
/*     */     }
/*     */     
/* 101 */     super.metaSuspend();
/*     */   }
/*     */   
/*     */ 
/*     */   void jointSuspend()
/*     */   {
/* 107 */     if (isExecuting())
/*     */     {
/* 109 */       unsuspendStepsIHaveSuspended();
/*     */     }
/* 111 */     super.jointSuspend();
/*     */   }
/*     */   
/*     */ 
/*     */   void suspenderFor(Step paramStep)
/*     */   {
/* 117 */     this.stepsIHaveSuspended.add(paramStep);
/*     */   }
/*     */   
/*     */ 
/*     */   void unsuspenderFor(Step paramStep)
/*     */   {
/* 123 */     this.stepsIHaveSuspended.remove(paramStep);
/*     */   }
/*     */   
/*     */   abstract boolean isExecuting();
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\ExecutableStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */