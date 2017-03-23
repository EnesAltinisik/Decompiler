package com.google.android.gms.location.places;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zzf extends com.google.android.gms.location.places.internal.zzh.zza {
    private final zzb zzaWK;
    private final zza zzaWL;

    public static abstract class zzb<A extends zze> extends com.google.android.gms.location.places.zzl.zzb<PlacePhotoMetadataResult, A> {
        public zzb(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlacePhotoMetadataResult zzbg(Status status) {
            return new PlacePhotoMetadataResult(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbg(status);
        }
    }

    public static abstract class zza<A extends zze> extends com.google.android.gms.location.places.zzl.zzb<PlacePhotoResult, A> {
        public zza(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlacePhotoResult zzbf(Status status) {
            return new PlacePhotoResult(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbf(status);
        }
    }

    public zzf(zza com_google_android_gms_location_places_zzf_zza) {
        this.zzaWK = null;
        this.zzaWL = com_google_android_gms_location_places_zzf_zza;
    }

    public zzf(zzb com_google_android_gms_location_places_zzf_zzb) {
        this.zzaWK = com_google_android_gms_location_places_zzf_zzb;
        this.zzaWL = null;
    }

    public void zza(PlacePhotoMetadataResult placePhotoMetadataResult) throws RemoteException {
        this.zzaWK.zzb(placePhotoMetadataResult);
    }

    public void zza(PlacePhotoResult placePhotoResult) throws RemoteException {
        this.zzaWL.zzb(placePhotoResult);
    }
}
