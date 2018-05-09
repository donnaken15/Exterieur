/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class RxnDeciderMiscWME extends WME
/*    */ {
/*    */   private int objectFreebieCtr;
/*    */   private int satelliteFreebieCtr;
/*    */   private boolean okayToPushTooFar;
/*    */   
/*    */   public RxnDeciderMiscWME()
/*    */   {
/* 13 */     this.objectFreebieCtr = 0;
/* 14 */     this.satelliteFreebieCtr = 0;
/* 15 */     this.okayToPushTooFar = false;
/*    */   }
/*    */   
/* 18 */   public synchronized int getObjectFreebieCtr() { return this.objectFreebieCtr; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getSatelliteFreebieCtr()
/*    */   {
/* 29 */     return this.satelliteFreebieCtr;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized boolean getOkayToPushTooFar()
/*    */   {
/* 40 */     return this.okayToPushTooFar;
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setObjectFreebieCtr(int paramInt)
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
/*    */     //   11: getfield 15	facade/characters/wmedef/RxnDeciderMiscWME:objectFreebieCtr	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 15	facade/characters/wmedef/RxnDeciderMiscWME:objectFreebieCtr	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 21	facade/characters/wmedef/RxnDeciderMiscWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 22
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 26	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #21	-> byte code offset #0
/*    */     //   Java source line #22	-> byte code offset #0
/*    */     //   Java source line #23	-> byte code offset #10
/*    */     //   Java source line #24	-> byte code offset #15
/*    */     //   Java source line #26	-> byte code offset #22
/*    */     //   Java source line #27	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	RxnDeciderMiscWME
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
/*    */   public void setSatelliteFreebieCtr(int paramInt)
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
/*    */     //   11: getfield 31	facade/characters/wmedef/RxnDeciderMiscWME:satelliteFreebieCtr	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 31	facade/characters/wmedef/RxnDeciderMiscWME:satelliteFreebieCtr	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 21	facade/characters/wmedef/RxnDeciderMiscWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 33
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 26	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #32	-> byte code offset #0
/*    */     //   Java source line #33	-> byte code offset #0
/*    */     //   Java source line #34	-> byte code offset #10
/*    */     //   Java source line #35	-> byte code offset #15
/*    */     //   Java source line #37	-> byte code offset #22
/*    */     //   Java source line #38	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	RxnDeciderMiscWME
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
/*    */   public void setOkayToPushTooFar(boolean paramBoolean)
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
/*    */     //   11: getfield 37	facade/characters/wmedef/RxnDeciderMiscWME:okayToPushTooFar	Z
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 37	facade/characters/wmedef/RxnDeciderMiscWME:okayToPushTooFar	Z
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 21	facade/characters/wmedef/RxnDeciderMiscWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 40
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 43	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #43	-> byte code offset #0
/*    */     //   Java source line #44	-> byte code offset #0
/*    */     //   Java source line #45	-> byte code offset #10
/*    */     //   Java source line #46	-> byte code offset #15
/*    */     //   Java source line #48	-> byte code offset #22
/*    */     //   Java source line #49	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	RxnDeciderMiscWME
/*    */     //   0	34	1	paramBoolean	boolean
/*    */     //   14	15	2	bool	boolean
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\RxnDeciderMiscWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */