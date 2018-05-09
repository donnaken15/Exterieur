package wordnet.wn;

public abstract interface PointerTarget
{
  public abstract POS getPOS();
  
  public abstract String getDescription();
  
  public abstract String getLongDescription();
  
  public abstract Pointer[] getPointers();
  
  public abstract Pointer[] getPointers(PointerType paramPointerType);
  
  public abstract PointerTarget[] getTargets();
  
  public abstract PointerTarget[] getTargets(PointerType paramPointerType);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\PointerTarget.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */