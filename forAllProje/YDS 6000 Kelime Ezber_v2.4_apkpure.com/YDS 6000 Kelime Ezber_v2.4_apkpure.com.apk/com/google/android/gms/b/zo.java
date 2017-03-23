package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.List;

@vz
public class zo {
    private final String[] a;
    private final double[] b;
    private final double[] c;
    private final int[] d;
    private int e;

    public static class a {
        public final String a;
        public final double b;
        public final double c;
        public final double d;
        public final int e;

        public a(String str, double d, double d2, double d3, int i) {
            this.a = str;
            this.c = d;
            this.b = d2;
            this.d = d3;
            this.e = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return com.google.android.gms.common.internal.b.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.e == aVar.e && Double.compare(this.d, aVar.d) == 0;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.b.a(this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e));
        }

        public String toString() {
            return com.google.android.gms.common.internal.b.a((Object) this).a("name", this.a).a("minBound", Double.valueOf(this.c)).a("maxBound", Double.valueOf(this.b)).a("percent", Double.valueOf(this.d)).a("count", Integer.valueOf(this.e)).toString();
        }
    }

    public static class b {
        private final List<String> a = new ArrayList();
        private final List<Double> b = new ArrayList();
        private final List<Double> c = new ArrayList();

        public b a(String str, double d, double d2) {
            int i = 0;
            while (i < this.a.size()) {
                double doubleValue = ((Double) this.c.get(i)).doubleValue();
                double doubleValue2 = ((Double) this.b.get(i)).doubleValue();
                if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                    break;
                }
                i++;
            }
            this.a.add(i, str);
            this.c.add(i, Double.valueOf(d));
            this.b.add(i, Double.valueOf(d2));
            return this;
        }

        public zo a() {
            return new zo();
        }
    }

    private zo(b bVar) {
        int size = bVar.b.size();
        this.a = (String[]) bVar.a.toArray(new String[size]);
        this.b = a(bVar.b);
        this.c = a(bVar.c);
        this.d = new int[size];
        this.e = 0;
    }

    private double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public List<a> a() {
        List<a> arrayList = new ArrayList(this.a.length);
        for (int i = 0; i < this.a.length; i++) {
            arrayList.add(new a(this.a[i], this.c[i], this.b[i], ((double) this.d[i]) / ((double) this.e), this.d[i]));
        }
        return arrayList;
    }

    public void a(double d) {
        this.e++;
        int i = 0;
        while (i < this.c.length) {
            if (this.c[i] <= d && d < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
