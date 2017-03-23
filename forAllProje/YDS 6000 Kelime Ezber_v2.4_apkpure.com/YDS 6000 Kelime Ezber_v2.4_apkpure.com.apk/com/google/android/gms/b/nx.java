package com.google.android.gms.b;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.l;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public class nx extends a {
    public static final Creator<nx> CREATOR = new ny();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final nx[] h;
    public final boolean i;
    public final boolean j;
    public boolean k;

    public nx() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    nx(int i, String str, int i2, int i3, boolean z, int i4, int i5, nx[] nxVarArr, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
        this.h = nxVarArr;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public nx(Context context, d dVar) {
        this(context, new d[]{dVar});
    }

    public nx(Context context, d[] dVarArr) {
        int i;
        int i2;
        d dVar = dVarArr[0];
        this.a = 5;
        this.e = false;
        this.j = dVar.c();
        if (this.j) {
            this.f = d.a.b();
            this.c = d.a.a();
        } else {
            this.f = dVar.b();
            this.c = dVar.a();
        }
        boolean z = this.f == -1;
        boolean z2 = this.c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (oc.a().c(context) && oc.a().d(context)) {
                this.g = a(displayMetrics) - oc.a().e(context);
            } else {
                this.g = a(displayMetrics);
            }
            double d = (double) (((float) this.g) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.f;
            this.g = oc.a().a(displayMetrics, this.f);
            i2 = i;
        }
        i = z2 ? c(displayMetrics) : this.c;
        this.d = oc.a().a(displayMetrics, i);
        if (z || z2) {
            this.b = i2 + "x" + i + "_as";
        } else if (this.j) {
            this.b = "320x50_mb";
        } else {
            this.b = dVar.toString();
        }
        if (dVarArr.length > 1) {
            this.h = new nx[dVarArr.length];
            for (int i3 = 0; i3 < dVarArr.length; i3++) {
                this.h[i3] = new nx(context, dVarArr[i3]);
            }
        } else {
            this.h = null;
        }
        this.i = false;
        this.k = false;
    }

    public nx(nx nxVar, nx[] nxVarArr) {
        this(5, nxVar.b, nxVar.c, nxVar.d, nxVar.e, nxVar.f, nxVar.g, nxVarArr, nxVar.i, nxVar.j, nxVar.k);
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static nx a() {
        return new nx(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static nx a(Context context) {
        return new nx(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public d b() {
        return l.a(this.f, this.c, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ny.a(this, parcel, i);
    }
}
