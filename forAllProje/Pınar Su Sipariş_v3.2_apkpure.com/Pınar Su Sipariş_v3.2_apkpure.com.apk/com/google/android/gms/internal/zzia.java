package com.google.android.gms.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.zzfj.zzb;
import com.google.android.gms.internal.zzfj.zze;
import com.google.android.gms.internal.zzkt.zzc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzig
public class zzia {
    private static final long zzKl = TimeUnit.SECONDS.toMillis(60);
    private static boolean zzKm = false;
    private static zzfj zzKn = null;
    private static final Object zzrs = new Object();
    private final Context mContext;
    private final zzq zzAT;
    private final zzaq zzAZ;
    private final com.google.android.gms.internal.zzjn.zza zzJJ;
    private zzfh zzKo;
    private zze zzKp;
    private zzfg zzKq;
    private boolean zzKr = false;

    public static abstract class zza {
        public abstract void zze(zzfk com_google_android_gms_internal_zzfk);

        public void zzhK() {
        }
    }

    public zzia(Context context, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zzq com_google_android_gms_ads_internal_zzq, zzaq com_google_android_gms_internal_zzaq) {
        this.mContext = context;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzAT = com_google_android_gms_ads_internal_zzq;
        this.zzAZ = com_google_android_gms_internal_zzaq;
        this.zzKr = ((Boolean) zzcu.zzze.get()).booleanValue();
    }

    private String zzd(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza) {
        String str = (String) zzcu.zzyd.get();
        String valueOf = String.valueOf(com_google_android_gms_internal_zzjn_zza.zzPi.zzHH.indexOf(Constants.SCHEME) == 0 ? "https:" : "http:");
        str = String.valueOf(str);
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    private void zzhC() {
        synchronized (zzrs) {
            if (!zzKm) {
                zzKn = new zzfj(this.mContext.getApplicationContext() != null ? this.mContext.getApplicationContext() : this.mContext, this.zzJJ.zzPh.zzsx, zzd(this.zzJJ), new zzke<zzfg>(this) {
                    final /* synthetic */ zzia a;

                    {
                        this.a = r1;
                    }

                    public void a(zzfg com_google_android_gms_internal_zzfg) {
                        com_google_android_gms_internal_zzfg.zza(this.a.zzAT, this.a.zzAT, this.a.zzAT, this.a.zzAT, false, null, null, null, null);
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfg) obj);
                    }
                }, new zzb());
                zzKm = true;
            }
        }
    }

    private void zzhD() {
        this.zzKp = new zze(zzhI().zzc(this.zzAZ));
    }

    private void zzhE() {
        this.zzKo = new zzfh();
    }

    private void zzhF() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        this.zzKq = (zzfg) zzhG().zza(this.mContext, this.zzJJ.zzPh.zzsx, zzd(this.zzJJ), this.zzAZ).get(zzKl, TimeUnit.MILLISECONDS);
        this.zzKq.zza(this.zzAT, this.zzAT, this.zzAT, this.zzAT, false, null, null, null, null);
    }

    public void zza(final zza com_google_android_gms_internal_zzia_zza) {
        if (this.zzKr) {
            zze zzhJ = zzhJ();
            if (zzhJ == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("SharedJavascriptEngine not initialized");
                return;
            } else {
                zzhJ.zza(new zzc<zzfk>(this) {
                    final /* synthetic */ zzia b;

                    public void a(zzfk com_google_android_gms_internal_zzfk) {
                        com_google_android_gms_internal_zzia_zza.zze(com_google_android_gms_internal_zzfk);
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfk) obj);
                    }
                }, new com.google.android.gms.internal.zzkt.zza(this) {
                    final /* synthetic */ zzia b;

                    public void run() {
                        com_google_android_gms_internal_zzia_zza.zzhK();
                    }
                });
                return;
            }
        }
        zzfk zzhH = zzhH();
        if (zzhH == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("JavascriptEngine not initialized");
        } else {
            com_google_android_gms_internal_zzia_zza.zze(zzhH);
        }
    }

    public void zzhA() {
        if (this.zzKr) {
            zzhC();
        } else {
            zzhE();
        }
    }

    public void zzhB() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        if (this.zzKr) {
            zzhD();
        } else {
            zzhF();
        }
    }

    protected zzfh zzhG() {
        return this.zzKo;
    }

    protected zzfg zzhH() {
        return this.zzKq;
    }

    protected zzfj zzhI() {
        return zzKn;
    }

    protected zze zzhJ() {
        return this.zzKp;
    }
}
