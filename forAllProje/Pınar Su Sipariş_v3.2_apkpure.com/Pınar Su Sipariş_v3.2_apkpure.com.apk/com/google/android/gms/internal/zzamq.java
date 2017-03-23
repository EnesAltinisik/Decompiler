package com.google.android.gms.internal;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public class zzamq extends CustomTabsServiceConnection {
    private WeakReference<zzamr> zzcbb;

    public zzamq(zzamr com_google_android_gms_internal_zzamr) {
        this.zzcbb = new WeakReference(com_google_android_gms_internal_zzamr);
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzamr com_google_android_gms_internal_zzamr = (zzamr) this.zzcbb.get();
        if (com_google_android_gms_internal_zzamr != null) {
            com_google_android_gms_internal_zzamr.zza(customTabsClient);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zzamr com_google_android_gms_internal_zzamr = (zzamr) this.zzcbb.get();
        if (com_google_android_gms_internal_zzamr != null) {
            com_google_android_gms_internal_zzamr.zzeG();
        }
    }
}
