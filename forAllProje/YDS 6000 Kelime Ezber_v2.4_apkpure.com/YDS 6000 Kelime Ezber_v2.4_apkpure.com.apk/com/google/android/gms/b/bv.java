package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public class bv extends a {
    public static final Creator<bv> CREATOR = new bw();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final String l;

    bv(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        if (i < 5) {
            j3 = -2147483648L;
        }
        this.k = j3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        if (i >= 3) {
            this.i = z;
        } else {
            this.i = true;
        }
        this.j = z2;
        this.l = str6;
    }

    bv(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6) {
        c.a(str);
        this.a = 6;
        this.b = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.c = str2;
        this.d = str3;
        this.k = j;
        this.e = str4;
        this.f = j2;
        this.g = j3;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bw.a(this, parcel, i);
    }
}
