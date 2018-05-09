/*     */ package facade.util;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BeatHelperFxns
/*     */   implements SpriteID, BeatConstants, DAType, BeatID
/*     */ {
/*  13 */   private static final boolean $noassert = Class.forName("[Lfacade.util.BeatHelperFxns;").getComponentType().desiredAssertionStatus() ^ true; private static final Random randGen = new Random();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int getDecoratingObjectToLookAt()
/*     */   {
/*  20 */     int i = randGen.nextInt(3);
/*  21 */     if (i == 0) return 34;
/*  22 */     if (i == 1) return 6;
/*  23 */     return 38;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int mapObjSatlToBuggedChr(int paramInt)
/*     */   {
/*  31 */     if ((paramInt == 80) || (paramInt == 85) || (paramInt == 92) || (paramInt == 88) || (paramInt == 97) || (paramInt == 81) || (paramInt == 83) || (paramInt == 84) || (paramInt == 89) || (paramInt == 86) || (paramInt == 87) || (paramInt == 93) || (paramInt == 94) || (paramInt == 71) || (paramInt == 74) || (paramInt == 73) || (paramInt == 98))
/*     */     {
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
/*  48 */       return 0;
/*     */     }
/*  50 */     if ((paramInt == 95) || (paramInt == 90) || (paramInt == 91) || (paramInt == 72) || (paramInt == 82) || (paramInt == 96) || (paramInt == 75))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */       return 1;
/*     */     }
/*     */     
/*  63 */     StringUtil.println("### Error: unknown obj or satl in mapObjSatlToBuggedChr");
/*  64 */     if (!$noassert) throw new AssertionError();
/*  65 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int mapBeatIDToStoryID(int paramInt)
/*     */   {
/*  76 */     if (((paramInt >= 9) && (paramInt <= 11)) || ((paramInt >= 17) && (paramInt <= 18)))
/*     */     {
/*  78 */       return 59;
/*     */     }
/*  80 */     if (((paramInt >= 12) && (paramInt <= 13)) || ((paramInt >= 19) && (paramInt <= 20)))
/*     */     {
/*  82 */       return 60;
/*     */     }
/*  84 */     if (((paramInt >= 14) && (paramInt <= 16)) || ((paramInt >= 21) && (paramInt <= 22)) || (paramInt == 29))
/*     */     {
/*     */ 
/*  87 */       return 61;
/*     */     }
/*     */     
/*  90 */     return 58;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static int mapSpriteIDToDAObjectParam(int paramInt)
/*     */   {
/*  97 */     int i = -1;
/*  98 */     switch (paramInt) {
/*  99 */     case 3:  i = 80; break;
/* 100 */     case 4:  i = 81; break;
/* 101 */     case 5:  i = 82; break;
/* 102 */     case 6:  i = 85; break;
/* 103 */     case 7:  i = 86; break;
/*     */     case 12: case 13: 
/*     */     case 14: 
/*     */     case 15: 
/*     */     case 16: 
/*     */     case 17: 
/*     */     case 20: 
/*     */     case 21: 
/*     */     case 22: 
/* 112 */       i = 87; break;
/* 113 */     case 33:  i = 82; break;
/*     */     case 34: case 35: 
/*     */     case 36: 
/* 116 */       i = 88; break;
/* 117 */     case 38:  i = 90; break;
/* 118 */     case 39:  i = 91; break;
/*     */     case 40: case 41: 
/*     */     case 42: 
/*     */     case 43: 
/*     */     case 44: 
/*     */     case 45: 
/* 124 */       i = 82; break;
/* 125 */     case 24:  i = 96; break;
/* 126 */     case 46:  i = 93; break;
/* 127 */     case 23:  i = 95; break;
/*     */     case 25: case 26: 
/*     */     case 27: 
/*     */     case 28: 
/*     */     case 29: 
/*     */     case 30: 
/*     */     case 31: 
/*     */     case 32: 
/* 135 */       i = 92; break;
/* 136 */     case 11:  i = 99;
/*     */     }
/* 138 */     return i;
/*     */   }
/*     */   
/*     */   public static int mapDAObjectParamToStoryTopic(int paramInt)
/*     */   {
/* 143 */     switch (paramInt) {
/*     */     case 80: 
/*     */     case 81: 
/*     */     case 82: 
/*     */     case 84: 
/*     */     case 85: 
/*     */     case 88: 
/*     */     case 89: 
/*     */     case 90: 
/*     */     case 92: 
/*     */     case 93: 
/*     */     case 94: 
/*     */     case 97: 
/* 156 */       return 59;
/*     */     
/*     */     case 86: 
/*     */     case 87: 
/* 160 */       return 60;
/*     */     
/*     */     case 91: 
/* 163 */       return 61;
/*     */     }
/* 165 */     return 58;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static boolean isAASubtopic(int paramInt)
/*     */   {
/* 172 */     if ((paramInt == 97) || (paramInt == 80) || (paramInt == 85) || (paramInt == 92) || (paramInt == 93) || (paramInt == 88) || (paramInt == 90))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       return true;
/*     */     }
/* 181 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\BeatHelperFxns.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */