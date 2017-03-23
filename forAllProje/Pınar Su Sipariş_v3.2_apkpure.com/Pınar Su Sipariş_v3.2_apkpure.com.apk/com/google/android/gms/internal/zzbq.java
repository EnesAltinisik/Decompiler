package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzbs.zza;

public final class zzbq extends zza {
    private final zzap zzpu;
    private final zzaq zzpv;
    private final zzan zzpw;
    private boolean zzpx = false;

    public zzbq(String str, Context context, boolean z) {
        this.zzpu = zzap.zza(str, context, z);
        this.zzpv = new zzaq(this.zzpu);
        this.zzpw = z ? null : zzan.zze(context);
    }

    private zzd zza(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, boolean z) {
        try {
            Uri uri = (Uri) zze.zzx(com_google_android_gms_dynamic_zzd);
            Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd2);
            return zze.zzD(z ? this.zzpv.zza(uri, context) : this.zzpv.zzb(uri, context));
        } catch (zzar e) {
            return null;
        }
    }

    public zzd zza(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2) {
        return zza(com_google_android_gms_dynamic_zzd, com_google_android_gms_dynamic_zzd2, true);
    }

    public String zza(zzd com_google_android_gms_dynamic_zzd, String str) {
        return this.zzpu.zzb((Context) zze.zzx(com_google_android_gms_dynamic_zzd), str);
    }

    public boolean zza(zzd com_google_android_gms_dynamic_zzd) {
        return this.zzpv.zza((Uri) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public zzd zzb(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2) {
        return zza(com_google_android_gms_dynamic_zzd, com_google_android_gms_dynamic_zzd2, false);
    }

    public void zzb(String str, String str2) {
        this.zzpv.zzb(str, str2);
    }

    public boolean zzb(zzd com_google_android_gms_dynamic_zzd) {
        return this.zzpv.zzc((Uri) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public boolean zzb(String str, boolean z) {
        if (this.zzpw == null) {
            return false;
        }
        this.zzpw.zza(new Info(str, z));
        this.zzpx = true;
        return true;
    }

    public String zzba() {
        return "ms";
    }

    public String zzc(zzd com_google_android_gms_dynamic_zzd) {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        String zzb = this.zzpu.zzb(context);
        if (this.zzpw == null || !this.zzpx) {
            return zzb;
        }
        String zza = this.zzpw.zza(zzb, this.zzpw.zzb(context));
        this.zzpx = false;
        return zza;
    }

    public void zzd(zzd com_google_android_gms_dynamic_zzd) {
        this.zzpv.zza((MotionEvent) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public void zzk(String str) {
        this.zzpv.zzk(str);
    }
}
