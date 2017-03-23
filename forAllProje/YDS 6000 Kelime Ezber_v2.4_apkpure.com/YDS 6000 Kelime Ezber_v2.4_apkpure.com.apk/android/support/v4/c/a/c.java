package android.support.v4.c.a;

import android.annotation.TargetApi;
import android.content.res.Resources;

@TargetApi(13)
class c {
    static int a(Resources resources) {
        return resources.getConfiguration().screenHeightDp;
    }

    static int b(Resources resources) {
        return resources.getConfiguration().screenWidthDp;
    }

    static int c(Resources resources) {
        return resources.getConfiguration().smallestScreenWidthDp;
    }
}
