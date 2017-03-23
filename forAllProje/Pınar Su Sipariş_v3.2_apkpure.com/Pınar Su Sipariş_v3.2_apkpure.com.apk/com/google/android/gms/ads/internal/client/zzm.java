package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzdx;
import com.google.android.gms.internal.zzgy;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzig;

@zzig
public class zzm {
    private static final Object zzrs = new Object();
    private static zzm zzvN;
    private final zza zzvO = new zza();
    private final zzl zzvP = new zzl(new zze(), new zzd(), new zzai(), new zzdx(), new zzf(), new zzhn(), new zzgy());

    static {
        zza(new zzm());
    }

    protected zzm() {
    }

    protected static void zza(zzm com_google_android_gms_ads_internal_client_zzm) {
        synchronized (zzrs) {
            zzvN = com_google_android_gms_ads_internal_client_zzm;
        }
    }

    private static zzm zzdP() {
        zzm com_google_android_gms_ads_internal_client_zzm;
        synchronized (zzrs) {
            com_google_android_gms_ads_internal_client_zzm = zzvN;
        }
        return com_google_android_gms_ads_internal_client_zzm;
    }

    public static zza zzdQ() {
        return zzdP().zzvO;
    }

    public static zzl zzdR() {
        return zzdP().zzvP;
    }
}
