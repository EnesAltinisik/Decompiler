package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@zzig
public class zzhe extends Handler {
    private final zzhd zzIY;

    public zzhe(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this(new zzhf(context));
    }

    public zzhe(zzhd com_google_android_gms_internal_zzhd) {
        this.zzIY = com_google_android_gms_internal_zzhd;
    }

    private void zzd(JSONObject jSONObject) {
        try {
            this.zzIY.zza(jSONObject.getString("request_id"), jSONObject.getString("base_url"), jSONObject.getString("html"));
        } catch (Exception e) {
        }
    }

    public void handleMessage(Message message) {
        try {
            Bundle data = message.getData();
            if (data != null) {
                JSONObject jSONObject = new JSONObject(data.getString("data"));
                if ("fetch_html".equals(jSONObject.getString("message_name"))) {
                    zzd(jSONObject);
                }
            }
        } catch (Exception e) {
        }
    }
}
