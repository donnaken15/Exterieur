/*     */ package wordnet.wn;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Properties;
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
/*     */ public class FileManager
/*     */   implements FileManagerInterface
/*     */ {
/*  27 */   public static String VERSION = "1.0";
/*     */   
/*     */ 
/*     */   public static final boolean TRACE_LOOKUP = false;
/*     */   
/*     */ 
/*  33 */   protected static final boolean IS_MW_VM = System.getProperties().getProperty("java.vendor").equalsIgnoreCase("Metrowerks Corp.");
/*     */   
/*     */ 
/*     */   protected class NextLineCache
/*     */   {
/*     */     protected String filename;
/*     */     
/*     */     protected long previous;
/*     */     
/*     */     protected long next;
/*     */     
/*     */ 
/*     */     void setNextLineOffset(String paramString, long paramLong1, long paramLong2)
/*     */     {
/*  47 */       this.filename = paramString;
/*  48 */       this.previous = paramLong1;
/*  49 */       this.next = paramLong2;
/*     */     }
/*     */     
/*     */     boolean matchingOffset(String paramString, long paramLong) {
/*  53 */       if ((this.filename != null) && (this.previous == paramLong) && (this.filename.equals(paramString))) 0; return true;
/*     */     }
/*     */     
/*     */     long getNextOffset() {
/*  57 */       return this.next;
/*     */     }
/*     */     
/*     */     protected NextLineCache() {}
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  39 */     this.filenameCache = new Hashtable();
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
/*  60 */     this.nextLineCache = new NextLineCache();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FileManager()
/*     */   {
/*  72 */     this(getWNSearchDir());
/*     */   }
/*     */   
/*     */   public FileManager(String paramString) {
/*  76 */     jdMethod_this();
/*  77 */     this.searchDirectory = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */   protected static final boolean IS_WINDOWS_OS = System.getProperties().getProperty("os.name").startsWith("Windows");
/*  85 */   protected static final boolean IS_MAC_OS = System.getProperties().getProperty("os.name").startsWith("Mac");
/*     */   
/*     */ 
/*  88 */   protected static final String fileSeparator = IS_MW_VM ? ":" : File.separator;
/*     */   protected String searchDirectory;
/*     */   
/*  91 */   protected static String getWNHome() { String str = System.getProperty("WNHOME");
/*  92 */     if (str != null)
/*  93 */       return str;
/*  94 */     if (IS_WINDOWS_OS)
/*  95 */       return "C:\\wn16";
/*  96 */     if (IS_MAC_OS) {
/*  97 */       return ".";
/*     */     }
/*  99 */     return "/usr/local/wordnet1.6";
/*     */   }
/*     */   
/*     */   protected static String getWNSearchDir()
/*     */   {
/* 104 */     String str = System.getProperty("WNSEARCHDIR");
/* 105 */     if (str != null)
/* 106 */       return str;
/* 107 */     if ((IS_MAC_OS) && (getWNHome().equals("."))) {
/* 108 */       return "Database";
/*     */     }
/* 110 */     return getWNHome() + fileSeparator + (IS_MAC_OS ? "Database" : "dict");
/*     */   }
/*     */   
/*     */   static String mapToWindowsFilename(String paramString)
/*     */   {
/* 115 */     if (paramString.startsWith("data.")) {
/* 116 */       paramString = paramString.substring("data.".length()) + ".dat";
/* 117 */     } else if (paramString.startsWith("index.")) {
/* 118 */       paramString = paramString.substring("index.".length()) + ".idx";
/*     */     }
/* 120 */     return paramString;
/*     */   }
/*     */   
/*     */   protected synchronized RandomAccessFile getFileStream(String paramString) throws IOException {
/* 124 */     if (IS_WINDOWS_OS) {
/* 125 */       paramString = mapToWindowsFilename(paramString);
/*     */     }
/* 127 */     RandomAccessFile localRandomAccessFile = (RandomAccessFile)this.filenameCache.get(paramString);
/* 128 */     if (localRandomAccessFile == null) {
/* 129 */       String str = this.searchDirectory + fileSeparator + paramString;
/* 130 */       localRandomAccessFile = new RandomAccessFile(str, "r");
/* 131 */       this.filenameCache.put(paramString, localRandomAccessFile);
/*     */     }
/* 133 */     return localRandomAccessFile;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String readLine(RandomAccessFile paramRandomAccessFile)
/*     */     throws IOException
/*     */   {
/* 142 */     if (IS_MW_VM) {
/* 143 */       StringBuffer localStringBuffer = new StringBuffer();
/*     */       
/*     */       int i;
/* 146 */       while (((i = paramRandomAccessFile.read()) != -1) && (i != 10) && (i != 13)) {
/* 147 */         localStringBuffer.append((char)i);
/*     */       }
/* 149 */       if ((i == -1) && (localStringBuffer.length() == 0)) {
/* 150 */         return null;
/*     */       }
/* 152 */       return localStringBuffer.toString();
/*     */     }
/* 154 */     return paramRandomAccessFile.readLine();
/*     */   }
/*     */   
/*     */   protected void skipLine(RandomAccessFile paramRandomAccessFile)
/*     */     throws IOException
/*     */   {
/*     */     int i;
/* 161 */     while (((i = paramRandomAccessFile.read()) != -1) && (i != 10) && (i != 13)) {}
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
/*     */   protected String readLineWord(RandomAccessFile paramRandomAccessFile)
/*     */     throws IOException
/*     */   {
/* 182 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*     */     int i;
/* 185 */     while (((i = paramRandomAccessFile.read()) != -1) && (i != 10) && (i != 13) && (i != 32)) {
/* 186 */       localStringBuffer.append((char)i);
/*     */     }
/* 188 */     if ((i == -1) && (localStringBuffer.length() == 0)) {
/* 189 */       return null;
/*     */     }
/* 191 */     if (i == 32) {
/* 192 */       skipLine(paramRandomAccessFile);
/*     */     }
/* 194 */     return localStringBuffer.toString();
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
/*     */   protected Hashtable filenameCache;
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
/*     */   protected NextLineCache nextLineCache;
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
/*     */   protected int compare(String paramString1, String paramString2)
/*     */   {
/* 285 */     int i = Math.min(paramString1.length(), paramString2.length());
/* 286 */     for (int j = 0; j < i; j++) {
/* 287 */       int k = paramString1.charAt(j) - paramString2.charAt(j);
/* 288 */       if (k != 0) {
/* 289 */         return k;
/*     */       }
/*     */     }
/* 292 */     if (paramString1.length() > i)
/* 293 */       return 1;
/* 294 */     if (i < paramString2.length()) {
/* 295 */       return -1;
/*     */     }
/* 297 */     return 0;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public String readLineAt(String paramString, long paramLong)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 141	wordnet/wn/FileManager:getFileStream	(Ljava/lang/String;)Ljava/io/RandomAccessFile;
/*     */     //   5: astore 4
/*     */     //   7: goto +7 -> 14
/*     */     //   10: aload 5
/*     */     //   12: monitorexit
/*     */     //   13: athrow
/*     */     //   14: aload 4
/*     */     //   16: dup
/*     */     //   17: astore 5
/*     */     //   19: monitorenter
/*     */     //   20: aload 4
/*     */     //   22: lload_2
/*     */     //   23: invokevirtual 145	java/io/RandomAccessFile:seek	(J)V
/*     */     //   26: aload_0
/*     */     //   27: aload 4
/*     */     //   29: invokevirtual 147	wordnet/wn/FileManager:readLine	(Ljava/io/RandomAccessFile;)Ljava/lang/String;
/*     */     //   32: astore 8
/*     */     //   34: aload 4
/*     */     //   36: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   39: lstore 9
/*     */     //   41: aload 8
/*     */     //   43: ifnonnull +7 -> 50
/*     */     //   46: iconst_m1
/*     */     //   47: i2l
/*     */     //   48: lstore 9
/*     */     //   50: aload_0
/*     */     //   51: getfield 153	wordnet/wn/FileManager:nextLineCache	Lwordnet/wn/FileManager$NextLineCache;
/*     */     //   54: aload_1
/*     */     //   55: lload_2
/*     */     //   56: lload 9
/*     */     //   58: invokevirtual 157	wordnet/wn/FileManager$NextLineCache:setNextLineOffset	(Ljava/lang/String;JJ)V
/*     */     //   61: aload 8
/*     */     //   63: aload 5
/*     */     //   65: monitorexit
/*     */     //   66: areturn
/*     */     // Line number table:
/*     */     //   Java source line #168	-> byte code offset #0
/*     */     //   Java source line #169	-> byte code offset #7
/*     */     //   Java source line #170	-> byte code offset #20
/*     */     //   Java source line #171	-> byte code offset #26
/*     */     //   Java source line #172	-> byte code offset #34
/*     */     //   Java source line #173	-> byte code offset #41
/*     */     //   Java source line #174	-> byte code offset #46
/*     */     //   Java source line #176	-> byte code offset #50
/*     */     //   Java source line #177	-> byte code offset #61
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	67	0	this	FileManager
/*     */     //   0	67	1	paramString	String
/*     */     //   0	67	2	paramLong	long
/*     */     //   5	30	4	localRandomAccessFile	RandomAccessFile
/*     */     //   10	54	5	Ljava/lang/Object;	Object
/*     */     //   32	30	8	str	String
/*     */     //   39	18	9	l	long
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	13	10	finally
/*     */     //   20	66	10	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getNextLinePointer(String paramString, long paramLong)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 141	wordnet/wn/FileManager:getFileStream	(Ljava/lang/String;)Ljava/io/RandomAccessFile;
/*     */     //   5: astore 4
/*     */     //   7: goto +7 -> 14
/*     */     //   10: aload 5
/*     */     //   12: monitorexit
/*     */     //   13: athrow
/*     */     //   14: aload 4
/*     */     //   16: dup
/*     */     //   17: astore 5
/*     */     //   19: monitorenter
/*     */     //   20: aload_0
/*     */     //   21: getfield 153	wordnet/wn/FileManager:nextLineCache	Lwordnet/wn/FileManager$NextLineCache;
/*     */     //   24: aload_1
/*     */     //   25: lload_2
/*     */     //   26: invokevirtual 168	wordnet/wn/FileManager$NextLineCache:matchingOffset	(Ljava/lang/String;J)Z
/*     */     //   29: ifeq +14 -> 43
/*     */     //   32: aload_0
/*     */     //   33: getfield 153	wordnet/wn/FileManager:nextLineCache	Lwordnet/wn/FileManager$NextLineCache;
/*     */     //   36: invokevirtual 171	wordnet/wn/FileManager$NextLineCache:getNextOffset	()J
/*     */     //   39: aload 5
/*     */     //   41: monitorexit
/*     */     //   42: lreturn
/*     */     //   43: aload 4
/*     */     //   45: lload_2
/*     */     //   46: invokevirtual 145	java/io/RandomAccessFile:seek	(J)V
/*     */     //   49: aload_0
/*     */     //   50: aload 4
/*     */     //   52: invokevirtual 162	wordnet/wn/FileManager:skipLine	(Ljava/io/RandomAccessFile;)V
/*     */     //   55: aload 4
/*     */     //   57: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   60: aload 5
/*     */     //   62: monitorexit
/*     */     //   63: lreturn
/*     */     // Line number table:
/*     */     //   Java source line #198	-> byte code offset #0
/*     */     //   Java source line #199	-> byte code offset #7
/*     */     //   Java source line #200	-> byte code offset #20
/*     */     //   Java source line #201	-> byte code offset #32
/*     */     //   Java source line #203	-> byte code offset #43
/*     */     //   Java source line #204	-> byte code offset #49
/*     */     //   Java source line #205	-> byte code offset #55
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	64	0	this	FileManager
/*     */     //   0	64	1	paramString	String
/*     */     //   0	64	2	paramLong	long
/*     */     //   5	51	4	localRandomAccessFile	RandomAccessFile
/*     */     //   10	1	5	localObject1	Object
/*     */     //   17	44	5	Ljava/lang/Object;	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	13	10	finally
/*     */     //   20	42	10	finally
/*     */     //   43	63	10	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getMatchingLinePointer(String paramString1, long paramLong, String paramString2)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 141	wordnet/wn/FileManager:getFileStream	(Ljava/lang/String;)Ljava/io/RandomAccessFile;
/*     */     //   5: astore 5
/*     */     //   7: goto +7 -> 14
/*     */     //   10: aload 6
/*     */     //   12: monitorexit
/*     */     //   13: athrow
/*     */     //   14: aload 5
/*     */     //   16: dup
/*     */     //   17: astore 6
/*     */     //   19: monitorenter
/*     */     //   20: aload 5
/*     */     //   22: lload_2
/*     */     //   23: invokevirtual 145	java/io/RandomAccessFile:seek	(J)V
/*     */     //   26: aload_0
/*     */     //   27: aload 5
/*     */     //   29: invokevirtual 175	wordnet/wn/FileManager:readLineWord	(Ljava/io/RandomAccessFile;)Ljava/lang/String;
/*     */     //   32: astore 10
/*     */     //   34: aload 5
/*     */     //   36: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   39: lstore 11
/*     */     //   41: aload 10
/*     */     //   43: ifnonnull +9 -> 52
/*     */     //   46: iconst_m1
/*     */     //   47: i2l
/*     */     //   48: aload 6
/*     */     //   50: monitorexit
/*     */     //   51: lreturn
/*     */     //   52: aload_0
/*     */     //   53: getfield 153	wordnet/wn/FileManager:nextLineCache	Lwordnet/wn/FileManager$NextLineCache;
/*     */     //   56: aload_1
/*     */     //   57: lload_2
/*     */     //   58: lload 11
/*     */     //   60: invokevirtual 157	wordnet/wn/FileManager$NextLineCache:setNextLineOffset	(Ljava/lang/String;JJ)V
/*     */     //   63: aload 10
/*     */     //   65: aload 4
/*     */     //   67: invokevirtual 179	java/lang/String:indexOf	(Ljava/lang/String;)I
/*     */     //   70: iflt +8 -> 78
/*     */     //   73: lload_2
/*     */     //   74: aload 6
/*     */     //   76: monitorexit
/*     */     //   77: lreturn
/*     */     //   78: lload 11
/*     */     //   80: lstore_2
/*     */     //   81: goto -55 -> 26
/*     */     // Line number table:
/*     */     //   Java source line #213	-> byte code offset #0
/*     */     //   Java source line #214	-> byte code offset #7
/*     */     //   Java source line #215	-> byte code offset #20
/*     */     //   Java source line #216	-> byte code offset #26
/*     */     //   Java source line #217	-> byte code offset #26
/*     */     //   Java source line #218	-> byte code offset #34
/*     */     //   Java source line #219	-> byte code offset #41
/*     */     //   Java source line #220	-> byte code offset #46
/*     */     //   Java source line #222	-> byte code offset #52
/*     */     //   Java source line #223	-> byte code offset #63
/*     */     //   Java source line #224	-> byte code offset #73
/*     */     //   Java source line #226	-> byte code offset #78
/*     */     //   Java source line #227	-> byte code offset #81
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	84	0	this	FileManager
/*     */     //   0	84	1	paramString1	String
/*     */     //   0	84	2	paramLong	long
/*     */     //   0	84	4	paramString2	String
/*     */     //   5	30	5	localRandomAccessFile	RandomAccessFile
/*     */     //   10	1	6	localObject1	Object
/*     */     //   17	58	6	Ljava/lang/Object;	Object
/*     */     //   32	32	10	str	String
/*     */     //   39	40	11	l	long
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	13	10	finally
/*     */     //   20	51	10	finally
/*     */     //   52	77	10	finally
/*     */     //   78	84	10	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getIndexedLinePointer(String paramString1, String paramString2)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 141	wordnet/wn/FileManager:getFileStream	(Ljava/lang/String;)Ljava/io/RandomAccessFile;
/*     */     //   5: astore_3
/*     */     //   6: goto +7 -> 13
/*     */     //   9: aload 4
/*     */     //   11: monitorexit
/*     */     //   12: athrow
/*     */     //   13: aload_3
/*     */     //   14: dup
/*     */     //   15: astore 4
/*     */     //   17: monitorenter
/*     */     //   18: lconst_0
/*     */     //   19: lstore 8
/*     */     //   21: aload_3
/*     */     //   22: invokevirtual 183	java/io/RandomAccessFile:length	()J
/*     */     //   25: lstore 10
/*     */     //   27: lload 8
/*     */     //   29: lload 10
/*     */     //   31: ladd
/*     */     //   32: iconst_2
/*     */     //   33: i2l
/*     */     //   34: ldiv
/*     */     //   35: lstore 12
/*     */     //   37: aload_3
/*     */     //   38: lload 12
/*     */     //   40: invokevirtual 145	java/io/RandomAccessFile:seek	(J)V
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokevirtual 162	wordnet/wn/FileManager:skipLine	(Ljava/io/RandomAccessFile;)V
/*     */     //   48: aload_3
/*     */     //   49: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   52: lstore 14
/*     */     //   54: lload 14
/*     */     //   56: lload 8
/*     */     //   58: lcmp
/*     */     //   59: ifne +9 -> 68
/*     */     //   62: iconst_m1
/*     */     //   63: i2l
/*     */     //   64: aload 4
/*     */     //   66: monitorexit
/*     */     //   67: lreturn
/*     */     //   68: lload 14
/*     */     //   70: lload 10
/*     */     //   72: lcmp
/*     */     //   73: ifne +63 -> 136
/*     */     //   76: aload_3
/*     */     //   77: lload 8
/*     */     //   79: lconst_1
/*     */     //   80: ladd
/*     */     //   81: invokevirtual 145	java/io/RandomAccessFile:seek	(J)V
/*     */     //   84: aload_0
/*     */     //   85: aload_3
/*     */     //   86: invokevirtual 162	wordnet/wn/FileManager:skipLine	(Ljava/io/RandomAccessFile;)V
/*     */     //   89: goto +31 -> 120
/*     */     //   92: aload_3
/*     */     //   93: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   96: lstore 16
/*     */     //   98: aload_0
/*     */     //   99: aload_3
/*     */     //   100: invokevirtual 175	wordnet/wn/FileManager:readLineWord	(Ljava/io/RandomAccessFile;)Ljava/lang/String;
/*     */     //   103: astore 18
/*     */     //   105: aload 18
/*     */     //   107: aload_2
/*     */     //   108: invokevirtual 52	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   111: ifeq +9 -> 120
/*     */     //   114: lload 16
/*     */     //   116: aload 4
/*     */     //   118: monitorexit
/*     */     //   119: lreturn
/*     */     //   120: aload_3
/*     */     //   121: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   124: lload 10
/*     */     //   126: lcmp
/*     */     //   127: iflt -35 -> 92
/*     */     //   130: iconst_m1
/*     */     //   131: i2l
/*     */     //   132: aload 4
/*     */     //   134: monitorexit
/*     */     //   135: lreturn
/*     */     //   136: aload_3
/*     */     //   137: invokevirtual 151	java/io/RandomAccessFile:getFilePointer	()J
/*     */     //   140: lstore 16
/*     */     //   142: aload_0
/*     */     //   143: aload_3
/*     */     //   144: invokevirtual 175	wordnet/wn/FileManager:readLineWord	(Ljava/io/RandomAccessFile;)Ljava/lang/String;
/*     */     //   147: astore 18
/*     */     //   149: aload 18
/*     */     //   151: aload_2
/*     */     //   152: invokevirtual 52	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   155: ifeq +9 -> 164
/*     */     //   158: lload 16
/*     */     //   160: aload 4
/*     */     //   162: monitorexit
/*     */     //   163: lreturn
/*     */     //   164: aload_0
/*     */     //   165: aload_2
/*     */     //   166: aload 18
/*     */     //   168: invokevirtual 187	wordnet/wn/FileManager:compare	(Ljava/lang/String;Ljava/lang/String;)I
/*     */     //   171: istore 19
/*     */     //   173: iload 19
/*     */     //   175: ifle +10 -> 185
/*     */     //   178: lload 14
/*     */     //   180: lstore 8
/*     */     //   182: goto +21 -> 203
/*     */     //   185: iload 19
/*     */     //   187: ifge +10 -> 197
/*     */     //   190: lload 14
/*     */     //   192: lstore 10
/*     */     //   194: goto +9 -> 203
/*     */     //   197: lload 16
/*     */     //   199: aload 4
/*     */     //   201: monitorexit
/*     */     //   202: lreturn
/*     */     //   203: goto -176 -> 27
/*     */     // Line number table:
/*     */     //   Java source line #232	-> byte code offset #0
/*     */     //   Java source line #233	-> byte code offset #6
/*     */     //   Java source line #234	-> byte code offset #18
/*     */     //   Java source line #235	-> byte code offset #21
/*     */     //   Java source line #236	-> byte code offset #27
/*     */     //   Java source line #237	-> byte code offset #27
/*     */     //   Java source line #238	-> byte code offset #37
/*     */     //   Java source line #239	-> byte code offset #43
/*     */     //   Java source line #240	-> byte code offset #48
/*     */     //   Java source line #241	-> byte code offset #54
/*     */     //   Java source line #244	-> byte code offset #54
/*     */     //   Java source line #245	-> byte code offset #62
/*     */     //   Java source line #246	-> byte code offset #68
/*     */     //   Java source line #247	-> byte code offset #76
/*     */     //   Java source line #248	-> byte code offset #84
/*     */     //   Java source line #249	-> byte code offset #89
/*     */     //   Java source line #252	-> byte code offset #89
/*     */     //   Java source line #253	-> byte code offset #92
/*     */     //   Java source line #254	-> byte code offset #98
/*     */     //   Java source line #255	-> byte code offset #105
/*     */     //   Java source line #258	-> byte code offset #105
/*     */     //   Java source line #259	-> byte code offset #114
/*     */     //   Java source line #252	-> byte code offset #120
/*     */     //   Java source line #262	-> byte code offset #130
/*     */     //   Java source line #264	-> byte code offset #136
/*     */     //   Java source line #265	-> byte code offset #142
/*     */     //   Java source line #266	-> byte code offset #149
/*     */     //   Java source line #266	-> byte code offset #158
/*     */     //   Java source line #267	-> byte code offset #164
/*     */     //   Java source line #268	-> byte code offset #173
/*     */     //   Java source line #271	-> byte code offset #173
/*     */     //   Java source line #272	-> byte code offset #178
/*     */     //   Java source line #273	-> byte code offset #185
/*     */     //   Java source line #274	-> byte code offset #190
/*     */     //   Java source line #276	-> byte code offset #197
/*     */     //   Java source line #236	-> byte code offset #203
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	206	0	this	FileManager
/*     */     //   0	206	1	paramString1	String
/*     */     //   0	206	2	paramString2	String
/*     */     //   5	139	3	localRandomAccessFile	RandomAccessFile
/*     */     //   9	1	4	localObject1	Object
/*     */     //   15	185	4	Ljava/lang/Object;	Object
/*     */     //   19	162	8	l1	long
/*     */     //   25	168	10	l2	long
/*     */     //   35	4	12	l3	long
/*     */     //   52	139	14	l4	long
/*     */     //   96	102	16	l5	long
/*     */     //   103	64	18	str	String
/*     */     //   171	15	19	i	int
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	12	9	finally
/*     */     //   18	67	9	finally
/*     */     //   68	119	9	finally
/*     */     //   120	135	9	finally
/*     */     //   136	163	9	finally
/*     */     //   164	202	9	finally
/*     */     //   203	206	9	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\FileManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */