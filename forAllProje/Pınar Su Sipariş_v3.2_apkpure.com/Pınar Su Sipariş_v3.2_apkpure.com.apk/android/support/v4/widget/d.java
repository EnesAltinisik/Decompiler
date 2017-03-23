package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompatDonut */
class d {
    private static Field a;
    private static boolean b;

    static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof ac) {
            ((ac) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    static void a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof ac) {
            ((ac) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    static Drawable a(CompoundButton compoundButton) {
        if (!b) {
            try {
                a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                return (Drawable) a.get(compoundButton);
            } catch (Throwable e2) {
                Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", e2);
                a = null;
            }
        }
        return null;
    }
}
