package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public class ea extends a {
    public static final Creator<ea> CREATOR = new eb();
    final int a;
    final boolean b;
    final List<Scope> c;

    ea(int i, boolean z, List<Scope> list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        eb.a(this, parcel, i);
    }
}
