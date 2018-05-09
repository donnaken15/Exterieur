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
/*    */ final class JessToken
/*    */   implements Serializable
/*    */ {
/*    */   String m_sval;
/*    */   double m_nval;
/*    */   int m_lineno;
/*    */   int m_ttype;
/*    */   
/*    */   final Value tokenToValue(Context paramContext)
/*    */     throws JessException
/*    */   {
/* 30 */     switch (this.m_ttype)
/*    */     {
/*    */     case 32: 
/* 33 */       return new Value(this.m_nval, 32);
/*    */     case 4: 
/* 35 */       return new Value(this.m_nval, 4);
/*    */     case 2: 
/* 37 */       return new Value(this.m_sval, 2);
/*    */     case 8: case 8192: 
/* 39 */       if (paramContext != null) {
/* 40 */         return paramContext.getVariable(this.m_sval);
/*    */       }
/* 42 */       return new Value("?" + this.m_sval, 1);
/*    */     
/*    */     case 1: 
/* 45 */       return new Value(this.m_sval, 1);
/*    */     
/*    */     case 0: 
/* 48 */       if ("EOF".equals(this.m_sval)) {
/* 49 */         return Funcall.EOF;
/*    */       }
/*    */       break;
/*    */     }
/*    */     
/* 54 */     return new Value((char)this.m_ttype, 2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   final boolean isBlankVariable()
/*    */   {
/* 64 */     if ((this.m_sval != null) && (this.m_sval.startsWith("_blank_"))) 0; return true;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public final String toString()
/*    */   {
/* 72 */     if (this.m_ttype == 8)
/* 73 */       return "?" + this.m_sval;
/* 74 */     if (this.m_ttype == 8192)
/* 75 */       return "$?" + this.m_sval;
/* 76 */     if (this.m_ttype == 2)
/* 77 */       return "\"" + this.m_sval + '"';
/* 78 */     if (this.m_sval != null)
/* 79 */       return this.m_sval;
/* 80 */     if (this.m_ttype == 32)
/* 81 */       return this.m_nval;
/* 82 */     if (this.m_ttype == 4)
/* 83 */       return (int)this.m_nval;
/* 84 */     return (char)this.m_ttype;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessToken.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */