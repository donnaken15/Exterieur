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
/*     */ class BeatRevelationsP2WME$CharFocusEditor
/*     */   extends JComboBox
/*     */   implements WMEFieldEditor
/*     */ {
/*     */   int revNum;
/*     */   final BeatRevelationsP2WME this$0;
/*     */   private static final boolean $noassert = Class.forName("[Lfacade.characters.wmedef.BeatRevelationsP2WME;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final int getCharFocus()
/*     */   {
/* 147 */     switch (this.revNum) {
/* 148 */     case 1:  return this.this$0.getRev1CharFocus();
/* 149 */     case 2:  return this.this$0.getRev2CharFocus();
/* 150 */     case 3:  return this.this$0.getRev3CharFocus(); }
/* 151 */     throw new Error("Unexpected revNum");
/*     */   }
/*     */   
/*     */ 
/*     */   BeatRevelationsP2WME$CharFocusEditor(BeatRevelationsP2WME paramBeatRevelationsP2WME, int paramInt)
/*     */   {
/* 157 */     super(PrintUtilities.therapyGameCharFocus_GetEnumArray());
/* 158 */     if ((!$noassert) && ((paramInt < 1) || (paramInt > 3))) throw new AssertionError();
/* 159 */     this.revNum = paramInt;
/* 160 */     setEditable(false);
/* 161 */     setSelectedItem(PrintUtilities.therapyGameCharFocus_EnumToString(getCharFocus()));
/*     */   }
/*     */   
/*     */   public String getFieldValue() {
/* 165 */     return Integer.toString(PrintUtilities.therapyGameCharFocus_StringToEnum((String)getSelectedItem()));
/*     */   }
/*     */   
/* 168 */   public void setFieldValue(String paramString) { setSelectedItem(PrintUtilities.therapyGameCharFocus_EnumToString(Integer.parseInt(paramString))); }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\BeatRevelationsP2WME$CharFocusEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */