package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;

public final class Status extends a implements g, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new q();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f = new Status(17);
    public static final Status g = new Status(18);
    final int h;
    private final int i;
    private final String j;
    private final PendingIntent k;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.h = i;
        this.i = i2;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status a() {
        return this;
    }

    PendingIntent b() {
        return this.k;
    }

    public String c() {
        return this.j;
    }

    public boolean d() {
        return this.i <= 0;
    }

    public int e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && this.i == status.i && b.a(this.j, status.j) && b.a(this.k, status.k);
    }

    public String f() {
        return this.j != null ? this.j : b.a(this.i);
    }

    public int hashCode() {
        return b.a(Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k);
    }

    public String toString() {
        return b.a((Object) this).a("statusCode", f()).a("resolution", this.k).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
