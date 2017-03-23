package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.rm;
import com.google.android.gms.b.rs;
import com.google.android.gms.b.vz;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new i();
    public final int a;
    public final e b;
    public final nn c;
    public final j d;
    public final aaq e;
    public final rm f;
    public final String g;
    public final boolean h;
    public final String i;
    public final s j;
    public final int k;
    public final int l;
    public final String m;
    public final aab n;
    public final rs o;
    public final String p;
    public final m q;

    AdOverlayInfoParcel(int i, e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, aab com_google_android_gms_b_aab, IBinder iBinder6, String str4, m mVar) {
        this.a = i;
        this.b = eVar;
        this.c = (nn) b.a(com.google.android.gms.a.a.a.a(iBinder));
        this.d = (j) b.a(com.google.android.gms.a.a.a.a(iBinder2));
        this.e = (aaq) b.a(com.google.android.gms.a.a.a.a(iBinder3));
        this.f = (rm) b.a(com.google.android.gms.a.a.a.a(iBinder4));
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = (s) b.a(com.google.android.gms.a.a.a.a(iBinder5));
        this.k = i2;
        this.l = i3;
        this.m = str3;
        this.n = com_google_android_gms_b_aab;
        this.o = (rs) b.a(com.google.android.gms.a.a.a.a(iBinder6));
        this.p = str4;
        this.q = mVar;
    }

    public AdOverlayInfoParcel(e eVar, nn nnVar, j jVar, s sVar, aab com_google_android_gms_b_aab) {
        this.a = 4;
        this.b = eVar;
        this.c = nnVar;
        this.d = jVar;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = sVar;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = com_google_android_gms_b_aab;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(nn nnVar, j jVar, s sVar, aaq com_google_android_gms_b_aaq, int i, aab com_google_android_gms_b_aab, String str, m mVar) {
        this.a = 4;
        this.b = null;
        this.c = nnVar;
        this.d = jVar;
        this.e = com_google_android_gms_b_aaq;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = sVar;
        this.k = i;
        this.l = 1;
        this.m = null;
        this.n = com_google_android_gms_b_aab;
        this.o = null;
        this.p = str;
        this.q = mVar;
    }

    public AdOverlayInfoParcel(nn nnVar, j jVar, s sVar, aaq com_google_android_gms_b_aaq, boolean z, int i, aab com_google_android_gms_b_aab) {
        this.a = 4;
        this.b = null;
        this.c = nnVar;
        this.d = jVar;
        this.e = com_google_android_gms_b_aaq;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = sVar;
        this.k = i;
        this.l = 2;
        this.m = null;
        this.n = com_google_android_gms_b_aab;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(nn nnVar, j jVar, rm rmVar, s sVar, aaq com_google_android_gms_b_aaq, boolean z, int i, String str, aab com_google_android_gms_b_aab, rs rsVar) {
        this.a = 4;
        this.b = null;
        this.c = nnVar;
        this.d = jVar;
        this.e = com_google_android_gms_b_aaq;
        this.f = rmVar;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = sVar;
        this.k = i;
        this.l = 3;
        this.m = str;
        this.n = com_google_android_gms_b_aab;
        this.o = rsVar;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(nn nnVar, j jVar, rm rmVar, s sVar, aaq com_google_android_gms_b_aaq, boolean z, int i, String str, String str2, aab com_google_android_gms_b_aab, rs rsVar) {
        this.a = 4;
        this.b = null;
        this.c = nnVar;
        this.d = jVar;
        this.e = com_google_android_gms_b_aaq;
        this.f = rmVar;
        this.g = str2;
        this.h = z;
        this.i = str;
        this.j = sVar;
        this.k = i;
        this.l = 3;
        this.m = null;
        this.n = com_google_android_gms_b_aab;
        this.o = rsVar;
        this.p = null;
        this.q = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder a() {
        return b.a(this.c).asBinder();
    }

    IBinder b() {
        return b.a(this.d).asBinder();
    }

    IBinder c() {
        return b.a(this.e).asBinder();
    }

    IBinder d() {
        return b.a(this.f).asBinder();
    }

    IBinder e() {
        return b.a(this.o).asBinder();
    }

    IBinder f() {
        return b.a(this.j).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
