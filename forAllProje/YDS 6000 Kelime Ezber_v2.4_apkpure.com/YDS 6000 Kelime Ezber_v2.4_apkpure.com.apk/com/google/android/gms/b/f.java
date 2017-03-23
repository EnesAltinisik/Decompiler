package com.google.android.gms.b;

import com.google.android.gms.c.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class f {
    private final Map<acg<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    private final Map<e<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private void a(boolean z, Status status) {
        synchronized (this.a) {
            Map hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            Map hashMap2 = new HashMap(this.b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((acg) entry.getKey()).d(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((e) entry2.getKey()).b(new l(status));
            }
        }
    }

    void a(final acg<? extends g> com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g, boolean z) {
        this.a.put(com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g, Boolean.valueOf(z));
        com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g.a(new a(this) {
            final /* synthetic */ f b;

            public void a(Status status) {
                this.b.a.remove(com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g);
            }
        });
    }

    boolean a() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public void b() {
        a(false, p.a);
    }

    public void c() {
        a(true, am.a);
    }
}
