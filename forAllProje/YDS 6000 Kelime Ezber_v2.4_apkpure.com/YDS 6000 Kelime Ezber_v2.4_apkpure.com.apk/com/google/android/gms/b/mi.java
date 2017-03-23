package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import com.google.android.gms.b.mj.a;
import com.google.android.gms.b.mj.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@vz
public class mi implements mk {
    private final Object a = new Object();
    private final WeakHashMap<yu, mj> b = new WeakHashMap();
    private final ArrayList<mj> c = new ArrayList();
    private final Context d;
    private final aab e;
    private final sv f;

    public mi(Context context, aab com_google_android_gms_b_aab, sv svVar) {
        this.d = context.getApplicationContext();
        this.e = com_google_android_gms_b_aab;
        this.f = svVar;
    }

    public void a(mj mjVar) {
        synchronized (this.a) {
            if (!mjVar.f()) {
                this.c.remove(mjVar);
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == mjVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void a(nx nxVar, yu yuVar) {
        a(nxVar, yuVar, yuVar.b.b());
    }

    public void a(nx nxVar, yu yuVar, View view) {
        a(nxVar, yuVar, new d(view, yuVar), null);
    }

    public void a(nx nxVar, yu yuVar, View view, sw swVar) {
        a(nxVar, yuVar, new d(view, yuVar), swVar);
    }

    public void a(nx nxVar, yu yuVar, mq mqVar, sw swVar) {
        synchronized (this.a) {
            mj mjVar;
            if (a(yuVar)) {
                mjVar = (mj) this.b.get(yuVar);
            } else {
                mjVar = new mj(this.d, nxVar, yuVar, this.e, mqVar);
                mjVar.a((mk) this);
                this.b.put(yuVar, mjVar);
                this.c.add(mjVar);
            }
            if (swVar != null) {
                mjVar.a(new ml(mjVar, swVar));
            } else {
                mjVar.a(new mm(mjVar, this.f));
            }
        }
    }

    public void a(nx nxVar, yu yuVar, qp qpVar) {
        a(nxVar, yuVar, new a(qpVar), null);
    }

    public boolean a(yu yuVar) {
        boolean z;
        synchronized (this.a) {
            mj mjVar = (mj) this.b.get(yuVar);
            z = mjVar != null && mjVar.f();
        }
        return z;
    }

    public void b(yu yuVar) {
        synchronized (this.a) {
            mj mjVar = (mj) this.b.get(yuVar);
            if (mjVar != null) {
                mjVar.d();
            }
        }
    }

    public void c(yu yuVar) {
        synchronized (this.a) {
            mj mjVar = (mj) this.b.get(yuVar);
            if (mjVar != null) {
                mjVar.o();
            }
        }
    }

    public void d(yu yuVar) {
        synchronized (this.a) {
            mj mjVar = (mj) this.b.get(yuVar);
            if (mjVar != null) {
                mjVar.p();
            }
        }
    }

    public void e(yu yuVar) {
        synchronized (this.a) {
            mj mjVar = (mj) this.b.get(yuVar);
            if (mjVar != null) {
                mjVar.q();
            }
        }
    }
}
