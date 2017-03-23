package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ExceptionBuilder;
import com.google.android.gms.analytics.internal.zzae;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

public class ExceptionReporter implements UncaughtExceptionHandler {
    private final Context mContext;
    private final UncaughtExceptionHandler zzTT;
    private final Tracker zzTU;
    private ExceptionParser zzTV;
    private GoogleAnalytics zzTW;

    public ExceptionReporter(Tracker tracker, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException("context cannot be null");
        } else {
            this.zzTT = uncaughtExceptionHandler;
            this.zzTU = tracker;
            this.zzTV = new StandardExceptionParser(context, new ArrayList());
            this.mContext = context.getApplicationContext();
            String str = "ExceptionReporter created, original handler is ";
            String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
            zzae.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public ExceptionParser getExceptionParser() {
        return this.zzTV;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzTV = exceptionParser;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.zzTV != null) {
            str = this.zzTV.getDescription(thread != null ? thread.getName() : null, th);
        }
        String str2 = "Reporting uncaught exception: ";
        String valueOf = String.valueOf(str);
        zzae.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzTU.send(new ExceptionBuilder().setDescription(str).setFatal(true).build());
        GoogleAnalytics zzkq = zzkq();
        zzkq.dispatchLocalHits();
        zzkq.zzkv();
        if (this.zzTT != null) {
            zzae.v("Passing exception to the original handler");
            this.zzTT.uncaughtException(thread, th);
        }
    }

    GoogleAnalytics zzkq() {
        if (this.zzTW == null) {
            this.zzTW = GoogleAnalytics.getInstance(this.mContext);
        }
        return this.zzTW;
    }

    UncaughtExceptionHandler zzkr() {
        return this.zzTT;
    }
}
