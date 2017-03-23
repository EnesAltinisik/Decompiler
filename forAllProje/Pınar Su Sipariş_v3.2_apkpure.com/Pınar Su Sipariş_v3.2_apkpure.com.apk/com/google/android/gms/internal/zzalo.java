package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zzalo implements zzaks {
    private final zzakz zzbWa;
    private final boolean zzbXP;

    private final class a<K, V> extends zzakr<Map<K, V>> {
        final /* synthetic */ zzalo a;
        private final zzakr<K> b;
        private final zzakr<V> c;
        private final zzale<? extends Map<K, V>> d;

        public a(zzalo com_google_android_gms_internal_zzalo, zzajz com_google_android_gms_internal_zzajz, Type type, zzakr<K> com_google_android_gms_internal_zzakr_K, Type type2, zzakr<V> com_google_android_gms_internal_zzakr_V, zzale<? extends Map<K, V>> com_google_android_gms_internal_zzale__extends_java_util_Map_K__V) {
            this.a = com_google_android_gms_internal_zzalo;
            this.b = new o(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzakr_K, type);
            this.c = new o(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzakr_V, type2);
            this.d = com_google_android_gms_internal_zzale__extends_java_util_Map_K__V;
        }

        private String a(zzakf com_google_android_gms_internal_zzakf) {
            if (com_google_android_gms_internal_zzakf.zzVH()) {
                zzakl zzVL = com_google_android_gms_internal_zzakf.zzVL();
                if (zzVL.zzVO()) {
                    return String.valueOf(zzVL.zzVz());
                }
                if (zzVL.zzVN()) {
                    return Boolean.toString(zzVL.zzVE());
                }
                if (zzVL.zzVP()) {
                    return zzVL.zzVA();
                }
                throw new AssertionError();
            } else if (com_google_android_gms_internal_zzakf.zzVI()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        public Map<K, V> a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            zzalx zzWa = com_google_android_gms_internal_zzalw.zzWa();
            if (zzWa == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.d.zzVT();
            Object zzb;
            if (zzWa == zzalx.BEGIN_ARRAY) {
                com_google_android_gms_internal_zzalw.beginArray();
                while (com_google_android_gms_internal_zzalw.hasNext()) {
                    com_google_android_gms_internal_zzalw.beginArray();
                    zzb = this.b.zzb(com_google_android_gms_internal_zzalw);
                    if (map.put(zzb, this.c.zzb(com_google_android_gms_internal_zzalw)) != null) {
                        String valueOf = String.valueOf(zzb);
                        throw new zzako(new StringBuilder(String.valueOf(valueOf).length() + 15).append("duplicate key: ").append(valueOf).toString());
                    }
                    com_google_android_gms_internal_zzalw.endArray();
                }
                com_google_android_gms_internal_zzalw.endArray();
                return map;
            }
            com_google_android_gms_internal_zzalw.beginObject();
            while (com_google_android_gms_internal_zzalw.hasNext()) {
                zzalb.zzbXe.zzi(com_google_android_gms_internal_zzalw);
                zzb = this.b.zzb(com_google_android_gms_internal_zzalw);
                if (map.put(zzb, this.c.zzb(com_google_android_gms_internal_zzalw)) != null) {
                    valueOf = String.valueOf(zzb);
                    throw new zzako(new StringBuilder(String.valueOf(valueOf).length() + 15).append("duplicate key: ").append(valueOf).toString());
                }
            }
            com_google_android_gms_internal_zzalw.endObject();
            return map;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Map<K, V> map) throws IOException {
            int i = 0;
            if (map == null) {
                com_google_android_gms_internal_zzaly.zzWk();
            } else if (this.a.zzbXP) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                for (Entry entry : map.entrySet()) {
                    zzakf zzaJ = this.b.zzaJ(entry.getKey());
                    arrayList.add(zzaJ);
                    arrayList2.add(entry.getValue());
                    int i3 = (zzaJ.zzVF() || zzaJ.zzVG()) ? 1 : 0;
                    i2 = i3 | i2;
                }
                if (i2 != 0) {
                    com_google_android_gms_internal_zzaly.zzWg();
                    while (i < arrayList.size()) {
                        com_google_android_gms_internal_zzaly.zzWg();
                        zzalg.zzb((zzakf) arrayList.get(i), com_google_android_gms_internal_zzaly);
                        this.c.zza(com_google_android_gms_internal_zzaly, arrayList2.get(i));
                        com_google_android_gms_internal_zzaly.zzWh();
                        i++;
                    }
                    com_google_android_gms_internal_zzaly.zzWh();
                    return;
                }
                com_google_android_gms_internal_zzaly.zzWi();
                while (i < arrayList.size()) {
                    com_google_android_gms_internal_zzaly.zziT(a((zzakf) arrayList.get(i)));
                    this.c.zza(com_google_android_gms_internal_zzaly, arrayList2.get(i));
                    i++;
                }
                com_google_android_gms_internal_zzaly.zzWj();
            } else {
                com_google_android_gms_internal_zzaly.zzWi();
                for (Entry entry2 : map.entrySet()) {
                    com_google_android_gms_internal_zzaly.zziT(String.valueOf(entry2.getKey()));
                    this.c.zza(com_google_android_gms_internal_zzaly, entry2.getValue());
                }
                com_google_android_gms_internal_zzaly.zzWj();
            }
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Map) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    }

    public zzalo(zzakz com_google_android_gms_internal_zzakz, boolean z) {
        this.zzbWa = com_google_android_gms_internal_zzakz;
        this.zzbXP = z;
    }

    private zzakr<?> zza(zzajz com_google_android_gms_internal_zzajz, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? zzalu.zzbYl : com_google_android_gms_internal_zzajz.zza(zzalv.zzl(type));
    }

    public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        Type zzWm = com_google_android_gms_internal_zzalv_T.zzWm();
        if (!Map.class.isAssignableFrom(com_google_android_gms_internal_zzalv_T.zzWl())) {
            return null;
        }
        Type[] zzb = zzaky.zzb(zzWm, zzaky.zzf(zzWm));
        zzakr zza = zza(com_google_android_gms_internal_zzajz, zzb[0]);
        zzakr zza2 = com_google_android_gms_internal_zzajz.zza(zzalv.zzl(zzb[1]));
        zzale zzb2 = this.zzbWa.zzb(com_google_android_gms_internal_zzalv_T);
        return new a(this, com_google_android_gms_internal_zzajz, zzb[0], zza, zzb[1], zza2, zzb2);
    }
}
