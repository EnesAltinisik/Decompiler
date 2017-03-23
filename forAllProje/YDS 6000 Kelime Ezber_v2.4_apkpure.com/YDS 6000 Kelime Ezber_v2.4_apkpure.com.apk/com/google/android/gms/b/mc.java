package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.a.b;
import com.google.android.gms.b.me.a;

@vz
public final class mc extends a {
    private final dg a;
    private final dp b;
    private final bs c;
    private boolean d = false;

    public mc(String str, Context context, boolean z) {
        this.a = dg.a(str, context, z);
        this.b = new dp(this.a);
        this.c = z ? null : bs.b(context);
    }

    private com.google.android.gms.a.a a(com.google.android.gms.a.a aVar, com.google.android.gms.a.a aVar2, boolean z) {
        try {
            Uri uri = (Uri) b.a(aVar);
            Context context = (Context) b.a(aVar2);
            return b.a(z ? this.b.a(uri, context) : this.b.b(uri, context));
        } catch (dq e) {
            return null;
        }
    }

    public com.google.android.gms.a.a a(com.google.android.gms.a.a aVar, com.google.android.gms.a.a aVar2) {
        return a(aVar, aVar2, true);
    }

    public String a() {
        return "ms";
    }

    public String a(com.google.android.gms.a.a aVar, String str) {
        return this.a.a((Context) b.a(aVar), str);
    }

    public String a(com.google.android.gms.a.a aVar, byte[] bArr) {
        Context context = (Context) b.a(aVar);
        String a = this.a.a(context, bArr);
        if (this.c == null || !this.d) {
            return a;
        }
        String a2 = this.c.a(a, this.c.a(context, bArr));
        this.d = false;
        return a2;
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(String str, String str2) {
        this.b.a(str, str2);
    }

    public boolean a(com.google.android.gms.a.a aVar) {
        return this.b.a((Uri) b.a(aVar));
    }

    public boolean a(String str, boolean z) {
        if (this.c == null) {
            return false;
        }
        this.c.a(new com.google.android.gms.ads.c.a.a(str, z));
        this.d = true;
        return true;
    }

    public com.google.android.gms.a.a b(com.google.android.gms.a.a aVar, com.google.android.gms.a.a aVar2) {
        return a(aVar, aVar2, false);
    }

    public boolean b(com.google.android.gms.a.a aVar) {
        return this.b.c((Uri) b.a(aVar));
    }

    public String c(com.google.android.gms.a.a aVar) {
        return a(aVar, null);
    }

    public void d(com.google.android.gms.a.a aVar) {
        this.b.a((MotionEvent) b.a(aVar));
    }
}
