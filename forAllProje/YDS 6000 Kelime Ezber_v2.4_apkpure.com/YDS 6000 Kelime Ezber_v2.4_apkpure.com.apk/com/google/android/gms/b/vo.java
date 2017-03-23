package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.o;
import com.google.android.gms.b.yu.a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@vz
public class vo extends vj {
    tc g;
    protected ti h;
    private tn i;
    private te j;
    private final qa k;
    private final aaq l;
    private boolean m;

    vo(Context context, a aVar, tn tnVar, vk.a aVar2, qa qaVar, aaq com_google_android_gms_b_aaq) {
        super(context, aVar, aVar2);
        this.i = tnVar;
        this.j = aVar.c;
        this.k = qaVar;
        this.l = com_google_android_gms_b_aaq;
    }

    private static String a(ti tiVar) {
        String str = tiVar.b.d;
        int b = b(tiVar.a);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(b).append(".").append(tiVar.g).toString();
    }

    private static String a(List<ti> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        String str2 = str;
        for (ti tiVar : list) {
            if (!(tiVar == null || tiVar.b == null || TextUtils.isEmpty(tiVar.b.d))) {
                str2 = String.valueOf(str2);
                str = String.valueOf(a(tiVar));
                str2 = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append(str).append("_").toString();
            }
        }
        return str2.substring(0, Math.max(0, str2.length() - 1));
    }

    private static int b(int i) {
        switch (i) {
            case -1:
                return 4;
            case 0:
                return 0;
            case 1:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                return 6;
        }
    }

    private void c() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        zi.a.post(new Runnable(this) {
            final /* synthetic */ vo b;

            public void run() {
                synchronized (this.b.d) {
                    this.b.m = o.a(this.b.l, this.b.h, countDownLatch);
                }
            }
        });
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
            synchronized (this.d) {
                if (!this.m) {
                    throw new a("View could not be prepared", 0);
                } else if (this.l.r()) {
                    throw new a("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            throw new a(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
        }
    }

    protected yu a(int i) {
        wf wfVar = this.e.a;
        return new yu(wfVar.c, this.l, this.f.d, i, this.f.f, this.f.j, this.f.l, this.f.k, wfVar.i, this.f.h, this.h != null ? this.h.b : null, this.h != null ? this.h.c : null, this.h != null ? this.h.d : AdMobAdapter.class.getName(), this.j, this.h != null ? this.h.e : null, this.f.i, this.e.d, this.f.g, this.e.f, this.f.n, this.f.o, this.e.h, null, this.f.C, this.f.D, this.f.E, this.j != null ? this.j.n : false, this.f.G, this.g != null ? a(this.g.b()) : null, this.f.J, this.f.N);
    }

    protected void a(long j) {
        boolean z;
        ListIterator listIterator;
        synchronized (this.d) {
            this.g = b(j);
        }
        List arrayList = new ArrayList(this.j.a);
        Bundle bundle = this.e.a.c.m;
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
                if (z) {
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (!((td) listIterator.next()).c.contains(str)) {
                            listIterator.remove();
                        }
                    }
                }
                this.h = this.g.a(arrayList);
                switch (this.h.a) {
                    case 0:
                        if (this.h.b != null && this.h.b.l != null) {
                            c();
                            return;
                        }
                        return;
                    case 1:
                        throw new a("No fill from any mediation ad networks.", 3);
                    default:
                        throw new a("Unexpected mediation result: " + this.h.a, 0);
                }
            }
        }
        z = false;
        if (z) {
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((td) listIterator.next()).c.contains(str)) {
                    listIterator.remove();
                }
            }
        }
        this.h = this.g.a(arrayList);
        switch (this.h.a) {
            case 0:
                if (this.h.b != null) {
                    return;
                }
                return;
            case 1:
                throw new a("No fill from any mediation ad networks.", 3);
            default:
                throw new a("Unexpected mediation result: " + this.h.a, 0);
        }
    }

    tc b(long j) {
        if (this.j.l != -1) {
            return new tk(this.b, this.e.a, this.i, this.j, this.f.t, this.f.B, j, ((Long) pr.bo.c()).longValue(), 2);
        }
        return new tl(this.b, this.e.a, this.i, this.j, this.f.t, this.f.B, j, ((Long) pr.bo.c()).longValue(), this.k);
    }

    public void b() {
        synchronized (this.d) {
            super.b();
            if (this.g != null) {
                this.g.a();
            }
        }
    }
}
