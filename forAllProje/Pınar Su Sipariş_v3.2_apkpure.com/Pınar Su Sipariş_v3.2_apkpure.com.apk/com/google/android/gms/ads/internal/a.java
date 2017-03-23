package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzal;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjz;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzig
class a implements zzal, Runnable {
    CountDownLatch a = new CountDownLatch(1);
    private final List<Object[]> b = new Vector();
    private final AtomicReference<zzal> c = new AtomicReference();
    private zzv d;

    public a(zzv com_google_android_gms_ads_internal_zzv) {
        this.d = com_google_android_gms_ads_internal_zzv;
        if (zzm.zzdQ().zzjs()) {
            zzjz.zza((Runnable) this);
        } else {
            run();
        }
    }

    private Context a(Context context) {
        if (!((Boolean) zzcu.zzxl.get()).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void b() {
        if (!this.b.isEmpty()) {
            for (Object[] objArr : this.b) {
                if (objArr.length == 1) {
                    ((zzal) this.c.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((zzal) this.c.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.b.clear();
        }
    }

    protected zzal a(String str, Context context, boolean z) {
        return zzap.zza(str, context, z);
    }

    protected void a(zzal com_google_android_gms_internal_zzal) {
        this.c.set(com_google_android_gms_internal_zzal);
    }

    protected boolean a() {
        try {
            this.a.await();
            return true;
        } catch (Throwable e) {
            zzb.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public void run() {
        try {
            boolean z = !((Boolean) zzcu.zzxx.get()).booleanValue() || this.d.zzsx.zzRE;
            a(a(this.d.zzsx.afmaVersion, a(this.d.zzov), z));
        } finally {
            this.a.countDown();
            this.d = null;
        }
    }

    public void zza(int i, int i2, int i3) {
        zzal com_google_android_gms_internal_zzal = (zzal) this.c.get();
        if (com_google_android_gms_internal_zzal != null) {
            b();
            com_google_android_gms_internal_zzal.zza(i, i2, i3);
            return;
        }
        this.b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public void zza(MotionEvent motionEvent) {
        zzal com_google_android_gms_internal_zzal = (zzal) this.c.get();
        if (com_google_android_gms_internal_zzal != null) {
            b();
            com_google_android_gms_internal_zzal.zza(motionEvent);
            return;
        }
        this.b.add(new Object[]{motionEvent});
    }

    public String zzb(Context context) {
        if (a()) {
            zzal com_google_android_gms_internal_zzal = (zzal) this.c.get();
            if (com_google_android_gms_internal_zzal != null) {
                b();
                return com_google_android_gms_internal_zzal.zzb(a(context));
            }
        }
        return "";
    }

    public String zzb(Context context, String str) {
        if (a()) {
            zzal com_google_android_gms_internal_zzal = (zzal) this.c.get();
            if (com_google_android_gms_internal_zzal != null) {
                b();
                return com_google_android_gms_internal_zzal.zzb(a(context), str);
            }
        }
        return "";
    }
}
