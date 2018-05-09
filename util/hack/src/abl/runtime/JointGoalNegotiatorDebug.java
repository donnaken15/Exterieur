/*     */ package abl.runtime;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ 
/*     */ class JointGoalNegotiatorDebug extends JointGoalNegotiator implements abl.compiler.AblDebuggerConstants
/*     */ {
/*     */   private final byte debugLevel;
/*     */   private final List negotiationEvents;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  13 */     this.negotiationEvents = new java.util.ArrayList(20);
/*     */   }
/*     */   
/*     */   class JointGoalNegotiationInfo
/*     */   {
/*     */     final JointGoalStep g;
/*     */     final BehavingEntity behavingEntity;
/*     */     final int intention;
/*     */     
/*     */     JointGoalNegotiationInfo(JointGoalStep paramJointGoalStep, BehavingEntity paramBehavingEntity, int paramInt) {
/*  23 */       this.g = paramJointGoalStep;
/*  24 */       this.behavingEntity = paramBehavingEntity;
/*  25 */       this.intention = paramInt;
/*     */     }
/*     */   }
/*     */   
/*     */   class JointGoalNegotiationEvent
/*     */   {
/*     */     String negotiation;
/*     */     JointGoalNegotiatorDebug.JointGoalNegotiationInfo info;
/*     */     int currentState;
/*     */     
/*     */     JointGoalNegotiationEvent(String paramString, JointGoalNegotiatorDebug.JointGoalNegotiationInfo paramJointGoalNegotiationInfo, int paramInt)
/*     */     {
/*  37 */       this.negotiation = paramString;
/*  38 */       this.info = paramJointGoalNegotiationInfo;
/*  39 */       this.currentState = paramInt;
/*     */     }
/*     */     
/*     */     public String toString()
/*     */     {
/*  44 */       if (this.info != null) {
/*     */         String str;
/*  46 */         if (this.info.behavingEntity != null) {
/*  47 */           str = this.info.behavingEntity.getBehavingEntityShortName();
/*     */         } else
/*  49 */           str = "self";
/*  50 */         return this.negotiation + " from: " + str + ", intention: " + JointGoalNegotiatorDebug.formatIntention(this.info.intention) + ", state: " + JointGoalNegotiatorDebug.formatState(this.currentState);
/*     */       }
/*     */       
/*     */ 
/*  54 */       return "state changed by " + this.negotiation + " to: " + JointGoalNegotiatorDebug.formatState(this.currentState);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   JointGoalNegotiatorDebug(java.util.Set paramSet, boolean paramBoolean, JointGoalStep paramJointGoalStep, byte paramByte)
/*     */   {
/*  62 */     super(paramSet, paramBoolean, paramJointGoalStep);jdMethod_this();
/*  63 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */   JointGoalNegotiatorDebug(java.util.Hashtable paramHashtable, byte paramByte)
/*     */   {
/*  68 */     super(paramHashtable);jdMethod_this();
/*  69 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */   JointGoalNegotiatorDebug(java.util.Hashtable paramHashtable, int paramInt, byte paramByte)
/*     */   {
/*  74 */     super(paramHashtable, paramInt);jdMethod_this();
/*  75 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */   JointGoalNegotiatorDebug(java.util.Set paramSet, JointGoalStep paramJointGoalStep, byte paramByte)
/*     */   {
/*  80 */     super(paramSet, paramJointGoalStep);jdMethod_this();
/*  81 */     this.debugLevel = paramByte;
/*     */   }
/*     */   
/*     */   protected synchronized void setState(int paramInt)
/*     */   {
/*  86 */     JointGoalNegotiationThread localJointGoalNegotiationThread = (JointGoalNegotiationThread)Thread.currentThread();
/*  87 */     this.negotiationEvents.add(new JointGoalNegotiationEvent(localJointGoalNegotiationThread.descriptorString, null, paramInt));
/*  88 */     super.setState(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected final void initiateNegotiationAction(JointGoalStep paramJointGoalStep, int paramInt)
/*     */   {
/*  95 */     JointGoalNegotiationInfo localJointGoalNegotiationInfo = new JointGoalNegotiationInfo(paramJointGoalStep, null, paramInt);
/*  96 */     if (this.debugLevel == 2)
/*  97 */       ((DebuggableJointGoalStep)this.negotiatingGoal).traceAblNegotiationEvent(20, localJointGoalNegotiationInfo);
/*  98 */     this.negotiationEvents.add(new JointGoalNegotiationEvent("INITIATE_NEGOTIATION", localJointGoalNegotiationInfo, getState()));
/*     */   }
/*     */   
/*     */ 
/*     */   protected final void completeNegotiationAction(JointGoalStep paramJointGoalStep, int paramInt)
/*     */   {
/* 104 */     JointGoalNegotiationInfo localJointGoalNegotiationInfo = new JointGoalNegotiationInfo(paramJointGoalStep, null, paramInt);
/* 105 */     if (this.debugLevel == 2)
/* 106 */       ((DebuggableJointGoalStep)this.negotiatingGoal).traceAblNegotiationEvent(21, localJointGoalNegotiationInfo);
/* 107 */     this.negotiationEvents.add(new JointGoalNegotiationEvent("COMPLETE_NEGOTIATION", localJointGoalNegotiationInfo, getState()));
/*     */   }
/*     */   
/*     */ 
/*     */   protected final void initiateIntentionAction(BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep, int paramInt)
/*     */   {
/* 113 */     JointGoalNegotiationInfo localJointGoalNegotiationInfo = new JointGoalNegotiationInfo(paramJointGoalStep, paramBehavingEntity, paramInt);
/* 114 */     if (this.debugLevel == 2)
/* 115 */       ((DebuggableJointGoalStep)this.negotiatingGoal).traceAblNegotiationEvent(22, localJointGoalNegotiationInfo);
/* 116 */     this.negotiationEvents.add(new JointGoalNegotiationEvent("INITIATE_INTENTION", localJointGoalNegotiationInfo, getState()));
/*     */   }
/*     */   
/*     */ 
/*     */   protected final void commitToIntentionAction(JointGoalStep paramJointGoalStep, int paramInt)
/*     */   {
/* 122 */     JointGoalNegotiationInfo localJointGoalNegotiationInfo = new JointGoalNegotiationInfo(paramJointGoalStep, null, paramInt);
/* 123 */     if (this.debugLevel == 2)
/* 124 */       ((DebuggableJointGoalStep)this.negotiatingGoal).traceAblNegotiationEvent(23, localJointGoalNegotiationInfo);
/* 125 */     this.negotiationEvents.add(new JointGoalNegotiationEvent("COMMIT_TO_INTENTION", localJointGoalNegotiationInfo, getState()));
/*     */   }
/*     */   
/*     */ 
/*     */   protected final void processIntentionAction(BehavingEntity paramBehavingEntity, JointGoalStep paramJointGoalStep, int paramInt)
/*     */   {
/* 131 */     JointGoalNegotiationInfo localJointGoalNegotiationInfo = new JointGoalNegotiationInfo(paramJointGoalStep, paramBehavingEntity, paramInt);
/* 132 */     if (this.debugLevel == 2)
/* 133 */       ((DebuggableJointGoalStep)this.negotiatingGoal).traceAblNegotiationEvent(24, localJointGoalNegotiationInfo);
/* 134 */     this.negotiationEvents.add(new JointGoalNegotiationEvent("PROCESS_INTENTION", localJointGoalNegotiationInfo, getState()));
/*     */   }
/*     */   
/*     */   void printNegotiationHistory(PrintStream paramPrintStream)
/*     */   {
/* 139 */     java.util.Iterator localIterator = this.negotiationEvents.iterator();
/* 140 */     paramPrintStream.println("Negotiation history:  for " + this.negotiatingGoal + ':');
/* 141 */     paramPrintStream.println("   Current state: " + formatState(getState()));
/* 142 */     while (localIterator.hasNext()) {
/* 143 */       JointGoalNegotiationEvent localJointGoalNegotiationEvent = (JointGoalNegotiationEvent)localIterator.next();
/* 144 */       paramPrintStream.println("   " + localJointGoalNegotiationEvent);
/*     */     }
/*     */   }
/*     */   
/*     */   final void printNegotiationHistory()
/*     */   {
/* 150 */     printNegotiationHistory(System.err);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\JointGoalNegotiatorDebug.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */