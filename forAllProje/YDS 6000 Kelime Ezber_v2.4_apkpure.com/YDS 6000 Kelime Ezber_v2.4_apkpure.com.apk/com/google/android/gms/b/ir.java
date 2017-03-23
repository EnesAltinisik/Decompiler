package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ir {
    private final gu a;
    private final jb b;

    public ir(gq gqVar) {
        this.a = gqVar.j();
        this.b = gqVar.a("EventRaiser");
    }

    public void a(List<? extends ip> list) {
        if (this.b.a()) {
            this.b.a("Raising " + list.size() + " event(s)", new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.a.a(new Runnable(this) {
            final /* synthetic */ ir b;

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ip ipVar = (ip) it.next();
                    if (this.b.b.a()) {
                        jb a = this.b.b;
                        String str = "Raising ";
                        String valueOf = String.valueOf(ipVar.toString());
                        a.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    }
                    ipVar.b();
                }
            }
        });
    }
}
