package com.bartoszlipinski.viewpropertyobjectanimator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.support.v4.i.a;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class f {
    private final WeakReference<View> a;
    private long b = -1;
    private long c = -1;
    private boolean d = false;
    private Interpolator e;
    private List<AnimatorListener> f = new ArrayList();
    private List<AnimatorUpdateListener> g = new ArrayList();
    private List<AnimatorPauseListener> h = new ArrayList();
    private a<Property<View, Float>, PropertyValuesHolder> i = new a();
    private c j;
    private b k;
    private d l;
    private e m;

    private f(View view) {
        this.a = new WeakReference(view);
    }

    public static f a(View view) {
        return new f(view);
    }

    private void a(Property<View, Float> property, float f) {
        if (b()) {
            a(property, ((Float) property.get(this.a.get())).floatValue(), f);
        }
    }

    private void a(Property<View, Float> property, float f, float f2) {
        this.i.remove(property);
        this.i.put(property, PropertyValuesHolder.ofFloat(property, new float[]{f, f2}));
    }

    private void b(Property<View, Float> property, float f) {
        if (b()) {
            float floatValue = ((Float) property.get(this.a.get())).floatValue();
            a(property, floatValue, floatValue + f);
        }
    }

    private boolean b() {
        return this.a.get() != null;
    }

    @SuppressLint({"NewApi"})
    public ObjectAnimator a() {
        if (!b()) {
            return ObjectAnimator.ofFloat(null, View.ALPHA, new float[]{1.0f, 1.0f});
        }
        Collection values = this.i.values();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a.get(), (PropertyValuesHolder[]) values.toArray(new PropertyValuesHolder[values.size()]));
        if (this.d) {
            ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void onAnimationEnd(Animator animator) {
                    if (this.a.b()) {
                        ((View) this.a.a.get()).setLayerType(0, null);
                    }
                }

                public void onAnimationStart(Animator animator) {
                    if (this.a.b()) {
                        ((View) this.a.a.get()).setLayerType(2, null);
                    }
                }
            });
        }
        if (this.c != -1) {
            ofPropertyValuesHolder.setStartDelay(this.c);
        }
        if (this.b != -1) {
            ofPropertyValuesHolder.setDuration(this.b);
        }
        if (this.e != null) {
            ofPropertyValuesHolder.setInterpolator(this.e);
        }
        for (AnimatorListener addListener : this.f) {
            ofPropertyValuesHolder.addListener(addListener);
        }
        if (this.j != null) {
            ofPropertyValuesHolder.addUpdateListener(this.j);
        }
        if (this.k != null) {
            ofPropertyValuesHolder.addUpdateListener(this.k);
        }
        if (this.l != null) {
            ofPropertyValuesHolder.addUpdateListener(this.l);
        }
        if (this.m != null) {
            ofPropertyValuesHolder.addUpdateListener(this.m);
        }
        for (AnimatorUpdateListener addUpdateListener : this.g) {
            ofPropertyValuesHolder.addUpdateListener(addUpdateListener);
        }
        if (VERSION.SDK_INT >= 19) {
            for (AnimatorPauseListener addPauseListener : this.h) {
                ofPropertyValuesHolder.addPauseListener(addPauseListener);
            }
        }
        return ofPropertyValuesHolder;
    }

    public f a(float f) {
        a(View.SCALE_X, f);
        return this;
    }

    public f a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration cannot be < 0");
        }
        this.b = j;
        return this;
    }

    public f a(AnimatorListener animatorListener) {
        this.f.add(animatorListener);
        return this;
    }

    public f a(Interpolator interpolator) {
        this.e = interpolator;
        return this;
    }

    public f b(float f) {
        a(View.SCALE_Y, f);
        return this;
    }

    public f c(float f) {
        a(View.TRANSLATION_X, f);
        return this;
    }

    public f d(float f) {
        b(View.TRANSLATION_X, f);
        return this;
    }

    public f e(float f) {
        a(View.ALPHA, f);
        return this;
    }

    public f f(float f) {
        a(View.ROTATION, f);
        return this;
    }
}
