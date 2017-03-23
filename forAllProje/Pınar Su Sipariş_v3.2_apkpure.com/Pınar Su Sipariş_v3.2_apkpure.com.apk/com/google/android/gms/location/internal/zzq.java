package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.location.LocationServices.zza;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

public class zzq implements SettingsApi {
    public PendingResult<LocationSettingsResult> checkLocationSettings(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        return zza(googleApiClient, locationSettingsRequest, null);
    }

    public PendingResult<LocationSettingsResult> zza(GoogleApiClient googleApiClient, final LocationSettingsRequest locationSettingsRequest, final String str) {
        return googleApiClient.zzc(new zza<LocationSettingsResult>(this, googleApiClient) {
            final /* synthetic */ zzq c;

            public LocationSettingsResult a(Status status) {
                return new LocationSettingsResult(status);
            }

            protected void a(zzl com_google_android_gms_location_internal_zzl) throws RemoteException {
                com_google_android_gms_location_internal_zzl.zza(locationSettingsRequest, (zzb) this, str);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzl) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
