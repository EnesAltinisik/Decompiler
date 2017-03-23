package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzm.zzb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

@zzig
public class zzkg {
    private static zzl zzQU;
    private static final Object zzQV = new Object();
    public static final zza<Void> zzQW = new zza<Void>() {
        public Void a() {
            return null;
        }

        public Void a(InputStream inputStream) {
            return null;
        }

        public /* synthetic */ Object zzh(InputStream inputStream) {
            return a(inputStream);
        }

        public /* synthetic */ Object zzhO() {
            return a();
        }
    };

    public interface zza<T> {
        T zzh(InputStream inputStream);

        T zzhO();
    }

    private static class a<T> extends zzk<InputStream> {
        private final zza<T> a;
        private final zzb<T> b;

        class AnonymousClass1 implements com.google.android.gms.internal.zzm.zza {
            final /* synthetic */ zzb a;
            final /* synthetic */ zza b;

            AnonymousClass1(zzb com_google_android_gms_internal_zzm_zzb, zza com_google_android_gms_internal_zzkg_zza) {
                this.a = com_google_android_gms_internal_zzm_zzb;
                this.b = com_google_android_gms_internal_zzkg_zza;
            }

            public void zze(zzr com_google_android_gms_internal_zzr) {
                this.a.zzb(this.b.zzhO());
            }
        }

        public a(String str, zza<T> com_google_android_gms_internal_zzkg_zza_T, zzb<T> com_google_android_gms_internal_zzm_zzb_T) {
            super(0, str, new AnonymousClass1(com_google_android_gms_internal_zzm_zzb_T, com_google_android_gms_internal_zzkg_zza_T));
            this.a = com_google_android_gms_internal_zzkg_zza_T;
            this.b = com_google_android_gms_internal_zzm_zzb_T;
        }

        protected void a(InputStream inputStream) {
            this.b.zzb(this.a.zzh(inputStream));
        }

        protected zzm<InputStream> zza(zzi com_google_android_gms_internal_zzi) {
            return zzm.zza(new ByteArrayInputStream(com_google_android_gms_internal_zzi.data), zzx.zzb(com_google_android_gms_internal_zzi));
        }

        protected /* synthetic */ void zza(Object obj) {
            a((InputStream) obj);
        }
    }

    private class b<T> extends zzko<T> implements zzb<T> {
        final /* synthetic */ zzkg a;

        private b(zzkg com_google_android_gms_internal_zzkg) {
            this.a = com_google_android_gms_internal_zzkg;
        }

        public void zzb(T t) {
            super.zzh(t);
        }
    }

    public zzkg(Context context) {
        zzO(context);
    }

    private static zzl zzO(Context context) {
        zzl com_google_android_gms_internal_zzl;
        synchronized (zzQV) {
            if (zzQU == null) {
                zzQU = zzac.zza(context.getApplicationContext());
            }
            com_google_android_gms_internal_zzl = zzQU;
        }
        return com_google_android_gms_internal_zzl;
    }

    public zzkr<String> zza(int i, final String str, Map<String, String> map, byte[] bArr) {
        final Object bVar = new b();
        final byte[] bArr2 = bArr;
        final Map<String, String> map2 = map;
        zzQU.zze(new zzab(this, i, str, bVar, new com.google.android.gms.internal.zzm.zza(this) {
            final /* synthetic */ zzkg c;

            public void zze(zzr com_google_android_gms_internal_zzr) {
                String str = str;
                String valueOf = String.valueOf(com_google_android_gms_internal_zzr.toString());
                com.google.android.gms.ads.internal.util.client.zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str).append("\n").append(valueOf).toString());
                bVar.zzb(null);
            }
        }) {
            final /* synthetic */ zzkg c;

            public Map<String, String> getHeaders() throws zza {
                return map2 == null ? super.getHeaders() : map2;
            }

            public byte[] zzp() throws zza {
                return bArr2 == null ? super.zzp() : bArr2;
            }
        });
        return bVar;
    }

    public <T> zzkr<T> zza(String str, zza<T> com_google_android_gms_internal_zzkg_zza_T) {
        Object bVar = new b();
        zzQU.zze(new a(str, com_google_android_gms_internal_zzkg_zza_T, bVar));
        return bVar;
    }

    public zzkr<String> zzb(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }
}
