package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzba;
import java.util.concurrent.ExecutorService;

public class zztz {
    private final Context mContext;
    private final zzaaq zzbsi;
    private final zzba zzbsk;
    private final zzax zzbsq;
    private final ExecutorService zzzP;

    public zztz(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
        this(context, com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax, new zzaaq(context), aw.a());
    }

    zztz(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax, zzaaq com_google_android_gms_internal_zzaaq, ExecutorService executorService) {
        zzaa.zzz(context);
        zzaa.zzz(com_google_android_gms_tagmanager_zzba);
        zzaa.zzz(com_google_android_gms_tagmanager_zzax);
        zzaa.zzz(com_google_android_gms_internal_zzaaq);
        zzaa.zzz(executorService);
        this.mContext = context.getApplicationContext();
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbsq = com_google_android_gms_tagmanager_zzax;
        this.zzbsi = com_google_android_gms_internal_zzaaq;
        this.zzzP = executorService;
    }

    public zzty zzn(String str, String str2, String str3) {
        return new zzty(str, str2, str3, new zzuv(this.mContext, this.zzbsk, this.zzbsq, str), this.zzbsi, this.zzzP, this.zzbsk);
    }
}
