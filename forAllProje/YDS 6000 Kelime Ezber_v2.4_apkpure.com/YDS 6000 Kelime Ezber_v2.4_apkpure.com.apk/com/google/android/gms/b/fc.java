package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class fc extends a {
    public static final Creator<fc> CREATOR = new fd();
    public final int a;
    private String b;
    private String c;

    fc(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public fc(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        fd.a(this, parcel, i);
    }
}
