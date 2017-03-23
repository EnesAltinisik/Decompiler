package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;
import net.sqlcipher.database.SQLiteDatabase;

public final class cj {
    public static a<Long> A = a.a("measurement.upload.stale_data_deletion_interval", 86400000);
    public static a<Long> B = a.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
    public static a<Long> C = a.a("measurement.upload.initial_upload_delay_time", 15000);
    public static a<Long> D = a.a("measurement.upload.retry_time", 1800000);
    public static a<Integer> E = a.a("measurement.upload.retry_count", 6);
    public static a<Long> F = a.a("measurement.upload.max_queue_time", 2419200000L);
    public static a<Integer> G = a.a("measurement.lifetimevalue.max_currency_tracked", 4);
    public static a<Integer> H = a.a("measurement.audience.filter_result_max_count", 200);
    public static a<Long> I = a.a("measurement.service_client.idle_disconnect_millis", 5000);
    public static a<Boolean> a = a.a("measurement.service_enabled", true);
    public static a<Boolean> b = a.a("measurement.service_client_enabled", true);
    public static a<Boolean> c = a.a("measurement.log_installs_enabled", false);
    public static a<String> d = a.a("measurement.log_tag", "FA", "FA-SVC");
    public static a<Long> e = a.a("measurement.ad_id_cache_time", 10000);
    public static a<Long> f = a.a("measurement.monitoring.sample_period_millis", 86400000);
    public static a<Long> g = a.a("measurement.config.cache_time", 86400000, 3600000);
    public static a<String> h = a.a("measurement.config.url_scheme", "https");
    public static a<String> i = a.a("measurement.config.url_authority", "app-measurement.com");
    public static a<Integer> j = a.a("measurement.upload.max_bundles", 100);
    public static a<Integer> k = a.a("measurement.upload.max_batch_size", 65536);
    public static a<Integer> l = a.a("measurement.upload.max_bundle_size", 65536);
    public static a<Integer> m = a.a("measurement.upload.max_events_per_bundle", 1000);
    public static a<Integer> n = a.a("measurement.upload.max_events_per_day", 100000);
    public static a<Integer> o = a.a("measurement.upload.max_error_events_per_day", 1000);
    public static a<Integer> p = a.a("measurement.upload.max_public_events_per_day", (int) SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
    public static a<Integer> q = a.a("measurement.upload.max_conversions_per_day", 500);
    public static a<Integer> r = a.a("measurement.upload.max_realtime_events_per_day", 10);
    public static a<Integer> s = a.a("measurement.store.max_stored_events_per_app", 100000);
    public static a<String> t = a.a("measurement.upload.url", "https://app-measurement.com/a");
    public static a<Long> u = a.a("measurement.upload.backoff_period", 43200000);
    public static a<Long> v = a.a("measurement.upload.window_interval", 3600000);
    public static a<Long> w = a.a("measurement.upload.interval", 3600000);
    public static a<Long> x = a.a("measurement.upload.realtime_upload_interval", 10000);
    public static a<Long> y = a.a("measurement.upload.minimum_delay", 500);
    public static a<Long> z = a.a("measurement.alarm_manager.minimum_interval", 60000);

    public static final class a<V> {
        private final V a;
        private final an<V> b;
        private final String c;

        private a(String str, an<V> anVar, V v) {
            c.a((Object) anVar);
            this.b = anVar;
            this.a = v;
            this.c = str;
        }

        static a<Integer> a(String str, int i) {
            return a(str, i, i);
        }

        static a<Integer> a(String str, int i, int i2) {
            return new a(str, an.a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        static a<Long> a(String str, long j) {
            return a(str, j, j);
        }

        static a<Long> a(String str, long j, long j2) {
            return new a(str, an.a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        static a<String> a(String str, String str2) {
            return a(str, str2, str2);
        }

        static a<String> a(String str, String str2, String str3) {
            return new a(str, an.a(str, str3), str2);
        }

        static a<Boolean> a(String str, boolean z) {
            return a(str, z, z);
        }

        static a<Boolean> a(String str, boolean z, boolean z2) {
            return new a(str, an.a(str, z2), Boolean.valueOf(z));
        }

        public V a(V v) {
            return v != null ? v : this.a;
        }

        public String a() {
            return this.c;
        }

        public V b() {
            return this.a;
        }
    }
}
