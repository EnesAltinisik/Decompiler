package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.a;

public class eh extends a {
    public static final Creator<eh> CREATOR = new ej();
    final int a;
    final d b;

    eh(int i, d dVar) {
        this.a = i;
        this.b = dVar;
    }

    public eh(d dVar) {
        this(1, dVar);
    }

    public d a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ej.a(this, parcel, i);
    }
}
