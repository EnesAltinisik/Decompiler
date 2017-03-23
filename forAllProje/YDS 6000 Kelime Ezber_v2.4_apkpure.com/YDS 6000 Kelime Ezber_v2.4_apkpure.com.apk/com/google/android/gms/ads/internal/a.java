package com.google.android.gms.ads.internal;

import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.b.mi;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nt;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.of;
import com.google.android.gms.b.og;
import com.google.android.gms.b.om;
import com.google.android.gms.b.oo;
import com.google.android.gms.b.or;
import com.google.android.gms.b.pf;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.py;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.qe;
import com.google.android.gms.b.rm;
import com.google.android.gms.b.uv;
import com.google.android.gms.b.va;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.xm;
import com.google.android.gms.b.xs;
import com.google.android.gms.b.yj;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.yv;
import com.google.android.gms.b.za;
import com.google.android.gms.b.zb;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.f;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

@vz
public abstract class a extends com.google.android.gms.b.ok.a implements s, nn, rm, com.google.android.gms.b.vk.a, com.google.android.gms.b.wa.a, za {
    protected qa a;
    protected py b;
    protected py c;
    protected boolean d = false;
    protected final s e;
    protected final w f;
    protected transient ns g;
    protected final mi h;
    protected final d i;

    a(w wVar, s sVar, d dVar) {
        this.f = wVar;
        if (sVar == null) {
            sVar = new s(this);
        }
        this.e = sVar;
        this.i = dVar;
        v.e().b(this.f.c);
        v.i().a(this.f.c, this.f.e);
        v.j().a(this.f.c);
        this.h = v.i().r();
        v.h().a(this.f.c);
        x();
    }

    private TimerTask a(final Timer timer, final CountDownLatch countDownLatch) {
        return new TimerTask(this) {
            final /* synthetic */ a c;

            public void run() {
                if (((long) ((Integer) pr.cr.c()).intValue()) != countDownLatch.getCount()) {
                    zy.b("Stopping method tracing");
                    Debug.stopMethodTracing();
                    if (countDownLatch.getCount() == 0) {
                        timer.cancel();
                        return;
                    }
                }
                String concat = String.valueOf(this.c.f.c.getPackageName()).concat("_adsTrace_");
                try {
                    zy.b("Starting method tracing");
                    countDownLatch.countDown();
                    Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(v.k().a()).toString(), ((Integer) pr.cs.c()).intValue());
                } catch (Throwable e) {
                    zy.c("Exception occurred while starting method tracing.", e);
                }
            }
        };
    }

    private ns d(ns nsVar) {
        return (!f.c(this.f.c) || nsVar.k == null) ? nsVar : new nt(nsVar).a(null).a();
    }

    private void d(yu yuVar) {
        if (v.m().b() && !yuVar.H && !TextUtils.isEmpty(yuVar.D)) {
            zy.b("Sending troubleshooting signals to the server.");
            v.m().a(this.f.c, this.f.e.b, yuVar.D, this.f.b);
            yuVar.H = true;
        }
    }

    private void x() {
        if (((Boolean) pr.cp.c()).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(a(timer, new CountDownLatch(((Integer) pr.cr.c()).intValue())), 0, ((Long) pr.cq.c()).longValue());
        }
    }

    protected void a(int i) {
        zy.e("Failed to load ad: " + i);
        this.d = false;
        if (this.f.n != null) {
            try {
                this.f.n.a(i);
            } catch (Throwable e) {
                zy.c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.a(i);
            } catch (Throwable e2) {
                zy.c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    protected void a(View view) {
        com.google.android.gms.ads.internal.w.a aVar = this.f.f;
        if (aVar != null) {
            aVar.addView(view, v.g().d());
        }
    }

    public void a(nx nxVar) {
        c.b("setAdSize must be called on the main UI thread.");
        this.f.i = nxVar;
        if (!(this.f.j == null || this.f.j.b == null || this.f.E != 0)) {
            this.f.j.b.a(nxVar);
        }
        if (this.f.f != null) {
            if (this.f.f.getChildCount() > 1) {
                this.f.f.removeView(this.f.f.getNextView());
            }
            this.f.f.setMinimumWidth(nxVar.g);
            this.f.f.setMinimumHeight(nxVar.d);
            this.f.f.requestLayout();
        }
    }

    public void a(of ofVar) {
        c.b("setAdListener must be called on the main UI thread.");
        this.f.m = ofVar;
    }

    public void a(og ogVar) {
        c.b("setAdListener must be called on the main UI thread.");
        this.f.n = ogVar;
    }

    public void a(om omVar) {
        c.b("setAppEventListener must be called on the main UI thread.");
        this.f.o = omVar;
    }

    public void a(oo ooVar) {
        c.b("setCorrelationIdProvider must be called on the main UI thread");
        this.f.p = ooVar;
    }

    public void a(ph phVar) {
        c.b("setVideoOptions must be called on the main UI thread.");
        this.f.x = phVar;
    }

    public void a(qe qeVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void a(uv uvVar) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void a(va vaVar, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void a(xs xsVar) {
        c.b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f.z = xsVar;
    }

    protected void a(yj yjVar) {
        if (this.f.z != null) {
            try {
                String str = "";
                int i = 0;
                if (yjVar != null) {
                    str = yjVar.b;
                    i = yjVar.c;
                }
                this.f.z.a(new xm(str, i));
            } catch (Throwable e) {
                zy.c("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public void a(com.google.android.gms.b.yu.a aVar) {
        if (!(aVar.b.n == -1 || TextUtils.isEmpty(aVar.b.y))) {
            long b = b(aVar.b.y);
            if (b != -1) {
                py a = this.a.a(b + aVar.b.n);
                this.a.a(a, "stc");
            }
        }
        this.a.a(aVar.b.y);
        this.a.a(this.b, "arf");
        this.c = this.a.a();
        this.a.a("gqi", aVar.b.z);
        this.f.g = null;
        this.f.k = aVar;
        a(aVar, this.a);
    }

    protected abstract void a(com.google.android.gms.b.yu.a aVar, qa qaVar);

    public void a(String str) {
        zy.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void a(String str, String str2) {
        if (this.f.o != null) {
            try {
                this.f.o.a(str, str2);
            } catch (Throwable e) {
                zy.c("Could not call the AppEventListener.", e);
            }
        }
    }

    public void a(HashSet<yv> hashSet) {
        this.f.a((HashSet) hashSet);
    }

    public void a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean a(ns nsVar) {
        c.b("loadAd must be called on the main UI thread.");
        v.j().a();
        if (((Boolean) pr.aI.c()).booleanValue()) {
            ns.a(nsVar);
        }
        ns d = d(nsVar);
        if (this.f.g == null && this.f.h == null) {
            zy.d("Starting ad request.");
            h();
            this.b = this.a.a();
            if (!d.f) {
                String valueOf = String.valueOf(oc.a().a(this.f.c));
                zy.d(new StringBuilder(String.valueOf(valueOf).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(valueOf).append("\") to get test ads on this device.").toString());
            }
            this.e.a(d);
            this.d = a(d, this.a);
            return this.d;
        }
        if (this.g != null) {
            zy.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            zy.e("Loading already in progress, saving this object for future refreshes.");
        }
        this.g = d;
        return false;
    }

    protected abstract boolean a(ns nsVar, qa qaVar);

    boolean a(yu yuVar) {
        return false;
    }

    protected abstract boolean a(yu yuVar, yu yuVar2);

    long b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            zy.e("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            zy.e("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    public void b(yu yuVar) {
        this.a.a(this.c, "awr");
        this.f.h = null;
        if (!(yuVar.d == -2 || yuVar.d == 3)) {
            v.i().a(this.f.a());
        }
        if (yuVar.d == -1) {
            this.d = false;
            return;
        }
        if (a(yuVar)) {
            zy.b("Ad refresh scheduled.");
        }
        if (yuVar.d != -2) {
            a(yuVar.d);
            return;
        }
        if (this.f.C == null) {
            this.f.C = new zb(this.f.b);
        }
        this.h.b(this.f.j);
        if (a(this.f.j, yuVar)) {
            this.f.j = yuVar;
            this.f.i();
            this.a.a("is_mraid", this.f.j.a() ? "1" : "0");
            this.a.a("is_mediation", this.f.j.n ? "1" : "0");
            if (!(this.f.j.b == null || this.f.j.b.l() == null)) {
                this.a.a("is_delay_pl", this.f.j.b.l().f() ? "1" : "0");
            }
            this.a.a(this.b, "ttc");
            if (v.i().f() != null) {
                v.i().f().a(this.a);
            }
            if (this.f.e()) {
                v();
            }
        }
        if (yuVar.I != null) {
            v.e().a(this.f.c, yuVar.I);
        }
    }

    protected boolean b(ns nsVar) {
        if (this.f.f == null) {
            return false;
        }
        ViewParent parent = this.f.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return v.e().a(view, view.getContext());
    }

    public void c(ns nsVar) {
        if (b(nsVar)) {
            a(nsVar);
            return;
        }
        zy.d("Ad is not visible. Not refreshing ad.");
        this.e.b(nsVar);
    }

    protected void c(yu yuVar) {
        if (yuVar == null) {
            zy.e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        zy.b("Pinging Impression URLs.");
        if (this.f.l != null) {
            this.f.l.a();
        }
        if (yuVar.e != null && !yuVar.F) {
            v.e().a(this.f.c, this.f.e.b, yuVar.e);
            yuVar.F = true;
            d(yuVar);
        }
    }

    public void e() {
        if (this.f.j == null) {
            zy.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        zy.b("Pinging click URLs.");
        if (this.f.l != null) {
            this.f.l.b();
        }
        if (this.f.j.c != null) {
            v.e().a(this.f.c, this.f.e.b, this.f.j.c);
        }
        if (this.f.m != null) {
            try {
                this.f.m.a();
            } catch (Throwable e) {
                zy.c("Could not notify onAdClicked event.", e);
            }
        }
    }

    public void f() {
        t();
    }

    public d g() {
        return this.i;
    }

    public void h() {
        this.a = new qa(((Boolean) pr.U.c()).booleanValue(), "load_ad", this.f.i.b);
        this.b = new py(-1, null, null);
        this.c = new py(-1, null, null);
    }

    public void i() {
        c.b("destroy must be called on the main UI thread.");
        this.e.a();
        this.h.c(this.f.j);
        this.f.j();
    }

    public com.google.android.gms.a.a j() {
        c.b("getAdFrame must be called on the main UI thread.");
        return b.a(this.f.f);
    }

    public nx k() {
        c.b("getAdSize must be called on the main UI thread.");
        return this.f.i == null ? null : new pf(this.f.i);
    }

    public boolean l() {
        c.b("isLoaded must be called on the main UI thread.");
        return this.f.g == null && this.f.h == null && this.f.j != null;
    }

    public void m() {
        c.b("recordManualImpression must be called on the main UI thread.");
        if (this.f.j == null) {
            zy.e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zy.b("Pinging manual tracking URLs.");
        if (this.f.j.f != null && !this.f.j.G) {
            v.e().a(this.f.c, this.f.e.b, this.f.j.f);
            this.f.j.G = true;
            d(this.f.j);
        }
    }

    public void n() {
        c.b("pause must be called on the main UI thread.");
    }

    public void o() {
        c.b("resume must be called on the main UI thread.");
    }

    public void p() {
        c.b("stopLoading must be called on the main UI thread.");
        this.d = false;
        this.f.a(true);
    }

    public boolean q() {
        return this.d;
    }

    public or r() {
        return null;
    }

    protected void s() {
        zy.d("Ad closing.");
        if (this.f.n != null) {
            try {
                this.f.n.a();
            } catch (Throwable e) {
                zy.c("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.d();
            } catch (Throwable e2) {
                zy.c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    protected void t() {
        zy.d("Ad leaving application.");
        if (this.f.n != null) {
            try {
                this.f.n.b();
            } catch (Throwable e) {
                zy.c("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.e();
            } catch (Throwable e2) {
                zy.c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    protected void u() {
        zy.d("Ad opening.");
        if (this.f.n != null) {
            try {
                this.f.n.d();
            } catch (Throwable e) {
                zy.c("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.b();
            } catch (Throwable e2) {
                zy.c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    protected void v() {
        zy.d("Ad finished loading.");
        this.d = false;
        if (this.f.n != null) {
            try {
                this.f.n.c();
            } catch (Throwable e) {
                zy.c("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.a();
            } catch (Throwable e2) {
                zy.c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    protected void w() {
        if (this.f.z != null) {
            try {
                this.f.z.c();
            } catch (Throwable e) {
                zy.c("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }
}
