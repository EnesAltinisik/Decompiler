package com.google.firebase.database.connection.idl;

import android.content.Context;
import com.google.android.gms.a.b;
import com.google.android.gms.b.gb;
import com.google.android.gms.b.ge;
import com.google.android.gms.b.gf;
import com.google.android.gms.b.gi;
import com.google.firebase.database.connection.idl.m.a;
import java.util.List;
import java.util.Map;

public class e implements gf {
    private final k a;

    class AnonymousClass2 extends a {
        final /* synthetic */ gi a;

        AnonymousClass2(gi giVar) {
            this.a = giVar;
        }

        public void a(String str, String str2) {
            this.a.a(str, str2);
        }
    }

    private e(k kVar) {
        this.a = kVar;
    }

    public static e a(Context context, c cVar, gb gbVar, gf.a aVar) {
        return new e(IPersistentConnectionImpl.loadDynamic(context, cVar, gbVar.b(), gbVar.c(), aVar));
    }

    private static m a(gi giVar) {
        return new AnonymousClass2(giVar);
    }

    public void a() {
        try {
            this.a.initialize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, gi giVar) {
        try {
            this.a.onDisconnectCancel(list, a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Object obj, gi giVar) {
        try {
            this.a.put(list, b.a(obj), a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Object obj, String str, gi giVar) {
        try {
            this.a.compareAndPut(list, b.a(obj), str, a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Map<String, Object> map) {
        try {
            this.a.unlisten(list, b.a((Object) map));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Map<String, Object> map, final ge geVar, Long l, gi giVar) {
        long longValue;
        j anonymousClass1 = new j.a(this) {
            public String a() {
                return geVar.a();
            }

            public boolean b() {
                return geVar.b();
            }

            public a c() {
                return a.a(geVar.c());
            }
        };
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        longValue = -1;
        this.a.listen(list, b.a((Object) map), anonymousClass1, longValue, a(giVar));
    }

    public void a(List<String> list, Map<String, Object> map, gi giVar) {
        try {
            this.a.merge(list, b.a((Object) map), a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b() {
        try {
            this.a.shutdown();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b(List<String> list, Object obj, gi giVar) {
        try {
            this.a.onDisconnectPut(list, b.a(obj), a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b(List<String> list, Map<String, Object> map, gi giVar) {
        try {
            this.a.onDisconnectMerge(list, b.a((Object) map), a(giVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void c() {
        try {
            this.a.refreshAuthToken();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void c(String str) {
        try {
            this.a.refreshAuthToken2(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void d() {
        try {
            this.a.purgeOutstandingWrites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void d(String str) {
        try {
            this.a.interrupt(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void e(String str) {
        try {
            this.a.resume(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean f(String str) {
        try {
            return this.a.isInterrupted(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
