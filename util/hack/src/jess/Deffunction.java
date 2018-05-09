/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ public class Deffunction
/*     */   implements Userfunction, Serializable, Visitable
/*     */ {
/*     */   private String m_name;
/*     */   private String m_docstring;
/*     */   private ArrayList m_arguments;
/*     */   private ArrayList m_actions;
/*     */   private boolean m_hasWildcard;
/*     */   
/*     */   public static class Argument implements Serializable
/*     */   {
/*     */     String m_name;
/*     */     int m_type;
/*     */     
/*     */     Argument(String paramString, int paramInt)
/*     */     {
/*  23 */       this.m_name = paramString;
/*  24 */       this.m_type = paramInt;
/*     */     }
/*     */     
/*     */     public String getName()
/*     */     {
/*  29 */       return this.m_name;
/*     */     }
/*     */     
/*     */     public int getType() {
/*  33 */       return this.m_type;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void jdMethod_this() {
/*  38 */     this.m_docstring = "";
/*  39 */     this.m_arguments = new ArrayList();
/*  40 */     this.m_actions = new ArrayList();
/*  41 */     this.m_hasWildcard = false;
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getName()
/*     */   {
/*  47 */     return this.m_name;
/*     */   }
/*     */   
/*     */ 
/*     */   public final String getDocstring()
/*     */   {
/*  53 */     return this.m_docstring;
/*     */   }
/*     */   
/*     */ 
/*     */   public final void setDocstring(String paramString)
/*     */   {
/*  59 */     this.m_docstring = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Deffunction(String paramString1, String paramString2)
/*     */   {
/*  66 */     jdMethod_this();
/*  67 */     this.m_name = paramString1;
/*  68 */     this.m_docstring = paramString2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Iterator getArguments()
/*     */   {
/*  75 */     return this.m_arguments.iterator();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Iterator getActions()
/*     */   {
/*  82 */     return this.m_actions.iterator();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addArgument(String paramString, int paramInt)
/*     */     throws JessException
/*     */   {
/*  93 */     if (this.m_hasWildcard) {
/*  94 */       throw new JessException("Deffunction.addArgument", "Deffunction " + this.m_name + " already has a wildcard argument:", paramString);
/*     */     }
/*     */     
/*  97 */     this.m_arguments.add(new Argument(paramString, paramInt));
/*  98 */     if (paramInt == 8192) {
/*  99 */       this.m_hasWildcard = true;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addAction(Funcall paramFuncall)
/*     */     throws JessException
/*     */   {
/* 109 */     this.m_actions.add(new FuncallValue(paramFuncall));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addValue(Value paramValue)
/*     */   {
/* 119 */     this.m_actions.add(paramValue);
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
/*     */   public Value call(ValueVector paramValueVector, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 137 */     Context localContext = paramContext.getEngine().getGlobalContext().push();
/* 138 */     localContext.clearReturnValue();
/* 139 */     Value localValue1 = Funcall.NIL;
/*     */     
/*     */     try
/*     */     {
/* 143 */       int i = this.m_arguments.size() - this.m_hasWildcard;
/*     */       
/*     */ 
/* 146 */       if (paramValueVector.size() < i + 1) {
/* 147 */         throw new JessException(this.m_name, "Too few arguments to deffunction", this.m_name);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       for (int j = 0; j < this.m_arguments.size(); j++) {
/* 155 */         Argument localArgument = (Argument)this.m_arguments.get(j);
/* 156 */         switch (localArgument.m_type)
/*     */         {
/*     */         case -2: 
/*     */           break;
/*     */         
/*     */ 
/*     */         case 8: 
/* 163 */           localContext.setVariable(localArgument.m_name, paramValueVector.get(j + 1).resolveValue(paramContext));
/*     */           
/* 165 */           break;
/*     */         
/*     */         case 8192: 
/* 168 */           ValueVector localValueVector1 = new ValueVector();
/* 169 */           for (int m = j + 1; m < paramValueVector.size(); m++) {
/* 170 */             Value localValue2 = paramValueVector.get(m).resolveValue(paramContext);
/* 171 */             if (localValue2.type() == 512) {
/* 172 */               ValueVector localValueVector2 = localValue2.listValue(paramContext);
/* 173 */               for (int n = 0; n < localValueVector2.size(); n++) {
/* 174 */                 localValueVector1.add(localValueVector2.get(n).resolveValue(paramContext));
/*     */               }
/*     */             } else {
/* 177 */               localValueVector1.add(localValue2);
/*     */             } }
/* 179 */           localContext.setVariable(localArgument.m_name, new Value(localValueVector1, 512));
/*     */         }
/*     */         
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 186 */       j = this.m_actions.size();
/* 187 */       for (int k = 0; k < j; k++) {
/* 188 */         localValue1 = ((Value)this.m_actions.get(k)).resolveValue(localContext);
/*     */         
/* 190 */         if (localContext.returning()) {
/* 191 */           localValue1 = localContext.getReturnValue();
/* 192 */           localContext.clearReturnValue();
/* 193 */           break;
/*     */         }
/*     */       }
/*     */     } catch (JessException localJessException) {
/* 197 */       localJessException.addContext("deffunction " + this.m_name);
/* 198 */       throw localJessException;
/*     */     } finally {
/* 200 */       localContext.pop();
/*     */     }
/* 202 */     return localValue1.resolveValue(localContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 210 */     return "[deffunction " + this.m_name + ']';
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 214 */     return paramVisitor.visitDeffunction(this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Deffunction.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */