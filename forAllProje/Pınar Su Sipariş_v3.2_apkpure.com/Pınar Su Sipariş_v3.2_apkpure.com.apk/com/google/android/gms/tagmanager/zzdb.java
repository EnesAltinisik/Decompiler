package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.adjust.sdk.Constants;

class zzdb extends zzda {
    private static final Object a = new Object();
    private static zzdb n;
    private Context b;
    private t c;
    private volatile r d;
    private int e = Constants.THIRTY_MINUTES;
    private boolean f = true;
    private boolean g = false;
    private boolean h = true;
    private boolean i = true;
    private u j = new u(this) {
        final /* synthetic */ zzdb a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            this.a.a(z, this.a.h);
        }
    };
    private zza k;
    private ah l;
    private boolean m = false;

    public interface zza {
        void cancel();

        void zzKG();

        void zzv(long j);
    }

    private class a implements zza {
        final /* synthetic */ zzdb a;
        private Handler b;

        private a(zzdb com_google_android_gms_tagmanager_zzdb) {
            this.a = com_google_android_gms_tagmanager_zzdb;
            this.b = new Handler(this.a.b.getMainLooper(), new Callback(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public boolean handleMessage(Message message) {
                    if (1 == message.what && zzdb.a.equals(message.obj)) {
                        this.a.a.dispatch();
                        if (!this.a.a.f()) {
                            this.a.zzv((long) this.a.a.e);
                        }
                    }
                    return true;
                }
            });
        }

        private Message a() {
            return this.b.obtainMessage(1, zzdb.a);
        }

        public void cancel() {
            this.b.removeMessages(1, zzdb.a);
        }

        public void zzKG() {
            this.b.removeMessages(1, zzdb.a);
            this.b.sendMessage(a());
        }

        public void zzv(long j) {
            this.b.removeMessages(1, zzdb.a);
            this.b.sendMessageDelayed(a(), j);
        }
    }

    private zzdb() {
    }

    public static zzdb a() {
        if (n == null) {
            n = new zzdb();
        }
        return n;
    }

    private void d() {
        this.l = new ah(this);
        this.l.a(this.b);
    }

    private void e() {
        this.k = new a();
        if (this.e > 0) {
            this.k.zzv((long) this.e);
        }
    }

    private boolean f() {
        return this.m || !this.h || this.e <= 0;
    }

    private void g() {
        if (f()) {
            this.k.cancel();
            zzbn.v("PowerSaveMode initiated.");
            return;
        }
        this.k.zzv((long) this.e);
        zzbn.v("PowerSaveMode terminated.");
    }

    synchronized void a(Context context, r rVar) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
            if (this.d == null) {
                this.d = rVar;
            }
        }
    }

    synchronized void a(boolean z, boolean z2) {
        boolean f = f();
        this.m = z;
        this.h = z2;
        if (f() != f) {
            g();
        }
    }

    synchronized t b() {
        if (this.c == null) {
            if (this.b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.c = new au(this.j, this.b);
        }
        if (this.k == null) {
            e();
        }
        this.g = true;
        if (this.f) {
            dispatch();
            this.f = false;
        }
        if (this.l == null && this.i) {
            d();
        }
        return this.c;
    }

    public synchronized void dispatch() {
        if (this.g) {
            this.d.a(new Runnable(this) {
                final /* synthetic */ zzdb a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.c.a();
                }
            });
        } else {
            zzbn.v("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f = true;
        }
    }

    public synchronized void zzaF(boolean z) {
        a(this.m, z);
    }

    public synchronized void zzlM() {
        if (!f()) {
            this.k.zzKG();
        }
    }
}
