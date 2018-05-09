/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class RxnCategoryLevelWME extends WME
/*    */ {
/*    */   private int rxnCategory;
/*    */   private int level;
/*    */   
/*    */   public RxnCategoryLevelWME(int paramInt)
/*    */   {
/* 12 */     this.rxnCategory = paramInt;
/* 13 */     this.level = 1;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getRxnCategory()
/*    */   {
/* 21 */     return this.rxnCategory;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getLevel()
/*    */   {
/* 32 */     return this.level;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void incrementLevel()
/*    */   {
/* 45 */     int i = getLevel();
/* 46 */     if (i <= 2)
/* 47 */       i++;
/* 48 */     setLevel(i);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setRxnCategory(int paramInt)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: goto +6 -> 6
/*    */     //   3: aload_3
/*    */     //   4: monitorexit
/*    */     //   5: athrow
/*    */     //   6: aload_0
/*    */     //   7: dup
/*    */     //   8: astore_3
/*    */     //   9: monitorenter
/*    */     //   10: aload_0
/*    */     //   11: getfield 13	facade/characters/wmedef/RxnCategoryLevelWME:rxnCategory	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 13	facade/characters/wmedef/RxnCategoryLevelWME:rxnCategory	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 19	facade/characters/wmedef/RxnCategoryLevelWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 20
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 24	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #24	-> byte code offset #0
/*    */     //   Java source line #25	-> byte code offset #0
/*    */     //   Java source line #26	-> byte code offset #10
/*    */     //   Java source line #27	-> byte code offset #15
/*    */     //   Java source line #29	-> byte code offset #22
/*    */     //   Java source line #30	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	RxnCategoryLevelWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setLevel(int paramInt)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: goto +6 -> 6
/*    */     //   3: aload_3
/*    */     //   4: monitorexit
/*    */     //   5: athrow
/*    */     //   6: aload_0
/*    */     //   7: dup
/*    */     //   8: astore_3
/*    */     //   9: monitorenter
/*    */     //   10: aload_0
/*    */     //   11: getfield 29	facade/characters/wmedef/RxnCategoryLevelWME:level	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 29	facade/characters/wmedef/RxnCategoryLevelWME:level	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 19	facade/characters/wmedef/RxnCategoryLevelWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 31
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 24	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #35	-> byte code offset #0
/*    */     //   Java source line #36	-> byte code offset #0
/*    */     //   Java source line #37	-> byte code offset #10
/*    */     //   Java source line #38	-> byte code offset #15
/*    */     //   Java source line #40	-> byte code offset #22
/*    */     //   Java source line #41	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	RxnCategoryLevelWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public RxnCategoryLevelWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\RxnCategoryLevelWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */