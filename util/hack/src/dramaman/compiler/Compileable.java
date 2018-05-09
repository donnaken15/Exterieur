package dramaman.compiler;

import jd.JavaCodeDescriptor;

public abstract interface Compileable
{
  public abstract JavaCodeDescriptor compileToJava()
    throws CompileException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\Compileable.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */