package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzas.zza;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzbl {
    protected static final String TAG = zzbl.class.getSimpleName();
    private final String className;
    private final zzav zznO;
    private final String zzoS;
    private final int zzoT = 2;
    private volatile Method zzoU = null;
    private List<Class> zzoV;
    private CountDownLatch zzoW = new CountDownLatch(1);

    public zzbl(zzav com_google_android_gms_internal_zzav, String str, String str2, List<Class> list) {
        this.zznO = com_google_android_gms_internal_zzav;
        this.className = str;
        this.zzoS = str2;
        this.zzoV = new ArrayList(list);
        this.zznO.zzaD().submit(new Runnable(this) {
            final /* synthetic */ zzbl a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzaT();
            }
        });
    }

    private void zzaT() {
        try {
            Class loadClass = this.zznO.zzaE().loadClass(zzd(this.zznO.zzaG(), this.className));
            if (loadClass != null) {
                this.zzoU = loadClass.getMethod(zzd(this.zznO.zzaG(), this.zzoS), (Class[]) this.zzoV.toArray(new Class[this.zzoV.size()]));
                if (this.zzoU == null) {
                    this.zzoW.countDown();
                } else {
                    this.zzoW.countDown();
                }
            }
        } catch (zza e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            this.zzoW.countDown();
        }
    }

    private String zzd(byte[] bArr, String str) throws zza, UnsupportedEncodingException {
        return new String(this.zznO.zzaF().zzc(bArr, str), Constants.ENCODING);
    }

    public Method zzaU() {
        if (this.zzoU != null) {
            return this.zzoU;
        }
        try {
            return this.zzoW.await(2, TimeUnit.SECONDS) ? this.zzoU : null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
