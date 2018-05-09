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
/*    */ public abstract class TimeStampedWME
/*    */   extends WME
/*    */   implements Comparable
/*    */ {
/* 17 */   private static final SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy hh:mm:ss:S a");
/*    */   
/*    */ 
/* 20 */   public TimeStampedWME(long paramLong) { this.timestamp = paramLong; }
/* 21 */   public TimeStampedWME() { this.timestamp = 0L; }
/*    */   
/* 23 */   public synchronized long getTimestamp() { return this.timestamp; }
/* 24 */   public synchronized void setTimestamp(long paramLong) { this.timestamp = paramLong; }
/*    */   
/*    */   public synchronized String formatTimestamp()
/*    */   {
/* 28 */     return formatter.format(new Date(getTimestamp()));
/*    */   }
/*    */   
/* 31 */   private static final String[] menuItems = { "Set current time" };
/*    */   private long timestamp;
/*    */   
/*    */   private class TimestampEditor extends JComboBox implements WMEFieldEditor {
/*    */     TimestampEditor() {
/* 36 */       super();
/* 37 */       setEditable(true);
/* 38 */       if (TimeStampedWME.this.getTimestamp() != 0L) {
/* 39 */         setSelectedItem(TimeStampedWME.this.formatTimestamp());
/*    */       } else
/* 41 */         setSelectedItem("");
/* 42 */       addActionListener(new TimeStampedWME.TimestampEditor.1(this));
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     public String getFieldValue()
/*    */     {
/*    */       try
/*    */       {
/* 52 */         return Long.toString(TimeStampedWME.formatter.parse(getSelectedItem().toString()).getTime());
/*    */       } catch (ParseException localParseException) {
/* 54 */         System.err.println("Parse error: " + localParseException.getMessage() + " in TimestampEditor.getTimeValue(). Returning null."); }
/* 55 */       return null;
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */     public void setFieldValue(String paramString)
/*    */     {
/* 62 */       setSelectedItem(TimeStampedWME.formatter.format(new Date(Long.parseLong(paramString))));
/*    */     }
/*    */   }
/*    */   
/*    */   public WMEFieldEditor _getTimestampEditor() {
/* 67 */     return new TimestampEditor();
/*    */   }
/*    */   
/*    */   public int compareTo(Object paramObject)
/*    */   {
/* 72 */     TimeStampedWME localTimeStampedWME = (TimeStampedWME)paramObject;
/* 73 */     if (getTimestamp() < localTimeStampedWME.getTimestamp()) return -1;
/* 74 */     if (getTimestamp() > localTimeStampedWME.getTimestamp()) return 1;
/* 75 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\TimeStampedWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */