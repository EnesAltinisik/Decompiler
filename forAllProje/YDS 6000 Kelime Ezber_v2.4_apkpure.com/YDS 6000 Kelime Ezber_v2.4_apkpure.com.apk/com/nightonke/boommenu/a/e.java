package com.nightonke.boommenu.a;

import android.animation.TypeEvaluator;

public class e implements TypeEvaluator {
    private static final e a = new e();

    private float a(float f) {
        float f2 = 1.0f;
        if (((double) f) <= 0.5d) {
            return 0.0f;
        }
        float f3 = (f - 0.5f) * 2.0f;
        if (f3 <= 1.0f) {
            f2 = f3;
        }
        return f2 >= 0.0f ? f2 : 0.0f;
    }

    public static e a() {
        return a;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i = (intValue >> 24) & 255;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        intValue &= 255;
        int intValue2 = ((Integer) obj2).intValue();
        int i4 = (intValue2 >> 24) & 255;
        int i5 = (intValue2 >> 16) & 255;
        int i6 = (intValue2 >> 8) & 255;
        intValue2 &= 255;
        float a = a(f);
        return Integer.valueOf((intValue + ((int) (((float) (intValue2 - intValue)) * a))) | ((((i + ((int) (((float) (i4 - i)) * a))) << 24) | ((i2 + ((int) (((float) (i5 - i2)) * a))) << 16)) | ((((int) (((float) (i6 - i3)) * a)) + i3) << 8)));
    }
}
