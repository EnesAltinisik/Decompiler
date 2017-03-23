package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.b.qp.a;
import com.google.android.gms.common.internal.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@vz
public class qo extends qq {
    private tr b;
    private ts c;
    private final r d;
    private qp e;
    private boolean f;
    private Object g;

    private qo(Context context, r rVar, dp dpVar, a aVar) {
        super(context, rVar, null, dpVar, null, aVar, null, null);
        this.f = false;
        this.g = new Object();
        this.d = rVar;
    }

    public qo(Context context, r rVar, dp dpVar, tr trVar, a aVar) {
        this(context, rVar, dpVar, aVar);
        this.b = trVar;
    }

    public qo(Context context, r rVar, dp dpVar, ts tsVar, a aVar) {
        this(context, rVar, dpVar, aVar);
        this.c = tsVar;
    }

    public qi a(OnClickListener onClickListener) {
        return null;
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        c.b("recordImpression must be called on the main UI thread.");
        synchronized (this.g) {
            a(true);
            if (this.e != null) {
                this.e.a(view, map);
                this.d.E();
            } else {
                try {
                    if (this.b != null && !this.b.j()) {
                        this.b.i();
                        this.d.E();
                    } else if (!(this.c == null || this.c.h())) {
                        this.c.g();
                        this.d.E();
                    }
                } catch (Throwable e) {
                    zy.c("Failed to call recordImpression", e);
                }
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.g) {
            this.f = true;
            try {
                if (this.b != null) {
                    this.b.b(b.a((Object) view));
                } else if (this.c != null) {
                    this.c.b(b.a((Object) view));
                }
            } catch (Throwable e) {
                zy.c("Failed to call prepareAd", e);
            }
            this.f = false;
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, View view2) {
        c.b("performClick must be called on the main UI thread.");
        synchronized (this.g) {
            if (this.e != null) {
                this.e.a(view, map, jSONObject, view2);
                this.d.e();
            } else {
                try {
                    if (!(this.b == null || this.b.k())) {
                        this.b.a(b.a((Object) view));
                        this.d.e();
                    }
                    if (!(this.c == null || this.c.i())) {
                        this.c.a(b.a((Object) view));
                        this.d.e();
                    }
                } catch (Throwable e) {
                    zy.c("Failed to call performClick", e);
                }
            }
        }
    }

    public void a(qp qpVar) {
        synchronized (this.g) {
            this.e = qpVar;
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    public qp b() {
        qp qpVar;
        synchronized (this.g) {
            qpVar = this.e;
        }
        return qpVar;
    }

    public void b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.g) {
            try {
                if (this.b != null) {
                    this.b.c(b.a((Object) view));
                } else if (this.c != null) {
                    this.c.c(b.a((Object) view));
                }
            } catch (Throwable e) {
                zy.c("Failed to call untrackView", e);
            }
        }
    }

    public aaq c() {
        return null;
    }
}
