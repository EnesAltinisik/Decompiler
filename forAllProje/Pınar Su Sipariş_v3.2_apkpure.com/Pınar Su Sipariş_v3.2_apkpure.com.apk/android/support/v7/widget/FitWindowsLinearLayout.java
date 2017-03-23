package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.ag.a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements ag {
    private a a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(a aVar) {
        this.a = aVar;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.a != null) {
            this.a.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
