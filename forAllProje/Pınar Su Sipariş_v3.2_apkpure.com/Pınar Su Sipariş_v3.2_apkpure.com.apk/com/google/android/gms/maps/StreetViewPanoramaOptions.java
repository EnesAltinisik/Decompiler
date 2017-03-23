package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final zzb CREATOR = new zzb();
    private final int mVersionCode;
    private StreetViewPanoramaCamera zzaZT;
    private String zzaZU;
    private LatLng zzaZV;
    private Integer zzaZW;
    private Boolean zzaZX;
    private Boolean zzaZY;
    private Boolean zzaZZ;
    private Boolean zzaZg;
    private Boolean zzaZm;

    public StreetViewPanoramaOptions() {
        this.zzaZX = Boolean.valueOf(true);
        this.zzaZm = Boolean.valueOf(true);
        this.zzaZY = Boolean.valueOf(true);
        this.zzaZZ = Boolean.valueOf(true);
        this.mVersionCode = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.zzaZX = Boolean.valueOf(true);
        this.zzaZm = Boolean.valueOf(true);
        this.zzaZY = Boolean.valueOf(true);
        this.zzaZZ = Boolean.valueOf(true);
        this.mVersionCode = i;
        this.zzaZT = streetViewPanoramaCamera;
        this.zzaZV = latLng;
        this.zzaZW = num;
        this.zzaZU = str;
        this.zzaZX = zza.zza(b);
        this.zzaZm = zza.zza(b2);
        this.zzaZY = zza.zza(b3);
        this.zzaZZ = zza.zza(b4);
        this.zzaZg = zza.zza(b5);
    }

    public int describeContents() {
        return 0;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.zzaZY;
    }

    public String getPanoramaId() {
        return this.zzaZU;
    }

    public LatLng getPosition() {
        return this.zzaZV;
    }

    public Integer getRadius() {
        return this.zzaZW;
    }

    public Boolean getStreetNamesEnabled() {
        return this.zzaZZ;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zzaZT;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzaZg;
    }

    public Boolean getUserNavigationEnabled() {
        return this.zzaZX;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzaZm;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzaZY = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zzaZT = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String str) {
        this.zzaZU = str;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.zzaZV = latLng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.zzaZV = latLng;
        this.zzaZW = num;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzaZZ = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzaZg = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zzaZX = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzaZm = Boolean.valueOf(z);
        return this;
    }

    byte zzDK() {
        return zza.zze(this.zzaZX);
    }

    byte zzDL() {
        return zza.zze(this.zzaZY);
    }

    byte zzDM() {
        return zza.zze(this.zzaZZ);
    }

    byte zzDu() {
        return zza.zze(this.zzaZg);
    }

    byte zzDy() {
        return zza.zze(this.zzaZm);
    }
}
