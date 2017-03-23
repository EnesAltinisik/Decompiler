package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.b.ot;
import java.util.Date;

public final class c {
    public static final String a = ot.a;
    private final ot b;

    public static final class a {
        private final com.google.android.gms.b.ot.a a = new com.google.android.gms.b.ot.a();

        public a() {
            this.a.b(c.a);
        }

        public a a(int i) {
            this.a.a(i);
            return this;
        }

        public a a(Location location) {
            this.a.a(location);
            return this;
        }

        public a a(Class<? extends b> cls, Bundle bundle) {
            this.a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.a.c(c.a);
            }
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a a(Date date) {
            this.a.a(date);
            return this;
        }

        public a a(boolean z) {
            this.a.a(z);
            return this;
        }

        public c a() {
            return new c();
        }

        public a b(String str) {
            this.a.b(str);
            return this;
        }

        public a b(boolean z) {
            this.a.b(z);
            return this;
        }
    }

    private c(a aVar) {
        this.b = new ot(aVar.a);
    }

    public ot a() {
        return this.b;
    }
}
