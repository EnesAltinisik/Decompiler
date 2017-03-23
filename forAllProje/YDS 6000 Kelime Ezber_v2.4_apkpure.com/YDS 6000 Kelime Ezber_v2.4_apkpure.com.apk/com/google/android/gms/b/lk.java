package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class lk implements Cloneable {
    private li<?, ?> a;
    private Object b;
    private List<lp> c = new ArrayList();

    lk() {
    }

    private byte[] c() {
        byte[] bArr = new byte[a()];
        a(lg.a(bArr));
        return bArr;
    }

    int a() {
        if (this.b != null) {
            return this.a.a(this.b);
        }
        int i = 0;
        for (lp a : this.c) {
            i = a.a() + i;
        }
        return i;
    }

    void a(lg lgVar) {
        if (this.b != null) {
            this.a.a(this.b, lgVar);
            return;
        }
        for (lp a : this.c) {
            a.a(lgVar);
        }
    }

    void a(lp lpVar) {
        this.c.add(lpVar);
    }

    public final lk b() {
        lk lkVar = new lk();
        try {
            lkVar.a = this.a;
            if (this.c == null) {
                lkVar.c = null;
            } else {
                lkVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof ln) {
                    lkVar.b = (ln) ((ln) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    lkVar.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    r4 = new byte[bArr.length][];
                    lkVar.b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    lkVar.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    lkVar.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    lkVar.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    lkVar.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    lkVar.b = ((double[]) this.b).clone();
                } else if (this.b instanceof ln[]) {
                    ln[] lnVarArr = (ln[]) this.b;
                    r4 = new ln[lnVarArr.length];
                    lkVar.b = r4;
                    for (r2 = 0; r2 < lnVarArr.length; r2++) {
                        r4[r2] = (ln) lnVarArr[r2].clone();
                    }
                }
            }
            return lkVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        if (this.b != null && lkVar.b != null) {
            return this.a == lkVar.a ? !this.a.b.isArray() ? this.b.equals(lkVar.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) lkVar.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) lkVar.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) lkVar.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) lkVar.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) lkVar.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) lkVar.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) lkVar.b) : false;
        } else {
            if (this.c != null && lkVar.c != null) {
                return this.c.equals(lkVar.c);
            }
            try {
                return Arrays.equals(c(), lkVar.c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
