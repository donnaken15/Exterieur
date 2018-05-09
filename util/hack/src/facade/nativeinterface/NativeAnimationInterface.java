/*    */ package facade.nativeinterface;
/*    */ 
/*    */ import facade.primact.DoFullExpressionBaseAnimation;
/*    */ import facade.primact.PushMultipleAnimationScripts;
/*    */ import facade.primact.ReactiveWalk;
/*    */ import facade.primact.Walk;
/*    */ import facade.util.FloatRef;
/*    */ import facade.util.HeldObjectSensePacket;
/*    */ import facade.util.IntegerRef;
/*    */ import facade.util.ObjectSensePacket;
/*    */ import facade.util.Point3D;
/*    */ 
/*    */ public class NativeAnimationInterface implements facade.util.SpriteID
/*    */ {
/* 15 */   static PushMultipleAnimationScripts asyncActInstance = new PushMultipleAnimationScripts();
/*    */   
/*    */   static
/*    */   {
/* 19 */     System.loadLibrary("nativeAnimInterface");
/*    */   }
/*    */   
/* 22 */   private static long lastTripSMCallTime = 0L;
/* 23 */   private static long lastGraceSMCallTime = 0L;
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
/*    */   public static void facadeDecisionCycleSMCall(int paramInt)
/*    */   {
/* 39 */     processCompletedActions(paramInt, asyncActInstance);
/*    */   }
/*    */   
/*    */ 
/*    */   public static void tripDecisionCycleSMCall()
/*    */   {
/* 45 */     if (System.currentTimeMillis() - lastTripSMCallTime > 33L)
/*    */     {
/* 47 */       lastTripSMCallTime = System.currentTimeMillis();
/* 48 */       facadeDecisionCycleSMCall(1);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public static void graceDecisionCycleSMCall()
/*    */   {
/* 55 */     if (System.currentTimeMillis() - lastGraceSMCallTime > 33L)
/*    */     {
/* 57 */       lastGraceSMCallTime = System.currentTimeMillis();
/* 58 */       facadeDecisionCycleSMCall(0);
/*    */     }
/*    */   }
/*    */   
/*    */   public static native void resetCharacterState(int paramInt);
/*    */   
/*    */   public static native void resetObjectActivation(int paramInt);
/*    */   
/*    */   public static native void resetAllObjectActivations();
/*    */   
/*    */   public static native void processCompletedActions(int paramInt, PushMultipleAnimationScripts paramPushMultipleAnimationScripts);
/*    */   
/*    */   public static native void setObjectPosition(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
/*    */   
/*    */   public static native void setObjectRotation(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
/*    */   
/*    */   public static native void pushMultipleAnimationScripts(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, PushMultipleAnimationScripts paramPushMultipleAnimationScripts);
/*    */   
/*    */   public static native void pushAnimationUScript(int paramInt1, int paramInt2, int paramInt3, PushMultipleAnimationScripts paramPushMultipleAnimationScripts);
/*    */   
/*    */   public static native void pushPoseScript(int paramInt1, int paramInt2, facade.primact.PushPoseScript paramPushPoseScript);
/*    */   
/*    */   public static native void doGestureAnimation(int paramInt1, int paramInt2, int paramInt3, facade.primact.DoGestureAnimation paramDoGestureAnimation);
/*    */   
/*    */   public static native void doPickupObjGestureAnimation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, facade.primact.DoPickupObjGestureAnimation paramDoPickupObjGestureAnimation);
/*    */   
/*    */   public static native void doPutdownObjGestureAnimation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt6, facade.primact.DoPutdownObjGestureAnimation paramDoPutdownObjGestureAnimation);
/*    */   
/*    */   public static native void doFullExpressionBaseAnimation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, DoFullExpressionBaseAnimation paramDoFullExpressionBaseAnimation);
/*    */   
/*    */   public static native void doFullExpressionMoodAnimation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, facade.primact.DoFullExpressionMoodAnimation paramDoFullExpressionMoodAnimation);
/*    */   
/*    */   public static native void abortAnimationScripts(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void setGazeTracking(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   public static native void setEyelidHeightL(int paramInt, float paramFloat1, float paramFloat2);
/*    */   
/*    */   public static native void setEyelidHeightR(int paramInt, float paramFloat1, float paramFloat2);
/*    */   
/*    */   public static native void setBrowShapeL(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void setBrowShapeR(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void setMouthShape(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void miscLittleAction(int paramInt1, int paramInt2, int paramInt3, float paramFloat);
/*    */   
/*    */   public static native void setObjectToHold(int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native void walkStep(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Point3D paramPoint3D, Walk paramWalk);
/*    */   
/*    */   public static native void reactiveWalkStep(int paramInt1, int paramInt2, boolean paramBoolean, ReactiveWalk paramReactiveWalk);
/*    */   
/*    */   public static native void abortWalkStep(int paramInt);
/*    */   
/*    */   public static native void turnInPlace(int paramInt, float paramFloat, facade.primact.Turn paramTurn);
/*    */   
/*    */   public static native void abortTurnInPlace(int paramInt);
/*    */   
/*    */   public static native void music(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void setAnimEngineInfo(int paramInt1, int paramInt2);
/*    */   
/*    */   public static native void setPerformanceInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28, int paramInt29, int paramInt30, int paramInt31, int paramInt32, int paramInt33, int paramInt34, int paramInt35, int paramInt36, int paramInt37, int paramInt38, int paramInt39, int paramInt40, int paramInt41, int paramInt42, int paramInt43, int paramInt44, int paramInt45, int paramInt46, int paramInt47, int paramInt48, int paramInt49, int paramInt50, int paramInt51, int paramInt52, int paramInt53, int paramInt54, int paramInt55, int paramInt56, int paramInt57, int paramInt58, int paramInt59, int paramInt60, int paramInt61, int paramInt62, int paramInt63, int paramInt64, int paramInt65, int paramInt66, int paramInt67, int paramInt68, int paramInt69, int paramInt70, int paramInt71, int paramInt72, int paramInt73, int paramInt74, int paramInt75, int paramInt76, int paramInt77, int paramInt78, int paramInt79, int paramInt80, int paramInt81, int paramInt82, int paramInt83, int paramInt84, int paramInt85);
/*    */   
/*    */   public static native void dprintf(String paramString);
/*    */   
/*    */   public static native void addEventInfoToLog(String paramString);
/*    */   
/*    */   public static native void getObjectPosition(int paramInt, Point3D paramPoint3D);
/*    */   
/*    */   public static native void getObjectRotation(int paramInt, Point3D paramPoint3D);
/*    */   
/*    */   public static native void getObjectState(int paramInt, IntegerRef paramIntegerRef);
/*    */   
/*    */   public static native void getAllObjectRotations(ObjectSensePacket paramObjectSensePacket);
/*    */   
/*    */   public static native void getAllObjectStagingRotations(ObjectSensePacket paramObjectSensePacket);
/*    */   
/*    */   public static native void getAllObjectPositions(ObjectSensePacket paramObjectSensePacket);
/*    */   
/*    */   public static native void getAllObjectPickupRotations(int paramInt, ObjectSensePacket paramObjectSensePacket);
/*    */   
/*    */   public static native void getAllObjectPickupPositions(int paramInt, ObjectSensePacket paramObjectSensePacket);
/*    */   
/*    */   public static native void getGazeTracking(int paramInt, IntegerRef paramIntegerRef);
/*    */   
/*    */   public static native void getEyelidHeightL(int paramInt, FloatRef paramFloatRef);
/*    */   
/*    */   public static native void getEyelidHeightR(int paramInt, FloatRef paramFloatRef);
/*    */   
/*    */   public static native void getBrowShapeL(int paramInt, IntegerRef paramIntegerRef);
/*    */   
/*    */   public static native void getBrowShapeR(int paramInt, IntegerRef paramIntegerRef);
/*    */   
/*    */   public static native void getMouthShape(int paramInt, IntegerRef paramIntegerRef);
/*    */   
/*    */   public static native void getAllHeldObjects(HeldObjectSensePacket paramHeldObjectSensePacket);
/*    */   
/*    */   public static native int getTickCount();
/*    */   
/*    */   public static native String textSensor();
/*    */   
/*    */   public static native void getPlayerGesture(IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3);
/*    */   
/*    */   public static native void getMyCopyOfAllAnimCues(int paramInt, facade.util.AnimCueSensePacket paramAnimCueSensePacket);
/*    */   
/*    */   public static native void resetMyCopyOfAllAnimCues(int paramInt);
/*    */   
/*    */   public static native void getMyCopyOfAllObjectActivations(int paramInt, facade.util.ObjectActivationSensePacket paramObjectActivationSensePacket);
/*    */   
/*    */   public static native void resetMyCopyOfAllObjectActivations(int paramInt);
/*    */   
/*    */   public static native void getObjectPickupPosition(int paramInt1, int paramInt2, Point3D paramPoint3D);
/*    */   
/*    */   public static native void getAllObjectStates(facade.util.ObjectStateSensePacket paramObjectStateSensePacket);
/*    */   
/*    */   public static native void getArmGestureBases(int paramInt, IntegerRef paramIntegerRef1, IntegerRef paramIntegerRef2, IntegerRef paramIntegerRef3);
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\nativeinterface\NativeAnimationInterface.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */