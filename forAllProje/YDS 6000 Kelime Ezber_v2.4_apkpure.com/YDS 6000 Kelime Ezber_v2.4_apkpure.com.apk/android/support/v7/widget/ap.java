package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v4.view.f;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class ap extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public static class a extends MarginLayoutParams {
        public float g;
        public int h;

        public a(int i, int i2) {
            super(i, i2);
            this.h = -1;
            this.g = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
            this.g = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.h = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
            this.h = -1;
        }
    }

    public ap(Context context) {
        this(context, null);
    }

    public ap(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        bl a = bl.a(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int a2 = a.a(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        a2 = a.a(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (a2 >= 0) {
            setGravity(a2);
        }
        boolean a3 = a.a(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.g = a.a(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = a.a(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = a.a(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.a(R.styleable.LinearLayoutCompat_divider));
        this.n = a.a(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.o = a.e(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        a.a();
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    private void c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = b(i3);
            if (b.getVisibility() != 8) {
                a aVar = (a) b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    private void d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = b(i3);
            if (b.getVisibility() != 8) {
                a aVar = (a) b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    int a(View view) {
        return 0;
    }

    int a(View view, int i) {
        return 0;
    }

    void a(int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        View b;
        this.f = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj2 = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        int i10 = this.b;
        boolean z = this.h;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < virtualChildCount) {
            Object obj5;
            int i13;
            View b2 = b(i12);
            if (b2 == null) {
                this.f += d(i12);
                i3 = i11;
                obj5 = obj4;
                obj = obj2;
                i4 = i7;
                i13 = i6;
            } else if (b2.getVisibility() == 8) {
                i12 += a(b2, i12);
                i3 = i11;
                obj5 = obj4;
                obj = obj2;
                i4 = i7;
                i13 = i6;
            } else {
                if (c(i12)) {
                    this.f += this.m;
                }
                a aVar = (a) b2.getLayoutParams();
                float f2 = f + aVar.g;
                if (mode2 == 1073741824 && aVar.height == 0 && aVar.g > 0.0f) {
                    i3 = this.f;
                    this.f = Math.max(i3, (aVar.topMargin + i3) + aVar.bottomMargin);
                    obj4 = 1;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (aVar.height == 0 && aVar.g > 0.0f) {
                        i3 = 0;
                        aVar.height = -2;
                    }
                    int i14 = i3;
                    a(b2, i12, i, 0, i2, f2 == 0.0f ? this.f : 0);
                    if (i14 != Integer.MIN_VALUE) {
                        aVar.height = i14;
                    }
                    i3 = b2.getMeasuredHeight();
                    int i15 = this.f;
                    this.f = Math.max(i15, (((i15 + i3) + aVar.topMargin) + aVar.bottomMargin) + b(b2));
                    if (z) {
                        i11 = Math.max(i3, i11);
                    }
                }
                if (i10 >= 0 && i10 == i12 + 1) {
                    this.c = this.f;
                }
                if (i12 >= i10 || aVar.g <= 0.0f) {
                    Object obj6;
                    Object obj7 = null;
                    if (mode == 1073741824 || aVar.width != -1) {
                        obj6 = obj3;
                    } else {
                        obj6 = 1;
                        obj7 = 1;
                    }
                    i4 = aVar.rightMargin + aVar.leftMargin;
                    i13 = b2.getMeasuredWidth() + i4;
                    i6 = Math.max(i6, i13);
                    int a = bp.a(i7, ah.k(b2));
                    obj = (obj2 == null || aVar.width != -1) ? null : 1;
                    if (aVar.g > 0.0f) {
                        i3 = Math.max(i9, obj7 != null ? i4 : i13);
                        i4 = i8;
                    } else {
                        if (obj7 == null) {
                            i4 = i13;
                        }
                        i4 = Math.max(i8, i4);
                        i3 = i9;
                    }
                    i12 += a(b2, i12);
                    obj5 = obj4;
                    i9 = i3;
                    i8 = i4;
                    i13 = i6;
                    i3 = i11;
                    i4 = a;
                    obj3 = obj6;
                    f = f2;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i12++;
            i11 = i3;
            obj4 = obj5;
            obj2 = obj;
            i7 = i4;
            i6 = i13;
        }
        if (this.f > 0 && c(virtualChildCount)) {
            this.f += this.m;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                b = b(i5);
                if (b == null) {
                    this.f += d(i5);
                    i3 = i5;
                } else if (b.getVisibility() == 8) {
                    i3 = a(b, i5) + i5;
                } else {
                    a aVar2 = (a) b.getLayoutParams();
                    int i16 = this.f;
                    this.f = Math.max(i16, (aVar2.bottomMargin + ((i16 + i11) + aVar2.topMargin)) + b(b));
                    i3 = i5;
                }
                i5 = i3 + 1;
            }
        }
        this.f += getPaddingTop() + getPaddingBottom();
        int a2 = ah.a(Math.max(this.f, getSuggestedMinimumHeight()), i2, 0);
        i5 = (16777215 & a2) - this.f;
        int i17;
        if (obj4 != null || (i5 != 0 && f > 0.0f)) {
            if (this.g > 0.0f) {
                f = this.g;
            }
            this.f = 0;
            i11 = 0;
            float f3 = f;
            Object obj8 = obj2;
            i17 = i8;
            i16 = i7;
            i9 = i6;
            i15 = i5;
            while (i11 < virtualChildCount) {
                View b3 = b(i11);
                if (b3.getVisibility() == 8) {
                    i3 = i17;
                    i5 = i16;
                    i4 = i9;
                    obj = obj8;
                } else {
                    float f4;
                    float f5;
                    aVar2 = (a) b3.getLayoutParams();
                    float f6 = aVar2.g;
                    if (f6 > 0.0f) {
                        i5 = (int) ((((float) i15) * f6) / f3);
                        f3 -= f6;
                        i15 -= i5;
                        i4 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + aVar2.leftMargin) + aVar2.rightMargin, aVar2.width);
                        if (aVar2.height == 0 && mode2 == 1073741824) {
                            if (i5 <= 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        } else {
                            i5 += b3.getMeasuredHeight();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        }
                        f4 = f3;
                        i12 = i15;
                        i15 = bp.a(i16, ah.k(b3) & -256);
                        f5 = f4;
                    } else {
                        f5 = f3;
                        i12 = i15;
                        i15 = i16;
                    }
                    i16 = aVar2.leftMargin + aVar2.rightMargin;
                    i4 = b3.getMeasuredWidth() + i16;
                    i9 = Math.max(i9, i4);
                    Object obj9 = (mode == 1073741824 || aVar2.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i16 = i4;
                    }
                    i4 = Math.max(i17, i16);
                    obj = (obj8 == null || aVar2.width != -1) ? null : 1;
                    i13 = this.f;
                    this.f = Math.max(i13, (aVar2.bottomMargin + ((b3.getMeasuredHeight() + i13) + aVar2.topMargin)) + b(b3));
                    i3 = i4;
                    i4 = i9;
                    f4 = f5;
                    i5 = i15;
                    i15 = i12;
                    f3 = f4;
                }
                i11++;
                i17 = i3;
                i9 = i4;
                obj8 = obj;
                i16 = i5;
            }
            this.f += getPaddingTop() + getPaddingBottom();
            obj2 = obj8;
            i3 = i17;
            i7 = i16;
            i5 = i9;
        } else {
            i17 = Math.max(i8, i9);
            if (z && mode2 != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    b = b(i5);
                    if (!(b == null || b.getVisibility() == 8 || ((a) b.getLayoutParams()).g <= 0.0f)) {
                        b.measure(MeasureSpec.makeMeasureSpec(b.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                }
            }
            i3 = i17;
            i5 = i6;
        }
        if (obj2 != null || mode == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension(ah.a(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i7), a2);
        if (obj3 != null) {
            c(virtualChildCount, i2);
        }
    }

    void a(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.e & 8388615;
        switch (this.e & 112) {
            case 16:
                i5 = getPaddingTop() + (((i4 - i2) - this.f) / 2);
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - this.f;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View b = b(i7);
            if (b == null) {
                i8 += d(i7);
                i5 = i7;
            } else if (b.getVisibility() != 8) {
                int i9;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                a aVar = (a) b.getLayoutParams();
                i5 = aVar.h;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (f.a(i5, ah.h(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - aVar.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + aVar.leftMargin;
                        break;
                }
                int i10 = (c(i7) ? this.m + i8 : i8) + aVar.topMargin;
                a(b, i9, i10 + a(b), measuredWidth, measuredHeight);
                i8 = i10 + ((aVar.bottomMargin + measuredHeight) + b(b));
                i5 = a(b, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    void a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View b = b(i);
            if (!(b == null || b.getVisibility() == 8 || !c(i))) {
                a(canvas, (b.getTop() - ((a) b.getLayoutParams()).topMargin) - this.m);
            }
            i++;
        }
        if (c(virtualChildCount)) {
            int height;
            View b2 = b(virtualChildCount - 1);
            if (b2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                a aVar = (a) b2.getLayoutParams();
                height = aVar.bottomMargin + b2.getBottom();
            }
            a(canvas, height);
        }
    }

    void a(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    void a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int b(View view) {
        return 0;
    }

    public a b(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    protected a b(LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    View b(int i) {
        return getChildAt(i);
    }

    void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        a aVar;
        this.f = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.a;
        boolean z2 = this.h;
        Object obj4 = mode == 1073741824 ? 1 : null;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < virtualChildCount) {
            Object obj5;
            Object obj6;
            View b = b(i12);
            if (b == null) {
                this.f += d(i12);
                i3 = i11;
                obj5 = obj3;
                obj6 = obj;
                i4 = i8;
                i5 = i7;
            } else if (b.getVisibility() == 8) {
                i12 += a(b, i12);
                i3 = i11;
                obj5 = obj3;
                obj6 = obj;
                i4 = i8;
                i5 = i7;
            } else {
                Object obj7;
                if (c(i12)) {
                    this.f += this.l;
                }
                a aVar2 = (a) b.getLayoutParams();
                float f2 = f + aVar2.g;
                if (mode == 1073741824 && aVar2.width == 0 && aVar2.g > 0.0f) {
                    if (obj4 != null) {
                        this.f += aVar2.leftMargin + aVar2.rightMargin;
                    } else {
                        i3 = this.f;
                        this.f = Math.max(i3, (aVar2.leftMargin + i3) + aVar2.rightMargin);
                    }
                    if (z) {
                        i3 = MeasureSpec.makeMeasureSpec(0, 0);
                        b.measure(i3, i3);
                    } else {
                        obj3 = 1;
                    }
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (aVar2.width == 0 && aVar2.g > 0.0f) {
                        i3 = 0;
                        aVar2.width = -2;
                    }
                    int i13 = i3;
                    a(b, i12, i, f2 == 0.0f ? this.f : 0, i2, 0);
                    if (i13 != Integer.MIN_VALUE) {
                        aVar2.width = i13;
                    }
                    i3 = b.getMeasuredWidth();
                    if (obj4 != null) {
                        this.f += ((aVar2.leftMargin + i3) + aVar2.rightMargin) + b(b);
                    } else {
                        int i14 = this.f;
                        this.f = Math.max(i14, (((i14 + i3) + aVar2.leftMargin) + aVar2.rightMargin) + b(b));
                    }
                    if (z2) {
                        i11 = Math.max(i3, i11);
                    }
                }
                Object obj8 = null;
                if (mode2 == 1073741824 || aVar2.height != -1) {
                    obj7 = obj2;
                } else {
                    obj7 = 1;
                    obj8 = 1;
                }
                i4 = aVar2.bottomMargin + aVar2.topMargin;
                i5 = b.getMeasuredHeight() + i4;
                int a = bp.a(i8, ah.k(b));
                if (z) {
                    i8 = b.getBaseline();
                    if (i8 != -1) {
                        int i15 = ((((aVar2.h < 0 ? this.e : aVar2.h) & 112) >> 4) & -2) >> 1;
                        iArr[i15] = Math.max(iArr[i15], i8);
                        iArr2[i15] = Math.max(iArr2[i15], i5 - i8);
                    }
                }
                i8 = Math.max(i7, i5);
                obj6 = (obj == null || aVar2.height != -1) ? null : 1;
                if (aVar2.g > 0.0f) {
                    i3 = Math.max(i10, obj8 != null ? i4 : i5);
                    i4 = i9;
                } else {
                    if (obj8 == null) {
                        i4 = i5;
                    }
                    i4 = Math.max(i9, i4);
                    i3 = i10;
                }
                i12 += a(b, i12);
                obj5 = obj3;
                i10 = i3;
                i9 = i4;
                i5 = i8;
                i3 = i11;
                i4 = a;
                obj2 = obj7;
                f = f2;
            }
            i12++;
            i11 = i3;
            obj3 = obj5;
            obj = obj6;
            i8 = i4;
            i7 = i5;
        }
        if (this.f > 0 && c(virtualChildCount)) {
            this.f += this.l;
        }
        i12 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i7 : Math.max(i7, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            i6 = 0;
            while (i6 < virtualChildCount) {
                View b2 = b(i6);
                if (b2 == null) {
                    this.f += d(i6);
                    i3 = i6;
                } else if (b2.getVisibility() == 8) {
                    i3 = a(b2, i6) + i6;
                } else {
                    aVar = (a) b2.getLayoutParams();
                    if (obj4 != null) {
                        this.f = ((aVar.rightMargin + (aVar.leftMargin + i11)) + b(b2)) + this.f;
                        i3 = i6;
                    } else {
                        i4 = this.f;
                        this.f = Math.max(i4, (aVar.rightMargin + ((i4 + i11) + aVar.leftMargin)) + b(b2));
                        i3 = i6;
                    }
                }
                i6 = i3 + 1;
            }
        }
        this.f += getPaddingLeft() + getPaddingRight();
        int a2 = ah.a(Math.max(this.f, getSuggestedMinimumWidth()), i, 0);
        i6 = (16777215 & a2) - this.f;
        int i16;
        if (obj3 != null || (i6 != 0 && f > 0.0f)) {
            if (this.g > 0.0f) {
                f = this.g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            i11 = 0;
            float f3 = f;
            Object obj9 = obj;
            i16 = i9;
            i15 = i8;
            i14 = i6;
            i9 = -1;
            while (i11 < virtualChildCount) {
                float f4;
                Object obj10;
                View b3 = b(i11);
                if (b3 == null) {
                    f4 = f3;
                    i6 = i14;
                    i4 = i9;
                    i14 = i16;
                    obj10 = obj9;
                } else if (b3.getVisibility() == 8) {
                    f4 = f3;
                    i6 = i14;
                    i4 = i9;
                    i14 = i16;
                    obj10 = obj9;
                } else {
                    float f5;
                    aVar = (a) b3.getLayoutParams();
                    float f6 = aVar.g;
                    if (f6 > 0.0f) {
                        i6 = (int) ((((float) i14) * f6) / f3);
                        f3 -= f6;
                        i4 = i14 - i6;
                        i14 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + aVar.topMargin) + aVar.bottomMargin, aVar.height);
                        if (aVar.width == 0 && mode == 1073741824) {
                            if (i6 <= 0) {
                                i6 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i6, 1073741824), i14);
                        } else {
                            i6 += b3.getMeasuredWidth();
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i6, 1073741824), i14);
                        }
                        i10 = bp.a(i15, ah.k(b3) & -16777216);
                        f5 = f3;
                    } else {
                        i4 = i14;
                        i10 = i15;
                        f5 = f3;
                    }
                    if (obj4 != null) {
                        this.f += ((b3.getMeasuredWidth() + aVar.leftMargin) + aVar.rightMargin) + b(b3);
                    } else {
                        i6 = this.f;
                        this.f = Math.max(i6, (((b3.getMeasuredWidth() + i6) + aVar.leftMargin) + aVar.rightMargin) + b(b3));
                    }
                    obj5 = (mode2 == 1073741824 || aVar.height != -1) ? null : 1;
                    i12 = aVar.topMargin + aVar.bottomMargin;
                    i14 = b3.getMeasuredHeight() + i12;
                    i9 = Math.max(i9, i14);
                    i12 = Math.max(i16, obj5 != null ? i12 : i14);
                    obj5 = (obj9 == null || aVar.height != -1) ? null : 1;
                    if (z) {
                        i5 = b3.getBaseline();
                        if (i5 != -1) {
                            i3 = ((((aVar.h < 0 ? this.e : aVar.h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i5);
                            iArr2[i3] = Math.max(iArr2[i3], i14 - i5);
                        }
                    }
                    f4 = f5;
                    i14 = i12;
                    obj10 = obj5;
                    i15 = i10;
                    i6 = i4;
                    i4 = i9;
                }
                i11++;
                i16 = i14;
                i9 = i4;
                obj9 = obj10;
                i14 = i6;
                f3 = f4;
            }
            this.f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i9 = Math.max(i9, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj = obj9;
            i3 = i16;
            i8 = i15;
            i6 = i9;
        } else {
            i16 = Math.max(i9, i10);
            if (z2 && mode != 1073741824) {
                for (i6 = 0; i6 < virtualChildCount; i6++) {
                    View b4 = b(i6);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((a) b4.getLayoutParams()).g <= 0.0f)) {
                        b4.measure(MeasureSpec.makeMeasureSpec(i11, 1073741824), MeasureSpec.makeMeasureSpec(b4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = i16;
            i6 = i12;
        }
        if (obj != null || mode2 == 1073741824) {
            i3 = i6;
        }
        setMeasuredDimension((-16777216 & i8) | a2, ah.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i8 << 16));
        if (obj2 != null) {
            d(virtualChildCount, i);
        }
    }

    void b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = bp.a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.e & 8388615;
        int i8 = this.e & 112;
        boolean z = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        switch (f.a(i7, ah.h(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View b = b(i10);
            if (b == null) {
                paddingLeft += d(i10);
                i7 = i9;
            } else if (b.getVisibility() != 8) {
                int i11;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                a aVar = (a) b.getLayoutParams();
                i7 = (!z || aVar.height == -1) ? -1 : b.getBaseline();
                int i12 = aVar.h;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & 112) {
                    case 16:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + aVar.topMargin) - aVar.bottomMargin;
                        break;
                    case 48:
                        i11 = paddingTop + aVar.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[1] - i7;
                            break;
                        }
                        break;
                    case 80:
                        i11 = (paddingBottom - measuredHeight) - aVar.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[2] - (b.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                paddingLeft = (c(i10) ? this.l + paddingLeft : paddingLeft) + aVar.leftMargin;
                a(b, paddingLeft + a(b), i11, measuredWidth, measuredHeight);
                paddingLeft += (aVar.rightMargin + measuredWidth) + b(b);
                i7 = a(b, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    void b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean a = bp.a(this);
        int i = 0;
        while (i < virtualChildCount) {
            View b = b(i);
            if (!(b == null || b.getVisibility() == 8 || !c(i))) {
                a aVar = (a) b.getLayoutParams();
                b(canvas, a ? aVar.rightMargin + b.getRight() : (b.getLeft() - aVar.leftMargin) - this.l);
            }
            i++;
        }
        if (c(virtualChildCount)) {
            int paddingLeft;
            View b2 = b(virtualChildCount - 1);
            if (b2 == null) {
                paddingLeft = a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.l;
            } else {
                aVar = (a) b2.getLayoutParams();
                paddingLeft = a ? (b2.getLeft() - aVar.leftMargin) - this.l : aVar.rightMargin + b2.getRight();
            }
            b(canvas, paddingLeft);
        }
    }

    void b(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    protected boolean c(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.n & 4) != 0;
            } else {
                if ((this.n & 2) == 0) {
                    return false;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    int d(int i) {
        return 0;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return b(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public int getBaseline() {
        if (this.b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.c;
            if (this.d == 1) {
                i = this.e & 112;
                if (i != 48) {
                    switch (i) {
                        case 16:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                            break;
                    }
                }
            }
            i = i2;
            return (((a) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    protected a j() {
        return this.d == 0 ? new a(-2, -2) : this.d == 1 ? new a(-1, -2) : null;
    }

    protected void onDraw(Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                a(canvas);
            } else {
                b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ap.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ap.class.getName());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            a(i, i2, i3, i4);
        } else {
            b(i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.d == 1) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.k) {
            this.k = drawable;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.e & 8388615) != i2) {
            this.e = i2 | (this.e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.e & 112) != i2) {
            this.e = i2 | (this.e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
