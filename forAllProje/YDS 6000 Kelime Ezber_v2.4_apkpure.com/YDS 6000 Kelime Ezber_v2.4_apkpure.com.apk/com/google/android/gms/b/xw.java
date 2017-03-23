package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public final class xw extends a {
    public static final Creator<xw> CREATOR = new xx();
    public final int a;
    public final ns b;
    public final String c;

    public xw(int i, ns nsVar, String str) {
        this.a = i;
        this.b = nsVar;
        this.c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        xx.a(this, parcel, i);
    }
}
