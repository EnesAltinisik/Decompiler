package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

class g implements Logger {
    private int a = 2;
    private boolean b;

    g() {
    }

    public void error(Exception exception) {
    }

    public void error(String str) {
    }

    public int getLogLevel() {
        return this.a;
    }

    public void info(String str) {
    }

    public void setLogLevel(int i) {
        this.a = i;
        if (!this.b) {
            String str = (String) zzy.zzXF.get();
            Log.i((String) zzy.zzXF.get(), new StringBuilder(String.valueOf(str).length() + 91).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(str).append(" DEBUG").toString());
            this.b = true;
        }
    }

    public void verbose(String str) {
    }

    public void warn(String str) {
    }
}
