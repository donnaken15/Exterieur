package jess;

public abstract interface NodeSink
{
  public abstract String listNodes();
  
  public abstract void addNode(Node paramNode)
    throws JessException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\NodeSink.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */