/*     */ package jess;
/*     */ 
/*     */ import java.awt.Button;
/*     */ import java.awt.Frame;
/*     */ import java.awt.Panel;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class View
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   public String getName()
/*     */   {
/*  70 */     return "view";
/*     */   }
/*     */   
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/*  74 */     HasLHS localHasLHS = null;
/*  75 */     if (paramValueVector.size() > 1) {
/*  76 */       localHasLHS = paramContext.getEngine().findDefrule(paramValueVector.get(1).stringValue(paramContext));
/*     */       
/*  78 */       if (localHasLHS == null) {
/*  79 */         throw new JessException("view", "No such rule or query", paramValueVector.get(1).stringValue(paramContext));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  84 */     Rete localRete = paramContext.getEngine();
/*  85 */     Frame localFrame = new Frame("Network View");
/*  86 */     Graph localGraph = new Graph(paramContext.getEngine(), localHasLHS);
/*  87 */     localRete.setEventMask(localRete.getEventMask() | 0x1);
/*  88 */     localRete.addJessListener(localGraph);
/*     */     
/*  90 */     localFrame.add(localGraph, "Center");
/*  91 */     localFrame.setSize(500, 500);
/*     */     
/*  93 */     Panel localPanel = new Panel();
/*  94 */     Button localButton = new Button("Home");
/*  95 */     localButton.addActionListener(new View.1(this, localGraph));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 100 */     localPanel.add(localButton);
/*     */     
/* 102 */     localFrame.add("South", localPanel);
/* 103 */     localFrame.addWindowListener(new View.2(this, localFrame, localGraph, localRete));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */     localFrame.validate();
/* 112 */     localFrame.setVisible(true);
/* 113 */     return Funcall.TRUE;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\View.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */