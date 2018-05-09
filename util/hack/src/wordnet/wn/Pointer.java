/*     */ package wordnet.wn;
/*     */ 
/*     */ 
/*     */ public class Pointer
/*     */ {
/*     */   protected FileBackedDictionary dictionary;
/*     */   
/*     */   protected Synset synset;
/*     */   
/*     */   protected int index;
/*     */   
/*     */   protected PointerType pointerType;
/*     */   
/*     */   protected PointerTarget source;
/*     */   
/*     */   protected TargetIndex targetIndex;
/*     */   
/*     */ 
/*     */   protected class TargetIndex
/*     */   {
/*     */     POS pos;
/*     */     
/*     */     long offset;
/*     */     
/*     */     int index;
/*     */     
/*     */     TargetIndex(POS paramPOS, long paramLong, int paramInt)
/*     */     {
/*  29 */       this.pos = paramPOS;
/*  30 */       this.offset = paramLong;
/*  31 */       this.index = paramInt;
/*     */     }
/*     */   }
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
/*     */   Pointer(FileBackedDictionary paramFileBackedDictionary, Synset paramSynset, int paramInt)
/*     */   {
/*  58 */     this.dictionary = paramFileBackedDictionary;
/*  59 */     this.synset = paramSynset;
/*  60 */     this.index = paramInt;
/*     */   }
/*     */   
/*     */   Pointer initializeFrom(TokenizerParser paramTokenizerParser) {
/*  64 */     this.pointerType = PointerType.parseKey(paramTokenizerParser.nextToken());
/*  65 */     long l = paramTokenizerParser.nextLong();
/*  66 */     POS localPOS = POS.lookup(paramTokenizerParser.nextToken());
/*  67 */     int i = paramTokenizerParser.nextHexInt();
/*  68 */     int j = i / 256;
/*  69 */     int k = i & 0xFF;
/*     */     
/*     */ 
/*  72 */     this.source = resolveTarget(this.synset, localPOS, j);
/*  73 */     this.targetIndex = new TargetIndex(localPOS, l, k);
/*  74 */     return this;
/*     */   }
/*     */   
/*     */   static Pointer parsePointer(FileBackedDictionary paramFileBackedDictionary, Synset paramSynset, int paramInt, TokenizerParser paramTokenizerParser) {
/*  78 */     return new Pointer(paramFileBackedDictionary, paramSynset, paramInt).initializeFrom(paramTokenizerParser);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  86 */     if (((paramObject instanceof Pointer)) && (((Pointer)paramObject).source.equals(this.source)) && (((Pointer)paramObject).index == this.index)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.source.hashCode() + this.index;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  96 */     return "[Link #" + this.index + " from " + this.source + ']';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public PointerType getType()
/*     */   {
/* 103 */     return this.pointerType;
/*     */   }
/*     */   
/*     */   public boolean isLexical() {
/* 107 */     return this.source instanceof Word;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected PointerTarget resolveTarget(Synset paramSynset, POS paramPOS, long paramLong)
/*     */   {
/* 117 */     if (paramLong < 100L) {
/* 118 */       if (paramLong == 0L) return paramSynset;
/* 119 */       return paramSynset.getWord((int)paramLong - 1);
/*     */     }
/* 121 */     return this.dictionary.getSynsetAt(paramPOS, paramLong);
/*     */   }
/*     */   
/*     */   public PointerTarget getSource()
/*     */   {
/* 126 */     return this.source;
/*     */   }
/*     */   
/*     */   public PointerTarget getTarget() {
/* 130 */     return resolveTarget(this.synset, this.targetIndex.pos, this.targetIndex.offset);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\Pointer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */