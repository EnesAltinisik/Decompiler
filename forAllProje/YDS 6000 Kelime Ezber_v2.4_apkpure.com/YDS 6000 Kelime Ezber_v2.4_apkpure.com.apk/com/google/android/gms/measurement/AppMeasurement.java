package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.b.cv;
import com.google.android.gms.b.s;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    private final cv a;

    public static class f {
        public String b;
        public String c;
        public long d;

        public f(f fVar) {
            this.b = fVar.b;
            this.c = fVar.c;
            this.d = fVar.d;
        }
    }

    public interface c {
        void a(String str, String str2, Bundle bundle, long j);
    }

    public static final class a extends com.google.firebase.a.a.a {
        public static final Map<String, String> a = com.google.android.gms.common.util.d.a(new String[]{"app_clear_data", "app_exception", "app_remove", "app_install", "app_update", "firebase_campaign", "error", "first_open", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "firebase_ad_exposure", "firebase_adunit_exposure"}, new String[]{"_cd", "_ae", "_ui", "_in", "_au", "_cmp", "_err", "_f", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu"});
    }

    public interface b {
        void a(String str, String str2, Bundle bundle, long j);
    }

    public interface d {
        boolean a(f fVar, f fVar2);
    }

    public static final class e extends com.google.firebase.a.a.b {
        public static final Map<String, String> a = com.google.android.gms.common.util.d.a(new String[]{"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "debug", "realtime", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count"}, new String[]{"_c", "_et", "_xt", "_ai", "_err", "_ev", "_el", "_dbg", "_r", "_o", "_sn", "_sc", "_si", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin"});
    }

    public static final class g extends com.google.firebase.a.a.c {
        public static final Map<String, String> a = com.google.android.gms.common.util.d.a(new String[]{"firebase_last_notification", "first_open_time", "last_deep_link_referrer", "user_id"}, new String[]{"_ln", "_fot", "_ldl", "_id"});
    }

    public AppMeasurement(cv cvVar) {
        com.google.android.gms.common.internal.c.a((Object) cvVar);
        this.a = cvVar;
    }

    private void b(String str, String str2, Object obj) {
        this.a.l().a(str, str2, obj);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return cv.a(context).m();
    }

    public void a(c cVar) {
        this.a.l().a(cVar);
    }

    public void a(String str, String str2, Object obj) {
        b(str, str2, obj);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.a.B().a(str);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.a.B().b(str);
    }

    @Keep
    public long generateEventId() {
        return this.a.o().x();
    }

    @Keep
    public String getAppInstanceId() {
        return this.a.l().a(null);
    }

    @Keep
    public String getAppInstanceIdOnPackageSide(String str) {
        return this.a.l().b(str);
    }

    @Keep
    public String getCurrentScreenName() {
        f y = this.a.u().y();
        return y != null ? y.b : null;
    }

    @Keep
    public String getCurrentScreenNameOnPackageSide(String str) {
        f a = this.a.u().a(str);
        return a != null ? a.b : null;
    }

    @Keep
    public String getGmpAppId() {
        try {
            return s.a();
        } catch (IllegalStateException e) {
            this.a.f().x().a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Keep
    public String getGmpAppIdOnPackageSide(String str) {
        return this.a.l().c(str);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.l().a(str, str2, bundle);
    }

    @Keep
    public void registerOnScreenChangeCallback(d dVar) {
        this.a.u().a(dVar);
    }

    @Keep
    public void unregisterOnScreenChangeCallback(d dVar) {
        this.a.u().b(dVar);
    }
}
