/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JessException
/*     */   extends Exception
/*     */   implements Serializable
/*     */ {
/*     */   private Throwable m_nextException;
/*     */   private int m_lineNumber;
/*     */   private String m_message;
/*     */   private String m_routine;
/*     */   private String m_data;
/*     */   private String m_programText;
/*     */   private StringBuffer m_context;
/*     */   
/*     */   public JessException(String paramString1, String paramString2, String paramString3)
/*     */   {
/*  25 */     jdMethod_this();
/*  26 */     this.m_routine = paramString1;
/*  27 */     this.m_message = paramString2;
/*  28 */     this.m_data = paramString3;
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
/*     */   public JessException(String paramString1, String paramString2, int paramInt)
/*     */   {
/*  42 */     this(paramString1, paramString2, String.valueOf(paramInt));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JessException(String paramString1, String paramString2, Throwable paramThrowable)
/*     */   {
/*  53 */     jdMethod_this();
/*  54 */     this.m_routine = paramString1;
/*  55 */     this.m_message = paramString2;
/*  56 */     this.m_nextException = paramThrowable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public Throwable getNextException()
/*     */   {
/*  68 */     return this.m_nextException;
/*     */   }
/*     */   
/*     */ 
/*     */   public Throwable getCause()
/*     */   {
/*  74 */     return this.m_nextException;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setNextException(Throwable paramThrowable)
/*     */   {
/*  80 */     this.m_nextException = paramThrowable;
/*     */   }
/*     */   
/*  83 */   private final void jdMethod_this() { this.m_lineNumber = -1; }
/*     */   
/*     */ 
/*     */   public int getLineNumber()
/*     */   {
/*  88 */     return this.m_lineNumber;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLineNumber(int paramInt)
/*     */   {
/*  94 */     this.m_lineNumber = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMessage()
/*     */   {
/* 103 */     return this.m_message;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setMessage(String paramString)
/*     */   {
/* 109 */     this.m_message = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRoutine()
/*     */   {
/* 118 */     return this.m_routine;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRoutine(String paramString)
/*     */   {
/* 124 */     this.m_routine = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getData()
/*     */   {
/* 132 */     return this.m_data;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setData(String paramString)
/*     */   {
/* 138 */     this.m_data = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getProgramText()
/*     */   {
/* 146 */     return this.m_programText;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setProgramText(String paramString)
/*     */   {
/* 152 */     this.m_programText = paramString;
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
/*     */   public void addContext(String paramString)
/*     */   {
/* 166 */     if (this.m_context == null)
/* 167 */       this.m_context = new StringBuffer();
/* 168 */     this.m_context.append("\n\twhile executing ");
/* 169 */     this.m_context.append(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getContext()
/*     */   {
/* 176 */     return this.m_context.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 187 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 188 */     localStringBuffer.append("Jess reported an error in routine ");
/* 189 */     localStringBuffer.append(this.m_routine);
/* 190 */     if (this.m_context != null)
/* 191 */       localStringBuffer.append(this.m_context);
/* 192 */     localStringBuffer.append(".\n");
/* 193 */     localStringBuffer.append("  Message: ");
/* 194 */     localStringBuffer.append(this.m_message);
/*     */     
/* 196 */     if (this.m_data != null)
/*     */     {
/* 198 */       localStringBuffer.append(" ");
/* 199 */       localStringBuffer.append(this.m_data);
/*     */     }
/*     */     
/* 202 */     localStringBuffer.append(".");
/*     */     
/* 204 */     if (this.m_programText != null)
/*     */     {
/* 206 */       localStringBuffer.append("\n  Program text: ");
/* 207 */       localStringBuffer.append(this.m_programText);
/* 208 */       if (this.m_lineNumber != -1)
/*     */       {
/* 210 */         localStringBuffer.append(" at line ");
/* 211 */         localStringBuffer.append(this.m_lineNumber);
/* 212 */         localStringBuffer.append(".");
/*     */       }
/*     */     }
/*     */     
/* 216 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\JessException.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */