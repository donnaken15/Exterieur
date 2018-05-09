/*     */ package jess;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class Defrule
/*     */   extends HasLHS
/*     */   implements Serializable
/*     */ {
/*     */   private HashMap m_activations;
/*     */   private Funcall[] m_actions;
/*     */   private int m_nActions;
/*     */   private int m_salience;
/*     */   Value m_salienceVal;
/*     */   private boolean m_autoFocus;
/*     */   private LogicalNode m_logicalNode;
/*     */   
/*     */   Defrule(String paramString1, String paramString2, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  24 */     super(paramString1, paramString2, paramRete);jdMethod_this();
/*     */     
/*  26 */     this.m_salience = 0;
/*  27 */     this.m_salienceVal = new Value(0, 4);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  35 */   public final int getSalience() { return this.m_salience; }
/*     */   
/*     */   void setSalience(Value paramValue, Rete paramRete) throws JessException {
/*  38 */     this.m_salienceVal = paramValue;
/*  39 */     evalSalience(paramRete);
/*     */   }
/*     */   
/*     */   public boolean getAutoFocus() {
/*  43 */     return this.m_autoFocus;
/*     */   }
/*     */   
/*     */   public void setAutoFocus(boolean paramBoolean) {
/*  47 */     this.m_autoFocus = paramBoolean;
/*     */   }
/*     */   
/*     */   void addCE(LHSComponent paramLHSComponent, Rete paramRete) throws JessException {
/*  51 */     if ((paramLHSComponent.getLogical()) && (getGroupSize() > 0) && 
/*  52 */       (!getLHSComponent(getGroupSize() - 1).getLogical())) {
/*  53 */       throw new JessException("Defrule.addCE", "Logical CEs can't follow non-logical CEs", this.m_name);
/*     */     }
/*     */     
/*     */ 
/*  57 */     super.addCE(paramLHSComponent, paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized int evalSalience(Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  69 */     Context localContext = paramRete.getGlobalContext().push();
/*     */     try {
/*  71 */       this.m_salience = this.m_salienceVal.intValue(localContext);
/*     */     } finally {
/*  73 */       localContext.pop();
/*     */     }
/*  75 */     return this.m_salience;
/*     */   }
/*     */   
/*     */   private final void doAddCall(Token paramToken, Rete paramRete) throws JessException {
/*  79 */     Activation localActivation = new Activation(paramToken, this);
/*  80 */     paramRete.addActivation(localActivation);
/*  81 */     this.m_activations.put(paramToken, localActivation);
/*     */   }
/*     */   
/*     */   private final void possiblyDoAddCall(Token paramToken, Rete paramRete)
/*     */     throws JessException
/*     */   {
/*  87 */     if (!this.m_new) {
/*  88 */       return;
/*     */     }
/*     */     
/*  91 */     if (this.m_activations.get(paramToken) != null) {
/*  92 */       return;
/*     */     }
/*     */     
/*  95 */     doAddCall(paramToken, paramRete);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void callNodeLeft(Token paramToken, Context paramContext)
/*     */     throws JessException
/*     */   {
/* 104 */     broadcastEvent(32768, paramToken);
/*     */     
/* 106 */     switch (paramToken.m_tag)
/*     */     {
/*     */     case 0: 
/* 109 */       doAddCall(paramToken, paramContext.getEngine());
/* 110 */       break;
/*     */     
/*     */ 
/*     */     case 1: 
/* 114 */       Activation localActivation = (Activation)this.m_activations.remove(paramToken);
/* 115 */       if (localActivation != null)
/* 116 */         paramContext.getEngine().removeActivation(localActivation);
/* 117 */       break;
/*     */     
/*     */ 
/*     */     case 2: 
/* 121 */       possiblyDoAddCall(paramToken, paramContext.getEngine());
/* 122 */       break;
/*     */     
/*     */ 
/*     */     case 3: 
/* 126 */       this.m_activations.clear();
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void ready(Token paramToken, Context paramContext)
/*     */   {
/* 137 */     for (Object localObject1 = getBindings().elements(); ((Enumeration)localObject1).hasMoreElements();) {
/* 138 */       BindingValue localBindingValue = (BindingValue)((Enumeration)localObject1).nextElement();
/*     */       
/* 140 */       if (localBindingValue.getSlotIndex() != -2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         Fact localFact = paramToken.fact(localBindingValue.getFactNumber());
/*     */         try { Object localObject2;
/* 149 */           if (localBindingValue.getSlotIndex() == -1) {
/* 150 */             localObject2 = new FactIDValue(localFact);
/*     */ 
/*     */           }
/* 153 */           else if (localBindingValue.getSubIndex() == -1) {
/* 154 */             localObject2 = localFact.get(localBindingValue.getSlotIndex());
/*     */           }
/*     */           else
/*     */           {
/* 158 */             ValueVector localValueVector = localFact.get(localBindingValue.getSlotIndex()).listValue(paramContext);
/* 159 */             localObject2 = localValueVector.get(localBindingValue.getSubIndex());
/*     */           }
/*     */           
/*     */ 
/* 163 */           paramContext.setVariable(localBindingValue.getName(), (Value)localObject2);
/*     */         }
/*     */         catch (Throwable localThrowable) {}
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */     if (this.m_logicalNode != null) {
/* 178 */       localObject1 = paramToken;
/* 179 */       int i = paramToken.size();
/*     */       
/* 181 */       int j = this.m_logicalNode.getTokenSize();
/* 182 */       while (i > j) {
/* 183 */         localObject1 = ((Token)localObject1).getParent();
/* 184 */         i--;
/*     */       }
/*     */       
/* 187 */       paramContext.setLogicalSupportNode(this.m_logicalNode);
/* 188 */       paramContext.setToken((Token)localObject1);
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
/*     */   synchronized void fire(Token paramToken, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 204 */     this.m_activations.remove(paramToken);
/* 205 */     Context localContext = paramRete.getGlobalContext().push();
/* 206 */     localContext.clearReturnValue();
/*     */     
/*     */ 
/* 209 */     ready(paramToken, localContext);
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 214 */       for (int i = 0; i < this.m_nActions; i++) {
/* 215 */         this.m_actions[i].execute(localContext);
/*     */         
/* 217 */         if (localContext.returning()) {
/* 218 */           localContext.clearReturnValue();
/* 219 */           localContext.pop();
/* 220 */           paramRete.popFocus(getModule());
/* 221 */           return;
/*     */         }
/*     */       }
/*     */     } catch (JessException localJessException) {
/* 225 */       localJessException.addContext("defrule " + getDisplayName());
/* 226 */       throw localJessException;
/*     */     } finally {
/* 228 */       localContext.pop();
/*     */     }
/*     */   }
/*     */   
/*     */   void debugPrint(Token paramToken, int paramInt, PrintWriter paramPrintWriter)
/*     */   {
/* 234 */     paramPrintWriter.print("FIRE ");
/* 235 */     paramPrintWriter.print(paramInt);
/* 236 */     paramPrintWriter.print(" ");
/* 237 */     paramPrintWriter.print(getDisplayName());
/* 238 */     for (int i = 0; i < paramToken.size(); i++) {
/* 239 */       Fact localFact = paramToken.fact(i);
/* 240 */       if (localFact.getFactId() != -1)
/* 241 */         paramPrintWriter.print(" f-" + localFact.getFactId());
/* 242 */       if (i < paramToken.size() - 1)
/* 243 */         paramPrintWriter.print(",");
/*     */     }
/* 245 */     paramPrintWriter.println();
/* 246 */     paramPrintWriter.flush();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int getNActions()
/*     */   {
/* 253 */     return this.m_nActions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Funcall getAction(int paramInt)
/*     */   {
/* 260 */     return this.m_actions[paramInt];
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void addAction(Funcall paramFuncall)
/*     */   {
/* 268 */     if ((this.m_actions == null) || (this.m_nActions == this.m_actions.length)) {
/* 269 */       Funcall[] arrayOfFuncall = this.m_actions;
/* 270 */       this.m_actions = new Funcall[this.m_nActions + 5];
/* 271 */       if (arrayOfFuncall != null)
/* 272 */         System.arraycopy(arrayOfFuncall, 0, this.m_actions, 0, this.m_nActions);
/*     */     }
/* 274 */     this.m_actions[(this.m_nActions++)] = paramFuncall;
/*     */   }
/*     */   
/*     */   public Object accept(Visitor paramVisitor) {
/* 278 */     return paramVisitor.visitDefrule(this);
/*     */   }
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  16 */     this.m_activations = new HashMap();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  21 */     this.m_autoFocus = false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */     this.m_logicalNode = null; }
/*     */   
/* 283 */   void setLogicalInformation(LogicalNode paramLogicalNode) { this.m_logicalNode = paramLogicalNode; }
/*     */   
/*     */   public String toString()
/*     */   {
/* 287 */     return "Defrule " + getName();
/*     */   }
/*     */   
/*     */   LogicalNode getLogicalNode()
/*     */   {
/* 292 */     return this.m_logicalNode;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Defrule.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */