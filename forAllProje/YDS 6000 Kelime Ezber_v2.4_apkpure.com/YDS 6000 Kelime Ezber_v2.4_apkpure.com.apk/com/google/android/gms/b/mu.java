package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.util.k;
import java.util.ArrayList;
import java.util.List;

@vz
public class mu {
    private final Object a = new Object();
    private a b = null;
    private boolean c = false;

    @TargetApi(14)
    static class a implements ActivityLifecycleCallbacks {
        private Activity a;
        private Context b;
        private final Object c = new Object();
        private boolean d = true;
        private boolean e = false;
        private List<b> f = new ArrayList();
        private Runnable g;
        private boolean h = false;
        private long i;

        a() {
        }

        private void a(Activity activity) {
            synchronized (this.c) {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.a = activity;
                }
            }
        }

        public Activity a() {
            return this.a;
        }

        public void a(Application application, Context context) {
            if (!this.h) {
                application.registerActivityLifecycleCallbacks(this);
                if (context instanceof Activity) {
                    a((Activity) context);
                }
                this.b = context;
                this.i = ((Long) pr.aE.c()).longValue();
                this.h = true;
            }
        }

        public void a(b bVar) {
            this.f.add(bVar);
        }

        public Context b() {
            return this.b;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityDestroyed(android.app.Activity r3) {
            /*
            r2 = this;
            r1 = r2.c;
            monitor-enter(r1);
            r0 = r2.a;	 Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0009;
        L_0x0007:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        L_0x0008:
            return;
        L_0x0009:
            r0 = r2.a;	 Catch:{ all -> 0x0016 }
            r0 = r0.equals(r3);	 Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014;
        L_0x0011:
            r0 = 0;
            r2.a = r0;	 Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            goto L_0x0008;
        L_0x0016:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.mu.a.onActivityDestroyed(android.app.Activity):void");
        }

        public void onActivityPaused(Activity activity) {
            a(activity);
            this.e = true;
            if (this.g != null) {
                zi.a.removeCallbacks(this.g);
            }
            Handler handler = zi.a;
            Runnable anonymousClass1 = new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    synchronized (this.a.c) {
                        if (this.a.d && this.a.e) {
                            this.a.d = false;
                            zy.b("App went background");
                            for (b a : this.a.f) {
                                try {
                                    a.a(false);
                                } catch (Throwable e) {
                                    zy.b("OnForegroundStateChangedListener threw exception.", e);
                                }
                            }
                        } else {
                            zy.b("App is still foreground");
                        }
                    }
                }
            };
            this.g = anonymousClass1;
            handler.postDelayed(anonymousClass1, this.i);
        }

        public void onActivityResumed(Activity activity) {
            boolean z = false;
            a(activity);
            this.e = false;
            if (!this.d) {
                z = true;
            }
            this.d = true;
            if (this.g != null) {
                zi.a.removeCallbacks(this.g);
            }
            synchronized (this.c) {
                if (z) {
                    for (b a : this.f) {
                        try {
                            a.a(true);
                        } catch (Throwable e) {
                            zy.b("OnForegroundStateChangedListener threw exception.", e);
                        }
                    }
                } else {
                    zy.b("App is still foreground.");
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            a(activity);
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public interface b {
        void a(boolean z);
    }

    public Activity a() {
        Activity activity = null;
        synchronized (this.a) {
            if (!k.c()) {
            } else if (this.b != null) {
                activity = this.b.a();
            }
        }
        return activity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r5) {
        /*
        r4 = this;
        r2 = r4.a;
        monitor-enter(r2);
        r0 = r4.c;	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x004c;
    L_0x0007:
        r0 = com.google.android.gms.common.util.k.c();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
    L_0x000e:
        return;
    L_0x000f:
        r0 = com.google.android.gms.b.pr.aD;	 Catch:{ all -> 0x001f }
        r0 = r0.c();	 Catch:{ all -> 0x001f }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x001f }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        throw r0;
    L_0x0022:
        r1 = 0;
        r0 = r5.getApplicationContext();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        r0 = r5;
    L_0x002a:
        r3 = r0 instanceof android.app.Application;	 Catch:{ all -> 0x001f }
        if (r3 == 0) goto L_0x004e;
    L_0x002e:
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x001f }
    L_0x0030:
        if (r0 != 0) goto L_0x0039;
    L_0x0032:
        r0 = "Can not cast Context to Application";
        com.google.android.gms.b.zy.e(r0);	 Catch:{ all -> 0x001f }
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x0039:
        r1 = r4.b;	 Catch:{ all -> 0x001f }
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = new com.google.android.gms.b.mu$a;	 Catch:{ all -> 0x001f }
        r1.<init>();	 Catch:{ all -> 0x001f }
        r4.b = r1;	 Catch:{ all -> 0x001f }
    L_0x0044:
        r1 = r4.b;	 Catch:{ all -> 0x001f }
        r1.a(r0, r5);	 Catch:{ all -> 0x001f }
        r0 = 1;
        r4.c = r0;	 Catch:{ all -> 0x001f }
    L_0x004c:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x004e:
        r0 = r1;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.mu.a(android.content.Context):void");
    }

    public void a(b bVar) {
        synchronized (this.a) {
            if (!k.c()) {
            } else if (((Boolean) pr.aD.c()).booleanValue()) {
                if (this.b == null) {
                    this.b = new a();
                }
                this.b.a(bVar);
            }
        }
    }

    public Context b() {
        Context context = null;
        synchronized (this.a) {
            if (!k.c()) {
            } else if (this.b != null) {
                context = this.b.b();
            }
        }
        return context;
    }
}
