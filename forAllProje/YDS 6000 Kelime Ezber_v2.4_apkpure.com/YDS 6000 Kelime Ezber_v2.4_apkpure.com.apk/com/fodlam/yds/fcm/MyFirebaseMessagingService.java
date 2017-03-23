package com.fodlam.yds.fcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.b.ah.d;
import android.util.Log;
import com.fodlam.yds.MainActivity;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.SplashScreen;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.b;
import java.util.HashSet;
import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private void a(Map<String, String> map) {
        Intent intent = new Intent(getApplicationContext(), SplashScreen.class);
        intent.putExtra("title", (String) map.get("title"));
        intent.putExtra("message", (String) map.get("message"));
        Bundle bundle = new Bundle();
        bundle.putString("word", (String) map.get("word"));
        bundle.putString("sent_en", (String) map.get("sent_en"));
        bundle.putString("sent_tr", (String) map.get("sent_tr"));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        ((NotificationManager) getSystemService("notification")).notify(0, new d(this).a((int) R.mipmap.ic_launcher).a((CharSequence) map.get("title")).b((CharSequence) map.get("message")).a(true).a(RingtoneManager.getDefaultUri(2)).a(PendingIntent.getActivity(getApplicationContext(), 0, intent, 1073741824)).a());
    }

    public void a(b bVar) {
        String str = (String) bVar.a().get("word");
        if (str != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            Editor edit = defaultSharedPreferences.edit();
            String str2 = (String) bVar.a().get("sent_tr");
            HashSet hashSet = (HashSet) defaultSharedPreferences.getStringSet("news_messages", new HashSet());
            hashSet.add(str + "--" + ((String) bVar.a().get("sent_en")) + (str2 == null ? "" : "--" + str2));
            edit.putStringSet("news_messages", hashSet).commit();
        }
        if (com.fodlam.yds.b.a()) {
            MainActivity.m.runOnUiThread(new Runnable(this) {
                final /* synthetic */ MyFirebaseMessagingService a;

                {
                    this.a = r1;
                }

                public void run() {
                    MainActivity.m.k();
                    if (OxfordApplication.d) {
                        RingtoneManager.getRingtone(this.a.getApplicationContext(), RingtoneManager.getDefaultUri(2)).play();
                    }
                }
            });
        } else {
            a(bVar.a());
        }
        Log.e("YDS", "notification is received");
    }
}
