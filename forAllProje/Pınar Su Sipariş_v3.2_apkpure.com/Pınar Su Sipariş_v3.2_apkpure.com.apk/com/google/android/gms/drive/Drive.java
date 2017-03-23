package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.drive.internal.zzaa;
import com.google.android.gms.drive.internal.zzac;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.internal.zzu;
import com.google.android.gms.drive.internal.zzx;

public final class Drive {
    public static final Api<NoOptions> API = new Api("Drive.API", new zza<NoOptions>() {
        protected Bundle a(NoOptions noOptions) {
            return new Bundle();
        }

        protected /* synthetic */ Bundle zza(ApiOptions apiOptions) {
            return a((NoOptions) apiOptions);
        }
    }, zzaaz);
    public static final DriveApi DriveApi = new zzs();
    public static final DrivePreferencesApi DrivePreferencesApi = new zzaa();
    public static final Scope SCOPE_APPFOLDER = new Scope(Scopes.DRIVE_APPFOLDER);
    public static final Scope SCOPE_FILE = new Scope(Scopes.DRIVE_FILE);
    public static final zzf<zzu> zzaaz = new zzf();
    public static final Scope zzave = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope zzavf = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final Api<zzb> zzavg = new Api("Drive.INTERNAL_API", new zza<zzb>() {
        protected Bundle a(zzb com_google_android_gms_drive_Drive_zzb) {
            return com_google_android_gms_drive_Drive_zzb == null ? new Bundle() : com_google_android_gms_drive_Drive_zzb.zzvF();
        }

        protected /* synthetic */ Bundle zza(ApiOptions apiOptions) {
            return a((zzb) apiOptions);
        }
    }, zzaaz);
    public static final zzd zzavh = new zzx();
    public static final zzf zzavi = new zzac();

    public static abstract class zza<O extends ApiOptions> extends com.google.android.gms.common.api.Api.zza<zzu, O> {
        protected abstract Bundle zza(O o);

        public zzu zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzu(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener, zza(o));
        }
    }

    public static class zzb implements Optional {
        public Bundle zzvF() {
            return null;
        }
    }

    private Drive() {
    }
}
