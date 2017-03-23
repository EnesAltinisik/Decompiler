package android.support.v7.c;

import android.os.Messenger;

/* compiled from: MediaRouteProviderProtocol */
abstract class e {
    public static boolean a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
