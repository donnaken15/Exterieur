/*     */ package jess;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Button;
/*     */ import java.awt.Panel;
/*     */ import java.awt.TextArea;
/*     */ import java.awt.TextField;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Serializable;
/*     */ import jess.awt.TextAreaWriter;
/*     */ import jess.awt.TextReader;
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
/*     */ public class ConsolePanel
/*     */   extends Panel
/*     */   implements Serializable
/*     */ {
/*     */   private TextAreaWriter m_taw;
/*     */   private TextField m_tf;
/*     */   private TextReader m_in;
/*     */   Rete m_rete;
/*     */   
/*     */   public ConsolePanel(Rete paramRete)
/*     */   {
/*  43 */     this(paramRete, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsolePanel(Rete paramRete, boolean paramBoolean)
/*     */   {
/*  55 */     this.m_rete = paramRete;
/*     */     
/*     */ 
/*  58 */     TextArea localTextArea = new TextArea(10, 40);
/*  59 */     this.m_tf = new TextField(50);
/*  60 */     localTextArea.setEditable(false);
/*  61 */     Button localButton = new Button("Clear Window");
/*  62 */     Panel localPanel = new Panel();
/*  63 */     localPanel.setLayout(new BorderLayout());
/*     */     
/*     */ 
/*     */ 
/*  67 */     this.m_taw = new TextAreaWriter(localTextArea);
/*  68 */     this.m_in = new TextReader(false);
/*     */     
/*     */ 
/*  71 */     setLayout(new BorderLayout());
/*  72 */     add("Center", localTextArea);
/*  73 */     localPanel.add("Center", this.m_tf);
/*  74 */     localPanel.add("East", localButton);
/*  75 */     add("South", localPanel);
/*     */     
/*  77 */     this.m_tf.addActionListener(new ConsolePanel.1(this, paramBoolean, localTextArea));
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
/*  96 */     localButton.addActionListener(new ConsolePanel.2(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */     PrintWriter localPrintWriter = new PrintWriter(this.m_taw, true);
/* 105 */     paramRete.addInputRouter("t", this.m_in, true);
/* 106 */     paramRete.addOutputRouter("t", localPrintWriter);
/* 107 */     paramRete.addInputRouter("WSTDIN", this.m_in, true);
/* 108 */     paramRete.addOutputRouter("WSTDOUT", localPrintWriter);
/* 109 */     paramRete.addOutputRouter("WSTDERR", localPrintWriter);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final void setFocus()
/*     */   {
/* 117 */     this.m_tf.requestFocus();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ConsolePanel.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */