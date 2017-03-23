package com.crashlytics.android.beta;

import a.a.a.a.a.a.b;
import a.a.a.a.a.b.m;
import a.a.a.a.a.b.o;
import a.a.a.a.a.b.o.a;
import a.a.a.a.a.b.s;
import a.a.a.a.a.f.d;
import a.a.a.a.a.g.f;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.t;
import a.a.a.a.c;
import a.a.a.a.i;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Beta extends i<Boolean> implements m {
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final b<String> deviceTokenCache = new b();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private UpdatesController updatesController;

    public static Beta getInstance() {
        return (Beta) c.a(Beta.class);
    }

    @TargetApi(14)
    protected boolean onPreExecute() {
        this.updatesController = createUpdatesController(VERSION.SDK_INT, (Application) getContext().getApplicationContext());
        return true;
    }

    protected Boolean doInBackground() {
        c.h().a(TAG, "Beta kit initializing...");
        Context context = getContext();
        o idManager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idManager.j()))) {
            c.h().a(TAG, "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        c.h().a(TAG, "Beta device token is present, checking for app updates.");
        f betaSettingsData = getBetaSettingsData();
        BuildProperties loadBuildProperties = loadBuildProperties(context);
        if (canCheckForUpdates(betaSettingsData, loadBuildProperties)) {
            this.updatesController.initialize(context, this, idManager, betaSettingsData, loadBuildProperties, new d(this), new s(), new a.a.a.a.a.e.b(c.h()));
        }
        return Boolean.valueOf(true);
    }

    @TargetApi(14)
    UpdatesController createUpdatesController(int i, Application application) {
        if (i >= 14) {
            return new ActivityLifecycleCheckForUpdatesController(getFabric().e(), getFabric().f());
        }
        return new ImmediateCheckForUpdatesController();
    }

    public Map<a, String> getDeviceIdentifiers() {
        CharSequence betaDeviceToken = getBetaDeviceToken(getContext(), getIdManager().j());
        Map<a, String> hashMap = new HashMap();
        if (!TextUtils.isEmpty(betaDeviceToken)) {
            hashMap.put(a.FONT_TOKEN, betaDeviceToken);
        }
        return hashMap;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.1.4.92";
    }

    @TargetApi(11)
    boolean isAppPossiblyInstalledByBeta(String str, int i) {
        if (i < 11) {
            return str == null;
        } else {
            return "io.crash.air".equals(str);
        }
    }

    boolean canCheckForUpdates(f fVar, BuildProperties buildProperties) {
        return (fVar == null || TextUtils.isEmpty(fVar.a) || buildProperties == null) ? false : true;
    }

    private String getBetaDeviceToken(Context context, String str) {
        if (isAppPossiblyInstalledByBeta(str, VERSION.SDK_INT)) {
            c.h().a(TAG, "App was possibly installed by Beta. Getting device token");
            try {
                String str2 = (String) this.deviceTokenCache.a(context, this.deviceTokenLoader);
                if ("".equals(str2)) {
                    str2 = null;
                }
                return str2;
            } catch (Throwable e) {
                c.h().e(TAG, "Failed to load the Beta device token", e);
                return null;
            }
        }
        c.h().a(TAG, "App was not installed by Beta. Skipping device token");
        return null;
    }

    private f getBetaSettingsData() {
        t b = q.a().b();
        if (b != null) {
            return b.f;
        }
        return null;
    }

    private BuildProperties loadBuildProperties(Context context) {
        InputStream open;
        Throwable th;
        Throwable e;
        Object obj;
        Throwable th2;
        BuildProperties buildProperties;
        InputStream inputStream = null;
        try {
            open = context.getAssets().open(CRASHLYTICS_BUILD_PROPERTIES);
            if (open != null) {
                BuildProperties fromPropertiesStream;
                try {
                    fromPropertiesStream = BuildProperties.fromPropertiesStream(open);
                } catch (Throwable e2) {
                    th = e2;
                    obj = inputStream;
                    th2 = th;
                    try {
                        c.h().e(TAG, "Error reading Beta build properties", th2);
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th22) {
                                c.h().e(TAG, "Error closing Beta build properties asset", th22);
                            }
                        }
                        return buildProperties;
                    } catch (Throwable th3) {
                        e2 = th3;
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th222) {
                                c.h().e(TAG, "Error closing Beta build properties asset", th222);
                            }
                        }
                        throw e2;
                    }
                }
                try {
                    c.h().a(TAG, fromPropertiesStream.packageName + " build properties: " + fromPropertiesStream.versionName + " (" + fromPropertiesStream.versionCode + ")" + " - " + fromPropertiesStream.buildId);
                    buildProperties = fromPropertiesStream;
                } catch (Throwable e22) {
                    th = e22;
                    buildProperties = fromPropertiesStream;
                    th222 = th;
                    c.h().e(TAG, "Error reading Beta build properties", th222);
                    if (open != null) {
                        open.close();
                    }
                    return buildProperties;
                }
            }
            obj = inputStream;
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2222) {
                    c.h().e(TAG, "Error closing Beta build properties asset", th2222);
                }
            }
        } catch (Throwable e222) {
            open = inputStream;
            InputStream inputStream2 = inputStream;
            th2222 = e222;
            buildProperties = inputStream2;
            c.h().e(TAG, "Error reading Beta build properties", th2222);
            if (open != null) {
                open.close();
            }
            return buildProperties;
        } catch (Throwable th4) {
            e222 = th4;
            open = inputStream;
            if (open != null) {
                open.close();
            }
            throw e222;
        }
        return buildProperties;
    }

    String getOverridenSpiEndpoint() {
        return a.a.a.a.a.b.i.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }
}
