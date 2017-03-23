package com.google.android.gms.internal;

import java.io.IOException;

final class n<T> extends zzakr<T> {
    private final zzakn<T> a;
    private final zzake<T> b;
    private final zzajz c;
    private final zzalv<T> d;
    private final zzaks e;
    private zzakr<T> f;

    private static class a implements zzaks {
        private final zzalv<?> a;
        private final boolean b;
        private final Class<?> c;
        private final zzakn<?> d;
        private final zzake<?> e;

        private a(Object obj, zzalv<?> com_google_android_gms_internal_zzalv_, boolean z, Class<?> cls) {
            this.d = obj instanceof zzakn ? (zzakn) obj : null;
            this.e = obj instanceof zzake ? (zzake) obj : null;
            boolean z2 = (this.d == null && this.e == null) ? false : true;
            zzakx.zzaj(z2);
            this.a = com_google_android_gms_internal_zzalv_;
            this.b = z;
            this.c = cls;
        }

        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            boolean isAssignableFrom = this.a != null ? this.a.equals(com_google_android_gms_internal_zzalv_T) || (this.b && this.a.zzWm() == com_google_android_gms_internal_zzalv_T.zzWl()) : this.c.isAssignableFrom(com_google_android_gms_internal_zzalv_T.zzWl());
            return isAssignableFrom ? new n(this.d, this.e, com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzalv_T, this) : null;
        }
    }

    private n(zzakn<T> com_google_android_gms_internal_zzakn_T, zzake<T> com_google_android_gms_internal_zzake_T, zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T, zzaks com_google_android_gms_internal_zzaks) {
        this.a = com_google_android_gms_internal_zzakn_T;
        this.b = com_google_android_gms_internal_zzake_T;
        this.c = com_google_android_gms_internal_zzajz;
        this.d = com_google_android_gms_internal_zzalv_T;
        this.e = com_google_android_gms_internal_zzaks;
    }

    private zzakr<T> a() {
        zzakr<T> com_google_android_gms_internal_zzakr_T = this.f;
        if (com_google_android_gms_internal_zzakr_T != null) {
            return com_google_android_gms_internal_zzakr_T;
        }
        com_google_android_gms_internal_zzakr_T = this.c.zza(this.e, this.d);
        this.f = com_google_android_gms_internal_zzakr_T;
        return com_google_android_gms_internal_zzakr_T;
    }

    public static zzaks a(zzalv<?> com_google_android_gms_internal_zzalv_, Object obj) {
        return new a(obj, com_google_android_gms_internal_zzalv_, false, null);
    }

    public static zzaks b(zzalv<?> com_google_android_gms_internal_zzalv_, Object obj) {
        return new a(obj, com_google_android_gms_internal_zzalv_, com_google_android_gms_internal_zzalv_.zzWm() == com_google_android_gms_internal_zzalv_.zzWl(), null);
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
        if (this.a == null) {
            a().zza(com_google_android_gms_internal_zzaly, t);
        } else if (t == null) {
            com_google_android_gms_internal_zzaly.zzWk();
        } else {
            zzalg.zzb(this.a.zza(t, this.d.zzWm(), this.c.zzbWg), com_google_android_gms_internal_zzaly);
        }
    }

    public T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (this.b == null) {
            return a().zzb(com_google_android_gms_internal_zzalw);
        }
        zzakf zzh = zzalg.zzh(com_google_android_gms_internal_zzalw);
        if (zzh.zzVI()) {
            return null;
        }
        try {
            return this.b.zzb(zzh, this.d.zzWm(), this.c.zzbWf);
        } catch (zzakj e) {
            throw e;
        } catch (Throwable e2) {
            throw new zzakj(e2);
        }
    }
}
