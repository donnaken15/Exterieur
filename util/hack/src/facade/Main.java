/*    */ package facade;
/*    */ 
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.StringUtil;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   private static final String generateEventLog = "generateEventLog";
/*    */   private static final String noEventLog = "noEventLog";
/*    */   
/*    */   private static final void respondToError(Throwable paramThrowable, boolean paramBoolean)
/*    */   {
/* 36 */     NativeAnimationInterface.addEventInfoToLog(paramThrowable.toString());
/* 37 */     StringUtil.println(paramThrowable.toString());
/* 38 */     if (paramBoolean) System.exit(1);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static void main(String[] paramArrayOfString)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: arraylength
/*    */     //   2: ifle +17 -> 19
/*    */     //   5: aload_0
/*    */     //   6: iconst_0
/*    */     //   7: aaload
/*    */     //   8: ldc 7
/*    */     //   10: invokevirtual 43	java/lang/String:equals	(Ljava/lang/Object;)Z
/*    */     //   13: ifeq +6 -> 19
/*    */     //   16: invokestatic 49	facade/util/StringUtil:setGenerateEventLog	()V
/*    */     //   19: new 50	wm/WorkingMemory
/*    */     //   22: dup
/*    */     //   23: ldc 52
/*    */     //   25: invokespecial 56	wm/WorkingMemory:<init>	(Ljava/lang/String;)V
/*    */     //   28: astore_1
/*    */     //   29: new 57	dramaman/runtime/DramaManager
/*    */     //   32: dup
/*    */     //   33: ldc 59
/*    */     //   35: iconst_0
/*    */     //   36: iconst_0
/*    */     //   37: invokespecial 63	dramaman/runtime/DramaManager:<init>	(Ljava/lang/String;ZZ)V
/*    */     //   40: astore_3
/*    */     //   41: new 64	facade/util/ProvocativeContentArchive
/*    */     //   44: dup
/*    */     //   45: invokespecial 67	facade/util/ProvocativeContentArchive:<init>	()V
/*    */     //   48: astore 4
/*    */     //   50: new 68	facade/util/IntermediateContentArchive
/*    */     //   53: dup
/*    */     //   54: invokespecial 70	facade/util/IntermediateContentArchive:<init>	()V
/*    */     //   57: astore 5
/*    */     //   59: new 71	facade/util/CrisisAccusationMapping
/*    */     //   62: dup
/*    */     //   63: invokespecial 73	facade/util/CrisisAccusationMapping:<init>	()V
/*    */     //   66: astore 6
/*    */     //   68: new 74	facade/util/CrisisCalculus
/*    */     //   71: dup
/*    */     //   72: invokespecial 76	facade/util/CrisisCalculus:<init>	()V
/*    */     //   75: astore 7
/*    */     //   77: new 77	facade/util/TherapyGameState
/*    */     //   80: dup
/*    */     //   81: invokespecial 79	facade/util/TherapyGameState:<init>	()V
/*    */     //   84: astore 8
/*    */     //   86: new 80	facade/util/RawReactionDAArchive
/*    */     //   89: dup
/*    */     //   90: invokespecial 82	facade/util/RawReactionDAArchive:<init>	()V
/*    */     //   93: astore 9
/*    */     //   95: invokestatic 85	facade/util/StringUtil:initializeEventLog	()V
/*    */     //   98: new 86	facade/characters/wmedef/PostBeatMixinInfoWME
/*    */     //   101: dup
/*    */     //   102: invokespecial 88	facade/characters/wmedef/PostBeatMixinInfoWME:<init>	()V
/*    */     //   105: astore 10
/*    */     //   107: ldc 89
/*    */     //   109: aload 10
/*    */     //   111: invokestatic 94	wm/WorkingMemory:addWME	(Ljava/lang/String;Lwm/WME;)V
/*    */     //   114: new 95	facade/Main$3PlayerThread
/*    */     //   117: dup
/*    */     //   118: invokespecial 97	facade/Main$3PlayerThread:<init>	()V
/*    */     //   121: astore 11
/*    */     //   123: aload 11
/*    */     //   125: iconst_5
/*    */     //   126: invokevirtual 100	facade/Main$3PlayerThread:setPriority	(I)V
/*    */     //   129: aload 11
/*    */     //   131: invokevirtual 103	facade/Main$3PlayerThread:start	()V
/*    */     //   134: goto +7 -> 141
/*    */     //   137: aload 12
/*    */     //   139: monitorexit
/*    */     //   140: athrow
/*    */     //   141: aload 11
/*    */     //   143: dup
/*    */     //   144: astore 12
/*    */     //   146: monitorenter
/*    */     //   147: aload 11
/*    */     //   149: invokevirtual 106	java/lang/Object:wait	()V
/*    */     //   152: aload 12
/*    */     //   154: monitorexit
/*    */     //   155: new 107	facade/Main$1TripThread
/*    */     //   158: dup
/*    */     //   159: invokespecial 109	facade/Main$1TripThread:<init>	()V
/*    */     //   162: astore 14
/*    */     //   164: aload 14
/*    */     //   166: iconst_5
/*    */     //   167: invokevirtual 110	facade/Main$1TripThread:setPriority	(I)V
/*    */     //   170: aload 14
/*    */     //   172: invokevirtual 111	facade/Main$1TripThread:start	()V
/*    */     //   175: goto +7 -> 182
/*    */     //   178: aload 12
/*    */     //   180: monitorexit
/*    */     //   181: athrow
/*    */     //   182: aload 14
/*    */     //   184: dup
/*    */     //   185: astore 12
/*    */     //   187: monitorenter
/*    */     //   188: aload 14
/*    */     //   190: invokevirtual 106	java/lang/Object:wait	()V
/*    */     //   193: aload 12
/*    */     //   195: monitorexit
/*    */     //   196: new 112	facade/Main$2GraceThread
/*    */     //   199: dup
/*    */     //   200: invokespecial 114	facade/Main$2GraceThread:<init>	()V
/*    */     //   203: astore 15
/*    */     //   205: aload 15
/*    */     //   207: iconst_5
/*    */     //   208: invokevirtual 115	facade/Main$2GraceThread:setPriority	(I)V
/*    */     //   211: aload 15
/*    */     //   213: invokevirtual 116	facade/Main$2GraceThread:start	()V
/*    */     //   216: goto +7 -> 223
/*    */     //   219: aload 12
/*    */     //   221: monitorexit
/*    */     //   222: athrow
/*    */     //   223: aload 15
/*    */     //   225: dup
/*    */     //   226: astore 12
/*    */     //   228: monitorenter
/*    */     //   229: aload 15
/*    */     //   231: invokevirtual 106	java/lang/Object:wait	()V
/*    */     //   234: aload 12
/*    */     //   236: monitorexit
/*    */     //   237: new 117	facade/characters/wmedef/AnaphoricReferenceWME
/*    */     //   240: dup
/*    */     //   241: invokespecial 119	facade/characters/wmedef/AnaphoricReferenceWME:<init>	()V
/*    */     //   244: astore 16
/*    */     //   246: ldc 89
/*    */     //   248: aload 16
/*    */     //   250: invokestatic 94	wm/WorkingMemory:addWME	(Ljava/lang/String;Lwm/WME;)V
/*    */     //   253: new 120	facade/Main$4NluTemplateThread
/*    */     //   256: dup
/*    */     //   257: aload 16
/*    */     //   259: aload 10
/*    */     //   261: invokespecial 124	facade/Main$4NluTemplateThread:<init>	(Lfacade/characters/wmedef/AnaphoricReferenceWME;Lfacade/characters/wmedef/PostBeatMixinInfoWME;)V
/*    */     //   264: astore 17
/*    */     //   266: aload 17
/*    */     //   268: bipush 6
/*    */     //   270: invokevirtual 125	facade/Main$4NluTemplateThread:setPriority	(I)V
/*    */     //   273: aload 17
/*    */     //   275: invokevirtual 126	facade/Main$4NluTemplateThread:start	()V
/*    */     //   278: goto +7 -> 285
/*    */     //   281: aload 12
/*    */     //   283: monitorexit
/*    */     //   284: athrow
/*    */     //   285: aload 17
/*    */     //   287: dup
/*    */     //   288: astore 12
/*    */     //   290: monitorenter
/*    */     //   291: aload 17
/*    */     //   293: invokevirtual 106	java/lang/Object:wait	()V
/*    */     //   296: aload 12
/*    */     //   298: monitorexit
/*    */     //   299: goto +30 -> 329
/*    */     //   302: astore 10
/*    */     //   304: new 129	abl/runtime/RuntimeError
/*    */     //   307: dup
/*    */     //   308: new 131	java/lang/StringBuffer
/*    */     //   311: dup
/*    */     //   312: ldc -123
/*    */     //   314: invokespecial 135	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
/*    */     //   317: aload 10
/*    */     //   319: invokevirtual 139	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*    */     //   322: invokevirtual 140	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*    */     //   325: invokespecial 141	abl/runtime/RuntimeError:<init>	(Ljava/lang/String;)V
/*    */     //   328: athrow
/*    */     //   329: goto +9 -> 338
/*    */     //   332: astore_1
/*    */     //   333: aload_1
/*    */     //   334: iconst_1
/*    */     //   335: invokestatic 143	facade/Main:respondToError	(Ljava/lang/Throwable;Z)V
/*    */     //   338: return
/*    */     // Line number table:
/*    */     //   Java source line #47	-> byte code offset #0
/*    */     //   Java source line #48	-> byte code offset #5
/*    */     //   Java source line #49	-> byte code offset #16
/*    */     //   Java source line #52	-> byte code offset #19
/*    */     //   Java source line #56	-> byte code offset #19
/*    */     //   Java source line #71	-> byte code offset #19
/*    */     //   Java source line #86	-> byte code offset #19
/*    */     //   Java source line #106	-> byte code offset #19
/*    */     //   Java source line #138	-> byte code offset #19
/*    */     //   Java source line #141	-> byte code offset #29
/*    */     //   Java source line #142	-> byte code offset #29
/*    */     //   Java source line #149	-> byte code offset #29
/*    */     //   Java source line #152	-> byte code offset #41
/*    */     //   Java source line #153	-> byte code offset #50
/*    */     //   Java source line #154	-> byte code offset #59
/*    */     //   Java source line #155	-> byte code offset #68
/*    */     //   Java source line #156	-> byte code offset #77
/*    */     //   Java source line #157	-> byte code offset #86
/*    */     //   Java source line #159	-> byte code offset #95
/*    */     //   Java source line #161	-> byte code offset #95
/*    */     //   Java source line #164	-> byte code offset #98
/*    */     //   Java source line #165	-> byte code offset #107
/*    */     //   Java source line #167	-> byte code offset #114
/*    */     //   Java source line #168	-> byte code offset #123
/*    */     //   Java source line #169	-> byte code offset #129
/*    */     //   Java source line #170	-> byte code offset #134
/*    */     //   Java source line #170	-> byte code offset #147
/*    */     //   Java source line #172	-> byte code offset #155
/*    */     //   Java source line #173	-> byte code offset #164
/*    */     //   Java source line #174	-> byte code offset #170
/*    */     //   Java source line #177	-> byte code offset #175
/*    */     //   Java source line #177	-> byte code offset #188
/*    */     //   Java source line #179	-> byte code offset #196
/*    */     //   Java source line #180	-> byte code offset #205
/*    */     //   Java source line #181	-> byte code offset #211
/*    */     //   Java source line #182	-> byte code offset #216
/*    */     //   Java source line #182	-> byte code offset #229
/*    */     //   Java source line #185	-> byte code offset #237
/*    */     //   Java source line #186	-> byte code offset #246
/*    */     //   Java source line #188	-> byte code offset #253
/*    */     //   Java source line #191	-> byte code offset #266
/*    */     //   Java source line #192	-> byte code offset #273
/*    */     //   Java source line #193	-> byte code offset #278
/*    */     //   Java source line #193	-> byte code offset #291
/*    */     //   Java source line #194	-> byte code offset #304
/*    */     //   Java source line #196	-> byte code offset #333
/*    */     //   Java source line #198	-> byte code offset #338
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	339	0	paramArrayOfString	String[]
/*    */     //   28	1	1	localWorkingMemory	wm.WorkingMemory
/*    */     //   332	2	1	localThrowable	Throwable
/*    */     //   40	1	3	localDramaManager	dramaman.runtime.DramaManager
/*    */     //   48	1	4	localProvocativeContentArchive	facade.util.ProvocativeContentArchive
/*    */     //   57	1	5	localIntermediateContentArchive	facade.util.IntermediateContentArchive
/*    */     //   66	1	6	localCrisisAccusationMapping	facade.util.CrisisAccusationMapping
/*    */     //   75	1	7	localCrisisCalculus	facade.util.CrisisCalculus
/*    */     //   84	1	8	localTherapyGameState	facade.util.TherapyGameState
/*    */     //   93	1	9	localRawReactionDAArchive	facade.util.RawReactionDAArchive
/*    */     //   105	155	10	localPostBeatMixinInfoWME	facade.characters.wmedef.PostBeatMixinInfoWME
/*    */     //   302	16	10	localInterruptedException	InterruptedException
/*    */     //   121	27	11	local3PlayerThread	Main.3PlayerThread
/*    */     //   137	1	12	localObject1	Object
/*    */     //   144	153	12	Ljava/lang/Object;	Object
/*    */     //   162	27	14	local1TripThread	Main.1TripThread
/*    */     //   203	27	15	local2GraceThread	Main.2GraceThread
/*    */     //   244	14	16	localAnaphoricReferenceWME	facade.characters.wmedef.AnaphoricReferenceWME
/*    */     //   264	28	17	local4NluTemplateThread	Main.4NluTemplateThread
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   137	140	137	finally
/*    */     //   147	155	137	finally
/*    */     //   178	181	178	finally
/*    */     //   188	196	178	finally
/*    */     //   219	222	219	finally
/*    */     //   229	237	219	finally
/*    */     //   281	284	281	finally
/*    */     //   291	299	281	finally
/*    */     //   95	299	302	java/lang/InterruptedException
/*    */     //   19	329	332	java/lang/Throwable
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\Main.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */