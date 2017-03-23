package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zzg;

public final class zztu {
    public static final Api<zztw> API = new Api("SignIn.API", zzaaA, zzaaz);
    public static final zzf<zzg> zzaCB = new zzf();
    public static final com.google.android.gms.common.api.Api.zza<zzg, zztw> zzaaA = new com.google.android.gms.common.api.Api.zza<zzg, zztw>() {
        public zzg a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, zztw com_google_android_gms_internal_zztw, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzg(context, looper, true, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zztw == null ? zztw.zzbnf : com_google_android_gms_internal_zztw, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (zztw) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zzg> zzaaz = new zzf();
    public static final Scope zzacw = new Scope(Scopes.PROFILE);
    public static final Scope zzacx = new Scope("email");
    public static final Api<zza> zzavg = new Api("SignIn.INTERNAL_API", zzbne, zzaCB);
    static final com.google.android.gms.common.api.Api.zza<zzg, zza> zzbne = new com.google.android.gms.common.api.Api.zza<zzg, zza>() {
        public zzg a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_internal_zztu_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzg(context, looper, false, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zztu_zza.zzIO(), connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (zza) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };

    public static class zza implements HasOptions {
        public Bundle zzIO() {
            return null;
        }
    }
}
