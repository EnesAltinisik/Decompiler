package b;

/* compiled from: SegmentPool */
final class q {
    static p a;
    static long b;

    private q() {
    }

    static p a() {
        synchronized (q.class) {
            if (a != null) {
                p pVar = a;
                a = pVar.f;
                pVar.f = null;
                b -= 2048;
                return pVar;
            }
            return new p();
        }
    }

    static void a(p pVar) {
        if (pVar.f != null || pVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!pVar.d) {
            synchronized (q.class) {
                if (b + 2048 > 65536) {
                    return;
                }
                b += 2048;
                pVar.f = a;
                pVar.c = 0;
                pVar.b = 0;
                a = pVar;
            }
        }
    }
}
