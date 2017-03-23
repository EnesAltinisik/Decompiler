package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class zzafh {
    private zzahu a = null;
    private Map<zzahi, zzafh> b = null;

    public interface zzb {
        void zzf(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu);
    }

    public interface zza {
        void zza(zzahi com_google_android_gms_internal_zzahi, zzafh com_google_android_gms_internal_zzafh);
    }

    public void a(final zzafa com_google_android_gms_internal_zzafa, final zzb com_google_android_gms_internal_zzafh_zzb) {
        if (this.a != null) {
            com_google_android_gms_internal_zzafh_zzb.zzf(com_google_android_gms_internal_zzafa, this.a);
        } else {
            a(new zza(this) {
                final /* synthetic */ zzafh c;

                public void zza(zzahi com_google_android_gms_internal_zzahi, zzafh com_google_android_gms_internal_zzafh) {
                    com_google_android_gms_internal_zzafh.a(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzafh_zzb);
                }
            });
        }
    }

    public void a(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            this.a = com_google_android_gms_internal_zzahu;
            this.b = null;
        } else if (this.a != null) {
            this.a = this.a.zzl(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            if (!this.b.containsKey(zzRt)) {
                this.b.put(zzRt, new zzafh());
            }
            ((zzafh) this.b.get(zzRt)).a(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzahu);
        }
    }

    public void a(zza com_google_android_gms_internal_zzafh_zza) {
        if (this.b != null) {
            for (Entry entry : this.b.entrySet()) {
                com_google_android_gms_internal_zzafh_zza.zza((zzahi) entry.getKey(), (zzafh) entry.getValue());
            }
        }
    }

    public boolean a(final zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            this.a = null;
            this.b = null;
            return true;
        } else if (this.a != null) {
            if (this.a.zzTo()) {
                return false;
            }
            zzahj com_google_android_gms_internal_zzahj = (zzahj) this.a;
            this.a = null;
            com_google_android_gms_internal_zzahj.zza(new com.google.android.gms.internal.zzahj.zza(this) {
                final /* synthetic */ zzafh b;

                public void zzb(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
                    this.b.a(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzahu);
                }
            });
            return a(com_google_android_gms_internal_zzafa);
        } else if (this.b == null) {
            return true;
        } else {
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            zzafa zzRu = com_google_android_gms_internal_zzafa.zzRu();
            if (this.b.containsKey(zzRt) && ((zzafh) this.b.get(zzRt)).a(zzRu)) {
                this.b.remove(zzRt);
            }
            if (!this.b.isEmpty()) {
                return false;
            }
            this.b = null;
            return true;
        }
    }
}
