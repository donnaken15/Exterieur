/*     */ package facade.util;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.util.Hashtable;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrintUtilities
/*     */   implements SpriteID, BeatConstants
/*     */ {
/*     */   private static final boolean isMarkerEnum(String paramString)
/*     */   {
/*  18 */     String str = paramString.substring(paramString.indexOf('_'));
/*  19 */     char[] arrayOfChar = str.toCharArray();
/*  20 */     for (int i = 0; i < arrayOfChar.length; i++) {
/*  21 */       if ((!Character.isUpperCase(arrayOfChar[i])) && (arrayOfChar[i] != '_') && (!Character.isDigit(arrayOfChar[i])))
/*  22 */         return false;
/*     */     }
/*  24 */     return true;
/*     */   }
/*     */   
/*     */ 
/*  28 */   private static final Hashtable tripScriptTable = new Hashtable(8000);
/*  29 */   private static final Hashtable graceScriptTable = new Hashtable(8000);
/*     */   
/*     */   static { Field[] arrayOfField;
/*     */     int i;
/*     */     String str;
/*  34 */     int j; try { Class localClass1 = Class.forName("facade.util.TripScript");
/*  35 */       arrayOfField = localClass1.getFields();
/*  36 */       for (i = 0; i < arrayOfField.length; i++) {
/*  37 */         str = arrayOfField[i].getName();
/*  38 */         if (!isMarkerEnum(str)) {
/*  39 */           j = arrayOfField[i].getInt(null);
/*  40 */           tripScriptTable.put(new Integer(j), str);
/*     */         }
/*     */       }
/*     */     } catch (Exception localException1) {
/*  44 */       StringUtil.println("Exception: " + localException1 + " in PrintUtilities.initTripScriptTable (static block)");
/*     */     }
/*     */     try
/*     */     {
/*  48 */       Class localClass2 = Class.forName("facade.util.GraceScript");
/*  49 */       arrayOfField = localClass2.getFields();
/*  50 */       for (i = 0; i < arrayOfField.length; i++) {
/*  51 */         str = arrayOfField[i].getName();
/*  52 */         if (!isMarkerEnum(str)) {
/*  53 */           j = arrayOfField[i].getInt(null);
/*  54 */           graceScriptTable.put(new Integer(j), str);
/*     */         }
/*     */       }
/*     */     } catch (Exception localException2) {
/*  58 */       StringUtil.println("Exception: " + localException2 + " in PrintUtilities.initTripScriptTable (static block)");
/*     */     }
/*     */   }
/*     */   
/*     */   public static String mapEnumToStringViaTable(int paramInt, String paramString)
/*     */   {
/*     */     Hashtable localHashtable;
/*  65 */     if (paramString.equals("facade.util.TripScript")) {
/*  66 */       localHashtable = tripScriptTable;
/*  67 */     } else if (paramString.equals("facade.util.GraceScript"))
/*  68 */       localHashtable = graceScriptTable; else {
/*  69 */       return null;
/*     */     }
/*  71 */     return (String)localHashtable.get(new Integer(paramInt));
/*     */   }
/*     */   
/*     */   public static String mapEnumToString(int paramInt, String paramString1, String paramString2)
/*     */   {
/*     */     try {
/*  77 */       Class localClass = Class.forName(paramString1);
/*  78 */       Field[] arrayOfField = localClass.getFields();
/*  79 */       for (int i = 0; i < arrayOfField.length; i++)
/*  80 */         if ((arrayOfField[i].getName().startsWith(paramString2)) && (!isMarkerEnum(arrayOfField[i].getName())) && (arrayOfField[i].getInt(null) == paramInt))
/*     */         {
/*     */ 
/*  83 */           return arrayOfField[i].getName(); }
/*  84 */       return null;
/*     */     } catch (Exception localException) {
/*  86 */       StringUtil.println("Exception: " + localException + " in PrintUtilities.mapEnumToString()"); }
/*  87 */     return null;
/*     */   }
/*     */   
/*     */   public static int mapStringToEnum(String paramString1, String paramString2)
/*     */   {
/*     */     try
/*     */     {
/*  94 */       Class localClass = Class.forName(paramString2);
/*  95 */       Field[] arrayOfField = localClass.getFields();
/*  96 */       for (int i = 0; i < arrayOfField.length; i++)
/*  97 */         if (arrayOfField[i].getName().equals(paramString1))
/*  98 */           return arrayOfField[i].getInt(null);
/*  99 */       return Integer.MIN_VALUE;
/*     */     } catch (Exception localException) {
/* 101 */       StringUtil.println("Exception: " + localException + " in PrintUtilities.mapStringToEnum()"); }
/* 102 */     return Integer.MIN_VALUE;
/*     */   }
/*     */   
/*     */ 
/*     */   public static List getEnumNames(String paramString1, String paramString2)
/*     */   {
/* 108 */     Vector localVector = new Vector();
/*     */     try
/*     */     {
/* 111 */       Class localClass = Class.forName(paramString1);
/* 112 */       Field[] arrayOfField = localClass.getFields();
/* 113 */       for (int i = 0; i < arrayOfField.length; i++)
/* 114 */         if ((arrayOfField[i].getName().startsWith(paramString2)) && (!isMarkerEnum(arrayOfField[i].getName())))
/*     */         {
/* 116 */           localVector.add(arrayOfField[i].getName()); }
/* 117 */       return localVector;
/*     */     } catch (Exception localException) {
/* 119 */       StringUtil.println("Exception: " + localException + " in PrintUtilities.getEnumNames()"); }
/* 120 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public static List getEnumNamesInSubrange(String paramString1, String paramString2, int paramInt1, int paramInt2)
/*     */   {
/* 126 */     Vector localVector = new Vector();
/*     */     try
/*     */     {
/* 129 */       Class localClass = Class.forName(paramString1);
/* 130 */       Field[] arrayOfField = localClass.getFields();
/* 131 */       for (int i = 0; i < arrayOfField.length; i++)
/* 132 */         if ((arrayOfField[i].getName().startsWith(paramString2)) && (!isMarkerEnum(arrayOfField[i].getName())) && (arrayOfField[i].getInt(null) >= paramInt1) && (arrayOfField[i].getInt(null) <= paramInt2))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 137 */           localVector.add(arrayOfField[i].getName()); }
/* 138 */       return localVector;
/*     */     } catch (Exception localException) {
/* 140 */       StringUtil.println("Exception: " + localException + " in PrintUtilities.getEnumNames()"); }
/* 141 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public static String bodyResource_EnumToString(int paramInt)
/*     */   {
/* 147 */     return mapEnumToString(paramInt, "facade.util.BodyResource", "eBodyResourceID");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */   public static String daHandledStatus_EnumToString(int paramInt) { return mapEnumToString(paramInt, "facade.util.DAType", "eDAHandledStatus"); }
/*     */   
/* 156 */   public static int daHandledStatus_StringToEnum(String paramString) { return mapStringToEnum(paramString, "facade.util.DAType"); }
/*     */   
/*     */   public static String[] daHandledStatus_GetEnumArray() {
/* 159 */     List localList = getEnumNames("facade.util.DAType", "eDAHandledStatus");
/* 160 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String daType_EnumToString(int paramInt)
/*     */   {
/* 166 */     if (paramInt == -1) {
/* 167 */       return "eDAMiscParam_NOPARAM";
/*     */     }
/* 169 */     return mapEnumToString(paramInt, "facade.util.DAType", "eDAType"); }
/*     */   
/* 171 */   public static int daType_StringToEnum(String paramString) { return mapStringToEnum(paramString, "facade.util.DAType"); }
/*     */   
/*     */   public static String[] daType_GetEnumArray() {
/* 174 */     Vector localVector = new Vector();
/* 175 */     localVector.add("eDAMiscParam_NOPARAM");
/* 176 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAType"));
/* 177 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String spriteID_EnumToString(int paramInt)
/*     */   {
/* 183 */     if (paramInt == -1) {
/* 184 */       return "eSpriteID_NOTASPRITE";
/*     */     }
/* 186 */     return mapEnumToString(paramInt, "facade.util.SpriteID", "eSpriteID");
/*     */   }
/*     */   
/* 189 */   public static int spriteID_StringToEnum(String paramString) { return mapStringToEnum(paramString, "facade.util.SpriteID"); }
/*     */   
/*     */   public static String[] spriteID_GetEnumArray() {
/* 192 */     Vector localVector = new Vector();
/* 193 */     localVector.add("eSpriteID_NOTASPRITE");
/* 194 */     localVector.addAll(getEnumNames("facade.util.SpriteID", "eSpriteID"));
/* 195 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */   public static String[] spriteID_GetCharacterEnumArray() {
/* 199 */     Vector localVector = new Vector();
/* 200 */     localVector.add("eSpriteID_NOTASPRITE");
/* 201 */     localVector.addAll(getEnumNamesInSubrange("facade.util.SpriteID", "eSpriteID", 0, 1));
/* 202 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String affinity_EnumToString(int paramInt)
/*     */   {
/* 208 */     return mapEnumToString(paramInt, "dramaman.runtime.DramaManagerConstants", "eAffinity");
/*     */   }
/*     */   
/*     */   public static int affinity_StringToEnum(String paramString) {
/* 212 */     return mapStringToEnum(paramString, "dramaman.runtime.DramaManagerConstants");
/*     */   }
/*     */   
/*     */   public static String[] affinity_GetEnumArray() {
/* 216 */     List localList = getEnumNames("dramaman.runtime.DramaManagerConstants", "eAffinity");
/* 217 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String beatID_EnumToString(int paramInt)
/*     */   {
/* 223 */     return mapEnumToString(paramInt, "facade.util.BeatID", "eBeatID");
/*     */   }
/*     */   
/*     */   public static int beatID_StringToEnum(String paramString) {
/* 227 */     return mapStringToEnum(paramString, "facade.util.BeatID");
/*     */   }
/*     */   
/*     */   public static String[] beatID_GetEnumArray() {
/* 231 */     List localList = getEnumNames("facade.util.BeatID", "eBeatID");
/* 232 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String beatAbortReason_EnumToString(int paramInt)
/*     */   {
/* 238 */     return mapEnumToString(paramInt, "dramaman.runtime.DramaManagerConstants", "eBeatAbortReason");
/*     */   }
/*     */   
/*     */   public static int beatAbortReason_StringToEnum(String paramString) {
/* 242 */     return mapStringToEnum(paramString, "dramaman.runtime.DramaManagerConstants");
/*     */   }
/*     */   
/*     */   public static String[] beatAbortReason_GetEnumArray() {
/* 246 */     List localList = getEnumNames("dramaman.runtime.DramaManagerConstants", "eBeatAbortReason");
/* 247 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String storySegment_EnumToString(int paramInt)
/*     */   {
/* 253 */     return mapEnumToString(paramInt, "dramaman.runtime.DramaManagerConstants", "eStorySegment");
/*     */   }
/*     */   
/*     */   public static int storySegment_StringToEnum(String paramString) {
/* 257 */     return mapStringToEnum(paramString, "dramaman.runtime.DramaManagerConstants");
/*     */   }
/*     */   
/*     */   public static String[] storySegment_GetEnumArray() {
/* 261 */     List localList = getEnumNames("dramaman.runtime.DramaManagerConstants", "eStorySegment");
/* 262 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static String daParam1_EnumToString(int paramInt)
/*     */   {
/* 269 */     if (paramInt == -1)
/* 270 */       return "eDAMiscParam_NOPARAM";
/* 271 */     String str; if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAExpressParam")) != null)
/* 272 */       return str;
/* 273 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACriticizeParam")) != null)
/* 274 */       return str;
/* 275 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAStoryTopicParam")) != null)
/* 276 */       return str;
/* 277 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDASatelliteTopicParam")) != null)
/* 278 */       return str;
/* 279 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACharParam")) != null)
/* 280 */       return str;
/* 281 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAObjectParam")) != null)
/* 282 */       return str;
/* 283 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscParam")) != null)
/* 284 */       return str;
/* 285 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDABeatRefParam")) != null)
/* 286 */       return str;
/* 287 */     return str = mapEnumToString(paramInt, "facade.util.DAType", "eDACustomParam");
/*     */   }
/*     */   
/*     */   public static int daParam1_StringToEnum(String paramString) {
/* 291 */     return mapStringToEnum(paramString, "facade.util.DAType");
/*     */   }
/*     */   
/*     */   public static String[] daParam1_GetEnumArray() {
/* 295 */     Vector localVector = new Vector();
/* 296 */     localVector.add("eDAMiscParam_NOPARAM");
/* 297 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAExpressParam"));
/* 298 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACriticizeParam"));
/* 299 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAStoryTopicParam"));
/* 300 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDASatelliteTopicParam"));
/* 301 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDABeatRefParam"));
/* 302 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACharParam"));
/* 303 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAObjectParam"));
/* 304 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscParam"));
/* 305 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACustomParam"));
/* 306 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */   public static String[] daParam1_GetEnumArray(String paramString)
/*     */   {
/* 311 */     Vector localVector = new Vector();
/* 312 */     localVector.add("eDAMiscParam_NOPARAM");
/* 313 */     localVector.addAll(getEnumNames("facade.util.DAType", paramString));
/* 314 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static String daParam2_EnumToString(int paramInt)
/*     */   {
/* 321 */     if (paramInt == -1)
/* 322 */       return "eDAMiscParam_NOPARAM";
/* 323 */     String str; if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAExpressParam")) != null)
/* 324 */       return str;
/* 325 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACriticizeParam")) != null)
/* 326 */       return str;
/* 327 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAStoryTopicParam")) != null)
/* 328 */       return str;
/* 329 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDASatelliteTopicParam")) != null)
/* 330 */       return str;
/* 331 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACharParam")) != null)
/* 332 */       return str;
/* 333 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAObjectParam")) != null)
/* 334 */       return str;
/* 335 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscParam")) != null)
/* 336 */       return str;
/* 337 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDABeatRefParam")) != null)
/* 338 */       return str;
/* 339 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscKeywordParam")) != null)
/* 340 */       return str;
/* 341 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscWhatWhereParam")) != null)
/* 342 */       return str;
/* 343 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDrink")) != null)
/* 344 */       return str;
/* 345 */     return str = mapEnumToString(paramInt, "facade.util.DAType", "eDACustomParam");
/*     */   }
/*     */   
/*     */   public static int daParam2_StringToEnum(String paramString) {
/* 349 */     return mapStringToEnum(paramString, "facade.util.DAType");
/*     */   }
/*     */   
/*     */   public static String[] daParam2_GetEnumArray() {
/* 353 */     Vector localVector = new Vector();
/* 354 */     localVector.add("eDAMiscParam_NOPARAM");
/* 355 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAExpressParam"));
/* 356 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACriticizeParam"));
/* 357 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAStoryTopicParam"));
/* 358 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDASatelliteTopicParam"));
/* 359 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDABeatRefParam"));
/* 360 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACharParam"));
/* 361 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAObjectParam"));
/* 362 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscParam"));
/* 363 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACustomParam"));
/* 364 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscKeywordParam"));
/* 365 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscWhatWhereParam"));
/* 366 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDrink"));
/* 367 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */   public static String[] daParam2_GetEnumArray(String paramString)
/*     */   {
/* 372 */     Vector localVector = new Vector();
/* 373 */     localVector.add("eDAMiscParam_NOPARAM");
/* 374 */     localVector.addAll(getEnumNames("facade.util.DAType", paramString));
/* 375 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static String daParam3_EnumToString(int paramInt)
/*     */   {
/* 382 */     if (paramInt == -1)
/* 383 */       return "eDAMiscParam_NOPARAM";
/* 384 */     String str; if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAExpressParam")) != null)
/* 385 */       return str;
/* 386 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACriticizeParam")) != null)
/* 387 */       return str;
/* 388 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAStoryTopicParam")) != null)
/* 389 */       return str;
/* 390 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDASatelliteTopicParam")) != null)
/* 391 */       return str;
/* 392 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDACharParam")) != null)
/* 393 */       return str;
/* 394 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAObjectParam")) != null)
/* 395 */       return str;
/* 396 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscParam")) != null)
/* 397 */       return str;
/* 398 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDABeatRefParam")) != null)
/* 399 */       return str;
/* 400 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscKeywordParam")) != null)
/* 401 */       return str;
/* 402 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDAMiscWhatWhereParam")) != null)
/* 403 */       return str;
/* 404 */     if ((str = mapEnumToString(paramInt, "facade.util.DAType", "eDrink")) != null)
/* 405 */       return str;
/* 406 */     return str = mapEnumToString(paramInt, "facade.util.DAType", "eDACustomParam");
/*     */   }
/*     */   
/*     */   public static int daParam3_StringToEnum(String paramString) {
/* 410 */     return mapStringToEnum(paramString, "facade.util.DAType");
/*     */   }
/*     */   
/*     */   public static String[] daParam3_GetEnumArray() {
/* 414 */     Vector localVector = new Vector();
/* 415 */     localVector.add("eDAMiscParam_NOPARAM");
/* 416 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAExpressParam"));
/* 417 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACriticizeParam"));
/* 418 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAStoryTopicParam"));
/* 419 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDASatelliteTopicParam"));
/* 420 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDABeatRefParam"));
/* 421 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACharParam"));
/* 422 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAObjectParam"));
/* 423 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscParam"));
/* 424 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDACustomParam"));
/* 425 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscKeywordParam"));
/* 426 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDAMiscWhatWhereParam"));
/* 427 */     localVector.addAll(getEnumNames("facade.util.DAType", "eDrink"));
/* 428 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */   public static String[] daParam3_GetEnumArray(String paramString)
/*     */   {
/* 433 */     Vector localVector = new Vector();
/* 434 */     localVector.add("eDAMiscParam_NOPARAM");
/* 435 */     localVector.addAll(getEnumNames("facade.util.DAType", paramString));
/* 436 */     return (String[])localVector.toArray(new String[localVector.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String beatArgument_txn_EnumToString(int paramInt)
/*     */   {
/* 442 */     return mapEnumToString(paramInt, "facade.util.BeatArguments", "eBeatArgument_txn");
/*     */   }
/*     */   
/*     */   public static int beatArgument_txn_StringToEnum(String paramString) {
/* 446 */     return mapStringToEnum(paramString, "facade.util.BeatArguments");
/*     */   }
/*     */   
/*     */   public static String[] beatArgument_txn_GetEnumArray() {
/* 450 */     List localList = getEnumNames("facade.util.BeatArguments", "eBeatArgument_txn");
/* 451 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String animLayer_EnumToString(int paramInt)
/*     */   {
/* 457 */     return mapEnumToString(paramInt, "facade.util.AnimLayer", "eAnimLayer");
/*     */   }
/*     */   
/*     */   public static int animLayer_StringToEnum(String paramString) {
/* 461 */     return mapStringToEnum(paramString, "facade.util.AnimLayer");
/*     */   }
/*     */   
/*     */   public static String[] animLayer_GetEnumArray() {
/* 465 */     List localList = getEnumNames("facade.util.AnimLayer", "eAnimLayer");
/* 466 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String rxnType_EnumToString(int paramInt)
/*     */   {
/* 472 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "eDARxnType");
/*     */   }
/*     */   
/*     */   public static int rxnType_StringToEnum(String paramString) {
/* 476 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] rxnType_GetEnumArray() {
/* 480 */     List localList = getEnumNames("facade.util.ReactionID", "eDARxnType");
/* 481 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String rxnCategory_EnumToString(int paramInt)
/*     */   {
/* 487 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "eRxnCategory");
/*     */   }
/*     */   
/*     */   public static int rxnCategory_StringToEnum(String paramString) {
/* 491 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] rxnCategory_GetEnumArray() {
/* 495 */     List localList = getEnumNames("facade.util.ReactionID", "eRxnCategory");
/* 496 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String rxnParam_EnumToString(int paramInt)
/*     */   {
/* 502 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "eRxnParam");
/*     */   }
/*     */   
/*     */   public static int rxnParam_StringToEnum(String paramString) {
/* 506 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] rxnParam_GetEnumArray() {
/* 510 */     List localList = getEnumNames("facade.util.ReactionID", "eRxnParam");
/* 511 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String txnOut_EnumToString(int paramInt)
/*     */   {
/* 517 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "eTxnOut");
/*     */   }
/*     */   
/*     */   public static int txnOut_StringToEnum(String paramString) {
/* 521 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] txnOut_GetEnumArray() {
/* 525 */     List localList = getEnumNames("facade.util.ReactionID", "eTxnOut");
/* 526 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String responseAttitude_EnumToString(int paramInt)
/*     */   {
/* 532 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "eResponseAttitude");
/*     */   }
/*     */   
/*     */   public static int responseAttitude_StringToEnum(String paramString) {
/* 536 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] responseAttitude_GetEnumArray() {
/* 540 */     List localList = getEnumNames("facade.util.ReactionID", "eResponseAttitude");
/* 541 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String patternID_EnumToString(int paramInt)
/*     */   {
/* 547 */     return mapEnumToString(paramInt, "facade.util.ReactionID", "ePatternID");
/*     */   }
/*     */   
/*     */   public static int patternID_StringToEnum(String paramString) {
/* 551 */     return mapStringToEnum(paramString, "facade.util.ReactionID");
/*     */   }
/*     */   
/*     */   public static String[] patternID_GetEnumArray() {
/* 555 */     List localList = getEnumNames("facade.util.ReactionID", "ePatternID");
/* 556 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String playerGesture_EnumToString(int paramInt)
/*     */   {
/* 562 */     return mapEnumToString(paramInt, "facade.util.PlayerGestureID", "ePlayerGesture");
/*     */   }
/*     */   
/*     */   public static int playerGesture_StringToEnum(String paramString) {
/* 566 */     return mapStringToEnum(paramString, "facade.util.PlayerGestureID");
/*     */   }
/*     */   
/*     */   public static String[] playerGesture_GetEnumArray() {
/* 570 */     List localList = getEnumNames("facade.util.PlayerGestureID", "ePlayerGesture");
/* 571 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String therapyGameCharFocus_EnumToString(int paramInt)
/*     */   {
/* 577 */     return mapEnumToString(paramInt, "facade.util.TherapyGameConstants", "eTherapyGame_charFocus");
/*     */   }
/*     */   
/*     */   public static int therapyGameCharFocus_StringToEnum(String paramString) {
/* 581 */     return mapStringToEnum(paramString, "facade.util.TherapyGameConstants");
/*     */   }
/*     */   
/*     */   public static String[] therapyGameCharFocus_GetEnumArray() {
/* 585 */     List localList = getEnumNames("facade.util.TherapyGameConstants", "eTherapyGame_charFocus");
/* 586 */     return (String[])localList.toArray(new String[localList.size()]);
/*     */   }
/*     */   
/*     */ 
/* 590 */   private static final int tripScriptTrim = "etripScript_dialog_".length();
/*     */   
/*     */   public static String tripScript_EnumToString(int paramInt) {
/* 593 */     String str = mapEnumToStringViaTable(paramInt, "facade.util.TripScript");
/* 594 */     if (str != null) return str.substring(tripScriptTrim);
/* 595 */     return "ERROR: UNKNOWN TRIP SCRIPT " + paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 600 */   private static final int graceScriptTrim = "egraceScript_dialog_".length();
/*     */   
/*     */   public static String graceScript_EnumToString(int paramInt) {
/* 603 */     String str = mapEnumToStringViaTable(paramInt, "facade.util.GraceScript");
/* 604 */     if (str != null) return str.substring(graceScriptTrim);
/* 605 */     return "ERROR: UNKNOWN GRACE SCRIPT " + paramInt;
/*     */   }
/*     */   
/*     */   public static String dialogScript_EnumToString(int paramInt1, int paramInt2)
/*     */   {
/* 610 */     if (paramInt2 != -1) {
/* 611 */       if (paramInt1 == 1)
/* 612 */         return tripScript_EnumToString(paramInt2);
/* 613 */       if (paramInt1 == 0) {
/* 614 */         return graceScript_EnumToString(paramInt2);
/*     */       }
/* 616 */       return "";
/*     */     }
/*     */     
/* 619 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\PrintUtilities.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */