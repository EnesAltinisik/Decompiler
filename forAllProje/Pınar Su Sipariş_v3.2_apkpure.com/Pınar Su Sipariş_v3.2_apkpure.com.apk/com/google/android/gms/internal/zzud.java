package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.tagmanager.zzba;
import java.util.Date;
import java.util.Map;

public class zzud implements zze {
    private boolean zzbsA;
    private final zzba zzbsk;
    private final Bundle zzbsv;
    private final String zzbsw;
    private final Date zzbsx;
    private final String zzbsy;
    private Map<String, Object> zzbsz;

    public zzud(String str, Bundle bundle, String str2, Date date, boolean z, zzba com_google_android_gms_tagmanager_zzba) {
        this.zzbsw = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbsv = bundle;
        this.zzbsx = date;
        this.zzbsy = str2;
        this.zzbsA = z;
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
    }

    public long currentTimeMillis() {
        return this.zzbsx.getTime();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long nanoTime() {
        return System.nanoTime();
    }

    public Map<String, Object> zzJJ() {
        if (this.zzbsz == null) {
            try {
                this.zzbsz = this.zzbsk.zzJJ();
            } catch (RemoteException e) {
                String str = "Error calling measurement proxy:";
                String valueOf = String.valueOf(e.getMessage());
                zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return this.zzbsz;
    }

    public String zzKU() {
        return this.zzbsw;
    }

    public Bundle zzKV() {
        return this.zzbsv;
    }

    public String zzKW() {
        return this.zzbsy;
    }

    public boolean zzKX() {
        return this.zzbsA;
    }

    public void zzaG(boolean z) {
        this.zzbsA = z;
    }
}
