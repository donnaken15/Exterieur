package abl.runtime;

import javax.swing.tree.MutableTreeNode;

abstract interface DebuggableABTNode
{
  public abstract int getNestLevel();
  
  public abstract MutableTreeNode getTree();
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\DebuggableABTNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */