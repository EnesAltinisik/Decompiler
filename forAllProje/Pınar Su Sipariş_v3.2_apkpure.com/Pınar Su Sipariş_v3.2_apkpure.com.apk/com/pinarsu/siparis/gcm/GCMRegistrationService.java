package com.pinarsu.siparis.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IServicePush;
import com.pinarsu.siparis.model.PushServiceResponseItem;
import com.pinarsu.siparis.model.PushServiceSaveTokenItem;
import com.pinarsu.siparis.tools.Tools;
import java.io.IOException;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class GCMRegistrationService extends IntentService {
    private String deviceId = "";
    IServicePush service;

    public GCMRegistrationService() {
        super("GcmRegister");
    }

    public void onCreate() {
        super.onCreate();
        this.service = Tools.getServicePush();
        this.deviceId = MyApplication.getInstance().getDeviceId();
        Log.d("MNTTAG", "deviceId : " + this.deviceId);
    }

    protected void onHandleIntent(Intent intent) {
        Log.d("MNTTAG", "TOKEN almak için servis içinde onHandleIntent");
        if (Preferences.PUSH_TOKEN == null || Preferences.PUSH_TOKEN.isEmpty()) {
            register();
        } else {
            getPushToken(Preferences.PUSH_TOKEN);
        }
    }

    private void register() {
        try {
            String token = InstanceID.getInstance(getApplicationContext()).getToken(getString(R.string.gcm_defaultSenderId), GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            if (token != null && !token.isEmpty()) {
                getPushToken(token);
            }
        } catch (IOException e) {
            Log.e("MNTTAG", "IOException : ");
        }
    }

    private void getPushToken(String str) {
        Preferences.PUSH_TOKEN = str;
        Log.d("MNTTAG", "Preferences.PUSH_TOKEN :  " + Preferences.PUSH_TOKEN);
        MyApplication.getInstance().getPreferences().save();
        String str2 = Preferences.PHONE_NUMBER;
        if (str2 == null) {
            str2 = "";
        }
        this.service.getPushToken(new PushServiceSaveTokenItem(this.deviceId, Preferences.PUSH_TOKEN, str2), new Callback<PushServiceResponseItem>() {
            public void success(PushServiceResponseItem pushServiceResponseItem, Response response) {
                Log.d("MNTTAG", "Token alındı.  tokenItem.getSucceed() :  " + pushServiceResponseItem.getSucceed());
                if (pushServiceResponseItem.getSucceed().intValue() == 1) {
                    GCMRegistrationService.stopService(GCMRegistrationService.this);
                } else {
                    Log.e("MNTTAG", "Token dan hata döndü.getPushToken : " + pushServiceResponseItem.getMessage());
                }
            }

            public void failure(RetrofitError retrofitError) {
                Log.e("MNTTAG", "Token dan hata döndü.getPushToken : " + retrofitError.getMessage());
            }
        });
    }

    public static void stopService(Context context) {
        context.stopService(new Intent(context, GCMRegistrationService.class));
    }

    public static void startService(Context context) {
        context.startService(new Intent(context, GCMRegistrationService.class));
    }
}
