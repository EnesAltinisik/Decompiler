package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements PlaceLikelihood {
    public static final Creator<PlaceLikelihoodEntity> CREATOR = new zzm();
    final int mVersionCode;
    final PlaceEntity zzaYc;
    final float zzaYd;

    PlaceLikelihoodEntity(int i, PlaceEntity placeEntity, float f) {
        this.mVersionCode = i;
        this.zzaYc = placeEntity;
        this.zzaYd = f;
    }

    public static PlaceLikelihoodEntity zza(PlaceEntity placeEntity, float f) {
        return new PlaceLikelihoodEntity(0, (PlaceEntity) zzaa.zzz(placeEntity), f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihoodEntity)) {
            return false;
        }
        PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
        return this.zzaYc.equals(placeLikelihoodEntity.zzaYc) && this.zzaYd == placeLikelihoodEntity.zzaYd;
    }

    public /* synthetic */ Object freeze() {
        return zzDh();
    }

    public float getLikelihood() {
        return this.zzaYd;
    }

    public Place getPlace() {
        return this.zzaYc;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaYc, Float.valueOf(this.zzaYd));
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzz.zzy(this).zzg("place", this.zzaYc).zzg("likelihood", Float.valueOf(this.zzaYd)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public PlaceLikelihood zzDh() {
        return this;
    }
}
