package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@Deprecated
public class j extends a {
    public static final Creator<j> CREATOR = new k();
    final int a;

    j(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
