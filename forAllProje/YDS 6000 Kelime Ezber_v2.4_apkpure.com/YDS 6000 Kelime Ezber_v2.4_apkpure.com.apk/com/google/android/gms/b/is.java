package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;

public class is {
    public static final is a = new is();
    static final /* synthetic */ boolean b = (!is.class.desiredAssertionStatus());
    private Integer c;
    private a d;
    private jr e = null;
    private je f = null;
    private jr g = null;
    private je h = null;
    private jk i = ju.b();
    private String j = null;

    private enum a {
        LEFT,
        RIGHT
    }

    public static is a(Map<String, Object> map) {
        String str;
        is isVar = new is();
        isVar.c = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            isVar.e = a(js.a(map.get("sp")));
            str = (String) map.get("sn");
            if (str != null) {
                isVar.f = je.a(str);
            }
        }
        if (map.containsKey("ep")) {
            isVar.g = a(js.a(map.get("ep")));
            str = (String) map.get("en");
            if (str != null) {
                isVar.h = je.a(str);
            }
        }
        str = (String) map.get("vf");
        if (str != null) {
            isVar.d = str.equals("l") ? a.LEFT : a.RIGHT;
        }
        str = (String) map.get("i");
        if (str != null) {
            isVar.i = jk.a(str);
        }
        return isVar;
    }

    private static jr a(jr jrVar) {
        if ((jrVar instanceof jx) || (jrVar instanceof jd) || (jrVar instanceof ji) || (jrVar instanceof jj)) {
            return jrVar;
        }
        if (jrVar instanceof jp) {
            return new ji(Double.valueOf(((Long) jrVar.a()).doubleValue()), jv.a());
        }
        String valueOf = String.valueOf(jrVar.a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Unexpected value passed to normalizeValue: ").append(valueOf).toString());
    }

    public boolean a() {
        return this.e != null;
    }

    public boolean b() {
        return this.g != null;
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.d != null ? this.d == a.LEFT : a();
    }

    public Map<String, Object> e() {
        Map<String, Object> hashMap = new HashMap();
        if (a()) {
            hashMap.put("sp", this.e.a());
            if (this.f != null) {
                hashMap.put("sn", this.f.d());
            }
        }
        if (b()) {
            hashMap.put("ep", this.g.a());
            if (this.h != null) {
                hashMap.put("en", this.h.d());
            }
        }
        if (this.c != null) {
            hashMap.put("l", this.c);
            a aVar = this.d;
            if (aVar == null) {
                aVar = a() ? a.LEFT : a.RIGHT;
            }
            switch (aVar) {
                case LEFT:
                    hashMap.put("vf", "l");
                    break;
                case RIGHT:
                    hashMap.put("vf", "r");
                    break;
            }
        }
        if (!this.i.equals(ju.b())) {
            hashMap.put("i", this.i.a());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        is isVar = (is) obj;
        return (this.c == null ? isVar.c != null : !this.c.equals(isVar.c)) ? false : (this.i == null ? isVar.i != null : !this.i.equals(isVar.i)) ? false : (this.h == null ? isVar.h != null : !this.h.equals(isVar.h)) ? false : (this.g == null ? isVar.g != null : !this.g.equals(isVar.g)) ? false : (this.f == null ? isVar.f != null : !this.f.equals(isVar.f)) ? false : (this.e == null ? isVar.e != null : !this.e.equals(isVar.e)) ? false : d() == isVar.d();
    }

    public boolean f() {
        return (a() || b() || c()) ? false : true;
    }

    public boolean g() {
        return f() && this.i.equals(ju.b());
    }

    public String h() {
        if (this.j == null) {
            try {
                this.j = kk.a(e());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this.j;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.h != null ? this.h.hashCode() : 0) + (((this.g != null ? this.g.hashCode() : 0) + (((this.f != null ? this.f.hashCode() : 0) + (((this.e != null ? this.e.hashCode() : 0) + (((d() ? 1231 : 1237) + ((this.c != null ? this.c.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.i != null) {
            i = this.i.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return e().toString();
    }
}
