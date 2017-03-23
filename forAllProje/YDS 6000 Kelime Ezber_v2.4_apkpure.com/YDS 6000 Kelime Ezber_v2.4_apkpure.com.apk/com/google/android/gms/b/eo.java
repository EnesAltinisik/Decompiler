package com.google.android.gms.b;

import java.util.HashMap;

public class eo extends ax<Integer, Object> {
    public Long a;
    public Boolean b;
    public Boolean c;

    public eo(String str) {
        a(str);
    }

    protected HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        hashMap.put(Integer.valueOf(2), this.c);
        return hashMap;
    }

    protected void a(String str) {
        HashMap b = ax.b(str);
        if (b != null) {
            this.a = (Long) b.get(Integer.valueOf(0));
            this.b = (Boolean) b.get(Integer.valueOf(1));
            this.c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
