package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.b.bq;
import com.google.android.gms.b.dg;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zh;
import com.google.android.gms.b.zy;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@vz
class i implements bq, Runnable {
    CountDownLatch a = new CountDownLatch(1);
    private final List<Object[]> b = new Vector();
    private final AtomicReference<bq> c = new AtomicReference();
    private w d;

    public i(w wVar) {
        this.d = wVar;
        if (oc.a().b()) {
            zh.a((Runnable) this);
        } else {
            run();
        }
    }

    private Context b(Context context) {
        if (!((Boolean) pr.n.c()).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void b() {
        if (!this.b.isEmpty()) {
            for (Object[] objArr : this.b) {
                if (objArr.length == 1) {
                    ((bq) this.c.get()).a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((bq) this.c.get()).a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.b.clear();
        }
    }

    protected bq a(String str, Context context, boolean z) {
        return dg.a(str, context, z);
    }

    public String a(Context context) {
        return a(context, null);
    }

    public String a(Context context, String str, View view) {
        if (a()) {
            bq bqVar = (bq) this.c.get();
            if (bqVar != null) {
                b();
                return bqVar.a(b(context), str, view);
            }
        }
        return "";
    }

    public String a(Context context, byte[] bArr) {
        if (a()) {
            bq bqVar = (bq) this.c.get();
            if (bqVar != null) {
                b();
                return bqVar.a(b(context));
            }
        }
        return "";
    }

    public void a(int i, int i2, int i3) {
        bq bqVar = (bq) this.c.get();
        if (bqVar != null) {
            b();
            bqVar.a(i, i2, i3);
            return;
        }
        this.b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public void a(MotionEvent motionEvent) {
        bq bqVar = (bq) this.c.get();
        if (bqVar != null) {
            b();
            bqVar.a(motionEvent);
            return;
        }
        this.b.add(new Object[]{motionEvent});
    }

    protected void a(bq bqVar) {
        this.c.set(bqVar);
    }

    protected boolean a() {
        try {
            this.a.await();
            return true;
        } catch (Throwable e) {
            zy.c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public void run() {
        try {
            boolean z = !((Boolean) pr.J.c()).booleanValue() || this.d.e.e;
            a(a(this.d.e.b, b(this.d.c), z));
        } finally {
            this.a.countDown();
            this.d = null;
        }
    }
}
