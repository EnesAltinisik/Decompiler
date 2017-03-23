package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.k;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public class ph extends a {
    public static final Creator<ph> CREATOR = new pi();
    public final int a;
    public final boolean b;

    public ph(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public ph(k kVar) {
        this(1, kVar.a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        pi.a(this, parcel, i);
    }
}
