package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzig
public abstract class zzhu extends zzjv {
    protected final Context mContext;
    protected final com.google.android.gms.internal.zzhv.zza zzJI;
    protected final com.google.android.gms.internal.zzjn.zza zzJJ;
    protected AdResponseParcel zzJK;
    protected final Object zzJM = new Object();
    protected final Object zzpp = new Object();

    protected static final class zza extends Exception {
        private final int zzKa;

        public zza(String str, int i) {
            super(str);
            this.zzKa = i;
        }

        public int getErrorCode() {
            return this.zzKa;
        }
    }

    protected zzhu(Context context, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, com.google.android.gms.internal.zzhv.zza com_google_android_gms_internal_zzhv_zza) {
        super(true);
        this.mContext = context;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzJK = com_google_android_gms_internal_zzjn_zza.zzPi;
        this.zzJI = com_google_android_gms_internal_zzhv_zza;
    }

    public void onStop() {
    }

    protected abstract zzjn zzI(int i);

    public void zzbQ() {
        int errorCode;
        synchronized (this.zzpp) {
            zzb.zzaU("AdRendererBackgroundTask started.");
            int i = this.zzJJ.errorCode;
            try {
                zzh(SystemClock.elapsedRealtime());
            } catch (zza e) {
                errorCode = e.getErrorCode();
                if (errorCode == 3 || errorCode == -1) {
                    zzb.zzaV(e.getMessage());
                } else {
                    zzb.zzaW(e.getMessage());
                }
                if (this.zzJK == null) {
                    this.zzJK = new AdResponseParcel(errorCode);
                } else {
                    this.zzJK = new AdResponseParcel(errorCode, this.zzJK.zzEL);
                }
                zzka.zzQu.post(new Runnable(this) {
                    final /* synthetic */ zzhu a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.onStop();
                    }
                });
                i = errorCode;
            }
            final zzjn zzI = zzI(i);
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzhu b;

                public void run() {
                    synchronized (this.b.zzpp) {
                        this.b.zzm(zzI);
                    }
                }
            });
        }
    }

    protected abstract void zzh(long j) throws zza;

    protected void zzm(zzjn com_google_android_gms_internal_zzjn) {
        this.zzJI.zzb(com_google_android_gms_internal_zzjn);
    }
}
