package jess;

public abstract interface TestBase
{
  public static final int EQ = 0;
  public static final int NEQ = 1;
  
  public abstract boolean doTest(Context paramContext)
    throws JessException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\TestBase.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */