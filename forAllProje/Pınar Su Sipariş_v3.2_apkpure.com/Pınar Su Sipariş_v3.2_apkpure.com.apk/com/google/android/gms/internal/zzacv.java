package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;

public final class zzacv {
    public static final zzf<zzaco> zzaaz = new zzf();
    private static final com.google.android.gms.common.api.Api.zza<zzaco, zza> zzbFy = new com.google.android.gms.common.api.Api.zza<zzaco, zza>() {
        public zzaco a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_internal_zzacv_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzacp(context, looper, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zzacv_zza, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (zza) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final Api<zza> zzbFz = new Api("InternalFirebaseAuth.FIREBASE_AUTH_API", zzbFy, zzaaz);

    public static final class zza implements HasOptions {
        private final String zzaoh;

        public static final class zza {
            private String zzaoh;

            public zza(String str) {
                this.zzaoh = zzaa.zzdl(str);
            }

            public zza zzOw() {
                return new zza(this.zzaoh);
            }
        }

        private zza(String str) {
            this.zzaoh = zzaa.zzh(str, "A valid API key must be provided");
        }

        public String getApiKey() {
            return this.zzaoh;
        }
    }

    public static zzacn zza(Context context, zza com_google_android_gms_internal_zzacv_zza) {
        return new zzacn(context, com_google_android_gms_internal_zzacv_zza);
    }
}
