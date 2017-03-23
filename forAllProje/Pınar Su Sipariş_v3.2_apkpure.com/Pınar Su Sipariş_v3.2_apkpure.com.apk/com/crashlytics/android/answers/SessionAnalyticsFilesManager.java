package com.crashlytics.android.answers;

import a.a.a.a.a.b.k;
import a.a.a.a.a.d.b;
import a.a.a.a.a.d.c;
import android.content.Context;
import java.io.IOException;
import java.util.UUID;

class SessionAnalyticsFilesManager extends b<SessionEvent> {
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private a.a.a.a.a.g.b analyticsSettingsData;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, k kVar, c cVar) throws IOException {
        super(context, sessionEventTransform, kVar, cVar, 100);
    }

    protected String generateUniqueRollOverFileName() {
        return SESSION_ANALYTICS_TO_SEND_FILE_PREFIX + b.ROLL_OVER_FILE_NAME_SEPARATOR + UUID.randomUUID().toString() + b.ROLL_OVER_FILE_NAME_SEPARATOR + this.currentTimeProvider.a() + SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION;
    }

    protected int getMaxFilesToKeep() {
        return this.analyticsSettingsData == null ? super.getMaxFilesToKeep() : this.analyticsSettingsData.e;
    }

    protected int getMaxByteSizePerFile() {
        return this.analyticsSettingsData == null ? super.getMaxByteSizePerFile() : this.analyticsSettingsData.c;
    }

    void setAnalyticsSettingsData(a.a.a.a.a.g.b bVar) {
        this.analyticsSettingsData = bVar;
    }
}
