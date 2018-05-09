/*     */ package facade.util;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GestureMapping
/*     */   implements GraceScript, TripScript, BeatConstants, SpriteID, GestureBodyPart
/*     */ {
/*  10 */   private static final Random randomGen = new Random();
/*     */   
/*     */ 
/*     */ 
/*     */   public static boolean IsEmphasisMotion(int paramInt1, int paramInt2)
/*     */   {
/*  16 */     if (paramInt1 == 0) {
/*  17 */       switch (paramInt2)
/*     */       {
/*     */       case 70: 
/*     */       case 71: 
/*     */       case 72: 
/*     */       case 73: 
/*     */       case 74: 
/*     */       case 75: 
/*     */       case 120: 
/*     */       case 121: 
/*     */       case 125: 
/*     */       case 126: 
/*     */       case 130: 
/*     */       case 131: 
/*     */       case 135: 
/*     */       case 136: 
/*  33 */         return true;
/*     */       }
/*     */       
/*  36 */     } else if (paramInt1 == 1) {
/*  37 */       switch (paramInt2)
/*     */       {
/*     */       case 89: 
/*     */       case 90: 
/*     */       case 91: 
/*     */       case 92: 
/*     */       case 93: 
/*     */       case 94: 
/*     */       case 95: 
/*     */       case 96: 
/*     */       case 97: 
/*     */       case 98: 
/*     */       case 99: 
/*     */       case 100: 
/*     */       case 101: 
/*     */       case 111: 
/*     */       case 112: 
/*     */       case 113: 
/*     */       case 114: 
/*     */       case 115: 
/*     */       case 116: 
/*     */       case 202: 
/*     */       case 203: 
/*     */       case 207: 
/*     */       case 208: 
/*     */       case 212: 
/*     */       case 213: 
/*     */       case 217: 
/*     */       case 218: 
/*  66 */         return true;
/*     */       }
/*     */       
/*     */     }
/*  70 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean IsEmphasisMotionOrHold(int paramInt1, int paramInt2)
/*     */   {
/*  79 */     if (IsEmphasisMotion(paramInt1, paramInt2)) { return true;
/*     */     }
/*  81 */     if (paramInt1 == 0) {
/*  82 */       switch (paramInt2)
/*     */       {
/*     */       case 86: 
/*     */       case 92: 
/*     */       case 119: 
/*     */       case 124: 
/*     */       case 129: 
/*     */       case 134: 
/*  90 */         return true;
/*     */       }
/*     */       
/*  93 */     } else if (paramInt1 == 1) {
/*  94 */       switch (paramInt2)
/*     */       {
/*     */       case 69: 
/*     */       case 72: 
/*     */       case 75: 
/*     */       case 78: 
/*     */       case 84: 
/*     */       case 106: 
/*     */       case 201: 
/*     */       case 206: 
/*     */       case 211: 
/*     */       case 216: 
/* 106 */         return true;
/*     */       }
/*     */       
/*     */     }
/* 110 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int GetGestureMappingCategory(int paramInt1, int paramInt2)
/*     */   {
/* 118 */     if (paramInt1 == 0) {
/* 119 */       switch (paramInt2) {
/*     */       case 52: 
/*     */       case 53: 
/*     */       case 54: 
/*     */       case 55: 
/*     */       case 56: 
/*     */       case 57: 
/*     */       case 58: 
/*     */       case 59: 
/*     */       case 60: 
/*     */       case 61: 
/*     */       case 62: 
/*     */       case 63: 
/*     */       case 64: 
/*     */       case 65: 
/*     */       case 66: 
/*     */       case 67: 
/*     */       case 68: 
/*     */       case 69: 
/* 138 */         return 1;
/*     */       }
/*     */       
/* 141 */     } else if (paramInt1 == 1) {
/* 142 */       switch (paramInt2) {
/*     */       case 117: 
/*     */       case 118: 
/*     */       case 119: 
/*     */       case 120: 
/*     */       case 121: 
/*     */       case 122: 
/*     */       case 123: 
/*     */       case 124: 
/*     */       case 125: 
/*     */       case 126: 
/*     */       case 127: 
/*     */       case 128: 
/*     */       case 129: 
/*     */       case 130: 
/*     */       case 131: 
/*     */       case 132: 
/*     */       case 133: 
/*     */       case 134: 
/*     */       case 135: 
/*     */       case 136: 
/*     */       case 137: 
/*     */       case 138: 
/*     */       case 139: 
/*     */       case 140: 
/*     */       case 141: 
/*     */       case 142: 
/*     */       case 143: 
/*     */       case 144: 
/*     */       case 145: 
/*     */       case 146: 
/*     */       case 147: 
/*     */       case 148: 
/*     */       case 149: 
/*     */       case 150: 
/*     */       case 151: 
/*     */       case 152: 
/*     */       case 153: 
/*     */       case 154: 
/*     */       case 155: 
/*     */       case 156: 
/*     */       case 157: 
/* 184 */         return 0;
/*     */       
/*     */       case 158: 
/*     */       case 162: 
/*     */       case 163: 
/*     */       case 164: 
/*     */       case 165: 
/*     */       case 166: 
/*     */       case 167: 
/*     */       case 168: 
/*     */       case 169: 
/*     */       case 170: 
/*     */       case 171: 
/*     */       case 172: 
/*     */       case 173: 
/*     */       case 174: 
/*     */       case 180: 
/*     */       case 181: 
/*     */       case 182: 
/*     */       case 183: 
/*     */       case 184: 
/*     */       case 185: 
/*     */       case 186: 
/*     */       case 187: 
/*     */       case 188: 
/*     */       case 189: 
/*     */       case 190: 
/*     */       case 191: 
/*     */       case 192: 
/*     */       case 193: 
/*     */       case 194: 
/*     */       case 195: 
/*     */       case 196: 
/*     */       case 197: 
/*     */       case 198: 
/*     */       case 199: 
/* 220 */         return 1;
/*     */       }
/*     */       
/*     */     }
/* 224 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static int MapEmphasisGesture(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 231 */     if (paramInt1 != 0)
/*     */     {
/* 233 */       if (paramInt1 == 1)
/*     */       {
/* 235 */         if ((paramInt3 == 1) && (IsEmphasisMotion(paramInt1, paramInt4)))
/*     */         {
/*     */ 
/* 238 */           if (paramInt2 == 1) {
/* 239 */             return 197 + randomGen.nextInt(3);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 244 */     return -2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int MapOrSuppressGestureBecauseHoldingObj(int paramInt1, int paramInt2)
/*     */   {
/* 252 */     int i = -2;
/*     */     
/* 254 */     if (paramInt1 != 0)
/*     */     {
/* 256 */       if (paramInt1 == 1) {
/* 257 */         switch (paramInt2) {
/* 258 */         case 175:  i = 180; break;
/* 259 */         case 176:  i = 181; break;
/* 260 */         case 177:  i = 182; break;
/* 261 */         case 178:  i = 183; break;
/* 262 */         case 179:  i = 184;
/*     */         }
/*     */       }
/*     */     }
/* 266 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int MapArmLRGesture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 276 */     if (paramInt3 < 0) { return paramInt3;
/*     */     }
/*     */     
/*     */     int i;
/* 280 */     if (paramInt2 == 0) {
/* 281 */       i = GetGestureMappingCategory(paramInt1, paramInt4);
/* 282 */     } else if (paramInt2 == 1) {
/* 283 */       i = GetGestureMappingCategory(paramInt1, paramInt5);
/* 284 */     } else if (paramInt2 == 2) {
/* 285 */       i = GetGestureMappingCategory(paramInt1, paramInt6);
/*     */     } else {
/* 287 */       return paramInt3;
/*     */     }
/*     */     
/*     */ 
/* 291 */     boolean bool = IsEmphasisMotionOrHold(paramInt1, paramInt3);
/*     */     
/*     */ 
/* 294 */     int j = GetGestureMappingCategory(paramInt1, paramInt3);
/*     */     
/*     */ 
/*     */ 
/* 298 */     int k = paramInt3;
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
/* 309 */     if ((i == -1) || (j != i))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */       if (i == 1)
/*     */       {
/*     */ 
/* 318 */         if (!bool) {
/* 319 */           k = MapOrSuppressGestureBecauseHoldingObj(paramInt1, paramInt3);
/* 320 */           if (k != -2) StringUtil.println(paramInt1 + " mapped gesture " + paramInt3 + " to holding-obj version " + k); else {
/* 321 */             StringUtil.println(paramInt1 + " suppressing non-emph gesture " + paramInt3 + " because holding object");
/*     */           }
/*     */         }
/*     */         else {
/* 325 */           k = MapEmphasisGesture(paramInt1, paramInt2, i, paramInt3);
/* 326 */           StringUtil.println(paramInt1 + " mapping emph gesture " + paramInt3 + " to " + k);
/*     */         }
/*     */       }
/*     */     }
/* 330 */     return k;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\GestureMapping.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */