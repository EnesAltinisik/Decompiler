package android.support.v7.view;

import android.support.v4.view.az;
import android.support.v4.view.bd;
import android.support.v4.view.be;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {
    private final ArrayList<az> a = new ArrayList();
    private long b = -1;
    private Interpolator c;
    private bd d;
    private boolean e;
    private final be f = new be(this) {
        final /* synthetic */ h a;
        private boolean b = false;
        private int c = 0;

        {
            this.a = r2;
        }

        public void onAnimationStart(View view) {
            if (!this.b) {
                this.b = true;
                if (this.a.d != null) {
                    this.a.d.onAnimationStart(null);
                }
            }
        }

        void a() {
            this.c = 0;
            this.b = false;
            this.a.c();
        }

        public void onAnimationEnd(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == this.a.a.size()) {
                if (this.a.d != null) {
                    this.a.d.onAnimationEnd(null);
                }
                a();
            }
        }
    };

    public h a(az azVar) {
        if (!this.e) {
            this.a.add(azVar);
        }
        return this;
    }

    public h a(az azVar, az azVar2) {
        this.a.add(azVar);
        azVar2.b(azVar.a());
        this.a.add(azVar2);
        return this;
    }

    public void a() {
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                az azVar = (az) it.next();
                if (this.b >= 0) {
                    azVar.a(this.b);
                }
                if (this.c != null) {
                    azVar.a(this.c);
                }
                if (this.d != null) {
                    azVar.a(this.f);
                }
                azVar.c();
            }
            this.e = true;
        }
    }

    private void c() {
        this.e = false;
    }

    public void b() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((az) it.next()).b();
            }
            this.e = false;
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h a(bd bdVar) {
        if (!this.e) {
            this.d = bdVar;
        }
        return this;
    }
}
