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
/*    */ class TypeP
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   private String m_name;
/*    */   private int m_type;
/*    */   
/*    */   TypeP(String paramString, int paramInt)
/*    */   {
/* 67 */     this.m_name = paramString;
/* 68 */     this.m_type = paramInt;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 72 */     return this.m_name;
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 76 */     return (paramValueVector.get(1).resolveValue(paramContext).type() & this.m_type) != 0 ? Funcall.TRUE : Funcall.FALSE;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\TypeP.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */