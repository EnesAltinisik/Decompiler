package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class zzalj implements zzaks {
    private final zzakz zzbWa;

    private static final class a<E> extends zzakr<Collection<E>> {
        private final zzakr<E> a;
        private final zzale<? extends Collection<E>> b;

        public a(zzajz com_google_android_gms_internal_zzajz, Type type, zzakr<E> com_google_android_gms_internal_zzakr_E, zzale<? extends Collection<E>> com_google_android_gms_internal_zzale__extends_java_util_Collection_E) {
            this.a = new o(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzakr_E, type);
            this.b = com_google_android_gms_internal_zzale__extends_java_util_Collection_E;
        }

        public Collection<E> a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.b.zzVT();
            com_google_android_gms_internal_zzalw.beginArray();
            while (com_google_android_gms_internal_zzalw.hasNext()) {
                collection.add(this.a.zzb(com_google_android_gms_internal_zzalw));
            }
            com_google_android_gms_internal_zzalw.endArray();
            return collection;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Collection<E> collection) throws IOException {
            if (collection == null) {
                com_google_android_gms_internal_zzaly.zzWk();
                return;
            }
            com_google_android_gms_internal_zzaly.zzWg();
            for (E zza : collection) {
                this.a.zza(com_google_android_gms_internal_zzaly, zza);
            }
            com_google_android_gms_internal_zzaly.zzWh();
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Collection) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    }

    public zzalj(zzakz com_google_android_gms_internal_zzakz) {
        this.zzbWa = com_google_android_gms_internal_zzakz;
    }

    public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        Type zzWm = com_google_android_gms_internal_zzalv_T.zzWm();
        Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
        if (!Collection.class.isAssignableFrom(zzWl)) {
            return null;
        }
        Type zza = zzaky.zza(zzWm, zzWl);
        return new a(com_google_android_gms_internal_zzajz, zza, com_google_android_gms_internal_zzajz.zza(zzalv.zzl(zza)), this.zzbWa.zzb(com_google_android_gms_internal_zzalv_T));
    }
}
