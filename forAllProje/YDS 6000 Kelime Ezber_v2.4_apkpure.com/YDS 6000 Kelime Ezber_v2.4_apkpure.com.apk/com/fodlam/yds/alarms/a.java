package com.fodlam.yds.alarms;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.p.b;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.SplashScreen;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.c;

public class a {
    public static Notification a(Context context, h hVar) {
        CharSequence charSequence = context.getString(R.string.learnthetranslationof) + " '" + hVar.h + "'.";
        b bVar = new b(context);
        bVar.a(context.getString(R.string.newword) + " : " + hVar.h);
        bVar.b(charSequence);
        if (VERSION.SDK_INT >= 21) {
            bVar.b(android.support.v4.c.a.c(context, R.color.colorPrimary));
        }
        bVar.a(c.a());
        Intent intent = new Intent(context, SplashScreen.class);
        intent.putExtra("notifyword", hVar);
        bVar.a(PendingIntent.getActivity(context, 353232, intent, 134217728));
        Notification a = bVar.a();
        a.flags = 16;
        return a;
    }

    public static void a(int i, Context context) {
        try {
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, i, new Intent(context, NotificationPublisher.class), 134217728));
        } catch (Exception e) {
        }
    }

    public static void a(int i, Context context, h hVar) {
        Parcelable a = a(context, hVar);
        Intent intent = new Intent(context, NotificationPublisher.class);
        intent.addFlags(805306368);
        intent.putExtra(NotificationPublisher.a, 1);
        intent.putExtra(NotificationPublisher.b, a);
        long elapsedRealtime = SystemClock.elapsedRealtime() + 21600000;
        ((AlarmManager) context.getSystemService("alarm")).setRepeating(3, elapsedRealtime, 21600000, PendingIntent.getBroadcast(context, i, intent, 134217728));
    }

    public static void a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = defaultSharedPreferences.edit();
        OxfordApplication.b(context);
        if (!OxfordApplication.k.booleanValue()) {
            a(353232, context);
            edit.putBoolean("remind_me_scheduled", false).commit();
        } else if (!defaultSharedPreferences.getBoolean("remind_me_scheduled", false)) {
            com.fodlam.yds.c.b a = com.fodlam.yds.c.b.a();
            boolean z = a == null;
            if (z) {
                a = com.fodlam.yds.c.b.a(context, false);
            }
            h e = a.e();
            if (z) {
                a.h();
            }
            a(353232, context.getApplicationContext(), e);
            edit.putBoolean("remind_me_scheduled", true).apply();
            edit.putString("is_today_remind_me_worked", "day").apply();
        }
    }
}
