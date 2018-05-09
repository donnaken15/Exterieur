/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ReteCompiler
/*     */   implements Serializable
/*     */ {
/*     */   private int m_hashkey;
/*     */   private RootNode m_root;
/*     */   private Hashtable m_doneVars;
/*     */   
/*     */   public int getHashKey()
/*     */   {
/*  27 */     return this.m_hashkey;
/*     */   }
/*     */   
/*     */   public void setHashKey(int paramInt) {
/*  31 */     this.m_hashkey = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Node getRoot()
/*     */   {
/*  41 */     return this.m_root;
/*     */   }
/*     */   
/*  44 */   public ReteCompiler() { jdMethod_this(); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized void addRule(HasLHS paramHasLHS, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  54 */     paramHasLHS.freeze(paramRete);
/*     */     
/*     */ 
/*  57 */     Hashtable localHashtable1 = paramHasLHS.getBindings();
/*     */     
/*  59 */     LHSComponent localLHSComponent = paramHasLHS.getLHSComponents();
/*  60 */     Hashtable localHashtable2 = new Hashtable();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  65 */     Node[] arrayOfNode = new Node[localLHSComponent.getPatternCount()];
/*  66 */     int i = compileConditionalElements(localLHSComponent, paramHasLHS, localHashtable2, localHashtable1, arrayOfNode, 0, paramRete, false);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  71 */     arrayOfNode[(i - 1)].mergeSuccessor(paramHasLHS, paramHasLHS);
/*     */     
/*     */     try
/*     */     {
/*  75 */       paramRete.updateNodes(localHashtable2);
/*     */     } finally {
/*  77 */       paramHasLHS.setOld();
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
/*     */   private final int compileConditionalElements(LHSComponent paramLHSComponent, HasLHS paramHasLHS, Hashtable paramHashtable1, Hashtable paramHashtable2, Node[] paramArrayOfNode, int paramInt, Rete paramRete, boolean paramBoolean)
/*     */     throws JessException
/*     */   {
/*  91 */     int i = paramInt;
/*  92 */     for (int j = 0; j < paramLHSComponent.getGroupSize(); j++)
/*     */     {
/*  94 */       LHSComponent localLHSComponent1 = paramLHSComponent.getLHSComponent(j);
/*     */       Node localNode;
/*  96 */       if ((localLHSComponent1 instanceof Pattern)) {
/*  97 */         Pattern localPattern = (Pattern)localLHSComponent1;
/*  98 */         buildPatternNetwork(paramHasLHS, localPattern, paramHashtable1, paramHashtable2, paramArrayOfNode, i);
/*     */         
/* 100 */         if (i == 0) {
/* 101 */           addRTLAdapter(i, paramArrayOfNode, paramHasLHS);
/*     */         }
/*     */         else {
/* 104 */           localNode = thirdPass(paramHasLHS, localPattern, paramArrayOfNode[(i - 1)], paramArrayOfNode[i], paramHashtable2, paramBoolean);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 109 */           paramArrayOfNode[(i - 1)] = (paramArrayOfNode[i] = localNode);
/*     */           
/*     */ 
/*     */ 
/* 113 */           if (localLHSComponent1.getLogical()) {
/* 114 */             ((Defrule)paramHasLHS).setLogicalInformation((Node2)localNode);
/*     */           }
/*     */         }
/* 117 */         i++;
/*     */       }
/* 119 */       else if (localLHSComponent1.getName().equals("not"))
/*     */       {
/* 121 */         boolean bool = noNotsAboveOrBelow(paramLHSComponent, localLHSComponent1);
/*     */         
/* 123 */         localNode = paramArrayOfNode[(i - 1)];
/* 124 */         int k = i - 1;
/*     */         
/*     */ 
/*     */ 
/* 128 */         int m = 1;
/* 129 */         LHSComponent localLHSComponent2 = localLHSComponent1.getLHSComponent(0);
/* 130 */         while (localLHSComponent2.getName().equals("not")) {
/* 131 */           m++;
/* 132 */           localLHSComponent2 = localLHSComponent2.getLHSComponent(0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 138 */         int n = compileConditionalElements(localLHSComponent2, paramHasLHS, paramHashtable1, paramHashtable2, paramArrayOfNode, i, paramRete, bool);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 143 */         Object localObject = paramArrayOfNode[(n - 1)];
/*     */         
/* 145 */         int i1 = hashValueFor(paramHasLHS);
/* 146 */         if (!bool) {
/* 147 */           for (int i2 = 0; i2 < m; i2++) {
/* 148 */             NodeJoin localNodeJoin = (NodeJoin)localObject;
/* 149 */             Node1LTR localNode1LTR = new Node1LTR();
/* 150 */             NodeNot2 localNodeNot2 = new NodeNot2(i1, i);
/*     */             
/*     */ 
/* 153 */             localNodeJoin.addSuccessor(localNode1LTR, paramHasLHS);
/*     */             
/* 155 */             localNode1LTR.addSuccessor(localNodeNot2, paramHasLHS);
/*     */             
/* 157 */             localNode.addSuccessor(localNodeNot2, paramHasLHS);
/* 158 */             paramArrayOfNode[(i - 1)] = (paramArrayOfNode[i] = localNodeNot2);
/* 159 */             localObject = localNodeNot2;
/*     */           }
/*     */         }
/*     */         
/* 163 */         i = k + 1;
/* 164 */         paramArrayOfNode[(i - 1)] = (paramArrayOfNode[i] = localObject);
/*     */         
/*     */ 
/*     */ 
/* 168 */         if (localLHSComponent1.getLogical()) {
/* 169 */           ((Defrule)paramHasLHS).setLogicalInformation((Node2)localObject);
/*     */         }
/* 171 */         i++;
/*     */       }
/*     */       else
/*     */       {
/* 175 */         i = compileConditionalElements(localLHSComponent1, paramHasLHS, paramHashtable1, paramHashtable2, paramArrayOfNode, i, paramRete, false);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */     return i;
/*     */   }
/*     */   
/*     */   private final void buildPatternNetwork(HasLHS paramHasLHS, Pattern paramPattern, Hashtable paramHashtable1, Hashtable paramHashtable2, Node[] paramArrayOfNode, int paramInt) throws JessException
/*     */   {
/* 189 */     paramArrayOfNode[paramInt] = firstPass(paramHasLHS, paramPattern, paramHashtable1, paramHashtable2);
/*     */     
/*     */ 
/* 192 */     paramArrayOfNode[paramInt] = secondPass(paramHasLHS, paramPattern, paramArrayOfNode[paramInt]);
/*     */   }
/*     */   
/*     */   private final boolean noNotsAboveOrBelow(LHSComponent paramLHSComponent1, LHSComponent paramLHSComponent2)
/*     */   {
/* 197 */     if ((!paramLHSComponent1.getName().equals("not")) && (!paramLHSComponent2.getLHSComponent(0).getName().equals("test")) && ((paramLHSComponent2.getLHSComponent(0) instanceof Pattern))) 0; boolean bool = true;
/*     */     
/*     */ 
/*     */ 
/* 201 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void addRTLAdapter(int paramInt, Node[] paramArrayOfNode, HasLHS paramHasLHS)
/*     */     throws JessException
/*     */   {
/* 211 */     Node1RTL localNode1RTL = new Node1RTL();
/* 212 */     localNode1RTL = (Node1RTL)(paramArrayOfNode[paramInt] = paramArrayOfNode[paramInt].mergeSuccessor(localNode1RTL, paramHasLHS));
/*     */     
/* 214 */     if (paramHasLHS.getLHSComponent(paramInt).getLogical()) {
/* 215 */       ((Defrule)paramHasLHS).setLogicalInformation(localNode1RTL);
/*     */     }
/*     */   }
/*     */   
/*     */   private final int hashValueFor(HasLHS paramHasLHS) {
/* 220 */     int i = paramHasLHS.getNodeIndexHash();
/* 221 */     if (i == 0)
/* 222 */       i = this.m_hashkey;
/* 223 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final Value eval(Hashtable paramHashtable, Value paramValue)
/*     */     throws JessException
/*     */   {
/* 233 */     if (paramValue.type() != 64) {
/* 234 */       return paramValue;
/*     */     }
/* 236 */     Funcall localFuncall = (Funcall)paramValue.funcallValue(null).clone();
/* 237 */     for (int i = 0; i < localFuncall.size(); i++) {
/* 238 */       Value localValue = localFuncall.get(i);
/* 239 */       if ((localValue instanceof Variable)) {
/* 240 */         String str = localValue.variableValue(null);
/* 241 */         BindingValue localBindingValue = (BindingValue)paramHashtable.get(str);
/* 242 */         if (localBindingValue != null) {
/* 243 */           localFuncall.set(localBindingValue, i);
/*     */ 
/*     */         }
/* 246 */         else if (str.charAt(0) != '*') {
/* 247 */           compilerError("eval", "Unbound variable found in funcall: " + str);
/*     */         }
/*     */         
/*     */ 
/*     */       }
/* 252 */       else if (localValue.type() == 64)
/*     */       {
/* 254 */         localFuncall.set(eval(paramHashtable, localValue), i);
/*     */       }
/*     */     }
/*     */     
/* 258 */     return new FuncallValue(localFuncall);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final boolean checkForMultiPattern(Value paramValue, Pattern paramPattern)
/*     */     throws JessException
/*     */   {
/* 268 */     Funcall localFuncall = paramValue.funcallValue(null);
/*     */     
/* 270 */     for (int i = 1; i < localFuncall.size(); i++) {
/* 271 */       Value localValue = localFuncall.get(i);
/* 272 */       if ((localValue.type() == 4096) && (((BindingValue)localValue).getCE() != paramPattern))
/*     */       {
/* 274 */         return true;
/*     */       }
/* 276 */       if ((localValue.type() == 64) && (checkForMultiPattern(localValue, paramPattern)))
/*     */       {
/* 278 */         return true; }
/*     */     }
/* 280 */     return false;
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  24 */     this.m_hashkey = 101;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  38 */     this.m_root = new RootNode();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */     this.m_doneVars = new Hashtable();
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
/*     */   private final Node firstPass(NodeSink paramNodeSink, Pattern paramPattern, Hashtable paramHashtable1, Hashtable paramHashtable2)
/*     */     throws JessException
/*     */   {
/* 304 */     Deftemplate localDeftemplate = paramPattern.getDeftemplate();
/*     */     
/*     */ 
/* 307 */     boolean bool = paramPattern.getName().equals("test");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */     Node localNode = this.m_root.mergeSuccessor(bool ? new Node1NONE() : new Node1TECT(paramPattern.getName()), paramNodeSink);
/*     */     
/*     */ 
/*     */ 
/* 321 */     paramHashtable1.put(localNode, localNode);
/*     */     
/*     */ 
/*     */     int j;
/*     */     
/*     */ 
/* 327 */     for (int i = 0; (!bool) && (i < paramPattern.getNSlots()); i++)
/*     */     {
/*     */ 
/* 330 */       if (localDeftemplate.getSlotType(i) == 32768)
/*     */       {
/*     */ 
/*     */ 
/* 334 */         if (paramPattern.getNMultifieldsInSlot(i) == 0) {
/* 335 */           j = paramPattern.getSlotLength(i);
/* 336 */           if (j != -1) {
/* 337 */             localNode = localNode.mergeSuccessor(new Node1MTELN(i, j), paramNodeSink);
/*     */           }
/*     */           
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 344 */           localNode = localNode.mergeSuccessor(new Node1MTMF(i, paramPattern.getMultifieldFlags(i)), paramNodeSink);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */     for (i = 0; (!bool) && (i < paramPattern.getNSlots()); i++)
/*     */     {
/*     */ 
/* 358 */       if (paramPattern.getNTests(i) != 0)
/*     */       {
/*     */ 
/* 361 */         j = i;
/*     */         
/* 363 */         for (int k = 0; k < paramPattern.getNTests(i); k++) {
/* 364 */           Test1 localTest1 = paramPattern.getTest(i, k);
/* 365 */           Value localValue = localTest1.m_slotValue;
/*     */           
/*     */           Object localObject;
/* 368 */           if ((localValue instanceof Variable))
/*     */           {
/* 370 */             localObject = localValue.variableValue(null);
/* 371 */             if ((((String)localObject).startsWith("*")) && (!((String)localObject).endsWith("*"))) {}
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 377 */             localObject = eval(paramHashtable2, localValue);
/*     */             
/* 379 */             if ((localValue.type() != 64) || (!checkForMultiPattern((Value)localObject, paramPattern)))
/*     */             {
/* 381 */               localNode = addSimpleTest(localNode, paramNodeSink, j, localTest1, (Value)localObject); }
/*     */           }
/*     */         } } }
/* 384 */     return localNode;
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
/*     */   private final Node secondPass(NodeSink paramNodeSink, Pattern paramPattern, Node paramNode)
/*     */     throws JessException
/*     */   {
/* 402 */     if (paramPattern.getName().equals("test")) {
/* 403 */       return paramNode;
/*     */     }
/*     */     
/* 406 */     this.m_doneVars.clear();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */     for (int i = 0; i < paramPattern.getNSlots(); i++)
/*     */     {
/* 428 */       if (paramPattern.getNTests(i) != 0)
/*     */       {
/*     */ 
/* 431 */         for (int j = 0; j < paramPattern.getNTests(i); j++) {
/* 432 */           Test1 localTest11 = paramPattern.getTest(i, j);
/* 433 */           if ((localTest11.m_slotValue instanceof Variable))
/*     */           {
/*     */ 
/*     */ 
/* 437 */             String str = localTest11.m_slotValue.variableValue(null);
/* 438 */             if (this.m_doneVars.get(str) == null)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */               for (int k = i; k < paramPattern.getNSlots(); k++) {
/* 445 */                 if (paramPattern.getNTests(k) != 0)
/*     */                 {
/* 447 */                   for (int m = 0; m < paramPattern.getNTests(k); m++) {
/* 448 */                     Test1 localTest12 = paramPattern.getTest(k, m);
/*     */                     
/*     */ 
/*     */ 
/* 452 */                     if (localTest12 != localTest11)
/*     */                     {
/* 454 */                       if (((localTest12.m_slotValue instanceof Variable)) && (localTest12.m_slotValue.equals(localTest11.m_slotValue)))
/*     */                       {
/*     */ 
/*     */ 
/* 458 */                         paramNode = addMultipleReferenceTest(paramNode, i, localTest11, k, localTest12, paramNodeSink);
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/* 465 */               this.m_doneVars.put(str, str);
/*     */             }
/*     */           }
/*     */         } } }
/* 469 */     return paramNode;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final Node thirdPass(HasLHS paramHasLHS, Pattern paramPattern, Node paramNode1, Node paramNode2, Hashtable paramHashtable, boolean paramBoolean)
/*     */     throws JessException
/*     */   {
/* 554 */     int i = paramHasLHS.getNodeIndexHash();
/* 555 */     if (i == 0) {
/* 556 */       i = this.m_hashkey;
/*     */     }
/*     */     
/*     */ 
/* 560 */     this.m_doneVars.clear();
/*     */     
/*     */ 
/* 563 */     boolean bool = paramPattern.getName().equals("test");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 568 */     if (bool) {
/* 569 */       localObject1 = new NodeJoin();
/* 570 */     } else if (paramBoolean) {
/* 571 */       localObject1 = new NodeNot2Single(i);
/*     */     } else {
/* 573 */       localObject1 = new Node2(i);
/*     */     }
/*     */     
/* 576 */     if (paramPattern.getBoundName() != null) {
/* 577 */       String str = paramPattern.getBoundName();
/* 578 */       BindingValue localBindingValue1 = (BindingValue)paramHashtable.get(str);
/* 579 */       if (localBindingValue1.getCE() != paramPattern)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 584 */         ((NodeJoin)localObject1).addTest(0, localBindingValue1.getFactNumber(), localBindingValue1.getSlotIndex(), localBindingValue1.getSubIndex(), -1, -1);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 596 */     for (int j = 0; j < paramPattern.getNSlots(); j++)
/*     */     {
/*     */ 
/* 599 */       if (paramPattern.getNTests(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 603 */         for (int k = 0; k < paramPattern.getNTests(j); k++) {
/* 604 */           Test1 localTest1 = paramPattern.getTest(j, k);
/*     */           Object localObject2;
/* 606 */           if ((localTest1.m_slotValue instanceof Variable))
/*     */           {
/* 608 */             localObject2 = paramPattern.getTest(j, k).m_slotValue.variableValue(null);
/*     */             
/*     */ 
/*     */ 
/* 612 */             if (this.m_doneVars.get(localObject2) == null)
/*     */             {
/*     */ 
/*     */ 
/* 616 */               if (!((String)localObject2).startsWith("*"))
/*     */               {
/*     */ 
/*     */ 
/* 620 */                 BindingValue localBindingValue2 = (BindingValue)paramHashtable.get(localObject2);
/* 621 */                 if (localBindingValue2 == null) {
/* 622 */                   compilerError("addRule", "Corrupted VarTable: var " + (String)localObject2 + " not in table");
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/* 627 */                   if (localBindingValue2.getCE() == paramPattern) {
/*     */                     continue;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/* 633 */                 ((NodeJoin)localObject1).addTest(localTest1.m_test, localBindingValue2.getFactNumber(), localBindingValue2.getSlotIndex(), localBindingValue2.getSubIndex(), j, localTest1.m_subIdx);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 640 */                 this.m_doneVars.put(localObject2, localObject2);
/*     */               } }
/* 642 */           } else if (localTest1.m_slotValue.type() == 64)
/*     */           {
/* 644 */             if (paramPattern.getDeftemplate().getBackwardChaining()) {
/* 645 */               throw new JessException("ReteCompiler.addRule", "Can't use funcalls in backchained patterns", paramPattern.getName());
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 654 */             localObject2 = eval(paramHashtable, localTest1.m_slotValue);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 659 */             if ((bool) || (checkForMultiPattern((Value)localObject2, paramPattern)))
/*     */             {
/* 661 */               if (localTest1.m_test == 0) {
/* 662 */                 ((NodeJoin)localObject1).addTest(0, localTest1.m_subIdx, (Value)localObject2);
/*     */               }
/*     */               else {
/* 665 */                 ((NodeJoin)localObject1).addTest(1, localTest1.m_subIdx, (Value)localObject2);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 677 */     Object localObject1 = addJoinNode((NodeJoin)localObject1, paramNode1, paramNode2, paramHasLHS);
/* 678 */     ((NodeJoin)localObject1).complete();
/*     */     
/* 680 */     if ((paramPattern.getDeftemplate().getBackwardChaining()) && (!paramPattern.getExplicit()) && (!paramPattern.getNegated()))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */       ((Node2)localObject1).setBackchainInfo(paramPattern, paramHasLHS);
/*     */     }
/*     */     
/* 691 */     return (Node)localObject1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final NodeJoin addJoinNode(NodeJoin paramNodeJoin, Node paramNode1, Node paramNode2, NodeSink paramNodeSink)
/*     */     throws JessException
/*     */   {
/* 699 */     NodeJoin localNodeJoin1 = (NodeJoin)paramNode1.resolve(paramNodeJoin);
/*     */     
/*     */ 
/* 702 */     if (localNodeJoin1 != paramNodeJoin) {
/* 703 */       NodeJoin localNodeJoin2 = (NodeJoin)paramNode2.resolve(paramNodeJoin);
/*     */       
/*     */ 
/*     */ 
/* 707 */       if (localNodeJoin1 == localNodeJoin2) {
/* 708 */         paramNodeSink.addNode(localNodeJoin1);
/* 709 */         return localNodeJoin1;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 715 */     paramNode1.addSuccessor(paramNodeJoin, paramNodeSink);
/* 716 */     paramNode2.addSuccessor(paramNodeJoin, paramNodeSink);
/* 717 */     return paramNodeJoin;
/*     */   }
/*     */   
/*     */   private final Node addSimpleTest(Node paramNode, NodeSink paramNodeSink, int paramInt, Test1 paramTest1, Value paramValue)
/*     */     throws JessException
/*     */   {
/*     */     Object localObject;
/* 724 */     switch (paramTest1.m_test) {
/*     */     case 0: 
/* 726 */       switch (paramTest1.m_subIdx) {
/*     */       case -1: 
/* 728 */         localObject = new Node1TEQ(paramInt, paramValue);
/* 729 */         break;
/*     */       default: 
/* 731 */         localObject = new Node1MTEQ(paramInt, paramTest1.m_subIdx, paramValue);
/*     */       }
/*     */       
/* 734 */       break;
/*     */     default: 
/* 736 */       switch (paramTest1.m_subIdx) {
/*     */       case -1: 
/* 738 */         localObject = new Node1TNEQ(paramInt, paramValue);
/* 739 */         break;
/*     */       default: 
/* 741 */         localObject = new Node1MTNEQ(paramInt, paramTest1.m_subIdx, paramValue);
/*     */       }
/*     */       
/*     */       break;
/*     */     }
/*     */     
/* 747 */     return paramNode.mergeSuccessor((Node)localObject, paramNodeSink);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final Node addMultipleReferenceTest(Node paramNode, int paramInt1, Test1 paramTest11, int paramInt2, Test1 paramTest12, NodeSink paramNodeSink)
/*     */     throws JessException
/*     */   {
/* 760 */     if (paramTest11.m_test == 0) {
/* 761 */       if (paramTest12.m_test == 0) {
/* 762 */         return paramNode.mergeSuccessor(new Node1TEV1(paramInt1, paramTest11.m_subIdx, paramInt2, paramTest12.m_subIdx), paramNodeSink);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 769 */       return paramNode.mergeSuccessor(new Node1TNEV1(paramInt1, paramTest11.m_subIdx, paramInt2, paramTest12.m_subIdx), paramNodeSink);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 777 */     if (paramTest12.m_test == 0) {
/* 778 */       return paramNode.mergeSuccessor(new Node1TNEV1(paramInt1, paramTest11.m_subIdx, paramInt2, paramTest12.m_subIdx), paramNodeSink);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 785 */     return paramNode;
/*     */   }
/*     */   
/*     */ 
/*     */   private final void compilerError(String paramString1, String paramString2)
/*     */     throws RuleCompilerException
/*     */   {
/* 792 */     throw new RuleCompilerException("ReteCompiler." + paramString1, paramString2);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ReteCompiler.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */