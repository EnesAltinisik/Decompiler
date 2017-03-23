package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.vz;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public final class e extends a {
    public static final Creator<e> CREATOR = new d();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Intent i;

    public e(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = intent;
    }

    public e(Intent intent) {
        this(2, null, null, null, null, null, null, null, intent);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(2, str, str2, str3, str4, str5, str6, str7, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
