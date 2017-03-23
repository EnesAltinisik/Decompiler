package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

public final class abo {
    public static final g<abt> a = new g();
    public static final com.google.android.gms.common.api.a.b<abt, com.google.android.gms.common.api.a.a.b> b = new com.google.android.gms.common.api.a.b<abt, com.google.android.gms.common.api.a.a.b>() {
        public abt a(Context context, Looper looper, p pVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.c.b bVar2, com.google.android.gms.common.api.c.c cVar) {
            return new abt(context, looper, pVar, bVar2, cVar);
        }

        public /* synthetic */ f a(Context context, Looper looper, p pVar, Object obj, com.google.android.gms.common.api.c.b bVar, com.google.android.gms.common.api.c.c cVar) {
            return a(context, looper, pVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }
    };
    @Deprecated
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> c = new com.google.android.gms.common.api.a("ClearcutLogger.API", b, a);
    private final String d;
    private final int e;
    private String f;
    private int g;
    private String h;
    private String i;
    private final boolean j;
    private int k;
    private final abp l;
    private final com.google.android.gms.common.util.c m;
    private d n;
    private final b o;

    public class a {
        final /* synthetic */ abo a;
        private int b;
        private String c;
        private String d;
        private String e;
        private int f;
        private final c g;
        private ArrayList<Integer> h;
        private ArrayList<String> i;
        private ArrayList<Integer> j;
        private ArrayList<byte[]> k;
        private boolean l;
        private final com.google.android.gms.b.lr.c m;
        private boolean n;

        private a(abo com_google_android_gms_b_abo, byte[] bArr) {
            this(com_google_android_gms_b_abo, bArr, null);
        }

        private a(abo com_google_android_gms_b_abo, byte[] bArr, c cVar) {
            this.a = com_google_android_gms_b_abo;
            this.b = this.a.g;
            this.c = this.a.f;
            this.d = this.a.h;
            this.e = this.a.i;
            this.f = 0;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = true;
            this.m = new com.google.android.gms.b.lr.c();
            this.n = false;
            this.d = com_google_android_gms_b_abo.h;
            this.e = com_google_android_gms_b_abo.i;
            this.m.a = com_google_android_gms_b_abo.m.a();
            this.m.b = com_google_android_gms_b_abo.m.b();
            this.m.o = com_google_android_gms_b_abo.n.a(this.m.a);
            if (bArr != null) {
                this.m.k = bArr;
            }
            this.g = cVar;
        }

        public a a(int i) {
            this.m.e = i;
            return this;
        }

        public abq a() {
            return new abq(new dr(this.a.d, this.a.e, this.b, this.c, this.d, this.e, this.a.j, this.f), this.m, this.g, null, abo.d(null), abo.e(null), abo.d(null), abo.f(null), this.l);
        }

        @Deprecated
        public com.google.android.gms.common.api.d<Status> a(com.google.android.gms.common.api.c cVar) {
            return b();
        }

        public a b(int i) {
            this.m.f = i;
            return this;
        }

        @Deprecated
        public com.google.android.gms.common.api.d<Status> b() {
            if (this.n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.n = true;
            abq a = a();
            dr drVar = a.b;
            return this.a.o.a(drVar.h, drVar.d) ? this.a.l.a(a) : e.a(Status.a);
        }
    }

    public interface b {
        boolean a(String str, int i);
    }

    public interface c {
        byte[] a();
    }

    public static class d {
        public long a(long j) {
            return (long) (TimeZone.getDefault().getOffset(j) / 1000);
        }
    }

    public abo(Context context, int i, String str, String str2, String str3, boolean z, abp com_google_android_gms_b_abp, com.google.android.gms.common.util.c cVar, d dVar, b bVar) {
        boolean z2 = false;
        this.g = -1;
        this.k = 0;
        this.d = context.getPackageName();
        this.e = a(context);
        this.g = i;
        this.f = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.l = com_google_android_gms_b_abp;
        this.m = cVar;
        if (dVar == null) {
            dVar = new d();
        }
        this.n = dVar;
        this.k = 0;
        this.o = bVar;
        if (this.j) {
            if (this.h == null) {
                z2 = true;
            }
            com.google.android.gms.common.internal.c.b(z2, "can't be anonymous with an upload account");
        }
    }

    public abo(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, abs.a(context), com.google.android.gms.common.util.e.d(), null, new abx(context));
    }

    private int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    private static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }

    private static String[] e(ArrayList<String> arrayList) {
        return arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
    }

    private static byte[][] f(ArrayList<byte[]> arrayList) {
        return arrayList == null ? null : (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public a a(byte[] bArr) {
        return new a(bArr);
    }
}
