package com.pinarsu.siparis.tools;

import android.content.Intent;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.pinarsu.siparis.ui.activity.ExceptionActivity;
import java.lang.Thread.UncaughtExceptionHandler;

public class ExceptionHandler implements UncaughtExceptionHandler {
    private final String LINE_SEPARATOR = "\n";
    private final AppCompatActivity activity;

    public ExceptionHandler(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Log.d("MNTTAG", "HATA : " + th.getMessage());
        Intent intent = new Intent(this.activity, ExceptionActivity.class);
        intent.putExtra("error", th.getMessage().toString());
        this.activity.startActivity(intent);
        this.activity.finish();
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
