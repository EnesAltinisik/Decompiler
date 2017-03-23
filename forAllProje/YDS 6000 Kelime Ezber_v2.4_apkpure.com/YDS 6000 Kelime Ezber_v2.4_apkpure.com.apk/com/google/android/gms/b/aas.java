package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.v;

@vz
public class aas {
    public aaq a(Context context, nx nxVar, boolean z, boolean z2, dp dpVar, aab com_google_android_gms_b_aab) {
        return a(context, nxVar, z, z2, dpVar, com_google_android_gms_b_aab, null, null, null);
    }

    public aaq a(Context context, nx nxVar, boolean z, boolean z2, dp dpVar, aab com_google_android_gms_b_aab, qa qaVar, t tVar, d dVar) {
        aaq com_google_android_gms_b_aat = new aat(aau.a(context, nxVar, z, z2, dpVar, com_google_android_gms_b_aab, qaVar, tVar, dVar));
        com_google_android_gms_b_aat.setWebViewClient(v.g().a(com_google_android_gms_b_aat, z2));
        com_google_android_gms_b_aat.setWebChromeClient(v.g().c(com_google_android_gms_b_aat));
        return com_google_android_gms_b_aat;
    }
}
