package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzalp extends zzakr<Object> {
    public static final zzaks zzbXD = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            return com_google_android_gms_internal_zzalv_T.zzWl() == Object.class ? new zzalp(com_google_android_gms_internal_zzajz) : null;
        }
    };
    private final zzajz zzbWz;

    private zzalp(zzajz com_google_android_gms_internal_zzajz) {
        this.zzbWz = com_google_android_gms_internal_zzajz;
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
        if (obj == null) {
            com_google_android_gms_internal_zzaly.zzWk();
            return;
        }
        zzakr zzk = this.zzbWz.zzk(obj.getClass());
        if (zzk instanceof zzalp) {
            com_google_android_gms_internal_zzaly.zzWi();
            com_google_android_gms_internal_zzaly.zzWj();
            return;
        }
        zzk.zza(com_google_android_gms_internal_zzaly, obj);
    }

    public Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        switch (com_google_android_gms_internal_zzalw.zzWa()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                com_google_android_gms_internal_zzalw.beginArray();
                while (com_google_android_gms_internal_zzalw.hasNext()) {
                    arrayList.add(zzb(com_google_android_gms_internal_zzalw));
                }
                com_google_android_gms_internal_zzalw.endArray();
                return arrayList;
            case BEGIN_OBJECT:
                Map com_google_android_gms_internal_zzald = new zzald();
                com_google_android_gms_internal_zzalw.beginObject();
                while (com_google_android_gms_internal_zzalw.hasNext()) {
                    com_google_android_gms_internal_zzald.put(com_google_android_gms_internal_zzalw.nextName(), zzb(com_google_android_gms_internal_zzalw));
                }
                com_google_android_gms_internal_zzalw.endObject();
                return com_google_android_gms_internal_zzald;
            case STRING:
                return com_google_android_gms_internal_zzalw.nextString();
            case NUMBER:
                return Double.valueOf(com_google_android_gms_internal_zzalw.nextDouble());
            case BOOLEAN:
                return Boolean.valueOf(com_google_android_gms_internal_zzalw.nextBoolean());
            case NULL:
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
