/*     */ package abl.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public class PrimitiveStep
/*     */   extends ExecutableStep
/*     */ {
/*     */   private PrimitiveAction act;
/*     */   private boolean executing;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  13 */     this.executing = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PrimitiveStep(int paramInt, Behavior paramBehavior, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, short paramShort1, short paramShort2, boolean paramBoolean7, String paramString1, Method paramMethod1, Method paramMethod2, Method paramMethod3, AblNamedPropertySupport paramAblNamedPropertySupport, PrimitiveAction paramPrimitiveAction, String[] paramArrayOfString, String paramString2)
/*     */   {
/*  25 */     super(paramInt, paramBehavior, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramShort1, paramShort2, paramBoolean7, paramString1, paramMethod1, paramMethod2, paramMethod3, paramAblNamedPropertySupport, (short)0, paramArrayOfString);jdMethod_this();
/*     */     
/*     */ 
/*     */ 
/*  29 */     this.act = paramPrimitiveAction;
/*  30 */     this.name = paramString2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   final boolean isExecuting()
/*     */   {
/*  37 */     if (this.executing) {
/*  38 */       if (getCompletionStatus() == 0) {
/*  39 */         return true;
/*     */       }
/*  41 */       this.executing = false;
/*     */     }
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   final int getCompletionStatus()
/*     */   {
/*  48 */     return this.act.getCompletionStatus();
/*     */   }
/*     */   
/*     */   final void resetStep()
/*     */   {
/*  53 */     if (isExecuting()) {
/*  54 */       this.act.abort();
/*     */     }
/*  56 */     BehavingEntity.getBehavingEntity().resetStep(this);
/*     */     try {
/*  58 */       Class localClass = this.act.getClass();
/*  59 */       this.act = ((PrimitiveAction)localClass.newInstance());
/*  60 */     } catch (Exception localException) { throw new AblRuntimeError("Reflection error in PrimitiveStep.resetStep()", localException); }
/*  61 */     this.executing = false;
/*     */   }
/*     */   
/*     */   private final Object[] bindArgs()
/*     */   {
/*  66 */     if (this.execute != null)
/*     */     {
/*  68 */       Object[] arrayOfObject = { new Integer(this.stepID), this.parent.getBehaviorVariableFrame(), BehavingEntity.getBehavingEntity() };
/*     */       try
/*     */       {
/*  71 */         return (Object[])this.execute.invoke(null, arrayOfObject);
/*  72 */       } catch (Exception localException) { throw new AblRuntimeError("Error invoking execute", localException);
/*     */       }
/*     */     }
/*  75 */     return new Object[0];
/*     */   }
/*     */   
/*     */   void execute()
/*     */   {
/*  80 */     checkForConflictsOnExecution();
/*  81 */     if (!isSuspended()) {
/*  82 */       executeBookkeeping();
/*  83 */       Object[] arrayOfObject = bindArgs();
/*  84 */       this.act.execute(arrayOfObject);
/*     */     }
/*     */   }
/*     */   
/*     */   protected final void executeBookkeeping()
/*     */   {
/*  90 */     this.executing = true;
/*  91 */     super.executeBookkeeping();
/*     */   }
/*     */   
/*     */   final void abort()
/*     */   {
/*  96 */     if (isExecuting()) {
/*  97 */       this.act.abort();
/*     */     }
/*  99 */     BehavingEntity.getBehavingEntity().abortStep(this);
/* 100 */     this.executing = false;
/*     */   }
/*     */   
/*     */ 
/*     */   void suspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 106 */     super.suspend(paramExecutableStep);
/* 107 */     BehavingEntity.getBehavingEntity().suspendStep(this);
/* 108 */     if (isExecuting())
/*     */     {
/* 110 */       this.act.abort();
/*     */       try {
/* 112 */         Class localClass = this.act.getClass();
/* 113 */         this.act = ((PrimitiveAction)localClass.newInstance());
/* 114 */       } catch (Exception localException) { throw new AblRuntimeError("Reflection error in PrimitiveStep.suspend()", localException); }
/* 115 */       this.executing = false;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void metaSuspend()
/*     */   {
/* 122 */     super.metaSuspend();
/* 123 */     BehavingEntity.getBehavingEntity().suspendStep(this);
/* 124 */     if (isExecuting())
/*     */     {
/* 126 */       this.act.abort();
/*     */       try {
/* 128 */         Class localClass = this.act.getClass();
/* 129 */         this.act = ((PrimitiveAction)localClass.newInstance());
/* 130 */       } catch (Exception localException) { throw new AblRuntimeError("Reflection error in PrimitiveStep.suspend()", localException); }
/* 131 */       this.executing = false;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void jointSuspend()
/*     */   {
/* 138 */     super.jointSuspend();
/* 139 */     BehavingEntity.getBehavingEntity().suspendStep(this);
/* 140 */     if (isExecuting())
/*     */     {
/* 142 */       this.act.abort();
/*     */       try {
/* 144 */         Class localClass = this.act.getClass();
/* 145 */         this.act = ((PrimitiveAction)localClass.newInstance());
/* 146 */       } catch (Exception localException) { throw new AblRuntimeError("Reflection error in PrimitiveStep.suspend()", localException); }
/* 147 */       this.executing = false;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void unsuspend(ExecutableStep paramExecutableStep)
/*     */   {
/* 154 */     super.unsuspend(paramExecutableStep);
/* 155 */     if (!isSuspended()) {
/* 156 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void metaUnsuspend()
/*     */   {
/* 163 */     super.metaUnsuspend();
/* 164 */     if (!isSuspended()) {
/* 165 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/*     */     }
/*     */   }
/*     */   
/*     */   void jointUnsuspend()
/*     */   {
/* 171 */     super.jointUnsuspend();
/* 172 */     if (!isSuspended()) {
/* 173 */       BehavingEntity.getBehavingEntity().unsuspendStep(this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\PrimitiveStep.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */