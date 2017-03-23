package com.google.android.gms.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.v;

@vz
public class vh implements Runnable {
    protected final aaq a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private com.google.android.gms.b.aar.a g;
    private final int h;
    private final int i;

    protected final class a extends AsyncTask<Void, Void, Boolean> {
        final /* synthetic */ vh a;
        private final WebView b;
        private Bitmap c;

        public a(vh vhVar, WebView webView) {
            this.a = vhVar;
            this.b = webView;
        }

        protected synchronized Boolean a(Void... voidArr) {
            Boolean valueOf;
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            if (width == 0 || height == 0) {
                valueOf = Boolean.valueOf(false);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < width; i2 += 10) {
                    for (int i3 = 0; i3 < height; i3 += 10) {
                        if (this.c.getPixel(i2, i3) != 0) {
                            i++;
                        }
                    }
                }
                valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
            }
            return valueOf;
        }

        protected void a(Boolean bool) {
            vh.c(this.a);
            if (bool.booleanValue() || this.a.c() || this.a.f <= 0) {
                this.a.c = bool.booleanValue();
                this.a.g.a(this.a.a, true);
            } else if (this.a.f > 0) {
                if (zy.a(2)) {
                    zy.b("Ad not detected, scheduling another run.");
                }
                this.a.d.postDelayed(this.a, this.a.e);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Boolean) obj);
        }

        protected synchronized void onPreExecute() {
            this.c = Bitmap.createBitmap(this.a.i, this.a.h, Config.ARGB_8888);
            this.b.setVisibility(0);
            this.b.measure(MeasureSpec.makeMeasureSpec(this.a.i, 0), MeasureSpec.makeMeasureSpec(this.a.h, 0));
            this.b.layout(0, 0, this.a.i, this.a.h);
            this.b.draw(new Canvas(this.c));
            this.b.invalidate();
        }
    }

    public vh(com.google.android.gms.b.aar.a aVar, aaq com_google_android_gms_b_aaq, int i, int i2) {
        this(aVar, com_google_android_gms_b_aaq, i, i2, 200, 50);
    }

    public vh(com.google.android.gms.b.aar.a aVar, aaq com_google_android_gms_b_aaq, int i, int i2, long j, long j2) {
        this.e = j;
        this.f = j2;
        this.d = new Handler(Looper.getMainLooper());
        this.a = com_google_android_gms_b_aaq;
        this.g = aVar;
        this.b = false;
        this.c = false;
        this.h = i2;
        this.i = i;
    }

    static /* synthetic */ long c(vh vhVar) {
        long j = vhVar.f - 1;
        vhVar.f = j;
        return j;
    }

    public void a() {
        this.d.postDelayed(this, this.e);
    }

    public void a(wi wiVar) {
        a(wiVar, new abc(this, this.a, wiVar.q));
    }

    public void a(wi wiVar, abc com_google_android_gms_b_abc) {
        this.a.setWebViewClient(com_google_android_gms_b_abc);
        this.a.loadDataWithBaseURL(TextUtils.isEmpty(wiVar.b) ? null : v.e().a(wiVar.b), wiVar.c, "text/html", "UTF-8", null);
    }

    public synchronized void b() {
        this.b = true;
    }

    public synchronized boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public void run() {
        if (this.a == null || c()) {
            this.g.a(this.a, true);
        } else {
            new a(this, this.a.a()).execute(new Void[0]);
        }
    }
}
