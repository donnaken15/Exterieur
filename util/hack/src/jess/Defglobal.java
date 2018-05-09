/*    */ package jess;
/*    */ 
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
/*    */ public class Defglobal
/*    */   implements Serializable, Visitable
/*    */ {
/*    */   private String m_name;
/*    */   private Value m_value;
/*    */   
/*    */   public Defglobal(String paramString, Value paramValue)
/*    */     throws JessException
/*    */   {
/* 30 */     this.m_name = paramString;
/* 31 */     this.m_value = paramValue;
/*    */   }
/*    */   
/*    */ 
/*    */   public void reset(Rete paramRete)
/*    */     throws JessException
/*    */   {
/*    */     try
/*    */     {
/* 40 */       Context localContext = paramRete.getGlobalContext();
/* 41 */       localContext.setVariable(this.m_name, this.m_value.resolveValue(localContext));
/*    */     } catch (JessException localJessException) {
/* 43 */       localJessException.addContext("definition for defglobal ?" + this.m_name);
/* 44 */       throw localJessException;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getName()
/*    */   {
/* 52 */     return this.m_name;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Value getInitializationValue()
/*    */   {
/* 60 */     return this.m_value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 68 */     return "[defglobal " + this.m_name + ']';
/*    */   }
/*    */   
/*    */   public Object accept(Visitor paramVisitor) {
/* 72 */     return paramVisitor.visitDefglobal(this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Defglobal.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */