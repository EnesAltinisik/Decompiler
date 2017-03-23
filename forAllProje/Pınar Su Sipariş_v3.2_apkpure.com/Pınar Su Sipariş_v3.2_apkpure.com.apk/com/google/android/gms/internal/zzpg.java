package com.google.android.gms.internal;

public abstract class zzpg<T> {
    private static a zzaoQ = null;
    private static int zzaoR = 0;
    private static String zzaoS = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private static final Object zzrs = new Object();
    private T zzaoT = null;
    protected final String zzwQ;
    protected final T zzwR;

    class AnonymousClass1 extends zzpg<Boolean> {
        AnonymousClass1(String str, Boolean bool) {
            super(str, bool);
        }

        protected Boolean a(String str) {
            return null.a(this.zzwQ, (Boolean) this.zzwR);
        }

        protected /* synthetic */ Object zzcS(String str) {
            return a(str);
        }
    }

    class AnonymousClass2 extends zzpg<Long> {
        AnonymousClass2(String str, Long l) {
            super(str, l);
        }

        protected Long a(String str) {
            return null.a(this.zzwQ, (Long) this.zzwR);
        }

        protected /* synthetic */ Object zzcS(String str) {
            return a(str);
        }
    }

    class AnonymousClass3 extends zzpg<Integer> {
        AnonymousClass3(String str, Integer num) {
            super(str, num);
        }

        protected Integer a(String str) {
            return null.a(this.zzwQ, (Integer) this.zzwR);
        }

        protected /* synthetic */ Object zzcS(String str) {
            return a(str);
        }
    }

    class AnonymousClass4 extends zzpg<Float> {
        AnonymousClass4(String str, Float f) {
            super(str, f);
        }

        protected Float a(String str) {
            return null.a(this.zzwQ, (Float) this.zzwR);
        }

        protected /* synthetic */ Object zzcS(String str) {
            return a(str);
        }
    }

    class AnonymousClass5 extends zzpg<String> {
        AnonymousClass5(String str, String str2) {
            super(str, str2);
        }

        protected String a(String str) {
            return null.a(this.zzwQ, (String) this.zzwR);
        }

        protected /* synthetic */ Object zzcS(String str) {
            return a(str);
        }
    }

    private interface a {
        Boolean a(String str, Boolean bool);

        Float a(String str, Float f);

        Integer a(String str, Integer num);

        Long a(String str, Long l);

        String a(String str, String str2);
    }

    protected zzpg(String str, T t) {
        this.zzwQ = str;
        this.zzwR = t;
    }

    public static zzpg<Float> zza(String str, Float f) {
        return new AnonymousClass4(str, f);
    }

    public static zzpg<Integer> zza(String str, Integer num) {
        return new AnonymousClass3(str, num);
    }

    public static zzpg<Long> zza(String str, Long l) {
        return new AnonymousClass2(str, l);
    }

    public static zzpg<Boolean> zzl(String str, boolean z) {
        return new AnonymousClass1(str, Boolean.valueOf(z));
    }

    public static zzpg<String> zzz(String str, String str2) {
        return new AnonymousClass5(str, str2);
    }

    public final T get() {
        return zzcS(this.zzwQ);
    }

    protected abstract T zzcS(String str);
}
