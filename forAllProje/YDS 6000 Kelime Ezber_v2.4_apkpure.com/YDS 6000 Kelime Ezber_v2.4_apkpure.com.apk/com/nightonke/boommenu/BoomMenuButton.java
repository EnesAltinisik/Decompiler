package com.nightonke.boommenu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.nightonke.boommenu.a.b;
import com.nightonke.boommenu.a.e;
import com.nightonke.boommenu.a.f;
import com.nightonke.boommenu.a.h;
import com.nightonke.boommenu.b.a;
import com.nightonke.boommenu.b.c;
import com.nightonke.boommenu.b.g;
import com.nightonke.boommenu.b.i;
import com.nightonke.boommenu.b.j;
import com.nightonke.boommenu.b.k;
import com.nightonke.boommenu.c.d;
import java.util.ArrayList;
import java.util.Iterator;

public class BoomMenuButton extends FrameLayout implements g {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private com.nightonke.boommenu.a.g I;
    private d J = d.Unknown;
    private int K = 0;
    private d L;
    private int M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private f T;
    private int U;
    private b V;
    private com.nightonke.boommenu.a.d W;
    private Context a;
    private ArrayList<Point> aA;
    private Float aB;
    private com.nightonke.boommenu.a.d aa;
    private com.nightonke.boommenu.a.d ab;
    private com.nightonke.boommenu.a.d ac;
    private com.nightonke.boommenu.a.d ad;
    private com.nightonke.boommenu.a.d ae;
    private int af;
    private a ag = a.DidHide;
    private ViewGroup ah;
    private ArrayList<a> ai = new ArrayList();
    private ArrayList<com.nightonke.boommenu.b.b> aj = new ArrayList();
    private float ak;
    private float al;
    private float am;
    private float an;
    private float ao;
    private float ap;
    private com.nightonke.boommenu.b.d aq = com.nightonke.boommenu.b.d.Unknown;
    private c ar = c.Center;
    private float as;
    private float at;
    private float au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private ArrayList<Point> az;
    private boolean b = true;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g = true;
    private Runnable h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private BMBShadow n;
    private int o;
    private b p = b.Unknown;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private FrameLayout v;
    private ArrayList<com.nightonke.boommenu.c.a> w;
    private ArrayList<Point> x;
    private int y;
    private int z;

    public BoomMenuButton(Context context) {
        super(context);
        a(context, null);
    }

    public BoomMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public BoomMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void A() {
        if (this.J == d.Share) {
            this.I.a(this.x, this.y, this.N, this.O, this.P, this.Q);
        }
    }

    private boolean B() {
        return VERSION.SDK_INT >= 21 && ((PowerManager) getContext().getSystemService("power")).isPowerSaveMode();
    }

    private a a(a aVar, Point point) {
        o();
        aVar.a(point.x, point.y, aVar.A(), aVar.B());
        aVar.setVisibility(4);
        this.ah.addView(aVar);
        return aVar;
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.a = context;
        LayoutInflater.from(context).inflate(R.layout.bmb, this, true);
        b(context, attributeSet);
        e();
        f();
    }

    private void a(com.nightonke.boommenu.c.a aVar, a aVar2, Point point, Point point2, int i, boolean z) {
        if (B()) {
            final com.nightonke.boommenu.c.a aVar3 = aVar;
            final a aVar4 = aVar2;
            final Point point3 = point;
            final Point point4 = point2;
            final int i2 = i;
            final boolean z2 = z;
            post(new Runnable(this) {
                final /* synthetic */ BoomMenuButton g;

                public void run() {
                    this.g.b(aVar3, aVar4, point3, point4, i2, z2);
                }
            });
            return;
        }
        b(aVar, aVar2, point, point2, i, z);
    }

    private void a(boolean z) {
        c.a(this.J, this.aq, this.p, this.V, this.aj);
        if (!s() && this.ag == a.DidHide) {
            this.ag = a.WillShow;
            if (this.L != null) {
                this.L.d();
            }
            if (this.e || this.f) {
                t();
            }
            q();
            c(z);
            e(z);
            if (this.g) {
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocus();
            }
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BoomMenuButton, 0, 0);
        if (obtainStyledAttributes != null) {
            try {
                this.c = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_cacheOptimization, R.bool.default_bmb_cacheOptimization);
                this.d = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_boomInWholeScreen, R.bool.default_bmb_boomInWholeScreen);
                this.e = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_inList, R.bool.default_bmb_inList);
                this.f = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_inFragment, R.bool.default_bmb_inFragment);
                this.g = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_backPressListened, R.bool.default_bmb_backPressListened);
                this.i = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shadowEffect, R.bool.default_bmb_shadow_effect);
                this.l = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shadowRadius, R.dimen.default_bmb_shadow_radius);
                this.j = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shadowOffsetX, R.dimen.default_bmb_shadow_offset_x);
                this.k = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shadowOffsetY, R.dimen.default_bmb_shadow_offset_y);
                this.m = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shadowColor, R.color.default_bmb_shadow_color);
                this.o = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonRadius, R.dimen.default_bmb_button_radius);
                this.p = b.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonEnum, R.integer.default_bmb_button_enum));
                this.q = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_backgroundEffect, R.bool.default_bmb_background_effect);
                this.r = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_rippleEffect, R.bool.default_bmb_ripple_effect);
                this.s = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_normalColor, R.color.default_bmb_normal_color);
                this.t = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_highlightedColor, R.color.default_bmb_highlighted_color);
                if (this.t == 0) {
                    this.t = e.a(this.s);
                }
                this.u = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_unableColor, R.color.default_bmb_unable_color);
                if (this.u == 0) {
                    this.u = e.b(this.s);
                }
                this.y = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_dotRadius, R.dimen.default_bmb_dotRadius);
                this.z = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hamWidth, R.dimen.default_bmb_hamWidth);
                this.A = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hamHeight, R.dimen.default_bmb_hamHeight);
                this.B = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_pieceHorizontalMargin, R.dimen.default_bmb_pieceHorizontalMargin);
                this.C = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_pieceVerticalMargin, R.dimen.default_bmb_pieceVerticalMargin);
                this.C = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_pieceInclinedMargin, R.dimen.default_bmb_pieceInclinedMargin);
                this.E = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_sharedLineLength, R.dimen.default_bmb_sharedLineLength);
                this.F = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shareLine1Color, R.color.default_bmb_shareLine1Color);
                this.G = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shareLine2Color, R.color.default_bmb_shareLine2Color);
                this.H = e.c(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_shareLineWidth, R.dimen.default_bmb_shareLineWidth);
                this.J = d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_piecePlaceEnum, R.integer.default_bmb_pieceEnum));
                this.M = e.e(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_dimColor, R.color.default_bmb_dimColor);
                this.N = (long) e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_showDuration, R.integer.default_bmb_showDuration);
                this.O = (long) e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_showDelay, R.integer.default_bmb_showDelay);
                this.P = (long) e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hideDuration, R.integer.default_bmb_hideDuration);
                this.Q = (long) e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hideDelay, R.integer.default_bmb_hideDelay);
                this.R = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_cancelable, R.bool.default_bmb_cancelable);
                this.S = e.b(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_autoHide, R.bool.default_bmb_autoHide);
                this.T = f.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_orderEnum, R.integer.default_bmb_orderEnum));
                this.U = e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_frames, R.integer.default_bmb_frames);
                this.V = b.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_boomEnum, R.integer.default_bmb_boomEnum));
                this.W = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_showMoveEaseEnum, R.integer.default_bmb_showMoveEaseEnum));
                this.aa = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_showScaleEaseEnum, R.integer.default_bmb_showScaleEaseEnum));
                this.ab = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_showRotateEaseEnum, R.integer.default_bmb_showRotateEaseEnum));
                this.ac = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hideMoveEaseEnum, R.integer.default_bmb_hideMoveEaseEnum));
                this.ad = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hideScaleEaseEnum, R.integer.default_bmb_hideScaleEaseEnum));
                this.ae = com.nightonke.boommenu.a.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_hideRotateEaseEnum, R.integer.default_bmb_hideRotateEaseEnum));
                this.af = e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_rotateDegree, R.integer.default_bmb_rotateDegree);
                this.aq = com.nightonke.boommenu.b.d.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonPlaceEnum, R.integer.default_bmb_buttonPlaceEnum));
                this.ar = c.a(e.a(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonPlaceAlignmentEnum, R.integer.default_bmb_buttonPlaceAlignmentEnum));
                this.as = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonHorizontalMargin, R.dimen.default_bmb_buttonHorizontalMargin);
                this.at = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonVerticalMargin, R.dimen.default_bmb_buttonVerticalMargin);
                this.au = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonInclinedMargin, R.dimen.default_bmb_buttonInclinedMargin);
                this.av = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonTopMargin, R.dimen.default_bmb_buttonTopMargin);
                this.aw = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonBottomMargin, R.dimen.default_bmb_buttonBottomMargin);
                this.ax = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonLeftMargin, R.dimen.default_bmb_buttonLeftMargin);
                this.ay = (float) e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_buttonRightMargin, R.dimen.default_bmb_buttonRightMargin);
                int d = e.d(obtainStyledAttributes, R.styleable.BoomMenuButton_bmb_bottomHamButtonTopMargin, R.dimen.default_bmb_bottomHamButtonTopMargin);
                if (d == 0) {
                    this.aB = null;
                } else {
                    this.aB = Float.valueOf((float) d);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void b(com.nightonke.boommenu.c.a aVar, a aVar2, Point point, Point point2, int i, boolean z) {
        this.K++;
        float[] fArr = new float[(this.U + 1)];
        float[] fArr2 = new float[(this.U + 1)];
        float width = (((float) aVar.getWidth()) * 1.0f) / ((float) aVar2.C());
        float height = (((float) aVar.getHeight()) * 1.0f) / ((float) aVar2.D());
        long j = z ? 1 : this.O * ((long) i);
        long j2 = z ? 1 : this.N;
        aVar2.H();
        aVar2.setScaleX(width);
        aVar2.setScaleY(height);
        aVar2.setClickable(false);
        com.nightonke.boommenu.a.a.a(this.V, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.U, point, point2, fArr, fArr2);
        if (aVar2.o()) {
            if (aVar2.u()) {
                com.nightonke.boommenu.a.a.a((Object) aVar2, "rippleButtonColor", j, j2, h.a(), aVar2.m(), aVar2.n());
            } else {
                com.nightonke.boommenu.a.a.a((Object) aVar2, "nonRippleButtonColor", j, j2, h.a(), aVar2.m(), aVar2.n());
            }
        }
        com.nightonke.boommenu.a.a.a((Object) aVar2, "x", j, j2, com.nightonke.boommenu.a.c.a(this.W), fArr);
        com.nightonke.boommenu.a.a.a((Object) aVar2, "y", j, j2, com.nightonke.boommenu.a.c.a(this.W), fArr2);
        com.nightonke.boommenu.a.a.a(aVar2, j, j2, com.nightonke.boommenu.a.c.a(this.ab), 0.0f, (float) this.af);
        float[] fArr3 = new float[2];
        com.nightonke.boommenu.a.a.a("alpha", j, j2, new float[]{0.0f, 1.0f}, com.nightonke.boommenu.a.c.a(com.nightonke.boommenu.a.d.Linear), aVar2.y());
        com.nightonke.boommenu.a.a.a((Object) aVar2, "scaleX", j, j2, com.nightonke.boommenu.a.c.a(this.aa), width, 1.0f);
        final com.nightonke.boommenu.c.a aVar3 = aVar;
        final a aVar4 = aVar2;
        com.nightonke.boommenu.a.a.a((Object) aVar2, "scaleY", j, j2, com.nightonke.boommenu.a.c.a(this.aa), new AnimatorListenerAdapter(this) {
            final /* synthetic */ BoomMenuButton c;

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                aVar4.setClickable(true);
                aVar4.r();
                this.c.K = this.c.K - 1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                e.a(4, aVar3);
                e.a(0, aVar4);
                aVar4.q();
            }
        }, height, 1.0f);
    }

    private void b(boolean z) {
        if (!s() && this.ag == a.DidShow) {
            this.ag = a.WillHide;
            if (this.L != null) {
                this.L.b();
            }
            d(z);
            f(z);
            if (this.g) {
                setFocusable(false);
                setFocusableInTouchMode(false);
            }
        }
    }

    private void c(com.nightonke.boommenu.c.a aVar, a aVar2, Point point, Point point2, int i, boolean z) {
        this.K++;
        float[] fArr = new float[(this.U + 1)];
        float[] fArr2 = new float[(this.U + 1)];
        float width = (((float) aVar.getWidth()) * 1.0f) / ((float) aVar2.C());
        float height = (((float) aVar.getHeight()) * 1.0f) / ((float) aVar2.D());
        long j = z ? 1 : this.Q * ((long) i);
        long j2 = z ? 1 : this.P;
        aVar2.setClickable(false);
        com.nightonke.boommenu.a.a.b(this.V, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.U, point, point2, fArr, fArr2);
        if (aVar2.o()) {
            if (aVar2.u()) {
                com.nightonke.boommenu.a.a.a((Object) aVar2, "rippleButtonColor", j, j2, e.a(), aVar2.n(), aVar2.m());
            } else {
                com.nightonke.boommenu.a.a.a((Object) aVar2, "nonRippleButtonColor", j, j2, e.a(), aVar2.n(), aVar2.m());
            }
        }
        com.nightonke.boommenu.a.a.a((Object) aVar2, "x", j, j2, com.nightonke.boommenu.a.c.a(this.ac), fArr);
        com.nightonke.boommenu.a.a.a((Object) aVar2, "y", j, j2, com.nightonke.boommenu.a.c.a(this.ac), fArr2);
        com.nightonke.boommenu.a.a.a(aVar2, j, j2, com.nightonke.boommenu.a.c.a(this.ae), 0.0f, (float) this.af);
        float[] fArr3 = new float[2];
        com.nightonke.boommenu.a.a.a("alpha", j, j2, new float[]{1.0f, 0.0f}, com.nightonke.boommenu.a.c.a(com.nightonke.boommenu.a.d.Linear), aVar2.y());
        com.nightonke.boommenu.a.a.a((Object) aVar2, "scaleX", j, j2, com.nightonke.boommenu.a.c.a(this.ad), 1.0f, width);
        final a aVar3 = aVar2;
        final com.nightonke.boommenu.c.a aVar4 = aVar;
        com.nightonke.boommenu.a.a.a((Object) aVar2, "scaleY", j, j2, com.nightonke.boommenu.a.c.a(this.ad), new AnimatorListenerAdapter(this) {
            final /* synthetic */ BoomMenuButton c;

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                e.a(0, aVar4);
                e.a(4, aVar3);
                aVar3.t();
                aVar3.p();
                this.c.K = this.c.K - 1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                aVar3.s();
            }
        }, 1.0f, height);
    }

    private void c(boolean z) {
        o();
        e.a(0, this.ah);
        com.nightonke.boommenu.a.a.a(this.ah, "backgroundColor", 0, z ? 1 : this.N + (this.O * ((long) (this.w.size() - 1))), new ArgbEvaluator(), new AnimatorListenerAdapter(this) {
            final /* synthetic */ BoomMenuButton a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.a.ag = a.DidShow;
                if (this.a.L != null) {
                    this.a.L.e();
                }
            }
        }, 0, this.M);
        if (this.J == d.Share) {
            com.nightonke.boommenu.a.a.a(this.I, "showProcess", 0, z ? 1 : this.N + (this.O * ((long) (this.w.size() - 1))), com.nightonke.boommenu.a.c.a(com.nightonke.boommenu.a.d.Linear), 0.0f, 1.0f);
        }
    }

    private void d(boolean z) {
        o();
        com.nightonke.boommenu.a.a.a(this.ah, "backgroundColor", 0, z ? 1 : this.P + (this.Q * ((long) (this.w.size() - 1))), new ArgbEvaluator(), new AnimatorListenerAdapter(this) {
            final /* synthetic */ BoomMenuButton a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.a.ag = a.DidHide;
                if (this.a.L != null) {
                    this.a.L.c();
                }
                this.a.v();
            }
        }, this.M, 0);
        if (this.J == d.Share) {
            com.nightonke.boommenu.a.a.a(this.I, "hideProcess", 0, z ? 1 : this.P + (this.Q * ((long) (this.w.size() - 1))), com.nightonke.boommenu.a.c.a(com.nightonke.boommenu.a.d.Linear), 0.0f, 1.0f);
        }
    }

    private void e() {
        if (this.n == null) {
            this.n = (BMBShadow) findViewById(R.id.shadow);
        }
        boolean z = this.i && this.q && !this.e;
        this.n.setShadowEffect(z);
        if (z) {
            this.n.setShadowOffsetX(this.j);
            this.n.setShadowOffsetY(this.k);
            this.n.setShadowColor(this.m);
            this.n.setShadowRadius(this.l);
            this.n.setShadowCornerRadius(this.l + this.o);
            return;
        }
        this.n.a();
    }

    private void e(boolean z) {
        if (this.ah != null) {
            this.ah.removeAllViews();
        }
        u();
        ArrayList a = this.J == d.Share ? com.nightonke.boommenu.a.a.a(f.DEFAULT, this.w.size()) : com.nightonke.boommenu.a.a.a(this.T, this.w.size());
        for (int size = a.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) a.get(size)).intValue();
            a aVar = (a) this.ai.get(intValue);
            Point point = new Point((int) (((float) ((Point) this.az.get(intValue)).x) - aVar.aI.x), (int) (((float) ((Point) this.az.get(intValue)).y) - aVar.aI.y));
            a(aVar, point);
            a((com.nightonke.boommenu.c.a) this.w.get(intValue), aVar, point, new Point((Point) this.aA.get(intValue)), size, z);
        }
    }

    private void f() {
        if (this.v == null) {
            this.v = (FrameLayout) findViewById(R.id.button);
        }
        this.v.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BoomMenuButton a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.a();
            }
        });
        g();
        h();
    }

    private void f(boolean z) {
        ArrayList a = this.J == d.Share ? com.nightonke.boommenu.a.a.a(f.REVERSE, this.w.size()) : com.nightonke.boommenu.a.a.a(this.T, this.w.size());
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((a) this.ai.get(((Integer) it.next()).intValue())).bringToFront();
        }
        for (int i = 0; i < a.size(); i++) {
            int intValue = ((Integer) a.get(i)).intValue();
            a aVar = (a) this.ai.get(intValue);
            c((com.nightonke.boommenu.c.a) this.w.get(intValue), aVar, new Point((Point) this.aA.get(intValue)), new Point((int) (((float) ((Point) this.az.get(intValue)).x) - aVar.aI.x), (int) (((float) ((Point) this.az.get(intValue)).y) - aVar.aI.y)), i, z);
        }
    }

    private void g() {
        LayoutParams layoutParams = (LayoutParams) this.v.getLayoutParams();
        layoutParams.width = this.o * 2;
        layoutParams.height = this.o * 2;
        this.v.setLayoutParams(layoutParams);
    }

    private ViewGroup getParentView() {
        if (!this.d) {
            return (ViewGroup) getParent();
        }
        Activity a = e.a(this.a);
        return a == null ? (ViewGroup) getParent() : (ViewGroup) a.getWindow().getDecorView();
    }

    private void h() {
        if (!this.q || this.e) {
            if (VERSION.SDK_INT >= 21) {
                e.a(this.v, e.a(this.a, 16843868));
            } else {
                e.a(this.v, e.a(this.a, 16843534));
            }
        } else if (!this.r || VERSION.SDK_INT < 21) {
            e.a(this.v, e.b(this.v, this.o, this.s, this.t, this.u));
        } else {
            e.a(this.v, new RippleDrawable(ColorStateList.valueOf(this.t), e.b(this.v, this.s), null));
        }
    }

    private void i() {
        c.a(this.J, this.aq, this.p, this.V, this.aj);
        j();
        k();
        z();
        l();
        m();
        if (!(this.e || this.f)) {
            t();
        }
        A();
    }

    private void j() {
        this.v.removeAllViews();
        if (this.w != null) {
            this.w.clear();
        }
    }

    private void k() {
        n();
        int y = y();
        this.w = new ArrayList(y);
        for (int i = 0; i < y; i++) {
            this.w.add(com.nightonke.boommenu.c.e.a(this.a, this.J, ((com.nightonke.boommenu.b.b) this.aj.get(i)).a(this.a)));
        }
    }

    private void l() {
        ArrayList a = this.J == d.Share ? com.nightonke.boommenu.a.a.a(f.DEFAULT, this.w.size()) : com.nightonke.boommenu.a.a.a(this.T, this.w.size());
        for (int size = a.size() - 1; size >= 0; size--) {
            this.v.addView((View) this.w.get(((Integer) a.get(size)).intValue()));
        }
    }

    private void m() {
        int i;
        int i2;
        int y = y();
        switch (this.J) {
            case DOT_1:
            case DOT_2_1:
            case DOT_2_2:
            case DOT_3_1:
            case DOT_3_2:
            case DOT_3_3:
            case DOT_3_4:
            case DOT_4_1:
            case DOT_4_2:
            case DOT_5_1:
            case DOT_5_2:
            case DOT_5_3:
            case DOT_5_4:
            case DOT_6_1:
            case DOT_6_2:
            case DOT_6_3:
            case DOT_6_4:
            case DOT_6_5:
            case DOT_6_6:
            case DOT_7_1:
            case DOT_7_2:
            case DOT_7_3:
            case DOT_7_4:
            case DOT_7_5:
            case DOT_7_6:
            case DOT_8_1:
            case DOT_8_2:
            case DOT_8_3:
            case DOT_8_4:
            case DOT_8_5:
            case DOT_8_6:
            case DOT_8_7:
            case DOT_9_1:
            case DOT_9_2:
            case DOT_9_3:
            case Share:
                i = this.y * 2;
                i2 = this.y * 2;
                break;
            case HAM_1:
            case HAM_2:
            case HAM_3:
            case HAM_4:
            case HAM_5:
            case HAM_6:
                int i3 = this.z;
                i = this.A;
                i2 = i3;
                break;
            default:
                throw new RuntimeException("Unknown piece-place-enum!");
        }
        for (int i4 = 0; i4 < y; i4++) {
            ((com.nightonke.boommenu.c.a) this.w.get(i4)).a(((Point) this.x.get(i4)).x, ((Point) this.x.get(i4)).y, i2, i);
        }
    }

    private void n() {
        switch (this.p) {
            case SimpleCircle:
            case TextInsideCircle:
            case TextOutsideCircle:
                if (this.J == d.Share) {
                    this.x = com.nightonke.boommenu.c.e.a(new Point(this.v.getWidth(), this.v.getHeight()), this.y, this.aj.size(), this.E);
                    return;
                } else {
                    this.x = com.nightonke.boommenu.c.e.a(this.J, new Point(this.v.getWidth(), this.v.getHeight()), this.y, this.B, this.C, this.D);
                    return;
                }
            case Ham:
                this.x = com.nightonke.boommenu.c.e.a(this.J, new Point(this.v.getWidth(), this.v.getHeight()), this.z, this.A, this.C);
                return;
            case Unknown:
                throw new RuntimeException("The button-enum is unknown!");
            default:
                return;
        }
    }

    private void o() {
        if (this.ah == null) {
            ViewGroup parentView = getParentView();
            this.ah = new FrameLayout(this.a);
            this.ah.setLayoutParams(new ViewGroup.LayoutParams(parentView.getWidth(), parentView.getHeight()));
            this.ah.setBackgroundColor(0);
            this.ah.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ BoomMenuButton a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.r();
                }
            });
            this.ah.setMotionEventSplittingEnabled(false);
            parentView.addView(this.ah);
        }
    }

    private void p() {
        e.a(8, this.ah);
        if (!this.c || this.e || this.f) {
            this.ah.removeAllViews();
            ((ViewGroup) this.ah.getParent()).removeView(this.ah);
            this.ah = null;
        }
    }

    private void q() {
        this.ai = new ArrayList(this.w.size());
        int size = this.w.size();
        int i;
        switch (this.p) {
            case SimpleCircle:
                for (i = 0; i < size; i++) {
                    i.a aVar = (i.a) this.aj.get(i);
                    aVar.a((g) this).a(i);
                    this.ai.add(aVar.b(this.a));
                    this.ak = (float) aVar.a();
                }
                return;
            case TextInsideCircle:
                for (i = 0; i < size; i++) {
                    j.a aVar2 = (j.a) this.aj.get(i);
                    aVar2.a((g) this).a(i);
                    this.ai.add(aVar2.b(this.a));
                    this.al = (float) aVar2.a();
                }
                return;
            case TextOutsideCircle:
                for (i = 0; i < size; i++) {
                    k.a aVar3 = (k.a) this.aj.get(i);
                    aVar3.a((g) this).a(i);
                    this.ai.add(aVar3.b(this.a));
                    this.am = (float) aVar3.a();
                    this.an = (float) aVar3.b();
                }
                return;
            case Ham:
                for (i = 0; i < size; i++) {
                    com.nightonke.boommenu.b.f.a aVar4 = (com.nightonke.boommenu.b.f.a) this.aj.get(i);
                    aVar4.a((g) this).a(i);
                    this.ai.add(aVar4.b(this.a));
                    this.ao = (float) aVar4.a();
                    this.ap = (float) aVar4.b();
                }
                return;
            default:
                return;
        }
    }

    private void r() {
        if (!s()) {
            if (this.L != null) {
                this.L.a();
            }
            if (this.R) {
                c();
            }
        }
    }

    private boolean s() {
        return this.K != 0;
    }

    private void t() {
        this.az = new ArrayList(y());
        int[] iArr = new int[2];
        getParentView().getLocationOnScreen(iArr);
        for (int i = 0; i < this.w.size(); i++) {
            Point point = new Point();
            int[] iArr2 = new int[2];
            this.v.getLocationOnScreen(iArr2);
            point.x = (((com.nightonke.boommenu.c.a) this.w.get(i)).getLayoutParams().width / 2) + ((((Point) this.x.get(i)).x + iArr2[0]) - iArr[0]);
            point.y = (((com.nightonke.boommenu.c.a) this.w.get(i)).getLayoutParams().height / 2) + ((((Point) this.x.get(i)).y + iArr2[1]) - iArr[1]);
            this.az.add(point);
        }
    }

    private void u() {
        switch (this.p) {
            case SimpleCircle:
                this.aA = com.nightonke.boommenu.b.e.a(this.aq, this.ar, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.ak, this.aj.size(), this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay);
                break;
            case TextInsideCircle:
                this.aA = com.nightonke.boommenu.b.e.a(this.aq, this.ar, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.al, this.aj.size(), this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay);
                break;
            case TextOutsideCircle:
                this.aA = com.nightonke.boommenu.b.e.a(this.aq, this.ar, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.am, this.an, this.aj.size(), this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay);
                break;
            case Ham:
                this.aA = com.nightonke.boommenu.b.e.a(this.aq, this.ar, new Point(this.ah.getLayoutParams().width, this.ah.getLayoutParams().height), this.ao, this.ap, this.aj.size(), this.as, this.at, this.av, this.aw, this.ax, this.ay, this.aB);
                break;
        }
        for (int i = 0; i < this.ai.size(); i++) {
            Point point = (Point) this.aA.get(i);
            point.x = (int) (((float) point.x) - ((a) this.ai.get(i)).aI.x);
            point = (Point) this.aA.get(i);
            point.y = (int) (((float) point.y) - ((a) this.ai.get(i)).aI.y);
        }
    }

    private void v() {
        p();
        if (!this.c || this.e || this.f) {
            this.aA.clear();
            this.aA = null;
            this.ai.clear();
            this.ai = new ArrayList();
        }
    }

    private void w() {
        if (!this.b) {
            this.b = true;
            if (VERSION.SDK_INT < 18) {
                requestLayout();
            } else if (!isInLayout()) {
                requestLayout();
            }
        }
    }

    private void x() {
        if (this.h == null) {
            this.h = new Runnable(this) {
                final /* synthetic */ BoomMenuButton a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.i();
                }
            };
        }
        post(this.h);
    }

    private int y() {
        return this.J == d.Share ? this.aj.size() : this.J.a();
    }

    private void z() {
        if (this.J == d.Share) {
            this.I = new com.nightonke.boommenu.a.g(this.a);
            this.I.setLine1Color(this.F);
            this.I.setLine2Color(this.G);
            this.I.setLineWidth(this.H);
            this.v.addView(this.I);
            this.I.a(0, 0, this.v.getWidth(), this.v.getHeight());
        }
    }

    public void a() {
        a(false);
    }

    public void a(int i, a aVar) {
        if (!s()) {
            if (this.L != null) {
                this.L.a(i, aVar);
            }
            if (this.S) {
                c();
            }
        }
    }

    public void a(com.nightonke.boommenu.b.b bVar) {
        this.aj.add(bVar);
        w();
    }

    public void b() {
        a(true);
    }

    public void c() {
        b(false);
    }

    public void d() {
        this.aj.clear();
    }

    public b getBoomEnum() {
        return this.V;
    }

    public float getBottomHamButtonTopMargin() {
        return this.aB.floatValue();
    }

    public ArrayList<com.nightonke.boommenu.b.b> getBuilders() {
        return this.aj;
    }

    public float getButtonBottomMargin() {
        return this.aw;
    }

    public b getButtonEnum() {
        return this.p;
    }

    public float getButtonHorizontalMargin() {
        return this.as;
    }

    public float getButtonInclinedMargin() {
        return this.au;
    }

    public float getButtonLeftMargin() {
        return this.ax;
    }

    public c getButtonPlaceAlignmentEnum() {
        return this.ar;
    }

    public com.nightonke.boommenu.b.d getButtonPlaceEnum() {
        return this.aq;
    }

    public int getButtonRadius() {
        return this.o;
    }

    public float getButtonRightMargin() {
        return this.ay;
    }

    public float getButtonTopMargin() {
        return this.av;
    }

    public float getButtonVerticalMargin() {
        return this.at;
    }

    public int getDimColor() {
        return this.M;
    }

    public int getDotRadius() {
        return this.y;
    }

    public int getFrames() {
        return this.U;
    }

    public int getHamHeight() {
        return this.A;
    }

    public int getHamWidth() {
        return this.z;
    }

    public long getHideDelay() {
        return this.Q;
    }

    public long getHideDuration() {
        return this.P;
    }

    public com.nightonke.boommenu.a.d getHideMoveEaseEnum() {
        return this.ac;
    }

    public com.nightonke.boommenu.a.d getHideRotateEaseEnum() {
        return this.ae;
    }

    public com.nightonke.boommenu.a.d getHideScaleEaseEnum() {
        return this.ad;
    }

    public int getHighlightedColor() {
        return this.t;
    }

    public int getNormalColor() {
        return this.s;
    }

    public d getOnBoomListener() {
        return this.L;
    }

    public f getOrderEnum() {
        return this.T;
    }

    public int getPieceHorizontalMargin() {
        return this.B;
    }

    public int getPieceInclinedMargin() {
        return this.D;
    }

    public d getPiecePlaceEnum() {
        return this.J;
    }

    public int getPieceVerticalMargin() {
        return this.C;
    }

    public int getRotateDegree() {
        return this.af;
    }

    public int getShadowColor() {
        return this.m;
    }

    public int getShadowOffsetX() {
        return this.j;
    }

    public int getShadowOffsetY() {
        return this.k;
    }

    public int getShadowRadius() {
        return this.l;
    }

    public int getShareLine1Color() {
        return this.F;
    }

    public int getShareLine2Color() {
        return this.G;
    }

    public int getShareLineLength() {
        return this.E;
    }

    public int getShareLineWidth() {
        return this.H;
    }

    public long getShowDelay() {
        return this.O;
    }

    public long getShowDuration() {
        return this.N;
    }

    public com.nightonke.boommenu.a.d getShowMoveEaseEnum() {
        return this.W;
    }

    public com.nightonke.boommenu.a.d getShowRotateEaseEnum() {
        return this.ab;
    }

    public com.nightonke.boommenu.a.d getShowScaleEaseEnum() {
        return this.aa;
    }

    public int getUnableColor() {
        return this.u;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i || !this.g || (this.ag != a.WillShow && this.ag != a.DidShow)) {
            return super.onKeyDown(i, keyEvent);
        }
        c();
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b) {
            x();
        }
        this.b = false;
    }

    public void setAutoHide(boolean z) {
        this.S = z;
    }

    public void setBackPressListened(boolean z) {
        this.g = z;
    }

    public void setBackgroundEffect(boolean z) {
        this.q = z;
        h();
        w();
    }

    public void setBoomEnum(b bVar) {
        this.V = bVar;
    }

    public void setBoomInWholeScreen(boolean z) {
        this.d = z;
    }

    public void setBottomHamButtonTopMargin(float f) {
        this.aB = Float.valueOf(f);
    }

    public void setBuilders(ArrayList<com.nightonke.boommenu.b.b> arrayList) {
        this.aj = arrayList;
        w();
    }

    public void setButtonBottomMargin(float f) {
        this.aw = f;
    }

    public void setButtonEnum(b bVar) {
        this.p = bVar;
        w();
        d();
    }

    public void setButtonHorizontalMargin(float f) {
        this.as = f;
    }

    public void setButtonInclinedMargin(float f) {
        this.au = f;
    }

    public void setButtonLeftMargin(float f) {
        this.ax = f;
    }

    public void setButtonPlaceAlignmentEnum(c cVar) {
        this.ar = cVar;
    }

    public void setButtonPlaceEnum(com.nightonke.boommenu.b.d dVar) {
        this.aq = dVar;
    }

    public void setButtonRadius(int i) {
        this.o = i;
        f();
        w();
    }

    public void setButtonRightMargin(float f) {
        this.ay = f;
    }

    public void setButtonTopMargin(float f) {
        this.av = f;
    }

    public void setButtonVerticalMargin(float f) {
        this.at = f;
        this.aB = null;
    }

    public void setCacheOptimization(boolean z) {
        this.c = z;
    }

    public void setCancelable(boolean z) {
        this.R = z;
    }

    public void setDimColor(int i) {
        this.M = i;
    }

    public void setDotRadius(int i) {
        this.y = i;
        w();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.v.setEnabled(z);
        h();
    }

    public void setFrames(int i) {
        this.U = i;
    }

    public void setHamHeight(int i) {
        this.A = i;
        w();
    }

    public void setHamWidth(int i) {
        this.z = i;
        w();
    }

    public void setHideDelay(long j) {
        this.Q = j;
        A();
    }

    public void setHideDuration(long j) {
        this.P = j;
        A();
    }

    public void setHideMoveEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.ac = dVar;
    }

    public void setHideRotateEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.ae = dVar;
    }

    public void setHideScaleEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.ad = dVar;
    }

    public void setHighlightedColor(int i) {
        this.t = i;
        h();
        w();
    }

    public void setInFragment(boolean z) {
        this.f = z;
    }

    public void setInList(boolean z) {
        this.e = z;
    }

    public void setNormalColor(int i) {
        this.s = i;
        h();
        w();
    }

    public void setOnBoomListener(d dVar) {
        this.L = dVar;
    }

    public void setOrderEnum(f fVar) {
        this.T = fVar;
    }

    public void setPieceHorizontalMargin(int i) {
        this.B = i;
        w();
    }

    public void setPieceInclinedMargin(int i) {
        this.D = i;
        w();
    }

    public void setPiecePlaceEnum(d dVar) {
        this.J = dVar;
        w();
    }

    public void setPieceVerticalMargin(int i) {
        this.C = i;
        w();
    }

    public void setRippleEffect(boolean z) {
        this.r = z;
        h();
        w();
    }

    public void setRotateDegree(int i) {
        this.af = i;
    }

    public void setShadowColor(int i) {
        this.m = i;
        e();
    }

    public void setShadowEffect(boolean z) {
        this.i = z;
        e();
    }

    public void setShadowOffsetX(int i) {
        this.j = i;
        e();
    }

    public void setShadowOffsetY(int i) {
        this.k = i;
        e();
    }

    public void setShadowRadius(int i) {
        this.l = i;
        e();
    }

    public void setShareLine1Color(int i) {
        this.F = i;
    }

    public void setShareLine2Color(int i) {
        this.G = i;
    }

    public void setShareLineLength(int i) {
        this.E = i;
    }

    public void setShareLineWidth(int i) {
        this.H = i;
    }

    public void setShowDelay(long j) {
        this.O = j;
        A();
    }

    public void setShowDuration(long j) {
        this.N = j;
        A();
    }

    public void setShowMoveEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.W = dVar;
    }

    public void setShowRotateEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.ab = dVar;
    }

    public void setShowScaleEaseEnum(com.nightonke.boommenu.a.d dVar) {
        this.aa = dVar;
    }

    public void setUnableColor(int i) {
        this.u = i;
        h();
        w();
    }
}
