/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import wm.WME;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ReactionInfoWME
/*    */   extends WME
/*    */ {
/*    */   private int rxnType;
/*    */   private boolean available;
/*    */   private int respondingCharID;
/*    */   private int responderAttitude;
/*    */   private int storyPart;
/*    */   private int rxnCategoryLevel;
/*    */   private int affinityLowerBound;
/*    */   private int affinityUpperBound;
/*    */   
/*    */   public ReactionInfoWME(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 22 */     this.rxnType = paramInt1;
/* 23 */     this.available = paramBoolean;
/* 24 */     this.respondingCharID = paramInt2;
/* 25 */     this.responderAttitude = paramInt3;
/* 26 */     this.storyPart = paramInt4;
/* 27 */     this.rxnCategoryLevel = paramInt5;
/* 28 */     this.affinityLowerBound = paramInt6;
/* 29 */     this.affinityUpperBound = paramInt7;
/*    */   }
/*    */   
/*    */   public synchronized String formatRxnType()
/*    */   {
/* 34 */     return PrintUtilities.rxnType_EnumToString(getRxnType());
/*    */   }
/*    */   
/* 37 */   public synchronized String formatRespondingCharID() { return PrintUtilities.spriteID_EnumToString(getRespondingCharID()); }
/*    */   
/* 39 */   public synchronized String formatAffinityLowerBound() { return PrintUtilities.affinity_EnumToString(getAffinityLowerBound()); }
/* 40 */   public synchronized String formatAffinityUpperBound() { return PrintUtilities.affinity_EnumToString(getAffinityUpperBound()); }
/*    */   
/* 42 */   public synchronized int getRxnType() { return this.rxnType; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized boolean getAvailable()
/*    */   {
/* 53 */     return this.available;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getRespondingCharID()
/*    */   {
/* 64 */     return this.respondingCharID;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized int getResponderAttitude()
/*    */   {
/* 75 */     return this.responderAttitude;
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
/* 86 */   public synchronized int getStoryPart() { return this.storyPart; }
/* 87 */   public synchronized int getRxnCategoryLevel() { return this.rxnCategoryLevel; }
/* 88 */   public synchronized int getAffinityLowerBound() { return this.affinityLowerBound; }
/* 89 */   public synchronized int getAffinityUpperBound() { return this.affinityUpperBound; }
/*    */   
/* 91 */   public synchronized void setStoryPart(int paramInt) { this.storyPart = paramInt; }
/* 92 */   public synchronized void setRxnCategoryLevel(int paramInt) { this.rxnCategoryLevel = paramInt; }
/* 93 */   public synchronized void setAffinityLowerBound(int paramInt) { this.affinityLowerBound = paramInt; }
/* 94 */   public synchronized void setAffinityUpperBound(int paramInt) { this.affinityUpperBound = paramInt; }
/*    */   
/*    */   /* Error */
/*    */   public void setRxnType(int paramInt)
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
/*    */     //   11: getfield 48	facade/characters/wmedef/ReactionInfoWME:rxnType	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 48	facade/characters/wmedef/ReactionInfoWME:rxnType	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 54	facade/characters/wmedef/ReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 55
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 59	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #45	-> byte code offset #0
/*    */     //   Java source line #46	-> byte code offset #0
/*    */     //   Java source line #47	-> byte code offset #10
/*    */     //   Java source line #48	-> byte code offset #15
/*    */     //   Java source line #50	-> byte code offset #22
/*    */     //   Java source line #51	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	ReactionInfoWME
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
/*    */   public void setAvailable(boolean paramBoolean)
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
/*    */     //   11: getfield 65	facade/characters/wmedef/ReactionInfoWME:available	Z
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 65	facade/characters/wmedef/ReactionInfoWME:available	Z
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 54	facade/characters/wmedef/ReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 68
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 71	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #56	-> byte code offset #0
/*    */     //   Java source line #57	-> byte code offset #0
/*    */     //   Java source line #58	-> byte code offset #10
/*    */     //   Java source line #59	-> byte code offset #15
/*    */     //   Java source line #61	-> byte code offset #22
/*    */     //   Java source line #62	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	ReactionInfoWME
/*    */     //   0	34	1	paramBoolean	boolean
/*    */     //   14	15	2	bool	boolean
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public void setRespondingCharID(int paramInt)
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
/*    */     //   11: getfield 73	facade/characters/wmedef/ReactionInfoWME:respondingCharID	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 73	facade/characters/wmedef/ReactionInfoWME:respondingCharID	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 54	facade/characters/wmedef/ReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 75
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 59	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #67	-> byte code offset #0
/*    */     //   Java source line #68	-> byte code offset #0
/*    */     //   Java source line #69	-> byte code offset #10
/*    */     //   Java source line #70	-> byte code offset #15
/*    */     //   Java source line #72	-> byte code offset #22
/*    */     //   Java source line #73	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	ReactionInfoWME
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
/*    */   public void setResponderAttitude(int paramInt)
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
/*    */     //   11: getfield 78	facade/characters/wmedef/ReactionInfoWME:responderAttitude	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 78	facade/characters/wmedef/ReactionInfoWME:responderAttitude	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 54	facade/characters/wmedef/ReactionInfoWME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 80
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 59	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #78	-> byte code offset #0
/*    */     //   Java source line #79	-> byte code offset #0
/*    */     //   Java source line #80	-> byte code offset #10
/*    */     //   Java source line #81	-> byte code offset #15
/*    */     //   Java source line #83	-> byte code offset #22
/*    */     //   Java source line #84	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	ReactionInfoWME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */   
/*    */   public ReactionInfoWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\ReactionInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */