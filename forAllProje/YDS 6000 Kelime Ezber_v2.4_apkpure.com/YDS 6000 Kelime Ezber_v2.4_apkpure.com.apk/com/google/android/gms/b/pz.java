package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;

@vz
public class pz {
    private final Map<String, py> a = new HashMap();
    private final qa b;

    public pz(qa qaVar) {
        this.b = qaVar;
    }

    public qa a() {
        return this.b;
    }

    public void a(String str, py pyVar) {
        this.a.put(str, pyVar);
    }

    public void a(String str, String str2, long j) {
        pw.a(this.b, (py) this.a.get(str2), j, str);
        this.a.put(str, pw.a(this.b, j));
    }
}
