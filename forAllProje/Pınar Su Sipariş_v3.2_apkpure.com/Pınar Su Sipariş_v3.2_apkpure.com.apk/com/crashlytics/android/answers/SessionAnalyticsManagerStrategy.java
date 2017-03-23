package com.crashlytics.android.answers;

import a.a.a.a.a.d.e;
import a.a.a.a.a.g.b;

interface SessionAnalyticsManagerStrategy extends e {
    void deleteAllEvents();

    void processEvent(Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(b bVar, String str);
}
