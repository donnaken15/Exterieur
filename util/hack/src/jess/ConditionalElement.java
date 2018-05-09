package jess;

import java.io.Serializable;

public abstract interface ConditionalElement
  extends Serializable
{
  public abstract String getName();
  
  public abstract String getBoundName();
  
  public abstract int getGroupSize();
  
  public abstract boolean isGroup();
  
  public abstract ConditionalElement getConditionalElement(int paramInt);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ConditionalElement.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */