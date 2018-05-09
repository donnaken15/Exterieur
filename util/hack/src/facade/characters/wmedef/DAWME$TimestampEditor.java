/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.swing.JComboBox;
/*     */ import wm.WMEFieldEditor;
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
/*     */ 
/*     */ 
/*     */ class DAWME$TimestampEditor
/*     */   extends JComboBox
/*     */   implements WMEFieldEditor
/*     */ {
/*     */   final DAWME this$0;
/*     */   
/*     */   DAWME$TimestampEditor(DAWME paramDAWME)
/*     */   {
/* 109 */     super(DAWME.access$0());
/* 110 */     setEditable(true);
/* 111 */     if (this.this$0.getTimestamp() != 0L) {
/* 112 */       setSelectedItem(this.this$0.formatTimestamp());
/*     */     } else
/* 114 */       setSelectedItem("");
/* 115 */     addActionListener(new DAWME.TimestampEditor.1(this));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFieldValue()
/*     */   {
/*     */     try
/*     */     {
/* 125 */       return Long.toString(DAWME.access$1().parse(getSelectedItem().toString()).getTime());
/*     */     } catch (ParseException localParseException) {
/* 127 */       System.err.println("Parse error: " + localParseException.getMessage() + " in TimestampEditor.getTimeValue(). Returning null."); }
/* 128 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFieldValue(String paramString)
/*     */   {
/* 137 */     setSelectedItem(DAWME.access$1().format(new Date(Long.parseLong(paramString))));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAWME$TimestampEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */