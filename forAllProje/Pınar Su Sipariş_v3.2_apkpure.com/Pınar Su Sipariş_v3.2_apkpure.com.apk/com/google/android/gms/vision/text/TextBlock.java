package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TextBlock implements Text {
    private Point[] cornerPoints;
    private LineBoxParcel[] zzbyo;
    private List<Line> zzbyp;
    private String zzbyq;
    private Rect zzbyr;

    TextBlock(SparseArray<LineBoxParcel> sparseArray) {
        this.zzbyo = new LineBoxParcel[sparseArray.size()];
        for (int i = 0; i < this.zzbyo.length; i++) {
            this.zzbyo[i] = (LineBoxParcel) sparseArray.valueAt(i);
        }
    }

    private static Point[] zza(int i, int i2, int i3, int i4, BoundingBoxParcel boundingBoxParcel) {
        int i5 = boundingBoxParcel.left;
        int i6 = boundingBoxParcel.top;
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel.zzbyv));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel.zzbyv));
        Point[] pointArr = new Point[]{new Point(i, i2), new Point(i3, i2), new Point(i3, i4), new Point(i, i4)};
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = (int) ((((double) pointArr[i7].x) * sin) + (((double) pointArr[i7].y) * cos));
            pointArr[i7].x = (int) ((((double) pointArr[i7].x) * cos) - (((double) pointArr[i7].y) * sin));
            pointArr[i7].y = i8;
            pointArr[i7].offset(i5, i6);
        }
        return pointArr;
    }

    private static Point[] zza(BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2) {
        int i = -boundingBoxParcel2.left;
        int i2 = -boundingBoxParcel2.top;
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel2.zzbyv));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel2.zzbyv));
        Point[] pointArr = new Point[4];
        pointArr[0] = new Point(boundingBoxParcel.left, boundingBoxParcel.top);
        pointArr[0].offset(i, i2);
        i = (int) ((((double) pointArr[0].x) * cos) + (((double) pointArr[0].y) * sin));
        i2 = (int) ((sin * ((double) (-pointArr[0].x))) + (cos * ((double) pointArr[0].y)));
        pointArr[0].x = i;
        pointArr[0].y = i2;
        pointArr[1] = new Point(boundingBoxParcel.width + i, i2);
        pointArr[2] = new Point(boundingBoxParcel.width + i, boundingBoxParcel.height + i2);
        pointArr[3] = new Point(i, i2 + boundingBoxParcel.height);
        return pointArr;
    }

    public Rect getBoundingBox() {
        if (this.zzbyr == null) {
            this.zzbyr = a.a((Text) this);
        }
        return this.zzbyr;
    }

    public List<? extends Text> getComponents() {
        return zzNb();
    }

    public Point[] getCornerPoints() {
        if (this.cornerPoints == null) {
            zzNa();
        }
        return this.cornerPoints;
    }

    public String getLanguage() {
        if (this.zzbyq != null) {
            return this.zzbyq;
        }
        HashMap hashMap = new HashMap();
        for (LineBoxParcel lineBoxParcel : this.zzbyo) {
            hashMap.put(lineBoxParcel.zzbyq, Integer.valueOf((hashMap.containsKey(lineBoxParcel.zzbyq) ? ((Integer) hashMap.get(lineBoxParcel.zzbyq)).intValue() : 0) + 1));
        }
        this.zzbyq = (String) ((Entry) Collections.max(hashMap.entrySet(), new Comparator<Entry<String, Integer>>(this) {
            final /* synthetic */ TextBlock a;

            {
                this.a = r1;
            }

            public int a(Entry<String, Integer> entry, Entry<String, Integer> entry2) {
                return ((Integer) entry.getValue()).compareTo((Integer) entry2.getValue());
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((Entry) obj, (Entry) obj2);
            }
        })).getKey();
        if (this.zzbyq == null || this.zzbyq.isEmpty()) {
            this.zzbyq = "und";
        }
        return this.zzbyq;
    }

    public String getValue() {
        if (this.zzbyo.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(this.zzbyo[0].zzbyA);
        for (int i = 1; i < this.zzbyo.length; i++) {
            stringBuilder.append("\n");
            stringBuilder.append(this.zzbyo[i].zzbyA);
        }
        return stringBuilder.toString();
    }

    void zzNa() {
        if (this.zzbyo.length == 0) {
            this.cornerPoints = new Point[0];
            return;
        }
        int i = Strategy.TTL_SECONDS_INFINITE;
        int i2 = zzamj.UNSET_ENUM_VALUE;
        int i3 = Strategy.TTL_SECONDS_INFINITE;
        int i4 = zzamj.UNSET_ENUM_VALUE;
        for (LineBoxParcel lineBoxParcel : this.zzbyo) {
            Point[] zza = zza(lineBoxParcel.zzbyx, this.zzbyo[0].zzbyx);
            int i5 = 0;
            while (i5 < 4) {
                Point point = zza[i5];
                int min = Math.min(i3, point.x);
                i3 = Math.max(i2, point.x);
                i2 = Math.min(i, point.y);
                i5++;
                i4 = Math.max(i4, point.y);
                i = i2;
                i2 = i3;
                i3 = min;
            }
        }
        this.cornerPoints = zza(i3, i, i2, i4, this.zzbyo[0].zzbyx);
    }

    List<Line> zzNb() {
        if (this.zzbyo.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzbyp == null) {
            this.zzbyp = new ArrayList(this.zzbyo.length);
            for (LineBoxParcel line : this.zzbyo) {
                this.zzbyp.add(new Line(line));
            }
        }
        return this.zzbyp;
    }
}
