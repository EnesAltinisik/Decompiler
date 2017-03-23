package com.google.android.gms.ads.b;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.b.qx;
import com.google.android.gms.b.zy;

public abstract class c extends FrameLayout {
    private final FrameLayout a;
    private final qx b;

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.a != view) {
            super.bringChildToFront(this.a);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.a);
    }

    public void removeView(View view) {
        if (this.a != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(a aVar) {
        try {
            this.b.a((a) aVar.a());
        } catch (Throwable e) {
            zy.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
