/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ public class Beat {
/*     */   private static final Class beatTests;
/*     */   private static final Class beatActions;
/*     */   private static final Class[] argTypes;
/*     */   private int beatID;
/*     */   private String beatName;
/*     */   private StoryEffect[] effects;
/*     */   private java.util.Hashtable initialValues;
/*     */   private float staticWeight;
/*     */   private int staticPriority;
/*     */   
/*  16 */   public static class PriorityTest implements Comparable { private final void jdMethod_this() { this.priorityTest = null; }
/*     */     
/*     */     public PriorityTest(String paramString, int paramInt) {
/*  19 */       jdMethod_this();
/*  20 */       this.priorityTestName = paramString;
/*  21 */       this.priority = paramInt;
/*     */     }
/*     */     
/*  24 */     public String getPriorityTestName() { return new String(this.priorityTestName); }
/*  25 */     public int getPriority() { return this.priority; }
/*     */     
/*     */     public boolean test(scope.VariableScope paramVariableScope)
/*     */       throws NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException
/*     */     {
/*  30 */       if (this.priorityTest == null) {
/*  31 */         this.priorityTest = Beat.beatTests.getMethod(this.priorityTestName, Beat.argTypes);
/*     */       }
/*  33 */       Object[] arrayOfObject = { paramVariableScope };
/*  34 */       return ((Boolean)this.priorityTest.invoke(null, arrayOfObject)).booleanValue();
/*     */     }
/*     */     
/*     */     private String priorityTestName;
/*     */     public int compareTo(Object paramObject)
/*     */     {
/*  40 */       Integer localInteger1 = new Integer(((PriorityTest)paramObject).getPriority());
/*  41 */       Integer localInteger2 = new Integer(this.priority);
/*  42 */       return -localInteger2.compareTo(localInteger1);
/*     */     }
/*     */     
/*     */     private int priority;
/*     */     Method priorityTest;
/*  47 */     public String toString() { return "PriorityTest(priorityTestName: " + this.priorityTestName + ", priority: " + this.priority + ')'; }
/*     */   }
/*     */   
/*     */   public static class WeightTest implements Comparable { private String weightTestName;
/*     */     private float weight;
/*     */     Method weightTest;
/*     */     
/*  54 */     private final void jdMethod_this() { this.weightTest = null; }
/*     */     
/*     */     public WeightTest(String paramString, float paramFloat) {
/*  57 */       jdMethod_this();
/*  58 */       this.weightTestName = paramString;
/*  59 */       this.weight = paramFloat;
/*     */     }
/*     */     
/*     */ 
/*  63 */     public String getWeightTestName() { return new String(this.weightTestName); }
/*  64 */     public float getWeight() { return this.weight; }
/*     */     
/*     */     public boolean test(scope.VariableScope paramVariableScope)
/*     */       throws NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException
/*     */     {
/*  69 */       if (this.weightTest == null) {
/*  70 */         this.weightTest = Beat.beatTests.getMethod(this.weightTestName, Beat.argTypes);
/*     */       }
/*  72 */       Object[] arrayOfObject = { paramVariableScope };
/*  73 */       return ((Boolean)this.weightTest.invoke(null, arrayOfObject)).booleanValue();
/*     */     }
/*     */     
/*     */ 
/*     */     public int compareTo(Object paramObject)
/*     */     {
/*  79 */       Float localFloat1 = new Float(((WeightTest)paramObject).getWeight());
/*  80 */       Float localFloat2 = new Float(this.weight);
/*  81 */       return -localFloat2.compareTo(localFloat1);
/*     */     }
/*     */     
/*     */     public String toString()
/*     */     {
/*  86 */       return "WeightTest(weightTestName: " + this.weightTestName + ", weight: " + this.weight + ')';
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private String[] preconditionNames;
/*     */   
/*     */   private PriorityTest[] priorityTests;
/*     */   
/*     */   private WeightTest[] weightTests;
/*     */   
/*     */   private float probability;
/*     */   
/*     */   private scope.VariableScope beatScope;
/*     */   
/*     */   private String initBeatMethodName;
/*     */   
/*     */   private String selectBeatMethodName;
/*     */   private String succeedBeatMethodName;
/*     */   private String abortBeatMethodName;
/*     */   private int priority;
/* 107 */   private static final boolean $noassert = Class.forName("[Ldramaman.runtime.Beat;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/* 101 */     this.initBeatMethodName = null;
/* 102 */     this.selectBeatMethodName = null;
/* 103 */     this.succeedBeatMethodName = null;
/* 104 */     this.abortBeatMethodName = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 109 */     this.priority = Integer.MIN_VALUE;
/*     */   }
/*     */   
/*     */   static
/*     */   {
/* 107 */     argTypes = new Class[1];
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 113 */       beatTests = Class.forName(DramaManager.getDramaManager().getBeatPackage() + ".BeatTests");
/* 114 */       beatActions = Class.forName(DramaManager.getDramaManager().getBeatPackage() + ".BeatActions");
/* 115 */       argTypes[0] = Class.forName("scope.VariableScope");
/* 116 */     } catch (ClassNotFoundException localClassNotFoundException) { throw new DramaManagerError(localClassNotFoundException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Beat(int paramInt1, String paramString1, StoryEffect[] paramArrayOfStoryEffect, float paramFloat, int paramInt2, String[] paramArrayOfString, WeightTest[] paramArrayOfWeightTest, PriorityTest[] paramArrayOfPriorityTest, scope.VariableScope paramVariableScope, String paramString2, String paramString3, String paramString4, String paramString5)
/*     */   {
/* 125 */     jdMethod_this();
/* 126 */     this.beatID = paramInt1;
/* 127 */     this.beatName = paramString1;
/* 128 */     this.effects = paramArrayOfStoryEffect;
/* 129 */     this.staticWeight = paramFloat;
/* 130 */     this.staticPriority = paramInt2;
/* 131 */     this.preconditionNames = paramArrayOfString;
/*     */     
/* 133 */     java.util.Arrays.sort(paramArrayOfWeightTest);
/* 134 */     this.weightTests = paramArrayOfWeightTest;
/* 135 */     java.util.Arrays.sort(paramArrayOfPriorityTest);
/* 136 */     this.priorityTests = paramArrayOfPriorityTest;
/* 137 */     this.beatScope = paramVariableScope;
/* 138 */     this.initBeatMethodName = paramString2;
/* 139 */     this.selectBeatMethodName = paramString3;
/* 140 */     this.succeedBeatMethodName = paramString4;
/* 141 */     this.abortBeatMethodName = paramString5;
/*     */   }
/*     */   
/*     */ 
/* 145 */   public int getBeatID() { return this.beatID; }
/* 146 */   public String getBeatName() { return this.beatName; }
/* 147 */   public StoryEffect[] getEffects() { return this.effects; }
/* 148 */   public float getStaticWeight() { return this.staticWeight; }
/* 149 */   public float getStaticPriority() { return this.staticPriority; }
/* 150 */   public float getProbability() { return this.probability; }
/* 151 */   public void setProbability(float paramFloat) { this.probability = paramFloat; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float score(java.util.Hashtable paramHashtable, int paramInt)
/*     */   {
/* 158 */     if (paramHashtable.size() != this.effects.length) {
/* 159 */       return 0.0F;
/*     */     }
/*     */     
/*     */ 
/* 163 */     java.util.Hashtable localHashtable = new java.util.Hashtable(paramHashtable);
/* 164 */     for (int i = 0; i < this.effects.length; i++)
/* 165 */       localHashtable.remove(this.effects[i].getValueName());
/* 166 */     if (localHashtable.size() != 0) {
/* 167 */       return 0.0F;
/*     */     }
/* 169 */     float f1 = 0.0F;
/* 170 */     for (int j = 0; j < this.effects.length; j++) {
/* 171 */       float f2 = 0.0F;
/* 172 */       StoryTarget localStoryTarget = (StoryTarget)paramHashtable.get(this.effects[j].getValueName());
/* 173 */       float f3 = StoryMemory.getStoryMemory().getStoryValue(this.effects[j].getValueWMEName());
/*     */       
/* 175 */       if (this.effects[j].getIsAbsolute()) {
/* 176 */         f2 = this.effects[j].getValueChange() - f3;
/*     */       } else
/* 178 */         f2 = this.effects[j].getValueChange();
/* 179 */       f1 = (float)(f1 + 1.0D / Math.exp(Math.abs(2.0F * (localStoryTarget.getDesiredSlope(paramInt, f3) - f2))));
/*     */     }
/* 181 */     f1 /= paramHashtable.size();
/* 182 */     return f1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public float rawProbability(java.util.Hashtable paramHashtable, int paramInt)
/*     */   {
/* 191 */     float f1 = score(paramHashtable, paramInt) * 3;
/*     */     
/*     */ 
/* 194 */     float f2 = 0.0F;
/*     */     try {
/* 196 */       for (int i = 0; i < this.weightTests.length; i++)
/* 197 */         if (this.weightTests[i].test(this.beatScope)) {
/* 198 */           f2 = this.weightTests[i].getWeight();
/* 199 */           break;
/*     */         }
/*     */     } catch (Exception localException) {
/* 202 */       throw new DramaManagerError(localException);
/*     */     }
/* 204 */     if (this.staticWeight > f2) { f2 = this.staticWeight;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 209 */     return f1 * f2;
/*     */   }
/*     */   
/*     */ 
/*     */   boolean precondition()
/*     */   {
/* 215 */     if (this.preconditionNames == null) throw new DramaManagerError("No precondition specified for beat " + this.beatName);
/*     */     try {
/* 217 */       for (int i = 0; i < this.preconditionNames.length; i++) {
/* 218 */         Method localMethod = beatTests.getMethod(this.preconditionNames[i], argTypes);
/* 219 */         Object[] arrayOfObject = { this.beatScope };
/* 220 */         if (((Boolean)localMethod.invoke(null, arrayOfObject)).booleanValue())
/* 221 */           return true;
/*     */       }
/* 223 */     } catch (Exception localException) { throw new DramaManagerError(localException); }
/* 224 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   int getPriority()
/*     */   {
/* 231 */     if ((!$noassert) && (this.priority == Integer.MIN_VALUE)) throw new AssertionError();
/* 232 */     return this.priority;
/*     */   }
/*     */   
/*     */   void setPriority()
/*     */   {
/* 237 */     int i = Integer.MIN_VALUE;
/*     */     try
/*     */     {
/* 240 */       for (int j = 0; j < this.priorityTests.length; j++)
/* 241 */         if (this.priorityTests[j].test(this.beatScope)) {
/* 242 */           i = this.priorityTests[j].getPriority();
/* 243 */           break;
/*     */         }
/*     */     } catch (Exception localException) {
/* 246 */       throw new DramaManagerError(localException);
/*     */     }
/* 248 */     if (this.staticPriority > i) { i = this.staticPriority;
/*     */     }
/* 250 */     this.priority = i;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void applyValueChanges()
/*     */   {
/* 256 */     for (int i = 0; i < this.effects.length; i++) {
/* 257 */       StoryEffect localStoryEffect = this.effects[i];
/* 258 */       if (localStoryEffect.getIsAbsolute()) {
/* 259 */         DramaManager.getStoryMemory().setStoryValue(localStoryEffect.getValueWMEName(), localStoryEffect.getValueChange());
/*     */       } else {
/* 261 */         float f = StoryMemory.getStoryMemory().getStoryValue(localStoryEffect.getValueWMEName());
/* 262 */         StoryMemory.getStoryMemory().setStoryValue(localStoryEffect.getValueWMEName(), f + localStoryEffect.getValueChange());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void init() {
/* 268 */     try { if (this.initBeatMethodName != null) {
/* 269 */         Method localMethod = beatActions.getMethod(this.initBeatMethodName, argTypes);
/* 270 */         Object[] arrayOfObject = { this.beatScope };
/* 271 */         localMethod.invoke(null, arrayOfObject);
/*     */       }
/* 273 */     } catch (Exception localException) { throw new DramaManagerError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   void select() {
/* 278 */     try { if (this.selectBeatMethodName != null) {
/* 279 */         Method localMethod = beatActions.getMethod(this.selectBeatMethodName, argTypes);
/* 280 */         Object[] arrayOfObject = { this.beatScope };
/* 281 */         localMethod.invoke(null, arrayOfObject);
/*     */       }
/* 283 */     } catch (Exception localException) { throw new DramaManagerError(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   void succeed() {
/* 288 */     if (DramaManager.getDramaManager().isManualTestMode())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 293 */       applyValueChanges();
/*     */     }
/*     */     try {
/* 296 */       if (this.succeedBeatMethodName != null) {
/* 297 */         Method localMethod = beatActions.getMethod(this.succeedBeatMethodName, argTypes);
/* 298 */         Object[] arrayOfObject = { this.beatScope };
/* 299 */         localMethod.invoke(null, arrayOfObject);
/*     */       }
/* 301 */     } catch (Exception localException) { throw new DramaManagerError(localException);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void abort()
/*     */   {
/*     */     try
/*     */     {
/* 329 */       if (this.abortBeatMethodName != null) {
/* 330 */         Method localMethod = beatActions.getMethod(this.abortBeatMethodName, argTypes);
/* 331 */         Object[] arrayOfObject = { this.beatScope };
/* 332 */         localMethod.invoke(null, arrayOfObject);
/*     */       }
/* 334 */     } catch (Exception localException) { throw new DramaManagerError(localException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\Beat.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */