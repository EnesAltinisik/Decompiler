package com.google.android.gms.b;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class fh {
    public static final bd<Boolean> a = bd.a(0, "crash:enabled", Boolean.valueOf(true));
    public static final bd<String> b = bd.a(0, "crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
    public static final bd<Integer> c = bd.a(0, "crash:log_buffer_capacity", 100);
    public static final bd<Integer> d = bd.a(0, "crash:log_buffer_max_total_size", 32768);
    public static final bd<Integer> e = bd.a(0, "crash:crash_backlog_capacity", 5);
    public static final bd<Long> f = bd.a(0, "crash:crash_backlog_max_age", 604800000);
    public static final bd<Long> g = bd.a(0, "crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
    public static final bd<Long> h = bd.a(0, "crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
    public static final bd<Integer> i = bd.a(0, "crash:retry_num_attempts", 12);
    public static final bd<Integer> j = bd.a(0, "crash:batch_size", 5);
    public static final bd<Long> k = bd.a(0, "crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
    public static final bd<Integer> l = bd.a(0, "crash:frame_depth", 60);
    public static final bd<Integer> m = bd.a(0, "crash:receiver_delay", 100);
    public static final bd<Integer> n = bd.a(0, "crash:thread_idle_timeout", 10);

    public static final void a(Context context) {
        bh.a();
        be.a(context);
    }
}
