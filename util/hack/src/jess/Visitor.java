package jess;

public abstract interface Visitor
{
  public abstract Object visitDeffacts(Deffacts paramDeffacts);
  
  public abstract Object visitDeftemplate(Deftemplate paramDeftemplate);
  
  public abstract Object visitDeffunction(Deffunction paramDeffunction);
  
  public abstract Object visitDefglobal(Defglobal paramDefglobal);
  
  public abstract Object visitDefrule(Defrule paramDefrule);
  
  public abstract Object visitDefquery(Defquery paramDefquery);
  
  public abstract Object visitPattern(Pattern paramPattern);
  
  public abstract Object visitGroup(Group paramGroup);
  
  public abstract Object visitTest1(Test1 paramTest1);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Visitor.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */