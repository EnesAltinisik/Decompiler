package com.nightonke.boommenu.a;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class a {
    private static a a = new a();

    private a() {
    }

    public static ObjectAnimator a(Object obj, String str, long j, long j2, TimeInterpolator timeInterpolator, AnimatorListenerAdapter animatorListenerAdapter, float... fArr) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, fArr);
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(j2);
        if (timeInterpolator != null) {
            ofFloat.setInterpolator(timeInterpolator);
        }
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
        return ofFloat;
    }

    public static ObjectAnimator a(Object obj, String str, long j, long j2, TimeInterpolator timeInterpolator, float... fArr) {
        return a(obj, str, j, j2, timeInterpolator, null, fArr);
    }

    public static ObjectAnimator a(Object obj, String str, long j, long j2, TypeEvaluator typeEvaluator, AnimatorListenerAdapter animatorListenerAdapter, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, str, iArr);
        ofInt.setStartDelay(j);
        ofInt.setDuration(j2);
        ofInt.setEvaluator(typeEvaluator);
        if (animatorListenerAdapter != null) {
            ofInt.addListener(animatorListenerAdapter);
        }
        ofInt.start();
        return ofInt;
    }

    public static ObjectAnimator a(Object obj, String str, long j, long j2, TypeEvaluator typeEvaluator, int... iArr) {
        return a(obj, str, j, j2, typeEvaluator, null, iArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<java.lang.Integer> a(com.nightonke.boommenu.a.f r6, int r7) {
        /*
        r1 = 0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = com.nightonke.boommenu.a.a.AnonymousClass1.a;
        r3 = r6.ordinal();
        r0 = r0[r3];
        switch(r0) {
            case 1: goto L_0x0012;
            case 2: goto L_0x001e;
            case 3: goto L_0x002e;
            default: goto L_0x0011;
        };
    L_0x0011:
        return r2;
    L_0x0012:
        if (r1 >= r7) goto L_0x0011;
    L_0x0014:
        r0 = java.lang.Integer.valueOf(r1);
        r2.add(r0);
        r1 = r1 + 1;
        goto L_0x0012;
    L_0x001e:
        if (r1 >= r7) goto L_0x0011;
    L_0x0020:
        r0 = r7 - r1;
        r0 = r0 + -1;
        r0 = java.lang.Integer.valueOf(r0);
        r2.add(r0);
        r1 = r1 + 1;
        goto L_0x001e;
    L_0x002e:
        r3 = new boolean[r7];
        r0 = r1;
    L_0x0031:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0039;
    L_0x0034:
        r3[r0] = r1;
        r0 = r0 + 1;
        goto L_0x0031;
    L_0x0039:
        r4 = new java.util.Random;
        r4.<init>();
        r0 = r1;
    L_0x003f:
        if (r0 >= r7) goto L_0x0011;
    L_0x0041:
        r1 = r4.nextInt(r7);
        r5 = r3[r1];
        if (r5 != 0) goto L_0x003f;
    L_0x0049:
        r5 = 1;
        r3[r1] = r5;
        r1 = java.lang.Integer.valueOf(r1);
        r2.add(r1);
        r0 = r0 + 1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nightonke.boommenu.a.a.a(com.nightonke.boommenu.a.f, int):java.util.ArrayList<java.lang.Integer>");
    }

    public static void a(b bVar, Point point, int i, Point point2, Point point3, float[] fArr, float[] fArr2) {
        if (point2.x == point3.x) {
            bVar = b.LINE;
        }
        float f = (float) point2.x;
        float f2 = (float) point2.y;
        float f3 = (float) point3.x;
        float f4 = (float) point3.y;
        float f5 = 1.0f / ((float) i);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        int i2;
        switch (bVar) {
            case LINE:
                for (i2 = 0; i2 < fArr.length; i2++) {
                    f4 = ((float) i2) * f5;
                    fArr[i2] = (f4 * f6) + f;
                    fArr2[i2] = (f4 * f7) + f2;
                }
                return;
            case PARABOLA_1:
                f7 = (f + f3) / 2.0f;
                f7 = ((((Math.min(f2, f4) * 3.0f) / 4.0f) * (f - f3)) + (((f3 - f7) * f2) + ((f7 - f) * f4))) / (((f7 * f7) * (f - f3)) + (((f * f) * (f3 - f7)) + ((f3 * f3) * (f7 - f))));
                f4 = ((f2 - f4) / (f - f3)) - ((f3 + f) * f7);
                f2 = (f2 - ((f * f) * f7)) - (f * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f7) * fArr[i2]) + (fArr[i2] * f4)) + f2;
                }
                return;
            case PARABOLA_2:
                f7 = (f + f3) / 2.0f;
                f7 = ((((((float) point.y) + Math.max(f2, f4)) / 2.0f) * (f - f3)) + (((f3 - f7) * f2) + ((f7 - f) * f4))) / (((f7 * f7) * (f - f3)) + (((f * f) * (f3 - f7)) + ((f3 * f3) * (f7 - f))));
                f4 = ((f2 - f4) / (f - f3)) - ((f3 + f) * f7);
                f2 = (f2 - ((f * f) * f7)) - (f * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f7) * fArr[i2]) + (fArr[i2] * f4)) + f2;
                }
                return;
            case PARABOLA_3:
                f6 = (f2 + f4) / 2.0f;
                f6 = (((Math.min(f, f3) / 2.0f) * (f2 - f4)) + (((f4 - f6) * f) + ((f6 - f2) * f3))) / (((f6 * f6) * (f2 - f4)) + (((f2 * f2) * (f4 - f6)) + ((f4 * f4) * (f6 - f2))));
                f4 = ((f - f3) / (f2 - f4)) - ((f4 + f2) * f6);
                f = (f - ((f2 * f2) * f6)) - (f2 * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr2[i2] = ((((float) i2) * f5) * f7) + f2;
                    fArr[i2] = (((fArr2[i2] * f6) * fArr2[i2]) + (fArr2[i2] * f4)) + f;
                }
                return;
            case PARABOLA_4:
                f6 = (f2 + f4) / 2.0f;
                f6 = ((((((float) point.x) + Math.max(f, f3)) / 2.0f) * (f2 - f4)) + (((f4 - f6) * f) + ((f6 - f2) * f3))) / (((f6 * f6) * (f2 - f4)) + (((f2 * f2) * (f4 - f6)) + ((f4 * f4) * (f6 - f2))));
                f4 = ((f - f3) / (f2 - f4)) - ((f4 + f2) * f6);
                f = (f - ((f2 * f2) * f6)) - (f2 * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr2[i2] = ((((float) i2) * f5) * f7) + f2;
                    fArr[i2] = (((fArr2[i2] * f6) * fArr2[i2]) + (fArr2[i2] * f4)) + f;
                }
                return;
            case HORIZONTAL_THROW_1:
                f7 = (2.0f * f3) - f;
                f4 = ((f4 * (f - f7)) + (((f7 - f3) * f2) + ((f3 - f) * f2))) / (((f3 * f3) * (f - f7)) + (((f * f) * (f7 - f3)) + ((f7 * f7) * (f3 - f))));
                f7 = ((f2 - f2) / (f - f7)) - ((f7 + f) * f4);
                f2 = (f2 - ((f * f) * f4)) - (f * f7);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f4) * fArr[i2]) + (fArr[i2] * f7)) + f2;
                }
                return;
            case HORIZONTAL_THROW_2:
                f = (float) point2.x;
                f2 = (float) point3.x;
                f4 = (float) point3.y;
                f7 = (2.0f * f) - f2;
                float f8 = ((f7 - f) * f4) + ((f - f2) * f4);
                f8 = ((((float) point2.y) * (f2 - f7)) + f8) / ((((f2 * f2) * (f7 - f)) + ((f7 * f7) * (f - f2))) + ((f * f) * (f2 - f7)));
                f7 = ((f4 - f4) / (f2 - f7)) - ((f7 + f2) * f8);
                f2 = (f4 - ((f2 * f2) * f8)) - (f2 * f7);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f8) * fArr[i2]) + (fArr[i2] * f7)) + f2;
                }
                return;
            case RANDOM:
                a(b.values()[new Random().nextInt(b.RANDOM.a())], point, i, point2, point3, fArr, fArr2);
                return;
            case Unknown:
                throw new RuntimeException("Unknown boom-enum!");
            default:
                return;
        }
    }

    public static void a(com.nightonke.boommenu.b.a aVar, long j, long j2, TimeInterpolator timeInterpolator, float... fArr) {
        aVar.G();
        for (int i = 0; i < aVar.z().size(); i++) {
            a((View) aVar.z().get(i), "rotation", j, j2, timeInterpolator, null, fArr);
        }
    }

    public static void a(String str, long j, long j2, float[] fArr, TimeInterpolator timeInterpolator, ArrayList<View> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next(), str, j, j2, timeInterpolator, null, fArr);
        }
    }

    public static void b(b bVar, Point point, int i, Point point2, Point point3, float[] fArr, float[] fArr2) {
        b bVar2 = point2.x == point3.x ? b.LINE : bVar;
        float f = (float) point2.x;
        float f2 = (float) point2.y;
        float f3 = (float) point3.x;
        float f4 = (float) point3.y;
        float f5 = 1.0f / ((float) i);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        int i2;
        switch (bVar2) {
            case LINE:
            case PARABOLA_1:
            case PARABOLA_2:
            case PARABOLA_3:
            case PARABOLA_4:
            case RANDOM:
            case Unknown:
                a(bVar2, point, i, point2, point3, fArr, fArr2);
                return;
            case HORIZONTAL_THROW_1:
                f = (float) point2.x;
                f2 = (float) point3.x;
                f3 = (float) point3.y;
                f4 = (2.0f * f) - f2;
                f7 = ((((float) point2.y) * (f2 - f4)) + (((f4 - f) * f3) + ((f - f2) * f3))) / ((((f2 * f2) * (f4 - f)) + ((f4 * f4) * (f - f2))) + ((f * f) * (f2 - f4)));
                f4 = ((f3 - f3) / (f2 - f4)) - ((f4 + f2) * f7);
                f2 = (f3 - ((f2 * f2) * f7)) - (f2 * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f7) * fArr[i2]) + (fArr[i2] * f4)) + f2;
                }
                return;
            case HORIZONTAL_THROW_2:
                float f8 = (2.0f * f3) - f;
                f3 = ((f4 * (f - f8)) + (((f8 - f3) * f2) + ((f3 - f) * f2))) / (((f3 * f3) * (f - f8)) + (((f * f) * (f8 - f3)) + ((f8 * f8) * (f3 - f))));
                f4 = ((f2 - f2) / (f - f8)) - ((f8 + f) * f3);
                f2 = (f2 - ((f * f) * f3)) - (f * f4);
                for (i2 = 0; i2 < fArr.length; i2++) {
                    fArr[i2] = ((((float) i2) * f5) * f6) + f;
                    fArr2[i2] = (((fArr[i2] * f3) * fArr[i2]) + (fArr[i2] * f4)) + f2;
                }
                return;
            default:
                return;
        }
    }
}
