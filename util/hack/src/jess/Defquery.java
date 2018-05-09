/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Defquery
/*     */   extends HasLHS
/*     */   implements Serializable
/*     */ {
/*     */   public static final String QUERY_TRIGGER = "__query-trigger-";
/*     */   private ArrayList m_results;
/*     */   private ArrayList m_queryVariables;
/*     */   private int m_maxBackgroundRules;
/*     */   
/*     */   Defquery(String paramString1, String paramString2, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  25 */     super(paramString1, paramString2, paramRete);jdMethod_this();
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  15 */     this.m_results = new ArrayList();
/*  16 */     this.m_queryVariables = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  29 */     this.m_maxBackgroundRules = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMaxBackgroundRules()
/*     */   {
/*  39 */     return this.m_maxBackgroundRules;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaxBackgroundRules(int paramInt)
/*     */   {
/*  48 */     this.m_maxBackgroundRules = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public synchronized void callNodeLeft(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  56 */     broadcastEvent(32768, paramToken);
/*     */     
/*  58 */     if ((paramToken.m_tag == 0) || ((this.m_new) && (paramToken.m_tag == 2))) {
/*  59 */       this.m_results.add(paramToken);
/*     */     }
/*  61 */     else if (paramToken.m_tag == 1) {
/*  62 */       this.m_results.remove(paramToken);
/*     */     }
/*  64 */     else if (paramToken.m_tag == 3) {
/*  65 */       this.m_results.clear();
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
/*     */   synchronized void clearResults()
/*     */   {
/*  90 */     this.m_results = new ArrayList();
/*  91 */     Defquery localDefquery = (Defquery)getNext();
/*  92 */     if (localDefquery != null)
/*  93 */       localDefquery.clearResults();
/*     */   }
/*     */   
/*     */   synchronized int countResults() {
/*  97 */     int i = this.m_results.size();
/*  98 */     Defquery localDefquery = (Defquery)getNext();
/*  99 */     if (localDefquery != null)
/* 100 */       i += localDefquery.countResults();
/* 101 */     return i;
/*     */   }
/*     */   
/*     */   public String getQueryTriggerName() {
/* 105 */     String str = getDisplayName();
/* 106 */     int i = str.indexOf("::");
/* 107 */     return RU.scopeName(getModule(), "__query-trigger-" + str.substring(i + 2));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void freeze(Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 115 */     if (this.m_frozen) {
/* 116 */       return;
/*     */     }
/* 118 */     super.freeze(paramRete);
/*     */     
/* 120 */     Pattern localPattern = new Pattern(getQueryTriggerName(), paramRete);
/* 121 */     int i = 0;
/* 122 */     for (Iterator localIterator = this.m_queryVariables.iterator(); localIterator.hasNext(); i++) {
/* 123 */       localPattern.addTest("__data", new Test1(0, i, (Variable)localIterator.next()));
/*     */     }
/*     */     
/* 126 */     insertCEAt(localPattern, 0, paramRete);
/*     */   }
/*     */   
/*     */   void addQueryVariable(Variable paramVariable) {
/* 130 */     this.m_queryVariables.add(paramVariable);
/*     */   }
/*     */   
/*     */   int getNVariables() {
/* 134 */     return this.m_queryVariables.size();
/*     */   }
/*     */   
/*     */   Variable getQueryVariable(int paramInt) {
/* 138 */     return (Variable)this.m_queryVariables.get(paramInt);
/*     */   }
/*     */   
/*     */   void addCE(LHSComponent paramLHSComponent, Rete paramRete) throws JessException {
/* 142 */     if (paramLHSComponent.getLogical()) {
/* 143 */       throw new JessException("Defquery.addCE", "Can't use logical CE in defquery", "");
/*     */     }
/* 145 */     super.addCE(paramLHSComponent, paramRete);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 149 */     return "Defquery " + getName();
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 153 */     return paramVisitor.visitDefquery(this);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   synchronized Iterator getResults()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 50	java/util/ArrayList
/*     */     //   3: dup
/*     */     //   4: invokespecial 63	java/util/ArrayList:<init>	()V
/*     */     //   7: astore_1
/*     */     //   8: aload_0
/*     */     //   9: astore_2
/*     */     //   10: goto +64 -> 74
/*     */     //   13: aload_2
/*     */     //   14: getfield 45	jess/Defquery:m_results	Ljava/util/ArrayList;
/*     */     //   17: astore_3
/*     */     //   18: goto +7 -> 25
/*     */     //   21: aload 4
/*     */     //   23: monitorexit
/*     */     //   24: athrow
/*     */     //   25: aload_3
/*     */     //   26: dup
/*     */     //   27: astore 4
/*     */     //   29: monitorenter
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual 66	java/util/ArrayList:size	()I
/*     */     //   34: istore 7
/*     */     //   36: iconst_0
/*     */     //   37: istore 8
/*     */     //   39: goto +17 -> 56
/*     */     //   42: aload_1
/*     */     //   43: aload_3
/*     */     //   44: iload 8
/*     */     //   46: invokevirtual 70	java/util/ArrayList:get	(I)Ljava/lang/Object;
/*     */     //   49: invokevirtual 49	java/util/ArrayList:add	(Ljava/lang/Object;)Z
/*     */     //   52: pop
/*     */     //   53: iinc 8 1
/*     */     //   56: iload 8
/*     */     //   58: iload 7
/*     */     //   60: if_icmplt -18 -> 42
/*     */     //   63: aload 4
/*     */     //   65: monitorexit
/*     */     //   66: aload_2
/*     */     //   67: invokevirtual 74	jess/Defquery:getNext	()Ljess/HasLHS;
/*     */     //   70: checkcast 1	jess/Defquery
/*     */     //   73: astore_2
/*     */     //   74: aload_2
/*     */     //   75: ifnonnull -62 -> 13
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual 77	java/util/ArrayList:iterator	()Ljava/util/Iterator;
/*     */     //   82: areturn
/*     */     // Line number table:
/*     */     //   Java source line #75	-> byte code offset #0
/*     */     //   Java source line #76	-> byte code offset #8
/*     */     //   Java source line #77	-> byte code offset #10
/*     */     //   Java source line #78	-> byte code offset #13
/*     */     //   Java source line #79	-> byte code offset #18
/*     */     //   Java source line #80	-> byte code offset #30
/*     */     //   Java source line #81	-> byte code offset #36
/*     */     //   Java source line #81	-> byte code offset #36
/*     */     //   Java source line #82	-> byte code offset #42
/*     */     //   Java source line #81	-> byte code offset #53
/*     */     //   Java source line #81	-> byte code offset #56
/*     */     //   Java source line #84	-> byte code offset #66
/*     */     //   Java source line #77	-> byte code offset #74
/*     */     //   Java source line #86	-> byte code offset #78
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	83	0	this	Defquery
/*     */     //   7	72	1	localArrayList1	ArrayList
/*     */     //   9	66	2	localDefquery	Defquery
/*     */     //   17	27	3	localArrayList2	ArrayList
/*     */     //   21	43	4	Ljava/lang/Object;	Object
/*     */     //   34	27	7	i	int
/*     */     //   37	24	8	j	int
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   21	24	21	finally
/*     */     //   30	66	21	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Defquery.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */