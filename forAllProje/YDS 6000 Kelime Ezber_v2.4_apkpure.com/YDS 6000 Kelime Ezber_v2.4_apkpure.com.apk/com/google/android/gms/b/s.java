package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;

@Deprecated
public final class s {
    private static final Object a = new Object();
    private static s b;
    private final String c;
    private final Status d;
    private final boolean e;
    private final boolean f;

    s(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            if (z2) {
                z = false;
            }
            this.f = z;
            z = z2;
        } else {
            this.f = false;
        }
        this.e = z;
        Object a = ag.a(context);
        if (a == null) {
            a = new i(context).a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.c = null;
            return;
        }
        this.c = a;
        this.d = Status.a;
    }

    private static s a(String str) {
        s sVar;
        synchronized (a) {
            if (b == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            sVar = b;
        }
        return sVar;
    }

    public static Status a(Context context) {
        Status status;
        c.a((Object) context, (Object) "Context must not be null.");
        synchronized (a) {
            if (b == null) {
                b = new s(context);
            }
            status = b.d;
        }
        return status;
    }

    public static String a() {
        return a("getGoogleAppId").c;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f;
    }
}
