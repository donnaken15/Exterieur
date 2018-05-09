/*     */ package jess;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public abstract class HasLHS extends Node implements java.io.Serializable, Visitable, Modular, NodeSink { String m_module;
/*     */   String m_name;
/*     */   String m_displayName;
/*     */   String m_docstring;
/*     */   private ArrayList m_nodes;
/*     */   private java.util.Hashtable m_bindings;
/*     */   private Group m_CEs;
/*     */   int m_nodeIndexHash;
/*     */   private StringBuffer m_compilationTrace;
/*     */   boolean m_new;
/*     */   boolean m_frozen;
/*     */   private HasLHS m_next;
/*     */   private int m_seqNum;
/*     */   
/*  19 */   private final void jdMethod_this() { this.m_docstring = "";
/*  20 */     this.m_nodes = new ArrayList();
/*  21 */     this.m_bindings = new java.util.Hashtable();
/*     */     
/*  23 */     this.m_nodeIndexHash = 0;
/*     */     
/*  25 */     this.m_new = true;
/*  26 */     this.m_frozen = false;
/*  27 */     this.m_next = null; }
/*     */   
/*  29 */   HasLHS(String paramString1, String paramString2, Rete paramRete) throws JessException { jdMethod_this();
/*     */     
/*  31 */     int i = paramString1.indexOf("::");
/*  32 */     if (i != -1) {
/*  33 */       this.m_module = paramString1.substring(0, i);
/*  34 */       paramRete.verifyModule(this.m_module);
/*  35 */       this.m_name = paramString1;
/*     */     } else {
/*  37 */       this.m_module = paramRete.getCurrentModule();
/*  38 */       this.m_name = paramRete.resolveName(paramString1);
/*     */     }
/*     */     
/*  41 */     int j = this.m_name.indexOf('&');
/*  42 */     this.m_displayName = (j == -1 ? this.m_name : this.m_name.substring(0, j));
/*     */     
/*  44 */     this.m_docstring = paramString2;
/*  45 */     this.m_CEs = new Group("and");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getGroupSize()
/*     */   {
/*  53 */     return this.m_CEs.getGroupSize();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   LHSComponent getLHSComponent(int paramInt)
/*     */   {
/*  62 */     return this.m_CEs.getLHSComponent(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConditionalElement getConditionalElements()
/*     */   {
/*  70 */     return (ConditionalElement)getLHSComponents();
/*     */   }
/*     */   
/*     */   LHSComponent getLHSComponents() {
/*  74 */     return this.m_CEs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String listNodes()
/*     */   {
/*  84 */     StringBuffer localStringBuffer = new StringBuffer(100);
/*  85 */     for (int i = 0; i < this.m_nodes.size(); i++) {
/*  86 */       localStringBuffer.append(this.m_nodes.get(i));
/*  87 */       localStringBuffer.append("\n");
/*     */     }
/*  89 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*  92 */   HasLHS getNext() { return this.m_next; }
/*  93 */   void setNext(HasLHS paramHasLHS) { this.m_next = paramHasLHS; }
/*     */   
/*     */   void freeze(Rete paramRete) throws JessException {
/*  96 */     this.m_frozen = true;
/*     */   }
/*     */   
/*     */   public int getPatternCount() {
/* 100 */     return getLHSComponents().getPatternCount();
/*     */   }
/*     */   
/*     */   void insertCEAt(LHSComponent paramLHSComponent, int paramInt, Rete paramRete) throws JessException
/*     */   {
/* 105 */     Group localGroup = this.m_CEs;
/* 106 */     this.m_bindings = new java.util.Hashtable();
/* 107 */     this.m_CEs = new Group("and");
/* 108 */     if (localGroup.getGroupSize() == 0) {
/* 109 */       addCE(paramLHSComponent, paramRete);
/* 110 */       return;
/*     */     }
/*     */     
/* 113 */     for (int i = 0; i < localGroup.getGroupSize(); i++) {
/* 114 */       if (i == paramInt)
/* 115 */         addCE(paramLHSComponent, paramRete);
/* 116 */       addCE(localGroup.getLHSComponent(i), paramRete);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void addCE(LHSComponent paramLHSComponent, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 126 */     paramLHSComponent = (LHSComponent)paramLHSComponent.clone();
/* 127 */     if (paramLHSComponent.getName().equals("not")) {
/* 128 */       this.m_CEs.renameVariables((Group)paramLHSComponent, this);
/*     */     }
/* 130 */     storeBoundName(paramLHSComponent);
/*     */     
/* 132 */     this.m_CEs.add(paramLHSComponent);
/*     */     
/*     */ 
/*     */ 
/* 136 */     findVariableDefinitions(paramLHSComponent);
/*     */     
/*     */ 
/*     */ 
/* 140 */     findUndefinedVariables(paramLHSComponent);
/*     */     
/*     */ 
/* 143 */     transformOrConjunctionsIntoOrFuncalls(paramLHSComponent, paramRete);
/*     */     
/* 145 */     addNOTToSupressUnneededBackwardChaining(paramLHSComponent, paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */   private final void addNOTToSupressUnneededBackwardChaining(LHSComponent paramLHSComponent, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 152 */     if (paramLHSComponent.isBackwardChainingTrigger()) {
/* 153 */       Pattern localPattern1 = (Pattern)paramLHSComponent;
/* 154 */       Pattern localPattern2 = new Pattern(localPattern1, localPattern1.getNameWithoutBackchainingPrefix());
/*     */       
/*     */ 
/*     */ 
/* 158 */       Group localGroup = new Group("not");
/* 159 */       localGroup.add(localPattern2);
/* 160 */       addCE(localGroup, paramRete);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void storeBoundName(LHSComponent paramLHSComponent) throws JessException {
/* 165 */     String str = paramLHSComponent.getBoundName();
/*     */     
/* 167 */     if ((str != null) && (this.m_bindings.get(str) == null)) {
/* 168 */       addBinding(str, paramLHSComponent, getGroupSize(), -1, -1, 16);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void findVariableDefinitions(LHSComponent paramLHSComponent)
/*     */     throws JessException
/*     */   {
/* 181 */     PatternIterator localPatternIterator = new PatternIterator(paramLHSComponent);
/* 182 */     for (int i = getPatternCount() - paramLHSComponent.getPatternCount(); localPatternIterator.hasNext(); i++) {
/* 183 */       Pattern localPattern = (Pattern)localPatternIterator.next();
/* 184 */       Deftemplate localDeftemplate = localPattern.getDeftemplate();
/* 185 */       for (int j = 0; j < localPattern.getNSlots(); j++) {
/* 186 */         for (int k = 0; k < localPattern.getNTests(j); k++) {
/* 187 */           Test1 localTest1 = localPattern.getTest(j, k);
/* 188 */           Value localValue = localTest1.m_slotValue;
/* 189 */           if (localTest1.m_test == 0) 0; int m = 1;
/* 190 */           if ((localValue instanceof Variable)) {
/* 191 */             String str = localValue.variableValue(null);
/* 192 */             if (this.m_bindings.get(str) == null)
/*     */             {
/* 194 */               if (!str.startsWith("*"))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */                 if (m != 0) {
/* 203 */                   int n = localDeftemplate.getSlotDataType(j);
/* 204 */                   this.m_bindings.put(str, new BindingValue(str, localPattern, i, j, localTest1.m_subIdx, n));
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private final void findUndefinedVariables(LHSComponent paramLHSComponent)
/*     */     throws JessException
/*     */   {
/*     */     Pattern localPattern;
/*     */     
/*     */     int i;
/*     */     
/* 222 */     for (PatternIterator localPatternIterator = new PatternIterator(paramLHSComponent); localPatternIterator.hasNext(); 
/*     */         
/* 224 */         i < localPattern.getNSlots())
/*     */     {
/* 223 */       localPattern = (Pattern)localPatternIterator.next();
/* 224 */       i = 0; continue;
/* 225 */       for (int j = 0; j < localPattern.getNTests(i); j++) {
/* 226 */         Test1 localTest1 = localPattern.getTest(i, j);
/* 227 */         Value localValue = localTest1.m_slotValue;
/* 228 */         if ((localValue instanceof Variable)) {
/* 229 */           String str = localValue.variableValue(null);
/* 230 */           if (this.m_bindings.get(str) == null)
/*     */           {
/* 232 */             if (!str.startsWith("*"))
/*     */             {
/*     */ 
/* 235 */               throw new JessException("HasLHS.addPattern", "First use of variable negated:", str);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 224 */       i++;
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
/*     */   private final void transformOrConjunctionsIntoOrFuncalls(LHSComponent paramLHSComponent, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 249 */     PatternIterator localPatternIterator = new PatternIterator(paramLHSComponent);
/* 250 */     for (int i = getGroupSize() - 1; localPatternIterator.hasNext(); i++) {
/* 251 */       Pattern localPattern = (Pattern)localPatternIterator.next();
/* 252 */       Deftemplate localDeftemplate = localPattern.getDeftemplate();
/*     */       
/* 254 */       for (int j = 0; j < localPattern.getNSlots(); j++) {
/* 255 */         Test1 localTest11 = localPattern.getNTests(j);
/*     */         
/* 257 */         if (localTest11 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 261 */           ArrayList localArrayList = new ArrayList();
/*     */           
/* 263 */           int k = localPattern.getTest(j, 0).m_subIdx;
/* 264 */           Test1 localTest12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */           while (localTest12 < localTest11)
/*     */           {
/* 272 */             int m = 0;
/* 273 */             Test1 localTest13; for (int n = localTest12; n < localTest11; n++)
/*     */             {
/* 275 */               localTest13 = localPattern.getTest(j, n);
/* 276 */               if (localTest13.m_subIdx != k)
/*     */                 break;
/* 278 */               if (localTest13.m_conjunction == 2) {
/* 279 */                 m = 1;
/* 280 */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */             Object localObject1;
/* 285 */             if (m == 0)
/*     */             {
/* 287 */               for (localTest13 = localTest12; localTest13 < localTest11; localTest13++) {
/* 288 */                 localObject1 = localPattern.getTest(j, localTest13);
/* 289 */                 if (((Test1)localObject1).m_subIdx != k) {
/* 290 */                   k = ((Test1)localObject1).m_subIdx;
/* 291 */                   break;
/*     */                 }
/*     */                 
/* 294 */                 localArrayList.add(localObject1);
/* 295 */                 localTest12++;
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 305 */               localTest13 = localPattern.getTest(j, localTest12);
/* 306 */               Value localValue = localTest13.m_slotValue;
/*     */               
/* 308 */               if (isAVariableDefinition(localValue, localPattern, j)) {
/* 309 */                 localObject1 = localValue;
/* 310 */                 localTest12++;
/*     */               }
/*     */               else {
/* 313 */                 localObject2 = RU.gensym("_blank_");
/* 314 */                 localObject1 = new Variable((String)localObject2, 8);
/* 315 */                 this.m_bindings.put(localObject2, new BindingValue((String)localObject2, getLHSComponent(i), i, j, k, localDeftemplate.getSlotDataType(j)));
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */               localArrayList.add(new Test1(0, k, (Value)localObject1));
/*     */               
/*     */ 
/* 326 */               Object localObject2 = new Funcall("or", paramRete);
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 331 */                 int i2 = 1;
/* 332 */                 Test1 localTest14; for (Object localObject3 = localTest12 + 1; localObject3 < localTest11; localObject3++) {
/* 333 */                   localTest14 = localPattern.getTest(j, localObject3);
/* 334 */                   if ((localTest14.m_conjunction != 2) && (localTest14.m_subIdx != k)) {
/*     */                     break;
/*     */                   }
/*     */                   
/* 338 */                   i2++;
/*     */                 }
/*     */                 
/* 341 */                 if (i2 == 1) {
/* 342 */                   ((Funcall)localObject2).add(testToFuncall(localPattern.getTest(j, localTest12), (Value)localObject1, paramRete));
/*     */                 }
/*     */                 else
/*     */                 {
/* 346 */                   localObject3 = new Funcall("and", paramRete);
/* 347 */                   for (localTest14 = localTest12; localTest14 < localTest12 + i2; localTest14++) {
/* 348 */                     ((Funcall)localObject3).add(testToFuncall(localPattern.getTest(j, localTest14), (Value)localObject1, paramRete));
/*     */                   }
/* 350 */                   ((Funcall)localObject2).add(new FuncallValue((Funcall)localObject3));
/*     */                 }
/*     */                 
/* 353 */                 localTest12 += i2;
/*     */                 
/* 355 */                 if (localTest12 == localTest11)
/*     */                   break;
/* 357 */                 if (localPattern.getTest(j, localTest12).m_subIdx != k) {
/*     */                   break;
/*     */                 }
/*     */               }
/* 361 */               localArrayList.add(new Test1(0, k, new FuncallValue((Funcall)localObject2)));
/*     */               
/*     */ 
/* 364 */               if ((localTest12 < localTest11) && (localPattern.getTest(j, localTest12).m_subIdx != k))
/*     */               {
/* 366 */                 k = localPattern.getTest(j, localTest12).m_subIdx; }
/*     */             }
/*     */           }
/* 369 */           Test1[] arrayOfTest1 = new Test1[localArrayList.size()];
/* 370 */           for (int i1 = 0; i1 < arrayOfTest1.length; i1++)
/* 371 */             arrayOfTest1[i1] = ((Test1)localArrayList.get(i1));
/* 372 */           localPattern.replaceTests(j, arrayOfTest1);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean isAVariableDefinition(Value paramValue, LHSComponent paramLHSComponent, int paramInt)
/*     */     throws JessException
/*     */   {
/* 381 */     if (paramValue.type() != 8) {
/* 382 */       return false;
/*     */     }
/* 384 */     BindingValue localBindingValue = (BindingValue)this.m_bindings.get(paramValue.variableValue(null));
/*     */     
/*     */ 
/* 387 */     if ((localBindingValue.getCE() == paramLHSComponent) && (localBindingValue.getSlotIndex() == paramInt)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final Value testToFuncall(Test1 paramTest1, Value paramValue, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 397 */     Value localValue = paramTest1.m_slotValue;
/* 398 */     switch (paramTest1.m_slotValue.type()) {
/*     */     case 64: 
/* 400 */       if (paramTest1.m_test == 1) {
/* 401 */         return new FuncallValue(new Funcall("not", paramRete).arg(localValue));
/*     */       }
/* 403 */       return localValue;
/*     */     }
/*     */     
/* 406 */     return new FuncallValue(new Funcall(paramTest1.m_test == 0 ? "eq" : "neq", paramRete).arg(localValue).arg(paramValue));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void addBinding(String paramString, LHSComponent paramLHSComponent, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */     throws JessException
/*     */   {
/* 416 */     this.m_bindings.put(paramString, new BindingValue(paramString, paramLHSComponent, paramInt1, paramInt2, paramInt3, paramInt4));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */   java.util.Hashtable getBindings() { return this.m_bindings; }
/*     */   
/* 425 */   ArrayList getNodes() { return this.m_nodes; }
/*     */   
/*     */   public void addNode(Node paramNode) throws JessException {
/* 428 */     if (paramNode == null) {
/* 429 */       new JessException("HasLHS.addNode", "Compiler fault", "null Node added");
/*     */     }
/*     */     
/*     */ 
/* 433 */     for (int i = 0; i < this.m_nodes.size(); i++) {
/* 434 */       if (paramNode == this.m_nodes.get(i))
/* 435 */         return;
/*     */     }
/* 437 */     appendCompilationTrace(paramNode);
/*     */     
/* 439 */     paramNode.m_usecount += 1;
/* 440 */     this.m_nodes.add(paramNode);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void remove(Node paramNode)
/*     */   {
/* 451 */     java.util.Iterator localIterator1 = this.m_nodes.iterator();
/* 452 */     while (localIterator1.hasNext()) {
/* 453 */       Node localNode1 = (Node)localIterator1.next();
/* 454 */       if (--localNode1.m_usecount <= 0) {
/* 455 */         paramNode.removeSuccessor(localNode1);
/* 456 */         java.util.Iterator localIterator2 = this.m_nodes.iterator();
/* 457 */         while (localIterator2.hasNext()) {
/* 458 */           Node localNode2 = (Node)localIterator2.next();
/* 459 */           localNode2.removeSuccessor(localNode1);
/*     */         }
/*     */       }
/*     */     }
/* 463 */     this.m_nodes.clear();
/*     */   }
/*     */   
/*     */   private final void appendCompilationTrace(Node paramNode) {
/* 467 */     if (this.m_compilationTrace == null) {
/* 468 */       this.m_compilationTrace = new StringBuffer(this.m_name + ": ");
/*     */     }
/* 470 */     if (paramNode.m_usecount == 0) {
/* 471 */       this.m_compilationTrace.append("+");
/*     */     } else {
/* 473 */       this.m_compilationTrace.append("=");
/*     */     }
/* 475 */     this.m_compilationTrace.append(paramNode.getCompilationTraceToken());
/*     */   }
/*     */   
/* 478 */   String getCompilationTraceToken() { return "t"; }
/*     */   
/* 480 */   StringBuffer getCompilationTrace() { return this.m_compilationTrace; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNodeIndexHash(int paramInt)
/*     */   {
/* 492 */     this.m_nodeIndexHash = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */   public int getNodeIndexHash()
/*     */   {
/* 498 */     return this.m_nodeIndexHash;
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getName()
/*     */   {
/* 504 */     return this.m_name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getDisplayName()
/*     */   {
/* 511 */     return this.m_displayName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public final String getDocstring()
/*     */   {
/* 518 */     return this.m_docstring;
/*     */   }
/*     */   
/* 521 */   void setOld() { this.m_new = false; }
/*     */   
/*     */ 
/*     */   public String getModule()
/*     */   {
/* 526 */     return this.m_module;
/*     */   }
/*     */   
/*     */   int getSequenceNumber()
/*     */   {
/* 531 */     return ++this.m_seqNum;
/*     */   }
/*     */   
/*     */   public abstract Object accept(Visitor paramVisitor);
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\HasLHS.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */