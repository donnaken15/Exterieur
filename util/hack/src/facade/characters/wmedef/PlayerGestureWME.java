/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import facade.util.DAType;
/*    */ import facade.util.PrintUtilities;
/*    */ import javax.swing.JComboBox;
/*    */ import wm.TimeStampedWME;
/*    */ import wm.WMEFieldEditor;
/*    */ 
/*    */ public class PlayerGestureWME
/*    */   extends TimeStampedWME
/*    */   implements DAType
/*    */ {
/*    */   private int playerGestureID;
/*    */   private int objectID;
/*    */   private int param;
/*    */   
/*    */   public PlayerGestureWME(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     this.playerGestureID = paramInt1;
/* 20 */     this.objectID = paramInt2;
/* 21 */     this.param = paramInt3;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 27 */   public synchronized int getPlayerGestureID() { return this.playerGestureID; }
/* 28 */   public synchronized int getObjectID() { return this.objectID; }
/* 29 */   public synchronized int getParam() { return this.param; }
/*    */   
/*    */ 
/* 32 */   public synchronized void setPlayerGestureID(int paramInt) { this.playerGestureID = paramInt; }
/* 33 */   public synchronized void setObjectID(int paramInt) { this.objectID = paramInt; }
/* 34 */   public synchronized void setParam(int paramInt) { this.param = paramInt; }
/*    */   
/*    */   private class ObjectIDEditor
/*    */     extends JComboBox implements WMEFieldEditor
/*    */   {
/*    */     ObjectIDEditor()
/*    */     {
/* 41 */       super();
/* 42 */       setEditable(false);
/* 43 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(PlayerGestureWME.this.getObjectID()));
/*    */     }
/*    */     
/*    */ 
/*    */     public String getFieldValue()
/*    */     {
/* 49 */       return Integer.toString(PrintUtilities.spriteID_StringToEnum((String)getSelectedItem()));
/*    */     }
/*    */     
/*    */ 
/*    */     public void setFieldValue(String paramString)
/*    */     {
/* 55 */       setSelectedItem(PrintUtilities.spriteID_EnumToString(Integer.parseInt(paramString)));
/*    */     }
/*    */   }
/*    */   
/*    */   public WMEFieldEditor _getObjectIDEditor() {
/* 60 */     return new ObjectIDEditor();
/*    */   }
/*    */   
/*    */   private class PlayerGestureIDEditor extends JComboBox implements WMEFieldEditor
/*    */   {
/*    */     PlayerGestureIDEditor()
/*    */     {
/* 67 */       super();
/* 68 */       setEditable(false);
/* 69 */       setSelectedItem(PrintUtilities.playerGesture_EnumToString(PlayerGestureWME.this.getObjectID()));
/*    */     }
/*    */     
/*    */ 
/*    */     public String getFieldValue()
/*    */     {
/* 75 */       return Integer.toString(PrintUtilities.playerGesture_StringToEnum((String)getSelectedItem()));
/*    */     }
/*    */     
/*    */ 
/*    */     public void setFieldValue(String paramString)
/*    */     {
/* 81 */       setSelectedItem(PrintUtilities.playerGesture_EnumToString(Integer.parseInt(paramString)));
/*    */     }
/*    */   }
/*    */   
/*    */   public WMEFieldEditor _getPlayerGestureIDEditor() {
/* 86 */     return new PlayerGestureIDEditor();
/*    */   }
/*    */   
/*    */   public PlayerGestureWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerGestureWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */