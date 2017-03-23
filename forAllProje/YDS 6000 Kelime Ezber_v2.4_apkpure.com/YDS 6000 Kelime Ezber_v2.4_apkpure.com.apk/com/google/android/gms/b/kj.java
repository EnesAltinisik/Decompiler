package com.google.android.gms.b;

import java.util.Map;

public class kj {
    private final String a;
    private final Map<String, Object> b;

    public kj(String str, Map<String, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static kj a(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map a = kk.a(str.substring("gauth|".length()));
            return new kj((String) a.get("token"), (Map) a.get("auth"));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    public String a() {
        return this.a;
    }

    public Map<String, Object> b() {
        return this.b;
    }
}
