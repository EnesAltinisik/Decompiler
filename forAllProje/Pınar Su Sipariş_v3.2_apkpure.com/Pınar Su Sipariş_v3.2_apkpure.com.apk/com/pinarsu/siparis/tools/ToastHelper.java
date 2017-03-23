package com.pinarsu.siparis.tools;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ToastHelper {
    private Activity activity;
    Context context;
    private String message;

    public ToastHelper(Activity activity, String str) {
        this.activity = activity;
        this.message = str;
    }

    public ToastHelper(Context context, String str) {
        this.context = context;
        this.message = str;
    }

    public void show() {
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                if (ToastHelper.this.activity != null) {
                    Toast.makeText(ToastHelper.this.activity, ToastHelper.this.message, 0).show();
                } else {
                    Toast.makeText(ToastHelper.this.context, ToastHelper.this.message, 0).show();
                }
            }
        });
    }
}
