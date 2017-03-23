package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p implements Cloneable {
    private zzame<?, ?> a;
    private Object b;
    private List<q> c;

    p() {
        this.c = new ArrayList();
    }

    <T> p(zzame<?, T> com_google_android_gms_internal_zzame___T, T t) {
        this.a = com_google_android_gms_internal_zzame___T;
        this.b = t;
    }

    private byte[] c() throws IOException {
        byte[] bArr = new byte[a()];
        a(zzamc.zzO(bArr));
        return bArr;
    }

    int a() {
        if (this.b != null) {
            return this.a.zzaP(this.b);
        }
        int i = 0;
        for (q a : this.c) {
            i = a.a() + i;
        }
        return i;
    }

    <T> T a(zzame<?, T> com_google_android_gms_internal_zzame___T) {
        if (this.b == null) {
            this.a = com_google_android_gms_internal_zzame___T;
            this.b = com_google_android_gms_internal_zzame___T.zzV(this.c);
            this.c = null;
        } else if (!this.a.equals(com_google_android_gms_internal_zzame___T)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.b;
    }

    void a(q qVar) {
        this.c.add(qVar);
    }

    void a(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        if (this.b != null) {
            this.a.zza(this.b, com_google_android_gms_internal_zzamc);
            return;
        }
        for (q a : this.c) {
            a.a(com_google_android_gms_internal_zzamc);
        }
    }

    <T> void a(zzame<?, T> com_google_android_gms_internal_zzame___T, T t) {
        this.a = com_google_android_gms_internal_zzame___T;
        this.b = t;
        this.c = null;
    }

    public final p b() {
        p pVar = new p();
        try {
            pVar.a = this.a;
            if (this.c == null) {
                pVar.c = null;
            } else {
                pVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof zzamj) {
                    pVar.b = (zzamj) ((zzamj) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    pVar.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    r4 = new byte[bArr.length][];
                    pVar.b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    pVar.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    pVar.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    pVar.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    pVar.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    pVar.b = ((double[]) this.b).clone();
                } else if (this.b instanceof zzamj[]) {
                    zzamj[] com_google_android_gms_internal_zzamjArr = (zzamj[]) this.b;
                    r4 = new zzamj[com_google_android_gms_internal_zzamjArr.length];
                    pVar.b = r4;
                    for (r2 = 0; r2 < com_google_android_gms_internal_zzamjArr.length; r2++) {
                        r4[r2] = (zzamj) com_google_android_gms_internal_zzamjArr[r2].clone();
                    }
                }
            }
            return pVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.b != null && pVar.b != null) {
            return this.a == pVar.a ? !this.a.zzbSs.isArray() ? this.b.equals(pVar.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) pVar.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) pVar.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) pVar.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) pVar.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) pVar.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) pVar.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) pVar.b) : false;
        } else {
            if (this.c != null && pVar.c != null) {
                return this.c.equals(pVar.c);
            }
            try {
                return Arrays.equals(c(), pVar.c());
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
