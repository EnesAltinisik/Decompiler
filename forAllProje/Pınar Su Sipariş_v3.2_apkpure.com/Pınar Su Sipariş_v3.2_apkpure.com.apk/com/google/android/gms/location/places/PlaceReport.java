package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zzz.zza;
import com.google.android.gms.fitness.FitnessActivities;

public class PlaceReport extends AbstractSafeParcelable {
    public static final Creator<PlaceReport> CREATOR = new zzj();
    private final String mTag;
    final int mVersionCode;
    private final String zzVg;
    private final String zzaWV;

    PlaceReport(int i, String str, String str2, String str3) {
        this.mVersionCode = i;
        this.zzaWV = str;
        this.mTag = str2;
        this.zzVg = str3;
    }

    public static PlaceReport create(String str, String str2) {
        return zzk(str, str2, FitnessActivities.UNKNOWN);
    }

    private static boolean zzeM(String str) {
        boolean z = true;
        switch (str.hashCode()) {
            case -1436706272:
                if (str.equals("inferredGeofencing")) {
                    z = true;
                    break;
                }
                break;
            case -1194968642:
                if (str.equals("userReported")) {
                    z = true;
                    break;
                }
                break;
            case -284840886:
                if (str.equals(FitnessActivities.UNKNOWN)) {
                    z = false;
                    break;
                }
                break;
            case -262743844:
                if (str.equals("inferredReverseGeocoding")) {
                    z = true;
                    break;
                }
                break;
            case 1164924125:
                if (str.equals("inferredSnappedToRoad")) {
                    z = true;
                    break;
                }
                break;
            case 1287171955:
                if (str.equals("inferredRadioSignals")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    public static PlaceReport zzk(String str, String str2, String str3) {
        zzaa.zzz(str);
        zzaa.zzdl(str2);
        zzaa.zzdl(str3);
        zzaa.zzb(zzeM(str3), (Object) "Invalid source");
        return new PlaceReport(1, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return zzz.equal(this.zzaWV, placeReport.zzaWV) && zzz.equal(this.mTag, placeReport.mTag) && zzz.equal(this.zzVg, placeReport.zzVg);
    }

    public String getPlaceId() {
        return this.zzaWV;
    }

    public String getSource() {
        return this.zzVg;
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaWV, this.mTag, this.zzVg);
    }

    public String toString() {
        zza zzy = zzz.zzy(this);
        zzy.zzg("placeId", this.zzaWV);
        zzy.zzg("tag", this.mTag);
        if (!FitnessActivities.UNKNOWN.equals(this.zzVg)) {
            zzy.zzg("source", this.zzVg);
        }
        return zzy.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
