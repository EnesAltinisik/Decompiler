package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class zzalq implements zzaks {
    private final zzakz zzbWa;
    private final zzala zzbWj;
    private final zzajy zzbWl;

    static abstract class a {
        final String g;
        final boolean h;
        final boolean i;

        protected a(String str, boolean z, boolean z2) {
            this.g = str;
            this.h = z;
            this.i = z2;
        }

        abstract void a(zzalw com_google_android_gms_internal_zzalw, Object obj) throws IOException, IllegalAccessException;

        abstract void a(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException, IllegalAccessException;

        abstract boolean a(Object obj) throws IOException, IllegalAccessException;
    }

    public static final class zza<T> extends zzakr<T> {
        private final zzale<T> zzbXH;
        private final Map<String, a> zzbYa;

        private zza(zzale<T> com_google_android_gms_internal_zzale_T, Map<String, a> map) {
            this.zzbXH = com_google_android_gms_internal_zzale_T;
            this.zzbYa = map;
        }

        public void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
            if (t == null) {
                com_google_android_gms_internal_zzaly.zzWk();
                return;
            }
            com_google_android_gms_internal_zzaly.zzWi();
            try {
                for (a aVar : this.zzbYa.values()) {
                    if (aVar.a(t)) {
                        com_google_android_gms_internal_zzaly.zziT(aVar.g);
                        aVar.a(com_google_android_gms_internal_zzaly, (Object) t);
                    }
                }
                com_google_android_gms_internal_zzaly.zzWj();
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            }
        }

        public T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            T zzVT = this.zzbXH.zzVT();
            try {
                com_google_android_gms_internal_zzalw.beginObject();
                while (com_google_android_gms_internal_zzalw.hasNext()) {
                    a aVar = (a) this.zzbYa.get(com_google_android_gms_internal_zzalw.nextName());
                    if (aVar == null || !aVar.i) {
                        com_google_android_gms_internal_zzalw.skipValue();
                    } else {
                        aVar.a(com_google_android_gms_internal_zzalw, (Object) zzVT);
                    }
                }
                com_google_android_gms_internal_zzalw.endObject();
                return zzVT;
            } catch (Throwable e) {
                throw new zzako(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public zzalq(zzakz com_google_android_gms_internal_zzakz, zzajy com_google_android_gms_internal_zzajy, zzala com_google_android_gms_internal_zzala) {
        this.zzbWa = com_google_android_gms_internal_zzakz;
        this.zzbWl = com_google_android_gms_internal_zzajy;
        this.zzbWj = com_google_android_gms_internal_zzala;
    }

    private zzakr<?> zza(zzajz com_google_android_gms_internal_zzajz, Field field, zzalv<?> com_google_android_gms_internal_zzalv_) {
        zzakt com_google_android_gms_internal_zzakt = (zzakt) field.getAnnotation(zzakt.class);
        if (com_google_android_gms_internal_zzakt != null) {
            zzakr<?> zza = zzall.zza(this.zzbWa, com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzalv_, com_google_android_gms_internal_zzakt);
            if (zza != null) {
                return zza;
            }
        }
        return com_google_android_gms_internal_zzajz.zza((zzalv) com_google_android_gms_internal_zzalv_);
    }

    private a zza(zzajz com_google_android_gms_internal_zzajz, Field field, String str, zzalv<?> com_google_android_gms_internal_zzalv_, boolean z, boolean z2) {
        final boolean zzk = zzalf.zzk(com_google_android_gms_internal_zzalv_.zzWl());
        final zzajz com_google_android_gms_internal_zzajz2 = com_google_android_gms_internal_zzajz;
        final Field field2 = field;
        final zzalv<?> com_google_android_gms_internal_zzalv_2 = com_google_android_gms_internal_zzalv_;
        return new a(this, str, z, z2) {
            final zzakr<?> a = this.f.zza(com_google_android_gms_internal_zzajz2, field2, com_google_android_gms_internal_zzalv_2);
            final /* synthetic */ zzalq f;

            void a(zzalw com_google_android_gms_internal_zzalw, Object obj) throws IOException, IllegalAccessException {
                Object zzb = this.a.zzb(com_google_android_gms_internal_zzalw);
                if (zzb != null || !zzk) {
                    field2.set(obj, zzb);
                }
            }

            void a(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException, IllegalAccessException {
                new o(com_google_android_gms_internal_zzajz2, this.a, com_google_android_gms_internal_zzalv_2.zzWm()).zza(com_google_android_gms_internal_zzaly, field2.get(obj));
            }

            public boolean a(Object obj) throws IOException, IllegalAccessException {
                return this.h && field2.get(obj) != obj;
            }
        };
    }

    static List<String> zza(zzajy com_google_android_gms_internal_zzajy, Field field) {
        zzaku com_google_android_gms_internal_zzaku = (zzaku) field.getAnnotation(zzaku.class);
        List<String> linkedList = new LinkedList();
        if (com_google_android_gms_internal_zzaku == null) {
            linkedList.add(com_google_android_gms_internal_zzajy.zzb(field));
        } else {
            linkedList.add(com_google_android_gms_internal_zzaku.value());
            for (Object add : com_google_android_gms_internal_zzaku.zzVR()) {
                linkedList.add(add);
            }
        }
        return linkedList;
    }

    private Map<String, a> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<?> com_google_android_gms_internal_zzalv_, Class<?> cls) {
        Map<String, a> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type zzWm = com_google_android_gms_internal_zzalv_.zzWm();
        Class zzWl;
        while (zzWl != Object.class) {
            for (Field field : zzWl.getDeclaredFields()) {
                boolean zza = zza(field, true);
                boolean zza2 = zza(field, false);
                if (zza || zza2) {
                    field.setAccessible(true);
                    Type zza3 = zzaky.zza(r19.zzWm(), zzWl, field.getGenericType());
                    List zzc = zzc(field);
                    a aVar = null;
                    int i = 0;
                    while (i < zzc.size()) {
                        String str = (String) zzc.get(i);
                        if (i != 0) {
                            zza = false;
                        }
                        a aVar2 = (a) linkedHashMap.put(str, zza(com_google_android_gms_internal_zzajz, field, str, zzalv.zzl(zza3), zza, zza2));
                        if (aVar != null) {
                            aVar2 = aVar;
                        }
                        i++;
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        String valueOf = String.valueOf(zzWm);
                        String str2 = aVar.g;
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str2).length()).append(valueOf).append(" declares multiple JSON fields named ").append(str2).toString());
                    }
                }
            }
            zzalv zzl = zzalv.zzl(zzaky.zza(zzl.zzWm(), zzWl, zzWl.getGenericSuperclass()));
            zzWl = zzl.zzWl();
        }
        return linkedHashMap;
    }

    static boolean zza(Field field, boolean z, zzala com_google_android_gms_internal_zzala) {
        return (com_google_android_gms_internal_zzala.zza(field.getType(), z) || com_google_android_gms_internal_zzala.zza(field, z)) ? false : true;
    }

    private List<String> zzc(Field field) {
        return zza(this.zzbWl, field);
    }

    public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
        return !Object.class.isAssignableFrom(zzWl) ? null : new zza(this.zzbWa.zzb(com_google_android_gms_internal_zzalv_T), zza(com_google_android_gms_internal_zzajz, (zzalv) com_google_android_gms_internal_zzalv_T, zzWl));
    }

    public boolean zza(Field field, boolean z) {
        return zza(field, z, this.zzbWj);
    }
}
