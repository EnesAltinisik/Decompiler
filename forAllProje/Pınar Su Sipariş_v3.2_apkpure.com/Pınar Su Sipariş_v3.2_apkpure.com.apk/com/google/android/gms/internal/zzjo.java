package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzig
public class zzjo {
    private boolean zzNs;
    private final LinkedList<a> zzPj;
    private final String zzPk;
    private final String zzPl;
    private long zzPm;
    private long zzPn;
    private long zzPo;
    private long zzPp;
    private long zzPq;
    private long zzPr;
    private final Object zzpp;
    private final zzjq zzsc;

    @zzig
    private static final class a {
        private long a = -1;
        private long b = -1;

        public long a() {
            return this.b;
        }

        public void b() {
            this.b = SystemClock.elapsedRealtime();
        }

        public void c() {
            this.a = SystemClock.elapsedRealtime();
        }

        public Bundle d() {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", this.a);
            bundle.putLong("tclose", this.b);
            return bundle;
        }
    }

    public zzjo(zzjq com_google_android_gms_internal_zzjq, String str, String str2) {
        this.zzpp = new Object();
        this.zzPm = -1;
        this.zzPn = -1;
        this.zzNs = false;
        this.zzPo = -1;
        this.zzPp = 0;
        this.zzPq = -1;
        this.zzPr = -1;
        this.zzsc = com_google_android_gms_internal_zzjq;
        this.zzPk = str;
        this.zzPl = str2;
        this.zzPj = new LinkedList();
    }

    public zzjo(String str, String str2) {
        this(zzu.zzcn(), str, str2);
    }

    public Bundle toBundle() {
        Bundle bundle;
        synchronized (this.zzpp) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzPk);
            bundle.putString("slotid", this.zzPl);
            bundle.putBoolean("ismediation", this.zzNs);
            bundle.putLong("treq", this.zzPq);
            bundle.putLong("tresponse", this.zzPr);
            bundle.putLong("timp", this.zzPn);
            bundle.putLong("tload", this.zzPo);
            bundle.putLong("pcc", this.zzPp);
            bundle.putLong("tfetch", this.zzPm);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzPj.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public void zzB(boolean z) {
        synchronized (this.zzpp) {
            if (this.zzPr != -1) {
                this.zzPo = SystemClock.elapsedRealtime();
                if (!z) {
                    this.zzPn = this.zzPo;
                    this.zzsc.zza(this);
                }
            }
        }
    }

    public void zzC(boolean z) {
        synchronized (this.zzpp) {
            if (this.zzPr != -1) {
                this.zzNs = z;
                this.zzsc.zza(this);
            }
        }
    }

    public void zzit() {
        synchronized (this.zzpp) {
            if (this.zzPr != -1 && this.zzPn == -1) {
                this.zzPn = SystemClock.elapsedRealtime();
                this.zzsc.zza(this);
            }
            this.zzsc.zziF().zzit();
        }
    }

    public void zziu() {
        synchronized (this.zzpp) {
            if (this.zzPr != -1) {
                a aVar = new a();
                aVar.c();
                this.zzPj.add(aVar);
                this.zzPp++;
                this.zzsc.zziF().zziu();
                this.zzsc.zza(this);
            }
        }
    }

    public void zziv() {
        synchronized (this.zzpp) {
            if (!(this.zzPr == -1 || this.zzPj.isEmpty())) {
                a aVar = (a) this.zzPj.getLast();
                if (aVar.a() == -1) {
                    aVar.b();
                    this.zzsc.zza(this);
                }
            }
        }
    }

    public void zzl(long j) {
        synchronized (this.zzpp) {
            this.zzPr = j;
            if (this.zzPr != -1) {
                this.zzsc.zza(this);
            }
        }
    }

    public void zzm(long j) {
        synchronized (this.zzpp) {
            if (this.zzPr != -1) {
                this.zzPm = j;
                this.zzsc.zza(this);
            }
        }
    }

    public void zzq(AdRequestParcel adRequestParcel) {
        synchronized (this.zzpp) {
            this.zzPq = SystemClock.elapsedRealtime();
            this.zzsc.zziF().zzb(adRequestParcel, this.zzPq);
        }
    }
}
