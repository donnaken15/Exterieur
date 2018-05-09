/*    */ package jess.factory;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import jess.Fact;
/*    */ import jess.JessException;
/*    */ import jess.Token;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FactoryImpl
/*    */   implements Factory, Serializable
/*    */ {
/*    */   public Token newToken(Fact paramFact, int paramInt)
/*    */     throws JessException
/*    */   {
/* 20 */     return new Token(paramFact, paramInt);
/*    */   }
/*    */   
/*    */   public Token newToken(Token paramToken, Fact paramFact) throws JessException
/*    */   {
/* 25 */     return new Token(paramToken, paramFact);
/*    */   }
/*    */   
/*    */   public Token newToken(Token paramToken1, Token paramToken2) throws JessException
/*    */   {
/* 30 */     return new Token(paramToken1, paramToken2);
/*    */   }
/*    */   
/*    */   public Token newToken(Token paramToken) throws JessException
/*    */   {
/* 35 */     return new Token(paramToken);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\factory\FactoryImpl.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */