package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@vz
public class qa {
    boolean a;
    private final List<py> b = new LinkedList();
    private final Map<String, String> c = new LinkedHashMap();
    private final Object d = new Object();
    private String e;
    private py f;
    private qa g;

    public qa(boolean z, String str, String str2) {
        this.a = z;
        this.c.put("action", str);
        this.c.put("ad_format", str2);
    }

    public py a() {
        return a(v.k().b());
    }

    public py a(long j) {
        return !this.a ? null : new py(j, null, null);
    }

    public void a(qa qaVar) {
        synchronized (this.d) {
            this.g = qaVar;
        }
    }

    public void a(String str) {
        if (this.a) {
            synchronized (this.d) {
                this.e = str;
            }
        }
    }

    public void a(String str, String str2) {
        if (this.a && !TextUtils.isEmpty(str2)) {
            pt f = v.i().f();
            if (f != null) {
                synchronized (this.d) {
                    f.a(str).a(this.c, str, str2);
                }
            }
        }
    }

    public boolean a(py pyVar, long j, String... strArr) {
        synchronized (this.d) {
            for (String pyVar2 : strArr) {
                this.b.add(new py(j, pyVar2, pyVar));
            }
        }
        return true;
    }

    public boolean a(py pyVar, String... strArr) {
        return (!this.a || pyVar == null) ? false : a(pyVar, v.k().b(), strArr);
    }

    public void b() {
        synchronized (this.d) {
            this.f = a();
        }
    }

    public String c() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.d) {
            for (py pyVar : this.b) {
                long a = pyVar.a();
                String b = pyVar.b();
                py pyVar2 = pyVar2.c();
                if (pyVar2 != null && a > 0) {
                    stringBuilder2.append(b).append('.').append(a - pyVar2.a()).append(',');
                }
            }
            this.b.clear();
            if (!TextUtils.isEmpty(this.e)) {
                stringBuilder2.append(this.e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    Map<String, String> d() {
        Map<String, String> map;
        synchronized (this.d) {
            pt f = v.i().f();
            if (f == null || this.g == null) {
                map = this.c;
            } else {
                map = f.a(this.c, this.g.d());
            }
        }
        return map;
    }

    public py e() {
        py pyVar;
        synchronized (this.d) {
            pyVar = this.f;
        }
        return pyVar;
    }
}
