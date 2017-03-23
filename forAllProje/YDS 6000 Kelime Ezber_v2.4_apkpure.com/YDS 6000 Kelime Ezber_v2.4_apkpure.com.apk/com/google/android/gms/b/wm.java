package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public class wm extends a {
    public static final Creator<wm> CREATOR = new wn();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    wm(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public wm(boolean z, boolean z2, boolean z3) {
        this(2, z, z2, z3);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", this.b);
        bundle.putBoolean("default_iap_supported", this.c);
        bundle.putBoolean("app_streaming_supported", this.d);
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        wn.a(this, parcel, i);
    }
}
