package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ThrowOnExtraProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class zzaix {
    private static final ConcurrentMap<Class<?>, a<?>> zzbSr = new ConcurrentHashMap();

    private static class a<T> {
        private final Class<T> a;
        private final Constructor<T> b;
        private final boolean c;
        private final boolean d;
        private final Map<String, String> e;
        private final Map<String, Method> f;
        private final Map<String, Method> g;
        private final Map<String, Field> h;

        public a(Class<T> cls) {
            Constructor declaredConstructor;
            int i = 0;
            this.a = cls;
            this.c = cls.isAnnotationPresent(ThrowOnExtraProperties.class);
            this.d = !cls.isAnnotationPresent(IgnoreExtraProperties.class);
            this.e = new HashMap();
            this.g = new HashMap();
            this.f = new HashMap();
            this.h = new HashMap();
            try {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException e) {
                declaredConstructor = null;
            }
            this.b = declaredConstructor;
            for (Method method : cls.getDeclaredMethods()) {
                if (a(method)) {
                    String b = b(method.getName());
                    a(b);
                    method.setAccessible(true);
                    if (this.f.containsKey(b)) {
                        String str = "Found conflicting getters for name: ";
                        String valueOf = String.valueOf(method.getName());
                        throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    this.f.put(b, method);
                }
            }
            for (Field field : cls.getDeclaredFields()) {
                if (a(field)) {
                    a(field.getName());
                }
            }
            for (Method method2 : cls.getDeclaredMethods()) {
                if (b(method2)) {
                    String b2 = b(method2.getName());
                    valueOf = (String) this.e.get(b2.toLowerCase());
                    if (valueOf == null) {
                        continue;
                    } else if (!valueOf.equals(b2)) {
                        str = "Found setter with invalid case-sensitive name: ";
                        valueOf = String.valueOf(method2.getName());
                        throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    } else if (this.g.containsKey(b2)) {
                        str = "Found two conflicting setters with name: ";
                        valueOf = String.valueOf(method2.getName());
                        throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    } else {
                        method2.setAccessible(true);
                        this.g.put(b2, method2);
                    }
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            while (i < length) {
                Field field2 = declaredFields[i];
                String name = field2.getName();
                if (this.e.containsKey(name.toLowerCase())) {
                    field2.setAccessible(true);
                    this.h.put(name, field2);
                }
                i++;
            }
            if (this.e.isEmpty()) {
                str = "No properties to serialize found on class ";
                valueOf = String.valueOf(cls.getName());
                throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }

        private Type a(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = (Type) map.get(type);
            if (type2 != null) {
                return type2;
            }
            String valueOf = String.valueOf(type);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Could not resolve type ").append(valueOf).toString());
        }

        private void a(String str) {
            String str2 = (String) this.e.put(str.toLowerCase(), str);
            if (str2 != null && !str.equals(str2)) {
                String str3 = "Found two getters or fields with conflicting case sensitivity for property: ";
                str2 = String.valueOf(str.toLowerCase());
                throw new DatabaseException(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }

        private static boolean a(Field field) {
            return (!Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(Exclude.class)) ? false : true;
        }

        private static boolean a(Method method) {
            return (method.getName().startsWith("get") || method.getName().startsWith("is")) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(Exclude.class);
        }

        private static String b(String str) {
            String[] strArr = new String[]{"get", "set", "is"};
            String str2 = null;
            int i = 0;
            while (i < 3) {
                String str3 = strArr[i];
                if (!str.startsWith(str3)) {
                    str3 = str2;
                }
                i++;
                str2 = str3;
            }
            if (str2 == null) {
                String str4 = "Unknown Bean prefix for method: ";
                str3 = String.valueOf(str);
                throw new IllegalArgumentException(str3.length() != 0 ? str4.concat(str3) : new String(str4));
            }
            char[] toCharArray = str.substring(str2.length()).toCharArray();
            int i2 = 0;
            while (i2 < toCharArray.length && Character.isUpperCase(toCharArray[i2])) {
                toCharArray[i2] = Character.toLowerCase(toCharArray[i2]);
                i2++;
            }
            return new String(toCharArray);
        }

        private static boolean b(Method method) {
            return method.getName().startsWith("set") && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(Exclude.class);
        }

        public T a(Map<String, Object> map) {
            return a((Map) map, Collections.emptyMap());
        }

        public T a(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
            if (this.b == null) {
                String valueOf = String.valueOf(this.a.getName());
                throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Class ").append(valueOf).append(" is missing a constructor with no arguments").toString());
            }
            try {
                T newInstance = this.b.newInstance(new Object[0]);
                for (Entry entry : map.entrySet()) {
                    valueOf = (String) entry.getKey();
                    if (this.g.containsKey(valueOf)) {
                        Method method = (Method) this.g.get(valueOf);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            throw new IllegalStateException("Setter does not have exactly one parameter");
                        }
                        Object zzb = zzaix.zza(entry.getValue(), a(genericParameterTypes[0], (Map) map2));
                        try {
                            method.invoke(newInstance, new Object[]{zzb});
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        } catch (Throwable e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (this.h.containsKey(valueOf)) {
                        Field field = (Field) this.h.get(valueOf);
                        try {
                            field.set(newInstance, zzaix.zza(entry.getValue(), a(field.getGenericType(), (Map) map2)));
                        } catch (Throwable e22) {
                            throw new RuntimeException(e22);
                        }
                    } else {
                        String valueOf2 = String.valueOf(this.a.getName());
                        valueOf2 = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("No setter/field for ").append(valueOf).append(" found on class ").append(valueOf2).toString();
                        if (this.e.containsKey(valueOf.toLowerCase())) {
                            valueOf2 = String.valueOf(valueOf2).concat(" (fields/setters are case sensitive!)");
                        }
                        if (this.c) {
                            throw new DatabaseException(valueOf2);
                        } else if (this.d) {
                            Log.w("ClassMapper", valueOf2);
                        }
                    }
                }
                return newInstance;
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            } catch (Throwable e2222) {
                throw new RuntimeException(e2222);
            } catch (Throwable e22222) {
                throw new RuntimeException(e22222);
            }
        }

        public Map<String, Object> a(T t) {
            if (this.a.isAssignableFrom(t.getClass())) {
                Map<String, Object> hashMap = new HashMap();
                for (String str : this.e.values()) {
                    String str2;
                    Object invoke;
                    if (this.f.containsKey(str2)) {
                        try {
                            invoke = ((Method) this.f.get(str2)).invoke(t, new Object[0]);
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        } catch (Throwable e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    Field field = (Field) this.h.get(str2);
                    if (field == null) {
                        String str3 = "Bean property without field or getter:";
                        str2 = String.valueOf(str2);
                        throw new IllegalStateException(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                    }
                    try {
                        invoke = field.get(t);
                    } catch (Throwable e22) {
                        throw new RuntimeException(e22);
                    }
                    hashMap.put(str2, zzaix.zzaw(invoke));
                }
                return hashMap;
            }
            String valueOf = String.valueOf(t.getClass());
            str3 = String.valueOf(this.a);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 59) + String.valueOf(str3).length()).append("Can't serialize object of class ").append(valueOf).append(" with BeanMapper for class ").append(str3).toString());
        }
    }

    public static <T> T zza(Object obj, GenericTypeIndicator<T> genericTypeIndicator) {
        Type genericSuperclass = genericTypeIndicator.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType().equals(GenericTypeIndicator.class)) {
                return zza(obj, parameterizedType.getActualTypeArguments()[0]);
            }
            String valueOf = String.valueOf(genericSuperclass);
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(valueOf).toString());
        }
        valueOf = String.valueOf(genericSuperclass);
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(valueOf).toString());
    }

    public static <T> T zza(Object obj, Class<T> cls) {
        return zzb(obj, (Class) cls);
    }

    private static <T> T zza(Object obj, ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List<Object> list = (List) obj;
                T arrayList = new ArrayList(list.size());
                for (Object zza : list) {
                    arrayList.add(zza(zza, type));
                }
                return arrayList;
            }
            String valueOf = String.valueOf(obj.getClass());
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Expected a List while deserializing, but got a ").append(valueOf).toString());
        } else if (Map.class.isAssignableFrom(cls)) {
            Object obj2 = parameterizedType.getActualTypeArguments()[0];
            Type type2 = parameterizedType.getActualTypeArguments()[1];
            if (obj2.equals(String.class)) {
                Map zzax = zzax(obj);
                T hashMap = new HashMap();
                for (Entry entry : zzax.entrySet()) {
                    hashMap.put((String) entry.getKey(), zza(entry.getValue(), type2));
                }
                return hashMap;
            }
            String valueOf2 = String.valueOf(obj2);
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf2).length() + 70).append("Only Maps with string keys are supported, but found Map with key type ").append(valueOf2).toString());
        } else if (Collection.class.isAssignableFrom(cls)) {
            throw new DatabaseException("Collections are not supported, please use Lists instead");
        } else {
            Map zzax2 = zzax(obj);
            a zzj = zzj(cls);
            Map hashMap2 = new HashMap();
            TypeVariable[] typeParameters = zzj.a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length != typeParameters.length) {
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            }
            for (int i = 0; i < typeParameters.length; i++) {
                hashMap2.put(typeParameters[i], actualTypeArguments[i]);
            }
            return zzj.a(zzax2, hashMap2);
        }
    }

    private static <T> T zza(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return zza(obj, (ParameterizedType) type);
        }
        if (type instanceof Class) {
            return zzb(obj, (Class) type);
        }
        if (type instanceof WildcardType) {
            throw new DatabaseException("Generic wildcard types are not supported");
        } else if (type instanceof GenericArrayType) {
            throw new DatabaseException("Generic Arrays are not supported, please use Lists instead");
        } else {
            String valueOf = String.valueOf(type);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unknown type encountered: ").append(valueOf).toString());
        }
    }

    private static Double zzaA(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        String valueOf;
        if (obj instanceof Long) {
            Long l = (Long) obj;
            Double valueOf2 = Double.valueOf(((Long) obj).doubleValue());
            if (valueOf2.longValue() == l.longValue()) {
                return valueOf2;
            }
            valueOf = String.valueOf(obj);
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 97).append("Loss of precision while converting number to double: ").append(valueOf).append(". Did you mean to use a 64-bit long instead?").toString());
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            valueOf = String.valueOf(obj.getClass().getName());
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 44).append("Failed to convert a value of type ").append(valueOf).append(" to double").toString());
        }
    }

    private static Boolean zzaB(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Failed to convert value of type ").append(valueOf).append(" to boolean").toString());
    }

    private static String zzaC(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 42).append("Failed to convert value of type ").append(valueOf).append(" to String").toString());
    }

    public static Object zzav(Object obj) {
        return zzaw(obj);
    }

    private static <T> Object zzaw(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Number) {
            if (t instanceof Float) {
                return Double.valueOf(((Float) t).doubleValue());
            }
            if (t instanceof Short) {
                throw new DatabaseException("Shorts are not supported, please use int or long");
            } else if (!(t instanceof Byte)) {
                return t;
            } else {
                throw new DatabaseException("Bytes are not supported, please use int or long");
            }
        } else if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        } else {
            if (t instanceof Character) {
                throw new DatabaseException("Characters are not supported, please strings");
            } else if (t instanceof Map) {
                Map hashMap = new HashMap();
                for (Entry entry : ((Map) t).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        hashMap.put((String) key, zzaw(entry.getValue()));
                    } else {
                        throw new DatabaseException("Maps with non-string keys are not supported");
                    }
                }
                return hashMap;
            } else if (t instanceof Collection) {
                if (t instanceof List) {
                    List<Object> list = (List) t;
                    List arrayList = new ArrayList(list.size());
                    for (Object zzaw : list) {
                        arrayList.add(zzaw(zzaw));
                    }
                    return arrayList;
                }
                throw new DatabaseException("Serializing Collections is not supported, please use Lists instead");
            } else if (!t.getClass().isArray()) {
                return zzj(t.getClass()).a((Object) t);
            } else {
                throw new DatabaseException("Serializing Arrays is not supported, please use Lists instead");
            }
        }
    }

    private static Map<String, Object> zzax(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected a Map while deserializing, but got a ").append(valueOf).toString());
    }

    private static Integer zzay(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            throw new DatabaseException(new StringBuilder(MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES).append("Numeric value out of 32-bit integer range: ").append(doubleValue).append(". Did you mean to use a long or double instead of an int?").toString());
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Failed to convert a value of type ").append(valueOf).append(" to int").toString());
    }

    private static Long zzaz(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
                return Long.valueOf(d.longValue());
            }
            String valueOf = String.valueOf(d);
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 89).append("Numeric value out of 64-bit long range: ").append(valueOf).append(". Did you mean to use a double instead of a long?").toString());
        }
        valueOf = String.valueOf(obj.getClass().getName());
        throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 42).append("Failed to convert a value of type ").append(valueOf).append(" to long").toString());
    }

    private static <T> T zzb(Object obj, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return zzc(obj, cls);
        }
        if (String.class.isAssignableFrom(cls)) {
            return zzaC(obj);
        }
        if (cls.isArray()) {
            throw new DatabaseException("Converting to Arrays is not supported, please use Listsinstead");
        } else if (cls.getTypeParameters().length <= 0) {
            return !cls.equals(Object.class) ? zzd(obj, cls) : obj;
        } else {
            String valueOf = String.valueOf(cls.getName());
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 75).append("Class ").append(valueOf).append(" has generic type parameters, please use GenericTypeIndicator instead").toString());
        }
    }

    private static <T> T zzc(Object obj, Class<T> cls) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return zzay(obj);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return zzaB(obj);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return zzaA(obj);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return zzaz(obj);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(zzaA(obj).floatValue());
        }
        if (Short.class.isAssignableFrom(cls) || Short.TYPE.isAssignableFrom(cls)) {
            throw new DatabaseException("Deserializing to shorts is not supported");
        } else if (Byte.class.isAssignableFrom(cls) || Byte.TYPE.isAssignableFrom(cls)) {
            throw new DatabaseException("Deserializing to bytes is not supported");
        } else if (Character.class.isAssignableFrom(cls) || Character.TYPE.isAssignableFrom(cls)) {
            throw new DatabaseException("Deserializing to char is not supported");
        } else {
            String valueOf = String.valueOf(cls);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown primitive type: ").append(valueOf).toString());
        }
    }

    private static <T> T zzd(Object obj, Class<T> cls) {
        a zzj = zzj(cls);
        if (obj instanceof Map) {
            return zzj.a(zzax(obj));
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        String valueOf2 = String.valueOf(cls.getName());
        throw new DatabaseException(new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Can't convert object of type ").append(valueOf).append(" to type ").append(valueOf2).toString());
    }

    private static <T> a<T> zzj(Class<T> cls) {
        a<T> aVar = (a) zzbSr.get(cls);
        if (aVar != null) {
            return aVar;
        }
        aVar = new a(cls);
        zzbSr.put(cls, aVar);
        return aVar;
    }
}
