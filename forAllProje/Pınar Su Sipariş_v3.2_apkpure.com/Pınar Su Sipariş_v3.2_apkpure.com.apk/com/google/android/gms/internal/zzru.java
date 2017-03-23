package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzrc.zza;

public class zzru implements ConfigApi {

    private static class a extends zza {
        private final zzb<DataTypeResult> a;

        private a(zzb<DataTypeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataTypeResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataTypeResult;
        }

        public void zza(DataTypeResult dataTypeResult) {
            this.a.setResult(dataTypeResult);
        }
    }

    public PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient googleApiClient, final DataTypeCreateRequest dataTypeCreateRequest) {
        return googleApiClient.zzd(new a<DataTypeResult>(this, googleApiClient) {
            final /* synthetic */ zzru b;

            protected DataTypeResult a(Status status) {
                return DataTypeResult.zzW(status);
            }

            protected void a(zzqt com_google_android_gms_internal_zzqt) throws RemoteException {
                ((zzre) com_google_android_gms_internal_zzqt.zztm()).zza(new DataTypeCreateRequest(dataTypeCreateRequest, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqt) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> disableFit(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzru a;

            protected void a(zzqt com_google_android_gms_internal_zzqt) throws RemoteException {
                ((zzre) com_google_android_gms_internal_zzqt.zztm()).zza(new DisableFitRequest(new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqt) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<DataTypeResult> readDataType(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzc(new a<DataTypeResult>(this, googleApiClient) {
            final /* synthetic */ zzru b;

            protected DataTypeResult a(Status status) {
                return DataTypeResult.zzW(status);
            }

            protected void a(zzqt com_google_android_gms_internal_zzqt) throws RemoteException {
                ((zzre) com_google_android_gms_internal_zzqt.zztm()).zza(new DataTypeReadRequest(str, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqt) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
