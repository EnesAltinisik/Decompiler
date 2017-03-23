package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class LineBoxParcel extends AbstractSafeParcelable {
    public static final zzd CREATOR = new zzd();
    public final int versionCode;
    public final String zzbyA;
    public final float zzbyB;
    public final int zzbyC;
    public final boolean zzbyD;
    public final int zzbyE;
    public final int zzbyF;
    public final String zzbyq;
    public final WordBoxParcel[] zzbyw;
    public final BoundingBoxParcel zzbyx;
    public final BoundingBoxParcel zzbyy;
    public final BoundingBoxParcel zzbyz;

    public LineBoxParcel(int i, WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i2, boolean z, int i3, int i4) {
        this.versionCode = i;
        this.zzbyw = wordBoxParcelArr;
        this.zzbyx = boundingBoxParcel;
        this.zzbyy = boundingBoxParcel2;
        this.zzbyz = boundingBoxParcel3;
        this.zzbyA = str;
        this.zzbyB = f;
        this.zzbyq = str2;
        this.zzbyC = i2;
        this.zzbyD = z;
        this.zzbyE = i3;
        this.zzbyF = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
