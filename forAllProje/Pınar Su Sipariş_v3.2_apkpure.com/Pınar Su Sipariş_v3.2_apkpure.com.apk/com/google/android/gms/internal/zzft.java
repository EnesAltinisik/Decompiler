package com.google.android.gms.internal;

import com.google.android.gms.internal.zzgc.zza;

@zzig
public final class zzft extends zza {
    private zzfv.zza zzET;
    private zzfs zzEU;
    private final Object zzpp = new Object();

    public void onAdClicked() {
        synchronized (this.zzpp) {
            if (this.zzEU != null) {
                this.zzEU.zzbu();
            }
        }
    }

    public void onAdClosed() {
        synchronized (this.zzpp) {
            if (this.zzEU != null) {
                this.zzEU.zzbv();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.zzpp) {
            if (this.zzET != null) {
                this.zzET.zzw(i == 3 ? 1 : 2);
                this.zzET = null;
            }
        }
    }

    public void onAdImpression() {
        synchronized (this.zzpp) {
            if (this.zzEU != null) {
                this.zzEU.zzbz();
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.zzpp) {
            if (this.zzEU != null) {
                this.zzEU.zzbw();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoaded() {
        /*
        r3 = this;
        r1 = r3.zzpp;
        monitor-enter(r1);
        r0 = r3.zzET;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.zzET;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.zzw(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.zzET = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.zzEU;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.zzEU;	 Catch:{ all -> 0x001d }
        r0.zzby();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzft.onAdLoaded():void");
    }

    public void onAdOpened() {
        synchronized (this.zzpp) {
            if (this.zzEU != null) {
                this.zzEU.zzbx();
            }
        }
    }

    public void zza(zzfs com_google_android_gms_internal_zzfs) {
        synchronized (this.zzpp) {
            this.zzEU = com_google_android_gms_internal_zzfs;
        }
    }

    public void zza(zzfv.zza com_google_android_gms_internal_zzfv_zza) {
        synchronized (this.zzpp) {
            this.zzET = com_google_android_gms_internal_zzfv_zza;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zza(com.google.android.gms.internal.zzgd r4) {
        /*
        r3 = this;
        r1 = r3.zzpp;
        monitor-enter(r1);
        r0 = r3.zzET;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.zzET;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.zza(r2, r4);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.zzET = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.zzEU;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.zzEU;	 Catch:{ all -> 0x001d }
        r0.zzby();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzft.zza(com.google.android.gms.internal.zzgd):void");
    }
}
