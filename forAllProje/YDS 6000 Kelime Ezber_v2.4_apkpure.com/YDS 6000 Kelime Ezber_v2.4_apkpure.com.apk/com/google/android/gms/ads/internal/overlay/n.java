package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.ze;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.l;
import java.util.HashMap;
import java.util.Map;

@vz
public class n extends FrameLayout implements k {
    private final aaq a;
    private final FrameLayout b;
    private final qa c;
    private final b d;
    private final long e;
    private l f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private String m;
    private Bitmap n;
    private ImageView o;
    private boolean p;

    public n(Context context, aaq com_google_android_gms_b_aaq, int i, boolean z, qa qaVar) {
        super(context);
        this.a = com_google_android_gms_b_aaq;
        this.c = qaVar;
        this.b = new FrameLayout(context);
        addView(this.b, new LayoutParams(-1, -1));
        l.a(com_google_android_gms_b_aaq.h());
        this.f = com_google_android_gms_b_aaq.h().b.a(context, com_google_android_gms_b_aaq, i, z, qaVar);
        if (this.f != null) {
            this.b.addView(this.f, new LayoutParams(-1, -1, 17));
            if (((Boolean) pr.B.c()).booleanValue()) {
                m();
            }
        }
        this.o = new ImageView(context);
        this.e = ((Long) pr.F.c()).longValue();
        this.j = ((Boolean) pr.D.c()).booleanValue();
        if (this.c != null) {
            this.c.a("spinner_used", this.j ? "1" : "0");
        }
        this.d = new b(this);
        this.d.b();
        if (this.f != null) {
            this.f.a((k) this);
        }
        if (this.f == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(aaq com_google_android_gms_b_aaq) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        com_google_android_gms_b_aaq.a("onVideoEvent", hashMap);
    }

    private void a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.a.a("onVideoEvent", hashMap);
    }

    private void b(int i, int i2) {
        if (this.j) {
            int max = Math.max(i / ((Integer) pr.E.c()).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) pr.E.c()).intValue(), 1);
            if (this.n == null || this.n.getWidth() != max || this.n.getHeight() != max2) {
                this.n = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.p = false;
            }
        }
    }

    @TargetApi(14)
    private void p() {
        if (this.n != null) {
            long b = v.k().b();
            if (this.f.getBitmap(this.n) != null) {
                this.p = true;
            }
            b = v.k().b() - b;
            if (ze.b()) {
                ze.a("Spinner frame grab took " + b + "ms");
            }
            if (b > this.e) {
                zy.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.j = false;
                this.n = null;
                if (this.c != null) {
                    this.c.a("spinner_jank", Long.toString(b));
                }
            }
        }
    }

    private void q() {
        if (this.p && this.n != null && !s()) {
            this.o.setImageBitmap(this.n);
            this.o.invalidate();
            this.b.addView(this.o, new LayoutParams(-1, -1));
            this.b.bringChildToFront(this.o);
        }
    }

    private void r() {
        if (s()) {
            this.b.removeView(this.o);
        }
    }

    private boolean s() {
        return this.o.getParent() != null;
    }

    private void t() {
        if (this.a.f() != null && !this.h) {
            this.i = (this.a.f().getWindow().getAttributes().flags & 128) != 0;
            if (!this.i) {
                this.a.f().getWindow().addFlags(128);
                this.h = true;
            }
        }
    }

    private void u() {
        if (this.a.f() != null && this.h && !this.i) {
            this.a.f().getWindow().clearFlags(128);
            this.h = false;
        }
    }

    public void a() {
        zi.a.post(new Runnable(this) {
            final /* synthetic */ n a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a("surfaceCreated", new String[0]);
            }
        });
    }

    public void a(float f) {
        if (this.f != null) {
            this.f.a(f);
        }
    }

    public void a(float f, float f2) {
        if (this.f != null) {
            this.f.a(f, f2);
        }
    }

    public void a(int i) {
        if (this.f != null) {
            this.f.a(i);
        }
    }

    public void a(int i, int i2) {
        b(i, i2);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public void a(MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.dispatchTouchEvent(motionEvent);
        }
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(String str, String str2) {
        a("error", "what", str, "extra", str2);
    }

    public void b() {
        if (this.f != null && this.l == 0) {
            float duration = ((float) this.f.getDuration()) / 1000.0f;
            int videoWidth = this.f.getVideoWidth();
            int videoHeight = this.f.getVideoHeight();
            a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public void c() {
        t();
        this.g = true;
    }

    public void d() {
        a("pause", new String[0]);
        u();
        this.g = false;
    }

    public void e() {
        a("ended", new String[0]);
        u();
    }

    public void f() {
        q();
        this.l = this.k;
        zi.a.post(new Runnable(this) {
            final /* synthetic */ n a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a("surfaceDestroyed", new String[0]);
            }
        });
    }

    public void g() {
        if (this.g) {
            r();
        }
        p();
    }

    public void h() {
        if (this.f != null) {
            if (TextUtils.isEmpty(this.m)) {
                a("no_src", new String[0]);
            } else {
                this.f.setVideoPath(this.m);
            }
        }
    }

    public void i() {
        if (this.f != null) {
            this.f.e();
        }
    }

    public void j() {
        if (this.f != null) {
            this.f.d();
        }
    }

    public void k() {
        if (this.f != null) {
            this.f.f();
        }
    }

    public void l() {
        if (this.f != null) {
            this.f.g();
        }
    }

    @TargetApi(14)
    public void m() {
        if (this.f != null) {
            View textView = new TextView(this.f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f.b());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.b.addView(textView, new LayoutParams(-2, -2, 17));
            this.b.bringChildToFront(textView);
        }
    }

    public void n() {
        this.d.a();
        if (this.f != null) {
            this.f.c();
        }
        u();
    }

    void o() {
        if (this.f != null) {
            long currentPosition = (long) this.f.getCurrentPosition();
            if (this.k != currentPosition && currentPosition > 0) {
                float f = ((float) currentPosition) / 1000.0f;
                a("timeupdate", "time", String.valueOf(f));
                this.k = currentPosition;
            }
        }
    }
}
