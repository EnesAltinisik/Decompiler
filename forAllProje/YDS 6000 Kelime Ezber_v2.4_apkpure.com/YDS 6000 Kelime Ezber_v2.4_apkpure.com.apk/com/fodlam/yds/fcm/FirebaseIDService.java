package com.fodlam.yds.fcm;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseIDService extends FirebaseInstanceIdService {
    private void a(String str) {
    }

    public void a() {
        String d = FirebaseInstanceId.a().d();
        Log.e("YDS", "Refreshed token: " + d);
        a(d);
    }
}
