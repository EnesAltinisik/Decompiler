package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjw;

@zzig
public class zza {
    public boolean zza(Context context, Intent intent, zzp com_google_android_gms_ads_internal_overlay_zzp) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            zzjw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            zzu.zzck().zzb(context, intent);
            if (com_google_android_gms_ads_internal_overlay_zzp != null) {
                com_google_android_gms_ads_internal_overlay_zzp.zzbj();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzb.zzaW(e.getMessage());
            return false;
        }
    }

    public boolean zza(Context context, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, zzp com_google_android_gms_ads_internal_overlay_zzp) {
        if (adLauncherIntentInfoParcel == null) {
            zzb.zzaW("No intent data for launcher overlay.");
            return false;
        } else if (adLauncherIntentInfoParcel.intent != null) {
            return zza(context, adLauncherIntentInfoParcel.intent, com_google_android_gms_ads_internal_overlay_zzp);
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.url)) {
                zzb.zzaW("Open GMSG did not contain a URL.");
                return false;
            }
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.mimeType)) {
                intent.setData(Uri.parse(adLauncherIntentInfoParcel.url));
            } else {
                intent.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.url), adLauncherIntentInfoParcel.mimeType);
            }
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.packageName)) {
                intent.setPackage(adLauncherIntentInfoParcel.packageName);
            }
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.zzGH)) {
                String[] split = adLauncherIntentInfoParcel.zzGH.split("/", 2);
                if (split.length < 2) {
                    String str = "Could not parse component name from open GMSG: ";
                    String valueOf = String.valueOf(adLauncherIntentInfoParcel.zzGH);
                    zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return false;
                }
                intent.setClassName(split[0], split[1]);
            }
            Object obj = adLauncherIntentInfoParcel.zzGI;
            if (!TextUtils.isEmpty(obj)) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(obj);
                } catch (NumberFormatException e) {
                    zzb.zzaW("Could not parse intent flags.");
                    parseInt = 0;
                }
                intent.addFlags(parseInt);
            }
            return zza(context, intent, com_google_android_gms_ads_internal_overlay_zzp);
        }
    }
}
