/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.Graphics;
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
/*    */ 
/*    */ 
/*    */ public class Canvas
/*    */   extends java.awt.Canvas
/*    */ {
/*    */   private Funcall m_fc;
/*    */   private Rete m_engine;
/*    */   
/*    */   public Canvas(String paramString, Rete paramRete)
/*    */     throws JessException
/*    */   {
/* 30 */     this.m_engine = paramRete;
/* 31 */     this.m_fc = new Funcall(paramString, paramRete);
/* 32 */     this.m_fc.add(new Value(this));
/* 33 */     this.m_fc.setLength(3);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void paint(Graphics paramGraphics)
/*    */   {
/*    */     try
/*    */     {
/* 48 */       this.m_fc.set(new Value(paramGraphics), 2);
/* 49 */       this.m_fc.execute(this.m_engine.getGlobalContext());
/*    */     }
/*    */     catch (JessException localJessException)
/*    */     {
/* 53 */       this.m_engine.getErrStream().println(localJessException);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\Canvas.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */