package com.google.firebase.crash.internal.config.flag;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.internal.zzsd;
import com.google.android.gms.internal.zzse;
import com.google.android.gms.internal.zzsh;
import java.util.concurrent.TimeUnit;

@Keep
public final class Flags {
    public static final zzsd<String> zzbGA = zzsd.zzc(0, "crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
    public static final zzsd<Integer> zzbGB = zzsd.zzb(0, "crash:log_buffer_capacity", 100);
    public static final zzsd<Integer> zzbGC = zzsd.zzb(0, "crash:log_buffer_max_total_size", 32768);
    public static final zzsd<Integer> zzbGD = zzsd.zzb(0, "crash:crash_backlog_capacity", 5);
    public static final zzsd<Long> zzbGE = zzsd.zzb(0, "crash:crash_backlog_max_age", 604800000);
    public static final zzsd<Long> zzbGF = zzsd.zzb(0, "crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
    public static final zzsd<Long> zzbGG = zzsd.zzb(0, "crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
    public static final zzsd<Integer> zzbGH = zzsd.zzb(0, "crash:retry_num_attempts", 12);
    public static final zzsd<Integer> zzbGI = zzsd.zzb(0, "crash:batch_size", 5);
    public static final zzsd<Long> zzbGJ = zzsd.zzb(0, "crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
    public static final zzsd<Boolean> zzbGz = zzsd.zzb(0, "crash:enabled", Boolean.valueOf(true));

    private Flags() {
    }

    public static final void initialize(Context context) {
        zzsh.zzyE();
        zzse.initialize(context);
    }
}
