package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzl;

@zzig
public class zzey {
    private Context mContext;
    private final zzd zzpY;
    private final VersionInfoParcel zzqP;
    private final zzga zzqc;

    zzey(Context context, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        this.mContext = context;
        this.zzqc = com_google_android_gms_internal_zzga;
        this.zzqP = versionInfoParcel;
        this.zzpY = com_google_android_gms_ads_internal_zzd;
    }

    public Context getApplicationContext() {
        return this.mContext.getApplicationContext();
    }

    public zzl zzab(String str) {
        return new zzl(this.mContext, new AdSizeParcel(), str, this.zzqc, this.zzqP, this.zzpY);
    }

    public zzl zzac(String str) {
        return new zzl(this.mContext.getApplicationContext(), new AdSizeParcel(), str, this.zzqc, this.zzqP, this.zzpY);
    }

    public zzey zzfh() {
        return new zzey(getApplicationContext(), this.zzqc, this.zzqP, this.zzpY);
    }
}
