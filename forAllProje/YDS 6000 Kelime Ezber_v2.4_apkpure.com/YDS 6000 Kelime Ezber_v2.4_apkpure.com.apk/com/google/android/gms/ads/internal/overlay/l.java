package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.b.vz;

@TargetApi(14)
@vz
public abstract class l extends TextureView implements a {
    protected final y a = new y();
    protected final c b;

    public l(Context context) {
        super(context);
        this.b = new c(context, this);
    }

    public abstract void a();

    public void a(float f) {
        this.b.a(f);
        a();
    }

    public abstract void a(float f, float f2);

    public abstract void a(int i);

    public abstract void a(k kVar);

    public abstract String b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public void f() {
        this.b.a(true);
        a();
    }

    public void g() {
        this.b.a(false);
        a();
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
