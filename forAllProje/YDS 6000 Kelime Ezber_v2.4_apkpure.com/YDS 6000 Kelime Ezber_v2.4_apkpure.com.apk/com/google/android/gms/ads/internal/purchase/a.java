package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class a implements Creator<GInAppPurchaseManagerInfoParcel> {
    static void a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, gInAppPurchaseManagerInfoParcel.a);
        c.a(parcel, 3, gInAppPurchaseManagerInfoParcel.b(), false);
        c.a(parcel, 4, gInAppPurchaseManagerInfoParcel.c(), false);
        c.a(parcel, 5, gInAppPurchaseManagerInfoParcel.d(), false);
        c.a(parcel, 6, gInAppPurchaseManagerInfoParcel.a(), false);
        c.a(parcel, a);
    }

    public GInAppPurchaseManagerInfoParcel a(Parcel parcel) {
        IBinder iBinder = null;
        int b = b.b(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 3:
                    iBinder4 = b.l(parcel, a);
                    break;
                case 4:
                    iBinder3 = b.l(parcel, a);
                    break;
                case 5:
                    iBinder2 = b.l(parcel, a);
                    break;
                case 6:
                    iBinder = b.l(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GInAppPurchaseManagerInfoParcel(i, iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b.a("Overread allowed size end=" + b, parcel);
    }

    public GInAppPurchaseManagerInfoParcel[] a(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
