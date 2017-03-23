package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzjn.zza;

@zzig
public class zzht extends zzhr {
    private zzhs zzJY;

    zzht(Context context, zza com_google_android_gms_internal_zzjn_zza, zzla com_google_android_gms_internal_zzla, zzhv.zza com_google_android_gms_internal_zzhv_zza) {
        super(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza);
    }

    protected void zzhq() {
        int i;
        int i2;
        AdSizeParcel zzbi = this.zzBb.zzbi();
        if (zzbi.zzvt) {
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = zzbi.widthPixels;
            i2 = zzbi.heightPixels;
        }
        this.zzJY = new zzhs(this, this.zzBb, i, i2);
        this.zzBb.zzjD().zza((zzlb.zza) this);
        this.zzJY.zza(this.zzJK);
    }

    protected int zzhr() {
        if (!this.zzJY.zzhv()) {
            return !this.zzJY.zzhw() ? 2 : -2;
        } else {
            zzb.zzaU("Ad-Network indicated no fill with passback URL.");
            return 3;
        }
    }
}
