/*     */ package wordnet.wn;
/*     */ 
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
/*     */ public class Word
/*     */   implements PointerTarget
/*     */ {
/*     */   public static final int NONE = 0;
/*     */   public static final int PREDICATIVE = 1;
/*     */   public static final int ATTRIBUTIVE = 2;
/*     */   public static final int IMMEDIATE_POSTNOMINAL = 4;
/*     */   protected Synset synset;
/*     */   protected int index;
/*     */   protected String lemma;
/*     */   protected int flags;
/*     */   protected long verbFrameFlags;
/*     */   
/*     */   public Word(Synset paramSynset, int paramInt1, String paramString, int paramInt2)
/*     */   {
/*  40 */     this.synset = paramSynset;
/*  41 */     this.index = paramInt1;
/*  42 */     this.lemma = paramString;
/*  43 */     this.flags = paramInt2;
/*     */   }
/*     */   
/*     */   void setVerbFrameFlag(int paramInt) {
/*  47 */     this.verbFrameFlags |= 1 << paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  55 */     if (((paramObject instanceof Word)) && (((Word)paramObject).synset.equals(this.synset)) && (((Word)paramObject).index == this.index)) 0; return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  61 */     return this.synset.hashCode() ^ this.index;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  65 */     return "[Word " + this.synset.offset + '@' + this.synset.pos + '(' + this.index + "): \"" + getLemma() + "\"]";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Synset getSynset()
/*     */   {
/*  74 */     return this.synset;
/*     */   }
/*     */   
/*     */   public POS getPOS() {
/*  78 */     return this.synset.getPOS();
/*     */   }
/*     */   
/*     */   public int getIndex() {
/*  82 */     return this.index;
/*     */   }
/*     */   
/*     */   public String getLemma() {
/*  86 */     return this.lemma;
/*     */   }
/*     */   
/*     */   public long getFlags() {
/*  90 */     return this.flags;
/*     */   }
/*     */   
/*     */   public long getVerbFrameFlags() {
/*  94 */     return this.verbFrameFlags;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  98 */     return this.lemma;
/*     */   }
/*     */   
/*     */   public String getLongDescription() {
/* 102 */     String str1 = getDescription();
/* 103 */     String str2 = this.synset.getGloss();
/* 104 */     if (str2 != null) {
/* 105 */       str1 = str1 + " -- (" + str2 + ')';
/*     */     }
/* 107 */     return str1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected Pointer[] restrictPointers(Pointer[] paramArrayOfPointer)
/*     */   {
/* 116 */     Vector localVector = new Vector(paramArrayOfPointer.length);
/* 117 */     for (int i = 0; i < paramArrayOfPointer.length; i++) {
/* 118 */       Pointer localPointer = paramArrayOfPointer[i];
/* 119 */       if (localPointer.getSource() == this) {
/* 120 */         localVector.addElement(localPointer);
/*     */       }
/*     */     }
/* 123 */     Pointer[] arrayOfPointer = new Pointer[localVector.size()];
/* 124 */     localVector.copyInto(arrayOfPointer);
/* 125 */     return arrayOfPointer;
/*     */   }
/*     */   
/*     */   public Pointer[] getPointers() {
/* 129 */     return restrictPointers(this.synset.getPointers());
/*     */   }
/*     */   
/*     */   public Pointer[] getPointers(PointerType paramPointerType) {
/* 133 */     return restrictPointers(this.synset.getPointers(paramPointerType));
/*     */   }
/*     */   
/*     */   public PointerTarget[] getTargets() {
/* 137 */     return Synset.collectTargets(getPointers());
/*     */   }
/*     */   
/*     */   public PointerTarget[] getTargets(PointerType paramPointerType) {
/* 141 */     return Synset.collectTargets(getPointers(paramPointerType));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\Word.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */