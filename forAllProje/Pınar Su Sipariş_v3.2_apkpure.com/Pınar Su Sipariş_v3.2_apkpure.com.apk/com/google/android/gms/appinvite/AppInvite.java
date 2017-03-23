package com.google.android.gms.appinvite;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmh;

public final class AppInvite {
    public static final Api<NoOptions> API = new Api("AppInvite.API", zzaaA, zzaaz);
    public static final AppInviteApi AppInviteApi = new zzmg();
    private static final zza<zzmh, NoOptions> zzaaA = new zza<zzmh, NoOptions>() {
        public zzmh a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzmh(context, looper, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zzmh> zzaaz = new zzf();

    private AppInvite() {
    }
}
