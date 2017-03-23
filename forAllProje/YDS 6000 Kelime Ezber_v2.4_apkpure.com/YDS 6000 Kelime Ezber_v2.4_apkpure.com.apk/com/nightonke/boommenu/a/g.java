package com.nightonke.boommenu.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.nightonke.boommenu.e;
import java.util.ArrayList;
import java.util.Iterator;

public class g extends View {
    private long a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private float m = 1.0f;
    private float n = 1.0f;
    private ArrayList<PointF> o;
    private int p = -1;
    private int q = -1;
    private int r = 3;
    private Paint s = new Paint();

    public g(Context context) {
        super(context);
        this.s.setAntiAlias(true);
    }

    private void setHideProcess(float f) {
        long j = (long) (((float) this.l) * f);
        if (this.g < j && j <= this.h) {
            this.n = 1.0f - (((float) (this.h - j)) / ((float) (this.h - this.g)));
        } else if (this.h < j && j <= this.i) {
            this.n = 1.0f;
        } else if (this.i < j && j <= this.j) {
            this.m = 1.0f - (((float) (this.j - j)) / ((float) (this.j - this.i)));
        } else if (this.j <= j) {
            this.m = 1.0f;
            this.n = 1.0f;
        }
        invalidate();
    }

    private void setShowProcess(float f) {
        long j = (long) (((float) this.f) * f);
        if (this.a < j && j <= this.b) {
            this.m = ((float) (this.b - j)) / ((float) (this.b - this.a));
        } else if (this.b < j && j <= this.c) {
            this.m = 0.0f;
        } else if (this.c < j && j <= this.d) {
            this.n = ((float) (this.d - j)) / ((float) (this.d - this.c));
        } else if (this.d <= j) {
            this.m = 0.0f;
            this.n = 0.0f;
        }
        invalidate();
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

    public void a(ArrayList<Point> arrayList, int i, long j, long j2, long j3, long j4) {
        float f = ((float) i) - (((float) this.r) / 4.0f);
        float sqrt = ((float) (((double) i) - ((((double) this.r) * Math.sqrt(3.0d)) / 4.0d))) + ((float) e.a(0.25f));
        this.o = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj;
            Point point = (Point) it.next();
            Iterator it2 = this.o.iterator();
            while (it2.hasNext()) {
                if (((PointF) it2.next()).equals((float) point.x, (float) point.y)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                this.o.add(new PointF(point));
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            ((PointF) it3.next()).offset(f, sqrt);
        }
        int[] iArr = new int[3];
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 % 3;
            iArr[i3] = iArr[i3] + 1;
        }
        this.a = ((long) (iArr[0] - 1)) * j2;
        this.b = ((long) iArr[0]) * j2;
        this.c = ((long) ((iArr[0] - 1) + iArr[1])) * j2;
        this.d = ((long) (iArr[0] + iArr[1])) * j2;
        this.e = (((long) (((iArr[2] - 1) + iArr[1]) + iArr[0])) * j2) + j;
        this.f = this.e;
        this.g = (((long) (iArr[2] - 1)) * j4) + j3;
        this.h = (((long) iArr[2]) * j4) + j3;
        this.i = (((long) ((iArr[2] - 1) + iArr[1])) * j4) + j3;
        this.j = (((long) (iArr[2] + iArr[1])) * j4) + j3;
        this.k = (((long) (((iArr[2] - 1) + iArr[1]) + iArr[0])) * j4) + j3;
        this.l = this.k;
    }

    protected void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.drawLine(((PointF) this.o.get(1)).x, ((PointF) this.o.get(1)).y, (this.m * (((PointF) this.o.get(0)).x - ((PointF) this.o.get(1)).x)) + ((PointF) this.o.get(1)).x, (this.m * (((PointF) this.o.get(0)).y - ((PointF) this.o.get(1)).y)) + ((PointF) this.o.get(1)).y, this.s);
        this.s.setColor(this.q);
        canvas2 = canvas;
        canvas2.drawLine(((PointF) this.o.get(2)).x, ((PointF) this.o.get(2)).y, (this.n * (((PointF) this.o.get(1)).x - ((PointF) this.o.get(2)).x)) + ((PointF) this.o.get(2)).x, (this.n * (((PointF) this.o.get(1)).y - ((PointF) this.o.get(2)).y)) + ((PointF) this.o.get(2)).y, this.s);
        super.onDraw(canvas);
    }

    public void setLine1Color(int i) {
        this.p = i;
        this.s.setColor(i);
    }

    public void setLine2Color(int i) {
        this.q = i;
    }

    public void setLineWidth(int i) {
        this.r = i;
        this.s.setStrokeWidth((float) i);
    }
}
