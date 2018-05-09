/*     */ package jess;
/*     */ 
/*     */ import java.util.Stack;
/*     */ 
/*     */ class Agenda implements java.io.Serializable {
/*     */   private Object m_activationSemaphore;
/*     */   private boolean m_halt;
/*     */   private int m_evalSalience;
/*     */   private java.util.HashMap m_modules;
/*     */   private String m_thisModule;
/*     */   private Strategy m_strategy;
/*     */   private Stack m_focusStack;
/*     */   private Activation m_thisActivation;
/*     */   
/*     */   private final void jdMethod_this() {
/*  16 */     this.m_activationSemaphore = new String("ACTIVATION LOCK");
/*  17 */     this.m_halt = false;
/*  18 */     this.m_evalSalience = 0;
/*  19 */     this.m_modules = new java.util.HashMap();
/*     */     
/*  21 */     this.m_strategy = new depth();
/*  22 */     this.m_focusStack = new Stack();
/*     */   }
/*     */   
/*  25 */   Agenda() { jdMethod_this();
/*     */     try {
/*  27 */       addDefmodule("MAIN");
/*     */     } catch (JessException localJessException) {
/*  29 */       throw new RuntimeException("Can't define module MAIN");
/*     */     }
/*     */   }
/*     */   
/*     */   void setEvalSalience(int paramInt) throws JessException {
/*  34 */     if ((paramInt < 0) || (paramInt > 2)) {
/*  35 */       throw new JessException("Agenda.setEvalSalience", "Invalid value", paramInt);
/*     */     }
/*  37 */     this.m_evalSalience = paramInt;
/*     */   }
/*     */   
/*     */   int getEvalSalience() {
/*  41 */     return this.m_evalSalience;
/*     */   }
/*     */   
/*     */   void reset(Rete paramRete) throws JessException {
/*  45 */     java.util.Iterator localIterator = this.m_modules.values().iterator();
/*  46 */     while (localIterator.hasNext()) {
/*  47 */       Defmodule localDefmodule = (Defmodule)localIterator.next();
/*  48 */       localDefmodule.reset();
/*     */     }
/*  50 */     this.m_focusStack.clear();
/*  51 */     this.m_focusStack.push("MAIN");
/*  52 */     paramRete.broadcastEvent(1048576, "MAIN");
/*     */   }
/*     */   
/*     */   void clear() throws JessException {
/*  56 */     this.m_modules.clear();
/*  57 */     this.m_strategy = new depth();
/*  58 */     addDefmodule("MAIN");
/*  59 */     this.m_focusStack.clear();
/*     */   }
/*     */   
/*     */   Object getActivationSemaphore() {
/*  63 */     return this.m_activationSemaphore;
/*     */   }
/*     */   
/*     */   HeapPriorityQueue getQueue() {
/*  67 */     return ((Defmodule)this.m_modules.get(this.m_thisModule)).getQueue();
/*     */   }
/*     */   
/*     */   HeapPriorityQueue getQueue(Object paramObject) throws JessException {
/*  71 */     verifyModule(paramObject);
/*  72 */     return ((Defmodule)this.m_modules.get(paramObject)).getQueue();
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
/*     */   java.util.Iterator listActivations()
/*     */   {
/*  98 */     return getQueue().iterator();
/*     */   }
/*     */   
/*     */   java.util.Iterator listActivations(String paramString) throws JessException {
/* 102 */     return getQueue(paramString).iterator();
/*     */   }
/*     */   
/*     */   java.util.Iterator listModules() {
/* 106 */     return this.m_modules.keySet().iterator();
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
/*     */   Strategy getStrategy()
/*     */   {
/* 136 */     return this.m_strategy;
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
/*     */   int runUntilHalt(Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 168 */     int i = 0;
/*     */     do {
/* 170 */       i += run(paramRete);
/* 171 */       if (this.m_halt)
/*     */         break;
/* 173 */       waitForActivations();
/* 174 */     } while (!this.m_halt);
/*     */     
/* 176 */     return i;
/*     */   }
/*     */   
/*     */   synchronized int run(Rete paramRete) throws JessException {
/* 180 */     int i = 0;
/*     */     int j;
/*     */     do {
/* 183 */       j = run(Integer.MAX_VALUE, paramRete);
/* 184 */       i += j;
/* 185 */     } while ((j > 0) && (!this.m_halt));
/* 186 */     return i;
/*     */   }
/*     */   
/*     */   synchronized int run(int paramInt, Rete paramRete) throws JessException {
/* 190 */     int i = 0;
/* 191 */     this.m_halt = false;
/*     */     
/*     */     Object localObject1;
/*     */     
/* 195 */     while ((!this.m_halt) && (i < paramInt) && ((localObject1 = getNextActivation(paramRete)) != null))
/*     */     {
/* 197 */       if (!((Activation)localObject1).isInactive()) {
/* 198 */         ((Activation)localObject1).setSequenceNumber(++i);
/* 199 */         paramRete.broadcastEvent(2, localObject1);
/*     */         try {
/* 201 */           paramRete.aboutToFire((Activation)localObject1);
/* 202 */           this.m_thisActivation = ((Activation)localObject1);
/* 203 */           ((Activation)localObject1).fire(paramRete);
/*     */         } finally {
/* 205 */           this.m_thisActivation = null;
/* 206 */           paramRete.justFired((Activation)localObject1);
/*     */         }
/*     */       }
/*     */       
/* 210 */       if (this.m_evalSalience == 2) {
/* 211 */         setStrategy(getQueue().getStrategy(), paramRete);
/*     */       }
/*     */     }
/* 214 */     return i;
/*     */   }
/*     */   
/*     */   String getCurrentModule() {
/* 218 */     return this.m_thisModule;
/*     */   }
/*     */   
/*     */   Defmodule getModule(String paramString) throws JessException {
/* 222 */     verifyModule(paramString);
/* 223 */     return (Defmodule)this.m_modules.get(paramString);
/*     */   }
/*     */   
/*     */   java.util.Iterator listFocusStack() {
/* 227 */     return this.m_focusStack.iterator();
/*     */   }
/*     */   
/*     */   void clearFocusStack() {
/* 231 */     this.m_focusStack.clear();
/*     */   }
/*     */   
/*     */   String getFocus() {
/* 235 */     if (this.m_focusStack.empty()) {
/* 236 */       return "MAIN";
/*     */     }
/* 238 */     return (String)this.m_focusStack.peek();
/*     */   }
/*     */   
/*     */   String popFocus(Rete paramRete, String paramString) throws JessException {
/* 242 */     if (this.m_focusStack.empty())
/* 243 */       return "MAIN";
/* 244 */     if ((paramString != null) && (!paramString.equals(getFocus()))) {
/* 245 */       return paramString;
/*     */     }
/* 247 */     String str = (String)this.m_focusStack.pop();
/*     */     
/* 249 */     paramRete.broadcastEvent(-2146435072, str);
/*     */     
/* 251 */     paramRete.broadcastEvent(1048576, getFocus());
/* 252 */     return str;
/*     */   }
/*     */   
/*     */   void setFocus(String paramString, Rete paramRete) throws JessException
/*     */   {
/* 257 */     if (getFocus().equals(paramString))
/* 258 */       return;
/* 259 */     verifyModule(paramString);
/* 260 */     paramRete.broadcastEvent(-2146435072, getFocus());
/* 261 */     paramRete.broadcastEvent(1048576, paramString);
/* 262 */     this.m_focusStack.push(paramString);
/*     */   }
/*     */   
/*     */   String setCurrentModule(String paramString) throws JessException {
/* 266 */     String str = this.m_thisModule;
/* 267 */     verifyModule(paramString);
/* 268 */     this.m_thisModule = paramString;
/* 269 */     return str;
/*     */   }
/*     */   
/*     */   void addDefmodule(String paramString) throws JessException {
/* 273 */     addDefmodule(paramString, null);
/*     */   }
/*     */   
/*     */   void addDefmodule(String paramString1, String paramString2) throws JessException {
/* 277 */     if (this.m_modules.get(paramString1) != null) {
/* 278 */       throw new JessException("Agenda.addDefmodule", "Attempt to redefine defmodule", paramString1);
/*     */     }
/*     */     
/*     */ 
/* 282 */     this.m_thisModule = paramString1;
/* 283 */     this.m_modules.put(paramString1, new Defmodule(paramString1, paramString2, this.m_strategy));
/*     */   }
/*     */   
/*     */   void verifyModule(Object paramObject) throws JessException
/*     */   {
/* 288 */     if (this.m_modules.get(paramObject) == null) {
/* 289 */       throw new JessException("Agenda.verifyModule", "Undefined module", paramObject.toString());
/*     */     }
/*     */   }
/*     */   
/*     */   String resolveName(String paramString)
/*     */   {
/* 295 */     if (paramString.indexOf("::") == -1)
/* 296 */       paramString = RU.scopeName(getCurrentModule(), paramString);
/* 297 */     return paramString;
/*     */   }
/*     */   
/*     */   Activation getThisActivation() {
/* 301 */     return this.m_thisActivation;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   Activation getNextActivation(Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_2
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 74	jess/Agenda:m_focusStack	Ljava/util/Stack;
/*     */     //   17: invokevirtual 125	java/util/Stack:empty	()Z
/*     */     //   20: ifeq +15 -> 35
/*     */     //   23: aload_0
/*     */     //   24: ldc 80
/*     */     //   26: invokevirtual 127	jess/Agenda:getQueue	(Ljava/lang/Object;)Ljess/HeapPriorityQueue;
/*     */     //   29: invokevirtual 131	jess/HeapPriorityQueue:pop	()Ljess/Activation;
/*     */     //   32: aload_2
/*     */     //   33: monitorexit
/*     */     //   34: areturn
/*     */     //   35: goto +72 -> 107
/*     */     //   38: aload_0
/*     */     //   39: aload_0
/*     */     //   40: getfield 74	jess/Agenda:m_focusStack	Ljava/util/Stack;
/*     */     //   43: invokevirtual 136	java/util/Stack:peek	()Ljava/lang/Object;
/*     */     //   46: invokevirtual 127	jess/Agenda:getQueue	(Ljava/lang/Object;)Ljess/HeapPriorityQueue;
/*     */     //   49: astore 5
/*     */     //   51: aload 5
/*     */     //   53: invokevirtual 131	jess/HeapPriorityQueue:pop	()Ljess/Activation;
/*     */     //   56: astore 6
/*     */     //   58: aload 6
/*     */     //   60: ifnull +8 -> 68
/*     */     //   63: aload 6
/*     */     //   65: aload_2
/*     */     //   66: monitorexit
/*     */     //   67: areturn
/*     */     //   68: aload_0
/*     */     //   69: getfield 74	jess/Agenda:m_focusStack	Ljava/util/Stack;
/*     */     //   72: invokevirtual 138	java/util/Stack:pop	()Ljava/lang/Object;
/*     */     //   75: astore 7
/*     */     //   77: aload_1
/*     */     //   78: ldc -117
/*     */     //   80: aload 7
/*     */     //   82: invokevirtual 90	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*     */     //   85: aload_0
/*     */     //   86: invokevirtual 143	jess/Agenda:getFocus	()Ljava/lang/String;
/*     */     //   89: aload 7
/*     */     //   91: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   94: ifne +13 -> 107
/*     */     //   97: aload_1
/*     */     //   98: ldc 86
/*     */     //   100: aload_0
/*     */     //   101: invokevirtual 143	jess/Agenda:getFocus	()Ljava/lang/String;
/*     */     //   104: invokevirtual 90	jess/Rete:broadcastEvent	(ILjava/lang/Object;)V
/*     */     //   107: aload_0
/*     */     //   108: getfield 74	jess/Agenda:m_focusStack	Ljava/util/Stack;
/*     */     //   111: invokevirtual 125	java/util/Stack:empty	()Z
/*     */     //   114: ifeq -76 -> 38
/*     */     //   117: aload_0
/*     */     //   118: ldc 80
/*     */     //   120: invokevirtual 127	jess/Agenda:getQueue	(Ljava/lang/Object;)Ljess/HeapPriorityQueue;
/*     */     //   123: invokevirtual 131	jess/HeapPriorityQueue:pop	()Ljess/Activation;
/*     */     //   126: aload_2
/*     */     //   127: monitorexit
/*     */     //   128: areturn
/*     */     // Line number table:
/*     */     //   Java source line #76	-> byte code offset #0
/*     */     //   Java source line #77	-> byte code offset #13
/*     */     //   Java source line #78	-> byte code offset #23
/*     */     //   Java source line #80	-> byte code offset #35
/*     */     //   Java source line #81	-> byte code offset #38
/*     */     //   Java source line #82	-> byte code offset #51
/*     */     //   Java source line #83	-> byte code offset #58
/*     */     //   Java source line #84	-> byte code offset #63
/*     */     //   Java source line #86	-> byte code offset #68
/*     */     //   Java source line #87	-> byte code offset #77
/*     */     //   Java source line #89	-> byte code offset #85
/*     */     //   Java source line #90	-> byte code offset #97
/*     */     //   Java source line #80	-> byte code offset #107
/*     */     //   Java source line #93	-> byte code offset #117
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	129	0	this	Agenda
/*     */     //   0	129	1	paramRete	Rete
/*     */     //   3	1	2	localObject1	Object
/*     */     //   11	116	2	Ljava/lang/Object;	Object
/*     */     //   49	3	5	localHeapPriorityQueue	HeapPriorityQueue
/*     */     //   56	8	6	localActivation	Activation
/*     */     //   75	15	7	localObject2	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	34	3	finally
/*     */     //   35	67	3	finally
/*     */     //   68	128	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void addActivation(Activation paramActivation, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 39	jess/Agenda:m_evalSalience	I
/*     */     //   17: ifeq +8 -> 25
/*     */     //   20: aload_1
/*     */     //   21: aload_2
/*     */     //   22: invokevirtual 166	jess/Activation:evalSalience	(Ljess/Rete;)V
/*     */     //   25: aload_0
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual 171	jess/Activation:getModule	()Ljava/lang/String;
/*     */     //   30: invokevirtual 127	jess/Agenda:getQueue	(Ljava/lang/Object;)Ljess/HeapPriorityQueue;
/*     */     //   33: aload_1
/*     */     //   34: invokevirtual 174	jess/HeapPriorityQueue:push	(Ljess/Activation;)V
/*     */     //   37: aload_1
/*     */     //   38: invokevirtual 177	jess/Activation:getAutoFocus	()Z
/*     */     //   41: ifeq +12 -> 53
/*     */     //   44: aload_0
/*     */     //   45: aload_1
/*     */     //   46: invokevirtual 171	jess/Activation:getModule	()Ljava/lang/String;
/*     */     //   49: aload_2
/*     */     //   50: invokevirtual 181	jess/Agenda:setFocus	(Ljava/lang/String;Ljess/Rete;)V
/*     */     //   53: aload_0
/*     */     //   54: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   57: invokevirtual 184	java/lang/Object:notifyAll	()V
/*     */     //   60: aload_3
/*     */     //   61: monitorexit
/*     */     //   62: return
/*     */     // Line number table:
/*     */     //   Java source line #111	-> byte code offset #0
/*     */     //   Java source line #112	-> byte code offset #13
/*     */     //   Java source line #113	-> byte code offset #20
/*     */     //   Java source line #115	-> byte code offset #25
/*     */     //   Java source line #117	-> byte code offset #37
/*     */     //   Java source line #118	-> byte code offset #44
/*     */     //   Java source line #121	-> byte code offset #53
/*     */     //   Java source line #123	-> byte code offset #62
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	63	0	this	Agenda
/*     */     //   0	63	1	paramActivation	Activation
/*     */     //   0	63	2	paramRete	Rete
/*     */     //   3	58	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	62	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void waitForActivations()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_1
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   10: dup
/*     */     //   11: astore_1
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual 151	jess/Agenda:getQueue	()Ljess/HeapPriorityQueue;
/*     */     //   17: invokevirtual 188	jess/HeapPriorityQueue:isEmpty	()Z
/*     */     //   20: ifeq +10 -> 30
/*     */     //   23: aload_0
/*     */     //   24: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   27: invokevirtual 191	java/lang/Object:wait	()V
/*     */     //   30: aload_1
/*     */     //   31: monitorexit
/*     */     //   32: goto +4 -> 36
/*     */     //   35: astore_1
/*     */     //   36: return
/*     */     // Line number table:
/*     */     //   Java source line #126	-> byte code offset #0
/*     */     //   Java source line #127	-> byte code offset #0
/*     */     //   Java source line #128	-> byte code offset #13
/*     */     //   Java source line #129	-> byte code offset #23
/*     */     //   Java source line #133	-> byte code offset #36
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	37	0	this	Agenda
/*     */     //   3	28	1	Ljava/lang/Object;	Object
/*     */     //   35	1	1	localInterruptedException	InterruptedException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	32	3	finally
/*     */     //   0	32	35	java/lang/InterruptedException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   String setStrategy(Strategy paramStrategy, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore_3
/*     */     //   2: aload_0
/*     */     //   3: getfield 45	jess/Agenda:m_modules	Ljava/util/HashMap;
/*     */     //   6: invokevirtual 49	java/util/HashMap:values	()Ljava/util/Collection;
/*     */     //   9: invokeinterface 55 1 0
/*     */     //   14: astore 4
/*     */     //   16: goto +97 -> 113
/*     */     //   19: aload 4
/*     */     //   21: invokeinterface 61 1 0
/*     */     //   26: checkcast 64	jess/Defmodule
/*     */     //   29: invokevirtual 115	jess/Defmodule:getQueue	()Ljess/HeapPriorityQueue;
/*     */     //   32: astore 5
/*     */     //   34: goto +7 -> 41
/*     */     //   37: aload 6
/*     */     //   39: monitorexit
/*     */     //   40: athrow
/*     */     //   41: aload 5
/*     */     //   43: dup
/*     */     //   44: astore 6
/*     */     //   46: monitorenter
/*     */     //   47: aload 5
/*     */     //   49: invokevirtual 152	jess/HeapPriorityQueue:iterator	()Ljava/util/Iterator;
/*     */     //   52: astore 9
/*     */     //   54: aload 5
/*     */     //   56: invokevirtual 198	jess/HeapPriorityQueue:clear	()V
/*     */     //   59: aload 5
/*     */     //   61: aload_1
/*     */     //   62: invokevirtual 201	jess/HeapPriorityQueue:setStrategy	(Ljess/Strategy;)Ljess/Strategy;
/*     */     //   65: invokeinterface 204 1 0
/*     */     //   70: astore_3
/*     */     //   71: goto +29 -> 100
/*     */     //   74: aload 9
/*     */     //   76: invokeinterface 61 1 0
/*     */     //   81: checkcast 167	jess/Activation
/*     */     //   84: astore 10
/*     */     //   86: aload 10
/*     */     //   88: invokevirtual 209	jess/Activation:isInactive	()Z
/*     */     //   91: ifne +9 -> 100
/*     */     //   94: aload_2
/*     */     //   95: aload 10
/*     */     //   97: invokevirtual 211	jess/Rete:addActivation	(Ljess/Activation;)V
/*     */     //   100: aload 9
/*     */     //   102: invokeinterface 72 1 0
/*     */     //   107: ifne -33 -> 74
/*     */     //   110: aload 6
/*     */     //   112: monitorexit
/*     */     //   113: aload 4
/*     */     //   115: invokeinterface 72 1 0
/*     */     //   120: ifne -101 -> 19
/*     */     //   123: aload_0
/*     */     //   124: aload_1
/*     */     //   125: putfield 99	jess/Agenda:m_strategy	Ljess/Strategy;
/*     */     //   128: aload_3
/*     */     //   129: areturn
/*     */     // Line number table:
/*     */     //   Java source line #140	-> byte code offset #0
/*     */     //   Java source line #141	-> byte code offset #2
/*     */     //   Java source line #141	-> byte code offset #2
/*     */     //   Java source line #144	-> byte code offset #19
/*     */     //   Java source line #145	-> byte code offset #34
/*     */     //   Java source line #146	-> byte code offset #47
/*     */     //   Java source line #147	-> byte code offset #54
/*     */     //   Java source line #148	-> byte code offset #59
/*     */     //   Java source line #149	-> byte code offset #71
/*     */     //   Java source line #150	-> byte code offset #74
/*     */     //   Java source line #151	-> byte code offset #86
/*     */     //   Java source line #152	-> byte code offset #94
/*     */     //   Java source line #149	-> byte code offset #100
/*     */     //   Java source line #142	-> byte code offset #113
/*     */     //   Java source line #156	-> byte code offset #123
/*     */     //   Java source line #157	-> byte code offset #128
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	130	0	this	Agenda
/*     */     //   0	130	1	paramStrategy	Strategy
/*     */     //   0	130	2	paramRete	Rete
/*     */     //   1	128	3	str	String
/*     */     //   14	100	4	localIterator1	java.util.Iterator
/*     */     //   32	28	5	localHeapPriorityQueue	HeapPriorityQueue
/*     */     //   37	74	6	Ljava/lang/Object;	Object
/*     */     //   52	49	9	localIterator2	java.util.Iterator
/*     */     //   84	12	10	localActivation	Activation
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	40	37	finally
/*     */     //   47	113	37	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   void halt()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iconst_1
/*     */     //   2: putfield 214	jess/Agenda:m_halt	Z
/*     */     //   5: goto +6 -> 11
/*     */     //   8: aload_1
/*     */     //   9: monitorexit
/*     */     //   10: athrow
/*     */     //   11: aload_0
/*     */     //   12: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   15: dup
/*     */     //   16: astore_1
/*     */     //   17: monitorenter
/*     */     //   18: aload_0
/*     */     //   19: getfield 106	jess/Agenda:m_activationSemaphore	Ljava/lang/Object;
/*     */     //   22: invokevirtual 184	java/lang/Object:notifyAll	()V
/*     */     //   25: aload_1
/*     */     //   26: monitorexit
/*     */     //   27: return
/*     */     // Line number table:
/*     */     //   Java source line #161	-> byte code offset #0
/*     */     //   Java source line #162	-> byte code offset #5
/*     */     //   Java source line #163	-> byte code offset #18
/*     */     //   Java source line #165	-> byte code offset #27
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	28	0	this	Agenda
/*     */     //   8	18	1	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	10	8	finally
/*     */     //   18	27	8	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Agenda.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */