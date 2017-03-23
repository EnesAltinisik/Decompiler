package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class zzali<E> extends zzakr<Object> {
    public static final zzaks zzbXD = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            Type zzWm = com_google_android_gms_internal_zzalv_T.zzWm();
            if (!(zzWm instanceof GenericArrayType) && (!(zzWm instanceof Class) || !((Class) zzWm).isArray())) {
                return null;
            }
            zzWm = zzaky.zzh(zzWm);
            return new zzali(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzajz.zza(zzalv.zzl(zzWm)), zzaky.zzf(zzWm));
        }
    };
    private final Class<E> zzbXE;
    private final zzakr<E> zzbXF;

    public zzali(zzajz com_google_android_gms_internal_zzajz, zzakr<E> com_google_android_gms_internal_zzakr_E, Class<E> cls) {
        this.zzbXF = new o(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzakr_E, cls);
        this.zzbXE = cls;
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
        if (obj == null) {
            com_google_android_gms_internal_zzaly.zzWk();
            return;
        }
        com_google_android_gms_internal_zzaly.zzWg();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.zzbXF.zza(com_google_android_gms_internal_zzaly, Array.get(obj, i));
        }
        com_google_android_gms_internal_zzaly.zzWh();
    }

    public Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }
        List arrayList = new ArrayList();
        com_google_android_gms_internal_zzalw.beginArray();
        while (com_google_android_gms_internal_zzalw.hasNext()) {
            arrayList.add(this.zzbXF.zzb(com_google_android_gms_internal_zzalw));
        }
        com_google_android_gms_internal_zzalw.endArray();
        Object newInstance = Array.newInstance(this.zzbXE, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
