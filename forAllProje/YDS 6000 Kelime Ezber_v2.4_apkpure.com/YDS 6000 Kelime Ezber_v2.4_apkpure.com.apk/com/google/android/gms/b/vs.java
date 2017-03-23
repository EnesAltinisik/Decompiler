package com.google.android.gms.b;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.aar.b;
import com.google.android.gms.b.yu.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@vz
public class vs {
    private final Object a = new Object();
    private final Context b;
    private final dp c;
    private final a d;
    private final qa e;
    private final r f;
    private OnGlobalLayoutListener g;
    private OnScrollChangedListener h;
    private zt i;
    private int j = -1;
    private int k = -1;

    public vs(Context context, dp dpVar, a aVar, qa qaVar, r rVar) {
        this.b = context;
        this.c = dpVar;
        this.d = aVar;
        this.e = qaVar;
        this.f = rVar;
        this.i = new zt(200);
    }

    private OnGlobalLayoutListener a(final WeakReference<aaq> weakReference) {
        if (this.g == null) {
            this.g = new OnGlobalLayoutListener(this) {
                final /* synthetic */ vs b;

                public void onGlobalLayout() {
                    this.b.a(weakReference, false);
                }
            };
        }
        return this.g;
    }

    private void a(aaq com_google_android_gms_b_aaq) {
        aar l = com_google_android_gms_b_aaq.l();
        l.a("/video", rp.n);
        l.a("/videoMeta", rp.o);
        l.a("/precache", rp.p);
        l.a("/delayPageLoaded", rp.s);
        l.a("/instrument", rp.q);
        l.a("/log", rp.i);
        l.a("/videoClicked", rp.j);
        l.a("/trackActiveViewUnit", new rq(this) {
            final /* synthetic */ vs a;

            {
                this.a = r1;
            }

            public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                this.a.f.J();
            }
        });
    }

    private void a(WeakReference<aaq> weakReference, boolean z) {
        if (weakReference != null) {
            aaq com_google_android_gms_b_aaq = (aaq) weakReference.get();
            if (com_google_android_gms_b_aaq != null && com_google_android_gms_b_aaq.b() != null) {
                if (!z || this.i.a()) {
                    int[] iArr = new int[2];
                    com_google_android_gms_b_aaq.b().getLocationOnScreen(iArr);
                    int b = oc.a().b(this.b, iArr[0]);
                    int b2 = oc.a().b(this.b, iArr[1]);
                    synchronized (this.a) {
                        if (!(this.j == b && this.k == b2)) {
                            this.j = b;
                            this.k = b2;
                            com_google_android_gms_b_aaq.l().a(this.j, this.k, !z);
                        }
                    }
                }
            }
        }
    }

    private OnScrollChangedListener b(final WeakReference<aaq> weakReference) {
        if (this.h == null) {
            this.h = new OnScrollChangedListener(this) {
                final /* synthetic */ vs b;

                public void onScrollChanged() {
                    this.b.a(weakReference, true);
                }
            };
        }
        return this.h;
    }

    public aag<aaq> a(final JSONObject jSONObject) {
        final aag com_google_android_gms_b_aad = new aad();
        v.e().a(new Runnable(this) {
            final /* synthetic */ vs c;

            public void run() {
                try {
                    final aaq a = this.c.a();
                    this.c.f.a(a);
                    WeakReference weakReference = new WeakReference(a);
                    a.l().a(this.c.a(weakReference), this.c.b(weakReference));
                    this.c.a(a);
                    a.l().a(new b(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void a(aaq com_google_android_gms_b_aaq) {
                            a.a("google.afma.nativeAds.renderVideo", jSONObject);
                        }
                    });
                    a.l().a(new aar.a(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void a(aaq com_google_android_gms_b_aaq, boolean z) {
                            this.a.c.f.M();
                            com_google_android_gms_b_aad.b((Object) com_google_android_gms_b_aaq);
                        }
                    });
                    a.loadUrl(vq.a(this.c.d, (String) pr.cc.c()));
                } catch (Throwable e) {
                    zy.c("Exception occurred while getting video view", e);
                    com_google_android_gms_b_aad.b(null);
                }
            }
        });
        return com_google_android_gms_b_aad;
    }

    aaq a() {
        return v.f().a(this.b, nx.a(this.b), false, false, this.c, this.d.a.k, this.e, null, this.f.g());
    }
}
