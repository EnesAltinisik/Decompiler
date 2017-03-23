package com.fodlam.yds;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.e;
import java.util.HashSet;

public class SplashScreen extends e {
    private static int m = 500;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Bundle extras = getIntent().getExtras();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Editor edit = defaultSharedPreferences.edit();
        if (extras != null) {
            String string = extras.getString("word");
            if (string != null) {
                String string2 = extras.getString("sent_en");
                String string3 = extras.getString("sent_tr");
                HashSet hashSet = (HashSet) defaultSharedPreferences.getStringSet("news_messages", new HashSet());
                hashSet.add(string + "--" + string2 + (string3 == null ? "" : "--" + string3));
                edit.putStringSet("news_messages", hashSet).apply();
            }
        }
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ SplashScreen b;

            public void run() {
                Intent intent = new Intent(this.b, MainActivity.class);
                intent.setFlags(268468224);
                if (!(extras == null || extras.getSerializable("notifyword") == null)) {
                    intent.putExtra("notifyword", extras.getSerializable("notifyword"));
                }
                this.b.startActivity(intent);
                this.b.finish();
            }
        }, (long) m);
    }
}
