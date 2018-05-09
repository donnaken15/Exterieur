/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.TreeMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Defmodule
/*    */   implements Serializable
/*    */ {
/*    */   public static final String MAIN = "MAIN";
/*    */   private HeapPriorityQueue m_queue;
/*    */   private TreeMap m_deftemplates;
/*    */   private String m_name;
/*    */   private String m_comment;
/*    */   
/*    */   Defmodule(String paramString1, String paramString2, Strategy paramStrategy)
/*    */   {
/* 23 */     this.m_name = paramString1;
/* 24 */     this.m_comment = paramString2;
/* 25 */     this.m_queue = new HeapPriorityQueue(paramStrategy);
/* 26 */     this.m_deftemplates = new TreeMap();
/*    */   }
/*    */   
/*    */   HeapPriorityQueue getQueue() {
/* 30 */     return this.m_queue;
/*    */   }
/*    */   
/*    */   String getName() {
/* 34 */     return this.m_name;
/*    */   }
/*    */   
/*    */   String getDocstring() {
/* 38 */     return this.m_comment;
/*    */   }
/*    */   
/*    */   void reset() {
/* 42 */     this.m_queue.clear();
/*    */   }
/*    */   
/*    */   Iterator listDeftemplates() {
/* 46 */     return this.m_deftemplates.values().iterator();
/*    */   }
/*    */   
/*    */   Deftemplate getDeftemplate(String paramString) {
/* 50 */     int i = paramString.indexOf("::");
/* 51 */     if (i != -1) {
/* 52 */       paramString = paramString.substring(i + 2);
/*    */     }
/* 54 */     return (Deftemplate)this.m_deftemplates.get(paramString);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   Deftemplate addDeftemplate(Deftemplate paramDeftemplate, Rete paramRete)
/*    */     throws JessException
/*    */   {
/*    */     // Byte code:
/*    */     //   0: goto +6 -> 6
/*    */     //   3: aload_3
/*    */     //   4: monitorexit
/*    */     //   5: athrow
/*    */     //   6: aload_0
/*    */     //   7: getfield 40	jess/Defmodule:m_deftemplates	Ljava/util/TreeMap;
/*    */     //   10: dup
/*    */     //   11: astore_3
/*    */     //   12: monitorenter
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual 79	jess/Deftemplate:getModule	()Ljava/lang/String;
/*    */     //   17: aload_0
/*    */     //   18: getfield 26	jess/Defmodule:m_name	Ljava/lang/String;
/*    */     //   21: invokevirtual 83	java/lang/String:equals	(Ljava/lang/Object;)Z
/*    */     //   24: ifne +19 -> 43
/*    */     //   27: new 75	jess/JessException
/*    */     //   30: dup
/*    */     //   31: ldc 84
/*    */     //   33: ldc 86
/*    */     //   35: aload_1
/*    */     //   36: invokevirtual 79	jess/Deftemplate:getModule	()Ljava/lang/String;
/*    */     //   39: invokespecial 91	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   42: athrow
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual 94	jess/Deftemplate:getBaseName	()Ljava/lang/String;
/*    */     //   47: astore 6
/*    */     //   49: aload_0
/*    */     //   50: getfield 40	jess/Defmodule:m_deftemplates	Ljava/util/TreeMap;
/*    */     //   53: aload 6
/*    */     //   55: invokevirtual 69	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   58: checkcast 70	jess/Deftemplate
/*    */     //   61: astore 7
/*    */     //   63: aload 7
/*    */     //   65: ifnull +12 -> 77
/*    */     //   68: aload 7
/*    */     //   70: aload_1
/*    */     //   71: invokevirtual 95	jess/Deftemplate:equals	(Ljava/lang/Object;)Z
/*    */     //   74: ifeq +24 -> 98
/*    */     //   77: aload_2
/*    */     //   78: bipush 64
/*    */     //   80: aload_1
/*    */     //   81: invokevirtual 99	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*    */     //   84: aload_0
/*    */     //   85: getfield 40	jess/Defmodule:m_deftemplates	Ljava/util/TreeMap;
/*    */     //   88: aload 6
/*    */     //   90: aload_1
/*    */     //   91: invokevirtual 105	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   94: pop
/*    */     //   95: goto +19 -> 114
/*    */     //   98: new 75	jess/JessException
/*    */     //   101: dup
/*    */     //   102: ldc 84
/*    */     //   104: ldc 106
/*    */     //   106: aload_1
/*    */     //   107: invokevirtual 109	jess/Deftemplate:getName	()Ljava/lang/String;
/*    */     //   110: invokespecial 91	jess/JessException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   113: athrow
/*    */     //   114: aload_1
/*    */     //   115: aload_3
/*    */     //   116: monitorexit
/*    */     //   117: areturn
/*    */     // Line number table:
/*    */     //   Java source line #59	-> byte code offset #0
/*    */     //   Java source line #60	-> byte code offset #13
/*    */     //   Java source line #61	-> byte code offset #27
/*    */     //   Java source line #64	-> byte code offset #43
/*    */     //   Java source line #65	-> byte code offset #49
/*    */     //   Java source line #66	-> byte code offset #63
/*    */     //   Java source line #67	-> byte code offset #77
/*    */     //   Java source line #68	-> byte code offset #84
/*    */     //   Java source line #70	-> byte code offset #98
/*    */     //   Java source line #74	-> byte code offset #114
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	118	0	this	Defmodule
/*    */     //   0	118	1	paramDeftemplate	Deftemplate
/*    */     //   0	118	2	paramRete	Rete
/*    */     //   3	113	3	Ljava/lang/Object;	Object
/*    */     //   47	42	6	str	String
/*    */     //   61	8	7	localDeftemplate	Deftemplate
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   13	117	3	finally
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Defmodule.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */