package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class WordBoxParcel extends AbstractSafeParcelable {
    public static final zzi CREATOR = new zzi();
    public final int versionCode;
    public final String zzbyA;
    public final float zzbyB;
    public final SymbolBoxParcel[] zzbyI;
    public final boolean zzbyJ;
    public final String zzbyq;
    public final BoundingBoxParcel zzbyx;
    public final BoundingBoxParcel zzbyy;

    public WordBoxParcel(int i, SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.versionCode = i;
        this.zzbyI = symbolBoxParcelArr;
        this.zzbyx = boundingBoxParcel;
        this.zzbyy = boundingBoxParcel2;
        this.zzbyA = str;
        this.zzbyB = f;
        this.zzbyq = str2;
        this.zzbyJ = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }
}
