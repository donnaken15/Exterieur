/*     */ package wordnet.wn;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Vector;
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
/*     */ public class Synset
/*     */   implements PointerTarget
/*     */ {
/*     */   protected FileBackedDictionary dictionary;
/*     */   protected POS pos;
/*     */   protected long offset;
/*     */   protected boolean isAdjectiveCluster;
/*     */   protected Word[] words;
/*     */   protected Pointer[] pointers;
/*     */   protected String gloss;
/*     */   
/*     */   Synset(FileBackedDictionary paramFileBackedDictionary)
/*     */   {
/*  41 */     this.dictionary = paramFileBackedDictionary;
/*     */   }
/*     */   
/*     */   Synset initializeFrom(String paramString) {
/*  45 */     TokenizerParser localTokenizerParser = new TokenizerParser(paramString, " ");
/*     */     
/*  47 */     this.offset = localTokenizerParser.nextLong();
/*  48 */     localTokenizerParser.nextToken();
/*  49 */     String str1 = localTokenizerParser.nextToken();
/*  50 */     this.isAdjectiveCluster = false;
/*  51 */     if (str1.equals("s")) {
/*  52 */       str1 = "a";
/*  53 */       this.isAdjectiveCluster = true;
/*     */     }
/*  55 */     this.pos = POS.lookup(str1);
/*     */     
/*  57 */     int i = localTokenizerParser.nextHexInt();
/*  58 */     this.words = new Word[i];
/*  59 */     int m; int n; int i1; for (int j = 0; j < i; j++) {
/*  60 */       String str2 = localTokenizerParser.nextToken();
/*  61 */       m = localTokenizerParser.nextHexInt();
/*  62 */       n = 0;
/*     */       
/*  64 */       if ((str2.charAt(str2.length() - 1) == ')') && (str2.indexOf('(') > 0)) {
/*  65 */         i1 = str2.indexOf('(');
/*  66 */         String str3 = str2.substring(i1 + 1, str2.length() - 1);
/*  67 */         str2 = str2.substring(0, i1 - 1);
/*  68 */         if (str3.equals("p")) {
/*  69 */           n |= 0x1;
/*  70 */         } else if (str3.equals("a")) {
/*  71 */           n |= 0x2;
/*  72 */         } else if (str3.equals("ip")) {
/*  73 */           n |= 0x4;
/*     */         } else {
/*  75 */           throw new RuntimeException("unknown syntactic marker " + str3);
/*     */         }
/*     */       }
/*  78 */       this.words[j] = new Word(this, j, str2.replace('_', ' '), n);
/*     */     }
/*     */     
/*  81 */     j = localTokenizerParser.nextInt();
/*  82 */     this.pointers = new Pointer[j];
/*  83 */     for (int k = 0; k < j; k++) {
/*  84 */       this.pointers[k] = Pointer.parsePointer(this.dictionary, this, k, localTokenizerParser);
/*     */     }
/*     */     
/*  87 */     if (this.pos == POS.VERB) {
/*  88 */       k = localTokenizerParser.nextInt();
/*  89 */       for (m = 0; m < k; m++) {
/*  90 */         localTokenizerParser.nextToken();
/*  91 */         n = localTokenizerParser.nextHexInt();
/*  92 */         i1 = localTokenizerParser.nextHexInt();
/*  93 */         if (i1 > 0) {
/*  94 */           this.words[(i1 - 1)].setVerbFrameFlag(n);
/*     */         } else {
/*  96 */           for (int i2 = 0; i2 < this.words.length; i2++) {
/*  97 */             this.words[i2].setVerbFrameFlag(n);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 103 */     this.gloss = null;
/* 104 */     k = paramString.indexOf('|');
/* 105 */     if (k > 0) {
/* 106 */       this.gloss = paramString.substring(k + 2).trim();
/*     */     }
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   static Synset parseSynset(FileBackedDictionary paramFileBackedDictionary, String paramString) {
/*     */     try {
/* 113 */       return new Synset(paramFileBackedDictionary).initializeFrom(paramString);
/*     */     }
/*     */     catch (RuntimeException localRuntimeException) {
/* 116 */       System.err.println("while parsing " + paramString);
/* 117 */       throw localRuntimeException;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 125 */     if (((paramObject instanceof Synset)) && (((Synset)paramObject).pos.equals(this.pos)) && (((Synset)paramObject).offset == this.offset)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return this.pos.hashCode() ^ (int)this.offset;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 135 */     return "[Synset " + this.offset + '@' + this.pos + ": \"" + getDescription() + "\"]";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public POS getPOS()
/*     */   {
/* 143 */     return this.pos;
/*     */   }
/*     */   
/*     */   public String getGloss() {
/* 147 */     return this.gloss;
/*     */   }
/*     */   
/*     */   public Word[] getWords() {
/* 151 */     return this.words;
/*     */   }
/*     */   
/*     */   public Word getWord(int paramInt) {
/* 155 */     return this.words[paramInt];
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 163 */     StringBuffer localStringBuffer = new StringBuffer();
/* 164 */     for (int i = 0; i < this.words.length; i++) {
/* 165 */       if (i > 0) {
/* 166 */         localStringBuffer.append(", ");
/*     */       }
/* 168 */       localStringBuffer.append(this.words[i].lemma);
/*     */     }
/* 170 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public String getLongDescription() {
/* 174 */     String str1 = getDescription();
/* 175 */     String str2 = getGloss();
/* 176 */     if (str2 != null) {
/* 177 */       str1 = str1 + " -- (" + str2 + ')';
/*     */     }
/* 179 */     return str1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected static PointerTarget[] collectTargets(Pointer[] paramArrayOfPointer)
/*     */   {
/* 187 */     PointerTarget[] arrayOfPointerTarget = new PointerTarget[paramArrayOfPointer.length];
/* 188 */     for (int i = 0; i < paramArrayOfPointer.length; i++) {
/* 189 */       arrayOfPointerTarget[i] = paramArrayOfPointer[i].getTarget();
/*     */     }
/* 191 */     return arrayOfPointerTarget;
/*     */   }
/*     */   
/*     */   public Pointer[] getPointers() {
/* 195 */     return this.pointers;
/*     */   }
/*     */   
/*     */   public Pointer[] getPointers(PointerType paramPointerType) {
/* 199 */     Vector localVector = new Vector(this.pointers.length);
/* 200 */     for (int i = 0; i < this.pointers.length; i++) {
/* 201 */       Pointer localPointer = this.pointers[i];
/* 202 */       if (localPointer.getType().equals(paramPointerType)) {
/* 203 */         localVector.addElement(localPointer);
/*     */       }
/*     */     }
/* 206 */     Pointer[] arrayOfPointer = new Pointer[localVector.size()];
/* 207 */     localVector.copyInto(arrayOfPointer);
/* 208 */     return arrayOfPointer;
/*     */   }
/*     */   
/*     */   public PointerTarget[] getTargets() {
/* 212 */     return collectTargets(getPointers());
/*     */   }
/*     */   
/*     */   public PointerTarget[] getTargets(PointerType paramPointerType) {
/* 216 */     return collectTargets(getPointers(paramPointerType));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\Synset.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */