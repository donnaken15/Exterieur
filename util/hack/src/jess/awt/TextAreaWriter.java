/*    */ package jess.awt;
/*    */ 
/*    */ import java.awt.TextArea;
/*    */ import java.io.Serializable;
/*    */ import java.io.Writer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TextAreaWriter
/*    */   extends Writer
/*    */   implements Serializable
/*    */ {
/*    */   private static final int MAXSIZE = 30000;
/*    */   private StringBuffer m_str;
/*    */   private TextArea m_ta;
/*    */   private int m_size;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 23 */     this.m_size = 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public TextAreaWriter(TextArea paramTextArea)
/*    */   {
/* 33 */     jdMethod_this();
/* 34 */     this.m_str = new StringBuffer(100);
/* 35 */     this.m_ta = paramTextArea;
/* 36 */     this.m_size = this.m_ta.getText().length();
/*    */   }
/*    */   
/*    */   public synchronized void clear()
/*    */   {
/* 41 */     this.m_ta.setText("");
/* 42 */     this.m_size = 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized void flush()
/*    */   {
/* 59 */     int i = this.m_str.length();
/* 60 */     if (this.m_size > 30000)
/*    */     {
/* 62 */       this.m_ta.replaceRange("", 0, i);
/* 63 */       this.m_size -= i;
/*    */     }
/*    */     
/* 66 */     this.m_ta.append(this.m_str.toString());
/* 67 */     this.m_size += i;
/* 68 */     this.m_str.setLength(0);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public synchronized void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
/*    */   {
/* 82 */     this.m_str.append(paramArrayOfChar, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void close() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\awt\TextAreaWriter.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */