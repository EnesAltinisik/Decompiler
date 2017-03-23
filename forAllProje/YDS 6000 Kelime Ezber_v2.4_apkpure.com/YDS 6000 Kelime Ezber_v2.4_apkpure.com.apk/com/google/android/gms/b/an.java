package com.google.android.gms.b;

import android.os.Binder;

public abstract class an<T> {
    private static final Object c = new Object();
    private static a d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final T b;
    private T g = null;

    class AnonymousClass1 extends an<Boolean> {
        AnonymousClass1(String str, Boolean bool) {
            super(str, bool);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Boolean b(String str) {
            a aVar = null;
            return aVar.a(this.a, (Boolean) this.b);
        }
    }

    class AnonymousClass2 extends an<Long> {
        AnonymousClass2(String str, Long l) {
            super(str, l);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Long b(String str) {
            a aVar = null;
            return aVar.a(this.a, (Long) this.b);
        }
    }

    class AnonymousClass3 extends an<Integer> {
        AnonymousClass3(String str, Integer num) {
            super(str, num);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Integer b(String str) {
            a aVar = null;
            return aVar.a(this.a, (Integer) this.b);
        }
    }

    class AnonymousClass4 extends an<String> {
        AnonymousClass4(String str, String str2) {
            super(str, str2);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected String b(String str) {
            a aVar = null;
            return aVar.a(this.a, (String) this.b);
        }
    }

    private interface a {
        Boolean a(String str, Boolean bool);

        Integer a(String str, Integer num);

        Long a(String str, Long l);

        String a(String str, String str2);
    }

    protected an(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public static an<Integer> a(String str, Integer num) {
        return new AnonymousClass3(str, num);
    }

    public static an<Long> a(String str, Long l) {
        return new AnonymousClass2(str, l);
    }

    public static an<String> a(String str, String str2) {
        return new AnonymousClass4(str, str2);
    }

    public static an<Boolean> a(String str, boolean z) {
        return new AnonymousClass1(str, Boolean.valueOf(z));
    }

    public final T a() {
        T a;
        long clearCallingIdentity;
        try {
            a = a(this.a);
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            a = a(this.a);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return a;
    }

    protected abstract T a(String str);
}
