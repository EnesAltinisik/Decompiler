package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class bj {

    static class a implements b, c {
        protected bk a;
        private final String b;
        private final String c;
        private final LinkedBlockingQueue<com.google.android.gms.b.aw.a> d;
        private final HandlerThread e = new HandlerThread("GassClient");

        public a(Context context, String str, String str2) {
            this.b = str;
            this.c = str2;
            this.e.start();
            this.a = new bk(context, this.e.getLooper(), this, this);
            this.d = new LinkedBlockingQueue();
            c();
        }

        public com.google.android.gms.b.aw.a a() {
            return b(2000);
        }

        public void a(int i) {
            try {
                this.d.put(new com.google.android.gms.b.aw.a());
            } catch (InterruptedException e) {
            }
        }

        public void a(Bundle bundle) {
            bp b = b();
            if (b != null) {
                try {
                    this.d.put(b.a(new bl(this.b, this.c)).b());
                } catch (Throwable th) {
                } finally {
                    d();
                    this.e.quit();
                }
            }
        }

        public void a(com.google.android.gms.common.a aVar) {
            try {
                this.d.put(new com.google.android.gms.b.aw.a());
            } catch (InterruptedException e) {
            }
        }

        public com.google.android.gms.b.aw.a b(int i) {
            com.google.android.gms.b.aw.a aVar;
            try {
                aVar = (com.google.android.gms.b.aw.a) this.d.poll((long) i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                aVar = null;
            }
            return aVar == null ? new com.google.android.gms.b.aw.a() : aVar;
        }

        protected bp b() {
            try {
                return this.a.k();
            } catch (IllegalStateException e) {
                return null;
            } catch (DeadObjectException e2) {
                return null;
            }
        }

        protected void c() {
            this.a.n();
        }

        public void d() {
            if (this.a == null) {
                return;
            }
            if (this.a.b() || this.a.c()) {
                this.a.a();
            }
        }
    }

    public static com.google.android.gms.b.aw.a a(Context context, String str, String str2) {
        return new a(context, str, str2).a();
    }
}
