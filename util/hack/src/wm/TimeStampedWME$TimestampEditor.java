/*    */ package wm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import javax.swing.JComboBox;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class TimeStampedWME$TimestampEditor
/*    */   extends JComboBox
/*    */   implements WMEFieldEditor
/*    */ {
/*    */   final TimeStampedWME this$0;
/*    */   
/*    */   TimeStampedWME$TimestampEditor(TimeStampedWME paramTimeStampedWME)
/*    */   {
/* 36 */     super(TimeStampedWME.access$0());
/* 37 */     setEditable(true);
/* 38 */     if (this.this$0.getTimestamp() != 0L) {
/* 39 */       setSelectedItem(this.this$0.formatTimestamp());
/*    */     } else
/* 41 */       setSelectedItem("");
/* 42 */     addActionListener(new TimeStampedWME.TimestampEditor.1(this));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getFieldValue()
/*    */   {
/*    */     try
/*    */     {
/* 52 */       return Long.toString(TimeStampedWME.access$1().parse(getSelectedItem().toString()).getTime());
/*    */     } catch (ParseException localParseException) {
/* 54 */       System.err.println("Parse error: " + localParseException.getMessage() + " in TimestampEditor.getTimeValue(). Returning null."); }
/* 55 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setFieldValue(String paramString)
/*    */   {
/* 62 */     setSelectedItem(TimeStampedWME.access$1().format(new Date(Long.parseLong(paramString))));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\TimeStampedWME$TimestampEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */