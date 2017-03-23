package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.o.c;

@vz
public abstract class wd implements com.google.android.gms.b.wc.a, zk<Void> {
    private final aaj<wf> a;
    private final com.google.android.gms.b.wc.a b;
    private final Object c = new Object();

    @vz
    public static final class a extends wd {
        private final Context a;

        public a(Context context, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, com.google.android.gms.b.wc.a aVar) {
            super(com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar);
            this.a = context;
        }

        public void a() {
        }

        public wo b() {
            return wx.a(this.a, new pk((String) pr.b.c()), ww.a());
        }

        public /* synthetic */ Object e() {
            return super.c();
        }
    }

    @vz
    public static class b extends wd implements com.google.android.gms.common.internal.o.b, c {
        protected we a;
        private Context b;
        private aab c;
        private aaj<wf> d;
        private final com.google.android.gms.b.wc.a e;
        private final Object f = new Object();
        private boolean g;

        public b(Context context, aab com_google_android_gms_b_aab, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, com.google.android.gms.b.wc.a aVar) {
            Looper a;
            super(com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar);
            this.b = context;
            this.c = com_google_android_gms_b_aab;
            this.d = com_google_android_gms_b_aaj_com_google_android_gms_b_wf;
            this.e = aVar;
            if (((Boolean) pr.O.c()).booleanValue()) {
                this.g = true;
                a = v.u().a();
            } else {
                a = context.getMainLooper();
            }
            this.a = new we(context, a, this, this, this.c.d);
            f();
        }

        public void a() {
            synchronized (this.f) {
                if (this.a.b() || this.a.c()) {
                    this.a.a();
                }
                Binder.flushPendingCommands();
                if (this.g) {
                    v.u().b();
                    this.g = false;
                }
            }
        }

        public void a(int i) {
            zy.b("Disconnected from remote ad request service.");
        }

        public void a(Bundle bundle) {
            e();
        }

        public void a(com.google.android.gms.common.a aVar) {
            zy.b("Cannot connect to remote service, fallback to local instance.");
            g().e();
            Bundle bundle = new Bundle();
            bundle.putString("action", "gms_connection_failed_fallback_to_local");
            v.e().b(this.b, this.c.b, "gmob-apps", bundle, true);
        }

        public wo b() {
            wo k;
            synchronized (this.f) {
                try {
                    k = this.a.k();
                } catch (IllegalStateException e) {
                    k = null;
                    return k;
                } catch (DeadObjectException e2) {
                    k = null;
                    return k;
                }
            }
            return k;
        }

        public /* synthetic */ Object e() {
            return super.c();
        }

        protected void f() {
            this.a.n();
        }

        zk g() {
            return new a(this.b, this.d, this.e);
        }
    }

    public wd(aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, com.google.android.gms.b.wc.a aVar) {
        this.a = com_google_android_gms_b_aaj_com_google_android_gms_b_wf;
        this.b = aVar;
    }

    public abstract void a();

    public void a(wi wiVar) {
        synchronized (this.c) {
            this.b.a(wiVar);
            a();
        }
    }

    boolean a(wo woVar, wf wfVar) {
        try {
            woVar.a(wfVar, new wh(this));
            return true;
        } catch (Throwable e) {
            zy.c("Could not fetch ad response from ad request service.", e);
            v.i().a(e, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new wi(0));
            return false;
        } catch (Throwable e2) {
            zy.c("Could not fetch ad response from ad request service due to an Exception.", e2);
            v.i().a(e2, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new wi(0));
            return false;
        } catch (Throwable e22) {
            zy.c("Could not fetch ad response from ad request service due to an Exception.", e22);
            v.i().a(e22, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new wi(0));
            return false;
        } catch (Throwable e222) {
            zy.c("Could not fetch ad response from ad request service due to an Exception.", e222);
            v.i().a(e222, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new wi(0));
            return false;
        }
    }

    public abstract wo b();

    public Void c() {
        final wo b = b();
        if (b == null) {
            this.b.a(new wi(0));
            a();
        } else {
            this.a.a(new aaj.c<wf>(this) {
                final /* synthetic */ wd b;

                public void a(wf wfVar) {
                    if (!this.b.a(b, wfVar)) {
                        this.b.a();
                    }
                }

                public /* synthetic */ void a(Object obj) {
                    a((wf) obj);
                }
            }, new com.google.android.gms.b.aaj.a(this) {
                final /* synthetic */ wd a;

                {
                    this.a = r1;
                }

                public void a() {
                    this.a.a();
                }
            });
        }
        return null;
    }

    public void d() {
        a();
    }

    public /* synthetic */ Object e() {
        return c();
    }
}
