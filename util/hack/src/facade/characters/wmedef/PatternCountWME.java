/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PatternCountWME extends WME
/*    */ {
/*    */   private int patternID;
/*    */   private int count;
/*    */   
/*    */   public PatternCountWME(int paramInt)
/*    */   {
/* 12 */     this.patternID = paramInt;
/* 13 */     this.count = 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 18 */   public synchronized String formatPatternID() { return facade.util.PrintUtilities.patternID_EnumToString(getPatternID()); }
/*    */   
/* 20 */   public synchronized int getPatternID() { return this.patternID; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getCount()
/*    */   {
/* 31 */     return this.count;
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setPatternID(int paramInt)
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
/*    */     //   11: getfield 23	facade/characters/wmedef/PatternCountWME:patternID	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 23	facade/characters/wmedef/PatternCountWME:patternID	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 29	facade/characters/wmedef/PatternCountWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 30
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 34	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #23	-> byte code offset #0
/*    */     //   Java source line #24	-> byte code offset #0
/*    */     //   Java source line #25	-> byte code offset #10
/*    */     //   Java source line #26	-> byte code offset #15
/*    */     //   Java source line #28	-> byte code offset #22
/*    */     //   Java source line #29	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	PatternCountWME
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
/*    */   public void setCount(int paramInt)
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
/*    */     //   11: getfield 39	facade/characters/wmedef/PatternCountWME:count	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 39	facade/characters/wmedef/PatternCountWME:count	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 29	facade/characters/wmedef/PatternCountWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 41
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 34	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #34	-> byte code offset #0
/*    */     //   Java source line #35	-> byte code offset #0
/*    */     //   Java source line #36	-> byte code offset #10
/*    */     //   Java source line #37	-> byte code offset #15
/*    */     //   Java source line #39	-> byte code offset #22
/*    */     //   Java source line #40	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	PatternCountWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public PatternCountWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PatternCountWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */