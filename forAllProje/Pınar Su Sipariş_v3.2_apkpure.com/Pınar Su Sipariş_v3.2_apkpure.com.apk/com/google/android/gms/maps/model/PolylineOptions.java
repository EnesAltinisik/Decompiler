package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final zzi CREATOR = new zzi();
    private int mColor;
    private final int mVersionCode;
    private float zzbaC;
    private boolean zzbaH;
    private final List<LatLng> zzbaZ;
    private float zzbax;
    private boolean zzbay;
    private boolean zzbbb;

    public PolylineOptions() {
        this.zzbaC = 10.0f;
        this.mColor = -16777216;
        this.zzbax = 0.0f;
        this.zzbay = true;
        this.zzbbb = false;
        this.zzbaH = false;
        this.mVersionCode = 1;
        this.zzbaZ = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2, boolean z3) {
        this.zzbaC = 10.0f;
        this.mColor = -16777216;
        this.zzbax = 0.0f;
        this.zzbay = true;
        this.zzbbb = false;
        this.zzbaH = false;
        this.mVersionCode = i;
        this.zzbaZ = list;
        this.zzbaC = f;
        this.mColor = i2;
        this.zzbax = f2;
        this.zzbay = z;
        this.zzbbb = z2;
        this.zzbaH = z3;
    }

    public PolylineOptions add(LatLng latLng) {
        this.zzbaZ.add(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        this.zzbaZ.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.zzbaZ.add(add);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.zzbaH = z;
        return this;
    }

    public PolylineOptions color(int i) {
        this.mColor = i;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean z) {
        this.zzbbb = z;
        return this;
    }

    public int getColor() {
        return this.mColor;
    }

    public List<LatLng> getPoints() {
        return this.zzbaZ;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public float getWidth() {
        return this.zzbaC;
    }

    public float getZIndex() {
        return this.zzbax;
    }

    public boolean isClickable() {
        return this.zzbaH;
    }

    public boolean isGeodesic() {
        return this.zzbbb;
    }

    public boolean isVisible() {
        return this.zzbay;
    }

    public PolylineOptions visible(boolean z) {
        this.zzbay = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.zzbaC = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public PolylineOptions zIndex(float f) {
        this.zzbax = f;
        return this;
    }
}
