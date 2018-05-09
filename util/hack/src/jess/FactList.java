/*     */ package jess;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ class FactList implements java.io.Serializable
/*     */ {
/*     */   private java.util.Map m_table;
/*     */   private ArrayList m_factsToAssert;
/*     */   private ArrayList m_factsToRetract;
/*     */   private java.util.Map m_logicalSupport;
/*     */   private int m_time;
/*     */   private Object m_idLock;
/*     */   private int m_nextFactId;
/*     */   
/*     */   FactList() {
/*  16 */     jdMethod_this();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void clear()
/*     */   {
/*  26 */     this.m_table.clear();
/*  27 */     this.m_time = 0;
/*  28 */     this.m_factsToAssert.clear();
/*  29 */     this.m_factsToRetract.clear();
/*  30 */     if (this.m_logicalSupport != null)
/*  31 */       this.m_logicalSupport.clear();
/*  32 */     this.m_nextFactId = 0;
/*     */   }
/*     */   
/*     */   int getTime() {
/*  36 */     return this.m_time;
/*     */   }
/*     */   
/*     */   void assignTime(Fact paramFact) {
/*  40 */     paramFact.updateTime(++this.m_time);
/*     */   }
/*     */   
/*     */   int doPreAssertionProcessing(Fact paramFact) {
/*  44 */     return false - this.m_table.containsKey(paramFact);
/*     */   }
/*     */   
/*     */   Fact findFactByFact(Fact paramFact) {
/*  48 */     return (Fact)this.m_table.get(paramFact);
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
/*     */   void ppFacts(String paramString, java.io.Writer paramWriter)
/*     */     throws java.io.IOException
/*     */   {
/*  63 */     for (java.util.Iterator localIterator = listFacts(); localIterator.hasNext();) {
/*  64 */       Fact localFact = (Fact)localIterator.next();
/*  65 */       if ((paramString == null) || (localFact.getName().equals(paramString))) {
/*  66 */         paramWriter.write(localFact.toString());
/*  67 */         paramWriter.write("\n");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void ppFacts(java.io.Writer paramWriter) throws java.io.IOException {
/*  73 */     ppFacts(null, paramWriter);
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  18 */     this.m_table = java.util.Collections.synchronizedMap(new java.util.HashMap());
/*  19 */     this.m_factsToAssert = new ArrayList();
/*  20 */     this.m_factsToRetract = new ArrayList();
/*     */     
/*     */ 
/*  23 */     this.m_time = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */     this.m_idLock = new String("LOCK");
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
/*     */   void setPendingFact(Fact paramFact, boolean paramBoolean)
/*     */   {
/* 100 */     if (paramBoolean) {
/* 101 */       this.m_factsToAssert.add(paramFact);
/*     */     }
/*     */     else {
/* 104 */       paramFact = (Fact)this.m_table.get(paramFact);
/* 105 */       if (paramFact != null) {
/* 106 */         this.m_factsToRetract.add(paramFact);
/*     */       }
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
/*     */   Fact assertFact(Fact paramFact, Rete paramRete, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 133 */     Fact localFact = _assert(paramFact, true, paramRete, paramContext);
/* 134 */     if (localFact != null)
/* 135 */       processPendingFacts(paramRete);
/* 136 */     return localFact;
/*     */   }
/*     */   
/*     */   Fact assertKeepID(Fact paramFact, Rete paramRete, Context paramContext) throws JessException {
/* 140 */     Fact localFact = _assert(paramFact, false, paramRete, paramContext);
/* 141 */     if (localFact != null)
/* 142 */       processPendingFacts(paramRete);
/* 143 */     return localFact;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   Fact _modify(ValueVector paramValueVector, Context paramContext, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 279 */     Value localValue = paramValueVector.get(1).resolveValue(paramContext);
/*     */     int i;
/*     */     Fact localFact;
/* 282 */     if (localValue.type() == 4) {
/* 283 */       i = localValue.intValue(paramContext);
/* 284 */       localFact = paramRete.findFactByID(i);
/*     */     } else {
/* 286 */       localFact = (Fact)localValue.externalAddressValue(paramContext);
/* 287 */       i = localFact.getFactId();
/*     */     }
/* 289 */     if ((localFact == null) || (localFact.getFactId() == -1)) {
/* 290 */       throw new JessException("modify", "no such fact", i);
/*     */     }
/* 292 */     Deftemplate localDeftemplate = localFact.getDeftemplate();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */     switch (localFact.getShadowMode())
/*     */     {
/*     */     case 0: 
/* 303 */       localFact = modifyRegularFact(paramRete, localFact, paramValueVector, paramContext, localDeftemplate);
/* 304 */       break;
/*     */     case 1: 
/* 306 */       localFact = modifyShadowFact(paramRete, localFact, paramValueVector, paramContext, localDeftemplate);
/* 307 */       break;
/*     */     case 2: 
/* 309 */       modifyShadowFact(paramRete, localFact, paramValueVector, paramContext, localDeftemplate);
/* 310 */       localFact = modifyRegularFact(paramRete, localFact, paramValueVector, paramContext, localDeftemplate);
/* 311 */       break;
/*     */     default: 
/* 313 */       throw new JessException("modify", "Impossible shadow mode", localFact.getShadowMode());
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 318 */     return localFact;
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
/*     */   private final Fact modifyShadowFact(Rete paramRete, Fact paramFact, ValueVector paramValueVector, Context paramContext, Deftemplate paramDeftemplate)
/*     */     throws JessException
/*     */   {
/* 392 */     Value localValue = paramFact.getSlotValue("OBJECT");
/* 393 */     Funcall localFuncall = new Funcall("set", paramRete).arg(localValue);
/* 394 */     localFuncall.setLength(4);
/*     */     
/* 396 */     for (int i = 2; i < paramValueVector.size(); i++)
/*     */     {
/*     */ 
/* 399 */       ValueVector localValueVector = paramValueVector.get(i).listValue(paramContext);
/* 400 */       String str = getSlotName(localValueVector, paramContext);
/*     */       
/* 402 */       localFuncall.set(new Value(str, 1), 2);
/* 403 */       int j = paramDeftemplate.getSlotIndex(str);
/* 404 */       if (j == -1) {
/* 405 */         throw new JessException("modify", "No such slot " + str + " in template", paramDeftemplate.getName());
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 410 */       int k = paramDeftemplate.getSlotType(j);
/* 411 */       localFuncall.set(getSlotValue(localValueVector, paramContext, k), 3);
/*     */       
/* 413 */       localFuncall.execute(paramRete.getGlobalContext());
/*     */     }
/*     */     
/*     */ 
/* 417 */     return paramFact;
/*     */   }
/*     */   
/*     */ 
/*     */   private final String getSlotName(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 424 */     return paramValueVector.get(0).stringValue(paramContext);
/*     */   }
/*     */   
/*     */   private final Value getSlotValue(ValueVector paramValueVector, Context paramContext, int paramInt)
/*     */     throws JessException
/*     */   {
/* 430 */     if (paramInt == 16384) {
/* 431 */       localObject = paramValueVector.get(1).resolveValue(paramContext);
/* 432 */       while (((Value)localObject).type() == 512) {
/* 433 */         localObject = ((Value)localObject).listValue(paramContext).get(0).resolveValue(paramContext);
/*     */       }
/* 435 */       return (Value)localObject;
/*     */     }
/*     */     
/* 438 */     Object localObject = new ValueVector();
/* 439 */     for (int i = 1; i < paramValueVector.size(); i++) {
/* 440 */       Value localValue = paramValueVector.get(i).resolveValue(paramContext);
/* 441 */       if (localValue.type() == 512) {
/* 442 */         ValueVector localValueVector = localValue.listValue(paramContext);
/* 443 */         for (int j = 0; j < localValueVector.size(); j++)
/* 444 */           ((ValueVector)localObject).add(localValueVector.get(j).resolveValue(paramContext));
/*     */       } else {
/* 446 */         ((ValueVector)localObject).add(localValue);
/*     */       } }
/* 448 */     return new Value((ValueVector)localObject, 512);
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
/*     */   ArrayList getSupportingTokens(Fact paramFact)
/*     */   {
/* 504 */     return (ArrayList)this.m_logicalSupport.get(paramFact);
/*     */   }
/*     */   
/*     */   void removeAllLogicalSupportFor(Fact paramFact) {
/* 508 */     if (this.m_logicalSupport != null) {
/* 509 */       this.m_logicalSupport.remove(paramFact);
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact findFactByID(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_2
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   17: invokeinterface 68 1 0
/*     */     //   22: invokeinterface 72 1 0
/*     */     //   27: astore 5
/*     */     //   29: goto +29 -> 58
/*     */     //   32: aload 5
/*     */     //   34: invokeinterface 78 1 0
/*     */     //   39: checkcast 49	jess/Fact
/*     */     //   42: astore 6
/*     */     //   44: aload 6
/*     */     //   46: invokevirtual 83	jess/Fact:getFactId	()I
/*     */     //   49: iload_1
/*     */     //   50: if_icmpne +8 -> 58
/*     */     //   53: aload 6
/*     */     //   55: aload_2
/*     */     //   56: monitorexit
/*     */     //   57: areturn
/*     */     //   58: aload 5
/*     */     //   60: invokeinterface 87 1 0
/*     */     //   65: ifne -33 -> 32
/*     */     //   68: aconst_null
/*     */     //   69: aload_2
/*     */     //   70: monitorexit
/*     */     //   71: areturn
/*     */     // Line number table:
/*     */     //   Java source line #52	-> byte code offset #0
/*     */     //   Java source line #53	-> byte code offset #13
/*     */     //   Java source line #53	-> byte code offset #13
/*     */     //   Java source line #54	-> byte code offset #32
/*     */     //   Java source line #55	-> byte code offset #44
/*     */     //   Java source line #56	-> byte code offset #53
/*     */     //   Java source line #53	-> byte code offset #58
/*     */     //   Java source line #58	-> byte code offset #68
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	72	0	this	FactList
/*     */     //   0	72	1	paramInt	int
/*     */     //   3	1	2	localObject1	Object
/*     */     //   11	59	2	Ljava/lang/Object;	Object
/*     */     //   27	32	5	localIterator	java.util.Iterator
/*     */     //   42	12	6	localFact	Fact
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	57	3	finally
/*     */     //   58	71	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   java.util.Iterator listFacts()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_1
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   10: dup
/*     */     //   11: astore_1
/*     */     //   12: monitorenter
/*     */     //   13: new 119	jess/SortedIterator
/*     */     //   16: dup
/*     */     //   17: aload_0
/*     */     //   18: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   21: invokespecial 124	jess/SortedIterator:<init>	(Ljava/util/Map;)V
/*     */     //   24: aload_1
/*     */     //   25: monitorexit
/*     */     //   26: areturn
/*     */     // Line number table:
/*     */     //   Java source line #77	-> byte code offset #0
/*     */     //   Java source line #78	-> byte code offset #13
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	27	0	this	FactList
/*     */     //   3	22	1	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	26	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final int nextFactId()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_1
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 127	jess/FactList:m_idLock	Ljava/lang/Object;
/*     */     //   10: dup
/*     */     //   11: astore_1
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: dup
/*     */     //   15: getfield 40	jess/FactList:m_nextFactId	I
/*     */     //   18: dup_x1
/*     */     //   19: iconst_1
/*     */     //   20: iadd
/*     */     //   21: putfield 40	jess/FactList:m_nextFactId	I
/*     */     //   24: aload_1
/*     */     //   25: monitorexit
/*     */     //   26: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #89	-> byte code offset #0
/*     */     //   Java source line #90	-> byte code offset #13
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	27	0	this	FactList
/*     */     //   3	22	1	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	26	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void processPendingFacts(Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_2
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 31	jess/FactList:m_factsToAssert	Ljava/util/ArrayList;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: goto +38 -> 51
/*     */     //   16: aload_0
/*     */     //   17: getfield 31	jess/FactList:m_factsToAssert	Ljava/util/ArrayList;
/*     */     //   20: iconst_0
/*     */     //   21: invokevirtual 139	java/util/ArrayList:get	(I)Ljava/lang/Object;
/*     */     //   24: checkcast 49	jess/Fact
/*     */     //   27: astore 4
/*     */     //   29: aload_0
/*     */     //   30: getfield 31	jess/FactList:m_factsToAssert	Ljava/util/ArrayList;
/*     */     //   33: iconst_0
/*     */     //   34: invokevirtual 142	java/util/ArrayList:remove	(I)Ljava/lang/Object;
/*     */     //   37: pop
/*     */     //   38: aload_0
/*     */     //   39: aload 4
/*     */     //   41: iconst_1
/*     */     //   42: aload_1
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual 146	jess/Rete:getGlobalContext	()Ljess/Context;
/*     */     //   47: invokespecial 152	jess/FactList:_assert	(Ljess/Fact;ZLjess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   50: pop
/*     */     //   51: aload_0
/*     */     //   52: getfield 31	jess/FactList:m_factsToAssert	Ljava/util/ArrayList;
/*     */     //   55: invokevirtual 155	java/util/ArrayList:size	()I
/*     */     //   58: ifgt -42 -> 16
/*     */     //   61: aload_2
/*     */     //   62: monitorexit
/*     */     //   63: goto +6 -> 69
/*     */     //   66: aload_2
/*     */     //   67: monitorexit
/*     */     //   68: athrow
/*     */     //   69: aload_0
/*     */     //   70: getfield 36	jess/FactList:m_factsToRetract	Ljava/util/ArrayList;
/*     */     //   73: dup
/*     */     //   74: astore_2
/*     */     //   75: monitorenter
/*     */     //   76: goto +32 -> 108
/*     */     //   79: aload_0
/*     */     //   80: getfield 36	jess/FactList:m_factsToRetract	Ljava/util/ArrayList;
/*     */     //   83: iconst_0
/*     */     //   84: invokevirtual 139	java/util/ArrayList:get	(I)Ljava/lang/Object;
/*     */     //   87: checkcast 49	jess/Fact
/*     */     //   90: astore 4
/*     */     //   92: aload_0
/*     */     //   93: getfield 36	jess/FactList:m_factsToRetract	Ljava/util/ArrayList;
/*     */     //   96: iconst_0
/*     */     //   97: invokevirtual 142	java/util/ArrayList:remove	(I)Ljava/lang/Object;
/*     */     //   100: pop
/*     */     //   101: aload_1
/*     */     //   102: aload 4
/*     */     //   104: invokevirtual 158	jess/Rete:retract	(Ljess/Fact;)Ljess/Fact;
/*     */     //   107: pop
/*     */     //   108: aload_0
/*     */     //   109: getfield 36	jess/FactList:m_factsToRetract	Ljava/util/ArrayList;
/*     */     //   112: invokevirtual 155	java/util/ArrayList:size	()I
/*     */     //   115: ifgt -36 -> 79
/*     */     //   118: aload_2
/*     */     //   119: monitorexit
/*     */     //   120: return
/*     */     // Line number table:
/*     */     //   Java source line #114	-> byte code offset #0
/*     */     //   Java source line #115	-> byte code offset #13
/*     */     //   Java source line #116	-> byte code offset #16
/*     */     //   Java source line #117	-> byte code offset #29
/*     */     //   Java source line #118	-> byte code offset #38
/*     */     //   Java source line #115	-> byte code offset #51
/*     */     //   Java source line #122	-> byte code offset #63
/*     */     //   Java source line #123	-> byte code offset #76
/*     */     //   Java source line #124	-> byte code offset #79
/*     */     //   Java source line #125	-> byte code offset #92
/*     */     //   Java source line #126	-> byte code offset #101
/*     */     //   Java source line #123	-> byte code offset #108
/*     */     //   Java source line #129	-> byte code offset #120
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	121	0	this	FactList
/*     */     //   0	121	1	paramRete	Rete
/*     */     //   3	1	2	localObject1	Object
/*     */     //   11	108	2	Ljava/lang/Object;	Object
/*     */     //   27	76	4	localFact	Fact
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	63	3	finally
/*     */     //   66	68	66	finally
/*     */     //   76	120	66	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final Fact _assert(Fact paramFact, boolean paramBoolean, Rete paramRete, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +7 -> 7
/*     */     //   3: aload 5
/*     */     //   5: monitorexit
/*     */     //   6: athrow
/*     */     //   7: aload_0
/*     */     //   8: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   11: dup
/*     */     //   12: astore 5
/*     */     //   14: monitorenter
/*     */     //   15: iconst_0
/*     */     //   16: aload_3
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual 165	jess/Rete:doPreAssertionProcessing	(Ljess/Fact;)I
/*     */     //   21: ifeq +5 -> 26
/*     */     //   24: pop
/*     */     //   25: iconst_1
/*     */     //   26: istore 8
/*     */     //   28: aload 4
/*     */     //   30: invokevirtual 169	jess/Context:getLogicalSupportNode	()Ljess/LogicalNode;
/*     */     //   33: ifnull +38 -> 71
/*     */     //   36: aload 4
/*     */     //   38: invokevirtual 175	jess/Context:getToken	()Ljess/Token;
/*     */     //   41: astore 9
/*     */     //   43: aload 4
/*     */     //   45: invokevirtual 169	jess/Context:getLogicalSupportNode	()Ljess/LogicalNode;
/*     */     //   48: aload_1
/*     */     //   49: aload 4
/*     */     //   51: invokevirtual 175	jess/Context:getToken	()Ljess/Token;
/*     */     //   54: invokeinterface 179 3 0
/*     */     //   59: aload_0
/*     */     //   60: aload 9
/*     */     //   62: aload_1
/*     */     //   63: iload 8
/*     */     //   65: invokevirtual 185	jess/FactList:addLogicalSupportFor	(Ljess/Token;Ljess/Fact;Z)V
/*     */     //   68: goto +15 -> 83
/*     */     //   71: aload_0
/*     */     //   72: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   75: ifnull +8 -> 83
/*     */     //   78: aload_0
/*     */     //   79: aload_1
/*     */     //   80: invokespecial 188	jess/FactList:addUnconditionalSupportFor	(Ljess/Fact;)V
/*     */     //   83: iload 8
/*     */     //   85: ifeq +8 -> 93
/*     */     //   88: aconst_null
/*     */     //   89: aload 5
/*     */     //   91: monitorexit
/*     */     //   92: areturn
/*     */     //   93: iload_2
/*     */     //   94: ifeq +11 -> 105
/*     */     //   97: aload_1
/*     */     //   98: aload_0
/*     */     //   99: invokespecial 190	jess/FactList:nextFactId	()I
/*     */     //   102: invokevirtual 193	jess/Fact:setFactId	(I)V
/*     */     //   105: aload_3
/*     */     //   106: bipush 16
/*     */     //   108: aload_1
/*     */     //   109: invokevirtual 197	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*     */     //   112: aload_0
/*     */     //   113: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   116: aload_1
/*     */     //   117: aload_1
/*     */     //   118: invokeinterface 201 3 0
/*     */     //   123: pop
/*     */     //   124: aload_3
/*     */     //   125: iconst_0
/*     */     //   126: aload_1
/*     */     //   127: invokevirtual 205	jess/Rete:processToken	(ILjess/Fact;)Ljess/Token;
/*     */     //   130: pop
/*     */     //   131: aload_1
/*     */     //   132: aload 5
/*     */     //   134: monitorexit
/*     */     //   135: areturn
/*     */     // Line number table:
/*     */     //   Java source line #148	-> byte code offset #0
/*     */     //   Java source line #151	-> byte code offset #15
/*     */     //   Java source line #153	-> byte code offset #28
/*     */     //   Java source line #154	-> byte code offset #36
/*     */     //   Java source line #155	-> byte code offset #43
/*     */     //   Java source line #156	-> byte code offset #59
/*     */     //   Java source line #157	-> byte code offset #71
/*     */     //   Java source line #158	-> byte code offset #78
/*     */     //   Java source line #161	-> byte code offset #83
/*     */     //   Java source line #162	-> byte code offset #88
/*     */     //   Java source line #164	-> byte code offset #93
/*     */     //   Java source line #165	-> byte code offset #97
/*     */     //   Java source line #167	-> byte code offset #105
/*     */     //   Java source line #169	-> byte code offset #112
/*     */     //   Java source line #172	-> byte code offset #124
/*     */     //   Java source line #174	-> byte code offset #131
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	136	0	this	FactList
/*     */     //   0	136	1	paramFact	Fact
/*     */     //   0	136	2	paramBoolean	boolean
/*     */     //   0	136	3	paramRete	Rete
/*     */     //   0	136	4	paramContext	Context
/*     */     //   3	1	5	localObject1	Object
/*     */     //   12	121	5	Ljava/lang/Object;	Object
/*     */     //   26	58	8	bool	boolean
/*     */     //   41	20	9	localToken	Token
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	6	3	finally
/*     */     //   15	92	3	finally
/*     */     //   93	135	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact retract(Fact paramFact, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   17: aload_1
/*     */     //   18: invokeinterface 62 2 0
/*     */     //   23: checkcast 49	jess/Fact
/*     */     //   26: dup
/*     */     //   27: astore 6
/*     */     //   29: ifnull +16 -> 45
/*     */     //   32: aload_0
/*     */     //   33: aload 6
/*     */     //   35: aload_2
/*     */     //   36: invokespecial 209	jess/FactList:_retract	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*     */     //   39: pop
/*     */     //   40: aload_0
/*     */     //   41: aload_2
/*     */     //   42: invokevirtual 162	jess/FactList:processPendingFacts	(Ljess/Rete;)V
/*     */     //   45: aload 6
/*     */     //   47: aload_3
/*     */     //   48: monitorexit
/*     */     //   49: areturn
/*     */     // Line number table:
/*     */     //   Java source line #187	-> byte code offset #0
/*     */     //   Java source line #188	-> byte code offset #13
/*     */     //   Java source line #189	-> byte code offset #13
/*     */     //   Java source line #190	-> byte code offset #32
/*     */     //   Java source line #191	-> byte code offset #40
/*     */     //   Java source line #193	-> byte code offset #45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	50	0	this	FactList
/*     */     //   0	50	1	paramFact	Fact
/*     */     //   0	50	2	paramRete	Rete
/*     */     //   3	45	3	Ljava/lang/Object;	Object
/*     */     //   27	19	6	localFact	Fact
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	49	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final Fact _retract(Fact paramFact, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_2
/*     */     //   14: ldc -46
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual 197	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*     */     //   20: aload_0
/*     */     //   21: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface 212 2 0
/*     */     //   30: pop
/*     */     //   31: aload_0
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual 215	jess/FactList:removeAllLogicalSupportFor	(Ljess/Fact;)V
/*     */     //   36: aload_2
/*     */     //   37: iconst_1
/*     */     //   38: aload_1
/*     */     //   39: invokevirtual 205	jess/Rete:processToken	(ILjess/Fact;)Ljess/Token;
/*     */     //   42: pop
/*     */     //   43: aload_1
/*     */     //   44: aload_3
/*     */     //   45: monitorexit
/*     */     //   46: areturn
/*     */     // Line number table:
/*     */     //   Java source line #199	-> byte code offset #0
/*     */     //   Java source line #200	-> byte code offset #13
/*     */     //   Java source line #201	-> byte code offset #20
/*     */     //   Java source line #202	-> byte code offset #31
/*     */     //   Java source line #203	-> byte code offset #36
/*     */     //   Java source line #204	-> byte code offset #43
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	47	0	this	FactList
/*     */     //   0	47	1	paramFact	Fact
/*     */     //   0	47	2	paramRete	Rete
/*     */     //   3	42	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	46	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact _duplicate(ValueVector paramValueVector, Context paramContext, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iconst_1
/*     */     //   2: invokevirtual 220	jess/ValueVector:get	(I)Ljess/Value;
/*     */     //   5: aload_2
/*     */     //   6: invokevirtual 226	jess/Value:resolveValue	(Ljess/Context;)Ljess/Value;
/*     */     //   9: astore 4
/*     */     //   11: aload 4
/*     */     //   13: invokevirtual 231	jess/Value:type	()I
/*     */     //   16: iconst_4
/*     */     //   17: if_icmpne +22 -> 39
/*     */     //   20: aload 4
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual 235	jess/Value:intValue	(Ljess/Context;)I
/*     */     //   26: istore 6
/*     */     //   28: aload_3
/*     */     //   29: iload 6
/*     */     //   31: invokevirtual 237	jess/Rete:findFactByID	(I)Ljess/Fact;
/*     */     //   34: astore 5
/*     */     //   36: goto +21 -> 57
/*     */     //   39: aload 4
/*     */     //   41: aload_2
/*     */     //   42: invokevirtual 241	jess/Value:externalAddressValue	(Ljess/Context;)Ljava/lang/Object;
/*     */     //   45: checkcast 49	jess/Fact
/*     */     //   48: astore 5
/*     */     //   50: aload 5
/*     */     //   52: invokevirtual 83	jess/Fact:getFactId	()I
/*     */     //   55: istore 6
/*     */     //   57: aload 5
/*     */     //   59: ifnull +12 -> 71
/*     */     //   62: aload 5
/*     */     //   64: invokevirtual 83	jess/Fact:getFactId	()I
/*     */     //   67: iconst_m1
/*     */     //   68: if_icmpne +17 -> 85
/*     */     //   71: new 135	jess/JessException
/*     */     //   74: dup
/*     */     //   75: ldc -14
/*     */     //   77: ldc -12
/*     */     //   79: iload 6
/*     */     //   81: invokespecial 248	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;I)V
/*     */     //   84: athrow
/*     */     //   85: aload 5
/*     */     //   87: invokevirtual 251	jess/Fact:isShadow	()Z
/*     */     //   90: ifeq +20 -> 110
/*     */     //   93: new 135	jess/JessException
/*     */     //   96: dup
/*     */     //   97: ldc -14
/*     */     //   99: ldc -4
/*     */     //   101: aload 5
/*     */     //   103: invokevirtual 107	jess/Fact:toString	()Ljava/lang/String;
/*     */     //   106: invokespecial 256	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   109: athrow
/*     */     //   110: aload 5
/*     */     //   112: invokevirtual 260	jess/Fact:getDeftemplate	()Ljess/Deftemplate;
/*     */     //   115: astore 7
/*     */     //   117: goto +7 -> 124
/*     */     //   120: aload 8
/*     */     //   122: monitorexit
/*     */     //   123: athrow
/*     */     //   124: aload_3
/*     */     //   125: invokevirtual 264	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   128: dup
/*     */     //   129: astore 8
/*     */     //   131: monitorenter
/*     */     //   132: aload 5
/*     */     //   134: invokevirtual 267	jess/Fact:clone	()Ljava/lang/Object;
/*     */     //   137: checkcast 49	jess/Fact
/*     */     //   140: astore 5
/*     */     //   142: iconst_2
/*     */     //   143: istore 11
/*     */     //   145: goto +106 -> 251
/*     */     //   148: aload_1
/*     */     //   149: iload 11
/*     */     //   151: invokevirtual 220	jess/ValueVector:get	(I)Ljess/Value;
/*     */     //   154: aload_2
/*     */     //   155: invokevirtual 271	jess/Value:listValue	(Ljess/Context;)Ljess/ValueVector;
/*     */     //   158: astore 12
/*     */     //   160: aload_0
/*     */     //   161: aload 12
/*     */     //   163: aload_2
/*     */     //   164: invokespecial 275	jess/FactList:getSlotName	(Ljess/ValueVector;Ljess/Context;)Ljava/lang/String;
/*     */     //   167: astore 13
/*     */     //   169: aload 7
/*     */     //   171: aload 13
/*     */     //   173: invokevirtual 279	jess/Deftemplate:getSlotIndex	(Ljava/lang/String;)I
/*     */     //   176: istore 14
/*     */     //   178: iload 14
/*     */     //   180: iconst_m1
/*     */     //   181: if_icmpne +42 -> 223
/*     */     //   184: new 135	jess/JessException
/*     */     //   187: dup
/*     */     //   188: ldc -14
/*     */     //   190: new 282	java/lang/StringBuffer
/*     */     //   193: dup
/*     */     //   194: ldc_w 284
/*     */     //   197: invokespecial 287	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*     */     //   200: aload 13
/*     */     //   202: invokevirtual 291	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   205: ldc_w 292
/*     */     //   208: invokevirtual 291	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   211: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*     */     //   214: aload 7
/*     */     //   216: invokevirtual 295	jess/Deftemplate:getName	()Ljava/lang/String;
/*     */     //   219: invokespecial 256	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   222: athrow
/*     */     //   223: aload 7
/*     */     //   225: iload 14
/*     */     //   227: invokevirtual 299	jess/Deftemplate:getSlotType	(I)I
/*     */     //   230: istore 15
/*     */     //   232: aload 5
/*     */     //   234: aload 13
/*     */     //   236: aload_0
/*     */     //   237: aload 12
/*     */     //   239: aload_2
/*     */     //   240: iload 15
/*     */     //   242: invokespecial 303	jess/FactList:getSlotValue	(Ljess/ValueVector;Ljess/Context;I)Ljess/Value;
/*     */     //   245: invokevirtual 307	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   248: iinc 11 1
/*     */     //   251: iload 11
/*     */     //   253: aload_1
/*     */     //   254: invokevirtual 308	jess/ValueVector:size	()I
/*     */     //   257: if_icmplt -109 -> 148
/*     */     //   260: aload 8
/*     */     //   262: monitorexit
/*     */     //   263: aload_0
/*     */     //   264: aload 5
/*     */     //   266: aload_3
/*     */     //   267: aload_2
/*     */     //   268: invokevirtual 310	jess/FactList:assertFact	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   271: areturn
/*     */     // Line number table:
/*     */     //   Java source line #211	-> byte code offset #0
/*     */     //   Java source line #212	-> byte code offset #11
/*     */     //   Java source line #213	-> byte code offset #11
/*     */     //   Java source line #214	-> byte code offset #11
/*     */     //   Java source line #215	-> byte code offset #20
/*     */     //   Java source line #216	-> byte code offset #28
/*     */     //   Java source line #218	-> byte code offset #39
/*     */     //   Java source line #219	-> byte code offset #50
/*     */     //   Java source line #222	-> byte code offset #57
/*     */     //   Java source line #223	-> byte code offset #71
/*     */     //   Java source line #224	-> byte code offset #85
/*     */     //   Java source line #225	-> byte code offset #93
/*     */     //   Java source line #229	-> byte code offset #110
/*     */     //   Java source line #231	-> byte code offset #117
/*     */     //   Java source line #233	-> byte code offset #132
/*     */     //   Java source line #235	-> byte code offset #142
/*     */     //   Java source line #235	-> byte code offset #142
/*     */     //   Java source line #238	-> byte code offset #148
/*     */     //   Java source line #239	-> byte code offset #160
/*     */     //   Java source line #240	-> byte code offset #169
/*     */     //   Java source line #241	-> byte code offset #178
/*     */     //   Java source line #242	-> byte code offset #184
/*     */     //   Java source line #246	-> byte code offset #223
/*     */     //   Java source line #249	-> byte code offset #232
/*     */     //   Java source line #235	-> byte code offset #248
/*     */     //   Java source line #235	-> byte code offset #251
/*     */     //   Java source line #254	-> byte code offset #263
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	272	0	this	FactList
/*     */     //   0	272	1	paramValueVector	ValueVector
/*     */     //   0	272	2	paramContext	Context
/*     */     //   0	272	3	paramRete	Rete
/*     */     //   9	31	4	localValue	Value
/*     */     //   34	231	5	localFact	Fact
/*     */     //   26	54	6	i	int
/*     */     //   115	109	7	localDeftemplate	Deftemplate
/*     */     //   120	141	8	Ljava/lang/Object;	Object
/*     */     //   143	115	11	j	int
/*     */     //   158	80	12	localValueVector	ValueVector
/*     */     //   167	68	13	str	String
/*     */     //   176	50	14	k	int
/*     */     //   230	11	15	m	int
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   120	123	120	finally
/*     */     //   132	263	120	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact modify(Fact paramFact, String paramString, Value paramValue, Rete paramRete, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 315	jess/Fact:getShadowMode	()I
/*     */     //   4: ifeq +11 -> 15
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual 315	jess/Fact:getShadowMode	()I
/*     */     //   11: iconst_2
/*     */     //   12: if_icmpne +46 -> 58
/*     */     //   15: goto +7 -> 22
/*     */     //   18: aload 6
/*     */     //   20: monitorexit
/*     */     //   21: athrow
/*     */     //   22: aload 4
/*     */     //   24: invokevirtual 318	jess/Rete:getActivationSemaphore	()Ljava/lang/Object;
/*     */     //   27: dup
/*     */     //   28: astore 6
/*     */     //   30: monitorenter
/*     */     //   31: aload_0
/*     */     //   32: aload_1
/*     */     //   33: aload 4
/*     */     //   35: invokevirtual 321	jess/FactList:prepareToModify	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*     */     //   38: pop
/*     */     //   39: aload_1
/*     */     //   40: aload_2
/*     */     //   41: aload_3
/*     */     //   42: invokevirtual 307	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   45: aload_0
/*     */     //   46: aload_1
/*     */     //   47: aload 4
/*     */     //   49: aload 5
/*     */     //   51: invokevirtual 324	jess/FactList:finishModify	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   54: pop
/*     */     //   55: aload 6
/*     */     //   57: monitorexit
/*     */     //   58: aload_1
/*     */     //   59: invokevirtual 315	jess/Fact:getShadowMode	()I
/*     */     //   62: ifeq +64 -> 126
/*     */     //   65: aload_1
/*     */     //   66: ldc_w 325
/*     */     //   69: invokevirtual 329	jess/Fact:getSlotValue	(Ljava/lang/String;)Ljess/Value;
/*     */     //   72: astore 6
/*     */     //   74: new 330	jess/Funcall
/*     */     //   77: dup
/*     */     //   78: ldc_w 332
/*     */     //   81: aload 4
/*     */     //   83: invokespecial 336	jess/Funcall:<init>	(Ljava/lang/String;Ljess/Rete;)V
/*     */     //   86: aload 6
/*     */     //   88: invokevirtual 340	jess/Funcall:arg	(Ljess/Value;)Ljess/Funcall;
/*     */     //   91: astore 7
/*     */     //   93: aload 7
/*     */     //   95: new 227	jess/Value
/*     */     //   98: dup
/*     */     //   99: aload_2
/*     */     //   100: iconst_1
/*     */     //   101: invokespecial 343	jess/Value:<init>	(Ljava/lang/String;I)V
/*     */     //   104: invokevirtual 340	jess/Funcall:arg	(Ljess/Value;)Ljess/Funcall;
/*     */     //   107: pop
/*     */     //   108: aload 7
/*     */     //   110: aload_3
/*     */     //   111: invokevirtual 340	jess/Funcall:arg	(Ljess/Value;)Ljess/Funcall;
/*     */     //   114: pop
/*     */     //   115: aload 7
/*     */     //   117: aload 4
/*     */     //   119: invokevirtual 146	jess/Rete:getGlobalContext	()Ljess/Context;
/*     */     //   122: invokevirtual 346	jess/Funcall:execute	(Ljess/Context;)Ljess/Value;
/*     */     //   125: pop
/*     */     //   126: aload_1
/*     */     //   127: areturn
/*     */     // Line number table:
/*     */     //   Java source line #258	-> byte code offset #0
/*     */     //   Java source line #259	-> byte code offset #15
/*     */     //   Java source line #260	-> byte code offset #31
/*     */     //   Java source line #261	-> byte code offset #39
/*     */     //   Java source line #262	-> byte code offset #45
/*     */     //   Java source line #266	-> byte code offset #58
/*     */     //   Java source line #267	-> byte code offset #65
/*     */     //   Java source line #268	-> byte code offset #74
/*     */     //   Java source line #269	-> byte code offset #93
/*     */     //   Java source line #270	-> byte code offset #108
/*     */     //   Java source line #271	-> byte code offset #115
/*     */     //   Java source line #273	-> byte code offset #126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	128	0	this	FactList
/*     */     //   0	128	1	paramFact	Fact
/*     */     //   0	128	2	paramString	String
/*     */     //   0	128	3	paramValue	Value
/*     */     //   0	128	4	paramRete	Rete
/*     */     //   0	128	5	paramContext	Context
/*     */     //   18	69	6	Ljava/lang/Object;	Object
/*     */     //   91	25	7	localFuncall	Funcall
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	21	18	finally
/*     */     //   31	58	18	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact prepareToModify(Fact paramFact, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_2
/*     */     //   7: invokevirtual 264	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_2
/*     */     //   14: iconst_1
/*     */     //   15: aload_1
/*     */     //   16: invokevirtual 205	jess/Rete:processToken	(ILjess/Fact;)Ljess/Token;
/*     */     //   19: pop
/*     */     //   20: aload_0
/*     */     //   21: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface 212 2 0
/*     */     //   30: checkcast 49	jess/Fact
/*     */     //   33: astore_1
/*     */     //   34: aload_0
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual 215	jess/FactList:removeAllLogicalSupportFor	(Ljess/Fact;)V
/*     */     //   39: aload_1
/*     */     //   40: aload_3
/*     */     //   41: monitorexit
/*     */     //   42: areturn
/*     */     // Line number table:
/*     */     //   Java source line #325	-> byte code offset #0
/*     */     //   Java source line #326	-> byte code offset #13
/*     */     //   Java source line #327	-> byte code offset #20
/*     */     //   Java source line #328	-> byte code offset #34
/*     */     //   Java source line #329	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	43	0	this	FactList
/*     */     //   0	43	1	paramFact	Fact
/*     */     //   0	43	2	paramRete	Rete
/*     */     //   3	38	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	42	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Fact finishModify(Fact paramFact, Rete paramRete, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +7 -> 7
/*     */     //   3: aload 4
/*     */     //   5: monitorexit
/*     */     //   6: athrow
/*     */     //   7: aload_2
/*     */     //   8: invokevirtual 264	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   11: dup
/*     */     //   12: astore 4
/*     */     //   14: monitorenter
/*     */     //   15: aload_2
/*     */     //   16: ldc_w 358
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual 197	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*     */     //   23: aload_3
/*     */     //   24: invokevirtual 169	jess/Context:getLogicalSupportNode	()Ljess/LogicalNode;
/*     */     //   27: ifnull +34 -> 61
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual 175	jess/Context:getToken	()Ljess/Token;
/*     */     //   34: astore 7
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual 169	jess/Context:getLogicalSupportNode	()Ljess/LogicalNode;
/*     */     //   40: aload_1
/*     */     //   41: aload_3
/*     */     //   42: invokevirtual 175	jess/Context:getToken	()Ljess/Token;
/*     */     //   45: invokeinterface 179 3 0
/*     */     //   50: aload_0
/*     */     //   51: aload 7
/*     */     //   53: aload_1
/*     */     //   54: iconst_0
/*     */     //   55: invokevirtual 185	jess/FactList:addLogicalSupportFor	(Ljess/Token;Ljess/Fact;Z)V
/*     */     //   58: goto +15 -> 73
/*     */     //   61: aload_0
/*     */     //   62: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   65: ifnull +8 -> 73
/*     */     //   68: aload_0
/*     */     //   69: aload_1
/*     */     //   70: invokespecial 188	jess/FactList:addUnconditionalSupportFor	(Ljess/Fact;)V
/*     */     //   73: aload_2
/*     */     //   74: aload_1
/*     */     //   75: invokevirtual 165	jess/Rete:doPreAssertionProcessing	(Ljess/Fact;)I
/*     */     //   78: ifne +32 -> 110
/*     */     //   81: aload_0
/*     */     //   82: getfield 23	jess/FactList:m_table	Ljava/util/Map;
/*     */     //   85: aload_1
/*     */     //   86: aload_1
/*     */     //   87: invokeinterface 201 3 0
/*     */     //   92: pop
/*     */     //   93: aload_2
/*     */     //   94: iconst_0
/*     */     //   95: aload_1
/*     */     //   96: invokevirtual 205	jess/Rete:processToken	(ILjess/Fact;)Ljess/Token;
/*     */     //   99: pop
/*     */     //   100: aload_0
/*     */     //   101: aload_2
/*     */     //   102: invokevirtual 162	jess/FactList:processPendingFacts	(Ljess/Rete;)V
/*     */     //   105: aload_1
/*     */     //   106: aload 4
/*     */     //   108: monitorexit
/*     */     //   109: areturn
/*     */     //   110: invokestatic 362	jess/Fact:getNullFact	()Ljess/Fact;
/*     */     //   113: aload 4
/*     */     //   115: monitorexit
/*     */     //   116: areturn
/*     */     // Line number table:
/*     */     //   Java source line #336	-> byte code offset #0
/*     */     //   Java source line #337	-> byte code offset #15
/*     */     //   Java source line #338	-> byte code offset #23
/*     */     //   Java source line #339	-> byte code offset #30
/*     */     //   Java source line #340	-> byte code offset #36
/*     */     //   Java source line #341	-> byte code offset #50
/*     */     //   Java source line #342	-> byte code offset #61
/*     */     //   Java source line #343	-> byte code offset #68
/*     */     //   Java source line #345	-> byte code offset #73
/*     */     //   Java source line #346	-> byte code offset #81
/*     */     //   Java source line #347	-> byte code offset #93
/*     */     //   Java source line #349	-> byte code offset #100
/*     */     //   Java source line #350	-> byte code offset #105
/*     */     //   Java source line #352	-> byte code offset #110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	117	0	this	FactList
/*     */     //   0	117	1	paramFact	Fact
/*     */     //   0	117	2	paramRete	Rete
/*     */     //   0	117	3	paramContext	Context
/*     */     //   3	1	4	localObject1	Object
/*     */     //   12	102	4	Ljava/lang/Object;	Object
/*     */     //   34	18	7	localToken	Token
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	6	3	finally
/*     */     //   15	109	3	finally
/*     */     //   110	116	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final Fact modifyRegularFact(Rete paramRete, Fact paramFact, ValueVector paramValueVector, Context paramContext, Deftemplate paramDeftemplate)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +7 -> 7
/*     */     //   3: aload 6
/*     */     //   5: monitorexit
/*     */     //   6: athrow
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual 318	jess/Rete:getActivationSemaphore	()Ljava/lang/Object;
/*     */     //   11: dup
/*     */     //   12: astore 6
/*     */     //   14: monitorenter
/*     */     //   15: aload_0
/*     */     //   16: aload_2
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual 321	jess/FactList:prepareToModify	(Ljess/Fact;Ljess/Rete;)Ljess/Fact;
/*     */     //   21: astore_2
/*     */     //   22: iconst_2
/*     */     //   23: istore 12
/*     */     //   25: goto +109 -> 134
/*     */     //   28: aload_3
/*     */     //   29: iload 12
/*     */     //   31: invokevirtual 220	jess/ValueVector:get	(I)Ljess/Value;
/*     */     //   34: aload 4
/*     */     //   36: invokevirtual 271	jess/Value:listValue	(Ljess/Context;)Ljess/ValueVector;
/*     */     //   39: astore 13
/*     */     //   41: aload_0
/*     */     //   42: aload 13
/*     */     //   44: aload 4
/*     */     //   46: invokespecial 275	jess/FactList:getSlotName	(Ljess/ValueVector;Ljess/Context;)Ljava/lang/String;
/*     */     //   49: astore 14
/*     */     //   51: aload 5
/*     */     //   53: aload 14
/*     */     //   55: invokevirtual 279	jess/Deftemplate:getSlotIndex	(Ljava/lang/String;)I
/*     */     //   58: istore 15
/*     */     //   60: iload 15
/*     */     //   62: iconst_m1
/*     */     //   63: if_icmpne +43 -> 106
/*     */     //   66: new 135	jess/JessException
/*     */     //   69: dup
/*     */     //   70: ldc_w 348
/*     */     //   73: new 282	java/lang/StringBuffer
/*     */     //   76: dup
/*     */     //   77: ldc_w 284
/*     */     //   80: invokespecial 287	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*     */     //   83: aload 14
/*     */     //   85: invokevirtual 291	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   88: ldc_w 292
/*     */     //   91: invokevirtual 291	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   94: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*     */     //   97: aload 5
/*     */     //   99: invokevirtual 295	jess/Deftemplate:getName	()Ljava/lang/String;
/*     */     //   102: invokespecial 256	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   105: athrow
/*     */     //   106: aload 5
/*     */     //   108: iload 15
/*     */     //   110: invokevirtual 299	jess/Deftemplate:getSlotType	(I)I
/*     */     //   113: istore 16
/*     */     //   115: aload_2
/*     */     //   116: aload 14
/*     */     //   118: aload_0
/*     */     //   119: aload 13
/*     */     //   121: aload 4
/*     */     //   123: iload 16
/*     */     //   125: invokespecial 303	jess/FactList:getSlotValue	(Ljess/ValueVector;Ljess/Context;I)Ljess/Value;
/*     */     //   128: invokevirtual 307	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   131: iinc 12 1
/*     */     //   134: iload 12
/*     */     //   136: aload_3
/*     */     //   137: invokevirtual 308	jess/ValueVector:size	()I
/*     */     //   140: if_icmplt -112 -> 28
/*     */     //   143: goto +24 -> 167
/*     */     //   146: astore 9
/*     */     //   148: jsr +6 -> 154
/*     */     //   151: aload 9
/*     */     //   153: athrow
/*     */     //   154: astore 10
/*     */     //   156: aload_0
/*     */     //   157: aload_2
/*     */     //   158: aload_1
/*     */     //   159: aload 4
/*     */     //   161: invokevirtual 324	jess/FactList:finishModify	(Ljess/Fact;Ljess/Rete;Ljess/Context;)Ljess/Fact;
/*     */     //   164: astore_2
/*     */     //   165: ret 10
/*     */     //   167: jsr -13 -> 154
/*     */     //   170: aload 6
/*     */     //   172: monitorexit
/*     */     //   173: aload_2
/*     */     //   174: areturn
/*     */     // Line number table:
/*     */     //   Java source line #360	-> byte code offset #0
/*     */     //   Java source line #361	-> byte code offset #15
/*     */     //   Java source line #363	-> byte code offset #22
/*     */     //   Java source line #364	-> byte code offset #22
/*     */     //   Java source line #364	-> byte code offset #22
/*     */     //   Java source line #367	-> byte code offset #28
/*     */     //   Java source line #368	-> byte code offset #41
/*     */     //   Java source line #369	-> byte code offset #51
/*     */     //   Java source line #370	-> byte code offset #60
/*     */     //   Java source line #371	-> byte code offset #66
/*     */     //   Java source line #375	-> byte code offset #106
/*     */     //   Java source line #378	-> byte code offset #115
/*     */     //   Java source line #364	-> byte code offset #131
/*     */     //   Java source line #364	-> byte code offset #134
/*     */     //   Java source line #382	-> byte code offset #156
/*     */     //   Java source line #385	-> byte code offset #173
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	175	0	this	FactList
/*     */     //   0	175	1	paramRete	Rete
/*     */     //   0	175	2	paramFact	Fact
/*     */     //   0	175	3	paramValueVector	ValueVector
/*     */     //   0	175	4	paramContext	Context
/*     */     //   0	175	5	paramDeftemplate	Deftemplate
/*     */     //   3	168	6	Ljava/lang/Object;	Object
/*     */     //   146	6	9	localObject1	Object
/*     */     //   154	1	10	localObject2	Object
/*     */     //   23	118	12	i	int
/*     */     //   39	81	13	localValueVector	ValueVector
/*     */     //   49	68	14	str	String
/*     */     //   58	51	15	j	int
/*     */     //   113	11	16	k	int
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	6	3	finally
/*     */     //   15	173	3	finally
/*     */     //   22	151	146	finally
/*     */     //   167	170	146	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void addLogicalSupportFor(Token paramToken, Fact paramFact, boolean paramBoolean)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   4: ifnonnull +17 -> 21
/*     */     //   7: aload_0
/*     */     //   8: new 382	java/util/HashMap
/*     */     //   11: dup
/*     */     //   12: invokespecial 384	java/util/HashMap:<init>	()V
/*     */     //   15: invokestatic 388	java/util/Collections:synchronizedMap	(Ljava/util/Map;)Ljava/util/Map;
/*     */     //   18: putfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   21: aconst_null
/*     */     //   22: astore 4
/*     */     //   24: goto +7 -> 31
/*     */     //   27: aload 5
/*     */     //   29: monitorexit
/*     */     //   30: athrow
/*     */     //   31: aload_0
/*     */     //   32: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   35: dup
/*     */     //   36: astore 5
/*     */     //   38: monitorenter
/*     */     //   39: aload_0
/*     */     //   40: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   43: aload_2
/*     */     //   44: invokeinterface 62 2 0
/*     */     //   49: checkcast 33	java/util/ArrayList
/*     */     //   52: astore 4
/*     */     //   54: aload 4
/*     */     //   56: ifnonnull +33 -> 89
/*     */     //   59: iload_3
/*     */     //   60: ifeq +7 -> 67
/*     */     //   63: aload 5
/*     */     //   65: monitorexit
/*     */     //   66: return
/*     */     //   67: new 33	java/util/ArrayList
/*     */     //   70: dup
/*     */     //   71: invokespecial 391	java/util/ArrayList:<init>	()V
/*     */     //   74: astore 4
/*     */     //   76: aload_0
/*     */     //   77: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   80: aload_2
/*     */     //   81: aload 4
/*     */     //   83: invokeinterface 201 3 0
/*     */     //   88: pop
/*     */     //   89: aload 5
/*     */     //   91: monitorexit
/*     */     //   92: aload 4
/*     */     //   94: aload_1
/*     */     //   95: invokevirtual 132	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*     */     //   98: pop
/*     */     //   99: return
/*     */     // Line number table:
/*     */     //   Java source line #453	-> byte code offset #0
/*     */     //   Java source line #454	-> byte code offset #7
/*     */     //   Java source line #455	-> byte code offset #21
/*     */     //   Java source line #456	-> byte code offset #24
/*     */     //   Java source line #457	-> byte code offset #39
/*     */     //   Java source line #458	-> byte code offset #54
/*     */     //   Java source line #459	-> byte code offset #59
/*     */     //   Java source line #460	-> byte code offset #63
/*     */     //   Java source line #462	-> byte code offset #67
/*     */     //   Java source line #463	-> byte code offset #76
/*     */     //   Java source line #467	-> byte code offset #92
/*     */     //   Java source line #468	-> byte code offset #99
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	100	0	this	FactList
/*     */     //   0	100	1	paramToken	Token
/*     */     //   0	100	2	paramFact	Fact
/*     */     //   0	100	3	paramBoolean	boolean
/*     */     //   22	71	4	localArrayList	ArrayList
/*     */     //   27	1	5	localObject1	Object
/*     */     //   36	54	5	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	30	27	finally
/*     */     //   39	66	27	finally
/*     */     //   67	92	27	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final void addUnconditionalSupportFor(Fact paramFact)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   4: ifnonnull +4 -> 8
/*     */     //   7: return
/*     */     //   8: goto +6 -> 14
/*     */     //   11: aload_2
/*     */     //   12: monitorexit
/*     */     //   13: athrow
/*     */     //   14: aload_0
/*     */     //   15: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   18: dup
/*     */     //   19: astore_2
/*     */     //   20: monitorenter
/*     */     //   21: aload_0
/*     */     //   22: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   25: aload_1
/*     */     //   26: invokeinterface 212 2 0
/*     */     //   31: pop
/*     */     //   32: aload_2
/*     */     //   33: monitorexit
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #477	-> byte code offset #0
/*     */     //   Java source line #478	-> byte code offset #7
/*     */     //   Java source line #480	-> byte code offset #8
/*     */     //   Java source line #481	-> byte code offset #21
/*     */     //   Java source line #483	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	this	FactList
/*     */     //   0	35	1	paramFact	Fact
/*     */     //   11	22	2	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	13	11	finally
/*     */     //   21	34	11	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void removeLogicalSupportFrom(Token paramToken, Fact paramFact)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   4: ifnonnull +4 -> 8
/*     */     //   7: return
/*     */     //   8: aload_0
/*     */     //   9: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   12: aload_2
/*     */     //   13: invokeinterface 62 2 0
/*     */     //   18: checkcast 33	java/util/ArrayList
/*     */     //   21: astore_3
/*     */     //   22: aload_3
/*     */     //   23: ifnonnull +4 -> 27
/*     */     //   26: return
/*     */     //   27: goto +7 -> 34
/*     */     //   30: aload 4
/*     */     //   32: monitorexit
/*     */     //   33: athrow
/*     */     //   34: aload_0
/*     */     //   35: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   38: dup
/*     */     //   39: astore 4
/*     */     //   41: monitorenter
/*     */     //   42: aload_3
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual 395	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
/*     */     //   47: ifeq +27 -> 74
/*     */     //   50: aload_3
/*     */     //   51: invokevirtual 155	java/util/ArrayList:size	()I
/*     */     //   54: ifne +20 -> 74
/*     */     //   57: aload_0
/*     */     //   58: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   61: aload_2
/*     */     //   62: invokeinterface 212 2 0
/*     */     //   67: pop
/*     */     //   68: aload_0
/*     */     //   69: aload_2
/*     */     //   70: iconst_0
/*     */     //   71: invokevirtual 397	jess/FactList:setPendingFact	(Ljess/Fact;Z)V
/*     */     //   74: aload 4
/*     */     //   76: monitorexit
/*     */     //   77: return
/*     */     // Line number table:
/*     */     //   Java source line #490	-> byte code offset #0
/*     */     //   Java source line #491	-> byte code offset #7
/*     */     //   Java source line #492	-> byte code offset #8
/*     */     //   Java source line #493	-> byte code offset #22
/*     */     //   Java source line #494	-> byte code offset #26
/*     */     //   Java source line #495	-> byte code offset #27
/*     */     //   Java source line #496	-> byte code offset #42
/*     */     //   Java source line #497	-> byte code offset #57
/*     */     //   Java source line #498	-> byte code offset #68
/*     */     //   Java source line #501	-> byte code offset #77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	78	0	this	FactList
/*     */     //   0	78	1	paramToken	Token
/*     */     //   0	78	2	paramFact	Fact
/*     */     //   21	30	3	localArrayList	ArrayList
/*     */     //   30	45	4	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   30	33	30	finally
/*     */     //   42	77	30	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public ArrayList getSupportedFacts(Fact paramFact)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 33	java/util/ArrayList
/*     */     //   3: dup
/*     */     //   4: invokespecial 391	java/util/ArrayList:<init>	()V
/*     */     //   7: astore_2
/*     */     //   8: goto +6 -> 14
/*     */     //   11: aload_3
/*     */     //   12: monitorexit
/*     */     //   13: athrow
/*     */     //   14: aload_0
/*     */     //   15: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   18: dup
/*     */     //   19: astore_3
/*     */     //   20: monitorenter
/*     */     //   21: aload_0
/*     */     //   22: getfield 38	jess/FactList:m_logicalSupport	Ljava/util/Map;
/*     */     //   25: invokeinterface 403 1 0
/*     */     //   30: invokeinterface 72 1 0
/*     */     //   35: astore 6
/*     */     //   37: goto +112 -> 149
/*     */     //   40: aload 6
/*     */     //   42: invokeinterface 78 1 0
/*     */     //   47: checkcast 404	java/util/Map$Entry
/*     */     //   50: astore 7
/*     */     //   52: aload 7
/*     */     //   54: invokeinterface 408 1 0
/*     */     //   59: checkcast 33	java/util/ArrayList
/*     */     //   62: astore 8
/*     */     //   64: aload 8
/*     */     //   66: ifnonnull +6 -> 72
/*     */     //   69: goto +80 -> 149
/*     */     //   72: iconst_0
/*     */     //   73: istore 9
/*     */     //   75: goto +64 -> 139
/*     */     //   78: aload 8
/*     */     //   80: iload 9
/*     */     //   82: invokevirtual 139	java/util/ArrayList:get	(I)Ljava/lang/Object;
/*     */     //   85: checkcast 409	jess/Token
/*     */     //   88: astore 10
/*     */     //   90: aload 10
/*     */     //   92: astore 11
/*     */     //   94: goto +37 -> 131
/*     */     //   97: aload 11
/*     */     //   99: invokevirtual 413	jess/Token:topFact	()Ljess/Fact;
/*     */     //   102: invokevirtual 83	jess/Fact:getFactId	()I
/*     */     //   105: aload_1
/*     */     //   106: invokevirtual 83	jess/Fact:getFactId	()I
/*     */     //   109: if_icmpne +15 -> 124
/*     */     //   112: aload_2
/*     */     //   113: aload 7
/*     */     //   115: invokeinterface 416 1 0
/*     */     //   120: invokevirtual 132	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*     */     //   123: pop
/*     */     //   124: aload 11
/*     */     //   126: invokevirtual 419	jess/Token:getParent	()Ljess/Token;
/*     */     //   129: astore 11
/*     */     //   131: aload 11
/*     */     //   133: ifnonnull -36 -> 97
/*     */     //   136: iinc 9 1
/*     */     //   139: iload 9
/*     */     //   141: aload 8
/*     */     //   143: invokevirtual 155	java/util/ArrayList:size	()I
/*     */     //   146: if_icmplt -68 -> 78
/*     */     //   149: aload 6
/*     */     //   151: invokeinterface 87 1 0
/*     */     //   156: ifne -116 -> 40
/*     */     //   159: aload_3
/*     */     //   160: monitorexit
/*     */     //   161: aload_2
/*     */     //   162: areturn
/*     */     // Line number table:
/*     */     //   Java source line #513	-> byte code offset #0
/*     */     //   Java source line #514	-> byte code offset #8
/*     */     //   Java source line #515	-> byte code offset #21
/*     */     //   Java source line #515	-> byte code offset #21
/*     */     //   Java source line #516	-> byte code offset #40
/*     */     //   Java source line #517	-> byte code offset #52
/*     */     //   Java source line #518	-> byte code offset #64
/*     */     //   Java source line #519	-> byte code offset #69
/*     */     //   Java source line #520	-> byte code offset #72
/*     */     //   Java source line #520	-> byte code offset #72
/*     */     //   Java source line #521	-> byte code offset #78
/*     */     //   Java source line #522	-> byte code offset #90
/*     */     //   Java source line #522	-> byte code offset #90
/*     */     //   Java source line #523	-> byte code offset #97
/*     */     //   Java source line #524	-> byte code offset #112
/*     */     //   Java source line #522	-> byte code offset #124
/*     */     //   Java source line #522	-> byte code offset #131
/*     */     //   Java source line #520	-> byte code offset #136
/*     */     //   Java source line #520	-> byte code offset #139
/*     */     //   Java source line #515	-> byte code offset #149
/*     */     //   Java source line #529	-> byte code offset #161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	163	0	this	FactList
/*     */     //   0	163	1	paramFact	Fact
/*     */     //   7	155	2	localArrayList1	ArrayList
/*     */     //   11	149	3	Ljava/lang/Object;	Object
/*     */     //   35	115	6	localIterator	java.util.Iterator
/*     */     //   50	64	7	localEntry	java.util.Map.Entry
/*     */     //   62	80	8	localArrayList2	ArrayList
/*     */     //   73	74	9	i	int
/*     */     //   88	3	10	localToken1	Token
/*     */     //   92	40	11	localToken2	Token
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	13	11	finally
/*     */     //   21	161	11	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\FactList.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */