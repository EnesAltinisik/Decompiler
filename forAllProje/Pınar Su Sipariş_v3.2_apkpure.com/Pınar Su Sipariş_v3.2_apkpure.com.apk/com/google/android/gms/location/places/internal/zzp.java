package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.PlacePhotoResult;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzf;
import com.google.android.gms.location.places.zzf.zza;

public class zzp implements PlacePhotoMetadata {
    private int mIndex;
    private final int zzGB;
    private final int zzGC;
    private final String zzaYh;
    private final CharSequence zzaYi;

    public zzp(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.zzaYh = str;
        this.zzGB = i;
        this.zzGC = i2;
        this.zzaYi = charSequence;
        this.mIndex = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp com_google_android_gms_location_places_internal_zzp = (zzp) obj;
        return com_google_android_gms_location_places_internal_zzp.zzGB == this.zzGB && com_google_android_gms_location_places_internal_zzp.zzGC == this.zzGC && zzz.equal(com_google_android_gms_location_places_internal_zzp.zzaYh, this.zzaYh) && zzz.equal(com_google_android_gms_location_places_internal_zzp.zzaYi, this.zzaYi);
    }

    public /* synthetic */ Object freeze() {
        return zzDi();
    }

    public CharSequence getAttributions() {
        return this.zzaYi;
    }

    public int getMaxHeight() {
        return this.zzGC;
    }

    public int getMaxWidth() {
        return this.zzGB;
    }

    public PendingResult<PlacePhotoResult> getPhoto(GoogleApiClient googleApiClient) {
        return getScaledPhoto(googleApiClient, getMaxWidth(), getMaxHeight());
    }

    public PendingResult<PlacePhotoResult> getScaledPhoto(GoogleApiClient googleApiClient, int i, int i2) {
        final int i3 = i;
        final int i4 = i2;
        return googleApiClient.zzc(new zza<zze>(this, Places.GEO_DATA_API, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(zze com_google_android_gms_location_places_internal_zze) throws RemoteException {
                com_google_android_gms_location_places_internal_zze.zza(new zzf((zza) this), this.c.zzaYh, i3, i4, this.c.mIndex);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzGB), Integer.valueOf(this.zzGC), this.zzaYh, this.zzaYi);
    }

    public boolean isDataValid() {
        return true;
    }

    public PlacePhotoMetadata zzDi() {
        return this;
    }
}
