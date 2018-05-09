/*      */ package TemplateCompiler;
/*      */ 
/*      */ import java.util.HashSet;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Vector;
/*      */ 
/*      */ public class NLU implements NLUTreeConstants, NLUConstants
/*      */ {
/*    9 */   protected static JJTNLUState jjtree = new JJTNLUState();
/*      */   
/*      */   public static int count;
/*      */   public static int flag;
/*   13 */   public static HashSet templateNames = new HashSet();
/*   14 */   public static HashSet templateNamesForBeat = new HashSet();
/*   15 */   public static HashSet beatNames = new HashSet();
/*   16 */   public static HashSet consts = new HashSet();
/*   17 */   public static HashSet compiled = new HashSet();
/*   18 */   public static HashSet initialFiles = new HashSet();
/*   19 */   public static HashSet retractThese = new HashSet();
/*      */   
/*   21 */   public static Hashtable templateNameToTemplate = new Hashtable();
/*   22 */   public static Hashtable beatNameToTemplateName = new Hashtable();
/*   23 */   public static Hashtable beatNameToIncludes = new Hashtable();
/*   24 */   public static Hashtable fileNameToTemplates = new Hashtable();
/*   25 */   public static Hashtable beatNameToFileName = new Hashtable();
/*      */   
/*      */   private static java.io.BufferedReader in;
/*      */   
/*      */   public static String currentbeat;
/*      */   
/*      */   public static String currentfile;
/*      */   public static int salience;
/*   33 */   static boolean generateRuleRetractionRules = false;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*   38 */   static String startDependency = "(logical";
/*   39 */   static String endDependency = ")";
/*      */   
/*      */   static void jjtreeOpenNodeScope(Node paramNode)
/*      */   {
/*   43 */     ((SimpleNode)paramNode).firstToken = getToken(1);
/*      */   }
/*      */   
/*      */   static void jjtreeCloseNodeScope(Node paramNode)
/*      */   {
/*   48 */     ((SimpleNode)paramNode).lastToken = getToken(0);
/*      */   }
/*      */   
/*      */   public static void usage()
/*      */   {
/*   53 */     System.out.println("The command line options are:");
/*   54 */     System.out.println("<filename> -o <rule object file> -m <rule map file> \n\n");
/*   55 */     System.exit(0);
/*      */   }
/*      */   
/*      */   public static void Preprocess(java.io.FileWriter paramFileWriter, Vector paramVector) throws java.io.IOException {
/*   59 */     if (!paramVector.isEmpty()) {
/*   60 */       java.io.File localFile1 = new java.io.File((String)paramVector.remove(0));
/*      */       
/*   62 */       java.io.BufferedReader localBufferedReader = new java.io.BufferedReader(new java.io.FileReader(localFile1));
/*      */       
/*   64 */       paramFileWriter.write("%fromfile " + localFile1.getAbsolutePath() + '\n');
/*      */       String str1;
/*   66 */       while ((str1 = localBufferedReader.readLine()) != null) {
/*   67 */         localObject = new java.util.StringTokenizer(str1);
/*   68 */         if (((java.util.StringTokenizer)localObject).hasMoreTokens()) {
/*   69 */           if (((java.util.StringTokenizer)localObject).nextToken().equals("include")) {
/*   70 */             java.io.File localFile2 = new java.io.File(((java.util.StringTokenizer)localObject).nextToken());
/*   71 */             String str2 = localFile2.getAbsolutePath();
/*   72 */             if (!compiled.contains(str2)) {
/*   73 */               paramVector.addElement(str2);
/*   74 */               compiled.add(str2);
/*      */             }
/*   76 */             paramFileWriter.write("include " + localFile2.getAbsolutePath() + '\n');
/*      */           } else {
/*   78 */             paramFileWriter.write(str1 + '\n');
/*      */           }
/*   80 */         } else paramFileWriter.write(str1 + '\n');
/*      */       }
/*   82 */       Object localObject = new char['က'];
/*   83 */       for (int i = 0; i < 4096; i++) {
/*   84 */         localObject[i] = 32;
/*      */       }
/*   86 */       paramFileWriter.write("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
/*   87 */       if (!paramVector.isEmpty()) paramFileWriter.write((char[])localObject);
/*   88 */       paramFileWriter.write("\n");
/*   89 */       Preprocess(paramFileWriter, paramVector);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void main(String[] paramArrayOfString)
/*      */     throws ParseException, java.io.IOException, CompileException
/*      */   {
/*  100 */     Vector localVector = new Vector();
/*      */     
/*  102 */     long l1 = 0L;long l2 = 0L;
/*  103 */     String str1 = "default.tem";
/*  104 */     String str2 = "default.rul";
/*  105 */     String str3 = "default.map";
/*      */     
/*  107 */     int i = 1;
/*      */     
/*  109 */     if (paramArrayOfString.length < 5) { usage();
/*      */     }
/*  111 */     for (int j = 0; j < paramArrayOfString.length; j++) {
/*  112 */       if (paramArrayOfString[j].equals("-o")) {
/*  113 */         str2 = paramArrayOfString[(++j)];
/*  114 */       } else if (paramArrayOfString[j].equals("-m")) {
/*  115 */         str3 = paramArrayOfString[(++j)];
/*  116 */       } else if (paramArrayOfString[j].equals("-noBeatSwitch")) {
/*  117 */         generateRuleRetractionRules = false;
/*  118 */       } else if (paramArrayOfString[j].equals("-noDep")) {
/*  119 */         startDependency = "";
/*  120 */         endDependency = "";
/*      */       }
/*  122 */       else if (paramArrayOfString[j].equals("-nobin")) {
/*  123 */         i = 0;
/*      */       }
/*      */       else {
/*  126 */         localObject1 = new java.io.File(paramArrayOfString[j]);
/*  127 */         str1 = ((java.io.File)localObject1).getAbsolutePath();
/*  128 */         localVector.addElement(str1);
/*  129 */         compiled.add(str1);
/*  130 */         initialFiles.add(str1);
/*      */       }
/*      */     }
/*      */     
/*  134 */     System.out.println("Writing mapping to " + str3);
/*  135 */     System.out.println("Writing rules to " + str2);
/*      */     
/*  137 */     java.io.FileOutputStream localFileOutputStream = new java.io.FileOutputStream(str2);
/*  138 */     Object localObject1 = new java.io.FileOutputStream(str3);
/*  139 */     java.io.FileWriter localFileWriter = new java.io.FileWriter(new java.io.File("TEMPORARY"));
/*  140 */     java.io.ObjectOutputStream localObjectOutputStream1; java.io.ObjectOutputStream localObjectOutputStream2; if (i != 0) {
/*  141 */       localObject2 = new java.util.zip.DeflaterOutputStream(localFileOutputStream, new java.util.zip.Deflater(1));
/*  142 */       java.util.zip.DeflaterOutputStream localDeflaterOutputStream = new java.util.zip.DeflaterOutputStream((java.io.OutputStream)localObject1, new java.util.zip.Deflater(1));
/*  143 */       localObjectOutputStream1 = new java.io.ObjectOutputStream((java.io.OutputStream)localObject2);
/*  144 */       localObjectOutputStream2 = new java.io.ObjectOutputStream(localDeflaterOutputStream);
/*      */     } else {
/*  146 */       localObjectOutputStream1 = new java.io.ObjectOutputStream(localFileOutputStream);
/*  147 */       localObjectOutputStream2 = new java.io.ObjectOutputStream((java.io.OutputStream)localObject1);
/*      */     }
/*      */     
/*  150 */     Preprocess(localFileWriter, localVector);
/*  151 */     localFileWriter.flush();
/*      */     
/*  153 */     in = new java.io.BufferedReader(new java.io.FileReader("TEMPORARY"));
/*      */     
/*  155 */     Object localObject2 = new NLU(in);
/*  156 */     count = 0;
/*  157 */     flag = 0;
/*  158 */     TopLevel();
/*      */     
/*  160 */     while (in.ready()) {
/*  161 */       ReInit(in);
/*  162 */       count = 0;
/*  163 */       flag = 0;
/*  164 */       TopLevel();
/*      */     }
/*      */     
/*  167 */     int k = 1;
/*      */     String str4;
/*  169 */     for (; k != 0; 
/*      */         
/*      */ 
/*  172 */         ((java.util.Iterator)localObject3).hasNext())
/*      */     {
/*  170 */       k = 0;
/*  171 */       localObject3 = beatNames.iterator();
/*  172 */       continue;
/*  173 */       str4 = (String)((java.util.Iterator)localObject3).next();
/*      */       
/*  175 */       HashSet localHashSet1 = (HashSet)beatNameToIncludes.get(str4);
/*  176 */       if (localHashSet1 != null) {
/*  177 */         java.util.Iterator localIterator = localHashSet1.iterator();
/*  178 */         while (localIterator.hasNext()) {
/*  179 */           String str5 = (String)localIterator.next();
/*      */           
/*  181 */           HashSet localHashSet2 = (HashSet)fileNameToTemplates.get(str5);
/*  182 */           HashSet localHashSet3 = (HashSet)beatNameToTemplateName.get(str4);
/*      */           
/*      */ 
/*      */ 
/*  186 */           if (localHashSet3 == null) {
/*  187 */             localHashSet3 = new HashSet();
/*      */           }
/*  189 */           int m = localHashSet3.size();
/*  190 */           localHashSet3.addAll(localHashSet2);
/*  191 */           int n = localHashSet3.size();
/*  192 */           if (n - m > 0) {
/*  193 */             beatNameToTemplateName.put(str4, localHashSet3);
/*  194 */             String str6 = (String)beatNameToFileName.get(str4);
/*      */             
/*  196 */             HashSet localHashSet4 = (HashSet)fileNameToTemplates.get(str6);
/*  197 */             localHashSet4.addAll(localHashSet2);
/*  198 */             fileNameToTemplates.put(str6, localHashSet4);
/*  199 */             k = 1;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */     Object localObject3 = beatNameToTemplateName.keys();
/*  222 */     while (((java.util.Enumeration)localObject3).hasMoreElements()) {
/*  223 */       str4 = (String)((java.util.Enumeration)localObject3).nextElement();
/*  224 */       if (str4.startsWith("_FILE_")) {
/*  225 */         beatNameToTemplateName.remove(str4);
/*      */       }
/*      */     }
/*  228 */     templateNameToTemplate.put("_CONST", consts);
/*      */     
/*  230 */     localObjectOutputStream1.writeObject(templateNameToTemplate);
/*  231 */     localObjectOutputStream2.writeObject(beatNameToTemplateName);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  236 */     localObjectOutputStream1.flush();
/*  237 */     localObjectOutputStream2.flush();
/*  238 */     localObjectOutputStream1.close();
/*  239 */     localObjectOutputStream2.close();
/*      */     
/*  241 */     ASTJessRule.printIDKeysToFile("keyfile");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static final void TopLevel()
/*      */     throws ParseException
/*      */   {
/*  254 */     ASTTopLevel localASTTopLevel = new ASTTopLevel(0);
/*  255 */     int i = 1;
/*  256 */     jjtree.openNodeScope(localASTTopLevel);
/*  257 */     jjtreeOpenNodeScope(localASTTopLevel);
/*      */     try {
/*  259 */       IncludeFile();
/*  260 */       if (jj_2_1(2)) {
/*  261 */         BeatLevel();
/*      */       } else {
/*  263 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: 
/*  265 */           NonBeatLevel();
/*  266 */           break;
/*      */         default: 
/*  268 */           jj_la1[0] = jj_gen;
/*  269 */           jj_consume_token(-1);
/*  270 */           throw new ParseException();
/*      */         }
/*      */       }
/*  273 */       jj_consume_token(28);
/*  274 */       jjtree.closeNodeScope(localASTTopLevel, true);
/*  275 */       i = 0;
/*  276 */       jjtreeCloseNodeScope(localASTTopLevel);
/*  277 */       fileNameToTemplates.put(currentfile, templateNames.clone());
/*  278 */       templateNames.clear();
/*      */     } catch (Throwable localThrowable) {
/*  280 */       if (i != 0) {
/*  281 */         jjtree.clearNodeScope(localASTTopLevel);
/*  282 */         i = 0;
/*      */       } else {
/*  284 */         jjtree.popNode();
/*      */       }
/*  286 */       if ((localThrowable instanceof RuntimeException)) {
/*  287 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  289 */       if ((localThrowable instanceof ParseException)) {
/*  290 */         throw ((ParseException)localThrowable);
/*      */       }
/*  292 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  294 */       if (i != 0) {
/*  295 */         jjtree.closeNodeScope(localASTTopLevel, true);
/*  296 */         jjtreeCloseNodeScope(localASTTopLevel);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void IncludeFile() throws ParseException {
/*  302 */     jj_consume_token(18);
/*  303 */     currentfile = FileName();
/*  304 */     if (!initialFiles.contains(currentfile))
/*  305 */       throw new CompileException(getToken(0).endLine - 1, "File " + currentfile + " was included. But it contains a beat called: " + currentbeat);
/*  306 */     System.out.println("Compiling: " + currentfile);
/*      */   }
/*      */   
/*      */   public static final String FileName() throws ParseException
/*      */   {
/*  311 */     String str = Name();
/*  312 */     jj_consume_token(23);
/*  313 */     jj_consume_token(30);
/*  314 */     return str + ':' + getToken(0).image;
/*      */   }
/*      */   
/*      */   public static final String Name() throws ParseException
/*      */   {
/*  319 */     jj_consume_token(29);
/*  320 */     return getToken(0).image;
/*      */   }
/*      */   
/*      */   public static final void Include()
/*      */     throws ParseException
/*      */   {
/*  326 */     ASTInclude localASTInclude = new ASTInclude(2);
/*  327 */     int i = 1;
/*  328 */     jjtree.openNodeScope(localASTInclude);
/*  329 */     jjtreeOpenNodeScope(localASTInclude);
/*      */     try {
/*  331 */       jj_consume_token(19);
/*  332 */       String str = FileName();
/*  333 */       jjtree.closeNodeScope(localASTInclude, true);
/*  334 */       i = 0;
/*  335 */       jjtreeCloseNodeScope(localASTInclude);
/*  336 */       HashSet localHashSet = (HashSet)beatNameToIncludes.get(currentbeat);
/*  337 */       if (localHashSet == null) {
/*  338 */         localHashSet = new HashSet();
/*      */       }
/*  340 */       localHashSet.add(str);
/*  341 */       beatNameToIncludes.put(currentbeat, localHashSet);
/*      */     } catch (Throwable localThrowable) {
/*  343 */       if (i != 0) {
/*  344 */         jjtree.clearNodeScope(localASTInclude);
/*  345 */         i = 0;
/*      */       } else {
/*  347 */         jjtree.popNode();
/*      */       }
/*  349 */       if ((localThrowable instanceof RuntimeException)) {
/*  350 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  352 */       if ((localThrowable instanceof ParseException)) {
/*  353 */         throw ((ParseException)localThrowable);
/*      */       }
/*  355 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  357 */       if (i != 0) {
/*  358 */         jjtree.closeNodeScope(localASTInclude, true);
/*  359 */         jjtreeCloseNodeScope(localASTInclude);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void NonBeatLevel() throws ParseException
/*      */   {
/*      */     for (;;) {
/*  367 */       if (jj_2_2(2)) {
/*  368 */         JessRule();
/*  369 */       } else if (jj_2_3(2)) {
/*  370 */         TypeDef();
/*      */       } else {
/*  372 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: 
/*  374 */           MapDef();
/*  375 */           break;
/*      */         default: 
/*  377 */           jj_la1[1] = jj_gen;
/*  378 */           jj_consume_token(-1);
/*  379 */           throw new ParseException();
/*      */         }
/*      */       }
/*  382 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */       {
/*      */       case 13: 
/*      */         break;
/*      */       default: 
/*  387 */         jj_la1[2] = jj_gen;
/*      */         break label137; }
/*      */     }
/*      */     label137:
/*  391 */     currentbeat = "_FILE_" + currentfile;
/*  392 */     beatNames.add(currentbeat);
/*  393 */     beatNameToTemplateName.put(currentbeat, templateNamesForBeat.clone());
/*  394 */     beatNameToFileName.put(currentbeat, currentfile);
/*  395 */     templateNamesForBeat.clear();
/*      */   }
/*      */   
/*      */   public static final void BeatLevel() throws ParseException
/*      */   {
/*      */     for (;;) {
/*  401 */       jj_consume_token(13);
/*  402 */       jj_consume_token(11);
/*  403 */       currentbeat = Name();
/*      */       for (;;)
/*      */       {
/*  406 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: case 19: 
/*      */           break;
/*      */         case 14: case 15: 
/*      */         case 16: case 17: 
/*      */         case 18: default: 
/*  412 */           jj_la1[3] = jj_gen;
/*  413 */           break;
/*      */         }
/*  415 */         if (jj_2_4(2)) {
/*  416 */           Include();
/*  417 */         } else if (jj_2_5(2)) {
/*  418 */           JessRule();
/*  419 */         } else if (jj_2_6(2)) {
/*  420 */           TypeDef();
/*      */         } else {
/*  422 */           switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */           case 13: 
/*  424 */             MapDef();
/*  425 */             break;
/*      */           default: 
/*  427 */             jj_la1[4] = jj_gen;
/*  428 */             jj_consume_token(-1);
/*  429 */             throw new ParseException();
/*      */           }
/*      */         }
/*      */       }
/*  433 */       jj_consume_token(14);
/*  434 */       System.out.println("Compiled Beat: " + currentbeat);
/*  435 */       beatNames.add(currentbeat);
/*  436 */       beatNameToTemplateName.put(currentbeat, templateNamesForBeat.clone());
/*  437 */       beatNameToFileName.put(currentbeat, currentfile);
/*  438 */       templateNamesForBeat.clear();
/*  439 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */       {
/*      */       case 13: 
/*      */         break;
/*      */       default: 
/*  444 */         jj_la1[5] = jj_gen;
/*  445 */         return;
/*      */       }
/*      */       
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public static final ASTStart TemplateTopLevel()
/*      */     throws ParseException
/*      */   {
/*  455 */     ASTStart localASTStart1 = new ASTStart(3);
/*  456 */     int i = 1;
/*  457 */     jjtree.openNodeScope(localASTStart1);
/*  458 */     jjtreeOpenNodeScope(localASTStart1);
/*      */     try {
/*  460 */       jj_consume_token(13);
/*  461 */       jj_consume_token(7);
/*  462 */       Template();
/*  463 */       NLUTokenManager.SwitchTo(0);
/*  464 */       jj_consume_token(14);
/*  465 */       jjtree.closeNodeScope(localASTStart1, true);
/*  466 */       i = 0;
/*  467 */       jjtreeCloseNodeScope(localASTStart1);
/*  468 */       return localASTStart1;
/*      */     } catch (Throwable localThrowable) {
/*  470 */       if (i != 0) {
/*  471 */         jjtree.clearNodeScope(localASTStart1);
/*  472 */         i = 0;
/*      */       } else {
/*  474 */         jjtree.popNode();
/*      */       }
/*  476 */       if ((localThrowable instanceof RuntimeException)) {
/*  477 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  479 */       if ((localThrowable instanceof ParseException)) {
/*  480 */         throw ((ParseException)localThrowable);
/*      */       }
/*  482 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  484 */       if (i != 0) {
/*  485 */         jjtree.closeNodeScope(localASTStart1, true);
/*  486 */         jjtreeCloseNodeScope(localASTStart1);
/*      */       }
/*      */     }
/*  489 */     throw new Error("Missing return statement in function");
/*      */   }
/*      */   
/*      */   public static final void Declare() throws ParseException
/*      */   {
/*  494 */     ASTDeclare localASTDeclare = new ASTDeclare(4);
/*  495 */     int i = 1;
/*  496 */     jjtree.openNodeScope(localASTDeclare);
/*  497 */     jjtreeOpenNodeScope(localASTDeclare);
/*      */     try
/*      */     {
/*      */       for (;;) {
/*  501 */         jj_consume_token(13);
/*  502 */         jj_consume_token(29);
/*  503 */         jj_consume_token(29);
/*  504 */         jj_consume_token(14);
/*  505 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 13: 
/*      */           break;
/*      */         default: 
/*  510 */           jj_la1[6] = jj_gen;
/*      */           break label98; }
/*      */       }
/*      */     } finally {
/*      */       label98:
/*  515 */       if (i != 0) {
/*  516 */         jjtree.closeNodeScope(localASTDeclare, true);
/*  517 */         jjtreeCloseNodeScope(localASTDeclare);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void DeclareTop() throws ParseException {
/*  523 */     jj_consume_token(13);
/*  524 */     jj_consume_token(12);
/*  525 */     Declare();
/*  526 */     jj_consume_token(14);
/*      */   }
/*      */   
/*      */   public static final void JessRule() throws ParseException
/*      */   {
/*  531 */     ASTJessRule localASTJessRule = new ASTJessRule(5);
/*  532 */     int i = 1;
/*  533 */     jjtree.openNodeScope(localASTJessRule);
/*  534 */     jjtreeOpenNodeScope(localASTJessRule);java.io.StringWriter localStringWriter1 = new java.io.StringWriter();
/*  535 */     java.io.BufferedWriter localBufferedWriter1 = new java.io.BufferedWriter(localStringWriter1);
/*      */     
/*      */ 
/*      */ 
/*  539 */     ASTStart localASTStart = null;
/*  540 */     java.io.StringWriter localStringWriter4 = new java.io.StringWriter();
/*  541 */     java.io.BufferedWriter localBufferedWriter2 = new java.io.BufferedWriter(localStringWriter4);
/*      */     try {
/*  543 */       jj_consume_token(13);
/*  544 */       jj_consume_token(8);
/*  545 */       String str = Name();
/*  546 */       if (jj_2_7(2)) {
/*  547 */         DeclareTop();
/*      */       }
/*      */       
/*      */ 
/*      */       for (;;)
/*      */       {
/*  553 */         if (jj_2_8(2)) {
/*  554 */           localASTStart = TemplateTopLevel();
/*      */         } else {
/*  556 */           switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */           case 13: 
/*      */           case 25: 
/*      */           case 29: 
/*  560 */             LHside();
/*  561 */             break;
/*      */           case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 26: case 27: case 28: default: 
/*  563 */             jj_la1[7] = jj_gen;
/*  564 */             jj_consume_token(-1);
/*  565 */             throw new ParseException();
/*      */           }
/*      */         }
/*  568 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: case 25: case 29: 
/*      */           break;
/*      */         case 14: case 15: case 16: case 17: 
/*      */         case 18: case 19: case 20: case 21: 
/*      */         case 22: case 23: case 24: case 26: 
/*      */         case 27: case 28: default: 
/*  575 */           jj_la1[8] = jj_gen;
/*      */           break label350; }
/*      */       }
/*      */       label350:
/*  579 */       jj_consume_token(26);
/*      */       for (;;)
/*      */       {
/*  582 */         RHside();
/*  583 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 13: 
/*      */           break;
/*      */         default: 
/*  588 */           jj_la1[9] = jj_gen;
/*      */           break label410; }
/*      */       }
/*      */       label410:
/*  592 */       jj_consume_token(14);
/*  593 */       jjtree.closeNodeScope(localASTJessRule, true);
/*  594 */       i = 0;
/*  595 */       jjtreeCloseNodeScope(localASTJessRule);
/*  596 */       java.io.StringWriter localStringWriter2 = new java.io.StringWriter();
/*  597 */       java.io.StringWriter localStringWriter3 = new java.io.StringWriter();
/*  598 */       salience = 50;
/*  599 */       int j = localASTJessRule.handleDeclare(localBufferedWriter2);
/*      */       
/*  601 */       if (localASTStart != null) {
/*  602 */         localASTStart.compileToplevel(localStringWriter2, localStringWriter3, localBufferedWriter1, null);
/*  603 */         localBufferedWriter1.flush();
/*      */       }
/*      */       
/*      */ 
/*  607 */       localASTJessRule.compileToJessRule(localStringWriter2.getBuffer().toString(), localStringWriter3.getBuffer().toString(), localBufferedWriter2, j);
/*      */       
/*      */ 
/*      */ 
/*  611 */       localBufferedWriter2.write(localStringWriter1.getBuffer().toString());
/*  612 */       localBufferedWriter2.flush();
/*      */       
/*      */ 
/*      */ 
/*  616 */       if (templateNameToTemplate.get(str) != null)
/*  617 */         throw new CompileException(getToken(0).endLine - 1, "Attempt to redefine rule " + str);
/*  618 */       templateNameToTemplate.put(str, localStringWriter4.getBuffer().toString());
/*  619 */       templateNames.add(str);
/*  620 */       templateNamesForBeat.add(str);
/*      */     } catch (Throwable localThrowable) {
/*  622 */       if (i != 0) {
/*  623 */         jjtree.clearNodeScope(localASTJessRule);
/*  624 */         i = 0;
/*      */       } else {
/*  626 */         jjtree.popNode();
/*      */       }
/*  628 */       if ((localThrowable instanceof RuntimeException)) {
/*  629 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  631 */       if ((localThrowable instanceof ParseException)) {
/*  632 */         throw ((ParseException)localThrowable);
/*      */       }
/*  634 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  636 */       if (i != 0) {
/*  637 */         jjtree.closeNodeScope(localASTJessRule, true);
/*  638 */         jjtreeCloseNodeScope(localASTJessRule);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void TypeDefOr() throws ParseException
/*      */   {
/*  645 */     ASTTypeDefOr localASTTypeDefOr = new ASTTypeDefOr(6);
/*  646 */     int i = 1;
/*  647 */     jjtree.openNodeScope(localASTTypeDefOr);
/*  648 */     jjtreeOpenNodeScope(localASTTypeDefOr);
/*      */     try {
/*  650 */       jj_consume_token(13);
/*  651 */       TypeDefArg();
/*      */       for (;;)
/*      */       {
/*  654 */         jj_consume_token(17);
/*  655 */         TypeDefArg();
/*  656 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 17: 
/*      */           break;
/*      */         default: 
/*  661 */           jj_la1[10] = jj_gen;
/*      */           break label94; }
/*      */       }
/*      */       label94:
/*  665 */       jj_consume_token(14);
/*      */     } catch (Throwable localThrowable) {
/*  667 */       if (i != 0) {
/*  668 */         jjtree.clearNodeScope(localASTTypeDefOr);
/*  669 */         i = 0;
/*      */       } else {
/*  671 */         jjtree.popNode();
/*      */       }
/*  673 */       if ((localThrowable instanceof RuntimeException)) {
/*  674 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  676 */       if ((localThrowable instanceof ParseException)) {
/*  677 */         throw ((ParseException)localThrowable);
/*      */       }
/*  679 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  681 */       if (i != 0) {
/*  682 */         jjtree.closeNodeScope(localASTTypeDefOr, true);
/*  683 */         jjtreeCloseNodeScope(localASTTypeDefOr);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void TypeDefArg() throws ParseException
/*      */   {
/*  690 */     ASTTypeDefArg localASTTypeDefArg = new ASTTypeDefArg(7);
/*  691 */     int i = 1;
/*  692 */     jjtree.openNodeScope(localASTTypeDefArg);
/*  693 */     jjtreeOpenNodeScope(localASTTypeDefArg);
/*      */     try {
/*  695 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */       case 29: 
/*  697 */         jj_consume_token(29);
/*  698 */         break;
/*      */       case 45: 
/*  700 */         jj_consume_token(45);
/*  701 */         break;
/*      */       case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: default: 
/*  703 */         jj_la1[11] = jj_gen;
/*  704 */         jj_consume_token(-1);
/*  705 */         throw new ParseException();
/*      */       }
/*      */     } finally {
/*  708 */       if (i != 0) {
/*  709 */         jjtree.closeNodeScope(localASTTypeDefArg, true);
/*  710 */         jjtreeCloseNodeScope(localASTTypeDefArg);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void TypeDef() throws ParseException
/*      */   {
/*  717 */     ASTTypeDef localASTTypeDef = new ASTTypeDef(8);
/*  718 */     int i = 1;
/*  719 */     jjtree.openNodeScope(localASTTypeDef);
/*  720 */     jjtreeOpenNodeScope(localASTTypeDef);
/*      */     try {
/*  722 */       jj_consume_token(13);
/*  723 */       jj_consume_token(10);
/*  724 */       jj_consume_token(29);
/*      */       for (;;)
/*      */       {
/*  727 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: case 29: case 45: 
/*      */           break;
/*      */         case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
/*      */         case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 30: 
/*      */         case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: 
/*      */         case 39: case 40: case 41: case 42: case 43: case 44: default: 
/*  734 */           jj_la1[12] = jj_gen;
/*  735 */           break;
/*      */         }
/*  737 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 13: 
/*  739 */           TypeDefOr();
/*  740 */           break;
/*      */         case 29: 
/*      */         case 45: 
/*  743 */           TypeDefArg();
/*  744 */           break;
/*      */         case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: default: 
/*  746 */           jj_la1[13] = jj_gen;
/*  747 */           jj_consume_token(-1);
/*  748 */           throw new ParseException();
/*      */         }
/*      */       }
/*  751 */       jj_consume_token(14);
/*  752 */       jjtree.closeNodeScope(localASTTypeDef, true);
/*  753 */       i = 0;
/*  754 */       jjtreeCloseNodeScope(localASTTypeDef);
/*  755 */       localASTTypeDef.AddToList();
/*      */     } catch (Throwable localThrowable) {
/*  757 */       if (i != 0) {
/*  758 */         jjtree.clearNodeScope(localASTTypeDef);
/*  759 */         i = 0;
/*      */       } else {
/*  761 */         jjtree.popNode();
/*      */       }
/*  763 */       if ((localThrowable instanceof RuntimeException)) {
/*  764 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  766 */       if ((localThrowable instanceof ParseException)) {
/*  767 */         throw ((ParseException)localThrowable);
/*      */       }
/*  769 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  771 */       if (i != 0) {
/*  772 */         jjtree.closeNodeScope(localASTTypeDef, true);
/*  773 */         jjtreeCloseNodeScope(localASTTypeDef);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void MapDef() throws ParseException
/*      */   {
/*  780 */     ASTMapDef localASTMapDef = new ASTMapDef(9);
/*  781 */     int i = 1;
/*  782 */     jjtree.openNodeScope(localASTMapDef);
/*  783 */     jjtreeOpenNodeScope(localASTMapDef);
/*      */     try {
/*  785 */       jj_consume_token(13);
/*  786 */       jj_consume_token(9);
/*  787 */       jj_consume_token(29);
/*  788 */       jj_consume_token(29);
/*  789 */       jj_consume_token(14);
/*  790 */       jjtree.closeNodeScope(localASTMapDef, true);
/*  791 */       i = 0;
/*  792 */       jjtreeCloseNodeScope(localASTMapDef);
/*  793 */       localASTMapDef.AddDef(consts);
/*      */     } finally {
/*  795 */       if (i != 0) {
/*  796 */         jjtree.closeNodeScope(localASTMapDef, true);
/*  797 */         jjtreeCloseNodeScope(localASTMapDef);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void LHside()
/*      */     throws ParseException
/*      */   {
/*  805 */     ASTLHside localASTLHside = new ASTLHside(10);
/*  806 */     int i = 1;
/*  807 */     jjtree.openNodeScope(localASTLHside);
/*  808 */     jjtreeOpenNodeScope(localASTLHside);
/*      */     try {
/*  810 */       if (jj_2_14(2)) {
/*  811 */         jj_consume_token(13);
/*      */         for (;;)
/*      */         {
/*  814 */           jj_consume_token(29);
/*      */           for (;;)
/*      */           {
/*  817 */             switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */             {
/*      */             case 24: 
/*      */               break;
/*      */             default: 
/*  822 */               jj_la1[14] = jj_gen;
/*  823 */               break;
/*      */             }
/*  825 */             jj_consume_token(24);
/*  826 */             jj_consume_token(23);
/*  827 */             LHside();
/*      */           }
/*  829 */           if (!jj_2_9(2)) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         for (;;)
/*      */         {
/*  837 */           switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */           case 13: case 25: case 29: 
/*      */             break;
/*      */           case 14: case 15: case 16: case 17: 
/*      */           case 18: case 19: case 20: case 21: 
/*      */           case 22: case 23: case 24: case 26: 
/*      */           case 27: case 28: default: 
/*  844 */             jj_la1[15] = jj_gen;
/*  845 */             break;
/*      */           }
/*  847 */           LHside();
/*      */         }
/*  849 */         jj_consume_token(14);
/*      */       } else {
/*  851 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 29: 
/*  853 */           jj_consume_token(29);
/*  854 */           jj_consume_token(27);
/*  855 */           LHside();
/*  856 */           break;
/*      */         default: 
/*  858 */           jj_la1[22] = jj_gen;
/*  859 */           if (jj_2_15(2)) {
/*  860 */             jj_consume_token(13);
/*  861 */             jj_consume_token(20);
/*  862 */             LHside();
/*      */             for (;;)
/*      */             {
/*  865 */               LHside();
/*  866 */               switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */               case 13: case 25: case 29: 
/*      */                 break;
/*      */               case 14: case 15: case 16: case 17: 
/*      */               case 18: case 19: case 20: case 21: 
/*      */               case 22: case 23: case 24: case 26: 
/*      */               case 27: case 28: default: 
/*  873 */                 jj_la1[16] = jj_gen;
/*      */                 break label454; }
/*      */             }
/*      */             label454:
/*  877 */             jj_consume_token(14);
/*  878 */           } else if (jj_2_16(2)) {
/*  879 */             jj_consume_token(13);
/*  880 */             jj_consume_token(21);
/*  881 */             LHside();
/*      */             for (;;)
/*      */             {
/*  884 */               LHside();
/*  885 */               switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */               case 13: case 25: case 29: 
/*      */                 break;
/*      */               case 14: case 15: case 16: case 17: 
/*      */               case 18: case 19: case 20: case 21: 
/*      */               case 22: case 23: case 24: case 26: 
/*      */               case 27: case 28: default: 
/*  892 */                 jj_la1[17] = jj_gen;
/*      */                 break label606; }
/*      */             }
/*      */             label606:
/*  896 */             jj_consume_token(14);
/*  897 */           } else if (jj_2_17(2)) {
/*  898 */             jj_consume_token(13);
/*  899 */             jj_consume_token(25);
/*  900 */             if (jj_2_10(2)) {
/*  901 */               LHside();
/*      */             } else {
/*  903 */               switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */               case 29: 
/*  905 */                 jj_consume_token(29);
/*  906 */                 break;
/*      */               default: 
/*  908 */                 jj_la1[18] = jj_gen;
/*  909 */                 jj_consume_token(-1);
/*  910 */                 throw new ParseException();
/*      */               }
/*      */             }
/*  913 */             if (jj_2_11(2)) {
/*  914 */               LHside();
/*      */             } else {
/*  916 */               switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */               case 29: 
/*  918 */                 jj_consume_token(29);
/*  919 */                 break;
/*      */               default: 
/*  921 */                 jj_la1[19] = jj_gen;
/*  922 */                 jj_consume_token(-1);
/*  923 */                 throw new ParseException();
/*      */               }
/*      */             }
/*  926 */             jj_consume_token(14);
/*      */           } else {
/*  928 */             switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */             case 25: 
/*  930 */               jj_consume_token(25);
/*  931 */               if (jj_2_12(2)) {
/*  932 */                 LHside();
/*      */               } else {
/*  934 */                 switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */                 case 29: 
/*  936 */                   jj_consume_token(29);
/*  937 */                   break;
/*      */                 default: 
/*  939 */                   jj_la1[20] = jj_gen;
/*  940 */                   jj_consume_token(-1);
/*  941 */                   throw new ParseException();
/*      */                 }
/*      */               }
/*  944 */               if (jj_2_13(2)) {
/*  945 */                 LHside();
/*      */               } else {
/*  947 */                 switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */                 case 29: 
/*  949 */                   jj_consume_token(29);
/*  950 */                   break;
/*      */                 default: 
/*  952 */                   jj_la1[21] = jj_gen;
/*  953 */                   jj_consume_token(-1);
/*  954 */                   throw new ParseException();
/*      */                 }
/*      */               }
/*  957 */               jjtree.closeNodeScope(localASTLHside, true);
/*  958 */               i = 0;
/*  959 */               jjtreeCloseNodeScope(localASTLHside);
/*  960 */               localASTLHside.typeCheck(consts);
/*  961 */               break;
/*      */             default: 
/*  963 */               jj_la1[23] = jj_gen;
/*  964 */               jj_consume_token(-1);
/*  965 */               throw new ParseException();
/*      */             }
/*      */           }
/*      */           break; }
/*      */       }
/*      */     } catch (Throwable localThrowable) {
/*  971 */       if (i != 0) {
/*  972 */         jjtree.clearNodeScope(localASTLHside);
/*  973 */         i = 0;
/*      */       } else {
/*  975 */         jjtree.popNode();
/*      */       }
/*  977 */       if ((localThrowable instanceof RuntimeException)) {
/*  978 */         throw ((RuntimeException)localThrowable);
/*      */       }
/*  980 */       if ((localThrowable instanceof ParseException)) {
/*  981 */         throw ((ParseException)localThrowable);
/*      */       }
/*  983 */       throw ((Error)localThrowable);
/*      */     } finally {
/*  985 */       if (i != 0) {
/*  986 */         jjtree.closeNodeScope(localASTLHside, true);
/*  987 */         jjtreeCloseNodeScope(localASTLHside);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void RHside() throws ParseException
/*      */   {
/*  994 */     ASTRHside localASTRHside = new ASTRHside(11);
/*  995 */     int i = 1;
/*  996 */     jjtree.openNodeScope(localASTRHside);
/*  997 */     jjtreeOpenNodeScope(localASTRHside);
/*      */     try {
/*  999 */       jj_consume_token(13);
/*      */       for (;;)
/*      */       {
/* 1002 */         jj_consume_token(29);
/* 1003 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 29: 
/*      */           break;
/*      */         default: 
/* 1008 */           jj_la1[24] = jj_gen;
/*      */           break label86;
/*      */         }
/*      */       }
/*      */       for (;;) {
/*      */         label86:
/* 1014 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 13: 
/*      */           break;
/*      */         default: 
/* 1019 */           jj_la1[25] = jj_gen;
/* 1020 */           break;
/*      */         }
/* 1022 */         RHside();
/*      */       }
/* 1024 */       jj_consume_token(14);
/* 1025 */       jjtree.closeNodeScope(localASTRHside, true);
/* 1026 */       i = 0;
/* 1027 */       jjtreeCloseNodeScope(localASTRHside);
/* 1028 */       localASTRHside.typeCheck(consts);
/*      */     } catch (Throwable localThrowable) {
/* 1030 */       if (i != 0) {
/* 1031 */         jjtree.clearNodeScope(localASTRHside);
/* 1032 */         i = 0;
/*      */       } else {
/* 1034 */         jjtree.popNode();
/*      */       }
/* 1036 */       if ((localThrowable instanceof RuntimeException)) {
/* 1037 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1039 */       if ((localThrowable instanceof ParseException)) {
/* 1040 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1042 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1044 */       if (i != 0) {
/* 1045 */         jjtree.closeNodeScope(localASTRHside, true);
/* 1046 */         jjtreeCloseNodeScope(localASTRHside);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final int DoWeRetract() throws ParseException {
/* 1052 */     jj_consume_token(41);
/* 1053 */     return 1;
/*      */   }
/*      */   
/*      */   public static final void Template()
/*      */     throws ParseException
/*      */   {
/* 1059 */     ASTTemplate localASTTemplate = new ASTTemplate(12);
/* 1060 */     int i = 1;
/* 1061 */     jjtree.openNodeScope(localASTTemplate);
/* 1062 */     jjtreeOpenNodeScope(localASTTemplate);int j = 0;
/*      */     try {
/* 1064 */       if (jj_2_18(3)) {
/* 1065 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 41: 
/* 1067 */           j = DoWeRetract();
/* 1068 */           break;
/*      */         default: 
/* 1070 */           jj_la1[26] = jj_gen;
/*      */         }
/*      */         
/* 1073 */         Occursexp();
/* 1074 */       } else if (jj_2_19(3)) {
/* 1075 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 41: 
/* 1077 */           j = DoWeRetract();
/* 1078 */           break;
/*      */         default: 
/* 1080 */           jj_la1[27] = jj_gen;
/*      */         }
/*      */         
/* 1083 */         Regexp();
/* 1084 */       } else if (jj_2_20(Integer.MAX_VALUE)) {
/* 1085 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 41: 
/* 1087 */           j = DoWeRetract();
/* 1088 */           break;
/*      */         default: 
/* 1090 */           jj_la1[28] = jj_gen;
/*      */         }
/*      */         
/* 1093 */         jj_consume_token(35);
/* 1094 */         jj_consume_token(34);
/* 1095 */         Occursexp();
/* 1096 */         jj_consume_token(36);
/*      */       } else {
/* 1098 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 35: 
/*      */         case 41: 
/* 1101 */           switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */           case 41: 
/* 1103 */             j = DoWeRetract();
/* 1104 */             break;
/*      */           default: 
/* 1106 */             jj_la1[29] = jj_gen;
/*      */           }
/*      */           
/* 1109 */           jj_consume_token(35);
/* 1110 */           jj_consume_token(34);
/* 1111 */           Regexp();
/* 1112 */           jj_consume_token(36);
/* 1113 */           break;
/*      */         case 36: case 37: case 38: case 39: case 40: default: 
/* 1115 */           jj_la1[30] = jj_gen;
/* 1116 */           jj_consume_token(-1);
/* 1117 */           throw new ParseException();
/*      */         }
/*      */       }
/* 1120 */       jjtree.closeNodeScope(localASTTemplate, true);
/* 1121 */       i = 0;
/* 1122 */       jjtreeCloseNodeScope(localASTTemplate);
/* 1123 */       if (j == 1) {
/* 1124 */         localASTTemplate.setRetraction(true);
/*      */       }
/*      */     } catch (Throwable localThrowable) {
/* 1127 */       if (i != 0) {
/* 1128 */         jjtree.clearNodeScope(localASTTemplate);
/* 1129 */         i = 0;
/*      */       } else {
/* 1131 */         jjtree.popNode();
/*      */       }
/* 1133 */       if ((localThrowable instanceof RuntimeException)) {
/* 1134 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1136 */       if ((localThrowable instanceof ParseException)) {
/* 1137 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1139 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1141 */       if (i != 0) {
/* 1142 */         jjtree.closeNodeScope(localASTTemplate, true);
/* 1143 */         jjtreeCloseNodeScope(localASTTemplate);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Occursexp() throws ParseException {
/* 1149 */     if (jj_2_21(2)) {
/* 1150 */       Oand();
/* 1151 */     } else if (jj_2_22(2)) {
/* 1152 */       Oor();
/*      */     } else {
/* 1154 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */       case 35: 
/* 1156 */         Osingle();
/* 1157 */         break;
/*      */       default: 
/* 1159 */         jj_la1[31] = jj_gen;
/* 1160 */         jj_consume_token(-1);
/* 1161 */         throw new ParseException();
/*      */       }
/*      */     }
/* 1164 */     if (count == 0) flag = 1;
/*      */   }
/*      */   
/*      */   public static final void wordmatch() throws ParseException
/*      */   {
/* 1169 */     ASTWordMatch localASTWordMatch = new ASTWordMatch(13);
/* 1170 */     int i = 1;
/* 1171 */     jjtree.openNodeScope(localASTWordMatch);
/* 1172 */     jjtreeOpenNodeScope(localASTWordMatch);
/*      */     try {
/* 1174 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */       case 46: 
/* 1176 */         jj_consume_token(46);
/* 1177 */         break;
/*      */       case 53: 
/* 1179 */         jj_consume_token(53);
/* 1180 */         break;
/*      */       case 47: case 48: case 49: case 50: case 51: case 52: default: 
/* 1182 */         jj_la1[32] = jj_gen;
/* 1183 */         jj_consume_token(-1);
/* 1184 */         throw new ParseException();
/*      */       }
/*      */     } finally {
/* 1187 */       if (i != 0) {
/* 1188 */         jjtree.closeNodeScope(localASTWordMatch, true);
/* 1189 */         jjtreeCloseNodeScope(localASTWordMatch);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void wildcardmatch() throws ParseException
/*      */   {
/* 1196 */     ASTWildMatch localASTWildMatch = new ASTWildMatch(14);
/* 1197 */     int i = 1;
/* 1198 */     jjtree.openNodeScope(localASTWildMatch);
/* 1199 */     jjtreeOpenNodeScope(localASTWildMatch);
/*      */     try {
/* 1201 */       jj_consume_token(45);
/*      */     } finally {
/* 1203 */       if (i != 0) {
/* 1204 */         jjtree.closeNodeScope(localASTWildMatch, true);
/* 1205 */         jjtreeCloseNodeScope(localASTWildMatch);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void TermExpand() throws ParseException
/*      */   {
/* 1212 */     ASTTermExpand localASTTermExpand = new ASTTermExpand(15);
/* 1213 */     int i = 1;
/* 1214 */     jjtree.openNodeScope(localASTTermExpand);
/* 1215 */     jjtreeOpenNodeScope(localASTTermExpand);
/*      */     try {
/* 1217 */       jj_consume_token(39);
/* 1218 */       jj_consume_token(46);
/* 1219 */       jj_consume_token(50);
/* 1220 */       jj_consume_token(40);
/*      */     } finally {
/* 1222 */       if (i != 0) {
/* 1223 */         jjtree.closeNodeScope(localASTTermExpand, true);
/* 1224 */         jjtreeCloseNodeScope(localASTTermExpand);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void RootMatch() throws ParseException
/*      */   {
/* 1231 */     ASTRootMatch localASTRootMatch = new ASTRootMatch(16);
/* 1232 */     int i = 1;
/* 1233 */     jjtree.openNodeScope(localASTRootMatch);
/* 1234 */     jjtreeOpenNodeScope(localASTRootMatch);
/*      */     try {
/* 1236 */       jj_consume_token(39);
/* 1237 */       jj_consume_token(46);
/* 1238 */       jj_consume_token(51);
/* 1239 */       jj_consume_token(40);
/*      */     } finally {
/* 1241 */       if (i != 0) {
/* 1242 */         jjtree.closeNodeScope(localASTRootMatch, true);
/* 1243 */         jjtreeCloseNodeScope(localASTRootMatch);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void PositionalFact() throws ParseException
/*      */   {
/* 1250 */     ASTPositional localASTPositional = new ASTPositional(17);
/* 1251 */     int i = 1;
/* 1252 */     jjtree.openNodeScope(localASTPositional);
/* 1253 */     jjtreeOpenNodeScope(localASTPositional);
/*      */     try {
/* 1255 */       jj_consume_token(42);
/* 1256 */       jj_consume_token(46);
/*      */       for (;;)
/*      */       {
/* 1259 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 46: case 52: 
/*      */           break;
/*      */         case 47: case 48: 
/*      */         case 49: case 50: 
/*      */         case 51: default: 
/* 1265 */           jj_la1[33] = jj_gen;
/* 1266 */           break;
/*      */         }
/* 1268 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 52: 
/* 1270 */           jj_consume_token(52);
/* 1271 */           break;
/*      */         case 46: 
/* 1273 */           jj_consume_token(46);
/* 1274 */           break;
/*      */         case 47: case 48: case 49: case 50: case 51: default: 
/* 1276 */           jj_la1[34] = jj_gen;
/* 1277 */           jj_consume_token(-1);
/* 1278 */           throw new ParseException();
/*      */         }
/*      */       }
/* 1281 */       jj_consume_token(43);
/*      */     } finally {
/* 1283 */       if (i != 0) {
/* 1284 */         jjtree.closeNodeScope(localASTPositional, true);
/* 1285 */         jjtreeCloseNodeScope(localASTPositional);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Regexp() throws ParseException {
/* 1291 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */     case 46: 
/*      */     case 53: 
/* 1294 */       wordmatch();
/* 1295 */       break;
/*      */     case 37: 
/* 1297 */       Regexpopt();
/* 1298 */       break;
/*      */     case 42: 
/* 1300 */       PositionalFact();
/* 1301 */       break;
/*      */     case 38: case 39: case 40: case 41: case 43: case 44: case 45: case 47: case 48: case 49: case 50: case 51: case 52: default: 
/* 1303 */       jj_la1[35] = jj_gen;
/* 1304 */       if (jj_2_23(Integer.MAX_VALUE)) {
/* 1305 */         Regexpand();
/*      */       } else {
/* 1307 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 35: 
/* 1309 */           Regexpor();
/* 1310 */           break;
/*      */         case 45: 
/* 1312 */           wildcardmatch();
/* 1313 */           break;
/*      */         case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: default: 
/* 1315 */           jj_la1[36] = jj_gen;
/* 1316 */           jj_consume_token(-1);
/* 1317 */           throw new ParseException();
/*      */         }
/*      */       }
/*      */       break;
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Regexpopt() throws ParseException {
/* 1325 */     ASTRegexpopt localASTRegexpopt = new ASTRegexpopt(18);
/* 1326 */     int i = 1;
/* 1327 */     jjtree.openNodeScope(localASTRegexpopt);
/* 1328 */     jjtreeOpenNodeScope(localASTRegexpopt);
/*      */     try {
/* 1330 */       jj_consume_token(37);
/* 1331 */       Template();
/* 1332 */       jj_consume_token(38);
/*      */     } catch (Throwable localThrowable) {
/* 1334 */       if (i != 0) {
/* 1335 */         jjtree.clearNodeScope(localASTRegexpopt);
/* 1336 */         i = 0;
/*      */       } else {
/* 1338 */         jjtree.popNode();
/*      */       }
/* 1340 */       if ((localThrowable instanceof RuntimeException)) {
/* 1341 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1343 */       if ((localThrowable instanceof ParseException)) {
/* 1344 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1346 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1348 */       if (i != 0) {
/* 1349 */         jjtree.closeNodeScope(localASTRegexpopt, true);
/* 1350 */         jjtreeCloseNodeScope(localASTRegexpopt);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static final void Regexpor()
/*      */     throws ParseException
/*      */   {
/* 1369 */     ASTRegexpor localASTRegexpor = new ASTRegexpor(19);
/* 1370 */     int i = 1;
/* 1371 */     jjtree.openNodeScope(localASTRegexpor);
/* 1372 */     jjtreeOpenNodeScope(localASTRegexpor);
/*      */     try {
/* 1374 */       jj_consume_token(35);
/* 1375 */       Template();
/*      */       for (;;)
/*      */       {
/* 1378 */         jj_consume_token(44);
/* 1379 */         Template();
/* 1380 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*      */         {
/*      */         case 44: 
/*      */           break;
/*      */         default: 
/* 1385 */           jj_la1[37] = jj_gen;
/*      */           break label94; }
/*      */       }
/*      */       label94:
/* 1389 */       jj_consume_token(36);
/*      */     } catch (Throwable localThrowable) {
/* 1391 */       if (i != 0) {
/* 1392 */         jjtree.clearNodeScope(localASTRegexpor);
/* 1393 */         i = 0;
/*      */       } else {
/* 1395 */         jjtree.popNode();
/*      */       }
/* 1397 */       if ((localThrowable instanceof RuntimeException)) {
/* 1398 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1400 */       if ((localThrowable instanceof ParseException)) {
/* 1401 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1403 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1405 */       if (i != 0) {
/* 1406 */         jjtree.closeNodeScope(localASTRegexpor, true);
/* 1407 */         jjtreeCloseNodeScope(localASTRegexpor);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Regexpand() throws ParseException
/*      */   {
/* 1414 */     ASTRegexpand localASTRegexpand = new ASTRegexpand(20);
/* 1415 */     int i = 1;
/* 1416 */     jjtree.openNodeScope(localASTRegexpand);
/* 1417 */     jjtreeOpenNodeScope(localASTRegexpand);
/*      */     try {
/* 1419 */       jj_consume_token(35);
/* 1420 */       Template();
/*      */       for (;;)
/*      */       {
/* 1423 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 35: case 37: case 41: case 42: 
/*      */         case 45: case 46: case 53: 
/*      */           break;
/*      */         case 36: case 38: 
/*      */         case 39: case 40: 
/*      */         case 43: case 44: 
/*      */         case 47: case 48: 
/*      */         case 49: case 50: 
/*      */         case 51: case 52: 
/*      */         default: 
/* 1434 */           jj_la1[38] = jj_gen;
/* 1435 */           break;
/*      */         }
/* 1437 */         Template();
/*      */       }
/* 1439 */       jj_consume_token(36);
/*      */     } catch (Throwable localThrowable) {
/* 1441 */       if (i != 0) {
/* 1442 */         jjtree.clearNodeScope(localASTRegexpand);
/* 1443 */         i = 0;
/*      */       } else {
/* 1445 */         jjtree.popNode();
/*      */       }
/* 1447 */       if ((localThrowable instanceof RuntimeException)) {
/* 1448 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1450 */       if ((localThrowable instanceof ParseException)) {
/* 1451 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1453 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1455 */       if (i != 0) {
/* 1456 */         jjtree.closeNodeScope(localASTRegexpand, true);
/* 1457 */         jjtreeCloseNodeScope(localASTRegexpand);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Oand() throws ParseException
/*      */   {
/* 1464 */     ASTOand localASTOand = new ASTOand(21);
/* 1465 */     int i = 1;
/* 1466 */     jjtree.openNodeScope(localASTOand);
/* 1467 */     jjtreeOpenNodeScope(localASTOand);
/*      */     try {
/* 1469 */       jj_consume_token(35);
/* 1470 */       jj_consume_token(31);
/* 1471 */       Template();
/*      */       for (;;)
/*      */       {
/* 1474 */         Template();
/* 1475 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 35: case 37: case 41: case 42: 
/*      */         case 45: case 46: case 53: 
/*      */           break;
/*      */         case 36: case 38: 
/*      */         case 39: case 40: 
/*      */         case 43: case 44: 
/*      */         case 47: case 48: 
/*      */         case 49: case 50: 
/*      */         case 51: case 52: 
/*      */         default: 
/* 1486 */           jj_la1[39] = jj_gen;
/*      */           break label166; }
/*      */       }
/*      */       label166:
/* 1490 */       jj_consume_token(36);
/*      */     } catch (Throwable localThrowable) {
/* 1492 */       if (i != 0) {
/* 1493 */         jjtree.clearNodeScope(localASTOand);
/* 1494 */         i = 0;
/*      */       } else {
/* 1496 */         jjtree.popNode();
/*      */       }
/* 1498 */       if ((localThrowable instanceof RuntimeException)) {
/* 1499 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1501 */       if ((localThrowable instanceof ParseException)) {
/* 1502 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1504 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1506 */       if (i != 0) {
/* 1507 */         jjtree.closeNodeScope(localASTOand, true);
/* 1508 */         jjtreeCloseNodeScope(localASTOand);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Oor() throws ParseException
/*      */   {
/* 1515 */     ASTOor localASTOor = new ASTOor(22);
/* 1516 */     int i = 1;
/* 1517 */     jjtree.openNodeScope(localASTOor);
/* 1518 */     jjtreeOpenNodeScope(localASTOor);
/*      */     try {
/* 1520 */       jj_consume_token(35);
/* 1521 */       jj_consume_token(32);
/* 1522 */       Template();
/*      */       for (;;)
/*      */       {
/* 1525 */         Template();
/* 1526 */         switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*      */         case 35: case 37: case 41: case 42: 
/*      */         case 45: case 46: case 53: 
/*      */           break;
/*      */         case 36: case 38: 
/*      */         case 39: case 40: 
/*      */         case 43: case 44: 
/*      */         case 47: case 48: 
/*      */         case 49: case 50: 
/*      */         case 51: case 52: 
/*      */         default: 
/* 1537 */           jj_la1[40] = jj_gen;
/*      */           break label166; }
/*      */       }
/*      */       label166:
/* 1541 */       jj_consume_token(36);
/*      */     } catch (Throwable localThrowable) {
/* 1543 */       if (i != 0) {
/* 1544 */         jjtree.clearNodeScope(localASTOor);
/* 1545 */         i = 0;
/*      */       } else {
/* 1547 */         jjtree.popNode();
/*      */       }
/* 1549 */       if ((localThrowable instanceof RuntimeException)) {
/* 1550 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1552 */       if ((localThrowable instanceof ParseException)) {
/* 1553 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1555 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1557 */       if (i != 0) {
/* 1558 */         jjtree.closeNodeScope(localASTOor, true);
/* 1559 */         jjtreeCloseNodeScope(localASTOor);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static final void Osingle() throws ParseException
/*      */   {
/* 1566 */     ASTOsingle localASTOsingle = new ASTOsingle(23);
/* 1567 */     int i = 1;
/* 1568 */     jjtree.openNodeScope(localASTOsingle);
/* 1569 */     jjtreeOpenNodeScope(localASTOsingle);
/*      */     try {
/* 1571 */       jj_consume_token(35);
/* 1572 */       jj_consume_token(33);
/* 1573 */       Template();
/* 1574 */       jj_consume_token(36);
/*      */     } catch (Throwable localThrowable) {
/* 1576 */       if (i != 0) {
/* 1577 */         jjtree.clearNodeScope(localASTOsingle);
/* 1578 */         i = 0;
/*      */       } else {
/* 1580 */         jjtree.popNode();
/*      */       }
/* 1582 */       if ((localThrowable instanceof RuntimeException)) {
/* 1583 */         throw ((RuntimeException)localThrowable);
/*      */       }
/* 1585 */       if ((localThrowable instanceof ParseException)) {
/* 1586 */         throw ((ParseException)localThrowable);
/*      */       }
/* 1588 */       throw ((Error)localThrowable);
/*      */     } finally {
/* 1590 */       if (i != 0) {
/* 1591 */         jjtree.closeNodeScope(localASTOsingle, true);
/* 1592 */         jjtreeCloseNodeScope(localASTOsingle);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private static final boolean jj_2_1(int paramInt) {
/* 1598 */     jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1599 */     try { return jj_3_1() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1600 */       return true;
/* 1601 */     } finally { jj_save(0, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1605 */   private static final boolean jj_2_2(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1606 */     try { return jj_3_2() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1607 */       return true;
/* 1608 */     } finally { jj_save(1, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1612 */   private static final boolean jj_2_3(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1613 */     try { return jj_3_3() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1614 */       return true;
/* 1615 */     } finally { jj_save(2, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1619 */   private static final boolean jj_2_4(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1620 */     try { return jj_3_4() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1621 */       return true;
/* 1622 */     } finally { jj_save(3, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1626 */   private static final boolean jj_2_5(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1627 */     try { return jj_3_5() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1628 */       return true;
/* 1629 */     } finally { jj_save(4, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1633 */   private static final boolean jj_2_6(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1634 */     try { return jj_3_6() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1635 */       return true;
/* 1636 */     } finally { jj_save(5, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1640 */   private static final boolean jj_2_7(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1641 */     try { return jj_3_7() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1642 */       return true;
/* 1643 */     } finally { jj_save(6, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1647 */   private static final boolean jj_2_8(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1648 */     try { return jj_3_8() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1649 */       return true;
/* 1650 */     } finally { jj_save(7, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1654 */   private static final boolean jj_2_9(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1655 */     try { return jj_3_9() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1656 */       return true;
/* 1657 */     } finally { jj_save(8, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1661 */   private static final boolean jj_2_10(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1662 */     try { return jj_3_10() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1663 */       return true;
/* 1664 */     } finally { jj_save(9, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1668 */   private static final boolean jj_2_11(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1669 */     try { return jj_3_11() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1670 */       return true;
/* 1671 */     } finally { jj_save(10, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1675 */   private static final boolean jj_2_12(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1676 */     try { return jj_3_12() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1677 */       return true;
/* 1678 */     } finally { jj_save(11, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1682 */   private static final boolean jj_2_13(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1683 */     try { return jj_3_13() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1684 */       return true;
/* 1685 */     } finally { jj_save(12, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1689 */   private static final boolean jj_2_14(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1690 */     try { return jj_3_14() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1691 */       return true;
/* 1692 */     } finally { jj_save(13, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1696 */   private static final boolean jj_2_15(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1697 */     try { return jj_3_15() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1698 */       return true;
/* 1699 */     } finally { jj_save(14, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1703 */   private static final boolean jj_2_16(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1704 */     try { return jj_3_16() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1705 */       return true;
/* 1706 */     } finally { jj_save(15, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1710 */   private static final boolean jj_2_17(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1711 */     try { return jj_3_17() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1712 */       return true;
/* 1713 */     } finally { jj_save(16, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1717 */   private static final boolean jj_2_18(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1718 */     try { return jj_3_18() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1719 */       return true;
/* 1720 */     } finally { jj_save(17, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1724 */   private static final boolean jj_2_19(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1725 */     try { return jj_3_19() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1726 */       return true;
/* 1727 */     } finally { jj_save(18, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1731 */   private static final boolean jj_2_20(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1732 */     try { return jj_3_20() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1733 */       return true;
/* 1734 */     } finally { jj_save(19, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1738 */   private static final boolean jj_2_21(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1739 */     try { return jj_3_21() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1740 */       return true;
/* 1741 */     } finally { jj_save(20, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1745 */   private static final boolean jj_2_22(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1746 */     try { return jj_3_22() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1747 */       return true;
/* 1748 */     } finally { jj_save(21, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1752 */   private static final boolean jj_2_23(int paramInt) { jj_la = paramInt;jj_lastpos = jj_scanpos = token;
/* 1753 */     try { return jj_3_23() ^ true; } catch (LookaheadSuccess localLookaheadSuccess) { boolean bool;
/* 1754 */       return true;
/* 1755 */     } finally { jj_save(22, paramInt);
/*      */     }
/*      */   }
/*      */   
/* 1759 */   private static final boolean jj_3R_54() { if (jj_scan_token(42)) return true;
/* 1760 */     if (jj_scan_token(46)) return true;
/*      */     for (;;)
/*      */     {
/* 1763 */       Token localToken = jj_scanpos;
/* 1764 */       if (jj_3R_59()) { jj_scanpos = localToken; break;
/*      */       } }
/* 1766 */     if (jj_scan_token(43)) return true;
/* 1767 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_62() {
/* 1771 */     if (jj_3R_48()) return true;
/* 1772 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_26() {
/* 1776 */     if (jj_scan_token(13)) return true;
/* 1777 */     if (jj_scan_token(7)) return true;
/* 1778 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_63() {
/* 1782 */     if (jj_3R_40()) return true;
/* 1783 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_61() {
/* 1787 */     if (jj_3R_48()) return true;
/* 1788 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_3() {
/* 1792 */     if (jj_3R_23()) return true;
/* 1793 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_22() {
/* 1797 */     if (jj_3R_34()) return true;
/* 1798 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_11() {
/* 1802 */     if (jj_3R_28()) return true;
/* 1803 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_23() {
/* 1807 */     if (jj_scan_token(13)) return true;
/* 1808 */     if (jj_scan_token(10)) return true;
/* 1809 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_56() {
/* 1813 */     if (jj_scan_token(45)) return true;
/* 1814 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_49() {
/* 1818 */     if (jj_3R_48()) return true;
/* 1819 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_36() {
/* 1823 */     if (jj_scan_token(13)) return true;
/* 1824 */     if (jj_scan_token(11)) return true;
/* 1825 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_21()
/*      */   {
/* 1830 */     if (jj_3R_36()) return true;
/*      */     for (;;) {
/* 1832 */       Token localToken = jj_scanpos;
/* 1833 */       if (jj_3R_36()) { jj_scanpos = localToken; break;
/*      */       } }
/* 1835 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_52()
/*      */   {
/* 1840 */     Token localToken = jj_scanpos;
/* 1841 */     if (jj_scan_token(46)) {
/* 1842 */       jj_scanpos = localToken;
/* 1843 */       if (jj_scan_token(53)) return true;
/*      */     }
/* 1845 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_51() {
/* 1849 */     if (jj_scan_token(35)) return true;
/* 1850 */     if (jj_scan_token(33)) return true;
/* 1851 */     if (jj_3R_48()) return true;
/* 1852 */     if (jj_scan_token(36)) return true;
/* 1853 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_6() {
/* 1857 */     if (jj_3R_23()) return true;
/* 1858 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_7() {
/* 1862 */     if (jj_3R_25()) return true;
/* 1863 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_60() {
/* 1867 */     if (jj_scan_token(44)) return true;
/* 1868 */     if (jj_3R_48()) return true;
/* 1869 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_34() {
/* 1873 */     if (jj_scan_token(35)) return true;
/* 1874 */     if (jj_scan_token(32)) return true;
/* 1875 */     if (jj_3R_48()) { return true;
/*      */     }
/* 1877 */     if (jj_3R_62()) return true;
/*      */     for (;;) {
/* 1879 */       Token localToken = jj_scanpos;
/* 1880 */       if (jj_3R_62()) { jj_scanpos = localToken; break;
/*      */       } }
/* 1882 */     if (jj_scan_token(36)) return true;
/* 1883 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_21() {
/* 1887 */     if (jj_3R_33()) return true;
/* 1888 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_13() {
/* 1892 */     if (jj_3R_28()) return true;
/* 1893 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_30()
/*      */   {
/* 1898 */     Token localToken = jj_scanpos;
/* 1899 */     if (jj_3_21()) {
/* 1900 */       jj_scanpos = localToken;
/* 1901 */       if (jj_3_22()) {
/* 1902 */         jj_scanpos = localToken;
/* 1903 */         if (jj_3R_41()) return true;
/*      */       }
/*      */     }
/* 1906 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_31() {
/* 1910 */     if (jj_3R_40()) return true;
/* 1911 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_2() {
/* 1915 */     if (jj_3R_22()) return true;
/* 1916 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_33() {
/* 1920 */     if (jj_scan_token(35)) return true;
/* 1921 */     if (jj_scan_token(31)) return true;
/* 1922 */     if (jj_3R_48()) { return true;
/*      */     }
/* 1924 */     if (jj_3R_61()) return true;
/*      */     for (;;) {
/* 1926 */       Token localToken = jj_scanpos;
/* 1927 */       if (jj_3R_61()) { jj_scanpos = localToken; break;
/*      */       } }
/* 1929 */     if (jj_scan_token(36)) return true;
/* 1930 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_20() {
/* 1934 */     if (jj_scan_token(35)) return true;
/* 1935 */     if (jj_scan_token(34)) return true;
/* 1936 */     if (jj_3R_30()) return true;
/* 1937 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_29() {
/* 1941 */     if (jj_3R_40()) return true;
/* 1942 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_35() {
/* 1946 */     if (jj_scan_token(35)) return true;
/* 1947 */     if (jj_3R_48()) return true;
/*      */     for (;;)
/*      */     {
/* 1950 */       Token localToken = jj_scanpos;
/* 1951 */       if (jj_3R_49()) { jj_scanpos = localToken; break;
/*      */       } }
/* 1953 */     if (jj_scan_token(36)) return true;
/* 1954 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_64() {
/* 1958 */     if (jj_3R_40()) return true;
/* 1959 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_58()
/*      */   {
/* 1964 */     Token localToken = jj_scanpos;
/* 1965 */     if (jj_3R_64()) jj_scanpos = localToken;
/* 1966 */     if (jj_scan_token(35)) return true;
/* 1967 */     if (jj_scan_token(34)) return true;
/* 1968 */     if (jj_3R_32()) return true;
/* 1969 */     if (jj_scan_token(36)) return true;
/* 1970 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_10() {
/* 1974 */     if (jj_3R_28()) return true;
/* 1975 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_27() {
/* 1979 */     if (jj_scan_token(24)) return true;
/* 1980 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_57()
/*      */   {
/* 1985 */     Token localToken = jj_scanpos;
/* 1986 */     if (jj_3R_63()) jj_scanpos = localToken;
/* 1987 */     if (jj_scan_token(35)) return true;
/* 1988 */     if (jj_scan_token(34)) return true;
/* 1989 */     if (jj_3R_30()) return true;
/* 1990 */     if (jj_scan_token(36)) return true;
/* 1991 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_55() {
/* 1995 */     if (jj_scan_token(35)) return true;
/* 1996 */     if (jj_3R_48()) { return true;
/*      */     }
/* 1998 */     if (jj_3R_60()) return true;
/*      */     for (;;) {
/* 2000 */       Token localToken = jj_scanpos;
/* 2001 */       if (jj_3R_60()) { jj_scanpos = localToken; break;
/*      */       } }
/* 2003 */     if (jj_scan_token(36)) return true;
/* 2004 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_19()
/*      */   {
/* 2009 */     Token localToken = jj_scanpos;
/* 2010 */     if (jj_3R_31()) jj_scanpos = localToken;
/* 2011 */     if (jj_3R_32()) return true;
/* 2012 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_24() {
/* 2016 */     if (jj_scan_token(19)) return true;
/* 2017 */     if (jj_3R_37()) return true;
/* 2018 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_5() {
/* 2022 */     if (jj_3R_22()) return true;
/* 2023 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_18()
/*      */   {
/* 2028 */     Token localToken = jj_scanpos;
/* 2029 */     if (jj_3R_29()) jj_scanpos = localToken;
/* 2030 */     if (jj_3R_30()) return true;
/* 2031 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_48()
/*      */   {
/* 2036 */     Token localToken = jj_scanpos;
/* 2037 */     if (jj_3_18()) {
/* 2038 */       jj_scanpos = localToken;
/* 2039 */       if (jj_3_19()) {
/* 2040 */         jj_scanpos = localToken;
/* 2041 */         if (jj_3R_57()) {
/* 2042 */           jj_scanpos = localToken;
/* 2043 */           if (jj_3R_58()) return true;
/*      */         }
/*      */       }
/*      */     }
/* 2047 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_8() {
/* 2051 */     if (jj_3R_26()) return true;
/* 2052 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_22() {
/* 2056 */     if (jj_scan_token(13)) return true;
/* 2057 */     if (jj_scan_token(8)) return true;
/* 2058 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_50() {
/* 2062 */     if (jj_scan_token(29)) return true;
/* 2063 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_40() {
/* 2067 */     if (jj_scan_token(41)) return true;
/* 2068 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_12() {
/* 2072 */     if (jj_3R_28()) return true;
/* 2073 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_53() {
/* 2077 */     if (jj_scan_token(37)) return true;
/* 2078 */     if (jj_3R_48()) return true;
/* 2079 */     if (jj_scan_token(38)) return true;
/* 2080 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_9() {
/* 2084 */     if (jj_scan_token(29)) return true;
/*      */     for (;;)
/*      */     {
/* 2087 */       Token localToken = jj_scanpos;
/* 2088 */       if (jj_3R_27()) { jj_scanpos = localToken; break;
/*      */       } }
/* 2090 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_23() {
/* 2094 */     if (jj_3R_35()) return true;
/* 2095 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_37() {
/* 2099 */     if (jj_3R_50()) return true;
/* 2100 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_47() {
/* 2104 */     if (jj_3R_56()) return true;
/* 2105 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_59()
/*      */   {
/* 2110 */     Token localToken = jj_scanpos;
/* 2111 */     if (jj_scan_token(52)) {
/* 2112 */       jj_scanpos = localToken;
/* 2113 */       if (jj_scan_token(46)) return true;
/*      */     }
/* 2115 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_46() {
/* 2119 */     if (jj_3R_55()) return true;
/* 2120 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_4() {
/* 2124 */     if (jj_3R_24()) return true;
/* 2125 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_45() {
/* 2129 */     if (jj_3R_35()) return true;
/* 2130 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_44() {
/* 2134 */     if (jj_3R_54()) return true;
/* 2135 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_1() {
/* 2139 */     if (jj_3R_21()) return true;
/* 2140 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_39() {
/* 2144 */     if (jj_scan_token(25)) { return true;
/*      */     }
/* 2146 */     Token localToken = jj_scanpos;
/* 2147 */     if (jj_3_12()) {
/* 2148 */       jj_scanpos = localToken;
/* 2149 */       if (jj_scan_token(29)) return true;
/*      */     }
/* 2151 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_25() {
/* 2155 */     if (jj_scan_token(13)) return true;
/* 2156 */     if (jj_scan_token(12)) return true;
/* 2157 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_43() {
/* 2161 */     if (jj_3R_53()) return true;
/* 2162 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_17() {
/* 2166 */     if (jj_scan_token(13)) return true;
/* 2167 */     if (jj_scan_token(25)) return true;
/* 2168 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_16() {
/* 2172 */     if (jj_scan_token(13)) return true;
/* 2173 */     if (jj_scan_token(21)) return true;
/* 2174 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_15() {
/* 2178 */     if (jj_scan_token(13)) return true;
/* 2179 */     if (jj_scan_token(20)) return true;
/* 2180 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_41() {
/* 2184 */     if (jj_3R_51()) return true;
/* 2185 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_38() {
/* 2189 */     if (jj_scan_token(29)) return true;
/* 2190 */     if (jj_scan_token(27)) return true;
/* 2191 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_42() {
/* 2195 */     if (jj_3R_52()) return true;
/* 2196 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_32()
/*      */   {
/* 2201 */     Token localToken = jj_scanpos;
/* 2202 */     if (jj_3R_42()) {
/* 2203 */       jj_scanpos = localToken;
/* 2204 */       if (jj_3R_43()) {
/* 2205 */         jj_scanpos = localToken;
/* 2206 */         if (jj_3R_44()) {
/* 2207 */           jj_scanpos = localToken;
/* 2208 */           if (jj_3R_45()) {
/* 2209 */             jj_scanpos = localToken;
/* 2210 */             if (jj_3R_46()) {
/* 2211 */               jj_scanpos = localToken;
/* 2212 */               if (jj_3R_47()) return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 2218 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3_14() {
/* 2222 */     if (jj_scan_token(13)) { return true;
/*      */     }
/* 2224 */     if (jj_3_9()) return true;
/*      */     for (;;) {
/* 2226 */       Token localToken = jj_scanpos;
/* 2227 */       if (jj_3_9()) { jj_scanpos = localToken; break;
/*      */       } }
/* 2229 */     return false;
/*      */   }
/*      */   
/*      */   private static final boolean jj_3R_28()
/*      */   {
/* 2234 */     Token localToken = jj_scanpos;
/* 2235 */     if (jj_3_14()) {
/* 2236 */       jj_scanpos = localToken;
/* 2237 */       if (jj_3R_38()) {
/* 2238 */         jj_scanpos = localToken;
/* 2239 */         if (jj_3_15()) {
/* 2240 */           jj_scanpos = localToken;
/* 2241 */           if (jj_3_16()) {
/* 2242 */             jj_scanpos = localToken;
/* 2243 */             if (jj_3_17()) {
/* 2244 */               jj_scanpos = localToken;
/* 2245 */               if (jj_3R_39()) return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 2251 */     return false;
/*      */   }
/*      */   
/* 2254 */   private static boolean jj_initialized_once = false;
/*      */   public static NLUTokenManager token_source;
/*      */   static JavaCharStream jj_input_stream;
/*      */   public static Token token;
/*      */   public static Token jj_nt;
/*      */   private static int jj_ntk;
/*      */   private static Token jj_scanpos;
/* 2261 */   private static Token jj_lastpos; private static int jj_la; public static boolean lookingAhead = false;
/*      */   private static boolean jj_semLA;
/*      */   private static int jj_gen;
/* 2264 */   private static final int[] jj_la1 = new int[41];
/*      */   private static int[] jj_la1_0;
/*      */   private static int[] jj_la1_1;
/*      */   
/* 2268 */   static { jj_la1_0();
/* 2269 */     jj_la1_1();
/*      */   }
/*      */   
/* 2272 */   private static final void jj_la1_0() { jj_la1_0 = new int[] { 8192, 8192, 8192, 532480, 8192, 8192, 8192, 570433536, 570433536, 8192, 131072, 536870912, 536879104, 536879104, 16777216, 570433536, 570433536, 570433536, 536870912, 536870912, 536870912, 536870912, 536870912, 33554432, 536870912, 8192 }; }
/*      */   
/*      */ 
/* 2275 */   private static final void jj_la1_1() { jj_la1_1 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8192, 8192, 8192, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 512, 512, 512, 512, 520, 8, 2113536, 1064960, 1064960, 2114592, 8200, 4096, 2123304, 2123304, 2123304 }; }
/*      */   
/* 2277 */   private static final JJCalls[] jj_2_rtns = new JJCalls[23];
/* 2278 */   private static boolean jj_rescan = false;
/* 2279 */   private static int jj_gc = 0;
/*      */   
/*      */   public NLU(java.io.InputStream paramInputStream) {
/* 2282 */     if (jj_initialized_once) {
/* 2283 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 2284 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 2285 */       System.out.println("       during parser generation.");
/* 2286 */       throw new Error();
/*      */     }
/* 2288 */     jj_initialized_once = true;
/* 2289 */     jj_input_stream = new JavaCharStream(paramInputStream, 1, 1);
/* 2290 */     token_source = new NLUTokenManager(jj_input_stream);
/* 2291 */     token = new Token();
/* 2292 */     jj_ntk = -1;
/* 2293 */     jj_gen = 0;
/* 2294 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2295 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   public static void ReInit(java.io.InputStream paramInputStream) {
/* 2299 */     jj_input_stream.ReInit(paramInputStream, 1, 1);
/* 2300 */     NLUTokenManager.ReInit(jj_input_stream);
/* 2301 */     token = new Token();
/* 2302 */     jj_ntk = -1;
/* 2303 */     jjtree.reset();
/* 2304 */     jj_gen = 0;
/* 2305 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2306 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   public NLU(java.io.Reader paramReader) {
/* 2310 */     if (jj_initialized_once) {
/* 2311 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 2312 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 2313 */       System.out.println("       during parser generation.");
/* 2314 */       throw new Error();
/*      */     }
/* 2316 */     jj_initialized_once = true;
/* 2317 */     jj_input_stream = new JavaCharStream(paramReader, 1, 1);
/* 2318 */     token_source = new NLUTokenManager(jj_input_stream);
/* 2319 */     token = new Token();
/* 2320 */     jj_ntk = -1;
/* 2321 */     jj_gen = 0;
/* 2322 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2323 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   public static void ReInit(java.io.Reader paramReader) {
/* 2327 */     jj_input_stream.ReInit(paramReader, 1, 1);
/* 2328 */     NLUTokenManager.ReInit(jj_input_stream);
/* 2329 */     token = new Token();
/* 2330 */     jj_ntk = -1;
/* 2331 */     jjtree.reset();
/* 2332 */     jj_gen = 0;
/* 2333 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2334 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   public NLU(NLUTokenManager paramNLUTokenManager) {
/* 2338 */     if (jj_initialized_once) {
/* 2339 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 2340 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 2341 */       System.out.println("       during parser generation.");
/* 2342 */       throw new Error();
/*      */     }
/* 2344 */     jj_initialized_once = true;
/* 2345 */     token_source = paramNLUTokenManager;
/* 2346 */     token = new Token();
/* 2347 */     jj_ntk = -1;
/* 2348 */     jj_gen = 0;
/* 2349 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2350 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   public void ReInit(NLUTokenManager paramNLUTokenManager) {
/* 2354 */     token_source = paramNLUTokenManager;
/* 2355 */     token = new Token();
/* 2356 */     jj_ntk = -1;
/* 2357 */     jjtree.reset();
/* 2358 */     jj_gen = 0;
/* 2359 */     for (int i = 0; i < 41; i++) jj_la1[i] = -1;
/* 2360 */     for (i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
/*      */   }
/*      */   
/*      */   private static final Token jj_consume_token(int paramInt) throws ParseException {
/*      */     Token localToken;
/* 2365 */     if ((localToken = token).next != null) token = token.next; else
/* 2366 */       token = token.next = NLUTokenManager.getNextToken();
/* 2367 */     jj_ntk = -1;
/* 2368 */     if (token.kind == paramInt) {
/* 2369 */       jj_gen += 1;
/* 2370 */       if (++jj_gc > 100) {
/* 2371 */         jj_gc = 0;
/* 2372 */         for (int i = 0; i < jj_2_rtns.length; i++) {
/* 2373 */           JJCalls localJJCalls = jj_2_rtns[i];
/* 2374 */           while (localJJCalls != null) {
/* 2375 */             if (localJJCalls.gen < jj_gen) localJJCalls.first = null;
/* 2376 */             localJJCalls = localJJCalls.next;
/*      */           }
/*      */         }
/*      */       }
/* 2380 */       return token;
/*      */     }
/* 2382 */     token = localToken;
/* 2383 */     jj_kind = paramInt;
/* 2384 */     throw generateParseException(); }
/*      */   
/*      */   private static final class LookaheadSuccess extends Error { private LookaheadSuccess() {}
/* 2387 */     LookaheadSuccess(NLU.1 param1) { this(); } }
/* 2388 */   private static final LookaheadSuccess jj_ls = new LookaheadSuccess(null);
/*      */   
/* 2390 */   private static final boolean jj_scan_token(int paramInt) { if (jj_scanpos == jj_lastpos) {
/* 2391 */       jj_la -= 1;
/* 2392 */       if (jj_scanpos.next == null) {
/* 2393 */         jj_lastpos = jj_scanpos = jj_scanpos.next = NLUTokenManager.getNextToken();
/*      */       } else {
/* 2395 */         jj_lastpos = jj_scanpos = jj_scanpos.next;
/*      */       }
/*      */     } else {
/* 2398 */       jj_scanpos = jj_scanpos.next;
/*      */     }
/* 2400 */     if (jj_rescan) {
/* 2401 */       int i = 0; for (Token localToken = token; 
/* 2402 */           (localToken != null) && (localToken != jj_scanpos); localToken = localToken.next) i++;
/* 2403 */       if (localToken != null) jj_add_error_token(paramInt, i);
/*      */     }
/* 2405 */     if (jj_scanpos.kind != paramInt) return true;
/* 2406 */     if ((jj_la == 0) && (jj_scanpos == jj_lastpos)) throw jj_ls;
/* 2407 */     return false;
/*      */   }
/*      */   
/*      */   public static final Token getNextToken() {
/* 2411 */     if (token.next != null) token = token.next; else
/* 2412 */       token = token.next = NLUTokenManager.getNextToken();
/* 2413 */     jj_ntk = -1;
/* 2414 */     jj_gen += 1;
/* 2415 */     return token;
/*      */   }
/*      */   
/*      */   public static final Token getToken(int paramInt) {
/* 2419 */     Token localToken = lookingAhead ? jj_scanpos : token;
/* 2420 */     for (int i = 0; i < paramInt; i++) {
/* 2421 */       if (localToken.next != null) localToken = localToken.next; else
/* 2422 */         localToken = localToken.next = NLUTokenManager.getNextToken();
/*      */     }
/* 2424 */     return localToken;
/*      */   }
/*      */   
/*      */   private static final int jj_ntk() {
/* 2428 */     if ((jj_nt = token.next) == null) {
/* 2429 */       return jj_ntk = (token.next = NLUTokenManager.getNextToken()).kind;
/*      */     }
/* 2431 */     return jj_ntk = jj_nt.kind;
/*      */   }
/*      */   
/* 2434 */   private static Vector jj_expentries = new Vector();
/*      */   private static int[] jj_expentry;
/* 2436 */   private static int jj_kind = -1;
/* 2437 */   private static int[] jj_lasttokens = new int[100];
/*      */   private static int jj_endpos;
/*      */   
/*      */   private static final void jj_add_error_token(int paramInt1, int paramInt2) {
/* 2441 */     if (paramInt2 >= 100) return;
/* 2442 */     if (paramInt2 == jj_endpos + 1) {
/* 2443 */       jj_lasttokens[(jj_endpos++)] = paramInt1;
/* 2444 */     } else if (jj_endpos != 0) {
/* 2445 */       jj_expentry = new int[jj_endpos];
/* 2446 */       for (int i = 0; i < jj_endpos; i++) {
/* 2447 */         jj_expentry[i] = jj_lasttokens[i];
/*      */       }
/* 2449 */       i = 0;
/* 2450 */       for (java.util.Enumeration localEnumeration = jj_expentries.elements(); localEnumeration.hasMoreElements();) {
/* 2451 */         int[] arrayOfInt = (int[])localEnumeration.nextElement();
/* 2452 */         if (arrayOfInt.length == jj_expentry.length) {
/* 2453 */           i = 1;
/* 2454 */           for (int j = 0; j < jj_expentry.length; j++) {
/* 2455 */             if (arrayOfInt[j] != jj_expentry[j]) {
/* 2456 */               i = 0;
/* 2457 */               break;
/*      */             }
/*      */           }
/* 2460 */           if (i != 0) break;
/*      */         }
/*      */       }
/* 2463 */       if (i == 0) jj_expentries.addElement(jj_expentry);
/* 2464 */       if (paramInt2 != 0) jj_lasttokens[((jj_endpos = paramInt2) - 1)] = paramInt1;
/*      */     }
/*      */   }
/*      */   
/*      */   public static ParseException generateParseException() {
/* 2469 */     jj_expentries.removeAllElements();
/* 2470 */     boolean[] arrayOfBoolean = new boolean[64];
/* 2471 */     for (int i = 0; i < 64; i++) {
/* 2472 */       arrayOfBoolean[i] = false;
/*      */     }
/* 2474 */     if (jj_kind >= 0) {
/* 2475 */       arrayOfBoolean[jj_kind] = true;
/* 2476 */       jj_kind = -1;
/*      */     }
/* 2478 */     for (i = 0; i < 41; i++) {
/* 2479 */       if (jj_la1[i] == jj_gen) {
/* 2480 */         for (j = 0; j < 32; j++) {
/* 2481 */           if ((jj_la1_0[i] & 1 << j) != 0) {
/* 2482 */             arrayOfBoolean[j] = true;
/*      */           }
/* 2484 */           if ((jj_la1_1[i] & 1 << j) != 0) {
/* 2485 */             arrayOfBoolean[(32 + j)] = true;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 2490 */     for (i = 0; i < 64; i++) {
/* 2491 */       if (arrayOfBoolean[i] != 0) {
/* 2492 */         jj_expentry = new int[1];
/* 2493 */         jj_expentry[0] = i;
/* 2494 */         jj_expentries.addElement(jj_expentry);
/*      */       }
/*      */     }
/* 2497 */     jj_endpos = 0;
/* 2498 */     jj_rescan_token();
/* 2499 */     jj_add_error_token(0, 0);
/* 2500 */     int[][] arrayOfInt = new int[jj_expentries.size()][];
/* 2501 */     for (int j = 0; j < jj_expentries.size(); j++) {
/* 2502 */       arrayOfInt[j] = ((int[])jj_expentries.elementAt(j));
/*      */     }
/* 2504 */     return new ParseException(token, arrayOfInt, tokenImage);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private static final void jj_rescan_token()
/*      */   {
/* 2514 */     jj_rescan = true;
/* 2515 */     for (int i = 0; i < 23; i++) {
/* 2516 */       JJCalls localJJCalls = jj_2_rtns[i];
/*      */       do {
/* 2518 */         if (localJJCalls.gen > jj_gen) {
/* 2519 */           jj_la = localJJCalls.arg;jj_lastpos = jj_scanpos = localJJCalls.first;
/* 2520 */           switch (i) {
/* 2521 */           case 0:  jj_3_1(); break;
/* 2522 */           case 1:  jj_3_2(); break;
/* 2523 */           case 2:  jj_3_3(); break;
/* 2524 */           case 3:  jj_3_4(); break;
/* 2525 */           case 4:  jj_3_5(); break;
/* 2526 */           case 5:  jj_3_6(); break;
/* 2527 */           case 6:  jj_3_7(); break;
/* 2528 */           case 7:  jj_3_8(); break;
/* 2529 */           case 8:  jj_3_9(); break;
/* 2530 */           case 9:  jj_3_10(); break;
/* 2531 */           case 10:  jj_3_11(); break;
/* 2532 */           case 11:  jj_3_12(); break;
/* 2533 */           case 12:  jj_3_13(); break;
/* 2534 */           case 13:  jj_3_14(); break;
/* 2535 */           case 14:  jj_3_15(); break;
/* 2536 */           case 15:  jj_3_16(); break;
/* 2537 */           case 16:  jj_3_17(); break;
/* 2538 */           case 17:  jj_3_18(); break;
/* 2539 */           case 18:  jj_3_19(); break;
/* 2540 */           case 19:  jj_3_20(); break;
/* 2541 */           case 20:  jj_3_21(); break;
/* 2542 */           case 21:  jj_3_22(); break;
/* 2543 */           case 22:  jj_3_23();
/*      */           }
/*      */         }
/* 2546 */         localJJCalls = localJJCalls.next;
/* 2547 */       } while (localJJCalls != null);
/*      */     }
/* 2549 */     jj_rescan = false;
/*      */   }
/*      */   
/*      */   private static final void jj_save(int paramInt1, int paramInt2) {
/* 2553 */     JJCalls localJJCalls = jj_2_rtns[paramInt1];
/* 2554 */     while (localJJCalls.gen > jj_gen) {
/* 2555 */       if (localJJCalls.next == null) { localJJCalls = localJJCalls.next = new JJCalls(); break; }
/* 2556 */       localJJCalls = localJJCalls.next;
/*      */     }
/* 2558 */     localJJCalls.gen = (jj_gen + paramInt2 - jj_la);localJJCalls.first = token;localJJCalls.arg = paramInt2;
/*      */   }
/*      */   
/*      */   public static final void enable_tracing() {}
/*      */   
/*      */   public static final void disable_tracing() {}
/*      */   
/*      */   static final class JJCalls
/*      */   {
/*      */     int gen;
/*      */     Token first;
/*      */     int arg;
/*      */     JJCalls next;
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLU.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */