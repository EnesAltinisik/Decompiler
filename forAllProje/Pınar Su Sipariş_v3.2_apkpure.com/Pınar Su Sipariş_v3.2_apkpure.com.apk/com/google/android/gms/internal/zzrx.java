package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzrk.zza;

public class zzrx implements RecordingApi {

    private static class a extends zza {
        private final zzb<ListSubscriptionsResult> a;

        private a(zzb<ListSubscriptionsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_ListSubscriptionsResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_ListSubscriptionsResult;
        }

        public void zza(ListSubscriptionsResult listSubscriptionsResult) {
            this.a.setResult(listSubscriptionsResult);
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final Subscription subscription) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrx b;

            protected void a(zzqw com_google_android_gms_internal_zzqw) throws RemoteException {
                ((zzrh) com_google_android_gms_internal_zzqw.zztm()).zza(new SubscribeRequest(subscription, false, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqw) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new a<ListSubscriptionsResult>(this, googleApiClient) {
            final /* synthetic */ zzrx a;

            protected ListSubscriptionsResult a(Status status) {
                return ListSubscriptionsResult.zzX(status);
            }

            protected void a(zzqw com_google_android_gms_internal_zzqw) throws RemoteException {
                ((zzrh) com_google_android_gms_internal_zzqw.zztm()).zza(new ListSubscriptionsRequest(null, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqw) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient googleApiClient, final DataType dataType) {
        return googleApiClient.zzc(new a<ListSubscriptionsResult>(this, googleApiClient) {
            final /* synthetic */ zzrx b;

            protected ListSubscriptionsResult a(Status status) {
                return ListSubscriptionsResult.zzX(status);
            }

            protected void a(zzqw com_google_android_gms_internal_zzqw) throws RemoteException {
                ((zzrh) com_google_android_gms_internal_zzqw.zztm()).zza(new ListSubscriptionsRequest(dataType, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqw) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, DataSource dataSource) {
        return zza(googleApiClient, new Subscription.zza().zzb(dataSource).zzxJ());
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, DataType dataType) {
        return zza(googleApiClient, new Subscription.zza().zzb(dataType).zzxJ());
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, final DataSource dataSource) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrx b;

            protected void a(zzqw com_google_android_gms_internal_zzqw) throws RemoteException {
                ((zzrh) com_google_android_gms_internal_zzqw.zztm()).zza(new UnsubscribeRequest(null, dataSource, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqw) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, final DataType dataType) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrx b;

            protected void a(zzqw com_google_android_gms_internal_zzqw) throws RemoteException {
                ((zzrh) com_google_android_gms_internal_zzqw.zztm()).zza(new UnsubscribeRequest(dataType, null, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqw) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, Subscription subscription) {
        return subscription.getDataType() == null ? unsubscribe(googleApiClient, subscription.getDataSource()) : unsubscribe(googleApiClient, subscription.getDataType());
    }
}
