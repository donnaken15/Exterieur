package TemplateCompiler;

import java.util.HashSet;
import java.util.List;

abstract interface PatternProducingNode
  extends Node
{
  public abstract String getRuleName();
  
  public abstract String getPatternHead();
  
  public abstract String getPatternToMatch(int paramInt);
  
  public abstract HashSet getPatternBindingVariables();
  
  public abstract List getPatternBindingVariablesCanonical();
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\PatternProducingNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */