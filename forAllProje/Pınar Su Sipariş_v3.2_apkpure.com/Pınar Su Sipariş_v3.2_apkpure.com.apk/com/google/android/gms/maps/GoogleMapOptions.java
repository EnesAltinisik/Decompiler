package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final zza CREATOR = new zza();
    private final int mVersionCode;
    private Boolean zzaZf;
    private Boolean zzaZg;
    private int zzaZh;
    private CameraPosition zzaZi;
    private Boolean zzaZj;
    private Boolean zzaZk;
    private Boolean zzaZl;
    private Boolean zzaZm;
    private Boolean zzaZn;
    private Boolean zzaZo;
    private Boolean zzaZp;
    private Boolean zzaZq;
    private Boolean zzaZr;

    public GoogleMapOptions() {
        this.zzaZh = -1;
        this.mVersionCode = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.zzaZh = -1;
        this.mVersionCode = i;
        this.zzaZf = zza.zza(b);
        this.zzaZg = zza.zza(b2);
        this.zzaZh = i2;
        this.zzaZi = cameraPosition;
        this.zzaZj = zza.zza(b3);
        this.zzaZk = zza.zza(b4);
        this.zzaZl = zza.zza(b5);
        this.zzaZm = zza.zza(b6);
        this.zzaZn = zza.zza(b7);
        this.zzaZo = zza.zza(b8);
        this.zzaZp = zza.zza(b9);
        this.zzaZq = zza.zza(b10);
        this.zzaZr = zza.zza(b11);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzaZr = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzaZi = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzaZk = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public Boolean getAmbientEnabled() {
        return this.zzaZr;
    }

    public CameraPosition getCamera() {
        return this.zzaZi;
    }

    public Boolean getCompassEnabled() {
        return this.zzaZk;
    }

    public Boolean getLiteMode() {
        return this.zzaZp;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzaZq;
    }

    public int getMapType() {
        return this.zzaZh;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzaZo;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzaZl;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzaZn;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzaZg;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public Boolean getZOrderOnTop() {
        return this.zzaZf;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzaZj;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzaZm;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzaZp = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzaZq = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzaZh = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzaZo = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzaZl = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzaZn = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzaZg = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzaZf = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzaZj = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzaZm = Boolean.valueOf(z);
        return this;
    }

    byte zzDA() {
        return zza.zze(this.zzaZo);
    }

    byte zzDB() {
        return zza.zze(this.zzaZp);
    }

    byte zzDC() {
        return zza.zze(this.zzaZq);
    }

    byte zzDD() {
        return zza.zze(this.zzaZr);
    }

    byte zzDt() {
        return zza.zze(this.zzaZf);
    }

    byte zzDu() {
        return zza.zze(this.zzaZg);
    }

    byte zzDv() {
        return zza.zze(this.zzaZj);
    }

    byte zzDw() {
        return zza.zze(this.zzaZk);
    }

    byte zzDx() {
        return zza.zze(this.zzaZl);
    }

    byte zzDy() {
        return zza.zze(this.zzaZm);
    }

    byte zzDz() {
        return zza.zze(this.zzaZn);
    }
}
