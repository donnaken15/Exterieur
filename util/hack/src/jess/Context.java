/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
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
/*     */ public class Context
/*     */   implements Serializable
/*     */ {
/*     */   private Hashtable m_variables;
/*     */   private Context m_parent;
/*     */   private boolean m_return;
/*     */   private Value m_retval;
/*     */   private transient Rete m_rete;
/*     */   private LogicalNode m_logicalSupportNode;
/*     */   private Token m_token;
/*     */   private Fact m_fact;
/*     */   private boolean m_inAdvice;
/*     */   
/*  32 */   public final Token getToken() { return this.m_token; }
/*  33 */   final void setToken(Token paramToken) { this.m_token = paramToken; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  41 */   public final Fact getFact() { return this.m_fact; }
/*  42 */   final void setFact(Fact paramFact) { this.m_fact = paramFact; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final LogicalNode getLogicalSupportNode()
/*     */   {
/*  50 */     return this.m_logicalSupportNode;
/*     */   }
/*     */   
/*     */   final void setLogicalSupportNode(LogicalNode paramLogicalNode) {
/*  54 */     this.m_logicalSupportNode = paramLogicalNode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  59 */   boolean getInAdvice() { return this.m_inAdvice; }
/*  60 */   void setInAdvice(boolean paramBoolean) { this.m_inAdvice = paramBoolean; }
/*     */   
/*     */   void setEngine(Rete paramRete) {
/*  63 */     this.m_rete = paramRete;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Context(Context paramContext)
/*     */   {
/*  74 */     this.m_rete = paramContext.m_rete;
/*  75 */     this.m_parent = paramContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   Context(Rete paramRete)
/*     */   {
/*  82 */     this.m_rete = paramRete;
/*  83 */     this.m_parent = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Context(Context paramContext, Rete paramRete)
/*     */   {
/*  94 */     this.m_rete = paramRete;
/*  95 */     this.m_parent = paramContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void clear()
/*     */   {
/* 102 */     this.m_fact = null;
/* 103 */     this.m_token = null;
/* 104 */     this.m_inAdvice = false;
/* 105 */     this.m_logicalSupportNode = null;
/* 106 */     this.m_return = false;
/* 107 */     this.m_retval = null;
/* 108 */     this.m_variables = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final boolean returning()
/*     */   {
/* 119 */     return this.m_return;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Value setReturnValue(Value paramValue)
/*     */   {
/* 128 */     this.m_return = true;
/* 129 */     this.m_retval = paramValue;
/* 130 */     return paramValue;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Value getReturnValue()
/*     */   {
/* 138 */     return this.m_retval;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public final void clearReturnValue()
/*     */   {
/* 145 */     this.m_return = false;
/* 146 */     this.m_retval = null;
/*     */   }
/*     */   
/*     */   private final int nVariables() {
/* 150 */     if (this.m_variables == null) {
/* 151 */       return 0;
/*     */     }
/* 153 */     return this.m_variables.size();
/*     */   }
/*     */   
/*     */   private final Hashtable getVariables() {
/* 157 */     if (this.m_variables == null) {
/* 158 */       this.m_variables = new Hashtable(10);
/*     */     }
/* 160 */     return this.m_variables;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final Rete getEngine()
/*     */   {
/* 168 */     return this.m_rete;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Context push()
/*     */   {
/* 176 */     return new Context(this);
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
/*     */   private final Hashtable findVariable(String paramString)
/*     */   {
/* 199 */     Context localContext = this;
/* 200 */     while (localContext != null) {
/* 201 */       Hashtable localHashtable = localContext.getVariables();
/* 202 */       Value localValue = (Value)localHashtable.get(paramString);
/* 203 */       if (localValue != null) {
/* 204 */         return localHashtable;
/*     */       }
/* 206 */       localContext = localContext.m_parent;
/*     */     }
/* 208 */     return null;
/*     */   }
/*     */   
/*     */   synchronized void removeNonGlobals() {
/* 212 */     if (this.m_variables == null) {
/* 213 */       return;
/*     */     }
/* 215 */     Hashtable localHashtable = new Hashtable(10);
/* 216 */     for (Enumeration localEnumeration = this.m_variables.keys(); localEnumeration.hasMoreElements();) {
/* 217 */       String str = (String)localEnumeration.nextElement();
/* 218 */       if (this.m_rete.findDefglobal(str) != null)
/* 219 */         localHashtable.put(str, this.m_variables.get(str));
/*     */     }
/* 221 */     this.m_variables = localHashtable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Value getVariable(String paramString)
/*     */     throws JessException
/*     */   {
/* 231 */     Hashtable localHashtable = findVariable(paramString);
/* 232 */     if (localHashtable == null) {
/* 233 */       throw new JessException("Context.getVariable", "No such variable", paramString);
/*     */     }
/* 235 */     return ((Value)localHashtable.get(paramString)).resolveValue(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVariable(String paramString, Value paramValue)
/*     */     throws JessException
/*     */   {
/* 244 */     Hashtable localHashtable = findVariable(paramString);
/* 245 */     if (localHashtable == null)
/* 246 */       localHashtable = getVariables();
/* 247 */     localHashtable.put(paramString, paramValue);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 255 */     StringBuffer localStringBuffer = new StringBuffer();
/* 256 */     localStringBuffer.append("[Context, " + nVariables() + " variables: ");
/* 257 */     for (Enumeration localEnumeration = getVariables().keys(); localEnumeration.hasMoreElements();) {
/* 258 */       Object localObject = localEnumeration.nextElement();
/* 259 */       localStringBuffer.append(localObject + '=' + this.m_variables.get(localObject) + ';');
/*     */     }
/* 261 */     localStringBuffer.append("]");
/* 262 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Context pop()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 90	jess/Context:m_parent	Ljess/Context;
/*     */     //   4: ifnull +45 -> 49
/*     */     //   7: goto +6 -> 13
/*     */     //   10: aload_1
/*     */     //   11: monitorexit
/*     */     //   12: athrow
/*     */     //   13: aload_0
/*     */     //   14: getfield 90	jess/Context:m_parent	Ljess/Context;
/*     */     //   17: dup
/*     */     //   18: astore_1
/*     */     //   19: monitorenter
/*     */     //   20: aload_0
/*     */     //   21: getfield 90	jess/Context:m_parent	Ljess/Context;
/*     */     //   24: aload_0
/*     */     //   25: getfield 57	jess/Context:m_return	Z
/*     */     //   28: putfield 57	jess/Context:m_return	Z
/*     */     //   31: aload_0
/*     */     //   32: getfield 90	jess/Context:m_parent	Ljess/Context;
/*     */     //   35: aload_0
/*     */     //   36: getfield 59	jess/Context:m_retval	Ljess/Value;
/*     */     //   39: putfield 59	jess/Context:m_retval	Ljess/Value;
/*     */     //   42: aload_0
/*     */     //   43: getfield 90	jess/Context:m_parent	Ljess/Context;
/*     */     //   46: aload_1
/*     */     //   47: monitorexit
/*     */     //   48: areturn
/*     */     //   49: aload_0
/*     */     //   50: areturn
/*     */     // Line number table:
/*     */     //   Java source line #187	-> byte code offset #0
/*     */     //   Java source line #188	-> byte code offset #7
/*     */     //   Java source line #189	-> byte code offset #20
/*     */     //   Java source line #190	-> byte code offset #31
/*     */     //   Java source line #191	-> byte code offset #42
/*     */     //   Java source line #195	-> byte code offset #49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	51	0	this	Context
/*     */     //   10	37	1	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	12	10	finally
/*     */     //   20	48	10	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Context.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */