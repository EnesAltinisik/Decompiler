package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.b.np;
import com.google.android.gms.b.nw;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.oi;
import com.google.android.gms.b.ot;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.rj;
import com.google.android.gms.b.rk;
import com.google.android.gms.b.tm;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;

public class b {
    private final nw a;
    private final Context b;
    private final oh c;

    public static class a {
        private final Context a;
        private final oi b;

        a(Context context, oi oiVar) {
            this.a = context;
            this.b = oiVar;
        }

        public a(Context context, String str) {
            this((Context) c.a((Object) context, (Object) "context cannot be null"), oc.b().a(context, str, new tm()));
        }

        public a a(a aVar) {
            try {
                this.b.a(new np(aVar));
            } catch (Throwable e) {
                zy.c("Failed to set AdListener.", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.b.b bVar) {
            try {
                this.b.a(new qr(bVar));
            } catch (Throwable e) {
                zy.c("Failed to specify native ad options", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.b.d.a aVar) {
            try {
                this.b.a(new rj(aVar));
            } catch (Throwable e) {
                zy.c("Failed to add app install ad listener", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.b.e.a aVar) {
            try {
                this.b.a(new rk(aVar));
            } catch (Throwable e) {
                zy.c("Failed to add content ad listener", e);
            }
            return this;
        }

        public b a() {
            try {
                return new b(this.a, this.b.a());
            } catch (Throwable e) {
                zy.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    b(Context context, oh ohVar) {
        this(context, ohVar, nw.a());
    }

    b(Context context, oh ohVar, nw nwVar) {
        this.b = context;
        this.c = ohVar;
        this.a = nwVar;
    }

    private void a(ot otVar) {
        try {
            this.c.a(this.a.a(this.b, otVar));
        } catch (Throwable e) {
            zy.b("Failed to load ad.", e);
        }
    }

    public void a(c cVar) {
        a(cVar.a());
    }
}
