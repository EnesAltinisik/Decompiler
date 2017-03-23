package com.google.android.gms.b;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.o;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class am {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    private static final acg<?>[] c = new acg[0];
    final Set<acg<?>> b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final b d = new b(this) {
        final /* synthetic */ am a;

        {
            this.a = r1;
        }

        public void a(acg<?> com_google_android_gms_b_acg_) {
            this.a.b.remove(com_google_android_gms_b_acg_);
            if (com_google_android_gms_b_acg_.a() != null) {
                null;
            }
        }
    };
    private final Map<d<?>, f> e;

    interface b {
        void a(acg<?> com_google_android_gms_b_acg_);
    }

    private static class a implements DeathRecipient, b {
        private final WeakReference<acg<?>> a;
        private final WeakReference<o> b;
        private final WeakReference<IBinder> c;

        private a(acg<?> com_google_android_gms_b_acg_, o oVar, IBinder iBinder) {
            this.b = new WeakReference(oVar);
            this.a = new WeakReference(com_google_android_gms_b_acg_);
            this.c = new WeakReference(iBinder);
        }

        private void a() {
            acg com_google_android_gms_b_acg = (acg) this.a.get();
            o oVar = (o) this.b.get();
            if (!(oVar == null || com_google_android_gms_b_acg == null)) {
                oVar.a(com_google_android_gms_b_acg.a().intValue());
            }
            IBinder iBinder = (IBinder) this.c.get();
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
        }

        public void a(acg<?> com_google_android_gms_b_acg_) {
            a();
        }

        public void binderDied() {
            a();
        }
    }

    public am(Map<d<?>, f> map) {
        this.e = map;
    }

    private static void a(acg<?> com_google_android_gms_b_acg_, o oVar, IBinder iBinder) {
        if (com_google_android_gms_b_acg_.d()) {
            com_google_android_gms_b_acg_.a(new a(com_google_android_gms_b_acg_, oVar, iBinder));
        } else if (iBinder == null || !iBinder.isBinderAlive()) {
            com_google_android_gms_b_acg_.a(null);
            com_google_android_gms_b_acg_.e();
            oVar.a(com_google_android_gms_b_acg_.a().intValue());
        } else {
            b aVar = new a(com_google_android_gms_b_acg_, oVar, iBinder);
            com_google_android_gms_b_acg_.a(aVar);
            try {
                iBinder.linkToDeath(aVar, 0);
            } catch (RemoteException e) {
                com_google_android_gms_b_acg_.e();
                oVar.a(com_google_android_gms_b_acg_.a().intValue());
            }
        }
    }

    public void a() {
        for (acg com_google_android_gms_b_acg : (acg[]) this.b.toArray(c)) {
            com_google_android_gms_b_acg.a(null);
            if (com_google_android_gms_b_acg.a() != null) {
                com_google_android_gms_b_acg.h();
                a(com_google_android_gms_b_acg, null, ((f) this.e.get(((com.google.android.gms.b.ace.a) com_google_android_gms_b_acg).b())).h());
                this.b.remove(com_google_android_gms_b_acg);
            } else if (com_google_android_gms_b_acg.f()) {
                this.b.remove(com_google_android_gms_b_acg);
            }
        }
    }

    void a(acg<? extends g> com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g) {
        this.b.add(com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g);
        com_google_android_gms_b_acg__extends_com_google_android_gms_common_api_g.a(this.d);
    }

    public void a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.b.size());
    }

    public void b() {
        for (acg d : (acg[]) this.b.toArray(c)) {
            d.d(a);
        }
    }
}
