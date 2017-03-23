package com.google.android.gms.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.safeparcel.a;

public class dx extends a implements g {
    public static final Creator<dx> CREATOR = new dy();
    final int a;
    private int b;
    private Intent c;

    public dx() {
        this(0, null);
    }

    dx(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public dx(int i, Intent intent) {
        this(2, i, intent);
    }

    public Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    public int b() {
        return this.b;
    }

    public Intent c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        dy.a(this, parcel, i);
    }
}
