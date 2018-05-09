/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ 
/*    */ public class SatelliteReactionInfoWME
/*    */   extends ReactionInfoWME
/*    */ {
/*    */   private int satelliteTopicID;
/*    */   
/*    */   public SatelliteReactionInfoWME(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 12 */     super(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/* 13 */     this.satelliteTopicID = paramInt8;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public synchronized String formatSatelliteTopicID()
/*    */   {
/* 20 */     return PrintUtilities.daParam1_EnumToString(getSatelliteTopicID());
/*    */   }
/*    */   
/* 23 */   public synchronized int getSatelliteTopicID() { return this.satelliteTopicID; }
/*    */   
/*    */   /* Error */
/*    */   public void setSatelliteTopicID(int paramInt)
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
/*    */     //   11: getfield 22	facade/characters/wmedef/SatelliteReactionInfoWME:satelliteTopicID	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 22	facade/characters/wmedef/SatelliteReactionInfoWME:satelliteTopicID	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 28	facade/characters/wmedef/SatelliteReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 29
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 33	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
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
/*    */     //   0	34	0	this	SatelliteReactionInfoWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public SatelliteReactionInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\SatelliteReactionInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */