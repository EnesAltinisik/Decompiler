package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.a.c;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.g;
import android.support.v4.view.ah;
import android.support.v4.view.be;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.TextTrackStyle;

public final class Snackbar {
    private static final Handler a = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((Snackbar) message.obj).b();
                    return true;
                case 1:
                    ((Snackbar) message.obj).a(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });
    private final ViewGroup b;
    private final SnackbarLayout c;
    private b d;
    private final AccessibilityManager e;
    private final a f;

    public static class SnackbarLayout extends LinearLayout {
        private TextView a;
        private Button b;
        private int c;
        private int d;
        private b e;
        private a f;

        interface a {
            void a(View view);

            void b(View view);
        }

        interface b {
            void a(View view, int i, int i2, int i3, int i4);
        }

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.SnackbarLayout);
            this.c = obtainStyledAttributes.getDimensionPixelSize(g.SnackbarLayout_android_maxWidth, -1);
            this.d = obtainStyledAttributes.getDimensionPixelSize(g.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(g.SnackbarLayout_elevation)) {
                ah.d((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(g.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(e.design_layout_snackbar_include, this);
            ah.d((View) this, 1);
            ah.c((View) this, 1);
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            this.a = (TextView) findViewById(d.snackbar_text);
            this.b = (Button) findViewById(d.snackbar_action);
        }

        TextView getMessageView() {
            return this.a;
        }

        Button getActionView() {
            return this.b;
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.c > 0 && getMeasuredWidth() > this.c) {
                i = MeasureSpec.makeMeasureSpec(this.c, 1073741824);
                super.onMeasure(i, i2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(c.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.design_snackbar_padding_vertical);
            int i3 = this.a.getLayout().getLineCount() > 1 ? 1 : 0;
            if (i3 == 0 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
                if (i3 == 0) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                    dimensionPixelSize = 1;
                }
                dimensionPixelSize = 0;
            } else {
                if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    dimensionPixelSize = 1;
                }
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize != 0) {
                super.onMeasure(i, i2);
            }
        }

        void a(int i, int i2) {
            ah.c(this.a, 0.0f);
            ah.r(this.a).a((float) TextTrackStyle.DEFAULT_FONT_SCALE).a((long) i2).b((long) i).c();
            if (this.b.getVisibility() == 0) {
                ah.c(this.b, 0.0f);
                ah.r(this.b).a((float) TextTrackStyle.DEFAULT_FONT_SCALE).a((long) i2).b((long) i).c();
            }
        }

        void b(int i, int i2) {
            ah.c(this.a, (float) TextTrackStyle.DEFAULT_FONT_SCALE);
            ah.r(this.a).a(0.0f).a((long) i2).b((long) i).c();
            if (this.b.getVisibility() == 0) {
                ah.c(this.b, (float) TextTrackStyle.DEFAULT_FONT_SCALE);
                ah.r(this.b).a(0.0f).a((long) i2).b((long) i).c();
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.e != null) {
                this.e.a(this, i, i2, i3, i4);
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f != null) {
                this.f.a(this);
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f != null) {
                this.f.b(this);
            }
        }

        void setOnLayoutChangeListener(b bVar) {
            this.e = bVar;
        }

        void setOnAttachStateChangeListener(a aVar) {
            this.f = aVar;
        }

        private boolean a(int i, int i2, int i3) {
            boolean z = false;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            }
            if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
                return z;
            }
            a(this.a, i2, i3);
            return true;
        }

        private static void a(View view, int i, int i2) {
            if (ah.y(view)) {
                ah.a(view, ah.l(view), i, ah.m(view), i2);
            } else {
                view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
            }
        }
    }

    final class a extends SwipeDismissBehavior<SnackbarLayout> {
        final /* synthetic */ Snackbar a;

        a(Snackbar snackbar) {
            this.a = snackbar;
        }

        public boolean a(View view) {
            return view instanceof SnackbarLayout;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
            if (coordinatorLayout.a((View) snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        n.a().c(this.a.f);
                        break;
                    case 1:
                    case 3:
                        n.a().d(this.a.f);
                        break;
                }
            }
            return super.a(coordinatorLayout, (View) snackbarLayout, motionEvent);
        }
    }

    public static abstract class b {
        public void a(Snackbar snackbar, int i) {
        }

        public void a(Snackbar snackbar) {
        }
    }

    private void b(int i) {
        n.a().a(this.f, i);
    }

    public boolean a() {
        return n.a().e(this.f);
    }

    final void b() {
        if (this.c.getParent() == null) {
            LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                android.support.design.widget.CoordinatorLayout.b aVar = new a(this);
                aVar.a(0.1f);
                aVar.b(0.6f);
                aVar.a(0);
                aVar.a(new android.support.design.widget.SwipeDismissBehavior.a(this) {
                    final /* synthetic */ Snackbar a;

                    {
                        this.a = r1;
                    }

                    public void a(View view) {
                        view.setVisibility(8);
                        this.a.b(0);
                    }

                    public void a(int i) {
                        switch (i) {
                            case 0:
                                n.a().d(this.a.f);
                                return;
                            case 1:
                            case 2:
                                n.a().c(this.a.f);
                                return;
                            default:
                                return;
                        }
                    }
                });
                ((CoordinatorLayout.e) layoutParams).a(aVar);
            }
            this.b.addView(this.c);
        }
        this.c.setOnAttachStateChangeListener(new a(this) {
            final /* synthetic */ Snackbar a;

            {
                this.a = r1;
            }

            public void a(View view) {
            }

            public void b(View view) {
                if (this.a.a()) {
                    Snackbar.a.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass4 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.a.d(3);
                        }
                    });
                }
            }
        });
        if (!ah.C(this.c)) {
            this.c.setOnLayoutChangeListener(new b(this) {
                final /* synthetic */ Snackbar a;

                {
                    this.a = r1;
                }

                public void a(View view, int i, int i2, int i3, int i4) {
                    this.a.c.setOnLayoutChangeListener(null);
                    if (this.a.f()) {
                        this.a.d();
                    } else {
                        this.a.e();
                    }
                }
            });
        } else if (f()) {
            d();
        } else {
            e();
        }
    }

    private void d() {
        if (VERSION.SDK_INT >= 14) {
            ah.b(this.c, (float) this.c.getHeight());
            ah.r(this.c).c(0.0f).a(a.b).a(250).a(new be(this) {
                final /* synthetic */ Snackbar a;

                {
                    this.a = r1;
                }

                public void onAnimationStart(View view) {
                    this.a.c.a(70, 180);
                }

                public void onAnimationEnd(View view) {
                    this.a.e();
                }
            }).c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), android.support.design.a.a.design_snackbar_in);
        loadAnimation.setInterpolator(a.b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ Snackbar a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.e();
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.c.startAnimation(loadAnimation);
    }

    private void c(final int i) {
        if (VERSION.SDK_INT >= 14) {
            ah.r(this.c).c((float) this.c.getHeight()).a(a.b).a(250).a(new be(this) {
                final /* synthetic */ Snackbar b;

                public void onAnimationStart(View view) {
                    this.b.c.b(0, 180);
                }

                public void onAnimationEnd(View view) {
                    this.b.d(i);
                }
            }).c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), android.support.design.a.a.design_snackbar_out);
        loadAnimation.setInterpolator(a.b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ Snackbar b;

            public void onAnimationEnd(Animation animation) {
                this.b.d(i);
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.c.startAnimation(loadAnimation);
    }

    final void a(int i) {
        if (f() && this.c.getVisibility() == 0) {
            c(i);
        } else {
            d(i);
        }
    }

    private void e() {
        n.a().b(this.f);
        if (this.d != null) {
            this.d.a(this);
        }
    }

    private void d(int i) {
        n.a().a(this.f);
        if (this.d != null) {
            this.d.a(this, i);
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    private boolean f() {
        return !this.e.isEnabled();
    }
}
