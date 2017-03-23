package a.a.a.a.a.b;

import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: ResponseParser */
public class r {
    public static int a(int i) {
        if (i >= 200 && i <= 299) {
            return 0;
        }
        if (i >= Strategy.TTL_SECONDS_DEFAULT && i <= 399) {
            return 1;
        }
        if (i >= 400 && i <= 499) {
            return 0;
        }
        if (i >= 500) {
            return 1;
        }
        return 1;
    }
}
