package com.gigamole.infinitecycleviewpager;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.ViewPager.g;
import android.support.v4.view.ViewPager.j;
import android.support.v4.view.aa;
import android.support.v4.view.ah;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;

class a implements a {
    private boolean A = false;
    private boolean B;
    private int C;
    private Interpolator D;
    private boolean E;
    private boolean F;
    private final Handler G = new Handler();
    private final Runnable H = new Runnable(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.E) {
                this.a.c.setCurrentItem((this.a.F ? 1 : -1) + this.a.k());
                this.a.G.postDelayed(this, (long) this.a.C);
            }
        }
    };
    protected final f a = new j(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void a(int i) {
            this.a.t = i;
        }

        public void a(int i, float f, int i2) {
            this.a.j = 0;
            if (this.a.t != 2 || this.a.q) {
                if (this.a.g == b.IDLE && f > 0.0f) {
                    this.a.i = (float) this.a.c.getCurrentItem();
                    this.a.g = ((float) i) == this.a.i ? b.GOING_LEFT : b.GOING_RIGHT;
                }
                boolean z = ((float) i) == this.a.i;
                if (this.a.g == b.GOING_LEFT && !z) {
                    this.a.g = b.GOING_RIGHT;
                } else if (this.a.g == b.GOING_RIGHT && z) {
                    this.a.g = b.GOING_LEFT;
                }
            }
            if (this.a.h <= f) {
                this.a.f = b.GOING_LEFT;
            } else {
                this.a.f = b.GOING_RIGHT;
            }
            this.a.h = f;
            if (this.a.e(f)) {
                f = 0.0f;
            }
            if (f == 0.0f) {
                this.a.p();
                this.a.f = b.IDLE;
                this.a.g = b.IDLE;
                this.a.n = false;
                this.a.o = false;
                this.a.l = false;
                this.a.m = false;
                this.a.q = false;
            }
        }
    };
    private Context b;
    private f c;
    private View d;
    private b e;
    private b f = b.IDLE;
    private b g = b.IDLE;
    private float h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final Rect p = new Rect();
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private d u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    protected class a implements g {
        final /* synthetic */ a a;

        protected a(a aVar) {
            this.a = aVar;
        }

        public void a(View view, float f) {
            float j;
            if (this.a.u != null) {
                this.a.u.a(view, f);
            }
            this.a.a(view);
            if (this.a.k == 3) {
                if (f > 2.0f || f < -2.0f || ((this.a.j != 0 && f > 1.0f) || (this.a.j != 0 && f < -1.0f))) {
                    view.setVisibility(8);
                    return;
                }
                view.setVisibility(0);
            }
            float measuredHeight = this.a.B ? (float) view.getMeasuredHeight() : (float) view.getMeasuredWidth();
            float j2 = measuredHeight * this.a.x;
            float k = measuredHeight * this.a.z;
            float f2 = (measuredHeight - j2) * 0.5f;
            float l = (measuredHeight - (this.a.y * measuredHeight)) * 0.5f;
            float j3 = 0.5f * (measuredHeight - ((this.a.x + this.a.z) * measuredHeight));
            if (this.a.k < 4 && this.a.j == 0 && f > -2.0f && f < -1.0f) {
                j3 = -1.0f - f;
                j = this.a.x;
                measuredHeight = ((((measuredHeight * 2.0f) - j2) - (this.a.v * 2.0f)) * j3) + ((measuredHeight - f2) + this.a.v);
                this.a.j = this.a.j + 1;
            } else if (this.a.k > 3 && f >= -2.0f && f < -1.0f) {
                j3 = (1.0f + f) + 1.0f;
                j = this.a.x;
                measuredHeight = (2.0f * measuredHeight) - (((measuredHeight + f2) - this.a.v) * j3);
            } else if (f >= -1.0f && f <= -0.5f) {
                j2 = ((0.5f + f) * 2.0f) + 1.0f;
                j = 1.0f - j2;
                if (this.a.A) {
                    measuredHeight = ((measuredHeight - k) - l) + this.a.v;
                    j = (this.a.x + this.a.z) - (j * this.a.z);
                    measuredHeight -= ((measuredHeight - j3) + this.a.w) * j2;
                } else {
                    measuredHeight = (measuredHeight - f2) + this.a.v;
                    j = this.a.y - (j * (this.a.y - this.a.x));
                    measuredHeight -= ((measuredHeight - l) + this.a.w) * j2;
                }
            } else if (f >= -0.5f && f <= 0.0f) {
                j2 = (-f) * 2.0f;
                j = this.a.y - (this.a.A ? this.a.z * j2 : 0.0f);
                measuredHeight = ((this.a.A ? j3 : l) - this.a.w) * j2;
            } else if (f >= 0.0f && f <= 0.5f) {
                j = f * 2.0f;
                measuredHeight = !this.a.A ? this.a.y : ((1.0f - j) * this.a.z) + (this.a.x + this.a.z);
                if (!this.a.A) {
                    j3 = l;
                }
                float p = j * ((-j3) + this.a.w);
                j = measuredHeight;
                measuredHeight = p;
            } else if (f >= 0.5f && f <= 1.0f) {
                j2 = 2.0f * (f - 0.5f);
                j = 1.0f - j2;
                if (this.a.A) {
                    j = (j * this.a.z) + this.a.x;
                    measuredHeight = (((((((-measuredHeight) + k) + l) + j3) - this.a.v) - this.a.w) * j2) + ((-j3) + this.a.w);
                } else {
                    j = (j * (this.a.y - this.a.x)) + this.a.x;
                    measuredHeight = ((((((-measuredHeight) + l) + f2) - this.a.v) - this.a.w) * j2) + ((-l) + this.a.w);
                }
            } else if (this.a.k > 3 && f > 1.0f && f <= 2.0f) {
                j3 = 1.0f - (1.0f + (f - 1.0f));
                j = this.a.x;
                measuredHeight = (((measuredHeight + f2) - this.a.v) * j3) + (-((measuredHeight - f2) + this.a.v));
            } else if (this.a.k >= 4 || this.a.j != 0 || f <= 1.0f || f >= 2.0f) {
                j = this.a.x;
                measuredHeight = 0.0f;
            } else {
                j3 = 1.0f - f;
                j = this.a.x;
                measuredHeight = ((((measuredHeight * 2.0f) - j2) - (this.a.v * 2.0f)) * j3) + (-((measuredHeight - f2) + this.a.v));
                this.a.j = this.a.j + 1;
            }
            ah.d(view, j);
            ah.e(view, j);
            if (this.a.B) {
                ah.b(view, measuredHeight);
            } else {
                ah.a(view, measuredHeight);
            }
            Object obj = null;
            if (this.a.k == 2) {
                this.a.l = true;
            }
            switch (this.a.g) {
                case GOING_LEFT:
                    this.a.l = false;
                    if (this.a.f != b.GOING_LEFT) {
                        if (this.a.h < 0.5f && f > -0.5f && f <= 0.0f) {
                            obj = 1;
                            break;
                        }
                    } else if (f > -0.5f && f <= 0.0f) {
                        if (!this.a.m) {
                            this.a.m = true;
                            obj = 1;
                            break;
                        }
                    } else if (f < 0.0f || f >= 0.5f) {
                        if (f > 0.5f && f < 1.0f && !this.a.m && this.a.c.getChildCount() > 3) {
                            obj = 1;
                            break;
                        }
                    } else {
                        obj = 1;
                        break;
                    }
                    break;
                case GOING_RIGHT:
                    this.a.m = false;
                    if (this.a.f != b.GOING_RIGHT) {
                        if (this.a.h > 0.5f && f >= 0.0f && f < 0.5f) {
                            obj = 1;
                            break;
                        }
                    } else if (f >= 0.0f && f < 0.5f) {
                        if (!this.a.l) {
                            this.a.l = true;
                            obj = 1;
                            break;
                        }
                    } else if (f <= -0.5f || f > 0.0f) {
                        if (f > -1.0f && f < -0.5f && !this.a.l && this.a.c.getChildCount() > 3) {
                            obj = 1;
                            break;
                        }
                    } else {
                        obj = 1;
                        break;
                    }
                    break;
                default:
                    if (this.a.s) {
                        this.a.l = false;
                        this.a.m = false;
                    } else {
                        if (!this.a.o && f == 1.0f) {
                            this.a.o = true;
                        } else if (this.a.o && f == -1.0f) {
                            this.a.l = true;
                        } else if ((!this.a.o && f == -1.0f) || (this.a.o && this.a.l && f == -2.0f)) {
                            this.a.l = false;
                        }
                        if (!this.a.n && f == -1.0f) {
                            this.a.n = true;
                        } else if (this.a.n && f == 1.0f) {
                            this.a.m = true;
                        } else if ((!this.a.n && f == 1.0f) || (this.a.n && this.a.m && f == 2.0f)) {
                            this.a.m = false;
                        }
                    }
                    if (f == 0.0f) {
                        obj = 1;
                        break;
                    }
                    break;
            }
            if (obj != null) {
                view.bringToFront();
                this.a.d.invalidate();
            }
            if (this.a.u != null) {
                this.a.u.b(view, f);
            }
        }
    }

    private enum b {
        IDLE,
        GOING_LEFT,
        GOING_RIGHT
    }

    private final class c implements Interpolator {
        final /* synthetic */ a a;

        private c(a aVar) {
            this.a = aVar;
        }

        public float getInterpolation(float f) {
            return (float) ((Math.pow(2.0d, (double) (-10.0f * f)) * Math.sin((((double) (f - 0.125f)) * 6.283185307179586d) / 0.5d)) + 1.0d);
        }
    }

    public a(Context context, f fVar, AttributeSet attributeSet) {
        this.b = context;
        this.B = fVar instanceof e;
        this.c = fVar;
        this.d = (View) fVar;
        this.c.a(false, i());
        this.c.a(this.a);
        this.c.setClipChildren(false);
        this.c.setDrawingCacheEnabled(false);
        this.c.setWillNotCacheDrawing(true);
        this.c.setPageMargin(0);
        this.c.setOffscreenPageLimit(2);
        this.c.setOverScrollMode(2);
        q();
        a(attributeSet);
    }

    private void a(View view) {
        int i = VERSION.SDK_INT > 19 ? 0 : 2;
        if (view.getLayerType() != i) {
            view.setLayerType(i, null);
        }
    }

    private void c(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.p.set(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
        } else if (motionEvent.getAction() == 2 && !this.p.contains(this.d.getLeft() + ((int) motionEvent.getX()), this.d.getTop() + ((int) motionEvent.getY()))) {
            motionEvent.setAction(1);
        }
    }

    private boolean e(float f) {
        return Math.abs(f) < 1.0E-4f;
    }

    private void p() {
        if (VERSION.SDK_INT <= 19) {
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt.getLayerType() != 0) {
                    childAt.setLayerType(0, null);
                }
            }
        }
    }

    private void q() {
        if (this.c != null) {
            try {
                Field declaredField = this.B ? e.class.getDeclaredField("m") : ViewPager.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                c cVar = new c(this.b, this.D);
                cVar.a(this.C);
                declaredField.set(this.c, cVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void r() {
        this.z = (this.y - this.x) * 0.5f;
    }

    public float a() {
        return this.v;
    }

    public aa a(aa aaVar) {
        if (aaVar != null && aaVar.b() >= 3) {
            this.k = aaVar.b();
            this.e = new b(aaVar);
            this.e.a((a) this);
            return this.e;
        } else if (this.e == null) {
            return aaVar;
        } else {
            this.e.a(null);
            this.e = null;
            return aaVar;
        }
    }

    public void a(float f) {
        this.v = f;
    }

    public void a(int i) {
        this.C = i;
        q();
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(attributeSet, this.B ? R.styleable.VerticalInfiniteCycleViewPager : R.styleable.HorizontalInfiniteCycleViewPager);
            try {
                a(obtainStyledAttributes.getDimension(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_min_page_scale_offset : R.styleable.HorizontalInfiniteCycleViewPager_icvp_min_page_scale_offset, 30.0f));
                b(obtainStyledAttributes.getDimension(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_center_page_scale_offset : R.styleable.HorizontalInfiniteCycleViewPager_icvp_center_page_scale_offset, 50.0f));
                c(obtainStyledAttributes.getFloat(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_min_page_scale : R.styleable.HorizontalInfiniteCycleViewPager_icvp_min_page_scale, 0.55f));
                d(obtainStyledAttributes.getFloat(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_max_page_scale : R.styleable.HorizontalInfiniteCycleViewPager_icvp_max_page_scale, 0.8f));
                a(obtainStyledAttributes.getBoolean(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_medium_scaled : R.styleable.HorizontalInfiniteCycleViewPager_icvp_medium_scaled, true));
                a(obtainStyledAttributes.getInteger(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_scroll_duration : R.styleable.HorizontalInfiniteCycleViewPager_icvp_scroll_duration, 500));
                int resourceId = obtainStyledAttributes.getResourceId(this.B ? R.styleable.VerticalInfiniteCycleViewPager_icvp_interpolator : R.styleable.HorizontalInfiniteCycleViewPager_icvp_interpolator, 0);
                a(resourceId == 0 ? null : AnimationUtils.loadInterpolator(this.b, resourceId));
            } catch (NotFoundException e) {
                e.printStackTrace();
                a(null);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void a(Interpolator interpolator) {
        if (interpolator == null) {
            interpolator = new c();
        }
        this.D = interpolator;
        q();
    }

    public void a(d dVar) {
        this.u = dVar;
    }

    public void a(boolean z) {
        this.A = z;
    }

    public boolean a(MotionEvent motionEvent) {
        if (this.c.getAdapter() == null || this.c.getAdapter().b() == 0) {
            return false;
        }
        if (this.E || this.q || this.c.f()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1 || !this.c.hasWindowFocus()) {
            motionEvent.setAction(1);
        }
        c(motionEvent);
        return true;
    }

    public float b() {
        return this.w;
    }

    public int b(int i) {
        this.q = true;
        if (this.c.getAdapter() == null || this.c.getAdapter().b() < 3) {
            return i;
        }
        int b = this.c.getAdapter().b();
        if (this.r) {
            this.r = false;
            return ((this.e.b() / 2) / b) * b;
        }
        return (Math.min(b, i) + this.c.getCurrentItem()) - k();
    }

    public void b(float f) {
        this.w = f;
    }

    public void b(boolean z) {
        if (z) {
            l();
        }
    }

    public boolean b(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public float c() {
        return this.x;
    }

    public void c(float f) {
        this.x = f;
        r();
    }

    public float d() {
        return this.y;
    }

    public void d(float f) {
        this.y = f;
        r();
    }

    public int e() {
        return this.C;
    }

    public Interpolator f() {
        return this.D;
    }

    public int g() {
        return this.t;
    }

    public d h() {
        return this.u;
    }

    public a i() {
        return new a(this);
    }

    public b j() {
        return this.e;
    }

    public int k() {
        return (this.c.getAdapter() == null || this.c.getAdapter().b() < 3) ? this.c.getCurrentItem() : this.e.a(this.c.getCurrentItem());
    }

    public void l() {
        if (this.c.getAdapter() != null && this.c.getAdapter().b() != 0 && this.c.getChildCount() != 0 && this.c.d()) {
            this.c.b(0.0f);
            this.c.e();
        }
    }

    public void m() {
        this.c.post(new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.l();
                this.a.s = false;
            }
        });
    }

    public void n() {
        this.r = true;
        this.c.setCurrentItem(0);
        m();
    }

    public void o() {
        if (this.E) {
            this.E = false;
            this.G.removeCallbacks(this.H);
        }
    }
}
