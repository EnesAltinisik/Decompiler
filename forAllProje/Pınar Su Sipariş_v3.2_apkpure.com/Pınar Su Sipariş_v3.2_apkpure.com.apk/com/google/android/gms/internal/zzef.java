package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.plus.PlusShare;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Map;

@zzig
public final class zzef implements zzeh {
    private void zzb(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get(PlusShare.KEY_CALL_TO_ACTION_LABEL);
        String str2 = (String) map.get("start_label");
        String str3 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str)) {
            zzb.zzaW("No label given for CSI tick.");
        } else if (TextUtils.isEmpty(str3)) {
            zzb.zzaW("No timestamp given for CSI tick.");
        } else {
            try {
                long zzd = zzd(Long.parseLong(str3));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "native:view_load";
                }
                com_google_android_gms_internal_zzla.zzjM().zza(str, str2, zzd);
            } catch (Throwable e) {
                zzb.zzd("Malformed timestamp for CSI tick.", e);
            }
        }
    }

    private void zzc(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get(Param.VALUE);
        if (TextUtils.isEmpty(str)) {
            zzb.zzaW("No value given for CSI experiment.");
            return;
        }
        zzdc zzez = com_google_android_gms_internal_zzla.zzjM().zzez();
        if (zzez == null) {
            zzb.zzaW("No ticker for WebView, dropping experiment ID.");
        } else {
            zzez.zzf("e", str);
        }
    }

    private long zzd(long j) {
        return (j - zzu.zzco().currentTimeMillis()) + zzu.zzco().elapsedRealtime();
    }

    private void zzd(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("name");
        String str2 = (String) map.get(Param.VALUE);
        if (TextUtils.isEmpty(str2)) {
            zzb.zzaW("No value given for CSI extra.");
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzaW("No name given for CSI extra.");
        } else {
            zzdc zzez = com_google_android_gms_internal_zzla.zzjM().zzez();
            if (zzez == null) {
                zzb.zzaW("No ticker for WebView, dropping extra parameter.");
            } else {
                zzez.zzf(str, str2);
            }
        }
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            zzb(com_google_android_gms_internal_zzla, map);
        } else if ("experiment".equals(str)) {
            zzc(com_google_android_gms_internal_zzla, map);
        } else if ("extra".equals(str)) {
            zzd(com_google_android_gms_internal_zzla, map);
        }
    }
}
