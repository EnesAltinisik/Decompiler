package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FaceParcel extends AbstractSafeParcelable {
    public static final zza CREATOR = new zza();
    public final float centerX;
    public final float centerY;
    public final float height;
    public final int id;
    public final int versionCode;
    public final float width;
    public final float zzbxX;
    public final float zzbxY;
    public final LandmarkParcel[] zzbxZ;
    public final float zzbya;
    public final float zzbyb;
    public final float zzbyc;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this.versionCode = i;
        this.id = i2;
        this.centerX = f;
        this.centerY = f2;
        this.width = f3;
        this.height = f4;
        this.zzbxX = f5;
        this.zzbxY = f6;
        this.zzbxZ = landmarkParcelArr;
        this.zzbya = f7;
        this.zzbyb = f8;
        this.zzbyc = f9;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
