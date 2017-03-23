package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzra.zza;

public class zzrv implements HistoryApi {

    private static class a extends zza {
        private final zzb<DataReadResult> a;
        private int b;
        private DataReadResult c;

        private a(zzb<DataReadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataReadResult) {
            this.b = 0;
            this.c = null;
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_DataReadResult;
        }

        public void zza(DataReadResult dataReadResult) {
            synchronized (this) {
                if (Log.isLoggable("Fitness", 2)) {
                    Log.v("Fitness", "Received batch result " + this.b);
                }
                if (this.c == null) {
                    this.c = dataReadResult;
                } else {
                    this.c.zzb(dataReadResult);
                }
                this.b++;
                if (this.b == this.c.zzyt()) {
                    this.a.setResult(this.c);
                }
            }
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final DataSet dataSet, final boolean z) {
        zzaa.zzb((Object) dataSet, (Object) "Must set the data set");
        zzaa.zza(!dataSet.getDataPoints().isEmpty(), (Object) "Cannot use an empty data set");
        zzaa.zzb(dataSet.getDataSource().zzxw(), (Object) "Must set the app package name for the data source");
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrv c;

            protected void a(zzqu com_google_android_gms_internal_zzqu) throws RemoteException {
                ((zzrf) com_google_android_gms_internal_zzqu.zztm()).zza(new DataInsertRequest(dataSet, new zzsa(this), z));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> deleteData(GoogleApiClient googleApiClient, final DataDeleteRequest dataDeleteRequest) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrv b;

            protected void a(zzqu com_google_android_gms_internal_zzqu) throws RemoteException {
                ((zzrf) com_google_android_gms_internal_zzqu.zztm()).zza(new DataDeleteRequest(dataDeleteRequest, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> insertData(GoogleApiClient googleApiClient, DataSet dataSet) {
        return zza(googleApiClient, dataSet, false);
    }

    public PendingResult<DailyTotalResult> readDailyTotal(GoogleApiClient googleApiClient, final DataType dataType) {
        return googleApiClient.zzc(new a<DailyTotalResult>(this, googleApiClient) {
            final /* synthetic */ zzrv b;

            protected DailyTotalResult a(Status status) {
                return DailyTotalResult.zza(status, dataType);
            }

            protected void a(zzqu com_google_android_gms_internal_zzqu) throws RemoteException {
                ((zzrf) com_google_android_gms_internal_zzqu.zztm()).zza(new DailyTotalRequest(new zzqz.zza(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void zza(DailyTotalResult dailyTotalResult) throws RemoteException {
                        this.a.zzb(dailyTotalResult);
                    }
                }, dataType));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqu) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<DataReadResult> readData(GoogleApiClient googleApiClient, final DataReadRequest dataReadRequest) {
        return googleApiClient.zzc(new a<DataReadResult>(this, googleApiClient) {
            final /* synthetic */ zzrv b;

            protected DataReadResult a(Status status) {
                return DataReadResult.zza(status, dataReadRequest);
            }

            protected void a(zzqu com_google_android_gms_internal_zzqu) throws RemoteException {
                ((zzrf) com_google_android_gms_internal_zzqu.zztm()).zza(new DataReadRequest(dataReadRequest, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqu) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> updateData(GoogleApiClient googleApiClient, final DataUpdateRequest dataUpdateRequest) {
        zzaa.zzb(dataUpdateRequest.getDataSet(), (Object) "Must set the data set");
        zzaa.zza(dataUpdateRequest.zzoq(), (Object) "Must set a non-zero value for startTimeMillis/startTime");
        zzaa.zza(dataUpdateRequest.zzxn(), (Object) "Must set a non-zero value for endTimeMillis/endTime");
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrv b;

            protected void a(zzqu com_google_android_gms_internal_zzqu) throws RemoteException {
                ((zzrf) com_google_android_gms_internal_zzqu.zztm()).zza(new DataUpdateRequest(dataUpdateRequest, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
