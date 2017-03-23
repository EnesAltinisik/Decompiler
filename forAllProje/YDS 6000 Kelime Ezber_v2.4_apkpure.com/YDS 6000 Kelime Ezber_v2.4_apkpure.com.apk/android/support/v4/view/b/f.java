package android.support.v4.view.b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

@TargetApi(21)
class f {
    public static Interpolator a(Path path) {
        return new PathInterpolator(path);
    }
}
