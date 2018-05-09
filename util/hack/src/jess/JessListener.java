package jess;

import java.util.EventListener;

public abstract interface JessListener
  extends EventListener
{
  public abstract void eventHappened(JessEvent paramJessEvent)
    throws JessException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessListener.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */