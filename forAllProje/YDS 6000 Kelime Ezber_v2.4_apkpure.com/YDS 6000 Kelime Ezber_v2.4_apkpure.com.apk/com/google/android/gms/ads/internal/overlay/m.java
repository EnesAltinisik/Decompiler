package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.vz;
import com.google.android.gms.common.util.k;

@vz
public abstract class m {
    public abstract l a(Context context, aaq com_google_android_gms_b_aaq, int i, boolean z, qa qaVar);

    protected boolean a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return k.c() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11);
    }

    protected boolean a(aaq com_google_android_gms_b_aaq) {
        return com_google_android_gms_b_aaq.k().e;
    }
}
