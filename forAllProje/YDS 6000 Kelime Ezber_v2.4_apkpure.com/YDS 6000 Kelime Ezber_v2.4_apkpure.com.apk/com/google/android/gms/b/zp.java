package com.google.android.gms.b;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

@vz
public class zp {
    public static final a<Void> a = new a<Void>() {
        public /* bridge */ /* synthetic */ Object b() {
            return null;
        }

        public /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
            return null;
        }
    };
    private static uw b;
    private static final Object c = new Object();

    public interface a<T> {
        T b();

        T b(InputStream inputStream);
    }

    private static class b<T> extends tv<InputStream> {
        private final a<T> a;
        private final com.google.android.gms.b.vx.b<T> b;

        class AnonymousClass1 implements com.google.android.gms.b.vx.a {
            final /* synthetic */ com.google.android.gms.b.vx.b a;
            final /* synthetic */ a b;

            AnonymousClass1(com.google.android.gms.b.vx.b bVar, a aVar) {
                this.a = bVar;
                this.b = aVar;
            }

            public void a(abb com_google_android_gms_b_abb) {
                this.a.a(this.b.b());
            }
        }

        public b(String str, a<T> aVar, com.google.android.gms.b.vx.b<T> bVar) {
            super(0, str, new AnonymousClass1(bVar, aVar));
            this.a = aVar;
            this.b = bVar;
        }

        protected vx<InputStream> a(rt rtVar) {
            return vx.a(new ByteArrayInputStream(rtVar.b), abl.a(rtVar));
        }

        protected void a(InputStream inputStream) {
            this.b.a(this.a.b(inputStream));
        }

        protected /* synthetic */ void a(Object obj) {
            a((InputStream) obj);
        }
    }

    private class c<T> extends aad<T> implements com.google.android.gms.b.vx.b<T> {
        private c(zp zpVar) {
        }

        public void a(T t) {
            super.b((Object) t);
        }
    }

    public zp(Context context) {
        a(context);
    }

    private static uw a(Context context) {
        uw uwVar;
        synchronized (c) {
            if (b == null) {
                b = ao.a(context.getApplicationContext());
            }
            uwVar = b;
        }
        return uwVar;
    }

    public aag<String> a(int i, final String str, Map<String, String> map, byte[] bArr) {
        final Object cVar = new c();
        final byte[] bArr2 = bArr;
        final Map<String, String> map2 = map;
        b.a(new z(this, i, str, cVar, new com.google.android.gms.b.vx.a(this) {
            public void a(abb com_google_android_gms_b_abb) {
                String str = str;
                String valueOf = String.valueOf(com_google_android_gms_b_abb.toString());
                zy.e(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str).append("\n").append(valueOf).toString());
                cVar.a(null);
            }
        }) {
            public Map<String, String> f() {
                return map2 == null ? super.f() : map2;
            }

            public byte[] k() {
                return bArr2 == null ? super.k() : bArr2;
            }
        });
        return cVar;
    }

    public <T> aag<T> a(String str, a<T> aVar) {
        Object cVar = new c();
        b.a(new b(str, aVar, cVar));
        return cVar;
    }

    public aag<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
