package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zzd.zza;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final zzc CREATOR = new zzc();
    public static final float NO_DIMENSION = -1.0f;
    private final int mVersionCode;
    private LatLngBounds zzaYA;
    private BitmapDescriptor zzbaA;
    private LatLng zzbaB;
    private float zzbaC;
    private float zzbaD;
    private float zzbaE;
    private float zzbaF;
    private float zzbaG;
    private boolean zzbaH;
    private float zzbaq;
    private float zzbax;
    private boolean zzbay;

    public GroundOverlayOptions() {
        this.zzbay = true;
        this.zzbaE = 0.0f;
        this.zzbaF = 0.5f;
        this.zzbaG = 0.5f;
        this.zzbaH = false;
        this.mVersionCode = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzbay = true;
        this.zzbaE = 0.0f;
        this.zzbaF = 0.5f;
        this.zzbaG = 0.5f;
        this.zzbaH = false;
        this.mVersionCode = i;
        this.zzbaA = new BitmapDescriptor(zza.zzbz(iBinder));
        this.zzbaB = latLng;
        this.zzbaC = f;
        this.zzbaD = f2;
        this.zzaYA = latLngBounds;
        this.zzbaq = f3;
        this.zzbax = f4;
        this.zzbay = z;
        this.zzbaE = f5;
        this.zzbaF = f6;
        this.zzbaG = f7;
        this.zzbaH = z2;
    }

    private GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzbaB = latLng;
        this.zzbaC = f;
        this.zzbaD = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.zzbaF = f;
        this.zzbaG = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.zzbaq = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.zzbaH = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.zzbaF;
    }

    public float getAnchorV() {
        return this.zzbaG;
    }

    public float getBearing() {
        return this.zzbaq;
    }

    public LatLngBounds getBounds() {
        return this.zzaYA;
    }

    public float getHeight() {
        return this.zzbaD;
    }

    public BitmapDescriptor getImage() {
        return this.zzbaA;
    }

    public LatLng getLocation() {
        return this.zzbaB;
    }

    public float getTransparency() {
        return this.zzbaE;
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

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.zzbaA = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzbaH;
    }

    public boolean isVisible() {
        return this.zzbay;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = true;
        zzaa.zza(this.zzaYA == null, (Object) "Position has already been set using positionFromBounds");
        zzaa.zzb(latLng != null, (Object) "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        zzaa.zzb(z, (Object) "Width must be non-negative");
        return zza(latLng, f, -1.0f);
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = true;
        zzaa.zza(this.zzaYA == null, (Object) "Position has already been set using positionFromBounds");
        zzaa.zzb(latLng != null, (Object) "Location must be specified");
        zzaa.zzb(f >= 0.0f, (Object) "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        zzaa.zzb(z, (Object) "Height must be non-negative");
        return zza(latLng, f, f2);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        boolean z = this.zzbaB == null;
        String valueOf = String.valueOf(this.zzbaB);
        zzaa.zza(z, new StringBuilder(String.valueOf(valueOf).length() + 46).append("Position has already been set using position: ").append(valueOf).toString());
        this.zzaYA = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        boolean z = f >= 0.0f && f <= TextTrackStyle.DEFAULT_FONT_SCALE;
        zzaa.zzb(z, (Object) "Transparency must be in the range [0..1]");
        this.zzbaE = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.zzbay = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.zzbax = f;
        return this;
    }

    IBinder zzDT() {
        return this.zzbaA.zzDq().asBinder();
    }
}
