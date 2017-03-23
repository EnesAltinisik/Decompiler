package android.support.design.widget;

import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
final class o {
    private final ArrayList<a> a = new ArrayList();
    private a b = null;
    private Animation c = null;
    private WeakReference<View> d;
    private AnimationListener e = new AnimationListener(this) {
        final /* synthetic */ o a;

        {
            this.a = r1;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.a.c == animation) {
                this.a.c = null;
            }
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    };

    /* compiled from: StateListAnimator */
    static class a {
        final int[] a;
        final Animation b;

        private a(int[] iArr, Animation animation) {
            this.a = iArr;
            this.b = animation;
        }
    }

    o() {
    }

    public void a(int[] iArr, Animation animation) {
        a aVar = new a(iArr, animation);
        animation.setAnimationListener(this.e);
        this.a.add(aVar);
    }

    View a() {
        return this.d == null ? null : (View) this.d.get();
    }

    void a(View view) {
        View a = a();
        if (a != view) {
            if (a != null) {
                c();
            }
            if (view != null) {
                this.d = new WeakReference(view);
            }
        }
    }

    private void c() {
        View a = a();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (a.getAnimation() == ((a) this.a.get(i)).b) {
                a.clearAnimation();
            }
        }
        this.d = null;
        this.b = null;
        this.c = null;
    }

    void a(int[] iArr) {
        a aVar = null;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar2 = (a) this.a.get(i);
            if (StateSet.stateSetMatches(aVar2.a, iArr)) {
                aVar = aVar2;
                break;
            }
        }
        if (aVar != this.b) {
            if (this.b != null) {
                d();
            }
            this.b = aVar;
            View view = (View) this.d.get();
            if (aVar != null && view != null && view.getVisibility() == 0) {
                a(aVar);
            }
        }
    }

    private void a(a aVar) {
        this.c = aVar.b;
        View a = a();
        if (a != null) {
            a.startAnimation(this.c);
        }
    }

    private void d() {
        if (this.c != null) {
            View a = a();
            if (a != null && a.getAnimation() == this.c) {
                a.clearAnimation();
            }
            this.c = null;
        }
    }

    public void b() {
        if (this.c != null) {
            View a = a();
            if (a != null && a.getAnimation() == this.c) {
                a.clearAnimation();
            }
        }
    }
}
