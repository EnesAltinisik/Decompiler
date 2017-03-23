package org.b.a;

/* compiled from: SoapPrimitive */
public class i extends a {
    protected String b;
    protected String c;
    protected Object d;

    public i(String str, String str2, Object obj) {
        this.b = str;
        this.c = str2;
        this.d = obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = r5 instanceof org.b.a.i;
        if (r2 != 0) goto L_0x0007;
    L_0x0006:
        return r1;
    L_0x0007:
        r5 = (org.b.a.i) r5;
        r2 = r4.c;
        r3 = r5.c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0038;
    L_0x0013:
        r2 = r4.b;
        if (r2 != 0) goto L_0x002e;
    L_0x0017:
        r2 = r5.b;
        if (r2 != 0) goto L_0x0038;
    L_0x001b:
        r2 = r4.d;
        if (r2 != 0) goto L_0x003a;
    L_0x001f:
        r2 = r5.d;
        if (r2 != 0) goto L_0x0038;
    L_0x0023:
        r2 = r0;
    L_0x0024:
        if (r2 == 0) goto L_0x0045;
    L_0x0026:
        r2 = r4.a(r5);
        if (r2 == 0) goto L_0x0045;
    L_0x002c:
        r1 = r0;
        goto L_0x0006;
    L_0x002e:
        r2 = r4.b;
        r3 = r5.b;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x001b;
    L_0x0038:
        r2 = r1;
        goto L_0x0024;
    L_0x003a:
        r2 = r4.d;
        r3 = r5.d;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0038;
    L_0x0044:
        goto L_0x0023;
    L_0x0045:
        r0 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.b.a.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) ^ this.c.hashCode();
    }

    public String toString() {
        return this.d != null ? this.d.toString() : null;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}
