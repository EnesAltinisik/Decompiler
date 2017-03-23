package com.pinarsu.siparis.gcm;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;

public class MyInstanceIDListenerService extends InstanceIDListenerService {
    public void onTokenRefresh() {
        super.onTokenRefresh();
        Log.e("MNTTAG", "MyInstanceIDLisServ token refresh is called. Saving...");
        Preferences.PUSH_TOKEN = "";
        MyApplication.getInstance().getPreferences().save();
        startService(new Intent(this, GCMRegistrationService.class));
    }
}
