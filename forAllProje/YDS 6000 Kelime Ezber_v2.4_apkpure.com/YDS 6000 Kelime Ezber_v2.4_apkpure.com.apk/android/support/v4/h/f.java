package android.support.v4.h;

import java.util.Locale;

public final class f {
    public static final e a = new e(null, false);
    public static final e b = new e(null, true);
    public static final e c = new e(b.a, false);
    public static final e d = new e(b.a, true);
    public static final e e = new e(a.a, false);
    public static final e f = f.a;

    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static class a implements c {
        public static final a a = new a(true);
        public static final a b = new a(false);
        private final boolean c;

        private a(boolean z) {
            this.c = z;
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 0;
            while (i < i3) {
                switch (f.a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (!this.c) {
                            i4 = 1;
                            break;
                        }
                        return 0;
                    case 1:
                        if (this.c) {
                            i4 = 1;
                            break;
                        }
                        return 1;
                    default:
                        break;
                }
                i++;
            }
            return i4 != 0 ? !this.c ? 0 : 1 : 2;
        }
    }

    private static class b implements c {
        public static final b a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = f.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    private static abstract class d implements e {
        private final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            switch (this.a.a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return a();
            }
        }

        protected abstract boolean a();

        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.a == null ? a() : b(charSequence, i, i2);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private static class e extends d {
        private final boolean a;

        e(c cVar, boolean z) {
            super(cVar);
            this.a = z;
        }

        protected boolean a() {
            return this.a;
        }
    }

    private static class f extends d {
        public static final f a = new f();

        public f() {
            super(null);
        }

        protected boolean a() {
            return g.a(Locale.getDefault()) == 1;
        }
    }

    static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    static int b(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}
