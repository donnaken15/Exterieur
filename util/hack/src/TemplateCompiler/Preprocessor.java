/*     */ package TemplateCompiler;
/*     */ 
/*     */ import jess.Rete;
/*     */ 
/*     */ public class Preprocessor
/*     */ {
/*     */   public static void initializeReteEngine(Rete paramRete) throws jess.JessException
/*     */   {
/*     */     try {
/*  10 */       paramRete.reset();
/*  11 */       paramRete.executeCommand("(defclass WordCompileSearch TemplateCompiler.SearchUnit)");
/*  12 */       paramRete.addDefglobal(new jess.Defglobal("mysearch", new jess.Value(new SearchUnit())));
/*     */       
/*  14 */       paramRete.addUserpackage(new MyRules());
/*  15 */       paramRete.executeCommand("(batch nlu/templates/TemplateSupport.jess)");
/*     */     }
/*     */     catch (jess.JessException localJessException) {
/*  18 */       JessExceptionHelper.processJessException(localJessException);
/*     */     }
/*     */   }
/*     */   
/*     */   public static String replaceAll(String paramString1, String paramString2, String paramString3) {
/*  23 */     int i = paramString1.indexOf(paramString2);
/*  24 */     if (i == -1) return paramString1;
/*  25 */     StringBuffer localStringBuffer = new StringBuffer(paramString1);
/*  26 */     while (i != -1) {
/*  27 */       localStringBuffer.delete(i, i + paramString2.length());
/*  28 */       localStringBuffer.insert(i, paramString3);
/*  29 */       if (paramString1.length() < i + paramString3.length()) break;
/*  30 */       i = localStringBuffer.toString().indexOf(paramString2, i + paramString3.length());
/*     */     }
/*  32 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   private static final void addWOFact(String paramString, Rete paramRete, int paramInt1, int paramInt2)
/*     */     throws jess.JessException
/*     */   {
/*  38 */     jess.Fact localFact = new jess.Fact("wo-" + paramString, paramRete);
/*  39 */     jess.ValueVector localValueVector = new jess.ValueVector();
/*  40 */     localValueVector.add(new jess.Value(paramInt1, 4));
/*  41 */     localValueVector.add(new jess.Value(paramInt2, 4));
/*  42 */     localFact.setSlotValue("__data", new jess.Value(localValueVector, 512));
/*  43 */     paramRete.assertFact(localFact);
/*     */   }
/*     */   
/*     */   private static final String[] expandContractions(String paramString)
/*     */   {
/*  48 */     String[] arrayOfString = new String[2];
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  53 */     if ((paramString.equals("can't")) || (paramString.equals("cant")) || (paramString.equals("cannot"))) {
/*  54 */       arrayOfString[0] = "can";
/*  55 */       arrayOfString[1] = "not";
/*     */     }
/*  57 */     else if ((paramString.equals("don't")) || (paramString.equals("dont"))) {
/*  58 */       arrayOfString[0] = "do";
/*  59 */       arrayOfString[1] = "not";
/*     */     }
/*  61 */     else if ((paramString.equals("won't")) || (paramString.equals("wont"))) {
/*  62 */       arrayOfString[0] = "will";
/*  63 */       arrayOfString[1] = "not";
/*     */     }
/*  65 */     else if ((paramString.equals("shan't")) || (paramString.equals("shant"))) {
/*  66 */       arrayOfString[0] = "shall";
/*  67 */       arrayOfString[1] = "not";
/*     */     }
/*  69 */     else if ((paramString.equals("couldn't")) || (paramString.equals("couldnt"))) {
/*  70 */       arrayOfString[0] = "could";
/*  71 */       arrayOfString[1] = "not";
/*     */     }
/*  73 */     else if ((paramString.equals("shouldn't")) || (paramString.equals("shouldnt"))) {
/*  74 */       arrayOfString[0] = "should";
/*  75 */       arrayOfString[1] = "not";
/*     */     }
/*  77 */     else if ((paramString.equals("wouldn't")) || (paramString.equals("wouldnt"))) {
/*  78 */       arrayOfString[0] = "would";
/*  79 */       arrayOfString[1] = "not";
/*     */     }
/*  81 */     else if ((paramString.equals("doesn't")) || (paramString.equals("doesnt"))) {
/*  82 */       arrayOfString[0] = "does";
/*  83 */       arrayOfString[1] = "not";
/*     */     }
/*  85 */     else if ((paramString.equals("didn't")) || (paramString.equals("didnt"))) {
/*  86 */       arrayOfString[0] = "did";
/*  87 */       arrayOfString[1] = "not";
/*     */     }
/*  89 */     else if ((paramString.equals("hasn't")) || (paramString.equals("hasnt"))) {
/*  90 */       arrayOfString[0] = "has";
/*  91 */       arrayOfString[1] = "not";
/*     */     }
/*  93 */     else if ((paramString.equals("haven't")) || (paramString.equals("havent"))) {
/*  94 */       arrayOfString[0] = "have";
/*  95 */       arrayOfString[1] = "not";
/*     */     }
/*  97 */     else if ((paramString.equals("hadn't")) || (paramString.equals("hadnt"))) {
/*  98 */       arrayOfString[0] = "had";
/*  99 */       arrayOfString[1] = "not";
/*     */     }
/* 101 */     else if ((paramString.equals("isn't")) || (paramString.equals("isnt"))) {
/* 102 */       arrayOfString[0] = "is";
/* 103 */       arrayOfString[1] = "not";
/*     */     }
/* 105 */     else if ((paramString.equals("aren't")) || (paramString.equals("arent"))) {
/* 106 */       arrayOfString[0] = "are";
/* 107 */       arrayOfString[1] = "not";
/*     */     }
/* 109 */     else if ((paramString.equals("wasn't")) || (paramString.equals("wasnt"))) {
/* 110 */       arrayOfString[0] = "was";
/* 111 */       arrayOfString[1] = "not";
/*     */     }
/* 113 */     else if ((paramString.equals("ain't")) || (paramString.equals("aint"))) {
/* 114 */       arrayOfString[0] = "is";
/* 115 */       arrayOfString[1] = "not";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 121 */     else if ((paramString.equals("could've")) || (paramString.equals("couldve"))) {
/* 122 */       arrayOfString[0] = "could";
/* 123 */       arrayOfString[1] = "have";
/*     */     }
/* 125 */     else if ((paramString.equals("should've")) || (paramString.equals("shouldve"))) {
/* 126 */       arrayOfString[0] = "should";
/* 127 */       arrayOfString[1] = "have";
/*     */     }
/* 129 */     else if ((paramString.equals("would've")) || (paramString.equals("wouldve"))) {
/* 130 */       arrayOfString[0] = "would";
/* 131 */       arrayOfString[1] = "have";
/*     */     }
/* 133 */     else if ((paramString.equals("i've")) || (paramString.equals("ive"))) {
/* 134 */       arrayOfString[0] = "i";
/* 135 */       arrayOfString[1] = "have";
/*     */     }
/* 137 */     else if ((paramString.equals("you've")) || (paramString.equals("youve"))) {
/* 138 */       arrayOfString[0] = "you";
/* 139 */       arrayOfString[1] = "have";
/*     */     }
/* 141 */     else if ((paramString.equals("we've")) || (paramString.equals("weve"))) {
/* 142 */       arrayOfString[0] = "we";
/* 143 */       arrayOfString[1] = "have";
/*     */     }
/* 145 */     else if ((paramString.equals("they've")) || (paramString.equals("theyve"))) {
/* 146 */       arrayOfString[0] = "they";
/* 147 */       arrayOfString[1] = "have";
/*     */     }
/* 149 */     else if ((paramString.equals("what've")) || (paramString.equals("whatve"))) {
/* 150 */       arrayOfString[0] = "what";
/* 151 */       arrayOfString[1] = "have";
/*     */     }
/* 153 */     else if ((paramString.equals("where've")) || (paramString.equals("whereve"))) {
/* 154 */       arrayOfString[0] = "where";
/* 155 */       arrayOfString[1] = "have";
/*     */     }
/* 157 */     else if ((paramString.equals("when've")) || (paramString.equals("whenve"))) {
/* 158 */       arrayOfString[0] = "when";
/* 159 */       arrayOfString[1] = "have";
/*     */     }
/* 161 */     else if ((paramString.equals("who've")) || (paramString.equals("whove"))) {
/* 162 */       arrayOfString[0] = "who";
/* 163 */       arrayOfString[1] = "have";
/*     */     }
/* 165 */     else if ((paramString.equals("why've")) || (paramString.equals("whyve"))) {
/* 166 */       arrayOfString[0] = "why";
/* 167 */       arrayOfString[1] = "have";
/*     */     }
/* 169 */     else if ((paramString.equals("how've")) || (paramString.equals("howve"))) {
/* 170 */       arrayOfString[0] = "how";
/* 171 */       arrayOfString[1] = "have";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 177 */     else if ((paramString.equals("i'll")) || (paramString.equals("ill"))) {
/* 178 */       arrayOfString[0] = "i";
/* 179 */       arrayOfString[1] = "will";
/*     */     }
/* 181 */     else if ((paramString.equals("he'll")) || (paramString.equals("hell"))) {
/* 182 */       arrayOfString[0] = "he";
/* 183 */       arrayOfString[1] = "will";
/*     */     }
/* 185 */     else if ((paramString.equals("she'll")) || (paramString.equals("shell"))) {
/* 186 */       arrayOfString[0] = "she";
/* 187 */       arrayOfString[1] = "will";
/*     */     }
/* 189 */     else if ((paramString.equals("we'll")) || (paramString.equals("well"))) {
/* 190 */       arrayOfString[0] = "we";
/* 191 */       arrayOfString[1] = "will";
/*     */     }
/* 193 */     else if ((paramString.equals("they'll")) || (paramString.equals("theyll"))) {
/* 194 */       arrayOfString[0] = "they";
/* 195 */       arrayOfString[1] = "will";
/*     */     }
/* 197 */     else if ((paramString.equals("you'll")) || (paramString.equals("youll"))) {
/* 198 */       arrayOfString[0] = "you";
/* 199 */       arrayOfString[1] = "will";
/*     */     }
/* 201 */     else if ((paramString.equals("it'll")) || (paramString.equals("itll"))) {
/* 202 */       arrayOfString[0] = "it";
/* 203 */       arrayOfString[1] = "will";
/*     */     }
/* 205 */     else if ((paramString.equals("that'll")) || (paramString.equals("thatll"))) {
/* 206 */       arrayOfString[0] = "that";
/* 207 */       arrayOfString[1] = "will";
/*     */     }
/* 209 */     else if ((paramString.equals("there'll")) || (paramString.equals("therell"))) {
/* 210 */       arrayOfString[0] = "there";
/* 211 */       arrayOfString[1] = "will";
/*     */     }
/* 213 */     else if ((paramString.equals("what'll")) || (paramString.equals("whatll"))) {
/* 214 */       arrayOfString[0] = "what";
/* 215 */       arrayOfString[1] = "will";
/*     */     }
/* 217 */     else if ((paramString.equals("where'll")) || (paramString.equals("wherell"))) {
/* 218 */       arrayOfString[0] = "where";
/* 219 */       arrayOfString[1] = "will";
/*     */     }
/* 221 */     else if ((paramString.equals("when'll")) || (paramString.equals("whenll"))) {
/* 222 */       arrayOfString[0] = "when";
/* 223 */       arrayOfString[1] = "will";
/*     */     }
/* 225 */     else if ((paramString.equals("who'll")) || (paramString.equals("wholl"))) {
/* 226 */       arrayOfString[0] = "who";
/* 227 */       arrayOfString[1] = "will";
/*     */     }
/* 229 */     else if ((paramString.equals("why'll")) || (paramString.equals("whyll"))) {
/* 230 */       arrayOfString[0] = "why";
/* 231 */       arrayOfString[1] = "will";
/*     */     }
/* 233 */     else if ((paramString.equals("how'll")) || (paramString.equals("howll"))) {
/* 234 */       arrayOfString[0] = "how";
/* 235 */       arrayOfString[1] = "will";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 241 */     else if ((paramString.equals("i'm")) || (paramString.equals("im"))) {
/* 242 */       arrayOfString[0] = "i";
/* 243 */       arrayOfString[1] = "am";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 249 */     else if ((paramString.equals("he's")) || (paramString.equals("hes"))) {
/* 250 */       arrayOfString[0] = "he";
/* 251 */       arrayOfString[1] = "is";
/*     */     }
/* 253 */     else if ((paramString.equals("she's")) || (paramString.equals("shes"))) {
/* 254 */       arrayOfString[0] = "she";
/* 255 */       arrayOfString[1] = "is";
/*     */     }
/* 257 */     else if ((paramString.equals("it's")) || (paramString.equals("its"))) {
/* 258 */       arrayOfString[0] = "it";
/* 259 */       arrayOfString[1] = "is";
/*     */     }
/* 261 */     else if ((paramString.equals("that's")) || (paramString.equals("thats"))) {
/* 262 */       arrayOfString[0] = "that";
/* 263 */       arrayOfString[1] = "is";
/*     */     }
/* 265 */     else if ((paramString.equals("there's")) || (paramString.equals("theres"))) {
/* 266 */       arrayOfString[0] = "there";
/* 267 */       arrayOfString[1] = "is";
/*     */     }
/* 269 */     else if ((paramString.equals("what's")) || (paramString.equals("whats"))) {
/* 270 */       arrayOfString[0] = "what";
/* 271 */       arrayOfString[1] = "is";
/*     */     }
/* 273 */     else if ((paramString.equals("where's")) || (paramString.equals("wheres"))) {
/* 274 */       arrayOfString[0] = "where";
/* 275 */       arrayOfString[1] = "is";
/*     */     }
/* 277 */     else if ((paramString.equals("when's")) || (paramString.equals("whens"))) {
/* 278 */       arrayOfString[0] = "when";
/* 279 */       arrayOfString[1] = "is";
/*     */     }
/* 281 */     else if ((paramString.equals("who's")) || (paramString.equals("whos"))) {
/* 282 */       arrayOfString[0] = "who";
/* 283 */       arrayOfString[1] = "is";
/*     */     }
/* 285 */     else if ((paramString.equals("why's")) || (paramString.equals("whys"))) {
/* 286 */       arrayOfString[0] = "why";
/* 287 */       arrayOfString[1] = "is";
/*     */     }
/* 289 */     else if ((paramString.equals("how's")) || (paramString.equals("hows"))) {
/* 290 */       arrayOfString[0] = "how";
/* 291 */       arrayOfString[1] = "is";
/*     */     }
/* 293 */     else if ((paramString.equals("let's")) || (paramString.equals("lets"))) {
/* 294 */       arrayOfString[0] = "let";
/* 295 */       arrayOfString[1] = "us";
/*     */     }
/* 297 */     else if ((paramString.equals("nothing's")) || (paramString.equals("nothings"))) {
/* 298 */       arrayOfString[0] = "nothing";
/* 299 */       arrayOfString[1] = "is";
/*     */     }
/* 301 */     else if (paramString.equals("life's")) {
/* 302 */       arrayOfString[0] = "life";
/* 303 */       arrayOfString[1] = "is";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 310 */     else if ((paramString.equals("you're")) || (paramString.equals("youre")) || (paramString.equals("your"))) {
/* 311 */       arrayOfString[0] = "you";
/* 312 */       arrayOfString[1] = "are";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 318 */     else if (paramString.equals("we're")) {
/* 319 */       arrayOfString[0] = "we";
/* 320 */       arrayOfString[1] = "are";
/*     */ 
/*     */     }
/* 323 */     else if ((paramString.equals("they're")) || (paramString.equals("theyre")) || (paramString.equals("their"))) {
/* 324 */       arrayOfString[0] = "they";
/* 325 */       arrayOfString[1] = "are";
/*     */     }
/* 327 */     else if ((paramString.equals("what're")) || (paramString.equals("whatre"))) {
/* 328 */       arrayOfString[0] = "what";
/* 329 */       arrayOfString[1] = "are";
/*     */     }
/* 331 */     else if ((paramString.equals("where're")) || (paramString.equals("wherere"))) {
/* 332 */       arrayOfString[0] = "where";
/* 333 */       arrayOfString[1] = "are";
/*     */     }
/* 335 */     else if ((paramString.equals("when're")) || (paramString.equals("whenre"))) {
/* 336 */       arrayOfString[0] = "when";
/* 337 */       arrayOfString[1] = "are";
/*     */     }
/* 339 */     else if ((paramString.equals("who're")) || (paramString.equals("whore"))) {
/* 340 */       arrayOfString[0] = "who";
/* 341 */       arrayOfString[1] = "are";
/*     */     }
/* 343 */     else if ((paramString.equals("why're")) || (paramString.equals("whyre"))) {
/* 344 */       arrayOfString[0] = "why";
/* 345 */       arrayOfString[1] = "are";
/*     */     }
/* 347 */     else if ((paramString.equals("how're")) || (paramString.equals("howre"))) {
/* 348 */       arrayOfString[0] = "how";
/* 349 */       arrayOfString[1] = "are";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 355 */     else if ((paramString.equals("i'd")) || (paramString.equals("id"))) {
/* 356 */       arrayOfString[0] = "i";
/* 357 */       arrayOfString[1] = "had";
/*     */     }
/* 359 */     else if ((paramString.equals("he'd")) || (paramString.equals("hed"))) {
/* 360 */       arrayOfString[0] = "he";
/* 361 */       arrayOfString[1] = "had";
/*     */     }
/* 363 */     else if ((paramString.equals("she'd")) || (paramString.equals("shed"))) {
/* 364 */       arrayOfString[0] = "she";
/* 365 */       arrayOfString[1] = "had";
/*     */     }
/* 367 */     else if ((paramString.equals("you'd")) || (paramString.equals("youd"))) {
/* 368 */       arrayOfString[0] = "you";
/* 369 */       arrayOfString[1] = "had";
/*     */     }
/* 371 */     else if ((paramString.equals("we'd")) || (paramString.equals("wed"))) {
/* 372 */       arrayOfString[0] = "we";
/* 373 */       arrayOfString[1] = "had";
/*     */     }
/* 375 */     else if ((paramString.equals("they'd")) || (paramString.equals("theyd"))) {
/* 376 */       arrayOfString[0] = "they";
/* 377 */       arrayOfString[1] = "had";
/*     */     }
/* 379 */     else if ((paramString.equals("it'd")) || (paramString.equals("itd"))) {
/* 380 */       arrayOfString[0] = "it";
/* 381 */       arrayOfString[1] = "had";
/*     */     }
/* 383 */     else if ((paramString.equals("that'd")) || (paramString.equals("thatd"))) {
/* 384 */       arrayOfString[0] = "that";
/* 385 */       arrayOfString[1] = "had";
/*     */     }
/* 387 */     else if ((paramString.equals("there'd")) || (paramString.equals("thered"))) {
/* 388 */       arrayOfString[0] = "there";
/* 389 */       arrayOfString[1] = "had";
/*     */     }
/* 391 */     else if ((paramString.equals("what'd")) || (paramString.equals("whatd"))) {
/* 392 */       arrayOfString[0] = "what";
/* 393 */       arrayOfString[1] = "did";
/*     */     }
/* 395 */     else if ((paramString.equals("when'd")) || (paramString.equals("whend"))) {
/* 396 */       arrayOfString[0] = "when";
/* 397 */       arrayOfString[1] = "did";
/*     */     }
/* 399 */     else if ((paramString.equals("where'd")) || (paramString.equals("whered"))) {
/* 400 */       arrayOfString[0] = "where";
/* 401 */       arrayOfString[1] = "did";
/*     */     }
/* 403 */     else if ((paramString.equals("who'd")) || (paramString.equals("whod"))) {
/* 404 */       arrayOfString[0] = "who";
/* 405 */       arrayOfString[1] = "did";
/*     */     }
/* 407 */     else if ((paramString.equals("why'd")) || (paramString.equals("whyd"))) {
/* 408 */       arrayOfString[0] = "why";
/* 409 */       arrayOfString[1] = "did";
/*     */     }
/* 411 */     else if ((paramString.equals("how'd")) || (paramString.equals("howd"))) {
/* 412 */       arrayOfString[0] = "how";
/* 413 */       arrayOfString[1] = "did";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/* 419 */     else if (paramString.equals("alot")) {
/* 420 */       arrayOfString[0] = "lot";
/*     */     }
/* 422 */     else if (paramString.equals("em")) {
/* 423 */       arrayOfString[0] = "them";
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 428 */     if (arrayOfString[0] == null) {
/* 429 */       return null;
/*     */     }
/* 431 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static final boolean includeOriginalWord(String paramString) {
/* 435 */     if ((paramString.equals("cant")) || (paramString.equals("wont")) || (paramString.equals("ill")) || (paramString.equals("shell")) || (paramString.equals("well")) || (paramString.equals("hell")) || (paramString.equals("were")) || (paramString.equals("whore")) || (paramString.equals("id")) || (paramString.equals("wed")) || (paramString.equals("shed")))
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
/* 446 */       return true;
/*     */     }
/* 448 */     return false;
/*     */   }
/*     */   
/*     */   private static final String deleteApostraphe(String paramString) {
/* 452 */     char[] arrayOfChar1 = paramString.toCharArray();
/* 453 */     char[] arrayOfChar2 = new char[paramString.length()];
/* 454 */     int i = 0;
/* 455 */     for (int j = 0; j < arrayOfChar1.length; j++) {
/* 456 */       if (arrayOfChar1[j] != '\'') {
/* 457 */         arrayOfChar2[i] = arrayOfChar1[j];
/* 458 */         i++;
/*     */       }
/*     */     }
/* 461 */     return new String(arrayOfChar2, 0, i);
/*     */   }
/*     */   
/*     */   private static final String RemoveUnnecessaryWords(String paramString) {
/* 465 */     int i = 0;
/* 466 */     int j = 0;
/* 467 */     int k = 0;
/* 468 */     String str1 = new String();
/* 469 */     String str2 = new String();
/* 470 */     int m = 1;
/*     */     
/* 472 */     while (k < paramString.length()) {
/* 473 */       while ((k < paramString.length()) && (paramString.charAt(k) == ' ')) k++;
/* 474 */       i = k;
/* 475 */       while ((k < paramString.length()) && (paramString.charAt(k) != ' ')) k++;
/* 476 */       j = k;
/*     */       
/* 478 */       str1 = paramString.substring(i, j);
/* 479 */       if ((!str1.equals("a")) && (!str1.equals("an")) && (!str1.equals("the")) && (!str1.equals("teh")))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 484 */         if (m == 0) str2 = str2 + ' ';
/* 485 */         str2 = str2 + str1;
/* 486 */         m = 0;
/*     */       }
/*     */     }
/*     */     
/* 490 */     return str2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static final String RemoveIllegalCharacters(String paramString, Rete paramRete)
/*     */   {
/* 499 */     String str1 = new String();
/*     */     try
/*     */     {
/* 502 */       int i = 0;
/*     */       
/*     */ 
/* 505 */       String str2 = new String();
/*     */       
/* 507 */       while (i < paramString.length()) {
/* 508 */         char c1 = paramString.charAt(i);
/* 509 */         char c2 = '\000';
/*     */         
/* 511 */         if ((c1 == ',') || (c1 == '.') || (c1 == '!') || (c1 == '?') || (c1 == '-') || (c1 == '/') || (c1 == '\\') || (c1 == '(') || (c1 == ')') || (c1 == '@') || (c1 == '#') || (c1 == '$') || (c1 == '%') || (c1 == '^') || (c1 == '&') || (c1 == '*') || (c1 == '_') || (c1 == '=') || (c1 == '+') || (c1 == '[') || (c1 == ']') || (c1 == '{') || (c1 == '}') || (c1 == ';') || (c1 == ':') || (c1 == '"') || (c1 == '<') || (c1 == '>') || (c1 == '`') || (c1 == '~'))
/*     */         {
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
/* 543 */           if ((c1 == '?') || (c1 == ':') || (c1 == ';')) { c2 = c1;
/*     */           }
/* 545 */           c1 = ' ';
/*     */         }
/*     */         
/* 548 */         str2 = str2 + c1;
/* 549 */         i++;
/*     */         
/*     */ 
/* 552 */         if (c2 == '?') { addWOFact("questionmark", paramRete, 1, 1);
/*     */         }
/*     */         
/* 555 */         if ((c2 == ':') || (c2 == ';')) {
/* 556 */           int j = i;
/* 557 */           String str3 = new String();
/* 558 */           str3 = str3 + c2;
/* 559 */           int k = 0;
/* 560 */           int m = 0;
/* 561 */           int n = 0;
/* 562 */           while ((j < paramString.length()) && (k == 0) && (m == 0) && (n == 0)) {
/* 563 */             c2 = paramString.charAt(j);
/* 564 */             if ((c2 == ')') || (c2 == '}') || (c2 == 'p') || (c2 == 'd')) k = 1;
/* 565 */             if ((c2 == '(') || (c2 == '{')) m = 1;
/* 566 */             if ((c2 == '-') || (c2 == '0') || (k != 0) || (m != 0)) {
/* 567 */               str3 = str3 + c2;
/*     */             } else {
/* 569 */               n = 1;
/*     */             }
/* 571 */             j++;
/*     */           }
/* 573 */           if ((str3.length() > 1) && ((k != 0) || (m != 0))) {
/* 574 */             System.out.println("got emoticon " + str3);
/* 575 */             if (k != 0) addWOFact(":)", paramRete, 1, 1);
/* 576 */             if (m != 0) { addWOFact(":(", paramRete, 1, 1);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 581 */       i = 0;
/* 582 */       while (i < str2.length()) {
/* 583 */         if ((str2.charAt(i) != ' ') || ((i != 0) && (str2.charAt(i - 1) != ' ')))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */           str1 = str1 + str2.charAt(i);
/*     */         }
/*     */         
/* 592 */         i++;
/*     */       }
/*     */       
/*     */ 
/* 596 */       if ((str1.length() > 0) && 
/* 597 */         (str1.charAt(str1.length() - 1) == ' ')) {
/* 598 */         str1 = str1.substring(0, str1.length() - 1);
/*     */       }
/*     */       
/*     */ 
/* 602 */       if (str1.length() <= 0) str1 = "nowords";
/*     */     }
/*     */     catch (jess.JessException localJessException) {
/* 605 */       JessExceptionHelper.processJessException(localJessException);
/*     */     }
/*     */     
/* 608 */     return str1;
/*     */   }
/*     */   
/*     */   public static void Process(String paramString, Rete paramRete)
/*     */   {
/*     */     try
/*     */     {
/* 615 */       paramString = paramString.toLowerCase();
/* 616 */       paramString = RemoveUnnecessaryWords(paramString);
/* 617 */       paramString = RemoveIllegalCharacters(paramString, paramRete);
/*     */       
/* 619 */       System.out.println(" ");
/* 620 */       System.out.println("Begin NLU rules on: " + paramString);
/* 621 */       System.out.println(" ");
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 626 */       System.out.println("ASSERTING " + paramString);
/*     */       
/*     */ 
/* 629 */       jess.Fact localFact = new jess.Fact("SENTENCE", paramRete);
/* 630 */       jess.ValueVector localValueVector = new jess.ValueVector();
/* 631 */       localValueVector.add(new jess.Value(paramString, 2));
/* 632 */       localFact.setSlotValue("__data", new jess.Value(localValueVector, 512));
/* 633 */       paramRete.assertFact(localFact);
/*     */       
/* 635 */       java.util.StringTokenizer localStringTokenizer = new java.util.StringTokenizer(paramString);
/* 636 */       int i = 0;
/*     */       
/* 638 */       while (localStringTokenizer.hasMoreTokens()) {
/* 639 */         i++;
/* 640 */         String str = localStringTokenizer.nextToken();
/* 641 */         String[] arrayOfString = expandContractions(str);
/* 642 */         if (arrayOfString == null)
/*     */         {
/* 644 */           addWOFact(deleteApostraphe(str), paramRete, i, i);
/*     */         }
/*     */         else
/*     */         {
/* 648 */           boolean bool = includeOriginalWord(str);
/* 649 */           if (bool) {
/* 650 */             addWOFact(str, paramRete, i, i + 1);
/*     */           }
/* 652 */           addWOFact(arrayOfString[0], paramRete, i, i);
/* 653 */           i++;
/* 654 */           addWOFact(arrayOfString[1], paramRete, i, i);
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
/*     */ 
/* 672 */       localFact = new jess.Fact("_wordcount", paramRete);
/* 673 */       localValueVector = new jess.ValueVector();
/* 674 */       localValueVector.add(new jess.Value(i, 4));
/* 675 */       localFact.setSlotValue("__data", new jess.Value(localValueVector, 512));
/* 676 */       paramRete.assertFact(localFact);
/*     */     }
/*     */     catch (jess.JessException localJessException) {
/* 679 */       JessExceptionHelper.processJessException(localJessException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\Preprocessor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */