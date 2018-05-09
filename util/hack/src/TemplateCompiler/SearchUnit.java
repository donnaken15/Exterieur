/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.StringTokenizer;
/*     */ import java.util.Vector;
/*     */ 
/*     */ 
/*     */ public class SearchUnit
/*     */ {
/*     */   public static String getfirst(String paramString)
/*     */   {
/*  12 */     int i = paramString.indexOf(" ");
/*  13 */     return paramString.substring(0, i);
/*     */   }
/*     */   
/*     */   public static String getlast(String paramString)
/*     */   {
/*  18 */     int i = paramString.lastIndexOf(" ");
/*  19 */     return paramString.substring(i + 1, paramString.length());
/*     */   }
/*     */   
/*     */   public static int[] TermExpander(String paramString1, String paramString2, int paramInt) {
/*  23 */     paramString1 = paramString1.trim();
/*  24 */     paramString1 = paramString1 + ' ';
/*  25 */     Vector localVector = new Vector();
/*  26 */     int i = 1;
/*  27 */     int j = -1;
/*  28 */     int k = 0;
/*     */     for (;;) {
/*  30 */       k = paramString1.indexOf(" ", j + 1);
/*  31 */       if (k == -1) break;
/*  32 */       localObject = paramString1.substring(j + 1, k);
/*  33 */       if (WordNet.IsLinkedJava(paramString2, (String)localObject, paramInt)) {
/*  34 */         localVector.addElement(new Integer(i));
/*     */       }
/*  36 */       j = k;
/*  37 */       i++;
/*     */     }
/*     */     
/*  40 */     Object localObject = localVector.toArray();
/*  41 */     int[] arrayOfInt = new int[localObject.length];
/*  42 */     for (i = 0; i < localObject.length; i++) {
/*  43 */       Integer localInteger = (Integer)localObject[i];
/*  44 */       arrayOfInt[i] = localInteger.intValue();
/*     */     }
/*     */     
/*  47 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int[] Search(String paramString1, String paramString2)
/*     */   {
/*  59 */     Vector localVector = new Vector();
/*  60 */     int i = 0;
/*     */     
/*  62 */     StringTokenizer localStringTokenizer = new StringTokenizer(paramString1);
/*     */     
/*  64 */     while (localStringTokenizer.hasMoreTokens())
/*     */     {
/*  66 */       i++;
/*  67 */       if (localStringTokenizer.nextToken().equals(paramString2)) {
/*  68 */         System.out.println(paramString2 + ' ' + i);
/*  69 */         localVector.addElement(new Integer(i));
/*     */       }
/*     */     }
/*  72 */     Object[] arrayOfObject = localVector.toArray();
/*  73 */     int[] arrayOfInt = new int[arrayOfObject.length];
/*  74 */     for (int j = 0; j < arrayOfObject.length; j++) {
/*  75 */       Integer localInteger = (Integer)arrayOfObject[j];
/*  76 */       arrayOfInt[j] = localInteger.intValue();
/*     */     }
/*     */     
/*  79 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static int IsThereWord(String paramString, int paramInt)
/*     */   {
/*  86 */     int i = 1;
/*  87 */     int j = paramString.indexOf(" ");
/*     */     for (;;)
/*     */     {
/*  90 */       if (j == -1) return -1;
/*  91 */       j = paramString.indexOf(" ", j + 1);
/*  92 */       i++;
/*  93 */       if (paramInt == i) return 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int NumWords(String paramString)
/*     */   {
/*  99 */     int i = 1;
/*     */     
/* 101 */     int j = paramString.indexOf(" ");
/*     */     for (;;)
/*     */     {
/* 104 */       if (j == -1) return i;
/* 105 */       j = paramString.indexOf(" ", j + 1);
/* 106 */       i++;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\SearchUnit.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */