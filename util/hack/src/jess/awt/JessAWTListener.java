/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.AWTEvent;
/*    */ import java.io.PrintWriter;
/*    */ import jess.Funcall;
/*    */ import jess.JessException;
/*    */ import jess.Rete;
/*    */ import jess.Value;
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
/*    */ class JessAWTListener
/*    */ {
/*    */   private Funcall m_fc;
/*    */   private Rete m_engine;
/*    */   
/*    */   JessAWTListener(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 27 */     this.m_engine = paramRete;
/* 28 */     this.m_fc = new Funcall(paramString, paramRete);
/* 29 */     this.m_fc.setLength(2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   final void receiveEvent(AWTEvent paramAWTEvent)
/*    */   {
/*    */     try
/*    */     {
/* 39 */       this.m_fc.set(new Value(paramAWTEvent), 1);
/* 40 */       this.m_fc.execute(this.m_engine.getGlobalContext());
/*    */     }
/*    */     catch (JessException localJessException)
/*    */     {
/* 44 */       this.m_engine.getErrStream().println(localJessException);
/* 45 */       this.m_engine.getErrStream().flush();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\JessAWTListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */