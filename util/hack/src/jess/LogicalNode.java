package jess;

import java.util.Map;

abstract interface LogicalNode
{
  public abstract void dependsOn(Fact paramFact, Token paramToken);
  
  public abstract int getTokenSize();
  
  public abstract Map getLogicalDependencies();
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\LogicalNode.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */