package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.location.places.zzl.zzd;
import com.google.android.gms.location.places.zzl.zzf;

public class zzj implements PlaceDetectionApi {
    public PendingResult<PlaceLikelihoodBuffer> getCurrentPlace(GoogleApiClient googleApiClient, final PlaceFilter placeFilter) {
        return googleApiClient.zzc(new zzd<zzk>(this, Places.PLACE_DETECTION_API, googleApiClient) {
            final /* synthetic */ zzj b;

            protected void a(zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException {
                com_google_android_gms_location_places_internal_zzk.zza(new zzl((zzd) this, com_google_android_gms_location_places_internal_zzk.getContext()), placeFilter);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzk) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> reportDeviceAtPlace(GoogleApiClient googleApiClient, final PlaceReport placeReport) {
        return googleApiClient.zzd(new zzf<zzk>(this, Places.PLACE_DETECTION_API, googleApiClient) {
            final /* synthetic */ zzj b;

            protected void a(zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException {
                com_google_android_gms_location_places_internal_zzk.zza(new zzl((zzf) this), placeReport);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzk) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
