package android.support.v4.view.b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.view.animation.Interpolator;

@TargetApi(9)
class g {
    public static Interpolator a(Path path) {
        return new h(path);
    }
}
