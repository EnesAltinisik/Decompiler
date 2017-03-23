package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.b;
import com.google.android.gms.b.uu;
import com.google.android.gms.b.vz;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public final class GInAppPurchaseManagerInfoParcel extends a implements ReflectedParcelable {
    public static final Creator<GInAppPurchaseManagerInfoParcel> CREATOR = new a();
    public final int a;
    public final k b;
    public final uu c;
    public final Context d;
    public final j e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.a = i;
        this.b = (k) b.a(com.google.android.gms.a.a.a.a(iBinder));
        this.c = (uu) b.a(com.google.android.gms.a.a.a.a(iBinder2));
        this.d = (Context) b.a(com.google.android.gms.a.a.a.a(iBinder3));
        this.e = (j) b.a(com.google.android.gms.a.a.a.a(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, k kVar, uu uuVar, j jVar) {
        this.a = 2;
        this.d = context;
        this.b = kVar;
        this.c = uuVar;
        this.e = jVar;
    }

    public static GInAppPurchaseManagerInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder a() {
        return b.a(this.e).asBinder();
    }

    IBinder b() {
        return b.a(this.b).asBinder();
    }

    IBinder c() {
        return b.a(this.c).asBinder();
    }

    IBinder d() {
        return b.a(this.d).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
