package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.v4.view.ah;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior */
abstract class j extends v<View> {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private int c = 0;
    private int d;

    abstract View a(List<View> list);

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = a(coordinatorLayout.d(view));
            if (a != null) {
                if (ah.v(a) && !ah.v(view)) {
                    ah.a(view, true);
                    if (ah.v(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                if (ah.C(a)) {
                    int size = MeasureSpec.getSize(i3);
                    if (size == 0) {
                        size = coordinatorLayout.getHeight();
                    }
                    coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec(b(a) + (size - a.getMeasuredHeight()), i5 == -1 ? 1073741824 : zzamj.UNSET_ENUM_VALUE), i4);
                    return true;
                }
            }
        }
        return false;
    }

    protected void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = a(coordinatorLayout.d(view));
        if (a != null) {
            e eVar = (e) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, a.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            Rect rect2 = this.b;
            android.support.v4.view.e.a(c(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = c(a);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.c = rect2.top - a.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.c = 0;
    }

    float a(View view) {
        return TextTrackStyle.DEFAULT_FONT_SCALE;
    }

    final int c(View view) {
        return this.d == 0 ? 0 : k.a(Math.round(a(view) * ((float) this.d)), 0, this.d);
    }

    private static int c(int i) {
        return i == 0 ? 8388659 : i;
    }

    int b(View view) {
        return view.getMeasuredHeight();
    }

    final int a() {
        return this.c;
    }

    public final void b(int i) {
        this.d = i;
    }
}
