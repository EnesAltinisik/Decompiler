package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final zzb CREATOR = new zzb();
    public int mode;
    public final int versionCode;
    public int zzbyd;
    public int zzbye;
    public boolean zzbyf;
    public boolean zzbyg;
    public float zzbyh;

    public FaceSettingsParcel() {
        this.versionCode = 2;
    }

    public FaceSettingsParcel(int i, int i2, int i3, int i4, boolean z, boolean z2, float f) {
        this.versionCode = i;
        this.mode = i2;
        this.zzbyd = i3;
        this.zzbye = i4;
        this.zzbyf = z;
        this.zzbyg = z2;
        this.zzbyh = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
