package com.google.android.gms.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class zzajf implements FirebaseRemoteConfigInfo {
    private long zzbTx;
    private int zzbTy;
    private FirebaseRemoteConfigSettings zzbTz;

    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.zzbTz;
    }

    public long getFetchTimeMillis() {
        return this.zzbTx;
    }

    public int getLastFetchStatus() {
        return this.zzbTy;
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.zzbTz = firebaseRemoteConfigSettings;
    }

    public void zzaK(long j) {
        this.zzbTx = j;
    }

    public void zznJ(int i) {
        this.zzbTy = i;
    }
}
