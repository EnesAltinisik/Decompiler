package com.google.android.gms.b;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.qx.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@vz
public class qt extends a implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    boolean a = false;
    int b;
    int c;
    private final Object d = new Object();
    private final FrameLayout e;
    private FrameLayout f;
    private Map<String, WeakReference<View>> g = new HashMap();
    private qi h;
    private qp i;

    public qt(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.e = frameLayout;
        this.f = frameLayout2;
        v.C().a(this.e, (OnGlobalLayoutListener) this);
        v.C().a(this.e, (OnScrollChangedListener) this);
        this.e.setOnTouchListener(this);
        this.e.setOnClickListener(this);
    }

    private void b(qq qqVar) {
        synchronized (this.d) {
            if (this.g == null || !this.g.containsKey("2011")) {
                qqVar.f();
                return;
            }
            final View view = (View) ((WeakReference) this.g.get("2011")).get();
            if (view instanceof FrameLayout) {
                qqVar.a(view, new qn(this) {
                    final /* synthetic */ qt b;

                    public void a() {
                        this.b.onClick(view);
                    }

                    public void a(MotionEvent motionEvent) {
                        this.b.onTouch(null, motionEvent);
                    }
                });
                return;
            }
            qqVar.f();
        }
    }

    int a(int i) {
        return oc.a().b(this.i.e(), i);
    }

    Point a(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        this.e.getLocationOnScreen(iArr);
        return new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
    }

    public com.google.android.gms.a.a a(String str) {
        Object obj = null;
        synchronized (this.d) {
            if (this.g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.g.get(str);
            if (weakReference != null) {
                View view = (View) weakReference.get();
            }
            com.google.android.gms.a.a a = b.a(obj);
            return a;
        }
    }

    qi a(qq qqVar) {
        return qqVar.a((OnClickListener) this);
    }

    public void a() {
        synchronized (this.d) {
            if (this.f != null) {
                this.f.removeAllViews();
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
        }
    }

    void a(View view) {
        if (this.i != null) {
            qp b = this.i instanceof qo ? ((qo) this.i).b() : this.i;
            if (b != null) {
                b.a(view);
            }
        }
    }

    public void a(com.google.android.gms.a.a aVar) {
        synchronized (this.d) {
            a(null);
            Object a = b.a(aVar);
            if (a instanceof qq) {
                if (this.f != null) {
                    this.f.setLayoutParams(new LayoutParams(0, 0));
                    this.e.requestLayout();
                }
                this.a = true;
                final qq qqVar = (qq) a;
                if (this.i != null && ((Boolean) pr.cf.c()).booleanValue()) {
                    this.i.b(this.e, this.g);
                }
                if ((this.i instanceof qo) && ((qo) this.i).a()) {
                    ((qo) this.i).a((qp) qqVar);
                } else {
                    this.i = qqVar;
                    if (qqVar instanceof qo) {
                        ((qo) qqVar).a(null);
                    }
                }
                if (((Boolean) pr.cf.c()).booleanValue()) {
                    this.f.setClickable(false);
                }
                this.f.removeAllViews();
                this.h = a(qqVar);
                if (this.h != null) {
                    if (this.g != null) {
                        this.g.put("1007", new WeakReference(this.h.a()));
                    }
                    this.f.addView(this.h);
                }
                qqVar.a(this.e, this.g, (OnTouchListener) this, (OnClickListener) this);
                zi.a.post(new Runnable(this) {
                    final /* synthetic */ qt b;

                    public void run() {
                        aaq c = qqVar.c();
                        if (!(c == null || this.b.f == null)) {
                            this.b.f.addView(c.b());
                        }
                        if (!(qqVar instanceof qo)) {
                            this.b.b(qqVar);
                        }
                    }
                });
                a(this.e);
                return;
            }
            zy.e("Not an instance of native engine. This is most likely a transient error");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, com.google.android.gms.a.a r6) {
        /*
        r4 = this;
        r0 = com.google.android.gms.a.b.a(r6);
        r0 = (android.view.View) r0;
        r1 = r4.d;
        monitor-enter(r1);
        r2 = r4.g;	 Catch:{ all -> 0x0018 }
        if (r2 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000e:
        return;
    L_0x000f:
        if (r0 != 0) goto L_0x001b;
    L_0x0011:
        r0 = r4.g;	 Catch:{ all -> 0x0018 }
        r0.remove(r5);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        r2 = r4.g;	 Catch:{ all -> 0x0018 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0018 }
        r3.<init>(r0);	 Catch:{ all -> 0x0018 }
        r2.put(r5, r3);	 Catch:{ all -> 0x0018 }
        r0.setOnTouchListener(r4);	 Catch:{ all -> 0x0018 }
        r2 = 1;
        r0.setClickable(r2);	 Catch:{ all -> 0x0018 }
        r0.setOnClickListener(r4);	 Catch:{ all -> 0x0018 }
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.qt.a(java.lang.String, com.google.android.gms.a.a):void");
    }

    int b() {
        return this.e.getMeasuredWidth();
    }

    int c() {
        return this.e.getMeasuredHeight();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7 = this;
        r6 = r7.d;
        monitor-enter(r6);
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0058 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new org.json.JSONObject;	 Catch:{ all -> 0x0058 }
        r3.<init>();	 Catch:{ all -> 0x0058 }
        r0 = "x";
        r1 = r7.b;	 Catch:{ JSONException -> 0x005b }
        r1 = r7.a(r1);	 Catch:{ JSONException -> 0x005b }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x005b }
        r0 = "y";
        r1 = r7.c;	 Catch:{ JSONException -> 0x005b }
        r1 = r7.a(r1);	 Catch:{ JSONException -> 0x005b }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x005b }
    L_0x0024:
        r0 = r7.h;	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x006f;
    L_0x0028:
        r0 = r7.h;	 Catch:{ all -> 0x0058 }
        r0 = r0.a();	 Catch:{ all -> 0x0058 }
        r0 = r0.equals(r8);	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x006f;
    L_0x0034:
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        r0 = r0 instanceof com.google.android.gms.b.qo;	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x0062;
    L_0x003a:
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        r0 = (com.google.android.gms.b.qo) r0;	 Catch:{ all -> 0x0058 }
        r0 = r0.b();	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x0062;
    L_0x0044:
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        r0 = (com.google.android.gms.b.qo) r0;	 Catch:{ all -> 0x0058 }
        r0 = r0.b();	 Catch:{ all -> 0x0058 }
        r2 = "1007";
        r4 = r7.g;	 Catch:{ all -> 0x0058 }
        r5 = r7.e;	 Catch:{ all -> 0x0058 }
        r1 = r8;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0058 }
    L_0x0056:
        monitor-exit(r6);	 Catch:{ all -> 0x0058 }
        goto L_0x0008;
    L_0x0058:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0058 }
        throw r0;
    L_0x005b:
        r0 = move-exception;
        r0 = "Unable to get click location";
        com.google.android.gms.b.zy.e(r0);	 Catch:{ all -> 0x0058 }
        goto L_0x0024;
    L_0x0062:
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        r2 = "1007";
        r4 = r7.g;	 Catch:{ all -> 0x0058 }
        r5 = r7.e;	 Catch:{ all -> 0x0058 }
        r1 = r8;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0058 }
        goto L_0x0056;
    L_0x006f:
        r0 = r7.i;	 Catch:{ all -> 0x0058 }
        r1 = r7.g;	 Catch:{ all -> 0x0058 }
        r2 = r7.e;	 Catch:{ all -> 0x0058 }
        r0.a(r8, r1, r3, r2);	 Catch:{ all -> 0x0058 }
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.qt.onClick(android.view.View):void");
    }

    public void onGlobalLayout() {
        synchronized (this.d) {
            if (this.a) {
                int b = b();
                int c = c();
                if (!(b == 0 || c == 0 || this.f == null)) {
                    this.f.setLayoutParams(new LayoutParams(b, c));
                    this.a = false;
                }
            }
            if (this.i != null) {
                this.i.c(this.e, this.g);
            }
        }
    }

    public void onScrollChanged() {
        synchronized (this.d) {
            if (this.i != null) {
                this.i.c(this.e, this.g);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.d) {
            if (this.i == null) {
            } else {
                Point a = a(motionEvent);
                this.b = a.x;
                this.c = a.y;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) a.x, (float) a.y);
                this.i.a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
