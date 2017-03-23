package com.google.firebase.storage;

import android.app.Activity;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajj;
import com.google.android.gms.internal.zzajo;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class zze<TListenerType, TResult extends ProvideError> {
    private final Queue<TListenerType> a = new ConcurrentLinkedQueue();
    private final HashMap<TListenerType, zzajo> b = new HashMap();
    private StorageTask<TResult> c;
    private int d;
    private zza<TListenerType, TResult> e;

    public interface zza<TListenerType, TResult> {
        void zzl(TListenerType tListenerType, TResult tResult);
    }

    public zze(StorageTask<TResult> storageTask, int i, zza<TListenerType, TResult> com_google_firebase_storage_zze_zza_TListenerType__TResult) {
        this.c = storageTask;
        this.d = i;
        this.e = com_google_firebase_storage_zze_zza_TListenerType__TResult;
    }

    public void a() {
        if ((this.c.zzUW() & this.d) != 0) {
            final ProvideError zzUY = this.c.zzUY();
            for (final Object next : this.a) {
                zzajo com_google_android_gms_internal_zzajo = (zzajo) this.b.get(next);
                if (com_google_android_gms_internal_zzajo != null) {
                    com_google_android_gms_internal_zzajo.zzp(new Runnable(this) {
                        final /* synthetic */ zze c;

                        public void run() {
                            this.c.e.zzl(next, zzUY);
                        }
                    });
                }
            }
        }
    }

    public void a(Activity activity, Executor executor, final TListenerType tListenerType) {
        boolean z = true;
        zzaa.zzz(tListenerType);
        synchronized (this.c.zzUX()) {
            boolean z2 = (this.c.zzUW() & this.d) != 0;
            this.a.add(tListenerType);
            this.b.put(tListenerType, new zzajo(executor));
            if (activity != null) {
                if (VERSION.SDK_INT >= 17) {
                    if (activity.isDestroyed()) {
                        z = false;
                    }
                    zzaa.zzb(z, (Object) "Activity is already destroyed!");
                }
                zzajj.zzVl().zza(activity, tListenerType, new Runnable(this) {
                    final /* synthetic */ zze b;

                    public void run() {
                        this.b.a(tListenerType);
                    }
                });
            }
        }
        if (z2) {
            this.e.zzl(tListenerType, this.c.zzUY());
        }
    }

    public void a(TListenerType tListenerType) {
        zzaa.zzz(tListenerType);
        synchronized (this.c.zzUX()) {
            this.b.remove(tListenerType);
            this.a.remove(tListenerType);
            zzajj.zzVl().zzaG(tListenerType);
        }
    }
}
