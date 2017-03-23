package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.zzaa;

public class zzzw implements zzvh {
    private Context mContext;
    private DisplayMetrics zzGw = new DisplayMetrics();

    public zzzw(Context context) {
        this.mContext = context;
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.zzGw);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.zzGw.widthPixels);
        stringBuilder.append("x");
        stringBuilder.append(this.zzGw.heightPixels);
        return new zzabp(stringBuilder.toString());
    }
}
