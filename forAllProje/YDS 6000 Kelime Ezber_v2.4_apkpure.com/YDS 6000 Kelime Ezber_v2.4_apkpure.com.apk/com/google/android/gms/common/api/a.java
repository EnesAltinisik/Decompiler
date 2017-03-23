package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O extends a> {
    private final b<?, O> a;
    private final i<?, O> b = null;
    private final g<?> c;
    private final j<?> d;
    private final String e;

    public interface a {

        public interface a extends a {
        }

        public interface c extends a {
        }

        public interface d extends a, c {
        }

        public static final class b implements c {
            private b() {
            }
        }
    }

    public static abstract class e<T extends c, O> {
        public int a() {
            return Integer.MAX_VALUE;
        }

        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    public static abstract class b<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, p pVar, O o, com.google.android.gms.common.api.c.b bVar, com.google.android.gms.common.api.c.c cVar);
    }

    public interface c {
    }

    public interface f extends c {
        void a();

        void a(com.google.android.gms.common.internal.o.f fVar);

        void a(z zVar, Set<Scope> set);

        void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        boolean f();

        Intent g();

        IBinder h();
    }

    public static class d<C extends c> {
    }

    public static final class g<C extends f> extends d<C> {
    }

    public interface h<T extends IInterface> extends c {
        T a(IBinder iBinder);

        String a();

        String b();
    }

    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    public static final class j<C extends h> extends d<C> {
    }

    public <C extends f> a(String str, b<C, O> bVar, g<C> gVar) {
        com.google.android.gms.common.internal.c.a((Object) bVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.c.a((Object) gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.e = str;
        this.a = bVar;
        this.c = gVar;
        this.d = null;
    }

    public e<?, O> a() {
        return this.a;
    }

    public b<?, O> b() {
        com.google.android.gms.common.internal.c.a(this.a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }

    public d<?> c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public String d() {
        return this.e;
    }
}
