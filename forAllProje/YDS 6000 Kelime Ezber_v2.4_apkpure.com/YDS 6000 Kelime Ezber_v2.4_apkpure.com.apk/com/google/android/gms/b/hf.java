package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class hf {
    private jr a = null;
    private Map<je, hf> b = null;

    public interface b {
        void a(gx gxVar, jr jrVar);
    }

    public interface a {
        void a(je jeVar, hf hfVar);
    }

    public void a(final gx gxVar, final b bVar) {
        if (this.a != null) {
            bVar.a(gxVar, this.a);
        } else {
            a(new a(this) {
                public void a(je jeVar, hf hfVar) {
                    hfVar.a(gxVar.a(jeVar), bVar);
                }
            });
        }
    }

    public void a(gx gxVar, jr jrVar) {
        if (gxVar.h()) {
            this.a = jrVar;
            this.b = null;
        } else if (this.a != null) {
            this.a = this.a.a(gxVar, jrVar);
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            je d = gxVar.d();
            if (!this.b.containsKey(d)) {
                this.b.put(d, new hf());
            }
            ((hf) this.b.get(d)).a(gxVar.e(), jrVar);
        }
    }

    public void a(a aVar) {
        if (this.b != null) {
            for (Entry entry : this.b.entrySet()) {
                aVar.a((je) entry.getKey(), (hf) entry.getValue());
            }
        }
    }
}
