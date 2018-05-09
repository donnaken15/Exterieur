/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import java.util.Collection;
/*     */ 
/*     */ public class BeatStatusWME extends wm.WME
/*     */ {
/*     */   private int status;
/*     */   private String curBGSig;
/*     */   private boolean bCommitPointReached;
/*     */   
/*     */   private final void jdMethod_this() {
/*  12 */     this.bTxningOut = false;
/*     */     
/*  14 */     this.mixInAllowed_pushTooFar = true;
/*  15 */     this.mixInAllowed_satellite = true;
/*  16 */     this.mixInAllowed_redirectConnect = true;
/*  17 */     this.mixInAllowed_object = true;
/*  18 */     this.mixInAllowed_DA = true;
/*  19 */     this.mixInAllowed_deflect = true;
/*  20 */     this.mixInAllowed_pattern = true;
/*  21 */     this.mixInAllowed_ltb = true;
/*     */     
/*  23 */     this.disallowedPushTooFarObjects = new java.util.ArrayList();
/*     */   }
/*     */   
/*  26 */   public BeatStatusWME(int paramInt, boolean paramBoolean1, boolean paramBoolean2) { jdMethod_this();
/*  27 */     this.status = paramInt;
/*  28 */     this.curBGSig = "none";
/*  29 */     this.abortReason = -1;
/*  30 */     this.bCommitPointReached = paramBoolean1;
/*  31 */     this.bGistPointReached = paramBoolean2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BeatStatusWME(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10)
/*     */   {
/*  42 */     jdMethod_this();
/*  43 */     this.status = paramInt;
/*  44 */     this.curBGSig = "none";
/*  45 */     this.bCommitPointReached = paramBoolean1;
/*  46 */     this.bGistPointReached = paramBoolean2;
/*  47 */     this.bTxningOut = paramBoolean3;
/*  48 */     this.abortReason = -1;
/*  49 */     this.mixInAllowed_pushTooFar = paramBoolean4;
/*  50 */     this.mixInAllowed_satellite = paramBoolean5;
/*  51 */     this.mixInAllowed_redirectConnect = paramBoolean6;
/*  52 */     this.mixInAllowed_object = paramBoolean7;
/*  53 */     this.mixInAllowed_DA = paramBoolean8;
/*  54 */     this.mixInAllowed_deflect = paramBoolean9;
/*  55 */     this.mixInAllowed_pattern = paramBoolean10;
/*  56 */     this.mixInAllowed_ltb = true;
/*     */   }
/*     */   
/*  59 */   public BeatStatusWME() { jdMethod_this(); }
/*     */   
/*  61 */   public synchronized int getStatus() { return this.status; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized String getCurBGSig()
/*     */   {
/*  71 */     return this.curBGSig;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getCommitPointReached()
/*     */   {
/*  81 */     return this.bCommitPointReached;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getGistPointReached()
/*     */   {
/*  92 */     return this.bGistPointReached;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private boolean bGistPointReached;
/*     */   
/*     */ 
/*     */   private boolean bTxningOut;
/*     */   private int abortReason;
/*     */   private boolean mixInAllowed_pushTooFar;
/* 103 */   public synchronized boolean getTxningOut() { return this.bTxningOut; }
/* 104 */   public synchronized boolean getBTxningOut() { return this.bTxningOut; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int getAbortReason()
/*     */   {
/* 115 */     return this.abortReason;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_pushTooFar()
/*     */   {
/* 125 */     return this.mixInAllowed_pushTooFar;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_satellite()
/*     */   {
/* 136 */     return this.mixInAllowed_satellite;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_redirectConnect()
/*     */   {
/* 147 */     return this.mixInAllowed_redirectConnect;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_object()
/*     */   {
/* 159 */     return this.mixInAllowed_object;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_DA()
/*     */   {
/* 170 */     return this.mixInAllowed_DA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_deflect()
/*     */   {
/* 181 */     return this.mixInAllowed_deflect;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_pattern()
/*     */   {
/* 192 */     return this.mixInAllowed_pattern;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized boolean getMixInAllowed_ltb()
/*     */   {
/* 203 */     return this.mixInAllowed_ltb;
/*     */   }
/*     */   
/*     */ 
/*     */   private boolean mixInAllowed_satellite;
/*     */   private boolean mixInAllowed_redirectConnect;
/*     */   private boolean mixInAllowed_object;
/*     */   private boolean mixInAllowed_DA;
/*     */   private boolean mixInAllowed_deflect;
/*     */   private boolean mixInAllowed_pattern;
/*     */   private boolean mixInAllowed_ltb;
/*     */   private Collection disallowedPushTooFarObjects;
/*     */   public synchronized int[] getDisallowedPushTooFarObjects()
/*     */   {
/* 217 */     java.util.Iterator localIterator = this.disallowedPushTooFarObjects.iterator();
/* 218 */     int[] arrayOfInt = new int[this.disallowedPushTooFarObjects.size()];
/* 219 */     int i = 0;
/* 220 */     while (localIterator.hasNext()) {
/* 221 */       arrayOfInt[(i++)] = ((Integer)localIterator.next()).intValue();
/*     */     }
/* 223 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   public synchronized void addDisallowedPushTooFarObject(int paramInt)
/*     */   {
/* 228 */     this.disallowedPushTooFarObjects.add(new Integer(paramInt));
/*     */   }
/*     */   
/*     */   public synchronized void deleteDisallowedPushTooFarObject(int paramInt) {
/* 232 */     this.disallowedPushTooFarObjects.remove(new Integer(paramInt));
/*     */   }
/*     */   
/*     */   public synchronized void clearDisallowedPushTooFarObjects()
/*     */   {
/* 237 */     this.disallowedPushTooFarObjects.clear();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setStatus(int paramInt)
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
/*     */     //   11: getfield 29	facade/characters/wmedef/BeatStatusWME:status	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 29	facade/characters/wmedef/BeatStatusWME:status	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 36
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 40	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #63	-> byte code offset #0
/*     */     //   Java source line #64	-> byte code offset #0
/*     */     //   Java source line #65	-> byte code offset #10
/*     */     //   Java source line #66	-> byte code offset #15
/*     */     //   Java source line #68	-> byte code offset #22
/*     */     //   Java source line #69	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setCurBGSig(String paramString)
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
/*     */     //   11: getfield 46	facade/characters/wmedef/BeatStatusWME:curBGSig	Ljava/lang/String;
/*     */     //   14: astore_2
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: putfield 46	facade/characters/wmedef/BeatStatusWME:curBGSig	Ljava/lang/String;
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 49
/*     */     //   28: aload_2
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual 52	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
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
/*     */     //   0	34	0	this	BeatStatusWME
/*     */     //   0	34	1	paramString	String
/*     */     //   14	15	2	str	String
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setCommitPointReached(boolean paramBoolean)
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
/*     */     //   11: getfield 56	facade/characters/wmedef/BeatStatusWME:bCommitPointReached	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 56	facade/characters/wmedef/BeatStatusWME:bCommitPointReached	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 59
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
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
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setGistPointReached(boolean paramBoolean)
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
/*     */     //   11: getfield 66	facade/characters/wmedef/BeatStatusWME:bGistPointReached	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 66	facade/characters/wmedef/BeatStatusWME:bGistPointReached	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 68
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
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
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setTxningOut(boolean paramBoolean)
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
/*     */     //   11: getfield 72	facade/characters/wmedef/BeatStatusWME:bTxningOut	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 72	facade/characters/wmedef/BeatStatusWME:bTxningOut	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 75
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #107	-> byte code offset #0
/*     */     //   Java source line #108	-> byte code offset #0
/*     */     //   Java source line #109	-> byte code offset #10
/*     */     //   Java source line #110	-> byte code offset #15
/*     */     //   Java source line #112	-> byte code offset #22
/*     */     //   Java source line #113	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setAbortReason(int paramInt)
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
/*     */     //   11: getfield 79	facade/characters/wmedef/BeatStatusWME:abortReason	I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 79	facade/characters/wmedef/BeatStatusWME:abortReason	I
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 81
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 40	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;II)V
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
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_pushTooFar(boolean paramBoolean)
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
/*     */     //   11: getfield 84	facade/characters/wmedef/BeatStatusWME:mixInAllowed_pushTooFar	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 84	facade/characters/wmedef/BeatStatusWME:mixInAllowed_pushTooFar	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 86
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #128	-> byte code offset #0
/*     */     //   Java source line #129	-> byte code offset #0
/*     */     //   Java source line #130	-> byte code offset #10
/*     */     //   Java source line #131	-> byte code offset #15
/*     */     //   Java source line #133	-> byte code offset #22
/*     */     //   Java source line #134	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_satellite(boolean paramBoolean)
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
/*     */     //   11: getfield 89	facade/characters/wmedef/BeatStatusWME:mixInAllowed_satellite	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 89	facade/characters/wmedef/BeatStatusWME:mixInAllowed_satellite	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 91
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #139	-> byte code offset #0
/*     */     //   Java source line #140	-> byte code offset #0
/*     */     //   Java source line #141	-> byte code offset #10
/*     */     //   Java source line #142	-> byte code offset #15
/*     */     //   Java source line #144	-> byte code offset #22
/*     */     //   Java source line #145	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_redirectConnect(boolean paramBoolean)
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
/*     */     //   11: getfield 94	facade/characters/wmedef/BeatStatusWME:mixInAllowed_redirectConnect	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 94	facade/characters/wmedef/BeatStatusWME:mixInAllowed_redirectConnect	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 96
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #150	-> byte code offset #0
/*     */     //   Java source line #151	-> byte code offset #0
/*     */     //   Java source line #152	-> byte code offset #10
/*     */     //   Java source line #153	-> byte code offset #15
/*     */     //   Java source line #155	-> byte code offset #22
/*     */     //   Java source line #157	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_object(boolean paramBoolean)
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
/*     */     //   11: getfield 99	facade/characters/wmedef/BeatStatusWME:mixInAllowed_object	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 99	facade/characters/wmedef/BeatStatusWME:mixInAllowed_object	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 101
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #162	-> byte code offset #0
/*     */     //   Java source line #163	-> byte code offset #0
/*     */     //   Java source line #164	-> byte code offset #10
/*     */     //   Java source line #165	-> byte code offset #15
/*     */     //   Java source line #167	-> byte code offset #22
/*     */     //   Java source line #168	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_DA(boolean paramBoolean)
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
/*     */     //   10: iload_1
/*     */     //   11: istore_2
/*     */     //   12: aload_0
/*     */     //   13: iload_1
/*     */     //   14: putfield 104	facade/characters/wmedef/BeatStatusWME:mixInAllowed_DA	Z
/*     */     //   17: aload_3
/*     */     //   18: monitorexit
/*     */     //   19: aload_0
/*     */     //   20: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   23: ldc 106
/*     */     //   25: iload_2
/*     */     //   26: iload_1
/*     */     //   27: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   30: return
/*     */     // Line number table:
/*     */     //   Java source line #173	-> byte code offset #0
/*     */     //   Java source line #174	-> byte code offset #0
/*     */     //   Java source line #175	-> byte code offset #10
/*     */     //   Java source line #176	-> byte code offset #12
/*     */     //   Java source line #178	-> byte code offset #19
/*     */     //   Java source line #179	-> byte code offset #30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	31	0	this	BeatStatusWME
/*     */     //   0	31	1	paramBoolean	boolean
/*     */     //   11	15	2	bool	boolean
/*     */     //   3	15	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	19	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setMixInAllowed_deflect(boolean paramBoolean)
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
/*     */     //   11: getfield 109	facade/characters/wmedef/BeatStatusWME:mixInAllowed_deflect	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 109	facade/characters/wmedef/BeatStatusWME:mixInAllowed_deflect	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 111
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #184	-> byte code offset #0
/*     */     //   Java source line #185	-> byte code offset #0
/*     */     //   Java source line #186	-> byte code offset #10
/*     */     //   Java source line #187	-> byte code offset #15
/*     */     //   Java source line #189	-> byte code offset #22
/*     */     //   Java source line #190	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_pattern(boolean paramBoolean)
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
/*     */     //   11: getfield 114	facade/characters/wmedef/BeatStatusWME:mixInAllowed_pattern	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 114	facade/characters/wmedef/BeatStatusWME:mixInAllowed_pattern	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 116
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #195	-> byte code offset #0
/*     */     //   Java source line #196	-> byte code offset #0
/*     */     //   Java source line #197	-> byte code offset #10
/*     */     //   Java source line #198	-> byte code offset #15
/*     */     //   Java source line #200	-> byte code offset #22
/*     */     //   Java source line #201	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
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
/*     */   public void setMixInAllowed_ltb(boolean paramBoolean)
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
/*     */     //   11: getfield 119	facade/characters/wmedef/BeatStatusWME:mixInAllowed_ltb	Z
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: iload_1
/*     */     //   17: putfield 119	facade/characters/wmedef/BeatStatusWME:mixInAllowed_ltb	Z
/*     */     //   20: aload_3
/*     */     //   21: monitorexit
/*     */     //   22: aload_0
/*     */     //   23: getfield 35	facade/characters/wmedef/BeatStatusWME:__support	Ljava/beans/PropertyChangeSupport;
/*     */     //   26: ldc 121
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual 63	java/beans/PropertyChangeSupport:firePropertyChange	(Ljava/lang/String;ZZ)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line #206	-> byte code offset #0
/*     */     //   Java source line #207	-> byte code offset #0
/*     */     //   Java source line #208	-> byte code offset #10
/*     */     //   Java source line #209	-> byte code offset #15
/*     */     //   Java source line #211	-> byte code offset #22
/*     */     //   Java source line #212	-> byte code offset #33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	34	0	this	BeatStatusWME
/*     */     //   0	34	1	paramBoolean	boolean
/*     */     //   14	15	2	bool	boolean
/*     */     //   3	18	3	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   10	22	3	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatStatusWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */