/*     */ package jess;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Serializable;
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
/*     */ public class Activation
/*     */   implements Serializable
/*     */ {
/*     */   private Token m_token;
/*     */   private Defrule m_rule;
/*     */   private boolean m_inactive;
/*     */   private int m_salience;
/*     */   private int m_seq;
/*     */   
/*     */   public final Token getToken()
/*     */   {
/*  29 */     return this.m_token;
/*     */   }
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
/*     */   public final Defrule getRule()
/*     */   {
/*  44 */     return this.m_rule;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   Activation(Token paramToken, Defrule paramDefrule)
/*     */   {
/*  54 */     this.m_token = paramToken;
/*  55 */     this.m_rule = paramDefrule;
/*  56 */     this.m_salience = this.m_rule.getSalience();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInactive()
/*     */   {
/*  65 */     return this.m_inactive;
/*     */   }
/*     */   
/*     */   void setInactive() {
/*  69 */     this.m_inactive = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSalience()
/*     */   {
/*  80 */     return this.m_salience;
/*     */   }
/*     */   
/*     */   void fire(Rete paramRete) throws JessException {
/*  84 */     this.m_rule.fire(this.m_token, paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */   void setSequenceNumber(int paramInt)
/*     */   {
/*  90 */     this.m_seq = paramInt;
/*     */   }
/*     */   
/*     */   void debugPrint(PrintWriter paramPrintWriter) {
/*  94 */     this.m_rule.debugPrint(this.m_token, this.m_seq, paramPrintWriter);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 103 */     if (this == paramObject)
/* 104 */       return true;
/* 105 */     if (!(paramObject instanceof Activation)) {
/* 106 */       return false;
/*     */     }
/*     */     
/* 109 */     Activation localActivation = (Activation)paramObject;
/* 110 */     if ((this.m_rule == localActivation.m_rule) && (this.m_token.dataEquals(localActivation.m_token))) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   boolean getAutoFocus()
/*     */   {
/* 117 */     return this.m_rule.getAutoFocus();
/*     */   }
/*     */   
/*     */   String getModule() {
/* 121 */     return this.m_rule.getModule();
/*     */   }
/*     */   
/*     */   void evalSalience(Rete paramRete) throws JessException {
/* 125 */     this.m_salience = this.m_rule.evalSalience(paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 135 */     localStringBuffer.append("[Activation: ");
/* 136 */     localStringBuffer.append(this.m_rule.getDisplayName());
/* 137 */     localStringBuffer.append(" ");
/* 138 */     localStringBuffer.append(this.m_token.factList());
/* 139 */     localStringBuffer.append(" ; time=");
/* 140 */     localStringBuffer.append(this.m_token.getTime());
/* 141 */     localStringBuffer.append(" ; salience=");
/* 142 */     localStringBuffer.append(getSalience());
/* 143 */     localStringBuffer.append("]");
/* 144 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Activation.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */