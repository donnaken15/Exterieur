/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ class JessEventSupport implements Serializable
/*    */ {
/*    */   private List m_listeners;
/*    */   private int m_eventMask;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 14 */     this.m_listeners = Collections.synchronizedList(new java.util.ArrayList());
/* 15 */     this.m_eventMask = 0; }
/*    */   
/* 17 */   JessEventSupport(Rete paramRete) { jdMethod_this();
/* 18 */     addJessListener(paramRete);
/*    */   }
/*    */   
/*    */   public void addJessListener(JessListener paramJessListener) {
/* 22 */     this.m_listeners.add(paramJessListener);
/*    */   }
/*    */   
/*    */   public void removeJessListener(JessListener paramJessListener) {
/* 26 */     this.m_listeners.remove(paramJessListener);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getEventMask()
/*    */   {
/* 37 */     return this.m_eventMask;
/*    */   }
/*    */   
/*    */   public synchronized void setEventMask(int paramInt) {
/* 41 */     this.m_eventMask = paramInt;
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public java.util.Iterator listJessListeners()
/*    */   {
/*    */     // Byte code:
/*    */     //   0: goto +6 -> 6
/*    */     //   3: aload_1
/*    */     //   4: monitorexit
/*    */     //   5: athrow
/*    */     //   6: aload_0
/*    */     //   7: getfield 16	jess/JessEventSupport:m_listeners	Ljava/util/List;
/*    */     //   10: dup
/*    */     //   11: astore_1
/*    */     //   12: monitorenter
/*    */     //   13: new 29	java/util/ArrayList
/*    */     //   16: dup
/*    */     //   17: aload_0
/*    */     //   18: getfield 16	jess/JessEventSupport:m_listeners	Ljava/util/List;
/*    */     //   21: invokespecial 34	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
/*    */     //   24: invokevirtual 37	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*    */     //   27: aload_1
/*    */     //   28: monitorexit
/*    */     //   29: areturn
/*    */     // Line number table:
/*    */     //   Java source line #31	-> byte code offset #0
/*    */     //   Java source line #32	-> byte code offset #13
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	30	0	this	JessEventSupport
/*    */     //   3	25	1	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   13	29	3	finally
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   final void broadcastEvent(Object paramObject1, int paramInt, Object paramObject2)
/*    */     throws JessException
/*    */   {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: aload_0
/*    */     //   2: invokevirtual 50	jess/JessEventSupport:getEventMask	()I
/*    */     //   5: iand
/*    */     //   6: ifne +4 -> 10
/*    */     //   9: return
/*    */     //   10: goto +7 -> 17
/*    */     //   13: aload 6
/*    */     //   15: monitorexit
/*    */     //   16: athrow
/*    */     //   17: aload_0
/*    */     //   18: getfield 16	jess/JessEventSupport:m_listeners	Ljava/util/List;
/*    */     //   21: dup
/*    */     //   22: astore 6
/*    */     //   24: monitorenter
/*    */     //   25: aload_0
/*    */     //   26: getfield 16	jess/JessEventSupport:m_listeners	Ljava/util/List;
/*    */     //   29: invokeinterface 53 1 0
/*    */     //   34: dup
/*    */     //   35: istore 5
/*    */     //   37: ifne +7 -> 44
/*    */     //   40: aload 6
/*    */     //   42: monitorexit
/*    */     //   43: return
/*    */     //   44: new 29	java/util/ArrayList
/*    */     //   47: dup
/*    */     //   48: aload_0
/*    */     //   49: getfield 16	jess/JessEventSupport:m_listeners	Ljava/util/List;
/*    */     //   52: invokespecial 34	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
/*    */     //   55: astore 4
/*    */     //   57: aload 6
/*    */     //   59: monitorexit
/*    */     //   60: iconst_0
/*    */     //   61: istore 8
/*    */     //   63: goto +59 -> 122
/*    */     //   66: new 54	jess/JessEvent
/*    */     //   69: dup
/*    */     //   70: aload_1
/*    */     //   71: iload_2
/*    */     //   72: aload_3
/*    */     //   73: invokespecial 57	jess/JessEvent:<init>	(Ljava/lang/Object;ILjava/lang/Object;)V
/*    */     //   76: astore 9
/*    */     //   78: aload 4
/*    */     //   80: iload 8
/*    */     //   82: invokevirtual 61	java/util/ArrayList:get	(I)Ljava/lang/Object;
/*    */     //   85: checkcast 62	jess/JessListener
/*    */     //   88: aload 9
/*    */     //   90: invokeinterface 67 2 0
/*    */     //   95: goto +24 -> 119
/*    */     //   98: astore 9
/*    */     //   100: aload 9
/*    */     //   102: athrow
/*    */     //   103: astore 9
/*    */     //   105: new 47	jess/JessException
/*    */     //   108: dup
/*    */     //   109: ldc 70
/*    */     //   111: ldc 72
/*    */     //   113: aload 9
/*    */     //   115: invokespecial 76	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   118: athrow
/*    */     //   119: iinc 8 1
/*    */     //   122: iload 8
/*    */     //   124: iload 5
/*    */     //   126: if_icmplt -60 -> 66
/*    */     //   129: return
/*    */     // Line number table:
/*    */     //   Java source line #47	-> byte code offset #0
/*    */     //   Java source line #48	-> byte code offset #9
/*    */     //   Java source line #54	-> byte code offset #10
/*    */     //   Java source line #55	-> byte code offset #10
/*    */     //   Java source line #57	-> byte code offset #10
/*    */     //   Java source line #58	-> byte code offset #25
/*    */     //   Java source line #59	-> byte code offset #40
/*    */     //   Java source line #61	-> byte code offset #44
/*    */     //   Java source line #64	-> byte code offset #60
/*    */     //   Java source line #64	-> byte code offset #60
/*    */     //   Java source line #65	-> byte code offset #66
/*    */     //   Java source line #66	-> byte code offset #66
/*    */     //   Java source line #67	-> byte code offset #78
/*    */     //   Java source line #69	-> byte code offset #100
/*    */     //   Java source line #71	-> byte code offset #105
/*    */     //   Java source line #64	-> byte code offset #119
/*    */     //   Java source line #64	-> byte code offset #122
/*    */     //   Java source line #76	-> byte code offset #129
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	130	0	this	JessEventSupport
/*    */     //   0	130	1	paramObject1	Object
/*    */     //   0	130	2	paramInt	int
/*    */     //   0	130	3	paramObject2	Object
/*    */     //   55	24	4	localArrayList	java.util.ArrayList
/*    */     //   35	92	5	i	int
/*    */     //   13	1	6	localObject1	Object
/*    */     //   22	36	6	Ljava/lang/Object;	Object
/*    */     //   61	66	8	j	int
/*    */     //   76	13	9	localJessEvent	JessEvent
/*    */     //   98	3	9	localJessException	JessException
/*    */     //   103	11	9	localException	Exception
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   13	16	13	finally
/*    */     //   25	43	13	finally
/*    */     //   44	60	13	finally
/*    */     //   66	95	98	jess/JessException
/*    */     //   66	95	103	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessEventSupport.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */