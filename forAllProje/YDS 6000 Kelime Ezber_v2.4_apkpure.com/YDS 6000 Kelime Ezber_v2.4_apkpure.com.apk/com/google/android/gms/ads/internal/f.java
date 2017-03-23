package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.d;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.aar;
import com.google.android.gms.b.aar.c;
import com.google.android.gms.b.aar.e;
import com.google.android.gms.b.aav;
import com.google.android.gms.b.mo;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.or;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yo;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.util.k;
import java.util.List;

@vz
public class f extends c implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean l;

    public class a {
        final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a() {
            this.a.e();
        }
    }

    public f(Context context, nx nxVar, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        super(context, nxVar, str, tnVar, com_google_android_gms_b_aab, dVar);
    }

    private nx b(com.google.android.gms.b.yu.a aVar) {
        if (aVar.b.A) {
            return this.f.i;
        }
        d dVar;
        String str = aVar.b.m;
        if (str != null) {
            String[] split = str.split("[xX]");
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            dVar = new d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } else {
            dVar = this.f.i.b();
        }
        return new nx(this.f.c, dVar);
    }

    private boolean b(yu yuVar, yu yuVar2) {
        if (yuVar2.n) {
            View a = o.a(yuVar2);
            if (a == null) {
                zy.e("Could not get mediation view");
                return false;
            }
            View nextView = this.f.f.getNextView();
            if (nextView != null) {
                if (nextView instanceof aaq) {
                    ((aaq) nextView).destroy();
                }
                this.f.f.removeView(nextView);
            }
            if (!o.b(yuVar2)) {
                try {
                    a(a);
                } catch (Throwable th) {
                    zy.c("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (!(yuVar2.v == null || yuVar2.b == null)) {
            yuVar2.b.a(yuVar2.v);
            this.f.f.removeAllViews();
            this.f.f.setMinimumWidth(yuVar2.v.g);
            this.f.f.setMinimumHeight(yuVar2.v.d);
            a(yuVar2.b.b());
        }
        if (this.f.f.getChildCount() > 1) {
            this.f.f.showNext();
        }
        if (yuVar != null) {
            View nextView2 = this.f.f.getNextView();
            if (nextView2 instanceof aaq) {
                ((aaq) nextView2).a(this.f.c, this.f.i, this.a);
            } else if (nextView2 != null) {
                this.f.f.removeView(nextView2);
            }
            this.f.d();
        }
        this.f.f.setVisibility(0);
        return true;
    }

    private void e(final yu yuVar) {
        if (!k.c()) {
            return;
        }
        if (this.f.e()) {
            if (yuVar.b != null) {
                if (yuVar.j != null) {
                    this.h.a(this.f.i, yuVar);
                }
                if (yuVar.a()) {
                    new mo(this.f.c, yuVar.b.b()).a(yuVar.b);
                } else {
                    yuVar.b.l().a(new c(this) {
                        final /* synthetic */ f b;

                        public void a() {
                            new mo(this.b.f.c, yuVar.b.b()).a(yuVar.b);
                        }
                    });
                }
            }
        } else if (this.f.D != null && yuVar.j != null) {
            this.h.a(this.f.i, yuVar, this.f.D);
        }
    }

    public void G() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected aaq a(com.google.android.gms.b.yu.a aVar, e eVar, yo yoVar) {
        if (this.f.i.h == null && this.f.i.j) {
            this.f.i = b(aVar);
        }
        return super.a(aVar, eVar, yoVar);
    }

    protected void a(yu yuVar, boolean z) {
        super.a(yuVar, z);
        if (o.b(yuVar)) {
            o.a(yuVar, new a(this));
        }
    }

    public void a(boolean z) {
        com.google.android.gms.common.internal.c.b("setManualImpressionsEnabled must be called from the main thread.");
        this.l = z;
    }

    public boolean a(ns nsVar) {
        return super.a(d(nsVar));
    }

    public boolean a(yu yuVar, final yu yuVar2) {
        if (!super.a(yuVar, yuVar2)) {
            return false;
        }
        if (!this.f.e() || b(yuVar, yuVar2)) {
            aav z;
            if (yuVar2.k) {
                d(yuVar2);
                v.C().a(this.f.f, (OnGlobalLayoutListener) this);
                v.C().a(this.f.f, (OnScrollChangedListener) this);
                if (!yuVar2.m) {
                    final Runnable anonymousClass1 = new Runnable(this) {
                        final /* synthetic */ f a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.d(this.a.f.j);
                        }
                    };
                    aar l = yuVar2.b != null ? yuVar2.b.l() : null;
                    if (l != null) {
                        l.a(new e(this) {
                            public void a() {
                                if (!yuVar2.m) {
                                    v.e();
                                    zi.b(anonymousClass1);
                                }
                            }
                        });
                    }
                }
            } else if (!this.f.f() || ((Boolean) pr.ca.c()).booleanValue()) {
                a(yuVar2, false);
            }
            if (yuVar2.b != null) {
                z = yuVar2.b.z();
                aar l2 = yuVar2.b.l();
                if (l2 != null) {
                    l2.h();
                }
            } else {
                z = null;
            }
            if (!(this.f.x == null || z == null)) {
                z.b(this.f.x.b);
            }
            e(yuVar2);
            return true;
        }
        a(0);
        return false;
    }

    ns d(ns nsVar) {
        if (nsVar.h == this.l) {
            return nsVar;
        }
        int i = nsVar.a;
        long j = nsVar.b;
        Bundle bundle = nsVar.c;
        int i2 = nsVar.d;
        List list = nsVar.e;
        boolean z = nsVar.f;
        int i3 = nsVar.g;
        boolean z2 = nsVar.h || this.l;
        return new ns(i, j, bundle, i2, list, z, i3, z2, nsVar.i, nsVar.j, nsVar.k, nsVar.l, nsVar.m, nsVar.n, nsVar.o, nsVar.p, nsVar.q, nsVar.r);
    }

    void d(yu yuVar) {
        if (yuVar != null && !yuVar.m && this.f.f != null && v.e().a(this.f.f, this.f.c) && this.f.f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(yuVar == null || yuVar.b == null || yuVar.b.l() == null)) {
                yuVar.b.l().a(null);
            }
            a(yuVar, false);
            yuVar.m = true;
        }
    }

    public void onGlobalLayout() {
        d(this.f.j);
    }

    public void onScrollChanged() {
        d(this.f.j);
    }

    public or r() {
        com.google.android.gms.common.internal.c.b("getVideoController must be called from the main thread.");
        return (this.f.j == null || this.f.j.b == null) ? null : this.f.j.b.z();
    }

    protected boolean x() {
        boolean z = true;
        if (!v.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET")) {
            oc.a().a(this.f.f, this.f.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!v.e().a(this.f.c)) {
            oc.a().a(this.f.f, this.f.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.f.f == null)) {
            this.f.f.setVisibility(0);
        }
        return z;
    }
}
