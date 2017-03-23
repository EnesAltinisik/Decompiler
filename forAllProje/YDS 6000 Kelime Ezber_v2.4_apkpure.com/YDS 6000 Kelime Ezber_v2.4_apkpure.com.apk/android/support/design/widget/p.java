package android.support.design.widget;

import android.util.StateSet;
import java.util.ArrayList;

final class p {
    s a = null;
    private final ArrayList<a> b = new ArrayList();
    private a c = null;
    private final a d = new b(this) {
        final /* synthetic */ p a;

        {
            this.a = r1;
        }

        public void b(s sVar) {
            if (this.a.a == sVar) {
                this.a.a = null;
            }
        }
    };

    static class a {
        final int[] a;
        final s b;

        a(int[] iArr, s sVar) {
            this.a = iArr;
            this.b = sVar;
        }
    }

    p() {
    }

    private void a(a aVar) {
        this.a = aVar.b;
        this.a.a();
    }

    private void b() {
        if (this.a != null) {
            this.a.d();
            this.a = null;
        }
    }

    public void a() {
        if (this.a != null) {
            this.a.f();
            this.a = null;
        }
    }

    void a(int[] iArr) {
        a aVar;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aVar = (a) this.b.get(i);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
        }
        aVar = null;
        if (aVar != this.c) {
            if (this.c != null) {
                b();
            }
            this.c = aVar;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    public void a(int[] iArr, s sVar) {
        a aVar = new a(iArr, sVar);
        sVar.a(this.d);
        this.b.add(aVar);
    }
}
