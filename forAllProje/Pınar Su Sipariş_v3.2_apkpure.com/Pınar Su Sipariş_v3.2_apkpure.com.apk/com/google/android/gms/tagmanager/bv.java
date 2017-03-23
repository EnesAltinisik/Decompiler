package com.google.android.gms.tagmanager;

class bv extends Number implements Comparable<bv> {
    private double a;
    private long b;
    private boolean c = false;

    private bv(double d) {
        this.a = d;
    }

    private bv(long j) {
        this.b = j;
    }

    public static bv a(long j) {
        return new bv(j);
    }

    public static bv a(Double d) {
        return new bv(d.doubleValue());
    }

    public static bv a(String str) throws NumberFormatException {
        try {
            return new bv(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new bv(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(String.valueOf(str).concat(" is not a valid TypedNumber"));
            }
        }
    }

    public int a(bv bvVar) {
        return (b() && bvVar.b()) ? new Long(this.b).compareTo(Long.valueOf(bvVar.b)) : Double.compare(doubleValue(), bvVar.doubleValue());
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return this.c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public long c() {
        return b() ? this.b : (long) this.a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((bv) obj);
    }

    public int d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return b() ? (double) this.b : this.a;
    }

    public short e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof bv) && a((bv) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return d();
    }

    public long longValue() {
        return c();
    }

    public short shortValue() {
        return e();
    }

    public String toString() {
        return b() ? Long.toString(this.b) : Double.toString(this.a);
    }
}
