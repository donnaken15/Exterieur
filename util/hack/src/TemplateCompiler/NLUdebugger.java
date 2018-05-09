/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import java.util.Vector;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class NLUdebugger
/*     */ {
/*     */   private static JFrame frame;
/*     */   private static JPanel pane;
/*     */   private static Vector facts;
/*  14 */   private static javax.swing.JList datalist = new javax.swing.JList();
/*     */   
/*     */   private static JButton button1;
/*  17 */   public static boolean observe = false;
/*     */   
/*     */ 
/*     */   private final java.awt.Component createComponents()
/*     */   {
/*  22 */     button1 = new JButton("Show Facts");
/*  23 */     JButton localJButton = new JButton("Clear Facts");
/*     */     
/*  25 */     button1.setMnemonic(83);
/*  26 */     localJButton.setMnemonic(67);
/*  27 */     button1.addActionListener(new NLUdebugger.2(this));
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
/*  41 */     localJButton.addActionListener(new NLUdebugger.3(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  49 */     button1.setPreferredSize(new Dimension(450, 50));
/*  50 */     localJButton.setPreferredSize(new Dimension(450, 50));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */     pane = new JPanel();
/*  61 */     pane.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 10, 30));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */     pane.add(button1);
/*  70 */     pane.add(localJButton);
/*     */     
/*  72 */     javax.swing.JScrollPane localJScrollPane = new javax.swing.JScrollPane(datalist);
/*  73 */     localJScrollPane.setPreferredSize(new Dimension(450, 400));
/*  74 */     pane.add(localJScrollPane);
/*     */     
/*  76 */     pane.setPreferredSize(new Dimension(500, 600));
/*  77 */     return pane;
/*     */   }
/*     */   
/*     */   public static void addmessage(String paramString, long paramLong)
/*     */   {
/*  82 */     facts.addElement(paramString);
/*  83 */     datalist.setListData(facts.toArray());
/*     */   }
/*     */   
/*     */   public NLUdebugger()
/*     */   {
/*     */     try
/*     */     {
/*  90 */       javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
/*     */     }
/*     */     catch (Exception localException) {}
/*     */     
/*     */ 
/*  95 */     frame = new JFrame("NLU Debugger");
/*  96 */     facts = new Vector();
/*  97 */     java.awt.Component localComponent = createComponents();
/*  98 */     frame.getContentPane().add(localComponent);
/*     */     
/*     */ 
/* 101 */     frame.addWindowListener(new NLUdebugger.1(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 106 */     frame.pack();
/* 107 */     frame.setResizable(false);
/*     */     
/* 109 */     frame.setVisible(true);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUdebugger.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */