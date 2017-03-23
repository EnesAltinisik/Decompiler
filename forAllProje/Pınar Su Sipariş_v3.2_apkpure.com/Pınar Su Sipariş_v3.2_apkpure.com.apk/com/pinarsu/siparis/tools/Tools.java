package com.pinarsu.siparis.tools;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.a.a.a;
import com.pinarsu.siparis.interfaces.IServicePush;
import com.pinarsu.siparis.view.EditText;
import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit.RestAdapter.Builder;

public class Tools {
    private static final String URL = "https://psubildirim.yasar.com.tr/";

    public static void setTextViewUnderLine(TextView textView, String str) {
        CharSequence spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }

    public static String fFormat(String str) {
        float parseFloat;
        try {
            parseFloat = Float.parseFloat(str);
        } catch (Exception e) {
            parseFloat = 0.0f;
        }
        return fFormat(parseFloat);
    }

    public static void keyboardClose(Activity activity, EditText editText) {
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static String fFormat(float f) {
        try {
            return new DecimalFormat("###,###,##0.00").format((double) f);
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static IServicePush getServicePush() {
        return (IServicePush) new Builder().setClient(new a(new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).connectTimeout(60, TimeUnit.SECONDS).build())).setEndpoint(URL).build().create(IServicePush.class);
    }

    public static boolean isApplicationRunning(Context context) {
        List runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        Log.d("current task :", "CURRENT Activity ::" + ((RunningTaskInfo) runningTasks.get(0)).topActivity.getClass().getSimpleName());
        if (((RunningTaskInfo) runningTasks.get(0)).topActivity.getPackageName().equalsIgnoreCase(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static boolean isInternetConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static void callNumber(AppCompatActivity appCompatActivity, String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        appCompatActivity.startActivity(intent);
    }
}
