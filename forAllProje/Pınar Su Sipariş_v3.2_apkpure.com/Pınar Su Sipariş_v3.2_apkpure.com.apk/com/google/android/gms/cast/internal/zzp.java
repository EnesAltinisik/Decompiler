package com.google.android.gms.cast.internal;

import android.os.SystemClock;

public final class zzp {
    private static final zzl zzaeJ = new zzl("RequestTracker");
    public static final Object zznS = new Object();
    private long zzahA = -1;
    private long zzajf;
    private long zzajg = 0;
    private zzo zzajh;

    public zzp(long j) {
        this.zzajf = j;
    }

    private void zzqJ() {
        this.zzahA = -1;
        this.zzajh = null;
        this.zzajg = 0;
    }

    public void clear() {
        synchronized (zznS) {
            if (this.zzahA != -1) {
                zzqJ();
            }
        }
    }

    public boolean zzD(long j) {
        boolean z;
        synchronized (zznS) {
            z = this.zzahA != -1 && this.zzahA == j;
        }
        return z;
    }

    public void zza(long j, zzo com_google_android_gms_cast_internal_zzo) {
        synchronized (zznS) {
            zzo com_google_android_gms_cast_internal_zzo2 = this.zzajh;
            long j2 = this.zzahA;
            this.zzahA = j;
            this.zzajh = com_google_android_gms_cast_internal_zzo;
            this.zzajg = SystemClock.elapsedRealtime();
        }
        if (com_google_android_gms_cast_internal_zzo2 != null) {
            com_google_android_gms_cast_internal_zzo2.zzA(j2);
        }
    }

    public boolean zzc(long j, int i) {
        return zzc(j, i, null);
    }

    public boolean zzc(long j, int i, Object obj) {
        boolean z = true;
        zzo com_google_android_gms_cast_internal_zzo = null;
        synchronized (zznS) {
            if (this.zzahA == -1 || this.zzahA != j) {
                z = false;
            } else {
                zzaeJ.zzb("request %d completed", Long.valueOf(this.zzahA));
                com_google_android_gms_cast_internal_zzo = this.zzajh;
                zzqJ();
            }
        }
        if (com_google_android_gms_cast_internal_zzo != null) {
            com_google_android_gms_cast_internal_zzo.zza(j, i, obj);
        }
        return z;
    }

    public boolean zzd(long j, int i) {
        zzo com_google_android_gms_cast_internal_zzo;
        boolean z = true;
        long j2 = 0;
        synchronized (zznS) {
            if (this.zzahA == -1 || j - this.zzajg < this.zzajf) {
                z = false;
                com_google_android_gms_cast_internal_zzo = null;
            } else {
                zzaeJ.zzb("request %d timed out", Long.valueOf(this.zzahA));
                j2 = this.zzahA;
                com_google_android_gms_cast_internal_zzo = this.zzajh;
                zzqJ();
            }
        }
        if (com_google_android_gms_cast_internal_zzo != null) {
            com_google_android_gms_cast_internal_zzo.zza(j2, i, null);
        }
        return z;
    }

    public boolean zzqK() {
        boolean z;
        synchronized (zznS) {
            z = this.zzahA != -1;
        }
        return z;
    }
}
