/*     */ package jess;
/*     */ 
/*     */ import java.util.Map;
/*     */ 
/*     */ class Group implements ConditionalElement, LHSComponent, java.io.Serializable, Visitable
/*     */ {
/*     */   static final String AND = "and";
/*     */   static final String UNIQUE = "unique";
/*     */   static final String EXPLICIT = "explicit";
/*     */   static final String NOT = "not";
/*     */   static final String EXISTS = "exists";
/*     */   static final String TEST = "test";
/*     */   static final String OR = "or";
/*     */   static final String LOGICAL = "logical";
/*     */   
/*     */   private final void jdMethod_this() {
/*  17 */     this.m_unary = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  24 */   private static final Pattern s_initialFactPattern = new Pattern(Deftemplate.getInitialTemplate().getName(), Deftemplate.getInitialTemplate());
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  31 */   private static final Pattern s_logicalInitialFactPattern = new Pattern(Deftemplate.getInitialTemplate().getName(), Deftemplate.getInitialTemplate());
/*     */   private String m_name;
/*     */   
/*  34 */   static { s_logicalInitialFactPattern.setLogical(); }
/*     */   
/*     */   public Object clone()
/*     */   {
/*     */     try {
/*  39 */       Group localGroup = (Group)super.clone();
/*  40 */       localGroup.m_data = new CEVector();
/*  41 */       for (int i = 0; i < this.m_data.size(); i++) {
/*  42 */         localGroup.m_data.add((LHSComponent)getLHSComponent(i).clone());
/*     */       }
/*  44 */       return localGroup;
/*     */     } catch (CloneNotSupportedException localCloneNotSupportedException) {
/*  46 */       throw new IllegalArgumentException();
/*     */     }
/*     */   }
/*     */   
/*  50 */   Group(String paramString) throws JessException { jdMethod_this();
/*  51 */     this.m_data = new CEVector();
/*  52 */     this.m_name = paramString;
/*     */     
/*  54 */     if (this.m_name.equals("explicit")) {
/*  55 */       this.m_explicit = true;
/*  56 */       this.m_unary = true;
/*     */ 
/*     */     }
/*  59 */     else if (this.m_name.equals("logical")) {
/*  60 */       this.m_logical = true;
/*  61 */       this.m_unary = false;
/*     */ 
/*     */     }
/*  64 */     else if (this.m_name.equals("not")) {
/*  65 */       this.m_unary = true;
/*     */ 
/*     */     }
/*  68 */     else if (this.m_name.equals("exists")) {
/*  69 */       throw new JessException("Group::Group", "Invalid CE name", "exists");
/*     */     }
/*     */   }
/*     */   
/*     */   public String getName() {
/*  74 */     return this.m_name;
/*     */   }
/*     */   
/*     */   public int getPatternCount() {
/*  78 */     int i = 0;
/*  79 */     for (int j = 0; j < this.m_data.size(); j++)
/*  80 */       i += this.m_data.get(j).getPatternCount();
/*  81 */     return i;
/*     */   }
/*     */   
/*     */   void add(LHSComponent paramLHSComponent) throws JessException {
/*  85 */     verifyAdditionIsAllowed(paramLHSComponent);
/*     */     
/*     */ 
/*  88 */     if ((paramLHSComponent.getName().equals("or")) && (paramLHSComponent.getGroupSize() == 1)) {
/*  89 */       paramLHSComponent = paramLHSComponent.getLHSComponent(0);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  94 */     if ((paramLHSComponent.getName().equals("and")) && (paramLHSComponent.getGroupSize() == 1) && (!getName().equals("or")))
/*     */     {
/*  96 */       paramLHSComponent = paramLHSComponent.getLHSComponent(0); }
/*     */     Group localGroup1;
/*     */     int i;
/*  99 */     if ((this.m_name.equals("or")) && (paramLHSComponent.getName().equals("or"))) {
/* 100 */       localGroup1 = (Group)paramLHSComponent;
/* 101 */       for (i = 0; i < localGroup1.m_data.size(); i++) {
/* 102 */         add(localGroup1.m_data.get(i));
/*     */       }
/*     */       
/*     */     }
/* 106 */     else if ((this.m_name.equals("and")) && (paramLHSComponent.getName().equals("and"))) {
/* 107 */       localGroup1 = (Group)paramLHSComponent;
/* 108 */       for (i = 0; i < localGroup1.m_data.size(); i++) {
/* 109 */         add(localGroup1.m_data.get(i));
/*     */       }
/*     */       
/*     */ 
/*     */     }
/* 114 */     else if ((this.m_name.equals("not")) && (paramLHSComponent.getName().equals("or"))) {
/* 115 */       this.m_name = "and";
/* 116 */       this.m_unary = false;
/* 117 */       localGroup1 = (Group)paramLHSComponent;
/* 118 */       for (i = 0; i < localGroup1.m_data.size(); i++) {
/* 119 */         Group localGroup2 = new Group("not");
/* 120 */         localGroup2.add(localGroup1.m_data.get(i));
/* 121 */         add(localGroup2);
/*     */ 
/*     */       }
/*     */       
/*     */ 
/*     */     }
/* 127 */     else if ((this.m_name.equals("not")) && (paramLHSComponent.getName().equals("and")) && (hasEmbeddedORs((Group)paramLHSComponent))) {
/* 128 */       paramLHSComponent = paramLHSComponent.canonicalize();
/* 129 */       add(paramLHSComponent);
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 134 */       this.m_data.add(paramLHSComponent);
/*     */     }
/*     */     
/* 137 */     if (this.m_explicit) {
/* 138 */       setExplicit();
/*     */     }
/* 140 */     if (this.m_logical) {
/* 141 */       setLogical();
/*     */     }
/* 143 */     if (getNegated())
/* 144 */       setNegated();
/*     */   }
/*     */   
/*     */   private final boolean hasEmbeddedORs(Group paramGroup) {
/* 148 */     if (paramGroup.getName().equals("or"))
/* 149 */       return true;
/* 150 */     for (int i = 0; i < paramGroup.getGroupSize(); i++) {
/* 151 */       LHSComponent localLHSComponent = paramGroup.getLHSComponent(i);
/* 152 */       if (((localLHSComponent instanceof Group)) && 
/* 153 */         (hasEmbeddedORs((Group)localLHSComponent)))
/* 154 */         return true;
/*     */     }
/* 156 */     return false;
/*     */   }
/*     */   
/*     */   private final void verifyAdditionIsAllowed(LHSComponent paramLHSComponent) throws JessException {
/* 160 */     if ((this.m_data.size() > 0) && (this.m_unary)) {
/* 161 */       throw new JessException("Group.add", "CE is a unary modifier", this.m_name);
/*     */     }
/*     */     
/* 164 */     if ((this.m_name.equals("logical")) && (paramLHSComponent.getName().equals("test"))) {
/* 165 */       throw new JessException("Group.add", "CE can't be used in logical:", "test");
/*     */     }
/*     */     
/* 168 */     if ((this.m_name.equals("not")) && (paramLHSComponent.getName().equals("logical"))) {
/* 169 */       throw new JessException("Group.add", "CE can't be used in not:", "logical");
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean getBackwardChaining()
/*     */   {
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   public void setExplicit() {
/* 179 */     for (int i = 0; i < this.m_data.size(); i++)
/* 180 */       this.m_data.get(i).setExplicit();
/* 181 */     this.m_explicit = true;
/*     */   }
/*     */   
/*     */   public void setLogical() {
/* 185 */     for (int i = 0; i < this.m_data.size(); i++)
/* 186 */       this.m_data.get(i).setLogical();
/* 187 */     this.m_logical = true;
/*     */   }
/*     */   
/*     */   public boolean getLogical() {
/* 191 */     return this.m_logical;
/*     */   }
/*     */   
/*     */   public boolean getNegated() {
/* 195 */     return this.m_name.equals("not");
/*     */   }
/*     */   
/*     */   public void setNegated() {
/* 199 */     for (int i = 0; i < this.m_data.size(); i++)
/* 200 */       this.m_data.get(i).setNegated();
/*     */   }
/*     */   
/*     */   public void setBoundName(String paramString) throws JessException {
/* 204 */     if ((this.m_name.equals("not")) || (this.m_name.equals("test")) || ((this.m_data.size() > 1) && (!this.m_name.equals("or"))))
/*     */     {
/*     */ 
/* 207 */       throw new JessException("Group.setBoundName", "This CE can't be bound to a variable", this.m_name);
/*     */     }
/*     */     
/*     */ 
/* 211 */     for (int i = 0; i < this.m_data.size(); i++)
/* 212 */       this.m_data.get(i).setBoundName(paramString);
/*     */   }
/*     */   
/*     */   public String getBoundName() {
/* 216 */     return this.m_data.get(0).getBoundName();
/*     */   }
/*     */   
/*     */   static boolean isGroupName(String paramString) {
/* 220 */     if ((isNegatedName(paramString)) || (paramString.equals("and")) || (paramString.equals("or")) || (paramString.equals("logical")) || (paramString.equals("explicit"))) 0; return true;
/*     */   }
/*     */   
/*     */   private boolean m_explicit;
/*     */   private boolean m_logical;
/*     */   CEVector m_data;
/*     */   private boolean m_unary;
/*     */   static boolean isNegatedName(String paramString)
/*     */   {
/* 229 */     return paramString.equals("not");
/*     */   }
/*     */   
/*     */   public String toString() {
/* 233 */     StringBuffer localStringBuffer = new StringBuffer("(");
/* 234 */     localStringBuffer.append(this.m_name);
/* 235 */     for (int i = 0; i < this.m_data.size(); i++) {
/* 236 */       localStringBuffer.append('\n');
/* 237 */       localStringBuffer.append(' ');
/* 238 */       localStringBuffer.append(this.m_data.get(i));
/*     */     }
/* 240 */     localStringBuffer.append(")");
/* 241 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   private final int countNumberOfBranches(LHSComponent[] paramArrayOfLHSComponent) throws JessException
/*     */   {
/* 246 */     for (int i = 0; i < paramArrayOfLHSComponent.length; i++) {
/* 247 */       paramArrayOfLHSComponent[i] = this.m_data.get(i).canonicalize();
/*     */     }
/*     */     int j;
/* 250 */     if (this.m_name.equals("or")) {
/* 251 */       i = 0;
/* 252 */       for (j = 0; j < paramArrayOfLHSComponent.length; j++) {
/* 253 */         i += paramArrayOfLHSComponent[j].getGroupSize();
/*     */       }
/*     */     }
/*     */     else {
/* 257 */       i = 1;
/* 258 */       for (j = 0; j < paramArrayOfLHSComponent.length; j++) {
/* 259 */         i *= paramArrayOfLHSComponent[j].getGroupSize();
/*     */       }
/*     */     }
/* 262 */     return i;
/*     */   }
/*     */   
/*     */   public LHSComponent canonicalize()
/*     */     throws JessException
/*     */   {
/* 268 */     LHSComponent[] arrayOfLHSComponent = new LHSComponent[this.m_data.size()];
/* 269 */     int i = countNumberOfBranches(arrayOfLHSComponent);
/*     */     
/* 271 */     if (i == 1) {
/* 272 */       localObject = new Group("or");
/* 273 */       ((Group)localObject).add(this);
/* 274 */       return (LHSComponent)localObject;
/*     */     }
/*     */     
/*     */ 
/* 278 */     Object localObject = new Group[i];
/*     */     
/* 280 */     for (int j = 0; j < i; j++)
/* 281 */       localObject[j] = new Group("and");
/*     */     int m;
/* 283 */     if (this.m_name.equals("or"))
/*     */     {
/*     */ 
/* 286 */       j = 0;
/* 287 */       for (k = 0; k < arrayOfLHSComponent.length; k++) {
/* 288 */         for (m = 0; m < arrayOfLHSComponent[k].getGroupSize(); m++) {
/* 289 */           localObject[(j++)].add(arrayOfLHSComponent[k].getLHSComponent(m));
/*     */         }
/*     */         
/*     */       }
/*     */       
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 298 */       j = i;
/* 299 */       for (k = 0; k < arrayOfLHSComponent.length; k++)
/*     */       {
/* 301 */         if (arrayOfLHSComponent[k].getGroupSize() == 1) {
/* 302 */           for (m = 0; m < i; m++) {
/* 303 */             localObject[m].add(arrayOfLHSComponent[k].getLHSComponent(0));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           j /= arrayOfLHSComponent[k].getGroupSize();
/* 324 */           m = i / (j * arrayOfLHSComponent[k].getGroupSize());
/* 325 */           int n = 0;
/* 326 */           for (int i1 = 0; i1 < m; i1++) {
/* 327 */             for (int i2 = 0; i2 < arrayOfLHSComponent[k].getGroupSize(); i2++)
/* 328 */               for (int i3 = 0; i3 < j; i3++)
/* 329 */                 localObject[(n++)].add(arrayOfLHSComponent[k].getLHSComponent(i2));
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 334 */     Group localGroup1 = new Group("or");
/* 335 */     for (int k = 0; k < i; k++)
/*     */     {
/* 337 */       if ((localObject[k].getGroupSize() == 1) && (!localObject[k].getLHSComponent(0).getName().equals("not")) && (!localObject[k].getLHSComponent(0).getName().equals("test")))
/*     */       {
/*     */ 
/* 340 */         localGroup1.add(localObject[k].getLHSComponent(0));
/*     */       } else {
/* 342 */         localGroup1.add(localObject[k]);
/*     */       }
/*     */     }
/* 345 */     if (this.m_name.equals("not")) {
/* 346 */       Group localGroup2 = new Group("not");
/* 347 */       localGroup2.add(localGroup1);
/* 348 */       return localGroup2.canonicalize();
/*     */     }
/*     */     
/* 351 */     return localGroup1;
/*     */   }
/*     */   
/*     */   void insertInitialFacts()
/*     */   {
/* 356 */     LHSComponent localLHSComponent = getLHSComponent(0);
/* 357 */     if ((this.m_name.equals("and")) && ((this.m_data.size() == 0) || ((localLHSComponent.getName().equals("logical")) && ((isNegatedName(localLHSComponent.getLHSComponent(0).getName())) || (localLHSComponent.getLHSComponent(0).getName().equals("test")))) || (localLHSComponent.getName().equals("not")) || (localLHSComponent.getName().equals("test")) || (localLHSComponent.getBackwardChaining())))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */       this.m_data.addAtStart((localLHSComponent == null) || (!localLHSComponent.getLogical()) ? (Pattern)s_initialFactPattern.clone() : (Pattern)s_logicalInitialFactPattern.clone());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addToLHS(HasLHS paramHasLHS, Rete paramRete)
/*     */     throws JessException
/*     */   {
/* 375 */     if (!getName().equals("and")) {
/* 376 */       throw new JessException("Group.addToLHS", "Bad assumption", getName());
/*     */     }
/* 378 */     for (int i = 0; i < this.m_data.size(); i++) {
/* 379 */       LHSComponent localLHSComponent = this.m_data.get(i);
/* 380 */       paramHasLHS.addCE(localLHSComponent, paramRete);
/*     */     }
/*     */   }
/*     */   
/*     */   void renameVariables(Group paramGroup, HasLHS paramHasLHS)
/*     */     throws JessException
/*     */   {
/* 387 */     java.util.HashMap localHashMap1 = new java.util.HashMap();
/* 388 */     java.util.HashMap localHashMap2 = new java.util.HashMap();
/* 389 */     addDirectlyMatchedVariables(localHashMap1);
/* 390 */     int i = paramHasLHS.getSequenceNumber();
/* 391 */     paramGroup.renameUnmentionedVariables(localHashMap1, localHashMap2, i, paramHasLHS);
/*     */   }
/*     */   
/*     */   public void addToGroup(Group paramGroup) throws JessException {
/* 395 */     insertInitialFacts();
/*     */     
/* 397 */     for (int i = 0; i < this.m_data.size(); i++) {
/* 398 */       LHSComponent localLHSComponent = this.m_data.get(i);
/* 399 */       paramGroup.m_data.add((LHSComponent)localLHSComponent.clone());
/*     */     }
/*     */   }
/*     */   
/*     */   public int getGroupSize() {
/* 404 */     return this.m_data.size();
/*     */   }
/*     */   
/*     */   public boolean isGroup() {
/* 408 */     return true;
/*     */   }
/*     */   
/*     */   public ConditionalElement getConditionalElement(int paramInt) {
/* 412 */     return (ConditionalElement)getLHSComponent(paramInt);
/*     */   }
/*     */   
/*     */   public LHSComponent getLHSComponent(int paramInt) {
/* 416 */     return this.m_data.get(paramInt);
/*     */   }
/*     */   
/*     */   public void addDirectlyMatchedVariables(Map paramMap) throws JessException {
/* 420 */     for (int i = 0; i < this.m_data.size(); i++) {
/* 421 */       this.m_data.get(i).addDirectlyMatchedVariables(paramMap);
/*     */     }
/*     */   }
/*     */   
/*     */   public void renameUnmentionedVariables(Map paramMap1, Map paramMap2, int paramInt, HasLHS paramHasLHS)
/*     */     throws JessException
/*     */   {
/* 428 */     if (isNegatedName(this.m_name)) {
/* 429 */       paramInt = paramHasLHS.getSequenceNumber();
/* 430 */       paramMap2 = new java.util.HashMap(paramMap2);
/*     */     }
/* 432 */     for (int i = 0; i < this.m_data.size(); i++) {
/* 433 */       this.m_data.get(i).renameUnmentionedVariables(paramMap1, paramMap2, paramInt, paramHasLHS);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isBackwardChainingTrigger() {
/* 438 */     return false;
/*     */   }
/*     */   
/* 441 */   public Object accept(Visitor paramVisitor) { return paramVisitor.visitGroup(this); }
/*     */   
/*     */   static class CEVector implements java.io.Serializable {
/* 444 */     CEVector() { jdMethod_this(); }
/* 445 */     private final void jdMethod_this() { this.m_data = new LHSComponent[1]; }
/*     */     
/*     */     private LHSComponent[] m_data;
/*     */     private int m_nData;
/* 449 */     void addAtStart(LHSComponent paramLHSComponent) { if (this.m_data.length == this.m_nData) {
/* 450 */         LHSComponent[] arrayOfLHSComponent = new LHSComponent[this.m_nData * 2];
/* 451 */         System.arraycopy(this.m_data, 0, arrayOfLHSComponent, 0, this.m_nData);
/* 452 */         this.m_data = arrayOfLHSComponent;
/*     */       }
/* 454 */       System.arraycopy(this.m_data, 0, this.m_data, 1, this.m_nData);
/* 455 */       this.m_data[0] = paramLHSComponent;
/* 456 */       this.m_nData += 1;
/*     */     }
/*     */     
/*     */     void add(LHSComponent paramLHSComponent)
/*     */     {
/* 461 */       if (this.m_data.length == this.m_nData) {
/* 462 */         LHSComponent[] arrayOfLHSComponent = new LHSComponent[this.m_nData * 2];
/* 463 */         System.arraycopy(this.m_data, 0, arrayOfLHSComponent, 0, this.m_nData);
/* 464 */         this.m_data = arrayOfLHSComponent;
/*     */       }
/* 466 */       this.m_data[(this.m_nData++)] = paramLHSComponent;
/*     */     }
/*     */     
/*     */     LHSComponent get(int paramInt) {
/* 470 */       return this.m_data[paramInt];
/*     */     }
/*     */     
/*     */     int size()
/*     */     {
/* 475 */       return this.m_nData;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Group.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */