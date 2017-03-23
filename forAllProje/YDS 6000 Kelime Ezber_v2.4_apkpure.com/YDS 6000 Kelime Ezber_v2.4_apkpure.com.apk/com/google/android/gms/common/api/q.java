package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class q implements Creator<Status> {
    static void a(Status status, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, status.e());
        c.a(parcel, 2, status.c(), false);
        c.a(parcel, 3, status.b(), i, false);
        c.a(parcel, 1000, status.h);
        c.a(parcel, a);
    }

    public Status a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int i = 0;
        int b = b.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) b.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = b.d(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Status(i2, i, str, pendingIntent);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public Status[] a(int i) {
        return new Status[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
