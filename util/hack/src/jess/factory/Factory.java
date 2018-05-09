package jess.factory;

import jess.Fact;
import jess.JessException;
import jess.Token;

public abstract interface Factory
{
  public abstract Token newToken(Fact paramFact, int paramInt)
    throws JessException;
  
  public abstract Token newToken(Token paramToken, Fact paramFact)
    throws JessException;
  
  public abstract Token newToken(Token paramToken1, Token paramToken2)
    throws JessException;
  
  public abstract Token newToken(Token paramToken)
    throws JessException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\factory\Factory.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */