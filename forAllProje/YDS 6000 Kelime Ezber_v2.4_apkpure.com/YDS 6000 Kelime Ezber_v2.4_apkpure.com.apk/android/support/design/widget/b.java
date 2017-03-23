package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.R;
import android.support.v4.view.ah;
import android.support.v4.view.bd;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

public abstract class b<B extends b<B>> {
    static final Handler a = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((b) message.obj).b();
                    return true;
                case 1:
                    ((b) message.obj).b(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });
    final f b;
    final a c;
    private final ViewGroup d;
    private final c e;
    private List<a<B>> f;
    private final AccessibilityManager g;

    public interface c {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    static class f extends FrameLayout {
        private e a;
        private d b;

        f(Context context) {
            this(context, null);
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                ah.f(this, (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.b != null) {
                this.b.a(this);
            }
            ah.w(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.b != null) {
                this.b.b(this);
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.a != null) {
                this.a.a(this, i, i2, i3, i4);
            }
        }

        void setOnAttachStateChangeListener(d dVar) {
            this.b = dVar;
        }

        void setOnLayoutChangeListener(e eVar) {
            this.a = eVar;
        }
    }

    interface d {
        void a(View view);

        void b(View view);
    }

    interface e {
        void a(View view, int i, int i2, int i3, int i4);
    }

    public static abstract class a<B> {
        public void a(B b) {
        }

        public void a(B b, int i) {
        }
    }

    final class b extends SwipeDismissBehavior<f> {
        final /* synthetic */ b a;

        b(b bVar) {
            this.a = bVar;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, f fVar, MotionEvent motionEvent) {
            if (coordinatorLayout.a((View) fVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        o.a().c(this.a.c);
                        break;
                    case 1:
                    case 3:
                        o.a().d(this.a.c);
                        break;
                }
            }
            return super.a(coordinatorLayout, (View) fVar, motionEvent);
        }

        public boolean a(View view) {
            return view instanceof f;
        }
    }

    private void d(final int i) {
        if (VERSION.SDK_INT >= 14) {
            ah.s(this.b).c((float) this.b.getHeight()).a(a.b).a(250).a(new bd(this) {
                final /* synthetic */ b b;

                public void a(View view) {
                    this.b.e.b(0, 180);
                }

                public void b(View view) {
                    this.b.c(i);
                }
            }).c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.design_snackbar_out);
        loadAnimation.setInterpolator(a.b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ b b;

            public void onAnimationEnd(Animation animation) {
                this.b.c(i);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.b.startAnimation(loadAnimation);
    }

    void a(int i) {
        o.a().a(this.c, i);
    }

    public boolean a() {
        return o.a().e(this.c);
    }

    final void b() {
        if (this.b.getParent() == null) {
            LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams instanceof android.support.design.widget.CoordinatorLayout.d) {
                android.support.design.widget.CoordinatorLayout.d dVar = (android.support.design.widget.CoordinatorLayout.d) layoutParams;
                android.support.design.widget.CoordinatorLayout.a bVar = new b(this);
                bVar.a(0.1f);
                bVar.b(0.6f);
                bVar.a(0);
                bVar.a(new android.support.design.widget.SwipeDismissBehavior.a(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void a(int i) {
                        switch (i) {
                            case 0:
                                o.a().d(this.a.c);
                                return;
                            case 1:
                            case 2:
                                o.a().c(this.a.c);
                                return;
                            default:
                                return;
                        }
                    }

                    public void a(View view) {
                        view.setVisibility(8);
                        this.a.a(0);
                    }
                });
                dVar.a(bVar);
                dVar.g = 80;
            }
            this.d.addView(this.b);
        }
        this.b.setOnAttachStateChangeListener(new d(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(View view) {
            }

            public void b(View view) {
                if (this.a.a()) {
                    b.a.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass4 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.a.c(3);
                        }
                    });
                }
            }
        });
        if (!ah.E(this.b)) {
            this.b.setOnLayoutChangeListener(new e(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(View view, int i, int i2, int i3, int i4) {
                    this.a.b.setOnLayoutChangeListener(null);
                    if (this.a.e()) {
                        this.a.c();
                    } else {
                        this.a.d();
                    }
                }
            });
        } else if (e()) {
            c();
        } else {
            d();
        }
    }

    final void b(int i) {
        if (e() && this.b.getVisibility() == 0) {
            d(i);
        } else {
            c(i);
        }
    }

    void c() {
        if (VERSION.SDK_INT >= 14) {
            ah.b(this.b, (float) this.b.getHeight());
            ah.s(this.b).c(0.0f).a(a.b).a(250).a(new bd(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(View view) {
                    this.a.e.a(70, 180);
                }

                public void b(View view) {
                    this.a.d();
                }
            }).c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.design_snackbar_in);
        loadAnimation.setInterpolator(a.b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.d();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.b.startAnimation(loadAnimation);
    }

    void c(int i) {
        o.a().a(this.c);
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                ((a) this.f.get(size)).a(this, i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.b.setVisibility(8);
        }
        ViewParent parent = this.b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b);
        }
    }

    void d() {
        o.a().b(this.c);
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                ((a) this.f.get(size)).a(this);
            }
        }
    }

    boolean e() {
        return !this.g.isEnabled();
    }
}
