/*     */ package jess;
/*     */ 
/*     */ import java.awt.Frame;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Console
/*     */   extends Frame
/*     */   implements Serializable
/*     */ {
/*     */   ConsolePanel m_panel;
/*     */   Rete m_rete;
/*     */   boolean m_doEcho;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  19 */     this.m_doEcho = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Console(String paramString)
/*     */   {
/*  28 */     this(paramString, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Console(String paramString, boolean paramBoolean)
/*     */   {
/*  38 */     this(paramString, new Rete(), paramBoolean);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Console(String paramString, Rete paramRete)
/*     */   {
/*  48 */     this(paramString, paramRete, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Console(String paramString, Rete paramRete, boolean paramBoolean)
/*     */   {
/*  58 */     super(paramString);jdMethod_this();
/*     */     
/*  60 */     this.m_rete = paramRete;
/*  61 */     this.m_panel = new ConsolePanel(paramRete, paramBoolean);
/*  62 */     this.m_doEcho = paramBoolean;
/*     */     
/*  64 */     add("Center", this.m_panel);
/*  65 */     validate();
/*  66 */     setSize(500, 300);
/*  67 */     show();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Rete getEngine()
/*     */   {
/*  75 */     return this.m_rete;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void execute(String[] paramArrayOfString)
/*     */   {
/*  86 */     Main localMain = new Main();
/*  87 */     localMain.initialize(paramArrayOfString, this.m_rete);
/*  88 */     this.m_panel.setFocus();
/*     */     for (;;) {
/*  90 */       localMain.execute(this.m_doEcho);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/*  99 */     Console localConsole = new Console("Jess Console");
/*     */     
/*     */ 
/* 102 */     localConsole.addWindowListener(new Console.1());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 107 */     localConsole.execute(paramArrayOfString);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Console.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */