package com.google.android.gms.b;

import android.content.Context;

public class at {
    private static at b = new at();
    private as a = null;

    public static as b(Context context) {
        return b.a(context);
    }

    public synchronized as a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new as(context);
        }
        return this.a;
    }
}
