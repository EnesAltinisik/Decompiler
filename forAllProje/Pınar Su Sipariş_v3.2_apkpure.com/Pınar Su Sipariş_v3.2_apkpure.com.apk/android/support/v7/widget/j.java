package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* compiled from: AppCompatCheckedTextView */
public class j extends CheckedTextView {
    private static final int[] a = new int[]{16843016};
    private l b;
    private y c;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public j(Context context, AttributeSet attributeSet, int i) {
        super(aw.a(context), attributeSet, i);
        this.c = y.a((TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
        this.b = l.a();
        az a = az.a(getContext(), attributeSet, a, i, 0);
        setCheckMarkDrawable(a.a(0));
        a.a();
    }

    public void setCheckMarkDrawable(int i) {
        if (this.b != null) {
            setCheckMarkDrawable(this.b.a(getContext(), i));
        } else {
            super.setCheckMarkDrawable(i);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.a();
        }
    }
}
