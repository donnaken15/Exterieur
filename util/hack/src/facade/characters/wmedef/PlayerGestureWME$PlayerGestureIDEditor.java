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
/*    */ class PlayerGestureWME$PlayerGestureIDEditor
/*    */   extends JComboBox
/*    */   implements WMEFieldEditor
/*    */ {
/*    */   final PlayerGestureWME this$0;
/*    */   
/*    */   PlayerGestureWME$PlayerGestureIDEditor(PlayerGestureWME paramPlayerGestureWME)
/*    */   {
/* 67 */     super(PrintUtilities.playerGesture_GetEnumArray());
/* 68 */     setEditable(false);
/* 69 */     setSelectedItem(PrintUtilities.playerGesture_EnumToString(this.this$0.getObjectID()));
/*    */   }
/*    */   
/*    */ 
/*    */   public String getFieldValue()
/*    */   {
/* 75 */     return Integer.toString(PrintUtilities.playerGesture_StringToEnum((String)getSelectedItem()));
/*    */   }
/*    */   
/*    */ 
/*    */   public void setFieldValue(String paramString)
/*    */   {
/* 81 */     setSelectedItem(PrintUtilities.playerGesture_EnumToString(Integer.parseInt(paramString)));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerGestureWME$PlayerGestureIDEditor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */