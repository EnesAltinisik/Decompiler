package com.google.android.gms.auth.api.credentials.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;

public class zzb {
    public static String zzcl(String str) {
        boolean z = false;
        zzaa.zzb(!TextUtils.isEmpty(str), (Object) "account type cannot be empty");
        String scheme = Uri.parse(str).getScheme();
        if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
            z = true;
        }
        zzaa.zzb(z, (Object) "Account type must be an http or https URI");
        return str;
    }
}
