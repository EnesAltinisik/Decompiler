package com.google.android.gms.b;

public class vx<T> {
    public final T a;
    public final com.google.android.gms.b.en.a b;
    public final abb c;
    public boolean d;

    public interface a {
        void a(abb com_google_android_gms_b_abb);
    }

    public interface b<T> {
        void a(T t);
    }

    private vx(abb com_google_android_gms_b_abb) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = com_google_android_gms_b_abb;
    }

    private vx(T t, com.google.android.gms.b.en.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> vx<T> a(abb com_google_android_gms_b_abb) {
        return new vx(com_google_android_gms_b_abb);
    }

    public static <T> vx<T> a(T t, com.google.android.gms.b.en.a aVar) {
        return new vx(t, aVar);
    }

    public boolean a() {
        return this.c == null;
    }
}
