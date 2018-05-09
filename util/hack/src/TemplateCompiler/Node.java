package TemplateCompiler;

public abstract interface Node
{
  public abstract void jjtOpen();
  
  public abstract void jjtClose();
  
  public abstract void jjtSetParent(Node paramNode);
  
  public abstract Node jjtGetParent();
  
  public abstract void jjtAddChild(Node paramNode, int paramInt);
  
  public abstract Node jjtGetChild(int paramInt);
  
  public abstract int jjtGetNumChildren();
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\Node.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */