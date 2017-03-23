package com.google.android.gms.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.b.au.a;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class br implements bq {
    protected MotionEvent a;
    protected LinkedList<MotionEvent> b = new LinkedList();
    protected long c = 0;
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected boolean j = false;
    protected DisplayMetrics k;
    private boolean l = false;

    protected br(Context context) {
        try {
            ba.a();
            this.k = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    private String a(Context context, String str, boolean z, View view, byte[] bArr) {
        boolean z2 = true;
        a aVar = null;
        if (bArr != null && bArr.length > 0) {
            try {
                aVar = a.a(bArr);
            } catch (lm e) {
            }
        }
        if (z) {
            try {
                aw.a a = a(context, view);
                this.l = true;
            } catch (NoSuchAlgorithmException e2) {
                return Integer.toString(7);
            } catch (UnsupportedEncodingException e3) {
                return Integer.toString(7);
            } catch (Throwable th) {
                return Integer.toString(3);
            }
        }
        a = a(context, aVar);
        if (a == null || a.f() == 0) {
            return Integer.toString(5);
        }
        if (a(z)) {
            z2 = false;
        }
        return ba.a(a, str, z2);
    }

    private static boolean a(er erVar) {
        return (erVar == null || erVar.d == null || erVar.g == null) ? false : true;
    }

    private static boolean a(boolean z) {
        return !((Boolean) pr.bs.c()).booleanValue() ? true : ((Boolean) pr.bN.c()).booleanValue() && z;
    }

    private boolean b(er erVar) {
        return (this.k == null || erVar == null || erVar.e == null || erVar.h == null) ? false : true;
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract aw.a a(Context context, View view);

    protected abstract aw.a a(Context context, a aVar);

    public String a(Context context) {
        if (!es.b() || !((Boolean) pr.bM.c()).booleanValue()) {
            return a(context, null, false, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public String a(Context context, String str) {
        return a(context, str, null);
    }

    public String a(Context context, String str, View view) {
        return a(context, str, true, view, null);
    }

    public String a(Context context, byte[] bArr) {
        if (!es.b() || !((Boolean) pr.bM.c()).booleanValue()) {
            return a(context, null, false, null, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public void a(int i, int i2, int i3) {
        if (this.a != null) {
            this.a.recycle();
        }
        if (this.k != null) {
            this.a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.k.density, ((float) i2) * this.k.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.a = null;
        }
        this.j = false;
    }

    public void a(MotionEvent motionEvent) {
        if (this.l) {
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.g = 0;
            this.i = 0;
            this.h = 0;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.b.clear();
            this.a = null;
            this.l = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.c++;
                break;
            case 1:
                this.a = MotionEvent.obtain(motionEvent);
                this.b.add(this.a);
                if (this.b.size() > 6) {
                    ((MotionEvent) this.b.remove()).recycle();
                }
                this.e++;
                try {
                    this.g = a(new Throwable().getStackTrace());
                    break;
                } catch (em e) {
                    break;
                }
            case 2:
                this.d += (long) (motionEvent.getHistorySize() + 1);
                if (((Boolean) pr.bA.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
                    try {
                        er b = b(motionEvent);
                        if (a(b)) {
                            this.h += b.d.longValue() + b.g.longValue();
                        }
                        if (b(b)) {
                            this.i = (b.h.longValue() + b.e.longValue()) + this.i;
                            break;
                        }
                    } catch (em e2) {
                        break;
                    }
                }
                break;
            case 3:
                this.f++;
                break;
        }
        this.j = true;
    }

    protected abstract er b(MotionEvent motionEvent);
}
