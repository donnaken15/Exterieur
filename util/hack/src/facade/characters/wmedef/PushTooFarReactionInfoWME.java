/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import dramaman.runtime.DramaManagerConstants;
/*    */ 
/*    */ 
/*    */ public class PushTooFarReactionInfoWME
/*    */   extends ReactionInfoWME
/*    */   implements DramaManagerConstants
/*    */ {
/*    */   int rxnCategory;
/*    */   int origSatlOrObjParam;
/*    */   
/*    */   public PushTooFarReactionInfoWME(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 15 */     super(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, 3, -2, 2);
/* 16 */     this.rxnCategory = paramInt5;
/* 17 */     this.origSatlOrObjParam = -1;
/*    */   }
/*    */   
/*    */   public synchronized int getRxnCategory()
/*    */   {
/* 22 */     return this.rxnCategory;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getOrigSatlOrObjParam()
/*    */   {
/* 33 */     return this.origSatlOrObjParam;
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
/*    */     //   11: getfield 15	facade/characters/wmedef/PushTooFarReactionInfoWME:rxnCategory	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 15	facade/characters/wmedef/PushTooFarReactionInfoWME:rxnCategory	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 21	facade/characters/wmedef/PushTooFarReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 22
/*    */     //   28: new 23	java/lang/Integer
/*    */     //   31: dup
/*    */     //   32: iload_2
/*    */     //   33: invokespecial 27	java/lang/Integer:<init>	(I)V
/*    */     //   36: new 23	java/lang/Integer
/*    */     //   39: dup
/*    */     //   40: iload_1
/*    */     //   41: invokespecial 27	java/lang/Integer:<init>	(I)V
/*    */     //   44: invokevirtual 31	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   47: return
/*    */     // Line number table:
/*    */     //   Java source line #25	-> byte code offset #0
/*    */     //   Java source line #26	-> byte code offset #0
/*    */     //   Java source line #27	-> byte code offset #10
/*    */     //   Java source line #28	-> byte code offset #15
/*    */     //   Java source line #30	-> byte code offset #22
/*    */     //   Java source line #31	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	48	0	this	PushTooFarReactionInfoWME
/*    */     //   0	48	1	paramInt	int
/*    */     //   14	19	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setOrigSatlOrObjParam(int paramInt)
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
/*    */     //   11: getfield 36	facade/characters/wmedef/PushTooFarReactionInfoWME:origSatlOrObjParam	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 36	facade/characters/wmedef/PushTooFarReactionInfoWME:origSatlOrObjParam	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 21	facade/characters/wmedef/PushTooFarReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 38
/*    */     //   28: new 23	java/lang/Integer
/*    */     //   31: dup
/*    */     //   32: iload_2
/*    */     //   33: invokespecial 27	java/lang/Integer:<init>	(I)V
/*    */     //   36: new 23	java/lang/Integer
/*    */     //   39: dup
/*    */     //   40: iload_1
/*    */     //   41: invokespecial 27	java/lang/Integer:<init>	(I)V
/*    */     //   44: invokevirtual 31	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   47: return
/*    */     // Line number table:
/*    */     //   Java source line #36	-> byte code offset #0
/*    */     //   Java source line #37	-> byte code offset #0
/*    */     //   Java source line #38	-> byte code offset #10
/*    */     //   Java source line #39	-> byte code offset #15
/*    */     //   Java source line #41	-> byte code offset #22
/*    */     //   Java source line #42	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	48	0	this	PushTooFarReactionInfoWME
/*    */     //   0	48	1	paramInt	int
/*    */     //   14	19	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public PushTooFarReactionInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PushTooFarReactionInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */