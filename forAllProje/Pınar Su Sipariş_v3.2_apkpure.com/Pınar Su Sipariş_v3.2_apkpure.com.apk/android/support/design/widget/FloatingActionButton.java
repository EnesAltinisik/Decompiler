package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout.c;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.v4.view.ah;
import android.support.v7.widget.o;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.gms.internal.zzamj;
import java.util.List;

@c(a = Behavior.class)
public class FloatingActionButton extends y {
    private ColorStateList a;
    private Mode b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private final Rect g;
    private o h;
    private g i;

    public static class Behavior extends android.support.design.widget.CoordinatorLayout.b<FloatingActionButton> {
        private static final boolean a = (VERSION.SDK_INT >= 11);
        private q b;
        private float c;
        private Rect d;

        public /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return a(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public /* synthetic */ boolean c(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return b(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return a && (view instanceof SnackbarLayout);
        }

        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof SnackbarLayout) {
                d(coordinatorLayout, floatingActionButton, view);
            } else if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            }
            return false;
        }

        public void c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof SnackbarLayout) {
                d(coordinatorLayout, floatingActionButton, view);
            }
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (((e) floatingActionButton.getLayoutParams()).a() != appBarLayout.getId()) {
                return false;
            }
            if (floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.d == null) {
                this.d = new Rect();
            }
            Rect rect = this.d;
            t.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.b(null, false);
            } else {
                floatingActionButton.a(null, false);
            }
            return true;
        }

        private void d(CoordinatorLayout coordinatorLayout, final FloatingActionButton floatingActionButton, View view) {
            float a = a(coordinatorLayout, floatingActionButton);
            if (this.c != a) {
                float o = ah.o(floatingActionButton);
                if (this.b != null && this.b.b()) {
                    this.b.e();
                }
                if (!floatingActionButton.isShown() || Math.abs(o - a) <= ((float) floatingActionButton.getHeight()) * 0.667f) {
                    ah.b((View) floatingActionButton, a);
                } else {
                    if (this.b == null) {
                        this.b = x.a();
                        this.b.a(a.b);
                        this.b.a(new a(this) {
                            final /* synthetic */ Behavior b;

                            public void a(q qVar) {
                                ah.b(floatingActionButton, qVar.d());
                            }
                        });
                    }
                    this.b.a(o, a);
                    this.b.a();
                }
                this.c = a;
            }
        }

        private float a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            float f = 0.0f;
            List d = coordinatorLayout.d((View) floatingActionButton);
            int size = d.size();
            int i = 0;
            while (i < size) {
                float min;
                View view = (View) d.get(i);
                if ((view instanceof SnackbarLayout) && coordinatorLayout.a((View) floatingActionButton, view)) {
                    min = Math.min(f, ah.o(view) - ((float) view.getHeight()));
                } else {
                    min = f;
                }
                i++;
                f = min;
            }
            return f;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List d = coordinatorLayout.d((View) floatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) d.get(i2);
                if ((view instanceof AppBarLayout) && a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.a((View) floatingActionButton, i);
            b(coordinatorLayout, floatingActionButton);
            return true;
        }

        private void b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i = 0;
            Rect a = floatingActionButton.g;
            if (a != null && a.centerX() > 0 && a.centerY() > 0) {
                int i2;
                e eVar = (e) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                    i2 = a.right;
                } else if (floatingActionButton.getLeft() <= eVar.leftMargin) {
                    i2 = -a.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getBottom() - eVar.bottomMargin) {
                    i = a.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i = -a.top;
                }
                floatingActionButton.offsetTopAndBottom(i);
                floatingActionButton.offsetLeftAndRight(i2);
            }
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class b implements m {
        final /* synthetic */ FloatingActionButton a;

        private b(FloatingActionButton floatingActionButton) {
            this.a = floatingActionButton;
        }

        public float a() {
            return ((float) this.a.getSizeDimension()) / 2.0f;
        }

        public void a(int i, int i2, int i3, int i4) {
            this.a.g.set(i, i2, i3, i4);
            this.a.setPadding(this.a.e + i, this.a.e + i2, this.a.e + i3, this.a.e + i4);
        }

        public void a(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public boolean b() {
            return this.a.f;
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        sizeDimension = Math.min(a(sizeDimension, i), a(sizeDimension, i2));
        setMeasuredDimension((this.g.left + sizeDimension) + this.g.right, (sizeDimension + this.g.top) + this.g.bottom);
    }

    public void setRippleColor(int i) {
        if (this.c != i) {
            this.c = i;
            getImpl().a(i);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.a;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.a != colorStateList) {
            this.a = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    public Mode getBackgroundTintMode() {
        return this.b;
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.b != mode) {
            this.b = mode;
            getImpl().a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int i) {
        this.h.a(i);
    }

    private void a(a aVar, boolean z) {
        getImpl().b(a(aVar), z);
    }

    private void b(a aVar, boolean z) {
        getImpl().a(a(aVar), z);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            getImpl().c();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f;
    }

    private a a(final a aVar) {
        if (aVar == null) {
            return null;
        }
        return new a(this) {
            final /* synthetic */ FloatingActionButton b;

            public void a() {
                aVar.a(this.b);
            }

            public void b() {
                aVar.b(this.b);
            }
        };
    }

    final int getSizeDimension() {
        switch (this.d) {
            case 1:
                return getResources().getDimensionPixelSize(android.support.design.a.c.design_fab_size_mini);
            default:
                return getResources().getDimensionPixelSize(android.support.design.a.c.design_fab_size_normal);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().h();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().i();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().b();
    }

    public Drawable getContentBackground() {
        return getImpl().f();
    }

    private static int a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(i, size);
            case 1073741824:
                return size;
            default:
                return i;
        }
    }

    public float getCompatElevation() {
        return getImpl().a();
    }

    public void setCompatElevation(float f) {
        getImpl().b(f);
    }

    private g getImpl() {
        if (this.i == null) {
            this.i = a();
        }
        return this.i;
    }

    private g a() {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            return new h(this, new b());
        }
        if (i >= 14) {
            return new f(this, new b());
        }
        return new e(this, new b());
    }
}
