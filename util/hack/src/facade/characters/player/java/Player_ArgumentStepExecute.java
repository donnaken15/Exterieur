/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.AblRuntimeError;
/*     */ import abl.runtime.BehavingEntity;
/*     */ import abl.runtime.CollectionBehaviorWME;
/*     */ import abl.runtime.__ValueTypes.BooleanVar;
/*     */ import abl.runtime.__ValueTypes.FloatVar;
/*     */ import abl.runtime.__ValueTypes.IntVar;
/*     */ import facade.characters.wmedef.PhysicallyFavorWME;
/*     */ import java.util.List;
/*     */ 
/*     */ public class Player_ArgumentStepExecute implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants
/*     */ {
/*     */   public static Object[] argumentExecute0(int paramInt, Object[] paramArrayOfObject, BehavingEntity paramBehavingEntity)
/*     */   {
/*     */     Object[] arrayOfObject;
/*  17 */     switch (paramInt)
/*     */     {
/*     */     case 8: 
/*  20 */       arrayOfObject = new Object[1];
/*  21 */       arrayOfObject[0] = new Integer(1);
/*  22 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 15: 
/*  26 */       arrayOfObject = new Object[1];
/*  27 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  28 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 16: 
/*  32 */       arrayOfObject = new Object[2];
/*  33 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  34 */       arrayOfObject[1] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/*  35 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 17: 
/*  39 */       arrayOfObject = new Object[2];
/*  40 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  41 */       arrayOfObject[1] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/*  42 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 18: 
/*  46 */       arrayOfObject = new Object[1];
/*  47 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  48 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 20: 
/*  52 */       arrayOfObject = new Object[1];
/*  53 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  54 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 21: 
/*  58 */       arrayOfObject = new Object[1];
/*  59 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  60 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 22: 
/*  64 */       arrayOfObject = new Object[2];
/*  65 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  66 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/*  67 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 24: 
/*  71 */       arrayOfObject = new Object[1];
/*  72 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/*  73 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 26: 
/*  77 */       arrayOfObject = new Object[1];
/*  78 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  79 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 27: 
/*  83 */       arrayOfObject = new Object[5];
/*  84 */       arrayOfObject[0] = ((CollectionBehaviorWME)paramArrayOfObject[2]);
/*  85 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  86 */       arrayOfObject[2] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b);
/*  87 */       arrayOfObject[3] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[3]).b);
/*  88 */       arrayOfObject[4] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f);
/*  89 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 29: 
/*  93 */       arrayOfObject = new Object[1];
/*  94 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/*  95 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 30: 
/*  99 */       arrayOfObject = new Object[5];
/* 100 */       arrayOfObject[0] = ((CollectionBehaviorWME)paramArrayOfObject[2]);
/* 101 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/* 102 */       arrayOfObject[2] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b);
/* 103 */       arrayOfObject[3] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[3]).b);
/* 104 */       arrayOfObject[4] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f);
/* 105 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 34: 
/* 109 */       arrayOfObject = new Object[1];
/* 110 */       arrayOfObject[0] = ((PhysicallyFavorWME)paramArrayOfObject[1]);
/* 111 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 35: 
/* 115 */       arrayOfObject = new Object[1];
/* 116 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/* 117 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 37: 
/* 121 */       arrayOfObject = new Object[1];
/* 122 */       arrayOfObject[0] = ((PhysicallyFavorWME)paramArrayOfObject[2]);
/* 123 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 38: 
/* 127 */       arrayOfObject = new Object[1];
/* 128 */       arrayOfObject[0] = new Integer(((Player)paramBehavingEntity).g_physicallyFavorLookTime);
/* 129 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 42: 
/* 133 */       arrayOfObject = new Object[1];
/* 134 */       arrayOfObject[0] = new Integer(1);
/* 135 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 43: 
/* 139 */       arrayOfObject = new Object[1];
/* 140 */       arrayOfObject[0] = new Integer(((Player)paramBehavingEntity).g_physicallyFavorObjectLatency);
/* 141 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 46: 
/* 145 */       arrayOfObject = new Object[1];
/* 146 */       arrayOfObject[0] = new Integer(3);
/* 147 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 49: 
/* 151 */       arrayOfObject = new Object[2];
/* 152 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/* 153 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/* 154 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 50: 
/* 158 */       arrayOfObject = new Object[2];
/* 159 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/* 160 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/* 161 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 56: 
/* 165 */       arrayOfObject = new Object[2];
/* 166 */       arrayOfObject[0] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[0]).i);
/* 167 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/* 168 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 65: 
/* 172 */       arrayOfObject = new Object[2];
/* 173 */       arrayOfObject[0] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b);
/* 174 */       arrayOfObject[1] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b);
/* 175 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 72: 
/* 179 */       arrayOfObject = new Object[1];
/* 180 */       arrayOfObject[0] = new Integer(1);
/* 181 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 77: 
/* 185 */       arrayOfObject = new Object[1];
/* 186 */       arrayOfObject[0] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[1]).f);
/* 187 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 88: 
/* 191 */       arrayOfObject = new Object[2];
/* 192 */       arrayOfObject[0] = new Integer(2);
/* 193 */       arrayOfObject[1] = new Integer(-1);
/* 194 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 90: 
/* 198 */       arrayOfObject = new Object[2];
/* 199 */       arrayOfObject[0] = ((CollectionBehaviorWME)paramArrayOfObject[1]);
/* 200 */       arrayOfObject[1] = ((List)paramArrayOfObject[0]);
/* 201 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 92: 
/* 205 */       arrayOfObject = new Object[5];
/* 206 */       arrayOfObject[0] = ((CollectionBehaviorWME)paramArrayOfObject[0]);
/* 207 */       arrayOfObject[1] = new Integer(((__ValueTypes.IntVar)paramArrayOfObject[3]).i);
/* 208 */       arrayOfObject[2] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[5]).b);
/* 209 */       arrayOfObject[3] = new Boolean(((__ValueTypes.BooleanVar)paramArrayOfObject[6]).b);
/* 210 */       arrayOfObject[4] = new Float(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f);
/* 211 */       return arrayOfObject;
/*     */     
/*     */ 
/*     */     case 93: 
/* 215 */       arrayOfObject = new Object[2];
/* 216 */       arrayOfObject[0] = ((CollectionBehaviorWME)paramArrayOfObject[0]);
/* 217 */       arrayOfObject[1] = ((List)paramArrayOfObject[1]);
/* 218 */       return arrayOfObject;
/*     */     }
/*     */     
/* 221 */     throw new AblRuntimeError("Unexpected stepID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_ArgumentStepExecute.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */