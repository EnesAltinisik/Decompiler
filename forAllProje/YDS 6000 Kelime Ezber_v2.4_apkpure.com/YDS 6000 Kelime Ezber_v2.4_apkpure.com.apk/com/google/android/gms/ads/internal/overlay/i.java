package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.b.aab;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class i implements Creator<AdOverlayInfoParcel> {
    static void a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, adOverlayInfoParcel.a);
        c.a(parcel, 2, adOverlayInfoParcel.b, i, false);
        c.a(parcel, 3, adOverlayInfoParcel.a(), false);
        c.a(parcel, 4, adOverlayInfoParcel.b(), false);
        c.a(parcel, 5, adOverlayInfoParcel.c(), false);
        c.a(parcel, 6, adOverlayInfoParcel.d(), false);
        c.a(parcel, 7, adOverlayInfoParcel.g, false);
        c.a(parcel, 8, adOverlayInfoParcel.h);
        c.a(parcel, 9, adOverlayInfoParcel.i, false);
        c.a(parcel, 10, adOverlayInfoParcel.f(), false);
        c.a(parcel, 11, adOverlayInfoParcel.k);
        c.a(parcel, 12, adOverlayInfoParcel.l);
        c.a(parcel, 13, adOverlayInfoParcel.m, false);
        c.a(parcel, 14, adOverlayInfoParcel.n, i, false);
        c.a(parcel, 15, adOverlayInfoParcel.e(), false);
        c.a(parcel, 16, adOverlayInfoParcel.p, false);
        c.a(parcel, 17, adOverlayInfoParcel.q, i, false);
        c.a(parcel, a);
    }

    public AdOverlayInfoParcel a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        e eVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        aab com_google_android_gms_b_aab = null;
        IBinder iBinder6 = null;
        String str4 = null;
        m mVar = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    eVar = (e) b.a(parcel, a, e.CREATOR);
                    break;
                case 3:
                    iBinder = b.l(parcel, a);
                    break;
                case 4:
                    iBinder2 = b.l(parcel, a);
                    break;
                case 5:
                    iBinder3 = b.l(parcel, a);
                    break;
                case 6:
                    iBinder4 = b.l(parcel, a);
                    break;
                case 7:
                    str = b.k(parcel, a);
                    break;
                case 8:
                    z = b.c(parcel, a);
                    break;
                case 9:
                    str2 = b.k(parcel, a);
                    break;
                case 10:
                    iBinder5 = b.l(parcel, a);
                    break;
                case 11:
                    i2 = b.d(parcel, a);
                    break;
                case 12:
                    i3 = b.d(parcel, a);
                    break;
                case 13:
                    str3 = b.k(parcel, a);
                    break;
                case 14:
                    com_google_android_gms_b_aab = (aab) b.a(parcel, a, aab.CREATOR);
                    break;
                case 15:
                    iBinder6 = b.l(parcel, a);
                    break;
                case 16:
                    str4 = b.k(parcel, a);
                    break;
                case 17:
                    mVar = (m) b.a(parcel, a, m.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdOverlayInfoParcel(i, eVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, com_google_android_gms_b_aab, iBinder6, str4, mVar);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public AdOverlayInfoParcel[] a(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
