package com.crashlytics.android.answers;

import a.a.a.a.a.b.i;
import a.a.a.a.a.b.o;
import a.a.a.a.a.b.o.a;
import android.content.Context;
import java.util.Map;
import java.util.UUID;

class SessionMetadataCollector {
    private final Context context;
    private final o idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context, o oVar, String str, String str2) {
        this.context = context;
        this.idManager = oVar;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        Map i = this.idManager.i();
        return new SessionEventMetadata(this.idManager.c(), UUID.randomUUID().toString(), this.idManager.b(), (String) i.get(a.ANDROID_ID), (String) i.get(a.ANDROID_ADVERTISING_ID), this.idManager.l(), (String) i.get(a.FONT_TOKEN), i.m(this.context), this.idManager.d(), this.idManager.g(), this.versionCode, this.versionName);
    }
}
