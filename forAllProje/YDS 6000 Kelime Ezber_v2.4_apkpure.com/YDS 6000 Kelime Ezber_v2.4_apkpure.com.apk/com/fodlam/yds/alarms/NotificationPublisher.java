package com.fodlam.yds.alarms;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.b;
import com.fodlam.yds.utility.c;
import java.util.Date;

public class NotificationPublisher extends BroadcastReceiver {
    public static String a = "notification-yds-id";
    public static String b = "notification-yds";

    public void onReceive(Context context, Intent intent) {
        if (!b.a()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Editor edit = defaultSharedPreferences.edit();
            String a = c.a(new Date());
            if (!a.equals(defaultSharedPreferences.getString("is_today_remind_me_worked", "day"))) {
                com.fodlam.yds.c.b a2;
                com.fodlam.yds.c.b a3 = com.fodlam.yds.c.b.a();
                boolean z = a3 == null;
                if (z) {
                    OxfordApplication.b(context);
                    a2 = com.fodlam.yds.c.b.a(context, false);
                } else {
                    a2 = a3;
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Notification a4 = a.a(context, a2.e());
                int intExtra = intent.getIntExtra(a, 0);
                a4.sound = Uri.parse(defaultSharedPreferences.getString("notifications_new_message_ringtone", "content://settings/system/notification_sound"));
                notificationManager.notify(intExtra, a4);
                edit.putString("is_today_remind_me_worked", a).apply();
                if (z) {
                    a2.h();
                }
            }
        }
    }
}
