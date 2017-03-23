package com.fodlam.yds.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.c.b;
import com.fodlam.yds.f.h;
import com.google.firebase.crash.FirebaseCrash;

public class OxfordWidget extends AppWidgetProvider {
    public void onDisabled(Context context) {
    }

    public void onEnabled(Context context) {
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int i = 0;
        b a = b.a();
        int i2 = a == null ? 1 : 0;
        if (i2 != 0) {
            try {
                OxfordApplication.b(context);
                a = b.a(context, false);
            } catch (Exception e) {
                FirebaseCrash.a(e.getMessage());
            }
        }
        h f = a.f();
        int length = iArr.length;
        while (i < length) {
            int i3 = iArr[i];
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.oxford_widget);
            remoteViews.setTextViewText(R.id.appwidget_texten, f.h + "\n(" + f.i + ")");
            remoteViews.setTextViewText(R.id.appwidget_texttr, f.k);
            Intent intent = new Intent(context, OxfordWidget.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            remoteViews.setOnClickPendingIntent(R.id.appwidget_texten, PendingIntent.getBroadcast(context, 0, intent, 134217728));
            appWidgetManager.updateAppWidget(i3, remoteViews);
            appWidgetManager.updateAppWidget(i3, remoteViews);
            i++;
        }
        if (i2 != 0) {
            a.h();
        }
    }
}
