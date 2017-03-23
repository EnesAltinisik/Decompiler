package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzsc.zza;

public class zzrt implements BleApi {

    private static class a extends zza {
        private final zzb<BleDevicesResult> a;

        private a(zzb<BleDevicesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_BleDevicesResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_BleDevicesResult;
        }

        public void zza(BleDevicesResult bleDevicesResult) {
            this.a.setResult(bleDevicesResult);
        }
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient googleApiClient, final BleDevice bleDevice) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrt b;

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new ClaimBleDeviceRequest(bleDevice.getAddress(), bleDevice, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrt b;

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new ClaimBleDeviceRequest(str, null, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new a<BleDevicesResult>(this, googleApiClient) {
            final /* synthetic */ zzrt a;

            protected BleDevicesResult a(Status status) {
                return BleDevicesResult.zzU(status);
            }

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new ListClaimedBleDevicesRequest(new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> startBleScan(GoogleApiClient googleApiClient, final StartBleScanRequest startBleScanRequest) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrt b;

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new StartBleScanRequest(startBleScanRequest, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> stopBleScan(GoogleApiClient googleApiClient, final BleScanCallback bleScanCallback) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrt b;

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new StopBleScanRequest(bleScanCallback, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient googleApiClient, BleDevice bleDevice) {
        return unclaimBleDevice(googleApiClient, bleDevice.getAddress());
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrt b;

            protected void a(zzqs com_google_android_gms_internal_zzqs) throws RemoteException {
                ((zzrd) com_google_android_gms_internal_zzqs.zztm()).zza(new UnclaimBleDeviceRequest(str, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqs) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
