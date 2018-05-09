package wordnet.wn;

import java.util.Enumeration;

public abstract interface DictionaryDatabase
{
  public abstract IndexWord lookupIndexWord(POS paramPOS, String paramString);
  
  public abstract String lookupBaseForm(POS paramPOS, String paramString);
  
  public abstract Enumeration searchIndexWords(POS paramPOS, String paramString);
  
  public abstract Enumeration synsets(POS paramPOS);
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\DictionaryDatabase.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */