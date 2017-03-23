package com.afollestad.materialdialogs.a;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.i.k;

public class c {
    private static final k<String, Typeface> a = new k();

    public static Typeface a(Context context, String str) {
        Typeface typeface;
        synchronized (a) {
            if (a.containsKey(str)) {
                typeface = (Typeface) a.get(str);
            } else {
                try {
                    typeface = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{str}));
                    a.put(str, typeface);
                } catch (RuntimeException e) {
                    typeface = null;
                }
            }
        }
        return typeface;
    }
}
