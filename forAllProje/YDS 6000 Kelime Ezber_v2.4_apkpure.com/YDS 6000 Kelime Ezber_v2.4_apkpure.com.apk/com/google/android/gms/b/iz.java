package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.b.jc.a;
import java.util.List;

public class iz extends ja {
    public iz(a aVar, List<String> list) {
        super(aVar, list);
    }

    protected String a(a aVar, String str, String str2, long j) {
        return str2;
    }

    protected void a(String str, String str2) {
        Log.e(str, str2);
    }

    protected void b(String str, String str2) {
        Log.w(str, str2);
    }

    protected void c(String str, String str2) {
        Log.i(str, str2);
    }

    protected void d(String str, String str2) {
        Log.d(str, str2);
    }
}
