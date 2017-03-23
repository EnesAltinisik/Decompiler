package com.nightonke.boommenu.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.nightonke.boommenu.BMBShadow;
import com.nightonke.boommenu.R;
import com.nightonke.boommenu.e;
import java.util.ArrayList;

public abstract class a extends FrameLayout {
    protected Drawable A;
    protected Drawable B;
    protected Drawable C;
    protected Rect D = null;
    protected Rect E = null;
    protected int F = -1;
    protected int G = -1;
    protected int H = -1;
    protected String I;
    protected String J;
    protected String K;
    protected int L;
    protected int M;
    protected int N;
    protected Rect O = null;
    protected Rect P = null;
    protected Typeface Q;
    protected int R;
    protected int S;
    protected TruncateAt T;
    protected int U;
    protected int V = -1;
    protected int W = -1;
    protected Context a;
    protected boolean aA = true;
    protected RippleDrawable aB;
    protected StateListDrawable aC;
    protected GradientDrawable aD;
    protected ViewGroup aE;
    protected ImageView aF;
    protected TextView aG;
    protected TextView aH;
    public PointF aI;
    protected int aa = -1;
    protected String ab;
    protected String ac;
    protected String ad;
    protected int ae;
    protected int af;
    protected int ag;
    protected Rect ah = null;
    protected Rect ai = null;
    protected Typeface aj;
    protected int ak;
    protected int al;
    protected TruncateAt am;
    protected int an;
    protected int ao;
    protected int ap;
    protected int aq;
    protected int ar;
    protected boolean as = true;
    protected int at;
    protected Integer au = null;
    protected int av;
    protected Integer aw = null;
    protected int ax;
    protected Integer ay = null;
    protected boolean az = false;
    protected int b = -1;
    protected g c;
    protected h d;
    protected boolean e = true;
    protected boolean f = true;
    protected FrameLayout g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected Integer o = null;
    protected Integer p = null;
    protected boolean q = true;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    protected int v;
    protected BMBShadow w;
    protected int x = -1;
    protected int y = -1;
    protected int z = -1;

    protected a(Context context) {
        super(context);
    }

    private void setSubText(int i) {
        setSubText((String) getContext().getResources().getText(i));
    }

    private void setSubText(String str) {
        if (str != null && this.aH != null && !str.equals(this.aH.getText())) {
            this.aH.setText(str);
        }
    }

    private void setText(int i) {
        setText((String) getContext().getResources().getText(i));
    }

    private void setText(String str) {
        if (str != null && !str.equals(this.aG.getText())) {
            this.aG.setText(str);
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    protected abstract void E();

    protected abstract void F();

    public abstract void G();

    public abstract void H();

    public LayoutParams a(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        return layoutParams;
    }

    protected void a() {
        this.aE = (ViewGroup) findViewById(R.id.layout);
        this.aE.setLayoutParams(new LayoutParams(this.ar * 2, this.ar * 2));
    }

    protected void a(int i) {
        if (this.q) {
            this.w = (BMBShadow) findViewById(R.id.shadow);
            this.w.setShadowOffsetX(this.r);
            this.w.setShadowOffsetY(this.s);
            this.w.setShadowColor(this.v);
            this.w.setShadowRadius(this.t);
            this.w.setShadowCornerRadius(i);
        }
    }

    protected void a(ViewGroup viewGroup) {
        this.aG = new TextView(this.a);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(this.O.right - this.O.left, this.O.bottom - this.O.top);
        layoutParams.leftMargin = this.O.left;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.O.left);
        }
        layoutParams.topMargin = this.O.top;
        if (this.P != null) {
            this.aG.setPadding(this.P.left, this.P.top, this.P.right, this.P.bottom);
        }
        if (this.Q != null) {
            this.aG.setTypeface(this.Q);
        }
        this.aG.setMaxLines(this.R);
        this.aG.setTextSize(2, (float) this.U);
        this.aG.setGravity(this.S);
        this.aG.setEllipsize(this.T);
        if (this.T == TruncateAt.MARQUEE) {
            this.aG.setSingleLine(true);
            this.aG.setMarqueeRepeatLimit(-1);
            this.aG.setHorizontallyScrolling(true);
            this.aG.setFocusable(true);
            this.aG.setFocusableInTouchMode(true);
            this.aG.setFreezesText(true);
            post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.aG.setSelected(true);
                }
            });
        }
        viewGroup.addView(this.aG, layoutParams);
    }

    protected void a(b bVar) {
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.l = bVar.d;
        this.m = bVar.e;
        this.n = bVar.f;
        this.o = bVar.g;
        this.p = bVar.h;
        this.q = bVar.i;
        if (this.q) {
            this.r = bVar.j;
            this.s = bVar.k;
            this.t = bVar.l;
            this.u = bVar.n;
            this.v = bVar.m;
        }
        this.x = bVar.o;
        this.y = bVar.p;
        this.z = bVar.q;
        this.A = bVar.r;
        this.B = bVar.s;
        this.C = bVar.t;
        this.D = bVar.u;
        this.E = bVar.v;
        this.F = bVar.w;
        this.G = bVar.x;
        this.H = bVar.y;
        this.I = bVar.z;
        this.J = bVar.A;
        this.K = bVar.B;
        this.L = bVar.C;
        this.M = bVar.D;
        this.N = bVar.E;
        this.O = bVar.F;
        this.P = bVar.G;
        this.Q = bVar.H;
        this.R = bVar.I;
        this.S = bVar.J;
        this.T = bVar.K;
        this.U = bVar.L;
        this.V = bVar.M;
        this.W = bVar.N;
        this.aa = bVar.O;
        this.ab = bVar.P;
        this.ac = bVar.Q;
        this.ad = bVar.R;
        this.ae = bVar.S;
        this.af = bVar.T;
        this.ag = bVar.U;
        this.ah = bVar.V;
        this.ai = bVar.W;
        this.aj = bVar.X;
        this.ak = bVar.Y;
        this.al = bVar.Z;
        this.am = bVar.aa;
        this.an = bVar.ab;
        this.as = bVar.af;
        this.at = bVar.ag;
        this.au = bVar.ah;
        this.av = bVar.ai;
        this.aw = bVar.aj;
        this.ax = bVar.ak;
        this.ay = bVar.al;
        this.az = bVar.am;
        this.h = bVar.an;
        this.i = bVar.ao;
        this.j = bVar.ap;
        this.k = bVar.aq;
        boolean z = this.as && VERSION.SDK_INT >= 21;
        this.aA = z;
        this.ao = bVar.ac;
        this.ap = bVar.ad;
        this.aq = bVar.ae;
        if (bVar instanceof com.nightonke.boommenu.b.k.a) {
            int i = ((this.h * 2) + (this.r * 2)) + (this.t * 2);
            if (this.ap > i) {
                this.O = new Rect(0, ((this.s + this.t) + (this.h * 2)) + this.ao, this.ap, (((this.s + this.t) + (this.h * 2)) + this.ao) + this.aq);
            } else {
                this.O = new Rect((i - this.ap) / 2, ((this.s + this.t) + (this.h * 2)) + this.ao, ((i - this.ap) / 2) + this.ap, (((this.s + this.t) + (this.h * 2)) + this.ao) + this.aq);
            }
            this.ar = (int) (e.a(new Point((this.r + this.t) + this.h, (this.s + this.t) + this.h), new Point(this.O.right, this.O.bottom)) + 1.0f);
            if (this.ap > i) {
                this.O.offset(this.ar - (this.ap / 2), this.ar - ((this.s + this.t) + this.h));
            } else {
                this.O.offset(this.ar - ((this.r + this.t) + this.h), this.ar - ((this.s + this.t) + this.h));
            }
        }
    }

    protected void b() {
        this.aF = new ImageView(this.a);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(this.D.right - this.D.left, this.D.bottom - this.D.top);
        layoutParams.leftMargin = this.D.left;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.D.left);
        }
        layoutParams.topMargin = this.D.top;
        if (this.E != null) {
            this.aF.setPadding(this.E.left, this.E.top, this.E.right, this.E.bottom);
        }
        this.g.addView(this.aF, layoutParams);
        this.e = false;
        F();
    }

    protected void b(ViewGroup viewGroup) {
        if (this.n) {
            this.aH = new TextView(this.a);
            ViewGroup.LayoutParams layoutParams = new LayoutParams(this.ah.right - this.ah.left, this.ah.bottom - this.ah.top);
            layoutParams.leftMargin = this.ah.left;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.ah.left);
            }
            layoutParams.topMargin = this.ah.top;
            if (this.ai != null) {
                this.aH.setPadding(this.ai.left, this.ai.top, this.ai.right, this.ai.bottom);
            }
            if (this.aj != null) {
                this.aH.setTypeface(this.aj);
            }
            this.aH.setMaxLines(this.R);
            this.aH.setTextSize(2, (float) this.an);
            this.aH.setGravity(this.al);
            this.aH.setEllipsize(this.am);
            if (this.am == TruncateAt.MARQUEE) {
                this.aH.setSingleLine(true);
                this.aH.setMarqueeRepeatLimit(-1);
                this.aH.setHorizontallyScrolling(true);
                this.aH.setFocusable(true);
                this.aH.setFocusableInTouchMode(true);
                this.aH.setFreezesText(true);
                post(new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.aH.setSelected(true);
                    }
                });
            }
            viewGroup.addView(this.aH, layoutParams);
        }
    }

    @SuppressLint({"NewApi"})
    protected void c() {
        if (this.aA) {
            Drawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(w()), e.b(this.g, this.az ? x() : v()), null);
            e.a(this.g, rippleDrawable);
            this.aB = rippleDrawable;
            return;
        }
        this.aC = e.b(this.g, this.h, v(), w(), x());
        if (o()) {
            this.aD = e.b(this.g, this.az ? x() : v());
        }
        e.a(this.g, this.aC);
    }

    @SuppressLint({"NewApi"})
    protected void d() {
        this.g = (FrameLayout) findViewById(R.id.button);
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        layoutParams.width = this.h * 2;
        layoutParams.height = this.h * 2;
        this.g.setLayoutParams(layoutParams);
        this.g.setEnabled(!this.az);
        this.g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.c != null) {
                    this.a.c.a(this.a.b, this.a);
                }
                if (this.a.d != null) {
                    this.a.d.a(this.a.b);
                }
            }
        });
        c();
        this.g.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (e.a(new PointF(motionEvent.getX(), motionEvent.getY()), this.a.g)) {
                            this.a.E();
                            this.a.f = true;
                            break;
                        }
                        break;
                    case 1:
                    case 3:
                        this.a.f = false;
                        this.a.F();
                        break;
                    case 2:
                        if (!e.a(new PointF(motionEvent.getX(), motionEvent.getY()), this.a.g)) {
                            this.a.f = false;
                            this.a.F();
                            break;
                        }
                        this.a.E();
                        break;
                }
                return false;
            }
        });
    }

    @SuppressLint({"NewApi"})
    protected void e() {
        if (this.aA) {
            Drawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(w()), e.b(this.g, this.k, this.az ? x() : v()), null);
            e.a(this.g, rippleDrawable);
            this.aB = rippleDrawable;
            return;
        }
        this.aC = e.a(this.g, this.i, this.j, this.k, v(), w(), x());
        if (o()) {
            this.aD = e.b(this.g, this.k, this.az ? x() : v());
        }
        e.a(this.g, this.aC);
    }

    @SuppressLint({"NewApi"})
    protected void f() {
        this.g = (FrameLayout) findViewById(R.id.button);
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        layoutParams.width = this.i;
        layoutParams.height = this.j;
        this.g.setLayoutParams(layoutParams);
        this.g.setEnabled(!this.az);
        this.g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.c != null) {
                    this.a.c.a(this.a.b, this.a);
                }
                if (this.a.d != null) {
                    this.a.d.a(this.a.b);
                }
            }
        });
        e();
        this.g.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (e.a(new PointF(motionEvent.getX(), motionEvent.getY()), this.a.g)) {
                            this.a.E();
                            this.a.f = true;
                            break;
                        }
                        break;
                    case 1:
                    case 3:
                        this.a.f = false;
                        this.a.F();
                        break;
                    case 2:
                        if (!e.a(new PointF(motionEvent.getX(), motionEvent.getY()), this.a.g)) {
                            this.a.f = false;
                            this.a.F();
                            break;
                        }
                        this.a.E();
                        break;
                }
                return false;
            }
        });
    }

    protected void g() {
        if (this.az && this.z != -1) {
            this.aF.setImageResource(this.z);
        } else if (this.az && this.C != null) {
            this.aF.setImageDrawable(this.C);
        } else if (this.y != -1) {
            this.aF.setImageResource(this.y);
        } else if (this.B != null) {
            this.aF.setImageDrawable(this.B);
        }
    }

    protected void h() {
        if (this.az && this.z != -1) {
            this.aF.setImageResource(this.z);
        } else if (this.az && this.C != null) {
            this.aF.setImageDrawable(this.C);
        } else if (this.x != -1) {
            this.aF.setImageResource(this.x);
        } else if (this.A != null) {
            this.aF.setImageDrawable(this.A);
        }
    }

    protected void i() {
        if (this.az && this.H != -1) {
            setText(this.H);
        } else if (this.az && this.K != null) {
            setText(this.K);
        } else if (this.G != -1) {
            setText(this.G);
        } else if (this.J != null) {
            setText(this.J);
        }
        if (this.az) {
            this.aG.setTextColor(this.N);
        } else {
            this.aG.setTextColor(this.M);
        }
    }

    protected void j() {
        if (this.az && this.H != -1) {
            setText(this.H);
        } else if (this.az && this.K != null) {
            setText(this.K);
        } else if (this.F != -1) {
            setText(this.F);
        } else if (this.I != null) {
            setText(this.I);
        }
        if (this.az) {
            this.aG.setTextColor(this.N);
        } else {
            this.aG.setTextColor(this.L);
        }
    }

    protected void k() {
        if (this.az && this.aa != -1) {
            setSubText(this.aa);
        } else if (this.az && this.ad != null) {
            setSubText(this.ad);
        } else if (this.W != -1) {
            setSubText(this.W);
        } else if (this.ac != null) {
            setSubText(this.ac);
        }
        if (this.aH == null) {
            return;
        }
        if (this.az) {
            this.aH.setTextColor(this.ag);
        } else {
            this.aH.setTextColor(this.af);
        }
    }

    protected void l() {
        if (this.az && this.aa != -1) {
            setSubText(this.aa);
        } else if (this.az && this.ad != null) {
            setSubText(this.ad);
        } else if (this.V != -1) {
            setSubText(this.V);
        } else if (this.ab != null) {
            setSubText(this.ab);
        }
        if (this.aH == null) {
            return;
        }
        if (this.az) {
            this.aH.setTextColor(this.ag);
        } else {
            this.aH.setTextColor(this.ae);
        }
    }

    public int m() {
        return (this.o == null && this.p == null) ? this.az ? x() : v() : this.o == null ? e.b(this.a, this.p.intValue()) : e.a(this.a, this.p, this.o.intValue());
    }

    public int n() {
        return this.az ? x() : v();
    }

    public boolean o() {
        return this.o == null ? false : this.az ? this.o.compareTo(Integer.valueOf(x())) != 0 : this.o.compareTo(Integer.valueOf(v())) != 0;
    }

    public void p() {
        this.c = null;
    }

    public void q() {
        if (!this.aA && o()) {
            e.a(this.g, this.aD);
        }
    }

    public void r() {
        if (!this.aA && o()) {
            e.a(this.g, this.aC);
        }
    }

    public void s() {
        if (!this.aA && o()) {
            e.a(this.g, this.aD);
        }
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.g.setClickable(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.az = !z;
    }

    protected void setNonRippleButtonColor(int i) {
        this.aD.setColor(i);
    }

    protected void setRippleButtonColor(int i) {
        ((GradientDrawable) this.aB.getDrawable(0)).setColor(i);
    }

    public void t() {
    }

    public boolean u() {
        if (this.aA) {
            if (this.aB == null) {
                throw new RuntimeException("Background drawable is null!");
            }
        } else if (this.aD == null) {
            throw new RuntimeException("Background drawable is null!");
        }
        return this.aA;
    }

    protected int v() {
        return e.a(this.a, this.au, this.at);
    }

    protected int w() {
        return e.a(this.a, this.aw, this.av);
    }

    protected int x() {
        return e.a(this.a, this.ay, this.ax);
    }

    public abstract ArrayList<View> y();

    public abstract ArrayList<View> z();
}
