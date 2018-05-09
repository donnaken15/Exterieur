/*    */ package jess;
/*    */ 
/*    */ import java.io.PrintWriter;
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
/*    */ public class JessEventAdapter
/*    */   implements JessListener
/*    */ {
/*    */   private Funcall m_fc;
/*    */   private Rete m_rete;
/*    */   
/*    */   public JessEventAdapter(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 29 */     this.m_rete = paramRete;
/* 30 */     this.m_fc = new Funcall(paramString, paramRete);
/* 31 */     this.m_fc.setLength(2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public final void eventHappened(JessEvent paramJessEvent)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       this.m_fc.set(new Value(paramJessEvent), 1);
/* 45 */       this.m_fc.execute(this.m_rete.getGlobalContext());
/*    */     }
/*    */     catch (JessException localJessException)
/*    */     {
/* 49 */       this.m_rete.getErrStream().println(localJessException);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessEventAdapter.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */