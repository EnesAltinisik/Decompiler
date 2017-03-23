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

public class zzqs extends zzqr<zzrd> {

    static abstract class a<R extends Result> extends zza<R, zzqs> {
        public a(GoogleApiClient googleApiClient) {
            super(Fitness.zzaCy, googleApiClient);
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

    public static class zzb extends Api.zza<zzqs, NoOptions> {
        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzg(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzqs zzg(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzqs(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public zzqs(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 59, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbC(iBinder);
    }

    protected zzrd zzbC(IBinder iBinder) {
        return zzrd.zza.zzbN(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.fitness.BleApi";
    }

    protected String zzhU() {
        return "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
    }
}
