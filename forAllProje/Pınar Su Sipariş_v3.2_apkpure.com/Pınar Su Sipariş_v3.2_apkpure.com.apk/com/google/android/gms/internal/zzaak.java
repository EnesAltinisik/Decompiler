package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzaak extends zzvj {
    private final zzug zzbuC;

    public zzaak(zzug com_google_android_gms_internal_zzug) {
        this.zzbuC = com_google_android_gms_internal_zzug;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = false;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzaa.zzaj(!(com_google_android_gms_internal_zzabh instanceof zzabl));
        zzabl com_google_android_gms_internal_zzabl = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] : zzabl.zzbvN;
        boolean z2 = com_google_android_gms_internal_zzabl == zzabl.zzbvN || (com_google_android_gms_internal_zzabl instanceof zzabm);
        zzaa.zzaj(z2);
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr.length > 2 ? com_google_android_gms_internal_zzabh_Arr[2] : zzabl.zzbvN;
        if (com_google_android_gms_internal_zzabh2 == zzabl.zzbvN || !(com_google_android_gms_internal_zzabh2 instanceof zzabl)) {
            z = true;
        }
        zzaa.zzaj(z);
        Builder buildUpon = Uri.parse(zzvi.zzd(com_google_android_gms_internal_zzabh)).buildUpon();
        if (com_google_android_gms_internal_zzabl != zzabl.zzbvN) {
            for (zzabh com_google_android_gms_internal_zzabh3 : (List) ((zzabm) com_google_android_gms_internal_zzabl).zzMk()) {
                zzaa.zzaj(com_google_android_gms_internal_zzabh3 instanceof zzabn);
                for (Entry entry : ((Map) ((zzabn) com_google_android_gms_internal_zzabh3).zzMk()).entrySet()) {
                    buildUpon.appendQueryParameter(((String) entry.getKey()).toString(), zzvi.zzd(zzabq.zza(com_google_android_gms_internal_zzuw, (zzabh) entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        String str;
        if (com_google_android_gms_internal_zzabh2 == zzabl.zzbvN) {
            this.zzbuC.zzgw(uri);
            str = "SendPixel: url = ";
            uri = String.valueOf(uri);
            zzun.v(uri.length() != 0 ? str.concat(uri) : new String(str));
        } else {
            str = zzvi.zzd(com_google_android_gms_internal_zzabh2);
            this.zzbuC.zzae(uri, str);
            zzun.v(new StringBuilder((String.valueOf(uri).length() + 30) + String.valueOf(str).length()).append("SendPixel: url = ").append(uri).append(", uniqueId = ").append(str).toString());
        }
        return zzabl.zzbvN;
    }
}
