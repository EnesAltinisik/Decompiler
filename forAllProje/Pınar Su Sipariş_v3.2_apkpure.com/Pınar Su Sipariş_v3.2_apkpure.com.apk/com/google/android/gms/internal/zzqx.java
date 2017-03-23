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

public class zzqx extends zzqr<zzri> {

    static abstract class a<R extends Result> extends zza<R, zzqx> {
        public a(GoogleApiClient googleApiClient) {
            super(Fitness.zzaCD, googleApiClient);
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

    public static class zzb extends Api.zza<zzqx, NoOptions> {
        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzl(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzqx zzl(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzqx(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public zzqx(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 55, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbH(iBinder);
    }

    protected zzri zzbH(IBinder iBinder) {
        return zzri.zza.zzbS(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.fitness.SensorsApi";
    }

    protected String zzhU() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
    }
}
