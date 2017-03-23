package com.google.android.gms.b;

import com.google.android.gms.b.gf.a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

enum gw implements gy {
    INSTANCE;

    public gf a(gq gqVar, gb gbVar, gd gdVar, a aVar) {
        return new gg(gqVar.g(), gdVar, aVar);
    }

    public gm a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public gu a(gq gqVar) {
        return new hk(Executors.defaultThreadFactory(), hj.a);
    }

    public ib a(gq gqVar, String str) {
        return null;
    }

    public jc a(gq gqVar, jc.a aVar, List<String> list) {
        return new ja(aVar, list);
    }

    public hc b(gq gqVar) {
        final jb a = gqVar.a("RunLoop");
        return new ko(this) {
            public void a(Throwable th) {
                a.a(ko.b(th), th);
            }
        };
    }

    public String c(gq gqVar) {
        String property = System.getProperty("java.vm.name", "Unknown JVM");
        String property2 = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property2).length() + 1) + String.valueOf(property).length()).append(property2).append("/").append(property).toString();
    }
}
