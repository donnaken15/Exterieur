/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.HashSet;
/*     */ import java.util.Vector;
/*     */ import wordnet.wn.POS;
/*     */ import wordnet.wn.Synset;
/*     */ 
/*     */ public class WordNet
/*     */ {
/*  10 */   private static wordnet.wn.DictionaryDatabase dictionary = new wordnet.wn.FileBackedDictionary("C:\\WN16\\DICT");
/*     */   private static POS TYPE;
/*     */   private static wordnet.wn.PointerType POINTER;
/*  13 */   private static java.util.Hashtable WordToSynsets = new java.util.Hashtable();
/*     */   
/*     */   public static void readHashSynsets(String paramString)
/*     */     throws java.io.IOException
/*     */   {
/*  18 */     java.io.ObjectInputStream localObjectInputStream = new java.io.ObjectInputStream(new java.io.FileInputStream(paramString));
/*     */     try {
/*  20 */       WordToSynsets = (java.util.Hashtable)localObjectInputStream.readObject();
/*     */     }
/*     */     catch (Exception localException) {
/*  23 */       throw new java.io.IOException(localException.getMessage());
/*     */     }
/*     */     
/*  26 */     localObjectInputStream.close();
/*     */   }
/*     */   
/*     */   public static void dumpHashSynsets(String paramString) throws java.io.IOException
/*     */   {
/*  31 */     java.io.ObjectOutputStream localObjectOutputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(paramString));
/*  32 */     localObjectOutputStream.writeObject(WordToSynsets);
/*  33 */     localObjectOutputStream.flush();
/*     */   }
/*     */   
/*     */   private static final void BFS_(Vector paramVector, int paramInt, HashSet paramHashSet) {
/*  37 */     Vector localVector = new Vector();
/*  38 */     while (!paramVector.isEmpty()) {
/*  39 */       Synset localSynset = (Synset)paramVector.remove(0);
/*  40 */       if (!paramHashSet.contains(new Integer(localSynset.hashCode()))) {
/*  41 */         paramHashSet.add(new Integer(localSynset.hashCode()));
/*  42 */         wordnet.wn.PointerTarget[] arrayOfPointerTarget = localSynset.getTargets(POINTER);
/*  43 */         if ((arrayOfPointerTarget != null) && (paramInt < 10)) {
/*  44 */           for (int i = 0; i < arrayOfPointerTarget.length; i++)
/*  45 */             localVector.addElement(arrayOfPointerTarget[i]);
/*     */         }
/*  47 */         BFS_(localVector, paramInt + 1, paramHashSet);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void BFS(Synset[] paramArrayOfSynset, HashSet paramHashSet) {
/*  53 */     Vector localVector = new Vector();
/*     */     
/*     */ 
/*  56 */     for (int i = 0; i < paramArrayOfSynset.length; i++) {
/*  57 */       localVector.addElement(paramArrayOfSynset[i]);
/*     */     }
/*  59 */     BFS_(localVector, 0, paramHashSet);
/*     */   }
/*     */   
/*     */   public static void BuildSynsetHashtable(String paramString, int paramInt)
/*     */   {
/*  64 */     if (WordToSynsets.containsKey(paramString + paramInt)) {
/*  65 */       return;
/*     */     }
/*     */     
/*     */ 
/*  69 */     switch (paramInt) {
/*     */     case 0: 
/*  71 */       TYPE = POS.NOUN;
/*  72 */       POINTER = wordnet.wn.PointerType.HYPONYM;
/*  73 */       break;
/*     */     case 1: 
/*  75 */       TYPE = POS.VERB;
/*  76 */       POINTER = wordnet.wn.PointerType.HYPONYM;
/*  77 */       break;
/*     */     case 2: 
/*  79 */       TYPE = POS.ADJ;
/*  80 */       POINTER = wordnet.wn.PointerType.SIMILAR_TO;
/*  81 */       break;
/*     */     case 3: 
/*  83 */       TYPE = POS.ADV;
/*  84 */       POINTER = wordnet.wn.PointerType.DERIVED;
/*  85 */       break;
/*     */     default: 
/*  87 */       throw new RuntimeException("Unknown type");
/*     */     }
/*     */     
/*     */     try
/*     */     {
/*  92 */       HashSet localHashSet = new HashSet();
/*  93 */       wordnet.wn.IndexWord localIndexWord = dictionary.lookupIndexWord(TYPE, paramString);
/*  94 */       if (localIndexWord == null) {
/*  95 */         throw new CompileException("No such word in WordNet " + paramString);
/*     */       }
/*  97 */       Synset[] arrayOfSynset = localIndexWord.getSenses();
/*  98 */       BFS(arrayOfSynset, localHashSet);
/*  99 */       paramString = paramString + paramInt;
/* 100 */       WordToSynsets.put(paramString, localHashSet);
/*     */     }
/*     */     catch (CompileException localCompileException) {
/* 103 */       throw new RuntimeException(localCompileException.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean IsLinkedJava(String paramString1, String paramString2, int paramInt) {
/* 108 */     switch (paramInt) {
/*     */     case 0: 
/* 110 */       TYPE = POS.NOUN;
/* 111 */       break;
/*     */     case 1: 
/* 113 */       TYPE = POS.VERB;
/* 114 */       break;
/*     */     case 2: 
/* 116 */       TYPE = POS.ADJ;
/* 117 */       break;
/*     */     case 3: 
/* 119 */       TYPE = POS.ADV;
/* 120 */       break;
/*     */     default: 
/* 122 */       throw new RuntimeException("Unknown type");
/*     */     }
/*     */     
/* 125 */     paramString1 = paramString1 + paramInt;
/* 126 */     HashSet localHashSet = (HashSet)WordToSynsets.get(paramString1);
/* 127 */     if (localHashSet == null) { throw new RuntimeException("Concept " + paramString1 + " not found in wordnet.bin. Did you properly copy wordnet.bin?");
/*     */     }
/* 129 */     wordnet.wn.IndexWord localIndexWord = dictionary.lookupIndexWord(TYPE, paramString2);
/* 130 */     if (localIndexWord == null) return false;
/* 131 */     Synset[] arrayOfSynset = localIndexWord.getSenses();
/*     */     
/* 133 */     for (int i = 0; i < arrayOfSynset.length; i++) {
/* 134 */       if (localHashSet.contains(new Integer(arrayOfSynset[i].hashCode()))) return true;
/*     */     }
/* 136 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\WordNet.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */