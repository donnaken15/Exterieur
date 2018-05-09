/*    */ package jess;
/*    */ 
/*    */ import java.applet.Applet;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Label;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConsoleApplet
/*    */   extends Applet
/*    */   implements Runnable, Serializable
/*    */ {
/*    */   private ConsolePanel m_panel;
/*    */   private Rete m_rete;
/*    */   private Thread m_thread;
/*    */   private Main m_main;
/*    */   
/*    */   public void init()
/*    */   {
/* 41 */     setLayout(new BorderLayout());
/* 42 */     this.m_rete = new Rete(this);
/* 43 */     this.m_panel = new ConsolePanel(this.m_rete);
/* 44 */     add("Center", this.m_panel);
/* 45 */     add("South", new Label());
/*    */     
/*    */ 
/* 48 */     String[] arrayOfString = new String[0];
/*    */     
/* 50 */     String str = getParameter("INPUT");
/* 51 */     if (str != null) {
/* 52 */       arrayOfString = new String[] { str };
/*    */     }
/* 54 */     this.m_main = new Main();
/* 55 */     this.m_main.initialize(arrayOfString, this.m_rete);
/*    */   }
/*    */   
/*    */   public synchronized void run()
/*    */   {
/*    */     do
/*    */     {
/*    */       try
/*    */       {
/* 64 */         this.m_panel.setFocus();
/*    */         for (;;) {
/* 66 */           this.m_main.execute(true);
/*    */         }
/* 68 */       } catch (Throwable localThrowable) { this.m_thread = null;
/*    */       }
/* 70 */     } while (this.m_thread != null);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void start()
/*    */   {
/* 77 */     if (this.m_thread == null)
/*    */     {
/* 79 */       this.m_thread = new Thread(this);
/* 80 */       this.m_thread.start();
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void stop()
/*    */   {
/* 88 */     this.m_thread = null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ConsoleApplet.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */