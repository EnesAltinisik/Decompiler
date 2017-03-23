package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.v;
import java.util.Map;

@vz
public class sv {
    private final Object a;
    private final Context b;
    private final String c;
    private final aab d;
    private zn<sr> e;
    private zn<sr> f;
    private d g;
    private int h;

    static class a {
        static int a = 60000;
        static int b = 10000;
    }

    public static class b<T> implements zn<T> {
        public void a(T t) {
        }
    }

    public static class c extends aak<sw> {
        private final Object d = new Object();
        private final d e;
        private boolean f;

        public c(d dVar) {
            this.e = dVar;
        }

        public void g_() {
            synchronized (this.d) {
                if (this.f) {
                    return;
                }
                this.f = true;
                a(new com.google.android.gms.b.aaj.c<sw>(this) {
                    public void a(sw swVar) {
                        ze.a("Ending javascript session.");
                        ((sx) swVar).a();
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sw) obj);
                    }
                }, new com.google.android.gms.b.aaj.b());
                a(new com.google.android.gms.b.aaj.c<sw>(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void a(sw swVar) {
                        ze.a("Releasing engine reference.");
                        this.a.e.i_();
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sw) obj);
                    }
                }, new com.google.android.gms.b.aaj.a(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                        this.a.e.i_();
                    }
                });
            }
        }
    }

    public static class d extends aak<sr> {
        private final Object d = new Object();
        private zn<sr> e;
        private boolean f;
        private int g;

        public d(zn<sr> znVar) {
            this.e = znVar;
            this.f = false;
            this.g = 0;
        }

        public void c() {
            boolean z = true;
            synchronized (this.d) {
                if (this.g < 0) {
                    z = false;
                }
                com.google.android.gms.common.internal.c.a(z);
                ze.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.f = true;
                d();
            }
        }

        protected void d() {
            synchronized (this.d) {
                com.google.android.gms.common.internal.c.a(this.g >= 0);
                if (this.f && this.g == 0) {
                    ze.a("No reference is left (including root). Cleaning up engine.");
                    a(new com.google.android.gms.b.aaj.c<sr>(this) {
                        final /* synthetic */ d a;

                        {
                            this.a = r1;
                        }

                        public void a(final sr srVar) {
                            v.e().a(new Runnable(this) {
                                final /* synthetic */ AnonymousClass3 b;

                                public void run() {
                                    this.b.a.e.a(srVar);
                                    srVar.a();
                                }
                            });
                        }

                        public /* synthetic */ void a(Object obj) {
                            a((sr) obj);
                        }
                    }, new com.google.android.gms.b.aaj.b());
                } else {
                    ze.a("There are still references to the engine. Not destroying.");
                }
            }
        }

        public c h_() {
            final c cVar = new c(this);
            synchronized (this.d) {
                a(new com.google.android.gms.b.aaj.c<sr>(this) {
                    public void a(sr srVar) {
                        ze.a("Getting a new session for JS Engine.");
                        cVar.a(srVar.b());
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sr) obj);
                    }
                }, new com.google.android.gms.b.aaj.a(this) {
                    public void a() {
                        ze.a("Rejecting reference for JS Engine.");
                        cVar.a();
                    }
                });
                com.google.android.gms.common.internal.c.a(this.g >= 0);
                this.g++;
            }
            return cVar;
        }

        protected void i_() {
            boolean z = true;
            synchronized (this.d) {
                if (this.g < 1) {
                    z = false;
                }
                com.google.android.gms.common.internal.c.a(z);
                ze.a("Releasing 1 reference for JS Engine");
                this.g--;
                d();
            }
        }
    }

    public static class e extends aak<sw> {
        private c d;

        public e(c cVar) {
            this.d = cVar;
        }

        public void a() {
            this.d.a();
        }

        public void a(com.google.android.gms.b.aaj.c<sw> cVar, com.google.android.gms.b.aaj.a aVar) {
            this.d.a(cVar, aVar);
        }

        public void a(sw swVar) {
            this.d.a(swVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((sw) obj);
        }

        public int b() {
            return this.d.b();
        }

        public void finalize() {
            this.d.g_();
            this.d = null;
        }
    }

    public sv(Context context, aab com_google_android_gms_b_aab, String str) {
        this.a = new Object();
        this.h = 1;
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = com_google_android_gms_b_aab;
        this.e = new b();
        this.f = new b();
    }

    public sv(Context context, aab com_google_android_gms_b_aab, String str, zn<sr> znVar, zn<sr> znVar2) {
        this(context, com_google_android_gms_b_aab, str);
        this.e = znVar;
        this.f = znVar2;
    }

    private d c(final dp dpVar) {
        final d dVar = new d(this.f);
        v.e().a(new Runnable(this) {
            final /* synthetic */ sv c;

            public void run() {
                final sr a = this.c.a(this.c.b, this.c.d, dpVar);
                a.a(new com.google.android.gms.b.sr.a(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void a() {
                        zi.a.postDelayed(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            /* JADX WARNING: inconsistent code. */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public void run() {
                                /*
                                r3 = this;
                                r0 = r3.a;
                                r0 = r0.b;
                                r0 = r0.c;
                                r1 = r0.a;
                                monitor-enter(r1);
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b();	 Catch:{ all -> 0x0043 }
                                r2 = -1;
                                if (r0 == r2) goto L_0x0025;
                            L_0x0018:
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b();	 Catch:{ all -> 0x0043 }
                                r2 = 1;
                                if (r0 != r2) goto L_0x0027;
                            L_0x0025:
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            L_0x0026:
                                return;
                            L_0x0027:
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0.a();	 Catch:{ all -> 0x0043 }
                                r0 = com.google.android.gms.ads.internal.v.e();	 Catch:{ all -> 0x0043 }
                                r2 = new com.google.android.gms.b.sv$1$1$1$1;	 Catch:{ all -> 0x0043 }
                                r2.<init>(r3);	 Catch:{ all -> 0x0043 }
                                r0.a(r2);	 Catch:{ all -> 0x0043 }
                                r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                                com.google.android.gms.b.ze.a(r0);	 Catch:{ all -> 0x0043 }
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                                goto L_0x0026;
                            L_0x0043:
                                r0 = move-exception;
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                                throw r0;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.sv.1.1.1.run():void");
                            }
                        }, (long) a.b);
                    }
                });
                a.a("/jsLoaded", new rq(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void a(com.google.android.gms.b.aaq r4, java.util.Map<java.lang.String, java.lang.String> r5) {
                        /*
                        r3 = this;
                        r0 = r3.b;
                        r0 = r0.c;
                        r1 = r0.a;
                        monitor-enter(r1);
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.b();	 Catch:{ all -> 0x0051 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.b();	 Catch:{ all -> 0x0051 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r2 = 0;
                        r0.h = r2;	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r0 = r0.e;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r2 = r3.b;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.g = r2;	 Catch:{ all -> 0x0051 }
                        r0 = "Successfully loaded JS Engine.";
                        com.google.android.gms.b.ze.a(r0);	 Catch:{ all -> 0x0051 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        goto L_0x0020;
                    L_0x0051:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.sv.1.2.a(com.google.android.gms.b.aaq, java.util.Map):void");
                    }
                });
                final zu zuVar = new zu();
                rq anonymousClass3 = new rq(this) {
                    final /* synthetic */ AnonymousClass1 c;

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        synchronized (this.c.c.a) {
                            zy.d("JS Engine is requesting an update");
                            if (this.c.c.h == 0) {
                                zy.d("Starting reload.");
                                this.c.c.h = 2;
                                this.c.c.a(dpVar);
                            }
                            a.b("/requestReload", (rq) zuVar.a());
                        }
                    }
                };
                zuVar.a(anonymousClass3);
                a.a("/requestReload", anonymousClass3);
                if (this.c.c.endsWith(".js")) {
                    a.a(this.c.c);
                } else if (this.c.c.startsWith("<html>")) {
                    a.c(this.c.c);
                } else {
                    a.b(this.c.c);
                }
                zi.a.postDelayed(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.b;
                        r0 = r0.c;
                        r1 = r0.a;
                        monitor-enter(r1);
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.b();	 Catch:{ all -> 0x003b }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.b();	 Catch:{ all -> 0x003b }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0.a();	 Catch:{ all -> 0x003b }
                        r0 = com.google.android.gms.ads.internal.v.e();	 Catch:{ all -> 0x003b }
                        r2 = new com.google.android.gms.b.sv$1$4$1;	 Catch:{ all -> 0x003b }
                        r2.<init>(r3);	 Catch:{ all -> 0x003b }
                        r0.a(r2);	 Catch:{ all -> 0x003b }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        com.google.android.gms.b.ze.a(r0);	 Catch:{ all -> 0x003b }
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        goto L_0x0020;
                    L_0x003b:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.sv.1.4.run():void");
                    }
                }, (long) a.a);
            }
        });
        return dVar;
    }

    protected sr a(Context context, aab com_google_android_gms_b_aab, dp dpVar) {
        return new st(context, com_google_android_gms_b_aab, dpVar, null);
    }

    public c a() {
        return b(null);
    }

    protected d a(dp dpVar) {
        final d c = c(dpVar);
        c.a(new com.google.android.gms.b.aaj.c<sr>(this) {
            final /* synthetic */ sv b;

            public void a(sr srVar) {
                synchronized (this.b.a) {
                    this.b.h = 0;
                    if (!(this.b.g == null || c == this.b.g)) {
                        ze.a("New JS engine is loaded, marking previous one as destroyable.");
                        this.b.g.c();
                    }
                    this.b.g = c;
                }
            }

            public /* synthetic */ void a(Object obj) {
                a((sr) obj);
            }
        }, new com.google.android.gms.b.aaj.a(this) {
            final /* synthetic */ sv b;

            public void a() {
                synchronized (this.b.a) {
                    this.b.h = 1;
                    ze.a("Failed loading new engine. Marking new engine destroyable.");
                    c.c();
                }
            }
        });
        return c;
    }

    public c b(dp dpVar) {
        c h_;
        synchronized (this.a) {
            if (this.g == null || this.g.b() == -1) {
                this.h = 2;
                this.g = a(dpVar);
                h_ = this.g.h_();
            } else if (this.h == 0) {
                h_ = this.g.h_();
            } else if (this.h == 1) {
                this.h = 2;
                a(dpVar);
                h_ = this.g.h_();
            } else if (this.h == 2) {
                h_ = this.g.h_();
            } else {
                h_ = this.g.h_();
            }
        }
        return h_;
    }
}
