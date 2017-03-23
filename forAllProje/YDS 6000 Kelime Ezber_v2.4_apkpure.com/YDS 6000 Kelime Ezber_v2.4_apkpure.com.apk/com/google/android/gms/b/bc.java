package com.google.android.gms.b;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.b.av.a;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

public class bc {
    protected static volatile abo a = null;
    private static final ConditionVariable d = new ConditionVariable();
    private static volatile Random e = null;
    protected Boolean b;
    private eq c;

    public bc(eq eqVar) {
        this.c = eqVar;
        a(eqVar.c());
    }

    private void a(Executor executor) {
        executor.execute(new Runnable(this) {
            final /* synthetic */ bc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.b == null) {
                    synchronized (bc.d) {
                        if (this.a.b != null) {
                            return;
                        }
                        boolean booleanValue = ((Boolean) pr.bp.c()).booleanValue();
                        if (booleanValue) {
                            bc.a = new abo(this.a.c.a(), "ADSHIELD", null);
                        }
                        this.a.b = Boolean.valueOf(booleanValue);
                        bc.d.open();
                    }
                }
            }
        });
    }

    private static Random c() {
        if (e == null) {
            synchronized (bc.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public int a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException e) {
            return c().nextInt();
        }
    }

    public void a(int i, int i2, long j) {
        try {
            d.block();
            if (this.b.booleanValue() && a != null && this.c.i()) {
                ln aVar = new a();
                aVar.a = this.c.a().getPackageName();
                aVar.b = Long.valueOf(j);
                abo.a a = a.a(ln.a(aVar));
                a.b(i2);
                a.a(i);
                a.a(this.c.g());
            }
        } catch (Exception e) {
        }
    }
}
