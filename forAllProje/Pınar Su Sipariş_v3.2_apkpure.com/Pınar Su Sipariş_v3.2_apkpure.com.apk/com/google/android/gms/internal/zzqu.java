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

public class zzqu extends zzqr<zzrf> {

    static abstract class a<R extends Result> extends zza<R, zzqu> {
        public a(GoogleApiClient googleApiClient) {
            super(Fitness.zzaCA, googleApiClient);
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

    public static class zzb extends Api.zza<zzqu, NoOptions> {
        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzi(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzqu zzi(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzqu(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public zzqu(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 57, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbE(iBinder);
    }

    protected zzrf zzbE(IBinder iBinder) {
        return zzrf.zza.zzbP(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.fitness.HistoryApi";
    }

    protected String zzhU() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }
}
