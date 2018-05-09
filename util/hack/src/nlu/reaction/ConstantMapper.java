/*    */ package nlu.reaction;
/*    */ 
/*    */ import jess.JessException;
/*    */ import jess.Value;
/*    */ 
/*    */ public class ConstantMapper implements jess.Userfunction
/*    */ {
/*  8 */   public static String[] interfaces = { "facade.util.SpriteID", "dramaman.runtime.DramaManagerConstants", "facade.util.ReactionConstants", "facade.util.DAType", "facade.util.ReactionID", "facade.util.BeatID" };
/*    */   
/*    */   public String getName()
/*    */   {
/* 12 */     return "fc";
/*    */   }
/*    */   
/*    */   public Value call(jess.ValueVector paramValueVector, jess.Context paramContext) throws JessException {
/* 16 */     String str = paramValueVector.get(1).stringValue(paramContext);
/*    */     
/* 18 */     for (int i = 0; i < interfaces.length; i++) {
/*    */       try {
/* 20 */         Class localClass = Class.forName(interfaces[i]);
/* 21 */         java.lang.reflect.Field localField = localClass.getDeclaredField(str);
/* 22 */         Object localObject = localField.get(null);
/* 23 */         if (localObject.getClass() == Class.forName("java.lang.Integer"))
/* 24 */           return new Value(((Number)localObject).intValue(), 4);
/* 25 */         if ((localObject.getClass() == Class.forName("java.lang.Float")) || (localObject.getClass() == Class.forName("java.lang.Double")))
/*    */         {
/* 27 */           return new Value(((Number)localObject).doubleValue(), 32); }
/* 28 */         if (localObject.getClass() == Class.forName("java.lang.Long"))
/* 29 */           return new Value(((Number)localObject).longValue(), 65536);
/* 30 */         if (localObject.getClass() == Class.forName("java.lang.String")) {
/* 31 */           return new Value((String)localObject, 2);
/*    */         }
/* 33 */         return new Value(localObject);
/*    */       } catch (ClassNotFoundException localClassNotFoundException) {
/* 35 */         throw new JessException("ConstantMapper.call", "Reflection error", localClassNotFoundException);
/* 36 */       } catch (SecurityException localSecurityException) { throw new JessException("ConstantMapper.call", "Reflection error", localSecurityException);
/* 37 */       } catch (IllegalArgumentException localIllegalArgumentException) { throw new JessException("ConstantMapper.call", "Reflection error", localIllegalArgumentException);
/* 38 */       } catch (IllegalAccessException localIllegalAccessException) { throw new JessException("ConstantMapper.call", "Reflection error", localIllegalAccessException);
/*    */       } catch (NoSuchFieldException localNoSuchFieldException) {}
/*    */     }
/* 41 */     throw new JessException("ConstantMapper.call", "Constant not found", str);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\nlu\reaction\ConstantMapper.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */