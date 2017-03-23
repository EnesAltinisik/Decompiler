package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class h {
    static final c a;

    interface c {
        boolean a(int i, int i2);

        boolean a(KeyEvent keyEvent);

        boolean b(int i);
    }

    static class a implements c {
        a() {
        }

        private static int a(int i, int i2, int i3, int i4, int i5) {
            Object obj = 1;
            Object obj2 = (i2 & i3) != 0 ? 1 : null;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                obj = null;
            }
            if (obj2 == null) {
                return obj != null ? i & (i3 ^ -1) : i;
            } else {
                if (obj == null) {
                    return i & (i6 ^ -1);
                }
                throw new IllegalArgumentException("bad arguments");
            }
        }

        public int a(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public boolean a(int i, int i2) {
            return a(a(a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        public boolean a(KeyEvent keyEvent) {
            return false;
        }

        public boolean b(int i) {
            return (a(i) & 247) == 0;
        }
    }

    static class b extends a {
        b() {
        }

        public int a(int i) {
            return i.a(i);
        }

        public boolean a(int i, int i2) {
            return i.a(i, i2);
        }

        public boolean a(KeyEvent keyEvent) {
            return i.a(keyEvent);
        }

        public boolean b(int i) {
            return i.b(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }

    public static boolean a(KeyEvent keyEvent, int i) {
        return a.a(keyEvent.getMetaState(), i);
    }

    public static boolean b(KeyEvent keyEvent) {
        return a.a(keyEvent);
    }
}
