package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(9)
public class al {
    private static Method a;

    public static abstract class a {

        public interface a {
        }

        public abstract int a();

        public abstract CharSequence b();

        public abstract PendingIntent c();

        public abstract Bundle d();

        public abstract boolean e();

        public abstract android.support.v4.b.at.a[] g();
    }

    public static Notification a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Throwable e;
        if (a == null) {
            try {
                a = Notification.class.getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class});
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            a.invoke(notification, new Object[]{context, charSequence, charSequence2, pendingIntent});
            notification.fullScreenIntent = pendingIntent2;
            return notification;
        } catch (IllegalAccessException e3) {
            e2 = e3;
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            e2 = e4;
            throw new RuntimeException(e2);
        }
    }
}
