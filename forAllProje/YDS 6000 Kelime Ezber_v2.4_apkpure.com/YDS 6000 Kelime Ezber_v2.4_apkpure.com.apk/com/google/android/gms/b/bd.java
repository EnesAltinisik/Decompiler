package com.google.android.gms.b;

import android.os.RemoteException;

public abstract class bd<T> {
    private final int a;
    private final String b;
    private final T c;

    public static class a extends bd<Boolean> {
        public a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        public /* synthetic */ Object a(bg bgVar) {
            return b(bgVar);
        }

        public Boolean b(bg bgVar) {
            try {
                return Boolean.valueOf(bgVar.getBooleanFlagValue(a(), ((Boolean) b()).booleanValue(), d()));
            } catch (RemoteException e) {
                return (Boolean) b();
            }
        }
    }

    public static class b extends bd<Integer> {
        public b(int i, String str, Integer num) {
            super(i, str, num);
        }

        public /* synthetic */ Object a(bg bgVar) {
            return b(bgVar);
        }

        public Integer b(bg bgVar) {
            try {
                return Integer.valueOf(bgVar.getIntFlagValue(a(), ((Integer) b()).intValue(), d()));
            } catch (RemoteException e) {
                return (Integer) b();
            }
        }
    }

    public static class c extends bd<Long> {
        public c(int i, String str, Long l) {
            super(i, str, l);
        }

        public /* synthetic */ Object a(bg bgVar) {
            return b(bgVar);
        }

        public Long b(bg bgVar) {
            try {
                return Long.valueOf(bgVar.getLongFlagValue(a(), ((Long) b()).longValue(), d()));
            } catch (RemoteException e) {
                return (Long) b();
            }
        }
    }

    public static class d extends bd<String> {
        public d(int i, String str, String str2) {
            super(i, str, str2);
        }

        public /* synthetic */ Object a(bg bgVar) {
            return b(bgVar);
        }

        public String b(bg bgVar) {
            try {
                return bgVar.getStringFlagValue(a(), (String) b(), d());
            } catch (RemoteException e) {
                return (String) b();
            }
        }
    }

    private bd(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        bh.a().a(this);
    }

    public static a a(int i, String str, Boolean bool) {
        return new a(i, str, bool);
    }

    public static b a(int i, String str, int i2) {
        return new b(i, str, Integer.valueOf(i2));
    }

    public static c a(int i, String str, long j) {
        return new c(i, str, Long.valueOf(j));
    }

    public static d a(int i, String str, String str2) {
        return new d(i, str, str2);
    }

    protected abstract T a(bg bgVar);

    public String a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }

    public T c() {
        return bh.b().a(this);
    }

    public int d() {
        return this.a;
    }
}
