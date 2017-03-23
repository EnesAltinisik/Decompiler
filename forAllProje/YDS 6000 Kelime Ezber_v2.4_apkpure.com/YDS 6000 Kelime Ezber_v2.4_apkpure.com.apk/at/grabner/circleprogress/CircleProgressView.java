package at.grabner.circleprogress;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.text.DecimalFormat;

public class CircleProgressView extends View {
    c A = c.IDLE;
    d B;
    private final int C = -16738680;
    private int D = 40;
    private int E = 40;
    private int F = 270;
    private float G = 1.0f;
    private float H = 1.0f;
    private int I = 0;
    private e J = e.NONE;
    private int K = -1442840576;
    private float L = 10.0f;
    private int M = 10;
    private int N = 10;
    private float O = 1.0f;
    private float P = 1.0f;
    private int Q = -1442840576;
    private int R = -1442840576;
    private int S = -16738680;
    private int T = 0;
    private int U = -1434201911;
    private int V = -16777216;
    private int W = -16777216;
    protected int a = 0;
    private boolean aA = false;
    private int aB = 18;
    private float aC = 0.9f;
    private float aD = ((float) (360 / this.aB));
    private float aE = (this.aD * this.aC);
    private boolean aF = false;
    private boolean aG = false;
    private int aH;
    private a aI;
    private float aJ;
    private DecimalFormat aK = new DecimalFormat("0");
    private Typeface aL;
    private Typeface aM;
    private boolean aa = false;
    private int[] ab = new int[]{-16738680};
    private Cap ac = Cap.BUTT;
    private Cap ad = Cap.BUTT;
    private Paint ae = new Paint();
    private Paint af;
    private Paint ag = new Paint();
    private Paint ah = new Paint();
    private Paint ai = new Paint();
    private Paint aj = new Paint();
    private Paint ak = new Paint();
    private Paint al = new Paint();
    private Paint am = new Paint();
    private Paint an = new Paint();
    private String ao = "";
    private int ap;
    private String aq = "";
    private j ar = j.RIGHT_TOP;
    private i as = i.PERCENT;
    private boolean at;
    private boolean au = false;
    private Bitmap av;
    private Paint aw;
    private float ax = 1.0f;
    private boolean ay = false;
    private boolean az = false;
    protected int b = 0;
    protected RectF c = new RectF();
    protected RectF d = new RectF();
    protected PointF e;
    protected RectF f = new RectF();
    protected RectF g = new RectF();
    protected RectF h = new RectF();
    protected RectF i = new RectF();
    protected RectF j = new RectF();
    g k = g.CW;
    float l = 0.0f;
    float m = 0.0f;
    float n = 0.0f;
    float o = 100.0f;
    float p = 0.0f;
    float q = -1.0f;
    float r = 0.0f;
    float s = 42.0f;
    float t = 0.0f;
    float u = 2.8f;
    boolean v = false;
    double w = 900.0d;
    int x = 10;
    boolean y;
    a z = new a(this);

    public interface a {
        void a(float f);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleProgressView);
        setBarWidth((int) obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_barWidth, (float) this.D));
        setRimWidth((int) obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_rimWidth, (float) this.E));
        setSpinSpeed((float) ((int) obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_spinSpeed, this.u)));
        setSpin(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_spin, this.v));
        setDirection(g.values()[obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_direction, 0)]);
        float f = obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_value, this.l);
        setValue(f);
        this.l = f;
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor1) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor2) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor3)) {
            this.ab = new int[]{obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor1, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor2, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor3, -16738680)};
        } else if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor1) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor2)) {
            this.ab = new int[]{obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor1, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor2, -16738680)};
        } else if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barColor1)) {
            this.ab = new int[]{obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor1, -16738680)};
        } else {
            this.ab = new int[]{obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor, -16738680), obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barColor, -16738680)};
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barStrokeCap)) {
            setBarStrokeCap(h.values()[obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_barStrokeCap, 0)].d);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barStartEndLineWidth) && obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_barStartEndLine)) {
            a((int) obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_barStartEndLineWidth, 0.0f), e.values()[obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_barStartEndLine, 3)], obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_barStartEndLineColor, this.K), obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_barStartEndLineSweep, this.L));
        }
        setSpinBarColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_spinColor, this.S));
        setSpinningBarLength(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_spinBarLength, this.s));
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_textSize)) {
            setTextSize((int) obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_textSize, (float) this.N));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_unitSize)) {
            setUnitSize((int) obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_unitSize, (float) this.M));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_textColor)) {
            setTextColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_textColor, this.V));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_unitColor)) {
            setUnitColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_unitColor, this.W));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_autoTextColor)) {
            setTextColorAuto(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_autoTextColor, this.aa));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_autoTextSize)) {
            setAutoTextSize(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_autoTextSize, this.at));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_textMode)) {
            setTextMode(i.values()[obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_textMode, 0)]);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_unitPosition)) {
            setUnitPosition(j.values()[obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_unitPosition, 3)]);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_text)) {
            setText(obtainStyledAttributes.getString(R.styleable.CircleProgressView_cpv_text));
        }
        setUnitToTextScale(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_unitToTextScale, 1.0f));
        setRimColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_rimColor, this.U));
        setFillCircleColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_fillColor, this.T));
        setOuterContourColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_outerContourColor, this.Q));
        setOuterContourSize(obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_outerContourSize, this.G));
        setInnerContourColor(obtainStyledAttributes.getColor(R.styleable.CircleProgressView_cpv_innerContourColor, this.R));
        setInnerContourSize(obtainStyledAttributes.getDimension(R.styleable.CircleProgressView_cpv_innerContourSize, this.H));
        setMaxValue(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_maxValue, this.o));
        setMinValueAllowed(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_minValueAllowed, this.p));
        setMaxValueAllowed(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_maxValueAllowed, this.q));
        setRoundToBlock(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_roundToBlock, this.aF));
        setRoundToWholeNumber(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_roundToWholeNumber, this.aG));
        setUnit(obtainStyledAttributes.getString(R.styleable.CircleProgressView_cpv_unit));
        setUnitVisible(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_showUnit, this.au));
        setTextScale(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_textScale, this.O));
        setUnitScale(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_unitScale, this.P));
        setSeekModeEnabled(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_seekMode, this.ay));
        setStartAngle(obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_startAngle, this.F));
        setShowTextWhileSpinning(obtainStyledAttributes.getBoolean(R.styleable.CircleProgressView_cpv_showTextInSpinningMode, this.az));
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_blockCount)) {
            setBlockCount(obtainStyledAttributes.getInt(R.styleable.CircleProgressView_cpv_blockCount, 1));
            setBlockScale(obtainStyledAttributes.getFloat(R.styleable.CircleProgressView_cpv_blockScale, 0.9f));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_textTypeface)) {
            try {
                this.aL = Typeface.createFromAsset(getContext().getAssets(), obtainStyledAttributes.getString(R.styleable.CircleProgressView_cpv_textTypeface));
            } catch (Exception e) {
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_unitTypeface)) {
            try {
                this.aM = Typeface.createFromAsset(getContext().getAssets(), obtainStyledAttributes.getString(R.styleable.CircleProgressView_cpv_unitTypeface));
            } catch (Exception e2) {
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CircleProgressView_cpv_decimalFormat)) {
            try {
                String string = obtainStyledAttributes.getString(R.styleable.CircleProgressView_cpv_decimalFormat);
                if (string != null) {
                    this.aK = new DecimalFormat(string);
                }
            } catch (Exception e3) {
                Log.w("CircleView", e3.getMessage());
            }
        }
        obtainStyledAttributes.recycle();
        if (!isInEditMode() && VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        this.aw = new Paint(1);
        this.aw.setFilterBitmap(false);
        this.aw.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        b();
        if (this.v) {
            d();
        }
    }

    public static double a(PointF pointF, PointF pointF2) {
        double toDegrees = Math.toDegrees(Math.atan2((double) (pointF2.y - pointF.y), (double) (pointF2.x - pointF.x)));
        return toDegrees < 0.0d ? toDegrees + 360.0d : toDegrees;
    }

    private static float a(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    private float a(PointF pointF) {
        long round = Math.round(a(this.e, pointF));
        return a(this.k == g.CW ? (float) (round - ((long) this.F)) : (float) (((long) this.F) - round));
    }

    private static float a(String str, Paint paint, RectF rectF) {
        Matrix matrix = new Matrix();
        Rect rect = new Rect();
        String replace = str.replace('1', '0');
        paint.getTextBounds(replace, 0, replace.length(), rect);
        matrix.setRectToRect(new RectF(rect), rectF, ScaleToFit.CENTER);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return paint.getTextSize() * fArr[0];
    }

    private int a(double d) {
        int i = 1;
        if (this.ab.length <= 1) {
            return this.ab.length == 1 ? this.ab[0] : -16777216;
        } else {
            double maxValue = ((double) (1.0f / getMaxValue())) * d;
            int floor = (int) Math.floor(((double) (this.ab.length - 1)) * maxValue);
            int i2 = floor + 1;
            if (floor < 0) {
                i2 = 0;
            } else if (i2 >= this.ab.length) {
                i2 = this.ab.length - 2;
                i = this.ab.length - 1;
            } else {
                i = i2;
                i2 = floor;
            }
            return f.a(this.ab[i2], this.ab[i], (float) (1.0d - ((((double) (this.ab.length - 1)) * maxValue) % 1.0d)));
        }
    }

    private RectF a(RectF rectF) {
        float f;
        float f2 = 1.0f;
        float width = (rectF.width() - ((float) ((((double) (((rectF.width() - ((float) Math.max(this.D, this.E))) - this.G) - this.H)) / 2.0d) * Math.sqrt(2.0d)))) / 2.0f;
        if (a()) {
            switch (this.ar) {
                case TOP:
                case BOTTOM:
                    f = 1.1f;
                    f2 = 0.88f;
                    break;
                case LEFT_TOP:
                case RIGHT_TOP:
                case LEFT_BOTTOM:
                case RIGHT_BOTTOM:
                    f = 0.77f;
                    f2 = 1.33f;
                    break;
            }
        }
        f = 1.0f;
        return new RectF(rectF.left + (width * f), rectF.top + (width * f2), rectF.right - (f * width), rectF.bottom - (f2 * width));
    }

    private void a(Canvas canvas) {
        if (this.r < 0.0f) {
            this.r = 1.0f;
        }
        canvas.drawArc(this.c, this.k == g.CW ? (((float) this.F) + this.t) - this.r : ((float) this.F) - this.t, this.r, false, this.ag);
    }

    private void a(Canvas canvas, RectF rectF, float f, float f2, Paint paint) {
        float f3 = 0.0f;
        while (f3 < f2) {
            canvas.drawArc(rectF, f + f3, Math.min(this.aE, f2 - f3), false, paint);
            f3 = this.aD + f3;
        }
    }

    private static RectF b(String str, Paint paint, RectF rectF) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float width = (float) (rect.left + rect.width());
        float height = (((float) rect.height()) * 0.93f) + ((float) rect.bottom);
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left + ((rectF.width() - width) / 2.0f);
        rectF2.top = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF2.right = width + rectF2.left;
        rectF2.bottom = height + rectF2.top;
        return rectF2;
    }

    private void b(float f) {
        if (this.aI != null && f != this.aJ) {
            this.aI.a(f);
            this.aJ = f;
        }
    }

    private void e() {
        this.ap = -1;
        this.f = a(this.c);
        invalidate();
    }

    private void f() {
        if (this.ab.length > 1) {
            this.ae.setShader(new SweepGradient(this.c.centerX(), this.c.centerY(), this.ab, null));
            Matrix matrix = new Matrix();
            this.ae.getShader().getLocalMatrix(matrix);
            matrix.postTranslate(-this.c.centerX(), -this.c.centerY());
            matrix.postRotate((float) this.F);
            matrix.postTranslate(this.c.centerX(), this.c.centerY());
            this.ae.getShader().setLocalMatrix(matrix);
            this.ae.setColor(this.ab[0]);
        } else if (this.ab.length == 1) {
            this.ae.setColor(this.ab[0]);
            this.ae.setShader(null);
        } else {
            this.ae.setColor(-16738680);
            this.ae.setShader(null);
        }
        this.ae.setAntiAlias(true);
        this.ae.setStrokeCap(this.ac);
        this.ae.setStyle(Style.STROKE);
        this.ae.setStrokeWidth((float) this.D);
        if (this.ac != Cap.BUTT) {
            this.af = new Paint(this.ae);
            this.af.setShader(null);
            this.af.setColor(this.ab[0]);
        }
    }

    private void setSpin(boolean z) {
        this.v = z;
    }

    private void setTextSizeAndTextBoundsWithFixedTextSize(String str) {
        this.ak.setTextSize((float) this.N);
        this.g = b(str, this.ak, this.c);
    }

    public void a(float f, float f2, long j) {
        float f3;
        if (this.aA && this.aF) {
            f3 = this.o / ((float) this.aB);
            f2 = ((float) Math.round(f2 / f3)) * f3;
        } else if (this.aG) {
            f2 = (float) Math.round(f2);
        }
        f3 = Math.max(this.p, f2);
        if (this.q >= 0.0f) {
            f3 = Math.min(this.q, f3);
        }
        this.w = (double) j;
        Message message = new Message();
        message.what = b.d - 1;
        message.obj = new float[]{f, f3};
        this.z.sendMessage(message);
        b(f3);
    }

    public void a(float f, long j) {
        a(this.l, f, j);
    }

    public void a(int i, e eVar, int i2, float f) {
        this.I = i;
        this.J = eVar;
        this.K = i2;
        this.L = f;
    }

    public boolean a() {
        return this.au;
    }

    public void b() {
        f();
        this.ag.setAntiAlias(true);
        this.ag.setStrokeCap(this.ad);
        this.ag.setStyle(Style.STROKE);
        this.ag.setStrokeWidth((float) this.D);
        this.ag.setColor(this.S);
        this.am.setColor(this.Q);
        this.am.setAntiAlias(true);
        this.am.setStyle(Style.STROKE);
        this.am.setStrokeWidth(this.G);
        this.an.setColor(this.R);
        this.an.setAntiAlias(true);
        this.an.setStyle(Style.STROKE);
        this.an.setStrokeWidth(this.H);
        this.al.setStyle(Style.FILL);
        this.al.setAntiAlias(true);
        if (this.aM != null) {
            this.al.setTypeface(this.aM);
        }
        this.ak.setSubpixelText(true);
        this.ak.setLinearText(true);
        this.ak.setTypeface(Typeface.MONOSPACE);
        this.ak.setColor(this.V);
        this.ak.setStyle(Style.FILL);
        this.ak.setAntiAlias(true);
        this.ak.setTextSize((float) this.N);
        if (this.aL != null) {
            this.ak.setTypeface(this.aL);
        } else {
            this.ak.setTypeface(Typeface.MONOSPACE);
        }
        this.ai.setColor(this.T);
        this.ai.setAntiAlias(true);
        this.ai.setStyle(Style.FILL);
        this.aj.setColor(this.U);
        this.aj.setAntiAlias(true);
        this.aj.setStyle(Style.STROKE);
        this.aj.setStrokeWidth((float) this.E);
        this.ah.setColor(this.K);
        this.ah.setAntiAlias(true);
        this.ah.setStyle(Style.STROKE);
        this.ah.setStrokeWidth((float) this.I);
    }

    public void c() {
        setSpin(false);
        this.z.sendEmptyMessage(b.b - 1);
    }

    public void d() {
        setSpin(true);
        this.z.sendEmptyMessage(b.a - 1);
    }

    public int[] getBarColors() {
        return this.ab;
    }

    public e getBarStartEndLine() {
        return this.J;
    }

    public Cap getBarStrokeCap() {
        return this.ac;
    }

    public int getBarWidth() {
        return this.D;
    }

    public int getBlockCount() {
        return this.aB;
    }

    public float getBlockScale() {
        return this.aC;
    }

    public float getCurrentValue() {
        return this.l;
    }

    public DecimalFormat getDecimalFormat() {
        return this.aK;
    }

    public int getDelayMillis() {
        return this.x;
    }

    public int getFillColor() {
        return this.ai.getColor();
    }

    public int getInnerContourColor() {
        return this.R;
    }

    public float getInnerContourSize() {
        return this.H;
    }

    public float getMaxValue() {
        return this.o;
    }

    public float getMaxValueAllowed() {
        return this.q;
    }

    public float getMinValueAllowed() {
        return this.p;
    }

    public int getOuterContourColor() {
        return this.Q;
    }

    public float getOuterContourSize() {
        return this.G;
    }

    public float getRelativeUniteSize() {
        return this.ax;
    }

    public int getRimColor() {
        return this.U;
    }

    public Shader getRimShader() {
        return this.aj.getShader();
    }

    public int getRimWidth() {
        return this.E;
    }

    public boolean getRoundToBlock() {
        return this.aF;
    }

    public boolean getRoundToWholeNumber() {
        return this.aG;
    }

    public float getSpinSpeed() {
        return this.u;
    }

    public Cap getSpinnerStrokeCap() {
        return this.ad;
    }

    public int getStartAngle() {
        return this.F;
    }

    public float getTextScale() {
        return this.O;
    }

    public int getTextSize() {
        return this.N;
    }

    public String getUnit() {
        return this.aq;
    }

    public float getUnitScale() {
        return this.P;
    }

    public int getUnitSize() {
        return this.M;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r14) {
        /*
        r13 = this;
        super.onDraw(r14);
        r0 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r1 = r13.o;
        r0 = r0 / r1;
        r1 = r13.l;
        r7 = r0 * r1;
        r0 = r13.T;
        if (r0 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r13.d;
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 0;
        r5 = r13.ai;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x001d:
        r0 = r13.E;
        if (r0 <= 0) goto L_0x0032;
    L_0x0021:
        r0 = r13.aA;
        if (r0 != 0) goto L_0x025e;
    L_0x0025:
        r1 = r13.c;
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 0;
        r5 = r13.aj;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x0032:
        r0 = r13.G;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0046;
    L_0x0039:
        r1 = r13.i;
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 0;
        r5 = r13.am;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x0046:
        r0 = r13.H;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x005a;
    L_0x004d:
        r1 = r13.j;
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 0;
        r5 = r13.an;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x005a:
        r0 = r13.A;
        r1 = at.grabner.circleprogress.c.SPINNING;
        if (r0 == r1) goto L_0x0066;
    L_0x0060:
        r0 = r13.A;
        r1 = at.grabner.circleprogress.c.END_SPINNING;
        if (r0 != r1) goto L_0x026e;
    L_0x0066:
        r13.a(r14);
        r0 = r13.az;
        if (r0 == 0) goto L_0x0202;
    L_0x006d:
        r0 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r1 = r13.ar;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x0306;
            case 2: goto L_0x0306;
            default: goto L_0x007a;
        };
    L_0x007a:
        r0 = 1057803469; // 0x3f0ccccd float:0.55 double:5.22624354E-315;
        r1 = r13.ax;
        r1 = r1 * r0;
        r0 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r2 = r13.ax;
        r0 = r0 * r2;
    L_0x0086:
        r2 = r13.f;
        r2 = r2.width();
        r3 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r2 = r2 * r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r2 / r3;
        r2 = r13.f;
        r2 = r2.width();
        r4 = r2 * r0;
        r0 = r13.f;
        r0 = r0.height();
        r2 = 1020054733; // 0x3ccccccd float:0.025 double:5.039740005E-315;
        r0 = r0 * r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r0 / r2;
        r0 = r13.f;
        r0 = r0.height();
        r6 = r0 * r1;
        r1 = 0;
        r0 = r13.aa;
        if (r0 == 0) goto L_0x00c3;
    L_0x00b7:
        r0 = r13.ak;
        r2 = r13.l;
        r8 = (double) r2;
        r2 = r13.a(r8);
        r0.setColor(r2);
    L_0x00c3:
        r0 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.b;
        r2 = r13.as;
        r2 = r2.ordinal();
        r0 = r0[r2];
        switch(r0) {
            case 2: goto L_0x0317;
            case 3: goto L_0x0328;
            default: goto L_0x00d0;
        };
    L_0x00d0:
        r0 = r13.ao;
        if (r0 == 0) goto L_0x0313;
    L_0x00d4:
        r0 = r13.ao;
    L_0x00d6:
        r2 = r13.ap;
        r8 = r0.length();
        if (r2 == r8) goto L_0x0164;
    L_0x00de:
        r2 = 1;
        r1 = r0.length();
        r13.ap = r1;
        r1 = r13.ap;
        r8 = 1;
        if (r1 != r8) goto L_0x0333;
    L_0x00ea:
        r1 = r13.c;
        r1 = r13.a(r1);
        r13.f = r1;
        r1 = new android.graphics.RectF;
        r8 = r13.f;
        r8 = r8.left;
        r9 = r13.f;
        r9 = r9.width();
        r10 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r9 = r9 * r10;
        r8 = r8 + r9;
        r9 = r13.f;
        r9 = r9.top;
        r10 = r13.f;
        r10 = r10.right;
        r11 = r13.f;
        r11 = r11.width();
        r12 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r11 = r11 * r12;
        r10 = r10 - r11;
        r11 = r13.f;
        r11 = r11.bottom;
        r1.<init>(r8, r9, r10, r11);
        r13.f = r1;
    L_0x011f:
        r1 = r13.at;
        if (r1 == 0) goto L_0x0388;
    L_0x0123:
        r1 = r13.f;
        r8 = r13.au;
        if (r8 == 0) goto L_0x014d;
    L_0x0129:
        r1 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r8 = r13.ar;
        r8 = r8.ordinal();
        r1 = r1[r8];
        switch(r1) {
            case 1: goto L_0x033d;
            case 2: goto L_0x0356;
            case 3: goto L_0x036f;
            case 4: goto L_0x0136;
            case 5: goto L_0x036f;
            default: goto L_0x0136;
        };
    L_0x0136:
        r1 = new android.graphics.RectF;
        r8 = r13.f;
        r8 = r8.left;
        r9 = r13.f;
        r9 = r9.top;
        r10 = r13.f;
        r10 = r10.right;
        r10 = r10 - r4;
        r10 = r10 - r3;
        r11 = r13.f;
        r11 = r11.bottom;
        r1.<init>(r8, r9, r10, r11);
    L_0x014d:
        r8 = r13.ak;
        r9 = r13.ak;
        r9 = a(r0, r9, r1);
        r10 = r13.O;
        r9 = r9 * r10;
        r8.setTextSize(r9);
        r8 = r13.ak;
        r1 = b(r0, r8, r1);
        r13.g = r1;
        r1 = r2;
    L_0x0164:
        r2 = r13.g;
        r2 = r2.left;
        r8 = r13.ak;
        r8 = r8.getTextSize();
        r9 = 1017370378; // 0x3ca3d70a float:0.02 double:5.02647753E-315;
        r8 = r8 * r9;
        r2 = r2 - r8;
        r8 = r13.g;
        r8 = r8.bottom;
        r9 = r13.ak;
        r14.drawText(r0, r2, r8, r9);
        r0 = r13.au;
        if (r0 == 0) goto L_0x0202;
    L_0x0180:
        r0 = r13.aa;
        if (r0 == 0) goto L_0x0190;
    L_0x0184:
        r0 = r13.al;
        r2 = r13.l;
        r8 = (double) r2;
        r2 = r13.a(r8);
        r0.setColor(r2);
    L_0x0190:
        if (r1 == 0) goto L_0x01e8;
    L_0x0192:
        r0 = r13.at;
        if (r0 == 0) goto L_0x0403;
    L_0x0196:
        r0 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r1 = r13.ar;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x038e;
            case 2: goto L_0x03a9;
            case 3: goto L_0x03c4;
            case 4: goto L_0x01a3;
            case 5: goto L_0x03c4;
            default: goto L_0x01a3;
        };
    L_0x01a3:
        r0 = new android.graphics.RectF;
        r1 = r13.f;
        r1 = r1.right;
        r1 = r1 - r4;
        r1 = r1 + r3;
        r2 = r13.f;
        r2 = r2.top;
        r3 = r13.f;
        r3 = r3.right;
        r4 = r13.f;
        r4 = r4.top;
        r4 = r4 + r6;
        r0.<init>(r1, r2, r3, r4);
        r13.h = r0;
    L_0x01bd:
        r0 = r13.al;
        r1 = r13.aq;
        r2 = r13.al;
        r3 = r13.h;
        r1 = a(r1, r2, r3);
        r2 = r13.P;
        r1 = r1 * r2;
        r0.setTextSize(r1);
        r0 = r13.aq;
        r1 = r13.al;
        r2 = r13.h;
        r0 = b(r0, r1, r2);
        r13.h = r0;
        r0 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r1 = r13.ar;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 3: goto L_0x03e1;
            case 4: goto L_0x03e1;
            case 5: goto L_0x03f2;
            case 6: goto L_0x03f2;
            default: goto L_0x01e8;
        };
    L_0x01e8:
        r0 = r13.aq;
        r1 = r13.h;
        r1 = r1.left;
        r2 = r13.al;
        r2 = r2.getTextSize();
        r3 = 1017370378; // 0x3ca3d70a float:0.02 double:5.02647753E-315;
        r2 = r2 * r3;
        r1 = r1 - r2;
        r2 = r13.h;
        r2 = r2.bottom;
        r3 = r13.al;
        r14.drawText(r0, r1, r2, r3);
    L_0x0202:
        r0 = r13.av;
        if (r0 == 0) goto L_0x020f;
    L_0x0206:
        r0 = r13.av;
        r1 = 0;
        r2 = 0;
        r3 = r13.aw;
        r14.drawBitmap(r0, r1, r2, r3);
    L_0x020f:
        r0 = r13.I;
        if (r0 <= 0) goto L_0x025d;
    L_0x0213:
        r0 = r13.J;
        r1 = at.grabner.circleprogress.e.NONE;
        if (r0 == r1) goto L_0x025d;
    L_0x0219:
        r0 = 0;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x025d;
    L_0x021e:
        r0 = r13.k;
        r1 = at.grabner.circleprogress.g.CW;
        if (r0 != r1) goto L_0x04a6;
    L_0x0224:
        r0 = r13.F;
        r0 = (float) r0;
    L_0x0227:
        r1 = r13.L;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r2;
        r2 = r0 - r1;
        r0 = r13.J;
        r1 = at.grabner.circleprogress.e.START;
        if (r0 == r1) goto L_0x023a;
    L_0x0234:
        r0 = r13.J;
        r1 = at.grabner.circleprogress.e.BOTH;
        if (r0 != r1) goto L_0x0245;
    L_0x023a:
        r1 = r13.c;
        r3 = r13.L;
        r4 = 0;
        r5 = r13.ah;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x0245:
        r0 = r13.J;
        r1 = at.grabner.circleprogress.e.END;
        if (r0 == r1) goto L_0x0251;
    L_0x024b:
        r0 = r13.J;
        r1 = at.grabner.circleprogress.e.BOTH;
        if (r0 != r1) goto L_0x025d;
    L_0x0251:
        r1 = r13.c;
        r2 = r2 + r7;
        r3 = r13.L;
        r4 = 0;
        r5 = r13.ah;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x025d:
        return;
    L_0x025e:
        r2 = r13.c;
        r0 = r13.F;
        r3 = (float) r0;
        r4 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r5 = r13.aj;
        r0 = r13;
        r1 = r14;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x0032;
    L_0x026e:
        r0 = r13.A;
        r1 = at.grabner.circleprogress.c.END_SPINNING_START_ANIMATING;
        if (r0 != r1) goto L_0x0281;
    L_0x0274:
        r13.a(r14);
        r0 = r13.y;
        if (r0 != 0) goto L_0x0281;
    L_0x027b:
        r0 = r13.az;
        if (r0 == 0) goto L_0x0202;
    L_0x027f:
        goto L_0x006d;
    L_0x0281:
        r0 = r13.k;
        r1 = at.grabner.circleprogress.g.CW;
        if (r0 != r1) goto L_0x02d1;
    L_0x0287:
        r0 = r13.F;
        r2 = (float) r0;
    L_0x028a:
        r0 = r13.aA;
        if (r0 != 0) goto L_0x02fa;
    L_0x028e:
        r0 = r13.ac;
        r1 = android.graphics.Paint.Cap.BUTT;
        if (r0 == r1) goto L_0x02ee;
    L_0x0294:
        r0 = 0;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x02ee;
    L_0x0299:
        r0 = r13.ab;
        r0 = r0.length;
        r1 = 1;
        if (r0 <= r1) goto L_0x02ee;
    L_0x029f:
        r0 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x02d7;
    L_0x02a5:
        r1 = r13.c;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r7 / r0;
        r4 = 0;
        r5 = r13.ae;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
        r1 = r13.c;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = r13.af;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
        r1 = r13.c;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r7 / r0;
        r2 = r2 + r0;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r7 / r0;
        r4 = 0;
        r5 = r13.ae;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
        goto L_0x006d;
    L_0x02d1:
        r0 = r13.F;
        r0 = (float) r0;
        r2 = r0 - r7;
        goto L_0x028a;
    L_0x02d7:
        r1 = r13.c;
        r4 = 0;
        r5 = r13.ae;
        r0 = r14;
        r3 = r7;
        r0.drawArc(r1, r2, r3, r4, r5);
        r1 = r13.c;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = r13.af;
        r0 = r14;
        r0.drawArc(r1, r2, r3, r4, r5);
        goto L_0x006d;
    L_0x02ee:
        r1 = r13.c;
        r4 = 0;
        r5 = r13.ae;
        r0 = r14;
        r3 = r7;
        r0.drawArc(r1, r2, r3, r4, r5);
        goto L_0x006d;
    L_0x02fa:
        r5 = r13.c;
        r8 = r13.ae;
        r3 = r13;
        r4 = r14;
        r6 = r2;
        r3.a(r4, r5, r6, r7, r8);
        goto L_0x006d;
    L_0x0306:
        r0 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r1 = r13.ax;
        r1 = r1 * r0;
        r0 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r2 = r13.ax;
        r0 = r0 * r2;
        goto L_0x0086;
    L_0x0313:
        r0 = "";
        goto L_0x00d6;
    L_0x0317:
        r0 = r13.aK;
        r2 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r8 = r13.o;
        r2 = r2 / r8;
        r8 = r13.l;
        r2 = r2 * r8;
        r8 = (double) r2;
        r0 = r0.format(r8);
        goto L_0x00d6;
    L_0x0328:
        r0 = r13.aK;
        r2 = r13.l;
        r8 = (double) r2;
        r0 = r0.format(r8);
        goto L_0x00d6;
    L_0x0333:
        r1 = r13.c;
        r1 = r13.a(r1);
        r13.f = r1;
        goto L_0x011f;
    L_0x033d:
        r1 = new android.graphics.RectF;
        r8 = r13.f;
        r8 = r8.left;
        r9 = r13.f;
        r9 = r9.top;
        r9 = r9 + r6;
        r9 = r9 + r5;
        r10 = r13.f;
        r10 = r10.right;
        r11 = r13.f;
        r11 = r11.bottom;
        r1.<init>(r8, r9, r10, r11);
        goto L_0x014d;
    L_0x0356:
        r1 = new android.graphics.RectF;
        r8 = r13.f;
        r8 = r8.left;
        r9 = r13.f;
        r9 = r9.top;
        r10 = r13.f;
        r10 = r10.right;
        r11 = r13.f;
        r11 = r11.bottom;
        r11 = r11 - r6;
        r11 = r11 - r5;
        r1.<init>(r8, r9, r10, r11);
        goto L_0x014d;
    L_0x036f:
        r1 = new android.graphics.RectF;
        r8 = r13.f;
        r8 = r8.left;
        r8 = r8 + r4;
        r8 = r8 + r3;
        r9 = r13.f;
        r9 = r9.top;
        r10 = r13.f;
        r10 = r10.right;
        r11 = r13.f;
        r11 = r11.bottom;
        r1.<init>(r8, r9, r10, r11);
        goto L_0x014d;
    L_0x0388:
        r13.setTextSizeAndTextBoundsWithFixedTextSize(r0);
        r1 = r2;
        goto L_0x0164;
    L_0x038e:
        r0 = new android.graphics.RectF;
        r1 = r13.f;
        r1 = r1.left;
        r2 = r13.f;
        r2 = r2.top;
        r3 = r13.f;
        r3 = r3.right;
        r4 = r13.f;
        r4 = r4.top;
        r4 = r4 + r6;
        r4 = r4 - r5;
        r0.<init>(r1, r2, r3, r4);
        r13.h = r0;
        goto L_0x01bd;
    L_0x03a9:
        r0 = new android.graphics.RectF;
        r1 = r13.f;
        r1 = r1.left;
        r2 = r13.f;
        r2 = r2.bottom;
        r2 = r2 - r6;
        r2 = r2 + r5;
        r3 = r13.f;
        r3 = r3.right;
        r4 = r13.f;
        r4 = r4.bottom;
        r0.<init>(r1, r2, r3, r4);
        r13.h = r0;
        goto L_0x01bd;
    L_0x03c4:
        r0 = new android.graphics.RectF;
        r1 = r13.f;
        r1 = r1.left;
        r2 = r13.f;
        r2 = r2.top;
        r5 = r13.f;
        r5 = r5.left;
        r4 = r4 + r5;
        r3 = r4 - r3;
        r4 = r13.f;
        r4 = r4.top;
        r4 = r4 + r6;
        r0.<init>(r1, r2, r3, r4);
        r13.h = r0;
        goto L_0x01bd;
    L_0x03e1:
        r0 = r13.g;
        r0 = r0.top;
        r1 = r13.h;
        r1 = r1.top;
        r0 = r0 - r1;
        r1 = r13.h;
        r2 = 0;
        r1.offset(r2, r0);
        goto L_0x01e8;
    L_0x03f2:
        r0 = r13.g;
        r0 = r0.bottom;
        r1 = r13.h;
        r1 = r1.bottom;
        r0 = r0 - r1;
        r1 = r13.h;
        r2 = 0;
        r1.offset(r2, r0);
        goto L_0x01e8;
    L_0x0403:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 * r3;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 * r5;
        r2 = r13.al;
        r3 = r13.M;
        r3 = (float) r3;
        r2.setTextSize(r3);
        r2 = r13.aq;
        r3 = r13.al;
        r4 = r13.f;
        r2 = b(r2, r3, r4);
        r13.h = r2;
        r2 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r3 = r13.ar;
        r3 = r3.ordinal();
        r2 = r2[r3];
        switch(r2) {
            case 1: goto L_0x0458;
            case 2: goto L_0x046f;
            case 3: goto L_0x047e;
            case 4: goto L_0x042a;
            case 5: goto L_0x047e;
            default: goto L_0x042a;
        };
    L_0x042a:
        r1 = r13.h;
        r2 = r13.g;
        r2 = r2.right;
        r0 = r0 + r2;
        r2 = r13.h;
        r2 = r2.top;
        r1.offsetTo(r0, r2);
    L_0x0438:
        r0 = at.grabner.circleprogress.CircleProgressView.AnonymousClass1.a;
        r1 = r13.ar;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 3: goto L_0x0447;
            case 4: goto L_0x0447;
            case 5: goto L_0x0495;
            case 6: goto L_0x0495;
            default: goto L_0x0445;
        };
    L_0x0445:
        goto L_0x01e8;
    L_0x0447:
        r0 = r13.g;
        r0 = r0.top;
        r1 = r13.h;
        r1 = r1.top;
        r0 = r0 - r1;
        r1 = r13.h;
        r2 = 0;
        r1.offset(r2, r0);
        goto L_0x01e8;
    L_0x0458:
        r0 = r13.h;
        r2 = r13.h;
        r2 = r2.left;
        r3 = r13.g;
        r3 = r3.top;
        r1 = r3 - r1;
        r3 = r13.h;
        r3 = r3.height();
        r1 = r1 - r3;
        r0.offsetTo(r2, r1);
        goto L_0x0438;
    L_0x046f:
        r0 = r13.h;
        r2 = r13.h;
        r2 = r2.left;
        r3 = r13.g;
        r3 = r3.bottom;
        r1 = r1 + r3;
        r0.offsetTo(r2, r1);
        goto L_0x0438;
    L_0x047e:
        r1 = r13.h;
        r2 = r13.g;
        r2 = r2.left;
        r0 = r2 - r0;
        r2 = r13.h;
        r2 = r2.width();
        r0 = r0 - r2;
        r2 = r13.h;
        r2 = r2.top;
        r1.offsetTo(r0, r2);
        goto L_0x0438;
    L_0x0495:
        r0 = r13.g;
        r0 = r0.bottom;
        r1 = r13.h;
        r1 = r1.bottom;
        r0 = r0 - r1;
        r1 = r13.h;
        r2 = 0;
        r1.offset(r2, r0);
        goto L_0x01e8;
    L_0x04a6:
        r0 = r13.F;
        r0 = (float) r0;
        r0 = r0 - r7;
        goto L_0x0227;
        */
        throw new UnsupportedOperationException("Method not decompiled: at.grabner.circleprogress.CircleProgressView.onDraw(android.graphics.Canvas):void");
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        measuredWidth = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft <= measuredWidth) {
            measuredWidth = paddingLeft;
        }
        setMeasuredDimension((getPaddingLeft() + measuredWidth) + getPaddingRight(), (measuredWidth + getPaddingTop()) + getPaddingBottom());
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = i;
        this.a = i2;
        int min = Math.min(this.b, this.a);
        int i5 = this.b - min;
        min = this.a - min;
        float paddingTop = (float) (getPaddingTop() + (min / 2));
        float paddingBottom = (float) ((min / 2) + getPaddingBottom());
        float paddingLeft = (float) (getPaddingLeft() + (i5 / 2));
        float paddingRight = (float) (getPaddingRight() + (i5 / 2));
        int width = getWidth();
        int height = getHeight();
        float f = ((float) this.D) / 2.0f > (((float) this.E) / 2.0f) + this.G ? ((float) this.D) / 2.0f : (((float) this.E) / 2.0f) + this.G;
        this.c = new RectF(paddingLeft + f, paddingTop + f, (((float) width) - paddingRight) - f, (((float) height) - paddingBottom) - f);
        this.d = new RectF(paddingLeft + ((float) this.D), paddingTop + ((float) this.D), (((float) width) - paddingRight) - ((float) this.D), (((float) height) - paddingBottom) - ((float) this.D));
        this.f = a(this.c);
        this.j = new RectF((this.c.left + (((float) this.E) / 2.0f)) + (this.H / 2.0f), (this.c.top + (((float) this.E) / 2.0f)) + (this.H / 2.0f), (this.c.right - (((float) this.E) / 2.0f)) - (this.H / 2.0f), (this.c.bottom - (((float) this.E) / 2.0f)) - (this.H / 2.0f));
        this.i = new RectF((this.c.left - (((float) this.E) / 2.0f)) - (this.G / 2.0f), (this.c.top - (((float) this.E) / 2.0f)) - (this.G / 2.0f), (this.c.right + (((float) this.E) / 2.0f)) + (this.G / 2.0f), (this.c.bottom + (((float) this.E) / 2.0f)) + (this.G / 2.0f));
        this.e = new PointF(this.c.centerX(), this.c.centerY());
        f();
        if (this.av != null) {
            this.av = Bitmap.createScaledBitmap(this.av, getWidth(), getHeight(), false);
        }
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.ay) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
                this.aH = 0;
                a(a(new PointF(motionEvent.getX(), motionEvent.getY())) * (this.o / 360.0f), 800);
                return true;
            case 2:
                this.aH++;
                if (this.aH <= 5) {
                    return false;
                }
                setValue(a(new PointF(motionEvent.getX(), motionEvent.getY())) * (this.o / 360.0f));
                return true;
            case 3:
                this.aH = 0;
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void setAutoTextSize(boolean z) {
        this.at = z;
    }

    public void setBarColor(int... iArr) {
        this.ab = iArr;
        f();
    }

    public void setBarStrokeCap(Cap cap) {
        this.ac = cap;
        this.ae.setStrokeCap(cap);
        if (this.ac != Cap.BUTT) {
            this.af = new Paint(this.ae);
            this.af.setShader(null);
            this.af.setColor(this.ab[0]);
        }
    }

    public void setBarWidth(int i) {
        this.D = i;
        this.ae.setStrokeWidth((float) i);
        this.ag.setStrokeWidth((float) i);
    }

    public void setBlockCount(int i) {
        if (i > 1) {
            this.aA = true;
            this.aB = i;
            this.aD = 360.0f / ((float) i);
            this.aE = this.aD * this.aC;
            return;
        }
        this.aA = false;
    }

    public void setBlockScale(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.aC = f;
            this.aE = this.aD * f;
        }
    }

    @TargetApi(11)
    public void setClippingBitmap(Bitmap bitmap) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            this.av = bitmap;
        } else {
            this.av = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false);
        }
        if (this.av == null) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setDecimalFormat(DecimalFormat decimalFormat) {
        if (decimalFormat == null) {
            throw new IllegalArgumentException("decimalFormat must not be null!");
        }
        this.aK = decimalFormat;
    }

    public void setDelayMillis(int i) {
        this.x = i;
    }

    public void setDirection(g gVar) {
        this.k = gVar;
    }

    public void setFillCircleColor(int i) {
        this.T = i;
        this.ai.setColor(i);
    }

    public void setInnerContourColor(int i) {
        this.R = i;
        this.an.setColor(i);
    }

    public void setInnerContourSize(float f) {
        this.H = f;
        this.an.setStrokeWidth(f);
    }

    public void setLengthChangeInterpolator(TimeInterpolator timeInterpolator) {
        this.z.b(timeInterpolator);
    }

    public void setMaxValue(float f) {
        this.o = f;
    }

    public void setMaxValueAllowed(float f) {
        this.q = f;
    }

    public void setMinValueAllowed(float f) {
        this.p = f;
    }

    public void setOnAnimationStateChangedListener(d dVar) {
        this.B = dVar;
    }

    public void setOnProgressChangedListener(a aVar) {
        this.aI = aVar;
    }

    public void setOuterContourColor(int i) {
        this.Q = i;
        this.am.setColor(i);
    }

    public void setOuterContourSize(float f) {
        this.G = f;
        this.am.setStrokeWidth(f);
    }

    public void setRimColor(int i) {
        this.U = i;
        this.aj.setColor(i);
    }

    public void setRimShader(Shader shader) {
        this.aj.setShader(shader);
    }

    public void setRimWidth(int i) {
        this.E = i;
        this.aj.setStrokeWidth((float) i);
    }

    public void setRoundToBlock(boolean z) {
        this.aF = z;
    }

    public void setRoundToWholeNumber(boolean z) {
        this.aG = z;
    }

    public void setSeekModeEnabled(boolean z) {
        this.ay = z;
    }

    public void setShowBlock(boolean z) {
        this.aA = z;
    }

    public void setShowTextWhileSpinning(boolean z) {
        this.az = z;
    }

    public void setSpinBarColor(int i) {
        this.S = i;
        this.ag.setColor(this.S);
    }

    public void setSpinSpeed(float f) {
        this.u = f;
    }

    public void setSpinnerStrokeCap(Cap cap) {
        this.ad = cap;
        this.ag.setStrokeCap(cap);
    }

    public void setSpinningBarLength(float f) {
        this.s = f;
        this.r = f;
    }

    public void setStartAngle(int i) {
        this.F = (int) a((float) i);
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.ao = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.V = i;
        this.ak.setColor(i);
    }

    public void setTextColorAuto(boolean z) {
        this.aa = z;
    }

    public void setTextMode(i iVar) {
        this.as = iVar;
    }

    public void setTextScale(float f) {
        this.O = f;
    }

    public void setTextSize(int i) {
        this.ak.setTextSize((float) i);
        this.N = i;
        this.at = false;
    }

    public void setTextTypeface(Typeface typeface) {
        this.ak.setTypeface(typeface);
    }

    public void setUnit(String str) {
        if (str == null) {
            this.aq = "";
        } else {
            this.aq = str;
        }
        invalidate();
    }

    public void setUnitColor(int i) {
        this.W = i;
        this.al.setColor(i);
        this.aa = false;
    }

    public void setUnitPosition(j jVar) {
        this.ar = jVar;
        e();
    }

    public void setUnitScale(float f) {
        this.P = f;
    }

    public void setUnitSize(int i) {
        this.M = i;
        this.al.setTextSize((float) i);
    }

    public void setUnitTextTypeface(Typeface typeface) {
        this.al.setTypeface(typeface);
    }

    public void setUnitToTextScale(float f) {
        this.ax = f;
        e();
    }

    public void setUnitVisible(boolean z) {
        if (z != this.au) {
            this.au = z;
            e();
        }
    }

    public void setValue(float f) {
        float f2;
        if (this.aA && this.aF) {
            f2 = this.o / ((float) this.aB);
            f = ((float) Math.round(f / f2)) * f2;
        } else if (this.aG) {
            f = (float) Math.round(f);
        }
        f2 = Math.max(this.p, f);
        if (this.q >= 0.0f) {
            f2 = Math.min(this.q, f2);
        }
        Message message = new Message();
        message.what = b.c - 1;
        message.obj = new float[]{f2, f2};
        this.z.sendMessage(message);
        b(f2);
    }

    public void setValueAnimated(float f) {
        a(f, 1200);
    }

    public void setValueInterpolator(TimeInterpolator timeInterpolator) {
        this.z.a(timeInterpolator);
    }
}
