package com.google.firebase.database;

import com.google.android.gms.b.jr;

public class l {

    public interface a {
        b a(h hVar);

        void a(b bVar, boolean z, a aVar);
    }

    public static class b {
        private boolean a;
        private jr b;

        private b(boolean z, jr jrVar) {
            this.a = z;
            this.b = jrVar;
        }

        public boolean a() {
            return this.a;
        }

        public jr b() {
            return this.b;
        }
    }

    public static b a() {
        return new b(false, null);
    }
}
