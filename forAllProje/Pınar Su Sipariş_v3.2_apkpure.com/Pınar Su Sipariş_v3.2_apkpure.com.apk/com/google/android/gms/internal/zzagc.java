package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzagc implements zzagd {
    private boolean zzbHW = false;

    private void zzPt() {
        zzaiv.zzb(this.zzbHW, "Transaction expected to already be in progress.");
    }

    public List<zzafn> zzPp() {
        return Collections.emptyList();
    }

    public void zzPs() {
        zzPt();
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, long j) {
        zzPt();
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, long j) {
        zzPt();
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, zzahu com_google_android_gms_internal_zzahu) {
        zzPt();
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, Set<zzahi> set) {
        zzPt();
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, Set<zzahi> set, Set<zzahi> set2) {
        zzPt();
    }

    public void zzat(long j) {
        zzPt();
    }

    public void zzc(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        zzPt();
    }

    public void zzd(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        zzPt();
    }

    public zzagm zzf(zzagu com_google_android_gms_internal_zzagu) {
        return new zzagm(zzahp.zza(zzahn.zzTA(), com_google_android_gms_internal_zzagu.zzSK()), false, false);
    }

    public <T> T zzf(Callable<T> callable) {
        zzaiv.zzb(!this.zzbHW, "runInTransaction called when an existing transaction is already in progress.");
        this.zzbHW = true;
        try {
            T call = callable.call();
            this.zzbHW = false;
            return call;
        } catch (Throwable th) {
            this.zzbHW = false;
        }
    }

    public void zzg(zzagu com_google_android_gms_internal_zzagu) {
        zzPt();
    }

    public void zzh(zzagu com_google_android_gms_internal_zzagu) {
        zzPt();
    }

    public void zzi(zzagu com_google_android_gms_internal_zzagu) {
        zzPt();
    }

    public void zzk(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzPt();
    }
}
