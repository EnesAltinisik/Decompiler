package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzala implements zzaks, Cloneable {
    public static final zzala zzbWT = new zzala();
    private double zzbWU = -1.0d;
    private int zzbWV = 136;
    private boolean zzbWW = true;
    private List<zzajv> zzbWX = Collections.emptyList();
    private List<zzajv> zzbWY = Collections.emptyList();

    private boolean zza(zzakv com_google_android_gms_internal_zzakv) {
        return com_google_android_gms_internal_zzakv == null || com_google_android_gms_internal_zzakv.zzVS() <= this.zzbWU;
    }

    private boolean zza(zzakv com_google_android_gms_internal_zzakv, zzakw com_google_android_gms_internal_zzakw) {
        return zza(com_google_android_gms_internal_zzakv) && zza(com_google_android_gms_internal_zzakw);
    }

    private boolean zza(zzakw com_google_android_gms_internal_zzakw) {
        return com_google_android_gms_internal_zzakw == null || com_google_android_gms_internal_zzakw.zzVS() > this.zzbWU;
    }

    private boolean zzm(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean zzn(Class<?> cls) {
        return cls.isMemberClass() && !zzo(cls);
    }

    private boolean zzo(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzVU();
    }

    protected zzala zzVU() {
        try {
            return (zzala) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
        final boolean zza = zza(zzWl, true);
        final boolean zza2 = zza(zzWl, false);
        if (!zza && !zza2) {
            return null;
        }
        final zzajz com_google_android_gms_internal_zzajz2 = com_google_android_gms_internal_zzajz;
        final zzalv<T> com_google_android_gms_internal_zzalv_T2 = com_google_android_gms_internal_zzalv_T;
        return new zzakr<T>(this) {
            final /* synthetic */ zzala e;
            private zzakr<T> f;

            private zzakr<T> a() {
                zzakr<T> com_google_android_gms_internal_zzakr_T = this.f;
                if (com_google_android_gms_internal_zzakr_T != null) {
                    return com_google_android_gms_internal_zzakr_T;
                }
                com_google_android_gms_internal_zzakr_T = com_google_android_gms_internal_zzajz2.zza(this.e, com_google_android_gms_internal_zzalv_T2);
                this.f = com_google_android_gms_internal_zzakr_T;
                return com_google_android_gms_internal_zzakr_T;
            }

            public void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
                if (zza) {
                    com_google_android_gms_internal_zzaly.zzWk();
                } else {
                    a().zza(com_google_android_gms_internal_zzaly, t);
                }
            }

            public T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                if (!zza2) {
                    return a().zzb(com_google_android_gms_internal_zzalw);
                }
                com_google_android_gms_internal_zzalw.skipValue();
                return null;
            }
        };
    }

    public zzala zza(zzajv com_google_android_gms_internal_zzajv, boolean z, boolean z2) {
        zzala zzVU = zzVU();
        if (z) {
            zzVU.zzbWX = new ArrayList(this.zzbWX);
            zzVU.zzbWX.add(com_google_android_gms_internal_zzajv);
        }
        if (z2) {
            zzVU.zzbWY = new ArrayList(this.zzbWY);
            zzVU.zzbWY.add(com_google_android_gms_internal_zzajv);
        }
        return zzVU;
    }

    public boolean zza(Class<?> cls, boolean z) {
        if (this.zzbWU != -1.0d && !zza((zzakv) cls.getAnnotation(zzakv.class), (zzakw) cls.getAnnotation(zzakw.class))) {
            return true;
        }
        if (!this.zzbWW && zzn(cls)) {
            return true;
        }
        if (zzm(cls)) {
            return true;
        }
        for (zzajv zzh : z ? this.zzbWX : this.zzbWY) {
            if (zzh.zzh(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean zza(Field field, boolean z) {
        if ((this.zzbWV & field.getModifiers()) != 0) {
            return true;
        }
        if (this.zzbWU != -1.0d && !zza((zzakv) field.getAnnotation(zzakv.class), (zzakw) field.getAnnotation(zzakw.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (!this.zzbWW && zzn(field.getType())) {
            return true;
        }
        if (zzm(field.getType())) {
            return true;
        }
        List<zzajv> list = z ? this.zzbWX : this.zzbWY;
        if (!list.isEmpty()) {
            zzajw com_google_android_gms_internal_zzajw = new zzajw(field);
            for (zzajv zza : list) {
                if (zza.zza(com_google_android_gms_internal_zzajw)) {
                    return true;
                }
            }
        }
        return false;
    }

    public zzala zzd(int... iArr) {
        int i = 0;
        zzala zzVU = zzVU();
        zzVU.zzbWV = 0;
        int length = iArr.length;
        while (i < length) {
            zzVU.zzbWV = iArr[i] | zzVU.zzbWV;
            i++;
        }
        return zzVU;
    }
}
