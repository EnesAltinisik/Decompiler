package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class bl extends a {
    public static final Creator<bl> CREATOR = new bm();
    public final int a;
    public final String b;
    public final String c;

    bl(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public bl(String str, String str2) {
        this(1, str, str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        bm.a(this, parcel, i);
    }
}
