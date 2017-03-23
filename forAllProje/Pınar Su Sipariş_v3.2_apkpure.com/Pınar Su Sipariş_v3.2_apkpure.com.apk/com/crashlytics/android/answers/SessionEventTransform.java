package com.crashlytics.android.answers;

import a.a.a.a.a.d.a;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.adjust.sdk.Constants;
import java.io.IOException;
import org.json.JSONObject;

class SessionEventTransform implements a<SessionEvent> {
    static final String ADVERTISING_ID_KEY = "advertisingId";
    static final String ANDROID_ID_KEY = "androidId";
    static final String APP_BUNDLE_ID_KEY = "appBundleId";
    static final String APP_VERSION_CODE_KEY = "appVersionCode";
    static final String APP_VERSION_NAME_KEY = "appVersionName";
    static final String BETA_DEVICE_TOKEN_KEY = "betaDeviceToken";
    static final String BUILD_ID_KEY = "buildId";
    static final String CUSTOM_ATTRIBUTES = "customAttributes";
    static final String CUSTOM_TYPE = "customType";
    static final String DETAILS_KEY = "details";
    static final String DEVICE_MODEL_KEY = "deviceModel";
    static final String EXECUTION_ID_KEY = "executionId";
    static final String INSTALLATION_ID_KEY = "installationId";
    static final String LIMIT_AD_TRACKING_ENABLED_KEY = "limitAdTrackingEnabled";
    static final String OS_VERSION_KEY = "osVersion";
    static final String PREDEFINED_ATTRIBUTES = "predefinedAttributes";
    static final String PREDEFINED_TYPE = "predefinedType";
    static final String TIMESTAMP_KEY = "timestamp";
    static final String TYPE_KEY = "type";

    SessionEventTransform() {
    }

    public byte[] toBytes(SessionEvent sessionEvent) throws IOException {
        return buildJsonForEvent(sessionEvent).toString().getBytes(Constants.ENCODING);
    }

    @TargetApi(9)
    public JSONObject buildJsonForEvent(SessionEvent sessionEvent) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            SessionEventMetadata sessionEventMetadata = sessionEvent.sessionEventMetadata;
            jSONObject.put(APP_BUNDLE_ID_KEY, sessionEventMetadata.appBundleId);
            jSONObject.put(EXECUTION_ID_KEY, sessionEventMetadata.executionId);
            jSONObject.put(INSTALLATION_ID_KEY, sessionEventMetadata.installationId);
            jSONObject.put(ANDROID_ID_KEY, sessionEventMetadata.androidId);
            jSONObject.put(ADVERTISING_ID_KEY, sessionEventMetadata.advertisingId);
            jSONObject.put(LIMIT_AD_TRACKING_ENABLED_KEY, sessionEventMetadata.limitAdTrackingEnabled);
            jSONObject.put(BETA_DEVICE_TOKEN_KEY, sessionEventMetadata.betaDeviceToken);
            jSONObject.put(BUILD_ID_KEY, sessionEventMetadata.buildId);
            jSONObject.put(OS_VERSION_KEY, sessionEventMetadata.osVersion);
            jSONObject.put(DEVICE_MODEL_KEY, sessionEventMetadata.deviceModel);
            jSONObject.put(APP_VERSION_CODE_KEY, sessionEventMetadata.appVersionCode);
            jSONObject.put(APP_VERSION_NAME_KEY, sessionEventMetadata.appVersionName);
            jSONObject.put(TIMESTAMP_KEY, sessionEvent.timestamp);
            jSONObject.put(TYPE_KEY, sessionEvent.type.toString());
            if (sessionEvent.details != null) {
                jSONObject.put(DETAILS_KEY, new JSONObject(sessionEvent.details));
            }
            jSONObject.put(CUSTOM_TYPE, sessionEvent.customType);
            if (sessionEvent.customAttributes != null) {
                jSONObject.put(CUSTOM_ATTRIBUTES, new JSONObject(sessionEvent.customAttributes));
            }
            jSONObject.put(PREDEFINED_TYPE, sessionEvent.predefinedType);
            if (sessionEvent.predefinedAttributes != null) {
                jSONObject.put(PREDEFINED_ATTRIBUTES, new JSONObject(sessionEvent.predefinedAttributes));
            }
            return jSONObject;
        } catch (Throwable e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }
}
