package com.nightonke.boommenu.b;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;

public class e {
    private static e a = new e();

    private e() {
    }

    private static float a(float f, float f2, float f3, float f4) {
        return (((f / 2.0f) + (f3 / 2.0f)) * ((f / 2.0f) + (f3 / 2.0f))) / (f2 + f4);
    }

    private static Point a(float f, float f2) {
        return new Point((int) f, (int) f2);
    }

    private static Point a(int i, int i2) {
        return new Point(i, i2);
    }

    public static ArrayList<Point> a(d dVar, c cVar, Point point, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = i / 2;
        int i3;
        switch (dVar) {
            case Horizontal:
                if (i % 2 != 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(((-f) - f3) - (((float) i3) * (f + f3)), 0.0f));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a((f + f3) + (((float) i3) * (f + f3)), 0.0f));
                    }
                    break;
                }
                for (i3 = i2 - 1; i3 >= 0; i3--) {
                    arrayList.add(a((((-f) / 2.0f) - (f3 / 2.0f)) - (((float) i3) * (f + f3)), 0.0f));
                }
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(((f / 2.0f) + (f3 / 2.0f)) + (((float) i3) * (f + f3)), 0.0f));
                }
                break;
            case Vertical:
                if (i % 2 != 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(0.0f, ((-f2) - f4) - (((float) i3) * (f2 + f4))));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a(0.0f, (f2 + f4) + (((float) i3) * (f2 + f4))));
                    }
                    break;
                }
                for (i3 = i2 - 1; i3 >= 0; i3--) {
                    arrayList.add(a(0.0f, (((-f2) / 2.0f) - (f4 / 2.0f)) - (((float) i3) * (f2 + f4))));
                }
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(0.0f, ((f2 / 2.0f) + (f4 / 2.0f)) + (((float) i3) * (f2 + f4))));
                }
                break;
            case SC_1:
                arrayList.add(a(0, 0));
                break;
            case SC_2_1:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), 0.0f));
                break;
            case SC_2_2:
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_3_1:
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                break;
            case SC_3_2:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, f4 + f2));
                break;
            case SC_3_3:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_3_4:
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_4_1:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_4_2:
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, 0.0f));
                break;
            case SC_5_1:
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_5_2:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_5_3:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(0.0f, f4 + f2));
                break;
            case SC_5_4:
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0, 0));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_6_1:
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_6_2:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (-f4) - f2));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), 0.0f));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), f4 + f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (-f4) - f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), f4 + f2));
                break;
            case SC_6_3:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (-f4) - f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), f4 + f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), f4 + f2));
                break;
            case SC_6_4:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_6_5:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), 0.0f));
                arrayList.add(a(0.0f, f4 + f2));
                break;
            case SC_6_6:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_7_1:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(0.0f, f4 + f2));
                break;
            case SC_7_2:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_7_3:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (-f4) - f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), f4 + f2));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), f4 + f2));
                break;
            case SC_7_4:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_7_5:
                arrayList.add(a((((-f3) * 3.0f) / 2.0f) - ((3.0f * f) / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((3.0f * f3) / 2.0f) + ((3.0f * f) / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_7_6:
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((((-f3) * 3.0f) / 2.0f) - ((3.0f * f) / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((3.0f * f3) / 2.0f) + ((3.0f * f) / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_8_1:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_8_2:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0.0f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_8_3:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_8_4:
                arrayList.add(a(0.0f, ((-f4) * 2.0f) - (2.0f * f2)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (-f4) - f2));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), f4 + f2));
                arrayList.add(a(0.0f, (2.0f * f4) + (2.0f * f2)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), f4 + f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (-f4) - f2));
                break;
            case SC_8_5:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((2.0f * f3) + (2.0f * f), 0.0f));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((-f3) * 2.0f) - (2.0f * f), 0.0f));
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                break;
            case SC_8_6:
                arrayList.add(a((((-f3) * 3.0f) / 2.0f) - ((3.0f * f) / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((3.0f * f3) / 2.0f) + ((3.0f * f) / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((((-f3) * 3.0f) / 2.0f) - ((3.0f * f) / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((3.0f * f3) / 2.0f) + ((3.0f * f) / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                break;
            case SC_8_7:
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (((-f4) * 3.0f) / 2.0f) - ((3.0f * f2) / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (((-f4) * 3.0f) / 2.0f) - ((3.0f * f2) / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), ((3.0f * f4) / 2.0f) + ((3.0f * f2) / 2.0f)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), ((3.0f * f4) / 2.0f) + ((3.0f * f2) / 2.0f)));
                break;
            case SC_9_1:
                arrayList.add(a((-f3) - f, (-f4) - f2));
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, (-f4) - f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a((-f3) - f, f4 + f2));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a(f3 + f, f4 + f2));
                break;
            case SC_9_2:
                arrayList.add(a(0.0f, ((-f4) * 2.0f) - (2.0f * f2)));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), (-f4) - f2));
                arrayList.add(a(f3 + f, 0.0f));
                arrayList.add(a((f3 / 2.0f) + (f / 2.0f), f4 + f2));
                arrayList.add(a(0.0f, (2.0f * f4) + (2.0f * f2)));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), f4 + f2));
                arrayList.add(a((-f3) - f, 0.0f));
                arrayList.add(a(((-f3) / 2.0f) - (f / 2.0f), (-f4) - f2));
                arrayList.add(a(0, 0));
                break;
            case SC_9_3:
                arrayList.add(a(0.0f, (-f4) - f2));
                arrayList.add(a(f3 + f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a((2.0f * f3) + (2.0f * f), 0.0f));
                arrayList.add(a(f3 + f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(0.0f, f4 + f2));
                arrayList.add(a((-f3) - f, (f4 / 2.0f) + (f2 / 2.0f)));
                arrayList.add(a(((-f3) * 2.0f) - (2.0f * f), 0.0f));
                arrayList.add(a((-f3) - f, ((-f4) / 2.0f) - (f2 / 2.0f)));
                arrayList.add(a(0, 0));
                break;
        }
        switch (dVar) {
            case SC_3_3:
                a(arrayList, 0.0f, a(f3, f4, f, f2));
                break;
            case SC_3_4:
                a(arrayList, 0.0f, -a(f3, f4, f, f2));
                break;
            case SC_4_2:
            case SC_5_1:
            case SC_5_2:
            case SC_5_3:
            case SC_5_4:
            case SC_6_1:
            case SC_6_2:
            case SC_6_3:
            case SC_6_4:
            case SC_6_5:
            case SC_6_6:
            case SC_7_1:
            case SC_7_2:
            case SC_7_3:
            case SC_7_4:
            case SC_7_5:
            case SC_7_6:
            case SC_8_1:
            case SC_8_2:
            case SC_8_3:
            case SC_8_4:
            case SC_8_5:
            case SC_8_6:
            case SC_8_7:
            case SC_9_1:
            case SC_9_2:
            case SC_9_3:
                a(arrayList, 0.0f, (f2 - f) / 2.0f);
                break;
        }
        a(arrayList, point);
        a(arrayList, cVar, point, f, f2, f6, f7, f8, f9);
        return arrayList;
    }

    public static ArrayList<Point> a(d dVar, c cVar, Point point, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, Float f9) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = i / 2;
        int i3;
        switch (dVar) {
            case Horizontal:
                if (i % 2 != 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(((-f) - f3) - (((float) i3) * (f + f3)), 0.0f));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a((f + f3) + (((float) i3) * (f + f3)), 0.0f));
                    }
                    break;
                }
                for (i3 = i2 - 1; i3 >= 0; i3--) {
                    arrayList.add(a((((-f) / 2.0f) - (f3 / 2.0f)) - (((float) i3) * (f + f3)), 0.0f));
                }
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(((f / 2.0f) + (f3 / 2.0f)) + (((float) i3) * (f + f3)), 0.0f));
                }
                break;
            case Vertical:
            case HAM_1:
            case HAM_2:
            case HAM_3:
            case HAM_4:
            case HAM_5:
            case HAM_6:
                if (i % 2 == 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(0.0f, (((-f2) / 2.0f) - (f4 / 2.0f)) - (((float) i3) * (f2 + f4))));
                    }
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a(0.0f, ((f2 / 2.0f) + (f4 / 2.0f)) + (((float) i3) * (f2 + f4))));
                    }
                } else {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(0.0f, ((-f2) - f4) - (((float) i3) * (f2 + f4))));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a(0.0f, (f2 + f4) + (((float) i3) * (f2 + f4))));
                    }
                }
                if (i >= 2 && f9 != null) {
                    ((Point) arrayList.get(arrayList.size() - 1)).offset(0, (int) (f9.floatValue() - f4));
                    break;
                }
        }
        a(arrayList, point);
        a(arrayList, cVar, point, f, f2, f5, f6, f7, f8);
        return arrayList;
    }

    public static ArrayList<Point> a(d dVar, c cVar, Point point, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = i / 2;
        int i3;
        float f9;
        float sqrt;
        float f10;
        float f11;
        switch (dVar) {
            case Horizontal:
                if (i % 2 != 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(((-2.0f * f) - f2) - (((float) i3) * ((2.0f * f) + f2)), 0.0f));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a(((2.0f * f) + f2) + (((float) i3) * ((2.0f * f) + f2)), 0.0f));
                    }
                    break;
                }
                for (i3 = i2 - 1; i3 >= 0; i3--) {
                    arrayList.add(a(((-f) - (f2 / 2.0f)) - (((float) i3) * ((2.0f * f) + f2)), 0.0f));
                }
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(((f2 / 2.0f) + f) + (((float) i3) * ((2.0f * f) + f2)), 0.0f));
                }
                break;
            case Vertical:
                if (i % 2 != 0) {
                    for (i3 = i2 - 1; i3 >= 0; i3--) {
                        arrayList.add(a(0.0f, ((-2.0f * f) - f3) - (((float) i3) * ((2.0f * f) + f3))));
                    }
                    arrayList.add(a(0, 0));
                    for (i3 = 0; i3 < i2; i3++) {
                        arrayList.add(a(0.0f, ((2.0f * f) + f3) + (((float) i3) * ((2.0f * f) + f3))));
                    }
                    break;
                }
                for (i3 = i2 - 1; i3 >= 0; i3--) {
                    arrayList.add(a(0.0f, ((-f) - (f3 / 2.0f)) - (((float) i3) * ((2.0f * f) + f3))));
                }
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(0.0f, ((f3 / 2.0f) + f) + (((float) i3) * ((2.0f * f) + f3))));
                }
                break;
            case SC_1:
                arrayList.add(a(0, 0));
                break;
            case SC_2_1:
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a((f2 / 2.0f) + f, 0.0f));
                break;
            case SC_2_2:
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, (f3 / 2.0f) + f));
                break;
            case SC_3_1:
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                break;
            case SC_3_2:
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                break;
            case SC_3_3:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-f9, -f10));
                arrayList.add(a(f9, -f10));
                arrayList.add(a(0.0f, sqrt));
                break;
            case SC_3_4:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0.0f, -sqrt));
                arrayList.add(a(-f9, f10));
                arrayList.add(a(f9, f10));
                break;
            case SC_4_1:
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, (f3 / 2.0f) + f));
                break;
            case SC_4_2:
                f9 = (float) (((double) ((2.0f * f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -f9));
                arrayList.add(a(f9, 0.0f));
                arrayList.add(a(0.0f, f9));
                arrayList.add(a(-f9, 0.0f));
                break;
            case SC_5_1:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-2.0f * f9, -sqrt));
                arrayList.add(a(0.0f, -sqrt));
                arrayList.add(a(f9 * 2.0f, -sqrt));
                arrayList.add(a(((-f2) / 2.0f) - f, f10));
                arrayList.add(a((f2 / 2.0f) + f, f10));
                break;
            case SC_5_2:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a((f2 / 2.0f) + f, -f10));
                arrayList.add(a(((-f2) / 2.0f) - f, -f10));
                arrayList.add(a(2.0f * f9, sqrt));
                arrayList.add(a(0.0f, sqrt));
                arrayList.add(a(f9 * -2.0f, sqrt));
                break;
            case SC_5_3:
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                break;
            case SC_5_4:
                f9 = (float) (((double) ((2.0f * f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0, 0));
                arrayList.add(a(f9, -f9));
                arrayList.add(a(f9, f9));
                arrayList.add(a(-f9, f9));
                arrayList.add(a(-f9, -f9));
                break;
            case SC_6_1:
                arrayList.add(a((-f2) - (2.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a((2.0f * f) + f2, ((-f3) / 2.0f) - f));
                arrayList.add(a((-f2) - (2.0f * f), (f3 / 2.0f) + f));
                arrayList.add(a(0.0f, (f3 / 2.0f) + f));
                arrayList.add(a((2.0f * f) + f2, (f3 / 2.0f) + f));
                break;
            case SC_6_2:
                arrayList.add(a(((-f2) / 2.0f) - f, (-f3) - (2.0f * f)));
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, (2.0f * f) + f3));
                arrayList.add(a((f2 / 2.0f) + f, (-f3) - (2.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, 0.0f));
                arrayList.add(a((f2 / 2.0f) + f, (2.0f * f) + f3));
                break;
            case SC_6_3:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-f9, (-f10) - sqrt));
                arrayList.add(a(f9, (-f10) - sqrt));
                arrayList.add(a(2.0f * f9, 0.0f));
                arrayList.add(a(f9, f10 + sqrt));
                arrayList.add(a(-f9, sqrt + f10));
                arrayList.add(a(f9 * -2.0f, 0.0f));
                break;
            case SC_6_4:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0.0f, -2.0f * f9));
                arrayList.add(a(f10 + sqrt, -f9));
                arrayList.add(a(f10 + sqrt, f9));
                arrayList.add(a(0.0f, 2.0f * f9));
                arrayList.add(a((-f10) - sqrt, f9));
                arrayList.add(a((-f10) - sqrt, -f9));
                break;
            case SC_6_5:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                f11 = sqrt - f10;
                arrayList.add(a(-2.0f * f9, ((-f10) - sqrt) + f11));
                arrayList.add(a(0.0f, ((-f10) - sqrt) + f11));
                arrayList.add(a(f9 * 2.0f, ((-f10) - sqrt) + f11));
                arrayList.add(a(((-f2) / 2.0f) - f, f11));
                arrayList.add(a((f2 / 2.0f) + f, f11));
                arrayList.add(a(0.0f, (sqrt + f10) + f11));
                break;
            case SC_6_6:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                f11 = sqrt - f10;
                arrayList.add(a(0.0f, ((-f10) - sqrt) - f11));
                arrayList.add(a(((-f2) / 2.0f) - f, -f11));
                arrayList.add(a((f2 / 2.0f) + f, -f11));
                arrayList.add(a(-2.0f * f9, (f10 + sqrt) - f11));
                arrayList.add(a(0.0f, (f10 + sqrt) - f11));
                arrayList.add(a(f9 * 2.0f, (sqrt + f10) - f11));
                break;
            case SC_7_1:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                break;
            case SC_7_2:
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a((2.0f * f) + f2, (2.0f * f) + f3));
                break;
            case SC_7_3:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0, 0));
                arrayList.add(a(-f9, (-f10) - sqrt));
                arrayList.add(a(f9, (-f10) - sqrt));
                arrayList.add(a(2.0f * f9, 0.0f));
                arrayList.add(a(f9, f10 + sqrt));
                arrayList.add(a(-f9, sqrt + f10));
                arrayList.add(a(f9 * -2.0f, 0.0f));
                break;
            case SC_7_4:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, -2.0f * f9));
                arrayList.add(a(f10 + sqrt, -f9));
                arrayList.add(a(f10 + sqrt, f9));
                arrayList.add(a(0.0f, 2.0f * f9));
                arrayList.add(a((-f10) - sqrt, f9));
                arrayList.add(a((-f10) - sqrt, -f9));
                break;
            case SC_7_5:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-3.0f * f9, -f10));
                arrayList.add(a(-f9, -f10));
                arrayList.add(a(f9, -f10));
                arrayList.add(a(3.0f * f9, -f10));
                arrayList.add(a(-2.0f * f9, sqrt));
                arrayList.add(a(0.0f, sqrt));
                arrayList.add(a(f9 * 2.0f, sqrt));
                break;
            case SC_7_6:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-2.0f * f9, -sqrt));
                arrayList.add(a(0.0f, -sqrt));
                arrayList.add(a(2.0f * f9, -sqrt));
                arrayList.add(a(-3.0f * f9, f10));
                arrayList.add(a(-f9, f10));
                arrayList.add(a(f9, f10));
                arrayList.add(a(f9 * 3.0f, f10));
                break;
            case SC_8_1:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(-2.0f * f9, (-f10) - sqrt));
                arrayList.add(a(0.0f, (-f10) - sqrt));
                arrayList.add(a(2.0f * f9, (-f10) - sqrt));
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a((f2 / 2.0f) + f, 0.0f));
                arrayList.add(a(-2.0f * f9, f10 + sqrt));
                arrayList.add(a(0.0f, f10 + sqrt));
                arrayList.add(a(f9 * 2.0f, sqrt + f10));
                break;
            case SC_8_2:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a((-f10) - sqrt, -2.0f * f9));
                arrayList.add(a((-f10) - sqrt, 0.0f));
                arrayList.add(a((-f10) - sqrt, 2.0f * f9));
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, (f3 / 2.0f) + f));
                arrayList.add(a(f10 + sqrt, -2.0f * f9));
                arrayList.add(a(f10 + sqrt, 0.0f));
                arrayList.add(a(sqrt + f10, f9 * 2.0f));
                break;
            case SC_8_3:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a((2.0f * f) + f2, (2.0f * f) + f3));
                break;
            case SC_8_4:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0.0f, (-2.0f * f10) - (2.0f * sqrt)));
                arrayList.add(a(((-f2) / 2.0f) - f, (-f10) - sqrt));
                arrayList.add(a((f2 / 2.0f) + f, (-f10) - sqrt));
                arrayList.add(a(-2.0f * f9, 0.0f));
                arrayList.add(a(f9 * 2.0f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, f10 + sqrt));
                arrayList.add(a((f2 / 2.0f) + f, f10 + sqrt));
                arrayList.add(a(0.0f, (sqrt * 2.0f) + (f10 * 2.0f)));
                break;
            case SC_8_5:
                f9 = (float) (((double) ((2.0f * f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -2.0f * f9));
                arrayList.add(a(f9, -f9));
                arrayList.add(a(2.0f * f9, 0.0f));
                arrayList.add(a(f9, f9));
                arrayList.add(a(0.0f, 2.0f * f9));
                arrayList.add(a(-f9, f9));
                arrayList.add(a(-2.0f * f9, 0.0f));
                arrayList.add(a(-f9, -f9));
                break;
            case SC_8_6:
                arrayList.add(a((((-f2) * 3.0f) / 2.0f) - (3.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((3.0f * f2) / 2.0f) + (3.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a((((-f2) * 3.0f) / 2.0f) - (3.0f * f), (f3 / 2.0f) + f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, (f3 / 2.0f) + f));
                arrayList.add(a(((3.0f * f2) / 2.0f) + (3.0f * f), (f3 / 2.0f) + f));
                break;
            case SC_8_7:
                arrayList.add(a(((-f2) / 2.0f) - f, (((-f3) * 3.0f) / 2.0f) - (3.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, (((-f3) * 3.0f) / 2.0f) - (3.0f * f)));
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, (f3 / 2.0f) + f));
                arrayList.add(a(((-f2) / 2.0f) - f, ((3.0f * f3) / 2.0f) + (3.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, ((3.0f * f3) / 2.0f) + (3.0f * f)));
                break;
            case SC_9_1:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a((2.0f * f) + f2, (2.0f * f) + f3));
                break;
            case SC_9_2:
                f9 = (f2 / 2.0f) + f;
                sqrt = (float) (((double) f9) / (Math.sqrt(3.0d) / 2.0d));
                f10 = sqrt / 2.0f;
                arrayList.add(a(0.0f, (-2.0f * f10) - (2.0f * sqrt)));
                arrayList.add(a(((-f2) / 2.0f) - f, (-f10) - sqrt));
                arrayList.add(a((f2 / 2.0f) + f, (-f10) - sqrt));
                arrayList.add(a(-2.0f * f9, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f9 * 2.0f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, f10 + sqrt));
                arrayList.add(a((f2 / 2.0f) + f, f10 + sqrt));
                arrayList.add(a(0.0f, (sqrt * 2.0f) + (f10 * 2.0f)));
                break;
            case SC_9_3:
                f9 = (float) (((double) ((2.0f * f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -2.0f * f9));
                arrayList.add(a(f9, -f9));
                arrayList.add(a(2.0f * f9, 0.0f));
                arrayList.add(a(f9, f9));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, 2.0f * f9));
                arrayList.add(a(-f9, f9));
                arrayList.add(a(-2.0f * f9, 0.0f));
                arrayList.add(a(-f9, -f9));
                break;
        }
        a(arrayList, point);
        a(arrayList, cVar, point, f * 2.0f, f * 2.0f, f5, f6, f7, f8);
        return arrayList;
    }

    private static void a(ArrayList<Point> arrayList, float f, float f2) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, a(((float) ((Point) arrayList.get(i)).x) + f, ((float) ((Point) arrayList.get(i)).y) + f2));
        }
    }

    private static void a(ArrayList<Point> arrayList, Point point) {
        for (int i = 0; i < arrayList.size(); i++) {
            Point point2 = (Point) arrayList.get(i);
            arrayList.set(i, new Point((int) (((double) point2.x) + (((double) point.x) / 2.0d)), (int) (((double) point2.y) + (((double) point.y) / 2.0d))));
        }
    }

    private static void a(ArrayList<Point> arrayList, c cVar, Point point, float f, float f2, float f3, float f4, float f5, float f6) {
        Point point2 = new Point(0, 0);
        Iterator it = arrayList.iterator();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point3 = (Point) it.next();
            i2 = Math.max(i2, point3.y);
            i = Math.min(i, point3.y);
            i4 = Math.max(i4, point3.x);
            i3 = Math.min(i3, point3.x);
        }
        switch (cVar) {
            case Top:
                point2.y = (int) (((f2 / 2.0f) + f3) - ((float) i));
                break;
            case Bottom:
                point2.y = (int) (((((float) point.y) - (f2 / 2.0f)) - ((float) i2)) - f4);
                break;
            case Left:
                point2.x = (int) (((f / 2.0f) + f5) - ((float) i3));
                break;
            case Right:
                point2.x = (int) (((((float) point.x) - (f / 2.0f)) - ((float) i4)) - f6);
                break;
            case TL:
                point2.y = (int) (((f2 / 2.0f) + f3) - ((float) i));
                point2.x = (int) (((f / 2.0f) + f5) - ((float) i3));
                break;
            case TR:
                point2.y = (int) (((f2 / 2.0f) + f3) - ((float) i));
                point2.x = (int) (((((float) point.x) - (f / 2.0f)) - ((float) i4)) - f6);
                break;
            case BL:
                point2.y = (int) (((((float) point.y) - (f2 / 2.0f)) - ((float) i2)) - f4);
                point2.x = (int) (((f / 2.0f) + f5) - ((float) i3));
                break;
            case BR:
                point2.y = (int) (((((float) point.y) - (f2 / 2.0f)) - ((float) i2)) - f4);
                point2.x = (int) (((((float) point.x) - (f / 2.0f)) - ((float) i4)) - f6);
                break;
            case Unknown:
                throw new RuntimeException("Unknown button-place-alignment-enum!");
        }
        for (i4 = 0; i4 < arrayList.size(); i4++) {
            point3 = (Point) arrayList.get(i4);
            arrayList.set(i4, new Point(point3.x + point2.x, point3.y + point2.y));
        }
    }
}
