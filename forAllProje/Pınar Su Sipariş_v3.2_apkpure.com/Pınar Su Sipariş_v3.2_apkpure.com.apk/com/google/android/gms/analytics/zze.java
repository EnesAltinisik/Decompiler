package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zze {
    private final zzh zzUm;
    private boolean zzUn;
    private long zzUo;
    private long zzUp;
    private long zzUq;
    private long zzUr;
    private long zzUs;
    private boolean zzUt;
    private final Map<Class<? extends zzg>, zzg> zzUu;
    private final List<zzk> zzUv;
    private final com.google.android.gms.common.util.zze zzsd;

    zze(zze com_google_android_gms_analytics_zze) {
        this.zzUm = com_google_android_gms_analytics_zze.zzUm;
        this.zzsd = com_google_android_gms_analytics_zze.zzsd;
        this.zzUo = com_google_android_gms_analytics_zze.zzUo;
        this.zzUp = com_google_android_gms_analytics_zze.zzUp;
        this.zzUq = com_google_android_gms_analytics_zze.zzUq;
        this.zzUr = com_google_android_gms_analytics_zze.zzUr;
        this.zzUs = com_google_android_gms_analytics_zze.zzUs;
        this.zzUv = new ArrayList(com_google_android_gms_analytics_zze.zzUv);
        this.zzUu = new HashMap(com_google_android_gms_analytics_zze.zzUu.size());
        for (Entry entry : com_google_android_gms_analytics_zze.zzUu.entrySet()) {
            zzg zzc = zzc((Class) entry.getKey());
            ((zzg) entry.getValue()).zzb(zzc);
            this.zzUu.put((Class) entry.getKey(), zzc);
        }
    }

    zze(zzh com_google_android_gms_analytics_zzh, com.google.android.gms.common.util.zze com_google_android_gms_common_util_zze) {
        zzaa.zzz(com_google_android_gms_analytics_zzh);
        zzaa.zzz(com_google_android_gms_common_util_zze);
        this.zzUm = com_google_android_gms_analytics_zzh;
        this.zzsd = com_google_android_gms_common_util_zze;
        this.zzUr = 1800000;
        this.zzUs = 3024000000L;
        this.zzUu = new HashMap();
        this.zzUv = new ArrayList();
    }

    private static <T extends zzg> T zzc(Class<T> cls) {
        try {
            return (zzg) cls.newInstance();
        } catch (Throwable e) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
        }
    }

    public <T extends zzg> T zza(Class<T> cls) {
        return (zzg) this.zzUu.get(cls);
    }

    public void zza(zzg com_google_android_gms_analytics_zzg) {
        zzaa.zzz(com_google_android_gms_analytics_zzg);
        Class cls = com_google_android_gms_analytics_zzg.getClass();
        if (cls.getSuperclass() != zzg.class) {
            throw new IllegalArgumentException();
        }
        com_google_android_gms_analytics_zzg.zzb(zzb(cls));
    }

    public <T extends zzg> T zzb(Class<T> cls) {
        zzg com_google_android_gms_analytics_zzg = (zzg) this.zzUu.get(cls);
        if (com_google_android_gms_analytics_zzg != null) {
            return com_google_android_gms_analytics_zzg;
        }
        T zzc = zzc(cls);
        this.zzUu.put(cls, zzc);
        return zzc;
    }

    public List<zzk> zzkA() {
        return this.zzUv;
    }

    public long zzkB() {
        return this.zzUo;
    }

    public void zzkC() {
        zzkG().zze(this);
    }

    public boolean zzkD() {
        return this.zzUn;
    }

    void zzkE() {
        this.zzUq = this.zzsd.elapsedRealtime();
        if (this.zzUp != 0) {
            this.zzUo = this.zzUp;
        } else {
            this.zzUo = this.zzsd.currentTimeMillis();
        }
        this.zzUn = true;
    }

    zzh zzkF() {
        return this.zzUm;
    }

    zzi zzkG() {
        return this.zzUm.zzkG();
    }

    boolean zzkH() {
        return this.zzUt;
    }

    void zzkI() {
        this.zzUt = true;
    }

    public zze zzky() {
        return new zze(this);
    }

    public Collection<zzg> zzkz() {
        return this.zzUu.values();
    }

    public void zzn(long j) {
        this.zzUp = j;
    }
}
