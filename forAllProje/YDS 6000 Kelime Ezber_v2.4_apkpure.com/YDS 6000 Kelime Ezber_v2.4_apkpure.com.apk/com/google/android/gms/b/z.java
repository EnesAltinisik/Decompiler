package com.google.android.gms.b;

import com.google.android.gms.b.vx.a;
import com.google.android.gms.b.vx.b;
import java.io.UnsupportedEncodingException;

public class z extends tv<String> {
    private final b<String> a;

    public z(int i, String str, b<String> bVar, a aVar) {
        super(i, str, aVar);
        this.a = bVar;
    }

    protected vx<String> a(rt rtVar) {
        Object str;
        try {
            str = new String(rtVar.b, abl.a(rtVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(rtVar.b);
        }
        return vx.a(str, abl.a(rtVar));
    }

    protected /* synthetic */ void a(Object obj) {
        a((String) obj);
    }

    protected void a(String str) {
        this.a.a(str);
    }
}
