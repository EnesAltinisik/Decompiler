package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzu;

public class zzl extends com.google.android.gms.location.places.internal.zzi.zza {
    private static final String TAG = zzl.class.getSimpleName();
    private final Context mContext;
    private final zzd zzaXg;
    private final zza zzaXh;
    private final zze zzaXi;
    private final zzf zzaXj;
    private final zzc zzaXk;

    public static abstract class zzb<R extends Result, A extends com.google.android.gms.common.api.Api.zze> extends com.google.android.gms.internal.zznt.zza<R, A> {
        public zzb(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }
    }

    public static abstract class zzc<A extends com.google.android.gms.common.api.Api.zze> extends zzb<PlaceBuffer, A> {
        public zzc(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlaceBuffer zzbj(Status status) {
            return new PlaceBuffer(DataHolder.zzbQ(status.getStatusCode()), null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbj(status);
        }
    }

    public static abstract class zza<A extends com.google.android.gms.common.api.Api.zze> extends zzb<AutocompletePredictionBuffer, A> {
        public zza(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected AutocompletePredictionBuffer zzbi(Status status) {
            return new AutocompletePredictionBuffer(DataHolder.zzbQ(status.getStatusCode()));
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbi(status);
        }
    }

    public static abstract class zzd<A extends com.google.android.gms.common.api.Api.zze> extends zzb<PlaceLikelihoodBuffer, A> {
        public zzd(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlaceLikelihoodBuffer zzbk(Status status) {
            return new PlaceLikelihoodBuffer(DataHolder.zzbQ(status.getStatusCode()), 100, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbk(status);
        }
    }

    public static abstract class zzf<A extends com.google.android.gms.common.api.Api.zze> extends zzb<Status, A> {
        public zzf(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected Status zzb(Status status) {
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzb(status);
        }
    }

    public static abstract class zze<A extends com.google.android.gms.common.api.Api.zze> extends zzb<com.google.android.gms.location.places.personalized.zze, A> {
    }

    public zzl(zza com_google_android_gms_location_places_zzl_zza) {
        this.zzaXg = null;
        this.zzaXh = com_google_android_gms_location_places_zzl_zza;
        this.zzaXi = null;
        this.zzaXj = null;
        this.zzaXk = null;
        this.mContext = null;
    }

    public zzl(zzc com_google_android_gms_location_places_zzl_zzc, Context context) {
        this.zzaXg = null;
        this.zzaXh = null;
        this.zzaXi = null;
        this.zzaXj = null;
        this.zzaXk = com_google_android_gms_location_places_zzl_zzc;
        this.mContext = context.getApplicationContext();
    }

    public zzl(zzd com_google_android_gms_location_places_zzl_zzd, Context context) {
        this.zzaXg = com_google_android_gms_location_places_zzl_zzd;
        this.zzaXh = null;
        this.zzaXi = null;
        this.zzaXj = null;
        this.zzaXk = null;
        this.mContext = context.getApplicationContext();
    }

    public zzl(zzf com_google_android_gms_location_places_zzl_zzf) {
        this.zzaXg = null;
        this.zzaXh = null;
        this.zzaXi = null;
        this.zzaXj = com_google_android_gms_location_places_zzl_zzf;
        this.zzaXk = null;
        this.mContext = null;
    }

    public void zzam(DataHolder dataHolder) throws RemoteException {
        zzaa.zza(this.zzaXg != null, (Object) "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                String str = TAG;
                String str2 = "onPlaceEstimated received null DataHolder: ";
                String valueOf = String.valueOf(zzu.zzvk());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.zzaXg.zzx(Status.zzaly);
            return;
        }
        Bundle zzsO = dataHolder.zzsO();
        this.zzaXg.zzb(new PlaceLikelihoodBuffer(dataHolder, zzsO == null ? 100 : PlaceLikelihoodBuffer.zzI(zzsO), this.mContext));
    }

    public void zzan(DataHolder dataHolder) throws RemoteException {
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                String str = TAG;
                String str2 = "onAutocompletePrediction received null DataHolder: ";
                String valueOf = String.valueOf(zzu.zzvk());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.zzaXh.zzx(Status.zzaly);
            return;
        }
        this.zzaXh.zzb(new AutocompletePredictionBuffer(dataHolder));
    }

    public void zzao(DataHolder dataHolder) throws RemoteException {
        zze com_google_android_gms_location_places_zzl_zze = null;
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                String str = TAG;
                String str2 = "onPlaceUserDataFetched received null DataHolder: ";
                String valueOf = String.valueOf(zzu.zzvk());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            com_google_android_gms_location_places_zzl_zze.zzx(Status.zzaly);
            return;
        }
        com_google_android_gms_location_places_zzl_zze.zzb(new com.google.android.gms.location.places.personalized.zze(dataHolder));
    }

    public void zzap(DataHolder dataHolder) throws RemoteException {
        this.zzaXk.zzb(new PlaceBuffer(dataHolder, this.mContext));
    }

    public void zzbh(Status status) throws RemoteException {
        this.zzaXj.zzb(status);
    }
}
