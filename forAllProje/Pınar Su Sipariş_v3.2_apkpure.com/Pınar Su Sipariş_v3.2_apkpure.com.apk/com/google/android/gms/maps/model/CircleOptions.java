package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CircleOptions implements SafeParcelable {
    public static final zzb CREATOR = new zzb();
    private final int mVersionCode;
    private LatLng zzbas;
    private double zzbat;
    private float zzbau;
    private int zzbav;
    private int zzbaw;
    private float zzbax;
    private boolean zzbay;

    public CircleOptions() {
        this.zzbas = null;
        this.zzbat = 0.0d;
        this.zzbau = 10.0f;
        this.zzbav = -16777216;
        this.zzbaw = 0;
        this.zzbax = 0.0f;
        this.zzbay = true;
        this.mVersionCode = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.zzbas = null;
        this.zzbat = 0.0d;
        this.zzbau = 10.0f;
        this.zzbav = -16777216;
        this.zzbaw = 0;
        this.zzbax = 0.0f;
        this.zzbay = true;
        this.mVersionCode = i;
        this.zzbas = latLng;
        this.zzbat = d;
        this.zzbau = f;
        this.zzbav = i2;
        this.zzbaw = i3;
        this.zzbax = f2;
        this.zzbay = z;
    }

    public CircleOptions center(LatLng latLng) {
        this.zzbas = latLng;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i) {
        this.zzbaw = i;
        return this;
    }

    public LatLng getCenter() {
        return this.zzbas;
    }

    public int getFillColor() {
        return this.zzbaw;
    }

    public double getRadius() {
        return this.zzbat;
    }

    public int getStrokeColor() {
        return this.zzbav;
    }

    public float getStrokeWidth() {
        return this.zzbau;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public float getZIndex() {
        return this.zzbax;
    }

    public boolean isVisible() {
        return this.zzbay;
    }

    public CircleOptions radius(double d) {
        this.zzbat = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.zzbav = i;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.zzbau = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.zzbay = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public CircleOptions zIndex(float f) {
        this.zzbax = f;
        return this;
    }
}
