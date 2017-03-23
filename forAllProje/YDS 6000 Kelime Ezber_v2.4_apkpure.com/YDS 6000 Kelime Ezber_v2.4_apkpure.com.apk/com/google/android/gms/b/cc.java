package com.google.android.gms.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;

public class cc {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final ce f;

    cc(cv cvVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        c.a(str2);
        c.a(str3);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        if (this.e != 0 && this.e > this.d) {
            cvVar.f().z().a("Event created with reverse previous/current timestamps. appId", co.a(str2));
        }
        this.f = a(cvVar, bundle);
    }

    private cc(cv cvVar, String str, String str2, String str3, long j, long j2, ce ceVar) {
        c.a(str2);
        c.a(str3);
        c.a((Object) ceVar);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        if (this.e != 0 && this.e > this.d) {
            cvVar.f().z().a("Event created with reverse previous/current timestamps. appId", co.a(str2));
        }
        this.f = ceVar;
    }

    static ce a(cv cvVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new ce(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                cvVar.f().x().a("Param name can't be null");
                it.remove();
            } else {
                Object b = cvVar.o().b(str, bundle2.get(str));
                if (b == null) {
                    cvVar.f().z().a("Param value can't be null", str);
                    it.remove();
                } else {
                    cvVar.o().a(bundle2, str, b);
                }
            }
        }
        return new ce(bundle2);
    }

    cc a(cv cvVar, long j) {
        return new cc(cvVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        return new StringBuilder(((String.valueOf(str).length() + 33) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("'").append(", name='").append(str2).append("'").append(", params=").append(valueOf).append("}").toString();
    }
}
