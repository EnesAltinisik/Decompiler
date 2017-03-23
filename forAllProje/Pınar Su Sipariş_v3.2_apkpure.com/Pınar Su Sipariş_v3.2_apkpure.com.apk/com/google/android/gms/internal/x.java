package com.google.android.gms.internal;

import com.google.android.gms.plus.PlusShare;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@zzig
class x {
    private final List<String> a;
    private final List<String> b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final String j;
    private String k;
    private int l;

    public x(int i, Map<String, String> map) {
        this.k = (String) map.get(PlusShare.KEY_CALL_TO_ACTION_URL);
        this.d = (String) map.get("base_uri");
        this.e = (String) map.get("post_parameters");
        this.g = b((String) map.get("drt_include"));
        this.h = b((String) map.get("pan_include"));
        this.c = (String) map.get("activation_overlay_url");
        this.b = c((String) map.get("check_packages"));
        this.i = (String) map.get("request_id");
        this.f = (String) map.get("type");
        this.a = c((String) map.get("errors"));
        this.l = i;
        this.j = (String) map.get("fetched_ad");
    }

    private static boolean b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private List<String> c(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }

    public int a() {
        return this.l;
    }

    public void a(String str) {
        this.k = str;
    }

    public List<String> b() {
        return this.a;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.k;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String g() {
        return this.i;
    }

    public boolean h() {
        return this.h;
    }

    public String i() {
        return this.j;
    }
}
