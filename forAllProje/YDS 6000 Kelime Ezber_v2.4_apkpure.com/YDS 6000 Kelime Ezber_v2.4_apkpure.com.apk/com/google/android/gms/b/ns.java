package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

@vz
public final class ns extends a {
    public static final Creator<ns> CREATOR = new nv();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final pd j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    public final boolean r;

    public ns(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, pd pdVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.a = i;
        this.b = j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.c = bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = pdVar;
        this.k = location;
        this.l = str2;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.m = bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    public static void a(ns nsVar) {
        nsVar.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", nsVar.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        return this.a == nsVar.a && this.b == nsVar.b && b.a(this.c, nsVar.c) && this.d == nsVar.d && b.a(this.e, nsVar.e) && this.f == nsVar.f && this.g == nsVar.g && this.h == nsVar.h && b.a(this.i, nsVar.i) && b.a(this.j, nsVar.j) && b.a(this.k, nsVar.k) && b.a(this.l, nsVar.l) && b.a(this.m, nsVar.m) && b.a(this.n, nsVar.n) && b.a(this.o, nsVar.o) && b.a(this.p, nsVar.p) && b.a(this.q, nsVar.q) && this.r == nsVar.r;
    }

    public int hashCode() {
        return b.a(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r));
    }

    public void writeToParcel(Parcel parcel, int i) {
        nv.a(this, parcel, i);
    }
}
