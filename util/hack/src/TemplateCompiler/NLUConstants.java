/*    */ package TemplateCompiler;
/*    */ 
/*    */ 
/*    */ public abstract interface NLUConstants
/*    */ {
/*    */   public static final int EOF = 0;
/*    */   
/*    */   public static final int DEFTEMPLATE = 7;
/*    */   
/*    */   public static final int DEFRULE = 8;
/*    */   public static final int DEFMAP = 9;
/*    */   public static final int DEFTYPE = 10;
/*    */   public static final int DEFBEAT = 11;
/*    */   public static final int DECLARE = 12;
/*    */   public static final int LPAREN = 13;
/*    */   public static final int RPAREN = 14;
/*    */   public static final int LBRACKET = 15;
/*    */   public static final int RBRACKET = 16;
/*    */   public static final int OROP = 17;
/*    */   public static final int FROMFILE = 18;
/*    */   public static final int INCLUDE = 19;
/*    */   public static final int ORWORD = 20;
/*    */   public static final int ANDWORD = 21;
/*    */   public static final int SEMICOLON = 22;
/*    */   public static final int COLON = 23;
/*    */   public static final int AMPERSAND = 24;
/*    */   public static final int COMPARISON = 25;
/*    */   public static final int IMPLIES = 26;
/*    */   public static final int ASSIGN = 27;
/*    */   public static final int SPECIAL = 28;
/*    */   public static final int WORD = 29;
/*    */   public static final int FILENAME = 30;
/*    */   public static final int TAND = 31;
/*    */   public static final int TOR = 32;
/*    */   public static final int TOCCURS = 33;
/*    */   public static final int TNOT = 34;
/*    */   public static final int TLPAREN = 35;
/*    */   public static final int TRPAREN = 36;
/*    */   public static final int TLBRACKET = 37;
/*    */   public static final int TRBRACKET = 38;
/*    */   public static final int LKPAREN = 39;
/*    */   public static final int RKPAREN = 40;
/*    */   public static final int RETRACT = 41;
/*    */   public static final int CURLYLEFT = 42;
/*    */   public static final int CURLYRIGHT = 43;
/*    */   public static final int TOROP = 44;
/*    */   public static final int WILDCARD = 45;
/*    */   public static final int TWORD = 46;
/*    */   public static final int LETTER = 47;
/*    */   public static final int DIGIT = 48;
/*    */   public static final int TWORDCHAR = 49;
/*    */   public static final int TYPE = 50;
/*    */   public static final int ROOT = 51;
/*    */   public static final int JESSVAR = 52;
/*    */   public static final int SMILEY = 53;
/*    */   public static final int SINGLE_LINE_COMMENT = 60;
/*    */   public static final int DEFAULT = 0;
/*    */   public static final int TEMPLATE = 1;
/*    */   public static final int MultiComment = 2;
/* 60 */   public static final String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\n\"", "\"\\r\"", "\"\\f\"", "\"\\r\\n\"", "\"template\"", "\"defrule\"", "\"defmap\"", "\"deftype\"", "\"defbeat\"", "\"declare\"", "\"(\"", "\")\"", "\"[\"", "\"]\"", "\"|\"", "\"%fromfile\"", "\"include\"", "\"or\"", "\"and\"", "\";\"", "\":\"", "\"&\"", "<COMPARISON>", "\"=>\"", "\"<-\"", "\"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\"", "<WORD>", "<FILENAME>", "\"tand\"", "\"tor\"", "\"toc\"", "\"tnot\"", "\"(\"", "\")\"", "\"[\"", "\"]\"", "\"<\"", "\">\"", "\"-\"", "\"{\"", "\"}\"", "\"|\"", "<WILDCARD>", "<TWORD>", "<LETTER>", "<DIGIT>", "<TWORDCHAR>", "<TYPE>", "<ROOT>", "<JESSVAR>", "<SMILEY>", "\" \"", "\"\\t\"", "\"\\n\"", "\"\\r\"", "\"\\f\"", "\"\\r\\n\"", "<SINGLE_LINE_COMMENT>", "\"/*\"", "\"*/\"", "<token of kind 63>" };
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUConstants.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */