/*     */ package abl.runtime;
/*     */ 
/*     */ import java.beans.PropertyChangeSupport;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AdaptiveBehavior
/*     */   extends MultiStepBehavior
/*     */ {
/*     */   protected static final short behaviorType = 3;
/*     */   static List oldStateWMEList;
/*     */   private final short adaptiveBehaviorType;
/*     */   private final Method reinforcementSignal;
/*     */   private final Method reinforcementSignalSensorFactory;
/*     */   private final Method stateWME;
/*     */   private final Method stateWMESensorFactory;
/*     */   private final Method rlPolicy;
/*     */   private static final boolean $noassert = Class.forName("[Labl.runtime.AdaptiveBehavior;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public AdaptiveBehavior(GoalStep paramGoalStep, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4, Method paramMethod5, Method paramMethod6, Method paramMethod7, Method paramMethod8, Method paramMethod9, boolean paramBoolean, String paramString, short paramShort1, int paramInt, Object[] paramArrayOfObject, __StepDesc[] paramArrayOf__StepDesc, short paramShort2)
/*     */   {
/*  44 */     super(paramGoalStep, paramMethod1, paramMethod2, paramMethod3, paramMethod4, paramBoolean, paramString, paramShort1, paramInt, paramArrayOfObject, paramArrayOf__StepDesc, -1);
/*  45 */     this.reinforcementSignal = paramMethod5;
/*  46 */     this.reinforcementSignalSensorFactory = paramMethod6;
/*  47 */     this.stateWME = paramMethod7;
/*  48 */     this.stateWMESensorFactory = paramMethod8;
/*  49 */     this.rlPolicy = paramMethod9;
/*  50 */     this.adaptiveBehaviorType = paramShort2;
/*     */   }
/*     */   
/*     */   final int getNumberNeededForSuccess() {
/*  54 */     throw new AblRuntimeError("numberNeededForSuccess is meaningless for AdaptiveBehaviors");
/*     */   }
/*     */   
/*     */   private final boolean childrenConsistencyTest()
/*     */   {
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   protected final void removeChildren()
/*     */   {
/*  64 */     if ((!$noassert) && (!childrenConsistencyTest())) throw new AssertionError();
/*  65 */     super.removeChildren();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   final void addChild(Step paramStep)
/*     */   {
/*  72 */     if (!$noassert) { 0; break label19; throw new AssertionError(); }
/*  73 */     label19: this.children.add(paramStep);
/*  74 */     BehavingEntity.getBehavingEntity().addStep(paramStep);
/*  75 */     this.changes.firePropertyChange("child", null, paramStep);
/*     */   }
/*     */   
/*     */ 
/*     */   final void addChildren()
/*     */   {
/*  81 */     if ((!$noassert) && (this.children.size() != 0)) throw new AssertionError();
/*  82 */     addChild(new ExecutePolicyStep(this));
/*     */   }
/*     */   
/*     */ 
/*     */   protected final void removeChild(Step paramStep, boolean paramBoolean)
/*     */   {
/*  88 */     if ((!$noassert) && (!this.children.contains(paramStep))) throw new AssertionError("child == " + paramStep + " current children == " + this.children);
/*  89 */     if ((!$noassert) && (!childrenConsistencyTest())) { throw new AssertionError();
/*     */     }
/*  91 */     super.removeChild(paramStep, paramBoolean);
/*  92 */     this.children.remove(paramStep);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */     clearLastPursuedGoal();
/*     */   }
/*     */   
/*     */   protected final Step[] getAllSteps()
/*     */   {
/* 104 */     throw new AblRuntimeError("Don't call getAllSteps() on AdaptiveBehaviors");
/*     */   }
/*     */   
/*     */ 
/*     */   final boolean isSuccessful()
/*     */   {
/* 110 */     return false;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*     */     try {
/* 116 */       String str1 = getSignature();
/*     */       String str2;
/* 118 */       switch (getAdaptiveBehaviorType()) {
/*     */       case 0: 
/* 120 */         str2 = "adaptive sequential";
/* 121 */         break;
/*     */       case 1: 
/* 123 */         str2 = "adaptive parallel";
/* 124 */         break;
/*     */       
/*     */       case 2: 
/* 127 */         throw new AblRuntimeError("Adaptive collection behaviors currently not supported");
/*     */       default: 
/* 129 */         str2 = "UNEXPECTED BEHAVIOR TYPE";
/*     */       }
/*     */       
/* 132 */       return str2 + ' ' + str1 + " priority: " + getPriority();
/*     */     } catch (Exception localException) {
/* 134 */       throw new AblRuntimeError("Reflection error in SequentialBehavior.toString()");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   final boolean currentLineOfExpansion(GoalStep paramGoalStep)
/*     */   {
/* 141 */     if ((!$noassert) && (this.parent == null)) throw new AssertionError("AdaptiveBehavior found at the root of the ABT " + this);
/* 142 */     return super.currentLineOfExpansion(paramGoalStep);
/*     */   }
/*     */   
/*     */   void executePolicy()
/*     */   {
/*     */     try {
/* 148 */       ArrayList localArrayList = new ArrayList();
/* 149 */       SensorActivation[] arrayOfSensorActivation = getStateWMESensorActivations();
/* 150 */       if (arrayOfSensorActivation != null) {
/* 151 */         for (int i = 0; i < arrayOfSensorActivation.length; i++) {
/* 152 */           localArrayList.add(arrayOfSensorActivation[i]);
/*     */         }
/* 154 */         BehavingEntity.getBehavingEntity().runSensors(new ArrayList(localArrayList), false);
/*     */       }
/*     */       
/* 157 */       Object[] arrayOfObject1 = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/* 158 */       oldStateWMEList = (List)this.stateWME.invoke(null, arrayOfObject1);
/*     */       
/* 160 */       Object[] arrayOfObject2 = { oldStateWMEList, 0, new Double(0.0D), new Boolean(false) };
/* 161 */       int j = ((Integer)this.rlPolicy.invoke(null, arrayOfObject2)).intValue();
/*     */       
/* 163 */       Object[] arrayOfObject3 = { new Integer(this.behaviorID), this, getBehaviorVariableFrame() };
/* 164 */       Step localStep = (Step)this.stepDescs[j].factory.invoke(null, arrayOfObject3);
/* 165 */       addChild(localStep);
/* 166 */       localStep.execute();
/*     */     } catch (Exception localException) {
/* 168 */       throw new AblRuntimeError("Error invoking executePolicy", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void updatePolicy()
/*     */   {
/*     */     try
/*     */     {
/* 177 */       HashSet localHashSet = new HashSet();
/*     */       
/* 179 */       SensorActivation[] arrayOfSensorActivation1 = getReinforcementSignalSensorActivations();
/* 180 */       if (arrayOfSensorActivation1 != null) {
/* 181 */         for (int i = 0; i < arrayOfSensorActivation1.length; i++)
/* 182 */           localHashSet.add(arrayOfSensorActivation1[i]);
/*     */       }
/* 184 */       SensorActivation[] arrayOfSensorActivation2 = getStateWMESensorActivations();
/* 185 */       if (arrayOfSensorActivation2 != null) {
/* 186 */         for (int j = 0; j < arrayOfSensorActivation2.length; j++)
/* 187 */           localHashSet.add(arrayOfSensorActivation2[j]);
/*     */       }
/* 189 */       BehavingEntity.getBehavingEntity().runSensors(new ArrayList(localHashSet), false);
/*     */       
/* 191 */       Object[] arrayOfObject1 = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/* 192 */       List localList = (List)this.stateWME.invoke(null, arrayOfObject1);
/*     */       
/* 194 */       Object[] arrayOfObject2 = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/* 195 */       double d = ((Double)this.reinforcementSignal.invoke(null, arrayOfObject2)).doubleValue();
/*     */       
/* 197 */       Object[] arrayOfObject3 = { oldStateWMEList, localList, new Double(d), new Boolean(true) };
/* 198 */       int k = ((Integer)this.rlPolicy.invoke(null, arrayOfObject3)).intValue();
/*     */     } catch (Exception localException) {
/* 200 */       throw new AblRuntimeError("Error invoking updatePolicy", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   final float reinforcementSignal()
/*     */   {
/* 206 */     if ((!$noassert) && (this.reinforcementSignal == null)) throw new AssertionError();
/* 207 */     Object[] arrayOfObject = { new Integer(this.behaviorID), this.behaviorVariableFrame, BehavingEntity.getBehavingEntity() };
/*     */     try {
/* 209 */       Float localFloat = (Float)this.reinforcementSignal.invoke(null, arrayOfObject);
/* 210 */       return localFloat.floatValue();
/*     */     } catch (Exception localException) {
/* 212 */       throw new AblRuntimeError("Error invoking reinforcement signal function", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   final SensorActivation[] getReinforcementSignalSensorActivations()
/*     */   {
/* 219 */     if (this.reinforcementSignalSensorFactory == null) {
/* 220 */       return null;
/*     */     }
/* 222 */     Object[] arrayOfObject = { new Integer(this.behaviorID) };
/*     */     try {
/* 224 */       return (SensorActivation[])this.reinforcementSignalSensorFactory.invoke(null, arrayOfObject);
/*     */     } catch (Exception localException) {
/* 226 */       throw new AblRuntimeError("Error invoking reinforcement signal sensor factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   final SensorActivation[] getStateWMESensorActivations()
/*     */   {
/* 235 */     if (this.stateWMESensorFactory == null) {
/* 236 */       return null;
/*     */     }
/* 238 */     Object[] arrayOfObject = { new Integer(this.behaviorID) };
/*     */     try {
/* 240 */       return (SensorActivation[])this.stateWMESensorFactory.invoke(null, arrayOfObject);
/*     */     } catch (Exception localException) {
/* 242 */       throw new AblRuntimeError("Error invoking stateWME sensor factory", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public short getBehaviorType()
/*     */   {
/* 248 */     return 3;
/*     */   }
/*     */   
/*     */   public short getAdaptiveBehaviorType() {
/* 252 */     return this.adaptiveBehaviorType;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AdaptiveBehavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */