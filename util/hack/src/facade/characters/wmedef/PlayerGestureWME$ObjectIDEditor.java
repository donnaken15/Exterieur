/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.PrintUtilities;
/*    */ import javax.swing.JComboBox;
/*    */ import wm.WMEFieldEditor;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class PlayerGestureWME$ObjectIDEditor
/*    */   extends JComboBox
/*    */   implements WMEFieldEditor
/*    */ {
/*    */   final PlayerGestureWME this$0;
/*    */   
/*    */   PlayerGestureWME$ObjectIDEditor(PlayerGestureWME paramPlayerGestureWME)
/*    */   {
/* 41 */     super(PrintUtilities.spriteID_GetCharacterEnumArray());
/* 42 */     setEditable(false);
/* 43 */     setSelectedItem(PrintUtilities.spriteID_EnumToString(this.this$0.getObjectID()));
/*    */   }
/*    */   
/*    */ 
/*    */   public String getFieldValue()
/*    */   {
/* 49 */     return Integer.toString(PrintUtilities.spriteID_StringToEnum((String)getSelectedItem()));
/*    */   }
/*    */   
/*    */ 
/*    */   public void setFieldValue(String paramString)
/*    */   {
/* 55 */     setSelectedItem(PrintUtilities.spriteID_EnumToString(Integer.parseInt(paramString)));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerGestureWME$ObjectIDEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */