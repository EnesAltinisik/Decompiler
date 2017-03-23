package com.google.android.gms.b;

public class kp {
    static final /* synthetic */ boolean a = (!kp.class.desiredAssertionStatus());

    private static long a(jo<?> joVar) {
        long j = 8;
        if (!((joVar instanceof ji) || (joVar instanceof jp))) {
            if (joVar instanceof jd) {
                j = 4;
            } else if (joVar instanceof jx) {
                j = (long) (((String) joVar.a()).length() + 2);
            } else {
                String valueOf = String.valueOf(joVar.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown leaf node type: ").append(valueOf).toString());
            }
        }
        if (joVar.e().b()) {
            return j;
        }
        return a((jo) joVar.e()) + (24 + j);
    }

    public static long a(jr jrVar) {
        if (jrVar.b()) {
            return 4;
        }
        if (jrVar.d()) {
            return a((jo) jrVar);
        }
        if (a || (jrVar instanceof jf)) {
            long j = 1;
            for (jq jqVar : jrVar) {
                j = a(jqVar.b()) + ((j + ((long) jqVar.a().d().length())) + 4);
            }
            return !jrVar.e().b() ? (j + 12) + a((jo) jrVar.e()) : j;
        } else {
            String valueOf = String.valueOf(jrVar.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
    }

    public static int b(jr jrVar) {
        if (jrVar.b()) {
            return 0;
        }
        if (jrVar.d()) {
            return 1;
        }
        if (a || (jrVar instanceof jf)) {
            int i = 0;
            for (jq b : jrVar) {
                i = b(b.b()) + i;
            }
            return i;
        }
        String valueOf = String.valueOf(jrVar.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
    }
}
