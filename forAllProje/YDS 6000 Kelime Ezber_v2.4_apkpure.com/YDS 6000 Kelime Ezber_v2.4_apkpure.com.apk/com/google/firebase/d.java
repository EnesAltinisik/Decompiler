package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.m;

public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    private d(String str, String str2, String str3, String str4, String str5, String str6) {
        c.a(!m.a(str), (Object) "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static d a(Context context) {
        i iVar = new i(context);
        Object a = iVar.a("google_app_id");
        return TextUtils.isEmpty(a) ? null : new d(a, iVar.a("google_api_key"), iVar.a("firebase_database_url"), iVar.a("ga_trackingId"), iVar.a("gcm_defaultSenderId"), iVar.a("google_storage_bucket"));
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return b.a(this.b, dVar.b) && b.a(this.a, dVar.a) && b.a(this.c, dVar.c) && b.a(this.d, dVar.d) && b.a(this.e, dVar.e) && b.a(this.f, dVar.f);
    }

    public int hashCode() {
        return b.a(this.b, this.a, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        return b.a((Object) this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).toString();
    }
}
