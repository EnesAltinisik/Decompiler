package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.internal.zznt.zza;

public class zzqw extends zzqr<zzrh> {

    static abstract class a<R extends Result> extends zza<R, zzqw> {
        public a(GoogleApiClient googleApiClient) {
            super(Fitness.zzaCC, googleApiClient);
        }
    }

    static abstract class b extends a<Status> {
        b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected Status a(Status status) {
            zzaa.zzaj(!status.isSuccess());
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public static class zzb extends Api.zza<zzqw, NoOptions> {
        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzk(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzqw zzk(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzqw(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public zzqw(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 56, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbG(iBinder);
    }

    protected zzrh zzbG(IBinder iBinder) {
        return zzrh.zza.zzbR(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.fitness.RecordingApi";
    }

    protected String zzhU() {
        return "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi";
    }
}
