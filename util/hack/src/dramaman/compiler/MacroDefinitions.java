/*    */ package dramaman.compiler;
/*    */ 
/*    */ 
/*    */ public abstract interface MacroDefinitions
/*    */ {
/*  6 */   public static final String eol = System.getProperty("line.separator");
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
/* 40 */   public static final String wmeTestGetWMEListNoMemoryMacroString = "definemacro wmeTestGetWMEListNoMemory(wmeCount, wmeClassName)List wmeList@wmeCount;" + eol + "Iterator wmeIter@wmeCount;" + eol + "wmeList@wmeCount = DramaManager.lookupWME(\"wmeClassName\");" + eol + "wmeIter@wmeCount = wmeList@wmeCount.listIterator();";
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 47 */   public static final String wmeTestGetWMEListMemoryMacroString = "definemacro wmeTestGetWMEListMemory(wmeCount, wmeClassName, memoryName)List wmeList@wmeCount;" + eol + "Iterator wmeIter@wmeCount;" + eol + "wmeList@wmeCount = WorkingMemory.lookupWME(\"memoryName\", \"wmeClassName\");" + eol + "wmeIter@wmeCount = wmeList@wmeCount.listIterator();";
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final String wmeTestWhileMacroString = "definemacro wmeTestWhile(wmeCount)while(wmeIter@wmeCount.hasNext()) {";
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 58 */   public static final String wmeTestWhileNextAssignMacroString = "definemacro wmeTestWhileNext(wmeCount, wmeClassName, wmeAssignVar)wmeClassName wme__@wmeCount = (wmeClassName)wmeIter@wmeCount.next();" + eol + "wmeAssignVar = wme__@wmeCount;";
/*    */   public static final String wmeTestWhileNextNoAssignMacroString = "definemacro wmeTestWhileNext(wmeCount, wmeClassName)wmeClassName wme__@wmeCount = (wmeClassName)wmeIter@wmeCount.next();";
/*    */   public static final String scopeInitializerMacroString = "definemacro scope(parentScope, scopeName)new VariableScopeThrowsErrors(parentScope, \"@scopeName_scope\")";
/*    */   public static final String defineVariableMacroString = "definemacro defineVariable(variableName, initializer, type)_scope.defineVariable(\"variableName\", initializer, \"type\");";
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\MacroDefinitions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */