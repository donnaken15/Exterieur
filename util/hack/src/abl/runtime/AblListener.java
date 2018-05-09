package abl.runtime;

import java.util.EventListener;

public abstract interface AblListener
  extends EventListener
{
  public abstract void eventHappened(AblEvent paramAblEvent);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AblListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */