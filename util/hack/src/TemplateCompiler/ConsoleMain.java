/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.FileInputStream;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashSet;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Iterator;
/*     */ import javax.swing.JFrame;
/*     */ import jess.JessException;
/*     */ import jess.Rete;
/*     */ 
/*     */ public class ConsoleMain
/*     */ {
/*     */   private static Rete nluEngine;
/*     */   private static Hashtable beatNameToTemplateName;
/*     */   private static Hashtable templateNameToTemplates;
/*     */   
/*     */   public static String readString()
/*     */   {
/*  21 */     String str = "";
/*  22 */     int j = 0;
/*  23 */     while (j == 0)
/*     */     {
/*     */       try
/*     */       {
/*  27 */         int i = System.in.read();
/*  28 */         if ((i < 0) || ((char)i == '\n')) {
/*  29 */           j = 1;
/*     */         } else {
/*  31 */           str = str + (char)i;
/*     */         }
/*     */       }
/*     */       catch (java.io.IOException localIOException)
/*     */       {
/*  36 */         j = 1;
/*     */       }
/*     */     }
/*  39 */     return str.substring(0, str.length() - 1);
/*     */   }
/*     */   
/*     */   private static final void usage() {
/*  43 */     System.out.println("Usage:");
/*  44 */     System.out.println("java TemplateCompiler/ConsoleMain <rule_file> <map_file> <initial_beat_name>");
/*  45 */     System.exit(0);
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) throws java.io.IOException
/*     */   {
/*  50 */     if (paramArrayOfString.length == 0) usage();
/*  51 */     nluEngine = new RefCountRete();
/*  52 */     TimeOut localTimeOut = new TimeOut(nluEngine);
/*  53 */     nluEngine.addJessListener(new DebugListener(false));
/*  54 */     nluEngine.setEventMask(nluEngine.getEventMask() | 0x10 | 0x2 | 0x1000);
/*     */     
/*     */ 
/*     */ 
/*  58 */     wm.WorkingMemory localWorkingMemory = new wm.WorkingMemory("TripMemory");
/*  59 */     JFrame localJFrame = new JFrame("Test Memory Debugger");
/*  60 */     localJFrame.getContentPane().add(localWorkingMemory.getWMDebugInterface());
/*  61 */     localJFrame.pack();
/*  62 */     localJFrame.setVisible(true);
/*  63 */     nluEngine.addJessListener(new FactListener(new TimeOut(nluEngine)));
/*     */     
/*  65 */     if (paramArrayOfString.length != 3) {
/*  66 */       usage();
/*     */     }
/*  68 */     String str1 = paramArrayOfString[0];
/*  69 */     String str2 = paramArrayOfString[1];
/*  70 */     String str3 = paramArrayOfString[2];
/*     */     try
/*     */     {
/*  73 */       System.out.println("InitializeReteEngine...");
/*  74 */       Preprocessor.initializeReteEngine(nluEngine);
/*     */       
/*  76 */       FileInputStream localFileInputStream = new FileInputStream(str1);
/*  77 */       localObject1 = new java.util.zip.InflaterInputStream(localFileInputStream);
/*  78 */       localObject2 = new ObjectInputStream((java.io.InputStream)localObject1);
/*     */       
/*  80 */       templateNameToTemplates = (Hashtable)((ObjectInputStream)localObject2).readObject();
/*     */       
/*  82 */       localFileInputStream.close();
/*     */       
/*  84 */       localFileInputStream = new FileInputStream(str2);
/*  85 */       localObject1 = new java.util.zip.InflaterInputStream(localFileInputStream);
/*  86 */       localObject2 = new ObjectInputStream((java.io.InputStream)localObject1);
/*     */       
/*  88 */       beatNameToTemplateName = (Hashtable)((ObjectInputStream)localObject2).readObject();
/*     */       
/*  90 */       localFileInputStream.close();
/*     */ 
/*     */ 
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */ 
/*  97 */       throw new abl.runtime.RuntimeError("NLU: While loading objects " + localException);
/*     */     }
/*     */     
/*     */ 
/* 101 */     HashSet localHashSet = (HashSet)beatNameToTemplateName.get(str3);
/* 102 */     Object localObject1 = (HashSet)templateNameToTemplates.get("_CONST");
/* 103 */     Object localObject2 = localHashSet.iterator();
/* 104 */     Iterator localIterator = ((HashSet)localObject1).iterator();
/*     */     try
/*     */     {
/* 107 */       long l1 = System.currentTimeMillis();
/* 108 */       System.out.println("Reading template rules...");
/* 109 */       int i = 0;
/* 110 */       while (((Iterator)localObject2).hasNext()) {
/* 111 */         localObject3 = (String)((Iterator)localObject2).next();
/* 112 */         localObject4 = (String)templateNameToTemplates.get(localObject3);
/* 113 */         ((RefCountRete)nluEngine).executeCommands((String)localObject4);
/* 114 */         if (i % 10 == 0) System.out.print(i + ' ');
/* 115 */         i++;
/*     */       }
/* 117 */       System.out.println(i + " done");
/* 118 */       System.out.println("Unique Rules: " + ((RefCountRete)nluEngine).getUniqueRules());
/* 119 */       System.out.println("Shared refs to unique rules: " + ((RefCountRete)nluEngine).getSharedRuleRefs());
/* 120 */       System.out.println("Redefined shared rules (because of salience): " + ((RefCountRete)nluEngine).getRedefinedRules());
/*     */       
/* 122 */       System.out.println("Reading constants...");
/* 123 */       while (localIterator.hasNext()) {
/* 124 */         localObject3 = (String)localIterator.next();
/* 125 */         nluEngine.executeCommand((String)localObject3);
/*     */       }
/* 127 */       System.out.println("Load time = " + (float)(System.currentTimeMillis() - l1) / 1000.0F);
/*     */       
/*     */ 
/* 130 */       System.out.println("NLU is started");
/* 131 */       Object localObject3 = new facade.characters.wmedef.AnaphoricReferenceWME();
/* 132 */       Object localObject4 = new facade.characters.wmedef.PostBeatMixinInfoWME();
/* 133 */       localWorkingMemory.addWME((wm.WME)localObject3);
/* 134 */       localWorkingMemory.addWME((wm.WME)localObject4);
/* 135 */       nluEngine.store("__factKey", "anaphoricRef");
/* 136 */       nluEngine.store("__wmeKey", localObject3);
/* 137 */       nluEngine.executeCommand("(shadowWME __factKey __wmeKey)");
/* 138 */       nluEngine.store("__factKey", "postBeatMixinInfo");
/* 139 */       nluEngine.store("__wmeKey", localObject4);
/* 140 */       nluEngine.executeCommand("(shadowWME __factKey __wmeKey)");
/* 141 */     } catch (JessException localJessException1) { throw new Error(localJessException1.getMessage());
/*     */     }
/*     */     
/*     */ 
/* 145 */     System.out.println("NLU is started");
/*     */     for (;;)
/*     */     {
/* 148 */       System.out.println("Waiting for input...  Type 'q' to quit\n");
/* 149 */       String str4 = readString();
/* 150 */       long l2 = System.currentTimeMillis();
/*     */       try
/*     */       {
/* 153 */         if ((str4.equals("q")) || (str4.equals("Q"))) {
/* 154 */           System.out.println("### Player quit the experience");
/* 155 */           System.exit(0);
/*     */         }
/*     */         
/* 158 */         if (str4.charAt(0) == '(')
/*     */         {
/* 160 */           nluEngine.executeCommand(str4);
/*     */         }
/*     */         else
/*     */         {
/* 164 */           Preprocessor.Process(str4, nluEngine);
/*     */           
/* 166 */           nluEngine.run();
/*     */           
/* 168 */           nluEngine.reset();
/*     */           
/* 170 */           System.out.println("Time taken for engine to run: " + (System.currentTimeMillis() - l2));
/*     */         }
/*     */       }
/*     */       catch (JessException localJessException2) {
/* 174 */         JessExceptionHelper.processJessException(localJessException2);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ConsoleMain.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */