/*     */ package wm;
/*     */ 
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class WorkingMemoryDebugger$ModifyWMEDialog
/*     */   extends WorkingMemoryDebugger.EditWMEDialog
/*     */ {
/*     */   final WorkingMemoryDebugger this$0;
/*     */   
/*     */   WorkingMemoryDebugger$ModifyWMEDialog(WorkingMemoryDebugger paramWorkingMemoryDebugger, WME paramWME)
/*     */   {
/* 613 */     super(paramWorkingMemoryDebugger, paramWME.getClass());
/* 614 */     this.okButton.addActionListener(new WorkingMemoryDebugger.WMEActionListener(this.this$0, this, paramWME));
/*     */     try {
/* 616 */       for (int i = 0; i < this.wmeFieldTypes.length; i++)
/*     */       {
/*     */ 
/* 619 */         Method localMethod = paramWME._getGetMethod(this.wmeFieldNames[i]);
/* 620 */         Object localObject; if (this.wmeFieldTypes[i] == Boolean.TYPE) {
/* 621 */           localObject = (Boolean)localMethod.invoke(paramWME, null);
/* 622 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Boolean)localObject).toString());
/*     */         }
/* 624 */         else if (this.wmeFieldTypes[i] == Byte.TYPE) {
/* 625 */           localObject = (Byte)localMethod.invoke(paramWME, null);
/* 626 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Byte)localObject).toString());
/*     */         }
/* 628 */         else if (this.wmeFieldTypes[i] == Integer.TYPE) {
/* 629 */           localObject = (Integer)localMethod.invoke(paramWME, null);
/* 630 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Integer)localObject).toString());
/*     */         }
/* 632 */         else if (this.wmeFieldTypes[i] == Long.TYPE) {
/* 633 */           localObject = (Long)localMethod.invoke(paramWME, null);
/* 634 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Long)localObject).toString());
/*     */         }
/* 636 */         else if (this.wmeFieldTypes[i] == Short.TYPE) {
/* 637 */           localObject = (Short)localMethod.invoke(paramWME, null);
/* 638 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Short)localObject).toString());
/*     */         }
/* 640 */         else if (this.wmeFieldTypes[i] == Float.TYPE) {
/* 641 */           localObject = (Float)localMethod.invoke(paramWME, null);
/* 642 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Float)localObject).toString());
/*     */         }
/* 644 */         else if (this.wmeFieldTypes[i] == Double.TYPE) {
/* 645 */           localObject = (Double)localMethod.invoke(paramWME, null);
/* 646 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Double)localObject).toString());
/*     */         }
/* 648 */         else if (this.wmeFieldTypes[i] == Character.TYPE) {
/* 649 */           localObject = (Character)localMethod.invoke(paramWME, null);
/*     */           
/* 651 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(((Character)localObject).toString());
/*     */         }
/* 653 */         else if (this.wmeFieldTypes[i].getName().equals("java.lang.String")) {
/* 654 */           localObject = (String)localMethod.invoke(paramWME, null);
/* 655 */           ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue((String)localObject);
/*     */         }
/*     */         else
/*     */         {
/* 659 */           localObject = localMethod.invoke(paramWME, null);
/* 660 */           if (localObject != null) {
/* 661 */             String str = localObject.toString();
/* 662 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue(str);
/*     */           }
/*     */           else {
/* 665 */             ((WMEFieldEditor)this.fieldContainer.getComponent(i)).setFieldValue("null");
/*     */           }
/* 667 */           ((JTextField)this.fieldContainer.getComponent(i)).setEditable(false);
/*     */         }
/*     */       }
/*     */     } catch (IllegalAccessException localIllegalAccessException) {
/* 671 */       throw new WmeReflectionError(localIllegalAccessException);
/* 672 */     } catch (InvocationTargetException localInvocationTargetException) { throw new WmeReflectionError(localInvocationTargetException);
/* 673 */     } catch (NoSuchFieldException localNoSuchFieldException) { throw new WmeReflectionError(localNoSuchFieldException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$ModifyWMEDialog.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */