package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzjn.zza;

@zzig
public class zziz extends zzjv implements zzja, zzjd {
    private final Context mContext;
    private final String zzEV;
    private final zza zzJJ;
    private int zzKa = 3;
    private final zzjf zzOE;
    private final zzjd zzOF;
    private final String zzOG;
    private final String zzOH;
    private int zzOI = 0;
    private final Object zzpp;

    public zziz(Context context, String str, String str2, String str3, zza com_google_android_gms_internal_zzjn_zza, zzjf com_google_android_gms_internal_zzjf, zzjd com_google_android_gms_internal_zzjd) {
        this.mContext = context;
        this.zzEV = str;
        this.zzOG = str2;
        this.zzOH = str3;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzOE = com_google_android_gms_internal_zzjf;
        this.zzpp = new Object();
        this.zzOF = com_google_android_gms_internal_zzjd;
    }

    private void zza(AdRequestParcel adRequestParcel, zzgb com_google_android_gms_internal_zzgb) {
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzEV)) {
                com_google_android_gms_internal_zzgb.zza(adRequestParcel, this.zzOG, this.zzOH);
            } else {
                com_google_android_gms_internal_zzgb.zzc(adRequestParcel, this.zzOG);
            }
        } catch (Throwable e) {
            zzb.zzd("Fail to load ad from adapter.", e);
            zza(this.zzEV, 0);
        }
    }

    private void zzk(long j) {
        while (true) {
            synchronized (this.zzpp) {
                if (this.zzOI != 0) {
                    return;
                } else if (!zzf(j)) {
                    return;
                }
            }
        }
    }

    public void onStop() {
    }

    public void zzU(int i) {
        zza(this.zzEV, 0);
    }

    public void zza(String str, int i) {
        synchronized (this.zzpp) {
            this.zzOI = 2;
            this.zzKa = i;
            this.zzpp.notify();
        }
    }

    public void zzaF(String str) {
        synchronized (this.zzpp) {
            this.zzOI = 1;
            this.zzpp.notify();
        }
    }

    public void zzbQ() {
        if (this.zzOE != null && this.zzOE.zziq() != null && this.zzOE.zzip() != null) {
            final zzjc zziq = this.zzOE.zziq();
            zziq.zza((zzjd) this);
            zziq.zza((zzja) this);
            final AdRequestParcel adRequestParcel = this.zzJJ.zzPh.zzLi;
            final zzgb zzip = this.zzOE.zzip();
            try {
                if (zzip.isInitialized()) {
                    com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
                        final /* synthetic */ zziz c;

                        public void run() {
                            this.c.zza(adRequestParcel, zzip);
                        }
                    });
                } else {
                    com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
                        final /* synthetic */ zziz d;

                        public void run() {
                            try {
                                zzip.zza(zze.zzD(this.d.mContext), adRequestParcel, null, zziq, this.d.zzOG);
                            } catch (Throwable e) {
                                Throwable th = e;
                                String str = "Fail to initialize adapter ";
                                String valueOf = String.valueOf(this.d.zzEV);
                                zzb.zzd(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
                                this.d.zza(this.d.zzEV, 0);
                            }
                        }
                    });
                }
            } catch (Throwable e) {
                zzb.zzd("Fail to check if adapter is initialized.", e);
                zza(this.zzEV, 0);
            }
            zzk(zzu.zzco().elapsedRealtime());
            zziq.zza(null);
            zziq.zza(null);
            if (this.zzOI == 1) {
                this.zzOF.zzaF(this.zzEV);
            } else {
                this.zzOF.zza(this.zzEV, this.zzKa);
            }
        }
    }

    protected boolean zzf(long j) {
        long elapsedRealtime = 20000 - (zzu.zzco().elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.zzpp.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }

    public void zzin() {
        zza(this.zzJJ.zzPh.zzLi, this.zzOE.zzip());
    }
}
