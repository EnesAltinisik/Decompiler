package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.adjust.sdk.Constants;

class zzuz extends zzuy {
    private static final Object a = new Object();
    private static zzuz o;
    private Context b;
    private aq c;
    private volatile ao d;
    private int e = Constants.THIRTY_MINUTES;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private boolean j = true;
    private ar k = new ar(this) {
        final /* synthetic */ zzuz a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            this.a.a(z, this.a.i);
        }
    };
    private zza l;
    private as m;
    private boolean n = false;

    public interface zza {
        void cancel();

        void zzKG();

        void zzv(long j);
    }

    private class a implements zza {
        final /* synthetic */ zzuz a;
        private Handler b;

        private a(zzuz com_google_android_gms_internal_zzuz) {
            this.a = com_google_android_gms_internal_zzuz;
            this.b = new Handler(this.a.b.getMainLooper(), new Callback(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public boolean handleMessage(Message message) {
                    if (1 == message.what && zzuz.a.equals(message.obj)) {
                        this.a.a.c();
                        if (!this.a.a.g()) {
                            this.a.zzv((long) this.a.a.e);
                        }
                    }
                    return true;
                }
            });
        }

        private Message a() {
            return this.b.obtainMessage(1, zzuz.a);
        }

        public void cancel() {
            this.b.removeMessages(1, zzuz.a);
        }

        public void zzKG() {
            this.b.removeMessages(1, zzuz.a);
            this.b.sendMessage(a());
        }

        public void zzv(long j) {
            this.b.removeMessages(1, zzuz.a);
            this.b.sendMessageDelayed(a(), j);
        }
    }

    private zzuz() {
    }

    public static zzuz a() {
        if (o == null) {
            o = new zzuz();
        }
        return o;
    }

    private void e() {
        this.m = new as(this);
        this.m.a(this.b);
    }

    private void f() {
        this.l = new a();
        if (this.e > 0) {
            this.l.zzv((long) this.e);
        }
    }

    private boolean g() {
        return this.n || !this.i || this.e <= 0;
    }

    private void h() {
        if (g()) {
            this.l.cancel();
            zzun.v("PowerSaveMode initiated.");
            return;
        }
        this.l.zzv((long) this.e);
        zzun.v("PowerSaveMode terminated.");
    }

    synchronized void a(Context context, ao aoVar) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
            if (this.d == null) {
                this.d = aoVar;
            }
        }
    }

    synchronized void a(boolean z, boolean z2) {
        boolean g = g();
        this.n = z;
        this.i = z2;
        if (g() != g) {
            h();
        }
    }

    synchronized aq b() {
        if (this.c == null) {
            if (this.b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.c = new at(this.k, this.b);
        }
        if (this.l == null) {
            f();
        }
        this.g = true;
        if (this.f) {
            c();
            this.f = false;
        }
        if (this.m == null && this.j) {
            e();
        }
        return this.c;
    }

    public synchronized void c() {
        if (!this.g) {
            zzun.v("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f = true;
        } else if (!this.h) {
            this.h = true;
            this.d.a(new Runnable(this) {
                final /* synthetic */ zzuz a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.h = false;
                    this.a.c.a();
                }
            });
        }
    }

    public synchronized void zzaF(boolean z) {
        a(this.n, z);
    }

    public synchronized void zzlM() {
        if (!g()) {
            this.l.zzKG();
        }
    }
}
