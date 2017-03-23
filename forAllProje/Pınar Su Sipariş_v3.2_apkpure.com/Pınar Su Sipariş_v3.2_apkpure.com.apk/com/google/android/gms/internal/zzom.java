package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.internal.zzy;

@Deprecated
public final class zzom {
    private static zzom zzaog;
    private static Object zzrs = new Object();
    private final String zzPx;
    private final String zzaoh;
    private final Status zzaoi;
    private final String zzaoj;
    private final String zzaok;
    private final String zzaol;
    private final boolean zzaom;
    private final boolean zzaon;

    zzom(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            if (z2) {
                z = false;
            }
            this.zzaon = z;
            z = z2;
        } else {
            this.zzaon = false;
        }
        this.zzaom = z;
        zzah com_google_android_gms_common_internal_zzah = new zzah(context);
        this.zzaoj = com_google_android_gms_common_internal_zzah.getString("firebase_database_url");
        this.zzaol = com_google_android_gms_common_internal_zzah.getString("google_storage_bucket");
        this.zzaok = com_google_android_gms_common_internal_zzah.getString("gcm_defaultSenderId");
        this.zzaoh = com_google_android_gms_common_internal_zzah.getString("google_api_key");
        Object zzaw = zzy.zzaw(context);
        if (zzaw == null) {
            zzaw = com_google_android_gms_common_internal_zzah.getString("google_app_id");
        }
        if (TextUtils.isEmpty(zzaw)) {
            this.zzaoi = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzPx = null;
            return;
        }
        this.zzPx = zzaw;
        this.zzaoi = Status.zzalw;
    }

    zzom(String str, boolean z) {
        this(str, z, null, null, null);
    }

    zzom(String str, boolean z, String str2, String str3, String str4) {
        this.zzPx = str;
        this.zzaoh = null;
        this.zzaoi = Status.zzalw;
        this.zzaom = z;
        this.zzaon = !z;
        this.zzaoj = str2;
        this.zzaok = str4;
        this.zzaol = str3;
    }

    public static Status zzas(Context context) {
        Status status;
        zzaa.zzb((Object) context, (Object) "Context must not be null.");
        synchronized (zzrs) {
            if (zzaog == null) {
                zzaog = new zzom(context);
            }
            status = zzaog.zzaoi;
        }
        return status;
    }

    public static Status zzc(Context context, String str, boolean z) {
        Status zzcQ;
        zzaa.zzb((Object) context, (Object) "Context must not be null.");
        zzaa.zzh(str, "App ID must be nonempty.");
        synchronized (zzrs) {
            if (zzaog != null) {
                zzcQ = zzaog.zzcQ(str);
            } else {
                zzaog = new zzom(str, z);
                zzcQ = zzaog.zzaoi;
            }
        }
        return zzcQ;
    }

    private static zzom zzcR(String str) {
        zzom com_google_android_gms_internal_zzom;
        synchronized (zzrs) {
            if (zzaog == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            com_google_android_gms_internal_zzom = zzaog;
        }
        return com_google_android_gms_internal_zzom;
    }

    public static String zzsA() {
        return zzcR("getGoogleAppId").zzPx;
    }

    public static boolean zzsB() {
        return zzcR("isMeasurementExplicitlyDisabled").zzaon;
    }

    Status zzcQ(String str) {
        if (this.zzPx == null || this.zzPx.equals(str)) {
            return Status.zzalw;
        }
        String str2 = this.zzPx;
        return new Status(10, new StringBuilder(String.valueOf(str2).length() + 97).append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '").append(str2).append("'.").toString());
    }
}
