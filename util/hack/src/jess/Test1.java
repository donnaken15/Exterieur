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
/*     */ public final class Test1
/*     */   implements TestBase, Serializable, Visitable, Cloneable
/*     */ {
/*     */   int m_test;
/*     */   int m_subIdx;
/*     */   Value m_slotValue;
/*     */   int m_conjunction;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  32 */     this.m_conjunction = 1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Test1(int paramInt1, int paramInt2, Value paramValue, int paramInt3)
/*     */     throws JessException
/*     */   {
/*  44 */     this(paramInt1, paramInt2, paramValue);
/*  45 */     this.m_conjunction = paramInt3;
/*     */   }
/*     */   
/*     */   Test1(int paramInt1, int paramInt2, Value paramValue) throws JessException {
/*  49 */     jdMethod_this();
/*  50 */     this.m_test = paramInt1;
/*  51 */     this.m_subIdx = paramInt2;
/*  52 */     this.m_slotValue = paramValue;
/*     */   }
/*     */   
/*     */   Test1(Test1 paramTest1, Value paramValue) throws JessException {
/*  56 */     jdMethod_this();
/*  57 */     this.m_test = paramTest1.m_test;
/*  58 */     this.m_subIdx = paramTest1.m_subIdx;
/*  59 */     this.m_conjunction = paramTest1.m_conjunction;
/*  60 */     this.m_slotValue = paramValue;
/*     */   }
/*     */   
/*     */   public final Object clone()
/*     */   {
/*     */     try {
/*  66 */       Test1 localTest1 = (Test1)super.clone();
/*  67 */       if ((localTest1.m_slotValue instanceof FuncallValue)) {
/*  68 */         Funcall localFuncall = this.m_slotValue.funcallValue(null);
/*  69 */         localFuncall = (Funcall)localFuncall.clone();
/*  70 */         localTest1.m_slotValue = new FuncallValue(localFuncall);
/*     */       }
/*  72 */       return localTest1;
/*     */     } catch (CloneNotSupportedException localCloneNotSupportedException) {
/*  74 */       return null;
/*     */     } catch (JessException localJessException) {}
/*  76 */     return null;
/*     */   }
/*     */   
/*     */ 
/*  80 */   public final int getTest() { return this.m_test; }
/*  81 */   public final Value getValue() { return this.m_slotValue; }
/*  82 */   public final int getMultiSlotIndex() { return this.m_subIdx; }
/*  83 */   public final int getConjunction() { return this.m_conjunction; }
/*     */   
/*     */   public final boolean doTest(Context paramContext)
/*     */     throws JessException
/*     */   {
/*  88 */     boolean bool = this.m_slotValue.resolveValue(paramContext).equals(Funcall.FALSE);
/*     */     
/*  90 */     switch (this.m_test) {
/*     */     case 0: 
/*  92 */       if (bool)
/*  93 */         return false;
/*  94 */       break;
/*     */     
/*     */     case 1: 
/*  97 */       if (!bool) {
/*  98 */         return false;
/*     */       }
/*     */       break;
/*     */     }
/* 102 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public final boolean equals(Object paramObject)
/*     */   {
/* 108 */     if (!(paramObject instanceof Test1)) {
/* 109 */       return false;
/*     */     }
/* 111 */     Test1 localTest1 = (Test1)paramObject;
/* 112 */     if (this.m_test != localTest1.m_test) {
/* 113 */       return false;
/*     */     }
/* 115 */     if (this.m_subIdx != localTest1.m_subIdx) {
/* 116 */       return false;
/*     */     }
/* 118 */     if (this.m_conjunction != localTest1.m_conjunction) {
/* 119 */       return false;
/*     */     }
/* 121 */     return this.m_slotValue.equals(localTest1.m_slotValue);
/*     */   }
/*     */   
/*     */   public final Object accept(Visitor paramVisitor) {
/* 125 */     return paramVisitor.visitTest1(this);
/*     */   }
/*     */   
/*     */   public final String toString() {
/* 129 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 130 */     localStringBuffer.append("[Test1: test=");
/* 131 */     localStringBuffer.append(this.m_test == 1 ? "NEQ" : "EQ");
/* 132 */     localStringBuffer.append(";sub_idx=");
/* 133 */     localStringBuffer.append(this.m_subIdx);
/* 134 */     localStringBuffer.append(";slot_value=");
/* 135 */     localStringBuffer.append(this.m_slotValue);
/* 136 */     localStringBuffer.append(";conjunction=");
/* 137 */     localStringBuffer.append(this.m_conjunction);
/* 138 */     localStringBuffer.append("]");
/*     */     
/* 140 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Test1.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */