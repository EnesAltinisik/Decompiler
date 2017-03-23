package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;

@TargetApi(14)
@zzig
public final class zzlj extends zzlh {
    public zzlj(zzla com_google_android_gms_internal_zzla) {
        super(com_google_android_gms_internal_zzla);
    }

    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        zza(view, i, customViewCallback);
    }
}
