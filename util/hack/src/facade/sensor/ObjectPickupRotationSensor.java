/*     */ package facade.sensor;
/*     */ 
/*     */ import abl.runtime.BehavingEntity;
/*     */ 
/*     */ public abstract class ObjectPickupRotationSensor extends FacadeSensor implements facade.util.SpriteID
/*     */ {
/*     */   protected static final float tolerance = 0.1F;
/*     */   private java.util.Hashtable lastRotations;
/*     */   
/*     */   public ObjectPickupRotationSensor()
/*     */   {
/*  12 */     jdMethod_this();
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  17 */     this.lastRotations = new java.util.Hashtable();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void senseOneShot_Utility(int paramInt)
/*     */   {
/*  43 */     facade.util.ObjectSensePacket localObjectSensePacket = new facade.util.ObjectSensePacket();
/*  44 */     facade.nativeinterface.NativeAnimationInterface.getAllObjectPickupRotations(paramInt, localObjectSensePacket);
/*  45 */     deleteAllOldWMEs(paramInt);
/*  46 */     addAllPickupRotationWMEs(paramInt, localObjectSensePacket);
/*     */   }
/*     */   
/*     */ 
/*     */   private final synchronized void deleteAllOldWMEs(int paramInt)
/*     */   {
/*  52 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectPickupRotationWME").toArray();
/*  53 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  54 */       if (((facade.characters.wmedef.ObjectPickupRotationWME)arrayOfObject[i]).getCharacterID() == paramInt) {
/*  55 */         BehavingEntity.getBehavingEntity().deleteWME((facade.characters.wmedef.ObjectPickupRotationWME)arrayOfObject[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final synchronized void deleteOldWMEs(int paramInt1, int paramInt2)
/*     */   {
/*  62 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectPickupRotationWME").toArray();
/*  63 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  64 */       if ((((facade.characters.wmedef.ObjectPickupRotationWME)arrayOfObject[i]).getObjectID() == paramInt1) && (((facade.characters.wmedef.ObjectPickupRotationWME)arrayOfObject[i]).getCharacterID() == paramInt2))
/*     */       {
/*  66 */         BehavingEntity.getBehavingEntity().deleteWME((facade.characters.wmedef.ObjectPickupRotationWME)arrayOfObject[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final void addAllPickupRotationWMEs(int paramInt, facade.util.ObjectSensePacket paramObjectSensePacket) {
/*  72 */     for (int i = 0; i < paramObjectSensePacket.info.length; i++) {
/*  73 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.ObjectPickupRotationWME(paramObjectSensePacket.info[i].objectID, paramInt, paramObjectSensePacket.info[i].x, paramObjectSensePacket.info[i].y, paramObjectSensePacket.info[i].z));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void initializeContinuous_Utility(int paramInt)
/*     */   {
/*  79 */     facade.util.ObjectSensePacket localObjectSensePacket = new facade.util.ObjectSensePacket();
/*  80 */     facade.nativeinterface.NativeAnimationInterface.getAllObjectPickupRotations(paramInt, localObjectSensePacket);
/*  81 */     deleteAllOldWMEs(paramInt);
/*  82 */     addAllPickupRotationWMEs(paramInt, localObjectSensePacket);
/*  83 */     updateLastPickupRotations(localObjectSensePacket);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void senseContinuous_Utility(int paramInt)
/*     */   {
/* 116 */     facade.util.ObjectSensePacket localObjectSensePacket = new facade.util.ObjectSensePacket();
/* 117 */     facade.nativeinterface.NativeAnimationInterface.getAllObjectPickupRotations(paramInt, localObjectSensePacket);
/* 118 */     updateLastPickupRotationsConditionally(paramInt, localObjectSensePacket);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   protected boolean changed(int paramInt1, int paramInt2, facade.util.Point3D paramPoint3D)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +7 -> 7
/*     */     //   3: aload 4
/*     */     //   5: monitorexit
/*     */     //   6: athrow
/*     */     //   7: aload_0
/*     */     //   8: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   11: dup
/*     */     //   12: astore 4
/*     */     //   14: monitorenter
/*     */     //   15: iload_1
/*     */     //   16: bipush 10
/*     */     //   18: iadd
/*     */     //   19: sipush 1000
/*     */     //   22: imul
/*     */     //   23: iload_2
/*     */     //   24: bipush 10
/*     */     //   26: iadd
/*     */     //   27: iadd
/*     */     //   28: istore 7
/*     */     //   30: aload_0
/*     */     //   31: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   34: new 19	java/lang/Integer
/*     */     //   37: dup
/*     */     //   38: iload 7
/*     */     //   40: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   43: invokevirtual 28	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   46: checkcast 31	facade/util/Point3D
/*     */     //   49: astore 8
/*     */     //   51: aload 8
/*     */     //   53: ifnull +109 -> 162
/*     */     //   56: aload_3
/*     */     //   57: getfield 35	facade/util/Point3D:x	F
/*     */     //   60: aload 8
/*     */     //   62: getfield 35	facade/util/Point3D:x	F
/*     */     //   65: fsub
/*     */     //   66: ldc 9
/*     */     //   68: fcmpl
/*     */     //   69: ifgt +83 -> 152
/*     */     //   72: aload 8
/*     */     //   74: getfield 35	facade/util/Point3D:x	F
/*     */     //   77: aload_3
/*     */     //   78: getfield 35	facade/util/Point3D:x	F
/*     */     //   81: fsub
/*     */     //   82: ldc 9
/*     */     //   84: fcmpl
/*     */     //   85: ifgt +67 -> 152
/*     */     //   88: aload_3
/*     */     //   89: getfield 38	facade/util/Point3D:y	F
/*     */     //   92: aload 8
/*     */     //   94: getfield 38	facade/util/Point3D:y	F
/*     */     //   97: fsub
/*     */     //   98: ldc 9
/*     */     //   100: fcmpl
/*     */     //   101: ifgt +51 -> 152
/*     */     //   104: aload 8
/*     */     //   106: getfield 38	facade/util/Point3D:y	F
/*     */     //   109: aload_3
/*     */     //   110: getfield 38	facade/util/Point3D:y	F
/*     */     //   113: fsub
/*     */     //   114: ldc 9
/*     */     //   116: fcmpl
/*     */     //   117: ifgt +35 -> 152
/*     */     //   120: aload_3
/*     */     //   121: getfield 41	facade/util/Point3D:z	F
/*     */     //   124: aload 8
/*     */     //   126: getfield 41	facade/util/Point3D:z	F
/*     */     //   129: fsub
/*     */     //   130: ldc 9
/*     */     //   132: fcmpl
/*     */     //   133: ifgt +19 -> 152
/*     */     //   136: aload 8
/*     */     //   138: getfield 41	facade/util/Point3D:z	F
/*     */     //   141: aload_3
/*     */     //   142: getfield 41	facade/util/Point3D:z	F
/*     */     //   145: fsub
/*     */     //   146: ldc 9
/*     */     //   148: fcmpl
/*     */     //   149: ifle +8 -> 157
/*     */     //   152: iconst_1
/*     */     //   153: aload 4
/*     */     //   155: monitorexit
/*     */     //   156: ireturn
/*     */     //   157: iconst_0
/*     */     //   158: aload 4
/*     */     //   160: monitorexit
/*     */     //   161: ireturn
/*     */     //   162: iconst_1
/*     */     //   163: aload 4
/*     */     //   165: monitorexit
/*     */     //   166: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #24	-> byte code offset #0
/*     */     //   Java source line #25	-> byte code offset #15
/*     */     //   Java source line #26	-> byte code offset #30
/*     */     //   Java source line #27	-> byte code offset #51
/*     */     //   Java source line #28	-> byte code offset #56
/*     */     //   Java source line #34	-> byte code offset #152
/*     */     //   Java source line #36	-> byte code offset #157
/*     */     //   Java source line #38	-> byte code offset #162
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	167	0	this	ObjectPickupRotationSensor
/*     */     //   0	167	1	paramInt1	int
/*     */     //   0	167	2	paramInt2	int
/*     */     //   0	167	3	paramPoint3D	facade.util.Point3D
/*     */     //   3	1	4	localObject1	Object
/*     */     //   12	152	4	Ljava/lang/Object;	Object
/*     */     //   28	11	7	i	int
/*     */     //   49	88	8	localPoint3D	facade.util.Point3D
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	6	3	finally
/*     */     //   15	156	3	finally
/*     */     //   157	161	3	finally
/*     */     //   162	166	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final void updateLastPickupRotations(facade.util.ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_2
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: iconst_0
/*     */     //   14: istore 4
/*     */     //   16: goto +82 -> 98
/*     */     //   19: new 19	java/lang/Integer
/*     */     //   22: dup
/*     */     //   23: aload_1
/*     */     //   24: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   27: iload 4
/*     */     //   29: aaload
/*     */     //   30: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   33: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   36: astore 5
/*     */     //   38: aload_0
/*     */     //   39: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   42: aload 5
/*     */     //   44: invokevirtual 119	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   47: pop
/*     */     //   48: aload_0
/*     */     //   49: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   52: aload 5
/*     */     //   54: new 31	facade/util/Point3D
/*     */     //   57: dup
/*     */     //   58: aload_1
/*     */     //   59: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   62: iload 4
/*     */     //   64: aaload
/*     */     //   65: getfield 103	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   68: aload_1
/*     */     //   69: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   72: iload 4
/*     */     //   74: aaload
/*     */     //   75: getfield 104	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   78: aload_1
/*     */     //   79: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   82: iload 4
/*     */     //   84: aaload
/*     */     //   85: getfield 105	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   88: invokespecial 122	facade/util/Point3D:<init>	(FFF)V
/*     */     //   91: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   94: pop
/*     */     //   95: iinc 4 1
/*     */     //   98: iload 4
/*     */     //   100: aload_1
/*     */     //   101: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   104: arraylength
/*     */     //   105: if_icmplt -86 -> 19
/*     */     //   108: aload_2
/*     */     //   109: monitorexit
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line #88	-> byte code offset #0
/*     */     //   Java source line #89	-> byte code offset #13
/*     */     //   Java source line #89	-> byte code offset #13
/*     */     //   Java source line #90	-> byte code offset #19
/*     */     //   Java source line #91	-> byte code offset #38
/*     */     //   Java source line #92	-> byte code offset #48
/*     */     //   Java source line #89	-> byte code offset #95
/*     */     //   Java source line #89	-> byte code offset #98
/*     */     //   Java source line #95	-> byte code offset #110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	111	0	this	ObjectPickupRotationSensor
/*     */     //   0	111	1	paramObjectSensePacket	facade.util.ObjectSensePacket
/*     */     //   3	106	2	Ljava/lang/Object;	Object
/*     */     //   14	92	4	i	int
/*     */     //   36	17	5	localInteger	Integer
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	110	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final void updateLastPickupRotationsConditionally(int paramInt, facade.util.ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: goto +171 -> 173
/*     */     //   5: new 31	facade/util/Point3D
/*     */     //   8: dup
/*     */     //   9: aload_2
/*     */     //   10: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   13: iload_3
/*     */     //   14: aaload
/*     */     //   15: getfield 103	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   18: aload_2
/*     */     //   19: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   22: iload_3
/*     */     //   23: aaload
/*     */     //   24: getfield 104	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   27: aload_2
/*     */     //   28: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   31: iload_3
/*     */     //   32: aaload
/*     */     //   33: getfield 105	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   36: invokespecial 122	facade/util/Point3D:<init>	(FFF)V
/*     */     //   39: astore 4
/*     */     //   41: aload_0
/*     */     //   42: aload_2
/*     */     //   43: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   46: iload_3
/*     */     //   47: aaload
/*     */     //   48: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   51: iload_1
/*     */     //   52: aload 4
/*     */     //   54: invokevirtual 129	facade/sensor/ObjectPickupRotationSensor:changed	(IILfacade/util/Point3D;)Z
/*     */     //   57: ifeq +113 -> 170
/*     */     //   60: aload_0
/*     */     //   61: aload_2
/*     */     //   62: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   65: iload_3
/*     */     //   66: aaload
/*     */     //   67: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   70: iload_1
/*     */     //   71: invokespecial 131	facade/sensor/ObjectPickupRotationSensor:deleteOldWMEs	(II)V
/*     */     //   74: invokestatic 63	abl/runtime/BehavingEntity:getBehavingEntity	()Labl/runtime/BehavingEntity;
/*     */     //   77: new 78	facade/characters/wmedef/ObjectPickupRotationWME
/*     */     //   80: dup
/*     */     //   81: aload_2
/*     */     //   82: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   85: iload_3
/*     */     //   86: aaload
/*     */     //   87: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   90: iload_1
/*     */     //   91: aload 4
/*     */     //   93: getfield 35	facade/util/Point3D:x	F
/*     */     //   96: aload 4
/*     */     //   98: getfield 38	facade/util/Point3D:y	F
/*     */     //   101: aload 4
/*     */     //   103: getfield 41	facade/util/Point3D:z	F
/*     */     //   106: invokespecial 108	facade/characters/wmedef/ObjectPickupRotationWME:<init>	(IIFFF)V
/*     */     //   109: invokevirtual 111	abl/runtime/BehavingEntity:addWME	(Lwm/WME;)V
/*     */     //   112: goto +7 -> 119
/*     */     //   115: aload 5
/*     */     //   117: monitorexit
/*     */     //   118: athrow
/*     */     //   119: aload_0
/*     */     //   120: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   123: dup
/*     */     //   124: astore 5
/*     */     //   126: monitorenter
/*     */     //   127: new 19	java/lang/Integer
/*     */     //   130: dup
/*     */     //   131: aload_2
/*     */     //   132: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   135: iload_3
/*     */     //   136: aaload
/*     */     //   137: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   140: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   143: astore 7
/*     */     //   145: aload_0
/*     */     //   146: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   149: aload 7
/*     */     //   151: invokevirtual 119	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   154: pop
/*     */     //   155: aload_0
/*     */     //   156: getfield 18	facade/sensor/ObjectPickupRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   159: aload 7
/*     */     //   161: aload 4
/*     */     //   163: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   166: pop
/*     */     //   167: aload 5
/*     */     //   169: monitorexit
/*     */     //   170: iinc 3 1
/*     */     //   173: iload_3
/*     */     //   174: aload_2
/*     */     //   175: getfield 96	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   178: arraylength
/*     */     //   179: if_icmplt -174 -> 5
/*     */     //   182: return
/*     */     // Line number table:
/*     */     //   Java source line #99	-> byte code offset #0
/*     */     //   Java source line #99	-> byte code offset #0
/*     */     //   Java source line #100	-> byte code offset #5
/*     */     //   Java source line #101	-> byte code offset #41
/*     */     //   Java source line #102	-> byte code offset #60
/*     */     //   Java source line #103	-> byte code offset #74
/*     */     //   Java source line #106	-> byte code offset #112
/*     */     //   Java source line #107	-> byte code offset #127
/*     */     //   Java source line #108	-> byte code offset #145
/*     */     //   Java source line #109	-> byte code offset #155
/*     */     //   Java source line #99	-> byte code offset #170
/*     */     //   Java source line #99	-> byte code offset #173
/*     */     //   Java source line #113	-> byte code offset #182
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	183	0	this	ObjectPickupRotationSensor
/*     */     //   0	183	1	paramInt	int
/*     */     //   0	183	2	paramObjectSensePacket	facade.util.ObjectSensePacket
/*     */     //   1	179	3	i	int
/*     */     //   39	123	4	localPoint3D	facade.util.Point3D
/*     */     //   115	53	5	Ljava/lang/Object;	Object
/*     */     //   143	17	7	localInteger	Integer
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   115	118	115	finally
/*     */     //   127	170	115	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ObjectPickupRotationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */