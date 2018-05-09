/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import facade.util.DAType;
/*     */ import facade.util.PrintUtilities;
/*     */ import java.io.PrintStream;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.swing.JComboBox;
/*     */ import wm.WME;
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
/*     */ public class DAWME
/*     */   extends WME
/*     */   implements DAType
/*     */ {
/*  28 */   private static final SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy hh:mm:ss:S a");
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
/*     */   public DAWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong)
/*     */   {
/*  41 */     this.id = paramInt1;
/*  42 */     this.charID = paramInt2;
/*  43 */     this.param1 = paramInt3;
/*  44 */     this.param2 = paramInt4;
/*  45 */     this.param3 = paramInt5;
/*  46 */     this.timestamp = paramLong;
/*  47 */     this.handledStatus = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DAWME(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6)
/*     */   {
/*  59 */     this.id = paramInt1;
/*  60 */     this.charID = paramInt2;
/*  61 */     this.param1 = paramInt3;
/*  62 */     this.param2 = paramInt4;
/*  63 */     this.param3 = paramInt5;
/*  64 */     this.timestamp = paramLong;
/*  65 */     this.handledStatus = paramInt6;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  71 */   public synchronized int getId() { return this.id; }
/*  72 */   public synchronized int getCharID() { return this.charID; }
/*  73 */   public synchronized int getParam1() { return this.param1; }
/*  74 */   public synchronized int getParam2() { return this.param2; }
/*  75 */   public synchronized int getParam3() { return this.param3; }
/*  76 */   public synchronized long getTimestamp() { return this.timestamp; }
/*  77 */   public synchronized int getHandledStatus() { return this.handledStatus; }
/*     */   
/*     */ 
/*  80 */   public synchronized void setId(int paramInt) { this.id = paramInt; }
/*  81 */   public synchronized void setCharID(int paramInt) { this.charID = paramInt; }
/*  82 */   public synchronized void setParam1(int paramInt) { this.param1 = paramInt; }
/*  83 */   public synchronized void setParam2(int paramInt) { this.param2 = paramInt; }
/*  84 */   public synchronized void setParam3(int paramInt) { this.param3 = paramInt; }
/*  85 */   public synchronized void setTimestamp(long paramLong) { this.timestamp = paramLong; }
/*  86 */   public synchronized void setHandledStatus(int paramInt) { this.handledStatus = paramInt; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */   public synchronized String formatTimestamp() { return formatter.format(new Date(getTimestamp())); }
/*  94 */   public synchronized String formatHandledStatus() { return PrintUtilities.daHandledStatus_EnumToString(getHandledStatus()); }
/*  95 */   public synchronized String formatId() { return PrintUtilities.daType_EnumToString(getId()); }
/*  96 */   public synchronized String formatCharID() { return PrintUtilities.spriteID_EnumToString(getCharID()); }
/*  97 */   public synchronized String formatParam1() { return PrintUtilities.daParam1_EnumToString(getParam1()); }
/*  98 */   public synchronized String formatParam2() { return PrintUtilities.daParam2_EnumToString(getParam2()); }
/*  99 */   public synchronized String formatParam3() { return PrintUtilities.daParam3_EnumToString(getParam3()); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/* 104 */   private static final String[] timestampEditorMenuItems = { "Set current time" };
/*     */   private int id;
/*     */   private int charID;
/*     */   private int param1;
/*     */   
/* 109 */   private class TimestampEditor extends JComboBox implements WMEFieldEditor { TimestampEditor() { super();
/* 110 */       setEditable(true);
/* 111 */       if (DAWME.this.getTimestamp() != 0L) {
/* 112 */         setSelectedItem(DAWME.this.formatTimestamp());
/*     */       } else
/* 114 */         setSelectedItem("");
/* 115 */       addActionListener(new DAWME.TimestampEditor.1(this));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/*     */       try
/*     */       {
/* 125 */         return Long.toString(DAWME.formatter.parse(getSelectedItem().toString()).getTime());
/*     */       } catch (ParseException localParseException) {
/* 127 */         System.err.println("Parse error: " + localParseException.getMessage() + " in TimestampEditor.getTimeValue(). Returning null."); }
/* 128 */       return null;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */     public void setFieldValue(String paramString) { setSelectedItem(DAWME.formatter.format(new Date(Long.parseLong(paramString)))); } }
/*     */   
/*     */   private int param2;
/*     */   private int param3;
/*     */   
/* 142 */   public WMEFieldEditor _getTimestampEditor() { return new TimestampEditor(); }
/*     */   
/*     */   private long timestamp;
/*     */   private int handledStatus;
/*     */   private class HandledStatusEditor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     HandledStatusEditor() {
/* 149 */       super();
/* 150 */       setEditable(false);
/* 151 */       setSelectedItem(PrintUtilities.daHandledStatus_EnumToString(DAWME.this.getHandledStatus()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 157 */       return Integer.toString(PrintUtilities.daHandledStatus_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 163 */       setSelectedItem(PrintUtilities.daHandledStatus_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   public WMEFieldEditor _getHandledStatusEditor() {
/* 168 */     return new HandledStatusEditor();
/*     */   }
/*     */   
/*     */   private class IDEditor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     IDEditor()
/*     */     {
/* 175 */       super();
/* 176 */       setEditable(false);
/* 177 */       setSelectedItem(PrintUtilities.daType_EnumToString(DAWME.this.getId()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 183 */       return Integer.toString(PrintUtilities.daType_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 189 */       setSelectedItem(PrintUtilities.daType_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   public WMEFieldEditor _getIdEditor() {
/* 194 */     return new IDEditor();
/*     */   }
/*     */   
/*     */   private class CharIDEditor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     CharIDEditor()
/*     */     {
/* 201 */       super();
/* 202 */       setEditable(false);
/* 203 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(DAWME.this.getCharID()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 209 */       return Integer.toString(PrintUtilities.spriteID_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 215 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   public WMEFieldEditor _getCharIDEditor() {
/* 220 */     return new CharIDEditor();
/*     */   }
/*     */   
/*     */   private class Param1Editor extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     Param1Editor()
/*     */     {
/* 227 */       super();
/* 228 */       setEditable(false);
/* 229 */       setSelectedItem(PrintUtilities.daParam1_EnumToString(DAWME.this.getParam1()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 235 */       return Integer.toString(PrintUtilities.daParam1_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 241 */       setSelectedItem(PrintUtilities.daParam1_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   public WMEFieldEditor _getParam1Editor() {
/* 246 */     return new Param1Editor();
/*     */   }
/*     */   
/*     */   private class Param2Editor
/*     */     extends JComboBox implements WMEFieldEditor
/*     */   {
/*     */     Param2Editor()
/*     */     {
/* 254 */       super();
/* 255 */       setEditable(false);
/* 256 */       setSelectedItem(PrintUtilities.daParam2_EnumToString(DAWME.this.getParam2()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 262 */       return Integer.toString(PrintUtilities.daParam2_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 268 */       setSelectedItem(PrintUtilities.daParam2_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   private class Param3Editor
/*     */     extends JComboBox
/*     */     implements WMEFieldEditor
/*     */   {
/*     */     Param3Editor()
/*     */     {
/* 278 */       super();
/* 279 */       setEditable(false);
/* 280 */       setSelectedItem(PrintUtilities.daParam3_EnumToString(DAWME.this.getParam3()));
/*     */     }
/*     */     
/*     */ 
/*     */     public String getFieldValue()
/*     */     {
/* 286 */       return Integer.toString(PrintUtilities.daParam3_StringToEnum((String)getSelectedItem()));
/*     */     }
/*     */     
/*     */ 
/*     */     public void setFieldValue(String paramString)
/*     */     {
/* 292 */       setSelectedItem(PrintUtilities.daParam3_EnumToString(Integer.parseInt(paramString)));
/*     */     }
/*     */   }
/*     */   
/*     */   public WMEFieldEditor _getParam3Editor() {
/* 297 */     return new Param3Editor();
/*     */   }
/*     */   
/*     */   public DAWME() {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */