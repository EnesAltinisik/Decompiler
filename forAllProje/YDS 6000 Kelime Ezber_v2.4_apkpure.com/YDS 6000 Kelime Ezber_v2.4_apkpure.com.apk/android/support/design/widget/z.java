package android.support.design.widget;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;

class z {
    static final d a = new d() {
        public s a() {
            return new s(VERSION.SDK_INT >= 12 ? new u() : new t());
        }
    };

    static Mode a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            default:
                return mode;
        }
    }

    static s a() {
        return a.a();
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
