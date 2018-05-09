/*    */ package dramaman.compiler;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.PrintStream;
/*    */ import java.util.LinkedList;
/*    */ import java.util.ListIterator;
/*    */ 
/*    */ public class Beat
/*    */ {
/* 10 */   private static LinkedList sourceFiles = new LinkedList();
/* 11 */   private static String objectDirectoryName = null;
/*    */   static File objectDirectory;
/* 13 */   private static boolean dumpTree = false;
/*    */   
/*    */   private static final void processCommandlineArgs(String[] paramArrayOfString) {
/* 16 */     for (int i = 0; i < paramArrayOfString.length; i++) {
/* 17 */       if (paramArrayOfString[i].startsWith("-d")) {
/* 18 */         i++; if (i >= paramArrayOfString.length) {
/* 19 */           usage();
/* 20 */           System.exit(1);
/*    */         }
/*    */         else {
/* 23 */           objectDirectoryName = paramArrayOfString[i];
/*    */         }
/* 25 */       } else if (paramArrayOfString[i].startsWith("-X")) {
/* 26 */         i++; if (i >= paramArrayOfString.length) {
/* 27 */           usage();
/* 28 */           System.exit(1);
/*    */ 
/*    */         }
/* 31 */         else if (paramArrayOfString[i].equals("dumpTree")) {
/* 32 */           dumpTree = true;
/*    */         } else {
/* 34 */           usage();
/* 35 */           System.exit(1);
/*    */         }
/*    */       }
/*    */       else
/*    */       {
/* 40 */         sourceFiles.add(paramArrayOfString[i]);
/*    */       }
/*    */     }
/* 43 */     if (objectDirectoryName != null) {
/* 44 */       objectDirectory = new File(objectDirectoryName);
/*    */     } else
/* 46 */       objectDirectory = new File(".");
/*    */   }
/*    */   
/*    */   private static final void usage() {
/* 50 */     System.out.println("beat [-d <object directory>] [-X dumpTree] <beat source file>+");
/*    */   }
/*    */   
/*    */   public static void main(String[] paramArrayOfString)
/*    */     throws CompileException
/*    */   {
/* 56 */     processCommandlineArgs(paramArrayOfString);
/*    */     
/*    */ 
/* 59 */     if (paramArrayOfString.length == 0) {
/* 60 */       usage();
/*    */     } else {
/* 62 */       ListIterator localListIterator = sourceFiles.listIterator();
/* 63 */       while (localListIterator.hasNext()) {
/* 64 */         String str = (String)localListIterator.next();
/* 65 */         System.out.println("Reading from file " + str + " . . .");
/*    */         try {
/* 67 */           BeatParser localBeatParser = new BeatParser(new java.io.FileInputStream(str));
/* 68 */           ASTBeatTopLevel localASTBeatTopLevel = BeatParser.BeatTopLevel();
/* 69 */           System.out.println(str + " parsed successfully.");
/* 70 */           if (dumpTree) {
/* 71 */             localASTBeatTopLevel.dump("");
/*    */           }
/* 73 */           System.out.println("Generating code . . .");
/* 74 */           localASTBeatTopLevel.compileToJava();
/*    */         }
/*    */         catch (java.io.FileNotFoundException localFileNotFoundException) {
/* 77 */           System.out.println("Beat Parser: File " + str + " not found.");
/*    */         }
/*    */         catch (ParseException localParseException) {
/* 80 */           System.out.println(localParseException.getMessage());
/* 81 */           System.out.println("Beat Parser: Encountered errors during parse.");
/*    */         }
/*    */         catch (CompileException localCompileException) {
/* 84 */           System.out.println(localCompileException.getMessage());
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\Beat.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */