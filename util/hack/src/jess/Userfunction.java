package jess;

public abstract interface Userfunction
{
  public abstract String getName();
  
  public abstract Value call(ValueVector paramValueVector, Context paramContext)
    throws JessException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Userfunction.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */