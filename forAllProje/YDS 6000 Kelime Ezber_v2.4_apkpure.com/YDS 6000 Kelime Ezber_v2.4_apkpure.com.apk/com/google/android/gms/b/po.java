package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@vz
public class po {
    private final Collection<pn> a = new ArrayList();
    private final Collection<pn<String>> b = new ArrayList();
    private final Collection<pn<String>> c = new ArrayList();

    public List<String> a() {
        List<String> arrayList = new ArrayList();
        for (pn c : this.b) {
            String str = (String) c.c();
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void a(pn pnVar) {
        this.a.add(pnVar);
    }

    public List<String> b() {
        List<String> a = a();
        for (pn c : this.c) {
            String str = (String) c.c();
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    public void b(pn<String> pnVar) {
        this.b.add(pnVar);
    }

    public void c(pn<String> pnVar) {
        this.c.add(pnVar);
    }
}
