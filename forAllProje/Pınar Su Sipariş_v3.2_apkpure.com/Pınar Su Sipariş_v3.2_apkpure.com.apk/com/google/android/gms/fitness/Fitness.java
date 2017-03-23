package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzqs;
import com.google.android.gms.internal.zzqs.zzb;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqu;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqv.zza;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.internal.zzrr;
import com.google.android.gms.internal.zzrt;
import com.google.android.gms.internal.zzru;
import com.google.android.gms.internal.zzrv;
import com.google.android.gms.internal.zzrw;
import com.google.android.gms.internal.zzrx;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzrz;
import com.google.android.gms.internal.zzsb;
import java.util.concurrent.TimeUnit;

public class Fitness {
    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    @Deprecated
    public static final Void API = null;
    public static final Api<NoOptions> BLE_API = new Api("Fitness.BLE_API", new zzb(), zzaCy);
    public static final BleApi BleApi = zzxj();
    public static final Api<NoOptions> CONFIG_API = new Api("Fitness.CONFIG_API", new zzqt.zzb(), zzaCz);
    public static final ConfigApi ConfigApi = new zzru();
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final Api<NoOptions> HISTORY_API = new Api("Fitness.HISTORY_API", new zzqu.zzb(), zzaCA);
    public static final HistoryApi HistoryApi = new zzrv();
    public static final Api<NoOptions> RECORDING_API = new Api("Fitness.RECORDING_API", new zzqw.zzb(), zzaCC);
    public static final RecordingApi RecordingApi = new zzrx();
    public static final Scope SCOPE_ACTIVITY_READ = new Scope(Scopes.FITNESS_ACTIVITY_READ);
    public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE);
    public static final Scope SCOPE_BODY_READ = new Scope(Scopes.FITNESS_BODY_READ);
    public static final Scope SCOPE_BODY_READ_WRITE = new Scope(Scopes.FITNESS_BODY_READ_WRITE);
    public static final Scope SCOPE_LOCATION_READ = new Scope(Scopes.FITNESS_LOCATION_READ);
    public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope(Scopes.FITNESS_LOCATION_READ_WRITE);
    public static final Scope SCOPE_NUTRITION_READ = new Scope(Scopes.FITNESS_NUTRITION_READ);
    public static final Scope SCOPE_NUTRITION_READ_WRITE = new Scope(Scopes.FITNESS_NUTRITION_READ_WRITE);
    public static final Api<NoOptions> SENSORS_API = new Api("Fitness.SENSORS_API", new zzqx.zzb(), zzaCD);
    public static final Api<NoOptions> SESSIONS_API = new Api("Fitness.SESSIONS_API", new zzqy.zzb(), zzaCE);
    public static final SensorsApi SensorsApi = new zzry();
    public static final SessionsApi SessionsApi = new zzrz();
    public static final zzf<zzqu> zzaCA = new zzf();
    public static final zzf<zzqv> zzaCB = new zzf();
    public static final zzf<zzqw> zzaCC = new zzf();
    public static final zzf<zzqx> zzaCD = new zzf();
    public static final zzf<zzqy> zzaCE = new zzf();
    public static final zzrr zzaCF = new zzrw();
    public static final zzf<zzqs> zzaCy = new zzf();
    public static final zzf<zzqt> zzaCz = new zzf();
    public static final Api<NoOptions> zzavg = new Api("Fitness.INTERNAL_API", new zza(), zzaCB);

    private Fitness() {
    }

    public static long getEndTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_END_TIME, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    public static long getStartTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_START_TIME, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    private static BleApi zzxj() {
        return VERSION.SDK_INT >= 18 ? new zzrt() : new zzsb();
    }
}
