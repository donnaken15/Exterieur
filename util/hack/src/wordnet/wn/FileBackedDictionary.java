/*     */ package wordnet.wn;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.util.Enumeration;
/*     */ import wordnet.util.ArrayUtilities;
/*     */ import wordnet.util.Cache;
/*     */ import wordnet.util.LRUCache;
/*     */ import wordnet.util.LookaheadEnumeration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FileBackedDictionary
/*     */   implements DictionaryDatabase
/*     */ {
/*     */   public FileBackedDictionary(FileManagerInterface paramFileManagerInterface)
/*     */   {
/*  42 */     jdMethod_this();
/*  43 */     this.db = paramFileManagerInterface;
/*     */   }
/*     */   
/*     */ 
/*     */   public FileBackedDictionary()
/*     */   {
/*  49 */     this(new FileManager());
/*     */   }
/*     */   
/*     */   public FileBackedDictionary(String paramString)
/*     */   {
/*  54 */     this(new FileManager(paramString));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final void jdMethod_this()
/*     */   {
/*  61 */     this.DEFAULT_CACHE_CAPACITY = 1000;
/*  62 */     this.entityCache = new LRUCache(1000);
/*     */   }
/*     */   
/*     */   protected class DatabaseKey {
/*     */     POS pos;
/*     */     Object key;
/*     */     
/*  69 */     DatabaseKey(POS paramPOS, Object paramObject) { this.pos = paramPOS;
/*  70 */       this.key = paramObject;
/*     */     }
/*     */     
/*     */     public boolean equals(Object paramObject) {
/*  74 */       if (((paramObject instanceof DatabaseKey)) && (((DatabaseKey)paramObject).pos.equals(this.pos)) && (((DatabaseKey)paramObject).key.equals(this.key))) 0; return true;
/*     */     }
/*     */     
/*     */ 
/*     */     public int hashCode()
/*     */     {
/*  80 */       return this.pos.hashCode() ^ this.key.hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void setEntityCache(Cache paramCache)
/*     */   {
/*  87 */     if (this.entityCache != paramCache) {
/*  88 */       this.entityCache.clear();
/*  89 */       this.entityCache = paramCache;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */   protected static final POS[] POS_KEYS = { POS.NOUN, POS.VERB, POS.ADJ, POS.ADV };
/*  98 */   protected static final String[] POS_FILENAME_ROOTS = { "noun", "verb", "adj", "adv" };
/*     */   protected final FileManagerInterface db;
/*     */   
/* 101 */   protected static String getDatabaseSuffixName(POS paramPOS) { int i = ArrayUtilities.indexOf(POS_KEYS, paramPOS);
/* 102 */     return POS_FILENAME_ROOTS[i];
/*     */   }
/*     */   
/*     */   protected static String getDataFilename(POS paramPOS) {
/* 106 */     return "data." + getDatabaseSuffixName(paramPOS);
/*     */   }
/*     */   
/*     */   protected static String getIndexFilename(POS paramPOS) {
/* 110 */     return "index." + getDatabaseSuffixName(paramPOS);
/*     */   }
/*     */   
/*     */   protected static String getExceptionsFilename(POS paramPOS) {
/* 114 */     return getDatabaseSuffixName(paramPOS) + ".exc";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected IndexWord getIndexWordAt(POS paramPOS, long paramLong)
/*     */   {
/* 122 */     DatabaseKey localDatabaseKey = new DatabaseKey(paramPOS, new Long(paramLong));
/* 123 */     IndexWord localIndexWord = (IndexWord)this.entityCache.get(localDatabaseKey);
/*     */     
/* 125 */     if (localIndexWord == null) {
/* 126 */       String str1 = getIndexFilename(paramPOS);
/*     */       String str2;
/*     */       try {
/* 129 */         str2 = this.db.readLineAt(str1, paramLong);
/*     */       }
/*     */       catch (IOException localIOException) {
/* 132 */         throw new RuntimeException(localIOException.toString());
/*     */       }
/* 134 */       localIndexWord = IndexWord.parseIndexWord(this, str2);
/* 135 */       this.entityCache.put(localDatabaseKey, localIndexWord);
/*     */     }
/* 137 */     return localIndexWord;
/*     */   }
/*     */   
/*     */ 
/*     */   protected Synset getSynsetAt(POS paramPOS, long paramLong, String paramString)
/*     */   {
/* 143 */     DatabaseKey localDatabaseKey = new DatabaseKey(paramPOS, new Long(paramLong));
/* 144 */     Synset localSynset = (Synset)this.entityCache.get(localDatabaseKey);
/* 145 */     if (localSynset == null) {
/* 146 */       if (paramString == null) {
/* 147 */         String str = getDataFilename(paramPOS);
/*     */         try {
/* 149 */           paramString = this.db.readLineAt(str, paramLong);
/*     */         } catch (IOException localIOException) {
/* 151 */           throw new RuntimeException(localIOException.toString());
/*     */         }
/*     */       }
/* 154 */       localSynset = Synset.parseSynset(this, paramString);
/* 155 */       this.entityCache.put(localDatabaseKey, localSynset);
/*     */     }
/* 157 */     return localSynset;
/*     */   }
/*     */   
/*     */   public Synset getSynsetAt(POS paramPOS, long paramLong) {
/* 161 */     return getSynsetAt(paramPOS, paramLong, null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IndexWord lookupIndexWord(POS paramPOS, String paramString)
/*     */   {
/* 170 */     DatabaseKey localDatabaseKey = new DatabaseKey(paramPOS, paramString);
/* 171 */     IndexWord localIndexWord = (IndexWord)this.entityCache.get(localDatabaseKey);
/* 172 */     if (localIndexWord == null) {
/* 173 */       String str = getIndexFilename(paramPOS);
/*     */       long l;
/*     */       try {
/* 176 */         l = this.db.getIndexedLinePointer(str, paramString.toLowerCase().replace(' ', '_'));
/*     */       }
/*     */       catch (IOException localIOException) {
/* 179 */         throw new RuntimeException(localIOException.toString());
/*     */       }
/* 181 */       if (l >= 0L) {
/* 182 */         localIndexWord = getIndexWordAt(paramPOS, l);
/*     */       }
/* 184 */       if (localIndexWord != null) {
/* 185 */         this.entityCache.put(localDatabaseKey, localIndexWord);
/*     */       }
/*     */     }
/* 188 */     return localIndexWord;
/*     */   }
/*     */   
/*     */   public String lookupBaseForm(POS paramPOS, String paramString) {
/* 192 */     String str1 = getExceptionsFilename(paramPOS);
/*     */     try {
/* 194 */       long l = this.db.getIndexedLinePointer(str1, paramString.toLowerCase());
/* 195 */       if (l >= 0L) {
/* 196 */         String str2 = this.db.readLineAt(str1, l);
/* 197 */         return str2.substring(str2.indexOf(' ') + 1);
/*     */       }
/*     */     } catch (IOException localIOException) {
/* 200 */       throw new RuntimeException(localIOException.toString());
/*     */     }
/* 202 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration searchIndexWords(POS paramPOS, String paramString)
/*     */   {
/* 210 */     return new LookaheadEnumeration(new FileBackedDictionary.1(this, paramPOS, paramString));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected final int DEFAULT_CACHE_CAPACITY = 1000;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected Cache entityCache;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration synsets(POS paramPOS)
/*     */   {
/* 236 */     return new LookaheadEnumeration(new FileBackedDictionary.2(this, paramPOS));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\FileBackedDictionary.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */