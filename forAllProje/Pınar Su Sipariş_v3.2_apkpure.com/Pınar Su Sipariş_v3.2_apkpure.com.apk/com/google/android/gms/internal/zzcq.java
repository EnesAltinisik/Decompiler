package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzu;

@zzig
public abstract class zzcq<T> {
    private final int zzwP;
    private final String zzwQ;
    private final T zzwR;

    class AnonymousClass1 extends zzcq<Boolean> {
        AnonymousClass1(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        public Boolean a(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), ((Boolean) zzeq()).booleanValue()));
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return a(sharedPreferences);
        }
    }

    class AnonymousClass2 extends zzcq<Integer> {
        AnonymousClass2(int i, String str, Integer num) {
            super(i, str, num);
        }

        public Integer a(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(getKey(), ((Integer) zzeq()).intValue()));
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return a(sharedPreferences);
        }
    }

    class AnonymousClass3 extends zzcq<Long> {
        AnonymousClass3(int i, String str, Long l) {
            super(i, str, l);
        }

        public Long a(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(getKey(), ((Long) zzeq()).longValue()));
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return a(sharedPreferences);
        }
    }

    class AnonymousClass4 extends zzcq<String> {
        AnonymousClass4(int i, String str, String str2) {
            super(i, str, str2);
        }

        public String a(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(getKey(), (String) zzeq());
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return a(sharedPreferences);
        }
    }

    private zzcq(int i, String str, T t) {
        this.zzwP = i;
        this.zzwQ = str;
        this.zzwR = t;
        zzu.zzcs().zza(this);
    }

    public static zzcq<String> zza(int i, String str) {
        zzcq<String> zza = zza(i, str, null);
        zzu.zzcs().zzb(zza);
        return zza;
    }

    public static zzcq<Integer> zza(int i, String str, int i2) {
        return new AnonymousClass2(i, str, Integer.valueOf(i2));
    }

    public static zzcq<Long> zza(int i, String str, long j) {
        return new AnonymousClass3(i, str, Long.valueOf(j));
    }

    public static zzcq<Boolean> zza(int i, String str, Boolean bool) {
        return new AnonymousClass1(i, str, bool);
    }

    public static zzcq<String> zza(int i, String str, String str2) {
        return new AnonymousClass4(i, str, str2);
    }

    public static zzcq<String> zzb(int i, String str) {
        zzcq<String> zza = zza(i, str, null);
        zzu.zzcs().zzc(zza);
        return zza;
    }

    public T get() {
        return zzu.zzct().zzd(this);
    }

    public String getKey() {
        return this.zzwQ;
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    public T zzeq() {
        return this.zzwR;
    }
}
