/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class BeatAAp1WME extends TimeStampedWME
/*    */ {
/*    */   private boolean bVal1;
/*    */   private boolean bVal2;
/*    */   private boolean bVal3;
/*    */   private boolean bVal4;
/*    */   private boolean bVal5;
/*    */   private int subtopic;
/*    */   private int previousSubtopic;
/*    */   private int iVal3;
/*    */   private int iVal4;
/*    */   private int subtopicObject;
/*    */   private float fVal1;
/*    */   private float fVal2;
/*    */   private float fVal3;
/*    */   private float fVal4;
/*    */   private float fVal5;
/*    */   
/*    */   public BeatAAp1WME()
/*    */   {
/* 25 */     this.bVal1 = false;
/* 26 */     this.bVal2 = false;
/* 27 */     this.bVal3 = false;
/* 28 */     this.bVal4 = false;
/* 29 */     this.bVal5 = false;
/* 30 */     this.subtopic = -1;
/* 31 */     this.previousSubtopic = -1;
/* 32 */     this.iVal3 = 0;
/* 33 */     this.iVal4 = 0;
/* 34 */     this.subtopicObject = 0;
/* 35 */     this.fVal1 = 0.0F;
/* 36 */     this.fVal2 = 0.0F;
/* 37 */     this.fVal3 = 0.0F;
/* 38 */     this.fVal4 = 0.0F;
/* 39 */     this.fVal5 = 0.0F;
/*    */   }
/*    */   
/* 42 */   public synchronized boolean getBVal1() { return this.bVal1; }
/* 43 */   public synchronized boolean getBVal2() { return this.bVal2; }
/* 44 */   public synchronized boolean getBVal3() { return this.bVal3; }
/* 45 */   public synchronized boolean getBVal4() { return this.bVal4; }
/* 46 */   public synchronized boolean getBVal5() { return this.bVal5; }
/* 47 */   public synchronized int getSubtopic() { return this.subtopic; }
/* 48 */   public synchronized int getPreviousSubtopic() { return this.previousSubtopic; }
/* 49 */   public synchronized int getIVal3() { return this.iVal3; }
/* 50 */   public synchronized int getIVal4() { return this.iVal4; }
/* 51 */   public synchronized int getSubtopicObject() { return this.subtopicObject; }
/* 52 */   public synchronized float getFVal1() { return this.fVal1; }
/* 53 */   public synchronized float getFVal2() { return this.fVal2; }
/* 54 */   public synchronized float getFVal3() { return this.fVal3; }
/* 55 */   public synchronized float getFVal4() { return this.fVal4; }
/* 56 */   public synchronized float getFVal5() { return this.fVal5; }
/*    */   
/* 58 */   public synchronized void setBVal1(boolean paramBoolean) { this.bVal1 = paramBoolean; }
/* 59 */   public synchronized void setBVal2(boolean paramBoolean) { this.bVal2 = paramBoolean; }
/* 60 */   public synchronized void setBVal3(boolean paramBoolean) { this.bVal3 = paramBoolean; }
/* 61 */   public synchronized void setBVal4(boolean paramBoolean) { this.bVal4 = paramBoolean; }
/* 62 */   public synchronized void setBVal5(boolean paramBoolean) { this.bVal5 = paramBoolean; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 81 */   public synchronized void setIVal3(int paramInt) { this.iVal3 = paramInt; }
/* 82 */   public synchronized void setIVal4(int paramInt) { this.iVal4 = paramInt; }
/* 83 */   public synchronized void setSubtopicObject(int paramInt) { this.subtopicObject = paramInt; }
/* 84 */   public synchronized void setFVal1(float paramFloat) { this.fVal1 = paramFloat; }
/* 85 */   public synchronized void setFVal2(float paramFloat) { this.fVal2 = paramFloat; }
/* 86 */   public synchronized void setFVal3(float paramFloat) { this.fVal3 = paramFloat; }
/* 87 */   public synchronized void setFVal4(float paramFloat) { this.fVal4 = paramFloat; }
/* 88 */   public synchronized void setFVal5(float paramFloat) { this.fVal5 = paramFloat; }
/*    */   
/*    */   /* Error */
/*    */   public void setSubtopic(int paramInt)
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
/*    */     //   11: getfield 44	facade/characters/wmedef/BeatAAp1WME:subtopic	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 44	facade/characters/wmedef/BeatAAp1WME:subtopic	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 84	facade/characters/wmedef/BeatAAp1WME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 85
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 89	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #65	-> byte code offset #0
/*    */     //   Java source line #66	-> byte code offset #0
/*    */     //   Java source line #67	-> byte code offset #10
/*    */     //   Java source line #68	-> byte code offset #15
/*    */     //   Java source line #70	-> byte code offset #22
/*    */     //   Java source line #71	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	BeatAAp1WME
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
/*    */   public void setPreviousSubtopic(int paramInt)
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
/*    */     //   11: getfield 47	facade/characters/wmedef/BeatAAp1WME:previousSubtopic	I
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: putfield 47	facade/characters/wmedef/BeatAAp1WME:previousSubtopic	I
/*    */     //   20: aload_3
/*    */     //   21: monitorexit
/*    */     //   22: aload_0
/*    */     //   23: getfield 84	facade/characters/wmedef/BeatAAp1WME:__support	Ljava/beans/PropertyChangeSupport;
/*    */     //   26: ldc 93
/*    */     //   28: iload_2
/*    */     //   29: iload_1
/*    */     //   30: invokevirtual 89	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*    */     //   33: return
/*    */     // Line number table:
/*    */     //   Java source line #74	-> byte code offset #0
/*    */     //   Java source line #75	-> byte code offset #0
/*    */     //   Java source line #76	-> byte code offset #10
/*    */     //   Java source line #77	-> byte code offset #15
/*    */     //   Java source line #79	-> byte code offset #22
/*    */     //   Java source line #80	-> byte code offset #33
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	34	0	this	BeatAAp1WME
/*    */     //   0	34	1	paramInt	int
/*    */     //   14	15	2	i	int
/*    */     //   3	18	3	Ljava/lang/Object;	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	5	3	finally
/*    */     //   10	22	3	finally
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatAAp1WME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */