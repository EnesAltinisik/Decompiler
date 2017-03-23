package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.internal.zzaa;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;

class zzt extends b {
    static final Pair<String, Long> a = new Pair("", Long.valueOf(0));
    public final zzc b = new zzc("health_monitor", zzFo().zznC());
    public final zzb c = new zzb(this, "last_upload", 0);
    public final zzb d = new zzb(this, "last_upload_attempt", 0);
    public final zzb e = new zzb(this, "backoff", 0);
    public final zzb f = new zzb(this, "last_delete_stale", 0);
    public final zzb g = new zzb(this, "midnight_offset", 0);
    public final zzb h = new zzb(this, "time_before_start", 10000);
    public final zzb i = new zzb(this, "session_timeout", 1800000);
    public final zza j = new zza(this, "start_new_session", true);
    public final zzb k = new zzb(this, "last_pause_time", 0);
    public final zzb l = new zzb(this, "time_active", 0);
    public boolean m;
    private SharedPreferences n;
    private String o;
    private boolean p;
    private long q;
    private SecureRandom r;

    public final class zza {
        private boolean zzakR;
        private final boolean zzbdV;
        private boolean zzbdW;
        final /* synthetic */ zzt zzbdX;
        private final String zzwQ;

        public zza(zzt com_google_android_gms_measurement_internal_zzt, String str, boolean z) {
            this.zzbdX = com_google_android_gms_measurement_internal_zzt;
            zzaa.zzdl(str);
            this.zzwQ = str;
            this.zzbdV = z;
        }

        private void zzFV() {
            if (!this.zzbdW) {
                this.zzbdW = true;
                this.zzakR = this.zzbdX.n.getBoolean(this.zzwQ, this.zzbdV);
            }
        }

        public boolean get() {
            zzFV();
            return this.zzakR;
        }

        public void set(boolean z) {
            Editor edit = this.zzbdX.n.edit();
            edit.putBoolean(this.zzwQ, z);
            edit.apply();
            this.zzakR = z;
        }
    }

    public final class zzb {
        private long zzVv;
        private boolean zzbdW;
        final /* synthetic */ zzt zzbdX;
        private final long zzbdY;
        private final String zzwQ;

        public zzb(zzt com_google_android_gms_measurement_internal_zzt, String str, long j) {
            this.zzbdX = com_google_android_gms_measurement_internal_zzt;
            zzaa.zzdl(str);
            this.zzwQ = str;
            this.zzbdY = j;
        }

        private void zzFV() {
            if (!this.zzbdW) {
                this.zzbdW = true;
                this.zzVv = this.zzbdX.n.getLong(this.zzwQ, this.zzbdY);
            }
        }

        public long get() {
            zzFV();
            return this.zzVv;
        }

        public void set(long j) {
            Editor edit = this.zzbdX.n.edit();
            edit.putLong(this.zzwQ, j);
            edit.apply();
            this.zzVv = j;
        }
    }

    public final class zzc {
        private final long zzZb;
        final /* synthetic */ zzt zzbdX;
        final String zzbdZ;
        private final String zzbea;
        private final String zzbeb;

        private zzc(zzt com_google_android_gms_measurement_internal_zzt, String str, long j) {
            this.zzbdX = com_google_android_gms_measurement_internal_zzt;
            zzaa.zzdl(str);
            zzaa.zzaj(j > 0);
            this.zzbdZ = String.valueOf(str).concat(":start");
            this.zzbea = String.valueOf(str).concat(":count");
            this.zzbeb = String.valueOf(str).concat(":value");
            this.zzZb = j;
        }

        private void zzon() {
            this.zzbdX.zzkN();
            long currentTimeMillis = this.zzbdX.zzlQ().currentTimeMillis();
            Editor edit = this.zzbdX.n.edit();
            edit.remove(this.zzbea);
            edit.remove(this.zzbeb);
            edit.putLong(this.zzbdZ, currentTimeMillis);
            edit.apply();
        }

        private long zzoo() {
            this.zzbdX.zzkN();
            long zzoq = zzoq();
            if (zzoq != 0) {
                return Math.abs(zzoq - this.zzbdX.zzlQ().currentTimeMillis());
            }
            zzon();
            return 0;
        }

        private long zzoq() {
            return this.zzbdX.i().getLong(this.zzbdZ, 0);
        }

        public void zzbU(String str) {
            zzf(str, 1);
        }

        public void zzf(String str, long j) {
            this.zzbdX.zzkN();
            if (zzoq() == 0) {
                zzon();
            }
            if (str == null) {
                str = "";
            }
            long j2 = this.zzbdX.n.getLong(this.zzbea, 0);
            if (j2 <= 0) {
                Editor edit = this.zzbdX.n.edit();
                edit.putString(this.zzbeb, str);
                edit.putLong(this.zzbea, j);
                edit.apply();
                return;
            }
            Object obj = (this.zzbdX.h().nextLong() & Long.MAX_VALUE) < (Long.MAX_VALUE / (j2 + j)) * j ? 1 : null;
            Editor edit2 = this.zzbdX.n.edit();
            if (obj != null) {
                edit2.putString(this.zzbeb, str);
            }
            edit2.putLong(this.zzbea, j2 + j);
            edit2.apply();
        }

        public Pair<String, Long> zzop() {
            this.zzbdX.zzkN();
            long zzoo = zzoo();
            if (zzoo < this.zzZb) {
                return null;
            }
            if (zzoo > this.zzZb * 2) {
                zzon();
                return null;
            }
            String string = this.zzbdX.i().getString(this.zzbeb, null);
            zzoo = this.zzbdX.i().getLong(this.zzbea, 0);
            zzon();
            return (string == null || zzoo <= 0) ? zzt.a : new Pair(string, Long.valueOf(zzoo));
        }
    }

    zzt(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private SecureRandom h() {
        zzkN();
        if (this.r == null) {
            this.r = new SecureRandom();
        }
        return this.r;
    }

    private SharedPreferences i() {
        zzkN();
        zzma();
        return this.n;
    }

    Pair<String, Boolean> a(String str) {
        zzkN();
        long elapsedRealtime = zzlQ().elapsedRealtime();
        if (this.o != null && elapsedRealtime < this.q) {
            return new Pair(this.o, Boolean.valueOf(this.p));
        }
        this.q = elapsedRealtime + zzFo().zzfd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            this.o = advertisingIdInfo.getId();
            if (this.o == null) {
                this.o = "";
            }
            this.p = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable th) {
            zzFm().zzFK().zzj("Unable to get advertising id", th);
            this.o = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.o, Boolean.valueOf(this.p));
    }

    String a() {
        h().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    void a(boolean z) {
        zzkN();
        zzFm().zzFL().zzj("Setting useService", Boolean.valueOf(z));
        Editor edit = i().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    String b() {
        zzkN();
        return com.google.firebase.iid.zzc.zzUl().getId();
    }

    String b(String str) {
        String str2 = (String) a(str).first;
        if (zzal.zzbZ(Constants.MD5) == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzal.zzbZ(Constants.MD5).digest(str2.getBytes()))});
    }

    void b(boolean z) {
        zzkN();
        zzFm().zzFL().zzj("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = i().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    long c() {
        zzma();
        zzkN();
        long j = this.g.get();
        if (j != 0) {
            return j;
        }
        j = (long) (h().nextInt(86400000) + 1);
        this.g.set(j);
        return j;
    }

    void c(String str) {
        zzkN();
        Editor edit = i().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    boolean c(boolean z) {
        zzkN();
        return i().getBoolean("measurement_enabled", z);
    }

    String d() {
        zzkN();
        return i().getString("gmp_app_id", null);
    }

    Boolean e() {
        zzkN();
        return !i().contains("use_service") ? null : Boolean.valueOf(i().getBoolean("use_service", false));
    }

    void f() {
        boolean z = true;
        zzkN();
        zzFm().zzFL().log("Clearing collection preferences.");
        boolean contains = i().contains("measurement_enabled");
        if (contains) {
            z = c(true);
        }
        Editor edit = i().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            b(z);
        }
    }

    protected String g() {
        zzkN();
        String string = i().getString("previous_os_version", null);
        String zzFx = zzFf().zzFx();
        if (!(TextUtils.isEmpty(zzFx) || zzFx.equals(string))) {
            Editor edit = i().edit();
            edit.putString("previous_os_version", zzFx);
            edit.apply();
        }
        return string;
    }

    protected void zzkO() {
        this.n = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.m = this.n.getBoolean("has_been_opened", false);
        if (!this.m) {
            Editor edit = this.n.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }
}
