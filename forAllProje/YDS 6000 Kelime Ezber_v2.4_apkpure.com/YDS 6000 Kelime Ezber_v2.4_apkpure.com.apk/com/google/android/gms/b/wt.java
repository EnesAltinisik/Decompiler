package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public class wt extends a {
    public static final Creator<wt> CREATOR = new wu();
    final int a;
    String b;

    wt(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public wt(String str) {
        this.a = 1;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        wu.a(this, parcel, i);
    }
}
