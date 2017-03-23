package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzd implements zzk {
    private static final Uri zzUj;
    private final LogPrinter zzUk = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzUj = builder.build();
    }

    public void zzb(zze com_google_android_gms_analytics_zze) {
        List<zzg> arrayList = new ArrayList(com_google_android_gms_analytics_zze.zzkz());
        Collections.sort(arrayList, new Comparator<zzg>(this) {
            final /* synthetic */ zzd a;

            {
                this.a = r1;
            }

            public int a(zzg com_google_android_gms_analytics_zzg, zzg com_google_android_gms_analytics_zzg2) {
                return com_google_android_gms_analytics_zzg.getClass().getCanonicalName().compareTo(com_google_android_gms_analytics_zzg2.getClass().getCanonicalName());
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((zzg) obj, (zzg) obj2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (zzg obj : arrayList) {
            Object obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.zzUk.println(stringBuilder.toString());
    }

    public Uri zzkn() {
        return zzUj;
    }
}
