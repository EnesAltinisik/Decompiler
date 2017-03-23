package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class zzabf {
    private final String zzahE;
    private final List<zzvg> zzbvx;

    public static class zza {
        private String zzahE;
        private List<zzvg> zzbvx = new ArrayList();

        public zzabf zzMg() {
            return new zzabf(this.zzahE, this.zzbvx);
        }

        public zza zza(zzvg com_google_android_gms_internal_zzvg) {
            this.zzbvx.add(com_google_android_gms_internal_zzvg);
            return this;
        }

        public zza zzhs(String str) {
            this.zzahE = str;
            return this;
        }
    }

    private zzabf(String str, List<zzvg> list) {
        this.zzahE = str;
        this.zzbvx = list;
    }

    public List<zzvg> zzMf() {
        return this.zzbvx;
    }
}
