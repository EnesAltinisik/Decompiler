package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.b.at;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.f;
import net.sqlcipher.database.SQLiteDatabase;

public class k {
    private static final k a = new k();
    public static final int b = m.b;

    k() {
    }

    public static k b() {
        return a;
    }

    static String b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(b);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(at.b(context).b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    public int a(Context context) {
        int b = m.b(context);
        return m.b(context, b) ? 18 : b;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent b = b(context, i, str);
        return b == null ? null : PendingIntent.getActivity(context, i2, b, SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    public boolean a(int i) {
        return m.b(i);
    }

    public boolean a(Context context, String str) {
        return m.a(context, str);
    }

    public int b(Context context) {
        return m.h(context);
    }

    @Deprecated
    public Intent b(int i) {
        return b(null, i, null);
    }

    public Intent b(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !f.b(context)) ? y.a("com.google.android.gms", b(context, str)) : y.a();
            case 3:
                return y.a("com.google.android.gms");
            default:
                return null;
        }
    }

    public boolean b(Context context, int i) {
        return m.b(context, i);
    }

    public String c(int i) {
        return m.a(i);
    }

    public void d(Context context) {
        m.e(context);
    }
}
