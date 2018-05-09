/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Vector;
/*     */ import wordnet.wn.DictionaryDatabase;
/*     */ import wordnet.wn.IndexWord;
/*     */ import wordnet.wn.POS;
/*     */ import wordnet.wn.Synset;
/*     */ 
/*     */ public class trywn
/*     */ {
/*  11 */   private static DictionaryDatabase dictionary = new wordnet.wn.FileBackedDictionary("C:\\WN16\\DICT");
/*     */   private static POS TYPE;
/*     */   private static wordnet.wn.PointerType POINTER;
/*     */   
/*     */   private static final boolean BFS_(Vector paramVector, Synset paramSynset, int paramInt)
/*     */   {
/*  17 */     if (!paramVector.isEmpty()) {
/*  18 */       Synset localSynset = (Synset)paramVector.remove(0);
/*  19 */       if (localSynset.equals(paramSynset)) return true;
/*  20 */       wordnet.wn.PointerTarget[] arrayOfPointerTarget = localSynset.getTargets(POINTER);
/*  21 */       if ((arrayOfPointerTarget != null) && (paramInt < 10)) {
/*  22 */         for (int i = 0; i < arrayOfPointerTarget.length; i++)
/*  23 */           paramVector.addElement(arrayOfPointerTarget[i]);
/*     */       }
/*  25 */       return BFS_(paramVector, paramSynset, paramInt + 1);
/*     */     }
/*  27 */     return false;
/*     */   }
/*     */   
/*     */   private static final boolean BFS(Synset[] paramArrayOfSynset1, Synset[] paramArrayOfSynset2) {
/*  31 */     Vector localVector = new Vector();
/*     */     
/*     */ 
/*  34 */     for (int i = 0; i < paramArrayOfSynset2.length; i++) {
/*  35 */       Synset localSynset = paramArrayOfSynset2[i];
/*     */       
/*  37 */       for (int j = 0; j < paramArrayOfSynset1.length; j++)
/*     */       {
/*  39 */         localVector.addElement(paramArrayOfSynset1[j]);
/*     */       }
/*  41 */       if (BFS_(localVector, localSynset, 0)) return true;
/*     */     }
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public static jess.Value IsLinkedJess(String paramString1, String paramString2, int paramInt) throws jess.JessException {
/*  47 */     switch (paramInt) {
/*     */     case 0: 
/*  49 */       TYPE = POS.NOUN;
/*  50 */       break;
/*     */     case 1: 
/*  52 */       TYPE = POS.VERB;
/*  53 */       break;
/*     */     case 2: 
/*  55 */       TYPE = POS.ADJ;
/*  56 */       break;
/*     */     case 3: 
/*  58 */       TYPE = POS.ADV;
/*  59 */       break;
/*     */     default: 
/*  61 */       throw new RuntimeException("Unknown type");
/*     */     }
/*  63 */     IndexWord localIndexWord1 = dictionary.lookupIndexWord(TYPE, paramString1);
/*  64 */     IndexWord localIndexWord2 = dictionary.lookupIndexWord(TYPE, paramString2);
/*  65 */     if ((localIndexWord2 == null) || (localIndexWord1 == null)) return new jess.Value("FALSE", 1);
/*  66 */     Synset[] arrayOfSynset1 = localIndexWord1.getSenses();
/*  67 */     Synset[] arrayOfSynset2 = localIndexWord2.getSenses();
/*     */     
/*  69 */     return new jess.Value(new Boolean(BFS(arrayOfSynset1, arrayOfSynset2)).toString().toUpperCase(), 1);
/*     */   }
/*     */   
/*     */   public static boolean IsLinkedJava(String paramString1, String paramString2, int paramInt) {
/*  73 */     switch (paramInt) {
/*     */     case 0: 
/*  75 */       TYPE = POS.NOUN;
/*  76 */       POINTER = wordnet.wn.PointerType.HYPONYM;
/*  77 */       break;
/*     */     case 1: 
/*  79 */       TYPE = POS.VERB;
/*  80 */       POINTER = wordnet.wn.PointerType.HYPONYM;
/*  81 */       break;
/*     */     case 2: 
/*  83 */       TYPE = POS.ADJ;
/*  84 */       POINTER = wordnet.wn.PointerType.SIMILAR_TO;
/*  85 */       break;
/*     */     case 3: 
/*  87 */       TYPE = POS.ADV;
/*  88 */       POINTER = wordnet.wn.PointerType.DERIVED;
/*  89 */       break;
/*     */     default: 
/*  91 */       throw new RuntimeException("Unknown type");
/*     */     }
/*     */     try
/*     */     {
/*  95 */       IndexWord localIndexWord1 = dictionary.lookupIndexWord(TYPE, paramString1);
/*  96 */       if (localIndexWord1 == null) return false;
/*  97 */       Synset[] arrayOfSynset1 = localIndexWord1.getSenses();
/*  98 */       IndexWord localIndexWord2 = dictionary.lookupIndexWord(TYPE, paramString2);
/*  99 */       if (localIndexWord2 == null) return false;
/* 100 */       Synset[] arrayOfSynset2 = localIndexWord2.getSenses();
/*     */       
/* 102 */       return BFS(arrayOfSynset1, arrayOfSynset2);
/*     */     }
/*     */     catch (RuntimeException localRuntimeException) {
/* 105 */       System.out.println("I dont know why this happens with " + paramString1 + " and " + paramString2 + " Error msg: " + localRuntimeException.getMessage()); }
/* 106 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/* 112 */     boolean bool = IsLinkedJava(paramArrayOfString[0], paramArrayOfString[1], Integer.parseInt(paramArrayOfString[2]));
/*     */     
/* 114 */     if (bool) System.out.println("TRUE"); else {
/* 115 */       System.out.println("FALSE");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\trywn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */