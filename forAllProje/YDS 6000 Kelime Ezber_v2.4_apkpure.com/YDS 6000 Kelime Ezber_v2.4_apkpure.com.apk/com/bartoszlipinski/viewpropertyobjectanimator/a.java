package com.bartoszlipinski.viewpropertyobjectanimator;

import android.view.View;
import java.lang.ref.WeakReference;

abstract class a {
    protected final WeakReference<View> a;

    protected class a {
        public int a;
        public int b;
    }

    public float a(float f, float f2, float f3) {
        return f2 - ((f2 - f) * (1.0f - f3));
    }

    protected boolean a() {
        return this.a.get() != null;
    }
}
