package com.fodlam.yds.alarms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

public class BootBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("remind_me_scheduled", false).commit();
        a.a(context);
    }
}
