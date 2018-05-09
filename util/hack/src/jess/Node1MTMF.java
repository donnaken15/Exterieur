/*     */ package jess;
/*     */ 
/*     */ import jess.factory.Factory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Node1MTMF
/*     */   extends Node1
/*     */ {
/*     */   private int m_idx;
/*     */   private int m_slotSize;
/*     */   private int m_nMultifields;
/*     */   private boolean[] m_multiIndexes;
/*     */   
/*     */   Node1MTMF(int paramInt, boolean[] paramArrayOfBoolean)
/*     */   {
/*  18 */     this.m_idx = paramInt;
/*  19 */     this.m_slotSize = paramArrayOfBoolean.length;
/*  20 */     this.m_multiIndexes = paramArrayOfBoolean;
/*  21 */     for (int i = 0; i < this.m_slotSize; i++) {
/*  22 */       if (this.m_multiIndexes[i] != 0)
/*     */       {
/*  24 */         this.m_nMultifields += 1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void callNodeRight(Token paramToken, Context paramContext) throws JessException {
/*  30 */     if (processClearCommand(paramToken, paramContext)) {
/*  31 */       return;
/*     */     }
/*     */     
/*  34 */     ValueVector localValueVector = paramToken.fact(0).get(this.m_idx).listValue(null);
/*     */     
/*     */ 
/*  37 */     int i = localValueVector.size();
/*     */     
/*     */ 
/*  40 */     int j = i - this.m_slotSize + this.m_nMultifields;
/*     */     
/*     */ 
/*  43 */     if (j < 0) {
/*  44 */       return;
/*     */     }
/*  46 */     partition(paramToken, j, this.m_nMultifields, paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void partition(Token paramToken, int paramInt1, int paramInt2, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  59 */     int[] arrayOfInt = new int[paramInt2];
/*     */     
/*     */     do
/*     */     {
/*  63 */       if (testForSum(arrayOfInt, paramInt1, paramInt2))
/*  64 */         process(paramToken, arrayOfInt, paramContext);
/*  65 */       addOne(arrayOfInt, paramInt1, paramInt2);
/*     */     }
/*  67 */     while (arrayOfInt[(paramInt2 - 1)] <= paramInt1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void addOne(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  75 */     paramArrayOfInt[0] += 1;
/*  76 */     for (int i = 0; i < paramInt2 - 1; i++)
/*     */     {
/*  78 */       if (paramArrayOfInt[i] > paramInt1)
/*     */       {
/*  80 */         paramArrayOfInt[i] = 0;
/*  81 */         paramArrayOfInt[(i + 1)] += 1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private final boolean testForSum(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  89 */     int i = 0;
/*  90 */     for (int j = 0; j < paramInt2; j++)
/*  91 */       i += paramArrayOfInt[j];
/*  92 */     if (i == paramInt1) 0; return true;
/*     */   }
/*     */   
/*     */   private final void process(Token paramToken, int[] paramArrayOfInt, Context paramContext)
/*     */     throws JessException
/*     */   {
/*  98 */     Fact localFact = createModifiedFact(paramToken.fact(0), paramToken.fact(0).get(this.m_idx).listValue(null), paramArrayOfInt);
/*     */     
/*     */ 
/* 101 */     paramToken = Rete.getFactory().newToken(localFact, paramToken.m_tag);
/* 102 */     passAlong(paramToken, paramContext);
/*     */   }
/*     */   
/*     */ 
/*     */   private final Fact createModifiedFact(Fact paramFact, ValueVector paramValueVector, int[] paramArrayOfInt)
/*     */     throws JessException
/*     */   {
/* 109 */     Fact localFact = (Fact)paramFact.clone();
/* 110 */     localFact.setIcon(paramFact);
/*     */     
/*     */ 
/* 113 */     ValueVector localValueVector1 = new ValueVector();
/* 114 */     localValueVector1.setLength(this.m_slotSize);
/*     */     
/* 116 */     int i = 0;int j = 0; for (int k = 0; i < this.m_slotSize; i++)
/*     */     {
/* 118 */       if (this.m_multiIndexes[i] == 0) {
/* 119 */         localValueVector1.set(paramValueVector.get(j++), i);
/*     */       }
/*     */       else
/*     */       {
/* 123 */         ValueVector localValueVector2 = new ValueVector();
/* 124 */         int m = paramArrayOfInt[(k++)];
/* 125 */         localValueVector2.setLength(m);
/*     */         
/*     */ 
/* 128 */         for (int n = 0; n < m; n++) {
/* 129 */           localValueVector2.set(paramValueVector.get(j++), n);
/*     */         }
/*     */         
/* 132 */         localValueVector1.set(new Value(localValueVector2, 512), i);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 137 */     localFact.set(new Value(localValueVector1, 512), this.m_idx);
/* 138 */     return localFact;
/*     */   }
/*     */   
/*     */ 
/*     */   public String toString()
/*     */   {
/* 144 */     return "[Split the multislot at index " + this.m_idx + " into " + this.m_slotSize + " pieces]";
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 150 */     if ((paramObject instanceof Node1MTMF))
/*     */     {
/* 152 */       Node1MTMF localNode1MTMF = (Node1MTMF)paramObject;
/* 153 */       if ((this.m_idx != localNode1MTMF.m_idx) || (this.m_slotSize != localNode1MTMF.m_slotSize) || (this.m_nMultifields != localNode1MTMF.m_nMultifields))
/*     */       {
/*     */ 
/* 156 */         return false;
/*     */       }
/* 158 */       for (int i = 0; i < this.m_slotSize; i++) {
/* 159 */         if (this.m_multiIndexes[i] != localNode1MTMF.m_multiIndexes[i]) {
/* 160 */           return false;
/*     */         }
/*     */       }
/*     */       
/* 164 */       return true;
/*     */     }
/*     */     
/* 167 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Node1MTMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */