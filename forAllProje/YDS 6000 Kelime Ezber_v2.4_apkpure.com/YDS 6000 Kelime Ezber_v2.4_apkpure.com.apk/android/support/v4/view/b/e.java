package android.support.v4.view.b;

import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class e {
    public static Interpolator a(Path path) {
        return VERSION.SDK_INT >= 21 ? f.a(path) : g.a(path);
    }
}
