package com.pinarsu.siparis.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import com.google.android.gms.gcm.GcmListenerService;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.MainActivity;

public class MyGCMListenerService extends GcmListenerService {
    private static final String PARAM_MODULE_ID = "ModuleId";

    public void onMessageReceived(String str, Bundle bundle) {
        PendingIntent pendingIntent;
        CharSequence charSequence = null;
        Log.d("MNTTAG", "MESAJ GELDI");
        CharSequence string = bundle.getString("msg");
        if (Tools.isApplicationRunning(this)) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(this, 1111, new Intent(this, MainActivity.class).putExtra("PUSH", string), 134217728);
        }
        Builder largeIcon = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.pinar_icon).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.pinar_icon));
        if (null == null) {
            charSequence = getString(R.string.app_name);
        }
        ((NotificationManager) getSystemService("notification")).notify(12, largeIcon.setContentTitle(charSequence).setContentText(string).setContentIntent(pendingIntent).setSound(RingtoneManager.getDefaultUri(2)).setAutoCancel(true).build());
    }
}
