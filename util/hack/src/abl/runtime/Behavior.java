/*     */ package abl.runtime;
/*     */ 
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.beans.PropertyChangeSupport;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public abstract class Behavior
/*     */   implements ABTNode
/*     */ {
/*     */   public static final short SEQUENTIAL = 0;
/*     */   public static final short PARALLEL = 1;
/*     */   public static final short COLLECTION = 2;
/*     */   public static final short ADAPTIVE = 3;
/*     */   final AblNamedPropertySupport propertyTable;
/*     */   protected GoalStep parent;
/*     */   private short priority;
/*     */   protected boolean isAtomic;
/*     */   protected PropertyChangeSupport changes;
/*     */   protected boolean behaviorRemoved;
/*     */   protected final String signature;
/*     */   protected final Object[] behaviorVariableFrame;
/*     */   protected final __StepDesc[] stepDescs;
/*     */   protected short specificity;
/*     */   protected Set teamMembers;
/*     */   protected final int behaviorID;
/*     */   private final Method contextCondition;
/*     */   private final Method contextConditionSensorFactory;
/*     */   private final Method successCondition;
/*     */   private final Method successConditionSensorFactory;
/*     */   private BehaviorWME behaviorWME;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.Behavior;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   boolean getBehaviorRemoved()
/*     */   {
/*  39 */     return this.behaviorRemoved;
/*     */   }
/*     */   
/*  42 */   void setBehaviorRemoved() { this.behaviorRemoved = true; }
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
/*     */   Object[] getBehaviorVariableFrame()
/*     */   {
/*  71 */     return this.behaviorVariableFrame;
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
/*     */ 
/*     */   public Behavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc)
/*     */   {
/*  85 */     jdMethod_this();
/*  86 */     this.parent = paramGoalStep;
/*  87 */     if ((paramGoalStep != null) && (!this.isAtomic))
/*     */     {
/*  89 */       this.isAtomic = this.parent.getIsAtomic();
/*     */     } else {
/*  91 */       this.isAtomic = paramBoolean;
/*     */     }
/*  93 */     this.contextCondition = paramMethod1;
/*  94 */     this.contextConditionSensorFactory = paramMethod2;
/*  95 */     this.successCondition = paramMethod3;
/*  96 */     this.successConditionSensorFactory = paramMethod4;
/*  97 */     this.signature = paramString;
/*  98 */     this.specificity = paramShort;
/*  99 */     this.behaviorID = paramInt;
/* 100 */     this.behaviorVariableFrame = paramArrayOfObject;
/* 101 */     this.stepDescs = paramArrayOf__StepDesc;
/*     */     
/*     */ 
/* 104 */     if (this.parent != null) {
/* 105 */       this.priority = this.parent.getPriority();
/*     */     } else {
/* 107 */       this.priority = 0;
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public Behavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4, boolean paramBoolean, String paramString, short paramShort, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, BehavingEntity[] paramArrayOfBehavingEntity)
/*     */   {
/* 124 */     this(paramGoalStep, paramMethod1, paramMethod2, paramMethod3, paramMethod4, paramBoolean, paramString, paramShort, paramInt, paramArrayOfObject, paramArrayOf__StepDesc);
/* 125 */     if ((!$noassert) && ((paramArrayOfBehavingEntity == null) || (paramArrayOfBehavingEntity.length <= 0))) throw new AssertionError();
/* 126 */     this.teamMembers = new HashSet();
/* 127 */     for (int i = 0; i < paramArrayOfBehavingEntity.length; i++)
/* 128 */       this.teamMembers.add(paramArrayOfBehavingEntity[i]);
/*     */   }
/*     */   
/*     */   int getID() {
/* 132 */     return this.behaviorID;
/*     */   }
/*     */   
/*     */   short getPriority() {
/* 136 */     return this.priority;
/*     */   }
/*     */   
/*     */   final GoalStep getParent() {
/* 140 */     return this.parent;
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     try {
/* 145 */       String str1 = getSignature();
/*     */       String str2;
/* 147 */       switch (getBehaviorType()) {
/*     */       case 0: 
/* 149 */         str2 = "sequential";
/* 150 */         break;
/*     */       case 1: 
/* 152 */         str2 = "parallel";
/* 153 */         break;
/*     */       case 2: 
/* 155 */         str2 = "collection";
/* 156 */         break;
/*     */       default: 
/* 158 */         str2 = "UNEXPECTED BEHAVIOR TYPE";
/*     */       }
/*     */       
/* 161 */       return str2 + ' ' + str1 + " priority: " + this.priority;
/*     */     } catch (Exception localException) {
/* 163 */       throw new AblRuntimeError("Reflection error in SequentialBehavior.toString()");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   boolean getHasContextCondition()
/*     */   {
/* 172 */     if (this.contextCondition != null) {
/* 173 */       return true;
/*     */     }
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   boolean getHasSuccessCondition()
/*     */   {
/* 180 */     if (this.successCondition != null) {
/* 181 */       return true;
/*     */     }
/* 183 */     return false;
/*     */   }
/*     */   
/*     */   short getSpecificity() {
/* 187 */     return this.specificity;
/*     */   }
/*     */   
/*     */   void setSpecificity(short paramShort)
/*     */   {
/* 192 */     this.specificity = paramShort;
/*     */   }
/*     */   
/*     */   String getSignature() {
/* 196 */     return this.signature;
/*     */   }
/*     */   
/*     */   boolean isJointBehavior()
/*     */   {
/* 201 */     if (this.teamMembers != null) {
/* 202 */       return true;
/*     */     }
/* 204 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   final Set getTeamMembers()
/*     */   {
/* 210 */     if ((!$noassert) && (!isJointBehavior())) throw new AssertionError();
/* 211 */     return this.teamMembers;
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
/*     */ 
/*     */   protected void removeChild(Step paramStep, boolean paramBoolean)
/*     */   {
/* 225 */     int i = paramStep.getStepType();
/*     */     
/* 227 */     switch (i) {
/*     */     case 0: 
/* 229 */       if (((PrimitiveStep)paramStep).isExecuting())
/*     */       {
/* 231 */         ((PrimitiveStep)paramStep).abort();
/*     */       }
/* 233 */       ((PrimitiveStep)paramStep).processStepRemoval();
/* 234 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 235 */       this.changes.firePropertyChange("child", paramStep, null);
/* 236 */       break;
/*     */     case 1: 
/* 238 */       if (((GoalStep)paramStep).isExpanded())
/*     */       {
/* 240 */         ((GoalStep)paramStep).removeGoal(); }
/* 241 */       ((GoalStep)paramStep).processStepRemoval();
/* 242 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 243 */       this.changes.firePropertyChange("child", paramStep, null);
/* 244 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 2: 
/* 250 */       ((MentalStep)paramStep).delete();
/* 251 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 252 */       this.changes.firePropertyChange("child", paramStep, null);
/* 253 */       break;
/*     */     case 3: 
/*     */     case 4: 
/*     */     case 5: 
/*     */     case 6: 
/* 258 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 259 */       this.changes.firePropertyChange("child", paramStep, null);
/* 260 */       break;
/*     */     default: 
/* 262 */       throw new AblRuntimeError("Unexpected step type " + i);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void failBehaviorBody() {
/* 267 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 268 */     removeChildren();
/*     */     
/* 270 */     if (this.parent != null)
/*     */     {
/*     */ 
/* 273 */       this.parent.addFailedBehavior(this);
/*     */       
/* 275 */       this.parent.removeChild(false);
/*     */       
/*     */ 
/* 278 */       BehavingEntity.getBehavingEntity().resetStep(this.parent);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void failBehavior()
/*     */   {
/* 286 */     List localList = freezeSubtreeAndNegotiateRemoval();
/* 287 */     if (!localList.isEmpty())
/*     */     {
/* 289 */       Behavior.1 local1 = new Behavior.1(this, null, this + " negotiateFailThread", localList);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local1);
/*     */     }
/*     */     else {
/* 300 */       failBehaviorBody();
/*     */     }
/*     */   }
/*     */   
/*     */   void removeBehavior() {
/* 305 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 306 */     removeChildren();
/*     */   }
/*     */   
/*     */   private final void succeedBehaviorBody() {
/* 310 */     BehavingEntity.getBehavingEntity().removeBehavior(this);
/* 311 */     removeChildren();
/* 312 */     if (this.parent != null)
/*     */     {
/* 314 */       this.parent.removeChild(false);
/* 315 */       this.parent.succeedStep();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void succeedBehavior()
/*     */   {
/* 324 */     List localList = freezeSubtreeAndNegotiateRemoval();
/*     */     
/* 326 */     if (!localList.isEmpty())
/*     */     {
/* 328 */       Behavior.2 local2 = new Behavior.2(this, null, this + " negotiateSucceedThread", localList);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */       BehavingEntity.getBehavingEntity().registerNegotiationThread(local2);
/* 337 */     } else if ((isJointBehavior()) && (hasTeamEffectOnlySteps())) {
/* 338 */       this.parent.succeedStep();
/*     */     }
/*     */     else {
/* 341 */       succeedBehaviorBody();
/*     */     }
/*     */   }
/*     */   
/*     */   boolean contextCondition()
/*     */   {
/* 347 */     if (this.contextCondition == null)
/*     */     {
/* 349 */       return true;
/*     */     }
/* 351 */     Object[] arrayOfObject = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/*     */     try {
/* 353 */       Boolean localBoolean = (Boolean)this.contextCondition.invoke(null, arrayOfObject);
/* 354 */       return localBoolean.booleanValue();
/*     */     } catch (Exception localException) {
/* 356 */       throw new AblRuntimeError("Error invoking context condition", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   final SensorActivation[] getContextConditionSensorActivations()
/*     */   {
/* 364 */     if (this.contextConditionSensorFactory == null) {
/* 365 */       return null;
/*     */     }
/* 367 */     Object[] arrayOfObject = { new Integer(this.behaviorID) };
/*     */     try {
/* 369 */       return (SensorActivation[])this.contextConditionSensorFactory.invoke(null, arrayOfObject);
/*     */     } catch (Exception localException) {
/* 371 */       throw new AblRuntimeError("Error invoking context condition sensor factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   boolean successCondition()
/*     */   {
/* 378 */     if (this.successCondition == null)
/*     */     {
/* 380 */       return false;
/*     */     }
/* 382 */     Object[] arrayOfObject = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/*     */     try {
/* 384 */       Boolean localBoolean = (Boolean)this.successCondition.invoke(null, arrayOfObject);
/* 385 */       return localBoolean.booleanValue();
/*     */     } catch (Exception localException) {
/* 387 */       throw new AblRuntimeError("Error invoking success condition", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   final SensorActivation[] getSuccessConditionSensorActivations()
/*     */   {
/* 395 */     if (this.successConditionSensorFactory == null) {
/* 396 */       return null;
/*     */     }
/* 398 */     Object[] arrayOfObject = { new Integer(this.behaviorID) };
/*     */     try {
/* 400 */       return (SensorActivation[])this.successConditionSensorFactory.invoke(null, arrayOfObject);
/*     */     } catch (Exception localException) {
/* 402 */       throw new AblRuntimeError("Error invoking success condition sensor factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  19 */     this.propertyTable = new AblNamedPropertySupport();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  27 */     this.priority = 0;
/*     */     
/*     */ 
/*  30 */     this.isAtomic = false;
/*     */     
/*  32 */     this.changes = new PropertyChangeSupport(this);
/*     */     
/*     */ 
/*     */ 
/*  36 */     this.behaviorRemoved = false;
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
/*  59 */     this.teamMembers = null;
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
/* 434 */     this.behaviorWME = null;
/*     */   }
/*     */   
/* 437 */   public void addChildChangeListener(PropertyChangeListener paramPropertyChangeListener) { this.changes.addPropertyChangeListener("child", paramPropertyChangeListener); }
/*     */   
/*     */   public void removeChildChangeListener(PropertyChangeListener paramPropertyChangeListener) {
/* 440 */     this.changes.removePropertyChangeListener("child", paramPropertyChangeListener);
/*     */   }
/*     */   
/*     */   void setReflectionWME(BehaviorWME paramBehaviorWME)
/*     */   {
/* 445 */     this.behaviorWME = paramBehaviorWME;
/*     */   }
/*     */   
/*     */   protected BehaviorWME getReflectionWME()
/*     */   {
/* 450 */     return this.behaviorWME;
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
/*     */ 
/*     */ 
/*     */   protected List freezeChild(Step paramStep)
/*     */   {
/* 465 */     int i = paramStep.getStepType();
/*     */     
/* 467 */     switch (i) {
/*     */     case 0: 
/* 469 */       if (((PrimitiveStep)paramStep).isExecuting())
/*     */       {
/* 471 */         ((PrimitiveStep)paramStep).abort();
/*     */       }
/*     */       
/* 474 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 475 */       paramStep.updateStepsSuspendingMe();
/* 476 */       return new Vector(0);
/*     */     case 1: 
/* 478 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 479 */       paramStep.updateStepsSuspendingMe();
/* 480 */       return ((GoalStep)paramStep).freezeSubtreeAndNegotiateRemoval();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 2: 
/* 486 */       ((MentalStep)paramStep).delete();
/*     */       
/* 488 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 489 */       paramStep.updateStepsSuspendingMe();
/* 490 */       return new Vector(0);
/*     */     case 3: 
/*     */     case 4: 
/*     */     case 5: 
/*     */     case 6: 
/* 495 */       BehavingEntity.getBehavingEntity().removeStep(paramStep);
/* 496 */       paramStep.updateStepsSuspendingMe();
/* 497 */       return new Vector(0);
/*     */     }
/* 499 */     throw new AblRuntimeError("Unexpected step type " + i);
/*     */   }
/*     */   
/*     */   protected List negotiateSuspensionOfChild(Step paramStep, ExecutableStep paramExecutableStep)
/*     */   {
/* 504 */     int i = paramStep.getStepType();
/*     */     
/* 506 */     switch (i) {
/*     */     case 0: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/*     */     case 5: 
/* 512 */       if (paramExecutableStep != null) {
/* 513 */         paramStep.suspend(paramExecutableStep);
/*     */       } else
/* 515 */         paramStep.metaSuspend();
/* 516 */       return new Vector(0);
/*     */     case 1: 
/* 518 */       return ((GoalStep)paramStep).negotiateSuspensionOfSubtree(paramExecutableStep);
/*     */     }
/* 520 */     throw new AblRuntimeError("Unexpected step type " + i);
/*     */   }
/*     */   
/*     */   protected List negotiateSuspensionOfChild(Step paramStep)
/*     */   {
/* 525 */     int i = paramStep.getStepType();
/*     */     
/* 527 */     switch (i)
/*     */     {
/*     */ 
/*     */     case 0: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/*     */     case 5: 
/* 535 */       paramStep.jointSuspend();
/* 536 */       return new Vector(0);
/*     */     case 1: 
/* 538 */       return ((GoalStep)paramStep).negotiateSuspensionOfSubtree(); }
/*     */     
/* 540 */     throw new AblRuntimeError("Unexpected step type " + i);
/*     */   }
/*     */   
/*     */ 
/*     */   boolean isRootBehavior()
/*     */   {
/* 546 */     if (this.parent == null) {
/* 547 */       return true;
/*     */     }
/* 549 */     return false;
/*     */   }
/*     */   
/*     */   abstract short getBehaviorType();
/*     */   
/*     */   abstract void addChildren();
/*     */   
/*     */   abstract void removeChildren();
/*     */   
/*     */   protected abstract boolean hasTeamEffectOnlySteps();
/*     */   
/*     */   abstract boolean currentLineOfExpansion(GoalStep paramGoalStep);
/*     */   
/*     */   abstract void suspend(ExecutableStep paramExecutableStep);
/*     */   
/*     */   abstract void suspendSkipJointGoals(ExecutableStep paramExecutableStep);
/*     */   
/*     */   abstract void jointUnsuspend();
/*     */   
/*     */   abstract void unsuspend(ExecutableStep paramExecutableStep);
/*     */   
/*     */   abstract void metaSuspend();
/*     */   
/*     */   abstract void metaSuspendSkipJointGoals();
/*     */   
/*     */   abstract void metaUnsuspend();
/*     */   
/*     */   abstract List freezeSubtreeAndNegotiateRemoval();
/*     */   
/*     */   protected abstract List freezeNonTeamEffectOnlySubtreeAndNegotiateRemoval();
/*     */   
/*     */   abstract List negotiateSuspensionOfSubtree();
/*     */   
/*     */   abstract List negotiateSuspensionOfSubtree(ExecutableStep paramExecutableStep);
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Behavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */