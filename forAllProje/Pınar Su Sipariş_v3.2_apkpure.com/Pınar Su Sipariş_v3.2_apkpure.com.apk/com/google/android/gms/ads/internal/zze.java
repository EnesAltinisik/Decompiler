package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn.zza;

@zzig
public class zze {
    private final Context mContext;
    private final AutoClickProtectionConfigurationParcel zzqq;
    private boolean zzqr;

    public zze(Context context) {
        this(context, false);
    }

    public zze(Context context, zza com_google_android_gms_internal_zzjn_zza) {
        this.mContext = context;
        if (com_google_android_gms_internal_zzjn_zza == null || com_google_android_gms_internal_zzjn_zza.zzPi.zzMj == null) {
            this.zzqq = new AutoClickProtectionConfigurationParcel();
        } else {
            this.zzqq = com_google_android_gms_internal_zzjn_zza.zzPi.zzMj;
        }
    }

    public zze(Context context, boolean z) {
        this.mContext = context;
        this.zzqq = new AutoClickProtectionConfigurationParcel(z);
    }

    public void recordClick() {
        this.zzqr = true;
    }

    public boolean zzbG() {
        return !this.zzqq.zzMl || this.zzqr;
    }

    public void zzt(String str) {
        if (str == null) {
            str = "";
        }
        zzb.zzaV("Action was blocked because no touch was detected.");
        if (this.zzqq.zzMl && this.zzqq.zzMm != null) {
            for (String str2 : this.zzqq.zzMm) {
                if (!TextUtils.isEmpty(str2)) {
                    zzu.zzck().zzc(this.mContext, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                }
            }
        }
    }
}
