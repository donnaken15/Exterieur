/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ 
/*    */ 
/*    */ public class DAReactionInfoWME
/*    */   extends ReactionInfoWME
/*    */ {
/*    */   private int daID;
/*    */   private int daAddressee;
/*    */   
/*    */   public DAReactionInfoWME(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*    */   {
/* 14 */     super(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/* 15 */     this.daID = paramInt8;
/* 16 */     this.daAddressee = paramInt9;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 21 */   public synchronized String formatDaID() { return PrintUtilities.daType_EnumToString(getDaID()); }
/*    */   
/* 23 */   public synchronized int getDaID() { return this.daID; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getDaAddressee()
/*    */   {
/* 34 */     return this.daAddressee;
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setDaID(int paramInt)
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
/*    */     //   11: getfield 23	facade/characters/wmedef/DAReactionInfoWME:daID	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 23	facade/characters/wmedef/DAReactionInfoWME:daID	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 29	facade/characters/wmedef/DAReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 30
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 34	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #26	-> byte code offset #0
/*    */     //   Java source line #27	-> byte code offset #0
/*    */     //   Java source line #28	-> byte code offset #10
/*    */     //   Java source line #29	-> byte code offset #15
/*    */     //   Java source line #31	-> byte code offset #22
/*    */     //   Java source line #32	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	DAReactionInfoWME
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
/*    */   public void setDaAddressee(int paramInt)
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
/*    */     //   11: getfield 39	facade/characters/wmedef/DAReactionInfoWME:daAddressee	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 39	facade/characters/wmedef/DAReactionInfoWME:daAddressee	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 29	facade/characters/wmedef/DAReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 41
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 34	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #37	-> byte code offset #0
/*    */     //   Java source line #38	-> byte code offset #0
/*    */     //   Java source line #39	-> byte code offset #10
/*    */     //   Java source line #40	-> byte code offset #15
/*    */     //   Java source line #42	-> byte code offset #22
/*    */     //   Java source line #43	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	DAReactionInfoWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public DAReactionInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAReactionInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */