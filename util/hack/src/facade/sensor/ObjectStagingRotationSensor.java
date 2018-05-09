/*     */ package facade.sensor;
/*     */ 
/*     */ import abl.runtime.BehavingEntity;
/*     */ import facade.characters.wmedef.ObjectStagingRotationWME;
/*     */ import facade.nativeinterface.NativeAnimationInterface;
/*     */ import facade.util.ObjectSensePacket;
/*     */ import facade.util.ObjectSensePacket.ObjectSenseInfo;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class ObjectStagingRotationSensor
/*     */   extends FacadeSensor
/*     */   implements facade.util.SpriteID
/*     */ {
/*     */   protected static final float tolerance = 0.1F;
/*     */   private Hashtable lastRotations;
/*     */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.ObjectStagingRotationSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*  18 */   private final void jdMethod_this() { this.lastRotations = new Hashtable(); }
/*     */   
/*  20 */   public ObjectStagingRotationSensor() { jdMethod_this(); }
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
/*     */   public void senseOneShot(Object[] paramArrayOfObject)
/*     */   {
/*  45 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) { throw new AssertionError("args.length == 0 in ObjectStagingRotationSensor.senseOneShot()");
/*     */     }
/*  47 */     ObjectSensePacket localObjectSensePacket = new ObjectSensePacket();
/*  48 */     NativeAnimationInterface.getAllObjectStagingRotations(localObjectSensePacket);
/*  49 */     deleteAllOldWMEs();
/*  50 */     addAllRotationWMEs(localObjectSensePacket);
/*     */   }
/*     */   
/*     */   private final void addAllRotationWMEs(ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*  55 */     for (int i = 0; i < paramObjectSensePacket.info.length; i++) {
/*  56 */       BehavingEntity.getBehavingEntity().addWME(new ObjectStagingRotationWME(paramObjectSensePacket.info[i].objectID, paramObjectSensePacket.info[i].x, paramObjectSensePacket.info[i].y, paramObjectSensePacket.info[i].z));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final synchronized void deleteOldWMEs(int paramInt)
/*     */   {
/*  64 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectStagingRotationWME").toArray();
/*  65 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  66 */       if (((ObjectStagingRotationWME)arrayOfObject[i]).getObjectID() == paramInt) {
/*  67 */         BehavingEntity.getBehavingEntity().deleteWME((ObjectStagingRotationWME)arrayOfObject[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final synchronized void deleteAllOldWMEs()
/*     */   {
/*  74 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectStagingRotationWME").toArray();
/*  75 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  76 */       BehavingEntity.getBehavingEntity().deleteWME((ObjectStagingRotationWME)arrayOfObject[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void initializeContinuous(Object[] paramArrayOfObject) {
/*  81 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) { throw new AssertionError("args.length == 0 in ObjectStagingRotationSensor.senseOneShot()");
/*     */     }
/*     */     
/*  84 */     ObjectSensePacket localObjectSensePacket = new ObjectSensePacket();
/*  85 */     NativeAnimationInterface.getAllObjectStagingRotations(localObjectSensePacket);
/*  86 */     deleteAllOldWMEs();
/*  87 */     addAllRotationWMEs(localObjectSensePacket);
/*  88 */     updateLastRotations(localObjectSensePacket);
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
/*     */   public void senseContinuous(Object[] paramArrayOfObject)
/*     */   {
/* 121 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) { throw new AssertionError("args.length == 0 in ObjectStagingRotationSensor.senseOneShot()");
/*     */     }
/*     */     
/* 124 */     ObjectSensePacket localObjectSensePacket = new ObjectSensePacket();
/* 125 */     NativeAnimationInterface.getAllObjectStagingRotations(localObjectSensePacket);
/* 126 */     updateLastRotationsConditionally(localObjectSensePacket);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   protected boolean changed(int paramInt, facade.util.Point3D paramPoint3D)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   17: new 22	java/lang/Integer
/*     */     //   20: dup
/*     */     //   21: iload_1
/*     */     //   22: invokespecial 27	java/lang/Integer:<init>	(I)V
/*     */     //   25: invokevirtual 31	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   28: checkcast 34	facade/util/Point3D
/*     */     //   31: astore 6
/*     */     //   33: aload 6
/*     */     //   35: ifnull +107 -> 142
/*     */     //   38: aload_2
/*     */     //   39: getfield 38	facade/util/Point3D:x	F
/*     */     //   42: aload 6
/*     */     //   44: getfield 38	facade/util/Point3D:x	F
/*     */     //   47: fsub
/*     */     //   48: ldc 9
/*     */     //   50: fcmpl
/*     */     //   51: ifgt +83 -> 134
/*     */     //   54: aload 6
/*     */     //   56: getfield 38	facade/util/Point3D:x	F
/*     */     //   59: aload_2
/*     */     //   60: getfield 38	facade/util/Point3D:x	F
/*     */     //   63: fsub
/*     */     //   64: ldc 9
/*     */     //   66: fcmpl
/*     */     //   67: ifgt +67 -> 134
/*     */     //   70: aload_2
/*     */     //   71: getfield 41	facade/util/Point3D:y	F
/*     */     //   74: aload 6
/*     */     //   76: getfield 41	facade/util/Point3D:y	F
/*     */     //   79: fsub
/*     */     //   80: ldc 9
/*     */     //   82: fcmpl
/*     */     //   83: ifgt +51 -> 134
/*     */     //   86: aload 6
/*     */     //   88: getfield 41	facade/util/Point3D:y	F
/*     */     //   91: aload_2
/*     */     //   92: getfield 41	facade/util/Point3D:y	F
/*     */     //   95: fsub
/*     */     //   96: ldc 9
/*     */     //   98: fcmpl
/*     */     //   99: ifgt +35 -> 134
/*     */     //   102: aload_2
/*     */     //   103: getfield 44	facade/util/Point3D:z	F
/*     */     //   106: aload 6
/*     */     //   108: getfield 44	facade/util/Point3D:z	F
/*     */     //   111: fsub
/*     */     //   112: ldc 9
/*     */     //   114: fcmpl
/*     */     //   115: ifgt +19 -> 134
/*     */     //   118: aload 6
/*     */     //   120: getfield 44	facade/util/Point3D:z	F
/*     */     //   123: aload_2
/*     */     //   124: getfield 44	facade/util/Point3D:z	F
/*     */     //   127: fsub
/*     */     //   128: ldc 9
/*     */     //   130: fcmpl
/*     */     //   131: ifle +7 -> 138
/*     */     //   134: iconst_1
/*     */     //   135: aload_3
/*     */     //   136: monitorexit
/*     */     //   137: ireturn
/*     */     //   138: iconst_0
/*     */     //   139: aload_3
/*     */     //   140: monitorexit
/*     */     //   141: ireturn
/*     */     //   142: iconst_1
/*     */     //   143: aload_3
/*     */     //   144: monitorexit
/*     */     //   145: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #27	-> byte code offset #0
/*     */     //   Java source line #28	-> byte code offset #13
/*     */     //   Java source line #29	-> byte code offset #33
/*     */     //   Java source line #30	-> byte code offset #38
/*     */     //   Java source line #36	-> byte code offset #134
/*     */     //   Java source line #38	-> byte code offset #138
/*     */     //   Java source line #40	-> byte code offset #142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	146	0	this	ObjectStagingRotationSensor
/*     */     //   0	146	1	paramInt	int
/*     */     //   0	146	2	paramPoint3D	facade.util.Point3D
/*     */     //   3	1	3	localObject1	Object
/*     */     //   11	133	3	Ljava/lang/Object;	Object
/*     */     //   31	88	6	localPoint3D	facade.util.Point3D
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	137	3	finally
/*     */     //   138	141	3	finally
/*     */     //   142	145	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   private final void updateLastRotations(ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_2
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: iconst_0
/*     */     //   14: istore 4
/*     */     //   16: goto +82 -> 98
/*     */     //   19: new 22	java/lang/Integer
/*     */     //   22: dup
/*     */     //   23: aload_1
/*     */     //   24: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   27: iload 4
/*     */     //   29: aaload
/*     */     //   30: getfield 88	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   33: invokespecial 27	java/lang/Integer:<init>	(I)V
/*     */     //   36: astore 5
/*     */     //   38: aload_0
/*     */     //   39: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   42: aload 5
/*     */     //   44: invokevirtual 127	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   47: pop
/*     */     //   48: aload_0
/*     */     //   49: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   52: aload 5
/*     */     //   54: new 34	facade/util/Point3D
/*     */     //   57: dup
/*     */     //   58: aload_1
/*     */     //   59: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   62: iload 4
/*     */     //   64: aaload
/*     */     //   65: getfield 91	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   68: aload_1
/*     */     //   69: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   72: iload 4
/*     */     //   74: aaload
/*     */     //   75: getfield 92	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   78: aload_1
/*     */     //   79: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   82: iload 4
/*     */     //   84: aaload
/*     */     //   85: getfield 93	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   88: invokespecial 130	facade/util/Point3D:<init>	(FFF)V
/*     */     //   91: invokevirtual 134	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   94: pop
/*     */     //   95: iinc 4 1
/*     */     //   98: iload 4
/*     */     //   100: aload_1
/*     */     //   101: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   104: arraylength
/*     */     //   105: if_icmplt -86 -> 19
/*     */     //   108: aload_2
/*     */     //   109: monitorexit
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line #93	-> byte code offset #0
/*     */     //   Java source line #94	-> byte code offset #13
/*     */     //   Java source line #94	-> byte code offset #13
/*     */     //   Java source line #95	-> byte code offset #19
/*     */     //   Java source line #96	-> byte code offset #38
/*     */     //   Java source line #97	-> byte code offset #48
/*     */     //   Java source line #94	-> byte code offset #95
/*     */     //   Java source line #94	-> byte code offset #98
/*     */     //   Java source line #100	-> byte code offset #110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	111	0	this	ObjectStagingRotationSensor
/*     */     //   0	111	1	paramObjectSensePacket	ObjectSensePacket
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
/*     */   private final void updateLastRotationsConditionally(ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_2
/*     */     //   2: goto +162 -> 164
/*     */     //   5: new 34	facade/util/Point3D
/*     */     //   8: dup
/*     */     //   9: aload_1
/*     */     //   10: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   13: iload_2
/*     */     //   14: aaload
/*     */     //   15: getfield 91	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   18: aload_1
/*     */     //   19: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   22: iload_2
/*     */     //   23: aaload
/*     */     //   24: getfield 92	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   27: aload_1
/*     */     //   28: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   31: iload_2
/*     */     //   32: aaload
/*     */     //   33: getfield 93	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   36: invokespecial 130	facade/util/Point3D:<init>	(FFF)V
/*     */     //   39: astore_3
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   45: iload_2
/*     */     //   46: aaload
/*     */     //   47: getfield 88	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   50: aload_3
/*     */     //   51: invokevirtual 137	facade/sensor/ObjectStagingRotationSensor:changed	(ILfacade/util/Point3D;)Z
/*     */     //   54: ifeq +107 -> 161
/*     */     //   57: aload_0
/*     */     //   58: aload_1
/*     */     //   59: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   62: iload_2
/*     */     //   63: aaload
/*     */     //   64: getfield 88	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   67: invokespecial 139	facade/sensor/ObjectStagingRotationSensor:deleteOldWMEs	(I)V
/*     */     //   70: invokestatic 76	abl/runtime/BehavingEntity:getBehavingEntity	()Labl/runtime/BehavingEntity;
/*     */     //   73: new 79	facade/characters/wmedef/ObjectStagingRotationWME
/*     */     //   76: dup
/*     */     //   77: aload_1
/*     */     //   78: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   81: iload_2
/*     */     //   82: aaload
/*     */     //   83: getfield 88	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   86: aload_3
/*     */     //   87: getfield 38	facade/util/Point3D:x	F
/*     */     //   90: aload_3
/*     */     //   91: getfield 41	facade/util/Point3D:y	F
/*     */     //   94: aload_3
/*     */     //   95: getfield 44	facade/util/Point3D:z	F
/*     */     //   98: invokespecial 96	facade/characters/wmedef/ObjectStagingRotationWME:<init>	(IFFF)V
/*     */     //   101: invokevirtual 100	abl/runtime/BehavingEntity:addWME	(Lwm/WME;)V
/*     */     //   104: goto +7 -> 111
/*     */     //   107: aload 4
/*     */     //   109: monitorexit
/*     */     //   110: athrow
/*     */     //   111: aload_0
/*     */     //   112: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   115: dup
/*     */     //   116: astore 4
/*     */     //   118: monitorenter
/*     */     //   119: new 22	java/lang/Integer
/*     */     //   122: dup
/*     */     //   123: aload_1
/*     */     //   124: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   127: iload_2
/*     */     //   128: aaload
/*     */     //   129: getfield 88	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   132: invokespecial 27	java/lang/Integer:<init>	(I)V
/*     */     //   135: astore 6
/*     */     //   137: aload_0
/*     */     //   138: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   141: aload 6
/*     */     //   143: invokevirtual 127	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   146: pop
/*     */     //   147: aload_0
/*     */     //   148: getfield 21	facade/sensor/ObjectStagingRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   151: aload 6
/*     */     //   153: aload_3
/*     */     //   154: invokevirtual 134	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   157: pop
/*     */     //   158: aload 4
/*     */     //   160: monitorexit
/*     */     //   161: iinc 2 1
/*     */     //   164: iload_2
/*     */     //   165: aload_1
/*     */     //   166: getfield 84	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   169: arraylength
/*     */     //   170: if_icmplt -165 -> 5
/*     */     //   173: return
/*     */     // Line number table:
/*     */     //   Java source line #104	-> byte code offset #0
/*     */     //   Java source line #104	-> byte code offset #0
/*     */     //   Java source line #105	-> byte code offset #5
/*     */     //   Java source line #106	-> byte code offset #40
/*     */     //   Java source line #107	-> byte code offset #57
/*     */     //   Java source line #108	-> byte code offset #70
/*     */     //   Java source line #110	-> byte code offset #104
/*     */     //   Java source line #111	-> byte code offset #119
/*     */     //   Java source line #112	-> byte code offset #137
/*     */     //   Java source line #113	-> byte code offset #147
/*     */     //   Java source line #104	-> byte code offset #161
/*     */     //   Java source line #104	-> byte code offset #164
/*     */     //   Java source line #118	-> byte code offset #173
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	174	0	this	ObjectStagingRotationSensor
/*     */     //   0	174	1	paramObjectSensePacket	ObjectSensePacket
/*     */     //   1	170	2	i	int
/*     */     //   39	115	3	localPoint3D	facade.util.Point3D
/*     */     //   107	52	4	Ljava/lang/Object;	Object
/*     */     //   135	17	6	localInteger	Integer
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   107	110	107	finally
/*     */     //   119	161	107	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ObjectStagingRotationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */