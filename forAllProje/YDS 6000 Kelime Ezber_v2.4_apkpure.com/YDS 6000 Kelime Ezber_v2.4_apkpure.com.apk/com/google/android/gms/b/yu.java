package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@vz
public class yu {
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    public final com.google.android.gms.b.qp.a E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final List<String> I;
    public final ns a;
    public final aaq b;
    public final List<String> c;
    public final int d;
    public final List<String> e;
    public final List<String> f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final wk l;
    public boolean m;
    public final boolean n;
    public final td o;
    public final to p;
    public final String q;
    public final te r;
    public final tg s;
    public final long t;
    public final String u;
    public final nx v;
    public final long w;
    public final yj x;
    public final List<String> y;
    public final List<String> z;

    @vz
    public static final class a {
        public final wf a;
        public final wi b;
        public final te c;
        public final nx d;
        public final int e;
        public final long f;
        public final long g;
        public final JSONObject h;

        public a(wf wfVar, wi wiVar, te teVar, nx nxVar, int i, long j, long j2, JSONObject jSONObject) {
            this.a = wfVar;
            this.b = wiVar;
            this.c = teVar;
            this.d = nxVar;
            this.e = i;
            this.f = j;
            this.g = j2;
            this.h = jSONObject;
        }
    }

    public yu(ns nsVar, aaq com_google_android_gms_b_aaq, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, td tdVar, to toVar, String str2, te teVar, tg tgVar, long j2, nx nxVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, com.google.android.gms.b.qp.a aVar, yj yjVar, List<String> list4, List<String> list5, boolean z2, wk wkVar, String str4, List<String> list6, String str5) {
        this.F = false;
        this.G = false;
        this.H = false;
        this.a = nsVar;
        this.b = com_google_android_gms_b_aaq;
        this.c = a(list);
        this.d = i;
        this.e = a(list2);
        this.f = a(list3);
        this.g = i2;
        this.h = j;
        this.i = str;
        this.n = z;
        this.o = tdVar;
        this.p = toVar;
        this.q = str2;
        this.r = teVar;
        this.s = tgVar;
        this.t = j2;
        this.v = nxVar;
        this.w = j3;
        this.A = j4;
        this.B = j5;
        this.C = str3;
        this.j = jSONObject;
        this.E = aVar;
        this.x = yjVar;
        this.y = a(list4);
        this.z = a(list5);
        this.k = z2;
        this.l = wkVar;
        this.u = str4;
        this.I = a(list6);
        this.D = str5;
    }

    public yu(a aVar, aaq com_google_android_gms_b_aaq, td tdVar, to toVar, String str, tg tgVar, com.google.android.gms.b.qp.a aVar2, String str2) {
        this(aVar.a.c, com_google_android_gms_b_aaq, aVar.b.d, aVar.e, aVar.b.f, aVar.b.j, aVar.b.l, aVar.b.k, aVar.a.i, aVar.b.h, tdVar, toVar, str, aVar.c, tgVar, aVar.b.i, aVar.d, aVar.b.g, aVar.f, aVar.g, aVar.b.o, aVar.h, aVar2, aVar.b.C, aVar.b.D, aVar.b.D, aVar.b.F, aVar.b.G, str2, aVar.b.J, aVar.b.N);
    }

    private static <T> List<T> a(List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public boolean a() {
        return (this.b == null || this.b.l() == null) ? false : this.b.l().b();
    }
}
