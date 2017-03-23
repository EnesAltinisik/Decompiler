package android.support.v4.h;

import android.annotation.TargetApi;
import android.text.TextUtils;
import java.util.Locale;

@TargetApi(17)
class h {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
