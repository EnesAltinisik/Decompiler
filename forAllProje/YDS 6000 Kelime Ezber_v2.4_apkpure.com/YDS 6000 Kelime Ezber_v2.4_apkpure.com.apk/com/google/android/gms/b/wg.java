package com.google.android.gms.b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class wg implements Creator<wf> {
    static void a(wf wfVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wfVar.a);
        c.a(parcel, 2, wfVar.b, false);
        c.a(parcel, 3, wfVar.c, i, false);
        c.a(parcel, 4, wfVar.d, i, false);
        c.a(parcel, 5, wfVar.e, false);
        c.a(parcel, 6, wfVar.f, i, false);
        c.a(parcel, 7, wfVar.g, i, false);
        c.a(parcel, 8, wfVar.h, false);
        c.a(parcel, 9, wfVar.i, false);
        c.a(parcel, 10, wfVar.j, false);
        c.a(parcel, 11, wfVar.k, i, false);
        c.a(parcel, 12, wfVar.l, false);
        c.a(parcel, 13, wfVar.m);
        c.a(parcel, 14, wfVar.n, false);
        c.a(parcel, 15, wfVar.o, false);
        c.a(parcel, 16, wfVar.p);
        c.a(parcel, 17, wfVar.q, i, false);
        c.a(parcel, 18, wfVar.r);
        c.a(parcel, 19, wfVar.s);
        c.a(parcel, 20, wfVar.t);
        c.a(parcel, 21, wfVar.u, false);
        c.a(parcel, 25, wfVar.v);
        c.a(parcel, 26, wfVar.w, false);
        c.a(parcel, 27, wfVar.x, false);
        c.a(parcel, 28, wfVar.y, false);
        c.a(parcel, 29, wfVar.z, i, false);
        c.a(parcel, 30, wfVar.A, false);
        c.a(parcel, 31, wfVar.B);
        c.a(parcel, 32, wfVar.C, i, false);
        c.a(parcel, 33, wfVar.D, false);
        c.a(parcel, 34, wfVar.E);
        c.a(parcel, 35, wfVar.F);
        c.a(parcel, 36, wfVar.G);
        c.a(parcel, 37, wfVar.H);
        c.a(parcel, 38, wfVar.I);
        c.a(parcel, 39, wfVar.J, false);
        c.a(parcel, 40, wfVar.K);
        c.a(parcel, 41, wfVar.L, false);
        c.a(parcel, 42, wfVar.M);
        c.a(parcel, 43, wfVar.N);
        c.a(parcel, 44, wfVar.O, false);
        c.a(parcel, 45, wfVar.P, false);
        c.a(parcel, a);
    }

    public wf a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        Bundle bundle = null;
        ns nsVar = null;
        nx nxVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        aab com_google_android_gms_b_aab = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        qr qrVar = null;
        List list3 = null;
        long j2 = 0;
        wm wmVar = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    bundle = b.m(parcel, a);
                    break;
                case 3:
                    nsVar = (ns) b.a(parcel, a, ns.CREATOR);
                    break;
                case 4:
                    nxVar = (nx) b.a(parcel, a, nx.CREATOR);
                    break;
                case 5:
                    str = b.k(parcel, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = b.k(parcel, a);
                    break;
                case 9:
                    str3 = b.k(parcel, a);
                    break;
                case 10:
                    str4 = b.k(parcel, a);
                    break;
                case 11:
                    com_google_android_gms_b_aab = (aab) b.a(parcel, a, aab.CREATOR);
                    break;
                case 12:
                    bundle2 = b.m(parcel, a);
                    break;
                case 13:
                    i2 = b.d(parcel, a);
                    break;
                case 14:
                    list = b.r(parcel, a);
                    break;
                case 15:
                    bundle3 = b.m(parcel, a);
                    break;
                case 16:
                    z = b.c(parcel, a);
                    break;
                case 17:
                    messenger = (Messenger) b.a(parcel, a, Messenger.CREATOR);
                    break;
                case 18:
                    i3 = b.d(parcel, a);
                    break;
                case 19:
                    i4 = b.d(parcel, a);
                    break;
                case 20:
                    f = b.h(parcel, a);
                    break;
                case 21:
                    str5 = b.k(parcel, a);
                    break;
                case 25:
                    j = b.f(parcel, a);
                    break;
                case 26:
                    str6 = b.k(parcel, a);
                    break;
                case 27:
                    list2 = b.r(parcel, a);
                    break;
                case 28:
                    str7 = b.k(parcel, a);
                    break;
                case 29:
                    qrVar = (qr) b.a(parcel, a, qr.CREATOR);
                    break;
                case 30:
                    list3 = b.r(parcel, a);
                    break;
                case 31:
                    j2 = b.f(parcel, a);
                    break;
                case 32:
                    wmVar = (wm) b.a(parcel, a, wm.CREATOR);
                    break;
                case 33:
                    str8 = b.k(parcel, a);
                    break;
                case 34:
                    f2 = b.h(parcel, a);
                    break;
                case 35:
                    i5 = b.d(parcel, a);
                    break;
                case 36:
                    i6 = b.d(parcel, a);
                    break;
                case 37:
                    z3 = b.c(parcel, a);
                    break;
                case 38:
                    z4 = b.c(parcel, a);
                    break;
                case 39:
                    str9 = b.k(parcel, a);
                    break;
                case 40:
                    z2 = b.c(parcel, a);
                    break;
                case 41:
                    str10 = b.k(parcel, a);
                    break;
                case 42:
                    z5 = b.c(parcel, a);
                    break;
                case 43:
                    i7 = b.d(parcel, a);
                    break;
                case 44:
                    bundle4 = b.m(parcel, a);
                    break;
                case 45:
                    str11 = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new wf(i, bundle, nsVar, nxVar, str, applicationInfo, packageInfo, str2, str3, str4, com_google_android_gms_b_aab, bundle2, i2, list, bundle3, z, messenger, i3, i4, f, str5, j, str6, list2, str7, qrVar, list3, j2, wmVar, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wf[] a(int i) {
        return new wf[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
