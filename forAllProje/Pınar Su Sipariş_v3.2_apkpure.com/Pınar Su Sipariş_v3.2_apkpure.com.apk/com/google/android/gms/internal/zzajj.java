package com.google.android.gms.internal;

import android.app.Activity;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzajj {
    private static final zzajj zzbVB = new zzajj();
    private final Map<Object, a> zzbVC = new HashMap();
    private final Object zzbVD = new Object();

    private static class a {
        private final Activity a;
        private final Runnable b;
        private final Object c;

        public a(Activity activity, Runnable runnable, Object obj) {
            this.a = activity;
            this.b = runnable;
            this.c = obj;
        }

        public Activity a() {
            return this.a;
        }

        public Runnable b() {
            return this.b;
        }

        public Object c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c.equals(this.c) && aVar.b == this.b && aVar.a == this.a;
        }

        public int hashCode() {
            return this.c.hashCode();
        }
    }

    private static class b extends zzoq {
        private final List<a> a = new ArrayList();

        private b(zzor com_google_android_gms_internal_zzor) {
            super(com_google_android_gms_internal_zzor);
            this.zzaop.zza("StorageOnStopCallback", (zzoq) this);
        }

        public static b a(Activity activity) {
            zzor zzc = zzoq.zzc(new zzop(activity));
            b bVar = (b) zzc.zza("StorageOnStopCallback", b.class);
            return bVar == null ? new b(zzc) : bVar;
        }

        public void a(a aVar) {
            synchronized (this.a) {
                this.a.add(aVar);
            }
        }

        public void b(a aVar) {
            synchronized (this.a) {
                this.a.remove(aVar);
            }
        }

        public void onStop() {
            ArrayList arrayList;
            synchronized (this.a) {
                arrayList = new ArrayList(this.a);
                this.a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.b().run();
                    zzajj.zzVl().zzaG(aVar.c());
                }
            }
        }
    }

    private zzajj() {
    }

    public static zzajj zzVl() {
        return zzbVB;
    }

    public void zza(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.zzbVD) {
            a aVar = new a(activity, runnable, obj);
            b.a(activity).a(aVar);
            this.zzbVC.put(obj, aVar);
        }
    }

    public void zzaG(Object obj) {
        synchronized (this.zzbVD) {
            a aVar = (a) this.zzbVC.get(obj);
            if (aVar != null) {
                b.a(aVar.a()).b(aVar);
            }
        }
    }
}
