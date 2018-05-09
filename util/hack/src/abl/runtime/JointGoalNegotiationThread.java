/*     */ package abl.runtime;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ abstract class JointGoalNegotiationThread extends Thread
/*     */ {
/*     */   private boolean isWaiting;
/*     */   private boolean isStarted;
/*     */   private final JointGoalNegotiator negotiator;
/*     */   final String descriptorString;
/*     */   
/*     */   private final void jdMethod_this() {
/*  13 */     this.isWaiting = true;
/*  14 */     this.isStarted = false;
/*     */   }
/*     */   
/*     */   private final String stackTrace;
/*     */   private final int originalPriority;
/*     */   private final JointGoalStep negotiatingStep;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.JointGoalNegotiationThread;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   JointGoalNegotiationThread(JointGoalNegotiator paramJointGoalNegotiator, String paramString)
/*     */   {
/*  23 */     jdMethod_this();
/*  24 */     this.descriptorString = paramString;
/*     */     
/*  26 */     this.negotiator = paramJointGoalNegotiator;
/*  27 */     this.negotiatingStep = null;
/*  28 */     java.io.ByteArrayOutputStream localByteArrayOutputStream = new java.io.ByteArrayOutputStream();
/*  29 */     new Throwable().printStackTrace(new PrintStream(localByteArrayOutputStream));
/*  30 */     this.stackTrace = localByteArrayOutputStream.toString();
/*  31 */     this.originalPriority = Thread.currentThread().getPriority();
/*     */   }
/*     */   
/*     */   JointGoalNegotiationThread(JointGoalStep paramJointGoalStep, String paramString)
/*     */   {
/*  36 */     jdMethod_this();
/*  37 */     this.descriptorString = paramString;
/*     */     
/*  39 */     this.negotiatingStep = paramJointGoalStep;
/*  40 */     this.negotiator = null;
/*  41 */     java.io.ByteArrayOutputStream localByteArrayOutputStream = new java.io.ByteArrayOutputStream();
/*  42 */     new Throwable().printStackTrace(new PrintStream(localByteArrayOutputStream));
/*  43 */     this.stackTrace = localByteArrayOutputStream.toString();
/*  44 */     this.originalPriority = Thread.currentThread().getPriority();
/*     */   }
/*     */   
/*  47 */   public synchronized boolean getIsWaiting() { return this.isWaiting; }
/*  48 */   private final synchronized void setIsWaiting(boolean paramBoolean) { this.isWaiting = paramBoolean; }
/*     */   
/*  50 */   public synchronized boolean getIsStarted() { return this.isStarted; }
/*  51 */   private final synchronized void setIsStarted(boolean paramBoolean) { this.isStarted = paramBoolean; }
/*     */   
/*     */ 
/*     */   public void start()
/*     */   {
/*  56 */     if ((!$noassert) && (Thread.currentThread() != BehavingEntity.getBehavingEntity().getDecisionCycleThread())) throw new AssertionError();
/*  57 */     setIsStarted(true);
/*  58 */     setIsWaiting(false);
/*     */     
/*  60 */     Thread.currentThread().setPriority(10);
/*  61 */     super.start();
/*  62 */     waitForNegotiation();
/*     */   }
/*     */   
/*     */   synchronized void waitForDecisionCycle()
/*     */   {
/*  67 */     if ((!$noassert) && (this.isWaiting)) { throw new AssertionError();
/*     */     }
/*  69 */     int i = Thread.currentThread().getPriority();
/*     */     
/*  71 */     this.isWaiting = true;
/*     */     
/*  73 */     Thread.currentThread().setPriority(10);
/*  74 */     notify();
/*     */     try {
/*  76 */       wait();
/*  77 */       yield();
/*  78 */       Thread.currentThread().setPriority(this.originalPriority);
/*     */     }
/*     */     catch (InterruptedException localInterruptedException) {
/*  81 */       System.out.println(this);
/*  82 */       throw new AblRuntimeError(localInterruptedException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   synchronized void continueNegotiation()
/*     */   {
/*  90 */     if ((!$noassert) && (this == Thread.currentThread())) { throw new AssertionError();
/*     */     }
/*  92 */     if (this.isWaiting)
/*     */     {
/*     */ 
/*  95 */       Thread.currentThread().setPriority(10);
/*  96 */       notify();
/*  97 */       this.isWaiting = false;
/*     */       try {
/*  99 */         wait();
/* 100 */         yield();
/* 101 */         Thread.currentThread().setPriority(this.originalPriority);
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {
/* 104 */         System.out.println(this);
/* 105 */         throw new AblRuntimeError(localInterruptedException);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private final synchronized void waitForNegotiation()
/*     */   {
/* 113 */     if ((!$noassert) && (this == Thread.currentThread())) throw new AssertionError();
/*     */     try {
/* 115 */       wait();
/* 116 */       yield();
/* 117 */       Thread.currentThread().setPriority(this.originalPriority);
/*     */     }
/*     */     catch (InterruptedException localInterruptedException) {
/* 120 */       System.out.println(this);
/* 121 */       throw new AblRuntimeError(localInterruptedException);
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 127 */     java.io.ByteArrayOutputStream localByteArrayOutputStream = new java.io.ByteArrayOutputStream();
/* 128 */     PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
/* 129 */     localPrintStream.println("JointGoalNegotiationThread: " + this.descriptorString);
/* 130 */     localPrintStream.println("Thread is alive: " + isAlive());
/* 131 */     localPrintStream.println("Current execution state:");
/* 132 */     if (this.negotiator != null) {
/* 133 */       this.negotiator.printNegotiationHistory(localPrintStream);
/* 134 */     } else if ((this.negotiatingStep != null) && (this.negotiatingStep.negotiator != null)) {
/* 135 */       this.negotiatingStep.negotiator.printNegotiationHistory(localPrintStream);
/*     */     } else
/* 137 */       localPrintStream.println("No negotiation history");
/* 138 */     localPrintStream.println("Stacktrace indicates negotiation initiator - NOT AN ERROR");
/* 139 */     localPrintStream.println(this.stackTrace);
/* 140 */     return localByteArrayOutputStream.toString();
/*     */   }
/*     */   
/*     */   String shortToString()
/*     */   {
/* 145 */     return "JointGoalNegotiationThread: " + this.descriptorString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalNegotiationThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */