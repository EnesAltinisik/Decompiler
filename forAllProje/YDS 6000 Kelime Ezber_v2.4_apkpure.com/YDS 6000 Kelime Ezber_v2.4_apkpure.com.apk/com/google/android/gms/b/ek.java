package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.safeparcel.a;

public class ek extends a {
    public static final Creator<ek> CREATOR = new el();
    final int a;
    private final com.google.android.gms.common.a b;
    private final f c;

    public ek(int i) {
        this(new com.google.android.gms.common.a(i, null), null);
    }

    ek(int i, com.google.android.gms.common.a aVar, f fVar) {
        this.a = i;
        this.b = aVar;
        this.c = fVar;
    }

    public ek(com.google.android.gms.common.a aVar, f fVar) {
        this(1, aVar, fVar);
    }

    public com.google.android.gms.common.a a() {
        return this.b;
    }

    public f b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        el.a(this, parcel, i);
    }
}
