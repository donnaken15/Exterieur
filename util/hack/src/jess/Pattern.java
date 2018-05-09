/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pattern
/*     */   implements ConditionalElement, LHSComponent, Serializable, Visitable
/*     */ {
/*     */   private static final int INITSIZE = 1;
/*     */   private Deftemplate m_deft;
/*     */   private Test1[][] m_tests;
/*     */   private int[] m_slotLengths;
/*     */   private boolean m_negated;
/*     */   private boolean m_logical;
/*     */   private boolean m_explicit;
/*     */   private String m_name;
/*     */   private String m_boundName;
/*     */   
/*     */   public Object clone()
/*     */   {
/*     */     try
/*     */     {
/*  27 */       Pattern localPattern = (Pattern)super.clone();
/*  28 */       if (this.m_slotLengths != null)
/*  29 */         localPattern.m_slotLengths = ((int[])this.m_slotLengths.clone());
/*  30 */       if (this.m_tests != null)
/*  31 */         localPattern.m_tests = ((Test1[][])this.m_tests.clone());
/*  32 */       for (int i = 0; i < this.m_tests.length; i++) {
/*  33 */         if (this.m_tests[i] != null) {
/*  34 */           localPattern.m_tests[i] = ((Test1[])this.m_tests[i].clone());
/*  35 */           for (int j = 0; j < this.m_tests[i].length; j++) {
/*  36 */             localPattern.m_tests[i][j] = ((Test1)this.m_tests[i][j].clone());
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  41 */       return localPattern;
/*     */     }
/*     */     catch (CloneNotSupportedException localCloneNotSupportedException) {}
/*  44 */     return null;
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
/*     */   public Pattern(String paramString, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  70 */     this(paramString, paramRete.createDeftemplate(paramString));
/*     */   }
/*     */   
/*     */   public Pattern(String paramString, Deftemplate paramDeftemplate) {
/*  74 */     this.m_name = paramString;
/*  75 */     this.m_deft = paramDeftemplate;
/*     */     
/*  77 */     int i = this.m_deft.getNSlots();
/*  78 */     this.m_tests = new Test1[i][];
/*  79 */     this.m_slotLengths = new int[i];
/*  80 */     for (int j = 0; j < i; j++) {
/*  81 */       this.m_slotLengths[j] = -1;
/*     */     }
/*     */   }
/*     */   
/*     */   Pattern(Pattern paramPattern, String paramString)
/*     */     throws JessException
/*     */   {
/*  88 */     this.m_name = paramString;
/*  89 */     this.m_deft = paramPattern.m_deft;
/*     */     
/*     */ 
/*     */ 
/*  93 */     this.m_tests = new Test1[paramPattern.m_tests.length][];
/*  94 */     for (int i = 0; i < this.m_tests.length; i++) {
/*  95 */       this.m_tests[i] = (paramPattern.m_tests[i] == null ? null : new Test1[paramPattern.m_tests[i].length]);
/*     */       
/*  97 */       if (this.m_tests[i] != null) {
/*  98 */         System.arraycopy(paramPattern.m_tests[i], 0, this.m_tests[i], 0, this.m_tests[i].length);
/*     */         
/* 100 */         for (int j = 0; j < this.m_tests[i].length; j++) {
/* 101 */           Value localValue = this.m_tests[i][j].m_slotValue;
/* 102 */           if (((localValue instanceof Variable)) && (localValue.variableValue(null).startsWith("_blank_")))
/*     */           {
/*     */ 
/* 105 */             this.m_tests[i][j] = new Test1(this.m_tests[i][j], new Variable(RU.gensym("_blank_"), localValue.type()));
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 113 */     this.m_slotLengths = paramPattern.m_slotLengths;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setSlotLength(String paramString, int paramInt)
/*     */     throws JessException
/*     */   {
/* 121 */     int i = this.m_deft.getSlotIndex(paramString);
/* 122 */     if (i == -1) {
/* 123 */       throw new JessException("Pattern.setSlotLength", "No such slot " + paramString + " in template", this.m_deft.getName());
/*     */     }
/*     */     
/*     */ 
/* 127 */     this.m_slotLengths[i] = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addTest(String paramString, Test1 paramTest1)
/*     */     throws JessException
/*     */   {
/* 137 */     int i = this.m_deft.getSlotIndex(paramString);
/* 138 */     if (i == -1) {
/* 139 */       throw new JessException("Pattern.addTest", "No such slot " + paramString + " in template ", this.m_deft.getName());
/*     */     }
/*     */     
/*     */ 
/* 143 */     if (this.m_tests[i] == null) {
/* 144 */       this.m_tests[i] = new Test1[1];
/*     */     }
/* 146 */     int j = 0;
/* 147 */     while ((j < this.m_tests[i].length) && (this.m_tests[i][j] != null)) {
/* 148 */       j++;
/*     */     }
/* 150 */     if (j == this.m_tests[i].length) {
/* 151 */       Test1[] arrayOfTest1 = new Test1[j + 1];
/* 152 */       System.arraycopy(this.m_tests[i], 0, arrayOfTest1, 0, j);
/* 153 */       this.m_tests[i] = arrayOfTest1;
/*     */     }
/*     */     
/*     */ 
/* 157 */     if ((j > 0) && (this.m_tests[i][(j - 1)].m_subIdx > paramTest1.m_subIdx)) {
/* 158 */       throw new JessException("Pattern.addTest", "Attempt to add out-of-order test: index ", this.m_tests[i][(j - 1)].m_subIdx + " > " + paramTest1.m_subIdx);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 163 */     this.m_tests[i][j] = paramTest1;
/*     */   }
/*     */   
/*     */   void replaceTests(int paramInt, Test1[] paramArrayOfTest1)
/*     */   {
/* 168 */     this.m_tests[paramInt] = paramArrayOfTest1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void addDirectlyMatchedVariables(Map paramMap)
/*     */     throws JessException
/*     */   {
/* 176 */     for (int i = 0; i < getNSlots(); i++) {
/* 177 */       for (int j = 0; j < getNTests(i); j++) {
/* 178 */         Test1 localTest1 = getTest(i, j);
/* 179 */         Value localValue = localTest1.m_slotValue;
/* 180 */         if (localTest1.m_test == 0) 0; int k = 1;
/* 181 */         if (((localValue instanceof Variable)) && (k != 0)) {
/* 182 */           String str = localValue.variableValue(null);
/* 183 */           paramMap.put(str, str);
/*     */         }
/*     */       }
/*     */     }
/* 187 */     if (getBoundName() != null) {
/* 188 */       paramMap.put(getBoundName(), getBoundName());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void renameUnmentionedVariables(Map paramMap1, Map paramMap2, int paramInt, HasLHS paramHasLHS)
/*     */     throws JessException
/*     */   {
/* 196 */     String str1 = "_" + paramInt + '_';
/* 197 */     for (int i = 0; i < getNSlots(); i++) {
/* 198 */       for (int j = 0; j < getNTests(i); j++) {
/* 199 */         Test1 localTest1 = getTest(i, j);
/* 200 */         Value localValue = localTest1.m_slotValue;
/* 201 */         if (localTest1.m_test == 0) 0; int k = 1;
/* 202 */         if (((localValue instanceof Variable)) && (k != 0)) {
/* 203 */           String str2 = localValue.variableValue(null);
/* 204 */           if ((paramMap1.get(str2) == null) && (!str2.startsWith(str1)))
/*     */           {
/*     */             String str3;
/* 207 */             if (paramMap2.get(str2) == null) {
/* 208 */               str3 = str1 + str2;
/* 209 */               paramMap2.put(str2, str3);
/*     */             } else {
/* 211 */               str3 = (String)paramMap2.get(str2); }
/* 212 */             localTest1.m_slotValue = new Variable(str3, localValue.type());
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 217 */     substituteVariableNamesInFuncalls(paramMap2);
/*     */   }
/*     */   
/*     */   private final void substituteVariableNamesInFuncalls(Map paramMap)
/*     */     throws JessException
/*     */   {
/* 223 */     for (int i = 0; i < getNSlots(); i++) {
/* 224 */       if (getNTests(i) != 0)
/*     */       {
/* 226 */         for (int j = 0; j < getNTests(i); j++) {
/* 227 */           Value localValue = getTest(i, j).m_slotValue;
/* 228 */           if (localValue.type() == 64)
/* 229 */             substFuncall(localValue.funcallValue(null), paramMap);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final void substFuncall(Funcall paramFuncall, Map paramMap) throws JessException {
/* 236 */     for (int i = 1; i < paramFuncall.size(); i++) {
/* 237 */       Value localValue = paramFuncall.get(i);
/* 238 */       if ((localValue instanceof Variable)) {
/* 239 */         String str = (String)paramMap.get(localValue.variableValue(null));
/*     */         
/* 241 */         if (str != null) {
/* 242 */           paramFuncall.set(new Variable(str, localValue.type()), i);
/*     */         }
/* 244 */       } else if ((localValue instanceof FuncallValue)) {
/* 245 */         substFuncall(localValue.funcallValue(null), paramMap);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean getNegated()
/*     */   {
/* 253 */     return this.m_negated;
/*     */   }
/*     */   
/*     */   public void setNegated() {
/* 257 */     this.m_negated = true;
/*     */   }
/*     */   
/*     */   public void setLogical() {
/* 261 */     this.m_logical = true;
/*     */   }
/*     */   
/*     */   public boolean getLogical() {
/* 265 */     return this.m_logical;
/*     */   }
/*     */   
/*     */   public void setExplicit() {
/* 269 */     this.m_explicit = true;
/*     */   }
/*     */   
/*     */   public boolean getExplicit() {
/* 273 */     return this.m_explicit;
/*     */   }
/*     */   
/*     */   public boolean getBackwardChaining() {
/* 277 */     return this.m_deft.getBackwardChaining();
/*     */   }
/*     */   
/*     */   public String getName() {
/* 281 */     return this.m_name;
/*     */   }
/*     */   
/*     */   public void setBoundName(String paramString) throws JessException {
/* 285 */     if (((this.m_negated) || (this.m_name.equals("test"))) && (paramString != null)) {
/* 286 */       throw new JessException("Pattern.setBoundName", "Can't bind negated pattern to variable", paramString);
/*     */     }
/*     */     
/* 289 */     this.m_boundName = paramString;
/*     */   }
/*     */   
/*     */   public String getBoundName() {
/* 293 */     if ((isBackwardChainingTrigger()) && (this.m_boundName == null))
/* 294 */       this.m_boundName = RU.gensym("__factidx");
/* 295 */     return this.m_boundName;
/*     */   }
/*     */   
/*     */   public int getNSlots() {
/* 299 */     return this.m_tests.length;
/*     */   }
/*     */   
/*     */   public int getNTests(int paramInt) {
/* 303 */     if (this.m_tests[paramInt] == null) {
/* 304 */       return 0;
/*     */     }
/* 306 */     return this.m_tests[paramInt].length;
/*     */   }
/*     */   
/*     */   public int getSlotLength(int paramInt) {
/* 310 */     return this.m_slotLengths[paramInt];
/*     */   }
/*     */   
/*     */   public int getNMultifieldsInSlot(int paramInt) {
/* 314 */     int i = 0;
/* 315 */     if (this.m_tests[paramInt] == null)
/* 316 */       return i;
/* 317 */     for (int j = 0; j < this.m_tests[paramInt].length; j++) {
/* 318 */       if (this.m_tests[paramInt][j].m_slotValue.type() == 8192)
/* 319 */         i++;
/*     */     }
/* 321 */     return i;
/*     */   }
/*     */   
/*     */   public boolean isMultifieldSubslot(int paramInt1, int paramInt2) {
/* 325 */     if (this.m_tests[paramInt1] == null) {
/* 326 */       return false;
/*     */     }
/* 328 */     for (int i = 0; i < this.m_tests[paramInt1].length; i++)
/* 329 */       if ((this.m_tests[paramInt1][i].m_slotValue.type() == 8192) && (this.m_tests[paramInt1][i].m_subIdx == paramInt2))
/*     */       {
/* 331 */         return true; }
/* 332 */     return false;
/*     */   }
/*     */   
/*     */   boolean[] getMultifieldFlags(int paramInt) {
/* 336 */     boolean[] arrayOfBoolean = new boolean[getSlotLength(paramInt)];
/*     */     
/* 338 */     for (int i = 0; i < getSlotLength(paramInt); i++) {
/* 339 */       if (isMultifieldSubslot(paramInt, i))
/* 340 */         arrayOfBoolean[i] = true;
/*     */     }
/* 342 */     return arrayOfBoolean;
/*     */   }
/*     */   
/*     */   public Test1 getTest(int paramInt1, int paramInt2) {
/* 346 */     return this.m_tests[paramInt1][paramInt2];
/*     */   }
/*     */   
/*     */   public Deftemplate getDeftemplate() {
/* 350 */     return this.m_deft;
/*     */   }
/*     */   
/*     */   public void addToGroup(Group paramGroup) throws JessException {
/* 354 */     Pattern localPattern = (Pattern)clone();
/* 355 */     paramGroup.m_data.add(localPattern);
/*     */   }
/*     */   
/*     */   public LHSComponent canonicalize() {
/* 359 */     return this;
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 363 */     return paramVisitor.visitPattern(this);
/*     */   }
/*     */   
/*     */   public int getGroupSize() {
/* 367 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean isGroup() {
/* 371 */     return false;
/*     */   }
/*     */   
/*     */   public ConditionalElement getConditionalElement(int paramInt) {
/* 375 */     return (ConditionalElement)getLHSComponent(paramInt);
/*     */   }
/*     */   
/*     */   public int getPatternCount() {
/* 379 */     return 1;
/*     */   }
/*     */   
/*     */   public LHSComponent getLHSComponent(int paramInt)
/*     */   {
/* 384 */     if (paramInt > 0) {
/* 385 */       throw new IllegalArgumentException();
/*     */     }
/* 387 */     return this;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 391 */     if (!(paramObject instanceof Pattern)) {
/* 392 */       return false;
/*     */     }
/* 394 */     Pattern localPattern = (Pattern)paramObject;
/* 395 */     if (!getName().equals(localPattern.getName())) {
/* 396 */       return false;
/*     */     }
/* 398 */     if (this.m_negated != localPattern.m_negated) {
/* 399 */       return false;
/*     */     }
/* 401 */     for (int i = 0; i < this.m_slotLengths.length; i++) {
/* 402 */       if (this.m_slotLengths[i] != localPattern.m_slotLengths[i])
/* 403 */         return false;
/*     */     }
/* 405 */     for (i = 0; i < this.m_tests.length; i++) {
/* 406 */       if ((this.m_tests[i] == null) || (localPattern.m_tests[i] == null))
/*     */       {
/* 408 */         if (this.m_tests[i] != localPattern.m_tests[i]) {
/* 409 */           return false;
/*     */         }
/*     */       }
/*     */       else {
/* 413 */         if (this.m_tests[i].length != localPattern.m_tests[i].length) {
/* 414 */           return false;
/*     */         }
/* 416 */         for (int j = 0; j < this.m_tests[i].length; j++) {
/* 417 */           if (((this.m_tests[i][j] == null) || (localPattern.m_tests[i][j] == null)) && (this.m_tests[i][j] != localPattern.m_tests[i][j]))
/*     */           {
/*     */ 
/* 420 */             return false;
/*     */           }
/* 422 */           if (!this.m_tests[i][j].equals(localPattern.m_tests[i][j]))
/* 423 */             return false;
/*     */         }
/*     */       }
/*     */     }
/* 427 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isBackwardChainingTrigger() {
/* 431 */     if ((!this.m_negated) && (this.m_deft.isBackwardChainingTrigger())) 0; return true;
/*     */   }
/*     */   
/*     */   public String getBackchainingTemplateName() {
/* 435 */     return this.m_deft.getBackchainingTemplateName();
/*     */   }
/*     */   
/*     */   public String getNameWithoutBackchainingPrefix() {
/* 439 */     return this.m_deft.getNameWithoutBackchainingPrefix();
/*     */   }
/*     */   
/*     */   public String toString() {
/* 443 */     return "(" + getName() + ')';
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Pattern.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */