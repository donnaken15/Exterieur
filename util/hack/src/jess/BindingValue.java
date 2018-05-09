/*     */ package jess;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BindingValue
/*     */   extends Value
/*     */   implements Serializable
/*     */ {
/*     */   private String m_name;
/*     */   private int m_factNumber;
/*     */   private int m_slotIndex;
/*     */   private int m_subIndex;
/*     */   private int m_type;
/*     */   private LHSComponent m_pattern;
/*     */   
/*     */   BindingValue(String paramString, LHSComponent paramLHSComponent, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */     throws JessException
/*     */   {
/*  22 */     this.m_name = paramString;
/*  23 */     this.m_pattern = paramLHSComponent;
/*  24 */     this.m_factNumber = paramInt1;
/*  25 */     this.m_slotIndex = paramInt2;
/*  26 */     this.m_subIndex = paramInt3;
/*  27 */     this.m_type = paramInt4;
/*     */   }
/*     */   
/*     */   BindingValue(BindingValue paramBindingValue) {
/*  31 */     super(paramBindingValue);
/*  32 */     this.m_name = paramBindingValue.m_name;
/*  33 */     this.m_factNumber = paramBindingValue.m_factNumber;
/*  34 */     this.m_slotIndex = paramBindingValue.m_slotIndex;
/*  35 */     this.m_subIndex = paramBindingValue.m_subIndex;
/*  36 */     this.m_type = paramBindingValue.m_type;
/*  37 */     this.m_pattern = paramBindingValue.m_pattern;
/*     */   }
/*     */   
/*     */   public void resetFactNumber()
/*     */   {
/*  42 */     this.m_factNumber = 0;
/*     */   }
/*     */   
/*  45 */   public String getName() { return this.m_name; }
/*  46 */   public int getFactNumber() { return this.m_factNumber; }
/*  47 */   public int getSlotIndex() { return this.m_slotIndex; }
/*  48 */   public int getSubIndex() { return this.m_subIndex; }
/*  49 */   public int getType() { return this.m_type; }
/*  50 */   LHSComponent getCE() { return this.m_pattern; }
/*     */   
/*     */   public Value resolveValue(Context paramContext) throws JessException {
/*  53 */     if (paramContext == null) {
/*  54 */       throw new JessException("BindingValue.resolveValue", "Null context ", "");
/*     */     }
/*     */     
/*  57 */     Token localToken = paramContext.getToken();
/*     */     
/*     */     Fact localFact;
/*     */     
/*  61 */     if ((localToken == null) || (this.m_factNumber == localToken.size())) {
/*  62 */       localFact = paramContext.getFact();
/*     */     } else {
/*  64 */       localFact = localToken.fact(this.m_factNumber);
/*     */     }
/*  66 */     Value localValue = localFact.get(this.m_slotIndex);
/*     */     
/*  68 */     if (this.m_subIndex == -1) {
/*  69 */       return localValue;
/*     */     }
/*     */     
/*  72 */     ValueVector localValueVector = localValue.listValue(null);
/*  73 */     return localValueVector.get(this.m_subIndex);
/*     */   }
/*     */   
/*     */   public final Object externalAddressValue(Context paramContext) throws JessException
/*     */   {
/*  78 */     return resolveValue(paramContext).externalAddressValue(paramContext);
/*     */   }
/*     */   
/*     */   public final Fact factValue(Context paramContext) throws JessException {
/*  82 */     return resolveValue(paramContext).factValue(paramContext);
/*     */   }
/*     */   
/*     */   public final ValueVector listValue(Context paramContext) throws JessException {
/*  86 */     return resolveValue(paramContext).listValue(paramContext);
/*     */   }
/*     */   
/*     */   public final int intValue(Context paramContext) throws JessException {
/*  90 */     return resolveValue(paramContext).intValue(paramContext);
/*     */   }
/*     */   
/*     */   public final double floatValue(Context paramContext) throws JessException {
/*  94 */     return resolveValue(paramContext).floatValue(paramContext);
/*     */   }
/*     */   
/*     */   public final double numericValue(Context paramContext) throws JessException {
/*  98 */     return resolveValue(paramContext).numericValue(paramContext);
/*     */   }
/*     */   
/*     */   public final String atomValue(Context paramContext) throws JessException {
/* 102 */     return resolveValue(paramContext).atomValue(paramContext);
/*     */   }
/*     */   
/*     */   public final String variableValue(Context paramContext) throws JessException {
/* 106 */     return super.stringValue(paramContext);
/*     */   }
/*     */   
/*     */   public final String stringValue(Context paramContext) throws JessException {
/* 110 */     return resolveValue(paramContext).stringValue(paramContext);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 114 */     return "?" + this.m_name;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 118 */     return this.m_factNumber + 512 * this.m_slotIndex + 262144 * this.m_subIndex;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Value paramValue)
/*     */   {
/* 126 */     if (!(paramValue instanceof BindingValue)) {
/* 127 */       return false;
/*     */     }
/* 129 */     BindingValue localBindingValue = (BindingValue)paramValue;
/*     */     
/* 131 */     if ((this.m_factNumber == localBindingValue.m_factNumber) && (this.m_slotIndex == localBindingValue.m_slotIndex) && (this.m_subIndex == localBindingValue.m_subIndex)) 0; return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\BindingValue.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */