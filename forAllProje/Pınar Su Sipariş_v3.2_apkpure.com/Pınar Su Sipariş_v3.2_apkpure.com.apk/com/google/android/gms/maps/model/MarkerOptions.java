package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd.zza;

public final class MarkerOptions implements SafeParcelable {
    public static final zzf CREATOR = new zzf();
    private float mAlpha;
    private final int mVersionCode;
    private LatLng zzaZV;
    private String zzavG;
    private float zzbaF;
    private float zzbaG;
    private String zzbaP;
    private BitmapDescriptor zzbaQ;
    private boolean zzbaR;
    private boolean zzbaS;
    private float zzbaT;
    private float zzbaU;
    private float zzbaV;
    private boolean zzbay;

    public MarkerOptions() {
        this.zzbaF = 0.5f;
        this.zzbaG = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.zzbay = true;
        this.zzbaS = false;
        this.zzbaT = 0.0f;
        this.zzbaU = 0.5f;
        this.zzbaV = 0.0f;
        this.mAlpha = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.mVersionCode = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        this.zzbaF = 0.5f;
        this.zzbaG = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.zzbay = true;
        this.zzbaS = false;
        this.zzbaT = 0.0f;
        this.zzbaU = 0.5f;
        this.zzbaV = 0.0f;
        this.mAlpha = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.mVersionCode = i;
        this.zzaZV = latLng;
        this.zzavG = str;
        this.zzbaP = str2;
        this.zzbaQ = iBinder == null ? null : new BitmapDescriptor(zza.zzbz(iBinder));
        this.zzbaF = f;
        this.zzbaG = f2;
        this.zzbaR = z;
        this.zzbay = z2;
        this.zzbaS = z3;
        this.zzbaT = f3;
        this.zzbaU = f4;
        this.zzbaV = f5;
        this.mAlpha = f6;
    }

    public MarkerOptions alpha(float f) {
        this.mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.zzbaF = f;
        this.zzbaG = f2;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean z) {
        this.zzbaR = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.zzbaS = z;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getAnchorU() {
        return this.zzbaF;
    }

    public float getAnchorV() {
        return this.zzbaG;
    }

    public BitmapDescriptor getIcon() {
        return this.zzbaQ;
    }

    public float getInfoWindowAnchorU() {
        return this.zzbaU;
    }

    public float getInfoWindowAnchorV() {
        return this.zzbaV;
    }

    public LatLng getPosition() {
        return this.zzaZV;
    }

    public float getRotation() {
        return this.zzbaT;
    }

    public String getSnippet() {
        return this.zzbaP;
    }

    public String getTitle() {
        return this.zzavG;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.zzbaQ = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzbaU = f;
        this.zzbaV = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.zzbaR;
    }

    public boolean isFlat() {
        return this.zzbaS;
    }

    public boolean isVisible() {
        return this.zzbay;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.zzaZV = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.zzbaT = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzbaP = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzavG = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.zzbay = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    IBinder zzDU() {
        return this.zzbaQ == null ? null : this.zzbaQ.zzDq().asBinder();
    }
}
