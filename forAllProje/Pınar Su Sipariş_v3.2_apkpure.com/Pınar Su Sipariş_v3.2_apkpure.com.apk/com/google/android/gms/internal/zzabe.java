package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzabe {
    private final List<zzabd> zzbvt;
    private final List<zzabd> zzbvu;
    private final List<zzabd> zzbvv;
    private final List<zzabd> zzbvw;

    public static class zza {
        private final List<zzabd> zzbvt = new ArrayList();
        private final List<zzabd> zzbvu = new ArrayList();
        private final List<zzabd> zzbvv = new ArrayList();
        private final List<zzabd> zzbvw = new ArrayList();

        public zzabe zzMe() {
            return new zzabe(this.zzbvt, this.zzbvu, this.zzbvv, this.zzbvw);
        }

        public zza zzd(zzabd com_google_android_gms_internal_zzabd) {
            this.zzbvt.add(com_google_android_gms_internal_zzabd);
            return this;
        }

        public zza zze(zzabd com_google_android_gms_internal_zzabd) {
            this.zzbvu.add(com_google_android_gms_internal_zzabd);
            return this;
        }

        public zza zzf(zzabd com_google_android_gms_internal_zzabd) {
            this.zzbvv.add(com_google_android_gms_internal_zzabd);
            return this;
        }

        public zza zzg(zzabd com_google_android_gms_internal_zzabd) {
            this.zzbvw.add(com_google_android_gms_internal_zzabd);
            return this;
        }
    }

    private zzabe(List<zzabd> list, List<zzabd> list2, List<zzabd> list3, List<zzabd> list4) {
        this.zzbvt = Collections.unmodifiableList(list);
        this.zzbvu = Collections.unmodifiableList(list2);
        this.zzbvv = Collections.unmodifiableList(list3);
        this.zzbvw = Collections.unmodifiableList(list4);
    }

    public String toString() {
        String valueOf = String.valueOf(zzMa());
        String valueOf2 = String.valueOf(zzMb());
        String valueOf3 = String.valueOf(zzMc());
        String valueOf4 = String.valueOf(zzMd());
        return new StringBuilder((((String.valueOf(valueOf).length() + 71) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).toString();
    }

    public List<zzabd> zzMa() {
        return this.zzbvt;
    }

    public List<zzabd> zzMb() {
        return this.zzbvu;
    }

    public List<zzabd> zzMc() {
        return this.zzbvv;
    }

    public List<zzabd> zzMd() {
        return this.zzbvw;
    }
}
