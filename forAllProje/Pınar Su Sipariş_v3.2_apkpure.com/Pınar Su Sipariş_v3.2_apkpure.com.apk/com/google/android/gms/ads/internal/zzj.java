package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.h.j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr.zza;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzdu;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzdw;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzka;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzj extends zza {
    private final Context mContext;
    private final zzd zzpY;
    private final Object zzpp = new Object();
    private final zzq zzqG;
    private final zzdt zzqH;
    private final zzdu zzqI;
    private final j<String, zzdw> zzqJ;
    private final j<String, zzdv> zzqK;
    private final NativeAdOptionsParcel zzqL;
    private final List<String> zzqM;
    private final zzy zzqN;
    private final String zzqO;
    private final VersionInfoParcel zzqP;
    private WeakReference<zzq> zzqQ;
    private final zzga zzqc;

    zzj(Context context, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzq com_google_android_gms_ads_internal_client_zzq, zzdt com_google_android_gms_internal_zzdt, zzdu com_google_android_gms_internal_zzdu, j<String, zzdw> jVar, j<String, zzdv> jVar2, NativeAdOptionsParcel nativeAdOptionsParcel, zzy com_google_android_gms_ads_internal_client_zzy, zzd com_google_android_gms_ads_internal_zzd) {
        this.mContext = context;
        this.zzqO = str;
        this.zzqc = com_google_android_gms_internal_zzga;
        this.zzqP = versionInfoParcel;
        this.zzqG = com_google_android_gms_ads_internal_client_zzq;
        this.zzqI = com_google_android_gms_internal_zzdu;
        this.zzqH = com_google_android_gms_internal_zzdt;
        this.zzqJ = jVar;
        this.zzqK = jVar2;
        this.zzqL = nativeAdOptionsParcel;
        this.zzqM = zzbK();
        this.zzqN = com_google_android_gms_ads_internal_client_zzy;
        this.zzpY = com_google_android_gms_ads_internal_zzd;
    }

    private List<String> zzbK() {
        List<String> arrayList = new ArrayList();
        if (this.zzqI != null) {
            arrayList.add("1");
        }
        if (this.zzqH != null) {
            arrayList.add("2");
        }
        if (this.zzqJ.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.zzpp;
        monitor-enter(r2);
        r0 = r3.zzqQ;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.zzqQ;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzq) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.getMediationAdapterClassName();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzj.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLoading() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.zzpp;
        monitor-enter(r2);
        r0 = r3.zzqQ;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.zzqQ;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzq) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.isLoading();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzj.isLoading():boolean");
    }

    protected void runOnUiThread(Runnable runnable) {
        zzka.zzQu.post(runnable);
    }

    protected zzq zzbL() {
        return new zzq(this.mContext, this.zzpY, AdSizeParcel.zzk(this.mContext), this.zzqO, this.zzqc, this.zzqP);
    }

    public void zzf(final AdRequestParcel adRequestParcel) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzj b;

            public void run() {
                synchronized (this.b.zzpp) {
                    zzq zzbL = this.b.zzbL();
                    this.b.zzqQ = new WeakReference(zzbL);
                    zzbL.zzb(this.b.zzqH);
                    zzbL.zzb(this.b.zzqI);
                    zzbL.zza(this.b.zzqJ);
                    zzbL.zza(this.b.zzqG);
                    zzbL.zzb(this.b.zzqK);
                    zzbL.zzb(this.b.zzbK());
                    zzbL.zzb(this.b.zzqL);
                    zzbL.zza(this.b.zzqN);
                    zzbL.zzb(adRequestParcel);
                }
            }
        });
    }
}
