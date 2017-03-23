package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import java.util.Iterator;
import java.util.LinkedList;

@zzig
class v {
    private final LinkedList<a> a = new LinkedList();
    private AdRequestParcel b;
    private final String c;
    private final int d;
    private boolean e;

    class a {
        zzl a;
        AdRequestParcel b;
        s c;
        long d;
        boolean e;
        boolean f;
        final /* synthetic */ v g;

        a(v vVar, zzey com_google_android_gms_internal_zzey) {
            this.g = vVar;
            this.a = com_google_android_gms_internal_zzey.zzac(vVar.c);
            this.c = new s();
            this.c.a(this.a);
        }

        a(v vVar, zzey com_google_android_gms_internal_zzey, AdRequestParcel adRequestParcel) {
            this(vVar, com_google_android_gms_internal_zzey);
            this.b = adRequestParcel;
        }

        void a() {
            if (!this.e) {
                this.f = this.a.zzb(zzfb.zzj(this.b != null ? this.b : this.g.b));
                this.e = true;
                this.d = zzu.zzco().currentTimeMillis();
            }
        }
    }

    v(AdRequestParcel adRequestParcel, String str, int i) {
        zzaa.zzz(adRequestParcel);
        zzaa.zzz(str);
        this.b = adRequestParcel;
        this.c = str;
        this.d = i;
    }

    AdRequestParcel a() {
        return this.b;
    }

    a a(AdRequestParcel adRequestParcel) {
        if (adRequestParcel != null) {
            this.b = adRequestParcel;
        }
        return (a) this.a.remove();
    }

    void a(zzey com_google_android_gms_internal_zzey) {
        a aVar = new a(this, com_google_android_gms_internal_zzey);
        this.a.add(aVar);
        aVar.a();
    }

    void a(zzey com_google_android_gms_internal_zzey, AdRequestParcel adRequestParcel) {
        this.a.add(new a(this, com_google_android_gms_internal_zzey, adRequestParcel));
    }

    int b() {
        return this.d;
    }

    String c() {
        return this.c;
    }

    int d() {
        return this.a.size();
    }

    int e() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((a) it.next()).e ? i + 1 : i;
        }
        return i;
    }

    void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void g() {
        this.e = true;
    }

    boolean h() {
        return this.e;
    }
}
