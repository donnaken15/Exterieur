/*     */ package wordnet.wn;
/*     */ 
/*     */ import java.util.NoSuchElementException;
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
/*     */ public class PointerType
/*     */ {
/*     */   protected static final int N = 1;
/*     */   protected static final int V = 2;
/*     */   protected static final int ADJ = 4;
/*     */   protected static final int ADV = 8;
/*     */   protected static final int LEXICAL = 16;
/*  29 */   protected static final POS[] CATS = { POS.NOUN, POS.VERB, POS.ADJ, POS.ADV };
/*  30 */   protected static final int[] POS_MASK = { 1, 2, 4, 8 };
/*     */   
/*     */ 
/*  33 */   public static final PointerType ANTONYM = new PointerType("antonym", "!", 31);
/*     */   
/*     */ 
/*  36 */   public static final PointerType HYPERNYM = new PointerType("hypernym", "@", 3);
/*  37 */   public static final PointerType HYPONYM = new PointerType("hyponym", "~", 3);
/*     */   
/*     */ 
/*  40 */   public static final PointerType ATTRIBUTE = new PointerType("attribute", "=", 5);
/*  41 */   public static final PointerType SEE_ALSO = new PointerType("also see", "^", 21);
/*     */   
/*     */ 
/*  44 */   public static final PointerType ENTAILMENT = new PointerType("entailment", "*", 2);
/*  45 */   public static final PointerType CAUSE = new PointerType("cause", ">", 2);
/*  46 */   public static final PointerType VERB_GROUP = new PointerType("verb group", "$", 2);
/*     */   
/*     */ 
/*  49 */   public static final PointerType MEMBER_MERONYM = new PointerType("member meronym", "#m", 1);
/*  50 */   public static final PointerType SUBSTANCE_MERONYM = new PointerType("substance meronym", "#s", 1);
/*  51 */   public static final PointerType PART_MERONYM = new PointerType("part meronym", "#p", 1);
/*  52 */   public static final PointerType MEMBER_HOLONYM = new PointerType("member holonym", "%m", 1);
/*  53 */   public static final PointerType SUBSTANCE_HOLONYM = new PointerType("substance holonym", "%s", 1);
/*  54 */   public static final PointerType PART_HOLONYM = new PointerType("part holonym", "%p", 1);
/*     */   
/*     */ 
/*  57 */   public static final PointerType SIMILAR_TO = new PointerType("similar", "&", 4);
/*  58 */   public static final PointerType PARTICIPLE_OF = new PointerType("participle of", "<", 20);
/*  59 */   public static final PointerType PERTAINYM = new PointerType("pertainym", "\\", 20);
/*     */   
/*     */ 
/*  62 */   public static final PointerType DERIVED = new PointerType("derived from", "\\", 8);
/*     */   
/*     */ 
/*  65 */   public static final PointerType[] TYPES = { ANTONYM, HYPERNYM, HYPONYM, ATTRIBUTE, SEE_ALSO, ENTAILMENT, CAUSE, VERB_GROUP, MEMBER_MERONYM, SUBSTANCE_MERONYM, PART_MERONYM, MEMBER_HOLONYM, SUBSTANCE_HOLONYM, PART_HOLONYM, SIMILAR_TO, PARTICIPLE_OF, PERTAINYM, DERIVED };
/*     */   protected String label;
/*     */   protected String key;
/*     */   protected int flags;
/*     */   protected PointerType symmetricType;
/*     */   
/*     */   protected static void setSymmetric(PointerType paramPointerType1, PointerType paramPointerType2) {
/*  72 */     paramPointerType1.symmetricType = paramPointerType2;
/*  73 */     paramPointerType2.symmetricType = paramPointerType1;
/*     */   }
/*     */   
/*     */   static {
/*  77 */     setSymmetric(ANTONYM, ANTONYM);
/*  78 */     setSymmetric(HYPERNYM, HYPONYM);
/*  79 */     setSymmetric(MEMBER_MERONYM, MEMBER_HOLONYM);
/*  80 */     setSymmetric(SUBSTANCE_MERONYM, SUBSTANCE_HOLONYM);
/*  81 */     setSymmetric(PART_MERONYM, PART_HOLONYM);
/*  82 */     setSymmetric(SIMILAR_TO, SIMILAR_TO);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   static PointerType parseKey(String paramString)
/*     */   {
/*  89 */     for (int i = 0; i < TYPES.length; i++) {
/*  90 */       PointerType localPointerType = TYPES[i];
/*  91 */       if (localPointerType.key.equals(paramString)) {
/*  92 */         return localPointerType;
/*     */       }
/*     */     }
/*  95 */     throw new NoSuchElementException("unknown link type " + paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected PointerType(String paramString1, String paramString2, int paramInt)
/*     */   {
/* 107 */     this.label = paramString1;
/* 108 */     this.key = paramString2;
/* 109 */     this.flags = paramInt;
/*     */   }
/*     */   
/*     */   public String getLabel() {
/* 113 */     return this.label;
/*     */   }
/*     */   
/*     */   public boolean appliesTo(POS paramPOS) {
/* 117 */     if ((this.flags & POS_MASK[wordnet.util.ArrayUtilities.indexOf(CATS, paramPOS)]) != 0) 0; return true;
/*     */   }
/*     */   
/*     */   public boolean symmetricTo(PointerType paramPointerType) {
/* 121 */     if ((this.symmetricType != null) && (this.symmetricType.equals(paramPointerType))) 0; return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\PointerType.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */