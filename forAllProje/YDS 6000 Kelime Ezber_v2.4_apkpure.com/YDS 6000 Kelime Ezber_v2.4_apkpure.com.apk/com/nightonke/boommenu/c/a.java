package com.nightonke.boommenu.c;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

public abstract class a extends View {
    private boolean a = false;

    public a(Context context) {
        super(context);
    }

    public void a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            setLayoutParams(layoutParams);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a = false;
    }

    public void requestLayout() {
        if (!this.a) {
            this.a = true;
            super.requestLayout();
        }
    }

    public abstract void setColor(int i);
}
