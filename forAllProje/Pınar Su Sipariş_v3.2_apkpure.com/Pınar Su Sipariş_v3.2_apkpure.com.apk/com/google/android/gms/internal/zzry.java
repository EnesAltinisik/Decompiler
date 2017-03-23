package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzl;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzrb.zza;

public class zzry implements SensorsApi {

    private interface a {
        void a();
    }

    private static class b extends zza {
        private final zzb<DataSourcesResult> a;

        private b(zzb<DataSourcesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataSourcesResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataSourcesResult;
        }

        public void zza(DataSourcesResult dataSourcesResult) {
            this.a.setResult(dataSourcesResult);
        }
    }

    private static class c extends zzrp.zza {
        private final zzb<Status> a;
        private final a b;

        private c(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, a aVar) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
            this.b = aVar;
        }

        public void zzo(Status status) {
            if (this.b != null && status.isSuccess()) {
                this.b.a();
            }
            this.a.setResult(status);
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent, a aVar) {
        final a aVar2 = aVar;
        final zzk com_google_android_gms_fitness_data_zzk2 = com_google_android_gms_fitness_data_zzk;
        final PendingIntent pendingIntent2 = pendingIntent;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzry d;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzqx com_google_android_gms_internal_zzqx) throws RemoteException {
                ((zzri) com_google_android_gms_internal_zzqx.zztm()).zza(new SensorUnregistrationRequest(com_google_android_gms_fitness_data_zzk2, pendingIntent2, new c(this, aVar2)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqx) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, SensorRequest sensorRequest, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent) {
        final SensorRequest sensorRequest2 = sensorRequest;
        final zzk com_google_android_gms_fitness_data_zzk2 = com_google_android_gms_fitness_data_zzk;
        final PendingIntent pendingIntent2 = pendingIntent;
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzry d;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzqx com_google_android_gms_internal_zzqx) throws RemoteException {
                ((zzri) com_google_android_gms_internal_zzqx.zztm()).zza(new SensorRegistrationRequest(sensorRequest2, com_google_android_gms_fitness_data_zzk2, pendingIntent2, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqx) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> add(GoogleApiClient googleApiClient, SensorRequest sensorRequest, PendingIntent pendingIntent) {
        return zza(googleApiClient, sensorRequest, null, pendingIntent);
    }

    public PendingResult<Status> add(GoogleApiClient googleApiClient, SensorRequest sensorRequest, OnDataPointListener onDataPointListener) {
        return zza(googleApiClient, sensorRequest, zzl.zza.zzxE().zza(onDataPointListener), null);
    }

    public PendingResult<DataSourcesResult> findDataSources(GoogleApiClient googleApiClient, final DataSourcesRequest dataSourcesRequest) {
        return googleApiClient.zzc(new a<DataSourcesResult>(this, googleApiClient) {
            final /* synthetic */ zzry b;

            protected DataSourcesResult a(Status status) {
                return DataSourcesResult.zzV(status);
            }

            protected void a(zzqx com_google_android_gms_internal_zzqx) throws RemoteException {
                ((zzri) com_google_android_gms_internal_zzqx.zztm()).zza(new DataSourcesRequest(dataSourcesRequest, new b(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqx) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return zza(googleApiClient, null, pendingIntent, null);
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, final OnDataPointListener onDataPointListener) {
        zzk zzb = zzl.zza.zzxE().zzb(onDataPointListener);
        return zzb == null ? PendingResults.zza(Status.zzalw, googleApiClient) : zza(googleApiClient, zzb, null, new a(this) {
            final /* synthetic */ zzry b;

            public void a() {
                zzl.zza.zzxE().zzc(onDataPointListener);
            }
        });
    }
}
