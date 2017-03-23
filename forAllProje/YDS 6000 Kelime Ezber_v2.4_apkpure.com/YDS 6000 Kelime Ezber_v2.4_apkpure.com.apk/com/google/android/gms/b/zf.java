package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.v;

@vz
public class zf extends Handler {
    public zf(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            v.i().a(e, "AdMobHandler.handleMessage");
        }
    }
}
