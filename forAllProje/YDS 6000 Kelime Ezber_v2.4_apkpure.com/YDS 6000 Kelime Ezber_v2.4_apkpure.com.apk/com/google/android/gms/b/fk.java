package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.b.gf.a;
import com.google.firebase.b;
import com.google.firebase.database.connection.idl.c;
import com.google.firebase.database.connection.idl.e;
import com.google.firebase.database.f;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class fk implements gy {
    private final Context a;
    private final Set<String> b = new HashSet();
    private final b c;

    public fk(b bVar) {
        this.c = bVar;
        if (this.c == null) {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
        this.a = this.c.a();
    }

    public gf a(gq gqVar, gb gbVar, gd gdVar, a aVar) {
        final gf a = e.a(this.a, new c(gdVar, gqVar.e(), null, gqVar.h(), f.e(), gqVar.l()), gbVar, aVar);
        this.c.a(new b.b(this) {
            public void a(boolean z) {
                if (z) {
                    a.d("app_in_background");
                } else {
                    a.e("app_in_background");
                }
            }
        });
        return a;
    }

    public gm a(ScheduledExecutorService scheduledExecutorService) {
        return new fi(this.c, scheduledExecutorService);
    }

    public gu a(gq gqVar) {
        return new fj();
    }

    public ib a(gq gqVar, String str) {
        String m = gqVar.m();
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(m).length()).append(str).append("_").append(m).toString();
        if (this.b.contains(stringBuilder)) {
            throw new com.google.firebase.database.c(new StringBuilder(String.valueOf(m).length() + 47).append("SessionPersistenceKey '").append(m).append("' has already been used.").toString());
        }
        this.b.add(stringBuilder);
        return new hy(gqVar, new fl(this.a, gqVar, stringBuilder), new hz(gqVar.i()));
    }

    public jc a(gq gqVar, jc.a aVar, List<String> list) {
        return new iz(aVar, list);
    }

    public hc b(gq gqVar) {
        final jb a = gqVar.a("RunLoop");
        return new ko(this) {
            final /* synthetic */ fk b;

            public void a(final Throwable th) {
                final String b = ko.b(th);
                a.a(b, th);
                new Handler(this.b.a.getMainLooper()).post(new Runnable(this) {
                    public void run() {
                        throw new RuntimeException(b, th);
                    }
                });
                d().shutdownNow();
            }
        };
    }

    public String c(gq gqVar) {
        return VERSION.SDK_INT + "/Android";
    }
}
