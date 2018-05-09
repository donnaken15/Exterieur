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
/*    */ public class LongValue
/*    */   extends Value
/*    */   implements Serializable
/*    */ {
/*    */   private long m_long;
/*    */   
/*    */   public LongValue(long paramLong)
/*    */     throws JessException
/*    */   {
/* 24 */     super(paramLong, 65536);
/* 25 */     this.m_long = paramLong;
/*    */   }
/*    */   
/*    */   public final long longValue(Context paramContext) throws JessException
/*    */   {
/* 30 */     return this.m_long;
/*    */   }
/*    */   
/*    */   public final double numericValue(Context paramContext) throws JessException
/*    */   {
/* 35 */     return this.m_long;
/*    */   }
/*    */   
/*    */   public final int intValue(Context paramContext) throws JessException
/*    */   {
/* 40 */     return (int)this.m_long;
/*    */   }
/*    */   
/*    */   public final String stringValue(Context paramContext) throws JessException
/*    */   {
/* 45 */     return toString();
/*    */   }
/*    */   
/*    */   public final String toString()
/*    */   {
/* 50 */     return new Long(this.m_long).toString();
/*    */   }
/*    */   
/*    */ 
/*    */   public final boolean equals(Value paramValue)
/*    */   {
/* 56 */     if (paramValue.type() != 65536) {
/* 57 */       return false;
/*    */     }
/* 59 */     if (this.m_long == ((LongValue)paramValue).m_long) 0; return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\LongValue.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */