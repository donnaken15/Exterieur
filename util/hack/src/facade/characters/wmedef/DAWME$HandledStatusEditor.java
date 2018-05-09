/*     */ package facade.characters.wmedef;
/*     */ 
/*     */ import facade.util.PrintUtilities;
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
/*     */ class DAWME$HandledStatusEditor
/*     */   extends JComboBox
/*     */   implements WMEFieldEditor
/*     */ {
/*     */   final DAWME this$0;
/*     */   
/*     */   DAWME$HandledStatusEditor(DAWME paramDAWME)
/*     */   {
/* 149 */     super(PrintUtilities.daHandledStatus_GetEnumArray());
/* 150 */     setEditable(false);
/* 151 */     setSelectedItem(PrintUtilities.daHandledStatus_EnumToString(this.this$0.getHandledStatus()));
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFieldValue()
/*     */   {
/* 157 */     return Integer.toString(PrintUtilities.daHandledStatus_StringToEnum((String)getSelectedItem()));
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFieldValue(String paramString)
/*     */   {
/* 163 */     setSelectedItem(PrintUtilities.daHandledStatus_EnumToString(Integer.parseInt(paramString)));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DAWME$HandledStatusEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */