/*     */ package wordnet.wn;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IndexWord
/*     */ {
/*     */   protected FileBackedDictionary dictionary;
/*     */   
/*     */ 
/*     */ 
/*     */   protected POS pos;
/*     */   
/*     */ 
/*     */   protected long offset;
/*     */   
/*     */ 
/*     */   protected String lemma;
/*     */   
/*     */ 
/*     */   protected int taggedSenseCount;
/*     */   
/*     */ 
/*     */   protected long[] synsetOffsets;
/*     */   
/*     */ 
/*     */   protected Synset[] synsets;
/*     */   
/*     */ 
/*     */ 
/*     */   IndexWord(FileBackedDictionary paramFileBackedDictionary)
/*     */   {
/*  33 */     this.dictionary = paramFileBackedDictionary;
/*     */   }
/*     */   
/*     */   IndexWord initializeFrom(String paramString) {
/*  37 */     TokenizerParser localTokenizerParser = new TokenizerParser(paramString, " ");
/*  38 */     this.lemma = localTokenizerParser.nextToken().replace('_', ' ');
/*  39 */     this.pos = POS.lookup(localTokenizerParser.nextToken());
/*     */     
/*  41 */     localTokenizerParser.nextToken();
/*  42 */     int i = localTokenizerParser.nextInt();
/*  43 */     for (int j = 0; j < i; j++) {
/*  44 */       localTokenizerParser.nextToken();
/*     */     }
/*     */     
/*  47 */     j = localTokenizerParser.nextInt();
/*  48 */     this.taggedSenseCount = localTokenizerParser.nextInt();
/*  49 */     this.synsetOffsets = new long[j];
/*  50 */     for (int k = 0; k < j; k++) {
/*  51 */       this.synsetOffsets[k] = localTokenizerParser.nextLong();
/*     */     }
/*     */     
/*  54 */     return this;
/*     */   }
/*     */   
/*     */   static IndexWord parseIndexWord(FileBackedDictionary paramFileBackedDictionary, String paramString) {
/*     */     try {
/*  59 */       return new IndexWord(paramFileBackedDictionary).initializeFrom(paramString);
/*     */     }
/*     */     catch (RuntimeException localRuntimeException) {
/*  62 */       throw localRuntimeException;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  71 */     if (((paramObject instanceof IndexWord)) && (((IndexWord)paramObject).pos.equals(this.pos)) && (((IndexWord)paramObject).offset == this.offset)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  77 */     return this.pos.hashCode() ^ (int)this.offset;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  81 */     return "[IndexWord " + this.offset + '@' + this.pos.getLabel() + ": \"" + this.lemma + "\"]";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public POS getPOS()
/*     */   {
/*  88 */     return this.pos;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getLemma()
/*     */   {
/*  95 */     return this.lemma;
/*     */   }
/*     */   
/*     */   public int getTaggedSenseCount() {
/*  99 */     return this.taggedSenseCount;
/*     */   }
/*     */   
/*     */   public Synset[] getSenses() {
/* 103 */     if (this.synsets == null) {
/* 104 */       this.synsets = new Synset[this.synsetOffsets.length];
/* 105 */       for (int i = 0; i < this.synsetOffsets.length; i++) {
/* 106 */         this.synsets[i] = this.dictionary.getSynsetAt(this.pos, this.synsetOffsets[i]);
/*     */       }
/*     */     }
/* 109 */     return this.synsets;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\IndexWord.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */