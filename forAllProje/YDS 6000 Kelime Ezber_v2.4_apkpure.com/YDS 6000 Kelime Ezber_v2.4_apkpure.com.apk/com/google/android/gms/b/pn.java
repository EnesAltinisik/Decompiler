package com.google.android.gms.b;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.v;

@vz
public abstract class pn<T> {
    private final int a;
    private final String b;
    private final T c;

    class AnonymousClass1 extends pn<Boolean> {
        AnonymousClass1(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
            return b(sharedPreferences);
        }

        public Boolean b(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(a(), ((Boolean) b()).booleanValue()));
        }
    }

    class AnonymousClass2 extends pn<Integer> {
        AnonymousClass2(int i, String str, Integer num) {
            super(i, str, num);
        }

        public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
            return b(sharedPreferences);
        }

        public Integer b(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(a(), ((Integer) b()).intValue()));
        }
    }

    class AnonymousClass3 extends pn<Long> {
        AnonymousClass3(int i, String str, Long l) {
            super(i, str, l);
        }

        public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
            return b(sharedPreferences);
        }

        public Long b(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(a(), ((Long) b()).longValue()));
        }
    }

    class AnonymousClass4 extends pn<Float> {
        AnonymousClass4(int i, String str, Float f) {
            super(i, str, f);
        }

        public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
            return b(sharedPreferences);
        }

        public Float b(SharedPreferences sharedPreferences) {
            return Float.valueOf(sharedPreferences.getFloat(a(), ((Float) b()).floatValue()));
        }
    }

    class AnonymousClass5 extends pn<String> {
        AnonymousClass5(int i, String str, String str2) {
            super(i, str, str2);
        }

        public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
            return b(sharedPreferences);
        }

        public String b(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(a(), (String) b());
        }
    }

    private pn(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        v.p().a(this);
    }

    public static pn<String> a(int i, String str) {
        pn<String> a = a(i, str, null);
        v.p().b(a);
        return a;
    }

    public static pn<Float> a(int i, String str, float f) {
        return new AnonymousClass4(i, str, Float.valueOf(f));
    }

    public static pn<Integer> a(int i, String str, int i2) {
        return new AnonymousClass2(i, str, Integer.valueOf(i2));
    }

    public static pn<Long> a(int i, String str, long j) {
        return new AnonymousClass3(i, str, Long.valueOf(j));
    }

    public static pn<Boolean> a(int i, String str, Boolean bool) {
        return new AnonymousClass1(i, str, bool);
    }

    public static pn<String> a(int i, String str, String str2) {
        return new AnonymousClass5(i, str, str2);
    }

    public static pn<String> b(int i, String str) {
        pn<String> a = a(i, str, null);
        v.p().c(a);
        return a;
    }

    protected abstract T a(SharedPreferences sharedPreferences);

    public String a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }

    public T c() {
        return v.q().a(this);
    }
}
