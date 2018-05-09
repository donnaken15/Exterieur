/*     */ package facade.util;
/*     */ 
/*     */ import java.util.Random;
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
/*     */ public class Staging
/*     */   implements SpriteID, BeatConstants
/*     */ {
/*  19 */   private static final boolean $noassert = Class.forName("[Lfacade.util.Staging;").getComponentType().desiredAssertionStatus() ^ true; private static final Random randomGen = new Random();
/*     */   
/*     */   private static final float degreesPerRadian = 57.29747F;
/*     */   
/*     */   private static final float radiansPerDegree = 0.017452778F;
/*     */   
/*     */   private static final float pi = 3.1415F;
/*     */   private static final float tooFarAwayToCareIfBlockedByOtherCharacter = 1000.0F;
/*     */   private static final float playerViewConeAngle = 35.0F;
/*     */   private static final float sharingAngle = 20.0F;
/*     */   
/*     */   public static void getConversationPosition(boolean paramBoolean1, boolean paramBoolean2, BooleanRef paramBooleanRef, float paramFloat1, boolean paramBoolean3, float paramFloat2, Point3D paramPoint3D1, float paramFloat3, Point3D paramPoint3D2, Point3D paramPoint3D3, FloatRef paramFloatRef1, boolean paramBoolean4, Point3D paramPoint3D4, Point3D paramPoint3D5, FloatRef paramFloatRef2, boolean paramBoolean5)
/*     */   {
/*  32 */     Point3D localPoint3D = new Point3D();
/*     */     
/*     */ 
/*     */ 
/*  36 */     paramFloat3 = AdjustPlayerPtAndRotToAvoidFurniture(paramPoint3D1, paramFloat3);
/*     */     
/*     */ 
/*  39 */     if (paramFloat1 >= 35.0F) paramFloat1 = randRange(paramFloat1 - 3, paramFloat1 + 3); else {
/*  40 */       paramFloat1 = randRange(paramFloat1 - 1.0F, paramFloat1 + 1.0F);
/*     */     }
/*     */     
/*  43 */     if (paramFloat1 < 30.0F) { paramFloat1 = 30.0F;
/*     */     }
/*     */     
/*  46 */     if (!paramBoolean3)
/*     */     {
/*     */ 
/*  49 */       f1 = randRange(-3.0F, 3);
/*     */ 
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/*     */ 
/*  56 */       if ((!paramBoolean4) && (!paramBoolean5)) {
/*  57 */         boolean bool = paramBoolean2;
/*  58 */         float f2 = normalizeNeg180to180(getAngleRelativeToPlayer(paramPoint3D2, paramPoint3D1, paramFloat3));
/*  59 */         float f3 = normalizeNeg180to180(getAngleRelativeToPlayer(paramPoint3D4, paramPoint3D1, paramFloat3));
/*     */         
/*     */ 
/*  62 */         if (((f2 > 0.0F) && (f3 < 0.0F)) || ((f2 < 0.0F) && (f3 > 0.0F)))
/*     */         {
/*  64 */           if (f2 > 0.0F) paramBoolean2 = false; else {
/*  65 */             paramBoolean2 = true;
/*     */           }
/*     */           
/*     */         }
/*  69 */         else if (f2 > 0.0F) {
/*  70 */           if (f2 > f3) paramBoolean2 = true; else {
/*  71 */             paramBoolean2 = false;
/*     */           }
/*     */         }
/*  74 */         else if (f2 > f3) paramBoolean2 = false; else {
/*  75 */           paramBoolean2 = true;
/*     */         }
/*     */       }
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
/*  92 */       if (((paramBoolean2) && (paramBoolean1)) || ((!paramBoolean2) && (!paramBoolean1))) {
/*  93 */         f1 = -20.0F + randRange(-2.0F, 2.0F);
/*     */       }
/*     */       else
/*     */       {
/*  97 */         f1 = 20.0F + randRange(-2.0F, 2.0F);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 102 */     localPoint3D = conversationPositionComputation(paramFloat1, f1, paramPoint3D1, paramFloat3);
/*     */     
/*     */ 
/* 105 */     float f1 = getXZAngleBetweenPoints(paramPoint3D1, localPoint3D) + 180.0F;
/*     */     
/*     */ 
/* 108 */     if (((paramBoolean2) && (paramBoolean1)) || ((!paramBoolean2) && (!paramBoolean1))) {
/* 109 */       f1 = normalize0to360(f1 + paramFloat2);
/*     */     } else {
/* 111 */       f1 = normalize0to360(f1 - paramFloat2);
/*     */     }
/*     */     
/*     */ 
/* 115 */     if (paramBoolean1) {
/* 116 */       paramPoint3D3.x = localPoint3D.x;
/* 117 */       paramPoint3D3.y = localPoint3D.y;
/* 118 */       paramPoint3D3.z = localPoint3D.z;
/* 119 */       paramFloatRef1.f = f1;
/*     */     }
/*     */     else {
/* 122 */       paramPoint3D5.x = localPoint3D.x;
/* 123 */       paramPoint3D5.y = localPoint3D.y;
/* 124 */       paramPoint3D5.z = localPoint3D.z;
/* 125 */       paramFloatRef2.f = f1;
/*     */     }
/*     */     
/*     */ 
/* 129 */     paramBooleanRef.b = paramBoolean2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Point3D conversationPositionComputation(float paramFloat1, float paramFloat2, Point3D paramPoint3D, float paramFloat3)
/*     */   {
/* 138 */     paramFloat2 = normalize0to360(paramFloat2 + paramFloat3);
/* 139 */     paramFloat2 = convertWorldDegreesToRadians(paramFloat2);
/*     */     
/* 141 */     Point3D localPoint3D = new Point3D();
/* 142 */     localPoint3D.x = paramPoint3D.x;
/* 143 */     localPoint3D.z = paramPoint3D.z; Point3D 
/*     */     
/* 145 */       tmp41_39 = localPoint3D;tmp41_39.x = ((float)(tmp41_39.x + paramFloat1 * Math.cos(paramFloat2))); Point3D 
/* 146 */       tmp61_59 = localPoint3D;tmp61_59.z = ((float)(tmp61_59.z + paramFloat1 * Math.sin(paramFloat2)));
/*     */     
/* 148 */     return localPoint3D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static Point3D pointAtAngleAndDist(float paramFloat1, float paramFloat2, Point3D paramPoint3D)
/*     */   {
/* 155 */     paramFloat2 = normalize0to360(paramFloat2);
/* 156 */     paramFloat2 = convertWorldDegreesToRadians(paramFloat2);
/*     */     
/* 158 */     Point3D localPoint3D = new Point3D();
/* 159 */     localPoint3D.x = paramPoint3D.x;
/* 160 */     localPoint3D.z = paramPoint3D.z; Point3D 
/*     */     
/* 162 */       tmp35_34 = localPoint3D;tmp35_34.x = ((float)(tmp35_34.x + paramFloat1 * Math.cos(paramFloat2))); Point3D 
/* 163 */       tmp54_53 = localPoint3D;tmp54_53.z = ((float)(tmp54_53.z + paramFloat1 * Math.sin(paramFloat2)));
/*     */     
/* 165 */     return localPoint3D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void updateWalkToPtToRadiusEdge(Point3D paramPoint3D1, Point3D paramPoint3D2, float paramFloat, Point3D paramPoint3D3)
/*     */   {
/* 172 */     float f = getXZAngleBetweenPoints(paramPoint3D1, paramPoint3D2);
/* 173 */     Point3D localPoint3D = new Point3D();
/* 174 */     localPoint3D = conversationPositionComputation(paramFloat, f, paramPoint3D1, 0.0F);
/*     */     
/* 176 */     paramPoint3D3.x = localPoint3D.x;
/* 177 */     paramPoint3D3.y = localPoint3D.y;
/* 178 */     paramPoint3D3.z = localPoint3D.z;
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
/*     */   public static boolean isPointWithinCharCone(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
/*     */   {
/* 193 */     float f1 = getXZDistanceBetweenPoints(paramFloat3, paramFloat4, paramFloat1, paramFloat2);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */     if ((f1 < paramFloat7) || (f1 > paramFloat8)) { return false;
/*     */     }
/*     */     
/* 206 */     float f2 = getXZAngleBetweenPoints(paramFloat3, paramFloat4, paramFloat1, paramFloat2);
/*     */     
/* 208 */     float f3 = normalizeNeg180to180(f2 - paramFloat5);
/*     */     
/* 210 */     if (Math.abs(f3) > paramFloat6) { return false;
/*     */     }
/* 212 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float getAngleRelativeToPlayer(Point3D paramPoint3D1, Point3D paramPoint3D2, float paramFloat)
/*     */   {
/* 219 */     float f1 = getXZAngleBetweenPoints(paramPoint3D2, paramPoint3D1);
/* 220 */     float f2 = normalizeNeg180to180(f1 - paramFloat);
/* 221 */     return f2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float getXZDistanceBetweenPoints(Point3D paramPoint3D1, Point3D paramPoint3D2)
/*     */   {
/* 228 */     return getXZDistanceBetweenPoints(paramPoint3D1.x, paramPoint3D1.z, paramPoint3D2.x, paramPoint3D2.z);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float getXZDistanceBetweenPoints(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/*     */   {
/* 235 */     float f1 = paramFloat1 - paramFloat3;
/* 236 */     float f2 = paramFloat2 - paramFloat4;
/* 237 */     return (float)Math.sqrt(f1 * f1 + f2 * f2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float getXZAngleBetweenPoints(Point3D paramPoint3D1, Point3D paramPoint3D2)
/*     */   {
/* 245 */     return getXZAngleBetweenPoints(paramPoint3D1.x, paramPoint3D1.z, paramPoint3D2.x, paramPoint3D2.z);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float getXZAngleBetweenPoints(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/*     */   {
/* 253 */     float f1 = paramFloat3 - paramFloat1;
/* 254 */     float f2 = paramFloat4 - paramFloat2;
/* 255 */     float f3 = (float)Math.atan2(f2, f1) * 57.29747F;
/*     */     
/*     */ 
/* 258 */     f3 = normalizeNeg180to180(f3 + 90.0F);
/* 259 */     return f3;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float normalizeNeg180to180(float paramFloat)
/*     */   {
/* 266 */     while (paramFloat > 180.0F) paramFloat -= 360.0F;
/* 267 */     while (paramFloat < -180.0F) paramFloat += 360.0F;
/* 268 */     return paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float normalize0to360(float paramFloat)
/*     */   {
/* 275 */     while (paramFloat >= 360.0F) paramFloat -= 360.0F;
/* 276 */     while (paramFloat < 0.0F) paramFloat += 360.0F;
/* 277 */     return paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float convertWorldDegreesToRadians(float paramFloat)
/*     */   {
/* 285 */     return normalize0to360(paramFloat - 90.0F) * 0.017452778F;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static int randRange(int paramInt1, int paramInt2)
/*     */   {
/* 292 */     if ((!$noassert) && (paramInt2 <= paramInt1)) { throw new AssertionError();
/*     */     }
/* 294 */     int i = paramInt2 - paramInt1 + 1;
/* 295 */     int j = randomGen.nextInt(i);
/* 296 */     return j + paramInt1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float randRange(float paramFloat1, float paramFloat2)
/*     */   {
/* 303 */     if ((!$noassert) && (paramFloat2 <= paramFloat1)) { throw new AssertionError();
/*     */     }
/*     */     
/* 306 */     float f = randomGen.nextFloat();
/*     */     
/* 308 */     return paramFloat1 + (paramFloat2 - paramFloat1) * f;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static boolean percentChance(int paramInt)
/*     */   {
/* 315 */     if ((!$noassert) && ((paramInt < 0) || (paramInt > 100))) throw new AssertionError();
/* 316 */     if (randomGen.nextInt(101) < paramInt) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float AdjustPlayerPtAndRotToAvoidFurniture(Point3D paramPoint3D, float paramFloat)
/*     */   {
/* 326 */     float f1 = paramPoint3D.x;
/* 327 */     float f2 = paramPoint3D.z;
/* 328 */     float f3 = normalize0to360(paramFloat);
/* 329 */     float f4 = 60.0F;
/* 330 */     float f5 = -475.0F;
/* 331 */     float f6 = -165.0F;
/* 332 */     float f7 = -200.0F;
/* 333 */     float f8 = -115.0F;
/* 334 */     float f9 = 75.0F;
/* 335 */     float f10 = 135.0F;
/* 336 */     float f11 = -435.0F;
/* 337 */     float f12 = 70.0F;
/*     */     
/* 339 */     float f13 = 35.0F;
/* 340 */     float f14 = 0.0F + f13;
/* 341 */     float f15 = 0.0F - f13;
/* 342 */     float f16 = 180.0F - f13;
/* 343 */     float f17 = 180.0F + f13;
/* 344 */     float f18 = 90.0F - f13;
/* 345 */     float f19 = 90.0F + f13;
/* 346 */     float f20 = 270.0F + f13;
/* 347 */     float f21 = 270.0F - f13;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */     if ((f1 < f6 + f4) && (f2 < f7))
/*     */     {
/* 359 */       if (f1 < f6) { paramPoint3D.x = f6;
/*     */       }
/*     */       
/* 362 */       if (f2 < f5 + f4) { paramFloat = f16;
/*     */ 
/*     */       }
/* 365 */       else if (f2 > f7 - f4) { paramFloat = f14;
/*     */ 
/*     */ 
/*     */       }
/* 369 */       else if ((f3 <= 45.0F) || (f3 >= 135.0F))
/*     */       {
/*     */ 
/* 372 */         if ((f3 > 90.0F) && (f3 < 270.0F)) paramFloat = f16; else {
/* 373 */           paramFloat = f14;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 378 */     else if ((f2 < f5 + f4) && (f1 < f12))
/*     */     {
/* 380 */       if (f2 < f5) { paramPoint3D.z = f5;
/*     */       }
/*     */       
/* 383 */       if (f1 > f12 - f4) { paramFloat = f17;
/*     */ 
/*     */ 
/*     */       }
/* 387 */       else if ((f3 <= 135.0F) || (f3 >= 225.0F))
/*     */       {
/*     */ 
/* 390 */         if ((f3 > 0.0F) && (f3 < 180.0F)) paramFloat = f19; else {
/* 391 */           paramFloat = f21;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 396 */     else if ((f2 < f11 + f4) && (f1 > f12 - f4))
/*     */     {
/* 398 */       if (f1 > f10) { paramPoint3D.x = f10;
/*     */       }
/*     */       
/* 401 */       if ((f3 <= 135.0F) || (f3 >= 315.0F))
/*     */       {
/*     */ 
/* 404 */         if ((f3 > 45.0F) && (f3 <= 135.0F)) paramFloat = 135.0F; else {
/* 405 */           paramFloat = 315.0F;
/*     */         }
/*     */       }
/*     */     }
/* 409 */     else if ((f1 > f10 - f4) && (f2 < f9))
/*     */     {
/* 411 */       if (f1 > f10) { paramPoint3D.x = f10;
/*     */       }
/*     */       
/* 414 */       if (f2 < f11 + f4) { paramFloat = f17;
/*     */ 
/*     */       }
/* 417 */       else if (f2 > f9 - f4) { paramFloat = f15;
/*     */ 
/*     */ 
/*     */       }
/* 421 */       else if ((f3 <= 225.0F) || (f3 >= 315.0F))
/*     */       {
/*     */ 
/* 424 */         if ((f3 > 90.0F) && (f3 < 270.0F)) paramFloat = f17; else {
/* 425 */           paramFloat = f15;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 430 */     else if (f2 > f9 - f4)
/*     */     {
/* 432 */       if (f1 < f8) paramPoint3D.x = f8;
/* 433 */       if (f2 > f9) { paramPoint3D.z = f9;
/*     */       }
/*     */       
/* 436 */       if (f1 < f8 + f4) { paramFloat = f14;
/*     */ 
/*     */ 
/*     */       }
/* 440 */       else if ((f3 <= 315.0F) && (f3 >= 45.0F))
/*     */       {
/*     */ 
/* 443 */         if ((f3 > 0.0F) && (f3 < 180.0F)) paramFloat = f18; else {
/* 444 */           paramFloat = f20;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 449 */     else if ((f1 < f8 + f4) && (f2 >= f7))
/*     */     {
/* 451 */       if (f1 < f8) { paramPoint3D.x = f8;
/*     */       }
/*     */       
/*     */ 
/* 455 */       if ((f3 <= 45.0F) || (f3 >= 135.0F))
/*     */       {
/*     */ 
/* 458 */         if ((f3 > 90.0F) && (f3 < 270.0F)) paramFloat = f16; else {
/* 459 */           paramFloat = f14;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/* 464 */     else if ((f2 > f7 - f4) && (f1 < f8 + f4))
/*     */     {
/* 466 */       if (f1 < f8) { paramPoint3D.x = f8;
/*     */       }
/*     */       
/* 469 */       if ((f3 <= 315.0F) && (f3 >= 225.0F))
/*     */       {
/*     */ 
/* 472 */         if ((f3 > 45.0F) && (f3 < 225.0F)) paramFloat = 135.0F; else {
/* 473 */           paramFloat = 315.0F;
/*     */         }
/*     */       }
/*     */     }
/* 477 */     return normalize0to360(paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\Staging.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */