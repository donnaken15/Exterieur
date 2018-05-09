/*     */ package jess;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectOutputStream;
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
/*     */ 
/*     */ 
/*     */ public class HeapPriorityQueue
/*     */   implements Serializable
/*     */ {
/*     */   private Activation[] m_queue;
/*     */   private Strategy m_strategy;
/*     */   private int m_size;
/*     */   
/*     */   public HeapPriorityQueue(Strategy paramStrategy)
/*     */   {
/*  26 */     this.m_queue = new Activation[10];
/*  27 */     this.m_strategy = paramStrategy;
/*     */   }
/*     */   
/*     */   private HeapPriorityQueue(HeapPriorityQueue paramHeapPriorityQueue) {
/*  31 */     this.m_queue = ((Activation[])paramHeapPriorityQueue.m_queue.clone());
/*  32 */     this.m_size = paramHeapPriorityQueue.m_size;
/*  33 */     this.m_strategy = paramHeapPriorityQueue.m_strategy;
/*     */   }
/*     */   
/*     */   public Strategy setStrategy(Strategy paramStrategy) {
/*  37 */     Strategy localStrategy = this.m_strategy;
/*  38 */     this.m_strategy = paramStrategy;
/*  39 */     return localStrategy;
/*     */   }
/*     */   
/*     */   public Strategy getStrategy() {
/*  43 */     return this.m_strategy;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*  47 */     if (this.m_size == 0) 0; return true;
/*     */   }
/*     */   
/*     */   public synchronized void remove(Activation paramActivation) {
/*  51 */     for (int i = 1; i <= this.m_size; i++)
/*  52 */       if (this.m_queue[i].equals(paramActivation)) {
/*  53 */         this.m_queue[i] = this.m_queue[this.m_size];
/*  54 */         this.m_queue[this.m_size] = null;
/*  55 */         this.m_size -= 1;
/*  56 */         fixDown(i);
/*  57 */         return;
/*     */       }
/*     */   }
/*     */   
/*     */   public synchronized void push(Activation paramActivation) {
/*  62 */     if (this.m_size == this.m_queue.length - 1) {
/*  63 */       Activation[] arrayOfActivation = new Activation[this.m_size * 2];
/*  64 */       System.arraycopy(this.m_queue, 1, arrayOfActivation, 1, this.m_size);
/*  65 */       this.m_queue = arrayOfActivation;
/*     */     }
/*  67 */     this.m_queue[(++this.m_size)] = paramActivation;
/*  68 */     fixUp(this.m_size);
/*  69 */     notify();
/*     */   }
/*     */   
/*     */   public synchronized Activation pop() {
/*  73 */     if (isEmpty())
/*  74 */       return null;
/*  75 */     Activation localActivation = this.m_queue[1];
/*  76 */     remove(localActivation);
/*  77 */     return localActivation;
/*     */   }
/*     */   
/*     */   public void clear() {
/*  81 */     this.m_queue = new Activation[10];
/*  82 */     this.m_size = 0;
/*     */   }
/*     */   
/*     */   public Iterator iterator() {
/*  86 */     HeapPriorityQueue localHeapPriorityQueue = new HeapPriorityQueue(this);
/*  87 */     ArrayList localArrayList = new ArrayList();
/*  88 */     while (!localHeapPriorityQueue.isEmpty())
/*  89 */       localArrayList.add(localHeapPriorityQueue.pop());
/*  90 */     return localArrayList.iterator();
/*     */   }
/*     */   
/*     */ 
/*     */   private final void fixDown(int paramInt)
/*     */   {
/*  96 */     Activation[] arrayOfActivation = this.m_queue;
/*  97 */     while (2 * paramInt <= this.m_size) {
/*  98 */       int i = 2 * paramInt;
/*  99 */       if ((i < this.m_size) && (this.m_strategy.compare(arrayOfActivation[i], arrayOfActivation[(i + 1)]) > 0))
/* 100 */         i++;
/* 101 */       if (this.m_strategy.compare(arrayOfActivation[paramInt], arrayOfActivation[i]) <= 0)
/*     */         break;
/* 103 */       exch(paramInt, i);
/* 104 */       paramInt = i;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void fixUp(int paramInt)
/*     */   {
/* 110 */     Activation[] arrayOfActivation = this.m_queue;
/* 111 */     while ((paramInt > 1) && (this.m_strategy.compare(arrayOfActivation[(paramInt / 2)], arrayOfActivation[paramInt]) > 0)) {
/* 112 */       int i = paramInt / 2;
/* 113 */       exch(paramInt, i);
/* 114 */       paramInt = i;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void exch(int paramInt1, int paramInt2) {
/* 119 */     Activation[] arrayOfActivation = this.m_queue;
/* 120 */     Activation localActivation = arrayOfActivation[paramInt1];
/* 121 */     arrayOfActivation[paramInt1] = arrayOfActivation[paramInt2];
/* 122 */     arrayOfActivation[paramInt2] = localActivation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void writeObject(ObjectOutputStream paramObjectOutputStream)
/*     */     throws IOException
/*     */   {
/* 131 */     HeapPriorityQueue localHeapPriorityQueue = new HeapPriorityQueue(this.m_strategy);
/* 132 */     while (!isEmpty()) {
/* 133 */       Activation localActivation = pop();
/* 134 */       if (!localActivation.isInactive())
/* 135 */         localHeapPriorityQueue.push(localActivation);
/*     */     }
/* 137 */     this.m_queue = localHeapPriorityQueue.m_queue;
/* 138 */     this.m_size = localHeapPriorityQueue.m_size;
/*     */     
/* 140 */     paramObjectOutputStream.defaultWriteObject();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\HeapPriorityQueue.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */