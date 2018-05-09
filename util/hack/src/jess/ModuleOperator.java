/*     */ package jess;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Serializable;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class ModuleOperator
/*     */   implements Serializable
/*     */ {
/*     */   String getModule(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 192 */     return paramValueVector.size() == 1 ? paramContext.getEngine().getCurrentModule() : paramValueVector.get(1).stringValue(paramContext);
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
/*     */   class NullFilter
/*     */     implements ModuleOperator.Filter
/*     */   {
/* 208 */     public boolean accept(Modular paramModular) { return true; }
/*     */     
/*     */     NullFilter() {}
/*     */   }
/*     */   
/*     */   class NameFilter implements ModuleOperator.Filter {
/*     */     private String m_name;
/*     */     
/* 216 */     NameFilter(String paramString) { this.m_name = paramString; }
/*     */     
/*     */     public boolean accept(Modular paramModular)
/*     */     {
/* 220 */       return this.m_name.equals(paramModular.getModule());
/*     */     }
/*     */   }
/*     */   
/*     */   Filter chooseFilter(String paramString, Rete paramRete) throws JessException {
/* 225 */     if (paramString.equals("*")) {
/* 226 */       return new NullFilter();
/*     */     }
/*     */     
/* 229 */     paramRete.verifyModule(paramString);
/* 230 */     return new NameFilter(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   Value displayAll(Iterator paramIterator, ValueVector paramValueVector, Context paramContext, String paramString, Displayer paramDisplayer)
/*     */     throws JessException
/*     */   {
/* 238 */     String str = getModule(paramValueVector, paramContext);
/* 239 */     Rete localRete = paramContext.getEngine();
/* 240 */     Filter localFilter = chooseFilter(str, localRete);
/* 241 */     PrintWriter localPrintWriter = localRete.getOutStream();
/* 242 */     int i = 0;
/* 243 */     while (paramIterator.hasNext()) {
/* 244 */       Modular localModular = (Modular)paramIterator.next();
/* 245 */       if (localFilter.accept(localModular)) {
/* 246 */         paramDisplayer.display(localModular, localPrintWriter);
/* 247 */         i++;
/*     */       }
/*     */     }
/*     */     
/* 251 */     localPrintWriter.print("For a total of ");
/* 252 */     localPrintWriter.print(i);
/* 253 */     localPrintWriter.print(" ");
/* 254 */     localPrintWriter.print(paramString);
/* 255 */     localPrintWriter.println(".");
/* 256 */     localPrintWriter.flush();
/* 257 */     return Funcall.NIL;
/*     */   }
/*     */   
/*     */   static abstract interface Filter
/*     */   {
/*     */     public abstract boolean accept(Modular paramModular);
/*     */   }
/*     */   
/*     */   static abstract interface Displayer
/*     */   {
/*     */     public abstract void display(Modular paramModular, PrintWriter paramPrintWriter);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ModuleOperator.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */