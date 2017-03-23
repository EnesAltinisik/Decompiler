package com.google.android.gms.b;

import java.util.HashMap;

public class ep extends ax<Integer, Long> {
    public Long a;
    public Long b;

    public ep(String str) {
        a(str);
    }

    protected HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        return hashMap;
    }

    protected void a(String str) {
        HashMap b = ax.b(str);
        if (b != null) {
            this.a = (Long) b.get(Integer.valueOf(0));
            this.b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
