package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzlw;
import java.util.ListIterator;

public class zza extends zzh<zza> {
    private final zzf zzTE;
    private boolean zzTF;

    public zza(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf.zzlT(), com_google_android_gms_analytics_internal_zzf.zzlQ());
        this.zzTE = com_google_android_gms_analytics_internal_zzf;
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.zzTF = z;
    }

    protected void zza(zze com_google_android_gms_analytics_zze) {
        zzlw com_google_android_gms_internal_zzlw = (zzlw) com_google_android_gms_analytics_zze.zzb(zzlw.class);
        if (TextUtils.isEmpty(com_google_android_gms_internal_zzlw.zzku())) {
            com_google_android_gms_internal_zzlw.setClientId(this.zzTE.zzmh().zzmP());
        }
        if (this.zzTF && TextUtils.isEmpty(com_google_android_gms_internal_zzlw.zzls())) {
            com.google.android.gms.analytics.internal.zza zzmg = this.zzTE.zzmg();
            com_google_android_gms_internal_zzlw.zzbw(zzmg.zzlE());
            com_google_android_gms_internal_zzlw.zzN(zzmg.zzlt());
        }
    }

    public void zzbf(String str) {
        zzaa.zzdl(str);
        zzbg(str);
        zzkK().add(new zzb(this.zzTE, str));
    }

    public void zzbg(String str) {
        Uri zzbh = zzb.zzbh(str);
        ListIterator listIterator = zzkK().listIterator();
        while (listIterator.hasNext()) {
            if (zzbh.equals(((zzk) listIterator.next()).zzkn())) {
                listIterator.remove();
            }
        }
    }

    zzf zzkj() {
        return this.zzTE;
    }

    public zze zzkk() {
        zze zzky = zzkJ().zzky();
        zzky.zza(this.zzTE.zzlY().zzmx());
        zzky.zza(this.zzTE.zzlZ().zznE());
        zzd(zzky);
        return zzky;
    }
}
