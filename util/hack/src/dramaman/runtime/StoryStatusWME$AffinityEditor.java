/*     */ package dramaman.runtime;
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
/*     */ class StoryStatusWME$AffinityEditor
/*     */   extends JComboBox
/*     */   implements WMEFieldEditor
/*     */ {
/*     */   final StoryStatusWME this$0;
/*     */   
/*     */   StoryStatusWME$AffinityEditor(StoryStatusWME paramStoryStatusWME)
/*     */   {
/* 130 */     super(PrintUtilities.affinity_GetEnumArray());
/* 131 */     setEditable(false);
/* 132 */     setSelectedItem(PrintUtilities.affinity_EnumToString(this.this$0.getAffinity()));
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFieldValue()
/*     */   {
/* 138 */     return Integer.toString(PrintUtilities.affinity_StringToEnum((String)getSelectedItem()));
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFieldValue(String paramString)
/*     */   {
/* 144 */     setSelectedItem(PrintUtilities.affinity_EnumToString(Integer.parseInt(paramString)));
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryStatusWME$AffinityEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */