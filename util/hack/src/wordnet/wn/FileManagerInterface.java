package wordnet.wn;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public abstract interface FileManagerInterface
  extends Remote
{
  public abstract long getIndexedLinePointer(String paramString1, String paramString2)
    throws IOException, RemoteException;
  
  public abstract String readLineAt(String paramString, long paramLong)
    throws IOException, RemoteException;
  
  public abstract long getNextLinePointer(String paramString, long paramLong)
    throws IOException, RemoteException;
  
  public abstract long getMatchingLinePointer(String paramString1, long paramLong, String paramString2)
    throws IOException, RemoteException;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\FileManagerInterface.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */