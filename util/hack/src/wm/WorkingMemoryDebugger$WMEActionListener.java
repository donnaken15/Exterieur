/*     */ package wm;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class WorkingMemoryDebugger$WMEActionListener
/*     */   implements ActionListener
/*     */ {
/*     */   static final int ADD_WME = 0;
/*     */   static final int MODIFY_WME = 1;
/*     */   private int actionToPerform;
/*     */   private WME wmeToModify;
/*     */   private WorkingMemoryDebugger.EditWMEDialog dialog;
/*     */   final WorkingMemoryDebugger this$0;
/*     */   
/*     */   WorkingMemoryDebugger$WMEActionListener(WorkingMemoryDebugger paramWorkingMemoryDebugger, WorkingMemoryDebugger.EditWMEDialog paramEditWMEDialog, WME paramWME)
/*     */   {
/* 289 */     this.actionToPerform = 1;
/* 290 */     this.wmeToModify = paramWME;
/* 291 */     this.dialog = paramEditWMEDialog;
/*     */   }
/*     */   
/*     */ 
/*     */   WorkingMemoryDebugger$WMEActionListener(WorkingMemoryDebugger paramWorkingMemoryDebugger, WorkingMemoryDebugger.EditWMEDialog paramEditWMEDialog, Class paramClass)
/*     */   {
/* 297 */     this.actionToPerform = 0;
/* 298 */     this.dialog = paramEditWMEDialog;
/*     */     try {
/* 300 */       Constructor localConstructor = paramClass.getConstructor(null);
/* 301 */       this.wmeToModify = ((WME)localConstructor.newInstance(null));
/*     */     } catch (NoSuchMethodException localNoSuchMethodException) {
/* 303 */       throw new WmeReflectionError(localNoSuchMethodException.getMessage());
/* 304 */     } catch (InstantiationException localInstantiationException) { throw new WmeReflectionError(localInstantiationException.getMessage());
/* 305 */     } catch (IllegalAccessException localIllegalAccessException) { throw new WmeReflectionError(localIllegalAccessException.getMessage());
/* 306 */     } catch (InvocationTargetException localInvocationTargetException) { throw new WmeReflectionError(localInvocationTargetException.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   class IllegalWMEFieldValueException extends Exception
/*     */   {
/*     */     public String fieldValue;
/*     */     public Class fieldType;
/*     */     
/*     */     public IllegalWMEFieldValueException(String paramString, Class paramClass) {
/* 316 */       this.fieldValue = paramString;
/* 317 */       this.fieldType = paramClass;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void modifyWME()
/*     */   {
/*     */     WME localWME;
/*     */     try {
/* 325 */       localWME = (WME)this.wmeToModify.getClass().getConstructor(null).newInstance(null);
/* 326 */       localWME.assign(this.wmeToModify);
/* 327 */     } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */     }
/* 329 */     int i = 0;
/*     */     try {
/* 331 */       for (int j = 0; j < this.dialog.wmeFieldTypes.length; j++)
/*     */       {
/* 333 */         String str1 = ((WMEFieldEditor)this.dialog.fieldContainer.getComponent(j)).getFieldValue();
/* 334 */         String str2 = ((JLabel)this.dialog.labelContainer.getComponent(j)).getText();
/*     */         try {
/* 336 */           Method localMethod = this.wmeToModify._getSetMethod(str2, this.dialog.wmeFieldTypes[j]);
/* 337 */           Object[] arrayOfObject1; if (this.dialog.wmeFieldTypes[j] == Boolean.TYPE)
/* 338 */             if ((str1.equals("true")) || (str1.equals("false"))) {
/* 339 */               arrayOfObject1 = new Object[] { new Boolean(str1) };
/* 340 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             } else {
/* 342 */               throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]);
/*     */             }
/*     */           try {
/* 345 */             if (this.dialog.wmeFieldTypes[j] == Byte.TYPE) {
/* 346 */               arrayOfObject1 = new Object[] { new Byte(str1) };
/* 347 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 349 */             if (this.dialog.wmeFieldTypes[j] == Integer.TYPE) {
/* 350 */               arrayOfObject1 = new Object[] { new Integer(str1) };
/* 351 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 353 */             if (this.dialog.wmeFieldTypes[j] == Long.TYPE) {
/* 354 */               arrayOfObject1 = new Object[] { new Long(str1) };
/* 355 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 357 */             if (this.dialog.wmeFieldTypes[j] == Short.TYPE) {
/* 358 */               arrayOfObject1 = new Object[] { new Short(str1) };
/* 359 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 361 */             if (this.dialog.wmeFieldTypes[j] == Float.TYPE) {
/* 362 */               arrayOfObject1 = new Object[] { new Float(str1) };
/* 363 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 365 */             if (this.dialog.wmeFieldTypes[j] == Double.TYPE) {
/* 366 */               arrayOfObject1 = new Object[] { new Double(str1) };
/* 367 */               localMethod.invoke(localWME, arrayOfObject1);
/*     */             }
/* 369 */           } catch (NumberFormatException localNumberFormatException) { throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]); }
/* 370 */           Object localObject; if (this.dialog.wmeFieldTypes[j] == Character.TYPE) {
/* 371 */             localObject = str1.toCharArray();
/* 372 */             if (localObject.length == 1) {
/* 373 */               Object[] arrayOfObject2 = { new Character(localObject[0]) };
/* 374 */               localMethod.invoke(localWME, arrayOfObject2);
/*     */             } else {
/* 376 */               throw new IllegalWMEFieldValueException(str1, this.dialog.wmeFieldTypes[j]);
/*     */             } }
/* 378 */           if (this.dialog.wmeFieldTypes[j].getName().equals("java.lang.String")) {
/* 379 */             localObject = new Object[] { str1 };
/* 380 */             localMethod.invoke(localWME, (Object[])localObject);
/*     */           }
/*     */         } catch (NoSuchFieldException localNoSuchFieldException) {}
/*     */       }
/* 384 */       if (this.actionToPerform == 1) {
/* 385 */         WorkingMemoryDebugger.access$9(this.this$0).modifyWME(this.wmeToModify, localWME);
/* 386 */       } else if (this.actionToPerform == 0)
/* 387 */         WorkingMemoryDebugger.access$9(this.this$0).addWME(localWME);
/* 388 */       this.dialog.dispose();
/*     */     } catch (InvocationTargetException localInvocationTargetException) {
/* 390 */       throw new WmeReflectionError(localInvocationTargetException);
/* 391 */     } catch (IllegalAccessException localIllegalAccessException) { throw new WmeReflectionError(localIllegalAccessException);
/* 392 */     } catch (WorkingMemoryException localWorkingMemoryException) { throw new WorkingMemoryError(localWorkingMemoryException.getMessage());
/*     */     } catch (IllegalWMEFieldValueException localIllegalWMEFieldValueException) {
/* 394 */       JOptionPane.showMessageDialog(this.dialog, "Field value " + localIllegalWMEFieldValueException.fieldValue + " is not a valid " + localIllegalWMEFieldValueException.fieldType);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void actionPerformed(ActionEvent paramActionEvent)
/*     */   {
/* 421 */     modifyWME();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$WMEActionListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */