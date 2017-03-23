package com.balysv.materialripple;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;

public class a extends FrameLayout {
    private a A;
    private b B;
    private boolean C;
    private SimpleOnGestureListener D;
    private Property<a, Float> E;
    private Property<a, Integer> F;
    private final Paint a;
    private final Rect b;
    private int c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private boolean k;
    private Drawable l;
    private boolean m;
    private float n;
    private float o;
    private AdapterView p;
    private View q;
    private AnimatorSet r;
    private ObjectAnimator s;
    private Point t;
    private Point u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private GestureDetector z;

    private class a implements Runnable {
        final /* synthetic */ a a;

        private a(a aVar) {
            this.a = aVar;
        }

        private void a(AdapterView adapterView) {
            int positionForView = adapterView.getPositionForView(this.a);
            long itemId = adapterView.getAdapter() != null ? adapterView.getAdapter().getItemId(positionForView) : 0;
            if (positionForView != -1) {
                adapterView.performItemClick(this.a, positionForView, itemId);
            }
        }

        public void run() {
            if (!this.a.C) {
                if (this.a.getParent() instanceof AdapterView) {
                    a((AdapterView) this.a.getParent());
                } else if (this.a.m) {
                    a(this.a.e());
                } else {
                    this.a.q.performClick();
                }
            }
        }
    }

    private final class b implements Runnable {
        final /* synthetic */ a a;
        private final MotionEvent b;

        public b(a aVar, MotionEvent motionEvent) {
            this.a = aVar;
            this.b = motionEvent;
        }

        public void run() {
            this.a.x = false;
            this.a.q.setLongClickable(false);
            this.a.q.onTouchEvent(this.b);
            this.a.q.setPressed(true);
            if (this.a.e) {
                this.a.b();
            }
        }
    }

    public static class c {
        private final Context a;
        private final View b;
        private int c = -16777216;
        private boolean d = false;
        private boolean e = true;
        private float f = 35.0f;
        private int g = 350;
        private float h = 0.2f;
        private boolean i = true;
        private int j = 75;
        private boolean k = false;
        private int l = 0;
        private boolean m = false;
        private float n = 0.0f;

        public c(View view) {
            this.b = view;
            this.a = view.getContext();
        }

        public c a(float f) {
            this.h = 255.0f * f;
            return this;
        }

        public c a(int i) {
            this.c = i;
            return this;
        }

        public c a(boolean z) {
            this.d = z;
            return this;
        }

        public a a() {
            View aVar = new a(this.a);
            aVar.setRippleColor(this.c);
            aVar.setDefaultRippleAlpha((int) this.h);
            aVar.setRippleDelayClick(this.i);
            aVar.setRippleDiameter((int) a.a(this.a.getResources(), this.f));
            aVar.setRippleDuration(this.g);
            aVar.setRippleFadeDuration(this.j);
            aVar.setRippleHover(this.e);
            aVar.setRipplePersistent(this.k);
            aVar.setRippleOverlay(this.d);
            aVar.setRippleBackground(this.l);
            aVar.setRippleInAdapter(this.m);
            aVar.setRippleRoundedCorners((int) a.a(this.a.getResources(), this.n));
            LayoutParams layoutParams = this.b.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) this.b.getParent();
            int i = 0;
            if (viewGroup == null || !(viewGroup instanceof a)) {
                if (viewGroup != null) {
                    i = viewGroup.indexOfChild(this.b);
                    viewGroup.removeView(this.b);
                }
                aVar.addView(this.b, new LayoutParams(-1, -1));
                if (viewGroup != null) {
                    viewGroup.addView(aVar, i, layoutParams);
                }
                return aVar;
            }
            throw new IllegalStateException("MaterialRippleLayout could not be created: parent of the view already is a MaterialRippleLayout");
        }

        public c b(boolean z) {
            this.e = z;
            return this;
        }
    }

    public a(Context context) {
        this(context, null, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.b = new Rect();
        this.t = new Point();
        this.u = new Point();
        this.D = new SimpleOnGestureListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public boolean onDown(MotionEvent motionEvent) {
                this.a.C = false;
                return super.onDown(motionEvent);
            }

            public void onLongPress(MotionEvent motionEvent) {
                this.a.C = this.a.q.performLongClick();
                if (this.a.C) {
                    if (this.a.e) {
                        this.a.a(null);
                    }
                    this.a.a();
                }
            }
        };
        this.E = new Property<a, Float>(this, Float.class, "radius") {
            final /* synthetic */ a a;

            public Float a(a aVar) {
                return Float.valueOf(aVar.getRadius());
            }

            public void a(a aVar, Float f) {
                aVar.setRadius(f.floatValue());
            }

            public /* synthetic */ Object get(Object obj) {
                return a((a) obj);
            }

            public /* synthetic */ void set(Object obj, Object obj2) {
                a((a) obj, (Float) obj2);
            }
        };
        this.F = new Property<a, Integer>(this, Integer.class, "rippleAlpha") {
            final /* synthetic */ a a;

            public Integer a(a aVar) {
                return Integer.valueOf(aVar.getRippleAlpha());
            }

            public void a(a aVar, Integer num) {
                aVar.setRippleAlpha(num);
            }

            public /* synthetic */ Object get(Object obj) {
                return a((a) obj);
            }

            public /* synthetic */ void set(Object obj, Object obj2) {
                a((a) obj, (Integer) obj2);
            }
        };
        setWillNotDraw(false);
        this.z = new GestureDetector(context, this.D);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialRippleLayout);
        this.c = obtainStyledAttributes.getColor(R.styleable.MaterialRippleLayout_mrl_rippleColor, -16777216);
        this.f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialRippleLayout_mrl_rippleDimension, (int) a(getResources(), 35.0f));
        this.d = obtainStyledAttributes.getBoolean(R.styleable.MaterialRippleLayout_mrl_rippleOverlay, false);
        this.e = obtainStyledAttributes.getBoolean(R.styleable.MaterialRippleLayout_mrl_rippleHover, true);
        this.g = obtainStyledAttributes.getInt(R.styleable.MaterialRippleLayout_mrl_rippleDuration, 350);
        this.h = (int) (255.0f * obtainStyledAttributes.getFloat(R.styleable.MaterialRippleLayout_mrl_rippleAlpha, 0.2f));
        this.i = obtainStyledAttributes.getBoolean(R.styleable.MaterialRippleLayout_mrl_rippleDelayClick, true);
        this.j = obtainStyledAttributes.getInteger(R.styleable.MaterialRippleLayout_mrl_rippleFadeDuration, 75);
        this.l = new ColorDrawable(obtainStyledAttributes.getColor(R.styleable.MaterialRippleLayout_mrl_rippleBackground, 0));
        this.k = obtainStyledAttributes.getBoolean(R.styleable.MaterialRippleLayout_mrl_ripplePersistent, false);
        this.m = obtainStyledAttributes.getBoolean(R.styleable.MaterialRippleLayout_mrl_rippleInAdapter, false);
        this.n = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialRippleLayout_mrl_rippleRoundedCorners, 0);
        obtainStyledAttributes.recycle();
        this.a.setColor(this.c);
        this.a.setAlpha(this.h);
        h();
    }

    static float a(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public static c a(View view) {
        return new c(view);
    }

    private void a() {
        if (this.B != null) {
            removeCallbacks(this.B);
            this.x = false;
        }
    }

    private void a(final Runnable runnable) {
        if (!this.w) {
            float endRadius = getEndRadius();
            c();
            this.r = new AnimatorSet();
            this.r.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ a b;

                public void onAnimationEnd(Animator animator) {
                    if (!this.b.k) {
                        this.b.setRadius(0.0f);
                        this.b.setRippleAlpha(Integer.valueOf(this.b.h));
                    }
                    if (runnable != null && this.b.i) {
                        runnable.run();
                    }
                    this.b.q.setPressed(false);
                }
            });
            Animator ofFloat = ObjectAnimator.ofFloat(this, this.E, new float[]{this.o, endRadius});
            ofFloat.setDuration((long) this.g);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            Animator ofInt = ObjectAnimator.ofInt(this, this.F, new int[]{this.h, 0});
            ofInt.setDuration((long) this.j);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.g - this.j) - 50));
            if (this.k) {
                this.r.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.r.play(ofInt);
            } else {
                this.r.playTogether(new Animator[]{ofFloat, ofInt});
            }
            this.r.start();
        }
    }

    private boolean a(View view, int i, int i2) {
        int i3 = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i3 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i3);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    return a(childAt, i - rect.left, i2 - rect.top);
                }
                i3++;
            }
        } else if (view != this.q) {
            return view.isEnabled() ? view.isClickable() || view.isLongClickable() || view.isFocusableInTouchMode() : false;
        }
        return view.isFocusableInTouchMode();
    }

    private void b() {
        if (!this.w) {
            if (this.s != null) {
                this.s.cancel();
            }
            float sqrt = (float) (Math.sqrt(Math.pow((double) getWidth(), 2.0d) + Math.pow((double) getHeight(), 2.0d)) * 1.2000000476837158d);
            this.s = ObjectAnimator.ofFloat(this, this.E, new float[]{(float) this.f, sqrt}).setDuration(2500);
            this.s.setInterpolator(new LinearInterpolator());
            this.s.start();
        }
    }

    private void c() {
        if (this.r != null) {
            this.r.cancel();
            this.r.removeAllListeners();
        }
        if (this.s != null) {
            this.s.cancel();
        }
    }

    private boolean d() {
        ViewParent parent = getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    private AdapterView e() {
        if (this.p != null) {
            return this.p;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException e) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        this.p = (AdapterView) parent;
        return this.p;
    }

    private void f() {
        if (this.m) {
            this.y = e().getPositionForView(this);
        }
    }

    private boolean g() {
        if (!this.m) {
            return false;
        }
        int positionForView = e().getPositionForView(this);
        boolean z = positionForView != this.y;
        this.y = positionForView;
        if (!z) {
            return z;
        }
        a();
        c();
        this.q.setPressed(false);
        setRadius(0.0f);
        return z;
    }

    private float getEndRadius() {
        int width = getWidth();
        int height = getHeight();
        return ((float) Math.sqrt(Math.pow((double) (height / 2 > this.t.y ? (float) (height - this.t.y) : (float) this.t.y), 2.0d) + Math.pow((double) (width / 2 > this.t.x ? (float) (width - this.t.x) : (float) this.t.x), 2.0d))) * 1.2f;
    }

    private float getRadius() {
        return this.o;
    }

    private void h() {
        if (VERSION.SDK_INT > 17) {
            return;
        }
        if (this.n != 0.0f) {
            this.v = getLayerType();
            setLayerType(1, null);
            return;
        }
        setLayerType(this.v, null);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("MaterialRippleLayout can host only one child");
        }
        this.q = view;
        super.addView(view, i, layoutParams);
    }

    public void draw(Canvas canvas) {
        boolean g = g();
        if (this.d) {
            if (!g) {
                this.l.draw(canvas);
            }
            super.draw(canvas);
            if (!g) {
                if (this.n != 0.0f) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), this.n, this.n, Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.t.x, (float) this.t.y, this.o, this.a);
                return;
            }
            return;
        }
        if (!g) {
            this.l.draw(canvas);
            canvas.drawCircle((float) this.t.x, (float) this.t.y, this.o, this.a);
        }
        super.draw(canvas);
    }

    public <T extends View> T getChildView() {
        return this.q;
    }

    public int getRippleAlpha() {
        return this.a.getAlpha();
    }

    public boolean isInEditMode() {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !a(this.q, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b.set(0, 0, i, i2);
        this.l.setBounds(this.b);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled() || !this.q.isEnabled()) {
            return onTouchEvent;
        }
        onTouchEvent = this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (onTouchEvent) {
            this.u.set(this.t.x, this.t.y);
            this.t.set((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.z.onTouchEvent(motionEvent) || this.C) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                f();
                this.w = false;
                this.B = new b(this, motionEvent);
                if (d()) {
                    a();
                    this.x = true;
                    postDelayed(this.B, (long) ViewConfiguration.getTapTimeout());
                    return true;
                }
                this.B.run();
                return true;
            case 1:
                this.A = new a();
                if (this.x) {
                    this.q.setPressed(true);
                    postDelayed(new Runnable(this) {
                        final /* synthetic */ a a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.q.setPressed(false);
                        }
                    }, (long) ViewConfiguration.getPressedStateDuration());
                }
                if (onTouchEvent) {
                    a(this.A);
                } else if (!this.e) {
                    setRadius(0.0f);
                }
                if (!this.i && onTouchEvent) {
                    this.A.run();
                }
                a();
                return true;
            case 2:
                if (this.e) {
                    if (onTouchEvent && !this.w) {
                        invalidate();
                    } else if (!onTouchEvent) {
                        a(null);
                    }
                }
                if (onTouchEvent) {
                    return true;
                }
                a();
                if (this.s != null) {
                    this.s.cancel();
                }
                this.q.onTouchEvent(motionEvent);
                this.w = true;
                return true;
            case 3:
                if (this.m) {
                    this.t.set(this.u.x, this.u.y);
                    this.u = new Point();
                }
                this.q.onTouchEvent(motionEvent);
                if (!this.e) {
                    this.q.setPressed(false);
                } else if (!this.x) {
                    a(null);
                }
                a();
                return true;
            default:
                return true;
        }
    }

    public void setDefaultRippleAlpha(int i) {
        this.h = i;
        this.a.setAlpha(i);
        invalidate();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        if (this.q == null) {
            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
        }
        this.q.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        if (this.q == null) {
            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
        }
        this.q.setOnLongClickListener(onLongClickListener);
    }

    public void setRadius(float f) {
        this.o = f;
        invalidate();
    }

    public void setRippleAlpha(Integer num) {
        this.a.setAlpha(num.intValue());
        invalidate();
    }

    public void setRippleBackground(int i) {
        this.l = new ColorDrawable(i);
        this.l.setBounds(this.b);
        invalidate();
    }

    public void setRippleColor(int i) {
        this.c = i;
        this.a.setColor(i);
        this.a.setAlpha(this.h);
        invalidate();
    }

    public void setRippleDelayClick(boolean z) {
        this.i = z;
    }

    public void setRippleDiameter(int i) {
        this.f = i;
    }

    public void setRippleDuration(int i) {
        this.g = i;
    }

    public void setRippleFadeDuration(int i) {
        this.j = i;
    }

    public void setRippleHover(boolean z) {
        this.e = z;
    }

    public void setRippleInAdapter(boolean z) {
        this.m = z;
    }

    public void setRippleOverlay(boolean z) {
        this.d = z;
    }

    public void setRipplePersistent(boolean z) {
        this.k = z;
    }

    public void setRippleRoundedCorners(int i) {
        this.n = (float) i;
        h();
    }
}
