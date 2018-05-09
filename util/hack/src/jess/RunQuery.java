/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class RunQuery
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public static final int RUN = 0;
/*     */   public static final int COUNT = 1;
/*     */   private int m_cmd;
/*     */   
/*     */   RunQuery(int paramInt)
/*     */   {
/* 639 */     this.m_cmd = paramInt;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Value call(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iconst_1
/*     */     //   2: invokevirtual 34	jess/ValueVector:get	(I)Ljess/Value;
/*     */     //   5: aload_2
/*     */     //   6: invokevirtual 40	jess/Value:atomValue	(Ljess/Context;)Ljava/lang/String;
/*     */     //   9: astore_3
/*     */     //   10: aload_2
/*     */     //   11: invokevirtual 46	jess/Context:getEngine	()Ljess/Rete;
/*     */     //   14: aload_3
/*     */     //   15: invokevirtual 52	jess/Rete:findDefrule	(Ljava/lang/String;)Ljess/HasLHS;
/*     */     //   18: astore 4
/*     */     //   20: aload 4
/*     */     //   22: ifnull +11 -> 33
/*     */     //   25: aload 4
/*     */     //   27: instanceof 55
/*     */     //   30: ifne +16 -> 46
/*     */     //   33: new 29	jess/JessException
/*     */     //   36: dup
/*     */     //   37: ldc 22
/*     */     //   39: ldc 57
/*     */     //   41: aload_3
/*     */     //   42: invokespecial 62	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   45: athrow
/*     */     //   46: aload 4
/*     */     //   48: checkcast 55	jess/Defquery
/*     */     //   51: astore 5
/*     */     //   53: aload_2
/*     */     //   54: invokevirtual 46	jess/Context:getEngine	()Ljess/Rete;
/*     */     //   57: astore 6
/*     */     //   59: new 63	jess/Fact
/*     */     //   62: dup
/*     */     //   63: aload 5
/*     */     //   65: invokevirtual 67	jess/Defquery:getQueryTriggerName	()Ljava/lang/String;
/*     */     //   68: aload 6
/*     */     //   70: invokespecial 70	jess/Fact:<init>	(Ljava/lang/String;Ljess/Rete;)V
/*     */     //   73: astore 7
/*     */     //   75: new 35	jess/ValueVector
/*     */     //   78: dup
/*     */     //   79: invokespecial 73	jess/ValueVector:<init>	()V
/*     */     //   82: astore 8
/*     */     //   84: aload_1
/*     */     //   85: invokevirtual 77	jess/ValueVector:size	()I
/*     */     //   88: iconst_2
/*     */     //   89: isub
/*     */     //   90: aload 5
/*     */     //   92: invokevirtual 80	jess/Defquery:getNVariables	()I
/*     */     //   95: if_icmpeq +16 -> 111
/*     */     //   98: new 29	jess/JessException
/*     */     //   101: dup
/*     */     //   102: ldc 22
/*     */     //   104: ldc 81
/*     */     //   106: aload_3
/*     */     //   107: invokespecial 62	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   110: athrow
/*     */     //   111: iconst_2
/*     */     //   112: istore 9
/*     */     //   114: goto +22 -> 136
/*     */     //   117: aload 8
/*     */     //   119: aload_1
/*     */     //   120: iload 9
/*     */     //   122: invokevirtual 34	jess/ValueVector:get	(I)Ljess/Value;
/*     */     //   125: aload_2
/*     */     //   126: invokevirtual 86	jess/Value:resolveValue	(Ljess/Context;)Ljess/Value;
/*     */     //   129: invokevirtual 90	jess/ValueVector:add	(Ljess/Value;)Ljess/ValueVector;
/*     */     //   132: pop
/*     */     //   133: iinc 9 1
/*     */     //   136: iload 9
/*     */     //   138: aload_1
/*     */     //   139: invokevirtual 77	jess/ValueVector:size	()I
/*     */     //   142: if_icmplt -25 -> 117
/*     */     //   145: aload 7
/*     */     //   147: ldc 91
/*     */     //   149: new 41	jess/Value
/*     */     //   152: dup
/*     */     //   153: aload 8
/*     */     //   155: sipush 512
/*     */     //   158: invokespecial 95	jess/Value:<init>	(Ljess/ValueVector;I)V
/*     */     //   161: invokevirtual 99	jess/Fact:setSlotValue	(Ljava/lang/String;Ljess/Value;)V
/*     */     //   164: goto +7 -> 171
/*     */     //   167: aload 9
/*     */     //   169: monitorexit
/*     */     //   170: athrow
/*     */     //   171: aload 6
/*     */     //   173: invokevirtual 103	jess/Rete:getCompiler	()Ljess/ReteCompiler;
/*     */     //   176: dup
/*     */     //   177: astore 9
/*     */     //   179: monitorenter
/*     */     //   180: goto +7 -> 187
/*     */     //   183: aload 12
/*     */     //   185: monitorexit
/*     */     //   186: athrow
/*     */     //   187: aload 5
/*     */     //   189: dup
/*     */     //   190: astore 12
/*     */     //   192: monitorenter
/*     */     //   193: aload 5
/*     */     //   195: invokevirtual 106	jess/Defquery:clearResults	()V
/*     */     //   198: aload 6
/*     */     //   200: aload 7
/*     */     //   202: aload_2
/*     */     //   203: invokevirtual 110	jess/Rete:assertFact	(Ljess/Fact;Ljess/Context;)Ljess/Fact;
/*     */     //   206: pop
/*     */     //   207: aload 5
/*     */     //   209: invokevirtual 113	jess/Defquery:getMaxBackgroundRules	()I
/*     */     //   212: ifle +14 -> 226
/*     */     //   215: aload 6
/*     */     //   217: aload 5
/*     */     //   219: invokevirtual 113	jess/Defquery:getMaxBackgroundRules	()I
/*     */     //   222: invokevirtual 117	jess/Rete:run	(I)I
/*     */     //   225: pop
/*     */     //   226: aload_0
/*     */     //   227: getfield 21	jess/RunQuery:m_cmd	I
/*     */     //   230: ifne +24 -> 254
/*     */     //   233: aload 5
/*     */     //   235: invokevirtual 121	jess/Defquery:getResults	()Ljava/util/Iterator;
/*     */     //   238: astore 16
/*     */     //   240: new 41	jess/Value
/*     */     //   243: dup
/*     */     //   244: aload 16
/*     */     //   246: invokespecial 124	jess/Value:<init>	(Ljava/lang/Object;)V
/*     */     //   249: astore 15
/*     */     //   251: goto +18 -> 269
/*     */     //   254: new 41	jess/Value
/*     */     //   257: dup
/*     */     //   258: aload 5
/*     */     //   260: invokevirtual 127	jess/Defquery:countResults	()I
/*     */     //   263: iconst_4
/*     */     //   264: invokespecial 130	jess/Value:<init>	(II)V
/*     */     //   267: astore 15
/*     */     //   269: aload 5
/*     */     //   271: invokevirtual 106	jess/Defquery:clearResults	()V
/*     */     //   274: aload 6
/*     */     //   276: aload 7
/*     */     //   278: invokevirtual 134	jess/Rete:retract	(Ljess/Fact;)Ljess/Fact;
/*     */     //   281: pop
/*     */     //   282: aload 15
/*     */     //   284: aload 12
/*     */     //   286: monitorexit
/*     */     //   287: aload 9
/*     */     //   289: monitorexit
/*     */     //   290: areturn
/*     */     // Line number table:
/*     */     //   Java source line #647	-> byte code offset #0
/*     */     //   Java source line #648	-> byte code offset #10
/*     */     //   Java source line #649	-> byte code offset #20
/*     */     //   Java source line #650	-> byte code offset #33
/*     */     //   Java source line #652	-> byte code offset #46
/*     */     //   Java source line #653	-> byte code offset #53
/*     */     //   Java source line #656	-> byte code offset #59
/*     */     //   Java source line #657	-> byte code offset #75
/*     */     //   Java source line #658	-> byte code offset #84
/*     */     //   Java source line #659	-> byte code offset #98
/*     */     //   Java source line #661	-> byte code offset #111
/*     */     //   Java source line #661	-> byte code offset #111
/*     */     //   Java source line #662	-> byte code offset #117
/*     */     //   Java source line #661	-> byte code offset #133
/*     */     //   Java source line #661	-> byte code offset #136
/*     */     //   Java source line #664	-> byte code offset #145
/*     */     //   Java source line #668	-> byte code offset #164
/*     */     //   Java source line #669	-> byte code offset #180
/*     */     //   Java source line #670	-> byte code offset #193
/*     */     //   Java source line #671	-> byte code offset #198
/*     */     //   Java source line #673	-> byte code offset #207
/*     */     //   Java source line #674	-> byte code offset #215
/*     */     //   Java source line #675	-> byte code offset #226
/*     */     //   Java source line #676	-> byte code offset #226
/*     */     //   Java source line #677	-> byte code offset #233
/*     */     //   Java source line #678	-> byte code offset #240
/*     */     //   Java source line #680	-> byte code offset #254
/*     */     //   Java source line #682	-> byte code offset #269
/*     */     //   Java source line #683	-> byte code offset #274
/*     */     //   Java source line #684	-> byte code offset #282
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	291	0	this	RunQuery
/*     */     //   0	291	1	paramValueVector	ValueVector
/*     */     //   0	291	2	paramContext	Context
/*     */     //   9	98	3	str	String
/*     */     //   18	29	4	localHasLHS	HasLHS
/*     */     //   51	219	5	localDefquery	Defquery
/*     */     //   57	218	6	localRete	Rete
/*     */     //   73	204	7	localFact	Fact
/*     */     //   82	72	8	localValueVector	ValueVector
/*     */     //   112	31	9	i	int
/*     */     //   167	121	9	Ljava/lang/Object;	Object
/*     */     //   183	102	12	Ljava/lang/Object;	Object
/*     */     //   249	34	15	localValue	Value
/*     */     //   238	7	16	localIterator	java.util.Iterator
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   167	170	167	finally
/*     */     //   180	290	167	finally
/*     */     //   183	186	183	finally
/*     */     //   193	287	183	finally
/*     */   }
/*     */   
/*     */   public String getName()
/*     */   {
/* 643 */     return this.m_cmd == 0 ? "run-query" : "count-query-results";
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\RunQuery.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */