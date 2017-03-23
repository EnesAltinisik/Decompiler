package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;

@vz
public class pp {
    public SharedPreferences a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 1);
    }
}
