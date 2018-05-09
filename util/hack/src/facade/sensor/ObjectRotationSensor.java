/*     */ package facade.sensor;
/*     */ 
/*     */ import abl.runtime.BehavingEntity;
/*     */ import facade.characters.wmedef.ObjectRotationWME;
/*     */ import facade.util.ObjectSensePacket;
/*     */ import facade.util.ObjectSensePacket.ObjectSenseInfo;
/*     */ import facade.util.Point3D;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ public class ObjectRotationSensor
/*     */   extends FacadeSensor
/*     */   implements facade.util.SpriteID
/*     */ {
/*     */   protected static final float tolerance = 0.1F;
/*     */   private java.util.Hashtable lastRotations;
/*     */   
/*  17 */   private final void jdMethod_this() { this.lastRotations = new java.util.Hashtable(); }
/*     */   
/*  19 */   public ObjectRotationSensor() { jdMethod_this(); }
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
/*     */     Object localObject;
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
/*  44 */     if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0)) {
/*  45 */       localObject = new Point3D();
/*  46 */       int i = ((Integer)paramArrayOfObject[0]).intValue();
/*  47 */       facade.nativeinterface.NativeAnimationInterface.getObjectRotation(i, (Point3D)localObject);
/*  48 */       deleteOldWMEs(i);
/*  49 */       BehavingEntity.getBehavingEntity().addWME(new ObjectRotationWME(i, ((Point3D)localObject).x, ((Point3D)localObject).y, ((Point3D)localObject).z));
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/*     */ 
/*  55 */       localObject = new ObjectSensePacket();
/*  56 */       facade.nativeinterface.NativeAnimationInterface.getAllObjectRotations((ObjectSensePacket)localObject);
/*  57 */       deleteAllOldWMEs();
/*  58 */       addAllRotationWMEs((ObjectSensePacket)localObject);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void addAllRotationWMEs(ObjectSensePacket paramObjectSensePacket)
/*     */   {
/*  64 */     for (int i = 0; i < paramObjectSensePacket.info.length; i++) {
/*  65 */       BehavingEntity.getBehavingEntity().addWME(new ObjectRotationWME(paramObjectSensePacket.info[i].objectID, paramObjectSensePacket.info[i].x, paramObjectSensePacket.info[i].y, paramObjectSensePacket.info[i].z));
/*     */     }
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
/*     */   private final synchronized void deleteOldWMEs(int paramInt)
/*     */   {
/* 138 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME").toArray();
/* 139 */     for (int i = 0; i < arrayOfObject.length; i++) {
/* 140 */       if (((ObjectRotationWME)arrayOfObject[i]).getObjectID() == paramInt) {
/* 141 */         BehavingEntity.getBehavingEntity().deleteWME((ObjectRotationWME)arrayOfObject[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final synchronized void deleteAllOldWMEs()
/*     */   {
/* 148 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME").toArray();
/* 149 */     for (int i = 0; i < arrayOfObject.length; i++) {
/* 150 */       BehavingEntity.getBehavingEntity().deleteWME((ObjectRotationWME)arrayOfObject[i]);
/*     */     }
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
/*     */   public synchronized void addSpecificRotationWME(int paramInt)
/*     */   {
/* 242 */     Object[] arrayOfObject = BehavingEntity.getBehavingEntity().lookupWME("ObjectRotationWME").toArray();
/* 243 */     ObjectRotationWME localObjectRotationWME = null;
/* 244 */     for (int i = 0; i < arrayOfObject.length; i++) {
/* 245 */       if (((ObjectRotationWME)arrayOfObject[i]).getObjectID() == paramInt) {
/* 246 */         localObjectRotationWME = (ObjectRotationWME)arrayOfObject[i];
/* 247 */         break;
/*     */       }
/*     */     }
/*     */     
/* 251 */     if (localObjectRotationWME != null) {
/* 252 */       switch (paramInt)
/*     */       {
/*     */ 
/*     */       case 2: 
/* 256 */         BehavingEntity.getBehavingEntity().deleteAllWMEClass("PlayerRotationWME");
/* 257 */         BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.PlayerRotationWME(localObjectRotationWME.getX(), localObjectRotationWME.getY(), localObjectRotationWME.getZ()));
/*     */       }
/*     */       
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   protected boolean changed(int paramInt, Point3D paramPoint3D)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: goto +6 -> 6
/*     */     //   3: aload_3
/*     */     //   4: monitorexit
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   10: dup
/*     */     //   11: astore_3
/*     */     //   12: monitorenter
/*     */     //   13: aload_0
/*     */     //   14: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   17: new 19	java/lang/Integer
/*     */     //   20: dup
/*     */     //   21: iload_1
/*     */     //   22: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   25: invokevirtual 28	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   28: checkcast 31	facade/util/Point3D
/*     */     //   31: astore 6
/*     */     //   33: aload 6
/*     */     //   35: ifnull +107 -> 142
/*     */     //   38: aload_2
/*     */     //   39: getfield 35	facade/util/Point3D:x	F
/*     */     //   42: aload 6
/*     */     //   44: getfield 35	facade/util/Point3D:x	F
/*     */     //   47: fsub
/*     */     //   48: ldc 9
/*     */     //   50: fcmpl
/*     */     //   51: ifgt +83 -> 134
/*     */     //   54: aload 6
/*     */     //   56: getfield 35	facade/util/Point3D:x	F
/*     */     //   59: aload_2
/*     */     //   60: getfield 35	facade/util/Point3D:x	F
/*     */     //   63: fsub
/*     */     //   64: ldc 9
/*     */     //   66: fcmpl
/*     */     //   67: ifgt +67 -> 134
/*     */     //   70: aload_2
/*     */     //   71: getfield 38	facade/util/Point3D:y	F
/*     */     //   74: aload 6
/*     */     //   76: getfield 38	facade/util/Point3D:y	F
/*     */     //   79: fsub
/*     */     //   80: ldc 9
/*     */     //   82: fcmpl
/*     */     //   83: ifgt +51 -> 134
/*     */     //   86: aload 6
/*     */     //   88: getfield 38	facade/util/Point3D:y	F
/*     */     //   91: aload_2
/*     */     //   92: getfield 38	facade/util/Point3D:y	F
/*     */     //   95: fsub
/*     */     //   96: ldc 9
/*     */     //   98: fcmpl
/*     */     //   99: ifgt +35 -> 134
/*     */     //   102: aload_2
/*     */     //   103: getfield 41	facade/util/Point3D:z	F
/*     */     //   106: aload 6
/*     */     //   108: getfield 41	facade/util/Point3D:z	F
/*     */     //   111: fsub
/*     */     //   112: ldc 9
/*     */     //   114: fcmpl
/*     */     //   115: ifgt +19 -> 134
/*     */     //   118: aload 6
/*     */     //   120: getfield 41	facade/util/Point3D:z	F
/*     */     //   123: aload_2
/*     */     //   124: getfield 41	facade/util/Point3D:z	F
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
/*     */     //   Java source line #26	-> byte code offset #0
/*     */     //   Java source line #27	-> byte code offset #13
/*     */     //   Java source line #28	-> byte code offset #33
/*     */     //   Java source line #29	-> byte code offset #38
/*     */     //   Java source line #35	-> byte code offset #134
/*     */     //   Java source line #37	-> byte code offset #138
/*     */     //   Java source line #39	-> byte code offset #142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	146	0	this	ObjectRotationSensor
/*     */     //   0	146	1	paramInt	int
/*     */     //   0	146	2	paramPoint3D	Point3D
/*     */     //   3	1	3	localObject1	Object
/*     */     //   11	133	3	Ljava/lang/Object;	Object
/*     */     //   31	88	6	localPoint3D	Point3D
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	5	3	finally
/*     */     //   13	137	3	finally
/*     */     //   138	141	3	finally
/*     */     //   142	145	3	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void initializeContinuous(Object[] paramArrayOfObject)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull +114 -> 115
/*     */     //   4: aload_1
/*     */     //   5: arraylength
/*     */     //   6: ifle +109 -> 115
/*     */     //   9: new 31	facade/util/Point3D
/*     */     //   12: dup
/*     */     //   13: invokespecial 46	facade/util/Point3D:<init>	()V
/*     */     //   16: astore_2
/*     */     //   17: aload_1
/*     */     //   18: iconst_0
/*     */     //   19: aaload
/*     */     //   20: checkcast 19	java/lang/Integer
/*     */     //   23: invokevirtual 50	java/lang/Integer:intValue	()I
/*     */     //   26: istore_3
/*     */     //   27: new 19	java/lang/Integer
/*     */     //   30: dup
/*     */     //   31: iload_3
/*     */     //   32: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   35: astore 4
/*     */     //   37: iload_3
/*     */     //   38: aload_2
/*     */     //   39: invokestatic 54	facade/nativeinterface/NativeAnimationInterface:getObjectRotation	(ILfacade/util/Point3D;)V
/*     */     //   42: aload_0
/*     */     //   43: iload_3
/*     */     //   44: invokespecial 59	facade/sensor/ObjectRotationSensor:deleteOldWMEs	(I)V
/*     */     //   47: invokestatic 63	abl/runtime/BehavingEntity:getBehavingEntity	()Labl/runtime/BehavingEntity;
/*     */     //   50: new 66	facade/characters/wmedef/ObjectRotationWME
/*     */     //   53: dup
/*     */     //   54: iload_3
/*     */     //   55: aload_2
/*     */     //   56: getfield 35	facade/util/Point3D:x	F
/*     */     //   59: aload_2
/*     */     //   60: getfield 38	facade/util/Point3D:y	F
/*     */     //   63: aload_2
/*     */     //   64: getfield 41	facade/util/Point3D:z	F
/*     */     //   67: invokespecial 70	facade/characters/wmedef/ObjectRotationWME:<init>	(IFFF)V
/*     */     //   70: invokevirtual 74	abl/runtime/BehavingEntity:addWME	(Lwm/WME;)V
/*     */     //   73: goto +7 -> 80
/*     */     //   76: aload 5
/*     */     //   78: monitorexit
/*     */     //   79: athrow
/*     */     //   80: aload_0
/*     */     //   81: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   84: dup
/*     */     //   85: astore 5
/*     */     //   87: monitorenter
/*     */     //   88: aload_0
/*     */     //   89: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   92: aload 4
/*     */     //   94: invokevirtual 122	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   97: pop
/*     */     //   98: aload_0
/*     */     //   99: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   102: aload 4
/*     */     //   104: aload_2
/*     */     //   105: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   108: pop
/*     */     //   109: aload 5
/*     */     //   111: monitorexit
/*     */     //   112: goto +29 -> 141
/*     */     //   115: new 75	facade/util/ObjectSensePacket
/*     */     //   118: dup
/*     */     //   119: invokespecial 77	facade/util/ObjectSensePacket:<init>	()V
/*     */     //   122: astore_2
/*     */     //   123: aload_2
/*     */     //   124: invokestatic 81	facade/nativeinterface/NativeAnimationInterface:getAllObjectRotations	(Lfacade/util/ObjectSensePacket;)V
/*     */     //   127: aload_0
/*     */     //   128: invokespecial 84	facade/sensor/ObjectRotationSensor:deleteAllOldWMEs	()V
/*     */     //   131: aload_0
/*     */     //   132: aload_2
/*     */     //   133: invokespecial 87	facade/sensor/ObjectRotationSensor:addAllRotationWMEs	(Lfacade/util/ObjectSensePacket;)V
/*     */     //   136: aload_0
/*     */     //   137: aload_2
/*     */     //   138: invokespecial 129	facade/sensor/ObjectRotationSensor:updateLastRotations	(Lfacade/util/ObjectSensePacket;)V
/*     */     //   141: return
/*     */     // Line number table:
/*     */     //   Java source line #155	-> byte code offset #0
/*     */     //   Java source line #157	-> byte code offset #9
/*     */     //   Java source line #158	-> byte code offset #17
/*     */     //   Java source line #159	-> byte code offset #27
/*     */     //   Java source line #160	-> byte code offset #37
/*     */     //   Java source line #162	-> byte code offset #42
/*     */     //   Java source line #163	-> byte code offset #47
/*     */     //   Java source line #166	-> byte code offset #73
/*     */     //   Java source line #167	-> byte code offset #88
/*     */     //   Java source line #168	-> byte code offset #98
/*     */     //   Java source line #174	-> byte code offset #115
/*     */     //   Java source line #175	-> byte code offset #123
/*     */     //   Java source line #176	-> byte code offset #127
/*     */     //   Java source line #177	-> byte code offset #131
/*     */     //   Java source line #178	-> byte code offset #136
/*     */     //   Java source line #181	-> byte code offset #141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	142	0	this	ObjectRotationSensor
/*     */     //   0	142	1	paramArrayOfObject	Object[]
/*     */     //   16	122	2	localObject1	Object
/*     */     //   26	29	3	i	int
/*     */     //   35	68	4	localInteger	Integer
/*     */     //   76	34	5	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   76	79	76	finally
/*     */     //   88	112	76	finally
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
/*     */     //   7: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   10: dup
/*     */     //   11: astore_2
/*     */     //   12: monitorenter
/*     */     //   13: iconst_0
/*     */     //   14: istore 4
/*     */     //   16: goto +82 -> 98
/*     */     //   19: new 19	java/lang/Integer
/*     */     //   22: dup
/*     */     //   23: aload_1
/*     */     //   24: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   27: iload 4
/*     */     //   29: aaload
/*     */     //   30: getfield 95	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   33: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   36: astore 5
/*     */     //   38: aload_0
/*     */     //   39: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   42: aload 5
/*     */     //   44: invokevirtual 122	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   47: pop
/*     */     //   48: aload_0
/*     */     //   49: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   52: aload 5
/*     */     //   54: new 31	facade/util/Point3D
/*     */     //   57: dup
/*     */     //   58: aload_1
/*     */     //   59: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   62: iload 4
/*     */     //   64: aaload
/*     */     //   65: getfield 98	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   68: aload_1
/*     */     //   69: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   72: iload 4
/*     */     //   74: aaload
/*     */     //   75: getfield 99	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   78: aload_1
/*     */     //   79: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   82: iload 4
/*     */     //   84: aaload
/*     */     //   85: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   88: invokespecial 132	facade/util/Point3D:<init>	(FFF)V
/*     */     //   91: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   94: pop
/*     */     //   95: iinc 4 1
/*     */     //   98: iload 4
/*     */     //   100: aload_1
/*     */     //   101: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   104: arraylength
/*     */     //   105: if_icmplt -86 -> 19
/*     */     //   108: aload_2
/*     */     //   109: monitorexit
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line #185	-> byte code offset #0
/*     */     //   Java source line #186	-> byte code offset #13
/*     */     //   Java source line #186	-> byte code offset #13
/*     */     //   Java source line #187	-> byte code offset #19
/*     */     //   Java source line #188	-> byte code offset #38
/*     */     //   Java source line #189	-> byte code offset #48
/*     */     //   Java source line #186	-> byte code offset #95
/*     */     //   Java source line #186	-> byte code offset #98
/*     */     //   Java source line #192	-> byte code offset #110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	111	0	this	ObjectRotationSensor
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
/*     */     //   5: new 31	facade/util/Point3D
/*     */     //   8: dup
/*     */     //   9: aload_1
/*     */     //   10: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   13: iload_2
/*     */     //   14: aaload
/*     */     //   15: getfield 98	facade/util/ObjectSensePacket$ObjectSenseInfo:x	F
/*     */     //   18: aload_1
/*     */     //   19: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   22: iload_2
/*     */     //   23: aaload
/*     */     //   24: getfield 99	facade/util/ObjectSensePacket$ObjectSenseInfo:y	F
/*     */     //   27: aload_1
/*     */     //   28: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   31: iload_2
/*     */     //   32: aaload
/*     */     //   33: getfield 100	facade/util/ObjectSensePacket$ObjectSenseInfo:z	F
/*     */     //   36: invokespecial 132	facade/util/Point3D:<init>	(FFF)V
/*     */     //   39: astore_3
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   45: iload_2
/*     */     //   46: aaload
/*     */     //   47: getfield 95	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   50: aload_3
/*     */     //   51: invokevirtual 135	facade/sensor/ObjectRotationSensor:changed	(ILfacade/util/Point3D;)Z
/*     */     //   54: ifeq +107 -> 161
/*     */     //   57: aload_0
/*     */     //   58: aload_1
/*     */     //   59: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   62: iload_2
/*     */     //   63: aaload
/*     */     //   64: getfield 95	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   67: invokespecial 59	facade/sensor/ObjectRotationSensor:deleteOldWMEs	(I)V
/*     */     //   70: invokestatic 63	abl/runtime/BehavingEntity:getBehavingEntity	()Labl/runtime/BehavingEntity;
/*     */     //   73: new 66	facade/characters/wmedef/ObjectRotationWME
/*     */     //   76: dup
/*     */     //   77: aload_1
/*     */     //   78: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   81: iload_2
/*     */     //   82: aaload
/*     */     //   83: getfield 95	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   86: aload_3
/*     */     //   87: getfield 35	facade/util/Point3D:x	F
/*     */     //   90: aload_3
/*     */     //   91: getfield 38	facade/util/Point3D:y	F
/*     */     //   94: aload_3
/*     */     //   95: getfield 41	facade/util/Point3D:z	F
/*     */     //   98: invokespecial 70	facade/characters/wmedef/ObjectRotationWME:<init>	(IFFF)V
/*     */     //   101: invokevirtual 74	abl/runtime/BehavingEntity:addWME	(Lwm/WME;)V
/*     */     //   104: goto +7 -> 111
/*     */     //   107: aload 4
/*     */     //   109: monitorexit
/*     */     //   110: athrow
/*     */     //   111: aload_0
/*     */     //   112: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   115: dup
/*     */     //   116: astore 4
/*     */     //   118: monitorenter
/*     */     //   119: new 19	java/lang/Integer
/*     */     //   122: dup
/*     */     //   123: aload_1
/*     */     //   124: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   127: iload_2
/*     */     //   128: aaload
/*     */     //   129: getfield 95	facade/util/ObjectSensePacket$ObjectSenseInfo:objectID	I
/*     */     //   132: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   135: astore 6
/*     */     //   137: aload_0
/*     */     //   138: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   141: aload 6
/*     */     //   143: invokevirtual 122	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   146: pop
/*     */     //   147: aload_0
/*     */     //   148: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   151: aload 6
/*     */     //   153: aload_3
/*     */     //   154: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   157: pop
/*     */     //   158: aload 4
/*     */     //   160: monitorexit
/*     */     //   161: iinc 2 1
/*     */     //   164: iload_2
/*     */     //   165: aload_1
/*     */     //   166: getfield 91	facade/util/ObjectSensePacket:info	[Lfacade/util/ObjectSensePacket$ObjectSenseInfo;
/*     */     //   169: arraylength
/*     */     //   170: if_icmplt -165 -> 5
/*     */     //   173: return
/*     */     // Line number table:
/*     */     //   Java source line #196	-> byte code offset #0
/*     */     //   Java source line #196	-> byte code offset #0
/*     */     //   Java source line #197	-> byte code offset #5
/*     */     //   Java source line #198	-> byte code offset #40
/*     */     //   Java source line #199	-> byte code offset #57
/*     */     //   Java source line #200	-> byte code offset #70
/*     */     //   Java source line #202	-> byte code offset #104
/*     */     //   Java source line #203	-> byte code offset #119
/*     */     //   Java source line #204	-> byte code offset #137
/*     */     //   Java source line #205	-> byte code offset #147
/*     */     //   Java source line #196	-> byte code offset #161
/*     */     //   Java source line #196	-> byte code offset #164
/*     */     //   Java source line #210	-> byte code offset #173
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	174	0	this	ObjectRotationSensor
/*     */     //   0	174	1	paramObjectSensePacket	ObjectSensePacket
/*     */     //   1	170	2	i	int
/*     */     //   39	115	3	localPoint3D	Point3D
/*     */     //   107	52	4	Ljava/lang/Object;	Object
/*     */     //   135	17	6	localInteger	Integer
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   107	110	107	finally
/*     */     //   119	161	107	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void senseContinuous(Object[] paramArrayOfObject)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull +123 -> 124
/*     */     //   4: aload_1
/*     */     //   5: arraylength
/*     */     //   6: ifle +118 -> 124
/*     */     //   9: new 31	facade/util/Point3D
/*     */     //   12: dup
/*     */     //   13: invokespecial 46	facade/util/Point3D:<init>	()V
/*     */     //   16: astore_2
/*     */     //   17: aload_1
/*     */     //   18: iconst_0
/*     */     //   19: aaload
/*     */     //   20: checkcast 19	java/lang/Integer
/*     */     //   23: invokevirtual 50	java/lang/Integer:intValue	()I
/*     */     //   26: istore_3
/*     */     //   27: new 19	java/lang/Integer
/*     */     //   30: dup
/*     */     //   31: iload_3
/*     */     //   32: invokespecial 24	java/lang/Integer:<init>	(I)V
/*     */     //   35: astore 4
/*     */     //   37: iload_3
/*     */     //   38: aload_2
/*     */     //   39: invokestatic 54	facade/nativeinterface/NativeAnimationInterface:getObjectRotation	(ILfacade/util/Point3D;)V
/*     */     //   42: aload_0
/*     */     //   43: iload_3
/*     */     //   44: aload_2
/*     */     //   45: invokevirtual 135	facade/sensor/ObjectRotationSensor:changed	(ILfacade/util/Point3D;)Z
/*     */     //   48: ifeq +73 -> 121
/*     */     //   51: aload_0
/*     */     //   52: iload_3
/*     */     //   53: invokespecial 59	facade/sensor/ObjectRotationSensor:deleteOldWMEs	(I)V
/*     */     //   56: invokestatic 63	abl/runtime/BehavingEntity:getBehavingEntity	()Labl/runtime/BehavingEntity;
/*     */     //   59: new 66	facade/characters/wmedef/ObjectRotationWME
/*     */     //   62: dup
/*     */     //   63: iload_3
/*     */     //   64: aload_2
/*     */     //   65: getfield 35	facade/util/Point3D:x	F
/*     */     //   68: aload_2
/*     */     //   69: getfield 38	facade/util/Point3D:y	F
/*     */     //   72: aload_2
/*     */     //   73: getfield 41	facade/util/Point3D:z	F
/*     */     //   76: invokespecial 70	facade/characters/wmedef/ObjectRotationWME:<init>	(IFFF)V
/*     */     //   79: invokevirtual 74	abl/runtime/BehavingEntity:addWME	(Lwm/WME;)V
/*     */     //   82: goto +7 -> 89
/*     */     //   85: aload 5
/*     */     //   87: monitorexit
/*     */     //   88: athrow
/*     */     //   89: aload_0
/*     */     //   90: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   93: dup
/*     */     //   94: astore 5
/*     */     //   96: monitorenter
/*     */     //   97: aload_0
/*     */     //   98: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   101: aload 4
/*     */     //   103: invokevirtual 122	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   106: pop
/*     */     //   107: aload_0
/*     */     //   108: getfield 18	facade/sensor/ObjectRotationSensor:lastRotations	Ljava/util/Hashtable;
/*     */     //   111: aload 4
/*     */     //   113: aload_2
/*     */     //   114: invokevirtual 126	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   117: pop
/*     */     //   118: aload 5
/*     */     //   120: monitorexit
/*     */     //   121: goto +20 -> 141
/*     */     //   124: new 75	facade/util/ObjectSensePacket
/*     */     //   127: dup
/*     */     //   128: invokespecial 77	facade/util/ObjectSensePacket:<init>	()V
/*     */     //   131: astore_2
/*     */     //   132: aload_2
/*     */     //   133: invokestatic 81	facade/nativeinterface/NativeAnimationInterface:getAllObjectRotations	(Lfacade/util/ObjectSensePacket;)V
/*     */     //   136: aload_0
/*     */     //   137: aload_2
/*     */     //   138: invokespecial 138	facade/sensor/ObjectRotationSensor:updateLastRotationsConditionally	(Lfacade/util/ObjectSensePacket;)V
/*     */     //   141: return
/*     */     // Line number table:
/*     */     //   Java source line #213	-> byte code offset #0
/*     */     //   Java source line #215	-> byte code offset #9
/*     */     //   Java source line #216	-> byte code offset #17
/*     */     //   Java source line #217	-> byte code offset #27
/*     */     //   Java source line #218	-> byte code offset #37
/*     */     //   Java source line #220	-> byte code offset #42
/*     */     //   Java source line #221	-> byte code offset #51
/*     */     //   Java source line #222	-> byte code offset #56
/*     */     //   Java source line #225	-> byte code offset #82
/*     */     //   Java source line #226	-> byte code offset #97
/*     */     //   Java source line #227	-> byte code offset #107
/*     */     //   Java source line #233	-> byte code offset #124
/*     */     //   Java source line #234	-> byte code offset #132
/*     */     //   Java source line #235	-> byte code offset #136
/*     */     //   Java source line #237	-> byte code offset #141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	142	0	this	ObjectRotationSensor
/*     */     //   0	142	1	paramArrayOfObject	Object[]
/*     */     //   16	122	2	localObject1	Object
/*     */     //   26	38	3	i	int
/*     */     //   35	77	4	localInteger	Integer
/*     */     //   85	34	5	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   85	88	85	finally
/*     */     //   97	121	85	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ObjectRotationSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */