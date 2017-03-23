package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzaa;
import java.util.UUID;

public class zzai extends zzd {
    private SharedPreferences zzYX;
    private long zzYY;
    private long zzYZ = -1;
    private final zza zzZa = new zza("monitoring", zzlS().zznC());

    public final class zza {
        private final String mName;
        private final long zzZb;
        final /* synthetic */ zzai zzZc;

        private zza(zzai com_google_android_gms_analytics_internal_zzai, String str, long j) {
            this.zzZc = com_google_android_gms_analytics_internal_zzai;
            zzaa.zzdl(str);
            zzaa.zzaj(j > 0);
            this.mName = str;
            this.zzZb = j;
        }

        private void zzon() {
            long currentTimeMillis = this.zzZc.zzlQ().currentTimeMillis();
            Editor edit = this.zzZc.zzYX.edit();
            edit.remove(zzos());
            edit.remove(zzot());
            edit.putLong(zzor(), currentTimeMillis);
            edit.commit();
        }

        private long zzoo() {
            long zzoq = zzoq();
            return zzoq == 0 ? 0 : Math.abs(zzoq - this.zzZc.zzlQ().currentTimeMillis());
        }

        private long zzoq() {
            return this.zzZc.zzYX.getLong(zzor(), 0);
        }

        private String zzor() {
            return String.valueOf(this.mName).concat(":start");
        }

        private String zzos() {
            return String.valueOf(this.mName).concat(":count");
        }

        public void zzbU(String str) {
            if (zzoq() == 0) {
                zzon();
            }
            if (str == null) {
                str = "";
            }
            synchronized (this) {
                long j = this.zzZc.zzYX.getLong(zzos(), 0);
                if (j <= 0) {
                    Editor edit = this.zzZc.zzYX.edit();
                    edit.putString(zzot(), str);
                    edit.putLong(zzos(), 1);
                    edit.apply();
                    return;
                }
                Object obj = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1) ? 1 : null;
                Editor edit2 = this.zzZc.zzYX.edit();
                if (obj != null) {
                    edit2.putString(zzot(), str);
                }
                edit2.putLong(zzos(), j + 1);
                edit2.apply();
            }
        }

        public Pair<String, Long> zzop() {
            long zzoo = zzoo();
            if (zzoo < this.zzZb) {
                return null;
            }
            if (zzoo > this.zzZb * 2) {
                zzon();
                return null;
            }
            String string = this.zzZc.zzYX.getString(zzot(), null);
            zzoo = this.zzZc.zzYX.getLong(zzos(), 0);
            zzon();
            return (string == null || zzoo <= 0) ? null : new Pair(string, Long.valueOf(zzoo));
        }

        protected String zzot() {
            return String.valueOf(this.mName).concat(":value");
        }
    }

    protected zzai(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
    }

    public void zzbT(String str) {
        zzkN();
        zzma();
        Editor edit = this.zzYX.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzbJ("Failed to commit campaign data");
        }
    }

    protected void zzkO() {
        this.zzYX = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public long zzoh() {
        zzkN();
        zzma();
        if (this.zzYY == 0) {
            long j = this.zzYX.getLong("first_run", 0);
            if (j != 0) {
                this.zzYY = j;
            } else {
                j = zzlQ().currentTimeMillis();
                Editor edit = this.zzYX.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    zzbJ("Failed to commit first run time");
                }
                this.zzYY = j;
            }
        }
        return this.zzYY;
    }

    public c zzoi() {
        return new c(zzlQ(), zzoh());
    }

    public long zzoj() {
        zzkN();
        zzma();
        if (this.zzYZ == -1) {
            this.zzYZ = this.zzYX.getLong("last_dispatch", 0);
        }
        return this.zzYZ;
    }

    public void zzok() {
        zzkN();
        zzma();
        long currentTimeMillis = zzlQ().currentTimeMillis();
        Editor edit = this.zzYX.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzYZ = currentTimeMillis;
    }

    public String zzol() {
        zzkN();
        zzma();
        CharSequence string = this.zzYX.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }

    public zza zzom() {
        return this.zzZa;
    }
}
