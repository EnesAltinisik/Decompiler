package com.nightonke.boommenu.a;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import java.util.ArrayList;

public class c implements TimeInterpolator {
    private static ArrayList<c> f;
    private d a;
    private PointF b = new PointF();
    private PointF c = new PointF();
    private PointF d = new PointF();
    private Boolean e = Boolean.valueOf(true);

    private c(d dVar) {
        switch (dVar) {
            case EaseInBack:
                a(0.6d, -0.2d, 0.735d, 0.045d);
                break;
            case EaseInCirc:
                a(0.6d, 0.04d, 0.98d, 0.335d);
                break;
            case EaseInCubic:
                a(0.55d, 0.055d, 0.675d, 0.19d);
                break;
            case EaseInExpo:
                a(0.95d, 0.05d, 0.795d, 0.035d);
                break;
            case EaseInSine:
                a(0.47d, 0.0d, 0.745d, 0.715d);
                break;
            case EaseInQuad:
                a(0.55d, 0.085d, 0.68d, 0.53d);
                break;
            case EaseInQuint:
                a(0.755d, 0.05d, 0.855d, 0.06d);
                break;
            case EaseInQuart:
                a(0.895d, 0.03d, 0.685d, 0.22d);
                break;
            case EaseOutBack:
                a(0.174d, 0.885d, 0.32d, 1.275d);
                break;
            case EaseOutCirc:
                a(0.075d, 0.82d, 0.165d, 1.0d);
                break;
            case EaseOutCubic:
                a(0.215d, 0.61d, 0.355d, 1.0d);
                break;
            case EaseOutExpo:
                a(0.19d, 1.0d, 0.22d, 1.0d);
                break;
            case EaseOutSine:
                a(0.39d, 0.575d, 0.565d, 1.0d);
                break;
            case EaseOutQuad:
                a(0.25d, 0.46d, 0.45d, 0.94d);
                break;
            case EaseOutQuint:
                a(0.23d, 1.0d, 0.32d, 1.0d);
                break;
            case EaseOutQuart:
                a(0.165d, 0.84d, 0.44d, 1.0d);
                break;
            case EaseInOutBack:
                a(0.68d, -0.55d, 0.265d, 1.55d);
                break;
            case EaseInOutCirc:
                a(0.785d, 0.135d, 0.15d, 0.86d);
                break;
            case EaseInOutCubic:
                a(0.645d, 0.045d, 0.335d, 1.0d);
                break;
            case EaseInOutExpo:
                a(1.0f, 0.0f, 0.0f, 1.0f);
                break;
            case EaseInOutSine:
                a(0.445d, 0.05d, 0.55d, 0.95d);
                break;
            case EaseInOutQuad:
                a(0.455d, 0.03d, 0.515d, 0.955d);
                break;
            case EaseInOutQuint:
                a(0.86d, 0.0d, 0.07d, 1.0d);
                break;
            case EaseInOutQuart:
                a(0.77d, 0.0d, 0.175d, 1.0d);
                break;
            case Linear:
                a(0.0f, 0.0f, 1.0f, 1.0f);
                break;
            case EaseInBounce:
            case EaseOutBounce:
            case EaseInOutBounce:
            case EaseInElastic:
            case EaseOutElastic:
            case EaseInOutElastic:
                this.e = Boolean.valueOf(false);
                break;
            default:
                throw new RuntimeException("Ease-enum not found!");
        }
        this.a = dVar;
    }

    private float a(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float c = c(f2) - f;
            if (((double) Math.abs(c)) < 0.001d) {
                break;
            }
            f2 -= c / d(f2);
        }
        return f2;
    }

    public static c a(d dVar) {
        if (f == null) {
            f = new ArrayList(d.values().length);
            for (int length = d.values().length; length > 0; length--) {
                f.add(null);
            }
        }
        c cVar = (c) f.get(dVar.a());
        if (cVar != null) {
            return cVar;
        }
        cVar = new c(dVar);
        f.set(dVar.a(), cVar);
        return cVar;
    }

    private void a(double d, double d2, double d3, double d4) {
        a((float) d, (float) d2, (float) d3, (float) d4);
    }

    private void a(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF(f, f2);
        PointF pointF2 = new PointF(f3, f4);
        this.d.x = pointF.x * 3.0f;
        this.c.x = ((pointF2.x - pointF.x) * 3.0f) - this.d.x;
        this.b.x = (1.0f - this.d.x) - this.c.x;
        this.d.y = pointF.y * 3.0f;
        this.c.y = ((pointF2.y - pointF.y) * 3.0f) - this.d.y;
        this.b.y = (1.0f - this.d.y) - this.c.y;
    }

    private float b(float f) {
        return (this.d.y + ((this.c.y + (this.b.y * f)) * f)) * f;
    }

    private float b(float f, float f2, float f3, float f4) {
        return (f3 - c(f4 - f, 0.0f, f3, f4)) + f2;
    }

    private float c(float f) {
        return (this.d.x + ((this.c.x + (this.b.x * f)) * f)) * f;
    }

    private float c(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        if (((double) f5) < 0.36363636363636365d) {
            return ((f5 * (7.5625f * f5)) * f3) + f2;
        }
        if (((double) f5) < 0.7272727272727273d) {
            f5 = (float) (((double) f5) - 0.5454545454545454d);
            return (((f5 * (7.5625f * f5)) + 0.75f) * f3) + f2;
        } else if (((double) f5) < 0.7272727272727273d) {
            f5 = (float) (((double) f5) - 0.5454545454545454d);
            return (((f5 * (7.5625f * f5)) + 0.9375f) * f3) + f2;
        } else {
            f5 = (float) (((double) f5) - 0.9545454545454546d);
            return (((f5 * (7.5625f * f5)) + 0.984375f) * f3) + f2;
        }
    }

    private float d(float f) {
        return this.d.x + (((2.0f * this.c.x) + ((3.0f * this.b.x) * f)) * f);
    }

    private float e(float f) {
        return (1.0f - c(1.0f - f, 0.0f, 1.0f, 1.0f)) + 0.0f;
    }

    private float f(float f) {
        float f2 = f / 1.0f;
        if (((double) f2) < 0.36363636363636365d) {
            return 0.0f + ((f2 * (7.5625f * f2)) * 1.0f);
        }
        if (((double) f2) < 0.7272727272727273d) {
            f2 = (float) (((double) f2) - 0.5454545454545454d);
            return 0.0f + (((f2 * (7.5625f * f2)) + 0.75f) * 1.0f);
        } else if (((double) f2) < 0.9090909090909091d) {
            f2 = (float) (((double) f2) - 0.8181818181818182d);
            return 0.0f + (((f2 * (7.5625f * f2)) + 0.9375f) * 1.0f);
        } else {
            f2 = (float) (((double) f2) - 0.9545454545454546d);
            return 0.0f + (((f2 * (7.5625f * f2)) + 0.984375f) * 1.0f);
        }
    }

    private float g(float f) {
        return f < 1.0f / 2.0f ? (b(f * 2.0f, 0.0f, 1.0f, 1.0f) * 0.5f) + 0.0f : ((c(f * 2.0f, 0.0f, 1.0f, 1.0f) * 0.5f) + (0.5f * 1.0f)) + 0.0f;
    }

    private float h(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / 1.0f;
        if (f2 == 1.0f) {
            return 0.0f + 1.0f;
        }
        float f3 = 0.3f * 1.0f;
        f2 -= 1.0f;
        return 0.0f + (-(((float) Math.sin((double) ((((f2 * 1.0f) - (f3 / 4.0f)) * 6.2831855f) / f3))) * (((float) Math.pow(2.0d, (double) (10.0f * f2))) * 1.0f)));
    }

    private float i(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / 1.0f;
        if (f2 == 1.0f) {
            return 0.0f + 1.0f;
        }
        float f3 = 0.3f * 1.0f;
        return 0.0f + ((((float) Math.sin((double) ((((f2 * 1.0f) - (f3 / 4.0f)) * 6.2831855f) / f3))) * (((float) Math.pow(2.0d, (double) (-10.0f * f2))) * 1.0f)) + 1.0f);
    }

    private float j(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / (1.0f / 2.0f);
        if (f2 == 2.0f) {
            return 0.0f + 1.0f;
        }
        float f3 = 0.45f * 1.0f;
        float f4 = f3 / 4.0f;
        if (f2 < 1.0f) {
            f2 -= 1.0f;
            return 0.0f + ((((float) Math.sin((double) ((((f2 * 1.0f) - f4) * 6.2831855f) / f3))) * (((float) Math.pow(2.0d, (double) (10.0f * f2))) * 1.0f)) * -0.5f);
        }
        f2 -= 1.0f;
        return 0.0f + (((((float) Math.sin((double) ((((f2 * 1.0f) - f4) * 6.2831855f) / f3))) * (((float) Math.pow(2.0d, (double) (-10.0f * f2))) * 1.0f)) * 0.5f) + 1.0f);
    }

    public float getInterpolation(float f) {
        if (this.e.booleanValue()) {
            return b(a(f));
        }
        switch (this.a) {
            case EaseInBounce:
                return e(f);
            case EaseOutBounce:
                return f(f);
            case EaseInOutBounce:
                return g(f);
            case EaseInElastic:
                return h(f);
            case EaseOutElastic:
                return i(f);
            case EaseInOutElastic:
                return j(f);
            default:
                throw new RuntimeException("Wrong ease-enum initialize method.");
        }
    }
}
