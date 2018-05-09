/*    */ package jess;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ class List {
/*    */   private String m_head;
/*    */   private String m_indent;
/*    */   private ArrayList m_data;
/*    */   private char m_open;
/*    */   private char m_close;
/*    */   
/* 12 */   private final void jdMethod_this() { this.m_indent = "";
/* 13 */     this.m_data = new ArrayList();
/*    */     
/* 15 */     this.m_open = '(';
/* 16 */     this.m_close = ')';
/*    */   }
/*    */   
/*    */ 
/*    */   public List(String paramString)
/*    */   {
/* 22 */     jdMethod_this();
/* 23 */     this.m_head = paramString;
/*    */   }
/*    */   
/*    */   public List()
/*    */   {
/* 28 */     this("");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public List(String paramString, Object paramObject)
/*    */   {
/* 37 */     this(paramString);
/* 38 */     add(paramObject);
/*    */   }
/*    */   
/*    */   public void setDelimiters(char paramChar1, char paramChar2)
/*    */   {
/* 43 */     this.m_open = paramChar1;
/* 44 */     this.m_close = paramChar2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public List(Value paramValue, Object paramObject)
/*    */     throws JessException
/*    */   {
/* 54 */     this(paramValue.stringValue(null));
/* 55 */     add(paramObject);
/*    */   }
/*    */   
/*    */ 
/*    */   public List add(Object paramObject)
/*    */   {
/* 61 */     this.m_data.add(paramObject);return this;
/*    */   }
/*    */   
/*    */   public List addQuoted(String paramString)
/*    */   {
/* 66 */     add("\"" + paramString + '"');
/* 67 */     return this;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 73 */   public void indent(String paramString) { this.m_indent = paramString; }
/*    */   
/* 75 */   public void newLine() { add("\n" + this.m_indent); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public StringBuffer toStringBuffer()
/*    */   {
/* 82 */     StringBuffer localStringBuffer = new StringBuffer(this.m_data.size() * 6);
/* 83 */     localStringBuffer.append(this.m_open);
/* 84 */     localStringBuffer.append(this.m_head);
/* 85 */     for (int i = 0; i < this.m_data.size(); i++)
/*    */     {
/* 87 */       if (localStringBuffer.length() > 1) localStringBuffer.append(' ');
/* 88 */       localStringBuffer.append(this.m_data.get(i));
/*    */     }
/* 90 */     localStringBuffer.append(this.m_close);
/* 91 */     return localStringBuffer;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 96 */     return toStringBuffer().toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\List.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */