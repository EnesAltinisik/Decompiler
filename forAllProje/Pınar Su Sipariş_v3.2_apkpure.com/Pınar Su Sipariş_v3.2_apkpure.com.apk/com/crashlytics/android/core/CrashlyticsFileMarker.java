package com.crashlytics.android.core;

import a.a.a.a.a.f.a;
import a.a.a.a.c;
import java.io.File;

class CrashlyticsFileMarker {
    private final a fileStore;
    private final String markerName;

    public CrashlyticsFileMarker(String str, a aVar) {
        this.markerName = str;
        this.fileStore = aVar;
    }

    public boolean create() {
        boolean z = false;
        try {
            z = getMarkerFile().createNewFile();
        } catch (Throwable e) {
            c.h().e(CrashlyticsCore.TAG, "Error creating marker: " + this.markerName, e);
        }
        return z;
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    private File getMarkerFile() {
        return new File(this.fileStore.a(), this.markerName);
    }
}
