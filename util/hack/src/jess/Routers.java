/*     */ package jess;
/*     */ 
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Reader;
/*     */ import java.io.Writer;
/*     */ import java.util.Hashtable;
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
/*     */ class Routers
/*     */ {
/*     */   private Hashtable m_outRouters;
/*     */   private Hashtable m_inRouters;
/*     */   private Hashtable m_inWrappers;
/*     */   private Hashtable m_inModes;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  27 */     this.m_outRouters = new Hashtable(13);
/*  28 */     this.m_inRouters = new Hashtable(13);
/*  29 */     this.m_inWrappers = new Hashtable(13);
/*  30 */     this.m_inModes = new Hashtable(13); }
/*     */   
/*  32 */   Routers() { jdMethod_this();
/*  33 */     addInputRouter("t", new InputStreamReader(System.in), true);
/*  34 */     addOutputRouter("t", new PrintWriter(System.out, false));
/*  35 */     addInputRouter("WSTDIN", getInputRouter("t"), true);
/*  36 */     addOutputRouter("WSTDOUT", getOutputRouter("t"));
/*  37 */     addOutputRouter("WSTDERR", getOutputRouter("t"));
/*     */   }
/*     */   
/*     */   synchronized void addInputRouter(String paramString, Reader paramReader, boolean paramBoolean)
/*     */   {
/*  42 */     Tokenizer localTokenizer = (Tokenizer)this.m_inWrappers.get(paramReader);
/*  43 */     if (localTokenizer == null) {
/*  44 */       localTokenizer = new Tokenizer(paramReader);
/*     */     }
/*  46 */     this.m_inRouters.put(paramString, paramReader);
/*  47 */     this.m_inWrappers.put(paramReader, localTokenizer);
/*  48 */     this.m_inModes.put(paramString, new Boolean(paramBoolean));
/*     */   }
/*     */   
/*     */   synchronized void removeInputRouter(String paramString) {
/*  52 */     this.m_inRouters.remove(paramString);
/*     */   }
/*     */   
/*     */   Reader getInputRouter(String paramString) {
/*  56 */     return (Reader)this.m_inRouters.get(paramString);
/*     */   }
/*     */   
/*     */   Tokenizer getInputWrapper(Reader paramReader) {
/*  60 */     return (Tokenizer)this.m_inWrappers.get(paramReader);
/*     */   }
/*     */   
/*     */   boolean getInputMode(String paramString) {
/*  64 */     return ((Boolean)this.m_inModes.get(paramString)).booleanValue();
/*     */   }
/*     */   
/*     */   synchronized void addOutputRouter(String paramString, Writer paramWriter) {
/*  68 */     this.m_outRouters.put(paramString, paramWriter);
/*     */   }
/*     */   
/*     */   synchronized void removeOutputRouter(String paramString) {
/*  72 */     this.m_outRouters.remove(paramString);
/*     */   }
/*     */   
/*     */   Writer getOutputRouter(String paramString) {
/*  76 */     return (Writer)this.m_outRouters.get(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */   synchronized PrintWriter getErrStream()
/*     */   {
/*  82 */     Writer localWriter = getOutputRouter("WSTDERR");
/*  83 */     PrintWriter localPrintWriter; if ((localWriter instanceof PrintWriter)) {
/*  84 */       localPrintWriter = (PrintWriter)localWriter;
/*     */     } else {
/*  86 */       localPrintWriter = new PrintWriter(localWriter);
/*  87 */       addOutputRouter("WSTDERR", localPrintWriter);
/*     */     }
/*  89 */     return localPrintWriter;
/*     */   }
/*     */   
/*     */ 
/*     */   synchronized PrintWriter getOutStream()
/*     */   {
/*  95 */     Writer localWriter = getOutputRouter("WSTDOUT");
/*  96 */     PrintWriter localPrintWriter; if ((localWriter instanceof PrintWriter)) {
/*  97 */       localPrintWriter = (PrintWriter)localWriter;
/*     */     } else {
/*  99 */       localPrintWriter = new PrintWriter(localWriter);
/* 100 */       addOutputRouter("WSTDOUT", localPrintWriter);
/*     */     }
/* 102 */     return localPrintWriter;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Routers.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */