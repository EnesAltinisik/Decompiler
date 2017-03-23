package com.nightonke.boommenu.c;

import android.content.Context;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class e {
    private static e a = new e();

    private e() {
    }

    private static Point a(float f, float f2) {
        return new Point((int) f, (int) f2);
    }

    private static Point a(int i, int i2) {
        return new Point(i, i2);
    }

    public static a a(Context context, d dVar, int i) {
        switch (dVar) {
            case DOT_1:
            case DOT_2_1:
            case DOT_2_2:
            case DOT_3_1:
            case DOT_3_2:
            case DOT_3_3:
            case DOT_3_4:
            case DOT_4_1:
            case DOT_4_2:
            case DOT_5_1:
            case DOT_5_2:
            case DOT_5_3:
            case DOT_5_4:
            case DOT_6_1:
            case DOT_6_2:
            case DOT_6_3:
            case DOT_6_4:
            case DOT_6_5:
            case DOT_6_6:
            case DOT_7_1:
            case DOT_7_2:
            case DOT_7_3:
            case DOT_7_4:
            case DOT_7_5:
            case DOT_7_6:
            case DOT_8_1:
            case DOT_8_2:
            case DOT_8_3:
            case DOT_8_4:
            case DOT_8_5:
            case DOT_8_6:
            case DOT_8_7:
            case DOT_9_1:
            case DOT_9_2:
            case DOT_9_3:
            case Share:
                return a(context, i);
            case HAM_1:
            case HAM_2:
            case HAM_3:
            case HAM_4:
            case HAM_5:
            case HAM_6:
                return b(context, i);
            default:
                throw new RuntimeException("Unknown button-enum!");
        }
    }

    private static b a(Context context, int i) {
        b bVar = new b(context);
        bVar.a(i);
        return bVar;
    }

    public static ArrayList<Point> a(Point point, int i, int i2, int i3) {
        ArrayList<Point> arrayList = new ArrayList();
        float sqrt = (float) ((((double) i3) * Math.sqrt(3.0d)) / 3.0d);
        for (int i4 = 0; i4 < i2; i4++) {
            switch (i4 % 3) {
                case 0:
                    arrayList.add(a(sqrt / 2.0f, (float) ((-i3) / 2)));
                    break;
                case 1:
                    arrayList.add(a(-sqrt, 0.0f));
                    break;
                case 2:
                    arrayList.add(a(sqrt / 2.0f, (float) (i3 / 2)));
                    break;
                default:
                    break;
            }
        }
        Collections.sort(arrayList, new Comparator<Point>() {
            public int a(Point point, Point point2) {
                return Integer.valueOf(point.y).compareTo(Integer.valueOf(point2.y));
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((Point) obj, (Point) obj2);
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Point) it.next()).offset((point.x / 2) - i, (point.y / 2) - i);
        }
        return arrayList;
    }

    public static ArrayList<Point> a(d dVar, Point point, int i, int i2, int i3) {
        int i4 = 0;
        ArrayList<Point> arrayList = new ArrayList();
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        int a = dVar.a() / 2;
        if (dVar.a() % 2 == 0) {
            for (a--; a >= 0; a--) {
                arrayList.add(a(0.0f, (((-f2) / 2.0f) - (f3 / 2.0f)) - (((float) a) * (f2 + f3))));
            }
            while (((float) i4) < f2) {
                arrayList.add(a(0.0f, ((f2 / 2.0f) + (f3 / 2.0f)) + (((float) i4) * (f2 + f3))));
                i4++;
            }
        } else {
            for (a--; a >= 0; a--) {
                arrayList.add(a(0.0f, ((-f2) - f3) - (((float) a) * (f2 + f3))));
            }
            arrayList.add(a(0, 0));
            while (((float) i4) < f2) {
                arrayList.add(a(0.0f, (f2 + f3) + (((float) i4) * (f2 + f3))));
                i4++;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Point) it.next()).offset((int) (((float) (point.x / 2)) - (f / 2.0f)), (int) (((float) (point.y / 2)) - (f2 / 2.0f)));
        }
        return arrayList;
    }

    public static ArrayList<Point> a(d dVar, Point point, int i, int i2, int i3, int i4) {
        ArrayList<Point> arrayList = new ArrayList();
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        float f5;
        float f6;
        switch (dVar) {
            case DOT_1:
                arrayList.add(a(0, 0));
                break;
            case DOT_2_1:
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a(f + (f2 / 2.0f), 0.0f));
                break;
            case DOT_2_2:
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, f + (f3 / 2.0f)));
                break;
            case DOT_3_1:
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((f * 2.0f) + f2, 0.0f));
                break;
            case DOT_3_2:
                arrayList.add(a(0.0f, (-f2) - (2.0f * f)));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, (f * 2.0f) + f2));
                break;
            case DOT_3_3:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(-f, -f3));
                arrayList.add(a(f, -f3));
                arrayList.add(a(0.0f, f2));
                break;
            case DOT_3_4:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(0.0f, -f2));
                arrayList.add(a(-f, f3));
                arrayList.add(a(f, f3));
                break;
            case DOT_4_1:
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, f + (f3 / 2.0f)));
                break;
            case DOT_4_2:
                f = (float) (((double) ((f * 2.0f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -f));
                arrayList.add(a(f, 0.0f));
                arrayList.add(a(0.0f, f));
                arrayList.add(a(-f, 0.0f));
                break;
            case DOT_5_1:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a(-2.0f * f3, -f5));
                arrayList.add(a(0.0f, -f5));
                arrayList.add(a(f3 * 2.0f, -f5));
                arrayList.add(a(((-f2) / 2.0f) - f, f4));
                arrayList.add(a(f + (f2 / 2.0f), f4));
                break;
            case DOT_5_2:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a(((-f2) / 2.0f) - f, -f4));
                arrayList.add(a(f + (f2 / 2.0f), -f4));
                arrayList.add(a(-2.0f * f3, f5));
                arrayList.add(a(0.0f, f5));
                arrayList.add(a(2.0f * f3, f5));
                break;
            case DOT_5_3:
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a(0.0f, f3 + (2.0f * f)));
                arrayList.add(a((-f2) - (f * 2.0f), 0.0f));
                break;
            case DOT_5_4:
                f = (float) (((double) ((f * 2.0f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0, 0));
                arrayList.add(a(f, -f));
                arrayList.add(a(f, f));
                arrayList.add(a(-f, f));
                arrayList.add(a(-f, -f));
                break;
            case DOT_6_1:
                arrayList.add(a((-f2) - (2.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a((2.0f * f) + f2, ((-f3) / 2.0f) - f));
                arrayList.add(a((-f2) - (2.0f * f), (f3 / 2.0f) + f));
                arrayList.add(a(0.0f, (f3 / 2.0f) + f));
                arrayList.add(a(f2 + (2.0f * f), f + (f3 / 2.0f)));
                break;
            case DOT_6_2:
                arrayList.add(a(((-f2) / 2.0f) - f, (-f3) - (2.0f * f)));
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, (2.0f * f) + f3));
                arrayList.add(a((f2 / 2.0f) + f, (-f3) - (2.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, 0.0f));
                arrayList.add(a((f2 / 2.0f) + f, (f * 2.0f) + f3));
                break;
            case DOT_6_3:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(-f, (-f3) - f2));
                arrayList.add(a(f, (-f3) - f2));
                arrayList.add(a(2.0f * f, 0.0f));
                arrayList.add(a(f, f3 + f2));
                arrayList.add(a(-f, f2 + f3));
                arrayList.add(a(f * -2.0f, 0.0f));
                break;
            case DOT_6_4:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(0.0f, -2.0f * f));
                arrayList.add(a(f3 + f2, -f));
                arrayList.add(a(f3 + f2, f));
                arrayList.add(a(0.0f, 2.0f * f));
                arrayList.add(a((-f3) - f2, f));
                arrayList.add(a((-f3) - f2, -f));
                break;
            case DOT_6_5:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                f6 = f4 - f5;
                arrayList.add(a(-2.0f * f3, ((-f5) - f4) + f6));
                arrayList.add(a(0.0f, ((-f5) - f4) + f6));
                arrayList.add(a(f3 * 2.0f, ((-f5) - f4) + f6));
                arrayList.add(a(((-f2) / 2.0f) - f, f6));
                arrayList.add(a(f + (f2 / 2.0f), f6));
                arrayList.add(a(0.0f, (f5 + f4) + f6));
                break;
            case DOT_6_6:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                f6 = f4 - f5;
                arrayList.add(a(0.0f, ((-f5) - f4) - f6));
                arrayList.add(a(((-f2) / 2.0f) - f, -f6));
                arrayList.add(a(f + (f2 / 2.0f), -f6));
                arrayList.add(a(-2.0f * f3, (f5 + f4) - f6));
                arrayList.add(a(0.0f, (f5 + f4) - f6));
                arrayList.add(a(2.0f * f3, (f5 + f4) - f6));
                break;
            case DOT_7_1:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f2 + (2.0f * f), 0.0f));
                arrayList.add(a(0.0f, (f * 2.0f) + f3));
                break;
            case DOT_7_2:
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a(f2 + (2.0f * f), (f * 2.0f) + f3));
                break;
            case DOT_7_3:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(0, 0));
                arrayList.add(a(-f, (-f3) - f2));
                arrayList.add(a(f, (-f3) - f2));
                arrayList.add(a(2.0f * f, 0.0f));
                arrayList.add(a(f, f3 + f2));
                arrayList.add(a(-f, f2 + f3));
                arrayList.add(a(f * -2.0f, 0.0f));
                break;
            case DOT_7_4:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, -2.0f * f));
                arrayList.add(a(f3 + f2, -f));
                arrayList.add(a(f3 + f2, f));
                arrayList.add(a(0.0f, 2.0f * f));
                arrayList.add(a((-f3) - f2, f));
                arrayList.add(a((-f3) - f2, -f));
                break;
            case DOT_7_5:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(-3.0f * f, -f3));
                arrayList.add(a(-f, -f3));
                arrayList.add(a(f, -f3));
                arrayList.add(a(3.0f * f, -f3));
                arrayList.add(a(-2.0f * f, f2));
                arrayList.add(a(0.0f, f2));
                arrayList.add(a(f * 2.0f, f2));
                break;
            case DOT_7_6:
                f += f2 / 2.0f;
                f2 = (float) (((double) f) / (Math.sqrt(3.0d) / 2.0d));
                f3 = f2 / 2.0f;
                arrayList.add(a(-2.0f * f, -f2));
                arrayList.add(a(0.0f, -f2));
                arrayList.add(a(2.0f * f, -f2));
                arrayList.add(a(-3.0f * f, f3));
                arrayList.add(a(-f, f3));
                arrayList.add(a(f, f3));
                arrayList.add(a(f * 3.0f, f3));
                break;
            case DOT_8_1:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a(-2.0f * f3, (-f5) - f4));
                arrayList.add(a(0.0f, (-f5) - f4));
                arrayList.add(a(2.0f * f3, (-f5) - f4));
                arrayList.add(a(((-f2) / 2.0f) - f, 0.0f));
                arrayList.add(a(f + (f2 / 2.0f), 0.0f));
                arrayList.add(a(-2.0f * f3, f5 + f4));
                arrayList.add(a(0.0f, f5 + f4));
                arrayList.add(a(2.0f * f3, f5 + f4));
                break;
            case DOT_8_2:
                f2 = (f3 / 2.0f) + f;
                f4 = (float) (((double) f2) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a((-f5) - f4, -2.0f * f2));
                arrayList.add(a((-f5) - f4, 0.0f));
                arrayList.add(a((-f5) - f4, 2.0f * f2));
                arrayList.add(a(0.0f, ((-f3) / 2.0f) - f));
                arrayList.add(a(0.0f, f + (f3 / 2.0f)));
                arrayList.add(a(f5 + f4, -2.0f * f2));
                arrayList.add(a(f5 + f4, 0.0f));
                arrayList.add(a(f5 + f4, f2 * 2.0f));
                break;
            case DOT_8_3:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a(f2 + (2.0f * f), (f * 2.0f) + f3));
                break;
            case DOT_8_4:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a(0.0f, (-2.0f * f5) - (2.0f * f4)));
                arrayList.add(a(((-f2) / 2.0f) - f, (-f5) - f4));
                arrayList.add(a((f2 / 2.0f) + f, (-f5) - f4));
                arrayList.add(a(-2.0f * f3, 0.0f));
                arrayList.add(a(f3 * 2.0f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, f5 + f4));
                arrayList.add(a(f + (f2 / 2.0f), f5 + f4));
                arrayList.add(a(0.0f, (2.0f * f5) + (2.0f * f4)));
                break;
            case DOT_8_5:
                f = (float) (((double) ((f * 2.0f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -2.0f * f));
                arrayList.add(a(f, -f));
                arrayList.add(a(2.0f * f, 0.0f));
                arrayList.add(a(f, f));
                arrayList.add(a(0.0f, 2.0f * f));
                arrayList.add(a(-f, f));
                arrayList.add(a(-2.0f * f, 0.0f));
                arrayList.add(a(-f, -f));
                break;
            case DOT_8_6:
                arrayList.add(a((((-f2) * 3.0f) / 2.0f) - (3.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((3.0f * f2) / 2.0f) + (3.0f * f), ((-f3) / 2.0f) - f));
                arrayList.add(a((((-f2) * 3.0f) / 2.0f) - (3.0f * f), (f3 / 2.0f) + f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, (f3 / 2.0f) + f));
                arrayList.add(a(((f2 * 3.0f) / 2.0f) + (3.0f * f), f + (f3 / 2.0f)));
                break;
            case DOT_8_7:
                arrayList.add(a(((-f2) / 2.0f) - f, (((-f3) * 3.0f) / 2.0f) - (3.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, (((-f3) * 3.0f) / 2.0f) - (3.0f * f)));
                arrayList.add(a(((-f2) / 2.0f) - f, ((-f3) / 2.0f) - f));
                arrayList.add(a((f2 / 2.0f) + f, ((-f3) / 2.0f) - f));
                arrayList.add(a(((-f2) / 2.0f) - f, (f3 / 2.0f) + f));
                arrayList.add(a((f2 / 2.0f) + f, (f3 / 2.0f) + f));
                arrayList.add(a(((-f2) / 2.0f) - f, ((3.0f * f3) / 2.0f) + (3.0f * f)));
                arrayList.add(a((f2 / 2.0f) + f, (f * 3.0f) + ((f3 * 3.0f) / 2.0f)));
                break;
            case DOT_9_1:
                arrayList.add(a((-f2) - (2.0f * f), (-f3) - (2.0f * f)));
                arrayList.add(a(0.0f, (-f3) - (2.0f * f)));
                arrayList.add(a((2.0f * f) + f2, (-f3) - (2.0f * f)));
                arrayList.add(a((-f2) - (2.0f * f), 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a((2.0f * f) + f2, 0.0f));
                arrayList.add(a((-f2) - (2.0f * f), (2.0f * f) + f3));
                arrayList.add(a(0.0f, (2.0f * f) + f3));
                arrayList.add(a(f2 + (2.0f * f), (f * 2.0f) + f3));
                break;
            case DOT_9_2:
                f3 = (f2 / 2.0f) + f;
                f4 = (float) (((double) f3) / (Math.sqrt(3.0d) / 2.0d));
                f5 = f4 / 2.0f;
                arrayList.add(a(0.0f, (-2.0f * f5) - (2.0f * f4)));
                arrayList.add(a(((-f2) / 2.0f) - f, (-f5) - f4));
                arrayList.add(a((f2 / 2.0f) + f, (-f5) - f4));
                arrayList.add(a(-2.0f * f3, 0.0f));
                arrayList.add(a(0, 0));
                arrayList.add(a(f3 * 2.0f, 0.0f));
                arrayList.add(a(((-f2) / 2.0f) - f, f5 + f4));
                arrayList.add(a(f + (f2 / 2.0f), f5 + f4));
                arrayList.add(a(0.0f, (2.0f * f5) + (2.0f * f4)));
                break;
            case DOT_9_3:
                f = (float) (((double) ((f * 2.0f) + f4)) / Math.sqrt(2.0d));
                arrayList.add(a(0.0f, -2.0f * f));
                arrayList.add(a(f, -f));
                arrayList.add(a(2.0f * f, 0.0f));
                arrayList.add(a(f, f));
                arrayList.add(a(0, 0));
                arrayList.add(a(0.0f, 2.0f * f));
                arrayList.add(a(-f, f));
                arrayList.add(a(-2.0f * f, 0.0f));
                arrayList.add(a(-f, -f));
                break;
            default:
                throw new RuntimeException("Unknown piece-place-enum!");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Point) it.next()).offset((point.x / 2) - i, (point.y / 2) - i);
        }
        return arrayList;
    }

    private static c b(Context context, int i) {
        c cVar = new c(context);
        cVar.a(i);
        return cVar;
    }
}
