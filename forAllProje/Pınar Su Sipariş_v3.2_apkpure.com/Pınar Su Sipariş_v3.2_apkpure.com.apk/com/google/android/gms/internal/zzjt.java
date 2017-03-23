package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzjt {
    private int zzPZ;
    private final String zzPl;
    private int zzQa;
    private final Object zzpp;
    private final zzjq zzsc;

    zzjt(zzjq com_google_android_gms_internal_zzjq, String str) {
        this.zzpp = new Object();
        this.zzsc = com_google_android_gms_internal_zzjq;
        this.zzPl = str;
    }

    public zzjt(String str) {
        this(zzu.zzcn(), str);
    }

    public Bundle toBundle() {
        Bundle bundle;
        synchronized (this.zzpp) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.zzPZ);
            bundle.putInt("pmnll", this.zzQa);
        }
        return bundle;
    }

    public void zzh(int i, int i2) {
        synchronized (this.zzpp) {
            this.zzPZ = i;
            this.zzQa = i2;
            this.zzsc.zza(this.zzPl, this);
        }
    }
}
