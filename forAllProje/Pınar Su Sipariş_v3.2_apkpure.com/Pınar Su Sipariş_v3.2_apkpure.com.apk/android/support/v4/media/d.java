package android.support.v4.media;

import android.os.Build.VERSION;

/* compiled from: VolumeProviderCompat */
public abstract class d {
    private final int a;
    private final int b;
    private int c;
    private a d;
    private Object e;

    /* compiled from: VolumeProviderCompat */
    public static abstract class a {
        public abstract void a(d dVar);
    }

    public d(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a(int i) {
        this.c = i;
        Object a = a();
        if (a != null) {
            e.a(a, i);
        }
        if (this.d != null) {
            this.d.a(this);
        }
    }

    public void b(int i) {
    }

    public void c(int i) {
    }

    public Object a() {
        if (this.e != null || VERSION.SDK_INT < 21) {
            return this.e;
        }
        this.e = e.a(this.a, this.b, this.c, new android.support.v4.media.e.a(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.b(i);
            }

            public void b(int i) {
                this.a.c(i);
            }
        });
        return this.e;
    }
}
