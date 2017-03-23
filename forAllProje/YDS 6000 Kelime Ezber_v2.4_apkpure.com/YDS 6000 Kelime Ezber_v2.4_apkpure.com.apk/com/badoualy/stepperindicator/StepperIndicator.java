package com.badoualy.stepperindicator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.sqlcipher.database.SQLiteDatabase;

public class StepperIndicator extends View implements f {
    private List<RectF> A;
    private GestureDetector B;
    private int C;
    private int D;
    private int E;
    private float[] F;
    private Rect G;
    private RectF H;
    private ViewPager I;
    private Bitmap J;
    private boolean K;
    private AnimatorSet L;
    private ObjectAnimator M;
    private ObjectAnimator N;
    private ObjectAnimator O;
    private OnGestureListener P;
    private Paint a;
    private List<Paint> b;
    private float c;
    private boolean d;
    private Paint e;
    private List<Paint> f;
    private Paint g;
    private List<Paint> h;
    private Paint i;
    private Paint j;
    private Paint k;
    private List<Path> l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private boolean t;
    private float u;
    private float v;
    private float w;
    private float x;
    private int y;
    private List<a> z;

    public interface a {
        void a(int i);
    }

    private static class b extends BaseSavedState {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] a(int i) {
                return new b[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        private int a;

        private b(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public StepperIndicator(Context context) {
        this(context, null);
    }

    public StepperIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StepperIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new ArrayList();
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.z = new ArrayList(0);
        this.G = new Rect();
        this.H = new RectF();
        this.P = new SimpleOnGestureListener(this) {
            final /* synthetic */ StepperIndicator a;

            {
                this.a = r1;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                int i;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.a.b()) {
                    i = 0;
                    while (i < this.a.A.size()) {
                        if (((RectF) this.a.A.get(i)).contains(x, y)) {
                            break;
                        }
                        i++;
                    }
                }
                i = -1;
                if (i != -1) {
                    for (a a : this.a.z) {
                        a.a(i);
                    }
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        };
        a(context, attributeSet, i);
    }

    @TargetApi(21)
    public StepperIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l = new ArrayList();
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.z = new ArrayList(0);
        this.G = new Rect();
        this.H = new RectF();
        this.P = /* anonymous class already generated */;
        a(context, attributeSet, i);
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("colorPrimary", "attr", context.getPackageName());
        if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            return typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            r1 = context.obtainStyledAttributes(new int[]{16843827});
            identifier = r1.getColor(0, android.support.v4.c.a.c(context, R.color.stpi_default_primary_color));
            r1.recycle();
            return identifier;
        } else {
            r1 = context.obtainStyledAttributes(new int[]{R.attr.colorPrimary});
            identifier = r1.getColor(0, android.support.v4.c.a.c(context, R.color.stpi_default_primary_color));
            r1.recycle();
            return identifier;
        }
    }

    private Paint a(int i, List<Paint> list, Paint paint) {
        Paint paint2;
        f(i);
        if (!(list == null || list.isEmpty())) {
            try {
                paint2 = (Paint) list.get(i);
            } catch (IndexOutOfBoundsException e) {
                Log.d("StepperIndicator", "getPaint: could not find the specific step paint to use! Try to use default instead!");
            }
            if (paint2 == null && paint != null) {
                paint2 = paint;
            }
            if (paint2 == null) {
                return paint2;
            }
            Log.d("StepperIndicator", "getPaint: could not use default paint for the specific step! Using random Paint instead!");
            return getRandomPaint();
        }
        paint2 = null;
        paint2 = paint;
        if (paint2 == null) {
            return paint2;
        }
        Log.d("StepperIndicator", "getPaint: could not use default paint for the specific step! Using random Paint instead!");
        return getRandomPaint();
    }

    private static PathEffect a(float f, float f2, float f3) {
        return new DashPathEffect(new float[]{f, f}, Math.max(f2 * f, f3));
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        int a = a(context);
        int c = android.support.v4.c.a.c(context, R.color.stpi_default_circle_color);
        float dimension = resources.getDimension(R.dimen.stpi_default_circle_radius);
        float dimension2 = resources.getDimension(R.dimen.stpi_default_circle_stroke_width);
        float dimension3 = resources.getDimension(R.dimen.stpi_default_indicator_radius);
        float dimension4 = resources.getDimension(R.dimen.stpi_default_line_stroke_width);
        float dimension5 = resources.getDimension(R.dimen.stpi_default_line_margin);
        int c2 = android.support.v4.c.a.c(context, R.color.stpi_default_line_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StepperIndicator, i, 0);
        this.a = new Paint();
        this.a.setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_circleStrokeWidth, dimension2));
        this.a.setStyle(Style.STROKE);
        this.a.setColor(obtainStyledAttributes.getColor(R.styleable.StepperIndicator_stpi_circleColor, c));
        this.a.setAntiAlias(true);
        setStepCount(obtainStyledAttributes.getInteger(R.styleable.StepperIndicator_stpi_stepCount, 2));
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.StepperIndicator_stpi_stepsCircleColors, 0);
        if (resourceId != 0) {
            this.b = new ArrayList(this.C);
            for (c = 0; c < this.C; c++) {
                Paint paint = new Paint(this.a);
                if (isInEditMode()) {
                    paint.setColor(getRandomColor());
                } else {
                    TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                    if (this.C > obtainTypedArray.length()) {
                        throw new IllegalArgumentException("Invalid number of colors for the circles. Please provide a list of colors with as many items as the number of steps required!");
                    }
                    paint.setColor(obtainTypedArray.getColor(c, 0));
                    obtainTypedArray.recycle();
                }
                this.b.add(paint);
            }
        }
        this.g = new Paint(this.a);
        this.g.setStyle(Style.FILL);
        this.g.setColor(obtainStyledAttributes.getColor(R.styleable.StepperIndicator_stpi_indicatorColor, a));
        this.g.setAntiAlias(true);
        this.e = new Paint(this.g);
        this.e.setTextSize(getResources().getDimension(R.dimen.stpi_default_text_size));
        this.d = obtainStyledAttributes.getBoolean(R.styleable.StepperIndicator_stpi_showStepNumberInstead, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.StepperIndicator_stpi_stepsIndicatorColors, 0);
        if (resourceId2 != 0) {
            this.h = new ArrayList(this.C);
            if (this.d) {
                this.f = new ArrayList(this.C);
            }
            for (c = 0; c < this.C; c++) {
                Paint paint2 = new Paint(this.g);
                Paint paint3 = this.d ? new Paint(this.e) : null;
                if (isInEditMode()) {
                    paint2.setColor(getRandomColor());
                    if (paint3 != null) {
                        paint3.setColor(paint2.getColor());
                    }
                } else {
                    TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
                    if (this.C > obtainTypedArray2.length()) {
                        throw new IllegalArgumentException("Invalid number of colors for the indicators. Please provide a list of colors with as many items as the number of steps required!");
                    }
                    paint2.setColor(obtainTypedArray2.getColor(c, 0));
                    if (paint3 != null) {
                        paint3.setColor(paint2.getColor());
                    }
                    obtainTypedArray2.recycle();
                }
                this.h.add(paint2);
                if (this.d && paint3 != null) {
                    this.f.add(paint3);
                }
            }
        }
        this.i = new Paint();
        this.i.setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_lineStrokeWidth, dimension4));
        this.i.setStrokeCap(Cap.ROUND);
        this.i.setStyle(Style.STROKE);
        this.i.setColor(obtainStyledAttributes.getColor(R.styleable.StepperIndicator_stpi_lineColor, c2));
        this.i.setAntiAlias(true);
        this.j = new Paint(this.i);
        this.j.setColor(obtainStyledAttributes.getColor(R.styleable.StepperIndicator_stpi_lineDoneColor, a));
        this.k = new Paint(this.j);
        this.p = obtainStyledAttributes.getBoolean(R.styleable.StepperIndicator_stpi_useBottomIndicator, false);
        if (this.p) {
            this.s = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_bottomIndicatorHeight, resources.getDimension(R.dimen.stpi_default_bottom_indicator_height));
            if (this.s <= 0.0f) {
                Log.d("StepperIndicator", "init: Invalid indicator height, disabling bottom indicator feature! Please provide a value greater than 0.");
                this.p = false;
            }
            this.r = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_bottomIndicatorWidth, resources.getDimension(R.dimen.stpi_default_bottom_indicator_width));
            this.q = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_bottomIndicatorMarginTop, resources.getDimension(R.dimen.stpi_default_bottom_indicator_margin_top));
            this.t = obtainStyledAttributes.getBoolean(R.styleable.StepperIndicator_stpi_useBottomIndicatorWithStepColors, false);
        }
        this.c = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_circleRadius, dimension);
        this.v = this.c + (this.a.getStrokeWidth() / 2.0f);
        this.w = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_indicatorRadius, dimension3);
        this.n = this.w;
        this.o = this.v;
        this.x = obtainStyledAttributes.getDimension(R.styleable.StepperIndicator_stpi_lineMargin, dimension5);
        this.y = obtainStyledAttributes.getInteger(R.styleable.StepperIndicator_stpi_animDuration, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        this.K = obtainStyledAttributes.getBoolean(R.styleable.StepperIndicator_stpi_showDoneIcon, true);
        obtainStyledAttributes.recycle();
        if (this.K) {
            this.J = BitmapFactory.decodeResource(resources, R.drawable.ic_done_white_18dp);
        }
        if (isInEditMode()) {
            this.D = Math.max((int) Math.ceil((double) (((float) this.C) / 2.0f)), 1);
        }
        this.B = new GestureDetector(getContext(), this.P);
    }

    private Paint c(int i) {
        return a(i, this.h, this.g);
    }

    private void c() {
        int i = 0;
        if (this.a == null) {
            throw new IllegalArgumentException("circlePaint is invalid! Make sure you setup the field circlePaint before calling compute() method!");
        }
        this.F = new float[this.C];
        this.l.clear();
        float strokeWidth = (this.c * 1.3f) + (this.a.getStrokeWidth() / 2.0f);
        if (this.p) {
            strokeWidth += (this.r / 2.0f) - strokeWidth;
        }
        float measuredWidth = (((float) getMeasuredWidth()) - (strokeWidth * 2.0f)) / ((float) (this.C - 1));
        this.u = (measuredWidth - ((this.c * 2.0f) + this.a.getStrokeWidth())) - (this.x * 2.0f);
        for (int i2 = 0; i2 < this.F.length; i2++) {
            this.F[i2] = (((float) i2) * measuredWidth) + strokeWidth;
        }
        while (i < this.F.length - 1) {
            strokeWidth = ((this.F[i] + this.F[i + 1]) / 2.0f) - (this.u / 2.0f);
            Path path = new Path();
            measuredWidth = getStepCenterY();
            path.moveTo(strokeWidth, measuredWidth);
            path.lineTo(strokeWidth + this.u, measuredWidth);
            this.l.add(path);
            i++;
        }
        a();
    }

    private Paint d(int i) {
        return a(i, this.f, this.e);
    }

    private Paint e(int i) {
        return a(i, this.b, this.a);
    }

    private boolean f(int i) {
        if (i >= 0 && i <= this.C - 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid step position. " + i + " is not a valid position! it should be between 0 and stepCount(" + this.C + ")");
    }

    private int getBottomIndicatorHeight() {
        return this.p ? (int) (this.s + this.q) : 0;
    }

    private int getRandomColor() {
        Random random = new Random();
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private Paint getRandomPaint() {
        Paint paint = new Paint(this.g);
        paint.setColor(getRandomColor());
        return paint;
    }

    private float getStepCenterY() {
        return ((float) (getMeasuredHeight() - getBottomIndicatorHeight())) / 2.0f;
    }

    public void a() {
        if (this.C == -1) {
            throw new IllegalArgumentException("stepCount wasn't setup yet. Make sure you call setStepCount() before computing the steps click area!");
        } else if (this.F == null) {
            throw new IllegalArgumentException("indicators wasn't setup yet. Make sure the indicators are initialized and setup correctly before trying to compute the click area for each step!");
        } else {
            this.A = new ArrayList(this.C);
            for (float f : this.F) {
                this.A.add(new RectF(f - (this.c * 2.0f), getStepCenterY() - (this.c * 2.0f), f + (this.c * 2.0f), (getStepCenterY() + this.c) + ((float) getBottomIndicatorHeight())));
            }
        }
    }

    public void a(int i) {
    }

    public void a(int i, float f, int i2) {
    }

    public void a(ViewPager viewPager, int i) {
        if (this.I != viewPager) {
            if (this.I != null) {
                viewPager.b((f) this);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.I = viewPager;
            this.C = i;
            this.D = 0;
            viewPager.a((f) this);
            invalidate();
        }
    }

    public void b(int i) {
        setCurrentStep(i);
    }

    public boolean b() {
        return (this.z == null || this.z.isEmpty()) ? false : true;
    }

    public int getCurrentStep() {
        return this.D;
    }

    public int getStepCount() {
        return this.C;
    }

    protected void onDraw(Canvas canvas) {
        float stepCenterY = getStepCenterY();
        Object obj = (this.L == null || !this.L.isRunning()) ? null : 1;
        Object obj2 = (this.M == null || !this.M.isRunning()) ? null : 1;
        Object obj3 = (this.N == null || !this.N.isRunning()) ? null : 1;
        Object obj4 = (this.O == null || !this.O.isRunning()) ? null : 1;
        Object obj5 = this.E == this.D + -1 ? 1 : null;
        Object obj6 = this.E == this.D + 1 ? 1 : null;
        int i = 0;
        while (i < this.F.length) {
            float f = this.F[i];
            Object obj7 = (i < this.D || (obj6 != null && i == this.D)) ? 1 : null;
            canvas.drawCircle(f, stepCenterY, this.c, e(i));
            if (this.d) {
                String valueOf = String.valueOf(i + 1);
                this.G.set((int) (f - this.c), (int) (stepCenterY - this.c), (int) (this.c + f), (int) (this.c + stepCenterY));
                this.H.set(this.G);
                Paint d = d(i);
                this.H.right = d.measureText(valueOf, 0, valueOf.length());
                this.H.bottom = d.descent() - d.ascent();
                RectF rectF = this.H;
                rectF.left += (((float) this.G.width()) - this.H.right) / 2.0f;
                rectF = this.H;
                rectF.top += (((float) this.G.height()) - this.H.bottom) / 2.0f;
                canvas.drawText(valueOf, this.H.left, this.H.top - d.ascent(), d);
            }
            if (this.p) {
                if (i == this.D) {
                    canvas.drawRect(f - (this.r / 2.0f), ((float) getHeight()) - this.s, f + (this.r / 2.0f), (float) getHeight(), this.t ? c(i) : this.g);
                }
            } else if ((i == this.D && obj6 == null) || !(i != this.E || obj6 == null || obj == null)) {
                canvas.drawCircle(f, stepCenterY, this.n, c(i));
            }
            if (obj7 != null) {
                float f2 = this.v;
                if ((i == this.E && obj5 != null) || (i == this.D && obj6 != null)) {
                    f2 = this.o;
                }
                canvas.drawCircle(f, stepCenterY, f2, c(i));
                if (!isInEditMode() && this.K && (!(i == this.E || i == this.D) || (obj4 == null && !(i == this.D && obj == null)))) {
                    canvas.drawBitmap(this.J, f - ((float) (this.J.getWidth() / 2)), stepCenterY - ((float) (this.J.getHeight() / 2)), null);
                }
            }
            if (i < this.l.size()) {
                if (i >= this.D) {
                    canvas.drawPath((Path) this.l.get(i), this.i);
                    if (!(i != this.D || obj6 == null || (obj2 == null && obj3 == null))) {
                        canvas.drawPath((Path) this.l.get(i), this.k);
                    }
                } else if (i != this.D - 1 || obj5 == null || obj2 == null) {
                    canvas.drawPath((Path) this.l.get(i), this.j);
                } else {
                    canvas.drawPath((Path) this.l.get(i), this.i);
                    canvas.drawPath((Path) this.l.get(i), this.k);
                }
            }
            i++;
        }
    }

    protected void onMeasure(int i, int i2) {
        int ceil = (int) Math.ceil((double) ((((this.c * 1.3f) * 2.0f) + this.a.getStrokeWidth()) + ((float) getBottomIndicatorHeight())));
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getSuggestedMinimumWidth();
        }
        if (mode2 != 1073741824) {
            size2 = ceil;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.D = bVar.a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bVar = new b(super.onSaveInstanceState());
        bVar.a = this.D;
        return bVar;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.B.onTouchEvent(motionEvent);
        return true;
    }

    public void setAnimCheckRadius(float f) {
        this.o = f;
        invalidate();
    }

    public void setAnimIndicatorRadius(float f) {
        this.n = f;
        invalidate();
    }

    public void setAnimProgress(float f) {
        this.m = f;
        this.k.setPathEffect(a(this.u, f, 0.0f));
        invalidate();
    }

    public void setCurrentStep(int i) {
        if (i < 0 || i > this.C) {
            throw new IllegalArgumentException("Invalid step value " + i);
        }
        this.E = this.D;
        this.D = i;
        if (VERSION.SDK_INT >= 11) {
            if (this.L != null) {
                this.L.cancel();
            }
            this.L = null;
            this.M = null;
            this.N = null;
            if (i == this.E + 1) {
                this.L = new AnimatorSet();
                this.M = ObjectAnimator.ofFloat(this, "animProgress", new float[]{1.0f, 0.0f});
                this.O = ObjectAnimator.ofFloat(this, "animCheckRadius", new float[]{this.w, this.v * 1.3f, this.v});
                this.n = 0.0f;
                this.N = ObjectAnimator.ofFloat(this, "animIndicatorRadius", new float[]{0.0f, this.w * 1.4f, this.w});
                this.L.play(this.M).with(this.O).before(this.N);
            } else if (i == this.E - 1) {
                this.L = new AnimatorSet();
                this.N = ObjectAnimator.ofFloat(this, "animIndicatorRadius", new float[]{this.w, 0.0f});
                this.m = 1.0f;
                this.k.setPathEffect(null);
                this.M = ObjectAnimator.ofFloat(this, "animProgress", new float[]{0.0f, 1.0f});
                this.o = this.v;
                this.O = ObjectAnimator.ofFloat(this, "animCheckRadius", new float[]{this.v, this.w});
                this.L.playSequentially(new Animator[]{this.N, this.M, this.O});
            }
            if (this.L != null) {
                this.M.setDuration((long) Math.min(500, this.y));
                this.M.setInterpolator(new DecelerateInterpolator());
                this.N.setDuration(this.M.getDuration() / 2);
                this.O.setDuration(this.M.getDuration() / 2);
                this.L.start();
            }
        }
        invalidate();
    }

    public void setStepCount(int i) {
        if (i < 2) {
            throw new IllegalArgumentException("stepCount must be >= 2");
        }
        this.C = i;
        this.D = 0;
        c();
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        a(viewPager, viewPager.getAdapter().b());
    }
}
