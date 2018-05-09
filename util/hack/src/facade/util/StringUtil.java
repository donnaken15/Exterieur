/*     */ package facade.util;
/*     */ 
/*     */ import facade.nativeinterface.NativeAnimationInterface;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StringUtil
/*     */   implements SpriteID
/*     */ {
/*     */   private static final boolean printToConsole = true;
/*  22 */   private static boolean printToFile = false;
/*     */   
/*     */ 
/*  25 */   private static boolean printToFile_commandLine = false;
/*     */   
/*     */ 
/*  28 */   private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE MMM d HH mm ss yyyy");
/*     */   private static TStream logFile;
/*     */   
/*     */   private static class FlushLogFileThread
/*     */     extends Thread
/*     */   {
/*  34 */     FlushLogFileThread(StringUtil.1 param1) { this(); }
/*     */     private FlushLogFileThread() {}
/*  36 */     public void run() { if (StringUtil.logFile != null)
/*  37 */         StringUtil.logFile.flush();
/*     */     }
/*     */   }
/*     */   
/*     */   private static class TStream extends PrintStream {
/*     */     public TStream(OutputStream paramOutputStream) {
/*  43 */       super();
/*     */     }
/*     */     
/*     */ 
/*     */     public void println(String paramString)
/*     */     {
/*  49 */       super.println(paramString);
/*  50 */       System.out.println(paramString);
/*     */     }
/*     */     
/*     */     public void printToLog(String paramString)
/*     */     {
/*  55 */       super.println(paramString);
/*     */     }
/*     */     
/*     */     public void flush()
/*     */     {
/*  60 */       super.flush();
/*  61 */       System.out.flush();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setGenerateEventLog()
/*     */   {
/*  67 */     printToFile_commandLine = true;
/*     */   }
/*     */   
/*     */   public static void initializeEventLog()
/*     */   {
/*  72 */     if ((!printToFile) && (printToFile_commandLine)) {
/*  73 */       printToFile = true;
/*     */     }
/*  75 */     if (printToFile)
/*     */     {
/*  77 */       File localFile1 = new File("eventlogs/");
/*  78 */       if (!localFile1.exists()) {
/*  79 */         localFile1.mkdir();
/*     */       }
/*  81 */       String str = "AI Log " + dateFormatter.format(new Date()) + ".txt";
/*  82 */       File localFile2 = new File("eventlogs/" + str);
/*     */       try {
/*  84 */         FileOutputStream localFileOutputStream = new FileOutputStream(localFile2, true);
/*     */         
/*     */ 
/*  87 */         Runtime.getRuntime().addShutdownHook(new FlushLogFileThread(null));
/*     */         
/*  89 */         logFile = new TStream(localFileOutputStream);
/*     */         
/*     */ 
/*  92 */         System.setErr(logFile);
/*  93 */       } catch (IOException localIOException) { throw new Error(localIOException);
/*     */       }
/*     */     } else {
/*  96 */       logFile = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void println(String paramString) {
/* 101 */     int i = NativeAnimationInterface.getTickCount();
/*     */     
/*     */ 
/* 104 */     System.out.println(i + ' ' + paramString);
/*     */     
/* 106 */     if (printToFile) {
/* 107 */       logFile.printToLog(i + ' ' + paramString);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean stringContains(String paramString1, String paramString2)
/*     */   {
/* 118 */     int i = 0;
/* 119 */     int j = paramString1.charAt(paramString1.length() - 1);
/*     */     
/* 121 */     if ((j == 46) || (j == 63) || (j == 33)) {
/* 122 */       paramString1 = paramString1.substring(0, paramString1.length() - 1);
/*     */     }
/*     */     
/*     */ 
/* 126 */     paramString1 = " " + paramString1 + ' ';
/*     */     
/* 128 */     if ((paramString1.indexOf(" " + paramString2 + ' ') != -1) || (paramString1.equals(paramString2)))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       return true;
/*     */     }
/* 139 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\StringUtil.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */