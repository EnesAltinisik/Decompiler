package com.google.android.gms.b;

import com.google.android.gms.b.gf.a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

enum gv implements gy {
    INSTANCE;
    
    static ThreadFactory b;
    static final hj c = null;

    static {
        c = new hj() {
            public void a(Thread thread, String str) {
            }

            public void a(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }

            public void a(Thread thread, boolean z) {
            }
        };
    }

    public static boolean a() {
        return c() != null;
    }

    private static ThreadFactory c() {
        if (b == null) {
            try {
                Class cls = Class.forName("com.google.appengine.api.ThreadManager");
                if (cls != null) {
                    b = (ThreadFactory) cls.getMethod("backgroundThreadFactory", new Class[0]).invoke(null, new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                return null;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            }
        }
        return b;
    }

    public gf a(gq gqVar, gb gbVar, gd gdVar, a aVar) {
        return new gg(gqVar.g(), gdVar, aVar);
    }

    public gm a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public gu a(gq gqVar) {
        return new hk(c(), c);
    }

    public ib a(gq gqVar, String str) {
        return null;
    }

    public jc a(gq gqVar, jc.a aVar, List<String> list) {
        return new ja(aVar, list);
    }

    public hc b(gq gqVar) {
        final jb a = gqVar.a("RunLoop");
        return new ko(this) {
            protected ThreadFactory a() {
                return gv.b;
            }

            public void a(Throwable th) {
                a.a(ko.b(th), th);
            }

            protected hj b() {
                return gv.c;
            }
        };
    }

    public void b() {
        kb.a(b, new ka(this) {
            public void a(Thread thread, String str) {
                gv.c.a(thread, str);
            }
        });
    }

    public String c(gq gqVar) {
        String str = "AppEngine";
        String property = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property).length() + 1) + String.valueOf(str).length()).append(property).append("/").append(str).toString();
    }
}
