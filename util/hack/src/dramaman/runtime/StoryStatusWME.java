/*     */ package dramaman.runtime;
/*     */ 
/*     */ import facade.util.PrintUtilities;
/*     */ 
/*     */ public class StoryStatusWME extends wm.WME implements facade.util.BeatID, DramaManagerConstants
/*     */ {
/*     */   private int beatCount;
/*     */   private int previousBeat;
/*     */   private int currentBeat;
/*     */   private int affinity;
/*     */   private int storySegment;
/*     */   
/*     */   private final void jdMethod_this() {
/*  14 */     this.beatCount = 1;
/*  15 */     this.previousBeat = -1;
/*  16 */     this.currentBeat = -1;
/*  17 */     this.affinity = 0;
/*  18 */     this.storySegment = 1;
/*  19 */     this.dramaManagerEnabled = false;
/*     */     
/*  21 */     this.beatCountOfLastGreetingBeat = -1;
/*  22 */     this.storyTopicBeatCount = 0;
/*  23 */     this.NLPProcessingStarted = 0L;
/*     */   }
/*     */   
/*  26 */   public StoryStatusWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { jdMethod_this();
/*  27 */     if ((!$noassert) && ((paramInt1 < 0) || (paramInt2 < -1) || (paramInt3 < -1) || (paramInt4 < 0) || (paramInt4 > -1) || (paramInt5 < 1) || (paramInt5 > 3))) { throw new AssertionError();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  32 */     this.beatCount = paramInt1;
/*  33 */     this.previousBeat = paramInt2;
/*  34 */     this.currentBeat = paramInt3;
/*  35 */     this.affinity = paramInt4;
/*  36 */     this.storySegment = paramInt5;
/*     */   }
/*     */   
/*  39 */   public StoryStatusWME() { jdMethod_this(); }
/*     */   
/*     */ 
/*  42 */   public String formatAffinity() { return PrintUtilities.affinity_EnumToString(getAffinity()); }
/*  43 */   public String formatPreviousBeat() { return PrintUtilities.beatID_EnumToString(getPreviousBeat()); }
/*  44 */   public String formatCurrentBeat() { return PrintUtilities.beatID_EnumToString(getCurrentBeat()); }
/*  45 */   public String formatStorySegment() { return PrintUtilities.storySegment_EnumToString(getStorySegment()); }
/*     */   
/*     */   public synchronized int getBeatCount() {
/*  48 */     return this.beatCount;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getPreviousBeat()
/*     */   {
/*  59 */     return this.previousBeat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getCurrentBeat()
/*     */   {
/*  70 */     return this.currentBeat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getAffinity()
/*     */   {
/*  81 */     return this.affinity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getStorySegment()
/*     */   {
/*  92 */     return this.storySegment;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getDramaManagerEnabled()
/*     */   {
/* 103 */     return this.dramaManagerEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getStoryTopicBeatCount()
/*     */   {
/* 114 */     return this.storyTopicBeatCount;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private class AffinityEditor
/*     */     extends javax.swing.JComboBox
/*     */     implements wm.WMEFieldEditor
/*     */   {
/*     */     AffinityEditor()
/*     */     {
/* 130 */       super();
/* 131 */       setEditable(false);
/* 132 */       setSelectedItem(PrintUtilities.affinity_EnumToString(StoryStatusWME.this.getAffinity()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 138 */       return Integer.toString(PrintUtilities.affinity_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 144 */       setSelectedItem(PrintUtilities.affinity_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   private class CurrentBeatEditor
/*     */     extends javax.swing.JComboBox implements wm.WMEFieldEditor
/*     */   {
/*     */     CurrentBeatEditor()
/*     */     {
/* 153 */       super();
/* 154 */       setEditable(false);
/* 155 */       setSelectedItem(PrintUtilities.beatID_EnumToString(StoryStatusWME.this.getAffinity()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 161 */       return Integer.toString(PrintUtilities.beatID_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 167 */       setSelectedItem(PrintUtilities.beatID_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 172 */   public wm.WMEFieldEditor _getAffinityEditor() { return new AffinityEditor(); }
/* 173 */   public wm.WMEFieldEditor _getCurrentBeatEditor() { return new CurrentBeatEditor(); }
/*     */   
/* 175 */   public synchronized int getBeatCountOfLastGreetingBeat() { return this.beatCountOfLastGreetingBeat; }
/*     */   
/*     */ 
/*     */ 
/*     */   private boolean dramaManagerEnabled;
/*     */   
/*     */ 
/*     */   private int beatCountOfLastGreetingBeat;
/*     */   private int storyTopicBeatCount;
/*     */   private long NLPProcessingStarted;
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.runtime.StoryStatusWME;").getComponentType().desiredAssertionStatus() ^ true;
/* 186 */   public synchronized long getNLPProcessingStarted() { return this.NLPProcessingStarted; }
/*     */   
/* 188 */   public synchronized void setNLPProcessingStarted(long paramLong) { this.NLPProcessingStarted = paramLong; }
/*     */   
/*     */   /* Error */
/*     */   public void setBeatCount(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 57	dramaman/runtime/StoryStatusWME:beatCount	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 57	dramaman/runtime/StoryStatusWME:beatCount	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 64
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #51	-> byte code offset #0
/*     */     //   Java source line #52	-> byte code offset #0
/*     */     //   Java source line #53	-> byte code offset #10
/*     */     //   Java source line #54	-> byte code offset #15
/*     */     //   Java source line #56	-> byte code offset #22
/*     */     //   Java source line #57	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setPreviousBeat(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 72	dramaman/runtime/StoryStatusWME:previousBeat	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 72	dramaman/runtime/StoryStatusWME:previousBeat	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 74
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #62	-> byte code offset #0
/*     */     //   Java source line #63	-> byte code offset #0
/*     */     //   Java source line #64	-> byte code offset #10
/*     */     //   Java source line #65	-> byte code offset #15
/*     */     //   Java source line #67	-> byte code offset #22
/*     */     //   Java source line #68	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setCurrentBeat(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 76	dramaman/runtime/StoryStatusWME:currentBeat	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 76	dramaman/runtime/StoryStatusWME:currentBeat	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 78
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #73	-> byte code offset #0
/*     */     //   Java source line #74	-> byte code offset #0
/*     */     //   Java source line #75	-> byte code offset #10
/*     */     //   Java source line #76	-> byte code offset #15
/*     */     //   Java source line #78	-> byte code offset #22
/*     */     //   Java source line #79	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setAffinity(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 80	dramaman/runtime/StoryStatusWME:affinity	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 80	dramaman/runtime/StoryStatusWME:affinity	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 82
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #84	-> byte code offset #0
/*     */     //   Java source line #85	-> byte code offset #0
/*     */     //   Java source line #86	-> byte code offset #10
/*     */     //   Java source line #87	-> byte code offset #15
/*     */     //   Java source line #89	-> byte code offset #22
/*     */     //   Java source line #90	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setStorySegment(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 84	dramaman/runtime/StoryStatusWME:storySegment	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 84	dramaman/runtime/StoryStatusWME:storySegment	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 86
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #95	-> byte code offset #0
/*     */     //   Java source line #96	-> byte code offset #0
/*     */     //   Java source line #97	-> byte code offset #10
/*     */     //   Java source line #98	-> byte code offset #15
/*     */     //   Java source line #100	-> byte code offset #22
/*     */     //   Java source line #101	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setDramaManagerEnabled(boolean paramBoolean)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 90	dramaman/runtime/StoryStatusWME:dramaManagerEnabled	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 90	dramaman/runtime/StoryStatusWME:dramaManagerEnabled	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 93
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 96	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #106	-> byte code offset #0
/*     */     //   Java source line #107	-> byte code offset #0
/*     */     //   Java source line #108	-> byte code offset #10
/*     */     //   Java source line #109	-> byte code offset #15
/*     */     //   Java source line #111	-> byte code offset #22
/*     */     //   Java source line #112	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramBoolean	boolean
/*     */     //   14	15	2	bool	boolean
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setStoryTopicBeatCount(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 99	dramaman/runtime/StoryStatusWME:storyTopicBeatCount	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 99	dramaman/runtime/StoryStatusWME:storyTopicBeatCount	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 101
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #117	-> byte code offset #0
/*     */     //   Java source line #118	-> byte code offset #0
/*     */     //   Java source line #119	-> byte code offset #10
/*     */     //   Java source line #120	-> byte code offset #15
/*     */     //   Java source line #122	-> byte code offset #22
/*     */     //   Java source line #123	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setBeatCountOfLastGreetingBeat(int paramInt)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: dup
/*     */     //   8: astore_3
/*     */     //   9: monitorenter
/*     */     //   10: aload_0
/*     */     //   11: getfield 116	dramaman/runtime/StoryStatusWME:beatCountOfLastGreetingBeat	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 116	dramaman/runtime/StoryStatusWME:beatCountOfLastGreetingBeat	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 63	dramaman/runtime/StoryStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 118
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 68	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #178	-> byte code offset #0
/*     */     //   Java source line #179	-> byte code offset #0
/*     */     //   Java source line #180	-> byte code offset #10
/*     */     //   Java source line #181	-> byte code offset #15
/*     */     //   Java source line #183	-> byte code offset #22
/*     */     //   Java source line #184	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	StoryStatusWME
/*     */     //   0	34	1	paramInt	int
/*     */     //   14	15	2	i	int
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryStatusWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */