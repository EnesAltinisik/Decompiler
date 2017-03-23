package com.google.android.gms.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public final class zzakz {
    private final Map<Type, zzakb<?>> zzbWm;

    public zzakz(Map<Type, zzakb<?>> map) {
        this.zzbWm = map;
    }

    private <T> zzale<T> zzc(final Type type, Class<? super T> cls) {
        return Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(cls) ? new zzale<T>(this) {
            final /* synthetic */ zzakz b;

            public T zzVT() {
                if (type instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    String str = "Invalid EnumSet type: ";
                    String valueOf = String.valueOf(type.toString());
                    throw new zzakg(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                str = "Invalid EnumSet type: ";
                valueOf = String.valueOf(type.toString());
                throw new zzakg(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } : Set.class.isAssignableFrom(cls) ? new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new LinkedList();
            }
        } : new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? SortedMap.class.isAssignableFrom(cls) ? new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new TreeMap();
            }
        } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(zzalv.zzl(((ParameterizedType) type).getActualTypeArguments()[0]).zzWl())) ? new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new zzald();
            }
        } : new zzale<T>(this) {
            final /* synthetic */ zzakz a;

            {
                this.a = r1;
            }

            public T zzVT() {
                return new LinkedHashMap();
            }
        } : null;
    }

    private <T> zzale<T> zzd(final Type type, final Class<? super T> cls) {
        return new zzale<T>(this) {
            final /* synthetic */ zzakz c;
            private final zzalh d = zzalh.zzVY();

            public T zzVT() {
                try {
                    return this.d.zzf(cls);
                } catch (Throwable e) {
                    String valueOf = String.valueOf(type);
                    throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 116).append("Unable to invoke no-args constructor for ").append(valueOf).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), e);
                }
            }
        };
    }

    private <T> zzale<T> zzl(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new zzale<T>(this) {
                final /* synthetic */ zzakz b;

                public T zzVT() {
                    String valueOf;
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (Throwable e) {
                        valueOf = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to invoke ").append(valueOf).append(" with no args").toString(), e);
                    } catch (InvocationTargetException e2) {
                        valueOf = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to invoke ").append(valueOf).append(" with no args").toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public String toString() {
        return this.zzbWm.toString();
    }

    public <T> zzale<T> zzb(zzalv<T> com_google_android_gms_internal_zzalv_T) {
        final Type zzWm = com_google_android_gms_internal_zzalv_T.zzWm();
        Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
        final zzakb com_google_android_gms_internal_zzakb = (zzakb) this.zzbWm.get(zzWm);
        if (com_google_android_gms_internal_zzakb != null) {
            return new zzale<T>(this) {
                final /* synthetic */ zzakz c;

                public T zzVT() {
                    return com_google_android_gms_internal_zzakb.zza(zzWm);
                }
            };
        }
        com_google_android_gms_internal_zzakb = (zzakb) this.zzbWm.get(zzWl);
        if (com_google_android_gms_internal_zzakb != null) {
            return new zzale<T>(this) {
                final /* synthetic */ zzakz c;

                public T zzVT() {
                    return com_google_android_gms_internal_zzakb.zza(zzWm);
                }
            };
        }
        zzale<T> zzl = zzl(zzWl);
        if (zzl != null) {
            return zzl;
        }
        zzl = zzc(zzWm, zzWl);
        return zzl == null ? zzd(zzWm, zzWl) : zzl;
    }
}
