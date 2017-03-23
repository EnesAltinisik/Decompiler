package com.crashlytics.android.beta;

import a.a.a.a.a.b.a;
import a.a.a.a.a.e.c;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class CheckForUpdatesRequest extends a {
    static final String BETA_SOURCE = "3";
    static final String BUILD_VERSION = "build_version";
    static final String DISPLAY_VERSION = "display_version";
    static final String HEADER_BETA_TOKEN = "X-CRASHLYTICS-BETA-TOKEN";
    static final String INSTANCE = "instance";
    static final String SDK_ANDROID_DIR_TOKEN_TYPE = "3";
    static final String SOURCE = "source";
    private final CheckForUpdatesResponseTransform responseTransform;

    static String createBetaTokenHeaderValueFor(String str) {
        return "3:" + str;
    }

    public CheckForUpdatesRequest(i iVar, String str, String str2, e eVar, CheckForUpdatesResponseTransform checkForUpdatesResponseTransform) {
        super(iVar, str, str2, eVar, c.GET);
        this.responseTransform = checkForUpdatesResponseTransform;
    }

    public CheckForUpdatesResponse invoke(String str, String str2, BuildProperties buildProperties) {
        d applyHeadersTo;
        Throwable e;
        Throwable th;
        CheckForUpdatesResponse checkForUpdatesResponse = null;
        try {
            Map queryParamsFor = getQueryParamsFor(buildProperties);
            try {
                applyHeadersTo = applyHeadersTo(getHttpRequest(queryParamsFor), str, str2);
                a.a.a.a.c.h().a(Beta.TAG, "Checking for updates from " + getUrl());
                a.a.a.a.c.h().a(Beta.TAG, "Checking for updates query params are: " + queryParamsFor);
                if (applyHeadersTo.c()) {
                    a.a.a.a.c.h().a(Beta.TAG, "Checking for updates was successful");
                    checkForUpdatesResponse = this.responseTransform.fromJson(new JSONObject(applyHeadersTo.e()));
                    if (applyHeadersTo != null) {
                        a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
                    }
                } else {
                    a.a.a.a.c.h().e(Beta.TAG, "Checking for updates failed. Response code: " + applyHeadersTo.b());
                    if (applyHeadersTo != null) {
                        a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    a.a.a.a.c.h().e(Beta.TAG, "Error while checking for updates from " + getUrl(), e);
                    if (applyHeadersTo != null) {
                        a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
                    }
                    return checkForUpdatesResponse;
                } catch (Throwable th2) {
                    th = th2;
                    if (applyHeadersTo != null) {
                        a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            applyHeadersTo = null;
            a.a.a.a.c.h().e(Beta.TAG, "Error while checking for updates from " + getUrl(), e);
            if (applyHeadersTo != null) {
                a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
            }
            return checkForUpdatesResponse;
        } catch (Throwable e4) {
            applyHeadersTo = null;
            th = e4;
            if (applyHeadersTo != null) {
                a.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + applyHeadersTo.b(a.HEADER_REQUEST_ID));
            }
            throw th;
        }
        return checkForUpdatesResponse;
    }

    private d applyHeadersTo(d dVar, String str, String str2) {
        return dVar.a(a.HEADER_ACCEPT, a.ACCEPT_JSON_VALUE).a(a.HEADER_USER_AGENT, a.CRASHLYTICS_USER_AGENT + this.kit.getVersion()).a(a.HEADER_DEVELOPER_TOKEN, a.CLS_ANDROID_SDK_DEVELOPER_TOKEN).a(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE).a(a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(a.HEADER_API_KEY, str).a(HEADER_BETA_TOKEN, createBetaTokenHeaderValueFor(str2));
    }

    private Map<String, String> getQueryParamsFor(BuildProperties buildProperties) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put(BUILD_VERSION, buildProperties.versionCode);
        hashMap.put(DISPLAY_VERSION, buildProperties.versionName);
        hashMap.put(INSTANCE, buildProperties.buildId);
        hashMap.put(SOURCE, "3");
        return hashMap;
    }
}
