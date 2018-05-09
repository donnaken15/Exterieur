/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Dialog;
/*    */ import java.awt.Frame;
/*    */ import java.awt.Insets;
/*    */ import java.awt.Rectangle;
/*    */ 
/*    */ public class QuitDialog extends Dialog
/*    */ {
/*    */   java.awt.Label label1;
/*    */   Button yesButton;
/*    */   Button noButton;
/*    */   
/*    */   public QuitDialog(Frame paramFrame, boolean paramBoolean)
/*    */   {
/* 17 */     super(paramFrame, paramBoolean);
/* 18 */     setTitle("Quit");
/* 19 */     setResizable(false);
/*    */     
/* 21 */     setLayout(null);
/* 22 */     setSize(insets().left + insets().right + 337, insets().top + insets().bottom + 135);
/*    */     
/* 24 */     this.label1 = new java.awt.Label("Do you really want to quit?", 1);
/* 25 */     this.label1.setBounds(78, 33, 180, 23);
/* 26 */     add(this.label1);
/* 27 */     this.yesButton = new Button(" Yes ");
/* 28 */     this.yesButton.setBounds(insets().left + 72, insets().top + 80, 79, 22);
/* 29 */     this.yesButton.setFont(new java.awt.Font("Dialog", 1, 12));
/* 30 */     add(this.yesButton);
/* 31 */     this.noButton = new Button("No");
/* 32 */     this.noButton.setBounds(insets().left + 185, insets().top + 80, 79, 22);
/* 33 */     this.noButton.setFont(new java.awt.Font("Dialog", 1, 12));
/* 34 */     add(this.noButton);
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 44 */     this.noButton.addActionListener(new QuitDialog.1(this));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 49 */     this.yesButton.addActionListener(new QuitDialog.2(this));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public QuitDialog(Frame paramFrame, String paramString, boolean paramBoolean)
/*    */   {
/* 57 */     this(paramFrame, paramBoolean);
/* 58 */     setTitle(paramString);
/*    */   }
/*    */   
/*    */   public void setVisible(boolean paramBoolean) {
/* 62 */     if (paramBoolean) {
/* 63 */       Rectangle localRectangle1 = getParent().getBounds();
/* 64 */       Rectangle localRectangle2 = getBounds();
/*    */       
/* 66 */       setLocation(localRectangle1.x + (localRectangle1.width - localRectangle2.width) / 2, localRectangle1.y + (localRectangle1.height - localRectangle2.height) / 2);
/*    */     }
/*    */     
/* 69 */     super.setVisible(paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\QuitDialog.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */