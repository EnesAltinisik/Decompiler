package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzabc {
    private String zzahE;
    private final List<zzabe> zzbvo;
    private final Map<String, zzabd> zzbvp;
    private int zzbvq;

    public static class zza {
        private String zzahE = "";
        private final List<zzabe> zzbvo = new ArrayList();
        private final Map<String, zzabd> zzbvp = new HashMap();
        private int zzbvq = 0;

        public zzabc zzLX() {
            return new zzabc(this.zzbvo, this.zzbvp, this.zzahE, 0);
        }

        public zza zza(zzabe com_google_android_gms_internal_zzabe) {
            this.zzbvo.add(com_google_android_gms_internal_zzabe);
            return this;
        }

        public zza zzc(zzabd com_google_android_gms_internal_zzabd) {
            this.zzbvp.put(((zzabg) com_google_android_gms_internal_zzabd.zzLY().get("instance_name")).toString(), com_google_android_gms_internal_zzabd);
            return this;
        }

        public zza zzhr(String str) {
            this.zzahE = str;
            return this;
        }
    }

    public zzabc(List<zzabe> list, Map<String, zzabd> map, String str, int i) {
        this.zzbvo = Collections.unmodifiableList(list);
        this.zzbvp = Collections.unmodifiableMap(map);
        this.zzahE = str;
        this.zzbvq = i;
    }

    public String getVersion() {
        return this.zzahE;
    }

    public String toString() {
        String valueOf = String.valueOf(zzLW());
        String valueOf2 = String.valueOf(this.zzbvp);
        return new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("\n  Macros: ").append(valueOf2).toString();
    }

    public List<zzabe> zzLW() {
        return this.zzbvo;
    }

    public zzabd zzhq(String str) {
        return (zzabd) this.zzbvp.get(str);
    }
}
