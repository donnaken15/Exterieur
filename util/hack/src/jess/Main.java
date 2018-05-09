/*     */ package jess;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class Main {
/*     */   private Rete m_rete;
/*     */   private java.io.Reader m_fis;
/*     */   private Jesp m_j;
/*     */   private boolean m_readStdin;
/*     */   private boolean m_exitOnError;
/*     */   
/*     */   public Main() {
/*  13 */     jdMethod_this();
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  18 */     this.m_readStdin = true;
/*  19 */     this.m_exitOnError = false;
/*     */   }
/*     */   
/*  22 */   public static void main(String[] paramArrayOfString) { Main localMain = new Main();
/*  23 */     localMain.initialize(paramArrayOfString, new Rete());
/*  24 */     localMain.execute(true);
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
/*     */   public void showLogo()
/*     */   {
/*  40 */     if ((this.m_rete != null) && (this.m_rete.getOutStream() != null)) {
/*  41 */       this.m_rete.getOutStream().println("\nJess, the Java Expert System Shell");
/*  42 */       this.m_rete.getOutStream().println("Copyright (C) 2001 E.J. Friedman Hill and the Sandia Corporation");
/*     */       try
/*     */       {
/*  45 */         this.m_rete.executeCommand("(printout t (jess-version-string) crlf crlf)");
/*     */       }
/*     */       catch (JessException localJessException) {}
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Main initialize(String[] paramArrayOfString, Rete paramRete)
/*     */   {
/*  57 */     this.m_rete = paramRete;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  62 */     int i = 0;
/*  63 */     int j = 1;
/*  64 */     if (paramArrayOfString.length > 0) {
/*  65 */       while ((i < paramArrayOfString.length) && (paramArrayOfString[i].startsWith("-"))) {
/*  66 */         if (paramArrayOfString[i].equals("-nologo")) {
/*  67 */           j = 0;
/*  68 */         } else if (paramArrayOfString[i].equals("-exit"))
/*  69 */           this.m_exitOnError = true;
/*  70 */         i++;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  76 */     if (j != 0) {
/*  77 */       showLogo();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  82 */     this.m_fis = this.m_rete.getInputRouter("t");
/*  83 */     String str = paramArrayOfString.length <= i ? null : paramArrayOfString[i];
/*     */     try
/*     */     {
/*  86 */       if (str != null) {
/*  87 */         if (this.m_rete.getApplet() == null) {
/*  88 */           this.m_fis = new java.io.BufferedReader(new java.io.FileReader(str));
/*     */         }
/*     */         else {
/*  91 */           java.net.URL localURL = new java.net.URL(this.m_rete.getApplet().getDocumentBase(), str);
/*     */           
/*     */ 
/*  94 */           this.m_fis = new java.io.BufferedReader(new java.io.InputStreamReader(localURL.openStream()));
/*     */         }
/*  96 */         this.m_readStdin = false;
/*     */       }
/*     */     }
/*     */     catch (java.io.IOException localIOException) {
/* 100 */       this.m_rete.getErrStream().println("File not found or cannot open file:" + localIOException.getMessage());
/*     */       
/* 102 */       this.m_rete.getErrStream().flush();
/* 103 */       System.exit(0);
/*     */     }
/*     */     
/* 106 */     return this;
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
/*     */   public void execute(boolean paramBoolean)
/*     */   {
/* 121 */     if (this.m_fis != null) {
/* 122 */       this.m_j = new Jesp(this.m_fis, this.m_rete);
/*     */       do
/*     */       {
/*     */         try {
/* 126 */           if ((paramBoolean) && (this.m_readStdin)) 0; this.m_j.parse(true);
/*     */         }
/*     */         catch (JessException localJessException) {
/* 129 */           PrintWriter localPrintWriter = this.m_rete.getErrStream();
/* 130 */           if (localJessException.getCause() != null) {
/* 131 */             localPrintWriter.write(localJessException.toString());
/* 132 */             localPrintWriter.write("\nNested exception is:\n");
/* 133 */             localPrintWriter.println(localJessException.getCause().getMessage());
/* 134 */             localJessException.getCause().printStackTrace(localPrintWriter);
/*     */           }
/*     */           else {
/* 137 */             localJessException.printStackTrace(localPrintWriter);
/*     */           }
/* 139 */           if (this.m_exitOnError) {
/* 140 */             this.m_rete.getErrStream().flush();
/* 141 */             this.m_rete.getOutStream().flush();
/* 142 */             System.exit(-1);
/*     */           }
/*     */         }
/*     */         catch (Exception localException) {
/* 146 */           this.m_rete.getErrStream().println("Unexpected exception:");
/* 147 */           localException.printStackTrace(this.m_rete.getErrStream());
/*     */           
/* 149 */           if (this.m_exitOnError) {
/* 150 */             this.m_rete.getErrStream().flush();
/* 151 */             this.m_rete.getOutStream().flush();
/* 152 */             System.exit(-1);
/*     */           }
/*     */         }
/*     */         finally {
/* 156 */           this.m_rete.getErrStream().flush();
/* 157 */           this.m_rete.getOutStream().flush();
/*     */         }
/*     */         
/*     */       }
/* 161 */       while (this.m_readStdin);
/*     */     }
/*     */     
/*     */ 
/* 165 */     this.m_readStdin = true;
/* 166 */     this.m_fis = this.m_rete.getInputRouter("t");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Main.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */