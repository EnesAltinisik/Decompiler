package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.sr.a;
import org.json.JSONObject;

@vz
public class st implements sr {
    private final aaq a;

    public st(Context context, aab com_google_android_gms_b_aab, dp dpVar, d dVar) {
        this.a = v.f().a(context, new nx(), false, false, dpVar, com_google_android_gms_b_aab, null, null, dVar);
        this.a.a().setWillNotDraw(true);
    }

    private void a(Runnable runnable) {
        if (oc.a().b()) {
            runnable.run();
        } else {
            zi.a.post(runnable);
        }
    }

    public void a() {
        this.a.destroy();
    }

    public void a(nn nnVar, j jVar, rm rmVar, s sVar, boolean z, rs rsVar, rv rvVar, e eVar, ul ulVar) {
        this.a.l().a(nnVar, jVar, rmVar, sVar, z, rsVar, rvVar, new e(this.a.getContext(), false), ulVar, null);
    }

    public void a(final a aVar) {
        this.a.l().a(new aar.a(this) {
            public void a(aaq com_google_android_gms_b_aaq, boolean z) {
                aVar.a();
            }
        });
    }

    public void a(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str});
        a(new Runnable(this) {
            final /* synthetic */ st b;

            public void run() {
                this.b.a.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    public void a(String str, rq rqVar) {
        this.a.l().a(str, rqVar);
    }

    public void a(final String str, final String str2) {
        a(new Runnable(this) {
            final /* synthetic */ st c;

            public void run() {
                this.c.a.a(str, str2);
            }
        });
    }

    public void a(final String str, final JSONObject jSONObject) {
        a(new Runnable(this) {
            final /* synthetic */ st c;

            public void run() {
                this.c.a.a(str, jSONObject);
            }
        });
    }

    public sx b() {
        return new sy(this);
    }

    public void b(final String str) {
        a(new Runnable(this) {
            final /* synthetic */ st b;

            public void run() {
                this.b.a.loadUrl(str);
            }
        });
    }

    public void b(String str, rq rqVar) {
        this.a.l().b(str, rqVar);
    }

    public void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }

    public void c(final String str) {
        a(new Runnable(this) {
            final /* synthetic */ st b;

            public void run() {
                this.b.a.loadData(str, "text/html", "UTF-8");
            }
        });
    }
}
