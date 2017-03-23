package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzajh {
    private long zzbTB;
    private Map<String, zzajc> zzbTC;
    private boolean zzbTq;
    private int zzbTy;

    public zzajh() {
        this(-1);
    }

    public zzajh(int i, long j, Map<String, zzajc> map, boolean z) {
        Map hashMap;
        this.zzbTy = i;
        this.zzbTB = j;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.zzbTC = hashMap;
        this.zzbTq = z;
    }

    public zzajh(long j) {
        this(0, j, null, false);
    }

    public int getLastFetchStatus() {
        return this.zzbTy;
    }

    public boolean isDeveloperModeEnabled() {
        return this.zzbTq;
    }

    public Map<String, zzajc> zzUE() {
        return this.zzbTC;
    }

    public long zzUF() {
        return this.zzbTB;
    }

    public void zza(String str, zzajc com_google_android_gms_internal_zzajc) {
        this.zzbTC.put(str, com_google_android_gms_internal_zzajc);
    }

    public void zzaD(Map<String, zzajc> map) {
        Map hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.zzbTC = hashMap;
    }

    public void zzaL(long j) {
        this.zzbTB = j;
    }

    public void zzaT(boolean z) {
        this.zzbTq = z;
    }

    public void zziF(String str) {
        if (this.zzbTC.get(str) != null) {
            this.zzbTC.remove(str);
        }
    }

    public void zznJ(int i) {
        this.zzbTy = i;
    }
}
