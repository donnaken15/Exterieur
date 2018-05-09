package jess;

import java.util.Map;

abstract interface LHSComponent
  extends Cloneable
{
  public abstract void setBoundName(String paramString)
    throws JessException;
  
  public abstract void setNegated();
  
  public abstract void setExplicit();
  
  public abstract void setLogical();
  
  public abstract boolean getLogical();
  
  public abstract boolean getNegated();
  
  public abstract LHSComponent canonicalize()
    throws JessException;
  
  public abstract boolean getBackwardChaining();
  
  public abstract void addToGroup(Group paramGroup)
    throws JessException;
  
  public abstract void addDirectlyMatchedVariables(Map paramMap)
    throws JessException;
  
  public abstract void renameUnmentionedVariables(Map paramMap1, Map paramMap2, int paramInt, HasLHS paramHasLHS)
    throws JessException;
  
  public abstract boolean isBackwardChainingTrigger();
  
  public abstract int getPatternCount();
  
  public abstract Object clone();
  
  public abstract String getName();
  
  public abstract String getBoundName();
  
  public abstract int getGroupSize();
  
  public abstract LHSComponent getLHSComponent(int paramInt);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\LHSComponent.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */