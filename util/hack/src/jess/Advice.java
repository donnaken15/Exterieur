package jess;

import java.io.Serializable;

abstract interface Advice
  extends Userfunction, Serializable
{
  public abstract Userfunction getFunction();
  
  public abstract void addAction(Value paramValue);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Advice.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */