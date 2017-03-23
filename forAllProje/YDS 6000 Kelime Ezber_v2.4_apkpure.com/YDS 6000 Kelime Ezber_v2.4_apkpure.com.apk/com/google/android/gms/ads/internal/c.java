package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.qb;
import com.google.android.gms.b.qd;
import com.google.android.gms.b.qe;
import com.google.android.gms.b.rq;
import com.google.android.gms.b.sw;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.ul;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yo;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.yu.a;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import java.util.Map;

@vz
public abstract class c extends b implements h, ul {
    public c(Context context, nx nxVar, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        super(context, nxVar, str, tnVar, com_google_android_gms_b_aab, dVar);
    }

    public void J() {
        e();
    }

    public void K() {
        E();
        m();
    }

    public void L() {
        s();
    }

    protected aaq a(a aVar, e eVar, yo yoVar) {
        aaq com_google_android_gms_b_aaq = null;
        View nextView = this.f.f.getNextView();
        if (nextView instanceof aaq) {
            com_google_android_gms_b_aaq = (aaq) nextView;
            if (((Boolean) pr.ax.c()).booleanValue()) {
                zy.b("Reusing webview...");
                com_google_android_gms_b_aaq.a(this.f.c, this.f.i, this.a);
            } else {
                com_google_android_gms_b_aaq.destroy();
                com_google_android_gms_b_aaq = null;
            }
        }
        if (com_google_android_gms_b_aaq == null) {
            if (nextView != null) {
                this.f.f.removeView(nextView);
            }
            com_google_android_gms_b_aaq = v.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
            if (this.f.i.h == null) {
                a(com_google_android_gms_b_aaq.b());
            }
        }
        sw swVar = com_google_android_gms_b_aaq;
        swVar.l().a(this, this, this, this, false, this, null, eVar, this, yoVar);
        a(swVar);
        swVar.b(aVar.a.w);
        return swVar;
    }

    public void a(int i, int i2, int i3, int i4) {
        u();
    }

    public void a(qe qeVar) {
        com.google.android.gms.common.internal.c.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f.y = qeVar;
    }

    protected void a(sw swVar) {
        swVar.a("/trackActiveViewUnit", new rq(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                if (this.a.f.j != null) {
                    this.a.h.a(this.a.f.i, this.a.f.j, com_google_android_gms_b_aaq.b(), (sw) com_google_android_gms_b_aaq);
                } else {
                    zy.e("Request to enable ActiveView before adState is available.");
                }
            }
        });
    }

    protected void a(final a aVar, final qa qaVar) {
        if (aVar.e != -2) {
            zi.a.post(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.b(new yu(aVar, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (aVar.d != null) {
            this.f.i = aVar.d;
        }
        if (!aVar.b.h || aVar.b.B) {
            zi.a.post(new Runnable(this, null) {
                final /* synthetic */ c d;

                public void run() {
                    if (aVar.b.s && this.d.f.y != null) {
                        String str = null;
                        if (aVar.b.b != null) {
                            str = v.e().a(aVar.b.b);
                        }
                        qd qbVar = new qb(this.d, str, aVar.b.c);
                        this.d.f.E = 1;
                        try {
                            this.d.d = false;
                            this.d.f.y.a(qbVar);
                            return;
                        } catch (Throwable e) {
                            zy.c("Could not call the onCustomRenderedAdLoadedListener.", e);
                            this.d.d = true;
                        }
                    }
                    final e eVar = new e(this.d.f.c, aVar);
                    aaq a = this.d.a(aVar, eVar, null);
                    a.setOnTouchListener(new OnTouchListener(this) {
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            eVar.a();
                            return false;
                        }
                    });
                    a.setOnClickListener(new OnClickListener(this) {
                        public void onClick(View view) {
                            eVar.a();
                        }
                    });
                    this.d.f.E = 0;
                    this.d.f.h = v.d().a(this.d.f.c, this.d, aVar, this.d.f.d, a, this.d.j, this.d, qaVar);
                }
            });
            return;
        }
        this.f.E = 0;
        this.f.h = v.d().a(this.f.c, this, aVar, this.f.d, null, this.j, this, qaVar);
    }

    protected boolean a(yu yuVar, yu yuVar2) {
        if (this.f.e() && this.f.f != null) {
            this.f.f.a().b(yuVar2.C);
        }
        return super.a(yuVar, yuVar2);
    }

    public void b(View view) {
        this.f.D = view;
        b(new yu(this.f.k, null, null, null, null, null, null, null));
    }
}
