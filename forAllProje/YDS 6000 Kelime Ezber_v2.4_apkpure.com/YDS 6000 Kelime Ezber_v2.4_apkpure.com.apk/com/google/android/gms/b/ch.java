package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ch extends a {
    public static final Creator<ch> CREATOR = new ci();
    public final int a;
    public final String b;
    public final ce c;
    public final String d;
    public final long e;

    ch(int i, String str, ce ceVar, String str2, long j) {
        this.a = i;
        this.b = str;
        this.c = ceVar;
        this.d = str2;
        this.e = j;
    }

    public ch(String str, ce ceVar, String str2, long j) {
        this.a = 1;
        this.b = str;
        this.c = ceVar;
        this.d = str2;
        this.e = j;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(((String.valueOf(str).length() + 21) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ci.a(this, parcel, i);
    }
}
