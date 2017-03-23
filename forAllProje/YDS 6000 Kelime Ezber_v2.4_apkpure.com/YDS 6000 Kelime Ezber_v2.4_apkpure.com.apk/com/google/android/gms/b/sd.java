package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;

@vz
public class sd extends zd {
    final aaq a;
    final sf b;
    private final String c;

    sd(aaq com_google_android_gms_b_aaq, sf sfVar, String str) {
        this.a = com_google_android_gms_b_aaq;
        this.b = sfVar;
        this.c = str;
        v.B().a(this);
    }

    public void a() {
        try {
            this.b.a(this.c);
        } finally {
            zi.a.post(new Runnable(this) {
                final /* synthetic */ sd a;

                {
                    this.a = r1;
                }

                public void run() {
                    v.B().b(this.a);
                }
            });
        }
    }

    public void b() {
        this.b.b();
    }
}
