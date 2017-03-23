package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import com.google.firebase.FirebaseApp;
import java.util.Random;

public class zzajk {
    static zze zzacm = new zzh();
    private static Random zzbBM = new Random();
    static zzajm zzbVF = new zzajn();
    private volatile boolean zzK;
    private FirebaseApp zzbSD;
    private long zzbVG;

    public zzajk(FirebaseApp firebaseApp, long j) {
        this.zzbSD = firebaseApp;
        this.zzbVG = j;
    }

    public void cancel() {
        this.zzK = true;
    }

    public void reset() {
        this.zzK = false;
    }

    public void zza(zzajt com_google_android_gms_internal_zzajt, boolean z) {
        zzaa.zzz(com_google_android_gms_internal_zzajt);
        long elapsedRealtime = zzacm.elapsedRealtime() + this.zzbVG;
        if (z) {
            com_google_android_gms_internal_zzajt.zza(zzajp.zzh(this.zzbSD), this.zzbSD.getApplicationContext());
        } else {
            com_google_android_gms_internal_zzajt.zziM(zzajp.zzh(this.zzbSD));
        }
        int i = 1000;
        while (zzacm.elapsedRealtime() + ((long) i) <= elapsedRealtime && !com_google_android_gms_internal_zzajt.zzVt() && zznO(com_google_android_gms_internal_zzajt.getResultCode())) {
            try {
                zzbVF.zznP(zzbBM.nextInt(250) + i);
                if (i < 30000) {
                    if (com_google_android_gms_internal_zzajt.getResultCode() != -2) {
                        i *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i = 1000;
                    }
                }
                if (!this.zzK) {
                    com_google_android_gms_internal_zzajt.reset();
                    if (z) {
                        com_google_android_gms_internal_zzajt.zza(zzajp.zzh(this.zzbSD), this.zzbSD.getApplicationContext());
                    } else {
                        com_google_android_gms_internal_zzajt.zziM(zzajp.zzh(this.zzbSD));
                    }
                } else {
                    return;
                }
            } catch (InterruptedException e) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void zzd(zzajt com_google_android_gms_internal_zzajt) {
        zza(com_google_android_gms_internal_zzajt, true);
    }

    public boolean zznO(int i) {
        return (i >= 500 && i < 600) || i == -2 || i == 429;
    }
}
