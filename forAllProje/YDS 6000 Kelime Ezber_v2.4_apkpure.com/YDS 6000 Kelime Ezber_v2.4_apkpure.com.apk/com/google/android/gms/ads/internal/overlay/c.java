package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.gms.b.vz;

@TargetApi(14)
@vz
public class c implements OnAudioFocusChangeListener {
    private final AudioManager a;
    private final a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    interface a {
        void a();
    }

    public c(Context context, a aVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = aVar;
    }

    private void d() {
        Object obj = (!this.d || this.e || this.f <= 0.0f) ? null : 1;
        if (obj != null && !this.c) {
            e();
            this.b.a();
        } else if (obj == null && this.c) {
            f();
            this.b.a();
        }
    }

    private void e() {
        boolean z = true;
        if (this.a != null && !this.c) {
            if (this.a.requestAudioFocus(this, 3, 2) != 1) {
                z = false;
            }
            this.c = z;
        }
    }

    private void f() {
        if (this.a != null && this.c) {
            this.c = this.a.abandonAudioFocus(this) == 0;
        }
    }

    public float a() {
        return this.c ? this.e ? 0.0f : this.f : 0.0f;
    }

    public void a(float f) {
        this.f = f;
        d();
    }

    public void a(boolean z) {
        this.e = z;
        d();
    }

    public void b() {
        this.d = true;
        d();
    }

    public void c() {
        this.d = false;
        d();
    }

    public void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.a();
    }
}
