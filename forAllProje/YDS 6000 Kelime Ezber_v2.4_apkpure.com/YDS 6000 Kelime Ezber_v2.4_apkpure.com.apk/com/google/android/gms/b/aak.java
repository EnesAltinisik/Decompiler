package com.google.android.gms.b;

import com.google.android.gms.b.aaj.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@vz
public class aak<T> implements aaj<T> {
    protected int a = 0;
    protected final BlockingQueue<a> b = new LinkedBlockingQueue();
    protected T c;
    private final Object d = new Object();

    class a {
        public final c<T> a;
        public final com.google.android.gms.b.aaj.a b;

        public a(aak com_google_android_gms_b_aak, c<T> cVar, com.google.android.gms.b.aaj.a aVar) {
            this.a = cVar;
            this.b = aVar;
        }
    }

    public void a() {
        synchronized (this.d) {
            if (this.a != 0) {
                throw new UnsupportedOperationException();
            }
            this.a = -1;
            for (a aVar : this.b) {
                aVar.b.a();
            }
            this.b.clear();
        }
    }

    public void a(c<T> cVar, com.google.android.gms.b.aaj.a aVar) {
        synchronized (this.d) {
            if (this.a == 1) {
                cVar.a(this.c);
            } else if (this.a == -1) {
                aVar.a();
            } else if (this.a == 0) {
                this.b.add(new a(this, cVar, aVar));
            }
        }
    }

    public void a(T t) {
        synchronized (this.d) {
            if (this.a != 0) {
                throw new UnsupportedOperationException();
            }
            this.c = t;
            this.a = 1;
            for (a aVar : this.b) {
                aVar.a.a(t);
            }
            this.b.clear();
        }
    }

    public int b() {
        return this.a;
    }
}
