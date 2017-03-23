package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.i.k;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.qe;
import com.google.android.gms.b.qk;
import com.google.android.gms.b.ql;
import com.google.android.gms.b.qm;
import com.google.android.gms.b.qn;
import com.google.android.gms.b.qo;
import com.google.android.gms.b.qp;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.re;
import com.google.android.gms.b.rf;
import com.google.android.gms.b.rg;
import com.google.android.gms.b.rh;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.tr;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.uv;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.yu.a;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;
import java.util.List;

@vz
public class r extends b {
    private aaq l;

    public r(Context context, d dVar, nx nxVar, String str, tn tnVar, aab com_google_android_gms_b_aab) {
        super(context, nxVar, str, tnVar, com_google_android_gms_b_aab, dVar);
    }

    private static qk a(tr trVar) {
        return new qk(trVar.a(), trVar.b(), trVar.c(), trVar.d() != null ? trVar.d() : null, trVar.e(), trVar.f(), trVar.g(), trVar.h(), null, trVar.l(), trVar.m(), null);
    }

    private static ql a(ts tsVar) {
        return new ql(tsVar.a(), tsVar.b(), tsVar.c(), tsVar.d() != null ? tsVar.d() : null, tsVar.e(), tsVar.f(), null, tsVar.j());
    }

    private void a(final qk qkVar) {
        zi.a.post(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                try {
                    if (this.b.f.s != null) {
                        this.b.f.s.a(qkVar);
                    }
                } catch (Throwable e) {
                    zy.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    private void a(final ql qlVar) {
        zi.a.post(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                try {
                    if (this.b.f.t != null) {
                        this.b.f.t.a(qlVar);
                    }
                } catch (Throwable e) {
                    zy.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    private void a(final yu yuVar, final String str) {
        zi.a.post(new Runnable(this) {
            final /* synthetic */ r c;

            public void run() {
                try {
                    ((rh) this.c.f.v.get(str)).a((qm) yuVar.E);
                } catch (Throwable e) {
                    zy.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    public void G() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void J() {
        if (this.f.j == null || this.l == null) {
            zy.e("Request to enable ActiveView before adState is available.");
        } else {
            v.i().r().a(this.f.i, this.f.j, this.l.b(), this.l);
        }
    }

    public k<String, rh> K() {
        c.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f.v;
    }

    public void L() {
        if (this.l != null) {
            this.l.destroy();
            this.l = null;
        }
    }

    public void M() {
        if (this.l != null && this.l.z() != null && this.f.w != null && this.f.w.f != null) {
            this.l.z().b(this.f.w.f.b);
        }
    }

    public void a(k<String, rh> kVar) {
        c.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.f.v = kVar;
    }

    public void a(aaq com_google_android_gms_b_aaq) {
        this.l = com_google_android_gms_b_aaq;
    }

    public void a(qe qeVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void a(qn qnVar) {
        if (this.l != null) {
            this.l.a(qnVar);
        }
    }

    public void a(qp qpVar) {
        if (this.f.j.j != null) {
            v.i().r().a(this.f.i, this.f.j, qpVar);
        }
    }

    public void a(qr qrVar) {
        c.b("setNativeAdOptions must be called on the main UI thread.");
        this.f.w = qrVar;
    }

    public void a(re reVar) {
        c.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.f.s = reVar;
    }

    public void a(rf rfVar) {
        c.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.f.t = rfVar;
    }

    public void a(uv uvVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void a(final a aVar, qa qaVar) {
        if (aVar.d != null) {
            this.f.i = aVar.d;
        }
        if (aVar.e != -2) {
            zi.a.post(new Runnable(this) {
                final /* synthetic */ r b;

                public void run() {
                    this.b.b(new yu(aVar, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f.E = 0;
        this.f.h = v.d().a(this.f.c, this, aVar, this.f.d, null, this.j, this, qaVar);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(this.f.h.getClass().getName());
        zy.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void a(List<String> list) {
        c.b("setNativeTemplates must be called on the main UI thread.");
        this.f.A = list;
    }

    protected boolean a(ns nsVar, yu yuVar, boolean z) {
        return this.e.d();
    }

    protected boolean a(yu yuVar, yu yuVar2) {
        a(null);
        if (this.f.e()) {
            if (yuVar2.n) {
                try {
                    tr h = yuVar2.p != null ? yuVar2.p.h() : null;
                    ts i = yuVar2.p != null ? yuVar2.p.i() : null;
                    if (h == null || this.f.s == null) {
                        if (i != null) {
                            if (this.f.t != null) {
                                ql a = a(i);
                                a.a(new qo(this.f.c, this, this.f.d, i, (qp.a) a));
                                a(a);
                            }
                        }
                        zy.e("No matching mapper/listener for retrieved native ad template.");
                        a(0);
                        return false;
                    }
                    qk a2 = a(h);
                    a2.a(new qo(this.f.c, this, this.f.d, h, (qp.a) a2));
                    a(a2);
                } catch (Throwable e) {
                    zy.c("Failed to get native ad mapper", e);
                }
            } else {
                qp.a aVar = yuVar2.E;
                if ((aVar instanceof ql) && this.f.t != null) {
                    a((ql) yuVar2.E);
                } else if ((aVar instanceof qk) && this.f.s != null) {
                    a((qk) yuVar2.E);
                } else if (!(aVar instanceof qm) || this.f.v == null || this.f.v.get(((qm) aVar).l()) == null) {
                    zy.e("No matching listener for retrieved native ad template.");
                    a(0);
                    return false;
                } else {
                    a(yuVar2, ((qm) aVar).l());
                }
            }
            return super.a(yuVar, yuVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public void b(k<String, rg> kVar) {
        c.b("setOnCustomClickListener must be called on the main UI thread.");
        this.f.u = kVar;
    }

    public rg c(String str) {
        c.b("getOnCustomClickListener must be called on the main UI thread.");
        return (rg) this.f.u.get(str);
    }

    public void n() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void o() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }
}
