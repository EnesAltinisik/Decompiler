package com.google.android.gms.common.a;

import com.google.android.gms.b.an;

public final class b {
    public static an<Integer> a = an.a("gms:common:stats:max_num_of_events", Integer.valueOf(100));
    public static an<Integer> b = an.a("gms:common:stats:max_chunk_size", Integer.valueOf(100));

    public static final class a {
        public static an<Integer> a = an.a("gms:common:stats:connections:level", Integer.valueOf(c.b));
        public static an<String> b = an.a("gms:common:stats:connections:ignored_calling_processes", "");
        public static an<String> c = an.a("gms:common:stats:connections:ignored_calling_services", "");
        public static an<String> d = an.a("gms:common:stats:connections:ignored_target_processes", "");
        public static an<String> e = an.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static an<Long> f = an.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }
}
