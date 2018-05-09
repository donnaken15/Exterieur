/*     */ package jess;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.awt.Panel;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Graph
/*     */   extends Panel
/*     */   implements MouseListener, MouseMotionListener, JessListener
/*     */ {
/* 184 */   static final Color m_selectColor = Color.pink;
/*     */   
/*     */   static final int WIDTH = 10;
/*     */   
/*     */   static final int HW = 5;
/*     */   
/*     */   static final int HEIGHT = 10;
/*     */   
/*     */   static final int HH = 5;
/* 193 */   private static HashMap m_colors = new HashMap();
/*     */   private int m_nVNodes;
/*     */   
/* 196 */   static { Class tmp22_19 = class$jess$Node1;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */     if (tmp22_19 == null) tmp22_19; tmp22_19.put(class$jess$Node1 = class$("[Ljess.Node1;", false), Color.red); Class 
/* 197 */       tmp50_47 = class$jess$Node1LTR;
/* 197 */     if (tmp50_47 == null) tmp50_47; tmp50_47.put(class$jess$Node1LTR = class$("[Ljess.Node1LTR;", false), Color.orange); Class 
/* 198 */       tmp79_76 = class$jess$Node1RTL;
/* 198 */     if (tmp79_76 == null) tmp79_76; tmp79_76.put(class$jess$Node1RTL = class$("[Ljess.Node1RTL;", false), Color.orange); Class 
/* 199 */       tmp108_105 = class$jess$Node2;
/* 199 */     if (tmp108_105 == null) tmp108_105; tmp108_105.put(class$jess$Node2 = class$("[Ljess.Node2;", false), Color.green); Class 
/* 200 */       tmp137_134 = class$jess$NodeNot2;
/* 200 */     if (tmp137_134 == null) tmp137_134; tmp137_134.put(class$jess$NodeNot2 = class$("[Ljess.NodeNot2;", false), Color.yellow); Class 
/* 201 */       tmp166_163 = class$jess$NodeNot2Single;
/* 201 */     if (tmp166_163 == null) tmp166_163; tmp166_163.put(class$jess$NodeNot2Single = class$("[Ljess.NodeNot2Single;", false), Color.yellow); Class 
/* 202 */       tmp195_192 = class$jess$NodeJoin;
/* 202 */     if (tmp195_192 == null) tmp195_192; tmp195_192.put(class$jess$NodeJoin = class$("[Ljess.NodeJoin;", false), Color.blue); Class 
/* 203 */       tmp224_221 = class$jess$Defrule;
/* 203 */     if (tmp224_221 == null) tmp224_221; tmp224_221.put(class$jess$Defrule = class$("[Ljess.Defrule;", false), Color.cyan);
/*     */   }
/*     */   
/*     */   private VNode[] m_VNodes;
/*     */   private int m_nVEdges;
/*     */   private VEdge[] m_VEdges;
/*     */   private VNode m_pick;
/*     */   private Node m_show;
/*     */   private Image m_offscreen;
/*     */   private Dimension m_offscreensize;
/*     */   private Graphics m_offgraphics;
/*     */   private transient Rete m_rete;
/*     */   private long m_lastMD;
/*     */   private final void jdMethod_this()
/*     */   {
/* 190 */     this.m_nextSlot = new int[100];
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */     this.m_edgeColors = new Color[] { Color.green, Color.blue };
/*     */   }
/*     */   
/*     */   Graph(Rete paramRete, HasLHS paramHasLHS) {
/* 210 */     jdMethod_this();
/* 211 */     this.m_rete = paramRete;
/* 212 */     addMouseListener(this);
/* 213 */     addMouseMotionListener(this);
/* 214 */     setSize(500, 500);
/* 215 */     this.m_haslhs = paramHasLHS;
/* 216 */     init();
/*     */   }
/*     */   
/*     */   int findVNode(Node paramNode, int paramInt) {
/* 220 */     for (int i = 0; i < this.m_nVNodes; i++) {
/* 221 */       if (this.m_VNodes[i].m_node == paramNode) {
/* 222 */         return i;
/*     */       }
/*     */     }
/* 225 */     return addVNode(paramNode, paramInt);
/*     */   }
/*     */   
/*     */   private final Color getNodeColor(Node paramNode) {
/* 229 */     Color localColor = (Color)m_colors.get(paramNode.getClass());
/* 230 */     if (localColor != null) {
/* 231 */       return localColor;
/*     */     }
/* 233 */     if ((paramNode instanceof Node1)) {
/* 234 */       Class tmp33_30 = class$jess$Node1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */       if (tmp33_30 == null) tmp33_30; return (Color)tmp33_30.get(class$jess$Node1 = class$("[Ljess.Node1;", false));
/*     */     }
/*     */     
/* 237 */     return Color.black;
/*     */   }
/*     */   
/*     */   private final Color getEdgeColor(Node paramNode) {
/* 241 */     int i = true - (paramNode instanceof NodeJoin);
/* 242 */     if ((paramNode instanceof Node1RTL)) {
/* 243 */       i = 0;
/*     */     }
/* 245 */     if ((i < 0) || (i > this.m_edgeColors.length)) {
/* 246 */       return Color.black;
/*     */     }
/* 248 */     return this.m_edgeColors[i];
/*     */   }
/*     */   
/*     */   int addVNode(Node paramNode, int paramInt) {
/* 252 */     VNode localVNode = new VNode((this.m_nextSlot[paramInt] += 1) * 15, paramInt * 15, getNodeColor(paramNode), paramNode);
/*     */     
/*     */ 
/*     */ 
/* 256 */     if (this.m_nVNodes == this.m_VNodes.length) {
/* 257 */       VNode[] arrayOfVNode = new VNode[this.m_nVNodes * 2];
/* 258 */       System.arraycopy(this.m_VNodes, 0, arrayOfVNode, 0, this.m_nVNodes);
/* 259 */       this.m_VNodes = arrayOfVNode;
/*     */     }
/*     */     
/* 262 */     this.m_VNodes[this.m_nVNodes] = localVNode;
/* 263 */     return this.m_nVNodes++;
/*     */   }
/*     */   
/*     */   void addVEdge(Node paramNode1, Node paramNode2, int paramInt, Color paramColor) {
/* 267 */     VEdge localVEdge = new VEdge(findVNode(paramNode1, paramInt), findVNode(paramNode2, paramInt + 1), paramColor);
/* 268 */     if (this.m_nVEdges == this.m_VEdges.length) {
/* 269 */       VEdge[] arrayOfVEdge = new VEdge[this.m_nVEdges * 2];
/* 270 */       System.arraycopy(this.m_VEdges, 0, arrayOfVEdge, 0, this.m_nVEdges);
/* 271 */       this.m_VEdges = arrayOfVEdge;
/*     */     }
/* 273 */     this.m_VEdges[(this.m_nVEdges++)] = localVEdge;
/*     */   }
/*     */   
/*     */   public void paintVNode(Graphics paramGraphics, VNode paramVNode) {
/* 277 */     int i = paramVNode.m_x;
/* 278 */     int j = paramVNode.m_y;
/* 279 */     paramGraphics.setColor(paramVNode == this.m_pick ? m_selectColor : paramVNode.m_c);
/* 280 */     int k = 10;
/* 281 */     int m = 10;
/* 282 */     paramGraphics.fillRect(i - k / 2, j - m / 2, k, m);
/* 283 */     paramGraphics.setColor(Color.black);
/* 284 */     paramGraphics.drawRect(i - k / 2, j - m / 2, k - 1, m - 1);
/*     */   }
/*     */   
/*     */   public synchronized void update(Graphics paramGraphics) {
/* 288 */     paint(paramGraphics);
/*     */   }
/*     */   
/*     */   public synchronized void paint(Graphics paramGraphics) {
/* 292 */     Dimension localDimension = getSize();
/* 293 */     if ((this.m_offscreen == null) || (localDimension.width != this.m_offscreensize.width) || (localDimension.height != this.m_offscreensize.height))
/*     */     {
/*     */ 
/* 296 */       this.m_offscreen = createImage(localDimension.width, localDimension.height);
/* 297 */       this.m_offscreensize = localDimension;
/* 298 */       this.m_offgraphics = this.m_offscreen.getGraphics();
/* 299 */       this.m_offgraphics.setFont(getFont());
/*     */     }
/*     */     
/* 302 */     this.m_offgraphics.setColor(getBackground());
/* 303 */     this.m_offgraphics.fillRect(0, 0, localDimension.width, localDimension.height);
/* 304 */     Object localObject; int j; for (int i = 0; i < this.m_nVEdges; i++) {
/* 305 */       localObject = this.m_VEdges[i];
/* 306 */       j = this.m_VNodes[localObject.m_from].m_x;
/* 307 */       int k = this.m_VNodes[localObject.m_from].m_y;
/* 308 */       int m = this.m_VNodes[localObject.m_to].m_x;
/* 309 */       int n = this.m_VNodes[localObject.m_to].m_y;
/* 310 */       this.m_offgraphics.setColor(((VEdge)localObject).m_c);
/* 311 */       this.m_offgraphics.drawLine(j, k, m, n);
/*     */     }
/*     */     
/* 314 */     for (i = 0; i < this.m_nVNodes; i++) {
/* 315 */       paintVNode(this.m_offgraphics, this.m_VNodes[i]);
/*     */     }
/*     */     
/* 318 */     FontMetrics localFontMetrics = this.m_offgraphics.getFontMetrics();
/*     */     
/* 320 */     if (this.m_show != null) {
/* 321 */       this.m_offgraphics.setColor(Color.black);
/* 322 */       localObject = this.m_show.toString();
/* 323 */       j = localFontMetrics.getHeight();
/* 324 */       this.m_offgraphics.drawString((String)localObject, 10, localDimension.height - j + localFontMetrics.getAscent());
/*     */     }
/*     */     
/* 327 */     paramGraphics.drawImage(this.m_offscreen, 0, 0, null);
/*     */   }
/*     */   
/*     */   public void mousePressed(MouseEvent paramMouseEvent) {
/* 331 */     int i = Integer.MAX_VALUE;
/* 332 */     int j = paramMouseEvent.getX();
/* 333 */     int k = paramMouseEvent.getY();
/* 334 */     for (int m = 0; m < this.m_nVNodes; m++) {
/* 335 */       VNode localVNode = this.m_VNodes[m];
/* 336 */       int n = (localVNode.m_x - j) * (localVNode.m_x - j) + (localVNode.m_y - k) * (localVNode.m_y - k);
/* 337 */       if (n < i) {
/* 338 */         this.m_pick = localVNode;
/* 339 */         i = n;
/*     */       }
/*     */     }
/*     */     
/* 343 */     if (i > 200) {
/* 344 */       this.m_pick = null;
/*     */     } else {
/* 346 */       this.m_pick.m_x = j;
/* 347 */       this.m_pick.m_y = k;
/*     */     }
/* 349 */     repaint();
/* 350 */     paramMouseEvent.consume();
/*     */   }
/*     */   
/*     */   public void mouseReleased(MouseEvent paramMouseEvent) {
/*     */     try {
/* 355 */       long l = System.currentTimeMillis() - this.m_lastMD;
/* 356 */       if (l < 500L) {
/* 357 */         new NodeViewer(this.m_pick.m_node, this.m_rete);
/* 358 */         this.m_lastMD = 0L;
/* 359 */         return; }
/* 360 */       if (this.m_pick != null) {
/* 361 */         this.m_pick.m_x = paramMouseEvent.getX();
/* 362 */         this.m_pick.m_y = paramMouseEvent.getY();
/* 363 */         this.m_lastMD = System.currentTimeMillis();
/*     */       }
/*     */     } finally {
/* 366 */       this.m_pick = null;
/* 367 */       repaint();
/* 368 */       paramMouseEvent.consume(); } jsr -16;
/*     */   }
/*     */   
/*     */   public void mouseDragged(MouseEvent paramMouseEvent)
/*     */   {
/* 373 */     if (this.m_pick != null) {
/* 374 */       this.m_pick.m_x = paramMouseEvent.getX();
/* 375 */       this.m_pick.m_y = paramMouseEvent.getY();
/* 376 */       repaint();
/*     */     }
/* 378 */     paramMouseEvent.consume();
/*     */   }
/*     */   
/*     */   public void mouseMoved(MouseEvent paramMouseEvent) {
/* 382 */     int i = Integer.MAX_VALUE;
/* 383 */     int j = paramMouseEvent.getX();
/* 384 */     int k = paramMouseEvent.getY();
/* 385 */     Node localNode = null;
/* 386 */     for (int m = 0; m < this.m_nVNodes; m++) {
/* 387 */       VNode localVNode = this.m_VNodes[m];
/* 388 */       int n = (localVNode.m_x - j) * (localVNode.m_x - j) + (localVNode.m_y - k) * (localVNode.m_y - k);
/* 389 */       if (n < i) {
/* 390 */         localNode = localVNode.m_node;
/* 391 */         i = n;
/*     */       }
/*     */     }
/*     */     
/* 395 */     if (i > 200) {
/* 396 */       this.m_show = null;
/*     */     }
/*     */     else {
/* 399 */       this.m_show = localNode;
/*     */     }
/* 401 */     repaint(); }
/*     */   
/*     */   private int[] m_nextSlot;
/*     */   private Color[] m_edgeColors;
/*     */   private HasLHS m_haslhs;
/*     */   static Class class$jess$Node1;
/*     */   static Class class$jess$Node1LTR;
/*     */   static Class class$jess$Node1RTL;
/*     */   static Class class$jess$Node2;
/*     */   static Class class$jess$NodeNot2;
/*     */   static Class class$jess$NodeNot2Single;
/*     */   static Class class$jess$NodeJoin;
/*     */   static Class class$jess$Defrule;
/* 414 */   private final void buildNetwork(Node paramNode, int paramInt) { for (Enumeration localEnumeration = paramNode.getSuccessors(); localEnumeration.hasMoreElements();) {
/* 415 */       Node localNode = (Node)localEnumeration.nextElement();
/* 416 */       if ((this.m_haslhs == null) || (ruleContains(localNode)))
/*     */       {
/* 418 */         addVEdge(paramNode, localNode, paramInt, getEdgeColor(paramNode));
/* 419 */         buildNetwork(localNode, paramInt + 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 424 */   private final boolean ruleContains(Node paramNode) { ArrayList localArrayList = this.m_haslhs.getNodes();
/* 425 */     for (int i = 0; i < localArrayList.size(); i++)
/* 426 */       if (localArrayList.get(i) == paramNode)
/* 427 */         return true;
/* 428 */     return false;
/*     */   }
/*     */   
/*     */   public void init()
/*     */   {
/* 433 */     this.m_VNodes = new VNode[10];
/* 434 */     this.m_VEdges = new VEdge[10];
/* 435 */     this.m_nVNodes = (this.m_nVEdges = 0);
/* 436 */     this.m_pick = null;
/* 437 */     this.m_show = null;
/*     */     
/* 439 */     for (int i = 0; i < this.m_nextSlot.length; i++) {
/* 440 */       this.m_nextSlot[i] = 0;
/*     */     }
/* 442 */     buildNetwork(this.m_rete.getCompiler().getRoot(), 1);
/*     */     
/* 444 */     repaint();
/*     */   }
/*     */   
/*     */   public void eventHappened(JessEvent paramJessEvent) {
/* 448 */     if (((paramJessEvent.getType() & 0x1) != 0) || (paramJessEvent.getType() == 2048))
/*     */     {
/* 450 */       if (this.m_haslhs != null)
/* 451 */         this.m_haslhs = this.m_rete.findDefrule(this.m_haslhs.getName());
/* 452 */       init();
/*     */     }
/*     */   }
/*     */   
/*     */   public void mouseClicked(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   public void mouseEntered(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   public void mouseExited(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   static Class class$(String paramString, boolean paramBoolean)
/*     */   {
/*     */     try
/*     */     {
/*     */       if (!paramBoolean) {}
/*     */       return Class.forName(paramString).getComponentType();
/*     */     }
/*     */     catch (ClassNotFoundException localClassNotFoundException)
/*     */     {
/*     */       throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Graph.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */