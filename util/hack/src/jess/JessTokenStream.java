/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Stack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class JessTokenStream
/*     */   implements Serializable
/*     */ {
/*     */   private Stack m_stack;
/*     */   private Tokenizer m_stream;
/*     */   private int m_lineno;
/*     */   private StringBuffer m_string;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  21 */     this.m_string = new StringBuffer();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   JessTokenStream(Tokenizer paramTokenizer)
/*     */   {
/*  29 */     jdMethod_this();
/*  30 */     this.m_stream = paramTokenizer;
/*  31 */     this.m_stack = new Stack();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   int lineno()
/*     */   {
/*  41 */     return this.m_lineno;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void prepareSexp()
/*     */     throws JessException
/*     */   {
/*  51 */     int i = 0;
/*  52 */     this.m_string.setLength(0);
/*     */     
/*     */ 
/*  55 */     Stack localStack = new Stack();
/*     */     do
/*     */     {
/*  58 */       JessToken localJessToken = this.m_stream.nextToken();
/*  59 */       localStack.push(localJessToken);
/*  60 */       if (localJessToken.m_ttype == 0)
/*     */         break;
/*  62 */       if (localJessToken.m_ttype == 41) {
/*  63 */         i--;
/*  64 */       } else if (localJessToken.m_ttype == 40) {
/*  65 */         i++;
/*     */       }
/*  67 */     } while (i > 0);
/*     */     
/*  69 */     while (!localStack.empty())
/*     */     {
/*  71 */       this.m_stack.push(localStack.pop());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   JessToken nextToken()
/*     */     throws JessException
/*     */   {
/*  83 */     if (this.m_stack.empty()) {
/*  84 */       prepareSexp();
/*     */     }
/*  86 */     JessToken localJessToken = (JessToken)this.m_stack.pop();
/*  87 */     this.m_string.append(localJessToken.toString());
/*  88 */     this.m_string.append(" ");
/*  89 */     this.m_lineno = localJessToken.m_lineno;
/*  90 */     return localJessToken;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void pushBack(JessToken paramJessToken)
/*     */   {
/*  99 */     this.m_lineno = paramJessToken.m_lineno;
/* 100 */     this.m_stack.push(paramJessToken);
/* 101 */     this.m_string.setLength(this.m_string.length() - (paramJessToken.toString().length() + 1));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   String head()
/*     */     throws JessException
/*     */   {
/* 111 */     if (this.m_stack.empty()) {
/* 112 */       prepareSexp();
/*     */     }
/* 114 */     JessToken localJessToken1 = (JessToken)this.m_stack.pop();
/* 115 */     if ((localJessToken1.m_ttype != 40) || (this.m_stack.empty())) {
/* 116 */       return null;
/*     */     }
/* 118 */     JessToken localJessToken2 = (JessToken)this.m_stack.peek();
/*     */     
/* 120 */     this.m_stack.push(localJessToken1);
/*     */     
/* 122 */     if (localJessToken2.m_ttype != 1)
/*     */     {
/* 124 */       if (localJessToken2.m_ttype == 45)
/* 125 */         return "-";
/* 126 */       if (localJessToken2.m_ttype == 61) {
/* 127 */         return "=";
/*     */       }
/* 129 */       if (localJessToken2.m_ttype == 8) {
/* 130 */         return localJessToken2.m_sval;
/*     */       }
/* 132 */       return localJessToken2.toString();
/*     */     }
/*     */     
/*     */ 
/* 136 */     if (localJessToken2.m_sval != null) {
/* 137 */       return localJessToken2.m_sval;
/*     */     }
/* 139 */     return localJessToken2.toString();
/*     */   }
/*     */   
/*     */ 
/*     */   void clear()
/*     */   {
/* 145 */     this.m_stack = new Stack();
/* 146 */     this.m_string.setLength(0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 154 */     return this.m_string.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessTokenStream.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */