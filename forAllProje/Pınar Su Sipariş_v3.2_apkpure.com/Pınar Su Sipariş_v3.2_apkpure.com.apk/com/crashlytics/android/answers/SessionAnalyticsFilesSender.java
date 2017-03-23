package com.crashlytics.android.answers;

import a.a.a.a.a.b.a;
import a.a.a.a.a.b.r;
import a.a.a.a.a.d.f;
import a.a.a.a.a.e.c;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.i;
import java.io.File;
import java.util.List;

class SessionAnalyticsFilesSender extends a implements f {
    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(i iVar, String str, String str2, e eVar, String str3) {
        super(iVar, str, str2, eVar, c.POST);
        this.apiKey = str3;
    }

    public boolean send(List<File> list) {
        d a = getHttpRequest().a(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE).a(a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(a.HEADER_API_KEY, this.apiKey);
        int i = 0;
        for (File file : list) {
            a.a(FILE_PARAM_NAME + i, file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        a.a.a.a.c.h().a(Answers.TAG, "Sending " + list.size() + " analytics files to " + getUrl());
        int b = a.b();
        a.a.a.a.c.h().a(Answers.TAG, "Response code for analytics file send is " + b);
        if (r.a(b) == 0) {
            return true;
        }
        return false;
    }
}
