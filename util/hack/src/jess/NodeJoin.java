/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import jess.factory.Factory;
/*     */ 
/*     */ 
/*     */ 
/*     */ class NodeJoin
/*     */   extends Node
/*     */   implements Serializable
/*     */ {
/*     */   private static Accelerator m_accelerator;
/*     */   private static boolean m_acceleratorChecked;
/*     */   int m_nTests;
/*     */   TestBase[] m_tests;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  19 */     this.m_nTests = 0;
/*  20 */     this.m_tests = new TestBase[2];
/*     */   }
/*     */   
/*     */   NodeJoin()
/*     */   {
/*  25 */     jdMethod_this();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void addTest(int paramInt1, int paramInt2, Value paramValue)
/*     */     throws JessException
/*     */   {
/*  34 */     Object localObject = null;
/*     */     
/*  36 */     Funcall localFuncall = paramValue.funcallValue(null);
/*     */     
/*  38 */     loadAccelerator();
/*     */     
/*     */ 
/*  41 */     if (m_accelerator != null) {
/*  42 */       localObject = m_accelerator.speedup(localFuncall);
/*     */     }
/*     */     
/*  45 */     if (localObject == null) {
/*  46 */       localObject = new Test1(paramInt1, paramInt2, paramValue);
/*     */     }
/*     */     
/*  49 */     addTest((TestBase)localObject);
/*     */   }
/*     */   
/*     */   void addTest(TestBase paramTestBase) {
/*  53 */     if (this.m_nTests == this.m_tests.length) {
/*  54 */       TestBase[] arrayOfTestBase = new TestBase[this.m_nTests * 2];
/*  55 */       System.arraycopy(this.m_tests, 0, arrayOfTestBase, 0, this.m_nTests);
/*  56 */       this.m_tests = arrayOfTestBase;
/*     */     }
/*     */     
/*  59 */     this.m_tests[(this.m_nTests++)] = paramTestBase;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void addTest(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */     throws JessException
/*     */   {
/*  69 */     throw new JessException("NodeJoin:addtest", "Can't add Test2s to this class", "");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  81 */     if (this == paramObject) {
/*  82 */       return true;
/*     */     }
/*  84 */     if (getClass() != paramObject.getClass()) {
/*  85 */       return false;
/*     */     }
/*  87 */     NodeJoin localNodeJoin = (NodeJoin)paramObject;
/*     */     
/*  89 */     if (((localNodeJoin instanceof NodeNot2)) || ((localNodeJoin instanceof NodeNot2Single))) {
/*  90 */       return false;
/*     */     }
/*  92 */     if (localNodeJoin.m_nTests != this.m_nTests) {
/*  93 */       return false;
/*     */     }
/*     */     
/*  96 */     for (int i = 0; i < this.m_nTests; i++) {
/*  97 */       TestBase localTestBase = this.m_tests[i];
/*  98 */       int j = 0;
/*  99 */       while (!localTestBase.equals(localNodeJoin.m_tests[j]))
/*     */       {
/*  98 */         j++; if (j >= this.m_nTests)
/*     */         {
/*     */ 
/*     */ 
/* 102 */           return false; }
/*     */       } }
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   void callNodeLeft(Token paramToken, Context paramContext) throws JessException {
/* 108 */     broadcastEvent(32768, paramToken);
/* 109 */     if (paramToken.m_tag == 3) {
/* 110 */       passAlong(paramToken, paramContext);
/* 111 */       return;
/*     */     }
/*     */     
/* 114 */     int i = this.m_nTests;
/*     */     
/*     */     boolean bool;
/* 117 */     if ((paramToken.m_tag == 1) || (i == 0)) {
/* 118 */       bool = true;
/*     */     } else {
/* 120 */       bool = runTests(paramToken, i, paramContext);
/* 121 */       paramToken = paramToken.prepare(bool);
/*     */     }
/*     */     
/* 124 */     if (bool) {
/* 125 */       paramToken = Rete.getFactory().newToken(paramToken, Fact.getNullFact());
/* 126 */       paramToken.updateTime(paramContext.getEngine());
/* 127 */       passAlong(paramToken, paramContext);
/*     */     }
/*     */   }
/*     */   
/*     */   boolean runTests(Token paramToken, int paramInt, Context paramContext) throws JessException {
/*     */     try {
/* 133 */       paramContext.setToken(paramToken);
/*     */       
/* 135 */       for (int i = 0; i < paramInt; i++) {
/* 136 */         if (!this.m_tests[i].doTest(paramContext))
/* 137 */           return false;
/*     */       }
/* 139 */       return true;
/*     */     } catch (JessException localJessException) {
/* 141 */       localJessException.addContext("'test' CE");
/* 142 */       throw localJessException;
/*     */     }
/*     */   }
/*     */   
/*     */   void loadAccelerator() throws JessException
/*     */   {
/* 148 */     if (!m_acceleratorChecked) {
/* 149 */       m_acceleratorChecked = true;
/*     */       String str;
/* 151 */       if ((str = RU.getProperty("SPEEDUP")) != null) {
/*     */         try {
/* 153 */           m_accelerator = (Accelerator)Class.forName(str).newInstance();
/*     */         }
/*     */         catch (Exception localException) {
/* 156 */           throw new JessException("NodeJoin.addTest", "Can't load Accelerator class " + str, localException.getMessage());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void passAlong(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 170 */     Node[] arrayOfNode = this.m_succ;
/* 171 */     for (int i = 0; i < this.m_nSucc; i++) {
/* 172 */       Node localNode = arrayOfNode[i];
/* 173 */       localNode.callNodeLeft(paramToken, paramContext);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 182 */     StringBuffer localStringBuffer = new StringBuffer(256);
/* 183 */     localStringBuffer.append("[NodeJoin ntests=");
/* 184 */     localStringBuffer.append(this.m_nTests);
/* 185 */     localStringBuffer.append(" ");
/* 186 */     for (int i = 0; i < this.m_nTests; i++) {
/* 187 */       localStringBuffer.append(this.m_tests[i].toString());
/* 188 */       localStringBuffer.append(" ");
/*     */     }
/* 190 */     localStringBuffer.append(";usecount = ");
/* 191 */     localStringBuffer.append(this.m_usecount);
/* 192 */     localStringBuffer.append("]");
/* 193 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   String getCompilationTraceToken() {
/* 197 */     return "2";
/*     */   }
/*     */   
/*     */   void complete()
/*     */     throws JessException
/*     */   {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\NodeJoin.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */