package com.b.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;

class b extends a {
    private HashMap<String, e> a = new HashMap();
    private String b;
    private String c;

    b(Context context, String str) {
        super(context);
        this.b = str;
        f();
    }

    private String d() {
        return b() + this.b;
    }

    private String e() {
        return d() + ".version";
    }

    private void f() {
        for (Object obj : b(d(), "").split(Pattern.quote("#####"))) {
            if (!TextUtils.isEmpty(obj)) {
                String[] split = obj.split(Pattern.quote(">>>>>"));
                if (split.length > 2) {
                    this.a.put(split[0], new e(split[1], split[2]));
                } else if (split.length > 1) {
                    this.a.put(split[0], new e(split[1], null));
                }
            }
        }
        this.c = h();
    }

    private void g() {
        Iterable arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            e eVar = (e) this.a.get(str);
            arrayList.add(str + ">>>>>" + eVar.a + ">>>>>" + eVar.b);
        }
        a(d(), TextUtils.join("#####", arrayList));
        this.c = Long.toString(new Date().getTime());
        a(e(), this.c);
    }

    private String h() {
        return b(e(), "0");
    }

    private void i() {
        if (!this.c.equalsIgnoreCase(h())) {
            this.a.clear();
            f();
        }
    }

    void a(String str, String str2, String str3) {
        i();
        if (!this.a.containsKey(str)) {
            this.a.put(str, new e(str2, str3));
            g();
        }
    }

    boolean a(String str) {
        i();
        return this.a.containsKey(str);
    }

    e b(String str) {
        i();
        return this.a.containsKey(str) ? (e) this.a.get(str) : null;
    }

    void c() {
        i();
        this.a.clear();
        g();
    }

    public String toString() {
        return TextUtils.join(", ", this.a.keySet());
    }
}
