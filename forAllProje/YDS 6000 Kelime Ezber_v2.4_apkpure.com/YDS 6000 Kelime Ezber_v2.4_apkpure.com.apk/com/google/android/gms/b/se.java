package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@vz
public class se implements Iterable<sd> {
    private final List<sd> a = new LinkedList();

    private sd c(aaq com_google_android_gms_b_aaq) {
        Iterator it = v.B().iterator();
        while (it.hasNext()) {
            sd sdVar = (sd) it.next();
            if (sdVar.a == com_google_android_gms_b_aaq) {
                return sdVar;
            }
        }
        return null;
    }

    public int a() {
        return this.a.size();
    }

    public void a(sd sdVar) {
        this.a.add(sdVar);
    }

    public boolean a(aaq com_google_android_gms_b_aaq) {
        sd c = c(com_google_android_gms_b_aaq);
        if (c == null) {
            return false;
        }
        c.b.b();
        return true;
    }

    public void b(sd sdVar) {
        this.a.remove(sdVar);
    }

    public boolean b(aaq com_google_android_gms_b_aaq) {
        return c(com_google_android_gms_b_aaq) != null;
    }

    public Iterator<sd> iterator() {
        return this.a.iterator();
    }
}
